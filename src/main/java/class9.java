import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class9 extends class291 {

    @OriginalMember(owner = "client!l", name = "U", descriptor = "Leg;")
    public static class37 field151 = class174.method1167("event_opbase", -17);

    @OriginalMember(owner = "client!l", name = "N", descriptor = "Leg;")
    public static class37 field145 = class174.method1167("mapdots", -17);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "I")
    public static int field156 = 0;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "Lid;")
    public static class226 field154 = new class226();

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "Leg;")
    public class37 field158;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "[I")
    public int[] field146;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "[I")
    public int[] field161;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "[Lpa;")
    public class140[] field150;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "[Leg;")
    public class37[] field159;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "[[B")
    public static byte[][] field157;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public static final void method50(boolean arg0) {
        field152++;
        class31 var1 = (class31) class59.field952.method1566(-3);
        if (arg0) {
            return;
        }
        while (var1 != null) {
            class232 var2 = var1.field456;
            if (class237.field4140 != var2.field3973 || var2.field3984 < class72.field1146) {
                var1.method441(16773377);
            } else if (class72.field1146 >= var2.field4009) {
                if (var2.field3989 > 0) {
                    class163 var3 = class55.field833[var2.field3989 - 1];
                    if (var3 != null && var3.field1799 >= 0 && var3.field1799 < 13312 && var3.field1793 >= 0 && var3.field1793 < 13312) {
                        var2.method1602(var3.field1799, 83, class72.field1146, class262.method1768(var2.field3973, var3.field1799, var3.field1793, (byte) -100) - var2.field4006, var3.field1793);
                    }
                }
                if (var2.field3989 < 0) {
                    int var4 = -var2.field3989 - 1;
                    class188 var5;
                    if (class116.field1986 == var4) {
                        var5 = class82.field1285;
                    } else {
                        var5 = class98.field1526[var4];
                    }
                    if (var5 != null && var5.field1799 >= 0 && var5.field1799 < 13312 && var5.field1793 >= 0 && var5.field1793 < 13312) {
                        var2.method1602(var5.field1799, 122, class72.field1146, class262.method1768(var2.field3973, var5.field1799, var5.field1793, (byte) -97) - var2.field4006, var5.field1793);
                    }
                }
                var2.method1600(-1024, class259.field4588);
                class278.method1866(class237.field4140, (int) var2.field3981, (int) var2.field4010, (int) var2.field3986, 60, var2, var2.field4012, -1L, false);
            }
            var1 = (class31) class59.field952.method1570(3);
        }
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
    public static void method51(int arg0) {
        if (arg0 > -50) {
            field151 = null;
        }
        field154 = null;
        field157 = null;
        field151 = null;
        field145 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)La;")
    public static final class241 method52(boolean arg0, int arg1) {
        class241 var2 = (class241) class210.field3614.method1411(-76, (long) arg1);
        field144++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class13.field206.method666(class89.method587((byte) 10, arg1), class98.method637(arg1, arg0), (byte) -51);
        class241 var4 = new class241();
        var4.field4301 = arg1;
        if (var3 != null) {
            var4.method1649(new class187(var3), 0);
        }
        var4.method1665((byte) 117);
        if (var4.field4290 != -1) {
            var4.method1646(method52(true, var4.field4290), 19, method52(true, var4.field4353));
        }
        if (var4.field4305 != -1) {
            var4.method1656(119, method52(arg0, var4.field4309), method52(true, var4.field4305));
        }
        if (!class35.field504 && var4.field4350) {
            var4.field4284 = 0;
            var4.field4297 = null;
            var4.field4276 = false;
            var4.field4292 = null;
            var4.field4325 = class36.field531;
        }
        class210.field3614.method1404((long) arg1, false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
    public static final void method53(int arg0) {
        class265.field4657 = null;
        client.field1894 = null;
        class30.field432 = null;
        class191.field3287 = null;
        class108.field1715 = null;
        class228.field3925 = null;
        class222.field3820 = null;
        class109.field1778 = null;
        class61.field1004 = null;
        class174.field2910 = null;
        field147++;
        if (arg0 != -15033) {
            field151 = null;
        }
        class10.field173 = null;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public static final void method54(byte arg0) {
        int var1 = 81 / ((87 - arg0) / 33);
        field163++;
        class89.field1405.method1409(94);
        class98.field1523.method1409(123);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public static final void method55(byte arg0) {
        field148++;
        int var1 = 0;
        if (arg0 <= 29) {
            return;
        }
        while (var1 < class277.field4909) {
            class13 var2 = class201.method1395(2285, var1);
            if (var2 != null && var2.field215 == 0) {
                class52.field806[var1] = 0;
                class153.field2571[var1] = 0;
            }
            var1++;
        }
        class84.field1327 = new class140(16);
    }
}
