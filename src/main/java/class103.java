import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class103 extends class436 {

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    private int field1554 = 0;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    private int field1557 = 4096;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "[I")
    public static int[] field1559 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "Lad;")
    public static class244 field1556 = new class244();

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 != 34) {
            method712(27);
        }
        ++field1555;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field1557 = arg2.method2403((byte) 71);
            }
        } else {
            this.field1554 = arg2.method2403((byte) 82);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class103() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Lrg;IBILdi;Lrj;IIIILtm;)V")
    public static final void method711(String arg0, class383 arg1, int arg2, byte arg3, int arg4, class65 arg5, class352 arg6, int arg7, int arg8, int arg9, int arg10, class220 arg11) {
        ++field1558;
        int var12;
        if (~class123.field1731 != -5) {
            var12 = 16383 & (int) class6.field98 + class390.field5737;
        } else {
            var12 = 16383 & (int) class6.field98;
        }
        int var13 = Math.max(arg1.field5431 / 2, arg1.field5491 / 2) + 10;
        int var14 = arg2 * arg2 + arg10 * arg10;
        if (var13 * var13 >= var14) {
            if (arg3 == 34) {
                int var15 = class362.field5083[var12];
                int var16 = class362.field5082[var12];
                if (~class123.field1731 != -5) {
                    var16 = var16 * 256 / (class23.field312 - -256);
                    var15 = var15 * 256 / (class23.field312 + 256);
                }
                int var17 = arg2 * var16 + arg10 * var15 >> 15;
                int var18 = arg10 * var16 - arg2 * var15 >> 15;
                int var19 = arg5.method441((class130[]) null, 100, arg0, (byte) -45);
                int var20 = arg5.method442(100, arg0, (class130[]) null, 0, 0);
                int var21 = var17 - var19 / 2;
                if (~var21 <= ~(-arg1.field5431) && ~var21 >= ~arg1.field5431 && ~var18 <= ~(-arg1.field5491) && ~var18 >= ~arg1.field5491) {
                    arg6.method2264(arg0, 1, arg8, 0, (class130[]) null, 0, (byte) -88, var19, arg9, 0, arg9 + var21 - -(arg1.field5431 / 2), arg7, arg1.field5491 / 2 + arg8 + -var18 + -arg4 + -var20, arg11, 50, (int[]) null);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
    public static void method712(int arg0) {
        field1559 = null;
        field1556 = null;
        int var1 = -14 / ((arg0 - 44) / 60);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field1553;
        if (arg1 != 18338) {
            return null;
        } else {
            int[] var3 = super.field6258.method2688((byte) -108, arg0);
            if (super.field6258.field6138) {
                int[] var4 = this.method2729(0, arg1 ^ 18338, arg0);
                for (int var5 = 0; ~var5 > ~class43.field653; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = this.field1554 <= var6 && this.field1557 >= var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }
}
