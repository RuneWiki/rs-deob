import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class165 extends class13 {

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
    public static int[] field2292 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
    public static void method1108(int arg0) {
        if (arg0 > 22) {
            field2292 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field2297;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int[] var4 = this.method223(0, -11541, arg1);
            for (int var5 = 0; var5 < class269.field3751; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        ++field2294;
        if (arg0 != -27832) {
            return null;
        } else {
            int[][] var3 = super.field256.method1930(arg1, (byte) 89);
            if (super.field256.field4154) {
                int[][] var4 = this.method227(false, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class269.field3751; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field2295;
        if (arg2 == 0) {
            super.field259 = ~arg0.method172((byte) 52) == -2;
        }
        if (arg1 <= 50) {
            field2293 = 116;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IC)Z")
    public static final boolean method1109(int arg0, char arg1) {
        if (arg0 != -11891) {
            method1109(76, '~');
        }
        ++field2296;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && ~arg1 >= -91 || arg1 >= 'a' && ~arg1 >= -123;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class165() {
        super(1, false);
    }
}
