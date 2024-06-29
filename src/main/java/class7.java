import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 extends class210 {

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "Lve;")
    public static class255 field105 = class87.method607(113, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "Lve;")
    private static class255 field104 = class87.method607(115, "Allocating memory");

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "[I")
    public static int[] field99 = new int[256];

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "Lve;")
    public static class255 field100 = class87.method607(119, "Versteckt");

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "Lve;")
    public static class255 field98 = field104;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "[I")
    public static int[] field109;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "Lve;")
    public static class255 field108;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "Lrg;")
    public static class88 field102;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "[Lud;")
    public static class269[] field103;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V", line = 11)
    public static final void method37(int arg0) {
        if (arg0 != 4579) {
            method38(true);
        }
        field97++;
        if (class46.field692) {
            class54.field859 = null;
            class46.field692 = false;
            class157.field2665 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 29)
    public static void method38(boolean arg0) {
        field98 = null;
        field102 = null;
        if (!arg0) {
            field108 = (class255) null;
        }
        field109 = null;
        field100 = null;
        field108 = null;
        field105 = null;
        field99 = null;
        field103 = null;
        field104 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLrg;)Z", line = 48)
    public static final boolean method39(byte arg0, class88 arg1) {
        field106++;
        int var2 = 21 / ((48 - arg0) / 46);
        return arg1.method634(-19044, class150.field2552);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)I", line = 76)
    public static final int method40(int arg0, int arg1) {
        field107++;
        int var2 = arg0 & 0x3F;
        if (arg1 != 0) {
            field104 = (class255) null;
        }
        int var3 = (arg0 & 0xD3) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field99[var0] = var1;
        }
        field109 = new int[128];
        field108 = class87.method607(77, "Cabbage");
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V", line = 157)
    public static final void method41(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class281.field4827) {
            class126.method938(arg1, arg4, arg1 + arg2, arg4 - -arg0);
            class126.method936(arg1, arg4, arg2, arg0, 0);
        } else {
            class175.method1258(arg1, arg4, arg1 + arg2, arg0 + arg4);
            class175.method1249(arg1, arg4, arg2, arg0, 0);
        }
        field101++;
        if (class73.field1205 < 100) {
            return;
        }
        if (class70.field1046 == null || class70.field1046.field4619 != arg2 || class70.field1046.field4628 != arg0) {
            class83 var5 = new class83(arg2, arg0);
            class175.method1254(var5.field1344, arg2, arg0);
            class231.method1604(0, 0, class282.field4846, class41.field636, false, arg2, 0, arg0, 0);
            if (class281.field4827) {
                class70.field1046 = new class98(var5);
            } else {
                class70.field1046 = var5;
            }
            if (class281.field4827) {
                class175.field2891 = null;
            } else {
                class69.field1033.method1657(25);
            }
        }
        class70.field1046.method290(arg1, arg4);
        if (arg3 != 0) {
            return;
        }
        int var6 = class120.field2002 * arg2 / class282.field4846 + arg1;
        int var7 = class76.field1251 * arg2 / class282.field4846;
        int var8 = class151.field2560 * arg0 / class41.field636 + arg4;
        int var9 = class277.field4745 * arg0 / class41.field636;
        if (class281.field4827) {
            class126.method932(var6, var8, var7, var9, 16711680, 128);
            class126.method926(var6, var8, var7, var9, 16711680);
        } else {
            class175.method1241(var6, var8, var7, var9, 16711680, 128);
            class175.method1253(var6, var8, var7, var9, 16711680);
        }
        if (class297.field5088 <= 0 || class297.field5088 % 10 >= 5) {
            return;
        }
        for (class67 var10 = (class67) class215.field3654.method1471((byte) 112); var10 != null; var10 = (class67) class215.field3654.method1475((byte) 83)) {
            if (class150.field2549 == var10.field990) {
                int var11 = arg1 + (var10.field999 * arg2 / class282.field4846);
                int var12 = var10.field1003 * arg0 / class41.field636 + arg4;
                if (class281.field4827) {
                    class126.method936(var11 - 2, var12 + -2, 4, 4, 16776960);
                } else {
                    class175.method1249(var11 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
    }
}
