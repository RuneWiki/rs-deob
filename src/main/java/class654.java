import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class654 extends class540 {

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
    public int field9230;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
    public int field9229;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "Lrh;")
    public static class275 field9227 = new class275(15, 0, 1, 0);

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "Z")
    public static boolean field9234 = false;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "Lke;")
    public static class622 field9233;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method3746(byte arg0) {
        if (arg0 != -112) {
            this.field9229 = -10;
        }
        field9231++;
        return (this.field9229 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)I", line = 20)
    public final int method3747(int arg0) {
        field9226++;
        if (arg0 != 16480) {
            this.field9229 = -13;
        }
        return this.field9229 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)I", line = 31)
    public final int method3748(int arg0) {
        if (arg0 < 14) {
            method3751((byte) 35, -66, -111);
        }
        field9223++;
        return class517.method3012(this.field9229, (byte) -126);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)Z", line = 42)
    public final boolean method3749(int arg0, int arg1) {
        if (arg1 > -99) {
            return true;
        } else {
            field9228++;
            return (this.field9229 >> arg0 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(B)Z", line = 54)
    public final boolean method3750(byte arg0) {
        if (arg0 == -101) {
            field9225++;
            return ((this.field9229 & 0x4489D1) >> 22) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(BII)I", line = 65)
    public static final int method3751(byte arg0, int arg1, int arg2) {
        field9222++;
        int var3 = arg1 * 57 + arg2;
        if (arg0 <= 81) {
            method3754(11, -125, 87);
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FCCD95) >> 19;
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V", line = 82)
    public static void method3752(int arg0) {
        field9233 = null;
        if (arg0 > -6) {
            method3751((byte) -126, -10, 88);
        }
        field9227 = null;
    }

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "(I)Z", line = 95)
    public final boolean method3753(int arg0) {
        if (arg0 < 7) {
            return false;
        } else {
            field9224++;
            return (this.field9229 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V", line = 107)
    public static final void method3754(int arg0, int arg1, int arg2) {
        class379 var3 = class378.field5427[arg0][arg1][arg2];
        if (var3 != null) {
            class257.method1692(var3.field5446);
            if (var3.field5446 != null) {
                var3.field5446 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(II)V", line = 117)
    public class654(int arg0, int arg1) {
        this.field9230 = arg1;
        this.field9229 = arg0;
    }
}
