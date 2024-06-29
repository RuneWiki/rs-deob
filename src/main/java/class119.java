import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class119 extends IOException {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1570 = 0;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1572 = 0;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1573 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILni;)I")
    public static final int method746(int arg0, class515 arg1) {
        field1571++;
        if (arg1.field7136 == 0) {
            return 0;
        }
        if (arg1.field7122 != -1) {
            class515 var2 = null;
            if (arg1.field7122 < 32768) {
                class234 var3 = (class234) class372.field5245.method812(117, (long) arg1.field7122);
                if (var3 != null) {
                    var2 = var3.field3471;
                }
            } else if (arg1.field7122 >= 32768) {
                var2 = class251.field3675[arg1.field7122 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field4410 - var2.field4410;
                int var5 = arg1.field4418 - var2.field4418;
                if (var4 != 0 || var5 != 0) {
                    arg1.method3086((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, -109);
                }
            }
        }
        if (arg0 != -19527) {
            return -71;
        }
        if ((arg1 instanceof class96)) {
            class96 var9 = (class96) arg1;
            if (var9.field1326 != -1 && (var9.field7203 == 0 || var9.field7201 > 0)) {
                var9.method3086(var9.field1326, -92);
                var9.field1326 = -1;
            }
        } else if (arg1 instanceof class679) {
            class679 var6 = (class679) arg1;
            if (var6.field9448 != -1 && (var6.field7203 == 0 || var6.field7201 > 0)) {
                int var7 = var6.field4410 - ((var6.field9448 - class113.field1509 - class113.field1509) * 256);
                int var8 = var6.field4418 - ((var6.field9441 - class587.field7995 - class587.field7995) * 256);
                if (var7 != 0 || var8 != 0) {
                    var6.method3086((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, 84);
                }
                var6.field9448 = -1;
            }
        }
        return arg1.method3071((byte) -8);
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class119(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method747(byte arg0) {
        field1573 = null;
        int var1 = -127 % ((arg0 + 33) / 49);
    }
}
