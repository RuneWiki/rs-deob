import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class120 extends class747 {

    @OriginalMember(owner = "client!qda", name = "I", descriptor = "I")
    private int field1578 = 20;

    @OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
    private int field1577 = 0;

    @OriginalMember(owner = "client!qda", name = "M", descriptor = "I")
    private int field1582 = 0;

    @OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
    private int field1574 = 1365;

    @OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
    public static int field1576 = 0;

    @OriginalMember(owner = "client!qda", name = "L", descriptor = "[I")
    public static int[] field1581 = new int[1000];

    @OriginalMember(owner = "client!qda", name = "F", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!qda", name = "J", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!qda", name = "K", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V")
    public static void method748(int arg0) {
        field1581 = null;
        if (arg0 != 0) {
            method749(-76, -6, 0.13809544F, 0.24456578F, -0.4088814F, 107, 0.707961F, 117, 82, (class533) null, 2.2007704F);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIFFFIFIILkt;F)[B")
    public static final byte[] method749(int arg0, int arg1, float arg2, float arg3, float arg4, int arg5, float arg6, int arg7, int arg8, class533 arg9, float arg10) {
        ++field1580;
        if (arg1 != -25377) {
            method749(-32, -33, 0.9023875F, 0.45338222F, -0.3817359F, -22, 0.38189566F, -92, -24, (class533) null, 0.9398397F);
        }
        byte[] var11 = new byte[arg0 * arg7 * arg8];
        class303.method1996(arg3, arg5, 0, arg6, arg7, true, arg2, arg9, arg10, arg0, arg4, arg8, var11);
        return var11;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        ++field1575;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (arg1 > -89) {
            this.method182(-69, 103);
        }
        if (super.field10279.field8263) {
            for (int var4 = 0; ~var4 > ~class73.field1095; ++var4) {
                int var5 = (class639.field8571[var4] << 12) / this.field1574 + this.field1582;
                int var6 = (class515.field7103[arg0] << 12) / this.field1574 + this.field1577;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && var13 < this.field1578) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - -var7 + -var12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field1578 + -1 > var13 ? (var13 << 12) / this.field1578 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
    public class120() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field1579;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field1577 = arg0.method482(-772591672);
                    }
                } else {
                    this.field1582 = arg0.method482(-772591672);
                }
            } else {
                this.field1578 = arg0.method482(-772591672);
            }
        } else {
            this.field1574 = arg0.method482(-772591672);
        }
        if (arg1 != 11608) {
            method749(-31, -45, 0.59867984F, -1.6819601F, 2.041643F, 44, -0.3665192F, 9, 117, (class533) null, -1.1083788F);
        }
    }
}
