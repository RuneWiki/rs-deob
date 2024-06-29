import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class339 extends class264 {

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field4687 = 127;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "Z")
    public static boolean field4690 = false;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "[I")
    public static int[] field4689;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field4686;
        int[] var3 = super.field3808.method958((byte) 80, arg0);
        if (super.field3808.field1732) {
            int[][] var4 = this.method1782(arg0, (byte) 121, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class478.field6792 > var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return arg1 != 21034 ? null : var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
    public static final int method2123(int arg0, int arg1, int arg2) {
        ++field4691;
        if (~arg0 == 1) {
            return 12345678;
        } else {
            if (arg1 != -7604) {
                field4689 = null;
            }
            if (arg0 == -1) {
                if (~arg2 <= -3) {
                    if (~arg2 < -127) {
                        arg2 = 126;
                    }
                } else {
                    arg2 = 2;
                }
                return arg2;
            } else {
                int var3 = (127 & arg0) * arg2 >> 7;
                if (var3 >= 2) {
                    if (var3 > 126) {
                        var3 = 126;
                    }
                } else {
                    var3 = 2;
                }
                return (arg0 & 65408) + var3;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILnl;)I")
    public static final int method2124(int arg0, class435 arg1) {
        if (arg0 != 8850) {
            field4690 = false;
        }
        ++field4688;
        int var2 = 0;
        if (arg1.method2627((byte) 42, class284.field4074)) {
            ++var2;
        }
        if (arg1.method2627((byte) 59, class366.field5026)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)V")
    public static void method2125(int arg0) {
        if (arg0 != 8818) {
            field4690 = true;
        }
        field4689 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class339() {
        super(1, true);
    }
}
