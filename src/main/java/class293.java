import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class293 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public int field4112 = -1;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public int field4113 = 512;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "Z")
    public boolean field4123 = true;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Z")
    public boolean field4115 = true;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    private int field4127 = 0;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public int field4119;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public int field4120;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "Lqm;")
    public static class143 field4121;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tr", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field4129;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZLjava/awt/Component;)Llp;")
    public static final class391 method1904(int arg0, boolean arg1, Component arg2) {
        field4116++;
        try {
            if (arg0 == -2451) {
                Constructor var3 = Class.forName("os").getDeclaredConstructor(field4129 == null ? (field4129 = method1912("java.awt.Component")) : field4129, Boolean.TYPE);
                return (class391) var3.newInstance(arg2, Boolean.valueOf(arg1));
            } else {
                return null;
            }
        } catch (Throwable var4) {
            return new class169(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1905(int arg0) {
        int var1 = -55 / ((arg0 + 51) / 62);
        field4121 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILjava/lang/String;[B)I")
    public static final int method1906(int arg0, int arg1, String arg2, byte[] arg3) {
        field4114++;
        int var4 = arg0;
        int var5 = arg2.length();
        if (arg1 != 17363) {
            field4121 = null;
        }
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class36.method205((byte) -123, arg2.charAt(var6));
            int var8 = (var6 + 1) < var5 ? class36.method205((byte) -123, arg2.charAt(var6 + 1)) : -1;
            int var9 = (var6 + 2) >= var5 ? -1 : class36.method205((byte) -123, arg2.charAt(var6 + 2));
            int var10 = var6 + 3 >= var5 ? -1 : class36.method205((byte) -123, arg2.charAt(var6 + 3));
            arg3[arg0++] = (byte) class325.method2116(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg3[arg0++] = (byte) class325.method2116(var9 >>> 2, class286.method1877(240, var8 << 4));
            if (var10 == -1) {
                break;
            }
            arg3[arg0++] = (byte) class325.method2116(var10, class286.method1877(3, var9) << 6);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIILwm;)V")
    public static final void method1907(int arg0, int arg1, int arg2, int arg3, class564 arg4) {
        field4126++;
        class224 var5 = arg4.method3247(21816);
        if (arg2 != 1) {
            return;
        }
        int var6 = arg4.field8002 - arg4.field7917.field4509 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg4.field7960 > 25) {
                if (arg1 < 0 && var5.field2990 != -1) {
                    arg4.field7930 = var5.field2990;
                    arg4.field7968 = false;
                } else if (arg1 <= 0 || var5.field3004 == -1) {
                    arg4.field7930 = var5.field3013;
                } else {
                    arg4.field7930 = var5.field3004;
                }
                arg4.field7968 = false;
            } else if (!arg4.field7968 || !var5.method1404(arg4.field7930, (byte) 64)) {
                arg4.field7930 = var5.method1402(arg2 - 2);
                arg4.field7968 = arg4.field7930 != -1;
            }
        } else if (arg4.field8001 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class551.field7729[arg0] - arg4.field7917.field4509 & 0x3FFF;
            if (arg3 == 2 && var5.field2977 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3007 != -1) {
                    arg4.field7930 = var5.field3007;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3021 != -1) {
                    arg4.field7930 = var5.field3021;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3025 == -1) {
                    arg4.field7930 = var5.field2977;
                } else {
                    arg4.field7930 = var5.field3025;
                }
            } else if (arg3 == 0 && var5.field2992 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field2998 != -1) {
                    arg4.field7930 = var5.field2998;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3003 != -1) {
                    arg4.field7930 = var5.field3003;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3020 == -1) {
                    arg4.field7930 = var5.field2992;
                } else {
                    arg4.field7930 = var5.field3020;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field2983 != -1) {
                arg4.field7930 = var5.field2983;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field2976 != -1) {
                arg4.field7930 = var5.field2976;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field3019 == -1) {
                arg4.field7930 = var5.field3013;
            } else {
                arg4.field7930 = var5.field3019;
            }
            arg4.field7968 = false;
        } else if (var6 == 0 && arg4.field7960 <= 25) {
            arg4.field7968 = false;
            if (arg3 == 2 && var5.field2977 != -1) {
                arg4.field7930 = var5.field2977;
            } else if (arg3 == 0 && var5.field2992 != -1) {
                arg4.field7930 = var5.field2992;
            } else {
                arg4.field7930 = var5.field3013;
            }
        } else {
            arg4.field7968 = false;
            if (arg3 == 2 && var5.field2977 != -1) {
                if (arg1 < 0 && var5.field2979 != -1) {
                    arg4.field7930 = var5.field2979;
                } else if (arg1 <= 0 || var5.field3026 == -1) {
                    arg4.field7930 = var5.field2977;
                } else {
                    arg4.field7930 = var5.field3026;
                }
            } else if (arg3 == 0 && var5.field2992 != -1) {
                if (arg1 < 0 && var5.field3018 != -1) {
                    arg4.field7930 = var5.field3018;
                } else if (arg1 <= 0 || var5.field3009 == -1) {
                    arg4.field7930 = var5.field2992;
                } else {
                    arg4.field7930 = var5.field3009;
                }
            } else if (arg1 < 0 && var5.field3011 != -1) {
                arg4.field7930 = var5.field3011;
            } else if (arg1 <= 0 || var5.field2984 == -1) {
                arg4.field7930 = var5.field3013;
            } else {
                arg4.field7930 = var5.field2984;
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lee;IZ)V")
    private final void method1908(class675 arg0, int arg1, boolean arg2) {
        field4118++;
        if (!arg2) {
            method1907(48, -10, 44, -74, null);
        }
        if (arg1 == 1) {
            this.field4127 = arg0.method3756(false);
            this.method1910((byte) -71, this.field4127);
        } else if (arg1 == 2) {
            this.field4112 = arg0.method3757((byte) -65);
            if (this.field4112 == 65535) {
                this.field4112 = -1;
                return;
            }
        } else if (arg1 == 3) {
            this.field4113 = arg0.method3757((byte) -65) << 2;
            return;
        } else {
            if (arg1 == 4) {
                this.field4115 = false;
            } else if (arg1 == 5) {
                this.field4123 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public static final void method1909(int arg0, int arg1) {
        field4128++;
        int var2 = class740.field10285 - class361.field5123;
        if (var2 >= 100) {
            class97.field1168 = 1;
            class218.field2850 = -1;
            class419.field5919 = -1;
            return;
        }
        if (arg1 != -128) {
            method1907(-8, 75, -48, -40, null);
        }
        int var3 = (int) class2.field19;
        if (var3 < (class336.field4682 >> 8)) {
            var3 = class336.field4682 >> 8;
        }
        if (class52.field596[4] && var3 < class234.field3153[4] + 128) {
            var3 = class234.field3153[4] + 128;
        }
        int var4 = (int) class552.field7773 + class399.field5635 & 0x3FFF;
        class106.method756(class469.method2798(95, class660.field9039.field1250, class526.field7430, class660.field9039.field1264) - 200, (byte) -127, (var3 >> 3) * 3 + 600 << 2, class453.field6403, class191.field2552, arg0, var4, var3);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class155.field2169 = (int) ((float) (class155.field2169 - class647.field8901) * var5 + (float) class647.field8901);
        class187.field2514 = (int) ((float) (class187.field2514 - class107.field1306) * var5 + (float) class107.field1306);
        class511.field7303 = (int) ((float) (class511.field7303 - class727.field10176) * var5 + (float) class727.field10176);
        class32.field426 = (int) ((float) (class32.field426 - class473.field6699) * var5 + (float) class473.field6699);
        int var6 = class720.field9994 - class72.field961;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class720.field9994 = (int) ((float) var6 * var5 + (float) class72.field961);
        class720.field9994 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)V")
    private final void method1910(byte arg0, int arg1) {
        field4117++;
        double var3 = (double) ((arg1 & 0xFF9366) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFF1) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        if (arg0 >= -42) {
            return;
        }
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field4120 = (int) (var15 * 256.0D);
        this.field4125 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field4120 < 0) {
            this.field4120 = 0;
        } else if (this.field4120 > 255) {
            this.field4120 = 255;
        }
        if (this.field4125 < 0) {
            this.field4125 = 0;
        } else if (this.field4125 > 255) {
            this.field4125 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field4124 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4124 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4124 < 1) {
            this.field4124 = 1;
        }
        this.field4119 = (int) ((double) this.field4124 * var19);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lee;I)V")
    public final void method1911(class675 arg0, int arg1) {
        field4122++;
        if (arg1 > -126) {
            return;
        }
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                return;
            }
            this.method1908(arg0, var3, true);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1912(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
