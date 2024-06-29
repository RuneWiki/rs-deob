import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class94 extends class7 {

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    private int field1879 = 4;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
    private int field1882 = 4;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "Lob;")
    private static class141 field1875 = class175.method1195(40, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!je", name = "T", descriptor = "Lob;")
    private static class141 field1871 = class175.method1195(40, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "Lob;")
    public static class141 field1880 = field1875;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "Lob;")
    public static class141 field1874 = field1871;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "Lob;")
    private static class141 field1872 = class175.method1195(40, "flash2:");

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "Lob;")
    public static class141 field1876 = field1872;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Lob;")
    public static class141 field1869 = class175.method1195(40, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!je", name = "S", descriptor = "Lob;")
    public static class141 field1870 = field1872;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public static int field1877 = 0;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int var3 = 84 / ((arg1 - -42) / 41);
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        ++field1881;
        if (super.field97.field4093) {
            int var5 = class117.field2272 / this.field1882;
            int var6 = class60.field1174 / this.field1879;
            int[][] var8;
            if (var6 > 0) {
                int var7 = arg0 % var6;
                var8 = this.method42(class60.field1174 * var7 / var6, 87, 0);
            } else {
                var8 = this.method42(0, 103, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var4[0];
            int[] var12 = var8[2];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; ~class117.field2272 < ~var15; ++var15) {
                int var16;
                if (var5 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class117.field2272 * var17 / var5;
                }
                var11[var15] = var9[var16];
                var13[var15] = var10[var16];
                var14[var15] = var12[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class94() {
        super(1, false);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 < 13) {
            field1870 = null;
        }
        ++field1878;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int var4 = class117.field2272 / this.field1882;
            int var5 = class60.field1174 / this.field1879;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method52(class60.field1174 * var6 / var5, 0, 56);
            } else {
                var7 = this.method52(0, 0, 74);
            }
            for (int var8 = 0; ~var8 > ~class117.field2272; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class117.field2272 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = -18 % ((66 - arg1) / 57);
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field1879 = arg2.method991(255);
            }
        } else {
            this.field1882 = arg2.method991(255);
        }
        ++field1873;
    }

    @OriginalMember(owner = "client!je", name = "i", descriptor = "(I)V")
    public static void method641(int arg0) {
        field1876 = null;
        field1875 = null;
        field1870 = null;
        field1869 = null;
        field1874 = null;
        field1872 = null;
        if (arg0 != 2) {
            field1877 = -35;
        }
        field1880 = null;
        field1871 = null;
    }
}
