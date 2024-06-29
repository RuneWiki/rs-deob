import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class164 extends class573 {

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "Lqfa;")
    public static class85 field2748 = new class85(87, 8);

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!wp", name = "O", descriptor = "Z")
    public static boolean field2750 = false;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field2744;
        int[] var3 = super.field8321.method3164(arg0, -115);
        if (super.field8321.field7825) {
            int var4 = class230.field3460[arg0];
            for (int var5 = 0; var5 < class540.field7555; ++var5) {
                var3[var5] = this.method1252(var4, class51.field1194[var5], arg1 + -117) % 4096;
            }
        }
        if (arg1 != 1) {
            field2749 = -102;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)Z")
    public static final boolean method1251(int arg0) {
        ++field2747;
        class485 var1 = (class485) class576.field8367.method1224(arg0 ^ -2);
        if (var1 == null) {
            return false;
        } else {
            for (int var2 = arg0; ~var1.field6942 < ~var2; ++var2) {
                if (var1.field6933[var2] != null && ~var1.field6933[var2].field6502 == -1) {
                    return false;
                }
                if (var1.field6932[var2] != null && var1.field6932[var2].field6502 == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(III)I")
    private final int method1252(int arg0, int arg1, int arg2) {
        ++field2745;
        if (arg2 > -54) {
            return 48;
        } else {
            int var4 = arg0 * 57 + arg1;
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(B)V")
    public static void method1253(byte arg0) {
        field2748 = null;
        if (arg0 != 101) {
            method1251(98);
        }
    }
}
