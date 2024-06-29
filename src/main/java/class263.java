import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class263 extends class346 {

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    private int field3851 = -1;

    @OriginalMember(owner = "client!jo", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3859 = "Created gameworld";

    @OriginalMember(owner = "client!jo", name = "S", descriptor = "Z")
    public static boolean field3862 = false;

    @OriginalMember(owner = "client!jo", name = "U", descriptor = "[I")
    public static int[] field3864 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!jo", name = "T", descriptor = "[I")
    public static int[] field3863 = new int[14];

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!jo", name = "M", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!jo", name = "N", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!jo", name = "O", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!jo", name = "Q", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!jo", name = "V", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!jo", name = "W", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "[I")
    public int[] field3854;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "[[[B")
    public static byte[][][] field3853;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)V")
    public static void method1758(byte arg0) {
        field3853 = null;
        field3864 = null;
        field3863 = null;
        field3859 = null;
        if (arg0 >= -27) {
            field3863 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
    public static final void method1759(int arg0) {
        if (arg0 != 255) {
            field3862 = false;
        }
        ++field3858;
        class51 var1 = class219.field3053;
        synchronized (class219.field3053) {
            class219.field3053.method366(80);
        }
        class51 var2 = class269.field3986;
        synchronized (class269.field3986) {
            class269.field3986.method366(-104);
        }
        class51 var3 = class322.field4795;
        synchronized (class322.field4795) {
            class322.field4795.method366(15);
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)I")
    public final int method1760(byte arg0) {
        ++field3856;
        if (arg0 <= 19) {
            field3862 = true;
        }
        return this.field3851;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(Z)Z")
    public final boolean method1761(boolean arg0) {
        ++field3866;
        if (this.field3854 != null) {
            return true;
        } else if (~this.field3851 <= -1) {
            class10 var2 = class58.field866 >= 0 ? class10.method88(class234.field3260, class58.field866, this.field3851) : class10.method80(class234.field3260, this.field3851);
            var2.method82();
            this.field3854 = var2.method84();
            this.field3860 = var2.field183;
            this.field3852 = var2.field187;
            return true;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field3861;
        if (arg1) {
            this.method38((class341) null, false, 99);
        }
        if (~arg2 == -1) {
            this.field3851 = arg0.method2239(-1076227960);
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(II)[[I")
    public int[][] method287(int arg0, int arg1) {
        ++field3865;
        if (arg1 >= -3) {
            field3862 = false;
        }
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (super.field5170.field6288 && this.method1761(false)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field3860 * (class370.field5474 == this.field3852 ? arg0 : this.field3852 * arg0 / class370.field5474);
            if (~class134.field1753 != ~this.field3860) {
                for (int var8 = 0; ~class134.field1753 < ~var8; ++var8) {
                    int var9 = this.field3860 * var8 / class134.field1753;
                    int var10 = this.field3854[var7 + var9];
                    var6[var8] = class394.method2529(var10, 255) << 4;
                    var5[var8] = class394.method2529(4080, var10 >> 4);
                    var4[var8] = class394.method2529(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; var11 < class134.field1753; ++var11) {
                    int var12 = this.field3854[var7++];
                    var6[var11] = class394.method2529(255, var12) << 4;
                    var5[var11] = class394.method2529(65280, var12) >> 4;
                    var4[var11] = class394.method2529(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)Laa;")
    public static final class235 method1762(int arg0, boolean arg1) {
        ++field3855;
        class51 var2 = class318.field4678;
        class235 var3;
        synchronized (class318.field4678) {
            var3 = (class235) class318.field4678.method378((byte) 28, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class127.field1662.method1235(class352.method2322(arg0, false), arg1, class373.method2453(arg0, 255));
            class235 var5 = new class235();
            var5.field3265 = arg0;
            if (var4 != null) {
                var5.method1527(-26, new class341(var4));
            }
            class51 var6 = class318.field4678;
            synchronized (class318.field4678) {
                class318.field4678.method367((long) arg0, var5, true);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
    public class263() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public final void method1763(byte arg0) {
        ++field3857;
        super.method1763((byte) 125);
        this.field3854 = null;
        if (arg0 <= 124) {
            method1759(-28);
        }
    }
}
