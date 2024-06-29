import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class131 extends class68 {

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    private int field1844 = 1024;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "I")
    private int field1847 = 3072;

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "I")
    private int field1853 = 2048;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public static int field1845 = 7759444;

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1848 = "Ok";

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "I")
    public static int field1852 = 0;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!qi", name = "Z", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "Lse;")
    public static class211 field1843;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field1849 = -107;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field926 = ~arg0.method1453((byte) -128) == -2;
                }
            } else {
                this.field1847 = arg0.method1445(false);
            }
        } else {
            this.field1844 = arg0.method1445(!arg2);
        }
        ++field1851;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(IB)V")
    public static final void method890(int arg0, byte arg1) {
        ++field1846;
        class50.field720.method536(126, arg0);
        class240.field3663.method536(-32, arg0);
        if (arg1 >= -89) {
            method891(false);
        }
        class208.field2942.method536(-90, arg0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field1850;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int[] var4 = this.method423(0, (byte) -54, arg0);
            for (int var5 = 0; var5 < class89.field1248; ++var5) {
                var3[var5] = (var4[var5] * this.field1853 >> 12) + this.field1844;
            }
        }
        return arg1 > -118 ? null : var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field1854;
        int var3 = 35 % ((63 - arg1) / 61);
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int[][] var5 = this.method429(0, arg0, 2);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class89.field1248; ++var12) {
                var10[var12] = (var7[var12] * this.field1853 >> 12) + this.field1844;
                var9[var12] = (var6[var12] * this.field1853 >> 12) + this.field1844;
                var11[var12] = (var8[var12] * this.field1853 >> 12) + this.field1844;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method891(boolean arg0) {
        field1843 = null;
        if (arg0) {
            field1848 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        if (arg0 > -18) {
            field1852 = -114;
        }
        this.field1853 = -this.field1844 + this.field1847;
        ++field1842;
    }
}
