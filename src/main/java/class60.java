import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class60 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[J")
    public static long[] field670 = new long[100];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field672 = 0;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method494(int arg0) {
        field670 = null;
        if (arg0 != 10) {
            method496(67, 96);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method495(int arg0, int arg1, int arg2, Class arg3) {
        class390 var4 = class295.field4051[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class467 var5 = var4.field5536; var5 != null; var5 = var5.field6421) {
            class210 var6 = var5.field6419;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2972 == arg1 && var6.field2963 == arg2) {
                class122.method876(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
    public static final boolean method496(int arg0, int arg1) {
        if (arg1 != 23766) {
            field672 = -18;
        }
        field671++;
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method497(String arg0, String arg1, String arg2, byte arg3) {
        if (arg3 != -29) {
            return null;
        }
        field669++;
        for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, arg2.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(var4 + arg0.length());
        }
        return arg1;
    }
}
