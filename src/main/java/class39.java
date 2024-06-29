import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class39 extends class86 {

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "[I")
    public static int[] field595 = new int[14];

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "F")
    public static float field607 = 0.25F;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "[S")
    public static short[] field593;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)Z", line = 6)
    public final boolean method300(int arg0, int arg1, int arg2) {
        if (arg0 != -153) {
            this.field603 = -53;
        }
        field604++;
        return arg2 >= this.field601 && arg2 <= this.field596 && this.field598 <= arg1 && this.field603 >= arg1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZI)Z", line = 22)
    public final boolean method301(int arg0, boolean arg1, int arg2) {
        field594++;
        if (!arg1) {
            this.method303(-21, 16, -41, null);
        }
        return this.field609 <= arg0 && this.field599 >= arg0 && this.field605 <= arg2 && this.field600 >= arg2;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I[III)V", line = 49)
    public final void method302(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[1] = this.field609 + arg3 - this.field601;
        arg1[2] = this.field605 + arg2 - this.field598;
        field602++;
        arg1[arg0] = this.field608;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III[I)V", line = 65)
    public final void method303(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[arg0] = arg1 + this.field598 - this.field605;
        arg3[1] = this.field601 + arg2 - this.field609;
        field606++;
        arg3[0] = 0;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 75)
    public static void method304(int arg0) {
        field595 = null;
        if (arg0 == 29140) {
            field593 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIZI)Z", line = 86)
    public final boolean method305(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.method303(-22, 27, -49, null);
        }
        field597++;
        return this.field608 == arg3 && this.field609 <= arg0 && arg0 <= this.field599 && this.field605 <= arg1 && this.field600 >= arg1;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIII)V", line = 102)
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field603 = arg8;
        this.field599 = arg3;
        this.field600 = arg4;
        this.field601 = arg5;
        this.field596 = arg7;
        this.field605 = arg2;
        this.field608 = arg0;
        this.field609 = arg1;
        this.field598 = arg6;
    }
}
