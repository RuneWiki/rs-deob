import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class274 {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    public static int[] field4338 = new int[2];

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field4339 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4334 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field4342 = 128;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
    public static boolean field4341 = false;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4340 = "purple:";

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field4343 = 0;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4344 = "cyan:";

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lhl;")
    public static class74 field4336;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BI)[B", line = 5)
    public static final byte[] method1972(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        field4335++;
        byte[] var3 = new byte[var2];
        class8.method50(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 27)
    public static final void method1973(int arg0, int arg1, int arg2, int arg3) {
        class279 var4 = class147.method1085(arg3, -19443, 11);
        var4.method1989(0);
        int var5 = -105 / ((arg0 - 30) / 42);
        var4.field4388 = arg1;
        field4337++;
        var4.field4394 = arg2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V", line = 68)
    public static void method1974(boolean arg0) {
        if (arg0) {
            method1974(false);
        }
        field4338 = null;
        field4340 = null;
        field4334 = null;
        field4336 = null;
        field4344 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)I")
    public abstract int method248(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public abstract void method246(byte arg0);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)J")
    public abstract long method249(int arg0);
}
