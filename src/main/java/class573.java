import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class573 extends class173 {

    @OriginalMember(owner = "client!og", name = "s", descriptor = "Lnja;")
    public class781 field7253;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[I")
    public static int[] field7254 = new int[4];

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "Lpu;")
    public static class772 field7256;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static final void method3087(int arg0) {
        if (arg0 <= 114) {
            field7256 = null;
        }
        field7255++;
        if (class601.field7648 != null) {
            class601.field7648.method1330(255);
        }
        if (class181.field2469 == null) {
            return;
        }
        while (true) {
            try {
                class181.field2469.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static void method3088(int arg0) {
        field7254 = null;
        if (arg0 != 4) {
            method3088(-12);
        }
        field7256 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Z")
    public static final boolean method3089(int arg0, byte arg1) {
        if (arg1 >= -51) {
            method3088(47);
        }
        field7252++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lnja;)V")
    public class573(class781 arg0) {
        this.field7253 = arg0;
    }
}
