import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class333 extends class406 {

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Lje;")
    private class228 field4708;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Lao;")
    private class157 field4711;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "F")
    private float field4710;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    private int field4709;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "I")
    private int field4713;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "[I")
    private int[] field4707;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "Lef;")
    private class283 field4715;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "Lhf;")
    private class224 field4714;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4712;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZII)V", line = 5)
    public final void method2153(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field4708 = (class228) null;
        }
        this.field4707[this.field4708.field4635 * arg3 + arg0] = class429.method2704(this.field4707[this.field4708.field4635 * arg3 + arg0], 0x1 << arg2);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V", line = 15)
    public final void method2154(int arg0, int arg1) {
        this.field4712.position(arg0 * 4);
        this.field4712.flip();
        class307 var3 = this.field4711.method938(0, this.field4712, false);
        this.field4714 = new class224(this.field4711, var3, 5121, 4, arg1);
        this.field4712 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BFIII)V", line = 28)
    public final void method2155(byte arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field4713 != -1) {
            class336 var6 = this.field4711.field1922.method1329((byte) -73, this.field4713);
            int var7 = var6.field4765 & 0xFF;
            if (var7 != 0 && var6.field4770 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + ((arg4 & 0xFF00) * var10) & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field4777 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg4 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg4 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + ((var12 & 0x900FF00) << 8) + (var13 & 0xFF00);
            }
        }
        if (arg1 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = (arg4 & 0xFF71) >> 8;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            int var19 = (int) ((float) var16 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var19 << 8 | var18 << 16;
        }
        this.field4712.position(arg3 * 4);
        this.field4712.put((byte) (arg4 >> 16));
        if (arg0 == 44) {
            this.field4712.put((byte) (arg4 >> 8));
            this.field4712.put((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(II)V", line = 136)
    public final void method2156(int arg0, int arg1) {
        this.field4712 = ByteBuffer.allocateDirect(arg0 * 4);
        if (arg1 != 26519) {
            this.field4710 = 0.6728442F;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V", line = 147)
    public final void method2157(byte arg0, int arg1) {
        this.field4712.position(arg1 * 4 + 3);
        if (arg0 >= -56) {
            this.field4710 = 0.6206612F;
        }
        this.field4712.put((byte) -1);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II[I)V", line = 164)
    public final void method2158(int arg0, int arg1, int[] arg2) {
        int var4 = 0;
        if (arg0 > -9) {
            this.field4711 = (class157) null;
        }
        class236 var5 = class228.field3197;
        var5.field3320 = 0;
        if (this.field4711.field1976) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field4707[var7];
                short[] var9 = this.field4708.field3200[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1605(var9[var11++] & 0xFFFF, false);
                            var4++;
                            var5.method1605(var9[var11++] & 0xFFFF, false);
                            var4++;
                            var5.method1605(var9[var11++] & 0xFFFF, false);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field4707[var13];
                short[] var15 = this.field4708.field3200[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1609(var15[var17++] & 0xFFFF, 5544);
                            var5.method1609(var15[var17++] & 0xFFFF, 5544);
                            var4++;
                            var5.method1609(var15[var17++] & 0xFFFF, 5544);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field4711.field1927;
        this.field4711.method946(this.field4713, (this.field4708.field3209 & 0x7) != 0, (this.field4708.field3209 & 0x8) != 0);
        if (this.field4711.field1951) {
            this.field4711.method619(Integer.MAX_VALUE, this.field4709, this.field4716);
        }
        this.field4715.method462(5123, var5.field3364, var5.field3320);
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field4710, 1.0F / this.field4710, 1.0F);
        var18.glMatrixMode(5888);
        this.field4711.method985(this.field4708.field3217, this.field4708.field3225, this.field4714, this.field4708.field3223);
        this.field4711.method968(this.field4715, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lje;IIII)V", line = 289)
    public class333(class228 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4708 = arg0;
        this.field4711 = this.field4708.field3216;
        this.field4710 = (float) arg2;
        this.field4716 = arg4;
        this.field4709 = arg3;
        this.field4713 = arg1;
        this.field4707 = new int[this.field4708.field4642 * this.field4708.field4635];
        this.field4715 = new class283(this.field4711, 5123, (byte[]) null, 1);
    }
}
