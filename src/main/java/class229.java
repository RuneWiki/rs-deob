import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class229 extends class197 {

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Ljd;")
    private static class85 field3962 = class221.method1499("Loaded config", (byte) 115);

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Ljd;")
    public static class85 field3967 = field3962;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Ljd;")
    public static class85 field3969 = class221.method1499("Untersuchen", (byte) -105);

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[[[B")
    public static byte[][][] field3964;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method1535(int arg0) {
        if (arg0 != -31055) {
            field3969 = null;
        }
        field3964 = null;
        field3967 = null;
        field3969 = null;
        field3962 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public static final void method1536(int arg0, int arg1, int arg2) {
        field3963++;
        int var3 = -102 % ((5 - arg2) / 63);
        class171 var4 = class85.method579(1, 0, arg0);
        var4.method1140(-28981);
        var4.field2951 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lge;Lge;Laa;Z)V")
    public static final void method1537(class68 arg0, class68 arg1, class164 arg2, boolean arg3) {
        class162.field2790 = arg1;
        field3966++;
        class92.field1696 = arg0;
        if (!arg3) {
            class65.field1193 = arg2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILvb;)V")
    public static final void method1538(int arg0, class58 arg1) {
        arg1.field1065 = false;
        field3968++;
        if (arg1.field1057 != -1) {
            class106 var2 = class101.method704(1, arg1.field1057);
            if (var2 == null || var2.field1857 == null) {
                arg1.field1057 = -1;
            } else {
                arg1.field1020++;
                if (arg1.field1032 < var2.field1857.length && var2.field1863[arg1.field1032] < arg1.field1020) {
                    arg1.field1032++;
                    arg1.field1020 = 1;
                    class163.method1080(var2, arg1.field1042, arg1.field1027, arg1.field1032, 21983, class22.field308 == arg1);
                }
                if (arg1.field1032 >= var2.field1857.length) {
                    arg1.field1032 = 0;
                    arg1.field1020 = 0;
                    class163.method1080(var2, arg1.field1042, arg1.field1027, arg1.field1032, arg0 ^ 0xFFFFAA20, class22.field308 == arg1);
                }
            }
        }
        if (arg1.field1064 != -1 && class151.field2555 >= arg1.field1019) {
            int var3 = class87.method647((byte) 62, arg1.field1064).field1329;
            if (var3 == -1) {
                arg1.field1064 = -1;
            } else {
                class106 var4 = class101.method704(1, var3);
                if (var4 == null || var4.field1857 == null) {
                    arg1.field1064 = -1;
                } else {
                    if (arg1.field1022 < 0) {
                        arg1.field1022 = 0;
                        class163.method1080(var4, arg1.field1042, arg1.field1027, 0, 21983, class22.field308 == arg1);
                    }
                    arg1.field1026++;
                    if (arg1.field1022 < var4.field1857.length && var4.field1863[arg1.field1022] < arg1.field1026) {
                        arg1.field1026 = 1;
                        arg1.field1022++;
                        class163.method1080(var4, arg1.field1042, arg1.field1027, arg1.field1022, 21983, class22.field308 == arg1);
                    }
                    if (var4.field1857.length <= arg1.field1022) {
                        arg1.field1064 = -1;
                    }
                }
            }
        }
        if (arg1.field1056 != -1 && arg1.field1053 <= 1) {
            class106 var5 = class101.method704(arg0 ^ 0xFFFFFFFE, arg1.field1056);
            if (var5.field1854 == 1 && arg1.field1063 > 0 && arg1.field1035 <= class151.field2555 && arg1.field1050 < class151.field2555) {
                arg1.field1053 = 1;
                return;
            }
        }
        if (arg1.field1056 != -1 && arg1.field1053 == 0) {
            class106 var6 = class101.method704(1, arg1.field1056);
            if (var6 == null || var6.field1857 == null) {
                arg1.field1056 = -1;
            } else {
                arg1.field1069++;
                if (arg1.field1044 < var6.field1857.length && var6.field1863[arg1.field1044] < arg1.field1069) {
                    arg1.field1069 = 1;
                    arg1.field1044++;
                    class163.method1080(var6, arg1.field1042, arg1.field1027, arg1.field1044, arg0 + 21984, class22.field308 == arg1);
                }
                if (arg1.field1044 >= var6.field1857.length) {
                    arg1.field1044 -= var6.field1853;
                    arg1.field1061++;
                    if (var6.field1877 <= arg1.field1061) {
                        arg1.field1056 = -1;
                    } else if (arg1.field1044 >= 0 && arg1.field1044 < var6.field1857.length) {
                        class163.method1080(var6, arg1.field1042, arg1.field1027, arg1.field1044, arg0 + 21984, class22.field308 == arg1);
                    } else {
                        arg1.field1056 = -1;
                    }
                }
                arg1.field1065 = var6.field1861;
            }
        }
        if (~arg1.field1053 < arg0) {
            arg1.field1053--;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILik;)Ljd;")
    public static final class85 method1539(int arg0, class247 arg1) {
        int var2 = -45 / ((-arg0 - 19) / 40);
        field3965++;
        return class30.method210(32767, arg1, -56);
    }
}
