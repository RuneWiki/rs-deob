import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class220 extends class41 {

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "[Lqh;")
    public class100[] field3797 = new class100[5];

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public int field3802 = 0;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "[I")
    public int[] field3808 = new int[5];

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Lsc;")
    public static class181 field3792 = class149.method967(255, "<br>");

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Z")
    public static boolean field3781 = false;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "Lsc;")
    private static class181 field3791 = class149.method967(255, ")4a=");

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field3795 = 0;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public int field3806;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "Lu;")
    public class102 field3809;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "Lgk;")
    public class106 field3810;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "Lhc;")
    public class15 field3799;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "Lfj;")
    public class164 field3805;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Lfa;")
    public class220 field3798;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "Lh;")
    public class74 field3803;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "Lqc;")
    public class75 field3801;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Z")
    public boolean field3785;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Z")
    public boolean field3790;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Z")
    public boolean field3796;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "[I")
    public static int[] field3782;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public static final void method1462(byte arg0) {
        field3783++;
        class121 var1 = (class121) class257.field4495.method1686((byte) -83);
        if (arg0 >= -25) {
            field3791 = null;
        }
        while (var1 != null) {
            if (var1.field1984 > 0) {
                var1.field1984--;
            }
            if (var1.field1984 != 0) {
                if (var1.field1979 > 0) {
                    var1.field1979--;
                }
                if (var1.field1979 == 0 && var1.field1981 >= 1 && var1.field1986 >= 1 && var1.field1981 <= 102 && var1.field1986 <= 102 && (var1.field1980 < 0 || class180.method1196((byte) -39, var1.field1980, var1.field1990))) {
                    class132.method855(var1.field1986, var1.field1981, var1.field1980, true, var1.field1982, var1.field1983, var1.field1990, var1.field1975);
                    var1.field1979 = -1;
                    if (var1.field1991 == var1.field1980 && var1.field1991 == -1) {
                        var1.method290((byte) -48);
                    } else if (var1.field1991 == var1.field1980 && var1.field1988 == var1.field1982 && var1.field1990 == var1.field1976) {
                        var1.method290((byte) -48);
                    }
                }
            } else if (var1.field1991 < 0 || class180.method1196((byte) -99, var1.field1991, var1.field1976)) {
                class132.method855(var1.field1986, var1.field1981, var1.field1991, true, var1.field1988, var1.field1983, var1.field1976, var1.field1975);
                var1.method290((byte) -48);
            }
            var1 = (class121) class257.field4495.method1683(140);
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public static void method1463(int arg0) {
        field3782 = null;
        if (arg0 != -1) {
            method1465((byte) -34);
        }
        field3792 = null;
        field3791 = null;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(III)V")
    public class220(int arg0, int arg1, int arg2) {
        this.field3788 = arg2;
        this.field3793 = this.field3811 = arg0;
        this.field3784 = arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)I")
    public static final int method1464(byte arg0, int arg1) {
        field3787++;
        if (arg0 <= 27) {
            field3782 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)Lsc;")
    public static final class181 method1465(byte arg0) {
        if (arg0 <= 101) {
            return null;
        }
        class181 var1 = class67.field1082;
        if (class113.field1840 != 0) {
            var1 = class213.field3667;
        }
        field3789++;
        return class175.method1164(new class181[] { class27.field478, var1, class157.field2634, class169.method1119((byte) 49, class196.field3431), field3791, class169.method1119((byte) -127, class264.field4584), class140.field2274 }, (byte) 124);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V")
    public static final void method1466(int arg0, int arg1, int arg2, int arg3) {
        field3786++;
        class175 var4 = class26.method221(arg2, -24807, arg0);
        if (var4 != null && var4.field3045 != null) {
            class94 var5 = new class94();
            var5.field1488 = var4;
            var5.field1489 = var4.field3045;
            class27.method225(var5, (byte) 120);
        }
        class73.field1168 = arg0;
        int var6 = -24 / ((arg1 + 71) / 34);
        field3781 = true;
        class121.field1974 = arg3;
        class144.field2330 = arg2;
        class218.method1453((byte) -73, var4);
    }
}
