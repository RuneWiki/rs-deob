import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class61 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1516 = 0;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lgd;")
    public static class40 field1519 = class14.method90(false, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lgd;")
    public static class40 field1524 = class14.method90(false, "weiss:");

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lgd;")
    public static class40 field1525 = class14.method90(false, "p12_full");

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
    public static int[] field1526 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "[Lqb;")
    public static class97[] field1529 = new class97[4];

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lgd;")
    public static class40 field1530 = class14.method90(false, "null");

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Laa;")
    public class1 field1520;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V", line = 21)
    public static final void method448(int arg0, boolean arg1) {
        field1528++;
        if (!arg1 || !class134.method1049(16681)) {
            return;
        }
        if (class131.field3183) {
            class93.field2152 = arg0;
        } else {
            class51.method402(-125, arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILqa;BI)V", line = 39)
    public static final void method449(int arg0, class96 arg1, byte arg2, int arg3) {
        if (arg2 != -22) {
            return;
        }
        field1515++;
        if (arg1.field813 == arg3 && arg3 != -1) {
            int var4 = class22.method126((byte) 50, arg3).field1159;
            if (var4 == 1) {
                arg1.field824 = 0;
                arg1.field816 = 0;
                arg1.field804 = arg0;
                arg1.field799 = 0;
            }
            if (var4 == 2) {
                arg1.field824 = 0;
                return;
            }
        } else if (arg3 == -1 || arg1.field813 == -1 || class22.method126((byte) -104, arg3).field1125 >= class22.method126((byte) 60, arg1.field813).field1125) {
            arg1.field804 = arg0;
            arg1.field770 = arg1.field791;
            arg1.field813 = arg3;
            arg1.field799 = 0;
            arg1.field824 = 0;
            arg1.field816 = 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 81)
    public static void method450(int arg0) {
        field1530 = null;
        field1529 = null;
        field1526 = null;
        field1519 = null;
        field1524 = null;
        int var1 = -24 / ((arg0 + 6) / 47);
        field1525 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lp;B)V", line = 119)
    public static final void method451(class93 arg0, byte arg1) {
        field1522++;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field2144 == 0) {
            var3 = class21.field490.method970(arg0.field2132, arg0.field2135, arg0.field2138);
        }
        if (arg0.field2144 == 1) {
            var3 = class21.field490.method977(arg0.field2132, arg0.field2135, arg0.field2138);
        }
        int var5 = 0;
        if (arg0.field2144 == 2) {
            var3 = class21.field490.method960(arg0.field2132, arg0.field2135, arg0.field2138);
        }
        if (arg0.field2144 == 3) {
            var3 = class21.field490.method989(arg0.field2132, arg0.field2135, arg0.field2138);
        }
        if (var3 != 0) {
            var2 = var3 >> 14 & 0x7FFF;
            int var6 = class21.field490.method957(arg0.field2132, arg0.field2135, arg0.field2138, var3);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field2142 = var2;
        arg0.field2131 = var4;
        if (arg1 > -105) {
            field1526 = null;
        }
        arg0.field2150 = var5;
    }
}
