import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class123 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lof;")
    private class328 field1667 = new class328(16);

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lmn;")
    private class162 field1672;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lcg;")
    public static class10 field1668 = new class10(14, 0, 4, 1);

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field1670 = 52;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "[[[I")
    public static int[][][] field1676 = new int[2][][];

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public final void method771(byte arg0) {
        field1669++;
        class328 var2 = this.field1667;
        synchronized (this.field1667) {
            this.field1667.method2187(arg0 + 100);
        }
        if (arg0 != -101) {
            method774(-16, 27);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lfj;")
    public final class58 method772(int arg0, byte arg1) {
        field1671++;
        if (arg1 < 70) {
            this.field1667 = null;
        }
        class328 var3 = this.field1667;
        class58 var4;
        synchronized (this.field1667) {
            var4 = (class58) this.field1667.method2191((byte) -73, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field1672;
        byte[] var6;
        synchronized (this.field1672) {
            var6 = this.field1672.method1004(30, false, arg0);
        }
        class58 var7 = new class58();
        if (var6 != null) {
            var7.method442(true, new class208(var6));
        }
        class328 var8 = this.field1667;
        synchronized (this.field1667) {
            this.field1667.method2188(-128, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public final void method773(byte arg0) {
        class328 var2 = this.field1667;
        synchronized (this.field1667) {
            this.field1667.method2189(false);
        }
        if (arg0 > -98) {
            this.method771((byte) 122);
        }
        field1673++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
    public static final int method774(int arg0, int arg1) {
        int var8 = arg1 - 1;
        field1675++;
        int var2 = -59 / ((-arg0 - 17) / 51);
        int var3 = var8 | var8 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
    public final void method775(boolean arg0, int arg1) {
        field1674++;
        class328 var3 = this.field1667;
        synchronized (this.field1667) {
            if (!arg0) {
                this.field1667.method2202(0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class123(class236 arg0, int arg1, class162 arg2) {
        this.field1672 = arg2;
        this.field1672.method1008(30, (byte) -21);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static void method776(byte arg0) {
        if (arg0 != 36) {
            method774(-36, -61);
        }
        field1676 = null;
        field1668 = null;
    }
}
