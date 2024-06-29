import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class250 extends class70 {

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public int field4452 = 0;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field4447 = 0;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "B")
    public byte field4464 = 0;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "Z")
    private boolean field4487 = false;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "[I")
    public int[] field4466;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "[I")
    public int[] field4472;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "[I")
    public int[] field4469;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "[I")
    private int[] field4465;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "[I")
    public int[] field4461;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "[I")
    public int[] field4480;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "[I")
    public int[] field4470;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "[B")
    public byte[] field4479;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "[B")
    public byte[] field4448;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "[B")
    public byte[] field4489;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "[S")
    public short[] field4458;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "[S")
    public short[] field4459;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "[B")
    public byte[] field4444;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "[I")
    private int[] field4483;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "[B")
    public byte[] field4463;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "[S")
    public short[] field4488;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "[S")
    public short[] field4478;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[S")
    public short[] field4450;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "[S")
    private short[] field4477;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "[S")
    private short[] field4457;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "[S")
    private short[] field4474;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "[B")
    private byte[] field4476;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "[B")
    private byte[] field4462;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "[B")
    private byte[] field4456;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "[B")
    private byte[] field4486;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "[B")
    private byte[] field4492;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "[[I")
    public int[][] field4454;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "[[I")
    public int[][] field4460;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "[Llb;")
    public class127[] field4455;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "[Llj;")
    public class25[] field4449;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "[Llb;")
    public class127[] field4445;

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "S")
    public short field4490;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "S")
    public short field4446;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "[I")
    private static int[] field4468 = class3.field24;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
    private static int[] field4453 = class3.field21;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    private static int field4467 = 0;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "[I")
    private static int[] field4471 = new int[10000];

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "[I")
    private static int[] field4473 = new int[10000];

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "S")
    private short field4451;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "S")
    private short field4475;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "S")
    private short field4481;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "S")
    private short field4482;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "S")
    private short field4484;

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "S")
    private short field4491;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()V")
    public final void method1744() {
        for (int var1 = 0; var1 < this.field4452; var1++) {
            this.field4469[var1] = -this.field4469[var1];
        }
        for (int var2 = 0; var2 < this.field4447; var2++) {
            int var3 = this.field4461[var2];
            this.field4461[var2] = this.field4470[var2];
            this.field4470[var2] = var3;
        }
        this.method1767();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[[I[[IIIIZZ)Lnd;")
    public final class250 method1745(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1771();
        int var10 = this.field4481 + arg4;
        int var11 = this.field4475 + arg4;
        int var12 = this.field4484 + arg6;
        int var13 = this.field4451 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
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
        class250 var18;
        if (arg7) {
            var18 = new class250();
            var18.field4452 = this.field4452;
            var18.field4447 = this.field4447;
            var18.field4485 = this.field4485;
            var18.field4461 = this.field4461;
            var18.field4480 = this.field4480;
            var18.field4470 = this.field4470;
            var18.field4479 = this.field4479;
            var18.field4448 = this.field4448;
            var18.field4489 = this.field4489;
            var18.field4444 = this.field4444;
            var18.field4458 = this.field4458;
            var18.field4459 = this.field4459;
            var18.field4464 = this.field4464;
            var18.field4463 = this.field4463;
            var18.field4488 = this.field4488;
            var18.field4478 = this.field4478;
            var18.field4450 = this.field4450;
            var18.field4477 = this.field4477;
            var18.field4457 = this.field4457;
            var18.field4474 = this.field4474;
            var18.field4476 = this.field4476;
            var18.field4462 = this.field4462;
            var18.field4456 = this.field4456;
            var18.field4486 = this.field4486;
            var18.field4492 = this.field4492;
            var18.field4465 = this.field4465;
            var18.field4483 = this.field4483;
            var18.field4454 = this.field4454;
            var18.field4460 = this.field4460;
            var18.field4490 = this.field4490;
            var18.field4446 = this.field4446;
            var18.field4455 = this.field4455;
            var18.field4449 = this.field4449;
            var18.field4445 = this.field4445;
            if (arg0 == 3) {
                var18.field4466 = class244.method1702(this.field4466, -22352);
                var18.field4472 = class244.method1702(this.field4472, -22352);
                var18.field4469 = class244.method1702(this.field4469, -22352);
            } else {
                var18.field4466 = this.field4466;
                var18.field4472 = new int[var18.field4452];
                var18.field4469 = this.field4469;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field4452; var19++) {
                int var20 = this.field4466[var19] + arg4;
                int var21 = this.field4469[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field4472[var19] = this.field4472[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field4452; var29++) {
                int var30 = (this.field4472[var29] << 16) / this.field4491;
                if (var30 < arg1) {
                    int var31 = this.field4466[var29] + arg4;
                    int var32 = this.field4469[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field4472[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field4472[var29];
                } else {
                    var18.field4472[var29] = this.field4472[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1759(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field4482 - this.field4491;
            for (int var43 = 0; var43 < this.field4452; var43++) {
                int var44 = this.field4466[var43] + arg4;
                int var45 = this.field4469[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field4472[var43] = var52 + this.field4472[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field4482 - this.field4491;
            for (int var54 = 0; var54 < this.field4452; var54++) {
                int var55 = this.field4466[var54] + arg4;
                int var56 = this.field4469[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field4472[var54] = ((this.field4472[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1767();
        } else {
            this.field4487 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)Lrk;")
    public final class257 method1746(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class90(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
    public final void method1747(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4452; var4++) {
            this.field4466[var4] += arg0;
            this.field4472[var4] += arg1;
            this.field4469[var4] += arg2;
        }
        this.method1767();
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    private final void method1748(int arg0) {
        int var2 = field4453[arg0];
        int var3 = field4468[arg0];
        for (int var4 = 0; var4 < this.field4452; var4++) {
            int var5 = this.field4472[var4] * var3 - this.field4469[var4] * var2 >> 16;
            this.field4469[var4] = this.field4472[var4] * var2 + this.field4469[var4] * var3 >> 16;
            this.field4472[var4] = var5;
        }
        this.method1767();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([[III)I")
    private static final int method1749(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(SS)V")
    public final void method1750(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4447; var3++) {
            if (this.field4458[var3] == arg0) {
                this.field4458[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(SS)V")
    public final void method1751(short arg0, short arg1) {
        if (this.field4459 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field4447; var3++) {
            if (this.field4459[var3] == arg0) {
                this.field4459[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()V")
    public final void method1752() {
        for (int var1 = 0; var1 < this.field4452; var1++) {
            this.field4466[var1] = -this.field4466[var1];
            this.field4469[var1] = -this.field4469[var1];
        }
        this.method1767();
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "()V")
    public static void method1753() {
        field4471 = null;
        field4473 = null;
        field4453 = null;
        field4468 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([B)V")
    private final void method1754(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class14 var4 = new class14(arg0);
        class14 var5 = new class14(arg0);
        class14 var6 = new class14(arg0);
        class14 var7 = new class14(arg0);
        class14 var8 = new class14(arg0);
        var4.field318 = arg0.length - 18;
        int var9 = var4.method161(4);
        int var10 = var4.method161(4);
        int var11 = var4.method200(255);
        int var12 = var4.method200(255);
        int var13 = var4.method200(255);
        int var14 = var4.method200(255);
        int var15 = var4.method200(255);
        int var16 = var4.method200(255);
        int var17 = var4.method161(4);
        int var18 = var4.method161(4);
        int var19 = var4.method161(4);
        int var20 = var4.method161(4);
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
        this.field4452 = var9;
        this.field4447 = var10;
        this.field4485 = var11;
        this.field4466 = new int[var9];
        this.field4472 = new int[var9];
        this.field4469 = new int[var9];
        this.field4461 = new int[var10];
        this.field4480 = new int[var10];
        this.field4470 = new int[var10];
        if (var11 > 0) {
            this.field4463 = new byte[var11];
            this.field4488 = new short[var11];
            this.field4478 = new short[var11];
            this.field4450 = new short[var11];
        }
        if (var16 == 1) {
            this.field4465 = new int[var9];
        }
        if (var12 == 1) {
            this.field4479 = new byte[var10];
            this.field4444 = new byte[var10];
            this.field4459 = new short[var10];
        }
        if (var13 == 255) {
            this.field4448 = new byte[var10];
        } else {
            this.field4464 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4489 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4483 = new int[var10];
        }
        this.field4458 = new short[var10];
        var4.field318 = var21;
        var5.field318 = var36;
        var6.field318 = var38;
        var7.field318 = var40;
        var8.field318 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method200(255);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method182(-120);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method182(-17);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method182(-114);
            }
            this.field4466[var46] = var43 + var63;
            this.field4472[var46] = var44 + var64;
            this.field4469[var46] = var45 + var65;
            var43 = this.field4466[var46];
            var44 = this.field4472[var46];
            var45 = this.field4469[var46];
            if (var16 == 1) {
                this.field4465[var46] = var8.method200(255);
            }
        }
        var4.field318 = var32;
        var5.field318 = var28;
        var6.field318 = var26;
        var7.field318 = var30;
        var8.field318 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field4458[var47] = (short) var4.method161(4);
            if (var12 == 1) {
                int var61 = var5.method200(255);
                if ((var61 & 0x1) == 1) {
                    this.field4479[var47] = 1;
                    var2 = true;
                } else {
                    this.field4479[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field4444[var47] = (byte) (var61 >> 2);
                    this.field4459[var47] = this.field4458[var47];
                    this.field4458[var47] = 127;
                    if (this.field4459[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field4444[var47] = -1;
                    this.field4459[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field4448[var47] = var6.method198(false);
            }
            if (var14 == 1) {
                this.field4489[var47] = var7.method198(false);
            }
            if (var15 == 1) {
                this.field4483[var47] = var8.method200(255);
            }
        }
        var4.field318 = var25;
        var5.field318 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method200(255);
            if (var57 == 1) {
                var48 = var4.method182(-48) + var51;
                var49 = var4.method182(-118) + var48;
                var50 = var4.method182(-69) + var49;
                var51 = var50;
                this.field4461[var52] = var48;
                this.field4480[var52] = var49;
                this.field4470[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method182(-74) + var51;
                var51 = var50;
                this.field4461[var52] = var48;
                this.field4480[var52] = var49;
                this.field4470[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method182(-54) + var51;
                var51 = var50;
                this.field4461[var52] = var48;
                this.field4480[var52] = var49;
                this.field4470[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method182(-58) + var51;
                var51 = var50;
                this.field4461[var52] = var48;
                this.field4480[var52] = var60;
                this.field4470[var52] = var50;
            }
        }
        var4.field318 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field4463[var53] = 0;
            this.field4488[var53] = (short) var4.method161(4);
            this.field4478[var53] = (short) var4.method161(4);
            this.field4450[var53] = (short) var4.method161(4);
        }
        if (this.field4444 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field4444[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field4488[var56] & 0xFFFF) == this.field4461[var55] && (this.field4478[var56] & 0xFFFF) == this.field4480[var55] && (this.field4450[var56] & 0xFFFF) == this.field4470[var55]) {
                        this.field4444[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field4444 = null;
            }
        }
        if (!var3) {
            this.field4459 = null;
        }
        if (!var2) {
            this.field4479 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public final void method1755(int arg0) {
        int var2 = field4453[arg0];
        int var3 = field4468[arg0];
        for (int var4 = 0; var4 < this.field4452; var4++) {
            int var5 = this.field4469[var4] * var2 + this.field4466[var4] * var3 >> 16;
            this.field4469[var4] = this.field4469[var4] * var3 - this.field4466[var4] * var2 >> 16;
            this.field4466[var4] = var5;
        }
        this.method1767();
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()Z")
    public final boolean method607() {
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "()V")
    public final void method1756() {
        for (int var1 = 0; var1 < this.field4452; var1++) {
            int var2 = this.field4469[var1];
            this.field4469[var1] = this.field4466[var1];
            this.field4466[var1] = -var2;
        }
        this.method1767();
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "()V")
    public final void method1757() {
        for (int var1 = 0; var1 < this.field4452; var1++) {
            int var2 = this.field4466[var1];
            this.field4466[var1] = this.field4469[var1];
            this.field4469[var1] = -var2;
        }
        this.method1767();
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "()Lnd;")
    public final class250 method1758() {
        class250 var1 = new class250();
        if (this.field4479 != null) {
            var1.field4479 = new byte[this.field4447];
            for (int var2 = 0; var2 < this.field4447; var2++) {
                var1.field4479[var2] = this.field4479[var2];
            }
        }
        var1.field4452 = this.field4452;
        var1.field4447 = this.field4447;
        var1.field4485 = this.field4485;
        var1.field4466 = this.field4466;
        var1.field4472 = this.field4472;
        var1.field4469 = this.field4469;
        var1.field4461 = this.field4461;
        var1.field4480 = this.field4480;
        var1.field4470 = this.field4470;
        var1.field4448 = this.field4448;
        var1.field4489 = this.field4489;
        var1.field4444 = this.field4444;
        var1.field4458 = this.field4458;
        var1.field4459 = this.field4459;
        var1.field4464 = this.field4464;
        var1.field4463 = this.field4463;
        var1.field4488 = this.field4488;
        var1.field4478 = this.field4478;
        var1.field4450 = this.field4450;
        var1.field4477 = this.field4477;
        var1.field4457 = this.field4457;
        var1.field4474 = this.field4474;
        var1.field4476 = this.field4476;
        var1.field4462 = this.field4462;
        var1.field4456 = this.field4456;
        var1.field4486 = this.field4486;
        var1.field4492 = this.field4492;
        var1.field4465 = this.field4465;
        var1.field4483 = this.field4483;
        var1.field4454 = this.field4454;
        var1.field4460 = this.field4460;
        var1.field4455 = this.field4455;
        var1.field4449 = this.field4449;
        var1.field4490 = this.field4490;
        var1.field4446 = this.field4446;
        return var1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([[IIIIII)V")
    private final void method1759(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1749(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1749(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1749(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1749(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1748(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1766(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1747(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "()V")
    public final void method1760() {
        int var10002;
        if (this.field4465 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4452; var3++) {
                int var7 = this.field4465[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field4454 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field4454[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field4452) {
                int var6 = this.field4465[var5];
                this.field4454[var6][var1[var6]++] = var5++;
            }
            this.field4465 = null;
        }
        if (this.field4483 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4447; var10++) {
            int var14 = this.field4483[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field4460 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field4460[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field4447) {
            int var13 = this.field4483[var12];
            this.field4460[var13][var8[var13]++] = var12++;
        }
        this.field4483 = null;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)I")
    public final int method1761(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4452; var4++) {
            if (this.field4466[var4] == arg0 && this.field4472[var4] == arg1 && this.field4469[var4] == arg2) {
                return var4;
            }
        }
        this.field4466[this.field4452] = arg0;
        this.field4472[this.field4452] = arg1;
        this.field4469[this.field4452] = arg2;
        return this.field4452++;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(III)V")
    public final void method1762(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4452; var4++) {
            this.field4466[var4] = this.field4466[var4] * arg0 / 128;
            this.field4472[var4] = this.field4472[var4] * arg1 / 128;
            this.field4469[var4] = this.field4469[var4] * arg2 / 128;
        }
        this.method1767();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lnd;I)I")
    private final int method1763(class250 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field4466[arg1];
        int var5 = arg0.field4472[arg1];
        int var6 = arg0.field4469[arg1];
        for (int var7 = 0; var7 < this.field4452; var7++) {
            if (this.field4466[var7] == var4 && this.field4472[var7] == var5 && this.field4469[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field4466[this.field4452] = var4;
            this.field4472[this.field4452] = var5;
            this.field4469[this.field4452] = var6;
            if (arg0.field4465 != null) {
                this.field4465[this.field4452] = arg0.field4465[arg1];
            }
            var3 = this.field4452++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "()V")
    public final void method1764() {
        if (this.field4455 != null) {
            return;
        }
        this.field4455 = new class127[this.field4452];
        for (int var1 = 0; var1 < this.field4452; var1++) {
            this.field4455[var1] = new class127();
        }
        for (int var2 = 0; var2 < this.field4447; var2++) {
            int var3 = this.field4461[var2];
            int var4 = this.field4480[var2];
            int var5 = this.field4470[var2];
            int var6 = this.field4466[var4] - this.field4466[var3];
            int var7 = this.field4472[var4] - this.field4472[var3];
            int var8 = this.field4469[var4] - this.field4469[var3];
            int var9 = this.field4466[var5] - this.field4466[var3];
            int var10 = this.field4472[var5] - this.field4472[var3];
            int var11 = this.field4469[var5] - this.field4469[var3];
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
            if (this.field4479 == null) {
                var19 = 0;
            } else {
                var19 = this.field4479[var2];
            }
            if (var19 == 0) {
                class127 var20 = this.field4455[var3];
                var20.field2214 += var16;
                var20.field2226 += var17;
                var20.field2224 += var18;
                var20.field2227++;
                class127 var21 = this.field4455[var4];
                var21.field2214 += var16;
                var21.field2226 += var17;
                var21.field2224 += var18;
                var21.field2227++;
                class127 var22 = this.field4455[var5];
                var22.field2214 += var16;
                var22.field2226 += var17;
                var22.field2224 += var18;
                var22.field2227++;
            } else if (var19 == 1) {
                if (this.field4449 == null) {
                    this.field4449 = new class25[this.field4447];
                }
                class25 var23 = this.field4449[var2] = new class25();
                var23.field472 = var16;
                var23.field476 = var17;
                var23.field470 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIBSB)I")
    public final int method1765(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field4461[this.field4447] = arg0;
        this.field4480[this.field4447] = arg1;
        this.field4470[this.field4447] = arg2;
        this.field4479[this.field4447] = arg3;
        this.field4444[this.field4447] = -1;
        this.field4458[this.field4447] = arg4;
        this.field4459[this.field4447] = -1;
        this.field4489[this.field4447] = arg5;
        return this.field4447++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Lhj;")
    public final class70 method605(int arg0, int arg1, int arg2) {
        return this.method1746(this.field4490, this.field4446, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    private final void method1766(int arg0) {
        int var2 = field4453[arg0];
        int var3 = field4468[arg0];
        for (int var4 = 0; var4 < this.field4452; var4++) {
            int var5 = this.field4472[var4] * var2 + this.field4466[var4] * var3 >> 16;
            this.field4472[var4] = this.field4472[var4] * var3 - this.field4466[var4] * var2 >> 16;
            this.field4466[var4] = var5;
        }
        this.method1767();
    }

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "()V")
    private final void method1767() {
        this.field4455 = null;
        this.field4445 = null;
        this.field4449 = null;
        this.field4487 = false;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(III)V")
    public final void method1768(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field4453[arg2];
            int var5 = field4468[arg2];
            for (int var6 = 0; var6 < this.field4452; var6++) {
                int var7 = this.field4472[var6] * var4 + this.field4466[var6] * var5 >> 16;
                this.field4472[var6] = this.field4472[var6] * var5 - this.field4466[var6] * var4 >> 16;
                this.field4466[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field4453[arg0];
            int var9 = field4468[arg0];
            for (int var10 = 0; var10 < this.field4452; var10++) {
                int var11 = this.field4472[var10] * var9 - this.field4469[var10] * var8 >> 16;
                this.field4469[var10] = this.field4472[var10] * var8 + this.field4469[var10] * var9 >> 16;
                this.field4472[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field4453[arg1];
        int var13 = field4468[arg1];
        for (int var14 = 0; var14 < this.field4452; var14++) {
            int var15 = this.field4469[var14] * var12 + this.field4466[var14] * var13 >> 16;
            this.field4469[var14] = this.field4469[var14] * var13 - this.field4466[var14] * var12 >> 16;
            this.field4466[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIIII)Lod;")
    public final class90 method1769(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class90(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()I")
    public final int method496() {
        if (!this.field4487) {
            this.method1771();
        }
        return this.field4491;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lkk;II)Lnd;")
    public static final class250 method1770(class223 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1546(arg2, (byte) -100, arg1);
        return var3 == null ? null : new class250(var3);
    }

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "()V")
    private final void method1771() {
        if (this.field4487) {
            return;
        }
        this.field4487 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field4452; var7++) {
            int var8 = this.field4466[var7];
            int var9 = this.field4472[var7];
            int var10 = this.field4469[var7];
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
        this.field4481 = (short) var1;
        this.field4475 = (short) var4;
        this.field4491 = (short) var2;
        this.field4482 = (short) var5;
        this.field4484 = (short) var3;
        this.field4451 = (short) var6;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lhj;IIIZ)V")
    public final void method603(class70 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class250 var6 = (class250) arg0;
        var6.method1771();
        var6.method1764();
        field4467++;
        int var7 = 0;
        int[] var8 = var6.field4466;
        int var9 = var6.field4452;
        for (int var10 = 0; var10 < this.field4452; var10++) {
            class127 var13 = this.field4455[var10];
            if (var13.field2227 != 0) {
                int var14 = this.field4472[var10] - arg2;
                if (var14 >= var6.field4491 && var14 <= var6.field4482) {
                    int var15 = this.field4466[var10] - arg1;
                    if (var15 >= var6.field4481 && var15 <= var6.field4475) {
                        int var16 = this.field4469[var10] - arg3;
                        if (var16 >= var6.field4484 && var16 <= var6.field4451) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class127 var18 = var6.field4455[var17];
                                if (var8[var17] == var15 && var6.field4469[var17] == var16 && var6.field4472[var17] == var14 && var18.field2227 != 0) {
                                    if (this.field4445 == null) {
                                        this.field4445 = new class127[this.field4452];
                                    }
                                    if (var6.field4445 == null) {
                                        var6.field4445 = new class127[var9];
                                    }
                                    class127 var19 = this.field4445[var10];
                                    if (var19 == null) {
                                        var19 = this.field4445[var10] = new class127(var13);
                                    }
                                    class127 var20 = var6.field4445[var17];
                                    if (var20 == null) {
                                        var20 = var6.field4445[var17] = new class127(var18);
                                    }
                                    var19.field2214 += var18.field2214;
                                    var19.field2226 += var18.field2226;
                                    var19.field2224 += var18.field2224;
                                    var19.field2227 += var18.field2227;
                                    var20.field2214 += var13.field2214;
                                    var20.field2226 += var13.field2226;
                                    var20.field2224 += var13.field2224;
                                    var20.field2227 += var13.field2227;
                                    var7++;
                                    field4471[var10] = field4467;
                                    field4473[var17] = field4467;
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
        for (int var11 = 0; var11 < this.field4447; var11++) {
            if (field4471[this.field4461[var11]] == field4467 && field4471[this.field4480[var11]] == field4467 && field4471[this.field4470[var11]] == field4467) {
                if (this.field4479 == null) {
                    this.field4479 = new byte[this.field4447];
                }
                this.field4479[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field4447; var12++) {
            if (field4473[var6.field4461[var12]] == field4467 && field4473[var6.field4480[var12]] == field4467 && field4473[var6.field4470[var12]] == field4467) {
                if (var6.field4479 == null) {
                    var6.field4479 = new byte[var6.field4447];
                }
                var6.field4479[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([B)V")
    private final void method1772(byte[] arg0) {
        class14 var2 = new class14(arg0);
        class14 var3 = new class14(arg0);
        class14 var4 = new class14(arg0);
        class14 var5 = new class14(arg0);
        class14 var6 = new class14(arg0);
        class14 var7 = new class14(arg0);
        class14 var8 = new class14(arg0);
        var2.field318 = arg0.length - 23;
        int var9 = var2.method161(4);
        int var10 = var2.method161(4);
        int var11 = var2.method200(255);
        int var12 = var2.method200(255);
        int var13 = var2.method200(255);
        int var14 = var2.method200(255);
        int var15 = var2.method200(255);
        int var16 = var2.method200(255);
        int var17 = var2.method200(255);
        int var18 = var2.method161(4);
        int var19 = var2.method161(4);
        int var20 = var2.method161(4);
        int var21 = var2.method161(4);
        int var22 = var2.method161(4);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field4463 = new byte[var11];
            var2.field318 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field4463[var26] = var2.method198(false);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field4452 = var9;
        this.field4447 = var10;
        this.field4485 = var11;
        this.field4466 = new int[var9];
        this.field4472 = new int[var9];
        this.field4469 = new int[var9];
        this.field4461 = new int[var10];
        this.field4480 = new int[var10];
        this.field4470 = new int[var10];
        if (var17 == 1) {
            this.field4465 = new int[var9];
        }
        if (var12 == 1) {
            this.field4479 = new byte[var10];
        }
        if (var13 == 255) {
            this.field4448 = new byte[var10];
        } else {
            this.field4464 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4489 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4483 = new int[var10];
        }
        if (var16 == 1) {
            this.field4459 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field4444 = new byte[var10];
        }
        this.field4458 = new short[var10];
        if (var11 > 0) {
            this.field4488 = new short[var11];
            this.field4478 = new short[var11];
            this.field4450 = new short[var11];
            if (var24 > 0) {
                this.field4477 = new short[var24];
                this.field4457 = new short[var24];
                this.field4474 = new short[var24];
                this.field4476 = new byte[var24];
                this.field4462 = new byte[var24];
                this.field4456 = new byte[var24];
            }
            if (var25 > 0) {
                this.field4486 = new byte[var25];
                this.field4492 = new byte[var25];
            }
        }
        var2.field318 = var11;
        var3.field318 = var44;
        var4.field318 = var46;
        var5.field318 = var48;
        var6.field318 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method200(255);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method182(-23);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method182(-84);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method182(-102);
            }
            this.field4466[var66] = var63 + var80;
            this.field4472[var66] = var64 + var81;
            this.field4469[var66] = var65 + var82;
            var63 = this.field4466[var66];
            var64 = this.field4472[var66];
            var65 = this.field4469[var66];
            if (var17 == 1) {
                this.field4465[var66] = var6.method200(255);
            }
        }
        var2.field318 = var42;
        var3.field318 = var31;
        var4.field318 = var34;
        var5.field318 = var37;
        var6.field318 = var35;
        var7.field318 = var40;
        var8.field318 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field4458[var67] = (short) var2.method161(4);
            if (var12 == 1) {
                this.field4479[var67] = var3.method198(false);
            }
            if (var13 == 255) {
                this.field4448[var67] = var4.method198(false);
            }
            if (var14 == 1) {
                this.field4489[var67] = var5.method198(false);
            }
            if (var15 == 1) {
                this.field4483[var67] = var6.method200(255);
            }
            if (var16 == 1) {
                this.field4459[var67] = (short) (var7.method161(4) - 1);
            }
            if (this.field4444 != null) {
                if (this.field4459[var67] == -1) {
                    this.field4444[var67] = -1;
                } else {
                    this.field4444[var67] = (byte) (var8.method200(255) - 1);
                }
            }
        }
        var2.field318 = var33;
        var3.field318 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method200(255);
            if (var75 == 1) {
                var68 = var2.method182(-55) + var71;
                var69 = var2.method182(-30) + var68;
                var70 = var2.method182(-53) + var69;
                var71 = var70;
                this.field4461[var72] = var68;
                this.field4480[var72] = var69;
                this.field4470[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method182(-47) + var71;
                var71 = var70;
                this.field4461[var72] = var68;
                this.field4480[var72] = var69;
                this.field4470[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method182(-38) + var71;
                var71 = var70;
                this.field4461[var72] = var68;
                this.field4480[var72] = var69;
                this.field4470[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method182(-45) + var71;
                var71 = var70;
                this.field4461[var72] = var68;
                this.field4480[var72] = var78;
                this.field4470[var72] = var70;
            }
        }
        var2.field318 = var50;
        var3.field318 = var52;
        var4.field318 = var54;
        var5.field318 = var56;
        var6.field318 = var58;
        var7.field318 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field4463[var73] & 0xFF;
            if (var74 == 0) {
                this.field4488[var73] = (short) var2.method161(4);
                this.field4478[var73] = (short) var2.method161(4);
                this.field4450[var73] = (short) var2.method161(4);
            }
            if (var74 == 1) {
                this.field4488[var73] = (short) var3.method161(4);
                this.field4478[var73] = (short) var3.method161(4);
                this.field4450[var73] = (short) var3.method161(4);
                this.field4477[var73] = (short) var4.method161(4);
                this.field4457[var73] = (short) var4.method161(4);
                this.field4474[var73] = (short) var4.method161(4);
                this.field4476[var73] = var5.method198(false);
                this.field4462[var73] = var6.method198(false);
                this.field4456[var73] = var7.method198(false);
            }
            if (var74 == 2) {
                this.field4488[var73] = (short) var3.method161(4);
                this.field4478[var73] = (short) var3.method161(4);
                this.field4450[var73] = (short) var3.method161(4);
                this.field4477[var73] = (short) var4.method161(4);
                this.field4457[var73] = (short) var4.method161(4);
                this.field4474[var73] = (short) var4.method161(4);
                this.field4476[var73] = var5.method198(false);
                this.field4462[var73] = var6.method198(false);
                this.field4456[var73] = var7.method198(false);
                this.field4486[var73] = var7.method198(false);
                this.field4492[var73] = var7.method198(false);
            }
            if (var74 == 3) {
                this.field4488[var73] = (short) var3.method161(4);
                this.field4478[var73] = (short) var3.method161(4);
                this.field4450[var73] = (short) var3.method161(4);
                this.field4477[var73] = (short) var4.method161(4);
                this.field4457[var73] = (short) var4.method161(4);
                this.field4474[var73] = (short) var4.method161(4);
                this.field4476[var73] = var5.method198(false);
                this.field4462[var73] = var6.method198(false);
                this.field4456[var73] = var7.method198(false);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "()V")
    public final void method1773() {
        this.field4465 = null;
        this.field4483 = null;
        this.field4454 = null;
        this.field4460 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    private class250() {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
    private class250(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1772(arg0);
        } else {
            this.method1754(arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
    public class250(int arg0, int arg1, int arg2) {
        this.field4466 = new int[arg0];
        this.field4472 = new int[arg0];
        this.field4469 = new int[arg0];
        this.field4465 = new int[arg0];
        this.field4461 = new int[arg1];
        this.field4480 = new int[arg1];
        this.field4470 = new int[arg1];
        this.field4479 = new byte[arg1];
        this.field4448 = new byte[arg1];
        this.field4489 = new byte[arg1];
        this.field4458 = new short[arg1];
        this.field4459 = new short[arg1];
        this.field4444 = new byte[arg1];
        this.field4483 = new int[arg1];
        if (arg2 > 0) {
            this.field4463 = new byte[arg2];
            this.field4488 = new short[arg2];
            this.field4478 = new short[arg2];
            this.field4450 = new short[arg2];
            this.field4477 = new short[arg2];
            this.field4457 = new short[arg2];
            this.field4474 = new short[arg2];
            this.field4476 = new byte[arg2];
            this.field4462 = new byte[arg2];
            this.field4456 = new byte[arg2];
            this.field4486 = new byte[arg2];
            this.field4492 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([Lnd;I)V")
    public class250(class250[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field4452 = 0;
        this.field4447 = 0;
        this.field4485 = 0;
        this.field4464 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class250 var15 = arg0[var9];
            if (var15 != null) {
                this.field4452 += var15.field4452;
                this.field4447 += var15.field4447;
                this.field4485 += var15.field4485;
                if (var15.field4448 == null) {
                    if (this.field4464 == -1) {
                        this.field4464 = var15.field4464;
                    }
                    if (this.field4464 != var15.field4464) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field4479 != null;
                var5 |= var15.field4489 != null;
                var6 |= var15.field4483 != null;
                var7 |= var15.field4459 != null;
                var8 |= var15.field4444 != null;
            }
        }
        this.field4466 = new int[this.field4452];
        this.field4472 = new int[this.field4452];
        this.field4469 = new int[this.field4452];
        this.field4465 = new int[this.field4452];
        this.field4461 = new int[this.field4447];
        this.field4480 = new int[this.field4447];
        this.field4470 = new int[this.field4447];
        if (var3) {
            this.field4479 = new byte[this.field4447];
        }
        if (var4) {
            this.field4448 = new byte[this.field4447];
        }
        if (var5) {
            this.field4489 = new byte[this.field4447];
        }
        if (var6) {
            this.field4483 = new int[this.field4447];
        }
        if (var7) {
            this.field4459 = new short[this.field4447];
        }
        if (var8) {
            this.field4444 = new byte[this.field4447];
        }
        this.field4458 = new short[this.field4447];
        if (this.field4485 > 0) {
            this.field4463 = new byte[this.field4485];
            this.field4488 = new short[this.field4485];
            this.field4478 = new short[this.field4485];
            this.field4450 = new short[this.field4485];
            this.field4477 = new short[this.field4485];
            this.field4457 = new short[this.field4485];
            this.field4474 = new short[this.field4485];
            this.field4476 = new byte[this.field4485];
            this.field4462 = new byte[this.field4485];
            this.field4456 = new byte[this.field4485];
            this.field4486 = new byte[this.field4485];
            this.field4492 = new byte[this.field4485];
        }
        this.field4452 = 0;
        this.field4447 = 0;
        this.field4485 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class250 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field4447; var12++) {
                    if (var3 && var11.field4479 != null) {
                        this.field4479[this.field4447] = var11.field4479[var12];
                    }
                    if (var4) {
                        if (var11.field4448 == null) {
                            this.field4448[this.field4447] = var11.field4464;
                        } else {
                            this.field4448[this.field4447] = var11.field4448[var12];
                        }
                    }
                    if (var5 && var11.field4489 != null) {
                        this.field4489[this.field4447] = var11.field4489[var12];
                    }
                    if (var6 && var11.field4483 != null) {
                        this.field4483[this.field4447] = var11.field4483[var12];
                    }
                    if (var7) {
                        if (var11.field4459 == null) {
                            this.field4459[this.field4447] = -1;
                        } else {
                            this.field4459[this.field4447] = var11.field4459[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field4444 == null || var11.field4444[var12] == -1) {
                            this.field4444[this.field4447] = -1;
                        } else {
                            this.field4444[this.field4447] = (byte) (var11.field4444[var12] + this.field4485);
                        }
                    }
                    this.field4458[this.field4447] = var11.field4458[var12];
                    this.field4461[this.field4447] = this.method1763(var11, var11.field4461[var12]);
                    this.field4480[this.field4447] = this.method1763(var11, var11.field4480[var12]);
                    this.field4470[this.field4447] = this.method1763(var11, var11.field4470[var12]);
                    this.field4447++;
                }
                for (int var13 = 0; var13 < var11.field4485; var13++) {
                    byte var14 = this.field4463[this.field4485] = var11.field4463[var13];
                    if (var14 == 0) {
                        this.field4488[this.field4485] = (short) this.method1763(var11, var11.field4488[var13]);
                        this.field4478[this.field4485] = (short) this.method1763(var11, var11.field4478[var13]);
                        this.field4450[this.field4485] = (short) this.method1763(var11, var11.field4450[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field4488[this.field4485] = var11.field4488[var13];
                        this.field4478[this.field4485] = var11.field4478[var13];
                        this.field4450[this.field4485] = var11.field4450[var13];
                        this.field4477[this.field4485] = var11.field4477[var13];
                        this.field4457[this.field4485] = var11.field4457[var13];
                        this.field4474[this.field4485] = var11.field4474[var13];
                        this.field4476[this.field4485] = var11.field4476[var13];
                        this.field4462[this.field4485] = var11.field4462[var13];
                        this.field4456[this.field4485] = var11.field4456[var13];
                    }
                    if (var14 == 2) {
                        this.field4486[this.field4485] = var11.field4486[var13];
                        this.field4492[this.field4485] = var11.field4492[var13];
                    }
                    this.field4485++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lnd;ZZZZ)V")
    public class250(class250 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field4452 = arg0.field4452;
        this.field4447 = arg0.field4447;
        this.field4485 = arg0.field4485;
        if (arg1) {
            this.field4466 = arg0.field4466;
            this.field4472 = arg0.field4472;
            this.field4469 = arg0.field4469;
        } else {
            this.field4466 = new int[this.field4452];
            this.field4472 = new int[this.field4452];
            this.field4469 = new int[this.field4452];
            for (int var6 = 0; var6 < this.field4452; var6++) {
                this.field4466[var6] = arg0.field4466[var6];
                this.field4472[var6] = arg0.field4472[var6];
                this.field4469[var6] = arg0.field4469[var6];
            }
        }
        if (arg2) {
            this.field4458 = arg0.field4458;
        } else {
            this.field4458 = new short[this.field4447];
            for (int var7 = 0; var7 < this.field4447; var7++) {
                this.field4458[var7] = arg0.field4458[var7];
            }
        }
        if (arg3 || arg0.field4459 == null) {
            this.field4459 = arg0.field4459;
        } else {
            this.field4459 = new short[this.field4447];
            for (int var8 = 0; var8 < this.field4447; var8++) {
                this.field4459[var8] = arg0.field4459[var8];
            }
        }
        if (arg4) {
            this.field4489 = arg0.field4489;
        } else {
            this.field4489 = new byte[this.field4447];
            if (arg0.field4489 == null) {
                for (int var9 = 0; var9 < this.field4447; var9++) {
                    this.field4489[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field4447; var10++) {
                    this.field4489[var10] = arg0.field4489[var10];
                }
            }
        }
        this.field4461 = arg0.field4461;
        this.field4480 = arg0.field4480;
        this.field4470 = arg0.field4470;
        this.field4479 = arg0.field4479;
        this.field4448 = arg0.field4448;
        this.field4444 = arg0.field4444;
        this.field4464 = arg0.field4464;
        this.field4463 = arg0.field4463;
        this.field4488 = arg0.field4488;
        this.field4478 = arg0.field4478;
        this.field4450 = arg0.field4450;
        this.field4477 = arg0.field4477;
        this.field4457 = arg0.field4457;
        this.field4474 = arg0.field4474;
        this.field4476 = arg0.field4476;
        this.field4462 = arg0.field4462;
        this.field4456 = arg0.field4456;
        this.field4486 = arg0.field4486;
        this.field4492 = arg0.field4492;
        this.field4465 = arg0.field4465;
        this.field4483 = arg0.field4483;
        this.field4454 = arg0.field4454;
        this.field4460 = arg0.field4460;
        this.field4455 = arg0.field4455;
        this.field4449 = arg0.field4449;
        this.field4445 = arg0.field4445;
        this.field4490 = arg0.field4490;
        this.field4446 = arg0.field4446;
    }
}
