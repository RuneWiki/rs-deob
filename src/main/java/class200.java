import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class200 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field2918 = 0;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[S")
    public static short[] field2916 = new short[] { 21, 12, 23, 50, 45, 59, 3, 13 };

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lsv;")
    public static class467 field2914 = new class467(14, 0, 4, 1);

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2920 = null;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lce;")
    public class201 field2913;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lhh;")
    public static class84 field2917;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V", line = 5)
    public static final void method1363(int arg0, String arg1, byte arg2, String arg3) {
        class87.field1472 = arg1;
        class337.field5148 = arg0;
        class371.field5564 = arg3;
        field2915++;
        if (class371.field5564.equals("") || class87.field1472.equals("")) {
            class72.field1206 = 3;
        } else if (class255.field3681 == -1) {
            class405.field5964 = 1;
            if (arg2 != -71) {
                method1365(3);
            }
            class286.field4137 = 0;
            class72.field1206 = -3;
            class343.field5239 = 0;
            class303 var4 = new class303(128);
            var4.method1923((byte) 62, 10);
            var4.method1892(397825512, (int) (Math.random() * 9.9999999E7D));
            var4.method1872(arg2 + 70, class358.method2309(class371.field5564, (byte) -83));
            var4.method1892(arg2 ^ 0xE849AA51, (int) (Math.random() * 9.9999999E7D));
            var4.method1882((byte) 99, class87.field1472);
            var4.method1892(arg2 ^ 0xE849AA51, (int) (Math.random() * 9.9999999E7D));
            var4.method1913(class256.field3696, 97, class520.field7635);
            class86.field1436.field4333 = 0;
            class86.field1436.method1923((byte) 62, class224.field3257.field6584);
            class86.field1436.method1923((byte) 62, var4.field4333 + 2);
            class86.field1436.method1874(588, (byte) -110);
            class86.field1436.method1876(0, 4, var4.field4326, var4.field4333);
        } else {
            class289.method1800(arg2 + 72);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V", line = 50)
    public static final void method1364(boolean arg0, int arg1) {
        class109.field1692 = 0;
        class107.field1670 = 0;
        field2919++;
        class14.method127((byte) -92);
        class32.method258(arg0, 12315);
        class477.method2855(110);
        if (arg1 < 25) {
            field2918 = 16;
        }
        for (int var2 = 0; var2 < class107.field1670; var2++) {
            int var4 = class392.field5804[var2];
            if (class180.field2734 != class132.field2030[var4].field313) {
                if (class132.field2030[var4].field210.method1053((byte) -25)) {
                    class62.method554(class132.field2030[var4], (byte) -120);
                }
                class132.field2030[var4].method119(null, 0);
                class132.field2030[var4] = null;
            }
        }
        if (class133.field2060 != class387.field5738.field4333) {
            throw new RuntimeException("gnp1 pos:" + class387.field5738.field4333 + " psize:" + class133.field2060);
        }
        for (int var3 = 0; var3 < class322.field4943; var3++) {
            if (class132.field2030[class101.field1623[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class322.field4943);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 104)
    public static void method1365(int arg0) {
        field2920 = null;
        field2914 = null;
        field2916 = null;
        field2917 = null;
        if (arg0 <= 41) {
            field2920 = null;
        }
    }
}
