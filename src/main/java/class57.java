import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class57 extends class130 {

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Ljk;")
    private class134 field872;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "[I")
    private int[] field877;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "F")
    public float field873;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "Ltt;")
    private class249 field885;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Las;")
    private class18 field878;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "Ljp;")
    public static class55 field876 = new class55(44, 8);

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lpp;")
    private class387 field867;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field875;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field864;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method369(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 86 / ((-arg3 - 51) / 40);
        this.field877[this.field872.field124 * arg2 + arg0] = class19.method118(this.field877[this.field872.field124 * arg2 + arg0], 0x1 << arg1);
        field884++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V", line = 16)
    public final void method370(int arg0, int arg1) {
        this.field864.method2928(arg0 * 4 + 3);
        field881++;
        this.field864.method2923(-1);
        if (arg1 != -29219) {
            this.method369(48, 110, 2, -36);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z", line = 28)
    public static final boolean method371(int arg0, int arg1, int arg2) {
        int var3 = -68 / ((19 - arg2) / 50);
        field870++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[II)V", line = 49)
    public final void method372(int arg0, int[] arg1, int arg2) {
        field874++;
        int var4 = 0;
        if (arg2 != 7) {
            this.field872 = null;
        }
        class268 var5 = this.field885.field3954;
        var5.field2982 = 0;
        if (this.field885.field3990) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field877[var7];
                short[] var9 = this.field872.field1971[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1364(var9[var11++] & 0xFFFF, true);
                            var4++;
                            var5.method1364(var9[var11++] & 0xFFFF, true);
                            var4++;
                            var5.method1364(var9[var11++] & 0xFFFF, true);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field872.field1971[var13];
                int var15 = this.field877[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1366(true, var14[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1366(true, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method1366(true, var14[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field878.method114(var5.field2973, 78, 5123, var5.field2982);
        this.field885.method1748(this.field867, this.field872.field2011, this.field872.field2006, 0, this.field872.field2018);
        this.field885.method1743(-13055, (this.field872.field2000 & 0x8) != 0, this.field865, (this.field872.field2000 & 0x7) != 0);
        if (this.field885.field4057) {
            this.field885.method561(Integer.MAX_VALUE, this.field869, this.field882, this.field883);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field873, 1.0F / this.field873, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field885.method1748(this.field867, this.field872.field2011, this.field872.field2006, arg2 ^ 0x7, this.field872.field2018);
        this.field885.method1762(0, this.field878, (byte) 122, 4, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V", line = 171)
    public final void method373(int arg0, int arg1) {
        this.field875 = this.field885.field3928.method2920(arg0 * 4);
        field879++;
        this.field864 = new NativeStream(this.field875);
        int var3 = -51 % ((arg1 - 48) / 41);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IFIII)V", line = 184)
    public final void method374(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field865 != -1) {
            class420 var6 = this.field885.field4588.method938(28923, this.field865);
            int var7 = var6.field6165 & 0xFF;
            if (var7 != 0 && var6.field6169 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field6162 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
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
                arg3 = ((var12 & 0x5000FF00) << 8) - (-(var14 >> 8) - (var13 & 0xFF00));
            }
        }
        field871++;
        this.field864.method2928(arg4 * 4);
        if (arg1 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFF9C) >> 8;
            int var17 = (int) ((float) var15 * arg1);
            int var18 = arg3 & 0xFF;
            int var19 = (int) ((float) var16 * arg1);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var17 << 16 | var19 << 8 | var20;
        }
        this.field864.method2923((byte) (arg3 >> 16));
        if (arg0 != -257) {
            this.field869 = -26;
        }
        this.field864.method2923((byte) (arg3 >> 8));
        this.field864.method2923((byte) arg3);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)V", line = 300)
    public final void method375(int arg0, int arg1) {
        this.field864.method2929();
        field868++;
        if (arg1 != 8) {
            this.field865 = -71;
        }
        class121 var3 = this.field885.method1768(4, (byte) -118, this.field875, false, arg0 * 4);
        this.field867 = new class387(var3, 5121, 4, 0);
        this.field864 = null;
        this.field875 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 319)
    public static void method376(boolean arg0) {
        field876 = null;
        if (!arg0) {
            method371(47, 118, -76);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Ljk;IIIII)V", line = 328)
    public class57(class134 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field872 = arg0;
        this.field882 = arg4;
        this.field869 = arg3;
        this.field877 = new int[this.field872.field124 * this.field872.field122];
        this.field873 = arg2;
        this.field885 = this.field872.field1983;
        this.field883 = arg5;
        this.field865 = arg1;
        this.field878 = new class18(this.field885, 5123, null, 1);
    }
}
