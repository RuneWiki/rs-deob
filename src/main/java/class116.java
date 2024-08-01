import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("md")
public class class116 {

    @OriginalMember(owner = "md", name = "a", descriptor = "Llf;")
    public static class109 field2293 = class35.method275("leuchten1:", 2);

    @OriginalMember(owner = "md", name = "d", descriptor = "Llf;")
    public static class109 field2296 = null;

    @OriginalMember(owner = "md", name = "b", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "md", name = "k", descriptor = "[Llf;")
    public static class109[] field2303 = new class109[100];

    @OriginalMember(owner = "md", name = "g", descriptor = "Llf;")
    public static class109 field2299 = class35.method275("Stufe)2", 2);

    @OriginalMember(owner = "md", name = "h", descriptor = "[Llf;")
    public static class109[] field2300 = new class109[1000];

    @OriginalMember(owner = "md", name = "l", descriptor = "Llf;")
    private static class109 field2304 = class35.method275("scroll:", 2);

    @OriginalMember(owner = "md", name = "j", descriptor = "Llf;")
    public static class109 field2302 = field2304;

    @OriginalMember(owner = "md", name = "i", descriptor = "Llf;")
    public static class109 field2301 = field2304;

    @OriginalMember(owner = "md", name = "m", descriptor = "Llf;")
    public static class109 field2305 = class35.method275("<col=ffffff>", 2);

    @OriginalMember(owner = "md", name = "c", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "md", name = "e", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "md", name = "f", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "md", name = "a", descriptor = "(BLbg;I)Lmb;")
    public static final class114 method852(byte arg0, class18 arg1, int arg2) {
        int var3 = 62 / ((49 - arg0) / 35);
        field2297++;
        byte[] var4 = arg1.method173(0, arg2);
        return var4 == null ? null : new class114(var4);
    }

    @OriginalMember(owner = "md", name = "a", descriptor = "(IIII)Z")
    public static final boolean method853(int arg0, int arg1, int arg2, int arg3) {
        if (!class201.method1327(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class29.field623[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class18.field371) {
                    if (!class1.method1(var4, var6, var5)) {
                        return false;
                    }
                    if (!class1.method1(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class1.method1(var4, var7, var5)) {
                        return false;
                    }
                    if (!class1.method1(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class1.method1(var4, var8, var5)) {
                    return false;
                }
                if (!class1.method1(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class144.field2782) {
                    if (!class1.method1(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class1.method1(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class1.method1(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class1.method1(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class1.method1(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class1.method1(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class18.field371) {
                    if (!class1.method1(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class1.method1(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class1.method1(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class1.method1(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class1.method1(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class1.method1(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class144.field2782) {
                    if (!class1.method1(var4, var6, var5)) {
                        return false;
                    }
                    if (!class1.method1(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class1.method1(var4, var7, var5)) {
                        return false;
                    }
                    if (!class1.method1(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class1.method1(var4, var8, var5)) {
                    return false;
                }
                if (!class1.method1(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class1.method1(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class1.method1(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class1.method1(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class1.method1(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class1.method1(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "md", name = "a", descriptor = "(I)V")
    public static void method854(int arg0) {
        field2300 = null;
        field2302 = null;
        field2305 = null;
        field2301 = null;
        int var1 = -46 % ((arg0 + 24) / 32);
        field2303 = null;
        field2299 = null;
        field2296 = null;
        field2293 = null;
        field2304 = null;
    }

    @OriginalMember(owner = "md", name = "a", descriptor = "(IILoh;)V")
    public static final void method855(int arg0, int arg1, class138 arg2) {
        field2295++;
        if (class118.field2328 == null) {
            class85.method542(arg0, (byte) 0, null, true, 255, arg0 + 118, 255);
            class51.field1035[arg1] = arg2;
        } else {
            class118.field2328.field1773 = arg1 * 8 + 5;
            int var3 = class118.field2328.method582(15);
            int var4 = class118.field2328.method582(15);
            arg2.method985(106, var3, var4);
        }
    }
}
