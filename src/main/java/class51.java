import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SNQOEFQG")
public class class51 {

    @OriginalMember(owner = "SNQOEFQG", name = "a", descriptor = "I")
    private int field1322 = 8;

    @OriginalMember(owner = "SNQOEFQG", name = "j", descriptor = "[I")
    private int[] field1331 = new int[5];

    @OriginalMember(owner = "SNQOEFQG", name = "k", descriptor = "[I")
    private int[] field1332 = new int[5];

    @OriginalMember(owner = "SNQOEFQG", name = "l", descriptor = "[I")
    private int[] field1333 = new int[5];

    @OriginalMember(owner = "SNQOEFQG", name = "n", descriptor = "I")
    private int field1335 = 100;

    @OriginalMember(owner = "SNQOEFQG", name = "q", descriptor = "I")
    public int field1338 = 500;

    @OriginalMember(owner = "SNQOEFQG", name = "v", descriptor = "[I")
    private static int[] field1343 = new int[5];

    @OriginalMember(owner = "SNQOEFQG", name = "w", descriptor = "[I")
    private static int[] field1344 = new int[5];

    @OriginalMember(owner = "SNQOEFQG", name = "x", descriptor = "[I")
    private static int[] field1345 = new int[5];

    @OriginalMember(owner = "SNQOEFQG", name = "y", descriptor = "[I")
    private static int[] field1346 = new int[5];

    @OriginalMember(owner = "SNQOEFQG", name = "z", descriptor = "[I")
    private static int[] field1347 = new int[5];

    @OriginalMember(owner = "SNQOEFQG", name = "m", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "SNQOEFQG", name = "r", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "SNQOEFQG", name = "o", descriptor = "LADELCBNY;")
    private class1 field1336;

    @OriginalMember(owner = "SNQOEFQG", name = "b", descriptor = "LTDXKKGZV;")
    private class54 field1323;

    @OriginalMember(owner = "SNQOEFQG", name = "c", descriptor = "LTDXKKGZV;")
    private class54 field1324;

    @OriginalMember(owner = "SNQOEFQG", name = "d", descriptor = "LTDXKKGZV;")
    private class54 field1325;

    @OriginalMember(owner = "SNQOEFQG", name = "e", descriptor = "LTDXKKGZV;")
    private class54 field1326;

    @OriginalMember(owner = "SNQOEFQG", name = "f", descriptor = "LTDXKKGZV;")
    private class54 field1327;

    @OriginalMember(owner = "SNQOEFQG", name = "g", descriptor = "LTDXKKGZV;")
    private class54 field1328;

    @OriginalMember(owner = "SNQOEFQG", name = "h", descriptor = "LTDXKKGZV;")
    private class54 field1329;

    @OriginalMember(owner = "SNQOEFQG", name = "i", descriptor = "LTDXKKGZV;")
    private class54 field1330;

    @OriginalMember(owner = "SNQOEFQG", name = "p", descriptor = "LTDXKKGZV;")
    private class54 field1337;

    @OriginalMember(owner = "SNQOEFQG", name = "s", descriptor = "[I")
    private static int[] field1340;

    @OriginalMember(owner = "SNQOEFQG", name = "t", descriptor = "[I")
    private static int[] field1341;

    @OriginalMember(owner = "SNQOEFQG", name = "u", descriptor = "[I")
    private static int[] field1342;

