import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class214 {

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3146 = "Loading - please wait.";

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3145 = new String[1000];

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
    public static boolean field3152 = false;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "J")
    public long field3151;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lff;")
    public class4 field3150;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method1496(int arg0) {
        int var1 = -50 / ((arg0 + 28) / 39);
        field3146 = null;
        field3145 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static final void method1497(int arg0) {
        if (arg0 >= 57) {
            field3153++;
        }
    }
}
