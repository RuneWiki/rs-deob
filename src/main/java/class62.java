import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends class113 {

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    public int field1539 = 0;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "Lu;")
    public static class135 field1542 = class87.method676((byte) -119, "scrollbar");

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "Le;")
    public static class29 field1548 = new class29(100);

    @OriginalMember(owner = "client!j", name = "mb", descriptor = "I")
    public static int field1553 = 0;

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "Lu;")
    public static class135 field1551 = class87.method676((byte) -89, "Schlie-8en");

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!j", name = "pb", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!j", name = "qb", descriptor = "Lpe;")
    public static class109 field1557;

    @OriginalMember(owner = "client!j", name = "nb", descriptor = "Lre;")
    public static class122 field1554;

    @OriginalMember(owner = "client!j", name = "rb", descriptor = "[Lve;")
    public static class146[] field1558;

    @OriginalMember(owner = "client!j", name = "ob", descriptor = "[Lae;")
    public static class6[] field1555;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
    public static final void method511(int arg0) {
        field1546++;
        class116.field2765.method966(arg0 - 14811);
        class49.field1166.method29(0, 0);
        class51.method395();
        if (arg0 != 14707) {
            field1558 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Lne;")
    public static final class95 method512(int arg0, int arg1) {
        field1549++;
        class95 var2 = (class95) class123.field2938.method239(9325, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class145.field3538.method324(0, arg1, 4);
        class95 var4 = new class95();
        if (var3 != null) {
            var4.method780(0, new class59(var3), arg1);
        }
        var4.method781(93);
        class123.field2938.method241(var4, arg0 ^ arg0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
    public static final void method513(int arg0) {
        field1540++;
        if (arg0 >= -40) {
            method511(-82);
        }
        for (class44 var1 = (class44) class123.field2940.method182((byte) 50); var1 != null; var1 = (class44) class123.field2940.method181((byte) 124)) {
            if (var1.field1072 > 0) {
                var1.field1072--;
            }
            if (var1.field1072 != 0) {
                if (var1.field1083 > 0) {
                    var1.field1083--;
                }
                if (var1.field1083 == 0 && var1.field1060 >= 1 && var1.field1073 >= 1 && var1.field1060 <= 102 && var1.field1073 <= 102 && (var1.field1062 < 0 || class103.method847(var1.field1062, 0, var1.field1064))) {
                    class19.method139(var1.field1062, var1.field1060, var1.field1063, var1.field1064, (byte) 80, var1.field1073, var1.field1058, var1.field1070);
                    var1.field1083 = -1;
                    if (var1.field1078 == var1.field1062 && var1.field1078 == -1) {
                        var1.method302(4071);
                    } else if (var1.field1078 == var1.field1062 && var1.field1070 == var1.field1057 && var1.field1071 == var1.field1064) {
                        var1.method302(4071);
                    }
                }
            } else if (var1.field1078 < 0 || class103.method847(var1.field1078, 0, var1.field1071)) {
                class19.method139(var1.field1078, var1.field1060, var1.field1063, var1.field1071, (byte) 91, var1.field1073, var1.field1058, var1.field1057);
                var1.method302(4071);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(JB)V")
    public static final void method514(long arg0, byte arg1) {
        if (arg1 != -38) {
            field1555 = null;
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field1541++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)I")
    public static final int method515(boolean arg0) {
        field1544++;
        if (arg0) {
            field1553 = 57;
        }
        return class148.field3701++;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public static final void method516(int arg0) {
        field1550++;
        if (arg0 == 8) {
            class106.field2555.method234(-22666);
            class34.field795.method234(-22666);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILic;I)V")
    private final void method517(int arg0, class59 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field1539 = arg1.method483((byte) 24);
        }
        field1547++;
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V")
    public static void method518(int arg0) {
        field1548 = null;
        field1555 = null;
        field1542 = null;
        field1557 = null;
        if (arg0 <= 6) {
            field1554 = null;
        }
        field1558 = null;
        field1551 = null;
        field1554 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILic;)V")
    public final void method519(int arg0, class59 arg1) {
        field1543++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method480(0);
            if (var3 == 0) {
                return;
            }
            this.method517(var3, arg1, 2);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(II)Lu;")
    public static final class135 method520(int arg0, int arg1) {
        if (arg1 != -8) {
            method513(35);
        }
        field1545++;
        class135 var2 = class68.method547(-1, arg0);
        for (int var3 = var2.method1063(-64) - 3; var3 > 0; var3 -= 3) {
            var2 = class107.method867(2, new class135[] { var2.method1074(0, var3, -27090), class63.field1560, var2.method1065((byte) -40, var3) });
        }
        if (var2.method1063(-64) > 8) {
            var2 = class107.method867(2, new class135[] { class85.field2017, var2.method1074(0, var2.method1063(arg1 - 56) - 8, arg1 ^ 0x69D6), class41.field966, class93.field2213, var2, class75.field1776 });
        } else if (var2.method1063(-64) > 4) {
            var2 = class107.method867(2, new class135[] { class129.field3097, var2.method1074(0, var2.method1063(-64) - 4, -27090), class1.field18, class93.field2213, var2, class75.field1776 });
        }
        return class107.method867(2, new class135[] { class1.field3, var2 });
    }
}
