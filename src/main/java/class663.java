import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class663 {

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lpga;")
    private class492 field9358;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lsba;")
    private class556 field9359;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field9347;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    private int field9341;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    private int field9353;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[B")
    public byte[] field9351;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    private int field9348;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    private int field9356;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[Lrea;")
    public static class120[] field9345 = new class120[300];

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "[I")
    public static int[] field9343 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lju;")
    public static class102 field9355 = new class102(26, 1);

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field9360 = 0;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[[Lce;")
    private class422[][] field9354;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lr;BII)V")
    public final void method3803(class706 arg0, byte arg1, int arg2, int arg3) {
        field9344++;
        class450 var5 = (class450) arg0;
        int var6 = var5.field6180 + arg2 + 1;
        int var7 = var5.field6190 + arg3 + 1;
        int var8 = var6 + (this.field9347 * var7);
        int var9 = 0;
        if (arg1 > -95) {
            this.method3806(null, -55, -101, 38);
        }
        int var10 = var5.field6189;
        int var11 = var5.field6185;
        int var12 = this.field9347 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var9 += var11 * var14;
            var7 = 1;
            var8 += this.field9347 * var14;
        }
        if (this.field9341 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field9341;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var8 += var16;
            var6 = 1;
            var12 += var16;
            var13 += var16;
            var9 += var16;
        }
        if (this.field9347 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field9347;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class557.method3342(var5.field6187, var9, var10, this.field9351, (byte) -114, var12, var11, var8, var13);
            this.method3809(-28682, var10, var6, var7, var11);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method3804(int arg0) {
        field9355 = null;
        field9343 = null;
        field9345 = null;
        if (arg0 >= -111) {
            method3804(44);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI[[ZIZI)V")
    public final void method3805(boolean arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, int arg5) {
        this.field9358.method2910(false, (byte) -94);
        field9357++;
        this.field9358.method2885(arg0, 126);
        this.field9358.method2945(1, 22630);
        this.field9358.method2881(1, -1);
        this.field9358.method2951(true, false, false, -2);
        float var7 = 1.0F / (float) (this.field9358.field6823 * 128);
        if (arg4) {
            for (int var8 = 0; var8 < this.field9356; var8++) {
                int var9 = var8 << this.field9353;
                int var10 = var8 + 1 << this.field9353;
                label142: for (int var11 = 0; var11 < this.field9348; var11++) {
                    if (this.field9354[var11][var8] != null) {
                        int var12 = var11 << this.field9353;
                        int var13 = var11 + 1 << this.field9353;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (-arg1 <= var14 - arg5 && arg1 >= var14 - arg5) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((-arg1) <= (var15 - arg3) && (var15 - arg3) <= arg1 && arg2[var14 + arg1 - arg5][var15 + arg1 - arg3]) {
                                        class173 var16 = this.field9358.method2872((byte) 23);
                                        var16.method1091(var7, 1.0F, var7, 1);
                                        var16.method851(-var11, -var8, 0);
                                        this.field9358.method2925(class643.field9115, (byte) 115);
                                        this.field9354[var11][var8].method2574(0);
                                        continue label142;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field9356; var17++) {
                int var18 = var17 << this.field9353;
                int var19 = var17 + 1 << this.field9353;
                for (int var20 = 0; var20 < this.field9348; var20++) {
                    class422 var21 = this.field9354[var20][var17];
                    if (var21 != null) {
                        class212 var22 = this.field9358.method2909(true, var21.field5846 * 3);
                        Buffer var23 = var22.method1401(true, 109);
                        if (var23 != null) {
                            Stream var24 = this.field9358.method2917(var23, arg0);
                            int var25 = 0;
                            int var26 = var20 << this.field9353;
                            int var27 = var20 + 1 << this.field9353;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (-arg1 <= var28 - arg3 && arg1 >= var28 - arg3) {
                                    int var30 = this.field9359.field4344 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if (var31 - arg5 >= -arg1 && var31 - arg5 <= arg1 && arg2[arg1 + var31 - arg5][var28 + arg1 - arg3]) {
                                            short[] var32 = this.field9359.field7873[var30];
                                            if (var32 != null) {
                                                if (Stream.method2541()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method2554(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method2544(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method2551();
                            if (var22.method1400(arg0) && var25 > 0) {
                                class173 var29 = this.field9358.method2872((byte) 99);
                                var29.method1091(var7, 1.0F, var7, 1);
                                var29.method851(-var20, -var17, 0);
                                this.field9358.method2925(class643.field9115, (byte) 118);
                                var21.method2576(var22, 0, var25 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field9358.method2928(false);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lr;III)V")
    public final void method3806(class706 arg0, int arg1, int arg2, int arg3) {
        field9352++;
        int var5 = 119 % ((arg2 - 27) / 60);
        class450 var6 = (class450) arg0;
        int var7 = var6.field6190 + arg3 + 1;
        int var8 = var6.field6180 + arg1 + 1;
        int var9 = this.field9347 * var7 + var8;
        int var10 = 0;
        int var11 = var6.field6189;
        int var12 = var6.field6185;
        int var13 = this.field9347 - var12;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 += var12 * var14;
            var11 -= var14;
            var9 += this.field9347 * var14;
        }
        int var15 = 0;
        if (var7 + var11 >= this.field9341) {
            int var16 = var7 + var11 + 1 - this.field9341;
            var11 -= var16;
        }
        if (var8 <= 0) {
            int var17 = 1 - var8;
            var9 += var17;
            var12 -= var17;
            var8 = 1;
            var10 += var17;
            var15 += var17;
            var13 += var17;
        }
        if (var8 + var12 >= this.field9347) {
            int var18 = var8 + var12 + 1 - this.field9347;
            var12 -= var18;
            var15 += var18;
            var13 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            class509.method3039(var13, false, var12, var10, this.field9351, var11, var9, var6.field6187, var15);
            this.method3809(-28682, var11, var8, var7, var12);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method3807(int arg0, int arg1) {
        field9350++;
        class687.field9633 = arg1;
        if (arg0 != -30664) {
            field9355 = null;
        }
        class308.field3976.method3210(false);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILr;II)Z")
    public final boolean method3808(int arg0, class706 arg1, int arg2, int arg3) {
        field9346++;
        class450 var5 = (class450) arg1;
        int var6 = var5.field6190 + arg0 + arg3;
        int var7 = var5.field6180 + arg2 + 1;
        int var8 = this.field9347 * var6 + var7;
        int var9 = var5.field6189;
        int var10 = var5.field6185;
        int var11 = this.field9347 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var8 += this.field9347 * var12;
            var6 = 1;
        }
        if (this.field9341 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field9341;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var11 += var14;
            var8 += var14;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field9347) {
            int var15 = var10 + var7 + 1 - this.field9347;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field9347 + var11;
            return class104.method704(var9, this.field9351, var8, var16, var10, arg0 - 8247, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    private final void method3809(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9342++;
        if (this.field9354 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        if (arg0 != -28682) {
            method3807(50, -120);
        }
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg1 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class422[] var11 = this.field9354[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field5840 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method3810(int arg0) {
        this.field9354 = new class422[this.field9348][this.field9356];
        field9349++;
        if (arg0 != -8857) {
            this.field9358 = null;
        }
        for (int var2 = 0; var2 < this.field9356; var2++) {
            for (int var3 = 0; var3 < this.field9348; var3++) {
                this.field9354[var3][var2] = new class422(this.field9358, this, this.field9359, var3, var2, this.field9353, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field9354[var3][var2].field5846 == 0) {
                    this.field9354[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lpga;Lsba;)V")
    public class663(class492 arg0, class556 arg1) {
        this.field9358 = arg0;
        this.field9359 = arg1;
        this.field9347 = (this.field9359.field4346 * this.field9359.field4344 >> this.field9358.field6818) + 2;
        this.field9341 = (this.field9359.field4348 * this.field9359.field4346 >> this.field9358.field6818) + 2;
        this.field9353 = this.field9358.field6818 + 7 - this.field9359.field4349;
        this.field9351 = new byte[this.field9347 * this.field9341];
        this.field9348 = this.field9359.field4344 >> this.field9353;
        this.field9356 = this.field9359.field4348 >> this.field9353;
    }
}
