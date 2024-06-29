import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class373 extends class573 {

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "J")
    public static long field5377 = 20000000L;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Ljj;")
    public static class398 field5379 = new class398(54, -1);

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Z")
    public static boolean field5382 = false;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lcb;")
    public static class318 field5383 = new class318(64, -1);

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILoa;)V", line = 4)
    public static final void method2278(int arg0, class689 arg1) {
        if (arg0 != 2048) {
            method2280(90, 30, 67);
        }
        if (class483.field6542) {
            class46.method279(arg1, -98);
        } else {
            class384.method2320(-120, arg1);
        }
        field5378++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 25)
    public static void method2279(int arg0) {
        field5379 = null;
        field5383 = null;
        int var1 = -52 % ((-arg0 - 64) / 45);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Z", line = 46)
    public static final boolean method2280(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2280(-34, 8, -119);
        }
        field5381++;
        return (arg2 & 0x800) != 0 | class326.method2090(arg2, arg1 + 1, arg0) || class395.method2346(arg0, 34165, arg2);
    }
}
