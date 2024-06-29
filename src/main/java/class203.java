import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class203 {

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3517 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field3508;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lw;")
    public static class107 field3523;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lfi;")
    public class206 field3504;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
    public int[] field3506;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
    public int[] field3510;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[I")
    public int[] field3515;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[I")
    public int[] field3520;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "[I")
    public int[] field3525;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "[I")
    public int[] field3527;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[Lfi;")
    public class206[] field3513;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[[I")
    public int[][] field3505;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[[I")
    public int[][] field3518;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lmb;ZI)V")
    public static final void method1415(class96 arg0, boolean arg1, int arg2) {
        class96 var3 = arg0.method681((byte) -44).method706((byte) -97);
        field3507++;
        boolean var4 = false;
        for (int var5 = 0; var5 < class145.field2577; var5++) {
            class47 var6 = class22.field371[class103.field1734[var5]];
            if (var6 != null && var6.field828 != null && var6.field828.method679(var3, 18452)) {
                var4 = true;
                class2.method12(1, class236.field4047.field4566[0], var6.field4566[0], (byte) -73, 0, false, 2, class236.field4047.field4528[0], 0, 0, 1, var6.field4528[0]);
                if (arg2 == 1) {
                    class232.field3978++;
                    class140.field2505.method1012((byte) -127, 197);
                    class140.field2505.method1675(class103.field1734[var5], -108);
                } else if (arg2 == 4) {
                    class236.field4044++;
                    class140.field2505.method1012((byte) -123, 90);
                    class140.field2505.method1675(class103.field1734[var5], -115);
                } else if (arg2 == 5) {
                    class140.field2505.method1012((byte) 52, 247);
                    class121.field2229++;
                    class140.field2505.method1675(class103.field1734[var5], 67);
                } else if (arg2 == 6) {
                    class140.field2505.method1012((byte) -123, 128);
                    class143.field2542++;
                    class140.field2505.method1639(-114, class103.field1734[var5]);
                } else if (arg2 == 7) {
                    class140.field2505.method1012((byte) -127, 83);
                    class264.field4615++;
                    class140.field2505.method1675(class103.field1734[var5], -126);
                }
                break;
            }
        }
        if (!arg1) {
            method1419((byte) 112);
        }
        if (!var4) {
            class226.method1540(class120.field2227, 0, (byte) -74, class36.method289(-5615, new class96[] { class80.field1370, var3 }));
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIZLra;Lpk;IIIZ)Lra;")
    public static final class35 method1416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class35 arg8, class67 arg9, int arg10, int arg11, int arg12, boolean arg13) {
        long var14 = ((long) arg6 << 48) + ((long) arg12 << 32) + (long) (arg5 - (-(arg2 << 16) - (arg1 << 24)));
        field3519++;
        class35 var16 = (class35) class250.field4316.method84(27, var14);
        if (var16 == null) {
            byte var17;
            if (arg5 == 1) {
                var17 = 9;
            } else if (arg5 == 2) {
                var17 = 12;
            } else if (arg5 == 3) {
                var17 = 15;
            } else if (arg5 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            int[][] var20 = new int[var19][var17];
            class112 var21 = new class112((var17 * var19) + 1, var17 * var19 * 2 + -var17, 0);
            int var22 = var21.method876(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class240.field4176[var33] * var30 + arg11 >> 16;
                    int var35 = class240.field4162[var33] * var31 + arg4 >> 16;
                    var20[var23][var32] = var21.method876(var35, 0, var34);
                }
            }
            for (int var24 = 0; var24 < var19; var24++) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg1 * var25 + arg2 * var26 >> 8);
                short var28 = (short) (((arg6 & 0x7F) * var25 + (arg12 & 0x7F) * var26 & 0x7F00) + ((arg6 & 0x380) * var25 + (arg12 & 0x380) * var26 & 0x38000) + ((arg6 & 0xFC00) * var25 + (arg12 & 0xFC00) * var26 & 0xFC0000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var21.method883(var22, var20[0][(var29 + 1) % var17], var20[0][var29], (byte) 1, var28, var27);
                    } else {
                        var21.method883(var20[var24 - 1][var29], var20[var24 - 1][(var29 + 1) % var17], var20[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var21.method883(var20[var24 - 1][var29], var20[var24][(var29 + 1) % var17], var20[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var21.method862(64, 768, -50, -10, -50);
            class250.field4316.method88(var16, 16518, var14);
        }
        int var36 = arg5 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        int var41 = arg8.method267();
        if (arg13) {
            if (arg10 > 1664 || arg10 < 384) {
                var38 -= 128;
            }
            if (arg10 > 1152 && arg10 < 1920) {
                var39 = var36 + 128;
            }
            if (arg10 > 640 && arg10 < 1408) {
                var40 = var36 + 128;
            }
            if (arg10 > 128 && arg10 < 896) {
                var37 -= 128;
            }
        }
        if (var41 < var37) {
            var41 = var37;
        }
        int var42 = arg8.method264();
        if (var42 > var39) {
            var42 = var39;
        }
        class247 var43 = null;
        int var44 = arg8.method274();
        int var45 = arg8.method262();
        if (arg9 != null) {
            int var46 = arg9.field1140[arg3];
            var43 = class272.method1852(var46 >> 16, -1);
            arg3 = var46 & 0xFFFF;
        }
        if (var38 > var44) {
            var44 = var38;
        }
        if (var40 < var45) {
            var45 = var40;
        }
        class35 var47;
        if (var43 == null) {
            var47 = var16.method275(true, true);
            var47.method276((var42 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method270((var41 + var42) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method275(!var43.method1730(arg3, 1), true);
            var47.method276((var42 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method270((var41 + var42) / 2, 0, (var44 + var45) / 2);
            var47.method271(var43, arg3);
        }
        if (arg10 != 0) {
            var47.method268(arg10);
        }
        class255 var48 = (class255) var47;
        if (arg0 != class137.method1025(class216.field3712, arg11 + var44, arg4 + var41, (byte) -94) || class137.method1025(class216.field3712, arg11 + var45, arg4 + var42, (byte) -94) != arg0) {
            for (int var49 = 0; var49 < var48.field4402; var49++) {
                var48.field4399[var49] += class137.method1025(class216.field3712, var48.field4423[var49] + arg11, var48.field4400[var49] + arg4, (byte) -94) - arg0;
            }
            var48.field4394 = false;
        }
        if (arg7) {
            field3514 = 48;
        }
        return var47;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3524++;
        int var6 = arg4 - arg0;
        int var7 = arg1 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class2.method13(false, arg0, arg4, arg2, arg5);
            }
        } else if (var6 == 0) {
            class178.method1270(arg1, arg5, false, arg2, arg0);
        } else if (arg3 <= -33) {
            int var8 = (var6 << 12) / var7;
            int var9 = arg0 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class9.field145) {
                var10 = class9.field145;
                var11 = (class9.field145 * var8 >> 12) + var9;
            } else if (arg2 > class162.field2884) {
                var10 = class162.field2884;
                var11 = (class162.field2884 * var8 >> 12) + var9;
            } else {
                var11 = arg0;
                var10 = arg2;
            }
            if (var11 < client.field1994) {
                var11 = client.field1994;
                var10 = (client.field1994 - var9 << 12) / var8;
            } else if (var11 > class9.field149) {
                var10 = (class9.field149 - var9 << 12) / var8;
                var11 = class9.field149;
            }
            int var12;
            int var13;
            if (arg1 < class9.field145) {
                var13 = class9.field145;
                var12 = (class9.field145 * var8 >> 12) + var9;
            } else if (class162.field2884 >= arg1) {
                var12 = arg4;
                var13 = arg1;
            } else {
                var12 = (class162.field2884 * var8 >> 12) + var9;
                var13 = class162.field2884;
            }
            if (client.field1994 > var12) {
                var12 = client.field1994;
                var13 = (client.field1994 - var9 << 12) / var8;
            } else if (class9.field149 < var12) {
                var12 = class9.field149;
                var13 = (class9.field149 - var9 << 12) / var8;
            }
            class29.method192(var12, var11, var10, false, arg5, var13);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([BB)V")
    private final void method1418(byte[] arg0, byte arg1) {
        field3526++;
        class239 var3 = new class239(class127.method972(-17905, arg0));
        int var4 = var3.method1651(4139);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3516 = var3.method1617((byte) -43);
        } else {
            this.field3516 = 0;
        }
        int var5 = var3.method1651(4139);
        this.field3511 = var3.method1663((byte) 110);
        this.field3527 = new int[this.field3511];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field3511; var8++) {
            this.field3527[var8] = var6 += var3.method1663((byte) -44);
            if (var7 < this.field3527[var8]) {
                var7 = this.field3527[var8];
            }
        }
        this.field3508 = var7 + 1;
        this.field3520 = new int[this.field3508];
        this.field3525 = new int[this.field3508];
        this.field3518 = new int[this.field3508][];
        this.field3506 = new int[this.field3508];
        this.field3515 = new int[this.field3508];
        if (var5 != 0) {
            this.field3510 = new int[this.field3508];
            for (int var9 = 0; var9 < this.field3508; var9++) {
                this.field3510[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3511; var10++) {
                this.field3510[this.field3527[var10]] = var3.method1617((byte) -43);
            }
            this.field3504 = new class206(this.field3510);
        }
        for (int var11 = 0; var11 < this.field3511; var11++) {
            this.field3515[this.field3527[var11]] = var3.method1617((byte) -43);
        }
        for (int var12 = 0; var12 < this.field3511; var12++) {
            this.field3506[this.field3527[var12]] = var3.method1617((byte) -43);
        }
        for (int var13 = 0; var13 < this.field3511; var13++) {
            this.field3520[this.field3527[var13]] = var3.method1663((byte) 83);
        }
        for (int var14 = 0; var14 < this.field3511; var14++) {
            int var22 = 0;
            int var23 = this.field3527[var14];
            int var24 = -1;
            int var25 = this.field3520[var23];
            this.field3518[var23] = new int[var25];
            for (int var26 = 0; var26 < var25; var26++) {
                int var27 = this.field3518[var23][var26] = var22 += var3.method1663((byte) -93);
                if (var27 > var24) {
                    var24 = var27;
                }
            }
            this.field3525[var23] = var24 + 1;
            if (var24 + 1 == var25) {
                this.field3518[var23] = null;
            }
        }
        int var15 = 47 % ((-arg1 - 24) / 49);
        if (var5 == 0) {
            return;
        }
        this.field3505 = new int[var7 + 1][];
        this.field3513 = new class206[var7 + 1];
        for (int var16 = 0; var16 < this.field3511; var16++) {
            int var17 = this.field3527[var16];
            int var18 = this.field3520[var17];
            this.field3505[var17] = new int[this.field3525[var17]];
            for (int var19 = 0; var19 < this.field3525[var17]; var19++) {
                this.field3505[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field3518[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field3518[var17][var20];
                }
                this.field3505[var17][var21] = var3.method1617((byte) -43);
            }
            this.field3513[var17] = new class206(this.field3505[var17]);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method1419(byte arg0) {
        field3523 = null;
        if (arg0 != -88) {
            field3521 = 83;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([BI)V")
    public class203(byte[] arg0, int arg1) {
        this.field3512 = class249.method1741(arg0.length, arg0, (byte) 123);
        if (this.field3512 != arg1) {
            throw new RuntimeException();
        }
        this.method1418(arg0, (byte) -123);
    }
}
