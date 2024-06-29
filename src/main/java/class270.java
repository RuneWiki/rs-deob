import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class270 extends class199 {

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    private int field3873 = 4096;

    @OriginalMember(owner = "client!sh", name = "cb", descriptor = "I")
    public static int field3879 = 0;

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
    public static int field3876 = 0;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "Lcc;")
    public static class327 field3870 = new class327(64);

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!sh", name = "eb", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "Lbh;")
    public static class315 field3877;

    @OriginalMember(owner = "client!sh", name = "db", descriptor = "[I")
    public static int[] field3880;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V", line = 6)
    public static final void method1840(boolean arg0, int arg1) {
        if (arg0) {
            method1842(-33);
        }
        if (class56.field719 == arg1 && arg1 != 0) {
            class18 var2 = class84.field1081[arg1];
            var2.method129(class264.field3844);
        }
        field3871++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method190(int arg0, int arg1) {
        if (arg0 != -1735) {
            field3881 = 34;
        }
        field3874++;
        int[] var3 = this.field2802.method2502(arg1, -71);
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(-7764, arg1 - 1 & class156.field2165, 0);
            int[] var5 = this.method1467(-7764, arg1, 0);
            int[] var6 = this.method1467(-7764, arg1 + 1 & class156.field2165, 0);
            for (int var7 = 0; var7 < class95.field1235; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field3873;
                int var9 = (var5[class245.field3573 & var7 + 1] - var5[class245.field3573 & var7 - 1]) * this.field3873;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 77)
    public class270() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)Lik;", line = 83)
    public static final class149 method1841(int arg0, int arg1) {
        class149 var2 = (class149) class237.field3428.method2265((long) arg1, (byte) -87);
        field3872++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class233.field3348.method1089(arg0, (byte) 113, arg1);
        class149 var4 = new class149();
        if (var3 != null) {
            var4.method1144(new class299(var3), (byte) 63);
        }
        var4.method1148((byte) -87);
        class237.field3428.method2257(-128, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V", line = 105)
    public static void method1842(int arg0) {
        field3880 = null;
        field3877 = null;
        if (arg0 == 1) {
            field3870 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(II)Lte;", line = 119)
    public static final class261 method1843(int arg0, int arg1) {
        if (arg1 != -1) {
            method1844((class333) null, -29, (byte) -45);
        }
        field3878++;
        class261 var2 = (class261) class260.field3769.method2265((long) arg0, (byte) 26);
        if (var2 != null) {
            return var2;
        }
        class261 var3 = class310.method2157((byte) 62, arg0, class292.field4254, class277.field3973, false);
        if (var3 != null) {
            class260.field3769.method2257(-127, var3, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lwf;IB)I", line = 141)
    public static final int method1844(class333 arg0, int arg1, byte arg2) {
        field3869++;
        int var3 = 15 % ((30 - arg2) / 41);
        if (!client.method891(arg0).method1093(arg1, 68) && arg0.field5118 == null) {
            return -1;
        } else if (arg0.field5102 == null || arg0.field5102.length <= arg1) {
            return -1;
        } else {
            return arg0.field5102[arg1];
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLfd;I)V", line = 161)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3873 = arg1.method2083((byte) -24);
        }
        if (arg0 != -43) {
            method1844((class333) null, -36, (byte) -30);
        }
        field3875++;
    }
}
