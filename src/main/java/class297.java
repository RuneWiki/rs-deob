import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class297 extends class573 {

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "Ldg;")
    public class19 field4229;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Lmaa;")
    public static class508 field4228 = new class508(3, 7);

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field4231 = 0;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field4230 = 0;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "Z")
    public static boolean field4234 = false;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "Luu;")
    public static class237 field4233;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4232;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)[Ljn;")
    public static final class324[] method1950(int arg0) {
        field4227++;
        if (arg0 != 3) {
            method1950(87);
        }
        return new class324[] { class470.field6529, class420.field5913, class464.field6464, class266.field3898, class234.field3472, class364.field5185, class261.field3812, class497.field6960, class376.field5289, class152.field2088, class688.field9578, class537.field7440, class122.field1609, class471.field6532 };
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
    public static void method1951(boolean arg0) {
        field4228 = null;
        if (!arg0) {
            field4232 = null;
            field4233 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lrl;II[B)V")
    public class297(class232 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4229 = arg0.method1416(class401.field5747, arg1, false, true, arg3, arg2);
        this.field4229.method100(false, false, 69);
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lrl;II[I)V")
    public class297(class232 arg0, int arg1, int arg2, int[] arg3) {
        this.field4229 = arg0.method1520(arg3, arg2, false, arg1, (byte) -105);
        this.field4229.method100(false, false, 124);
    }
}
