import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class106 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lvd;")
    private class4 field1691 = new class4();

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1705 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[I")
    public static int[] field1701 = new int[2048];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
    public static boolean field1690 = false;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lvd;")
    private class4 field1699;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lvd;")
    public final class4 method764(byte arg0) {
        if (arg0 != -82) {
            return null;
        }
        field1698++;
        class4 var2 = this.field1699;
        if (this.field1691 == var2) {
            this.field1699 = null;
            return null;
        } else {
            this.field1699 = var2.field52;
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lqh;ILqh;)I")
    public static final int method765(class201 arg0, int arg1, class201 arg2) {
        field1697++;
        int var3 = 0;
        if (arg0.method1353(-31, class29.field472)) {
            var3++;
        }
        if (arg0.method1353(-93, class209.field3426)) {
            var3++;
        }
        if (arg0.method1353(-65, class53.field917)) {
            var3++;
        }
        if (arg2.method1353(-116, class29.field472)) {
            var3++;
        }
        if (arg2.method1353(-112, class209.field3426)) {
            var3++;
        }
        if (arg2.method1353(-54, class53.field917)) {
            var3++;
        }
        int var4 = -50 / ((-arg1 - 69) / 33);
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Lvd;")
    public final class4 method766(byte arg0) {
        field1702++;
        class4 var2 = this.field1691.field52;
        if (this.field1691 == var2) {
            this.field1699 = null;
            return null;
        } else if (arg0 == -127) {
            this.field1699 = var2.field52;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method767(int arg0) {
        field1695++;
        class255.method1735(false);
        class122.method884((byte) -108);
        class19.method188((byte) 116);
        class222.method1567(true);
        class183.method1241(9776);
        class162.method1122(111);
        class158.method1107(-32677);
        class231.method1617(124);
        class100.method735(101);
        class115.method850(-19000);
        class25.method229(4);
        class244.method1684(69);
        class234.method1631(6);
        class189.method1293(230);
        class259.method1773(235);
        class28.method246(-103);
        class179.method1217(arg0 - 20594);
        class34.method288((byte) 21);
        class70.field1158.method481(false);
        if (arg0 != 20594) {
            field1705 = null;
        }
        class40.field747.method481(false);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZLqh;III)V")
    public static final void method768(int arg0, int arg1, boolean arg2, class201 arg3, int arg4, int arg5, int arg6) {
        field1704++;
        class244.field3917 = arg3;
        if (arg1 != -1748) {
            return;
        }
        class132.field2119 = arg5;
        class285.field4512 = arg6;
        class99.field1623 = arg0;
        class220.field3599 = 1;
        class133.field2127 = arg2;
        class94.field1549 = arg4;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class106() {
        this.field1691.field55 = this.field1691;
        this.field1691.field52 = this.field1691;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)I")
    public final int method769(int arg0) {
        if (arg0 <= 76) {
            method772(false);
        }
        field1696++;
        int var2 = 0;
        for (class4 var3 = this.field1691.field52; var3 != this.field1691; var3 = var3.field52) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
    public final void method770(byte arg0) {
        while (true) {
            class4 var2 = this.field1691.field52;
            if (this.field1691 == var2) {
                this.field1699 = null;
                field1693++;
                if (arg0 <= 94) {
                    field1705 = null;
                    return;
                }
                return;
            }
            var2.method40(0);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Lvd;")
    public final class4 method771(int arg0) {
        field1703++;
        if (arg0 >= -51) {
            method765((class201) null, -128, (class201) null);
        }
        class4 var2 = this.field1691.field52;
        if (this.field1691 == var2) {
            return null;
        } else {
            var2.method40(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)[Lcb;")
    public static final class243[] method772(boolean arg0) {
        field1706++;
        class243[] var1 = new class243[class278.field4385];
        int var2 = 0;
        if (!arg0) {
            field1700 = -72;
        }
        while (class278.field4385 > var2) {
            var1[var2] = new class243(class27.field432, class155.field2513, class152.field2464[var2], class74.field1202[var2], class148.field2385[var2], class236.field3847[var2], class145.field2332[var2], class194.field3113);
            var2++;
        }
        class287.method1923(0);
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)V")
    public static void method773(byte arg0) {
        if (arg0 != 86) {
            method768(-61, 93, true, (class201) null, -114, 68, -44);
        }
        field1701 = null;
        field1705 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILvd;)V")
    public final void method774(int arg0, class4 arg1) {
        field1692++;
        if (arg0 != 0) {
            return;
        }
        if (arg1.field55 != null) {
            arg1.method40(0);
        }
        arg1.field55 = this.field1691.field55;
        arg1.field52 = this.field1691;
        arg1.field55.field52 = arg1;
        arg1.field52.field55 = arg1;
    }
}
