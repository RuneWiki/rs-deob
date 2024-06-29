import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class95 extends class114 {

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lie;")
    private class2 field1483 = null;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
    private boolean field1481 = true;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    private int field1482 = -1;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    private int field1489 = 0;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    private int field1488 = -1;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    private int field1495 = 0;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    private int field1499 = -32768;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    private int field1515 = 0;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Lgi;")
    private class294 field1494;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Lsi;")
    public static class237 field1496 = new class237(32);

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "Lce;")
    private static class126 field1511 = class206.method1445(-7923, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "Lce;")
    public static class126 field1507 = class206.method1445(-7923, "Chargement des polices )2 ");

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Lce;")
    public static class126 field1508 = field1511;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lce;")
    private static class126 field1509 = class206.method1445(-7923, "Continue");

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "Lce;")
    public static class126 field1512 = class206.method1445(-7923, "Polices charg-Bes");

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field1503 = 0;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static volatile int field1516 = 0;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Lce;")
    public static class126 field1514 = field1509;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "Lce;")
    public static class126 field1518 = class206.method1445(-7923, "Fichiers config charg-Bs");

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "Lqj;")
    private class211 field1506;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Lcc;")
    public static class313 field1501;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "[Lce;")
    public static class126[] field1505;

    @OriginalMember(owner = "client!lf", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() {
        field1497++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V", line = 25)
    private final void method648(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        field1490++;
        if (this.field1494 == null) {
            return;
        }
        int var4 = class249.field4174 - this.field1517;
        if (var4 > 100 && this.field1494.field4896 > 0) {
            int var5 = this.field1494.field4890.length - this.field1494.field4896;
            while (var5 > this.field1487 && var4 > this.field1494.field4905[this.field1487]) {
                var4 -= this.field1494.field4905[this.field1487];
                this.field1487++;
            }
            if (var5 <= this.field1487) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field1494.field4890.length; var7++) {
                    var6 += this.field1494.field4905[var7];
                }
                var4 %= var6;
            }
        }
        label61: {
            do {
                do {
                    if (var4 <= this.field1494.field4905[this.field1487]) {
                        break label61;
                    }
                    class241.method1660(this.field1487, arg0, false, arg1, this.field1494, (byte) -97);
                    var4 -= this.field1494.field4905[this.field1487];
                    this.field1487++;
                } while (this.field1487 < this.field1494.field4890.length);
                this.field1487 -= this.field1494.field4896;
            } while (this.field1487 >= 0 && this.field1494.field4890.length > this.field1487);
            this.field1494 = null;
        }
        this.field1517 = class249.field4174 - var4;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIIZLja;)V", line = 527)
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class114 arg8) {
        this.field1498 = arg3;
        this.field1504 = arg0;
        this.field1480 = arg4;
        this.field1492 = arg1;
        this.field1493 = arg2;
        this.field1486 = arg5;
        if (class56.field846 && arg8 != null) {
            if (arg8 instanceof class95) {
                ((class95) arg8).method654(false);
            } else {
                class265 var10 = class185.method1338(this.field1504, -7153);
                if (var10.field4435 != null) {
                    var10 = var10.method1788(-1);
                }
                if (var10 != null) {
                    class287.method1908(0, this.field1493, this.field1486, 0, 3, var10, this.field1480, this.field1492, this.field1498);
                }
            }
        }
        if (arg6 != -1) {
            this.field1494 = class110.method721(-125, arg6);
            this.field1487 = 0;
            this.field1517 = class249.field4174 - 1;
            if (this.field1494.field4884 == 0 && arg8 != null && arg8 instanceof class95) {
                class95 var11 = (class95) arg8;
                if (this.field1494 == var11.field1494) {
                    this.field1487 = var11.field1487;
                    this.field1517 = var11.field1517;
                    return;
                }
            }
            if (arg7 && this.field1494.field4896 != -1) {
                this.field1487 = (int) (Math.random() * (double) this.field1494.field4890.length);
                this.field1517 -= (int) (Math.random() * (double) this.field1494.field4905[this.field1487]);
            }
        }
        if (class56.field846 && arg8 != null) {
            this.method652(true, (byte) 21);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V", line = 109)
    public static final void method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 13 / ((-arg5 - 70) / 56);
        field1500++;
        int var7 = 0;
        int var8 = arg1;
        int var9 = arg0 * arg0;
        int var10 = arg1 * arg1;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg1 << 1;
        int var14 = (1 - var13) * var9 + var11;
        int var15 = var9 << 2;
        int var16 = var10 - (var13 - 1) * var12;
        int var17 = var10 << 2;
        int var18 = ((arg1 << 1) - 3) * var12;
        int var19 = (var7 + 1) * var17;
        if (arg4 >= class197.field3372 && arg4 <= class194.field3302) {
            int var20 = class94.method645(class321.field5489, 0, arg0 + arg2, class52.field795);
            int var21 = class94.method645(class321.field5489, 0, arg2 - arg0, class52.field795);
            class94.method647(class314.field5393[arg4], var21, -7, var20, arg3);
        }
        int var22 = (arg1 - 1) * var15;
        int var23 = ((var7 << 1) + 3) * var11;
        while (var8 > 0) {
            var8--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var23;
                    var16 += var19;
                    var23 += var17;
                    var7++;
                    var19 += var17;
                }
            }
            int var24 = arg4 - var8;
            if (var16 < 0) {
                var14 += var23;
                var16 += var19;
                var19 += var17;
                var23 += var17;
                var7++;
            }
            var14 += -var22;
            var22 -= var15;
            int var25 = arg4 + var8;
            var16 += -var18;
            if (class197.field3372 <= var25 && class194.field3302 >= var24) {
                int var26 = class94.method645(class321.field5489, 0, arg2 + var7, class52.field795);
                int var27 = class94.method645(class321.field5489, 0, arg2 - var7, class52.field795);
                if (var24 >= class197.field3372) {
                    class94.method647(class314.field5393[var24], var27, -7, var26, arg3);
                }
                if (class194.field3302 >= var25) {
                    class94.method647(class314.field5393[var25], var27, -7, var26, arg3);
                }
            }
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Lja;", line = 209)
    private final class114 method650(byte arg0) {
        if (arg0 <= 65) {
            return (class114) null;
        } else {
            field1484++;
            return this.method652(false, (byte) 21);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V", line = 225)
    public final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class56.field846) {
            this.method652(true, (byte) 21);
        } else {
            this.method648(arg3, arg4, false);
        }
        field1502++;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()I", line = 245)
    public final int method225() {
        field1513++;
        return this.field1499;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIIJILqj;)V", line = 261)
    public final void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class211 arg10) {
        field1485++;
        class114 var13 = this.method650((byte) 91);
        if (var13 != null) {
            var13.method241(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1506);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V", line = 306)
    public static void method651(boolean arg0) {
        if (!arg0) {
            method649(73, 5, 68, -16, -1, 60);
        }
        field1509 = null;
        field1501 = null;
        field1496 = null;
        field1511 = null;
        field1508 = null;
        field1512 = null;
        field1505 = null;
        field1518 = null;
        field1507 = null;
        field1514 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZB)Lja;", line = 351)
    private final class114 method652(boolean arg0, byte arg1) {
        field1491++;
        boolean var3 = class320.field5486 != class264.field4396;
        class265 var4 = class185.method1338(this.field1504, arg1 - 7174);
        if (var4.field4435 != null) {
            var4 = var4.method1788(-1);
        }
        if (var4 == null) {
            if (class56.field846 && !var3) {
                this.method654(false);
            }
            return null;
        }
        int var5 = this.field1493 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field4474;
            var7 = var4.field4452;
        } else {
            var6 = var4.field4452;
            var7 = var4.field4474;
        }
        int var8 = this.field1480 + (var7 + 1 >> 1);
        int var9 = this.field1480 + (var7 >> 1);
        if (arg1 != 21) {
            return (class114) null;
        }
        int var10 = (var6 + 1 >> 1) + this.field1486;
        int var11 = (var6 >> 1) + this.field1486;
        this.method648(var9 * 128, var11 * 128, false);
        boolean var12 = !var3 && var4.field4487 && (this.field1488 != var4.field4481 || this.field1487 != this.field1482 && class55.field836 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class264.field4396[this.field1498];
        int var14 = var13[var9][var11] + var13[var8][var10] + var13[var8][var11] + var13[var9][var10] >> 2;
        int var15 = (this.field1480 << 7) + (var7 << 6);
        int var16 = (this.field1486 << 7) + (var6 << 6);
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class320.field5486[0];
        } else if (this.field1498 < 3) {
            var17 = class264.field4396[this.field1498 + 1];
        }
        if (class56.field846 && var12) {
            class66.method491(this.field1483, this.field1489, this.field1515, this.field1495);
        }
        boolean var18 = this.field1483 == null;
        class21 var19;
        if (this.field1494 == null) {
            var19 = var4.method1785(this.field1493, var14, false, var15, 91, var13, this.field1492, var17, var16, var12, var18 ? class181.field3157 : this.field1483);
        } else {
            var19 = var4.method1778(var13, var17, this.field1493, var18 ? class181.field3157 : this.field1483, this.field1487, var16, this.field1492, var12, var14, this.field1494, var15, false);
        }
        if (var19 == null) {
            return null;
        }
        if (class56.field846 && var12) {
            if (var18) {
                class181.field3157 = var19.field279;
            }
            int var20 = 0;
            if (this.field1498 != 0) {
                int[][] var21 = class264.field4396[0];
                var20 = var14 - (var21[var8][var11] + var21[var8][var10] + var21[var9][var10] + var21[var9][var11] >> 2);
            }
            class2 var22 = var19.field279;
            if (this.field1481 && class66.method479(var22, var15, var20, var16)) {
                this.field1481 = false;
            }
            if (!this.field1481) {
                class66.method475(var22, var15, var20, var16);
                this.field1489 = var15;
                if (var18) {
                    class181.field3157 = null;
                }
                this.field1483 = var22;
                this.field1515 = var20;
                this.field1495 = var16;
            }
            this.field1482 = this.field1487;
            this.field1488 = var4.field4481;
        }
        return var19.field283;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIBII)V", line = 482)
    public static final void method653(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var8 = arg1 + 1;
        class94.method647(class314.field5393[arg1], arg0, -7, arg5, arg4);
        int var9 = arg2 - 1;
        class94.method647(class314.field5393[arg2], arg0, -7, arg5, arg4);
        field1519++;
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class314.field5393[var6];
            var7[arg0] = var7[arg5] = arg4;
        }
        if (arg3 != -94) {
            method653(92, -22, -65, (byte) -89, 7, -117);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V", line = 509)
    public final void method654(boolean arg0) {
        if (this.field1483 != null) {
            class66.method491(this.field1483, this.field1489, this.field1515, this.field1495);
        }
        if (!arg0) {
            this.field1483 = null;
            field1510++;
            this.field1488 = -1;
            this.field1482 = -1;
        }
    }
}
