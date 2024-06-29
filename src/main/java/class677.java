import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class677 extends class38 {

    @OriginalMember(owner = "client!lt", name = "M", descriptor = "I")
    private int field9422 = 32768;

    @OriginalMember(owner = "client!lt", name = "D", descriptor = "I")
    public static int field9413 = 0;

    @OriginalMember(owner = "client!lt", name = "E", descriptor = "I")
    public static int field9414 = 0;

    @OriginalMember(owner = "client!lt", name = "F", descriptor = "I")
    public static int field9415 = 0;

    @OriginalMember(owner = "client!lt", name = "H", descriptor = "[[F")
    public static float[][] field9417 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!lt", name = "G", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!lt", name = "J", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!lt", name = "K", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!lt", name = "L", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!lt", name = "N", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!lt", name = "O", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field9424;
        int[] var3 = super.field397.method1376(arg1, (byte) -4);
        if (arg0 >= -43) {
            field9413 = -21;
        }
        if (super.field397.field3005) {
            int[] var4 = this.method189(arg1, 1, (byte) -92);
            int[] var5 = this.method189(arg1, 2, (byte) -92);
            for (int var6 = 0; ~class729.field10216 < ~var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field9422 >> 12;
                int var9 = class89.field1268[var7] * var8 >> 12;
                int var10 = class149.field2330[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class554.field7909;
                int var12 = class619.field8708 & (var10 >> 12) + arg1;
                int[] var13 = this.method189(var12, 0, (byte) -92);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg0 < 34) {
            field9414 = 77;
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field388 = arg2.method3745(-6314) == 1;
            }
        } else {
            this.field9422 = arg2.method3712((byte) -109) << 4;
        }
        ++field9416;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
    public class677() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BIII)V")
    public static final void method3888(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 116) {
            field9413 = -67;
        }
        ++field9418;
        class150 var4 = class676.method3885(1000, 9, arg2);
        var4.method1116(arg0 + -54);
        var4.field2342 = arg1;
        var4.field2346 = arg3;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    public static final void method3889(int arg0) {
        ++field9421;
        class93.field1336.method809(true);
        class79.field1102.method809(true);
        if (arg0 == 1) {
            class255.field3668.method809(true);
            class528.field7528.method809(true);
        }
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)V")
    public static void method3890(int arg0) {
        int var1 = -65 % ((-67 - arg0) / 51);
        field9417 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljo;BLvd;Lvd;Lvd;Lvn;)Z")
    public static final boolean method3891(class336 arg0, byte arg1, class39 arg2, class39 arg3, class39 arg4, class313 arg5) {
        class9.field143 = arg3;
        class30.field306 = new int[16];
        class515.field7305 = arg5;
        class187.field2853 = arg4;
        ++field9423;
        class520.field7449 = arg0;
        class631.field8828 = arg2;
        for (int var6 = 0; ~var6 > -17; ++var6) {
            class30.field306[var6] = 255;
        }
        if (arg1 >= -90) {
            method3888((byte) 36, 87, 58, -105);
        }
        return true;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        ++field9420;
        if (arg0 <= 120) {
            this.method199((byte) -84, 58);
        }
        class417.method2634((byte) -118);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)[[I")
    public final int[][] method196(int arg0, int arg1) {
        ++field9419;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (arg0 != -18210) {
            this.method199((byte) 76, -126);
        }
        if (super.field387.field6792) {
            int[] var4 = this.method189(arg1, 1, (byte) -92);
            int[] var5 = this.method189(arg1, 2, (byte) -92);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class729.field10216; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field9422 >> 12;
                int var12 = class89.field1268[var10] * var11 >> 12;
                int var13 = class149.field2330[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class554.field7909;
                int var15 = (var13 >> 12) + arg1 & class619.field8708;
                int[][] var16 = this.method195(true, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
