import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class381 {

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public int field5453 = 0;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public int field5463 = 0;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "Laf;")
    private class39 field5452 = new class39(64);

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "Ltd;")
    private class549 field5465 = null;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "Lae;")
    private class283 field5461;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "Lae;")
    private class283 field5459;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field5457 = 0;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field5454 = 0;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "D")
    public static double field5455 = -1.0D;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "[Lcv;")
    public static class26[] field5458;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "[Lvs;")
    public static class532[] field5451;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)Lpk;")
    public final class647 method2375(byte arg0, int arg1) {
        field5456++;
        class647 var3 = (class647) this.field5452.method312(0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field5461.method1849(arg1, (byte) 93, 1);
        } else {
            var4 = this.field5459.method1849(arg1 & 0x7FFF, (byte) -91, 1);
        }
        class647 var5 = new class647();
        var5.field9042 = this;
        if (var4 != null) {
            var5.method3710((byte) 56, new class511(var4));
        }
        if (arg1 >= 32768) {
            var5.method3707((byte) 99);
        }
        this.field5452.method305(var5, (long) arg1, 18320);
        return arg0 > -70 ? null : var5;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static void method2376(byte arg0) {
        if (arg0 >= 119) {
            field5451 = null;
            field5458 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([IJLo;Z)Ljava/lang/String;")
    public final String method2377(int[] arg0, long arg1, class208 arg2, boolean arg3) {
        if (!arg3) {
            return null;
        }
        field5464++;
        if (this.field5465 != null) {
            String var6 = this.field5465.method3246((byte) -115, arg0, arg1, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "()V")
    public static final void method2378() {
        for (int var0 = 0; var0 < class449.field6282.length; var0++) {
            class449.field6282[var0].method2630();
        }
        class449.field6282 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZII)I")
    public static final int method2379(int arg0, boolean arg1, int arg2, int arg3) {
        field5462++;
        if (arg3 != 1) {
            method2379(92, true, 118, 92);
        }
        class717 var4 = class159.method1020(arg1, false, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && var4.field9935.length > arg0) {
            return var4.field9935[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(ILae;Lae;Ltd;)V")
    public class381(int arg0, class283 arg1, class283 arg2, class549 arg3) {
        this.field5461 = arg1;
        this.field5465 = arg3;
        this.field5459 = arg2;
        if (this.field5461 != null) {
            this.field5463 = this.field5461.method1867(1, (byte) 49);
        }
        if (this.field5459 != null) {
            this.field5453 = this.field5459.method1867(1, (byte) 49);
        }
    }
}
