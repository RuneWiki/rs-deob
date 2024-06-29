import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class19 {

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Ltb;")
    private class450 field281 = new class450(64);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lpl;")
    private class612 field280;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field287 = 0;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Ltb;")
    public static class450 field290 = new class450(5);

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "[I")
    public static int[] field291 = new int[4096];

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V", line = 4)
    public final void method120(int arg0, int arg1) {
        field286++;
        class450 var3 = this.field281;
        synchronized (this.field281) {
            if (arg0 == 0) {
                this.field281.method2411(true, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 23)
    public final void method121(int arg0) {
        if (arg0 != -23401) {
            this.method123((byte) -12);
        }
        field284++;
        class450 var2 = this.field281;
        synchronized (this.field281) {
            this.field281.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 37)
    public static final void method122(int arg0) {
        int var1 = 18 / ((arg0 - 82) / 34);
        field285++;
        class199.field2530 = true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 47)
    public final void method123(byte arg0) {
        class450 var2 = this.field281;
        synchronized (this.field281) {
            this.field281.method2412((byte) 4);
            if (arg0 <= 32) {
                field291 = null;
            }
        }
        field282++;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 67)
    public static void method124(int arg0) {
        if (arg0 == 16) {
            field291 = null;
            field290 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 84)
    public class19(class112 arg0, int arg1, class612 arg2) {
        this.field280 = arg2;
        if (this.field280 == null) {
            this.field289 = 0;
        } else {
            this.field289 = this.field280.method3349(16, true);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Lhga;", line = 101)
    public final class239 method125(int arg0, boolean arg1) {
        field288++;
        class450 var3 = this.field281;
        class239 var4;
        synchronized (this.field281) {
            var4 = (class239) this.field281.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg1) {
            field290 = null;
        }
        class612 var5 = this.field280;
        byte[] var6;
        synchronized (this.field280) {
            var6 = this.field280.method3365(arg0, -123, 16);
        }
        class239 var7 = new class239();
        if (var6 != null) {
            var7.method1432(new class630(var6), -1);
        }
        class450 var8 = this.field281;
        synchronized (this.field281) {
            this.field281.method2409((long) arg0, var7, 1);
            return var7;
        }
    }
}
