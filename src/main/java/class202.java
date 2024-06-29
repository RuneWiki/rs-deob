import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class202 extends class241 {

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "[S")
    public static short[] field3645 = new short[500];

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "Loh;")
    public static class263 field3651 = class253.method1681(-119, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "J")
    public long field3647;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Lqk;")
    public class202 field3644;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Lqk;")
    public class202 field3652;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3648;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "[Loh;")
    public static class263[] field3649;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static void method1399(byte arg0) {
        field3648 = null;
        field3651 = null;
        field3649 = null;
        if (arg0 != 74) {
            method1400(-74, -80);
        }
        field3645 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
    public static final boolean method1400(int arg0, int arg1) {
        if (arg0 != 1) {
            field3649 = null;
        }
        field3650++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public final void method1401(byte arg0) {
        field3646++;
        if (arg0 != 27) {
            field3651 = null;
        }
        if (this.field3652 != null) {
            this.field3652.field3644 = this.field3644;
            this.field3644.field3652 = this.field3652;
            this.field3652 = null;
            this.field3644 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
