import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class195 extends class79 {

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "Z")
    public boolean field3127;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "[Lwb;")
    public class195[] field3120;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Lck;")
    private static class119 field3116 = class298.method1987((byte) 92, "yellow:");

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "Lck;")
    public static class119 field3122 = field3116;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Lck;")
    public static class119 field3124 = field3116;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Lck;")
    public static class119 field3128 = class298.method1987((byte) 9, "(Udns");

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "Ldk;")
    public class140 field3106;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lae;")
    public static class39 field3110;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "Lcc;")
    public class89 field3126;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3112;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1250(boolean arg0) {
        field3112 = null;
        field3116 = null;
        if (arg0) {
            method1250(true);
        }
        field3110 = null;
        field3128 = null;
        field3122 = null;
        field3124 = null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I", line = 20)
    public int method1081(int arg0) {
        if (arg0 < 75) {
            field3116 = (class119) null;
        }
        field3108++;
        return -1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lfj;II)V", line = 32)
    public void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 <= -117) {
            field3104++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)Z", line = 52)
    public static final boolean method1251(int arg0, int arg1, int arg2, int arg3) {
        if (!class216.method1360(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class57.field926[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class89.field1373) {
                    if (!class114.method727(var4, var6, var5)) {
                        return false;
                    }
                    if (!class114.method727(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class114.method727(var4, var7, var5)) {
                        return false;
                    }
                    if (!class114.method727(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class114.method727(var4, var8, var5)) {
                    return false;
                }
                if (!class114.method727(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class208.field3314) {
                    if (!class114.method727(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class114.method727(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class114.method727(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class114.method727(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class114.method727(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class114.method727(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class89.field1373) {
                    if (!class114.method727(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class114.method727(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class114.method727(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class114.method727(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class114.method727(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class114.method727(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class208.field3314) {
                    if (!class114.method727(var4, var6, var5)) {
                        return false;
                    }
                    if (!class114.method727(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class114.method727(var4, var7, var5)) {
                        return false;
                    }
                    if (!class114.method727(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class114.method727(var4, var8, var5)) {
                    return false;
                }
                if (!class114.method727(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class114.method727(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class114.method727(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class114.method727(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class114.method727(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class114.method727(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I", line = 239)
    public int method351(byte arg0) {
        field3118++;
        return arg0 < 22 ? -114 : -1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZ)V", line = 270)
    public final void method1252(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1254(-55, -8, -21, -106, 29, 117, -122, 69);
        }
        field3115++;
        int var4 = this.field3117 == 255 ? arg1 : this.field3117;
        if (this.field3127) {
            this.field3106 = new class140(var4, arg1, arg0);
        } else {
            this.field3126 = new class89(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)[I", line = 299)
    public final int[] method1253(int arg0, int arg1, int arg2) {
        field3107++;
        if (arg1 < 57) {
            field3124 = (class119) null;
        }
        return this.field3120[arg0].field3127 ? this.field3120[arg0].method11(arg2, false) : this.field3120[arg0].method9((byte) 3, arg2)[0];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)[I", line = 320)
    public int[] method11(int arg0, boolean arg1) {
        field3119++;
        if (arg1) {
            method1255(-99, 84, (class36) null, -14);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)Z", line = 335)
    public static final boolean method1254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 365)
    public void method350(int arg0) {
        field3113++;
        if (this.field3127) {
            this.field3106.method926((byte) -125);
            this.field3106 = null;
        } else {
            this.field3126.method605((byte) -79);
            this.field3126 = null;
        }
        if (arg0 <= 11) {
            this.method1256(-32, -117, 55);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILva;I)[Lra;", line = 390)
    public static final class43[] method1255(int arg0, int arg1, class36 arg2, int arg3) {
        if (arg0 != 2) {
            field3112 = (FontMetrics) null;
        }
        field3111++;
        return class56.method414(arg1, arg2, false, arg3) ? class212.method1335(arg0 - 2) : null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)[[I", line = 408)
    public final int[][] method1256(int arg0, int arg1, int arg2) {
        field3109++;
        if (arg2 != -10072) {
            this.method1252(55, -121, false);
        }
        if (this.field3120[arg1].field3127) {
            int[] var4 = this.field3120[arg1].method11(arg0, false);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3120[arg1].method9((byte) 3, arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lml;BII)V", line = 440)
    public static final void method1257(class134 arg0, byte arg1, int arg2, int arg3) {
        if (arg0.field2127 == 0) {
            arg0.field2100 = arg0.field2065;
        } else if (arg0.field2127 == 1) {
            arg0.field2100 = (arg2 - arg0.field2057) / 2 + arg0.field2065;
        } else if (arg0.field2127 == 2) {
            arg0.field2100 = arg2 - arg0.field2065 - arg0.field2057;
        } else if (arg0.field2127 == 3) {
            arg0.field2100 = arg0.field2065 * arg2 >> 14;
        } else if (arg0.field2127 == 4) {
            arg0.field2100 = (arg0.field2065 * arg2 >> 14) + (arg2 - arg0.field2057) / 2;
        } else {
            arg0.field2100 = arg2 - arg0.field2057 - (arg0.field2065 * arg2 >> 14);
        }
        if (arg0.field2067 == 0) {
            arg0.field2021 = arg0.field2069;
        } else if (arg0.field2067 == 1) {
            arg0.field2021 = (arg3 - arg0.field2180) / 2 + arg0.field2069;
        } else if (arg0.field2067 == 2) {
            arg0.field2021 = arg3 - arg0.field2180 - arg0.field2069;
        } else if (arg0.field2067 == 3) {
            arg0.field2021 = arg0.field2069 * arg3 >> 14;
        } else if (arg0.field2067 == 4) {
            arg0.field2021 = (arg3 - arg0.field2180) / 2 + (arg0.field2069 * arg3 >> 14);
        } else {
            arg0.field2021 = arg3 - arg0.field2180 - (arg0.field2069 * arg3 >> 14);
        }
        if (class106.field1626 && (client.method620(arg0) != 0 || arg0.field2135 == 0)) {
            if (arg0.field2021 < 0) {
                arg0.field2021 = 0;
            } else if (arg3 < arg0.field2180 + arg0.field2021) {
                arg0.field2021 = arg3 - arg0.field2180;
            }
            if (arg0.field2100 < 0) {
                arg0.field2100 = 0;
            } else if (arg2 < (arg0.field2100 + arg0.field2057)) {
                arg0.field2100 = arg2 - arg0.field2057;
            }
        }
        if (arg1 == -72) {
            field3125++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 516)
    public void method14(int arg0) {
        if (arg0 != 2048879374) {
            method1254(91, -48, 27, -107, 127, -50, 55, 35);
        }
        field3123++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IZ)V", line = 527)
    public class195(int arg0, boolean arg1) {
        this.field3127 = arg1;
        this.field3120 = new class195[arg0];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[[I", line = 539)
    public int[][] method9(byte arg0, int arg1) {
        field3114++;
        if (arg0 != 3) {
            this.method1252(22, 111, true);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }
}
