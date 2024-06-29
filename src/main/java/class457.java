import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class457 extends class271 {

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    private int field6332;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    private int field6320;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    private int field6334;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    private int field6323;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public static int field6330 = -1;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "Llga;")
    public static class712 field6321 = new class712(43, 7);

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
    private int field6322;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
    private int field6325;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    private int field6328;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "I")
    private int field6333;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "[B")
    private byte[] field6326;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)V")
    public final void method1619(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.field6333 = this.field6320 - (arg1 < 0 ? -arg1 : arg1);
            this.field6325 = 4096;
            this.field6333 = this.field6333 * this.field6333 >> 12;
            this.field6328 = this.field6333;
        } else {
            this.field6325 = this.field6333 * this.field6332 >> 12;
            if (this.field6325 < 0) {
                this.field6325 = 0;
            } else if (this.field6325 > 4096) {
                this.field6325 = 4096;
            }
            this.field6333 = this.field6320 - (arg1 >= 0 ? arg1 : -arg1);
            this.field6333 = this.field6333 * this.field6333 >> 12;
            this.field6333 = this.field6333 * this.field6325 >> 12;
            this.field6328 += this.field6333 * this.field6323 >> 12;
            this.field6323 = this.field6334 * this.field6323 >> 12;
        }
        field6329++;
        if (arg2 != 255) {
            this.field6325 = -18;
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
    public final void method1621(int arg0) {
        this.field6328 >>= 0x4;
        field6331++;
        this.field6323 = this.field6334;
        if (this.field6328 < 0) {
            this.field6328 = 0;
        } else if (this.field6328 > 255) {
            this.field6328 = 255;
        }
        this.method65(this.field6322++, 64, (byte) this.field6328);
        this.field6328 = arg0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public final void method1617(int arg0) {
        this.field6322 = 0;
        if (arg0 != 751943489) {
            method2551(-60);
        }
        this.field6328 = 0;
        field6335++;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIILac;Z[BI)Liaa;")
    public static final class495 method2550(int arg0, int arg1, int arg2, int arg3, class541 arg4, boolean arg5, byte[] arg6, int arg7) {
        if (arg2 != 14764) {
            method2551(-123);
        }
        field6324++;
        if (!arg4.field7637 && (!class143.method891(arg7, 0) || !class143.method891(arg1, 0))) {
            return arg4.field7589 ? new class495(arg4, 34037, arg3, arg7, arg1, arg5, arg6, arg0) : new class495(arg4, arg3, arg7, arg1, class128.method814(423660257, arg7), class128.method814(423660257, arg1), arg6, arg0);
        } else {
            return new class495(arg4, 3553, arg3, arg7, arg1, arg5, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIB)V")
    public void method65(int arg0, int arg1, byte arg2) {
        int var4 = 102 / ((arg1 + 46) / 44);
        field6327++;
        this.field6326[arg0] = arg2;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class457(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6332 = (int) (arg7 * 4096.0F);
        this.field6320 = (int) (arg6 * 4096.0F);
        this.field6323 = this.field6334 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)V")
    public static void method2551(int arg0) {
        field6321 = null;
        int var1 = 51 % ((-arg0 - 16) / 40);
    }
}
