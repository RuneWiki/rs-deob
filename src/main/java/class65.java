import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class65 extends class359 {

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Lwa;")
    private class365 field735;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    private int field734;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Lpo;")
    private class332 field733;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "F")
    private float field731;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "[I")
    private int[] field737;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    private int field732;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Lpe;")
    private class363 field736;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field729;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V")
    public final void method386(int arg0, boolean arg1) {
        this.field729 = ByteBuffer.allocateDirect(arg0 * 4);
        if (arg1) {
            this.method386(72, false);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BIII)V")
    public final void method387(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= -21) {
            this.field737[this.field735.field4530 * arg2 + arg3] = class164.method1059(this.field737[this.field735.field4530 * arg2 + arg3], 0x1 << arg1);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
    public final void method388(int arg0, byte arg1) {
        int var3 = -55 % ((7 - arg1) / 54);
        this.field729.position(arg0 * 4 + 3);
        this.field729.put((byte) -1);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIBIF)V")
    public final void method389(int arg0, int arg1, byte arg2, int arg3, float arg4) {
        if (this.field734 != -1) {
            class311 var6 = this.field733.field4744.method371(this.field734, (byte) 96);
            int var7 = var6.field4432 & 0xFF;
            if (var7 != 0 && var6.field4447 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00) * var7 + ((arg3 & 0xFF00) * var10) & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4454 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + (var12 << 8 & 0xFF000A) + (var13 & 0xFF00);
            }
        }
        this.field729.position(arg1 * 4);
        if (arg2 >= -51) {
            this.field732 = 102;
        }
        if (arg4 != 1.0F) {
            int var15 = (arg3 & 0xFF7D05) >> 16;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var18 << 16 | var19 << 8;
        }
        this.field729.put((byte) (arg3 >> 16));
        this.field729.put((byte) (arg3 >> 8));
        this.field729.put((byte) arg3);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([III)V")
    public final void method390(int[] arg0, int arg1, int arg2) {
        int var4 = 0;
        class365.field5300.field2888 = 0;
        if (this.field733.field4779) {
            for (int var11 = 0; var11 < arg1; var11++) {
                int var12 = arg0[var11];
                short[] var13 = this.field735.field5299[var12];
                int var14 = this.field737[var12];
                if (var14 != 0 && var13 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (var16 < var13.length) {
                        if ((0x1 << var15++ & var14) == 0) {
                            var16 += 3;
                        } else {
                            class365.field5300.method1380(var13[var16++], (byte) -8);
                            var4++;
                            class365.field5300.method1380(var13[var16++], (byte) -8);
                            var4++;
                            var4++;
                            class365.field5300.method1380(var13[var16++], (byte) -8);
                        }
                    }
                }
            }
        } else {
            for (int var5 = 0; var5 < arg1; var5++) {
                int var6 = arg0[var5];
                short[] var7 = this.field735.field5299[var6];
                int var8 = this.field737[var6];
                if (var8 != 0 && var7 != null) {
                    int var9 = 0;
                    int var10 = 0;
                    while (var7.length > var10) {
                        if ((var8 & 0x1 << var9++) == 0) {
                            var10 += 3;
                        } else {
                            var4++;
                            class365.field5300.method1339((byte) 3, var7[var10++]);
                            class365.field5300.method1339((byte) 3, var7[var10++]);
                            var4++;
                            var4++;
                            class365.field5300.method1339((byte) 3, var7[var10++]);
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            opengl var17 = this.field733.field4752;
            this.field733.method2082(this.field734, (this.field735.field5308 & 0x7) != 0, (this.field735.field5308 & 0x8) != 0);
            if (this.field733.field4838) {
                this.field733.method928(Integer.MAX_VALUE, this.field732, this.field730);
            }
            this.field733.field4855.method382(5123, class365.field5300.field2867, class365.field5300.field2888);
            var17.glMatrixMode(5890);
            var17.glPushMatrix();
            var17.glScalef(1.0F / this.field731, 1.0F / this.field731, 1.0F);
            var17.glMatrixMode(5888);
            this.field733.method2111(this.field736);
            this.field733.method2077(this.field735.field5325);
            this.field733.method2064(0, this.field735.field5327);
            if ((this.field735.field5308 & 0x7) == 0) {
                this.field733.method2110(false);
            } else {
                this.field733.method2057(this.field735.field5332);
                this.field733.method2110(true);
            }
            if (this.field735.field5335 != null) {
                this.field733.method2064(1, this.field735.field5335);
            }
            this.field733.method2114();
            this.field733.method2107(this.field733.field4855, 4, 0, var4);
            var17.glMatrixMode(5890);
            var17.glPopMatrix();
            var17.glMatrixMode(5888);
        }
        if (arg2 >= -34) {
            this.method387((byte) 109, -92, -84, -55);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
    public final void method391(int arg0, int arg1) {
        this.field729.position(arg0 * arg1);
        this.field729.flip();
        class254 var3 = this.field733.method2089(0, this.field729, false);
        this.field736 = new class363(this.field733, var3, 5121, 4, 0);
        this.field729 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lwa;IIII)V")
    public class65(class365 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field735 = arg0;
        this.field734 = arg1;
        this.field733 = this.field735.field5301;
        this.field731 = (float) arg2;
        this.field737 = new int[this.field735.field4531 * this.field735.field4530];
        this.field730 = arg4;
        this.field732 = arg3;
    }
}
