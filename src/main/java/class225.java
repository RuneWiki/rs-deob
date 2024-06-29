import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class225 extends class43 {

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public int field3358 = -1;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "Lpp;")
    public static class464 field3363 = new class464(27, 11);

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "Ljava/lang/String;")
    public String field3362;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "Ljava/lang/String;")
    public String field3366;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "[Lha;")
    public static class116[] field3360;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)Lmd;", line = 4)
    public final class266 method1497(int arg0) {
        if (arg0 != 0) {
            this.method1497(-43);
        }
        ++field3368;
        return class531.field7397[super.field593];
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V", line = 19)
    public static void method1498(byte arg0) {
        if (arg0 != -66) {
            field3360 = null;
        }
        field3363 = null;
        field3360 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 40)
    public static final long method1499(String arg0, int arg1) {
        ++field3365;
        int var2 = arg0.length();
        long var3 = (long) arg1;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            var3 = (var3 << 5) - (var3 - (long) arg0.charAt(var5));
        }
        return var3;
    }
}
