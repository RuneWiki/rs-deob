import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class272 extends class126 {

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    private int field4403 = -1;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    private int field4408 = -32768;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Z")
    private boolean field4406 = true;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    private int field4405 = -1;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    private int field4421 = 0;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lka;")
    private class279 field4412 = null;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    private int field4402 = 0;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    private int field4435 = 0;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    private int field4424;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    private int field4426;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    private int field4419;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    private int field4413;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    private int field4415;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    private int field4430;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Lrk;")
    private class205 field4414;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    private int field4422;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    private int field4432;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[I")
    public static int[] field4404 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lok;")
    private static class41 field4401 = class137.method956("You can(Wt add yourself to your own ignore list)3", 45);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lok;")
    public static class41 field4433 = class137.method956("Lade Konfiguration )2 ", 45);

    @OriginalMember(owner = "client!v", name = "x", descriptor = "Lok;")
    public static class41 field4411 = field4401;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Z")
    public static boolean field4429 = false;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "Lmh;")
    public static class65 field4427;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIIII)V", line = 4)
    public final void method886(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4417++;
        if (arg0 <= 52) {
            return;
        }
        if (class166.field2625) {
            this.method1927(true, (byte) 26);
        } else {
            this.method1925(0, ((arg4 - arg2 >> 1) + arg2) * 128 + 64, ((-arg3 + arg1 >> 1) + arg3) * 128 + 64);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Lth;", line = 29)
    private final class126 method1921(byte arg0) {
        if (arg0 != -84) {
            this.method117(-57, 96, 120, -128, 66, -84, -117, -100, -64L);
        }
        field4407++;
        return this.method1927(false, (byte) 26);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIIIZLth;)V", line = 618)
    public class272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class126 arg8) {
        this.field4424 = arg1;
        this.field4426 = arg2;
        this.field4419 = arg3;
        this.field4413 = arg0;
        this.field4415 = arg4;
        this.field4430 = arg5;
        if (class166.field2625 && arg8 != null) {
            if (arg8 instanceof class272) {
                ((class272) arg8).method1922((byte) -79);
            } else {
                class171 var10 = class234.method1684(-2441, this.field4413);
                if (var10.field2745 != null) {
                    var10 = var10.method1230(false);
                }
                if (var10 != null) {
                    class105.method723(this.field4415, 0, this.field4419, 0, this.field4430, 0, var10, this.field4426, this.field4424);
                }
            }
        }
        if (arg6 != -1) {
            this.field4414 = class285.method2000(arg6, 4442);
            this.field4422 = class18.field234 - 1;
            this.field4432 = 0;
            if (this.field4414.field3314 == 0 && arg8 != null && arg8 instanceof class272) {
                class272 var11 = (class272) arg8;
                if (this.field4414 == var11.field4414) {
                    this.field4432 = var11.field4432;
                    this.field4422 = var11.field4422;
                    return;
                }
            }
            if (arg7 && this.field4414.field3306 != -1) {
                this.field4432 = (int) (Math.random() * (double) this.field4414.field3323.length);
                this.field4422 -= (int) (Math.random() * (double) this.field4414.field3331[this.field4432]);
            }
        }
        if (class166.field2625 && arg8 != null) {
            this.method1927(true, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()I", line = 47)
    public final int method125() {
        field4423++;
        return this.field4408;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 58)
    public final void method1922(byte arg0) {
        if (this.field4412 != null) {
            class263.method1855(this.field4412, this.field4402, this.field4435, this.field4421);
        }
        this.field4403 = -1;
        field4428++;
        if (arg0 != -79) {
            field4411 = (class41) null;
        }
        this.field4405 = -1;
        this.field4412 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIIJ)V", line = 77)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4431++;
        class126 var11 = this.method1921((byte) -84);
        if (var11 != null) {
            var11.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4408 = var11.method125();
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 111)
    public static final void method1923(int arg0) {
        if (arg0 == 8) {
            class35.field532.method131(-2);
            field4418++;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIBZII)V", line = 124)
    public static final void method1924(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        field4425++;
        if (class133.field1990 == arg6 && class235.field3766 == arg0 && class5.field58 == arg1 || class75.method553(23987)) {
            return;
        }
        class133.field1990 = arg6;
        class235.field3766 = arg0;
        class5.field58 = arg1;
        if (class75.method553(23987)) {
            class5.field58 = 0;
        }
        if (arg4) {
            class282.method1991(-8, 28);
        } else {
            class282.method1991(-8, 25);
        }
        class305.method2105(true, class217.field3477, -19861);
        int var7 = class55.field809;
        int var8 = class88.field1300;
        class88.field1300 = arg6 * 8 - 48;
        class55.field809 = arg0 * 8 - 48;
        class248.field3958 = class212.method1494(class133.field1990 * 8, class235.field3766 * 8, (byte) -93);
        int var9 = class88.field1300 - var8;
        int var10 = class55.field809 - var7;
        int var11 = class55.field809;
        int var12 = -34 / ((20 - arg3) / 33);
        class278.field4546 = null;
        int var13 = class88.field1300;
        if (arg4) {
            class97.field1419 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class50 var18 = class216.field3471[var17];
                if (var18 != null) {
                    var18.field4311 -= var10 * 128;
                    var18.field4280 -= var9 * 128;
                    if (var18.field4280 >= 0 && var18.field4280 <= 13184 && var18.field4311 >= 0 && var18.field4311 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field4341[var19] -= var9;
                            var18.field4306[var19] -= var10;
                        }
                        class101.field1441[class97.field1419++] = var17;
                    } else {
                        class216.field3471[var17].field758 = null;
                        class216.field3471[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class50 var15 = class216.field3471[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field4341[var16] -= var9;
                        var15.field4306[var16] -= var10;
                    }
                    var15.field4311 -= var10 * 128;
                    var15.field4280 -= var9 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class245 var21 = class246.field3955[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field4341[var22] -= var9;
                    var21.field4306[var22] -= var10;
                }
                var21.field4280 -= var9 * 128;
                var21.field4311 -= var10 * 128;
            }
        }
        class55.field807 = arg1;
        class62.field913.method1756(arg2, arg5, false, -1);
        byte var23 = 104;
        byte var24 = 0;
        byte var25 = 0;
        byte var26 = 1;
        if (var9 < 0) {
            var23 = -1;
            var26 = -1;
            var24 = 103;
        }
        byte var27 = 1;
        byte var28 = 104;
        if (var10 < 0) {
            var27 = -1;
            var28 = -1;
            var25 = 103;
        }
        for (int var29 = var24; var29 != var23; var29 += var26) {
            for (int var30 = var25; var30 != var28; var30 += var27) {
                int var31 = var9 + var29;
                int var32 = var30 + var10;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class81.field1199[var33][var29][var30] = class81.field1199[var33][var31][var32];
                    } else {
                        class81.field1199[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class125 var34 = (class125) class286.field4645.method1495(-312); var34 != null; var34 = (class125) class286.field4645.method1501(82)) {
            var34.field1865 -= var9;
            var34.field1867 -= var10;
            if (var34.field1865 < 0 || var34.field1867 < 0 || var34.field1865 >= 104 || var34.field1867 >= 104) {
                var34.method418(6971);
            }
        }
        if (class124.field1846 != 0) {
            class124.field1846 -= var9;
            class107.field1506 -= var10;
        }
        if (arg4) {
            field4416 -= var10;
            class235.field3779 -= var9 * 128;
            class128.field1903 -= var9;
            class51.field770 -= var9;
            class207.field3353 -= var10;
            class251.field3990 -= var10 * 128;
        } else {
            class28.field416 = 1;
        }
        class41.field620 = 0;
        if (class166.field2625 && arg4 && (Math.abs(var9) > 104 || Math.abs(var10) > 104)) {
            class13.method58(-4);
        }
        class289.field4701 = -1;
        class290.field4703.method1499(-3868);
        class199.field3196.method1499(-3868);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V", line = 370)
    private final void method1925(int arg0, int arg1, int arg2) {
        field4410++;
        if (this.field4414 != null) {
            int var4 = class18.field234 - this.field4422;
            if (var4 > 100 && this.field4414.field3306 > 0) {
                int var5 = this.field4414.field3323.length - this.field4414.field3306;
                while (var5 > this.field4432 && this.field4414.field3331[this.field4432] < var4) {
                    var4 -= this.field4414.field3331[this.field4432];
                    this.field4432++;
                }
                if (this.field4432 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4414.field3323.length; var7++) {
                        var6 += this.field4414.field3331[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (this.field4414.field3331[this.field4432] >= var4) {
                            break label62;
                        }
                        class148.method1026(arg2, this.field4432, arg1, this.field4414, 60, false);
                        var4 -= this.field4414.field3331[this.field4432];
                        this.field4432++;
                    } while (this.field4414.field3323.length > this.field4432);
                    this.field4432 -= this.field4414.field3306;
                } while (this.field4432 >= 0 && this.field4414.field3323.length > this.field4432);
                this.field4414 = null;
            }
            this.field4422 = class18.field234 - var4;
        }
        if (arg0 != 0) {
            field4433 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 448)
    public static void method1926(int arg0) {
        field4433 = null;
        if (arg0 != -1518588095) {
            field4427 = (class65) null;
        }
        field4427 = null;
        field4401 = null;
        field4404 = null;
        field4411 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZB)Lth;", line = 480)
    private final class126 method1927(boolean arg0, byte arg1) {
        boolean var3 = class278.field4548 != class214.field3443;
        field4409++;
        class171 var4 = class234.method1684(-2441, this.field4413);
        if (var4.field2745 != null) {
            var4 = var4.method1230(false);
        }
        if (var4 == null) {
            if (class166.field2625 && !var3) {
                this.method1922((byte) -79);
            }
            return null;
        }
        int var5 = this.field4426 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field2784;
            var6 = var4.field2752;
        } else {
            var6 = var4.field2784;
            var7 = var4.field2752;
        }
        int var8 = (var7 + 1 >> 1) + this.field4415;
        if (arg1 != 26) {
            method1923(55);
        }
        int var9 = (var6 >> 1) + this.field4430;
        int var10 = (var7 >> 1) + this.field4415;
        int var11 = (var6 + 1 >> 1) + this.field4430;
        this.method1925(0, var10 * 128, var9 * 128);
        boolean var12 = !var3 && var4.field2781 && (this.field4405 != var4.field2733 || this.field4432 != this.field4403 && class152.field2419 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class278.field4548[this.field4419];
        int var14 = (this.field4430 << 7) + (var6 << 6);
        int var15 = (this.field4415 << 7) + (var7 << 6);
        int[][] var16 = (int[][]) null;
        int var17 = var13[var8][var9] + var13[var10][var9] + var13[var8][var11] + var13[var10][var11] >> 2;
        if (var3) {
            var16 = class214.field3443[0];
        } else if (this.field4419 < 3) {
            var16 = class278.field4548[this.field4419 + 1];
        }
        if (class166.field2625 && var12) {
            class263.method1855(this.field4412, this.field4402, this.field4435, this.field4421);
        }
        boolean var18 = this.field4412 == null;
        class175 var19;
        if (this.field4414 == null) {
            var19 = var4.method1231(var18 ? class64.field945 : this.field4412, false, this.field4426, var13, var14, var12, arg1 + 3752, var15, var17, var16, this.field4424);
        } else {
            var19 = var4.method1224((byte) -124, var16, var18 ? class64.field945 : this.field4412, var14, var12, this.field4414, this.field4424, this.field4432, this.field4426, var17, var13, var15);
        }
        if (var19 == null) {
            return null;
        }
        if (class166.field2625 && var12) {
            if (var18) {
                class64.field945 = var19.field2840;
            }
            int var20 = 0;
            if (this.field4419 != 0) {
                int[][] var21 = class278.field4548[0];
                var20 = var17 - (var21[var10][var9] + var21[var8][var9] + var21[var8][var11] + var21[var10][var11] >> 2);
            }
            class279 var22 = var19.field2840;
            if (this.field4406 && class263.method1853(var22, var15, var20, var14)) {
                this.field4406 = false;
            }
            if (!this.field4406) {
                class263.method1852(var22, var15, var20, var14);
                this.field4435 = var20;
                this.field4412 = var22;
                this.field4421 = var14;
                if (var18) {
                    class64.field945 = null;
                }
                this.field4402 = var15;
            }
            this.field4405 = var4.field2733;
            this.field4403 = this.field4432;
        }
        return var19.field2846;
    }
}
