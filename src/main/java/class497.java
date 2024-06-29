import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class497 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    private int field6937 = 0;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    private int field6943 = 4;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public int field6946 = 4;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "[S")
    private short[] field6942 = new short[512];

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    private int field6950 = 4;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    private int field6947 = 4;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field6940 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field6944 = -1;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[S")
    private short[] field6938;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method2892(int arg0) {
        field6940 = null;
        if (arg0 != 4095) {
            method2895(36, -2, 87);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public abstract void method766(int arg0);

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public abstract void method769(int arg0);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
    public final void method2893(int arg0, int arg1, int arg2, int arg3) {
        field6949++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg1];
        for (int var8 = arg2; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method766(-87);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field6946; var14++) {
                        int var15 = this.field6938[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = this.field6947 * var15 >> 12;
                        int var18 = this.field6943 * var15 >> 12;
                        int var19 = this.field6950 * var15 >> 12;
                        int var20 = var7[var11] * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field6943 * var21;
                        int var23 = this.field6950 * var16;
                        int var24 = this.field6947 * var20;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var19 > var29) {
                            var33 = var29 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var24 & 0xFFF;
                        int var35 = var30 & 0xFF;
                        int var36;
                        if (var26 >= var18) {
                            var36 = 0;
                        } else {
                            var36 = var26 & 0xFF;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38;
                        if (var17 > var32) {
                            var38 = var32 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var23 & 0xFFF;
                        int var40 = class258.field3533[var34];
                        short var41 = this.field6942[var38];
                        int var42 = class258.field3533[var39];
                        int var43 = var34 - 4096;
                        int var44 = class258.field3533[var37];
                        int var45 = var37 - 4096;
                        short var46 = this.field6942[var35];
                        int var47 = var39 - 4096;
                        short var48 = this.field6942[var31 + var41];
                        short var49 = this.field6942[var33 + var46];
                        short var50 = this.field6942[var33 + var41];
                        short var51 = this.field6942[var31 + var46];
                        int var52 = class312.method1832(this.field6942[var28 + var51], var39, (byte) -34, var34, var37);
                        int var53 = class312.method1832(this.field6942[var36 + var51], var39, (byte) -34, var34, var45);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class312.method1832(this.field6942[var28 + var49], var47, (byte) -34, var34, var37);
                        int var56 = class312.method1832(this.field6942[var36 + var49], var47, (byte) -34, var34, var45);
                        int var57 = var55 + ((var56 - var55) * var44 >> 12);
                        int var58 = class312.method1832(this.field6942[var28 + var48], var39, (byte) -34, var43, var37);
                        int var59 = ((var57 - var54) * var42 >> 12) + var54;
                        int var60 = class312.method1832(this.field6942[var36 + var48], var39, (byte) -34, var43, var45);
                        int var61 = ((var60 - var58) * var44 >> 12) + var58;
                        int var62 = class312.method1832(this.field6942[var28 + var50], var47, (byte) -34, var43, var37);
                        int var63 = class312.method1832(this.field6942[var36 + var50], var47, (byte) -34, var43, var45);
                        int var64 = var62 + ((var63 - var62) * var44 >> 12);
                        int var65 = ((var64 - var61) * var42 >> 12) + var61;
                        this.method768(-1, var14, ((var65 - var59) * var40 >> 12) + var59);
                    }
                    this.method769(arg2 - 119);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public abstract void method768(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lr;I)V")
    public static final void method2894(class165 arg0, int arg1) {
        field6939++;
        if (class172.field2099 != class206.field2472.field532 && arg1 == -1079213620 && class281.field3808 != null && class445.method2629(class206.field2472.field532, -32596, arg0)) {
            class172.field2099 = class206.field2472.field532;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
    public static final void method2895(int arg0, int arg1, int arg2) {
        field6941++;
        if (arg1 < 53) {
            method2894(null, 123);
        }
        class233 var3 = class7.method44(arg0, 7, -1);
        var3.method1422(0);
        var3.field3114 = arg2;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
    public static final void method2896(int arg0, int arg1, int arg2) {
        field6951++;
        if (arg1 == 615032972) {
            class498.method2899(arg2, arg0, -74);
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    private final void method2897(int arg0) {
        field6945++;
        this.field6938 = new short[this.field6946];
        if (arg0 != 2) {
            method2892(81);
        }
        for (int var2 = 0; var2 < this.field6946; var2++) {
            this.field6938[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    private final void method2898(int arg0) {
        field6948++;
        Random var2 = new Random((long) this.field6937);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field6942[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class517.method3062(var2, 26100, var5);
            short var7 = this.field6942[var6];
            this.field6942[var6] = this.field6942[var5];
            this.field6942[var5] = this.field6942[var5 + 256] = var7;
        }
        if (arg0 != -256) {
            this.method768(-99, 71, -61);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIII)V")
    public class497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6943 = arg2;
        this.field6937 = arg0;
        this.field6946 = arg1;
        this.field6950 = arg3;
        this.field6947 = arg4;
        this.method2897(2);
        this.method2898(-256);
    }
}
