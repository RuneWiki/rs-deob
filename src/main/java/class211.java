import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class211 extends class349 {

    @OriginalMember(owner = "client!st", name = "B", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!st", name = "C", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!st", name = "D", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!st", name = "F", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!st", name = "G", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!st", name = "I", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!st", name = "J", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!st", name = "E", descriptor = "Lxa;")
    public static class424 field2758;

    @OriginalMember(owner = "client!st", name = "H", descriptor = "Ljava/lang/Object;")
    public static Object field2761;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "(I)V")
    public static void method1319(int arg0) {
        field2761 = null;
        field2758 = null;
        if (arg0 < 107) {
            method1321(31L, -113, -127, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(I)V")
    public class211(int arg0) {
        super(0, true);
        this.field2755 = 4096;
        this.field2755 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            field2761 = null;
        }
        if (~arg1 == -1) {
            this.field2755 = (arg2.method957((byte) -79) << 12) / 255;
        }
        ++field2757;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        int var3 = 103 / ((56 - arg0) / 41);
        ++field2762;
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            class657.method3634(var4, 0, class39.field497, this.field2755);
        }
        return var4;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
    public static final void method1320(boolean arg0, int arg1) {
        ++field2760;
        if (arg1 == -6366) {
            class86.field1059.method41(arg0 || class9.field103 != null && class9.field103.method1899(), 7571);
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
    public class211() {
        this(4096);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(JIIB)V")
    public static final void method1321(long arg0, int arg1, int arg2, byte arg3) {
        ++field2759;
        int var5 = -87 / ((arg3 - -20) / 38);
        int var6 = ((int) arg0 & 520280) >> 14;
        int var7 = (4042196 & (int) arg0) >> 20;
        int var8 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (~var6 != -11 && var6 != 11 && ~var6 != -23) {
            class449.method2566(-100, var7, 0, var6, arg2, 0, 0, arg1, true);
        } else {
            class252 var9 = class578.field7980.method1746(var8, (byte) 111);
            int var10;
            int var11;
            if (var7 != 0 && var7 != 2) {
                var10 = var9.field3450;
                var11 = var9.field3431;
            } else {
                var11 = var9.field3450;
                var10 = var9.field3431;
            }
            int var12 = var9.field3485;
            if (~var7 != -1) {
                var12 = (var12 >> -var7 + 4) + (var12 << var7 & 15);
            }
            class449.method2566(-33, 0, var11, 0, arg2, var12, var10, arg1, true);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)V")
    public static final void method1322(int arg0, int arg1) {
        int var2 = 97 % (-arg1 / 37);
        for (class28 var3 = class363.field5237.method2499(-81); var3 != null; var3 = class363.field5237.method2503(0)) {
            if ((var3.field272 >> 48 & 65535L) == (long) arg0) {
                var3.method175(30604);
            }
        }
        ++field2756;
    }
}
