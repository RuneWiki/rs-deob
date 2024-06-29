import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class254 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public int field4424 = -1;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public int field4430 = -1;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public int field4436 = -1;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Z")
    public boolean field4423 = false;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field4428 = 5;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Z")
    private boolean field4441 = false;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public int field4444 = 2;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public int field4433 = -1;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public int field4425 = 99;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public int field4438 = -1;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lsc;")
    public static class181 field4432 = class149.method967(255, "Mem:");

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field4437 = 0;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Lhd;")
    public static class214 field4435 = new class214(32);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Z")
    public static boolean field4445 = true;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Lvf;")
    public static class230 field4447 = new class230(8);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "Lsc;")
    private static class181 field4454 = class149.method967(255, "Allocating memory");

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lsc;")
    public static class181 field4455 = field4454;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "Ldg;")
    public static class90 field4453;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
    public int[] field4431;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "[I")
    public static int[] field4443;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "[I")
    private int[] field4450;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "[I")
    private int[] field4452;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "[I")
    public int[] field4456;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "[Z")
    public static boolean[] field4448;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "[[I")
    public int[][] field4434;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLsc;)V")
    public static final void method1726(boolean arg0, class181 arg1) {
        class16.method142((byte) -52);
        field4422++;
        class92.method610(arg1, (byte) 100);
        if (!arg0) {
            field4455 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method1727(boolean arg0) {
        field4447 = null;
        field4448 = null;
        field4454 = null;
        field4453 = null;
        field4435 = null;
        field4432 = null;
        field4443 = null;
        if (arg0) {
            field4455 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILqa;ILnb;)Lnb;")
    public final class249 method1728(int arg0, int arg1, class254 arg2, int arg3, class249 arg4) {
        int var6 = this.field4431[arg0];
        field4440++;
        class32 var7 = class207.method1378(50, var6 >> 16);
        if (arg3 != 25303) {
            return null;
        }
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method1730(arg4, arg1, -127);
        }
        int var9 = arg2.field4431[arg1];
        class32 var10 = class207.method1378(28, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class249 var12 = arg4.method1592(!var7.method254(arg3 - 14305, var8), !this.field4441);
            var12.method1593(var7, var8, this.field4441);
            return var12;
        } else {
            class249 var13 = arg4.method1592(!var7.method254(arg3 - 14305, var8) & !var10.method254(arg3 ^ 0x4821, var11), !this.field4441 & !arg2.field4441);
            var13.method1570(var7, var8, var10, var11, this.field4450, this.field4441 | arg2.field4441);
            return var13;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lnb;II)Lnb;")
    public final class249 method1729(class249 arg0, int arg1, int arg2) {
        field4442++;
        int var4 = this.field4431[arg2];
        if (arg1 != 1908) {
            this.field4444 = 57;
        }
        class32 var5 = class207.method1378(-93, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1581(true, true);
        } else {
            class249 var7 = arg0.method1581(!var5.method254(10998, var6), !this.field4441);
            var7.method1593(var5, var6, this.field4441);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lnb;II)Lnb;")
    public final class249 method1730(class249 arg0, int arg1, int arg2) {
        field4427++;
        int var4 = this.field4431[arg1];
        class32 var5 = class207.method1378(-125, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        int var7 = -125 % ((arg2 + 38) / 60);
        if (var5 == null) {
            return arg0.method1592(true, true);
        } else {
            class249 var8 = arg0.method1592(!var5.method254(10998, var6), !this.field4441);
            var8.method1593(var5, var6, this.field4441);
            return var8;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lvf;I)V")
    public final void method1731(class230 arg0, int arg1) {
        if (arg1 >= -102) {
            field4443 = null;
        }
        field4446++;
        while (true) {
            int var3 = arg0.method1516((byte) 82);
            if (var3 == 0) {
                return;
            }
            this.method1732((byte) -127, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BILvf;)V")
    private final void method1732(byte arg0, int arg1, class230 arg2) {
        if (arg1 == 1) {
            int var4 = arg2.method1535(2);
            this.field4456 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4456[var5] = arg2.method1535(2);
            }
            this.field4431 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4431[var6] = arg2.method1535(2);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4431[var7] += arg2.method1535(2) << 16;
            }
        } else if (arg1 == 2) {
            this.field4424 = arg2.method1535(2);
        } else if (arg1 == 3) {
            int var8 = arg2.method1516((byte) 82);
            this.field4450 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4450[var9] = arg2.method1516((byte) 82);
            }
            this.field4450[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field4423 = true;
        } else if (arg1 == 5) {
            this.field4428 = arg2.method1516((byte) 82);
        } else if (arg1 == 6) {
            this.field4438 = arg2.method1535(2);
        } else if (arg1 == 7) {
            this.field4430 = arg2.method1535(2);
        } else if (arg1 == 8) {
            this.field4425 = arg2.method1516((byte) 82);
        } else if (arg1 == 9) {
            this.field4433 = arg2.method1516((byte) 82);
        } else if (arg1 == 10) {
            this.field4436 = arg2.method1516((byte) 82);
        } else if (arg1 == 11) {
            this.field4444 = arg2.method1516((byte) 82);
        } else if (arg1 == 12) {
            int var10 = arg2.method1516((byte) 82);
            this.field4452 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field4452[var11] = arg2.method1535(2);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field4452[var12] = (arg2.method1535(2) << 16) + this.field4452[var12];
            }
        } else if (arg1 == 13) {
            int var13 = arg2.method1535(2);
            this.field4434 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg2.method1516((byte) 82);
                if (var15 > 0) {
                    this.field4434[var14] = new int[var15];
                    this.field4434[var14][0] = arg2.method1508(true);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field4434[var14][var16] = arg2.method1535(2);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4441 = true;
        }
        int var17 = -100 / ((-arg0 - 67) / 58);
        field4429++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILnb;II)Lnb;")
    public final class249 method1733(int arg0, class249 arg1, int arg2, int arg3) {
        int var5 = this.field4431[arg2];
        class32 var6 = class207.method1378(-94, var5 >> 16);
        field4426++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method1592(true, true);
        }
        int var8 = arg0 & arg3;
        class249 var9 = arg1.method1592(!var6.method254(10998, var7), !this.field4441);
        if (var8 == 1) {
            var9.method1595();
        } else if (var8 == 2) {
            var9.method1585();
        } else if (var8 == 3) {
            var9.method1577();
        }
        var9.method1593(var6, var7, this.field4441);
        if (var8 == 1) {
            var9.method1577();
        } else if (var8 == 2) {
            var9.method1585();
        } else if (var8 == 3) {
            var9.method1595();
        }
        return var9;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILnb;I)Lnb;")
    public final class249 method1734(int arg0, class249 arg1, int arg2) {
        field4449++;
        int var4 = this.field4431[arg0];
        class32 var5 = class207.method1378(-100, var4 >> 16);
        int var6 = 124 % ((arg2 - 45) / 39);
        int var7 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1592(true, true);
        }
        class32 var8 = null;
        int var9 = 0;
        if (this.field4452 != null && arg0 < this.field4452.length) {
            int var10 = this.field4452[arg0];
            var8 = class207.method1378(-9, var10 >> 16);
            var9 = var10 & 0xFFFF;
        }
        if (var8 == null || var9 == 65535) {
            class249 var12 = arg1.method1592(!var5.method254(10998, var7), !this.field4441);
            var12.method1593(var5, var7, this.field4441);
            return var12;
        } else {
            class249 var11 = arg1.method1592(!var5.method254(10998, var7) & !var8.method254(10998, var9), !this.field4441);
            var11.method1593(var5, var7, this.field4441);
            var11.method1593(var8, var9, this.field4441);
            return var11;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public final void method1735(int arg0) {
        field4439++;
        if (this.field4433 == -1) {
            if (this.field4450 == null) {
                this.field4433 = 0;
            } else {
                this.field4433 = 2;
            }
        }
        if (~this.field4436 != arg0) {
            return;
        }
        if (this.field4450 == null) {
            this.field4436 = 0;
        } else {
            this.field4436 = 2;
        }
    }
}
