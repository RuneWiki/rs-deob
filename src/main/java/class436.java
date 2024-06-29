import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class436 extends class445 {

    @OriginalMember(owner = "client!t", name = "z", descriptor = "Lah;")
    private class238 field5923;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public int field5919;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public int field5924;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public int field5916;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public int field5918;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "F")
    public float field5920;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "Lbf;")
    private class344 field5926;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "[I")
    private int[] field5921;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Lve;")
    private class319 field5922;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lkj;")
    private class366 field5917;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5925;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FIIII)V", line = 5)
    public final void method2569(float arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field5916 != -1) {
            class23 var6 = this.field5926.field4988.method1621(arg4 - 47217, this.field5916);
            int var7 = var6.field314 & 0xFF;
            if (var7 != 0 && var6.field301 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + ((arg2 & 0xFF00) * var10) & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field312 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg2 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = (var14 >> 8) + ((var12 << 8 & 0xFF000D) + (var13 & 0xFF00));
            }
        }
        if (arg0 != 1.0F) {
            int var15 = (arg2 & 0xFF3546) >> 16;
            int var16 = (arg2 & 0xFFB0) >> 8;
            int var17 = arg2 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            int var19 = (int) ((float) var16 * arg0);
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
            int var20 = (int) ((float) var17 * arg0);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var19 << 8 | var18 << 16 | var20;
        }
        this.field5925.position(arg3 * 4);
        if (arg4 != 65535) {
            this.field5925 = (ByteBuffer) null;
        }
        this.field5925.put((byte) (arg2 >> 16));
        this.field5925.put((byte) (arg2 >> 8));
        this.field5925.put((byte) arg2);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IB)V", line = 120)
    public final void method2570(int arg0, byte arg1) {
        if (arg1 < -46) {
            this.field5925 = ByteBuffer.allocateDirect(arg0 * 4);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 130)
    public final void method2571(int arg0, int arg1) {
        this.field5925.position(arg0 * 4);
        this.field5925.flip();
        class74 var3 = this.field5926.method2018(0, this.field5925, false);
        this.field5917 = new class366(this.field5926, var3, 5121, 4, 0);
        if (arg1 <= 45) {
            this.field5921 = (int[]) null;
        }
        this.field5925 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V", line = 146)
    public final void method2572(int arg0, int arg1, int arg2, int arg3) {
        this.field5921[this.field5923.field2410 * arg3 + arg2] = class21.method133(this.field5921[this.field5923.field2410 * arg3 + arg2], 0x1 << arg0);
        if (arg1 != 22039) {
            this.method2571(92, -11);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)V", line = 159)
    public final void method2573(int arg0, boolean arg1) {
        this.field5925.position(arg0 * 4 + 3);
        if (arg1) {
            this.method2573(-11, true);
        }
        this.field5925.put((byte) -1);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([IZI)V", line = 173)
    public final void method2574(int[] arg0, boolean arg1, int arg2) {
        int var4 = 0;
        class32 var5 = class238.field3135;
        var5.field456 = 0;
        if (arg1) {
            return;
        }
        if (this.field5926.field4721) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field5921[var13];
                short[] var15 = this.field5923.field3130[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method229(var15[var17++] & 0xFFFF, 1309449544);
                            var4++;
                            var5.method229(var15[var17++] & 0xFFFF, 1309449544);
                            var4++;
                            var5.method229(var15[var17++] & 0xFFFF, 1309449544);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field5921[var7];
                short[] var9 = this.field5923.field3130[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method231(121, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method231(90, var9[var11++] & 0xFFFF);
                            var5.method231(102, var9[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field5926.field4604;
        this.field5922.method127(5123, var5.field472, var5.field456);
        this.field5926.method1980(this.field5923.field3156, this.field5923.field3165, this.field5917, this.field5923.field3159);
        this.field5926.method2101(this.field5916, (this.field5923.field3138 & 0x7) != 0, (this.field5923.field3138 & 0x8) != 0);
        if (this.field5926.field4708) {
            this.field5926.method2066(Integer.MAX_VALUE, this.field5919, this.field5918, this.field5924);
        }
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field5920, 1.0F / this.field5920, 1.0F);
        var18.glMatrixMode(5888);
        this.field5926.method1980(this.field5923.field3156, this.field5923.field3165, this.field5917, this.field5923.field3159);
        this.field5926.method2033(this.field5922, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lah;IIIII)V", line = 297)
    public class436(class238 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5923 = arg0;
        this.field5919 = arg3;
        this.field5924 = arg5;
        this.field5916 = arg1;
        this.field5918 = arg4;
        this.field5920 = (float) arg2;
        this.field5926 = this.field5923.field3139;
        this.field5921 = new int[this.field5923.field2410 * this.field5923.field2409];
        this.field5922 = new class319(this.field5926, 5123, (byte[]) null, 1);
    }
}
