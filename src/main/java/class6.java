import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class6 {

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    private int field44 = 4;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    private int field48 = 4;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    private int field51 = 4;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public int field55 = 4;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "[S")
    private short[] field56 = new short[512];

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    private int field45 = 0;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field42 = 100;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "Z")
    public static boolean field52 = true;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "Lph;")
    public static class114 field49 = new class114(8);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "Leo;")
    public static class267 field59;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "[S")
    private short[] field47;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI)V")
    public abstract void method23(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public abstract void method24(int arg0);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
    private final void method25(int arg0) {
        this.field47 = new short[this.field55];
        if (arg0 == 255) {
            field43++;
            for (int var2 = 0; var2 < this.field55; var2++) {
                this.field47[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public static void method26(byte arg0) {
        field49 = null;
        field59 = null;
        if (arg0 != -13) {
            field59 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
    public final void method27(int arg0, int arg1, int arg2, int arg3) {
        field58++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg3; var7++) {
            var5[var7] = (var7 << 12) / arg3;
        }
        int[] var8 = new int[arg2];
        int var9 = 2 / ((arg0 + 48) / 63);
        for (int var10 = 0; var10 < arg1; var10++) {
            var6[var10] = (var10 << 12) / arg1;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            var8[var11] = (var11 << 12) / arg2;
        }
        this.method29(0);
        for (int var12 = 0; var12 < arg2; var12++) {
            for (int var13 = 0; var13 < arg1; var13++) {
                for (int var14 = 0; var14 < arg3; var14++) {
                    for (int var15 = 0; var15 < this.field55; var15++) {
                        int var16 = this.field47[var15] << 12;
                        int var17 = this.field51 * var16 >> 12;
                        int var18 = var8[var12] * var16 >> 12;
                        int var19 = this.field44 * var16 >> 12;
                        int var20 = this.field48 * var16 >> 12;
                        int var21 = var6[var13] * var16 >> 12;
                        int var22 = var5[var14] * var16 >> 12;
                        int var23 = this.field48 * var21;
                        int var24 = this.field51 * var22;
                        int var25 = this.field44 * var18;
                        int var26 = var24 >> 12;
                        int var27 = var26 + 1;
                        int var28 = var23 >> 12;
                        int var29 = var26 & 0xFF;
                        int var30 = var28 + 1;
                        int var31 = var28 & 0xFF;
                        int var32 = var25 >> 12;
                        int var33 = var32 + 1;
                        int var34;
                        if (var19 > var33) {
                            var34 = var33 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var25 & 0xFFF;
                        int var36 = var24 & 0xFFF;
                        int var37 = var32 & 0xFF;
                        int var38 = var23 & 0xFFF;
                        int var39;
                        if (var30 >= var20) {
                            var39 = 0;
                        } else {
                            var39 = var30 & 0xFF;
                        }
                        int var40;
                        if (var27 < var17) {
                            var40 = var27 & 0xFF;
                        } else {
                            var40 = 0;
                        }
                        int var41 = class349.field4856[var38];
                        int var42 = class349.field4856[var36];
                        int var43 = var35 - 4096;
                        int var44 = class349.field4856[var35];
                        int var45 = var36 - 4096;
                        int var46 = var38 - 4096;
                        short var47 = this.field56[var34];
                        short var48 = this.field56[var37];
                        short var49 = this.field56[var39 + var47];
                        short var50 = this.field56[var31 + var48];
                        short var51 = this.field56[var39 + var48];
                        short var52 = this.field56[var31 + var47];
                        int var53 = class127.method688(var35, this.field56[var29 + var50], var38, var36, 1);
                        int var54 = class127.method688(var35, this.field56[var40 + var50], var38, var45, 1);
                        int var55 = ((var54 - var53) * var42 >> 12) + var53;
                        int var56 = class127.method688(var35, this.field56[var29 + var51], var46, var36, 1);
                        int var57 = class127.method688(var35, this.field56[var40 + var51], var46, var45, 1);
                        int var58 = ((var57 - var56) * var42 >> 12) + var56;
                        int var59 = class127.method688(var43, this.field56[var29 + var52], var38, var36, 1);
                        int var60 = ((var58 - var55) * var41 >> 12) + var55;
                        int var61 = class127.method688(var43, this.field56[var40 + var52], var38, var45, 1);
                        int var62 = ((var61 - var59) * var42 >> 12) + var59;
                        int var63 = class127.method688(var43, this.field56[var29 + var49], var46, var36, 1);
                        int var64 = class127.method688(var43, this.field56[var40 + var49], var46, var45, 1);
                        int var65 = ((var64 - var63) * var42 >> 12) + var63;
                        int var66 = ((var65 - var62) * var41 >> 12) + var62;
                        this.method23(var15, (byte) -77, ((var66 - var60) * var44 >> 12) + var60);
                    }
                    this.method24(25020);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
    private final void method28(int arg0) {
        field50++;
        if (arg0 != -256) {
            this.field47 = null;
        }
        Random var2 = new Random((long) this.field45);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field56[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class409.method2546(18992, var2, var5);
            short var7 = this.field56[var6];
            this.field56[var6] = this.field56[var5];
            this.field56[var5] = this.field56[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
    public abstract void method29(int arg0);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)Lce;")
    public static final class345 method30(byte arg0, int arg1) {
        field53++;
        class114 var2 = class180.field2253;
        class345 var3;
        synchronized (class180.field2253) {
            var3 = (class345) class180.field2253.method616(-97, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg0 >= -62) {
            field46 = -66;
        }
        byte[] var4 = class229.field3161.method1687(class70.method403((byte) -47, arg1), class293.method1728((byte) 97, arg1), 255);
        class345 var5 = new class345();
        var5.field4648 = arg1;
        if (var4 != null) {
            var5.method2021(new class250(var4), 4);
        }
        var5.method2024(false);
        class114 var6 = class180.field2253;
        synchronized (class180.field2253) {
            class180.field2253.method615((byte) -120, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(IIIII)V")
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field44 = arg4;
        this.field45 = arg0;
        this.field48 = arg3;
        this.field55 = arg1;
        this.field51 = arg2;
        this.method25(255);
        this.method28(-256);
    }
}
