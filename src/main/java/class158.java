import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class158 extends class381 {

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lag;")
    private class302 field2370;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    private int field2367;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Lhd;")
    private class17 field2368;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "F")
    private float field2375;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[I")
    private int[] field2373;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "Lrs;")
    private class240 field2371;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2374;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public final void method1197(int arg0, int arg1) {
        if (arg0 <= 59) {
            this.field2374 = (ByteBuffer) null;
        }
        this.field2374.position(arg1 * 4 + 3);
        this.field2374.put((byte) -1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
    public final void method1198(int arg0, byte arg1) {
        int var3 = -114 % ((arg1 - 58) / 50);
        this.field2374 = ByteBuffer.allocateDirect(arg0 * 4);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V")
    public final void method1199(int arg0, int arg1) {
        this.field2374.position(arg0 * 4);
        this.field2374.flip();
        class203 var3 = this.field2368.method187(0, this.field2374, false);
        this.field2371 = new class240(this.field2368, var3, 5121, 4, arg1);
        this.field2374 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BIII)V")
    public final void method1200(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -110) {
            this.field2373[this.field2370.field5745 * arg1 + arg3] = class260.method1678(this.field2373[this.field2370.field5745 * arg1 + arg3], 0x1 << arg2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[II)V")
    public final void method1201(int arg0, int[] arg1, int arg2) {
        class302.field4066.field3938 = 0;
        if (arg2 >= -91) {
            this.method1198(-32, (byte) 119);
        }
        int var4 = 0;
        if (this.field2368.field292) {
            for (int var5 = 0; var5 < arg0; var5++) {
                int var6 = arg1[var5];
                int var7 = this.field2373[var6];
                short[] var8 = this.field2370.field4067[var6];
                if (var7 != 0 && var8 != null) {
                    int var9 = 0;
                    int var10 = 0;
                    while (var8.length > var10) {
                        if ((var7 & 0x1 << var9++) == 0) {
                            var10 += 3;
                        } else {
                            var4++;
                            class302.field4066.method1877(true, var8[var10++]);
                            class302.field4066.method1877(true, var8[var10++]);
                            var4++;
                            var4++;
                            class302.field4066.method1877(true, var8[var10++]);
                        }
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < arg0; var11++) {
                int var12 = arg1[var11];
                short[] var13 = this.field2370.field4067[var12];
                int var14 = this.field2373[var12];
                if (var14 != 0 && var13 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (var13.length > var16) {
                        if ((var14 & 0x1 << var15++) == 0) {
                            var16 += 3;
                        } else {
                            var4++;
                            class302.field4066.method1842(-4, var13[var16++]);
                            class302.field4066.method1842(-4, var13[var16++]);
                            var4++;
                            var4++;
                            class302.field4066.method1842(-4, var13[var16++]);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var17 = this.field2368.field198;
        this.field2368.method247(this.field2372, (this.field2370.field4057 & 0x7) != 0, (this.field2370.field4057 & 0x8) != 0);
        if (this.field2368.field296) {
            this.field2368.method129(Integer.MAX_VALUE, this.field2367, this.field2369);
        }
        this.field2368.field277.method351(5123, class302.field4066.field3882, class302.field4066.field3938);
        var17.glMatrixMode(5890);
        var17.glPushMatrix();
        var17.glScalef(1.0F / this.field2375, 1.0F / this.field2375, 1.0F);
        var17.glMatrixMode(5888);
        this.field2368.method257(this.field2371);
        this.field2368.method161(this.field2370.field4086);
        this.field2368.method160(0, this.field2370.field4087);
        if ((this.field2370.field4057 & 0x7) == 0) {
            this.field2368.method127(false);
        } else {
            this.field2368.method150(this.field2370.field4082);
            this.field2368.method127(true);
        }
        if (this.field2370.field4079 != null) {
            this.field2368.method160(1, this.field2370.field4079);
        }
        this.field2368.method180();
        this.field2368.method112(this.field2368.field277, 4, 0, var4);
        var17.glMatrixMode(5890);
        var17.glPopMatrix();
        var17.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIFI)V")
    public final void method1202(int arg0, int arg1, int arg2, float arg3, int arg4) {
        if (this.field2372 != -1) {
            class122 var6 = this.field2368.field201.method917((byte) 100, this.field2372);
            int var7 = var6.field1719 & 0xFF;
            if (var7 != 0 && var6.field1714 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field1709 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg0 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var14 >> 8) + (var12 << 8 & 0xFF00C3) + (var13 & 0xFF00);
            }
        }
        this.field2374.position(arg1 * 4);
        if (arg3 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            int var20 = (int) ((float) var17 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var18 << 16 | var19 << 8 | var20;
        }
        this.field2374.put((byte) (arg0 >> 16));
        if (arg2 != 1347044360) {
            this.field2373 = (int[]) null;
        }
        this.field2374.put((byte) (arg0 >> 8));
        this.field2374.put((byte) arg0);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lag;IIII)V")
    public class158(class302 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2370 = arg0;
        this.field2369 = arg4;
        this.field2367 = arg3;
        this.field2372 = arg1;
        this.field2368 = this.field2370.field4061;
        this.field2375 = (float) arg2;
        this.field2373 = new int[this.field2370.field5751 * this.field2370.field5745];
    }
}
