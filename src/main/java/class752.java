import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class752 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Lve;")
    public static class527 field10422 = new class527(9, 2);

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field10428 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field10423;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field10426;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "Z")
    public static boolean field10425;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 4)
    public static void method4175(byte arg0) {
        field10428 = null;
        int var1 = -41 / ((63 - arg0) / 45);
        field10422 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method4176(boolean arg0) {
        class6.field65 = class340.method2185(8, 4, arg0, 35, 8, 2048, 87, 0.4F);
        field10423++;
    }
}
