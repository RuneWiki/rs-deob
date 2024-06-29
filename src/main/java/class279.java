import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class279 {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[S")
    private short[] field4656 = new short[512];

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    private int field4665 = 0;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    private int field4660 = 4;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    private int field4666 = 4;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    private int field4669 = 4;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public int field4667 = 4;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lbe;")
    public static class283 field4657 = class153.method941(-16, ")4a=");

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field4662 = 0;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lbe;")
    public static class283 field4655 = class153.method941(126, "Standort");

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lbe;")
    public static class283 field4659 = class153.method941(-26, "_labels");

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[S")
    private short[] field4670;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method1859(boolean arg0) {
        class34.field502.method1636(121);
        field4664++;
        if (!arg0) {
            field4662 = -122;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)Z", line = 23)
    public static final boolean method1860(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class197.field3361 * arg0 + class137.field2283 * arg3 >> 16;
        int var6 = class197.field3361 * arg3 - class137.field2283 * arg0 >> 16;
        int var7 = class306.field5255 * var6 + class256.field4317 * arg1 >> 16;
        int var8 = class306.field5255 * arg1 - class256.field4317 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class306.field5255 * var6 + class256.field4317 * arg2 >> 16;
        int var12 = class306.field5255 * arg2 - class256.field4317 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class195.field3324 && var13 < class195.field3324) {
            return false;
        } else if (var9 > class138.field2291 && var13 > class138.field2291) {
            return false;
        } else if (var10 < class305.field5202 && var14 < class305.field5202) {
            return false;
        } else {
            return var10 <= class103.field1762 || var14 <= class103.field1762;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIII)V", line = 413)
    public class279(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4667 = arg1;
        this.field4665 = arg0;
        this.field4666 = arg2;
        this.field4660 = arg3;
        this.field4669 = arg4;
        this.method1865(-1931);
        this.method1864(-127);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V", line = 87)
    public final void method1861(int arg0, int arg1, int arg2, int arg3) {
        field4663++;
        if (arg3 != -4096) {
            return;
        }
        int[] var5 = new int[arg0];
        for (int var6 = 0; var6 < arg0; var6++) {
            var5[var6] = (var6 << 12) / arg0;
        }
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg1; var8++) {
            var7[var8] = (var8 << 12) / arg1;
        }
        int[] var9 = new int[arg2];
        for (int var10 = 0; var10 < arg2; var10++) {
            var9[var10] = (var10 << 12) / arg2;
        }
        this.method788((byte) 60);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field4667; var14++) {
                        int var15 = this.field4670[var14] << 12;
                        int var16 = this.field4660 * var15 >> 12;
                        int var17 = this.field4669 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field4666 * var15 >> 12;
                        int var20 = var7[var12] * var15 >> 12;
                        int var21 = this.field4666 * var18;
                        int var22 = var9[var11] * var15 >> 12;
                        int var23 = var21 >> 12;
                        int var24 = this.field4669 * var22;
                        int var25 = this.field4660 * var20;
                        int var26 = var25 >> 12;
                        int var27 = var26 + 1;
                        int var28 = var21 & 0xFFF;
                        int var29 = class196.field3356[var28];
                        int var30;
                        if (var27 >= var16) {
                            var30 = 0;
                        } else {
                            var30 = var27 & 0xFF;
                        }
                        int var31 = var25 & 0xFFF;
                        int var32 = class196.field3356[var31];
                        int var33 = var26 & 0xFF;
                        int var34 = var28 - 4096;
                        int var35 = var23 + 1;
                        int var36 = var24 >> 12;
                        int var37 = var31 - 4096;
                        int var38 = var36 + 1;
                        int var39;
                        if (var38 < var17) {
                            var39 = var38 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = var23 & 0xFF;
                        int var41 = var36 & 0xFF;
                        short var42 = this.field4656[var39];
                        short var43 = this.field4656[var41];
                        int var44;
                        if (var35 >= var19) {
                            var44 = 0;
                        } else {
                            var44 = var35 & 0xFF;
                        }
                        short var45 = this.field4656[var30 + var42];
                        short var46 = this.field4656[var33 + var43];
                        int var47 = var24 & 0xFFF;
                        short var48 = this.field4656[var33 + var42];
                        int var49 = class196.field3356[var47];
                        int var50 = var47 - 4096;
                        short var51 = this.field4656[var30 + var43];
                        int var52 = class123.method777(var31, var28, this.field4656[var40 + var46], var47, 4692);
                        int var53 = class123.method777(var31, var34, this.field4656[var44 + var46], var47, arg3 + 8788);
                        int var54 = ((var53 - var52) * var29 >> 12) + var52;
                        int var55 = class123.method777(var37, var28, this.field4656[var40 + var51], var47, 4692);
                        int var56 = class123.method777(var37, var34, this.field4656[var44 + var51], var47, arg3 ^ 0xFFFFE254);
                        int var57 = var55 + ((var56 - var55) * var29 >> 12);
                        int var58 = ((var57 - var54) * var32 >> 12) + var54;
                        int var59 = class123.method777(var31, var28, this.field4656[var40 + var48], var50, 4692);
                        int var60 = class123.method777(var31, var34, this.field4656[var44 + var48], var50, 4692);
                        int var61 = ((var60 - var59) * var29 >> 12) + var59;
                        int var62 = class123.method777(var37, var28, this.field4656[var40 + var45], var50, 4692);
                        int var63 = class123.method777(var37, var34, this.field4656[var44 + var45], var50, 4692);
                        int var64 = var62 + ((var63 - var62) * var29 >> 12);
                        int var65 = ((var64 - var61) * var32 >> 12) + var61;
                        this.method792(var14, 4, ((var65 - var58) * var49 >> 12) + var58);
                    }
                    this.method786(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lbe;Lek;I)Lnd;", line = 267)
    public static final class299 method1862(class283 arg0, class172 arg1, int arg2) {
        if (arg2 != 512) {
            method1862((class283) null, (class172) null, 85);
        }
        field4671++;
        int var3 = arg1.method1097(arg0, 0);
        if (var3 == -1) {
            return new class299(0);
        }
        int[] var4 = arg1.method1118(var3, false);
        class299 var5 = new class299(var4.length);
        for (int var6 = 0; var6 < var5.field5069; var6++) {
            class229 var7 = new class229(arg1.method1107(var3, var4[var6], 123));
            var5.field5066[var6] = var7.method1549(true);
            var5.field5057[var6] = var7.method1497(false);
            var5.field5059[var6] = (short) var7.method1496(true);
            var5.field5054[var6] = (short) var7.method1496(true);
            var5.field5062[var6] = var7.method1528(true);
        }
        return var5;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I", line = 315)
    public static final int method1863(int arg0, int arg1) {
        if (arg1 != 255) {
            field4662 = 53;
        }
        field4668++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 329)
    private final void method1864(int arg0) {
        Random var2 = new Random((long) this.field4665);
        field4658++;
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4656[var3] = (short) var3;
        }
        if (arg0 > -41) {
            this.method792(-14, 33, 71);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class47.method275(var5, var2, -1625284640);
            short var7 = this.field4656[var6];
            this.field4656[var6] = this.field4656[var5];
            this.field4656[var5] = this.field4656[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 377)
    private final void method1865(int arg0) {
        this.field4670 = new short[this.field4667];
        if (arg0 != -1931) {
            method1862((class283) null, (class172) null, 9);
        }
        for (int var2 = 0; var2 < this.field4667; var2++) {
            this.field4670[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        field4661++;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 403)
    public static void method1866(int arg0) {
        field4655 = null;
        if (arg0 == 31275) {
            field4659 = null;
            field4657 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public abstract void method786(boolean arg0);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public abstract void method788(byte arg0);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public abstract void method792(int arg0, int arg1, int arg2);
}
