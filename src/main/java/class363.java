import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class363 extends class457 {

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    private int field5661;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    private int field5660;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    private int field5649;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    private int field5655;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    private int field5659;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    private int field5658;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    private int field5653;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    private int field5656;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "Lui;")
    public static class378 field5657 = new class378("WTWIP", 3);

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public static int field5662 = 0;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZII)V", line = 4)
    public final void method328(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            ++field5652;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BIIILza;IIII[[[BIII)V", line = 18)
    public static final void method2317(byte arg0, int arg1, int arg2, int arg3, class491 arg4, int arg5, int arg6, int arg7, int arg8, byte[][][] arg9, int arg10, int arg11, int arg12) {
        ++field5650;
        if (arg10 != 0 && arg11 != 0) {
            if (~arg10 == -10) {
                arg6 = arg6 - -1 & 3;
                arg10 = 1;
            }
            if (arg10 == 10) {
                arg10 = 1;
                arg6 = arg6 + 3 & 3;
            }
            if (arg0 != -19) {
                field5662 = 66;
            }
            if (~arg10 == -12) {
                arg10 = 8;
                arg6 = 3 & arg6 + 3;
            }
            arg4.method872(arg2, arg7, arg12, arg8, arg3, arg1, arg9[arg10 + -1][arg6], arg11, arg5);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZ)V", line = 58)
    public final void method331(int arg0, int arg1, boolean arg2) {
        ++field5651;
        int var4 = this.field5653 * arg1 >> 12;
        int var5 = this.field5656 * arg0 >> 12;
        int var6 = this.field5655 * arg1 >> 12;
        int var7 = this.field5660 * arg0 >> 12;
        int var8 = this.field5658 * arg1 >> 12;
        if (!arg2) {
            this.method334(33, -58, -7);
        }
        int var9 = this.field5659 * arg0 >> 12;
        int var10 = this.field5649 * arg1 >> 12;
        int var11 = this.field5661 * arg0 >> 12;
        class239.method1637(super.field6801, var6, var8, var11, var7, (byte) 124, var4, var5, var9, var10);
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 87)
    public class363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5661 = arg7;
        this.field5660 = arg3;
        this.field5649 = arg6;
        this.field5655 = arg2;
        this.field5659 = arg5;
        this.field5658 = arg4;
        this.field5653 = arg0;
        this.field5656 = arg1;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V", line = 103)
    public static void method2318(boolean arg0) {
        if (arg0) {
            field5662 = 102;
        }
        field5657 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V", line = 118)
    public final void method334(int arg0, int arg1, int arg2) {
        if (arg2 < 1) {
            this.method328(true, 33, -55);
        }
        ++field5648;
    }
}
