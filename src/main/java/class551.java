import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class551 {

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    private int field7797;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    private int field7786;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    private int field7787;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    private int field7784;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    private int field7788;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    private int field7785;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    private int field7794;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    private int field7790;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    private int field7791;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    private int field7796;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "D")
    public static double field7789;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIIIIZI)V")
    public final void method3290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field7787 = arg2;
        this.field7784 = arg8 * arg8;
        field7795++;
        this.field7786 = arg5;
        this.field7797 = arg6;
        this.field7794 = this.field7787 + arg4;
        if (!arg9) {
            return;
        }
        this.field7788 = this.field7786 + arg0;
        this.field7785 = this.field7797 + arg3;
        this.field7791 = this.field7786 + arg10;
        this.field7790 = this.field7787 + arg1;
        this.field7796 = this.field7797 + arg7;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public static final void method3291(int arg0) {
        field7792++;
        if (class213.field3003 == 5) {
            if (arg0 != -7923) {
                field7789 = -0.28912505898475166D;
            }
            class213.field3003 = 6;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field7797 = arg1;
        this.field7786 = arg2;
        this.field7787 = arg0;
        this.field7784 = arg3 * arg3;
        this.field7788 = this.field7786 + arg8;
        this.field7785 = this.field7797 + arg6;
        this.field7794 = this.field7787 + arg4;
        this.field7790 = this.field7787 + arg5;
        this.field7791 = this.field7786 + arg9;
        this.field7796 = this.field7797 + arg7;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3292(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method3292(true, 69, -124);
        }
        field7793++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)Z")
    public final boolean method3293(int arg0, int arg1, int arg2, int arg3) {
        field7798++;
        if (arg0 < this.field7794 || this.field7790 < arg0) {
            return false;
        } else if (arg2 < this.field7785 || this.field7796 < arg2) {
            return false;
        } else if (arg3 >= this.field7788 && arg3 <= this.field7791) {
            if (arg1 != -28467) {
                this.method3293(66, 120, 57, -124);
            }
            int var5 = arg0 - this.field7787;
            int var6 = arg3 - this.field7786;
            return (var5 * var5 + (var6 * var6)) < this.field7784;
        } else {
            return false;
        }
    }
}
