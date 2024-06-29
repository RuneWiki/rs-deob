import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class494 extends class41 {

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    private int field6877;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    private int field6882;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    private int field6883;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    private int field6884;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2911(String arg0, int arg1) {
        field6881++;
        if (arg1 > -91) {
            return null;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > (var4 + 2)) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 - 87;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                char var9 = arg0.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - '0';
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + var10 + 10 - 97;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 - 55;
                }
                var4 += 2;
                if (var11 != 0 && class599.method3415((byte) var11, (byte) 39)) {
                    var2.append(class625.method3550((byte) var11, (byte) 117));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Loga;I)V")
    public final void method331(class500 arg0, int arg1) {
        arg0.method2960(this.field6883, this.field6884, this.field6877, 106, this.field6882);
        field6876++;
        if (arg1 != 55) {
            method2914(null, true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLes;)Lro;")
    public static final class2 method2912(boolean arg0, class403 arg1) {
        field6875++;
        class99 var2 = class202.method1303((byte) -83, arg1);
        int var3 = arg1.method2365(arg0);
        return new class2(var2.field7693, var2.field7699, var2.field7690, var2.field7700, var2.field7694, var2.field7703, var2.field7696, var2.field7688, var2.field7691, var2.field1290, var2.field1294, var2.field1296, var2.field1295, var2.field1291, var2.field1289, var3);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILes;)V")
    public final void method329(int arg0, class403 arg1) {
        field6878++;
        this.field6882 = arg1.method2381((byte) 42);
        this.field6883 = arg1.method2381((byte) 119);
        this.field6884 = arg1.method2396((byte) 31);
        this.field6877 = arg1.method2396((byte) 112);
        if (arg0 != -3999) {
            this.field6882 = -6;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
    public static final boolean method2913(int arg0, int arg1, int arg2) {
        if (arg1 == 31613) {
            field6879++;
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lbn;Z)V")
    public static final void method2914(class468 arg0, boolean arg1) {
        field6880++;
        arg0.method2391(-110, class210.field2495.method427(74));
        arg0.method2391(120, class227.field2659.method427(-121));
        arg0.method2391(38, class483.field6745.method427(25));
        arg0.method2391(104, class503.field7120.method427(28));
        arg0.method2391(55, class257.field3050.method427(113));
        arg0.method2391(-14, class340.field4208.method427(-112));
        arg0.method2391(54, class599.field8106.method427(38));
        arg0.method2391(-118, class733.field10257.method427(-115));
        arg0.method2391(6, class208.field2470.method427(-123));
        arg0.method2391(-104, class36.field541.method427(48));
        arg0.method2391(121, class514.field7247.method427(37));
        arg0.method2391(87, class385.field4939.method427(22));
        arg0.method2391(-104, class251.field2945.method427(-1));
        arg0.method2391(-122, class625.field8577.method427(-126));
        arg0.method2391(124, class709.field9956.method427(-120));
        arg0.method2391(90, class4.field48.method427(-119));
        arg0.method2391(-117, class392.field5080.method427(-123));
        arg0.method2391(-110, class691.field9407.method427(-112));
        arg0.method2391(-116, class410.field5375.method427(67));
        arg0.method2391(-121, class481.field6728.method427(-121));
        arg0.method2391(-127, class53.field720.method427(99));
        arg0.method2391(66, class277.field3243.method427(-119));
        arg0.method2391(108, class512.field7239.method427(36));
        arg0.method2391(112, class132.field1645.method427(-124));
        arg0.method2391(-119, class410.field5372.method427(41));
        arg0.method2391(-106, class85.field1137.method427(-6));
        arg0.method2391(37, class195.field2336.method427(50));
        arg0.method2391(50, class497.field6954.method427(-121));
        arg0.method2391(-125, class318.field3910.method427(10));
        arg0.method2391(46, class747.field10371.method427(-120));
        arg0.method2391(6, class459.field6470.method427(-127));
        if (!arg1) {
            arg0.method2391(-128, class519.field7331.method427(-122));
            arg0.method2391(57, class296.method1727(-1));
            arg0.method2391(94, class540.method3201(124));
            arg0.method2391(123, class466.field6519.method427(42));
        }
    }
}
