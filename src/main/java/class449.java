import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class449 {

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "[I")
    private int[] field6123;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "[Lvv;")
    public static class212[] field6120 = new class212[2048];

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "[I")
    public static int[] field6124 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "Lpc;")
    public static class473 field6118;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[BLbo;IIIIZ)Lgk;", line = 3)
    public static final class330 method2571(int arg0, byte[] arg1, class511 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field6122++;
        if (arg5 != -2182) {
            field6124 = null;
        }
        if (!arg2.field7505 && (!class227.method1418((byte) -115, arg3) || !class227.method1418((byte) 94, arg6))) {
            return arg2.field7460 ? new class330(arg2, 34037, arg0, arg3, arg6, arg7, arg1, arg4) : new class330(arg2, arg0, arg3, arg6, class321.method1857((byte) 113, arg3), class321.method1857((byte) 113, arg6), arg1, arg4);
        } else {
            return new class330(arg2, 3553, arg0, arg3, arg6, arg7, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 27)
    public static void method2572(byte arg0) {
        field6120 = null;
        if (arg0 != 103) {
            method2572((byte) -104);
        }
        field6118 = null;
        field6124 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 40)
    public static final void method2573(int arg0) {
        field6119++;
        for (class437 var1 = (class437) class234.field3148.method1767((byte) -17); var1 != null; var1 = (class437) class234.field3148.method1767((byte) -17)) {
            class224.method1406(20, var1);
        }
        int var2;
        int var3;
        if (class154.field2244.method1855((byte) 108, class166.field2414)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class455.field6229;
            var3 = class455.field6229;
        }
        client.method1254();
        if (arg0 != 0) {
            return;
        }
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1261();
            client.method1268(var4);
            client.method1270(var4);
        }
        client.method1256();
        client.method1273();
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I", line = 89)
    public final int method2574(int arg0, int arg1) {
        field6121++;
        int var3 = (this.field6123.length >> 1) - arg0;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field6123[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field6123[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "([I)V", line = 112)
    public class449(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field6123 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field6123[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field6123[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field6123[var5 + var5] = arg0[var4];
            this.field6123[var5 + var5 + 1] = var4++;
        }
    }
}
