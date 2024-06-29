import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class190 {

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "[I")
    public static int[] field22 = new int[50];

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "C", descriptor = "I")
    private int field30;

    @OriginalMember(owner = "client!ft", name = "E", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!ft", name = "D", descriptor = "Z")
    public static boolean field31;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "[B")
    private byte[] field24;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method10(String arg0, int arg1) {
        field17++;
        if (arg1 < 71) {
            field31 = true;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BIB)V")
    public void method11(byte arg0, int arg1, byte arg2) {
        field16++;
        if (arg2 == 103) {
            this.field24[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZII)V")
    public final void method12(boolean arg0, int arg1, int arg2) {
        field20++;
        if (arg2 == 0) {
            this.field30 = this.field18 - (arg1 >= 0 ? arg1 : -arg1);
            this.field32 = 4096;
            this.field30 = this.field30 * this.field30 >> 12;
            this.field28 = this.field30;
        } else {
            this.field32 = this.field30 * this.field27 >> 12;
            if (this.field32 < 0) {
                this.field32 = 0;
            } else if (this.field32 > 4096) {
                this.field32 = 4096;
            }
            this.field30 = this.field18 - (arg1 >= 0 ? arg1 : -arg1);
            this.field30 = this.field30 * this.field30 >> 12;
            this.field30 = this.field32 * this.field30 >> 12;
            this.field28 += this.field30 * this.field19 >> 12;
            this.field19 = this.field26 * this.field19 >> 12;
        }
        if (arg0) {
            this.field27 = 87;
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class4(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field18 = (int) (arg6 * 4096.0F);
        this.field27 = (int) (arg7 * 4096.0F);
        this.field19 = this.field26 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method13(int arg0, String arg1) {
        field25++;
        if (arg0 >= -6) {
            field22 = null;
        }
        return class2.method4(0, 10, arg1, true);
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V")
    public static void method14(int arg0) {
        if (arg0 >= -38) {
            field22 = null;
        }
        field22 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
    public final void method15(byte arg0) {
        this.field28 = 0;
        field29++;
        this.field33 = 0;
        if (arg0 != 70) {
            this.field30 = 50;
        }
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
    public final void method16(int arg0) {
        this.field19 = this.field26;
        this.field28 >>= 0x4;
        field21++;
        if (this.field28 < 0) {
            this.field28 = 0;
        } else if (this.field28 > 255) {
            this.field28 = 255;
        }
        this.method11((byte) this.field28, this.field33++, (byte) 103);
        if (arg0 == 8217) {
            this.field28 = 0;
        }
    }
}
