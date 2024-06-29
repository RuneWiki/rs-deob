import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class248 {

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field4071 = 0;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Z")
    public static boolean field4072 = false;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lhe;")
    public static class108 field4065 = null;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
    public static int[] field4066;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)Z", line = 12)
    public static final boolean method1749(int arg0, int arg1, int arg2, int arg3) {
        if (!class296.method2130(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class144.field2427[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class1.field3) {
                    if (!class153.method1093(var4, var6, var5)) {
                        return false;
                    }
                    if (!class153.method1093(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class153.method1093(var4, var7, var5)) {
                        return false;
                    }
                    if (!class153.method1093(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class153.method1093(var4, var8, var5)) {
                    return false;
                }
                if (!class153.method1093(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class105.field1915) {
                    if (!class153.method1093(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class153.method1093(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class153.method1093(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class153.method1093(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class153.method1093(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class153.method1093(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class1.field3) {
                    if (!class153.method1093(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class153.method1093(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class153.method1093(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class153.method1093(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class153.method1093(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class153.method1093(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class105.field1915) {
                    if (!class153.method1093(var4, var6, var5)) {
                        return false;
                    }
                    if (!class153.method1093(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class153.method1093(var4, var7, var5)) {
                        return false;
                    }
                    if (!class153.method1093(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class153.method1093(var4, var8, var5)) {
                    return false;
                }
                if (!class153.method1093(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class153.method1093(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class153.method1093(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class153.method1093(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class153.method1093(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class153.method1093(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(IIII)V", line = 197)
    public static final void method1750(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            class61.field1191++;
            class51.field1038.method291((byte) 103, 38);
        }
        field4068++;
        if (arg1 == 1) {
            class51.field1038.method291((byte) 109, 253);
            class363.field5753++;
        }
        class51.field1038.method1042((byte) -125, class272.field4426 + arg0);
        class51.field1038.method1041(128, class261.field4307[82] ? 1 : 0);
        class51.field1038.method1002((byte) -80, class21.field543 + arg2);
        class51.field1038.method1048((byte) 73, ++class272.field4424);
        if (arg3 >= -46) {
            field4065 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 232)
    public static void method1751(int arg0) {
        field4066 = null;
        if (arg0 != 0) {
            method1751(69);
        }
    }
}
