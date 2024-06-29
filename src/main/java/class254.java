import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class254 {

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Lhn;")
    private class509 field3382 = new class509(256);

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Lfo;")
    private class361 field3377;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field3378 = -2;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Lbg;")
    public static class326 field3381;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "[I")
    public static int[] field3383;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
    public final void method1570(int arg0, int arg1) {
        class509 var3 = this.field3382;
        synchronized (this.field3382) {
            this.field3382.method3036(arg0, (byte) -103);
            if (arg1 != 26) {
                field3381 = null;
            }
        }
        field3379++;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lgr;")
    public final class300 method1571(int arg0, int arg1) {
        field3385++;
        class509 var3 = this.field3382;
        class300 var4;
        synchronized (this.field3382) {
            var4 = (class300) this.field3382.method3032(3589, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field3377;
        byte[] var6;
        synchronized (this.field3377) {
            var6 = this.field3377.method2130(26, arg0, -86);
        }
        class300 var7 = new class300();
        if (var6 != null) {
            var7.method1793(new class396(var6), (byte) -23);
        }
        class509 var8 = this.field3382;
        synchronized (this.field3382) {
            this.field3382.method3046((long) arg0, var7, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
    public final void method1572(boolean arg0) {
        field3376++;
        if (!arg0) {
            this.field3377 = null;
        }
        class509 var2 = this.field3382;
        synchronized (this.field3382) {
            this.field3382.method3034((byte) 125);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public final void method1573(int arg0) {
        field3384++;
        class509 var2 = this.field3382;
        synchronized (this.field3382) {
            this.field3382.method3045(arg0 ^ 0x2A);
        }
        if (arg0 != 26) {
            field3378 = 112;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V")
    public static final void method1574(byte arg0, int arg1) {
        int var2 = 43 % ((arg0 - 84) / 34);
        field3375++;
        class509 var3 = class528.field7748;
        synchronized (class528.field7748) {
            class528.field7748.method3036(arg1, (byte) -109);
        }
        class509 var4 = class415.field5946;
        synchronized (class415.field5946) {
            class415.field5946.method3036(arg1, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static void method1575(int arg0) {
        field3381 = null;
        field3383 = null;
        if (arg0 <= 32) {
            field3383 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Ld;ILfo;)V")
    public class254(class104 arg0, int arg1, class361 arg2) {
        this.field3377 = arg2;
        this.field3377.method2136(-92, 26);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lmh;III)J")
    public static final long method1576(class448 arg0, int arg1, int arg2, int arg3) {
        field3380++;
        long var4 = 4194304L;
        int var6 = 48 / ((arg2 + 50) / 32);
        long var7 = 2147483648L;
        long var9 = Long.MIN_VALUE;
        class70 var11 = class123.field1593.method2920(arg0.method46(111), 19219);
        long var12 = (long) (arg0.method48((byte) -70) << 14 | arg1 | arg3 << 7 | arg0.method47(-15774) << 20 | 0x40000000);
        if (var11.field886 == 0) {
            var12 |= var9;
        }
        if (var11.field836 == 1) {
            var12 |= var4;
        }
        if (var11.field831) {
            var12 |= var7;
        }
        return var12 | (long) arg0.method46(-120) << 32;
    }
}
