import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class256 extends class16 {

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    private int field4441 = -1;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    private int field4440 = -32768;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Lea;")
    private class67 field4447 = null;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    private int field4454 = -1;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    private int field4433;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    private int field4443;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    private int field4442;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    private int field4456;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lig;")
    private class186 field4450;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    private int field4459;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    private int field4435;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "[I")
    public static int[] field4431 = new int[1000];

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "[[B")
    public static byte[][] field4453 = new byte[1000][];

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field4452 = 0;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "Lij;")
    public static class50 field4455 = class78.method578(127, ")2");

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Lij;")
    public static class50 field4458 = class78.method578(122, "<col=ff3000>");

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lij;")
    private static class50 field4436 = class78.method578(126, "Loaded fonts");

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "[Z")
    public static boolean[] field4457 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Lij;")
    public static class50 field4434 = field4436;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "[Loe;")
    public static class207[] field4432;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)Laa;")
    private final class16 method1726(int arg0) {
        field4449++;
        if (arg0 != 32051) {
            this.field4443 = -68;
        }
        return this.method1730(false, 1355117639);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()I")
    public final int method126() {
        field4445++;
        return this.field4440;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    public static void method1727(int arg0) {
        field4453 = null;
        field4457 = null;
        field4455 = null;
        field4436 = null;
        field4431 = null;
        field4458 = null;
        field4432 = null;
        field4434 = null;
        if (arg0 != 255) {
            method1727(19);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1729(-1, ((arg1 - arg2 >> 1) + arg2) * 128 + 64, ((arg0 - arg4 >> 1) + arg4) * 128 - -64);
        if (arg3 >= -14) {
            field4455 = null;
        }
        field4437++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B[B)V")
    public static final void method1728(byte arg0, byte[] arg1) {
        field4451++;
        int var2 = class52.field947 >> 2 << 10;
        int var3 = class49.field876 >> 1;
        byte[][] var4 = new byte[class155.field2701][class140.field2460];
        int var5 = 0;
        while (true) {
            while (var5 < arg1.length) {
                int var34 = (arg1[var5++] & 0xFF) * 64 - class90.field1714;
                int var35 = (arg1[var5++] & 0xFF) * 64 - class46.field847;
                if (var34 > 0 && var35 > 0 && (var34 + 64) < class155.field2701 && (var35 + 64) < class140.field2460) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        byte[] var37 = var4[var34 + var36];
                        int var38 = class140.field2460 - var35 - 1;
                        for (int var39 = -64; var39 < 0; var39++) {
                            var37[var38--] = arg1[var5++];
                        }
                    }
                } else {
                    var5 += 4096;
                }
            }
            int var6 = class155.field2701;
            int var7 = class140.field2460;
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            int[] var11 = new int[var7];
            int[] var12 = new int[var7];
            if (arg0 != 68) {
                method1728((byte) -123, (byte[]) null);
            }
            for (int var13 = -5; var13 < var6; var13++) {
                for (int var14 = 0; var14 < var7; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var6 > var28) {
                        int var29 = var4[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class231 var30 = class26.method245(var29 - 1, (byte) -127);
                            var12[var14] += var30.field3880;
                            var8[var14] += var30.field3867;
                            var11[var14] += var30.field3874;
                            var9[var14] += var30.field3885;
                            var10002 = var10[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var4[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class231 var33 = class26.method245(var32 - 1, (byte) -128);
                            var12[var14] -= var33.field3880;
                            var8[var14] -= var33.field3867;
                            var11[var14] -= var33.field3874;
                            var9[var14] -= var33.field3885;
                            var10002 = var10[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class184.field3024[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var7; var21++) {
                        int var22 = var21 + 5;
                        int var23 = var21 - 5;
                        if (var7 > var22) {
                            var18 += var11[var22];
                            var19 += var9[var22];
                            var20 += var10[var22];
                            var17 += var8[var22];
                            var16 += var12[var22];
                        }
                        if (var23 >= 0) {
                            var16 -= var12[var23];
                            var19 -= var9[var23];
                            var20 -= var10[var23];
                            var18 -= var11[var23];
                            var17 -= var8[var23];
                        }
                        if (var21 >= 0 && var20 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var19 == 0 ? 0 : class194.method1310(var16 * 256 / var19, arg0 + 26, var17 / var20, var18 / var20);
                            if (var4[var13][var21] != 0) {
                                if (var15[var24] == null) {
                                    var15[var24] = class184.field3024[var13 >> 6][var24] = new int[4096];
                                }
                                int var26 = (var25 & 0x7F) + var3;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var2 + var25 & 0xFC00) - (-(var25 & 0x380) - var26);
                                var15[var24][(class51.method413(63, var21) << 6) + class51.method413(63, var13)] = class13.field321[class229.method1559(var27, 96, 27353)];
                            } else if (var15[var24] != null) {
                                var15[var24][class51.method413(var13, 63) + (class51.method413(var21, 63) << 6)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(III)V")
    private final void method1729(int arg0, int arg1, int arg2) {
        field4444++;
        if (arg0 != -1) {
            this.field4443 = -65;
        }
        if (this.field4450 == null) {
            return;
        }
        int var4 = class244.field4245 - this.field4435;
        if (var4 > 100 && this.field4450.field3030 > 0) {
            int var5 = this.field4450.field3043.length - this.field4450.field3030;
            while (var5 > this.field4459 && this.field4450.field3038[this.field4459] < var4) {
                var4 -= this.field4450.field3038[this.field4459];
                this.field4459++;
            }
            if (this.field4459 >= var5) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field4450.field3043.length; var7++) {
                    var6 += this.field4450.field3038[var7];
                }
                var4 %= var6;
            }
        }
        while (this.field4450.field3038[this.field4459] < var4) {
            class5.method33(arg1, this.field4459, 0, arg2, this.field4450, false);
            var4 -= this.field4450.field3038[this.field4459];
            this.field4459++;
            if (this.field4450.field3043.length <= this.field4459) {
                this.field4459 -= this.field4450.field3030;
                if (this.field4459 < 0 || this.field4459 >= this.field4450.field3043.length) {
                    this.field4450 = null;
                    break;
                }
            }
        }
        this.field4435 = class244.field4245 - var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4438++;
        class16 var11 = this.method1726(32051);
        if (var11 != null) {
            var11.method129(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4440 = var11.method126();
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(ZI)Laa;")
    private final class16 method1730(boolean arg0, int arg1) {
        boolean var3 = class254.field4390 != class245.field4257;
        class243 var4 = class53.method426((byte) -90, this.field4439);
        field4446++;
        if (var4.field4197 != null) {
            var4 = var4.method1645(124);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field4433 & 0x3;
        if (arg1 != 1355117639) {
            return null;
        }
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field4235;
            var7 = var4.field4223;
        } else {
            var6 = var4.field4223;
            var7 = var4.field4235;
        }
        int var8 = this.field4442 + (var7 >> 1);
        int var9 = (var6 + 1 >> 1) + this.field4448;
        int var10 = (var7 + 1 >> 1) + this.field4442;
        int var11 = (var6 >> 1) + this.field4448;
        this.method1729(arg1 - 1355117640, var8 * 128, var11 * 128);
        boolean var12 = !var3 && var4.field4178 && (this.field4454 != var4.field4200 || this.field4459 != this.field4441 && class83.field1556 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class245.field4257[this.field4443];
        int var14 = var13[var9][var8] + var13[var9][var10] + var13[var11][var8] + var13[var11][var10] >> 2;
        int var15 = (this.field4448 << 7) + (var6 << 6);
        int var16 = (this.field4442 << 7) + (var7 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class254.field4390[0];
        } else if (this.field4443 < 3) {
            var17 = class245.field4257[this.field4443 + 1];
        }
        boolean var18 = this.field4447 == null;
        class214 var19;
        if (this.field4450 == null) {
            var19 = var4.method1652(var14, var15, var17, false, (byte) -93, var12, var18 ? class63.field1201 : this.field4447, this.field4456, var16, var13, this.field4433);
        } else {
            var19 = var4.method1651(var15, var13, var14, this.field4450, var18 ? class63.field1201 : this.field4447, var12, arg1 ^ 0x50C5742C, var17, var16, this.field4456, this.field4433, this.field4459);
        }
        return var19 == null ? null : var19.field3543;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIIIZLaa;)V")
    public class256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class16 arg8) {
        this.field4439 = arg0;
        this.field4433 = arg2;
        this.field4443 = arg3;
        this.field4448 = arg4;
        this.field4442 = arg5;
        this.field4456 = arg1;
        if (arg6 != -1) {
            this.field4450 = class123.method891(-5664, arg6);
            this.field4459 = 0;
            this.field4435 = class244.field4245 - 1;
            if (this.field4450.field3059 == 0 && arg8 != null && arg8 instanceof class256) {
                class256 var10 = (class256) arg8;
                if (this.field4450 == var10.field4450) {
                    this.field4459 = var10.field4459;
                    this.field4435 = var10.field4435;
                    return;
                }
            }
            if (arg7 && this.field4450.field3030 != -1) {
                this.field4459 = (int) ((double) this.field4450.field3043.length * Math.random());
                this.field4435 -= (int) (Math.random() * (double) this.field4450.field3038[this.field4459]);
                return;
            }
        }
    }
}
