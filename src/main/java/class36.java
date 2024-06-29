import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class36 extends class67 {

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public static int field421 = -2;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "[J")
    public static long[] field424 = new long[32];

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "[B")
    private byte[] field436;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 5)
    public static void method210(byte arg0) {
        field424 = null;
        if (arg0 != -87) {
            field421 = 38;
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)I", line = 22)
    public static final int method211(int arg0) {
        field426++;
        return arg0 == 25936 ? class285.field4489.method1240(-4070) : -28;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V", line = 33)
    public final void method212(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field428 = 4096;
            this.field422 = this.field438 - (arg0 >= 0 ? arg0 : -arg0);
            this.field422 = this.field422 * this.field422 >> 12;
            this.field435 = this.field422;
        } else {
            this.field428 = this.field427 * this.field422 >> 12;
            if (this.field428 < 0) {
                this.field428 = 0;
            } else if (this.field428 > 4096) {
                this.field428 = 4096;
            }
            this.field422 = this.field438 - (arg0 >= 0 ? arg0 : -arg0);
            this.field422 = this.field422 * this.field422 >> 12;
            this.field422 = this.field428 * this.field422 >> 12;
            this.field435 += this.field431 * this.field422 >> 12;
            this.field431 = this.field432 * this.field431 >> 12;
        }
        if (arg2 < 44) {
            method210((byte) -103);
        }
        field437++;
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)V", line = 72)
    public final void method213(int arg0) {
        field429++;
        this.field435 = 0;
        if (arg0 <= 69) {
            this.method216(95, (byte) -101);
        }
        this.field423 = 0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 84)
    public final void method214(int arg0) {
        this.field435 >>= 0x4;
        field425++;
        this.field431 = this.field432;
        if (this.field435 < 0) {
            this.field435 = 0;
        } else if (this.field435 > 255) {
            this.field435 = 255;
        }
        if (arg0 <= -48) {
            this.method216(this.field423++, (byte) this.field435);
            this.field435 = 0;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V", line = 106)
    public static final void method215(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class109.field1494 = arg1;
        class56.field678 = arg2;
        field430++;
        class272.field4273 = arg3;
        if (arg4 != 4096) {
            field421 = 83;
        }
        class248.field3759 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V", line = 121)
    public void method216(int arg0, byte arg1) {
        field434++;
        this.field436[arg0] = arg1;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBLlc;I)Laf;", line = 132)
    public static final class189 method217(int arg0, byte arg1, class175 arg2, int arg3) {
        field433++;
        int var4 = -66 / ((-arg1 - 26) / 55);
        return class304.method2132((byte) -76, arg0, arg3, arg2) ? class318.method2214(0) : null;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIIFFF)V", line = 145)
    public class36(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field427 = (int) (arg7 * 4096.0F);
        this.field438 = (int) (arg6 * 4096.0F);
        this.field431 = this.field432 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
