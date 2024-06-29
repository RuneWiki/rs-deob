import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class695 extends class389 {

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    private int field9767;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    private int field9775;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    private int field9771;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    private int field9764;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    private int field9763;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    private int field9766;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
    private int field9768;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    private int field9776;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "[B")
    private byte[] field9769;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public final void method2429(int arg0) {
        field9773++;
        this.field9763 = 0;
        this.field9776 = 0;
        if (arg0 != -22125) {
            this.field9769 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public final void method2427(byte arg0) {
        this.field9763 >>= 0x4;
        field9774++;
        if (arg0 < 91) {
            this.field9769 = null;
        }
        this.field9764 = this.field9771;
        if (this.field9763 < 0) {
            this.field9763 = 0;
        } else if (this.field9763 > 255) {
            this.field9763 = 255;
        }
        this.method2787(this.field9776++, -48, (byte) this.field9763);
        this.field9763 = 0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIB)V")
    public void method2787(int arg0, int arg1, byte arg2) {
        if (arg1 > -25) {
            this.method2431(60, 120, -53);
        }
        this.field9769[arg0] = arg2;
        field9770++;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class695(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9767 = (int) (arg6 * 4096.0F);
        this.field9775 = (int) (arg7 * 4096.0F);
        this.field9764 = this.field9771 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IC)I")
    public static final int method3902(int arg0, char arg1) {
        field9777++;
        if (arg0 != 1237726796) {
            method3903(-48);
        }
        return arg1 >= '\u0000' && class717.field10032.length > arg1 ? class717.field10032[arg1] : -1;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)V")
    public final void method2431(int arg0, int arg1, int arg2) {
        field9772++;
        if (arg1 <= 114) {
            return;
        }
        if (arg0 == 0) {
            this.field9768 = this.field9767 - (arg2 < 0 ? -arg2 : arg2);
            this.field9766 = 4096;
            this.field9768 = this.field9768 * this.field9768 >> 12;
            this.field9763 = this.field9768;
            return;
        }
        this.field9766 = this.field9775 * this.field9768 >> 12;
        this.field9768 = this.field9767 - (arg2 >= 0 ? arg2 : -arg2);
        if (this.field9766 < 0) {
            this.field9766 = 0;
        } else if (this.field9766 > 4096) {
            this.field9766 = 4096;
        }
        this.field9768 = this.field9768 * this.field9768 >> 12;
        this.field9768 = this.field9768 * this.field9766 >> 12;
        this.field9763 += this.field9768 * this.field9764 >> 12;
        this.field9764 = this.field9771 * this.field9764 >> 12;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
    public static final void method3903(int arg0) {
        class406.field5655 = new class220();
        field9765++;
        if (arg0 >= 115) {
            ;
        }
    }
}
