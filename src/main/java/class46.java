import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class46 extends class455 {

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "[[I")
    public static int[][] field737 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "Lfn;")
    public static class52 field742 = new class52(77, 14);

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    private int field741;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "[B")
    private byte[] field744;

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIFFF)V", line = 5)
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field745 = (int) (arg7 * 4096.0F);
        this.field739 = (int) (arg6 * 4096.0F);
        this.field751 = this.field746 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 20)
    public final void method360(int arg0) {
        field736++;
        this.field751 = this.field746;
        this.field738 >>= 0x4;
        if (arg0 > this.field738) {
            this.field738 = 0;
        } else if (this.field738 > 255) {
            this.field738 = 255;
        }
        this.method366(this.field748++, (byte) this.field738);
        this.field738 = 0;
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)V", line = 40)
    public static void method361(int arg0) {
        field737 = null;
        if (arg0 != 7) {
            field737 = null;
        }
        field742 = null;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)V", line = 53)
    public final void method362(int arg0) {
        field749++;
        if (arg0 < 36) {
            this.method362(56);
        }
        this.field738 = 0;
        this.field748 = 0;
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)V", line = 66)
    public static final void method363(int arg0) {
        class180.field2604++;
        if (arg0 == 6) {
            field750++;
            class131.method793(class335.field4586, 116);
            class366.field5214.method2462(class421.field5795, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V", line = 87)
    public final void method364(int arg0, int arg1, int arg2) {
        if (arg0 != -4096) {
            this.field735 = -18;
        }
        if (arg2 == 0) {
            this.field735 = this.field739 - (arg1 >= 0 ? arg1 : -arg1);
            this.field735 = this.field735 * this.field735 >> 12;
            this.field741 = 4096;
            this.field738 = this.field735;
        } else {
            this.field741 = this.field745 * this.field735 >> 12;
            this.field735 = this.field739 - (arg1 < 0 ? -arg1 : arg1);
            if (this.field741 < 0) {
                this.field741 = 0;
            } else if (this.field741 > 4096) {
                this.field741 = 4096;
            }
            this.field735 = this.field735 * this.field735 >> 12;
            this.field735 = this.field741 * this.field735 >> 12;
            this.field738 += this.field751 * this.field735 >> 12;
            this.field751 = this.field751 * this.field746 >> 12;
        }
        field743++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBC)I", line = 121)
    public static final int method365(int arg0, byte arg1, char arg2) {
        field747++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return arg1 == -70 ? var3 : 18;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V", line = 147)
    public void method366(int arg0, byte arg1) {
        this.field744[arg0] = arg1;
        field752++;
    }
}
