import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class66 extends class642 {

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "I")
    private int field1048 = 3072;

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "I")
    private int field1044 = 2048;

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
    private int field1049 = 1024;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public static int field1052 = 2;

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "Lau;")
    public static class692 field1043 = new class692(20);

    @OriginalMember(owner = "client!fu", name = "N", descriptor = "Z")
    public static boolean field1054 = false;

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V", line = 4)
    public static void method397(boolean arg0) {
        field1043 = null;
        if (arg0) {
            field1052 = 95;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILgk;B)V", line = 17)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 <= 29) {
            this.method138(-9, 38);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field9207 = ~arg1.method3115(29871) == -2;
                }
            } else {
                this.field1048 = arg1.method3169(26488);
            }
        } else {
            this.field1049 = arg1.method3169(26488);
        }
        ++field1051;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)[I", line = 60)
    public final int[] method3(int arg0, int arg1) {
        ++field1046;
        int[] var3 = super.field9216.method1185(arg0, -122);
        if (arg1 != -9) {
            return null;
        } else {
            if (super.field9216.field2418) {
                int[] var4 = this.method3658((byte) 109, arg0, 0);
                for (int var5 = 0; var5 < class338.field4909; ++var5) {
                    var3[var5] = (var4[var5] * this.field1044 >> 12) + this.field1049;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V", line = 154)
    public class66() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[[I", line = 107)
    public final int[][] method138(int arg0, int arg1) {
        if (arg0 != 21402) {
            this.method2(-52);
        }
        ++field1050;
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (super.field9211.field2131) {
            int[][] var4 = this.method3657(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class338.field4909 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field1044 >> 12) + this.field1049;
                var9[var11] = (var6[var11] * this.field1044 >> 12) + this.field1049;
                var10[var11] = (var7[var11] * this.field1044 >> 12) + this.field1049;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V", line = 168)
    public final void method2(int arg0) {
        this.field1044 = this.field1048 - this.field1049;
        ++field1045;
        if (arg0 != 6276) {
            field1054 = false;
        }
    }
}
