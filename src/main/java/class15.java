import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field276 = 0;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field287 = 0;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lec;")
    public static class28 field288 = class28.method210(-46, "Cancel");

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lec;")
    public static class28 field284 = class28.method210(-46, " unread messages");

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lec;")
    public static class28 field280 = class28.method210(-46, "You are not a member)3*6n*6nChoose to subscribe and*6nyou(Wll get loads of extra*6nbenefits and features)3");

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static volatile int field285 = 0;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Z")
    public static boolean field296 = false;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lwc;")
    public static class128 field292;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Loc;")
    public class87 field281;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "[I")
    public static int[] field294;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static final void method83(byte arg0) {
        field300++;
        if (arg0 <= 74) {
            field294 = null;
        }
        int var1 = class126.field2737.method437(class109.field2293);
        for (int var2 = 0; var2 < class114.field2435; var2++) {
            int var10 = class126.field2737.method446(class78.field1813[var2]);
            if (var1 < var10) {
                var1 = var10;
            }
        }
        var1 += 8;
        int var3 = class114.field2435 * 15 + 21;
        if (class96.field2143 > 4 && class32.field680 > 4 && class96.field2143 < 516 && class32.field680 < 338) {
            int var4 = class96.field2143 - var1 / 2 - 4;
            if (var4 + var1 > 512) {
                var4 = 512 - var1;
            }
            class75.field1671 = 0;
            if (var4 < 0) {
                var4 = 0;
            }
            class13.field243 = true;
            class31.field661 = var1;
            class112.field2407 = class114.field2435 * 15 + 22;
            class61.field1345 = var4;
            int var5 = class32.field680 - 4;
            if (var3 + var5 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class68.field1536 = var5;
        }
        if (class96.field2143 > 553 && class32.field680 > 205 && class96.field2143 < 743 && class32.field680 < 466) {
            class112.field2407 = class114.field2435 * 15 + 22;
            class13.field243 = true;
            class31.field661 = var1;
            int var6 = class96.field2143 - var1 / 2 - 553;
            int var7 = class32.field680 - 205;
            class75.field1671 = 1;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 + var3 > 261) {
                var7 = 261 - var3;
            }
            class68.field1536 = var7;
            if (var6 < 0) {
                var6 = 0;
            } else if (var1 + var6 > 190) {
                var6 = 190 - var1;
            }
            class61.field1345 = var6;
        }
        if (class96.field2143 <= 17 || class32.field680 <= 357 || class96.field2143 >= 496 || class32.field680 >= 453) {
            return;
        }
        class31.field661 = var1;
        class112.field2407 = class114.field2435 * 15 + 22;
        int var8 = class96.field2143 - var1 / 2 - 17;
        if (var8 < 0) {
            var8 = 0;
        } else if (var1 + var8 > 479) {
            var8 = 479 - var1;
        }
        class75.field1671 = 2;
        int var9 = class32.field680 - 357;
        class13.field243 = true;
        class61.field1345 = var8;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        class68.field1536 = var9;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ln;Z)Z")
    public static final boolean method84(class78 arg0, boolean arg1) {
        field279++;
        if (!arg1) {
            field291 = -1;
        }
        if (arg0.field1799 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field1799.length; var2++) {
            int var3 = class13.method73(3645, var2, arg0);
            int var4 = arg0.field1777[var2];
            if (arg0.field1799[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field1799[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1799[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method85(byte arg0) {
        field280 = null;
        field292 = null;
        field288 = null;
        field284 = null;
        if (arg0 != 57) {
            method86(-120, -92);
        }
        field294 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method86(int arg0, int arg1) {
        field273++;
        class16.field305 = arg0;
        if (arg1 != 0) {
            field284 = null;
        }
    }
}
