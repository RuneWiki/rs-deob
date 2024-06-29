import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class644 extends class574 {

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Ldh;")
    public static class320 field9212 = new class320(28, 10);

    @OriginalMember(owner = "client!it", name = "n", descriptor = "Ldh;")
    public static class320 field9213 = new class320(5, -2);

    @OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
    public static boolean field9214 = false;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "(I)V")
    public static void method3667(int arg0) {
        field9213 = null;
        field9212 = null;
        if (arg0 != -2) {
            method3667(-86);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZB)V")
    public static final void method3668(boolean arg0, byte arg1) {
        field9211++;
        if (class417.field5723.length() == 0) {
            return;
        }
        class599.method3408("--> " + class417.field5723, (byte) -36);
        class132.method827(false, arg0, (byte) -111, class417.field5723);
        int var2 = -109 / ((-arg1 - 43) / 59);
        class417.field5723 = "";
        class544.field7822 = 0;
        class607.field8623 = 0;
    }
}
