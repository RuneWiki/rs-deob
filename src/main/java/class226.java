import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class226 extends class69 {

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "Z")
    public boolean field3426 = false;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public int field3433 = -1;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "Ljn;")
    public static class134 field3427 = new class134(114, -1);

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "Laf;")
    public static class39 field3432 = new class39(50);

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "D")
    public static double field3435;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "[Loq;")
    public static class230[] field3436;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILha;IIIIIIILlaa;)V", line = 8)
    public static final void method1520(int arg0, int arg1, int arg2, class473 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class498 arg11) {
        if (arg2 < arg5 && arg5 < arg2 + arg7 && (arg4 - 13) < arg0 && arg0 < (arg4 + 3)) {
            arg8 = arg6;
        }
        field3428++;
        String var12 = class631.method3622(arg11, -3104);
        class386.field5515.method2639(class313.field4505, 0, arg2 + 3, arg4, arg8, class492.field6782, var12, (byte) 90);
        if (arg10 != 20279) {
            field3436 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(I)V", line = 81)
    public class226(int arg0) {
        this.field3433 = arg0;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[BII)I", line = 39)
    public static final int method1521(int arg0, byte[] arg1, int arg2, int arg3) {
        field3429++;
        int var4 = -1;
        int var5 = arg2;
        if (arg3 >= -86) {
            method1521(126, null, 14, 80);
        }
        while (arg0 > var5) {
            var4 = var4 >>> 8 ^ class224.field3415[(var4 ^ arg1[var5]) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V", line = 65)
    public static void method1522(byte arg0) {
        field3436 = null;
        field3427 = null;
        if (arg0 != 26) {
            field3436 = null;
        }
        field3432 = null;
    }
}
