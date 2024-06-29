import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class402 {

    @OriginalMember(owner = "client!so", name = "e", descriptor = "[I")
    private int[] field5504;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "[J")
    public static long[] field5503 = new long[32];

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Z")
    public static final boolean method2365(int arg0, int arg1) {
        field5505++;
        for (class583 var2 = (class583) class174.field2677.method124((byte) 42); var2 != null; var2 = (class583) class174.field2677.method120(arg1 ^ 0xFFFFFFCF)) {
            if (class555.method3354(127, var2.field8566) && (long) arg0 == var2.field8564) {
                return true;
            }
        }
        if (arg1 == -1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)I")
    public final int method2366(int arg0, byte arg1) {
        field5506++;
        int var3 = (this.field5504.length >> 1) - 1;
        if (arg1 >= -84) {
            return 40;
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field5504[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5504[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Llu;B)V")
    public static final void method2367(class610 arg0, byte arg1) {
        if (arg1 <= 65) {
            field5503 = null;
        }
        field5502++;
        class112.field1589.method3413(true, arg0.method3585(true));
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method2368(int arg0) {
        field5503 = null;
        if (arg0 != 1) {
            method2368(66);
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "([I)V")
    public class402(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field5504 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5504[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field5504[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field5504[var5 + var5] = arg0[var4];
            this.field5504[var5 - (-var5 - 1)] = var4++;
        }
    }
}
