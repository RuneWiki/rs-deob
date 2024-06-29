import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public abstract class class528 {

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "I")
    private int field7315 = 4;

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
    public int field7320 = 4;

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
    private int field7318 = 4;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "[S")
    private short[] field7327 = new short[512];

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
    private int field7326 = 0;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    private int field7329 = 4;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    public static int field7324 = 4;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "Lhca;")
    public static class244 field7319 = new class244();

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "[S")
    private short[] field7322;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIII)I")
    public static final int method3132(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field7317++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (arg2 == 4095) {
            return var4 == 2 ? 4095 - arg1 : -arg3 + 4095;
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZIIII)V")
    public static final void method3133(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field7316++;
        int var10 = arg4 + 1;
        class102.method675(arg0, -62, arg2, arg5, class538.field7454[arg4]);
        int var9 = arg3 - 1;
        class102.method675(arg0, -35, arg2, arg5, class538.field7454[arg3]);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class538.field7454[var6];
            var7[arg2] = var7[arg5] = arg0;
        }
        if (!arg1) {
            field7319 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    public static void method3134(int arg0) {
        if (arg0 == -1279307124) {
            field7319 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
    public abstract void method3135(boolean arg0);

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
    private final void method3136(byte arg0) {
        field7328++;
        if (arg0 <= 73) {
            return;
        }
        Random var2 = new Random((long) this.field7326);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field7327[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class434.method2677(var5, var2, (byte) -115);
            short var7 = this.field7327[var6];
            this.field7327[var6] = this.field7327[var5];
            this.field7327[var5] = this.field7327[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V")
    public abstract void method3137(byte arg0);

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILuv;)Luv;")
    public static final class755 method3138(int arg0, class755 arg1) {
        field7321++;
        if (~arg1.field10552 != arg0) {
            return class189.method1182(arg1.field10552, (byte) -101);
        }
        int var2 = arg1.field10445 >>> 16;
        class176 var3 = new class176(class259.field3747);
        for (class654 var4 = (class654) var3.method1111(86); var4 != null; var4 = (class654) var3.method1113((byte) -19)) {
            if (var4.field8745 == var2) {
                return class189.method1182((int) var4.field1079, (byte) -101);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(IIII)V")
    public final void method3139(int arg0, int arg1, int arg2, int arg3) {
        field7323++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg3];
        if (arg2 != -17059) {
            this.field7322 = null;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method3135(true);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field7320; var14++) {
                        int var15 = this.field7322[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field7318 * var15 >> 12;
                        int var19 = this.field7315 * var15 >> 12;
                        int var20 = this.field7329 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field7315 * var17;
                        int var23 = this.field7318 * var21;
                        int var24 = this.field7329 * var16;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var24 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var30 & 0xFF;
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var18 <= var26) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36;
                        if (var20 > var29) {
                            var36 = var29 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38;
                        if (var32 >= var19) {
                            var38 = 0;
                        } else {
                            var38 = var32 & 0xFF;
                        }
                        int var39 = var24 & 0xFFF;
                        int var40 = class282.field4090[var39];
                        short var41 = this.field7327[var33];
                        int var42 = var34 - 4096;
                        int var43 = var39 - 4096;
                        int var44 = class282.field4090[var34];
                        int var45 = var37 - 4096;
                        int var46 = class282.field4090[var37];
                        short var47 = this.field7327[var38];
                        short var48 = this.field7327[var36 + var47];
                        short var49 = this.field7327[var31 + var41];
                        short var50 = this.field7327[var31 + var47];
                        short var51 = this.field7327[var36 + var41];
                        int var52 = class627.method3529(this.field7327[var27 + var49], (byte) 113, var34, var37, var39);
                        int var53 = class627.method3529(this.field7327[var35 + var49], (byte) 90, var42, var37, var39);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class627.method3529(this.field7327[var27 + var51], (byte) 112, var34, var37, var43);
                        int var56 = class627.method3529(this.field7327[var35 + var51], (byte) -109, var42, var37, var43);
                        int var57 = var55 + ((var56 - var55) * var44 >> 12);
                        int var58 = class627.method3529(this.field7327[var27 + var50], (byte) 87, var34, var45, var39);
                        int var59 = ((var57 - var54) * var40 >> 12) + var54;
                        int var60 = class627.method3529(this.field7327[var35 + var50], (byte) -79, var42, var45, var39);
                        int var61 = ((var60 - var58) * var44 >> 12) + var58;
                        int var62 = class627.method3529(this.field7327[var27 + var48], (byte) 86, var34, var45, var43);
                        int var63 = class627.method3529(this.field7327[var35 + var48], (byte) 86, var42, var45, var43);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var40 >> 12) + var61;
                        this.method3141(arg2 ^ 0xFFFFBD5C, var14, ((var65 - var59) * var46 >> 12) + var59);
                    }
                    this.method3137((byte) 121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)V")
    private final void method3140(byte arg0) {
        this.field7322 = new short[this.field7320];
        field7325++;
        if (arg0 != 3) {
            method3138(124, null);
        }
        for (int var2 = 0; var2 < this.field7320; var2++) {
            this.field7322[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
    public abstract void method3141(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIII)V")
    public class528(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7320 = arg1;
        this.field7315 = arg4;
        this.field7326 = arg0;
        this.field7329 = arg3;
        this.field7318 = arg2;
        this.method3140((byte) 3);
        this.method3136((byte) 91);
    }
}
