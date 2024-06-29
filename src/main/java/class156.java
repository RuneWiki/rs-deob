import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class156 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    private int field2539 = 4;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "[S")
    private short[] field2532 = new short[512];

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    private int field2533 = 0;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    private int field2544 = 4;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public int field2546 = 4;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    private int field2537 = 4;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2536 = 0;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static volatile int field2531 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lld;")
    public static class54 field2541;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "[S")
    private short[] field2545;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 5)
    public static void method1005(int arg0) {
        if (arg0 != -16251) {
            field2531 = -91;
        }
        field2541 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)V", line = 26)
    public final void method1006(int arg0, int arg1, int arg2, int arg3) {
        field2535++;
        if (arg0 != 1023) {
            method1008(true, (class106) null);
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method493((byte) -85);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field2546; var14++) {
                        int var15 = this.field2545[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = this.field2539 * var15 >> 12;
                        int var18 = this.field2544 * var15 >> 12;
                        int var19 = this.field2539 * var16;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field2544 * var21;
                        int var23 = this.field2537 * var20;
                        int var24 = var22 >> 12;
                        int var25 = var23 >> 12;
                        int var26 = var22 & 0xFFF;
                        int var27 = var26 - 4096;
                        int var28 = var24 + 1;
                        int var29;
                        if (var28 < var18) {
                            var29 = var28 & 0xFF;
                        } else {
                            var29 = 0;
                        }
                        int var30 = class87.field1639[var26];
                        int var31 = var25 + 1;
                        int var32 = this.field2537 * var15 >> 12;
                        int var33 = var19 >> 12;
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var31 >= var32) {
                            var35 = 0;
                        } else {
                            var35 = var31 & 0xFF;
                        }
                        int var36 = var25 & 0xFF;
                        int var37 = var34 - 4096;
                        int var38 = var33 + 1;
                        int var39 = var33 & 0xFF;
                        int var40 = class87.field1639[var34];
                        short var41 = this.field2532[var29];
                        short var42 = this.field2532[var36 + var41];
                        int var43 = var19 & 0xFFF;
                        int var44 = var24 & 0xFF;
                        int var45 = class87.field1639[var43];
                        int var46;
                        if (var17 <= var38) {
                            var46 = 0;
                        } else {
                            var46 = var38 & 0xFF;
                        }
                        int var47 = var43 - 4096;
                        short var48 = this.field2532[var44];
                        short var49 = this.field2532[var35 + var41];
                        short var50 = this.field2532[var36 + var48];
                        short var51 = this.field2532[var35 + var48];
                        int var52 = class169.method1075(0, this.field2532[var39 + var50], var26, var43, var34);
                        int var53 = class169.method1075(0, this.field2532[var46 + var50], var26, var47, var34);
                        int var54 = ((var53 - var52) * var45 >> 12) + var52;
                        int var55 = class169.method1075(0, this.field2532[var39 + var51], var26, var43, var37);
                        int var56 = class169.method1075(arg0 ^ 0x3FF, this.field2532[var46 + var51], var26, var47, var37);
                        int var57 = ((var56 - var55) * var45 >> 12) + var55;
                        int var58 = class169.method1075(arg0 ^ 0x3FF, this.field2532[var39 + var42], var27, var43, var34);
                        int var59 = ((var57 - var54) * var40 >> 12) + var54;
                        int var60 = class169.method1075(0, this.field2532[var42 + var46], var27, var47, var34);
                        int var61 = ((var60 - var58) * var45 >> 12) + var58;
                        int var62 = class169.method1075(0, this.field2532[var39 + var49], var27, var43, var37);
                        int var63 = class169.method1075(arg0 ^ 0x3FF, this.field2532[var46 + var49], var27, var47, var37);
                        int var64 = var62 + ((var63 - var62) * var45 >> 12);
                        int var65 = var61 + ((var64 - var61) * var40 >> 12);
                        this.method488(-850495892, var14, ((var65 - var59) * var30 >> 12) + var59);
                    }
                    this.method489(99);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILbm;Lbm;)I", line = 195)
    public static final int method1007(int arg0, class307 arg1, class307 arg2) {
        field2548++;
        int var3 = 0;
        if (arg1.method2051(92, class253.field3960)) {
            var3++;
        }
        if (arg1.method2051(-123, class321.field4895)) {
            var3++;
        }
        if (arg1.method2051(74, class169.field2724)) {
            var3++;
        }
        if (arg2.method2051(90, class253.field3960)) {
            var3++;
        }
        if (arg0 <= 46) {
            method1009(31, -35, -117, 31, 38, (byte) -7, -50, -5);
        }
        if (arg2.method2051(-126, class321.field4895)) {
            var3++;
        }
        if (arg2.method2051(42, class169.field2724)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZLmn;)V", line = 232)
    public static final void method1008(boolean arg0, class106 arg1) {
        class99.method657(arg1, (byte) -61, 200000);
        if (arg0) {
            field2540++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIII)V", line = 435)
    public class156(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2544 = arg4;
        this.field2537 = arg3;
        this.field2533 = arg0;
        this.field2546 = arg1;
        this.field2539 = arg2;
        this.method1012(0);
        this.method1011(3);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIBII)V", line = 254)
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field2543++;
        if (class165.method1056(arg3, (byte) 24)) {
            client.method348(class138.field2300[arg3], -1, arg1, arg4, arg6, arg7, arg2, arg0);
            if (arg5 < 85) {
                method1010(100, 30, (byte) -77, -97);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBI)I", line = 268)
    public static final int method1010(int arg0, int arg1, byte arg2, int arg3) {
        field2538++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        }
        if (arg2 != 29) {
            field2536 = 57;
        }
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 291)
    private final void method1011(int arg0) {
        field2529++;
        if (arg0 != 3) {
            this.field2546 = -33;
        }
        Random var2 = new Random((long) this.field2533);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2532[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class220.method1462(var2, -861395680, var5);
            short var7 = this.field2532[var6];
            this.field2532[var6] = this.field2532[var5];
            this.field2532[var5] = this.field2532[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 329)
    private final void method1012(int arg0) {
        this.field2545 = new short[this.field2546];
        for (int var2 = arg0; var2 < this.field2546; var2++) {
            this.field2545[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        field2549++;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 363)
    public static final void method1013(int arg0) {
        field2534++;
        class280.field4308.method1877(-29702);
        if (arg0 != 6153) {
            field2541 = (class54) null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V", line = 376)
    public static final void method1014(int arg0) {
        if (class158.field2580 != -1) {
            class130.method858(-1, class158.field2580);
        }
        for (int var1 = 0; var1 < class147.field2401; var1++) {
            if (class337.field5220[var1]) {
                class220.field3490[var1] = true;
            }
            class290.field4453[var1] = class337.field5220[var1];
            class337.field5220[var1] = false;
        }
        class50.field1011 = class25.field494;
        field2542++;
        if (class249.field3893) {
            class33.field660 = true;
        }
        class227.field3595 = null;
        class285.field4413 = -1;
        class23.field470 = -1;
        if (class158.field2580 != -1) {
            class147.field2401 = 0;
            class326.method2255(3018);
        }
        if (class249.field3893) {
            class115.method753();
        } else {
            class270.method1810();
        }
        if (arg0 == -461017140) {
            class176.field2836 = 0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public abstract void method489(int arg0);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public abstract void method493(byte arg0);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public abstract void method488(int arg0, int arg1, int arg2);
}
