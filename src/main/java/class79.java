import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class79 {

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1547 = 4;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[I")
    public static int[] field1546 = new int[field1547];

    @OriginalMember(owner = "client!j", name = "f", descriptor = "[[Leb;")
    public static class217[][] field1548 = new class217[field1547][500];

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lia;")
    public static class257 field1551 = class28.method234(77, "::");

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lia;")
    public static class257 field1550 = class28.method234(119, "(Y");

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lsc;")
    public static class56 field1553 = new class56(16);

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Lia;")
    public static class257 field1556 = class28.method234(-115, "sch-Utteln:");

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lia;")
    public static class257 field1555 = class28.method234(-20, "<col=ffff00>");

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Lff;")
    public static class83 field1543;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
    public static final void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1552++;
        if (class123.field2211 <= arg2 && class145.field2540 >= arg0 && class40.field834 <= arg5 && arg1 <= class255.field4371) {
            if (arg3 == 1) {
                class183.method1252(arg1, arg5, (byte) 99, arg2, arg0, arg6);
            } else {
                class39.method316(arg2, arg3, arg1, arg6, arg0, arg5, true);
            }
        } else if (arg3 == 1) {
            class106.method766(107, arg1, arg0, arg6, arg5, arg2);
        } else {
            class156.method1089(arg0, arg2, arg6, arg5, true, arg3, arg1);
        }
        if (arg4 != 0) {
            field1555 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIB)V")
    public static final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 124) {
            method595(-107, -122, -82, -75, 52, -58, 27);
        }
        field1554++;
        class257.field4440 = arg1;
        class200.field3428 = arg4;
        class64.field1305 = arg0;
        class178.field3088 = arg2;
        class8.field162 = arg3;
        if (class178.field3088 >= 100) {
            int var6 = class64.field1305 * 128 + 64;
            int var7 = class257.field4440 * 128 + 64;
            int var8 = class109.method803(class189.field3261, var6, (byte) 109, var7) - class200.field3428;
            int var9 = var7 - class255.field4366;
            int var10 = var6 - class231.field3885;
            int var11 = var8 - class55.field1171;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var10 * var10)));
            class173.field2956 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class248.field4276 = (int) (Math.atan2((double) var9, (double) var10) * -325.949D) & 0x7FF;
            if (class173.field2956 < 128) {
                class173.field2956 = 128;
            }
            if (class173.field2956 > 383) {
                class173.field2956 = 383;
            }
        }
        class224.field3766 = 2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILia;)V")
    public static final void method597(int arg0, class257 arg1) {
        field1549++;
        class161.field2828 = arg1;
        class2.method30(-127);
        if (arg0 > -88) {
            method596(101, 82, -33, 3, 14, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method598(int arg0) {
        if (arg0 < 53) {
            field1556 = null;
        }
        field1550 = null;
        field1551 = null;
        field1553 = null;
        field1555 = null;
        field1546 = null;
        field1556 = null;
        field1543 = null;
        field1548 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lme;I)Lme;")
    public static final class44 method599(class44 arg0, int arg1) {
        field1545++;
        if (~arg0.field885 != arg1) {
            return class221.method1456(arg0.field885, (byte) -55);
        }
        int var2 = arg0.field935 >>> 16;
        for (class157 var3 = (class157) class136.field2426.method427((byte) 58); var3 != null; var3 = (class157) class136.field2426.method428(false)) {
            if (var3.field2746 == var2) {
                return class221.method1456((int) var3.field573, (byte) -12);
            }
        }
        return null;
    }
}
