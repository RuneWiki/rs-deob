import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class187 extends class16 {

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "B")
    public byte field3248 = 0;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public int field3265 = 0;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public int field3291 = 0;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "Z")
    private boolean field3279 = false;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "[I")
    public int[] field3282;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "[I")
    public int[] field3273;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "[I")
    public int[] field3281;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "[I")
    private int[] field3247;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "[I")
    public int[] field3269;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "[I")
    public int[] field3257;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "[I")
    public int[] field3264;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "[B")
    public byte[] field3277;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "[B")
    public byte[] field3267;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "[B")
    public byte[] field3288;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "[S")
    public short[] field3274;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "[S")
    public short[] field3251;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "[B")
    public byte[] field3249;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "[I")
    private int[] field3280;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "[B")
    public byte[] field3283;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "[S")
    public short[] field3261;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "[S")
    public short[] field3250;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "[S")
    public short[] field3253;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "[S")
    private short[] field3262;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "[S")
    private short[] field3278;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "[S")
    private short[] field3295;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "[B")
    private byte[] field3294;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "[B")
    private byte[] field3260;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "[B")
    private byte[] field3275;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "[B")
    private byte[] field3266;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "[B")
    private byte[] field3268;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "[[I")
    public int[][] field3259;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "[[I")
    public int[][] field3258;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "[Lke;")
    public class219[] field3270;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "[Ls;")
    public class100[] field3290;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "[Lke;")
    public class219[] field3272;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "S")
    public short field3287;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "S")
    public short field3255;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "[I")
    private static int[] field3252 = new int[10000];

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "[I")
    private static int[] field3285 = class15.field206;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    private static int field3256 = 0;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "[I")
    private static int[] field3286 = new int[10000];

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "[I")
    private static int[] field3284 = class15.field204;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "S")
    private short field3263;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "S")
    private short field3271;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "S")
    private short field3276;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "S")
    private short field3289;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "S")
    private short field3292;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "S")
    private short field3293;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public final void method1263(int arg0) {
        int var2 = field3284[arg0];
        int var3 = field3285[arg0];
        for (int var4 = 0; var4 < this.field3291; var4++) {
            int var5 = this.field3282[var4] * var3 + this.field3281[var4] * var2 >> 16;
            this.field3281[var4] = this.field3281[var4] * var3 - this.field3282[var4] * var2 >> 16;
            this.field3282[var4] = var5;
        }
        this.method1291();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIBSB)I")
    public final int method1264(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3269[this.field3265] = arg0;
        this.field3257[this.field3265] = arg1;
        this.field3264[this.field3265] = arg2;
        this.field3277[this.field3265] = arg3;
        this.field3249[this.field3265] = -1;
        this.field3274[this.field3265] = arg4;
        this.field3251[this.field3265] = -1;
        this.field3288[this.field3265] = arg5;
        return this.field3265++;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    private final void method1265(int arg0) {
        int var2 = field3284[arg0];
        int var3 = field3285[arg0];
        for (int var4 = 0; var4 < this.field3291; var4++) {
            int var5 = this.field3273[var4] * var3 - this.field3281[var4] * var2 >> 16;
            this.field3281[var4] = this.field3281[var4] * var3 + this.field3273[var4] * var2 >> 16;
            this.field3273[var4] = var5;
        }
        this.method1291();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()V")
    public final void method1266() {
        for (int var1 = 0; var1 < this.field3291; var1++) {
            int var2 = this.field3281[var1];
            this.field3281[var1] = this.field3282[var1];
            this.field3282[var1] = -var2;
        }
        this.method1291();
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()V")
    private final void method1267() {
        if (this.field3279) {
            return;
        }
        this.field3279 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3291; var7++) {
            int var8 = this.field3282[var7];
            int var9 = this.field3273[var7];
            int var10 = this.field3281[var7];
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
        this.field3293 = (short) var1;
        this.field3289 = (short) var4;
        this.field3263 = (short) var2;
        this.field3292 = (short) var5;
        this.field3271 = (short) var3;
        this.field3276 = (short) var6;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "()V")
    public final void method1268() {
        for (int var1 = 0; var1 < this.field3291; var1++) {
            this.field3281[var1] = -this.field3281[var1];
        }
        for (int var2 = 0; var2 < this.field3265; var2++) {
            int var3 = this.field3269[var2];
            this.field3269[var2] = this.field3264[var2];
            this.field3264[var2] = var3;
        }
        this.method1291();
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()I")
    public final int method126() {
        if (!this.field3279) {
            this.method1267();
        }
        return this.field3263;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "()V")
    public final void method1269() {
        if (this.field3270 != null) {
            return;
        }
        this.field3270 = new class219[this.field3291];
        for (int var1 = 0; var1 < this.field3291; var1++) {
            this.field3270[var1] = new class219();
        }
        for (int var2 = 0; var2 < this.field3265; var2++) {
            int var3 = this.field3269[var2];
            int var4 = this.field3257[var2];
            int var5 = this.field3264[var2];
            int var6 = this.field3282[var4] - this.field3282[var3];
            int var7 = this.field3273[var4] - this.field3273[var3];
            int var8 = this.field3281[var4] - this.field3281[var3];
            int var9 = this.field3282[var5] - this.field3282[var3];
            int var10 = this.field3273[var5] - this.field3273[var3];
            int var11 = this.field3281[var5] - this.field3281[var3];
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
            if (this.field3277 == null) {
                var19 = 0;
            } else {
                var19 = this.field3277[var2];
            }
            if (var19 == 0) {
                class219 var20 = this.field3270[var3];
                var20.field3842 += var16;
                var20.field3848 += var17;
                var20.field3844 += var18;
                var20.field3846++;
                class219 var21 = this.field3270[var4];
                var21.field3842 += var16;
                var21.field3848 += var17;
                var21.field3844 += var18;
                var21.field3846++;
                class219 var22 = this.field3270[var5];
                var22.field3842 += var16;
                var22.field3848 += var17;
                var22.field3844 += var18;
                var22.field3846++;
            } else if (var19 == 1) {
                if (this.field3290 == null) {
                    this.field3290 = new class100[this.field3265];
                }
                class100 var23 = this.field3290[var2] = new class100();
                var23.field1598 = var16;
                var23.field1601 = var17;
                var23.field1591 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lng;II)Lsf;")
    public static final class187 method1270(class121 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method826((byte) 35, arg1, arg2);
        return var3 == null ? null : new class187(var3);
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "()V")
    public final void method1271() {
        int var10002;
        if (this.field3247 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3291; var3++) {
                int var7 = this.field3247[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3259 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3259[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3291) {
                int var6 = this.field3247[var5];
                this.field3259[var6][var1[var6]++] = var5++;
            }
            this.field3247 = null;
        }
        if (this.field3280 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3265; var10++) {
            int var14 = this.field3280[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3258 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3258[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3265) {
            int var13 = this.field3280[var12];
            this.field3258[var13][var8[var13]++] = var12++;
        }
        this.field3280 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([[III)I")
    private static final int method1272(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([[IIIIII)V")
    private final void method1273(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1272(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1272(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1272(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1272(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1265(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1287(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1288(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([B)V")
    private final void method1274(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class225 var4 = new class225(arg0);
        class225 var5 = new class225(arg0);
        class225 var6 = new class225(arg0);
        class225 var7 = new class225(arg0);
        class225 var8 = new class225(arg0);
        var4.field3996 = arg0.length - 18;
        int var9 = var4.method1593(true);
        int var10 = var4.method1593(true);
        int var11 = var4.method1580(-7);
        int var12 = var4.method1580(-14);
        int var13 = var4.method1580(-120);
        int var14 = var4.method1580(-13);
        int var15 = var4.method1580(-69);
        int var16 = var4.method1580(-118);
        int var17 = var4.method1593(true);
        int var18 = var4.method1593(true);
        int var19 = var4.method1593(true);
        int var20 = var4.method1593(true);
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
        this.field3291 = var9;
        this.field3265 = var10;
        this.field3254 = var11;
        this.field3282 = new int[var9];
        this.field3273 = new int[var9];
        this.field3281 = new int[var9];
        this.field3269 = new int[var10];
        this.field3257 = new int[var10];
        this.field3264 = new int[var10];
        if (var11 > 0) {
            this.field3283 = new byte[var11];
            this.field3261 = new short[var11];
            this.field3250 = new short[var11];
            this.field3253 = new short[var11];
        }
        if (var16 == 1) {
            this.field3247 = new int[var9];
        }
        if (var12 == 1) {
            this.field3277 = new byte[var10];
            this.field3249 = new byte[var10];
            this.field3251 = new short[var10];
        }
        if (var13 == 255) {
            this.field3267 = new byte[var10];
        } else {
            this.field3248 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3288 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3280 = new int[var10];
        }
        this.field3274 = new short[var10];
        var4.field3996 = var21;
        var5.field3996 = var36;
        var6.field3996 = var38;
        var7.field3996 = var40;
        var8.field3996 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1580(-40);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1588(128);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1588(128);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1588(128);
            }
            this.field3282[var46] = var43 + var63;
            this.field3273[var46] = var44 + var64;
            this.field3281[var46] = var45 + var65;
            var43 = this.field3282[var46];
            var44 = this.field3273[var46];
            var45 = this.field3281[var46];
            if (var16 == 1) {
                this.field3247[var46] = var8.method1580(-100);
            }
        }
        var4.field3996 = var32;
        var5.field3996 = var28;
        var6.field3996 = var26;
        var7.field3996 = var30;
        var8.field3996 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3274[var47] = (short) var4.method1593(true);
            if (var12 == 1) {
                int var61 = var5.method1580(-40);
                if ((var61 & 0x1) == 1) {
                    this.field3277[var47] = 1;
                    var2 = true;
                } else {
                    this.field3277[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3249[var47] = (byte) (var61 >> 2);
                    this.field3251[var47] = this.field3274[var47];
                    this.field3274[var47] = 127;
                    if (this.field3251[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3249[var47] = -1;
                    this.field3251[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3267[var47] = var6.method1575(false);
            }
            if (var14 == 1) {
                this.field3288[var47] = var7.method1575(false);
            }
            if (var15 == 1) {
                this.field3280[var47] = var8.method1580(-35);
            }
        }
        var4.field3996 = var25;
        var5.field3996 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1580(-53);
            if (var57 == 1) {
                var48 = var4.method1588(128) + var51;
                var49 = var4.method1588(128) + var48;
                var50 = var4.method1588(128) + var49;
                var51 = var50;
                this.field3269[var52] = var48;
                this.field3257[var52] = var49;
                this.field3264[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1588(128) + var51;
                var51 = var50;
                this.field3269[var52] = var48;
                this.field3257[var52] = var49;
                this.field3264[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1588(128) + var51;
                var51 = var50;
                this.field3269[var52] = var48;
                this.field3257[var52] = var49;
                this.field3264[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1588(128) + var51;
                var51 = var50;
                this.field3269[var52] = var48;
                this.field3257[var52] = var60;
                this.field3264[var52] = var50;
            }
        }
        var4.field3996 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3283[var53] = 0;
            this.field3261[var53] = (short) var4.method1593(true);
            this.field3250[var53] = (short) var4.method1593(true);
            this.field3253[var53] = (short) var4.method1593(true);
        }
        if (this.field3249 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3249[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3261[var56] & 0xFFFF) == this.field3269[var55] && (this.field3250[var56] & 0xFFFF) == this.field3257[var55] && (this.field3253[var56] & 0xFFFF) == this.field3264[var55]) {
                        this.field3249[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3249 = null;
            }
        }
        if (!var3) {
            this.field3251 = null;
        }
        if (!var2) {
            this.field3277 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)V")
    public final void method1275(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3291; var4++) {
            this.field3282[var4] = this.field3282[var4] * arg0 / 128;
            this.field3273[var4] = this.field3273[var4] * arg1 / 128;
            this.field3281[var4] = this.field3281[var4] * arg2 / 128;
        }
        this.method1291();
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(III)I")
    public final int method1276(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3291; var4++) {
            if (this.field3282[var4] == arg0 && this.field3273[var4] == arg1 && this.field3281[var4] == arg2) {
                return var4;
            }
        }
        this.field3282[this.field3291] = arg0;
        this.field3273[this.field3291] = arg1;
        this.field3281[this.field3291] = arg2;
        return this.field3291++;
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "()V")
    public final void method1277() {
        this.field3247 = null;
        this.field3280 = null;
        this.field3259 = null;
        this.field3258 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;I)I")
    private final int method1278(class187 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3282[arg1];
        int var5 = arg0.field3273[arg1];
        int var6 = arg0.field3281[arg1];
        for (int var7 = 0; var7 < this.field3291; var7++) {
            if (this.field3282[var7] == var4 && this.field3273[var7] == var5 && this.field3281[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3282[this.field3291] = var4;
            this.field3273[this.field3291] = var5;
            this.field3281[this.field3291] = var6;
            if (arg0.field3247 != null) {
                this.field3247[this.field3291] = arg0.field3247[arg1];
            }
            var3 = this.field3291++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)Lje;")
    public final class144 method1279(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class144(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lbe;IIIZ)V")
    public final void method128(class16 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class187 var6 = (class187) arg0;
        var6.method1267();
        var6.method1269();
        field3256++;
        int var7 = 0;
        int[] var8 = var6.field3282;
        int var9 = var6.field3291;
        for (int var10 = 0; var10 < this.field3291; var10++) {
            class219 var13 = this.field3270[var10];
            if (var13.field3846 != 0) {
                int var14 = this.field3273[var10] - arg2;
                if (var14 >= var6.field3263 && var14 <= var6.field3292) {
                    int var15 = this.field3282[var10] - arg1;
                    if (var15 >= var6.field3293 && var15 <= var6.field3289) {
                        int var16 = this.field3281[var10] - arg3;
                        if (var16 >= var6.field3271 && var16 <= var6.field3276) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class219 var18 = var6.field3270[var17];
                                if (var8[var17] == var15 && var6.field3281[var17] == var16 && var6.field3273[var17] == var14 && var18.field3846 != 0) {
                                    if (this.field3272 == null) {
                                        this.field3272 = new class219[this.field3291];
                                    }
                                    if (var6.field3272 == null) {
                                        var6.field3272 = new class219[var9];
                                    }
                                    class219 var19 = this.field3272[var10];
                                    if (var19 == null) {
                                        var19 = this.field3272[var10] = new class219(var13);
                                    }
                                    class219 var20 = var6.field3272[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3272[var17] = new class219(var18);
                                    }
                                    var19.field3842 += var18.field3842;
                                    var19.field3848 += var18.field3848;
                                    var19.field3844 += var18.field3844;
                                    var19.field3846 += var18.field3846;
                                    var20.field3842 += var13.field3842;
                                    var20.field3848 += var13.field3848;
                                    var20.field3844 += var13.field3844;
                                    var20.field3846 += var13.field3846;
                                    var7++;
                                    field3252[var10] = field3256;
                                    field3286[var17] = field3256;
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
        for (int var11 = 0; var11 < this.field3265; var11++) {
            if (field3252[this.field3269[var11]] == field3256 && field3252[this.field3257[var11]] == field3256 && field3252[this.field3264[var11]] == field3256) {
                if (this.field3277 == null) {
                    this.field3277 = new byte[this.field3265];
                }
                this.field3277[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3265; var12++) {
            if (field3286[var6.field3269[var12]] == field3256 && field3286[var6.field3257[var12]] == field3256 && field3286[var6.field3264[var12]] == field3256) {
                if (var6.field3277 == null) {
                    var6.field3277 = new byte[var6.field3265];
                }
                var6.field3277[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIIII)Lee;")
    public final class251 method1280(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class144(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lbe;")
    public final class16 method123(int arg0, int arg1, int arg2) {
        return this.method1280(this.field3287, this.field3255, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "()V")
    public static void method1281() {
        field3252 = null;
        field3286 = null;
        field3284 = null;
        field3285 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[[I[[IIIIZZ)Lsf;")
    public final class187 method1282(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1267();
        int var10 = this.field3293 + arg4;
        int var11 = this.field3289 + arg4;
        int var12 = this.field3271 + arg6;
        int var13 = this.field3276 + arg6;
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
        class187 var18;
        if (arg7) {
            var18 = new class187();
            var18.field3291 = this.field3291;
            var18.field3265 = this.field3265;
            var18.field3254 = this.field3254;
            var18.field3269 = this.field3269;
            var18.field3257 = this.field3257;
            var18.field3264 = this.field3264;
            var18.field3277 = this.field3277;
            var18.field3267 = this.field3267;
            var18.field3288 = this.field3288;
            var18.field3249 = this.field3249;
            var18.field3274 = this.field3274;
            var18.field3251 = this.field3251;
            var18.field3248 = this.field3248;
            var18.field3283 = this.field3283;
            var18.field3261 = this.field3261;
            var18.field3250 = this.field3250;
            var18.field3253 = this.field3253;
            var18.field3262 = this.field3262;
            var18.field3278 = this.field3278;
            var18.field3295 = this.field3295;
            var18.field3294 = this.field3294;
            var18.field3260 = this.field3260;
            var18.field3275 = this.field3275;
            var18.field3266 = this.field3266;
            var18.field3268 = this.field3268;
            var18.field3247 = this.field3247;
            var18.field3280 = this.field3280;
            var18.field3259 = this.field3259;
            var18.field3258 = this.field3258;
            var18.field3287 = this.field3287;
            var18.field3255 = this.field3255;
            var18.field3270 = this.field3270;
            var18.field3290 = this.field3290;
            var18.field3272 = this.field3272;
            if (arg0 == 3) {
                var18.field3282 = class32.method217((byte) -54, this.field3282);
                var18.field3273 = class32.method217((byte) -54, this.field3273);
                var18.field3281 = class32.method217((byte) -54, this.field3281);
            } else {
                var18.field3282 = this.field3282;
                var18.field3273 = new int[var18.field3291];
                var18.field3281 = this.field3281;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3291; var19++) {
                int var20 = this.field3282[var19] + arg4;
                int var21 = this.field3281[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3273[var19] = this.field3273[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3291; var29++) {
                int var30 = (this.field3273[var29] << 16) / this.field3263;
                if (var30 < arg1) {
                    int var31 = this.field3282[var29] + arg4;
                    int var32 = this.field3281[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3273[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3273[var29];
                } else {
                    var18.field3273[var29] = this.field3273[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1273(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3292 - this.field3263;
            for (int var43 = 0; var43 < this.field3291; var43++) {
                int var44 = this.field3282[var43] + arg4;
                int var45 = this.field3281[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3273[var43] = var52 + this.field3273[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3292 - this.field3263;
            for (int var54 = 0; var54 < this.field3291; var54++) {
                int var55 = this.field3282[var54] + arg4;
                int var56 = this.field3281[var54] + arg6;
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
                var18.field3273[var54] = ((this.field3273[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1291();
        } else {
            this.field3279 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(SS)V")
    public final void method1283(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3265; var3++) {
            if (this.field3274[var3] == arg0) {
                this.field3274[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "()V")
    public final void method1284() {
        for (int var1 = 0; var1 < this.field3291; var1++) {
            this.field3282[var1] = -this.field3282[var1];
            this.field3281[var1] = -this.field3281[var1];
        }
        this.method1291();
    }

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "()Lsf;")
    public final class187 method1285() {
        class187 var1 = new class187();
        if (this.field3277 != null) {
            var1.field3277 = new byte[this.field3265];
            for (int var2 = 0; var2 < this.field3265; var2++) {
                var1.field3277[var2] = this.field3277[var2];
            }
        }
        var1.field3291 = this.field3291;
        var1.field3265 = this.field3265;
        var1.field3254 = this.field3254;
        var1.field3282 = this.field3282;
        var1.field3273 = this.field3273;
        var1.field3281 = this.field3281;
        var1.field3269 = this.field3269;
        var1.field3257 = this.field3257;
        var1.field3264 = this.field3264;
        var1.field3267 = this.field3267;
        var1.field3288 = this.field3288;
        var1.field3249 = this.field3249;
        var1.field3274 = this.field3274;
        var1.field3251 = this.field3251;
        var1.field3248 = this.field3248;
        var1.field3283 = this.field3283;
        var1.field3261 = this.field3261;
        var1.field3250 = this.field3250;
        var1.field3253 = this.field3253;
        var1.field3262 = this.field3262;
        var1.field3278 = this.field3278;
        var1.field3295 = this.field3295;
        var1.field3294 = this.field3294;
        var1.field3260 = this.field3260;
        var1.field3275 = this.field3275;
        var1.field3266 = this.field3266;
        var1.field3268 = this.field3268;
        var1.field3247 = this.field3247;
        var1.field3280 = this.field3280;
        var1.field3259 = this.field3259;
        var1.field3258 = this.field3258;
        var1.field3270 = this.field3270;
        var1.field3290 = this.field3290;
        var1.field3287 = this.field3287;
        var1.field3255 = this.field3255;
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(III)V")
    public final void method1286(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3284[arg2];
            int var5 = field3285[arg2];
            for (int var6 = 0; var6 < this.field3291; var6++) {
                int var7 = this.field3282[var6] * var5 + this.field3273[var6] * var4 >> 16;
                this.field3273[var6] = this.field3273[var6] * var5 - this.field3282[var6] * var4 >> 16;
                this.field3282[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3284[arg0];
            int var9 = field3285[arg0];
            for (int var10 = 0; var10 < this.field3291; var10++) {
                int var11 = this.field3273[var10] * var9 - this.field3281[var10] * var8 >> 16;
                this.field3281[var10] = this.field3281[var10] * var9 + this.field3273[var10] * var8 >> 16;
                this.field3273[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3284[arg1];
        int var13 = field3285[arg1];
        for (int var14 = 0; var14 < this.field3291; var14++) {
            int var15 = this.field3282[var14] * var13 + this.field3281[var14] * var12 >> 16;
            this.field3281[var14] = this.field3281[var14] * var13 - this.field3282[var14] * var12 >> 16;
            this.field3282[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    private final void method1287(int arg0) {
        int var2 = field3284[arg0];
        int var3 = field3285[arg0];
        for (int var4 = 0; var4 < this.field3291; var4++) {
            int var5 = this.field3282[var4] * var3 + this.field3273[var4] * var2 >> 16;
            this.field3273[var4] = this.field3273[var4] * var3 - this.field3282[var4] * var2 >> 16;
            this.field3282[var4] = var5;
        }
        this.method1291();
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(III)V")
    public final void method1288(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3291; var4++) {
            this.field3282[var4] += arg0;
            this.field3273[var4] += arg1;
            this.field3281[var4] += arg2;
        }
        this.method1291();
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "([B)V")
    private final void method1289(byte[] arg0) {
        class225 var2 = new class225(arg0);
        class225 var3 = new class225(arg0);
        class225 var4 = new class225(arg0);
        class225 var5 = new class225(arg0);
        class225 var6 = new class225(arg0);
        class225 var7 = new class225(arg0);
        class225 var8 = new class225(arg0);
        var2.field3996 = arg0.length - 23;
        int var9 = var2.method1593(true);
        int var10 = var2.method1593(true);
        int var11 = var2.method1580(-26);
        int var12 = var2.method1580(-123);
        int var13 = var2.method1580(-49);
        int var14 = var2.method1580(-46);
        int var15 = var2.method1580(-55);
        int var16 = var2.method1580(-33);
        int var17 = var2.method1580(-59);
        int var18 = var2.method1593(true);
        int var19 = var2.method1593(true);
        int var20 = var2.method1593(true);
        int var21 = var2.method1593(true);
        int var22 = var2.method1593(true);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3283 = new byte[var11];
            var2.field3996 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field3283[var26] = var2.method1575(false);
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
        this.field3291 = var9;
        this.field3265 = var10;
        this.field3254 = var11;
        this.field3282 = new int[var9];
        this.field3273 = new int[var9];
        this.field3281 = new int[var9];
        this.field3269 = new int[var10];
        this.field3257 = new int[var10];
        this.field3264 = new int[var10];
        if (var17 == 1) {
            this.field3247 = new int[var9];
        }
        if (var12 == 1) {
            this.field3277 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3267 = new byte[var10];
        } else {
            this.field3248 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3288 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3280 = new int[var10];
        }
        if (var16 == 1) {
            this.field3251 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3249 = new byte[var10];
        }
        this.field3274 = new short[var10];
        if (var11 > 0) {
            this.field3261 = new short[var11];
            this.field3250 = new short[var11];
            this.field3253 = new short[var11];
            if (var24 > 0) {
                this.field3262 = new short[var24];
                this.field3278 = new short[var24];
                this.field3295 = new short[var24];
                this.field3294 = new byte[var24];
                this.field3260 = new byte[var24];
                this.field3275 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3266 = new byte[var25];
                this.field3268 = new byte[var25];
            }
        }
        var2.field3996 = var11;
        var3.field3996 = var44;
        var4.field3996 = var46;
        var5.field3996 = var48;
        var6.field3996 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1580(-84);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1588(128);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1588(128);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1588(128);
            }
            this.field3282[var66] = var63 + var80;
            this.field3273[var66] = var64 + var81;
            this.field3281[var66] = var65 + var82;
            var63 = this.field3282[var66];
            var64 = this.field3273[var66];
            var65 = this.field3281[var66];
            if (var17 == 1) {
                this.field3247[var66] = var6.method1580(-4);
            }
        }
        var2.field3996 = var42;
        var3.field3996 = var31;
        var4.field3996 = var34;
        var5.field3996 = var37;
        var6.field3996 = var35;
        var7.field3996 = var40;
        var8.field3996 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field3274[var67] = (short) var2.method1593(true);
            if (var12 == 1) {
                this.field3277[var67] = var3.method1575(false);
            }
            if (var13 == 255) {
                this.field3267[var67] = var4.method1575(false);
            }
            if (var14 == 1) {
                this.field3288[var67] = var5.method1575(false);
            }
            if (var15 == 1) {
                this.field3280[var67] = var6.method1580(-60);
            }
            if (var16 == 1) {
                this.field3251[var67] = (short) (var7.method1593(true) - 1);
            }
            if (this.field3249 != null) {
                if (this.field3251[var67] == -1) {
                    this.field3249[var67] = -1;
                } else {
                    this.field3249[var67] = (byte) (var8.method1580(-118) - 1);
                }
            }
        }
        var2.field3996 = var33;
        var3.field3996 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1580(-106);
            if (var75 == 1) {
                var68 = var2.method1588(128) + var71;
                var69 = var2.method1588(128) + var68;
                var70 = var2.method1588(128) + var69;
                var71 = var70;
                this.field3269[var72] = var68;
                this.field3257[var72] = var69;
                this.field3264[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1588(128) + var71;
                var71 = var70;
                this.field3269[var72] = var68;
                this.field3257[var72] = var69;
                this.field3264[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1588(128) + var71;
                var71 = var70;
                this.field3269[var72] = var68;
                this.field3257[var72] = var69;
                this.field3264[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1588(128) + var71;
                var71 = var70;
                this.field3269[var72] = var68;
                this.field3257[var72] = var78;
                this.field3264[var72] = var70;
            }
        }
        var2.field3996 = var50;
        var3.field3996 = var52;
        var4.field3996 = var54;
        var5.field3996 = var56;
        var6.field3996 = var58;
        var7.field3996 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field3283[var73] & 0xFF;
            if (var74 == 0) {
                this.field3261[var73] = (short) var2.method1593(true);
                this.field3250[var73] = (short) var2.method1593(true);
                this.field3253[var73] = (short) var2.method1593(true);
            }
            if (var74 == 1) {
                this.field3261[var73] = (short) var3.method1593(true);
                this.field3250[var73] = (short) var3.method1593(true);
                this.field3253[var73] = (short) var3.method1593(true);
                this.field3262[var73] = (short) var4.method1593(true);
                this.field3278[var73] = (short) var4.method1593(true);
                this.field3295[var73] = (short) var4.method1593(true);
                this.field3294[var73] = var5.method1575(false);
                this.field3260[var73] = var6.method1575(false);
                this.field3275[var73] = var7.method1575(false);
            }
            if (var74 == 2) {
                this.field3261[var73] = (short) var3.method1593(true);
                this.field3250[var73] = (short) var3.method1593(true);
                this.field3253[var73] = (short) var3.method1593(true);
                this.field3262[var73] = (short) var4.method1593(true);
                this.field3278[var73] = (short) var4.method1593(true);
                this.field3295[var73] = (short) var4.method1593(true);
                this.field3294[var73] = var5.method1575(false);
                this.field3260[var73] = var6.method1575(false);
                this.field3275[var73] = var7.method1575(false);
                this.field3266[var73] = var7.method1575(false);
                this.field3268[var73] = var7.method1575(false);
            }
            if (var74 == 3) {
                this.field3261[var73] = (short) var3.method1593(true);
                this.field3250[var73] = (short) var3.method1593(true);
                this.field3253[var73] = (short) var3.method1593(true);
                this.field3262[var73] = (short) var4.method1593(true);
                this.field3278[var73] = (short) var4.method1593(true);
                this.field3295[var73] = (short) var4.method1593(true);
                this.field3294[var73] = var5.method1575(false);
                this.field3260[var73] = var6.method1575(false);
                this.field3275[var73] = var7.method1575(false);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(SS)V")
    public final void method1290(short arg0, short arg1) {
        if (this.field3251 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3265; var3++) {
            if (this.field3251[var3] == arg0) {
                this.field3251[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "()V")
    private final void method1291() {
        this.field3270 = null;
        this.field3272 = null;
        this.field3290 = null;
        this.field3279 = false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()Z")
    public final boolean method120() {
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "()V")
    public final void method1292() {
        for (int var1 = 0; var1 < this.field3291; var1++) {
            int var2 = this.field3282[var1];
            this.field3282[var1] = this.field3281[var1];
            this.field3281[var1] = -var2;
        }
        this.method1291();
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    private class187() {
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([B)V")
    private class187(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1289(arg0);
        } else {
            this.method1274(arg0);
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(III)V")
    public class187(int arg0, int arg1, int arg2) {
        this.field3282 = new int[arg0];
        this.field3273 = new int[arg0];
        this.field3281 = new int[arg0];
        this.field3247 = new int[arg0];
        this.field3269 = new int[arg1];
        this.field3257 = new int[arg1];
        this.field3264 = new int[arg1];
        this.field3277 = new byte[arg1];
        this.field3267 = new byte[arg1];
        this.field3288 = new byte[arg1];
        this.field3274 = new short[arg1];
        this.field3251 = new short[arg1];
        this.field3249 = new byte[arg1];
        this.field3280 = new int[arg1];
        if (arg2 > 0) {
            this.field3283 = new byte[arg2];
            this.field3261 = new short[arg2];
            this.field3250 = new short[arg2];
            this.field3253 = new short[arg2];
            this.field3262 = new short[arg2];
            this.field3278 = new short[arg2];
            this.field3295 = new short[arg2];
            this.field3294 = new byte[arg2];
            this.field3260 = new byte[arg2];
            this.field3275 = new byte[arg2];
            this.field3266 = new byte[arg2];
            this.field3268 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([Lsf;I)V")
    public class187(class187[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3291 = 0;
        this.field3265 = 0;
        this.field3254 = 0;
        this.field3248 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class187 var15 = arg0[var9];
            if (var15 != null) {
                this.field3291 += var15.field3291;
                this.field3265 += var15.field3265;
                this.field3254 += var15.field3254;
                if (var15.field3267 == null) {
                    if (this.field3248 == -1) {
                        this.field3248 = var15.field3248;
                    }
                    if (this.field3248 != var15.field3248) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field3277 != null;
                var5 |= var15.field3288 != null;
                var6 |= var15.field3280 != null;
                var7 |= var15.field3251 != null;
                var8 |= var15.field3249 != null;
            }
        }
        this.field3282 = new int[this.field3291];
        this.field3273 = new int[this.field3291];
        this.field3281 = new int[this.field3291];
        this.field3247 = new int[this.field3291];
        this.field3269 = new int[this.field3265];
        this.field3257 = new int[this.field3265];
        this.field3264 = new int[this.field3265];
        if (var3) {
            this.field3277 = new byte[this.field3265];
        }
        if (var4) {
            this.field3267 = new byte[this.field3265];
        }
        if (var5) {
            this.field3288 = new byte[this.field3265];
        }
        if (var6) {
            this.field3280 = new int[this.field3265];
        }
        if (var7) {
            this.field3251 = new short[this.field3265];
        }
        if (var8) {
            this.field3249 = new byte[this.field3265];
        }
        this.field3274 = new short[this.field3265];
        if (this.field3254 > 0) {
            this.field3283 = new byte[this.field3254];
            this.field3261 = new short[this.field3254];
            this.field3250 = new short[this.field3254];
            this.field3253 = new short[this.field3254];
            this.field3262 = new short[this.field3254];
            this.field3278 = new short[this.field3254];
            this.field3295 = new short[this.field3254];
            this.field3294 = new byte[this.field3254];
            this.field3260 = new byte[this.field3254];
            this.field3275 = new byte[this.field3254];
            this.field3266 = new byte[this.field3254];
            this.field3268 = new byte[this.field3254];
        }
        this.field3291 = 0;
        this.field3265 = 0;
        this.field3254 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class187 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3265; var12++) {
                    if (var3 && var11.field3277 != null) {
                        this.field3277[this.field3265] = var11.field3277[var12];
                    }
                    if (var4) {
                        if (var11.field3267 == null) {
                            this.field3267[this.field3265] = var11.field3248;
                        } else {
                            this.field3267[this.field3265] = var11.field3267[var12];
                        }
                    }
                    if (var5 && var11.field3288 != null) {
                        this.field3288[this.field3265] = var11.field3288[var12];
                    }
                    if (var6 && var11.field3280 != null) {
                        this.field3280[this.field3265] = var11.field3280[var12];
                    }
                    if (var7) {
                        if (var11.field3251 == null) {
                            this.field3251[this.field3265] = -1;
                        } else {
                            this.field3251[this.field3265] = var11.field3251[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field3249 == null || var11.field3249[var12] == -1) {
                            this.field3249[this.field3265] = -1;
                        } else {
                            this.field3249[this.field3265] = (byte) (var11.field3249[var12] + this.field3254);
                        }
                    }
                    this.field3274[this.field3265] = var11.field3274[var12];
                    this.field3269[this.field3265] = this.method1278(var11, var11.field3269[var12]);
                    this.field3257[this.field3265] = this.method1278(var11, var11.field3257[var12]);
                    this.field3264[this.field3265] = this.method1278(var11, var11.field3264[var12]);
                    this.field3265++;
                }
                for (int var13 = 0; var13 < var11.field3254; var13++) {
                    byte var14 = this.field3283[this.field3254] = var11.field3283[var13];
                    if (var14 == 0) {
                        this.field3261[this.field3254] = (short) this.method1278(var11, var11.field3261[var13]);
                        this.field3250[this.field3254] = (short) this.method1278(var11, var11.field3250[var13]);
                        this.field3253[this.field3254] = (short) this.method1278(var11, var11.field3253[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field3261[this.field3254] = var11.field3261[var13];
                        this.field3250[this.field3254] = var11.field3250[var13];
                        this.field3253[this.field3254] = var11.field3253[var13];
                        this.field3262[this.field3254] = var11.field3262[var13];
                        this.field3278[this.field3254] = var11.field3278[var13];
                        this.field3295[this.field3254] = var11.field3295[var13];
                        this.field3294[this.field3254] = var11.field3294[var13];
                        this.field3260[this.field3254] = var11.field3260[var13];
                        this.field3275[this.field3254] = var11.field3275[var13];
                    }
                    if (var14 == 2) {
                        this.field3266[this.field3254] = var11.field3266[var13];
                        this.field3268[this.field3254] = var11.field3268[var13];
                    }
                    this.field3254++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lsf;ZZZZ)V")
    public class187(class187 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3291 = arg0.field3291;
        this.field3265 = arg0.field3265;
        this.field3254 = arg0.field3254;
        if (arg1) {
            this.field3282 = arg0.field3282;
            this.field3273 = arg0.field3273;
            this.field3281 = arg0.field3281;
        } else {
            this.field3282 = new int[this.field3291];
            this.field3273 = new int[this.field3291];
            this.field3281 = new int[this.field3291];
            for (int var6 = 0; var6 < this.field3291; var6++) {
                this.field3282[var6] = arg0.field3282[var6];
                this.field3273[var6] = arg0.field3273[var6];
                this.field3281[var6] = arg0.field3281[var6];
            }
        }
        if (arg2) {
            this.field3274 = arg0.field3274;
        } else {
            this.field3274 = new short[this.field3265];
            for (int var7 = 0; var7 < this.field3265; var7++) {
                this.field3274[var7] = arg0.field3274[var7];
            }
        }
        if (arg3 || arg0.field3251 == null) {
            this.field3251 = arg0.field3251;
        } else {
            this.field3251 = new short[this.field3265];
            for (int var8 = 0; var8 < this.field3265; var8++) {
                this.field3251[var8] = arg0.field3251[var8];
            }
        }
        if (arg4) {
            this.field3288 = arg0.field3288;
        } else {
            this.field3288 = new byte[this.field3265];
            if (arg0.field3288 == null) {
                for (int var9 = 0; var9 < this.field3265; var9++) {
                    this.field3288[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3265; var10++) {
                    this.field3288[var10] = arg0.field3288[var10];
                }
            }
        }
        this.field3269 = arg0.field3269;
        this.field3257 = arg0.field3257;
        this.field3264 = arg0.field3264;
        this.field3277 = arg0.field3277;
        this.field3267 = arg0.field3267;
        this.field3249 = arg0.field3249;
        this.field3248 = arg0.field3248;
        this.field3283 = arg0.field3283;
        this.field3261 = arg0.field3261;
        this.field3250 = arg0.field3250;
        this.field3253 = arg0.field3253;
        this.field3262 = arg0.field3262;
        this.field3278 = arg0.field3278;
        this.field3295 = arg0.field3295;
        this.field3294 = arg0.field3294;
        this.field3260 = arg0.field3260;
        this.field3275 = arg0.field3275;
        this.field3266 = arg0.field3266;
        this.field3268 = arg0.field3268;
        this.field3247 = arg0.field3247;
        this.field3280 = arg0.field3280;
        this.field3259 = arg0.field3259;
        this.field3258 = arg0.field3258;
        this.field3270 = arg0.field3270;
        this.field3290 = arg0.field3290;
        this.field3272 = arg0.field3272;
        this.field3287 = arg0.field3287;
        this.field3255 = arg0.field3255;
    }
}
