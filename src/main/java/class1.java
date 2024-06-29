import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class1 extends class335 {

    @OriginalMember(owner = "client!oba", name = "B", descriptor = "I")
    public static int field1 = 0;

    @OriginalMember(owner = "client!oba", name = "C", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!oba", name = "F", descriptor = "Lct;")
    public static class410 field4;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field5;
        if (arg1) {
            this.method2(87, (class157) null, -34);
        }
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int[][] var4 = this.method1968(arg0, 3, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class649.field8968 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 != -66) {
            field6 = -8;
        }
        ++field2;
        if (~arg0 == -1) {
            super.field4537 = arg1.method930(255) == 1;
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
    public class1() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field3;
            int[] var3 = super.field4525.method2344(-2, arg1);
            if (super.field4525.field5435) {
                int[] var4 = this.method1969(0, arg1, -50);
                for (int var5 = 0; var5 < class649.field8968; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(Z)V")
    public static void method4(boolean arg0) {
        if (arg0) {
            method4(true);
        }
        field4 = null;
    }
}
