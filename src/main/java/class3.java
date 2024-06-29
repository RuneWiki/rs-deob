import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 implements class49 {

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "D")
    public static double field31 = -1.0D;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "([IIJI)Ljava/lang/String;")
    public final String method17(int[] arg0, int arg1, long arg2, int arg3) {
        field33++;
        if (arg3 == 0) {
            class271 var6 = class232.field3513.method2143(arg0[0], -11);
            return var6.method1665((int) arg2, (byte) 24);
        }
        if (arg1 != -22976) {
            this.method17((int[]) null, 51, 17L, 34);
        }
        if (arg3 == 1 || arg3 == 10) {
            class41 var7 = class64.field834.method2129((int) arg2, false);
            return var7.field538;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class232.field3513.method2143(arg0[0], -11).method1665((int) arg2, (byte) 24);
        } else {
            return null;
        }
    }
}
