import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class534 {

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "[I")
    public static int[] field7777 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V", line = 8)
    public static void method3233(int arg0) {
        if (arg0 <= 45) {
            method3233(8);
        }
        field7777 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lla;II)Lqt;", line = 19)
    public static final class502 method3234(class423 arg0, int arg1, int arg2) {
        if (arg1 > -120) {
            field7777 = null;
        }
        field7778++;
        byte[] var3 = arg0.method2611((byte) -123, arg2);
        return var3 == null ? null : new class502(var3);
    }
}
