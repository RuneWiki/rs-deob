import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class475 extends class739 {

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    private int field6392 = 4;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    private int field6391 = 4;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "[I")
    public static int[] field6393 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "[F")
    public static float[] field6396 = new float[4];

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "Lnd;")
    public static class547 field6389;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IC)I", line = 3)
    public static final int method2716(int arg0, char arg1) {
        ++field6395;
        return arg1 >= arg0 && ~arg1 > ~class580.field8115.length ? class580.field8115[arg1] : -1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lsl;II)V", line = 17)
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field6391 = arg0.method2600((byte) -128);
            }
        } else {
            this.field6392 = arg0.method2600((byte) -125);
        }
        if (arg2 != -3) {
            this.method223((byte) -69, -115);
        }
        ++field6400;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[I", line = 56)
    public final int[] method215(int arg0, int arg1) {
        ++field6398;
        int[] var3 = super.field10311.method2116(arg1, (byte) 83);
        if (super.field10311.field4728) {
            int var4 = class29.field523 / this.field6392;
            int var5 = class549.field7672 / this.field6391;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method4115(arg0 + 23230, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method4115(arg0 + 23227, class549.field7672 * var7 / var5, 0);
            }
            for (int var8 = 0; class29.field523 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class29.field523 * var9 / var4];
                }
            }
        }
        if (arg0 != -23347) {
            this.field6391 = 98;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 115)
    public class475() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 122)
    public static void method2717(byte arg0) {
        field6389 = null;
        if (arg0 < 26) {
            method2717((byte) -118);
        }
        field6396 = null;
        field6393 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)[[I", line = 134)
    public final int[][] method223(byte arg0, int arg1) {
        ++field6399;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (super.field10312.field4922) {
            int var4 = class29.field523 / this.field6392;
            int var5 = class549.field7672 / this.field6391;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method4119(2, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method4119(2, 0, class549.field7672 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class29.field523; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class29.field523 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return arg0 < 26 ? null : var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIB)I", line = 209)
    public static final int method2718(int arg0, int arg1, int arg2, byte arg3) {
        ++field6394;
        if (arg0 == arg1) {
            return arg1;
        } else {
            int var4 = -arg2 + 128;
            int var5 = (arg1 & 127) * var4 - -((127 & arg0) * arg2) >> 7;
            int var6 = (arg0 & 896) * arg2 + (arg1 & 896) * var4 >> 7;
            if (arg3 < 86) {
                return 39;
            } else {
                int var7 = (arg0 & 64512) * arg2 + (arg1 & 64512) * var4 >> 7;
                return 64512 & var7 | var6 & 896 | var5 & 127;
            }
        }
    }
}
