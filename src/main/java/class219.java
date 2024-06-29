import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class219 extends class264 {

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public int field3354 = 0;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public int field3373 = 0;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public int field3372 = 0;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "B")
    public byte field3399 = 0;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "Z")
    private boolean field3395 = false;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "[I")
    public int[] field3362;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "[I")
    public int[] field3377;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "[I")
    public int[] field3381;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "[I")
    public int[] field3376;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "[I")
    public int[] field3397;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "[I")
    public int[] field3368;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
    public int[] field3364;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "[B")
    public byte[] field3401;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "[B")
    public byte[] field3383;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "[B")
    public byte[] field3390;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "[S")
    public short[] field3389;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "[S")
    public short[] field3396;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "[B")
    public byte[] field3375;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "[I")
    public int[] field3388;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "[B")
    public byte[] field3386;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "[S")
    public short[] field3367;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[S")
    public short[] field3351;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "[S")
    public short[] field3391;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "[S")
    private short[] field3387;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "[S")
    private short[] field3384;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "[S")
    private short[] field3357;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "[B")
    private byte[] field3356;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "[B")
    private byte[] field3369;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "[B")
    private byte[] field3398;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "[B")
    private byte[] field3394;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "[B")
    private byte[] field3392;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "[S")
    public short[] field3400;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[S")
    public short[] field3358;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "[[I")
    public int[][] field3385;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "[[I")
    public int[][] field3380;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "[Lgb;")
    public class200[] field3360;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "[Lmk;")
    public class143[] field3374;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "[Lgb;")
    public class200[] field3379;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "S")
    public short field3382;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "S")
    public short field3355;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "[I")
    private static int[] field3353 = new int[10000];

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "[I")
    private static int[] field3359 = new int[10000];

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    private static int field3361 = 0;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "[I")
    private static int[] field3393 = class119.field1776;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[I")
    private static int[] field3350 = class119.field1774;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "S")
    private short field3352;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "S")
    private short field3363;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "S")
    private short field3365;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "S")
    private short field3370;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "S")
    private short field3371;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "S")
    private short field3378;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
    public final void method1470() {
        if (this.field3360 != null) {
            return;
        }
        this.field3360 = new class200[this.field3354];
        for (int var1 = 0; var1 < this.field3354; var1++) {
            this.field3360[var1] = new class200();
        }
        for (int var2 = 0; var2 < this.field3373; var2++) {
            int var3 = this.field3397[var2];
            int var4 = this.field3368[var2];
            int var5 = this.field3364[var2];
            int var6 = this.field3362[var4] - this.field3362[var3];
            int var7 = this.field3377[var4] - this.field3377[var3];
            int var8 = this.field3381[var4] - this.field3381[var3];
            int var9 = this.field3362[var5] - this.field3362[var3];
            int var10 = this.field3377[var5] - this.field3377[var3];
            int var11 = this.field3381[var5] - this.field3381[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field3401 == null) {
                var19 = 0;
            } else {
                var19 = this.field3401[var2];
            }
            if (var19 == 0) {
                class200 var20 = this.field3360[var3];
                var20.field3003 += var16;
                var20.field3004 += var17;
                var20.field3001 += var18;
                var20.field3008++;
                class200 var21 = this.field3360[var4];
                var21.field3003 += var16;
                var21.field3004 += var17;
                var21.field3001 += var18;
                var21.field3008++;
                class200 var22 = this.field3360[var5];
                var22.field3003 += var16;
                var22.field3004 += var17;
                var22.field3001 += var18;
                var22.field3008++;
            } else if (var19 == 1) {
                if (this.field3374 == null) {
                    this.field3374 = new class143[this.field3373];
                }
                class143 var23 = this.field3374[var2] = new class143();
                var23.field2064 = var16;
                var23.field2066 = var17;
                var23.field2074 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()V")
    private final void method1471() {
        if (this.field3395) {
            return;
        }
        this.field3395 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3354; var7++) {
            int var8 = this.field3362[var7];
            int var9 = this.field3377[var7];
            int var10 = this.field3381[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field3363 = (short) var1;
        this.field3352 = (short) var4;
        this.field3370 = (short) var2;
        this.field3378 = (short) var5;
        this.field3371 = (short) var3;
        this.field3365 = (short) var6;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIII)Lrl;")
    public final class263 method1472(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class263(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()V")
    public final void method1473() {
        for (int var1 = 0; var1 < this.field3372; var1++) {
            this.field3381[var1] = -this.field3381[var1];
        }
        for (int var2 = 0; var2 < this.field3373; var2++) {
            int var3 = this.field3397[var2];
            this.field3397[var2] = this.field3364[var2];
            this.field3364[var2] = var3;
        }
        this.method1478();
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    private final void method1474(int arg0) {
        int var2 = field3350[arg0];
        int var3 = field3393[arg0];
        for (int var4 = 0; var4 < this.field3372; var4++) {
            int var5 = this.field3377[var4] * var2 + this.field3362[var4] * var3 >> 16;
            this.field3377[var4] = this.field3377[var4] * var3 - this.field3362[var4] * var2 >> 16;
            this.field3362[var4] = var5;
        }
        this.method1478();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lbg;")
    public final class264 method1475(int arg0, int arg1, int arg2) {
        return this.method1501(this.field3382, this.field3355, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(SS)V")
    public final void method1476(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3373; var3++) {
            if (this.field3389[var3] == arg0) {
                this.field3389[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(SS)V")
    public final void method1477(short arg0, short arg1) {
        if (this.field3396 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3373; var3++) {
            if (this.field3396[var3] == arg0) {
                this.field3396[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "()V")
    private final void method1478() {
        this.field3360 = null;
        this.field3379 = null;
        this.field3374 = null;
        this.field3395 = false;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "()Lwb;")
    public final class219 method1479() {
        class219 var1 = new class219();
        if (this.field3401 != null) {
            var1.field3401 = new byte[this.field3373];
            for (int var2 = 0; var2 < this.field3373; var2++) {
                var1.field3401[var2] = this.field3401[var2];
            }
        }
        var1.field3372 = this.field3372;
        var1.field3354 = this.field3354;
        var1.field3373 = this.field3373;
        var1.field3366 = this.field3366;
        var1.field3362 = this.field3362;
        var1.field3377 = this.field3377;
        var1.field3381 = this.field3381;
        var1.field3397 = this.field3397;
        var1.field3368 = this.field3368;
        var1.field3364 = this.field3364;
        var1.field3383 = this.field3383;
        var1.field3390 = this.field3390;
        var1.field3375 = this.field3375;
        var1.field3389 = this.field3389;
        var1.field3396 = this.field3396;
        var1.field3399 = this.field3399;
        var1.field3386 = this.field3386;
        var1.field3367 = this.field3367;
        var1.field3351 = this.field3351;
        var1.field3391 = this.field3391;
        var1.field3387 = this.field3387;
        var1.field3384 = this.field3384;
        var1.field3357 = this.field3357;
        var1.field3356 = this.field3356;
        var1.field3369 = this.field3369;
        var1.field3398 = this.field3398;
        var1.field3394 = this.field3394;
        var1.field3392 = this.field3392;
        var1.field3376 = this.field3376;
        var1.field3388 = this.field3388;
        var1.field3385 = this.field3385;
        var1.field3380 = this.field3380;
        var1.field3360 = this.field3360;
        var1.field3374 = this.field3374;
        var1.field3382 = this.field3382;
        var1.field3355 = this.field3355;
        return var1;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public final void method1480(int arg0) {
        int var2 = field3350[arg0];
        int var3 = field3393[arg0];
        for (int var4 = 0; var4 < this.field3372; var4++) {
            int var5 = this.field3381[var4] * var2 + this.field3362[var4] * var3 >> 16;
            this.field3381[var4] = this.field3381[var4] * var3 - this.field3362[var4] * var2 >> 16;
            this.field3362[var4] = var5;
        }
        this.method1478();
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "()V")
    public final void method1481() {
        for (int var1 = 0; var1 < this.field3372; var1++) {
            int var2 = this.field3362[var1];
            this.field3362[var1] = this.field3381[var1];
            this.field3381[var1] = -var2;
        }
        this.method1478();
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    private final void method1482(int arg0) {
        int var2 = field3350[arg0];
        int var3 = field3393[arg0];
        for (int var4 = 0; var4 < this.field3372; var4++) {
            int var5 = this.field3377[var4] * var3 - this.field3381[var4] * var2 >> 16;
            this.field3381[var4] = this.field3381[var4] * var3 + this.field3377[var4] * var2 >> 16;
            this.field3377[var4] = var5;
        }
        this.method1478();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIBSB)I")
    public final int method1483(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3397[this.field3373] = arg0;
        this.field3368[this.field3373] = arg1;
        this.field3364[this.field3373] = arg2;
        this.field3401[this.field3373] = arg3;
        this.field3375[this.field3373] = -1;
        this.field3389[this.field3373] = arg4;
        this.field3396[this.field3373] = -1;
        this.field3390[this.field3373] = arg5;
        return this.field3373++;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "()V")
    public final void method1484() {
        this.field3376 = null;
        this.field3388 = null;
        this.field3385 = null;
        this.field3380 = null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V")
    public final void method1485(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3372; var4++) {
            this.field3362[var4] += arg0;
            this.field3377[var4] += arg1;
            this.field3381[var4] += arg2;
        }
        this.method1478();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([B)V")
    private final void method1486(byte[] arg0) {
        class54 var2 = new class54(arg0);
        class54 var3 = new class54(arg0);
        class54 var4 = new class54(arg0);
        class54 var5 = new class54(arg0);
        class54 var6 = new class54(arg0);
        class54 var7 = new class54(arg0);
        class54 var8 = new class54(arg0);
        var2.field887 = arg0.length - 23;
        int var9 = var2.method423(-81);
        int var10 = var2.method423(85);
        int var11 = var2.method407(255);
        int var12 = var2.method407(255);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method407(255);
        int var16 = var2.method407(255);
        int var17 = var2.method407(255);
        int var18 = var2.method407(255);
        int var19 = var2.method407(255);
        int var20 = var2.method423(73);
        int var21 = var2.method423(53);
        int var22 = var2.method423(91);
        int var23 = var2.method423(-96);
        int var24 = var2.method423(-109);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field3386 = new byte[var11];
            var2.field887 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field3386[var28] = var2.method459(false);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field3372 = var9;
        this.field3373 = var10;
        this.field3366 = var11;
        this.field3362 = new int[var9];
        this.field3377 = new int[var9];
        this.field3381 = new int[var9];
        this.field3397 = new int[var10];
        this.field3368 = new int[var10];
        this.field3364 = new int[var10];
        if (var19 == 1) {
            this.field3376 = new int[var9];
        }
        if (var13) {
            this.field3401 = new byte[var10];
        }
        if (var15 == 255) {
            this.field3383 = new byte[var10];
        } else {
            this.field3399 = (byte) var15;
        }
        if (var16 == 1) {
            this.field3390 = new byte[var10];
        }
        if (var17 == 1) {
            this.field3388 = new int[var10];
        }
        if (var18 == 1) {
            this.field3396 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field3375 = new byte[var10];
        }
        this.field3389 = new short[var10];
        if (var11 > 0) {
            this.field3367 = new short[var11];
            this.field3351 = new short[var11];
            this.field3391 = new short[var11];
            if (var26 > 0) {
                this.field3387 = new short[var26];
                this.field3384 = new short[var26];
                this.field3357 = new short[var26];
                this.field3356 = new byte[var26];
                this.field3369 = new byte[var26];
                this.field3398 = new byte[var26];
            }
            if (var27 > 0) {
                this.field3394 = new byte[var27];
                this.field3392 = new byte[var27];
            }
        }
        var2.field887 = var11;
        var3.field887 = var46;
        var4.field887 = var48;
        var5.field887 = var50;
        var6.field887 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method407(255);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method451(-25621);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method451(-25621);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method451(-25621);
            }
            this.field3362[var69] = var66 + var85;
            this.field3377[var69] = var67 + var86;
            this.field3381[var69] = var68 + var87;
            var66 = this.field3362[var69];
            var67 = this.field3377[var69];
            var68 = this.field3381[var69];
            if (var19 == 1) {
                this.field3376[var69] = var6.method407(255);
            }
        }
        var2.field887 = var44;
        var3.field887 = var33;
        var4.field887 = var36;
        var5.field887 = var39;
        var6.field887 = var37;
        var7.field887 = var42;
        var8.field887 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field3389[var70] = (short) var2.method423(-112);
            if (var13) {
                this.field3401[var70] = var3.method459(false);
            }
            if (var15 == 255) {
                this.field3383[var70] = var4.method459(false);
            }
            if (var16 == 1) {
                this.field3390[var70] = var5.method459(false);
            }
            if (var17 == 1) {
                this.field3388[var70] = var6.method407(255);
            }
            if (var18 == 1) {
                this.field3396[var70] = (short) (var7.method423(-116) - 1);
            }
            if (this.field3375 != null) {
                if (this.field3396[var70] == -1) {
                    this.field3375[var70] = -1;
                } else {
                    this.field3375[var70] = (byte) (var8.method407(255) - 1);
                }
            }
        }
        this.field3354 = -1;
        var2.field887 = var35;
        var3.field887 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method407(255);
            if (var80 == 1) {
                var71 = var2.method451(-25621) + var74;
                var72 = var2.method451(-25621) + var71;
                var73 = var2.method451(-25621) + var72;
                var74 = var73;
                this.field3397[var75] = var71;
                this.field3368[var75] = var72;
                this.field3364[var75] = var73;
                if (var71 > this.field3354) {
                    this.field3354 = var71;
                }
                if (var72 > this.field3354) {
                    this.field3354 = var72;
                }
                if (var73 > this.field3354) {
                    this.field3354 = var73;
                }
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method451(-25621) + var74;
                var74 = var73;
                this.field3397[var75] = var71;
                this.field3368[var75] = var72;
                this.field3364[var75] = var73;
                if (var73 > this.field3354) {
                    this.field3354 = var73;
                }
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method451(-25621) + var74;
                var74 = var73;
                this.field3397[var75] = var71;
                this.field3368[var75] = var72;
                this.field3364[var75] = var73;
                if (var73 > this.field3354) {
                    this.field3354 = var73;
                }
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method451(-25621) + var74;
                var74 = var73;
                this.field3397[var75] = var71;
                this.field3368[var75] = var83;
                this.field3364[var75] = var73;
                if (var73 > this.field3354) {
                    this.field3354 = var73;
                }
            }
        }
        this.field3354++;
        var2.field887 = var52;
        var3.field887 = var54;
        var4.field887 = var56;
        var5.field887 = var58;
        var6.field887 = var60;
        var7.field887 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field3386[var76] & 0xFF;
            if (var79 == 0) {
                this.field3367[var76] = (short) var2.method423(104);
                this.field3351[var76] = (short) var2.method423(-106);
                this.field3391[var76] = (short) var2.method423(-100);
            }
            if (var79 == 1) {
                this.field3367[var76] = (short) var3.method423(109);
                this.field3351[var76] = (short) var3.method423(70);
                this.field3391[var76] = (short) var3.method423(107);
                this.field3387[var76] = (short) var4.method423(110);
                this.field3384[var76] = (short) var4.method423(63);
                this.field3357[var76] = (short) var4.method423(-119);
                this.field3356[var76] = var5.method459(false);
                this.field3369[var76] = var6.method459(false);
                this.field3398[var76] = var7.method459(false);
            }
            if (var79 == 2) {
                this.field3367[var76] = (short) var3.method423(57);
                this.field3351[var76] = (short) var3.method423(-91);
                this.field3391[var76] = (short) var3.method423(97);
                this.field3387[var76] = (short) var4.method423(84);
                this.field3384[var76] = (short) var4.method423(92);
                this.field3357[var76] = (short) var4.method423(121);
                this.field3356[var76] = var5.method459(false);
                this.field3369[var76] = var6.method459(false);
                this.field3398[var76] = var7.method459(false);
                this.field3394[var76] = var7.method459(false);
                this.field3392[var76] = var7.method459(false);
            }
            if (var79 == 3) {
                this.field3367[var76] = (short) var3.method423(-89);
                this.field3351[var76] = (short) var3.method423(-99);
                this.field3391[var76] = (short) var3.method423(116);
                this.field3387[var76] = (short) var4.method423(91);
                this.field3384[var76] = (short) var4.method423(-96);
                this.field3357[var76] = (short) var4.method423(-117);
                this.field3356[var76] = var5.method459(false);
                this.field3369[var76] = var6.method459(false);
                this.field3398[var76] = var7.method459(false);
            }
        }
        if (!var14) {
            return;
        }
        var2.field887 = var64;
        int var77 = var2.method407(255);
        if (var77 > 0) {
            var2.field887 += var77 * 4;
        }
        int var78 = var2.method407(255);
        if (var78 > 0) {
            var2.field887 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([[III)I")
    private static final int method1487(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lwb;IS)I")
    private final int method1488(class219 arg0, int arg1, short arg2) {
        int var4 = arg0.field3362[arg1];
        int var5 = arg0.field3377[arg1];
        int var6 = arg0.field3381[arg1];
        for (int var7 = 0; var7 < this.field3372; var7++) {
            if (this.field3362[var7] == var4 && this.field3377[var7] == var5 && this.field3381[var7] == var6) {
                this.field3400[var7] |= arg2;
                return var7;
            }
        }
        this.field3362[this.field3372] = var4;
        this.field3377[this.field3372] = var5;
        this.field3381[this.field3372] = var6;
        this.field3400[this.field3372] = arg2;
        if (arg0.field3376 != null) {
            this.field3376[this.field3372] = arg0.field3376[arg1];
        }
        return this.field3372++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[[I[[IIIIZZ)Lwb;")
    public final class219 method1489(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1471();
        int var10 = this.field3363 + arg4;
        int var11 = this.field3352 + arg4;
        int var12 = this.field3371 + arg6;
        int var13 = this.field3365 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class219 var18;
        if (arg7) {
            var18 = new class219();
            var18.field3372 = this.field3372;
            var18.field3354 = this.field3354;
            var18.field3373 = this.field3373;
            var18.field3366 = this.field3366;
            var18.field3397 = this.field3397;
            var18.field3368 = this.field3368;
            var18.field3364 = this.field3364;
            var18.field3401 = this.field3401;
            var18.field3383 = this.field3383;
            var18.field3390 = this.field3390;
            var18.field3375 = this.field3375;
            var18.field3389 = this.field3389;
            var18.field3396 = this.field3396;
            var18.field3399 = this.field3399;
            var18.field3386 = this.field3386;
            var18.field3367 = this.field3367;
            var18.field3351 = this.field3351;
            var18.field3391 = this.field3391;
            var18.field3387 = this.field3387;
            var18.field3384 = this.field3384;
            var18.field3357 = this.field3357;
            var18.field3356 = this.field3356;
            var18.field3369 = this.field3369;
            var18.field3398 = this.field3398;
            var18.field3394 = this.field3394;
            var18.field3392 = this.field3392;
            var18.field3376 = this.field3376;
            var18.field3388 = this.field3388;
            var18.field3385 = this.field3385;
            var18.field3380 = this.field3380;
            var18.field3382 = this.field3382;
            var18.field3355 = this.field3355;
            var18.field3360 = this.field3360;
            var18.field3374 = this.field3374;
            var18.field3379 = this.field3379;
            if (arg0 == 3) {
                var18.field3362 = class208.method1374(26524, this.field3362);
                var18.field3377 = class208.method1374(26524, this.field3377);
                var18.field3381 = class208.method1374(26524, this.field3381);
            } else {
                var18.field3362 = this.field3362;
                var18.field3377 = new int[var18.field3372];
                var18.field3381 = this.field3381;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3354; var19++) {
                int var30 = this.field3362[var19] + arg4;
                int var31 = this.field3381[var19] + arg6;
                int var32 = var30 & 0x7F;
                int var33 = var31 & 0x7F;
                int var34 = var30 >> 7;
                int var35 = var31 >> 7;
                int var36 = (128 - var32) * arg2[var34][var35] + arg2[var34 + 1][var35] * var32 >> 7;
                int var37 = (128 - var32) * arg2[var34][var35 + 1] + arg2[var34 + 1][var35 + 1] * var32 >> 7;
                int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                var18.field3377[var19] = this.field3377[var19] + var38 - arg5;
            }
            for (int var20 = var18.field3354; var20 < var18.field3372; var20++) {
                int var21 = this.field3362[var20] + arg4;
                int var22 = this.field3381[var20] + arg6;
                int var23 = var21 & 0x7F;
                int var24 = var22 & 0x7F;
                int var25 = var21 >> 7;
                int var26 = var22 >> 7;
                if (var25 >= 0 && var25 < arg2.length - 1 && var26 >= 0 && var26 < arg2[0].length - 1) {
                    int var27 = (128 - var23) * arg2[var25][var26] + arg2[var25 + 1][var26] * var23 >> 7;
                    int var28 = (128 - var23) * arg2[var25][var26 + 1] + arg2[var25 + 1][var26 + 1] * var23 >> 7;
                    int var29 = (128 - var24) * var27 + var24 * var28 >> 7;
                    var18.field3377[var20] = this.field3377[var20] + var29 - arg5;
                }
            }
        } else if (arg0 == 2) {
            for (int var39 = 0; var39 < var18.field3354; var39++) {
                int var51 = (this.field3377[var39] << 16) / this.field3370;
                if (var51 < arg1) {
                    int var52 = this.field3362[var39] + arg4;
                    int var53 = this.field3381[var39] + arg6;
                    int var54 = var52 & 0x7F;
                    int var55 = var53 & 0x7F;
                    int var56 = var52 >> 7;
                    int var57 = var53 >> 7;
                    int var58 = (128 - var54) * arg2[var56][var57] + arg2[var56 + 1][var57] * var54 >> 7;
                    int var59 = (128 - var54) * arg2[var56][var57 + 1] + arg2[var56 + 1][var57 + 1] * var54 >> 7;
                    int var60 = (128 - var55) * var58 + var55 * var59 >> 7;
                    var18.field3377[var39] = (arg1 - var51) * (var60 - arg5) / arg1 + this.field3377[var39];
                } else {
                    var18.field3377[var39] = this.field3377[var39];
                }
            }
            for (int var40 = var18.field3354; var40 < var18.field3372; var40++) {
                int var41 = (this.field3377[var40] << 16) / this.field3370;
                if (var41 < arg1) {
                    int var42 = this.field3362[var40] + arg4;
                    int var43 = this.field3381[var40] + arg6;
                    int var44 = var42 & 0x7F;
                    int var45 = var43 & 0x7F;
                    int var46 = var42 >> 7;
                    int var47 = var43 >> 7;
                    if (var46 >= 0 && var46 < arg2.length - 1 && var47 >= 0 && var47 < arg2[0].length - 1) {
                        int var48 = (128 - var44) * arg2[var46][var47] + arg2[var46 + 1][var47] * var44 >> 7;
                        int var49 = (128 - var44) * arg2[var46][var47 + 1] + arg2[var46 + 1][var47 + 1] * var44 >> 7;
                        int var50 = (128 - var45) * var48 + var45 * var49 >> 7;
                        var18.field3377[var40] = (arg1 - var41) * (var50 - arg5) / arg1 + this.field3377[var40];
                    }
                } else {
                    var18.field3377[var40] = this.field3377[var40];
                }
            }
        } else if (arg0 == 3) {
            int var61 = (arg1 & 0xFF) * 4;
            int var62 = (arg1 >> 8 & 0xFF) * 4;
            var18.method1497(arg2, arg4, arg5, arg6, var61, var62);
        } else if (arg0 == 4) {
            int var63 = this.field3378 - this.field3370;
            for (int var64 = 0; var64 < this.field3354; var64++) {
                int var75 = this.field3362[var64] + arg4;
                int var76 = this.field3381[var64] + arg6;
                int var77 = var75 & 0x7F;
                int var78 = var76 & 0x7F;
                int var79 = var75 >> 7;
                int var80 = var76 >> 7;
                int var81 = (128 - var77) * arg3[var79][var80] + arg3[var79 + 1][var80] * var77 >> 7;
                int var82 = (128 - var77) * arg3[var79][var80 + 1] + arg3[var79 + 1][var80 + 1] * var77 >> 7;
                int var83 = (128 - var78) * var81 + var78 * var82 >> 7;
                var18.field3377[var64] = var83 + this.field3377[var64] + var63 - arg5;
            }
            for (int var65 = var18.field3354; var65 < var18.field3372; var65++) {
                int var66 = this.field3362[var65] + arg4;
                int var67 = this.field3381[var65] + arg6;
                int var68 = var66 & 0x7F;
                int var69 = var67 & 0x7F;
                int var70 = var66 >> 7;
                int var71 = var67 >> 7;
                if (var70 >= 0 && var70 < arg3.length - 1 && var71 >= 0 && var71 < arg3[0].length - 1) {
                    int var72 = (128 - var68) * arg3[var70][var71] + arg3[var70 + 1][var71] * var68 >> 7;
                    int var73 = (128 - var68) * arg3[var70][var71 + 1] + arg3[var70 + 1][var71 + 1] * var68 >> 7;
                    int var74 = (128 - var69) * var72 + var69 * var73 >> 7;
                    var18.field3377[var65] = var74 + this.field3377[var65] + var63 - arg5;
                }
            }
        } else if (arg0 == 5) {
            int var84 = this.field3378 - this.field3370;
            for (int var85 = 0; var85 < this.field3354; var85++) {
                int var100 = this.field3362[var85] + arg4;
                int var101 = this.field3381[var85] + arg6;
                int var102 = var100 & 0x7F;
                int var103 = var101 & 0x7F;
                int var104 = var100 >> 7;
                int var105 = var101 >> 7;
                int var106 = (128 - var102) * arg2[var104][var105] + arg2[var104 + 1][var105] * var102 >> 7;
                int var107 = (128 - var102) * arg2[var104][var105 + 1] + arg2[var104 + 1][var105 + 1] * var102 >> 7;
                int var108 = (128 - var103) * var106 + var103 * var107 >> 7;
                int var109 = (128 - var102) * arg3[var104][var105] + arg3[var104 + 1][var105] * var102 >> 7;
                int var110 = (128 - var102) * arg3[var104][var105 + 1] + arg3[var104 + 1][var105 + 1] * var102 >> 7;
                int var111 = (128 - var103) * var109 + var103 * var110 >> 7;
                int var112 = var108 - var111;
                var18.field3377[var85] = ((this.field3377[var85] << 8) / var84 * var112 >> 8) - (arg5 - var108);
            }
            for (int var86 = var18.field3354; var86 < var18.field3372; var86++) {
                int var87 = this.field3362[var86] + arg4;
                int var88 = this.field3381[var86] + arg6;
                int var89 = var87 & 0x7F;
                int var90 = var88 & 0x7F;
                int var91 = var87 >> 7;
                int var92 = var88 >> 7;
                if (var91 >= 0 && var91 < arg2.length - 1 && var91 < arg3.length - 1 && var92 >= 0 && var92 < arg2[0].length - 1 && var92 < arg3[0].length - 1) {
                    int var93 = (128 - var89) * arg2[var91][var92] + arg2[var91 + 1][var92] * var89 >> 7;
                    int var94 = (128 - var89) * arg2[var91][var92 + 1] + arg2[var91 + 1][var92 + 1] * var89 >> 7;
                    int var95 = (128 - var90) * var93 + var90 * var94 >> 7;
                    int var96 = (128 - var89) * arg3[var91][var92] + arg3[var91 + 1][var92] * var89 >> 7;
                    int var97 = (128 - var89) * arg3[var91][var92 + 1] + arg3[var91 + 1][var92 + 1] * var89 >> 7;
                    int var98 = (128 - var90) * var96 + var90 * var97 >> 7;
                    int var99 = var95 - var98;
                    var18.field3377[var86] = ((this.field3377[var86] << 8) / var84 * var99 >> 8) - (arg5 - var95);
                }
            }
        }
        if (arg8) {
            var18.method1478();
        } else {
            this.field3395 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(III)I")
    public final int method1490(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3372; var4++) {
            if (this.field3362[var4] == arg0 && this.field3377[var4] == arg1 && this.field3381[var4] == arg2) {
                return var4;
            }
        }
        this.field3362[this.field3372] = arg0;
        this.field3377[this.field3372] = arg1;
        this.field3381[this.field3372] = arg2;
        this.field3354 = ++this.field3372;
        return this.field3372 - 1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()I")
    public final int method19() {
        if (!this.field3395) {
            this.method1471();
        }
        return this.field3370;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(III)V")
    public final void method1491(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3372; var4++) {
            this.field3362[var4] = this.field3362[var4] * arg0 / 128;
            this.field3377[var4] = this.field3377[var4] * arg1 / 128;
            this.field3381[var4] = this.field3381[var4] * arg2 / 128;
        }
        this.method1478();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lbg;IIIZ)V")
    public final void method1492(class264 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class219 var6 = (class219) arg0;
        var6.method1471();
        var6.method1470();
        field3361++;
        int var7 = 0;
        int[] var8 = var6.field3362;
        int var9 = var6.field3354;
        for (int var10 = 0; var10 < this.field3354; var10++) {
            class200 var13 = this.field3360[var10];
            if (var13.field3008 != 0) {
                int var14 = this.field3377[var10] - arg2;
                if (var14 >= var6.field3370 && var14 <= var6.field3378) {
                    int var15 = this.field3362[var10] - arg1;
                    if (var15 >= var6.field3363 && var15 <= var6.field3352) {
                        int var16 = this.field3381[var10] - arg3;
                        if (var16 >= var6.field3371 && var16 <= var6.field3365) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class200 var18 = var6.field3360[var17];
                                if (var8[var17] == var15 && var6.field3381[var17] == var16 && var6.field3377[var17] == var14 && var18.field3008 != 0) {
                                    if (this.field3379 == null) {
                                        this.field3379 = new class200[this.field3354];
                                    }
                                    if (var6.field3379 == null) {
                                        var6.field3379 = new class200[var9];
                                    }
                                    class200 var19 = this.field3379[var10];
                                    if (var19 == null) {
                                        var19 = this.field3379[var10] = new class200(var13);
                                    }
                                    class200 var20 = var6.field3379[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3379[var17] = new class200(var18);
                                    }
                                    var19.field3003 += var18.field3003;
                                    var19.field3004 += var18.field3004;
                                    var19.field3001 += var18.field3001;
                                    var19.field3008 += var18.field3008;
                                    var20.field3003 += var13.field3003;
                                    var20.field3004 += var13.field3004;
                                    var20.field3001 += var13.field3001;
                                    var20.field3008 += var13.field3008;
                                    var7++;
                                    field3353[var10] = field3361;
                                    field3359[var17] = field3361;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field3373; var11++) {
            if (field3353[this.field3397[var11]] == field3361 && field3353[this.field3368[var11]] == field3361 && field3353[this.field3364[var11]] == field3361) {
                if (this.field3401 == null) {
                    this.field3401 = new byte[this.field3373];
                }
                this.field3401[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3373; var12++) {
            if (field3359[var6.field3397[var12]] == field3361 && field3359[var6.field3368[var12]] == field3361 && field3359[var6.field3364[var12]] == field3361) {
                if (var6.field3401 == null) {
                    var6.field3401 = new byte[var6.field3373];
                }
                var6.field3401[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([B)V")
    private final void method1493(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class54 var4 = new class54(arg0);
        class54 var5 = new class54(arg0);
        class54 var6 = new class54(arg0);
        class54 var7 = new class54(arg0);
        class54 var8 = new class54(arg0);
        var4.field887 = arg0.length - 18;
        int var9 = var4.method423(-112);
        int var10 = var4.method423(75);
        int var11 = var4.method407(255);
        int var12 = var4.method407(255);
        int var13 = var4.method407(255);
        int var14 = var4.method407(255);
        int var15 = var4.method407(255);
        int var16 = var4.method407(255);
        int var17 = var4.method423(-93);
        int var18 = var4.method423(-109);
        int var19 = var4.method423(-118);
        int var20 = var4.method423(73);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field3372 = var9;
        this.field3373 = var10;
        this.field3366 = var11;
        this.field3362 = new int[var9];
        this.field3377 = new int[var9];
        this.field3381 = new int[var9];
        this.field3397 = new int[var10];
        this.field3368 = new int[var10];
        this.field3364 = new int[var10];
        if (var11 > 0) {
            this.field3386 = new byte[var11];
            this.field3367 = new short[var11];
            this.field3351 = new short[var11];
            this.field3391 = new short[var11];
        }
        if (var16 == 1) {
            this.field3376 = new int[var9];
        }
        if (var12 == 1) {
            this.field3401 = new byte[var10];
            this.field3375 = new byte[var10];
            this.field3396 = new short[var10];
        }
        if (var13 == 255) {
            this.field3383 = new byte[var10];
        } else {
            this.field3399 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3390 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3388 = new int[var10];
        }
        this.field3389 = new short[var10];
        var4.field887 = var21;
        var5.field887 = var36;
        var6.field887 = var38;
        var7.field887 = var40;
        var8.field887 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method407(255);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method451(-25621);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method451(-25621);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method451(-25621);
            }
            this.field3362[var46] = var43 + var63;
            this.field3377[var46] = var44 + var64;
            this.field3381[var46] = var45 + var65;
            var43 = this.field3362[var46];
            var44 = this.field3377[var46];
            var45 = this.field3381[var46];
            if (var16 == 1) {
                this.field3376[var46] = var8.method407(255);
            }
        }
        var4.field887 = var32;
        var5.field887 = var28;
        var6.field887 = var26;
        var7.field887 = var30;
        var8.field887 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3389[var47] = (short) var4.method423(67);
            if (var12 == 1) {
                int var61 = var5.method407(255);
                if ((var61 & 0x1) == 1) {
                    this.field3401[var47] = 1;
                    var2 = true;
                } else {
                    this.field3401[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3375[var47] = (byte) (var61 >> 2);
                    this.field3396[var47] = this.field3389[var47];
                    this.field3389[var47] = 127;
                    if (this.field3396[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3375[var47] = -1;
                    this.field3396[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3383[var47] = var6.method459(false);
            }
            if (var14 == 1) {
                this.field3390[var47] = var7.method459(false);
            }
            if (var15 == 1) {
                this.field3388[var47] = var8.method407(255);
            }
        }
        this.field3354 = -1;
        var4.field887 = var25;
        var5.field887 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method407(255);
            if (var57 == 1) {
                var48 = var4.method451(-25621) + var51;
                var49 = var4.method451(-25621) + var48;
                var50 = var4.method451(-25621) + var49;
                var51 = var50;
                this.field3397[var52] = var48;
                this.field3368[var52] = var49;
                this.field3364[var52] = var50;
                if (var48 > this.field3354) {
                    this.field3354 = var48;
                }
                if (var49 > this.field3354) {
                    this.field3354 = var49;
                }
                if (var50 > this.field3354) {
                    this.field3354 = var50;
                }
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method451(-25621) + var51;
                var51 = var50;
                this.field3397[var52] = var48;
                this.field3368[var52] = var49;
                this.field3364[var52] = var50;
                if (var50 > this.field3354) {
                    this.field3354 = var50;
                }
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method451(-25621) + var51;
                var51 = var50;
                this.field3397[var52] = var48;
                this.field3368[var52] = var49;
                this.field3364[var52] = var50;
                if (var50 > this.field3354) {
                    this.field3354 = var50;
                }
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method451(-25621) + var51;
                var51 = var50;
                this.field3397[var52] = var48;
                this.field3368[var52] = var60;
                this.field3364[var52] = var50;
                if (var50 > this.field3354) {
                    this.field3354 = var50;
                }
            }
        }
        this.field3354++;
        var4.field887 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3386[var53] = 0;
            this.field3367[var53] = (short) var4.method423(-112);
            this.field3351[var53] = (short) var4.method423(-127);
            this.field3391[var53] = (short) var4.method423(-82);
        }
        if (this.field3375 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3375[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3367[var56] & 0xFFFF) == this.field3397[var55] && (this.field3351[var56] & 0xFFFF) == this.field3368[var55] && (this.field3391[var56] & 0xFFFF) == this.field3364[var55]) {
                        this.field3375[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3375 = null;
            }
        }
        if (!var3) {
            this.field3396 = null;
        }
        if (!var2) {
            this.field3401 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()Z")
    public final boolean method1494() {
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(III)V")
    public final void method1495(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3350[arg2];
            int var5 = field3393[arg2];
            for (int var6 = 0; var6 < this.field3372; var6++) {
                int var7 = this.field3377[var6] * var4 + this.field3362[var6] * var5 >> 16;
                this.field3377[var6] = this.field3377[var6] * var5 - this.field3362[var6] * var4 >> 16;
                this.field3362[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3350[arg0];
            int var9 = field3393[arg0];
            for (int var10 = 0; var10 < this.field3372; var10++) {
                int var11 = this.field3377[var10] * var9 - this.field3381[var10] * var8 >> 16;
                this.field3381[var10] = this.field3381[var10] * var9 + this.field3377[var10] * var8 >> 16;
                this.field3377[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3350[arg1];
        int var13 = field3393[arg1];
        for (int var14 = 0; var14 < this.field3372; var14++) {
            int var15 = this.field3381[var14] * var12 + this.field3362[var14] * var13 >> 16;
            this.field3381[var14] = this.field3381[var14] * var13 - this.field3362[var14] * var12 >> 16;
            this.field3362[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "()V")
    public final void method1496() {
        int var10002;
        if (this.field3376 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3372; var3++) {
                int var7 = this.field3376[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3385 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3385[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3372) {
                int var6 = this.field3376[var5];
                this.field3385[var6][var1[var6]++] = var5++;
            }
            this.field3376 = null;
        }
        if (this.field3388 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3373; var10++) {
            int var14 = this.field3388[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3380 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3380[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3373) {
            int var13 = this.field3388[var12];
            this.field3380[var13][var8[var13]++] = var12++;
        }
        this.field3388 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([[IIIIII)V")
    private final void method1497(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1487(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1487(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1487(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1487(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1482(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1474(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1485(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "()V")
    public final void method1498() {
        for (int var1 = 0; var1 < this.field3372; var1++) {
            this.field3362[var1] = -this.field3362[var1];
            this.field3381[var1] = -this.field3381[var1];
        }
        this.method1478();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIIJILaa;)V")
    public final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class31 arg10) {
    }

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "()V")
    public static void method1499() {
        field3353 = null;
        field3359 = null;
        field3350 = null;
        field3393 = null;
    }

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "()V")
    public final void method1500() {
        for (int var1 = 0; var1 < this.field3372; var1++) {
            int var2 = this.field3381[var1];
            this.field3381[var1] = this.field3362[var1];
            this.field3362[var1] = -var2;
        }
        this.method1478();
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(IIIII)Lpb;")
    public final class2 method1501(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class263(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lpk;II)Lwb;")
    public static final class219 method1502(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1605(-125, arg2, arg1);
        return var3 == null ? null : new class219(var3);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    private class219() {
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([B)V")
    private class219(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1486(arg0);
        } else {
            this.method1493(arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(III)V")
    public class219(int arg0, int arg1, int arg2) {
        this.field3362 = new int[arg0];
        this.field3377 = new int[arg0];
        this.field3381 = new int[arg0];
        this.field3376 = new int[arg0];
        this.field3397 = new int[arg1];
        this.field3368 = new int[arg1];
        this.field3364 = new int[arg1];
        this.field3401 = new byte[arg1];
        this.field3383 = new byte[arg1];
        this.field3390 = new byte[arg1];
        this.field3389 = new short[arg1];
        this.field3396 = new short[arg1];
        this.field3375 = new byte[arg1];
        this.field3388 = new int[arg1];
        if (arg2 > 0) {
            this.field3386 = new byte[arg2];
            this.field3367 = new short[arg2];
            this.field3351 = new short[arg2];
            this.field3391 = new short[arg2];
            this.field3387 = new short[arg2];
            this.field3384 = new short[arg2];
            this.field3357 = new short[arg2];
            this.field3356 = new byte[arg2];
            this.field3369 = new byte[arg2];
            this.field3398 = new byte[arg2];
            this.field3394 = new byte[arg2];
            this.field3392 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([Lwb;I)V")
    public class219(class219[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3372 = 0;
        this.field3373 = 0;
        this.field3366 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field3399 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class219 var25 = arg0[var11];
            if (var25 != null) {
                this.field3372 += var25.field3372;
                this.field3373 += var25.field3373;
                this.field3366 += var25.field3366;
                if (var25.field3383 == null) {
                    if (this.field3399 == -1) {
                        this.field3399 = var25.field3399;
                    }
                    if (this.field3399 != var25.field3399) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var25.field3401 != null;
                var5 |= var25.field3390 != null;
                var6 |= var25.field3388 != null;
                var7 |= var25.field3396 != null;
                var8 |= var25.field3375 != null;
            }
        }
        this.field3362 = new int[this.field3372];
        this.field3377 = new int[this.field3372];
        this.field3381 = new int[this.field3372];
        this.field3376 = new int[this.field3372];
        this.field3400 = new short[this.field3372];
        this.field3397 = new int[this.field3373];
        this.field3368 = new int[this.field3373];
        this.field3364 = new int[this.field3373];
        if (var3) {
            this.field3401 = new byte[this.field3373];
        }
        if (var4) {
            this.field3383 = new byte[this.field3373];
        }
        if (var5) {
            this.field3390 = new byte[this.field3373];
        }
        if (var6) {
            this.field3388 = new int[this.field3373];
        }
        if (var7) {
            this.field3396 = new short[this.field3373];
        }
        if (var8) {
            this.field3375 = new byte[this.field3373];
        }
        this.field3389 = new short[this.field3373];
        this.field3358 = new short[this.field3373];
        if (this.field3366 > 0) {
            this.field3386 = new byte[this.field3366];
            this.field3367 = new short[this.field3366];
            this.field3351 = new short[this.field3366];
            this.field3391 = new short[this.field3366];
            this.field3387 = new short[this.field3366];
            this.field3384 = new short[this.field3366];
            this.field3357 = new short[this.field3366];
            this.field3356 = new byte[this.field3366];
            this.field3369 = new byte[this.field3366];
            this.field3398 = new byte[this.field3366];
            this.field3394 = new byte[this.field3366];
            this.field3392 = new byte[this.field3366];
        }
        this.field3372 = 0;
        this.field3373 = 0;
        this.field3366 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class219 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field3373; var24++) {
                    if (var3 && var23.field3401 != null) {
                        this.field3401[this.field3373] = var23.field3401[var24];
                    }
                    if (var4) {
                        if (var23.field3383 == null) {
                            this.field3383[this.field3373] = var23.field3399;
                        } else {
                            this.field3383[this.field3373] = var23.field3383[var24];
                        }
                    }
                    if (var5 && var23.field3390 != null) {
                        this.field3390[this.field3373] = var23.field3390[var24];
                    }
                    if (var6 && var23.field3388 != null) {
                        this.field3388[this.field3373] = var23.field3388[var24];
                    }
                    if (var7) {
                        if (var23.field3396 == null) {
                            this.field3396[this.field3373] = -1;
                        } else {
                            this.field3396[this.field3373] = var23.field3396[var24];
                        }
                    }
                    this.field3389[this.field3373] = var23.field3389[var24];
                    this.field3358[this.field3373] = var22;
                    this.field3397[this.field3373] = this.method1488(var23, var23.field3397[var24], var22);
                    this.field3368[this.field3373] = this.method1488(var23, var23.field3368[var24], var22);
                    this.field3364[this.field3373] = this.method1488(var23, var23.field3364[var24], var22);
                    this.field3373++;
                }
            }
        }
        int var15 = 0;
        this.field3354 = this.field3372;
        for (int var16 = 0; var16 < arg1; var16++) {
            class219 var17 = arg0[var16];
            short var18 = (short) (0x1 << var16);
            if (var17 != null) {
                for (int var19 = 0; var19 < var17.field3373; var19++) {
                    if (var8) {
                        this.field3375[var15++] = (byte) (var17.field3375 == null || var17.field3375[var19] == -1 ? -1 : var17.field3375[var19] + this.field3366);
                    }
                }
                for (int var20 = 0; var20 < var17.field3366; var20++) {
                    byte var21 = this.field3386[this.field3366] = var17.field3386[var20];
                    if (var21 == 0) {
                        this.field3367[this.field3366] = (short) this.method1488(var17, var17.field3367[var20], var18);
                        this.field3351[this.field3366] = (short) this.method1488(var17, var17.field3351[var20], var18);
                        this.field3391[this.field3366] = (short) this.method1488(var17, var17.field3391[var20], var18);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field3367[this.field3366] = var17.field3367[var20];
                        this.field3351[this.field3366] = var17.field3351[var20];
                        this.field3391[this.field3366] = var17.field3391[var20];
                        this.field3387[this.field3366] = var17.field3387[var20];
                        this.field3384[this.field3366] = var17.field3384[var20];
                        this.field3357[this.field3366] = var17.field3357[var20];
                        this.field3356[this.field3366] = var17.field3356[var20];
                        this.field3369[this.field3366] = var17.field3369[var20];
                        this.field3398[this.field3366] = var17.field3398[var20];
                    }
                    if (var21 == 2) {
                        this.field3394[this.field3366] = var17.field3394[var20];
                        this.field3392[this.field3366] = var17.field3392[var20];
                    }
                    this.field3366++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lwb;ZZZZ)V")
    public class219(class219 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3372 = arg0.field3372;
        this.field3354 = arg0.field3354;
        this.field3373 = arg0.field3373;
        this.field3366 = arg0.field3366;
        if (arg1) {
            this.field3362 = arg0.field3362;
            this.field3377 = arg0.field3377;
            this.field3381 = arg0.field3381;
        } else {
            this.field3362 = new int[this.field3372];
            this.field3377 = new int[this.field3372];
            this.field3381 = new int[this.field3372];
            for (int var6 = 0; var6 < this.field3372; var6++) {
                this.field3362[var6] = arg0.field3362[var6];
                this.field3377[var6] = arg0.field3377[var6];
                this.field3381[var6] = arg0.field3381[var6];
            }
        }
        if (arg2) {
            this.field3389 = arg0.field3389;
        } else {
            this.field3389 = new short[this.field3373];
            for (int var7 = 0; var7 < this.field3373; var7++) {
                this.field3389[var7] = arg0.field3389[var7];
            }
        }
        if (arg3 || arg0.field3396 == null) {
            this.field3396 = arg0.field3396;
        } else {
            this.field3396 = new short[this.field3373];
            for (int var8 = 0; var8 < this.field3373; var8++) {
                this.field3396[var8] = arg0.field3396[var8];
            }
        }
        if (arg4) {
            this.field3390 = arg0.field3390;
        } else {
            this.field3390 = new byte[this.field3373];
            if (arg0.field3390 == null) {
                for (int var9 = 0; var9 < this.field3373; var9++) {
                    this.field3390[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3373; var10++) {
                    this.field3390[var10] = arg0.field3390[var10];
                }
            }
        }
        this.field3397 = arg0.field3397;
        this.field3368 = arg0.field3368;
        this.field3364 = arg0.field3364;
        this.field3401 = arg0.field3401;
        this.field3383 = arg0.field3383;
        this.field3375 = arg0.field3375;
        this.field3399 = arg0.field3399;
        this.field3386 = arg0.field3386;
        this.field3367 = arg0.field3367;
        this.field3351 = arg0.field3351;
        this.field3391 = arg0.field3391;
        this.field3387 = arg0.field3387;
        this.field3384 = arg0.field3384;
        this.field3357 = arg0.field3357;
        this.field3356 = arg0.field3356;
        this.field3369 = arg0.field3369;
        this.field3398 = arg0.field3398;
        this.field3394 = arg0.field3394;
        this.field3392 = arg0.field3392;
        this.field3376 = arg0.field3376;
        this.field3388 = arg0.field3388;
        this.field3385 = arg0.field3385;
        this.field3380 = arg0.field3380;
        this.field3360 = arg0.field3360;
        this.field3374 = arg0.field3374;
        this.field3379 = arg0.field3379;
        this.field3382 = arg0.field3382;
        this.field3355 = arg0.field3355;
    }
}
