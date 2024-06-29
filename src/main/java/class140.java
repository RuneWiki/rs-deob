import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class140 {

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
    public boolean field2696 = true;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field2702;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public int field2706;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2697 = 128;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2692 = 0;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2700 = 0;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lvd;")
    private static class222 field2703 = class212.method1357("Please remove ", 10731);

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field2709 = 0;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lvd;")
    public static class222 field2710 = field2703;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lvd;")
    public static class222 field2698 = field2703;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2701;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "[S")
    public static short[] field2708;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBILba;)V")
    public static final void method878(int arg0, int arg1, byte arg2, int arg3, class13 arg4) {
        if (class68.field1277 >= 3) {
            class53.method398(arg1, arg0, 0, arg4.field272, arg4.field346);
        } else {
            class28.field614.method158(arg1, arg0, arg4.field341, arg4.field245, class28.field614.field448 / 2, class28.field614.field446 / 2, class116.field2218, 256, arg4.field272, arg4.field346);
        }
        class157.field3021[arg3] = true;
        field2693++;
        if (arg2 != 97) {
            field2697 = 112;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method879(int arg0) {
        if (arg0 != -31610) {
            method879(-51);
        }
        field2710 = null;
        field2701 = null;
        field2698 = null;
        field2708 = null;
        field2703 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)I")
    public static final int method880(byte arg0, int arg1) {
        if (arg0 != -118) {
            field2701 = null;
        }
        field2695++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2702 = arg1;
        this.field2704 = arg3;
        this.field2699 = arg4;
        this.field2696 = arg6;
        this.field2705 = arg2;
        this.field2707 = arg5;
        this.field2706 = arg0;
    }
}
