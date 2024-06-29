import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class549 extends class462 {

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "Lmw;")
    public static class517 field7579 = new class517(65, 7);

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "[B")
    private byte[] field7580;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIB)V")
    public final void method2621(boolean arg0, int arg1, byte arg2) {
        if (arg0) {
            return;
        }
        field7581++;
        byte var4 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field7580[var10001] = var4;
        this.field7580[var6] = var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILcm;)V")
    public static final void method3155(int arg0, class758 arg1) {
        int var2 = -27 % ((24 - arg0) / 33);
        field7576++;
        class119 var3 = (class119) class310.field4390.method1248(119, (long) arg1.field6146);
        if (var3 == null) {
            class603.method3373(0, arg1.field2813, null, 19515, arg1.field6198[0], null, arg1.field6197[0], arg1);
        } else {
            var3.method855(false);
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    public static void method3156(int arg0) {
        field7579 = null;
        if (arg0 != -11690) {
            field7579 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)I")
    public static final int method3157(int arg0, int arg1) {
        field7578++;
        if (arg0 != 12) {
            field7579 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3158(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 34037) {
            field7577++;
            this.field7580 = new byte[arg0 * arg2 * arg3 * 2];
            this.method69(arg2, arg3, true, arg0);
            return this.field7580;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class549() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
