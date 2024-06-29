import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class87 extends class346 {

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    private int field1202 = 4096;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    private int field1206 = 4096;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    private int field1211 = 4096;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field1203 = 0;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "[[I")
    public static int[][] field1204 = new int[128][128];

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "[I")
    public static int[] field1205 = new int[4096];

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class87() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public static final void method704(int arg0) {
        ++field1207;
        class30.field497.method366(arg0 + -14991);
        class425.field6204.method366(32);
        if (arg0 != 15113) {
            method705(-6);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1206 = arg0.method2239(-1076227960);
                }
            } else {
                this.field1202 = arg0.method2239(-1076227960);
            }
        } else {
            this.field1211 = arg0.method2239(-1076227960);
        }
        if (arg1) {
            method704(63);
        }
        ++field1210;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1204 = null;
        field1205 = null;
        if (arg0 <= 50) {
            method706(-88);
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)Z")
    public static final boolean method706(int arg0) {
        if (arg0 != -586191796) {
            return false;
        } else {
            ++field1208;
            try {
                return class167.method1121(0);
            } catch (IOException var4) {
                class11.method91((byte) -123);
                return true;
            } catch (Exception var5) {
                String var2 = "T2 - " + class8.field112 + "," + class86.field1199 + "," + class402.field5870 + " - " + class20.field342 + "," + (class383.field5609.field2190[0] + class236.field3292) + "," + (class90.field1223 - -class383.field5609.field2189[0]) + " - ";
                for (int var3 = 0; var3 < class20.field342 && ~var3 > -51; ++var3) {
                    var2 = var2 + class27.field471.field5042[var3] + ",";
                }
                class266.method1780(arg0 ^ -586191795, var2, var5);
                class163.method1101(arg0 ^ -586191796);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field1209;
        if (arg1 >= -3) {
            return null;
        } else {
            int[][] var3 = super.field5170.method2701(0, arg0);
            if (super.field5170.field6288) {
                int[][] var4 = this.method2293(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class134.field1753 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && var13 == var14) {
                        var8[var11] = this.field1211 * var12 >> 12;
                        var9[var11] = this.field1202 * var13 >> 12;
                        var10[var11] = this.field1206 * var14 >> 12;
                    } else {
                        var8[var11] = this.field1211;
                        var9[var11] = this.field1202;
                        var10[var11] = this.field1206;
                    }
                }
            }
            return var3;
        }
    }
}
