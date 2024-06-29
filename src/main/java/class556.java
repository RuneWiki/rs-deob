import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class556 extends class56 {

    @OriginalMember(owner = "client!iba", name = "I", descriptor = "[I")
    public static int[] field7733 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!iba", name = "G", descriptor = "Lhj;")
    public static class596 field7731 = new class596(48, -2);

    @OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!iba", name = "F", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!iba", name = "H", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        if (arg0 < 35) {
            return null;
        } else {
            ++field7732;
            int[][] var3 = super.field759.method220(arg1, (byte) -91);
            if (super.field759.field341) {
                int[][] var4 = this.method495(-52, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class642.field8759 < ~var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field7729;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            this.method187((byte) 16, 78);
        }
        if (super.field752.field2441) {
            int[] var4 = this.method492(0, arg1, (byte) 61);
            for (int var5 = 0; var5 < class642.field8759; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(B)V")
    public static void method3249(byte arg0) {
        field7733 = null;
        if (arg0 > -78) {
            field7733 = null;
        }
        field7731 = null;
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
    public class556() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (~arg1 == -1) {
            super.field762 = arg2.method2396((byte) 107) == 1;
        }
        ++field7730;
        if (arg0 >= -44) {
            this.method144((byte) -36, 84, (class403) null);
        }
    }
}
