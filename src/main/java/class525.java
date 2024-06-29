import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class525 extends class641 {

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "Lhu;")
    public static class131 field7490;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V", line = 5)
    public static void method3078(int arg0) {
        field7490 = null;
        if (arg0 != -745193244) {
            method3078(-4);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)[[I", line = 15)
    public final int[][] method7(byte arg0, int arg1) {
        int var3 = 40 / ((-56 - arg0) / 53);
        ++field7491;
        int[][] var4 = super.field9126.method132(0, arg1);
        if (super.field9126.field295 && this.method3657((byte) -3)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg1 % super.field9179 * super.field9179;
            for (int var9 = 0; ~class635.field9139 < ~var9; ++var9) {
                int var10 = super.field9186[var9 % super.field9180 + var8];
                var7[var9] = class327.method1956(255, var10) << 4;
                var6[var9] = class327.method1956(4080, var10 >> 4);
                var5[var9] = class327.method1956(16711680, var10) >> 12;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lig;I)Lk;", line = 63)
    public static final class563 method3079(class244 arg0, int arg1) {
        ++field7492;
        String var2 = arg0.method1468(-1468860088);
        class388 var3 = class141.method888((byte) 60)[arg0.method1423(-49)];
        class219 var4 = class38.method181(126)[arg0.method1423(-9)];
        int var5 = arg0.method1466((byte) 31);
        int var6 = arg0.method1466((byte) 31);
        int var7 = arg0.method1423(-114);
        int var8 = arg0.method1423(-79);
        int var9 = arg0.method1423(-16);
        int var10 = arg0.method1476(-96);
        if (arg1 != -14514) {
            return null;
        } else {
            int var11 = arg0.method1476(arg1 ^ 14562);
            int var12 = arg0.method1438(arg1 ^ -14557);
            int var13 = arg0.method1438(arg1 ^ -14551);
            int var14 = arg0.method1438(93);
            return new class563(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        }
    }
}
