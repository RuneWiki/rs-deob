import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class26 extends class167 {

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    private final int field640;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    private final int field633;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    private final int field627;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    private int field628;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field626 = 0;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "[I")
    public static int[] field624 = new int[200];

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Z")
    public static boolean field637 = false;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    private int field622;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "[B")
    private byte[] field638;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
    public static int[] field625;

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIFFF)V", line = 3)
    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field640 = (int) (arg7 * 4096.0F);
        this.field633 = (int) (arg6 * 4096.0F);
        this.field628 = this.field627 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 15)
    public final void method226(boolean arg0) {
        this.field628 = this.field627;
        this.field622 >>= 0x4;
        if (this.field622 < 0) {
            this.field622 = 0;
        } else if (this.field622 > 255) {
            this.field622 = 255;
        }
        field632++;
        this.method227(this.field639++, (byte) this.field622);
        if (arg0) {
            this.field622 = 0;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V", line = 40)
    public void method227(int arg0, byte arg1) {
        field634++;
        this.field638[arg0] = arg1;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)I", line = 59)
    public static final int method228(int arg0) {
        field623++;
        if (arg0 != 0) {
            field637 = false;
        }
        return 6;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 70)
    public final void method229(byte arg0) {
        this.field639 = 0;
        if (arg0 != 28) {
            field635 = -11;
        }
        this.field622 = 0;
        field629++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V", line = 106)
    public final void method230(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field636 = 4096;
            this.field630 = this.field633 - (arg0 >= 0 ? arg0 : -arg0);
            this.field630 = this.field630 * this.field630 >> 12;
            this.field622 = this.field630;
        } else {
            this.field636 = this.field640 * this.field630 >> 12;
            if (this.field636 < 0) {
                this.field636 = 0;
            } else if (this.field636 > 4096) {
                this.field636 = 4096;
            }
            this.field630 = this.field633 - (arg0 < 0 ? -arg0 : arg0);
            this.field630 = this.field630 * this.field630 >> 12;
            this.field630 = this.field636 * this.field630 >> 12;
            this.field622 += this.field630 * this.field628 >> 12;
            this.field628 = this.field628 * this.field627 >> 12;
        }
        field631++;
        if (arg1 > -78) {
            this.method227(22, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 140)
    public static void method231(int arg0) {
        if (arg0 == 4096) {
            field624 = null;
            field625 = null;
        }
    }
}
