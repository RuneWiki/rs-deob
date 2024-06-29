import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class69 extends class435 {

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field1124 = 10;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field1131 = -1;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1127 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Lnf;")
    public class256 field1125;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "[Ltc;")
    public class290[] field1128;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field1123;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static void method515(boolean arg0) {
        field1127 = null;
        field1123 = null;
        if (!arg0) {
            method515(true);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILja;)Z")
    public final boolean method516(int arg0, int arg1, int arg2, class90 arg3) {
        if (arg2 <= 40) {
            this.method516(46, 125, -32, (class90) null);
        }
        field1130++;
        if (this.field1128 != null) {
            for (int var5 = 0; var5 < this.field1128.length; var5++) {
                if (this.field1128[var5].method2036(arg0, arg1) && this.field1125.method132(arg1, arg3, 28033, arg0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
