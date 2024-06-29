import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class432 extends class399 {

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "Lhga;")
    public static class158 field6569 = new class158(92, 12);

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "[I")
    public static int[] field6573 = new int[3];

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "Lnaa;")
    public static class64 field6571 = new class64();

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "[B")
    private byte[] field6577;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIII)[B")
    public final byte[] method2743(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -79) {
            method2745(null, false);
        }
        field6578++;
        this.field6577 = new byte[arg1 * arg2 * 2 * arg0];
        this.method1998(arg2, 4095, arg0, arg1);
        return this.field6577;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Lrda;")
    public static final class614 method2744(int arg0, int arg1) {
        field6572++;
        class614 var2 = new class614(arg0, false);
        if (arg1 != 8) {
            field6569 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "([BZ)Ljava/lang/String;")
    public static final String method2745(byte[] arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field6574++;
            return class606.method3529((byte) 57, arg0.length, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZBI)V")
    public final void method1273(boolean arg0, byte arg1, int arg2) {
        field6570++;
        int var4 = arg2 * 2;
        int var5 = arg1 & 0xFF;
        if (!arg0) {
            method2747(111, 62, 10, 2);
        }
        this.field6577[var4++] = (byte) (var5 * 3 >> 5);
        this.field6577[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)V")
    public static final void method2746(int arg0, int arg1) {
        field6576++;
        class413 var2 = class674.method3852(12, arg1, 126);
        var2.method2634(1065768928);
        if (arg0 != 8) {
            method2745(null, true);
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
    public class432() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(IIII)V")
    public static final void method2747(int arg0, int arg1, int arg2, int arg3) {
        field6575++;
        if (arg3 < 1) {
            field6571 = null;
        }
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class553.method3319(true, var4, false, (byte) 86);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
    public static void method2748(int arg0) {
        int var1 = -111 / ((-arg0 - 78) / 41);
        field6569 = null;
        field6573 = null;
        field6571 = null;
    }
}
