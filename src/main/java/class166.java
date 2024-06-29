import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class166 {

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lwg;")
    private class58 field2101 = new class58(128);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lkr;")
    private class329 field2096;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[I")
    public static int[] field2100 = new int[32];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
    public final void method897(int arg0, int arg1) {
        if (arg0 != -31360) {
            method902((byte) -22);
        }
        field2098++;
        class58 var3 = this.field2101;
        synchronized (this.field2101) {
            this.field2101.method320(arg1, -306674912);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([[II)V")
    public static final void method898(int[][] arg0, int arg1) {
        class256.field3173 = arg0;
        if (arg1 != 10596) {
            method902((byte) 53);
        }
        field2099++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method899(int arg0) {
        field2103++;
        class64.field868 = -1;
        int var1 = 37 % ((arg0 + 50) / 41);
        class598.field8638 = 0;
        class281.field3673 = -1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public final void method900(boolean arg0) {
        class58 var2 = this.field2101;
        synchronized (this.field2101) {
            this.field2101.method317((byte) 21);
        }
        field2095++;
        if (!arg0) {
            this.method897(115, -43);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public final void method901(byte arg0) {
        field2102++;
        int var2 = 117 / ((-arg0 - 28) / 62);
        class58 var3 = this.field2101;
        synchronized (this.field2101) {
            this.field2101.method315(1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static void method902(byte arg0) {
        if (arg0 == 70) {
            field2100 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Liv;")
    public final class355 method903(int arg0, int arg1) {
        field2097++;
        class58 var3 = this.field2101;
        class355 var4;
        synchronized (this.field2101) {
            var4 = (class355) this.field2101.method323((long) arg0, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 >= -16) {
            this.field2096 = null;
        }
        class329 var5 = this.field2096;
        byte[] var6;
        synchronized (this.field2096) {
            var6 = this.field2096.method2054(true, 1, arg0);
        }
        class355 var7 = new class355();
        if (var6 != null) {
            var7.method2212(new class551(var6), (byte) 64);
        }
        class58 var8 = this.field2101;
        synchronized (this.field2101) {
            this.field2101.method316((long) arg0, (byte) -113, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class166(class513 arg0, int arg1, class329 arg2) {
        this.field2096 = arg2;
        this.field2096.method2064(0, 1);
    }
}
