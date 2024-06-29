import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class202 extends class16 {

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public int field3326 = 0;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "I")
    public int field3357 = 0;

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "B")
    public byte field3359 = 0;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "Z")
    private boolean field3364 = false;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "[I")
    public int[] field3337;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "[I")
    public int[] field3349;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "[I")
    public int[] field3318;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "[I")
    private int[] field3332;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "[I")
    public int[] field3333;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "[I")
    public int[] field3330;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "[I")
    public int[] field3341;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "[B")
    public byte[] field3343;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "[B")
    public byte[] field3321;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "[B")
    public byte[] field3338;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "[S")
    public short[] field3323;

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "[S")
    public short[] field3365;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "[B")
    public byte[] field3320;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "[I")
    private int[] field3329;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[B")
    public byte[] field3322;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "[S")
    public short[] field3334;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[S")
    public short[] field3319;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "[S")
    public short[] field3350;

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "[S")
    private short[] field3362;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "[S")
    private short[] field3361;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "[S")
    private short[] field3324;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "[B")
    private byte[] field3317;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "[B")
    private byte[] field3352;

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "[B")
    private byte[] field3360;

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "[B")
    private byte[] field3363;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "[B")
    private byte[] field3345;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "[[I")
    public int[][] field3358;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "[[I")
    public int[][] field3346;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "[Lbh;")
    public class49[] field3356;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "[Lia;")
    public class2[] field3355;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "[Lbh;")
    public class49[] field3325;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "S")
    public short field3335;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "S")
    public short field3331;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "[I")
    private static int[] field3340 = new int[10000];

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "[I")
    private static int[] field3347 = class13.field311;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "[I")
    private static int[] field3354 = new int[10000];

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    private static int field3353 = 0;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "[I")
    private static int[] field3348 = class13.field313;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "S")
    private short field3327;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "S")
    private short field3328;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "S")
    private short field3336;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "S")
    private short field3342;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "S")
    private short field3344;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "S")
    private short field3351;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()V")
    public final void method1344() {
        for (int var1 = 0; var1 < this.field3326; var1++) {
            int var2 = this.field3318[var1];
            this.field3318[var1] = this.field3337[var1];
            this.field3337[var1] = -var2;
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)V")
    public final void method1345(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3348[arg2];
            int var5 = field3347[arg2];
            for (int var6 = 0; var6 < this.field3326; var6++) {
                int var7 = this.field3349[var6] * var4 + this.field3337[var6] * var5 >> 16;
                this.field3349[var6] = this.field3349[var6] * var5 - this.field3337[var6] * var4 >> 16;
                this.field3337[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3348[arg0];
            int var9 = field3347[arg0];
            for (int var10 = 0; var10 < this.field3326; var10++) {
                int var11 = this.field3349[var10] * var9 - this.field3318[var10] * var8 >> 16;
                this.field3318[var10] = this.field3349[var10] * var8 + this.field3318[var10] * var9 >> 16;
                this.field3349[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3348[arg1];
        int var13 = field3347[arg1];
        for (int var14 = 0; var14 < this.field3326; var14++) {
            int var15 = this.field3337[var14] * var13 + this.field3318[var14] * var12 >> 16;
            this.field3318[var14] = this.field3318[var14] * var13 - this.field3337[var14] * var12 >> 16;
            this.field3337[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()V")
    private final void method1346() {
        if (this.field3364) {
            return;
        }
        this.field3364 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3326; var7++) {
            int var8 = this.field3337[var7];
            int var9 = this.field3349[var7];
            int var10 = this.field3318[var7];
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
        this.field3351 = (short) var1;
        this.field3336 = (short) var4;
        this.field3328 = (short) var2;
        this.field3342 = (short) var5;
        this.field3327 = (short) var3;
        this.field3344 = (short) var6;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(III)I")
    public final int method1347(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3326; var4++) {
            if (this.field3337[var4] == arg0 && this.field3349[var4] == arg1 && this.field3318[var4] == arg2) {
                return var4;
            }
        }
        this.field3337[this.field3326] = arg0;
        this.field3349[this.field3326] = arg1;
        this.field3318[this.field3326] = arg2;
        return this.field3326++;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(III)V")
    public final void method1348(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3326; var4++) {
            this.field3337[var4] = this.field3337[var4] * arg0 / 128;
            this.field3349[var4] = this.field3349[var4] * arg1 / 128;
            this.field3318[var4] = this.field3318[var4] * arg2 / 128;
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "()V")
    public final void method1349() {
        this.field3332 = null;
        this.field3329 = null;
        this.field3358 = null;
        this.field3346 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(SS)V")
    public final void method1350(short arg0, short arg1) {
        if (this.field3365 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3357; var3++) {
            if (this.field3365[var3] == arg0) {
                this.field3365[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "()V")
    public final void method1351() {
        for (int var1 = 0; var1 < this.field3326; var1++) {
            int var2 = this.field3337[var1];
            this.field3337[var1] = this.field3318[var1];
            this.field3318[var1] = -var2;
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "()V")
    private final void method1352() {
        this.field3356 = null;
        this.field3325 = null;
        this.field3355 = null;
        this.field3364 = false;
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "()V")
    public final void method1353() {
        if (this.field3356 != null) {
            return;
        }
        this.field3356 = new class49[this.field3326];
        for (int var1 = 0; var1 < this.field3326; var1++) {
            this.field3356[var1] = new class49();
        }
        for (int var2 = 0; var2 < this.field3357; var2++) {
            int var3 = this.field3333[var2];
            int var4 = this.field3330[var2];
            int var5 = this.field3341[var2];
            int var6 = this.field3337[var4] - this.field3337[var3];
            int var7 = this.field3349[var4] - this.field3349[var3];
            int var8 = this.field3318[var4] - this.field3318[var3];
            int var9 = this.field3337[var5] - this.field3337[var3];
            int var10 = this.field3349[var5] - this.field3349[var3];
            int var11 = this.field3318[var5] - this.field3318[var3];
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
            if (this.field3343 == null) {
                var19 = 0;
            } else {
                var19 = this.field3343[var2];
            }
            if (var19 == 0) {
                class49 var20 = this.field3356[var3];
                var20.field879 += var16;
                var20.field874 += var17;
                var20.field875 += var18;
                var20.field878++;
                class49 var21 = this.field3356[var4];
                var21.field879 += var16;
                var21.field874 += var17;
                var21.field875 += var18;
                var21.field878++;
                class49 var22 = this.field3356[var5];
                var22.field879 += var16;
                var22.field874 += var17;
                var22.field875 += var18;
                var22.field878++;
            } else if (var19 == 1) {
                if (this.field3355 == null) {
                    this.field3355 = new class2[this.field3357];
                }
                class2 var23 = this.field3355[var2] = new class2();
                var23.field19 = var16;
                var23.field17 = var17;
                var23.field25 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Laa;")
    public final class16 method124(int arg0, int arg1, int arg2) {
        return this.method1362(this.field3335, this.field3331, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    private final void method1354(int arg0) {
        int var2 = field3348[arg0];
        int var3 = field3347[arg0];
        for (int var4 = 0; var4 < this.field3326; var4++) {
            int var5 = this.field3349[var4] * var2 + this.field3337[var4] * var3 >> 16;
            this.field3349[var4] = this.field3349[var4] * var3 - this.field3337[var4] * var2 >> 16;
            this.field3337[var4] = var5;
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIBSB)I")
    public final int method1355(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3333[this.field3357] = arg0;
        this.field3330[this.field3357] = arg1;
        this.field3341[this.field3357] = arg2;
        this.field3343[this.field3357] = arg3;
        this.field3320[this.field3357] = -1;
        this.field3323[this.field3357] = arg4;
        this.field3365[this.field3357] = -1;
        this.field3338[this.field3357] = arg5;
        return this.field3357++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([B)V")
    private final void method1356(byte[] arg0) {
        class217 var2 = new class217(arg0);
        class217 var3 = new class217(arg0);
        class217 var4 = new class217(arg0);
        class217 var5 = new class217(arg0);
        class217 var6 = new class217(arg0);
        class217 var7 = new class217(arg0);
        class217 var8 = new class217(arg0);
        var2.field3581 = arg0.length - 23;
        int var9 = var2.method1441(-78);
        int var10 = var2.method1441(-48);
        int var11 = var2.method1487(255);
        int var12 = var2.method1487(255);
        int var13 = var2.method1487(255);
        int var14 = var2.method1487(255);
        int var15 = var2.method1487(255);
        int var16 = var2.method1487(255);
        int var17 = var2.method1487(255);
        int var18 = var2.method1441(111);
        int var19 = var2.method1441(99);
        int var20 = var2.method1441(91);
        int var21 = var2.method1441(115);
        int var22 = var2.method1441(-42);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3322 = new byte[var11];
            var2.field3581 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field3322[var26] = var2.method1444((byte) -71);
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
        this.field3326 = var9;
        this.field3357 = var10;
        this.field3339 = var11;
        this.field3337 = new int[var9];
        this.field3349 = new int[var9];
        this.field3318 = new int[var9];
        this.field3333 = new int[var10];
        this.field3330 = new int[var10];
        this.field3341 = new int[var10];
        if (var17 == 1) {
            this.field3332 = new int[var9];
        }
        if (var12 == 1) {
            this.field3343 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3321 = new byte[var10];
        } else {
            this.field3359 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3338 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3329 = new int[var10];
        }
        if (var16 == 1) {
            this.field3365 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3320 = new byte[var10];
        }
        this.field3323 = new short[var10];
        if (var11 > 0) {
            this.field3334 = new short[var11];
            this.field3319 = new short[var11];
            this.field3350 = new short[var11];
            if (var24 > 0) {
                this.field3362 = new short[var24];
                this.field3361 = new short[var24];
                this.field3324 = new short[var24];
                this.field3317 = new byte[var24];
                this.field3352 = new byte[var24];
                this.field3360 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3363 = new byte[var25];
                this.field3345 = new byte[var25];
            }
        }
        var2.field3581 = var11;
        var3.field3581 = var44;
        var4.field3581 = var46;
        var5.field3581 = var48;
        var6.field3581 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1487(255);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1453(128);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1453(128);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1453(128);
            }
            this.field3337[var66] = var63 + var80;
            this.field3349[var66] = var64 + var81;
            this.field3318[var66] = var65 + var82;
            var63 = this.field3337[var66];
            var64 = this.field3349[var66];
            var65 = this.field3318[var66];
            if (var17 == 1) {
                this.field3332[var66] = var6.method1487(255);
            }
        }
        var2.field3581 = var42;
        var3.field3581 = var31;
        var4.field3581 = var34;
        var5.field3581 = var37;
        var6.field3581 = var35;
        var7.field3581 = var40;
        var8.field3581 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field3323[var67] = (short) var2.method1441(90);
            if (var12 == 1) {
                this.field3343[var67] = var3.method1444((byte) -126);
            }
            if (var13 == 255) {
                this.field3321[var67] = var4.method1444((byte) -59);
            }
            if (var14 == 1) {
                this.field3338[var67] = var5.method1444((byte) -113);
            }
            if (var15 == 1) {
                this.field3329[var67] = var6.method1487(255);
            }
            if (var16 == 1) {
                this.field3365[var67] = (short) (var7.method1441(-70) - 1);
            }
            if (this.field3320 != null) {
                if (this.field3365[var67] == -1) {
                    this.field3320[var67] = -1;
                } else {
                    this.field3320[var67] = (byte) (var8.method1487(255) - 1);
                }
            }
        }
        var2.field3581 = var33;
        var3.field3581 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1487(255);
            if (var75 == 1) {
                var68 = var2.method1453(128) + var71;
                var69 = var2.method1453(128) + var68;
                var70 = var2.method1453(128) + var69;
                var71 = var70;
                this.field3333[var72] = var68;
                this.field3330[var72] = var69;
                this.field3341[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1453(128) + var71;
                var71 = var70;
                this.field3333[var72] = var68;
                this.field3330[var72] = var69;
                this.field3341[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1453(128) + var71;
                var71 = var70;
                this.field3333[var72] = var68;
                this.field3330[var72] = var69;
                this.field3341[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1453(128) + var71;
                var71 = var70;
                this.field3333[var72] = var68;
                this.field3330[var72] = var78;
                this.field3341[var72] = var70;
            }
        }
        var2.field3581 = var50;
        var3.field3581 = var52;
        var4.field3581 = var54;
        var5.field3581 = var56;
        var6.field3581 = var58;
        var7.field3581 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field3322[var73] & 0xFF;
            if (var74 == 0) {
                this.field3334[var73] = (short) var2.method1441(-42);
                this.field3319[var73] = (short) var2.method1441(91);
                this.field3350[var73] = (short) var2.method1441(125);
            }
            if (var74 == 1) {
                this.field3334[var73] = (short) var3.method1441(126);
                this.field3319[var73] = (short) var3.method1441(126);
                this.field3350[var73] = (short) var3.method1441(120);
                this.field3362[var73] = (short) var4.method1441(-125);
                this.field3361[var73] = (short) var4.method1441(90);
                this.field3324[var73] = (short) var4.method1441(-55);
                this.field3317[var73] = var5.method1444((byte) -70);
                this.field3352[var73] = var6.method1444((byte) -104);
                this.field3360[var73] = var7.method1444((byte) -87);
            }
            if (var74 == 2) {
                this.field3334[var73] = (short) var3.method1441(-21);
                this.field3319[var73] = (short) var3.method1441(-34);
                this.field3350[var73] = (short) var3.method1441(72);
                this.field3362[var73] = (short) var4.method1441(105);
                this.field3361[var73] = (short) var4.method1441(76);
                this.field3324[var73] = (short) var4.method1441(-41);
                this.field3317[var73] = var5.method1444((byte) -106);
                this.field3352[var73] = var6.method1444((byte) -92);
                this.field3360[var73] = var7.method1444((byte) -111);
                this.field3363[var73] = var7.method1444((byte) -35);
                this.field3345[var73] = var7.method1444((byte) -90);
            }
            if (var74 == 3) {
                this.field3334[var73] = (short) var3.method1441(-86);
                this.field3319[var73] = (short) var3.method1441(-62);
                this.field3350[var73] = (short) var3.method1441(-94);
                this.field3362[var73] = (short) var4.method1441(114);
                this.field3361[var73] = (short) var4.method1441(-30);
                this.field3324[var73] = (short) var4.method1441(-104);
                this.field3317[var73] = var5.method1444((byte) -68);
                this.field3352[var73] = var6.method1444((byte) -76);
                this.field3360[var73] = var7.method1444((byte) -45);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([[IIIIII)V")
    private final void method1357(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1372(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1372(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1372(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1372(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method1368(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method1354(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1371(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(SS)V")
    public final void method1358(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3357; var3++) {
            if (this.field3323[var3] == arg0) {
                this.field3323[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()I")
    public final int method126() {
        if (!this.field3364) {
            this.method1346();
        }
        return this.field3328;
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "()V")
    public final void method1359() {
        int var10002;
        if (this.field3332 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3326; var3++) {
                int var7 = this.field3332[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3358 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3358[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3326) {
                int var6 = this.field3332[var5];
                this.field3358[var6][var1[var6]++] = var5++;
            }
            this.field3332 = null;
        }
        if (this.field3329 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3357; var10++) {
            int var14 = this.field3329[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3346 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3346[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3357) {
            int var13 = this.field3329[var12];
            this.field3346[var13][var8[var13]++] = var12++;
        }
        this.field3329 = null;
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "()V")
    public static void method1360() {
        field3354 = null;
        field3340 = null;
        field3348 = null;
        field3347 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIIII)Lcd;")
    public final class149 method1361(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class149(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(IIIII)Lwg;")
    public final class98 method1362(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class149(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "()V")
    public final void method1363() {
        for (int var1 = 0; var1 < this.field3326; var1++) {
            this.field3318[var1] = -this.field3318[var1];
        }
        for (int var2 = 0; var2 < this.field3357; var2++) {
            int var3 = this.field3333[var2];
            this.field3333[var2] = this.field3341[var2];
            this.field3341[var2] = var3;
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[[I[[IIIIZZ)Lnd;")
    public final class202 method1364(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1346();
        int var10 = this.field3351 + arg4;
        int var11 = this.field3336 + arg4;
        int var12 = this.field3327 + arg6;
        int var13 = this.field3344 + arg6;
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
        class202 var18;
        if (arg7) {
            var18 = new class202();
            var18.field3326 = this.field3326;
            var18.field3357 = this.field3357;
            var18.field3339 = this.field3339;
            var18.field3333 = this.field3333;
            var18.field3330 = this.field3330;
            var18.field3341 = this.field3341;
            var18.field3343 = this.field3343;
            var18.field3321 = this.field3321;
            var18.field3338 = this.field3338;
            var18.field3320 = this.field3320;
            var18.field3323 = this.field3323;
            var18.field3365 = this.field3365;
            var18.field3359 = this.field3359;
            var18.field3322 = this.field3322;
            var18.field3334 = this.field3334;
            var18.field3319 = this.field3319;
            var18.field3350 = this.field3350;
            var18.field3362 = this.field3362;
            var18.field3361 = this.field3361;
            var18.field3324 = this.field3324;
            var18.field3317 = this.field3317;
            var18.field3352 = this.field3352;
            var18.field3360 = this.field3360;
            var18.field3363 = this.field3363;
            var18.field3345 = this.field3345;
            var18.field3332 = this.field3332;
            var18.field3329 = this.field3329;
            var18.field3358 = this.field3358;
            var18.field3346 = this.field3346;
            var18.field3335 = this.field3335;
            var18.field3331 = this.field3331;
            var18.field3356 = this.field3356;
            var18.field3355 = this.field3355;
            var18.field3325 = this.field3325;
            if (arg0 == 3) {
                var18.field3337 = class142.method994((byte) 111, this.field3337);
                var18.field3349 = class142.method994((byte) 71, this.field3349);
                var18.field3318 = class142.method994((byte) 118, this.field3318);
            } else {
                var18.field3337 = this.field3337;
                var18.field3349 = new int[var18.field3326];
                var18.field3318 = this.field3318;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3326; var19++) {
                int var20 = this.field3337[var19] + arg4;
                int var21 = this.field3318[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3349[var19] = this.field3349[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3326; var29++) {
                int var30 = (this.field3349[var29] << 16) / this.field3328;
                if (var30 < arg1) {
                    int var31 = this.field3337[var29] + arg4;
                    int var32 = this.field3318[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3349[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3349[var29];
                } else {
                    var18.field3349[var29] = this.field3349[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1357(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3342 - this.field3328;
            for (int var43 = 0; var43 < this.field3326; var43++) {
                int var44 = this.field3337[var43] + arg4;
                int var45 = this.field3318[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3349[var43] = var52 + this.field3349[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3342 - this.field3328;
            for (int var54 = 0; var54 < this.field3326; var54++) {
                int var55 = this.field3337[var54] + arg4;
                int var56 = this.field3318[var54] + arg6;
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
                var18.field3349[var54] = ((this.field3349[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1352();
        } else {
            this.field3364 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public final void method1365(int arg0) {
        int var2 = field3348[arg0];
        int var3 = field3347[arg0];
        for (int var4 = 0; var4 < this.field3326; var4++) {
            int var5 = this.field3337[var4] * var3 + this.field3318[var4] * var2 >> 16;
            this.field3318[var4] = this.field3318[var4] * var3 - this.field3337[var4] * var2 >> 16;
            this.field3337[var4] = var5;
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "()Lnd;")
    public final class202 method1366() {
        class202 var1 = new class202();
        if (this.field3343 != null) {
            var1.field3343 = new byte[this.field3357];
            for (int var2 = 0; var2 < this.field3357; var2++) {
                var1.field3343[var2] = this.field3343[var2];
            }
        }
        var1.field3326 = this.field3326;
        var1.field3357 = this.field3357;
        var1.field3339 = this.field3339;
        var1.field3337 = this.field3337;
        var1.field3349 = this.field3349;
        var1.field3318 = this.field3318;
        var1.field3333 = this.field3333;
        var1.field3330 = this.field3330;
        var1.field3341 = this.field3341;
        var1.field3321 = this.field3321;
        var1.field3338 = this.field3338;
        var1.field3320 = this.field3320;
        var1.field3323 = this.field3323;
        var1.field3365 = this.field3365;
        var1.field3359 = this.field3359;
        var1.field3322 = this.field3322;
        var1.field3334 = this.field3334;
        var1.field3319 = this.field3319;
        var1.field3350 = this.field3350;
        var1.field3362 = this.field3362;
        var1.field3361 = this.field3361;
        var1.field3324 = this.field3324;
        var1.field3317 = this.field3317;
        var1.field3352 = this.field3352;
        var1.field3360 = this.field3360;
        var1.field3363 = this.field3363;
        var1.field3345 = this.field3345;
        var1.field3332 = this.field3332;
        var1.field3329 = this.field3329;
        var1.field3358 = this.field3358;
        var1.field3346 = this.field3346;
        var1.field3356 = this.field3356;
        var1.field3355 = this.field3355;
        var1.field3335 = this.field3335;
        var1.field3331 = this.field3331;
        return var1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lda;II)Lnd;")
    public static final class202 method1367(class22 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method190((byte) -71, arg2, arg1);
        return var3 == null ? null : new class202(var3);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Laa;IIIZ)V")
    public final void method120(class16 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class202 var6 = (class202) arg0;
        var6.method1346();
        var6.method1353();
        field3353++;
        int var7 = 0;
        int[] var8 = var6.field3337;
        int var9 = var6.field3326;
        for (int var10 = 0; var10 < this.field3326; var10++) {
            class49 var13 = this.field3356[var10];
            if (var13.field878 != 0) {
                int var14 = this.field3349[var10] - arg2;
                if (var14 >= var6.field3328 && var14 <= var6.field3342) {
                    int var15 = this.field3337[var10] - arg1;
                    if (var15 >= var6.field3351 && var15 <= var6.field3336) {
                        int var16 = this.field3318[var10] - arg3;
                        if (var16 >= var6.field3327 && var16 <= var6.field3344) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class49 var18 = var6.field3356[var17];
                                if (var8[var17] == var15 && var6.field3318[var17] == var16 && var6.field3349[var17] == var14 && var18.field878 != 0) {
                                    if (this.field3325 == null) {
                                        this.field3325 = new class49[this.field3326];
                                    }
                                    if (var6.field3325 == null) {
                                        var6.field3325 = new class49[var9];
                                    }
                                    class49 var19 = this.field3325[var10];
                                    if (var19 == null) {
                                        var19 = this.field3325[var10] = new class49(var13);
                                    }
                                    class49 var20 = var6.field3325[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3325[var17] = new class49(var18);
                                    }
                                    var19.field879 += var18.field879;
                                    var19.field874 += var18.field874;
                                    var19.field875 += var18.field875;
                                    var19.field878 += var18.field878;
                                    var20.field879 += var13.field879;
                                    var20.field874 += var13.field874;
                                    var20.field875 += var13.field875;
                                    var20.field878 += var13.field878;
                                    var7++;
                                    field3354[var10] = field3353;
                                    field3340[var17] = field3353;
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
        for (int var11 = 0; var11 < this.field3357; var11++) {
            if (field3354[this.field3333[var11]] == field3353 && field3354[this.field3330[var11]] == field3353 && field3354[this.field3341[var11]] == field3353) {
                if (this.field3343 == null) {
                    this.field3343 = new byte[this.field3357];
                }
                this.field3343[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3357; var12++) {
            if (field3340[var6.field3333[var12]] == field3353 && field3340[var6.field3330[var12]] == field3353 && field3340[var6.field3341[var12]] == field3353) {
                if (var6.field3343 == null) {
                    var6.field3343 = new byte[var6.field3357];
                }
                var6.field3343[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    private final void method1368(int arg0) {
        int var2 = field3348[arg0];
        int var3 = field3347[arg0];
        for (int var4 = 0; var4 < this.field3326; var4++) {
            int var5 = this.field3349[var4] * var3 - this.field3318[var4] * var2 >> 16;
            this.field3318[var4] = this.field3349[var4] * var2 + this.field3318[var4] * var3 >> 16;
            this.field3349[var4] = var5;
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lnd;I)I")
    private final int method1369(class202 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3337[arg1];
        int var5 = arg0.field3349[arg1];
        int var6 = arg0.field3318[arg1];
        for (int var7 = 0; var7 < this.field3326; var7++) {
            if (this.field3337[var7] == var4 && this.field3349[var7] == var5 && this.field3318[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3337[this.field3326] = var4;
            this.field3349[this.field3326] = var5;
            this.field3318[this.field3326] = var6;
            if (arg0.field3332 != null) {
                this.field3332[this.field3326] = arg0.field3332[arg1];
            }
            var3 = this.field3326++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([B)V")
    private final void method1370(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class217 var4 = new class217(arg0);
        class217 var5 = new class217(arg0);
        class217 var6 = new class217(arg0);
        class217 var7 = new class217(arg0);
        class217 var8 = new class217(arg0);
        var4.field3581 = arg0.length - 18;
        int var9 = var4.method1441(105);
        int var10 = var4.method1441(-84);
        int var11 = var4.method1487(255);
        int var12 = var4.method1487(255);
        int var13 = var4.method1487(255);
        int var14 = var4.method1487(255);
        int var15 = var4.method1487(255);
        int var16 = var4.method1487(255);
        int var17 = var4.method1441(90);
        int var18 = var4.method1441(-21);
        int var19 = var4.method1441(108);
        int var20 = var4.method1441(70);
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
        this.field3326 = var9;
        this.field3357 = var10;
        this.field3339 = var11;
        this.field3337 = new int[var9];
        this.field3349 = new int[var9];
        this.field3318 = new int[var9];
        this.field3333 = new int[var10];
        this.field3330 = new int[var10];
        this.field3341 = new int[var10];
        if (var11 > 0) {
            this.field3322 = new byte[var11];
            this.field3334 = new short[var11];
            this.field3319 = new short[var11];
            this.field3350 = new short[var11];
        }
        if (var16 == 1) {
            this.field3332 = new int[var9];
        }
        if (var12 == 1) {
            this.field3343 = new byte[var10];
            this.field3320 = new byte[var10];
            this.field3365 = new short[var10];
        }
        if (var13 == 255) {
            this.field3321 = new byte[var10];
        } else {
            this.field3359 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3338 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3329 = new int[var10];
        }
        this.field3323 = new short[var10];
        var4.field3581 = var21;
        var5.field3581 = var36;
        var6.field3581 = var38;
        var7.field3581 = var40;
        var8.field3581 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1487(255);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1453(128);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1453(128);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1453(128);
            }
            this.field3337[var46] = var43 + var63;
            this.field3349[var46] = var44 + var64;
            this.field3318[var46] = var45 + var65;
            var43 = this.field3337[var46];
            var44 = this.field3349[var46];
            var45 = this.field3318[var46];
            if (var16 == 1) {
                this.field3332[var46] = var8.method1487(255);
            }
        }
        var4.field3581 = var32;
        var5.field3581 = var28;
        var6.field3581 = var26;
        var7.field3581 = var30;
        var8.field3581 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3323[var47] = (short) var4.method1441(-11);
            if (var12 == 1) {
                int var61 = var5.method1487(255);
                if ((var61 & 0x1) == 1) {
                    this.field3343[var47] = 1;
                    var2 = true;
                } else {
                    this.field3343[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3320[var47] = (byte) (var61 >> 2);
                    this.field3365[var47] = this.field3323[var47];
                    this.field3323[var47] = 127;
                    if (this.field3365[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3320[var47] = -1;
                    this.field3365[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3321[var47] = var6.method1444((byte) -55);
            }
            if (var14 == 1) {
                this.field3338[var47] = var7.method1444((byte) -55);
            }
            if (var15 == 1) {
                this.field3329[var47] = var8.method1487(255);
            }
        }
        var4.field3581 = var25;
        var5.field3581 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1487(255);
            if (var57 == 1) {
                var48 = var4.method1453(128) + var51;
                var49 = var4.method1453(128) + var48;
                var50 = var4.method1453(128) + var49;
                var51 = var50;
                this.field3333[var52] = var48;
                this.field3330[var52] = var49;
                this.field3341[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1453(128) + var51;
                var51 = var50;
                this.field3333[var52] = var48;
                this.field3330[var52] = var49;
                this.field3341[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1453(128) + var51;
                var51 = var50;
                this.field3333[var52] = var48;
                this.field3330[var52] = var49;
                this.field3341[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1453(128) + var51;
                var51 = var50;
                this.field3333[var52] = var48;
                this.field3330[var52] = var60;
                this.field3341[var52] = var50;
            }
        }
        var4.field3581 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3322[var53] = 0;
            this.field3334[var53] = (short) var4.method1441(82);
            this.field3319[var53] = (short) var4.method1441(-51);
            this.field3350[var53] = (short) var4.method1441(-97);
        }
        if (this.field3320 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3320[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3334[var56] & 0xFFFF) == this.field3333[var55] && (this.field3319[var56] & 0xFFFF) == this.field3330[var55] && (this.field3350[var56] & 0xFFFF) == this.field3341[var55]) {
                        this.field3320[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3320 = null;
            }
        }
        if (!var3) {
            this.field3365 = null;
        }
        if (!var2) {
            this.field3343 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(III)V")
    public final void method1371(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3326; var4++) {
            this.field3337[var4] += arg0;
            this.field3349[var4] += arg1;
            this.field3318[var4] += arg2;
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([[III)I")
    private static final int method1372(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()Z")
    public final boolean method127() {
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "()V")
    public final void method1373() {
        for (int var1 = 0; var1 < this.field3326; var1++) {
            this.field3337[var1] = -this.field3337[var1];
            this.field3318[var1] = -this.field3318[var1];
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    private class202() {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
    private class202(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1356(arg0);
        } else {
            this.method1370(arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
    public class202(int arg0, int arg1, int arg2) {
        this.field3337 = new int[arg0];
        this.field3349 = new int[arg0];
        this.field3318 = new int[arg0];
        this.field3332 = new int[arg0];
        this.field3333 = new int[arg1];
        this.field3330 = new int[arg1];
        this.field3341 = new int[arg1];
        this.field3343 = new byte[arg1];
        this.field3321 = new byte[arg1];
        this.field3338 = new byte[arg1];
        this.field3323 = new short[arg1];
        this.field3365 = new short[arg1];
        this.field3320 = new byte[arg1];
        this.field3329 = new int[arg1];
        if (arg2 > 0) {
            this.field3322 = new byte[arg2];
            this.field3334 = new short[arg2];
            this.field3319 = new short[arg2];
            this.field3350 = new short[arg2];
            this.field3362 = new short[arg2];
            this.field3361 = new short[arg2];
            this.field3324 = new short[arg2];
            this.field3317 = new byte[arg2];
            this.field3352 = new byte[arg2];
            this.field3360 = new byte[arg2];
            this.field3363 = new byte[arg2];
            this.field3345 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([Lnd;I)V")
    public class202(class202[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3326 = 0;
        this.field3357 = 0;
        this.field3339 = 0;
        this.field3359 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class202 var15 = arg0[var9];
            if (var15 != null) {
                this.field3326 += var15.field3326;
                this.field3357 += var15.field3357;
                this.field3339 += var15.field3339;
                if (var15.field3321 == null) {
                    if (this.field3359 == -1) {
                        this.field3359 = var15.field3359;
                    }
                    if (this.field3359 != var15.field3359) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field3343 != null;
                var5 |= var15.field3338 != null;
                var6 |= var15.field3329 != null;
                var7 |= var15.field3365 != null;
                var8 |= var15.field3320 != null;
            }
        }
        this.field3337 = new int[this.field3326];
        this.field3349 = new int[this.field3326];
        this.field3318 = new int[this.field3326];
        this.field3332 = new int[this.field3326];
        this.field3333 = new int[this.field3357];
        this.field3330 = new int[this.field3357];
        this.field3341 = new int[this.field3357];
        if (var3) {
            this.field3343 = new byte[this.field3357];
        }
        if (var4) {
            this.field3321 = new byte[this.field3357];
        }
        if (var5) {
            this.field3338 = new byte[this.field3357];
        }
        if (var6) {
            this.field3329 = new int[this.field3357];
        }
        if (var7) {
            this.field3365 = new short[this.field3357];
        }
        if (var8) {
            this.field3320 = new byte[this.field3357];
        }
        this.field3323 = new short[this.field3357];
        if (this.field3339 > 0) {
            this.field3322 = new byte[this.field3339];
            this.field3334 = new short[this.field3339];
            this.field3319 = new short[this.field3339];
            this.field3350 = new short[this.field3339];
            this.field3362 = new short[this.field3339];
            this.field3361 = new short[this.field3339];
            this.field3324 = new short[this.field3339];
            this.field3317 = new byte[this.field3339];
            this.field3352 = new byte[this.field3339];
            this.field3360 = new byte[this.field3339];
            this.field3363 = new byte[this.field3339];
            this.field3345 = new byte[this.field3339];
        }
        this.field3326 = 0;
        this.field3357 = 0;
        this.field3339 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class202 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3357; var12++) {
                    if (var3 && var11.field3343 != null) {
                        this.field3343[this.field3357] = var11.field3343[var12];
                    }
                    if (var4) {
                        if (var11.field3321 == null) {
                            this.field3321[this.field3357] = var11.field3359;
                        } else {
                            this.field3321[this.field3357] = var11.field3321[var12];
                        }
                    }
                    if (var5 && var11.field3338 != null) {
                        this.field3338[this.field3357] = var11.field3338[var12];
                    }
                    if (var6 && var11.field3329 != null) {
                        this.field3329[this.field3357] = var11.field3329[var12];
                    }
                    if (var7) {
                        if (var11.field3365 == null) {
                            this.field3365[this.field3357] = -1;
                        } else {
                            this.field3365[this.field3357] = var11.field3365[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field3320 == null || var11.field3320[var12] == -1) {
                            this.field3320[this.field3357] = -1;
                        } else {
                            this.field3320[this.field3357] = (byte) (var11.field3320[var12] + this.field3339);
                        }
                    }
                    this.field3323[this.field3357] = var11.field3323[var12];
                    this.field3333[this.field3357] = this.method1369(var11, var11.field3333[var12]);
                    this.field3330[this.field3357] = this.method1369(var11, var11.field3330[var12]);
                    this.field3341[this.field3357] = this.method1369(var11, var11.field3341[var12]);
                    this.field3357++;
                }
                for (int var13 = 0; var13 < var11.field3339; var13++) {
                    byte var14 = this.field3322[this.field3339] = var11.field3322[var13];
                    if (var14 == 0) {
                        this.field3334[this.field3339] = (short) this.method1369(var11, var11.field3334[var13]);
                        this.field3319[this.field3339] = (short) this.method1369(var11, var11.field3319[var13]);
                        this.field3350[this.field3339] = (short) this.method1369(var11, var11.field3350[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field3334[this.field3339] = var11.field3334[var13];
                        this.field3319[this.field3339] = var11.field3319[var13];
                        this.field3350[this.field3339] = var11.field3350[var13];
                        this.field3362[this.field3339] = var11.field3362[var13];
                        this.field3361[this.field3339] = var11.field3361[var13];
                        this.field3324[this.field3339] = var11.field3324[var13];
                        this.field3317[this.field3339] = var11.field3317[var13];
                        this.field3352[this.field3339] = var11.field3352[var13];
                        this.field3360[this.field3339] = var11.field3360[var13];
                    }
                    if (var14 == 2) {
                        this.field3363[this.field3339] = var11.field3363[var13];
                        this.field3345[this.field3339] = var11.field3345[var13];
                    }
                    this.field3339++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lnd;ZZZZ)V")
    public class202(class202 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3326 = arg0.field3326;
        this.field3357 = arg0.field3357;
        this.field3339 = arg0.field3339;
        if (arg1) {
            this.field3337 = arg0.field3337;
            this.field3349 = arg0.field3349;
            this.field3318 = arg0.field3318;
        } else {
            this.field3337 = new int[this.field3326];
            this.field3349 = new int[this.field3326];
            this.field3318 = new int[this.field3326];
            for (int var6 = 0; var6 < this.field3326; var6++) {
                this.field3337[var6] = arg0.field3337[var6];
                this.field3349[var6] = arg0.field3349[var6];
                this.field3318[var6] = arg0.field3318[var6];
            }
        }
        if (arg2) {
            this.field3323 = arg0.field3323;
        } else {
            this.field3323 = new short[this.field3357];
            for (int var7 = 0; var7 < this.field3357; var7++) {
                this.field3323[var7] = arg0.field3323[var7];
            }
        }
        if (arg3 || arg0.field3365 == null) {
            this.field3365 = arg0.field3365;
        } else {
            this.field3365 = new short[this.field3357];
            for (int var8 = 0; var8 < this.field3357; var8++) {
                this.field3365[var8] = arg0.field3365[var8];
            }
        }
        if (arg4) {
            this.field3338 = arg0.field3338;
        } else {
            this.field3338 = new byte[this.field3357];
            if (arg0.field3338 == null) {
                for (int var9 = 0; var9 < this.field3357; var9++) {
                    this.field3338[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3357; var10++) {
                    this.field3338[var10] = arg0.field3338[var10];
                }
            }
        }
        this.field3333 = arg0.field3333;
        this.field3330 = arg0.field3330;
        this.field3341 = arg0.field3341;
        this.field3343 = arg0.field3343;
        this.field3321 = arg0.field3321;
        this.field3320 = arg0.field3320;
        this.field3359 = arg0.field3359;
        this.field3322 = arg0.field3322;
        this.field3334 = arg0.field3334;
        this.field3319 = arg0.field3319;
        this.field3350 = arg0.field3350;
        this.field3362 = arg0.field3362;
        this.field3361 = arg0.field3361;
        this.field3324 = arg0.field3324;
        this.field3317 = arg0.field3317;
        this.field3352 = arg0.field3352;
        this.field3360 = arg0.field3360;
        this.field3363 = arg0.field3363;
        this.field3345 = arg0.field3345;
        this.field3332 = arg0.field3332;
        this.field3329 = arg0.field3329;
        this.field3358 = arg0.field3358;
        this.field3346 = arg0.field3346;
        this.field3356 = arg0.field3356;
        this.field3355 = arg0.field3355;
        this.field3325 = arg0.field3325;
        this.field3335 = arg0.field3335;
        this.field3331 = arg0.field3331;
    }
}
