import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class368 extends class173 {

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
    public static int field4503 = 0;

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4508 = Calendar.getInstance();

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4499 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "I")
    public int field4501;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "Lwu;")
    public class582 field4511;

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "Ljava/lang/String;")
    public String field4506;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "[I")
    public int[] field4498;

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "[I")
    public int[] field4512;

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "[J")
    public long[] field4502;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "[Lrda;")
    public class467[] field4507;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field4509;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
    public static void method2115(boolean arg0) {
        field4499 = null;
        field4508 = null;
        if (arg0) {
            method2116(-38, -95, -86, -79, -10, 22, -67, 11, 48, -36, 27, 65);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIIIIIII)V")
    public static final void method2116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4500++;
        if (!class683.method3667(arg11, -102)) {
            return;
        }
        if (class598.field7612[arg11] == null) {
            client.method2641(class647.field8259[arg11], -1, arg1, arg3, arg2, arg7, arg6, arg8, arg5, arg0, arg10, arg4);
        } else {
            client.method2641(class598.field7612[arg11], -1, arg1, arg3, arg2, arg7, arg6, arg8, arg5, arg0, arg10, arg4);
        }
        int var12 = 26 % ((arg9 + 66) / 47);
    }
}
