import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class603 extends class389 {

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "[I")
    private int[] field8758 = new int[this.field5441];

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field8759 = 1;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "Lqe;")
    public static class465 field8760 = new class465(4, -1);

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    private int field8756;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    private int field8766;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "[B")
    private byte[] field8762;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V", line = 4)
    public final void method2427(byte arg0) {
        ++field8767;
        this.field8756 = Math.abs(this.field8756);
        if (this.field8756 >= 4096) {
            this.field8756 = 4095;
        }
        this.method1157(127, this.field8766++, (byte) (this.field8756 >> 4));
        if (arg0 <= 91) {
            field8761 = 116;
        }
        this.field8756 = 0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V", line = 21)
    public final void method2431(int arg0, int arg1, int arg2) {
        this.field8756 += this.field8758[arg0] * arg2 >> 12;
        if (arg1 <= 114) {
            field8760 = null;
        }
        ++field8757;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIB)V", line = 32)
    public void method1157(int arg0, int arg1, byte arg2) {
        this.field8762[this.field8766++] = (byte) (127 + class555.method3246(arg0, arg2 >> 1));
        ++field8765;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V", line = 42)
    public static void method3498(int arg0) {
        if (arg0 != -302343604) {
            method3498(18);
        }
        field8760 = null;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V", line = 58)
    public final void method2429(int arg0) {
        this.field8766 = 0;
        ++field8763;
        this.field8756 = 0;
        if (arg0 != -22125) {
            this.field8758 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIIF)V", line = 72)
    public class603(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field5441; ++var7) {
            this.field8758[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }
}