    @OriginalMember(owner = "SNQOEFQG", name = "a", descriptor = "()V")
    public static final void method458() {
        field1341 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1341[var0] = 1;
            } else {
                field1341[var0] = -1;
            }
        }
        field1342 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1342[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1340 = new int[220500];
    }

    @OriginalMember(owner = "SNQOEFQG", name = "a", descriptor = "(II)[I")
    public final int[] method459(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1340[var3] = 0;
        }
        if (arg1 < 10) {
            return field1340;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1323.method487(4);
        this.field1324.method487(4);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1325 != null) {
            this.field1325.method487(4);
            this.field1326.method487(4);
            var6 = (int) ((double) (this.field1325.field1418 - this.field1325.field1417) * 32.768D / var4);
            var7 = (int) ((double) this.field1325.field1417 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1327 != null) {
            this.field1327.method487(4);
            this.field1328.method487(4);
            var9 = (int) ((double) (this.field1327.field1418 - this.field1327.field1417) * 32.768D / var4);
            var10 = (int) ((double) this.field1327.field1417 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1331[var12] != 0) {
                field1343[var12] = 0;
                field1344[var12] = (int) ((double) this.field1333[var12] * var4);
                field1345[var12] = (this.field1331[var12] << 14) / 100;
                field1346[var12] = (int) ((double) (this.field1323.field1418 - this.field1323.field1417) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1332[var12]) / var4);
                field1347[var12] = (int) ((double) this.field1323.field1417 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1323.method488(arg0, -344);
            int var42 = this.field1324.method488(arg0, -344);
            if (this.field1325 != null) {
                int var43 = this.field1325.method488(arg0, -344);
                int var44 = this.field1326.method488(arg0, -344);
                var41 += this.method460(6, var44, this.field1325.field1419, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1327 != null) {
                int var45 = this.field1327.method488(arg0, -344);
                int var46 = this.field1328.method488(arg0, -344);
                var42 = var42 * ((this.method460(6, var46, this.field1327.field1419, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1331[var47] != 0) {
                    int var48 = field1344[var47] + var13;
                    if (var48 < arg0) {
                        field1340[var48] += this.method460(6, field1345[var47] * var42 >> 15, this.field1323.field1419, field1343[var47]);
                        field1343[var47] += (field1346[var47] * var41 >> 16) + field1347[var47];
                    }
                }
            }
        }
        if (this.field1329 != null) {
            this.field1329.method487(4);
            this.field1330.method487(4);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1329.method488(arg0, -344);
                int var19 = this.field1330.method488(arg0, -344);
                int var20;
                if (var16) {
                    var20 = ((this.field1329.field1418 - this.field1329.field1417) * var18 >> 8) + this.field1329.field1417;
                } else {
                    var20 = ((this.field1329.field1418 - this.field1329.field1417) * var19 >> 8) + this.field1329.field1417;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1340[var17] = 0;
                }
            }
        }
        if (this.field1334 > 0 && this.field1335 > 0) {
            int var21 = (int) ((double) this.field1334 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1340[var22] += field1340[var22 - var21] * this.field1335 / 100;
            }
        }
        if (this.field1336.field2[0] > 0 || this.field1336.field2[1] > 0) {
            this.field1337.method487(4);
            int var23 = this.field1337.method488(arg0 + 1, -344);
            int var24 = this.field1336.method4(0, (byte) 86, (float) var23 / 65536.0F);
            int var25 = this.field1336.method4(1, (byte) 86, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1340[var24 + var26] * (long) class1.field9 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1340[var24 + var26 - var38 - 1] * (long) class1.field7[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1340[var26 - var39 - 1] * (long) class1.field7[1][var39] >> 16);
                    }
                    field1340[var26] = var37;
                    var23 = this.field1337.method488(arg0 + 1, -344);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1340[var24 + var26] * (long) class1.field9 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1340[var24 + var26 - var35 - 1] * (long) class1.field7[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1340[var26 - var36 - 1] * (long) class1.field7[1][var36] >> 16);
                        }
                        field1340[var26] = var34;
                        var23 = this.field1337.method488(arg0 + 1, -344);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1340[var24 + var26 - var31 - 1] * (long) class1.field7[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1340[var26 - var32 - 1] * (long) class1.field7[1][var32] >> 16);
                            }
                            field1340[var26] = var30;
                            this.field1337.method488(arg0 + 1, -344);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1336.method4(0, (byte) 86, (float) var23 / 65536.0F);
                    var25 = this.field1336.method4(1, (byte) 86, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1340[var40] < -32768) {
                field1340[var40] = -32768;
            }
            if (field1340[var40] > 32767) {
                field1340[var40] = 32767;
            }
        }
        return field1340;
    }

    @OriginalMember(owner = "SNQOEFQG", name = "a", descriptor = "(IIII)I")
    private final int method460(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1342[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1341[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "SNQOEFQG", name = "a", descriptor = "(ILIMUIZRAF;)V")
    public final void method461(int arg0, class24 arg1) {
        this.field1323 = new class54();
        this.field1323.method485(this.field1322, arg1);
        this.field1324 = new class54();
        this.field1324.method485(this.field1322, arg1);
        int var3 = arg1.method238();
        if (var3 != 0) {
            arg1.field832--;
            this.field1325 = new class54();
            this.field1325.method485(this.field1322, arg1);
            this.field1326 = new class54();
            this.field1326.method485(this.field1322, arg1);
        }
        int var4 = arg1.method238();
        if (var4 != 0) {
            arg1.field832--;
            this.field1327 = new class54();
            this.field1327.method485(this.field1322, arg1);
            this.field1328 = new class54();
            this.field1328.method485(this.field1322, arg1);
        }
        int var5 = arg1.method238();
        if (var5 != 0) {
            arg1.field832--;
            this.field1329 = new class54();
            this.field1329.method485(this.field1322, arg1);
            this.field1330 = new class54();
            this.field1330.method485(this.field1322, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method252();
            if (var7 == 0) {
                break;
            }
            this.field1331[var6] = var7;
            this.field1332[var6] = arg1.method251();
            this.field1333[var6] = arg1.method252();
        }
        this.field1334 = arg1.method252();
        this.field1335 = arg1.method252();
        this.field1338 = arg1.method240();
        if (arg0 != 8) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        this.field1339 = arg1.method240();
        this.field1336 = new class1();
        this.field1337 = new class54();
        this.field1336.method5(arg1, this.field1337, 0);
    }
}
