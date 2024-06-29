import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Liq;")
    private class568 field325;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lkea;")
    private class223 field328;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "[B")
    public byte[] field339;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Ldr;")
    public static class675 field336 = new class675(99, 2);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lok;")
    public static class238 field324;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[[Lkj;")
    private class531[][] field322;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILw;Z)Z")
    public final boolean method168(int arg0, int arg1, class279 arg2, boolean arg3) {
        field335++;
        class670 var5 = (class670) arg2;
        int var6 = var5.field9108 + arg1 + 1;
        int var7 = var5.field9101 + arg0 + 1;
        if (!arg3) {
            this.field328 = null;
        }
        int var8 = this.field337 * var7 + var6;
        int var9 = var5.field9102;
        int var10 = var5.field9099;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var8 += this.field337 * var11;
            var9 -= var11;
        }
        int var12 = this.field337 - var10;
        if ((var7 + var9) >= this.field330) {
            int var13 = var7 + var9 + 1 - this.field330;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
            var6 = 1;
        }
        if (this.field337 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field337;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field337 + var12;
            return class472.method2561(var16, (byte) -65, var10, var17, var9, this.field339, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([[ZIZIZI)V")
    public final void method169(boolean[][] arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        this.field328.method1294(false, -29852);
        field331++;
        this.field328.method1272(false, (byte) -102);
        if (!arg4) {
            this.method168(41, 35, null, true);
        }
        this.field328.method1321(-104, 1);
        this.field328.method1328((byte) -1, 1);
        this.field328.method1312(false, 0, -2, false);
        float var7 = 1.0F / (float) (this.field328.field2860 * 128);
        if (arg2) {
            for (int var8 = 0; var8 < this.field323; var8++) {
                int var9 = var8 << this.field329;
                int var10 = var8 + 1 << this.field329;
                label145: for (int var11 = 0; var11 < this.field338; var11++) {
                    if (this.field322[var11][var8] != null) {
                        int var12 = var11 << this.field329;
                        int var13 = var11 + 1 << this.field329;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if ((var14 - arg3) >= (-arg1) && arg1 >= (var14 - arg3)) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((var15 - arg5) >= (-arg1) && arg1 >= (var15 - arg5) && arg0[arg1 + var14 - arg3][var15 - (arg5 - arg1)]) {
                                        class581 var16 = this.field328.method1336(0);
                                        var16.method3226(false, var7, var7, 1.0F);
                                        var16.method588(-var11, -var8, 0);
                                        this.field328.method1339(true, class228.field2942);
                                        this.field322[var11][var8].method2868((byte) 81);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field323; var17++) {
                int var18 = var17 << this.field329;
                int var19 = var17 + 1 << this.field329;
                for (int var20 = 0; var20 < this.field338; var20++) {
                    class531 var21 = this.field322[var20][var17];
                    if (var21 != null) {
                        class13 var22 = this.field328.method1293(20932, var21.field6711 * 3);
                        Buffer var23 = var22.method62(true, true);
                        if (var23 != null) {
                            Stream var24 = this.field328.method1289(-43, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field329;
                            int var27 = var20 + 1 << this.field329;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (-arg1 <= var28 - arg5 && (var28 - arg5) <= arg1) {
                                    int var30 = this.field325.field1685 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if (var31 - arg3 >= -arg1 && (var31 - arg3) <= arg1 && arg0[var31 + arg1 - arg3][var28 + arg1 - arg5]) {
                                            short[] var32 = this.field325.field7119[var30];
                                            if (var32 != null) {
                                                if (Stream.method3525()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method3526(var32[var34] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method3519(var32[var33] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3530();
                            if (var22.method61((byte) 96) && var25 > 0) {
                                class581 var29 = this.field328.method1336(0);
                                var29.method3226(false, var7, var7, 1.0F);
                                var29.method588(-var20, -var17, 0);
                                this.field328.method1339(true, class228.field2942);
                                var21.method2865(0, var25 / 3, var22);
                            }
                        }
                    }
                }
            }
        }
        this.field328.method1324(0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method170(int arg0) {
        if (arg0 == 15505) {
            field324 = null;
            field336 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILw;I)V")
    public final void method171(int arg0, int arg1, class279 arg2, int arg3) {
        field334++;
        class670 var5 = (class670) arg2;
        int var6 = var5.field9101 + arg1 + arg3;
        int var7 = var5.field9108 + arg0 + 1;
        int var8 = this.field337 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field9102;
        int var11 = var5.field9099;
        int var12 = this.field337 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var8 += this.field337 * var14;
            var6 = 1;
            var10 -= var14;
        }
        if (this.field330 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field330;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var9 += var16;
            var12 += var16;
            var7 = 1;
            var13 += var16;
            var11 -= var16;
        }
        if (this.field337 <= var7 + var11) {
            int var17 = var7 + var11 - (-1 - -this.field337);
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class197.method1153(var9, arg1 ^ 0x1, var12, var13, var5.field9100, var8, var11, this.field339, var10);
            this.method175(var10, var11, var6, var7, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public final void method172(byte arg0) {
        this.field322 = new class531[this.field338][this.field323];
        field327++;
        if (arg0 <= 115) {
            this.method169(null, 70, false, -101, true, -101);
        }
        for (int var2 = 0; var2 < this.field323; var2++) {
            for (int var3 = 0; var3 < this.field338; var3++) {
                this.field322[var3][var2] = new class531(this.field328, this, this.field325, var3, var2, this.field329, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field322[var3][var2].field6711 == 0) {
                    this.field322[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLw;II)V")
    public final void method173(byte arg0, class279 arg1, int arg2, int arg3) {
        field326++;
        class670 var5 = (class670) arg1;
        int var6 = var5.field9101 + arg3 + 1;
        int var7 = var5.field9108 + arg2 + 1;
        if (arg0 != 16) {
            this.method168(101, 49, null, true);
        }
        int var8 = var7 + (this.field337 * var6);
        int var9 = 0;
        int var10 = var5.field9102;
        int var11 = var5.field9099;
        int var12 = this.field337 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var6 = 1;
            var8 += this.field337 * var14;
            var10 -= var14;
        }
        if (this.field330 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field330;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var8 += var16;
            var11 -= var16;
            var9 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (this.field337 <= var7 + var11) {
            int var17 = var7 + var11 - (-1 - -this.field337);
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class195.method1148(var9, var10, var12, -1996488705, var8, var11, var5.field9100, var13, this.field339);
            this.method175(var10, var11, var6, var7, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -17783) {
            return false;
        }
        field332++;
        if ((class234.field3033[0][arg2][arg0] & 0x2) != 0) {
            return true;
        } else if ((class234.field3033[arg4][arg2][arg0] & 0x10) == 0) {
            return class406.method2282(arg2, arg0, 2, arg4) == arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIB)V")
    private final void method175(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field333++;
        if (this.field322 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = -114 % ((arg4 + 1) / 49);
        int var8 = arg3 + arg1 - 1 - 1 >> 7;
        int var9 = arg2 - 1 >> 7;
        int var10 = arg0 + arg2 - 1 - 1 >> 7;
        for (int var11 = var6; var11 <= var8; var11++) {
            class531[] var12 = this.field322[var11];
            for (int var13 = var9; var13 <= var10; var13++) {
                if (var12[var13] != null) {
                    var12[var13].field6717 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lkea;Liq;)V")
    public class28(class223 arg0, class568 arg1) {
        this.field325 = arg1;
        this.field328 = arg0;
        this.field337 = (this.field325.field1686 * this.field325.field1685 >> this.field328.field2833) + 2;
        this.field330 = (this.field325.field1686 * this.field325.field1684 >> this.field328.field2833) + 2;
        this.field329 = this.field328.field2833 + 7 - this.field325.field1683;
        this.field339 = new byte[this.field337 * this.field330];
        this.field338 = this.field325.field1685 >> this.field329;
        this.field323 = this.field325.field1684 >> this.field329;
    }
}
