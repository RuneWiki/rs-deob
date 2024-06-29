import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class316 extends class332 {

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4870 = "glow2:";

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4865 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "Z")
    public static boolean field4872 = false;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4875 = "Loading fonts - ";

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field4874 = -1;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4871 = Calendar.getInstance();

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public int field4866;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "Llc;")
    public static class175 field4873;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Llc;")
    public static class175 field4877;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 9)
    public static final long method2205(String arg0, byte arg1) {
        int var2 = arg0.length();
        field4864++;
        if (arg1 > -113) {
            field4873 = (class175) null;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) - (var3 - (long) arg0.charAt(var5));
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(JB)V", line = 35)
    public static final void method2206(long arg0, byte arg1) {
        if (arg1 <= 109) {
            return;
        }
        field4867++;
        if (arg0 != 0L) {
            class335.field5168++;
            class140.field1954.method573(117, 184);
            class140.field1954.method678(arg0, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 52)
    public static void method2207(int arg0) {
        if (arg0 != 184) {
            field4865 = (Calendar) null;
        }
        field4873 = null;
        field4871 = null;
        field4875 = null;
        field4865 = null;
        field4877 = null;
        field4870 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V", line = 67)
    public static final void method2208(int arg0, int arg1) {
        field4868++;
        class184.field2663 = arg0;
        if (arg1 != -1027) {
            method2206(7L, (byte) 60);
        }
        class30.field383 = -1;
        class30.field383 = -1;
        class106.method617(-8915);
    }
}
