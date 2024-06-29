import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class298 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public int field4381 = 4;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    private int field4382 = 4;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    private int field4379 = 4;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    private int field4383 = 0;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    private int field4388 = 4;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[S")
    private short[] field4393 = new short[512];

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field4389 = 0;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4387 = 0;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "F")
    public static float field4391;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4380;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[S")
    private short[] field4385;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1855(int arg0) {
        int var1 = -89 / ((5 - arg0) / 44);
        field4384++;
        class170.field2401.method619(class129.field1858, class644.field9279, class629.field9109);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIIII)V", line = 26)
    public static final void method1856(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4378++;
        if (arg0 <= -65 && arg3 >= class175.field2455 && arg3 <= class375.field5631) {
            int var5 = class79.method461((byte) 98, class148.field2106, arg4, class323.field4704);
            int var6 = class79.method461((byte) 127, class148.field2106, arg2, class323.field4704);
            class14.method97(arg3, 0, var6, arg1, var5);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIII)V", line = 310)
    public class298(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4381 = arg1;
        this.field4388 = arg3;
        this.field4382 = arg4;
        this.field4379 = arg2;
        this.field4383 = arg0;
        this.method1860(2);
        this.method1859((byte) -121);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V", line = 48)
    public final void method1858(int arg0, int arg1, int arg2, int arg3) {
        field4386++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg3];
        for (int var8 = arg2; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method1857(false);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field4381; var14++) {
                        int var15 = this.field4385[var14] << 12;
                        int var16 = this.field4382 * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = this.field4379 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field4388 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field4388 * var19;
                        int var23 = this.field4379 * var21;
                        int var24 = this.field4382 * var17;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var16 <= var32) {
                            var33 = 0;
                        } else {
                            var33 = var32 & 0xFF;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var20 > var29) {
                            var35 = var29 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37 = var31 & 0xFF;
                        int var38;
                        if (var26 >= var18) {
                            var38 = 0;
                        } else {
                            var38 = var26 & 0xFF;
                        }
                        int var39 = var24 & 0xFFF;
                        short var40 = this.field4393[var37];
                        int var41 = class471.field6785[var36];
                        short var42 = this.field4393[var33];
                        int var43 = var39 - 4096;
                        int var44 = var34 - 4096;
                        int var45 = class471.field6785[var34];
                        int var46 = var36 - 4096;
                        int var47 = class471.field6785[var39];
                        short var48 = this.field4393[var30 + var42];
                        short var49 = this.field4393[var35 + var42];
                        short var50 = this.field4393[var35 + var40];
                        short var51 = this.field4393[var30 + var40];
                        int var52 = class473.method2725(var39, var36, this.field4393[var27 + var51], var34, (byte) 44);
                        int var53 = class473.method2725(var39, var36, this.field4393[var38 + var51], var44, (byte) -126);
                        int var54 = var52 + ((var53 - var52) * var45 >> 12);
                        int var55 = class473.method2725(var39, var46, this.field4393[var27 + var50], var34, (byte) 116);
                        int var56 = class473.method2725(var39, var46, this.field4393[var38 + var50], var44, (byte) -126);
                        int var57 = var55 + ((var56 - var55) * var45 >> 12);
                        int var58 = class473.method2725(var43, var36, this.field4393[var27 + var48], var34, (byte) 109);
                        int var59 = var54 + ((var57 - var54) * var41 >> 12);
                        int var60 = class473.method2725(var43, var36, this.field4393[var38 + var48], var44, (byte) -96);
                        int var61 = ((var60 - var58) * var45 >> 12) + var58;
                        int var62 = class473.method2725(var43, var46, this.field4393[var27 + var49], var34, (byte) 70);
                        int var63 = class473.method2725(var43, var46, this.field4393[var38 + var49], var44, (byte) -109);
                        int var64 = ((var63 - var62) * var45 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var41 >> 12);
                        this.method1854(var14, 33, var59 + ((var65 - var59) * var47 >> 12));
                    }
                    this.method1862((byte) -112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 223)
    private final void method1859(byte arg0) {
        field4390++;
        Random var2 = new Random((long) this.field4383);
        if (arg0 != -121) {
            this.method1862((byte) -14);
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4393[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class339.method2095(true, var2, var5);
            short var7 = this.field4393[var6];
            this.field4393[var6] = this.field4393[var5];
            this.field4393[var5] = this.field4393[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 263)
    private final void method1860(int arg0) {
        field4392++;
        this.field4385 = new short[this.field4381];
        int var2 = 0;
        if (arg0 == 2) {
            while (var2 < this.field4381) {
                this.field4385[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                var2++;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 284)
    public static void method1861(int arg0) {
        field4380 = null;
        if (arg0 != -21661) {
            field4389 = -119;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public abstract void method1854(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public abstract void method1857(boolean arg0);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public abstract void method1862(byte arg0);
}
