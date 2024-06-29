import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class107 extends class413 {

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "I")
    private int field1734;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    private int field1731;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    private int field1733;

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!mp", name = "A", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!mp", name = "B", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!mp", name = "C", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!mp", name = "D", descriptor = "I")
    private int field1743;

    @OriginalMember(owner = "client!mp", name = "E", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "[B")
    private byte[] field1732;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIB)V", line = 3)
    public void method822(byte arg0, int arg1, byte arg2) {
        field1736++;
        if (arg0 >= 65) {
            this.field1732[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB[S)[S", line = 23)
    public static final short[] method823(int arg0, byte arg1, short[] arg2) {
        if (arg1 != -95) {
            method823(-21, (byte) -105, null);
        }
        field1741++;
        short[] var3 = new short[arg0];
        class57.method376(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V", line = 42)
    public final void method350(byte arg0) {
        field1742++;
        this.field1733 = 0;
        int var2 = 24 % ((arg0 - 27) / 47);
        this.field1743 = 0;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V", line = 55)
    public final void method347(int arg0) {
        this.field1733 >>= 0x4;
        if (arg0 != 918862444) {
            return;
        }
        this.field1734 = this.field1730;
        field1740++;
        if (this.field1733 < 0) {
            this.field1733 = 0;
        } else if (this.field1733 > 255) {
            this.field1733 = 255;
        }
        this.method822((byte) 115, this.field1743++, (byte) this.field1733);
        this.field1733 = 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)V", line = 76)
    public final void method352(int arg0, int arg1, byte arg2) {
        field1744++;
        int var4 = -115 % ((-arg2 - 23) / 61);
        if (arg1 == 0) {
            this.field1739 = this.field1735 - (arg0 < 0 ? -arg0 : arg0);
            this.field1739 = this.field1739 * this.field1739 >> 12;
            this.field1731 = 4096;
            this.field1733 = this.field1739;
            return;
        }
        this.field1731 = this.field1739 * this.field1738 >> 12;
        this.field1739 = this.field1735 - (arg0 >= 0 ? arg0 : -arg0);
        if (this.field1731 < 0) {
            this.field1731 = 0;
        } else if (this.field1731 > 4096) {
            this.field1731 = 4096;
        }
        this.field1739 = this.field1739 * this.field1739 >> 12;
        this.field1739 = this.field1739 * this.field1731 >> 12;
        this.field1733 += this.field1739 * this.field1734 >> 12;
        this.field1734 = this.field1734 * this.field1730 >> 12;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIIIFFF)V", line = 112)
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1735 = (int) (arg6 * 4096.0F);
        this.field1738 = (int) (arg7 * 4096.0F);
        this.field1734 = this.field1730 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
