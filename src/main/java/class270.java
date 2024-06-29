import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class270 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Z")
    public static boolean field4191 = false;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[I")
    public static int[] field4195 = new int[200];

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4194 = 0;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field4192 = 0;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4198 = "K";

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Lcl;")
    public static class114 field4199;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lgn;")
    public static class321 field4197;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1911(boolean arg0) {
        field4197 = null;
        field4199 = null;
        field4198 = null;
        if (arg0) {
            field4195 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 41)
    public static final void method1912(byte arg0) {
        field4196++;
        int var1 = -113 % ((49 - arg0) / 36);
        class326.method2291(false, 110);
        System.gc();
        class68.method538(-128, 25);
    }
}
