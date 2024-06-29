import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class594 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public int field8560;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lju;")
    public static class102 field8556 = new class102(68, 6);

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lcba;")
    public static class53 field8561 = new class53(2);

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Z")
    public static boolean field8566 = false;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Z")
    public static boolean field8565 = false;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8564 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Ld;")
    public static class268 field8567;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[I")
    public static int[] field8568;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[[B")
    public static byte[][] field8557;

    @OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8558++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method3521(String arg0, boolean arg1) {
        class441.method2638("", 0, (byte) 17, "", arg0, "", 0);
        field8562++;
        if (!arg1) {
            method3523(false, (byte) 15, false);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method3522(byte arg0) {
        if (arg0 != -95) {
            method3523(false, (byte) 91, true);
        }
        field8567 = null;
        field8556 = null;
        field8561 = null;
        field8564 = null;
        field8568 = null;
        field8557 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZBZ)V")
    public static final void method3523(boolean arg0, byte arg1, boolean arg2) {
        if (arg0) {
            class282.field3749++;
            class97.method658(1717352424);
        }
        int var3 = 69 / ((arg1 + 63) / 62);
        field8559++;
        if (arg2) {
            class480.field6522++;
            class467.method2785(6);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
    public final int method3524(int arg0) {
        field8563++;
        if (arg0 > -6) {
            field8566 = false;
        }
        return this.field8560;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class594(String arg0, int arg1) {
        this.field8560 = arg1;
    }
}
