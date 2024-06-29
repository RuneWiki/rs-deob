import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class88 extends class237 {

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Lte;")
    public static class244 field1082 = new class244(64);

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1086 = "Please wait...";

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field1091 = 0;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1088 = "Loaded fonts";

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "[I")
    public static int[] field1092 = new int[128];

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "J")
    public long field1087;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Lbj;")
    public class88 field1078;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Lbj;")
    public class88 field1083;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method477(int arg0, String arg1) {
        field1080++;
        int var2 = 0;
        if (arg0 < 120) {
            method479((class259) null, -99, -96, -34);
        }
        while (var2 < class102.field1384.length) {
            if (class102.field1384[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
    public static void method478(byte arg0) {
        field1092 = null;
        field1086 = null;
        int var1 = 60 / ((42 - arg0) / 59);
        field1082 = null;
        field1088 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lbl;III)V")
    public static final void method479(class259 arg0, int arg1, int arg2, int arg3) {
        field1084++;
        if (arg0.field3827 == arg2 && arg2 != -1) {
            class165 var4 = class208.method1458((byte) 90, arg2);
            int var5 = var4.field2647;
            if (var5 == 1) {
                arg0.field3738 = 1;
                arg0.field3759 = 0;
                arg0.field3800 = 0;
                arg0.field3782 = 0;
                arg0.field3765 = arg1;
                class221.method1562(arg0.field3782, arg0.field3820, arg0.field3818, var4, (byte) 47, class286.field4571 == arg0);
            }
            if (var5 == 2) {
                arg0.field3759 = 0;
            }
        } else if (arg2 == -1 || arg0.field3827 == -1 || class208.method1458((byte) -112, arg2).field2646 >= class208.method1458((byte) 120, arg0.field3827).field2646) {
            arg0.field3782 = 0;
            arg0.field3765 = arg1;
            arg0.field3800 = 0;
            arg0.field3827 = arg2;
            arg0.field3784 = arg0.field3791;
            arg0.field3759 = 0;
            arg0.field3738 = 1;
            if (arg0.field3827 != -1) {
                class221.method1562(arg0.field3782, arg0.field3820, arg0.field3818, class208.method1458((byte) -80, arg0.field3827), (byte) 47, class286.field4571 == arg0);
            }
        }
        if (arg3 != 0) {
            method483((String) null, (String) null, 40);
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
    public final void method480(int arg0) {
        field1089++;
        if (arg0 <= 40) {
            field1090 = 66;
        }
        if (this.field1083 != null) {
            this.field1083.field1078 = this.field1078;
            this.field1078.field1083 = this.field1083;
            this.field1078 = null;
            this.field1083 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)V")
    public static final void method481(int arg0, int arg1) {
        field1085++;
        if (arg1 == 64) {
            class54 var2 = (class54) class39.field483.method708((long) arg0, arg1 + 63);
            if (var2 != null) {
                var2.method1673(14510);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V")
    public static final void method482(int arg0, byte arg1) {
        class251.field4102 = 1000 / arg0;
        field1077++;
        if (arg1 != 29) {
            method481(-88, 89);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public static final boolean method483(String arg0, String arg1, int arg2) {
        if (arg2 <= 51) {
            method481(-92, -114);
        }
        field1079++;
        int var3 = arg1.length();
        int var4 = arg0.length();
        if (var4 > var3) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            char var7 = arg0.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }
}
