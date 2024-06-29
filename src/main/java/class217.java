import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class217 extends class89 {

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    private int field3416 = 0;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
    public boolean field3420 = false;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "B")
    private byte field3446 = 0;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public int field3412 = 0;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    private int field3425 = 0;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    private int field3450 = 0;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "B")
    private byte field3451 = 0;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
    private int[] field3422;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[I")
    public int[] field3408;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "[I")
    public int[] field3436;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
    public int[] field3424;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
    private int[] field3419;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "[S")
    private short[] field3444;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "[S")
    private short[] field3433;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[S")
    private short[] field3410;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[S")
    private short[] field3417;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "[S")
    private short[] field3454;

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "[F")
    private float[] field3455;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "[F")
    private float[] field3430;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "[S")
    private short[] field3452;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[B")
    private byte[] field3407;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "[S")
    private short[] field3413;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "[S")
    private short[] field3434;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "[S")
    private short[] field3448;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "[S")
    private short[] field3432;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "[B")
    private byte[] field3439;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[S")
    private short[] field3409;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "Lmb;")
    public class112 field3435;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Lbc;")
    public class160 field3438;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "Lbc;")
    private class160 field3443;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "Lbc;")
    private class160 field3431;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "Lbc;")
    private class160 field3441;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Lbc;")
    private class160 field3418;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "S")
    private short field3426;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "S")
    private short field3429;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "[S")
    private short[] field3411;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "[I")
    private int[] field3427;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lvl;")
    private static class6 field3414 = new class6(10000);

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "Ljb;")
    private static class217 field3437 = new class217();

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "Ljb;")
    private static class217 field3445 = new class217();

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "Ljb;")
    private static class217 field3447 = new class217();

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Ljb;")
    private static class217 field3449 = new class217();

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "Ljb;")
    private static class217 field3453 = new class217();

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "Ljb;")
    private static class217 field3456 = new class217();

    @OriginalMember(owner = "client!jb", name = "lb", descriptor = "[I")
    private static int[] field3458 = new int[1];

    @OriginalMember(owner = "client!jb", name = "mb", descriptor = "[I")
    private static int[] field3459 = new int[1];

    @OriginalMember(owner = "client!jb", name = "sb", descriptor = "Z")
    private static boolean field3465 = false;

    @OriginalMember(owner = "client!jb", name = "kb", descriptor = "F")
    private static float field3457;

    @OriginalMember(owner = "client!jb", name = "ob", descriptor = "F")
    private static float field3461;

    @OriginalMember(owner = "client!jb", name = "pb", descriptor = "F")
    private static float field3462;

    @OriginalMember(owner = "client!jb", name = "qb", descriptor = "F")
    private static float field3463;

    @OriginalMember(owner = "client!jb", name = "tb", descriptor = "F")
    private static float field3466;

    @OriginalMember(owner = "client!jb", name = "ub", descriptor = "F")
    private static float field3467;

    @OriginalMember(owner = "client!jb", name = "nb", descriptor = "I")
    private static int field3460;

    @OriginalMember(owner = "client!jb", name = "rb", descriptor = "I")
    private static int field3464;

    @OriginalMember(owner = "client!jb", name = "vb", descriptor = "I")
    private static int field3468;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "Lan;")
    private class12 field3423;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Lpf;")
    private class264 field3415;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3440;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "[J")
    private static long[] field3428;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "[[I")
    private int[][] field3421;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "[[I")
    private int[][] field3442;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()Z", line = 5)
    public final boolean method1237() {
        return this.field3420 && this.field3408 != null && this.field3433 != null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 11)
    public final void method391(int arg0) {
        int var2 = class31.field467[arg0];
        int var3 = class31.field451[arg0];
        for (int var4 = 0; var4 < this.field3412; var4++) {
            int var5 = this.field3436[var4] * var3 - this.field3424[var4] * var2 >> 16;
            this.field3424[var4] = this.field3436[var4] * var2 + this.field3424[var4] * var3 >> 16;
            this.field3436[var4] = var5;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([FI)[F", line = 32)
    private static final float[] method1574(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class54.method423(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "()V", line = 41)
    private final void method1575() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3425; var9++) {
            int var10 = this.field3408[var9];
            int var11 = this.field3436[var9];
            int var12 = this.field3424[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field3435.field1553 = (short) var1;
        this.field3435.field1555 = (short) var4;
        this.field3435.field1558 = (short) var2;
        this.field3435.field1560 = (short) var5;
        this.field3435.field1557 = (short) var3;
        this.field3435.field1554 = (short) var6;
        this.field3435.field1556 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3435.field1559 = true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(FFF)I", line = 111)
    private static final int method1576(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "()V", line = 147)
    public final void method419() {
        for (int var1 = 0; var1 < this.field3412; var1++) {
            int var2 = this.field3408[var1];
            this.field3408[var1] = this.field3424[var1];
            this.field3424[var1] = -var2;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "()I", line = 162)
    public final int method415() {
        if (!this.field3435.field1559) {
            this.method1575();
        }
        return this.field3435.field1556;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZZZZ)V", line = 169)
    private final void method1577(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3438.field2536 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3443.field2536 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3431.field2536 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3441.field2536 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3414.field115.length < this.field3416 * var6) {
            field3414 = new class6((this.field3416 + 100) * var6);
        } else {
            field3414.field111 = 0;
        }
        if (arg1) {
            if (class109.field1464) {
                for (int var7 = 0; var7 < this.field3425; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3408[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3436[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3424[var7]);
                    int var11 = this.field3422[var7];
                    int var12 = this.field3422[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3411[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3414.field111 = var6 * var14;
                        field3414.method34(var8, 294335144);
                        field3414.method34(var9, 294335144);
                        field3414.method34(var10, 294335144);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3425; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3408[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3436[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3424[var15]);
                    int var19 = this.field3422[var15];
                    int var20 = this.field3422[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3411[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3414.field111 = var6 * var22;
                        field3414.method44(854292648, var16);
                        field3414.method44(854292648, var17);
                        field3414.method44(854292648, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class220.field3482) {
                for (int var42 = 0; var42 < this.field3450; var42++) {
                    int var43 = method1597(this.field3452[var42], this.field3432[var42], this.field3426, this.field3407[var42]);
                    field3414.field111 = this.field3413[var42] * var6 + this.field3443.field2536;
                    field3414.method34(var43, 294335144);
                    field3414.field111 = this.field3434[var42] * var6 + this.field3443.field2536;
                    field3414.method34(var43, 294335144);
                    field3414.field111 = this.field3448[var42] * var6 + this.field3443.field2536;
                    field3414.method34(var43, 294335144);
                }
            } else {
                int var23 = (int) class115.field1609[0];
                int var24 = (int) class115.field1609[1];
                int var25 = (int) class115.field1609[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3426 * 1.3F);
                int var28 = this.field3429 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3450; var29++) {
                    short var30 = this.field3413[var29];
                    short var31 = this.field3454[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3417[var30] * var25 + this.field3433[var30] * var23 + this.field3410[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3417[var30] * var25 + this.field3433[var30] * var23 + this.field3410[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3454[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3434[var29];
                    short var34 = this.field3454[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3417[var33] * var25 + this.field3433[var33] * var23 + this.field3410[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3417[var33] * var25 + this.field3433[var33] * var23 + this.field3410[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3454[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3448[var29];
                    short var37 = this.field3454[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3417[var36] * var25 + this.field3433[var36] * var23 + this.field3410[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3417[var36] * var25 + this.field3433[var36] * var23 + this.field3410[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3454[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1597(this.field3452[var29], this.field3432[var29], var32, this.field3407[var29]);
                    int var40 = method1597(this.field3452[var29], this.field3432[var29], var35, this.field3407[var29]);
                    int var41 = method1597(this.field3452[var29], this.field3432[var29], var38, this.field3407[var29]);
                    field3414.field111 = var6 * var30 + this.field3443.field2536;
                    field3414.method34(var39, 294335144);
                    field3414.field111 = var6 * var33 + this.field3443.field2536;
                    field3414.method34(var40, 294335144);
                    field3414.field111 = var6 * var36 + this.field3443.field2536;
                    field3414.method34(var41, 294335144);
                }
                this.field3433 = null;
                this.field3410 = null;
                this.field3417 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3429;
            float var45 = 3.0F / (float) (this.field3429 / 2 + this.field3429);
            field3414.field111 = this.field3431.field2536;
            if (class109.field1464) {
                for (int var46 = 0; var46 < this.field3416; var46++) {
                    short var47 = this.field3454[var46];
                    if (var47 == 0) {
                        field3414.method36((float) this.field3433[var46] * var45, (byte) 127);
                        field3414.method36((float) this.field3410[var46] * var45, (byte) 121);
                        field3414.method36((float) this.field3417[var46] * var45, (byte) 125);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3414.method36((float) this.field3433[var46] * var48, (byte) 127);
                        field3414.method36((float) this.field3410[var46] * var48, (byte) 121);
                        field3414.method36((float) this.field3417[var46] * var48, (byte) 122);
                    }
                    field3414.field111 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3416; var49++) {
                    short var50 = this.field3454[var49];
                    if (var50 == 0) {
                        field3414.method91((float) this.field3433[var49] * var45, -211870840);
                        field3414.method91((float) this.field3410[var49] * var45, -211870840);
                        field3414.method91((float) this.field3417[var49] * var45, -211870840);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3414.method91((float) this.field3433[var49] * var51, -211870840);
                        field3414.method91((float) this.field3410[var49] * var51, -211870840);
                        field3414.method91((float) this.field3417[var49] * var51, -211870840);
                    }
                    field3414.field111 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3414.field111 = this.field3441.field2536;
            if (class109.field1464) {
                for (int var52 = 0; var52 < this.field3416; var52++) {
                    field3414.method36(this.field3455[var52], (byte) 123);
                    field3414.method36(this.field3430[var52], (byte) 121);
                    field3414.field111 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3416; var53++) {
                    field3414.method91(this.field3455[var53], -211870840);
                    field3414.method91(this.field3430[var53], -211870840);
                    field3414.field111 += var6 - 8;
                }
            }
        }
        field3414.field111 = this.field3416 * var6;
        if (arg0) {
            if (class109.field1492) {
                ByteBuffer var54 = ByteBuffer.wrap(field3414.field115, 0, field3414.field111);
                if (this.field3415 == null) {
                    this.field3415 = new class264(true);
                    this.field3415.method1892(var54);
                } else {
                    this.field3415.method1890(var54);
                }
                if (arg1) {
                    this.field3438.field2545 = true;
                    this.field3438.field2541 = null;
                    this.field3438.field2544 = this.field3415;
                    this.field3438.field2533 = var6;
                }
                if (arg2) {
                    this.field3443.field2545 = true;
                    this.field3443.field2541 = null;
                    this.field3443.field2544 = this.field3415;
                    this.field3443.field2533 = var6;
                }
                if (arg3) {
                    this.field3431.field2545 = true;
                    this.field3431.field2541 = null;
                    this.field3431.field2544 = this.field3415;
                    this.field3431.field2533 = var6;
                }
                if (arg4) {
                    this.field3441.field2545 = true;
                    this.field3441.field2541 = null;
                    this.field3441.field2544 = this.field3415;
                    this.field3441.field2533 = var6;
                }
            } else {
                if (field3440 == null || field3440.capacity() < field3414.field111) {
                    field3440 = ByteBuffer.allocateDirect(var6 * 100 + field3414.field111);
                } else {
                    field3440.clear();
                }
                field3440.put(field3414.field115, 0, field3414.field111);
                field3440.flip();
                if (arg1) {
                    this.field3438.field2545 = true;
                    this.field3438.field2541 = field3440;
                    this.field3438.field2544 = null;
                    this.field3438.field2533 = var6;
                }
                if (arg2) {
                    this.field3443.field2545 = true;
                    this.field3443.field2541 = field3440;
                    this.field3438.field2544 = null;
                    this.field3443.field2533 = var6;
                }
                if (arg3) {
                    this.field3431.field2545 = true;
                    this.field3431.field2541 = field3440;
                    this.field3431.field2544 = null;
                    this.field3431.field2533 = var6;
                }
                if (arg4) {
                    this.field3441.field2545 = true;
                    this.field3441.field2541 = field3440;
                    this.field3441.field2544 = null;
                    this.field3441.field2533 = var6;
                }
            }
        } else if (class109.field1496) {
            class264 var55 = new class264();
            ByteBuffer var56 = ByteBuffer.wrap(field3414.field115, 0, field3414.field111);
            var55.method1892(var56);
            if (arg1) {
                this.field3438.field2545 = true;
                this.field3438.field2541 = null;
                this.field3438.field2544 = var55;
                this.field3438.field2533 = var6;
            }
            if (arg2) {
                this.field3443.field2545 = true;
                this.field3443.field2541 = null;
                this.field3443.field2544 = var55;
                this.field3443.field2533 = var6;
            }
            if (arg3) {
                this.field3431.field2545 = true;
                this.field3431.field2541 = null;
                this.field3431.field2544 = var55;
                this.field3431.field2533 = var6;
            }
            if (arg4) {
                this.field3441.field2545 = true;
                this.field3441.field2541 = null;
                this.field3441.field2544 = var55;
                this.field3441.field2533 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3414.field111);
            var57.put(field3414.field115, 0, field3414.field111);
            var57.flip();
            if (arg1) {
                this.field3438.field2545 = true;
                this.field3438.field2541 = var57;
                this.field3438.field2544 = null;
                this.field3438.field2533 = var6;
            }
            if (arg2) {
                this.field3443.field2545 = true;
                this.field3443.field2541 = var57;
                this.field3438.field2544 = null;
                this.field3443.field2533 = var6;
            }
            if (arg3) {
                this.field3431.field2545 = true;
                this.field3431.field2541 = var57;
                this.field3431.field2544 = null;
                this.field3431.field2533 = var6;
            }
            if (arg4) {
                this.field3441.field2545 = true;
                this.field3441.field2541 = var57;
                this.field3441.field2544 = null;
                this.field3441.field2533 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lgh;IIIZ)V", line = 698)
    public final void method1213(class248 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class217 var6 = (class217) arg0;
        if (this.field3450 == 0 || var6.field3450 == 0) {
            return;
        }
        int var7 = var6.field3425;
        int[] var8 = var6.field3408;
        int[] var9 = var6.field3436;
        int[] var10 = var6.field3424;
        short[] var11 = var6.field3433;
        short[] var12 = var6.field3410;
        short[] var13 = var6.field3417;
        short[] var14 = var6.field3454;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3423 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3423.field212;
            var16 = this.field3423.field213;
            var17 = this.field3423.field211;
            var18 = this.field3423.field210;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3423 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3423.field212;
            var20 = var6.field3423.field213;
            var21 = var6.field3423.field211;
            var22 = var6.field3423.field210;
        }
        int[] var23 = var6.field3422;
        short[] var24 = var6.field3411;
        if (!var6.field3435.field1559) {
            var6.method1575();
        }
        short var25 = var6.field3435.field1558;
        short var26 = var6.field3435.field1560;
        short var27 = var6.field3435.field1553;
        short var28 = var6.field3435.field1555;
        short var29 = var6.field3435.field1557;
        short var30 = var6.field3435.field1554;
        for (int var31 = 0; var31 < this.field3425; var31++) {
            int var32 = this.field3436[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3408[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3424[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3422[var31];
                        int var37 = this.field3422[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3411[var38] - 1;
                            if (var35 == -1 || this.field3454[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field3423 = new class12();
                                            var15 = this.field3423.field212 = class113.method803(-73, this.field3433);
                                            var16 = this.field3423.field213 = class113.method803(-115, this.field3410);
                                            var17 = this.field3423.field211 = class113.method803(-64, this.field3417);
                                            var18 = this.field3423.field210 = class113.method803(-107, this.field3454);
                                        }
                                        if (var19 == null) {
                                            class12 var44 = var6.field3423 = new class12();
                                            var19 = var44.field212 = class113.method803(-51, var11);
                                            var20 = var44.field213 = class113.method803(-109, var12);
                                            var21 = var44.field211 = class113.method803(-80, var13);
                                            var22 = var44.field210 = class113.method803(-47, var14);
                                        }
                                        short var45 = this.field3433[var35];
                                        short var46 = this.field3410[var35];
                                        short var47 = this.field3417[var35];
                                        short var48 = this.field3454[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field3422[var31];
                                        int var58 = this.field3422[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3411[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "()V", line = 937)
    public final void method412() {
        for (int var1 = 0; var1 < this.field3412; var1++) {
            int var2 = this.field3424[var1];
            this.field3424[var1] = this.field3408[var1];
            this.field3408[var1] = -var2;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIJ)V", line = 951)
    public final void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field3416 == 0) {
            return;
        }
        GL var10 = class109.field1456;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1580();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZZZZZZZZZZ)Ljb;", line = 977)
    public final class217 method1578(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class217 var12 = new class217();
        var12.field3412 = this.field3412;
        var12.field3425 = this.field3425;
        var12.field3416 = this.field3416;
        var12.field3450 = this.field3450;
        if (arg0) {
            var12.field3408 = this.field3408;
            var12.field3424 = this.field3424;
        } else {
            var12.field3408 = client.method959((byte) 86, this.field3408);
            var12.field3424 = client.method959((byte) 86, this.field3424);
        }
        if (arg1) {
            var12.field3436 = this.field3436;
        } else {
            var12.field3436 = client.method959((byte) 86, this.field3436);
        }
        if (arg0 && arg1) {
            var12.field3438 = this.field3438;
            var12.field3435 = this.field3435;
        } else {
            var12.field3438 = new class160();
            var12.field3435 = new class112();
        }
        if (arg2) {
            var12.field3452 = this.field3452;
        } else {
            var12.field3452 = class113.method803(-96, this.field3452);
        }
        if (arg3) {
            var12.field3407 = this.field3407;
        } else {
            var12.field3407 = class51.method377(73, this.field3407);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class220.field3482) {
            var12.field3443 = new class160();
        } else {
            var12.field3443 = this.field3443;
        }
        if (arg5) {
            var12.field3433 = this.field3433;
            var12.field3410 = this.field3410;
            var12.field3417 = this.field3417;
            var12.field3454 = this.field3454;
        } else {
            var12.field3433 = class113.method803(-85, this.field3433);
            var12.field3410 = class113.method803(-104, this.field3410);
            var12.field3417 = class113.method803(-83, this.field3417);
            var12.field3454 = class113.method803(-117, this.field3454);
        }
        if (!class220.field3482) {
            var12.field3431 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3431 = this.field3431;
        } else {
            var12.field3431 = new class160();
        }
        if (arg8) {
            var12.field3455 = this.field3455;
            var12.field3430 = this.field3430;
            var12.field3441 = this.field3441;
        } else {
            var12.field3455 = class222.method1624(this.field3455, 20598);
            var12.field3430 = class222.method1624(this.field3430, 20598);
            var12.field3441 = new class160();
        }
        if (arg9) {
            var12.field3413 = this.field3413;
            var12.field3434 = this.field3434;
            var12.field3448 = this.field3448;
            var12.field3418 = this.field3418;
        } else {
            var12.field3413 = class113.method803(-117, this.field3413);
            var12.field3434 = class113.method803(-59, this.field3434);
            var12.field3448 = class113.method803(-107, this.field3448);
            var12.field3418 = new class160();
        }
        if (arg10) {
            var12.field3432 = this.field3432;
        } else {
            var12.field3432 = class113.method803(-96, this.field3432);
        }
        var12.field3419 = this.field3419;
        var12.field3442 = this.field3442;
        var12.field3439 = this.field3439;
        var12.field3421 = this.field3421;
        var12.field3427 = this.field3427;
        var12.field3411 = this.field3411;
        var12.field3422 = this.field3422;
        var12.field3426 = this.field3426;
        var12.field3429 = this.field3429;
        var12.field3444 = this.field3444;
        var12.field3409 = this.field3409;
        return var12;
    }

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "()I", line = 1116)
    public final int method1579() {
        return this.field3426;
    }

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "()V", line = 1121)
    private final void method1580() {
        GL var1 = class109.field1456;
        if (this.field3450 == 0) {
            return;
        }
        if (this.field3451 != 0) {
            this.method1577(true, !this.field3438.field2545 && (this.field3451 & 0x1) != 0, !this.field3443.field2545 && (this.field3451 & 0x2) != 0, this.field3431 != null && !this.field3431.field2545 && (this.field3451 & 0x4) != 0, false);
        }
        this.method1577(false, !this.field3438.field2545, !this.field3443.field2545, this.field3431 != null && !this.field3431.field2545, !this.field3441.field2545);
        if (!this.field3418.field2545) {
            this.method1585();
        }
        if (this.field3446 != 0) {
            if ((this.field3446 & 0x1) != 0) {
                this.field3408 = null;
                this.field3436 = null;
                this.field3424 = null;
                this.field3411 = null;
                this.field3422 = null;
            }
            if ((this.field3446 & 0x2) != 0) {
                this.field3452 = null;
                this.field3407 = null;
            }
            if ((this.field3446 & 0x4) != 0) {
                this.field3433 = null;
                this.field3410 = null;
                this.field3417 = null;
                this.field3454 = null;
            }
            if ((this.field3446 & 0x8) != 0) {
                this.field3455 = null;
                this.field3430 = null;
            }
            if ((this.field3446 & 0x10) != 0) {
                this.field3413 = null;
                this.field3434 = null;
                this.field3448 = null;
            }
            this.field3446 = 0;
        }
        class264 var2 = null;
        if (this.field3438.field2544 != null) {
            this.field3438.field2544.method1888();
            var2 = this.field3438.field2544;
            var1.glVertexPointer(3, 5126, this.field3438.field2533, (long) this.field3438.field2536);
        }
        if (this.field3443.field2544 != null) {
            if (this.field3443.field2544 != var2) {
                this.field3443.field2544.method1888();
                var2 = this.field3443.field2544;
            }
            var1.glColorPointer(4, 5121, this.field3443.field2533, (long) this.field3443.field2536);
        }
        if (class220.field3482 && this.field3431.field2544 != null) {
            if (this.field3431.field2544 != var2) {
                this.field3431.field2544.method1888();
                var2 = this.field3431.field2544;
            }
            var1.glNormalPointer(5126, this.field3431.field2533, (long) this.field3431.field2536);
        }
        if (this.field3441.field2544 != null) {
            if (this.field3441.field2544 != var2) {
                this.field3441.field2544.method1888();
                class264 var3 = this.field3441.field2544;
            }
            var1.glTexCoordPointer(2, 5126, this.field3441.field2533, (long) this.field3441.field2536);
        }
        if (this.field3418.field2544 != null) {
            this.field3418.field2544.method1889();
        }
        if (this.field3438.field2544 == null || this.field3443.field2544 == null || class220.field3482 && this.field3431.field2544 == null || this.field3441.field2544 == null) {
            if (class109.field1496) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3438.field2544 == null) {
                this.field3438.field2541.position(this.field3438.field2536);
                var1.glVertexPointer(3, 5126, this.field3438.field2533, this.field3438.field2541);
            }
            if (this.field3443.field2544 == null) {
                this.field3443.field2541.position(this.field3443.field2536);
                var1.glColorPointer(4, 5121, this.field3443.field2533, this.field3443.field2541);
            }
            if (class220.field3482 && this.field3431.field2544 == null) {
                this.field3431.field2541.position(this.field3431.field2536);
                var1.glNormalPointer(5126, this.field3431.field2533, this.field3431.field2541);
            }
            if (this.field3441.field2544 == null) {
                this.field3441.field2541.position(this.field3441.field2536);
                var1.glTexCoordPointer(2, 5126, this.field3441.field2533, this.field3441.field2541);
            }
        }
        if (this.field3418.field2544 == null && class109.field1496) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3427.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3427[var5];
            int var7 = this.field3427[var5 + 1];
            short var8 = this.field3432[var6];
            if (var8 == -1) {
                class109.method752(-1);
                class256.method1855(0, -123, 0);
            } else {
                class31.field466.method446(128, var8 & 0xFFFF);
            }
            if (this.field3418.field2544 == null) {
                this.field3418.field2541.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3418.field2541);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)Lgh;", line = 1292)
    public final class248 method1228(int arg0, int arg1, int arg2) {
        this.field3420 = false;
        if (this.field3423 != null) {
            this.field3433 = this.field3423.field212;
            this.field3410 = this.field3423.field213;
            this.field3417 = this.field3423.field211;
            this.field3454 = this.field3423.field210;
            this.field3423 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()I", line = 1305)
    public final int method408() {
        if (!this.field3435.field1559) {
            this.method1575();
        }
        return this.field3435.field1553;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIJILtk;)V", line = 1311)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class151 arg10) {
        if (this.field3416 == 0) {
            return;
        }
        if (!this.field3435.field1559) {
            this.method1575();
        }
        short var13 = this.field3435.field1556;
        short var14 = this.field3435.field1558;
        short var15 = this.field3435.field1560;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class11.field206) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class259.field4074) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class306.field4781) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class249.field3925) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class31.field467[arg0];
            var27 = class31.field451[arg0];
        }
        if (arg8 > 0L && class66.field945 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class336.field5239 >= var28 && class336.field5239 <= var29 && class238.field3728 >= var30 && class238.field3728 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field3435.field1553;
                short var37 = this.field3435.field1555;
                short var38 = this.field3435.field1557;
                short var39 = this.field3435.field1554;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class336.field5239 >= var32 && class336.field5239 <= var33 && class238.field3728 >= var34 && class238.field3728 <= var35) {
                    if (this.field1204) {
                        class263.field4113[class193.field3072++] = arg8;
                    } else {
                        if (field3458.length < this.field3416) {
                            field3458 = new int[this.field3416];
                            field3459 = new int[this.field3416];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field3425) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field3450) {
                                        break label118;
                                    }
                                    short var80 = this.field3413[var79];
                                    short var81 = this.field3434[var79];
                                    short var82 = this.field3448[var79];
                                    if (this.method1595(class336.field5239, class238.field3728, field3459[var80], field3459[var81], field3459[var82], field3458[var80], field3458[var81], field3458[var82])) {
                                        class263.field4113[class193.field3072++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field3408[var59];
                            int var61 = this.field3436[var59];
                            int var62 = this.field3424[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field3422[var59];
                            int var76 = this.field3422[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field3411[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field3458[var78] = var73;
                                field3459[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class109.field1456;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1580();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V", line = 1586)
    public final void method1581(int arg0) {
        this.field3426 = (short) arg0;
        this.field3443.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "()V", line = 1592)
    public static final void method1582() {
        field3437 = new class217();
        field3445 = new class217();
        field3447 = new class217();
        field3449 = new class217();
        field3453 = new class217();
        field3456 = new class217();
    }

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "()V", line = 1600)
    public final void method1583() {
        if (this.field3433 == null) {
            this.method406();
            return;
        }
        for (int var1 = 0; var1 < this.field3412; var1++) {
            this.field3408[var1] = -this.field3408[var1];
            this.field3424[var1] = -this.field3424[var1];
        }
        for (int var2 = 0; var2 < this.field3416; var2++) {
            this.field3433[var2] = (short) (-this.field3433[var2]);
            this.field3417[var2] = (short) (-this.field3417[var2]);
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
        if (this.field3431 != null) {
            this.field3431.field2545 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 1634)
    public final void method386(int arg0) {
        int var2 = class31.field467[arg0];
        int var3 = class31.field451[arg0];
        for (int var4 = 0; var4 < this.field3412; var4++) {
            int var5 = this.field3436[var4] * var2 + this.field3408[var4] * var3 >> 16;
            this.field3436[var4] = this.field3436[var4] * var3 - this.field3408[var4] * var2 >> 16;
            this.field3408[var4] = var5;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILjb;[[I[[IIII)V", line = 1653)
    public final void method1584(int arg0, int arg1, class217 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3435.field1559) {
            arg2.method1575();
        }
        int var9 = arg2.field3435.field1553 + arg5;
        int var10 = arg2.field3435.field1555 + arg5;
        int var11 = arg2.field3435.field1557 + arg7;
        int var12 = arg2.field3435.field1554 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field3425; var17++) {
                int var18 = this.field3408[var17] + arg5;
                int var19 = this.field3424[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3436[var17] = this.field3436[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3435.field1558;
            for (int var28 = 0; var28 < this.field3425; var28++) {
                int var29 = (this.field3436[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3408[var28] + arg5;
                    int var31 = this.field3424[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3436[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method641(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3435.field1560 - arg2.field3435.field1558;
            for (int var42 = 0; var42 < this.field3425; var42++) {
                int var43 = this.field3408[var42] + arg5;
                int var44 = this.field3424[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3436[var42] = var51 + this.field3436[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3435.field1560 - arg2.field3435.field1558;
            for (int var53 = 0; var53 < this.field3425; var53++) {
                int var54 = this.field3408[var53] + arg5;
                int var55 = this.field3424[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field3436[var53] = ((this.field3436[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3438.field2545 = false;
        this.field3435.field1559 = false;
    }

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "()V", line = 1850)
    private final void method1585() {
        if (field3414.field115.length < this.field3450 * 12) {
            field3414 = new class6((this.field3450 + 100) * 12);
        } else {
            field3414.field111 = 0;
        }
        if (class109.field1464) {
            for (int var1 = 0; var1 < this.field3450; var1++) {
                field3414.method34(this.field3413[var1], 294335144);
                field3414.method34(this.field3434[var1], 294335144);
                field3414.method34(this.field3448[var1], 294335144);
            }
        } else {
            for (int var2 = 0; var2 < this.field3450; var2++) {
                field3414.method44(854292648, this.field3413[var2]);
                field3414.method44(854292648, this.field3434[var2]);
                field3414.method44(854292648, this.field3448[var2]);
            }
        }
        if (!class109.field1496) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3414.field111);
            var5.put(field3414.field115, 0, field3414.field111);
            var5.flip();
            this.field3418.field2545 = true;
            this.field3418.field2541 = var5;
            this.field3418.field2544 = null;
            return;
        }
        class264 var3 = new class264();
        ByteBuffer var4 = ByteBuffer.wrap(field3414.field115, 0, field3414.field111);
        var3.method1892(var4);
        this.field3418.field2545 = true;
        this.field3418.field2541 = null;
        this.field3418.field2544 = var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lom;IJIIIIFF)S", line = 1909)
    private final short method1586(class165 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3422[arg1];
        int var12 = this.field3422[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3411[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3428[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3411[var13] = (short) (this.field3416 + 1);
        field3428[var13] = arg2;
        this.field3433[this.field3416] = (short) arg3;
        this.field3410[this.field3416] = (short) arg4;
        this.field3417[this.field3416] = (short) arg5;
        this.field3454[this.field3416] = (short) arg6;
        this.field3455[this.field3416] = arg7;
        this.field3430[this.field3416] = arg8;
        return (short) (this.field3416++);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()I", line = 1944)
    public final int method397() {
        if (!this.field3435.field1559) {
            this.method1575();
        }
        return this.field3435.field1558;
    }

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "()V", line = 1951)
    public final void method1587() {
        int var10002;
        if (this.field3419 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3412; var3++) {
                int var4 = this.field3419[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3442 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3442[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3412) {
                int var7 = this.field3419[var6] & 0xFF;
                this.field3442[var7][var1[var7]++] = var6++;
            }
            this.field3419 = null;
        }
        if (this.field3439 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3450; var10++) {
            int var11 = this.field3439[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3421 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3421[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3450) {
            int var14 = this.field3439[var13] & 0xFF;
            this.field3421[var14][var8[var14]++] = var13++;
        }
        this.field3439 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII[FFIF)V", line = 2043)
    private static final void method1588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3463 = var16;
        field3467 = var17;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 4570)
    private class217() {
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lom;IIZ)V", line = 4574)
    public class217(class165 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2668];
        this.field3422 = new int[arg0.field2661 + 1];
        for (int var6 = 0; var6 < arg0.field2668; var6++) {
            if ((arg0.field2664 == null || arg0.field2664[var6] != 2) && (arg0.field2706 == null || arg0.field2706[var6] == -1 || !class31.field466.method450(816, arg0.field2706[var6] & 0xFFFF))) {
                var5[this.field3450++] = var6;
                this.field3422[arg0.field2689[var6]]++;
                this.field3422[arg0.field2708[var6]]++;
                this.field3422[arg0.field2680[var6]]++;
            }
        }
        long[] var7 = new long[this.field3450];
        for (int var8 = 0; var8 < this.field3450; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2706 != null) {
                var14 = arg0.field2706[var9];
                if (var14 != -1) {
                    var12 = class31.field466.method453(255, var14 & 0xFFFF);
                    var13 = class31.field466.method454(var14 & 0xFFFF, (byte) 88);
                }
            }
            boolean var15 = arg0.field2662 != null && arg0.field2662[var9] != 0 || var14 != -1 && !class31.field466.method451(var14 & 0xFFFF, 117);
            if ((arg3 || var15) && arg0.field2682 != null) {
                var10 += arg0.field2682[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class179.method1325(true, var7, var5);
        this.field3412 = arg0.field2661;
        this.field3425 = arg0.field2675;
        this.field3408 = arg0.field2679;
        this.field3436 = arg0.field2669;
        this.field3424 = arg0.field2687;
        this.field3419 = arg0.field2685;
        this.field3444 = arg0.field2676;
        int var20 = this.field3450 * 3;
        this.field3433 = new short[var20];
        this.field3410 = new short[var20];
        this.field3417 = new short[var20];
        this.field3454 = new short[var20];
        this.field3455 = new float[var20];
        this.field3430 = new float[var20];
        this.field3452 = new short[this.field3450];
        this.field3407 = new byte[this.field3450];
        this.field3413 = new short[this.field3450];
        this.field3434 = new short[this.field3450];
        this.field3448 = new short[this.field3450];
        this.field3432 = new short[this.field3450];
        if (arg0.field2672 != null) {
            this.field3439 = new byte[this.field3450];
        }
        if (arg0.field2698 != null) {
            this.field3409 = new short[this.field3450];
        }
        this.field3435 = new class112();
        this.field3438 = new class160();
        this.field3443 = new class160();
        if (class220.field3482) {
            this.field3431 = new class160();
        }
        this.field3441 = new class160();
        this.field3418 = new class160();
        this.field3426 = (short) arg1;
        this.field3429 = (short) arg2;
        this.field3411 = new short[var20];
        field3428 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field3425; var22++) {
            int var23 = this.field3422[var22];
            this.field3422[var22] = var21;
            var21 += var23;
        }
        this.field3422[this.field3425] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2696 != null) {
            int var28 = arg0.field2678;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field3450; var36++) {
                int var37 = var5[var36];
                if (arg0.field2696[var37] != -1) {
                    int var38 = arg0.field2696[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2689[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2708[var37];
                        } else {
                            var40 = arg0.field2680[var37];
                        }
                        int var41 = arg0.field2679[var40];
                        int var42 = arg0.field2669[var40];
                        int var43 = arg0.field2687[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field2712[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2703[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field2710[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2703[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2710[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2690[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2703[var44] / 1024.0F;
                        var49 = (float) arg0.field2710[var44] / 1024.0F;
                        var48 = (float) arg0.field2690[var44] / 1024.0F;
                    }
                    var27[var44] = method1602(arg0.field2684[var44], arg0.field2692[var44], arg0.field2701[var44], arg0.field2707[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3450; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2667[var51] & 0xFFFF;
            short var53;
            if (arg0.field2706 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2706[var51];
            }
            int var54;
            if (arg0.field2696 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2696[var51];
            }
            int var55;
            if (arg0.field2662 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2662[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field2712[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2689[var51];
                        int var67 = arg0.field2708[var51];
                        int var68 = arg0.field2680[var51];
                        short var69 = arg0.field2684[var54];
                        short var70 = arg0.field2692[var54];
                        short var71 = arg0.field2701[var54];
                        float var72 = (float) arg0.field2679[var69];
                        float var73 = (float) arg0.field2669[var69];
                        float var74 = (float) arg0.field2687[var69];
                        float var75 = (float) arg0.field2679[var70] - var72;
                        float var76 = (float) arg0.field2669[var70] - var73;
                        float var77 = (float) arg0.field2687[var70] - var74;
                        float var78 = (float) arg0.field2679[var71] - var72;
                        float var79 = (float) arg0.field2669[var71] - var73;
                        float var80 = (float) arg0.field2687[var71] - var74;
                        float var81 = (float) arg0.field2679[var66] - var72;
                        float var82 = (float) arg0.field2669[var66] - var73;
                        float var83 = (float) arg0.field2687[var66] - var74;
                        float var84 = (float) arg0.field2679[var67] - var72;
                        float var85 = (float) arg0.field2669[var67] - var73;
                        float var86 = (float) arg0.field2687[var67] - var74;
                        float var87 = (float) arg0.field2679[var68] - var72;
                        float var88 = (float) arg0.field2669[var68] - var73;
                        float var89 = (float) arg0.field2687[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field2689[var51];
                        int var102 = arg0.field2708[var51];
                        int var103 = arg0.field2680[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2673[var54];
                        float var109 = (float) arg0.field2681[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2690[var54] & 0xFFFF) / 1024.0F;
                            method1588(arg0.field2679[var101], arg0.field2669[var101], arg0.field2687[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3463;
                            var57 = field3467;
                            method1588(arg0.field2679[var102], arg0.field2669[var102], arg0.field2687[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3463;
                            var59 = field3467;
                            method1588(arg0.field2679[var103], arg0.field2669[var103], arg0.field2687[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3463;
                            var61 = field3467;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field2693[var54] / 256.0F;
                            float var113 = (float) arg0.field2709[var54] / 256.0F;
                            int var114 = arg0.field2679[var102] - arg0.field2679[var101];
                            int var115 = arg0.field2669[var102] - arg0.field2669[var101];
                            int var116 = arg0.field2687[var102] - arg0.field2687[var101];
                            int var117 = arg0.field2679[var103] - arg0.field2679[var101];
                            int var118 = arg0.field2669[var103] - arg0.field2669[var101];
                            int var119 = arg0.field2687[var103] - arg0.field2687[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2703[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2710[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2690[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1576(var126, var127, var128);
                            method1606(arg0.field2679[var101], arg0.field2669[var101], arg0.field2687[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3462;
                            var57 = field3457;
                            method1606(arg0.field2679[var102], arg0.field2669[var102], arg0.field2687[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3462;
                            var59 = field3457;
                            method1606(arg0.field2679[var103], arg0.field2669[var103], arg0.field2687[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3462;
                            var61 = field3457;
                        } else if (var65 == 3) {
                            method1600(arg0.field2679[var101], arg0.field2669[var101], arg0.field2687[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3461;
                            var57 = field3466;
                            method1600(arg0.field2679[var102], arg0.field2669[var102], arg0.field2687[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3461;
                            var59 = field3466;
                            method1600(arg0.field2679[var103], arg0.field2669[var103], arg0.field2687[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3461;
                            var61 = field3466;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1234();
            byte var129;
            if (arg0.field2664 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2664[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2689[var51];
                class329 var133 = arg0.field2666[var132];
                this.field3413[var50] = this.method1586(arg0, var132, var130, var133.field5147, var133.field5153, var133.field5148, var133.field5150, var56, var57);
                int var134 = arg0.field2708[var51];
                class329 var135 = arg0.field2666[var134];
                this.field3434[var50] = this.method1586(arg0, var134, (long) var62 + var130, var135.field5147, var135.field5153, var135.field5148, var135.field5150, var58, var59);
                int var136 = arg0.field2680[var51];
                class329 var137 = arg0.field2666[var136];
                this.field3448[var50] = this.method1586(arg0, var136, (long) var63 + var130, var137.field5147, var137.field5153, var137.field5148, var137.field5150, var60, var61);
            } else if (var129 == 1) {
                class271 var138 = arg0.field2677[var51];
                long var139 = (long) ((var54 << 2) + (var138.field4203 > 0 ? 1024 : 2048) + (var138.field4202 + 256 << 12) + (var138.field4206 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3413[var50] = this.method1586(arg0, arg0.field2689[var51], var139, var138.field4203, var138.field4202, var138.field4206, 0, var56, var57);
                this.field3434[var50] = this.method1586(arg0, arg0.field2708[var51], (long) var62 + var139, var138.field4203, var138.field4202, var138.field4206, 0, var58, var59);
                this.field3448[var50] = this.method1586(arg0, arg0.field2680[var51], (long) var63 + var139, var138.field4203, var138.field4202, var138.field4206, 0, var60, var61);
            }
            if (arg0.field2706 == null) {
                this.field3432[var50] = -1;
            } else {
                this.field3432[var50] = arg0.field2706[var51];
            }
            if (this.field3439 != null) {
                this.field3439[var50] = (byte) arg0.field2672[var51];
            }
            this.field3452[var50] = arg0.field2667[var51];
            if (arg0.field2662 != null) {
                this.field3407[var50] = arg0.field2662[var51];
            }
            if (arg0.field2698 != null) {
                this.field3409[var50] = arg0.field2698[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3450; var143++) {
            short var144 = this.field3432[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3427 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3450; var147++) {
            short var148 = this.field3432[var147];
            if (var146 != var148) {
                this.field3427[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3427[var145] = this.field3450;
        field3428 = null;
        this.field3433 = method1594(this.field3433, this.field3416);
        this.field3410 = method1594(this.field3410, this.field3416);
        this.field3417 = method1594(this.field3417, this.field3416);
        this.field3454 = method1594(this.field3454, this.field3416);
        this.field3455 = method1574(this.field3455, this.field3416);
        this.field3430 = method1574(this.field3430, this.field3416);
    }

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "()V", line = 2093)
    public final void method406() {
        for (int var1 = 0; var1 < this.field3412; var1++) {
            this.field3408[var1] = -this.field3408[var1];
            this.field3424[var1] = -this.field3424[var1];
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZZZZZZ)V", line = 2107)
    public final void method1589(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3451 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3416 != 0) {
            if (arg6) {
                boolean var8 = !this.field3443.field2545 && (arg1 || arg2 && !class220.field3482);
                this.method1577(false, !this.field3438.field2545 && arg0, var8, this.field3431 != null && !this.field3431.field2545 && arg2, !this.field3441.field2545 && arg3);
                if (!this.field3418.field2545 && arg4 && arg1) {
                    this.method1585();
                }
            }
            if (arg0) {
                if (this.field3438.field2545) {
                    if (!this.field3435.field1559) {
                        this.method1575();
                    }
                    this.field3408 = null;
                    this.field3436 = null;
                    this.field3424 = null;
                    this.field3411 = null;
                    this.field3422 = null;
                } else {
                    this.field3446 = (byte) (this.field3446 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3443.field2545) {
                    this.field3452 = null;
                    this.field3407 = null;
                } else {
                    this.field3446 = (byte) (this.field3446 | 0x2);
                }
            }
            if (arg2 && class220.field3482) {
                if (this.field3431.field2545) {
                    this.field3433 = null;
                    this.field3410 = null;
                    this.field3417 = null;
                    this.field3454 = null;
                } else {
                    this.field3446 = (byte) (this.field3446 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3441.field2545) {
                    this.field3455 = null;
                    this.field3430 = null;
                } else {
                    this.field3446 = (byte) (this.field3446 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3418.field2545 && this.field3443.field2545) {
                    this.field3413 = null;
                    this.field3434 = null;
                    this.field3448 = null;
                } else {
                    this.field3446 = (byte) (this.field3446 | 0x10);
                }
            }
            if (arg5) {
                this.field3419 = null;
                this.field3439 = null;
                this.field3442 = (int[][]) null;
                this.field3421 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIIIZ)V", line = 2203)
    public final void method396(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3464 = 0;
            field3468 = 0;
            field3460 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3442.length) {
                    int[] var14 = this.field3442[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3464 += this.field3408[var16];
                        field3468 += this.field3436[var16];
                        field3460 += this.field3424[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3464 = field3464 / var11 + var8;
                field3468 = field3468 / var11 + var9;
                field3460 = field3460 / var11 + var10;
            } else {
                field3464 = var8;
                field3468 = var9;
                field3460 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3442.length) {
                    int[] var22 = this.field3442[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3408[var24] += var17;
                        this.field3436[var24] += var18;
                        this.field3424[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3442.length) {
                    int[] var27 = this.field3442[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3408[var29] -= field3464;
                        this.field3436[var29] -= field3468;
                        this.field3424[var29] -= field3460;
                        if (arg4 != 0) {
                            int var30 = class31.field467[arg4];
                            int var31 = class31.field451[arg4];
                            int var32 = this.field3436[var29] * var30 + this.field3408[var29] * var31 + 32767 >> 16;
                            this.field3436[var29] = this.field3436[var29] * var31 + 32767 - this.field3408[var29] * var30 >> 16;
                            this.field3408[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class31.field467[arg2];
                            int var34 = class31.field451[arg2];
                            int var35 = this.field3436[var29] * var34 + 32767 - this.field3424[var29] * var33 >> 16;
                            this.field3424[var29] = this.field3436[var29] * var33 + this.field3424[var29] * var34 + 32767 >> 16;
                            this.field3436[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class31.field467[arg3];
                            int var37 = class31.field451[arg3];
                            int var38 = this.field3424[var29] * var36 + this.field3408[var29] * var37 + 32767 >> 16;
                            this.field3424[var29] = this.field3424[var29] * var37 + 32767 - this.field3408[var29] * var36 >> 16;
                            this.field3408[var29] = var38;
                        }
                        this.field3408[var29] += field3464;
                        this.field3436[var29] += field3468;
                        this.field3424[var29] += field3460;
                    }
                }
            }
            if (arg5 && this.field3433 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3442.length) {
                        int[] var41 = this.field3442[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3422[var43];
                            int var45 = this.field3422[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3411[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class31.field467[arg4];
                                    int var49 = class31.field451[arg4];
                                    int var50 = this.field3433[var47] * var49 + this.field3410[var47] * var48 + 32767 >> 16;
                                    this.field3410[var47] = (short) (this.field3410[var47] * var49 + 32767 - this.field3433[var47] * var48 >> 16);
                                    this.field3433[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class31.field467[arg2];
                                    int var52 = class31.field451[arg2];
                                    int var53 = this.field3410[var47] * var52 + 32767 - this.field3417[var47] * var51 >> 16;
                                    this.field3417[var47] = (short) (this.field3417[var47] * var52 + this.field3410[var47] * var51 + 32767 >> 16);
                                    this.field3410[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class31.field467[arg3];
                                    int var55 = class31.field451[arg3];
                                    int var56 = this.field3433[var47] * var55 + this.field3417[var47] * var54 + 32767 >> 16;
                                    this.field3417[var47] = (short) (this.field3417[var47] * var55 + 32767 - this.field3433[var47] * var54 >> 16);
                                    this.field3433[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3431 != null) {
                    this.field3431.field2545 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3442.length) {
                    int[] var59 = this.field3442[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3408[var61] -= field3464;
                        this.field3436[var61] -= field3468;
                        this.field3424[var61] -= field3460;
                        this.field3408[var61] = this.field3408[var61] * arg2 >> 7;
                        this.field3436[var61] = this.field3436[var61] * arg3 >> 7;
                        this.field3424[var61] = this.field3424[var61] * arg4 >> 7;
                        this.field3408[var61] += field3464;
                        this.field3436[var61] += field3468;
                        this.field3424[var61] += field3460;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3421 != null && this.field3407 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field3421.length) {
                        int[] var64 = this.field3421[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field3407[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field3407[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field3443.field2545 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3421 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field3421.length) {
                    int[] var70 = this.field3421[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field3452[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field3452[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field3443.field2545 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "()Z", line = 2610)
    public final boolean method403() {
        if (this.field3442 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3412; var1++) {
            this.field3408[var1] <<= 0x4;
            this.field3436[var1] <<= 0x4;
            this.field3424[var1] <<= 0x4;
        }
        field3464 = 0;
        field3468 = 0;
        field3460 = 0;
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIIIZI[I)V", line = 2634)
    public final void method382(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field3464 = 0;
            field3468 = 0;
            field3460 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field3442.length) {
                    int[] var16 = this.field3442[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3444 == null || (arg6 & this.field3444[var18]) != 0) {
                            field3464 += this.field3408[var18];
                            field3468 += this.field3436[var18];
                            field3460 += this.field3424[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field3464 = field3464 / var13 + var10;
                field3468 = field3468 / var13 + var11;
                field3460 = field3460 / var13 + var12;
                field3465 = true;
            } else {
                field3464 = var10;
                field3468 = var11;
                field3460 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3442.length) {
                    int[] var27 = this.field3442[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3444 == null || (arg6 & this.field3444[var29]) != 0) {
                            this.field3408[var29] += var22;
                            this.field3436[var29] += var23;
                            this.field3424[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field3442.length) {
                        int[] var92 = this.field3442[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field3444 == null || (arg6 & this.field3444[var94]) != 0) {
                                this.field3408[var94] -= field3464;
                                this.field3436[var94] -= field3468;
                                this.field3424[var94] -= field3460;
                                if (arg4 != 0) {
                                    int var95 = class31.field467[arg4];
                                    int var96 = class31.field451[arg4];
                                    int var97 = this.field3436[var94] * var95 + this.field3408[var94] * var96 + 32767 >> 16;
                                    this.field3436[var94] = this.field3436[var94] * var96 + 32767 - this.field3408[var94] * var95 >> 16;
                                    this.field3408[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class31.field467[arg2];
                                    int var99 = class31.field451[arg2];
                                    int var100 = this.field3436[var94] * var99 + 32767 - this.field3424[var94] * var98 >> 16;
                                    this.field3424[var94] = this.field3436[var94] * var98 + this.field3424[var94] * var99 + 32767 >> 16;
                                    this.field3436[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class31.field467[arg3];
                                    int var102 = class31.field451[arg3];
                                    int var103 = this.field3424[var94] * var101 + this.field3408[var94] * var102 + 32767 >> 16;
                                    this.field3424[var94] = this.field3424[var94] * var102 + 32767 - this.field3408[var94] * var101 >> 16;
                                    this.field3408[var94] = var103;
                                }
                                this.field3408[var94] += field3464;
                                this.field3436[var94] += field3468;
                                this.field3424[var94] += field3460;
                            }
                        }
                    }
                }
                if (arg5 && this.field3433 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field3442.length) {
                            int[] var106 = this.field3442[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field3444 == null || (arg6 & this.field3444[var108]) != 0) {
                                    int var109 = this.field3422[var108];
                                    int var110 = this.field3422[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field3411[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class31.field467[arg4];
                                            int var114 = class31.field451[arg4];
                                            int var115 = this.field3433[var112] * var114 + this.field3410[var112] * var113 + 32767 >> 16;
                                            this.field3410[var112] = (short) (this.field3410[var112] * var114 + 32767 - this.field3433[var112] * var113 >> 16);
                                            this.field3433[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class31.field467[arg2];
                                            int var117 = class31.field451[arg2];
                                            int var118 = this.field3410[var112] * var117 + 32767 - this.field3417[var112] * var116 >> 16;
                                            this.field3417[var112] = (short) (this.field3417[var112] * var117 + this.field3410[var112] * var116 + 32767 >> 16);
                                            this.field3410[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class31.field467[arg3];
                                            int var120 = class31.field451[arg3];
                                            int var121 = this.field3433[var112] * var120 + this.field3417[var112] * var119 + 32767 >> 16;
                                            this.field3417[var112] = (short) (this.field3417[var112] * var120 + 32767 - this.field3433[var112] * var119 >> 16);
                                            this.field3433[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3431 != null) {
                        this.field3431.field2545 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field3465) {
                    int var36 = arg7[6] * field3460 + arg7[0] * field3464 + arg7[3] * field3468 + 16384 >> 15;
                    int var37 = arg7[7] * field3460 + arg7[1] * field3464 + arg7[4] * field3468 + 16384 >> 15;
                    int var38 = arg7[8] * field3460 + arg7[2] * field3464 + arg7[5] * field3468 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field3464 = var39;
                    field3468 = var40;
                    field3460 = var41;
                    field3465 = false;
                }
                int[] var42 = new int[9];
                int var43 = class31.field451[arg2] >> 1;
                int var44 = class31.field467[arg2] >> 1;
                int var45 = class31.field451[arg3] >> 1;
                int var46 = class31.field467[arg3] >> 1;
                int var47 = class31.field451[arg4] >> 1;
                int var48 = class31.field467[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field3460 + var42[0] * -field3464 + var42[1] * -field3468 + 16384 >> 15;
                int var52 = var42[5] * -field3460 + var42[3] * -field3464 + var42[4] * -field3468 + 16384 >> 15;
                int var53 = var42[8] * -field3460 + var42[6] * -field3464 + var42[7] * -field3468 + 16384 >> 15;
                int var54 = field3464 + var51;
                int var55 = field3468 + var52;
                int var56 = field3460 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field3442.length) {
                        int[] var81 = this.field3442[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field3444 == null || (arg6 & this.field3444[var83]) != 0) {
                                int var84 = this.field3424[var83] * var68[2] + this.field3436[var83] * var68[1] + this.field3408[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field3424[var83] * var68[5] + this.field3436[var83] * var68[4] + this.field3408[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field3424[var83] * var68[8] + this.field3436[var83] * var68[7] + this.field3408[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field3408[var83] = var87;
                                this.field3436[var83] = var88;
                                this.field3424[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field3442.length) {
                        int[] var174 = this.field3442[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3444 == null || (arg6 & this.field3444[var176]) != 0) {
                                this.field3408[var176] -= field3464;
                                this.field3436[var176] -= field3468;
                                this.field3424[var176] -= field3460;
                                this.field3408[var176] = this.field3408[var176] * arg2 >> 7;
                                this.field3436[var176] = this.field3436[var176] * arg3 >> 7;
                                this.field3424[var176] = this.field3424[var176] * arg4 >> 7;
                                this.field3408[var176] += field3464;
                                this.field3436[var176] += field3468;
                                this.field3424[var176] += field3460;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field3465) {
                    int var128 = arg7[6] * field3460 + arg7[0] * field3464 + arg7[3] * field3468 + 16384 >> 15;
                    int var129 = arg7[7] * field3460 + arg7[1] * field3464 + arg7[4] * field3468 + 16384 >> 15;
                    int var130 = arg7[8] * field3460 + arg7[2] * field3464 + arg7[5] * field3468 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field3464 = var131;
                    field3468 = var132;
                    field3460 = var133;
                    field3465 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field3464 * var134 + 16384 >> 15;
                int var138 = -field3468 * var135 + 16384 >> 15;
                int var139 = -field3460 * var136 + 16384 >> 15;
                int var140 = field3464 + var137;
                int var141 = field3468 + var138;
                int var142 = field3460 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field3442.length) {
                        int[] var163 = this.field3442[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field3444 == null || (arg6 & this.field3444[var165]) != 0) {
                                int var166 = this.field3424[var165] * var150[2] + this.field3436[var165] * var150[1] + this.field3408[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field3424[var165] * var150[5] + this.field3436[var165] * var150[4] + this.field3408[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field3424[var165] * var150[8] + this.field3436[var165] * var150[7] + this.field3408[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field3408[var165] = var169;
                                this.field3436[var165] = var170;
                                this.field3424[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3421 != null && this.field3407 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field3421.length) {
                        int[] var179 = this.field3421[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field3409 == null || (arg6 & this.field3409[var181]) != 0) {
                                int var182 = (this.field3407[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field3407[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field3443.field2545 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3421 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field3421.length) {
                    int[] var185 = this.field3421[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field3409 == null || (arg6 & this.field3409[var187]) != 0) {
                            int var188 = this.field3452[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field3452[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field3443.field2545 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lci;)Lci;", line = 3427)
    public final class201 method1590(class201 arg0) {
        if (this.field3416 == 0) {
            return null;
        }
        if (!this.field3435.field1559) {
            this.method1575();
        }
        int var2;
        int var3;
        if (class115.field1608 > 0) {
            var2 = this.field3435.field1553 - (class115.field1608 * this.field3435.field1560 >> 8) >> 3;
            var3 = this.field3435.field1555 - (class115.field1608 * this.field3435.field1558 >> 8) >> 3;
        } else {
            var2 = this.field3435.field1553 - (class115.field1608 * this.field3435.field1558 >> 8) >> 3;
            var3 = this.field3435.field1555 - (class115.field1608 * this.field3435.field1560 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class115.field1599 > 0) {
            var4 = this.field3435.field1557 - (class115.field1599 * this.field3435.field1560 >> 8) >> 3;
            var5 = this.field3435.field1554 - (class115.field1599 * this.field3435.field1558 >> 8) >> 3;
        } else {
            var4 = this.field3435.field1557 - (class115.field1599 * this.field3435.field1558 >> 8) >> 3;
            var5 = this.field3435.field1554 - (class115.field1599 * this.field3435.field1560 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class201 var8;
        if (arg0 == null || arg0.field3212.length < var6 * var7) {
            var8 = new class201(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field284 = arg0.field297 = var6;
            arg0.field289 = arg0.field290 = var7;
            arg0.method1494();
        }
        var8.field298 = var2;
        var8.field296 = var4;
        if (field3458.length < this.field3416) {
            field3458 = new int[this.field3416];
            field3459 = new int[this.field3416];
        }
        for (int var9 = 0; var9 < this.field3425; var9++) {
            int var10 = (this.field3408[var9] - (this.field3436[var9] * class115.field1608 >> 8) >> 3) - var2;
            int var11 = (this.field3424[var9] - (this.field3436[var9] * class115.field1599 >> 8) >> 3) - var4;
            int var12 = this.field3422[var9];
            int var13 = this.field3422[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3411[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3458[var15] = var10;
                field3459[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3450; var16++) {
            if (this.field3407[var16] <= 128) {
                short var17 = this.field3413[var16];
                short var18 = this.field3434[var16];
                short var19 = this.field3448[var16];
                int var20 = field3458[var17];
                int var21 = field3458[var18];
                int var22 = field3458[var19];
                int var23 = field3459[var17];
                int var24 = field3459[var18];
                int var25 = field3459[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class31.method293(var8.field3212, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZZLjb;Ljb;)Ljf;", line = 3550)
    private final class89 method1591(boolean arg0, boolean arg1, boolean arg2, class217 arg3, class217 arg4) {
        arg3.field3412 = this.field3412;
        arg3.field3425 = this.field3425;
        arg3.field3416 = this.field3416;
        arg3.field3450 = this.field3450;
        arg3.field3426 = this.field3426;
        arg3.field3429 = this.field3429;
        arg3.field3451 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field3408 == null || arg3.field3408.length < this.field3412) {
            arg3.field3408 = new int[this.field3412 + 100];
            arg3.field3436 = new int[this.field3412 + 100];
            arg3.field3424 = new int[this.field3412 + 100];
        }
        for (int var6 = 0; var6 < this.field3412; var6++) {
            arg3.field3408[var6] = this.field3408[var6];
            arg3.field3436[var6] = this.field3436[var6];
            arg3.field3424[var6] = this.field3424[var6];
        }
        if (arg3.field3438 == null) {
            arg3.field3438 = new class160();
        }
        arg3.field3438.field2545 = false;
        if (arg3.field3435 == null) {
            arg3.field3435 = new class112();
        }
        arg3.field3435.field1559 = false;
        if (arg0) {
            arg3.field3407 = this.field3407;
        } else {
            if (arg4.field3407 == null || arg4.field3407.length < this.field3450) {
                arg4.field3407 = new byte[this.field3450 + 100];
            }
            arg3.field3407 = arg4.field3407;
            for (int var7 = 0; var7 < this.field3450; var7++) {
                arg3.field3407[var7] = this.field3407[var7];
            }
        }
        if (arg1) {
            arg3.field3452 = this.field3452;
        } else {
            if (arg4.field3452 == null || arg4.field3452.length < this.field3450) {
                arg4.field3452 = new short[this.field3450 + 100];
            }
            arg3.field3452 = arg4.field3452;
            for (int var8 = 0; var8 < this.field3450; var8++) {
                arg3.field3452[var8] = this.field3452[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field3443 = this.field3443;
        } else {
            if (arg4.field3443 == null) {
                arg4.field3443 = new class160();
            }
            arg3.field3443 = arg4.field3443;
            arg3.field3443.field2545 = false;
        }
        if (arg2 || this.field3433 == null) {
            arg3.field3433 = this.field3433;
            arg3.field3410 = this.field3410;
            arg3.field3417 = this.field3417;
            arg3.field3454 = this.field3454;
            arg3.field3431 = this.field3431;
        } else {
            if (arg4.field3433 == null || arg4.field3433.length < this.field3416) {
                arg4.field3433 = new short[this.field3416 + 100];
                arg4.field3410 = new short[this.field3416 + 100];
                arg4.field3417 = new short[this.field3416 + 100];
                arg4.field3454 = new short[this.field3416 + 100];
            }
            arg3.field3433 = arg4.field3433;
            arg3.field3410 = arg4.field3410;
            arg3.field3417 = arg4.field3417;
            arg3.field3454 = arg4.field3454;
            for (int var9 = 0; var9 < this.field3416; var9++) {
                arg3.field3433[var9] = this.field3433[var9];
                arg3.field3410[var9] = this.field3410[var9];
                arg3.field3417[var9] = this.field3417[var9];
                arg3.field3454[var9] = this.field3454[var9];
            }
            if (class220.field3482) {
                if (arg4.field3431 == null) {
                    arg4.field3431 = new class160();
                }
                arg3.field3431 = arg4.field3431;
                arg3.field3431.field2545 = false;
            } else {
                arg3.field3431 = null;
            }
        }
        arg3.field3455 = this.field3455;
        arg3.field3430 = this.field3430;
        arg3.field3419 = this.field3419;
        arg3.field3442 = this.field3442;
        arg3.field3413 = this.field3413;
        arg3.field3434 = this.field3434;
        arg3.field3448 = this.field3448;
        arg3.field3432 = this.field3432;
        arg3.field3439 = this.field3439;
        arg3.field3421 = this.field3421;
        arg3.field3441 = this.field3441;
        arg3.field3418 = this.field3418;
        arg3.field3427 = this.field3427;
        arg3.field3411 = this.field3411;
        arg3.field3422 = this.field3422;
        arg3.field1204 = this.field1204;
        arg3.field3444 = this.field3444;
        arg3.field3409 = this.field3409;
        return arg3;
    }

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "()V", line = 3707)
    public final void method1592() {
        if (this.field3433 == null) {
            this.method419();
            return;
        }
        for (int var1 = 0; var1 < this.field3412; var1++) {
            int var2 = this.field3408[var1];
            this.field3408[var1] = this.field3424[var1];
            this.field3424[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3416; var3++) {
            short var4 = this.field3433[var3];
            this.field3433[var3] = this.field3417[var3];
            this.field3417[var3] = (short) (-var4);
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
        if (this.field3431 != null) {
            this.field3431.field2545 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "()V", line = 3746)
    public final void method1593() {
        if (this.field3433 == null) {
            this.method412();
            return;
        }
        for (int var1 = 0; var1 < this.field3412; var1++) {
            int var2 = this.field3424[var1];
            this.field3424[var1] = this.field3408[var1];
            this.field3408[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3416; var3++) {
            short var4 = this.field3417[var3];
            this.field3417[var3] = this.field3433[var3];
            this.field3433[var3] = (short) (-var4);
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
        if (this.field3431 != null) {
            this.field3431.field2545 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(ZZZ)Ljf;", line = 3783)
    public final class89 method381(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1591(arg0, arg1, arg2, field3449, field3447);
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "()I", line = 3786)
    public final int method392() {
        if (!this.field3435.field1559) {
            this.method1575();
        }
        return this.field3435.field1560;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([SI)[S", line = 3798)
    private static final short[] method1594(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class54.method427(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)Z", line = 3804)
    private final boolean method1595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "()V", line = 3819)
    public static void method1596() {
        field3428 = null;
        field3414 = null;
        field3440 = null;
        field3437 = null;
        field3445 = null;
        field3447 = null;
        field3449 = null;
        field3453 = null;
        field3456 = null;
        field3458 = null;
        field3459 = null;
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "()I", line = 3832)
    public final int method383() {
        if (!this.field3435.field1559) {
            this.method1575();
        }
        return this.field3435.field1555;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V", line = 3841)
    public final void method407(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3412; var4++) {
            this.field3408[var4] += arg0;
            this.field3436[var4] += arg1;
            this.field3424[var4] += arg2;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "()V", line = 3857)
    public final void method385() {
        for (int var1 = 0; var1 < this.field3412; var1++) {
            this.field3408[var1] = this.field3408[var1] + 7 >> 4;
            this.field3436[var1] = this.field3436[var1] + 7 >> 4;
            this.field3424[var1] = this.field3424[var1] + 7 >> 4;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V", line = 3870)
    public final void method387(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3464 = 0;
            field3468 = 0;
            field3460 = 0;
            for (int var6 = 0; var6 < this.field3412; var6++) {
                field3464 += this.field3408[var6];
                field3468 += this.field3436[var6];
                field3460 += this.field3424[var6];
                var5++;
            }
            if (var5 > 0) {
                field3464 = field3464 / var5 + arg1;
                field3468 = field3468 / var5 + arg2;
                field3460 = field3460 / var5 + arg3;
            } else {
                field3464 = arg1;
                field3468 = arg2;
                field3460 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3412; var7++) {
                this.field3408[var7] += arg1;
                this.field3436[var7] += arg2;
                this.field3424[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3412; var8++) {
                this.field3408[var8] -= field3464;
                this.field3436[var8] -= field3468;
                this.field3424[var8] -= field3460;
                if (arg3 != 0) {
                    int var9 = class31.field467[arg3];
                    int var10 = class31.field451[arg3];
                    int var11 = this.field3436[var8] * var9 + this.field3408[var8] * var10 + 32767 >> 16;
                    this.field3436[var8] = this.field3436[var8] * var10 + 32767 - this.field3408[var8] * var9 >> 16;
                    this.field3408[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class31.field467[arg1];
                    int var13 = class31.field451[arg1];
                    int var14 = this.field3436[var8] * var13 + 32767 - this.field3424[var8] * var12 >> 16;
                    this.field3424[var8] = this.field3436[var8] * var12 + this.field3424[var8] * var13 + 32767 >> 16;
                    this.field3436[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class31.field467[arg2];
                    int var16 = class31.field451[arg2];
                    int var17 = this.field3424[var8] * var15 + this.field3408[var8] * var16 + 32767 >> 16;
                    this.field3424[var8] = this.field3424[var8] * var16 + 32767 - this.field3408[var8] * var15 >> 16;
                    this.field3408[var8] = var17;
                }
                this.field3408[var8] += field3464;
                this.field3436[var8] += field3468;
                this.field3424[var8] += field3460;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3412; var18++) {
                this.field3408[var18] -= field3464;
                this.field3436[var18] -= field3468;
                this.field3424[var18] -= field3460;
                this.field3408[var18] = this.field3408[var18] * arg1 / 128;
                this.field3436[var18] = this.field3436[var18] * arg2 / 128;
                this.field3424[var18] = this.field3424[var18] * arg3 / 128;
                this.field3408[var18] += field3464;
                this.field3436[var18] += field3468;
                this.field3424[var18] += field3460;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3450; var19++) {
                int var20 = (this.field3407[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3407[var19] = (byte) var20;
            }
            this.field3443.field2545 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field3450; var21++) {
                int var22 = this.field3452[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field3452[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field3443.field2545 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "()I", line = 4064)
    public final int method388() {
        if (!this.field3435.field1559) {
            this.method1575();
        }
        return this.field3435.field1557;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ISIB)I", line = 4071)
    private static final int method1597(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class31.field461[class53.method393(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class31.field466.method444(255, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class31.field466.method456((byte) 115, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "()I", line = 4132)
    public final int method1598() {
        return this.field3429;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(SS)V", line = 4137)
    public final void method1599(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3450; var3++) {
            if (this.field3432[var3] == arg0) {
                this.field3432[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class31.field466.method444(255, arg0 & 0xFFFF);
            var5 = class31.field466.method456((byte) 120, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class31.field466.method444(255, arg1 & 0xFFFF);
            var7 = class31.field466.method456((byte) 119, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3443.field2545 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "()I", line = 4173)
    public final int method394() {
        if (!this.field3435.field1559) {
            this.method1575();
        }
        return this.field3435.field1554;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(III)V", line = 4181)
    public final void method398(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3412; var4++) {
            this.field3408[var4] = this.field3408[var4] * arg0 >> 7;
            this.field3436[var4] = this.field3436[var4] * arg1 >> 7;
            this.field3424[var4] = this.field3424[var4] * arg2 >> 7;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII[FIF)V", line = 4194)
    private static final void method1600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3461 = var16;
        field3466 = var17;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V", line = 4238)
    public final void method1601(int arg0) {
        this.field3429 = (short) arg0;
        if (this.field3431 != null) {
            this.field3431.field2545 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(ZZZ)Ljf;", line = 4247)
    public final class89 method411(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1591(arg0, arg1, arg2, field3445, field3437);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIFFF)[F", line = 4251)
    private static final float[] method1602(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(SS)V", line = 4318)
    public final void method1603(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3450; var3++) {
            if (this.field3452[var3] == arg0) {
                this.field3452[var3] = arg1;
            }
        }
        this.field3443.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 4331)
    public final void method401(int arg0) {
        int var2 = class31.field467[arg0];
        int var3 = class31.field451[arg0];
        for (int var4 = 0; var4 < this.field3412; var4++) {
            int var5 = this.field3424[var4] * var2 + this.field3408[var4] * var3 >> 16;
            this.field3424[var4] = this.field3424[var4] * var3 - this.field3408[var4] * var2 >> 16;
            this.field3408[var4] = var5;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "()V", line = 4360)
    public final void method1604() {
        for (int var1 = 0; var1 < this.field3412; var1++) {
            this.field3424[var1] = -this.field3424[var1];
        }
        if (this.field3417 != null) {
            for (int var2 = 0; var2 < this.field3416; var2++) {
                this.field3417[var2] = (short) (-this.field3417[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3450; var3++) {
            short var4 = this.field3413[var3];
            this.field3413[var3] = this.field3448[var3];
            this.field3448[var3] = var4;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
        if (this.field3431 != null) {
            this.field3431.field2545 = false;
        }
        this.field3418.field2545 = false;
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V", line = 4404)
    public final void method1605(int arg0) {
        if (this.field3433 == null) {
            this.method401(arg0);
            return;
        }
        int var2 = class31.field467[arg0];
        int var3 = class31.field451[arg0];
        for (int var4 = 0; var4 < this.field3412; var4++) {
            int var5 = this.field3424[var4] * var2 + this.field3408[var4] * var3 >> 16;
            this.field3424[var4] = this.field3424[var4] * var3 - this.field3408[var4] * var2 >> 16;
            this.field3408[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3416; var6++) {
            int var7 = this.field3433[var6] * var3 + this.field3417[var6] * var2 >> 16;
            this.field3417[var6] = (short) (this.field3417[var6] * var3 - this.field3433[var6] * var2 >> 16);
            this.field3433[var6] = (short) var7;
        }
        this.field3435.field1559 = false;
        this.field3438.field2545 = false;
        if (this.field3431 != null) {
            this.field3431.field2545 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 4453)
    private static final void method1606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field3462 = var18;
        field3457 = var19;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZZ)Ljf;", line = 4538)
    public final class89 method399(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1591(arg0, arg1, arg2, field3456, field3453);
    }
}
