import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class244 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lbca;")
    public static class661 field3536;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILua;)V", line = 4)
    public static final void method1676(int arg0, class665 arg1) {
        if (arg0 < 10) {
            field3536 = null;
        }
        arg1.method1539((byte) 121, class89.field1573.method842(26));
        field3534++;
        arg1.method1539((byte) 112, class463.field6504.method842(-106));
        arg1.method1539((byte) 118, class471.field6600.method842(-109));
        arg1.method1539((byte) 120, class113.field1949.method842(-108));
        arg1.method1539((byte) 93, class417.field6035.method842(-104));
        arg1.method1539((byte) 90, class171.field2666.method842(-122));
        arg1.method1539((byte) 92, class78.field1399.method842(9));
        arg1.method1539((byte) 90, class301.field4202.method842(120));
        arg1.method1539((byte) 99, class569.field7819.method842(64));
        arg1.method1539((byte) 90, class605.field8304.method842(-123));
        arg1.method1539((byte) 115, class313.field4344.method842(-113));
        arg1.method1539((byte) 94, class72.field1324.method842(-113));
        arg1.method1539((byte) 121, class536.field7417.method842(-110));
        arg1.method1539((byte) 123, class416.field6026.method842(72));
        arg1.method1539((byte) 120, class107.field1877.method842(37));
        arg1.method1539((byte) 115, class744.field9998.method842(-115));
        arg1.method1539((byte) 126, class660.field9034.method842(104));
        arg1.method1539((byte) 93, class34.field857.method842(28));
        arg1.method1539((byte) 115, class194.field2863.method842(-96));
        arg1.method1539((byte) 102, class558.field7731.method842(98));
        arg1.method1539((byte) 97, class28.field745.method842(114));
        arg1.method1539((byte) 123, class18.field286.method842(-104));
        arg1.method1539((byte) 97, class12.field196.method842(-96));
        arg1.method1539((byte) 111, class77.field1395.method842(109));
        arg1.method1539((byte) 108, class491.field6803.method842(-106));
        arg1.method1539((byte) 102, class549.field7554.method842(102));
        arg1.method1539((byte) 113, class663.field9075.method842(-122));
        arg1.method1539((byte) 86, class212.field3014.method842(97));
        arg1.method1539((byte) 96, class79.field1420.method842(-6));
        arg1.method1539((byte) 96, class168.field2631.method842(-122));
        arg1.method1539((byte) 107, class646.field8886.method842(-107));
        arg1.method1539((byte) 125, class419.field6065.method842(-118));
        arg1.method1539((byte) 90, class584.method3342(31));
        arg1.method1539((byte) 120, class515.method3012(0));
        arg1.method1539((byte) 87, class499.field6973.method842(-94));
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 52)
    public static final String method1677(String arg0, boolean arg1) {
        if (arg1) {
            method1676(22, null);
        }
        field3535++;
        String var2 = class218.method1556((byte) 115, class521.method3029(-1994, arg0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 73)
    public static void method1678(int arg0) {
        if (arg0 >= -71) {
            method1676(-50, null);
        }
        field3536 = null;
    }
}
