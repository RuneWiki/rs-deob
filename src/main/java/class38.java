import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class38 extends class30 {

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    private int field480 = 4;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    private int field487 = 4;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "Z")
    public static boolean field482 = false;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "Ljava/lang/String;")
    public static String field491 = "M";

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILmo;Lmo;Z)V")
    public static final void method258(int arg0, class447 arg1, class447 arg2, boolean arg3) {
        class68.field857 = arg3;
        class120.field1639 = arg2;
        class9.field110 = arg1;
        if (arg0 == 0) {
            ++field489;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field490;
        int[] var3 = super.field371.method2367((byte) 109, arg0);
        if (super.field371.field5586) {
            int var4 = class369.field5610 / this.field480;
            int var5 = class312.field4921 / this.field487;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method210((byte) 30, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method210((byte) 46, 0, class312.field4921 * var7 / var5);
            }
            for (int var8 = 0; ~var8 > ~class369.field5610; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class369.field5610 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return arg1 <= 49 ? null : var3;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V")
    public static void method259(int arg0) {
        if (arg0 != 0) {
            method260(89, 125);
        }
        field491 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public static final void method260(int arg0, int arg1) {
        ++field488;
        class8.field106.method337(arg1, (byte) -109);
        if (arg0 != 0) {
            field485 = 21;
        }
        class223.field3715.method337(arg1, (byte) -108);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method261(int arg0, boolean arg1, Object arg2) {
        ++field481;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class264.method1806(-114, var3) : var3;
        } else if (arg2 instanceof class107) {
            class107 var4 = (class107) arg2;
            return var4.method80((byte) 22);
        } else {
            if (arg0 >= -86) {
                field491 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        ++field484;
        if (arg0 != -93) {
            this.field480 = 19;
        }
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int var4 = class369.field5610 / this.field480;
            int var5 = class312.field4921 / this.field487;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method206(0, 2, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method206(class312.field4921 * var7 / var5, 2, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class369.field5610; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class369.field5610 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field487 = arg0.method1322(false);
            }
        } else {
            this.field480 = arg0.method1322(false);
        }
        ++field486;
        if (arg1 != 6456) {
            method258(8, (class447) null, (class447) null, true);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)Lop;")
    public static final class101 method262(int arg0, int arg1, int arg2) {
        class232 var3 = class423.field6252[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class101 var4 = var3.field3860;
            var3.field3860 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class38() {
        super(1, false);
    }
}
