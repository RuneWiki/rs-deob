import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class323 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    private int field4491 = 4;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public int field4489 = 4;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    private int field4497 = 4;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "[S")
    private short[] field4498 = new short[512];

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    private int field4503 = 4;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    private int field4501 = 0;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Z")
    public static boolean field4495 = false;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "[I")
    public static int[] field4499 = new int[13];

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "[S")
    private short[] field4493;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method1928(byte arg0) {
        if (arg0 > 30) {
            field4499 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILek;)Lnda;")
    public static final class654 method1929(int arg0, class465 arg1) {
        if (arg0 < 80) {
            field4490 = 79;
        }
        field4494++;
        return new class654(arg1.method2744(-1), arg1.method2744(-1), arg1.method2744(-1), arg1.method2744(-1), arg1.method2714(true), arg1.method2714(true), arg1.method2705(-71));
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIB)V")
    public abstract void method1930(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public abstract void method1931(int arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILis;Lf;ILua;II)V")
    public static final void method1932(int arg0, int arg1, class101 arg2, class257 arg3, int arg4, class591 arg5, int arg6, int arg7) {
        field4500++;
        if (arg3 == null) {
            return;
        }
        int var8;
        if (class40.field544 == 4) {
            var8 = (int) class473.field6790 & 0x3FFF;
        } else {
            var8 = (int) class473.field6790 + class419.field5957 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field1604 / 2, arg2.field1651 / 2) + 10;
        int var10 = arg0 * arg0 + (arg4 * arg4);
        if (var9 * var9 < var10) {
            return;
        }
        if (arg6 != 15663) {
            field4495 = false;
        }
        int var11 = class302.field4241[var8];
        int var12 = class302.field4242[var8];
        if (class40.field544 != 4) {
            var12 = var12 * 256 / (class239.field3523 + 256);
            var11 = var11 * 256 / (class239.field3523 + 256);
        }
        int var13 = arg0 * var12 + arg4 * var11 >> 14;
        int var14 = arg4 * var12 - (arg0 * var11) >> 14;
        arg3.method4(arg2.field1604 / 2 + var13 + arg1 - (arg3.method11() / 2), arg2.field1651 / 2 + -var14 + arg7 - arg3.method9() / 2, arg5, arg1, arg7);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
    private final void method1933(boolean arg0) {
        if (!arg0) {
            this.method1937(-95);
        }
        field4502++;
        Random var2 = new Random((long) this.field4501);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4498[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class357.method2154(var2, var5, Integer.MIN_VALUE);
            short var7 = this.field4498[var6];
            this.field4498[var6] = this.field4498[var5];
            this.field4498[var5] = this.field4498[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    private final void method1934(int arg0) {
        field4492++;
        if (arg0 != 1230406316) {
            this.method1930(-31, -119, (byte) -17);
        }
        this.field4493 = new short[this.field4489];
        for (int var2 = 0; var2 < this.field4489; var2++) {
            this.field4493[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILga;)V")
    public static final void method1935(int arg0, int arg1, int arg2, class63 arg3) {
        class119.field1958[arg1][arg2] = arg3;
        if (arg0 != 0) {
            field4495 = true;
        }
        field4496++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZ)V")
    public final void method1936(int arg0, int arg1, int arg2, boolean arg3) {
        field4488++;
        if (arg3) {
            this.method1933(false);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method1937(14);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field4489; var14++) {
                        int var15 = this.field4493[var14] << 12;
                        int var16 = this.field4503 * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field4491 * var15 >> 12;
                        int var19 = this.field4497 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field4497 * var17;
                        int var23 = this.field4503 * var21;
                        int var24 = this.field4491 * var20;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var30 & 0xFF;
                        int var34 = var24 & 0xFFF;
                        int var35 = var22 & 0xFFF;
                        int var36 = var23 & 0xFFF;
                        int var37;
                        if (var19 <= var26) {
                            var37 = 0;
                        } else {
                            var37 = var26 & 0xFF;
                        }
                        int var38;
                        if (var32 >= var16) {
                            var38 = 0;
                        } else {
                            var38 = var32 & 0xFF;
                        }
                        int var39;
                        if (var29 < var18) {
                            var39 = var29 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = var34 - 4096;
                        int var41 = class6.field50[var36];
                        short var42 = this.field4498[var33];
                        int var43 = var35 - 4096;
                        int var44 = class6.field50[var35];
                        int var45 = var36 - 4096;
                        int var46 = class6.field50[var34];
                        short var47 = this.field4498[var38];
                        short var48 = this.field4498[var39 + var47];
                        short var49 = this.field4498[var31 + var47];
                        short var50 = this.field4498[var39 + var42];
                        short var51 = this.field4498[var31 + var42];
                        int var52 = class522.method3080(var34, var35, this.field4498[var28 + var51], var36, 0);
                        int var53 = class522.method3080(var34, var43, this.field4498[var37 + var51], var36, 0);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class522.method3080(var40, var35, this.field4498[var28 + var50], var36, 0);
                        int var56 = class522.method3080(var40, var43, this.field4498[var37 + var50], var36, 0);
                        int var57 = var55 + ((var56 - var55) * var44 >> 12);
                        int var58 = class522.method3080(var34, var35, this.field4498[var28 + var49], var45, 0);
                        int var59 = ((var57 - var54) * var46 >> 12) + var54;
                        int var60 = class522.method3080(var34, var43, this.field4498[var37 + var49], var45, 0);
                        int var61 = ((var60 - var58) * var44 >> 12) + var58;
                        int var62 = class522.method3080(var40, var35, this.field4498[var28 + var48], var45, 0);
                        int var63 = class522.method3080(var40, var43, this.field4498[var37 + var48], var45, 0);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var46 >> 12) + var61;
                        this.method1930(((var65 - var59) * var41 >> 12) + var59, var14, (byte) -43);
                    }
                    this.method1931(84);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public abstract void method1937(int arg0);

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIII)V")
    public class323(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4497 = arg2;
        this.field4489 = arg1;
        this.field4503 = arg4;
        this.field4501 = arg0;
        this.field4491 = arg3;
        this.method1934(1230406316);
        this.method1933(true);
    }
}
