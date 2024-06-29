import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class80 extends class175 {

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    private int field1353 = 0;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    private int field1363 = 8;

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "I")
    private int field1365 = 1024;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    private int field1354 = 4;

    @OriginalMember(owner = "client!tg", name = "qb", descriptor = "I")
    private int field1375 = 409;

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "I")
    private int field1367 = 1024;

    @OriginalMember(owner = "client!tg", name = "nb", descriptor = "I")
    private int field1372 = 204;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
    private int field1359 = 81;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "Lmb;")
    private static class96 field1356 = class243.method1708("Unable to find ", (byte) 92);

    @OriginalMember(owner = "client!tg", name = "lb", descriptor = "Lmb;")
    public static class96 field1370 = field1356;

    @OriginalMember(owner = "client!tg", name = "mb", descriptor = "[I")
    public static int[] field1371 = new int[5];

    @OriginalMember(owner = "client!tg", name = "pb", descriptor = "Lmb;")
    public static class96 field1374 = class243.method1708("headicons_pk", (byte) 93);

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "[I")
    public static int[] field1358 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!tg", name = "ob", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "Lgb;")
    public static class74 field1362;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "[I")
    private int[] field1349;

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "[[I")
    private int[][] field1364;

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "[[I")
    private int[][] field1366;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
    public static final void method563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1373;
        int var5 = arg4;
        int var6 = -arg4;
        int var7 = 0;
        int var8 = -1;
        int var9 = class268.method1841(class162.field2884, class9.field145, 0, arg2 + arg4);
        int var10 = class268.method1841(class162.field2884, class9.field145, 0, -arg4 + arg2);
        class36.method283(var10, class229.field3939[arg1], var9, (byte) -108, arg3);
        while (var5 > var7) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                --var5;
                int var12 = -var5 + arg1;
                int var13 = arg1 + var5;
                var6 -= var5 << 1;
                if (~var13 <= ~client.field1994 && ~class9.field149 <= ~var12) {
                    int var14 = class268.method1841(class162.field2884, class9.field145, 0, arg2 + var7);
                    int var15 = class268.method1841(class162.field2884, class9.field145, 0, -var7 + arg2);
                    if (~class9.field149 <= ~var13) {
                        class36.method283(var15, class229.field3939[var13], var14, (byte) -108, arg3);
                    }
                    if (var12 >= client.field1994) {
                        class36.method283(var15, class229.field3939[var12], var14, (byte) -63, arg3);
                    }
                }
            }
            ++var7;
            int var16 = -var7 + arg1;
            int var17 = arg1 + var7;
            if (client.field1994 <= var17 && ~class9.field149 <= ~var16) {
                int var18 = class268.method1841(class162.field2884, class9.field145, 0, arg2 + var5);
                int var19 = class268.method1841(class162.field2884, class9.field145, 0, -var5 + arg2);
                if (~class9.field149 <= ~var17) {
                    class36.method283(var19, class229.field3939[var17], var18, (byte) -108, arg3);
                }
                if (client.field1994 <= var16) {
                    class36.method283(var19, class229.field3939[var16], var18, (byte) -89, arg3);
                }
            }
        }
        int var11 = -3 / ((arg0 - -77) / 36);
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    private final void method564(int arg0) {
        ++field1352;
        Random var2 = new Random((long) this.field1363);
        this.field1366 = new int[this.field1363][this.field1354 - -1];
        this.field1350 = this.field1359 / arg0;
        this.field1364 = new int[this.field1363][this.field1354];
        this.field1368 = 4096 / this.field1354;
        this.field1349 = new int[this.field1363 + 1];
        int var3 = this.field1368 / 2;
        this.field1351 = 4096 / this.field1363;
        this.field1349[0] = 0;
        int var4 = this.field1351 / 2;
        for (int var5 = 0; ~var5 > ~this.field1363; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1351;
                int var7 = (class50.method379(4096, var2, (byte) 26) - 2048) * this.field1372 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1349[var5] = this.field1349[var5 + -1] + var8;
            }
            this.field1366[var5][0] = 0;
            for (int var9 = 0; this.field1354 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1368;
                    int var11 = (-2048 + class50.method379(4096, var2, (byte) 26)) * this.field1375 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1366[var5][var9] = this.field1366[var5][var9 + -1] + var12;
                }
                this.field1364[var5][var9] = ~this.field1365 >= -1 ? 4096 : 4096 - class50.method379(this.field1365, var2, (byte) 26);
            }
            this.field1366[var5][this.field1354] = 4096;
        }
        this.field1349[this.field1363] = 4096;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field1369;
        int var3 = -72 / ((62 - arg0) / 54);
        int[] var4 = super.field3044.method904((byte) 97, arg1);
        if (super.field3044.field2150) {
            int var5 = 0;
            int var6;
            for (var6 = class23.field395[arg1] + this.field1353; ~var6 > -1; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (~var5 > ~this.field1363 && var6 >= this.field1349[var5]) {
                ++var5;
            }
            boolean var7 = (1 & var5) == 0;
            int var8 = var5 + -1;
            int var9 = this.field1349[var5];
            int var10 = this.field1349[var5 - 1];
            if (~var6 < ~(this.field1350 + var10) && var6 < -this.field1350 + var9) {
                for (int var11 = 0; class1.field11 > var11; ++var11) {
                    int var12 = !var7 ? -this.field1367 : this.field1367;
                    int var13;
                    for (var13 = (this.field1368 * var12 >> 12) + class244.field4240[var11]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    int var14;
                    for (var14 = 0; ~this.field1354 < ~var14 && var13 >= this.field1366[var8][var14]; ++var14) {
                    }
                    int var15 = var14 + -1;
                    int var16 = this.field1366[var8][var15];
                    int var17 = this.field1366[var8][var14];
                    if (~var13 < ~(this.field1350 + var16) && var13 < -this.field1350 + var17) {
                        var4[var11] = this.field1364[var8][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class102.method771(var4, 0, class1.field11, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = -117 / ((-22 - arg0) / 58);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 == 7) {
                                        this.field1365 = arg2.method1663((byte) 98);
                                    }
                                } else {
                                    this.field1359 = arg2.method1663((byte) 62);
                                }
                            } else {
                                this.field1353 = arg2.method1663((byte) 118);
                            }
                        } else {
                            this.field1367 = arg2.method1663((byte) 71);
                        }
                    } else {
                        this.field1372 = arg2.method1663((byte) -93);
                    }
                } else {
                    this.field1375 = arg2.method1663((byte) -72);
                }
            } else {
                this.field1363 = arg2.method1651(4139);
            }
        } else {
            this.field1354 = arg2.method1651(4139);
        }
        ++field1361;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(III)Lsa;")
    public static final class70 method565(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field3282; ++var4) {
                class70 var5 = var3.field3274[var4];
                if ((var5.field1197 >> 29 & 3L) == 2L && var5.field1208 == arg1 && var5.field1204 == arg2) {
                    class62.method444(var5);
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field1357;
        this.method564(arg0);
        if (arg0 != 2) {
            field1374 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)V")
    public static final void method566(boolean arg0, int arg1) {
        for (class38 var2 = (class38) class217.field3726.method1811(2); var2 != null; var2 = (class38) class217.field3726.method1810(false)) {
            if (var2.field671 != null) {
                class120.field2228.method1550(var2.field671);
                var2.field671 = null;
            }
            if (var2.field667 != null) {
                class120.field2228.method1550(var2.field667);
                var2.field667 = null;
            }
            var2.method1743((byte) 124);
        }
        if (arg1 != -23254) {
            field1358 = null;
        }
        ++field1348;
        if (arg0) {
            for (class38 var3 = (class38) class248.field4296.method1811(2); var3 != null; var3 = (class38) class248.field4296.method1810(false)) {
                if (var3.field671 != null) {
                    class120.field2228.method1550(var3.field671);
                    var3.field671 = null;
                }
                var3.method1743((byte) 127);
            }
            for (class38 var4 = (class38) class260.field4525.method1074(false); var4 != null; var4 = (class38) class260.field4525.method1087((byte) -113)) {
                if (var4.field671 != null) {
                    class120.field2228.method1550(var4.field671);
                    var4.field671 = null;
                }
                var4.method1743((byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class80() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(B)V")
    public static void method567(byte arg0) {
        field1362 = null;
        field1370 = null;
        if (arg0 <= -14) {
            field1371 = null;
            field1356 = null;
            field1358 = null;
            field1374 = null;
        }
    }
}
