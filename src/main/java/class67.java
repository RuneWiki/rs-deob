import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class67 extends class166 {

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public int field1331 = 0;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public int field1324 = 0;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "B")
    public byte field1339 = 0;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "Z")
    private boolean field1350 = false;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "[I")
    public int[] field1352;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "[I")
    public int[] field1321;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "[I")
    public int[] field1318;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "[I")
    private int[] field1315;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "[I")
    public int[] field1342;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "[I")
    public int[] field1319;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "[I")
    public int[] field1347;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[B")
    public byte[] field1316;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "[B")
    public byte[] field1346;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "[B")
    public byte[] field1351;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "[S")
    public short[] field1330;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "[S")
    public short[] field1323;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "[B")
    public byte[] field1313;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "[I")
    private int[] field1317;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "[B")
    public byte[] field1338;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "[S")
    public short[] field1325;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "[S")
    public short[] field1355;

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "[S")
    public short[] field1357;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "[S")
    private short[] field1326;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "[S")
    private short[] field1343;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "[S")
    private short[] field1344;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "[B")
    private byte[] field1333;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "[B")
    private byte[] field1328;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "[B")
    private byte[] field1327;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "[B")
    private byte[] field1311;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "[B")
    private byte[] field1340;

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "[[I")
    public int[][] field1334;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "[[I")
    public int[][] field1341;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "[Lsa;")
    public class175[] field1349;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "[Lc;")
    public class75[] field1312;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "[Lsa;")
    public class175[] field1329;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "S")
    public short field1353;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "S")
    public short field1348;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "[I")
    private static int[] field1314 = class101.field1871;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "[I")
    private static int[] field1336 = class101.field1872;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "[I")
    private static int[] field1332 = new int[10000];

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    private static int field1337 = 0;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "[I")
    private static int[] field1356 = new int[10000];

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "S")
    private short field1310;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "S")
    private short field1320;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "S")
    private short field1322;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "S")
    private short field1335;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "S")
    private short field1345;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "S")
    private short field1354;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(SS)V")
    public final void method487(short arg0, short arg1) {
        if (this.field1323 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1324; var3++) {
            if (this.field1323[var3] == arg0) {
                this.field1323[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V")
    public final void method488() {
        for (int var1 = 0; var1 < this.field1331; var1++) {
            this.field1352[var1] = -this.field1352[var1];
            this.field1318[var1] = -this.field1318[var1];
        }
        this.method494();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(SS)V")
    public final void method489(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1324; var3++) {
            if (this.field1330[var3] == arg0) {
                this.field1330[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public final void method490(int arg0) {
        int var2 = field1336[arg0];
        int var3 = field1314[arg0];
        for (int var4 = 0; var4 < this.field1331; var4++) {
            int var5 = this.field1352[var4] * var3 + this.field1318[var4] * var2 >> 16;
            this.field1318[var4] = this.field1318[var4] * var3 - this.field1352[var4] * var2 >> 16;
            this.field1352[var4] = var5;
        }
        this.method494();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V")
    public final void method491(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1331; var4++) {
            this.field1352[var4] += arg0;
            this.field1321[var4] += arg1;
            this.field1318[var4] += arg2;
        }
        this.method494();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([B)V")
    private final void method492(byte[] arg0) {
        class152 var2 = new class152(arg0);
        class152 var3 = new class152(arg0);
        class152 var4 = new class152(arg0);
        class152 var5 = new class152(arg0);
        class152 var6 = new class152(arg0);
        class152 var7 = new class152(arg0);
        class152 var8 = new class152(arg0);
        var2.field2677 = arg0.length - 23;
        int var9 = var2.method1063(-17162);
        int var10 = var2.method1063(-17162);
        int var11 = var2.method1051((byte) 96);
        int var12 = var2.method1051((byte) 110);
        int var13 = var2.method1051((byte) 119);
        int var14 = var2.method1051((byte) 120);
        int var15 = var2.method1051((byte) -76);
        int var16 = var2.method1051((byte) -98);
        int var17 = var2.method1051((byte) 108);
        int var18 = var2.method1063(-17162);
        int var19 = var2.method1063(-17162);
        int var20 = var2.method1063(-17162);
        int var21 = var2.method1063(-17162);
        int var22 = var2.method1063(-17162);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1338 = new byte[var11];
            var2.field2677 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1338[var26] = var2.method1060((byte) -58);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field1331 = var9;
        this.field1324 = var10;
        this.field1358 = var11;
        this.field1352 = new int[var9];
        this.field1321 = new int[var9];
        this.field1318 = new int[var9];
        this.field1342 = new int[var10];
        this.field1319 = new int[var10];
        this.field1347 = new int[var10];
        if (var17 == 1) {
            this.field1315 = new int[var9];
        }
        if (var12 == 1) {
            this.field1316 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1346 = new byte[var10];
        } else {
            this.field1339 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1351 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1317 = new int[var10];
        }
        if (var16 == 1) {
            this.field1323 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1313 = new byte[var10];
        }
        this.field1330 = new short[var10];
        if (var11 > 0) {
            this.field1325 = new short[var11];
            this.field1355 = new short[var11];
            this.field1357 = new short[var11];
            if (var24 > 0) {
                this.field1326 = new short[var24];
                this.field1343 = new short[var24];
                this.field1344 = new short[var24];
                this.field1333 = new byte[var24];
                this.field1328 = new byte[var24];
                this.field1327 = new byte[var24];
            }
            if (var25 > 0) {
                this.field1311 = new byte[var25];
                this.field1340 = new byte[var25];
            }
        }
        var2.field2677 = var11;
        var3.field2677 = var44;
        var4.field2677 = var46;
        var5.field2677 = var48;
        var6.field2677 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1051((byte) -104);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1046(-116);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1046(-84);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1046(-61);
            }
            this.field1352[var66] = var63 + var80;
            this.field1321[var66] = var64 + var81;
            this.field1318[var66] = var65 + var82;
            var63 = this.field1352[var66];
            var64 = this.field1321[var66];
            var65 = this.field1318[var66];
            if (var17 == 1) {
                this.field1315[var66] = var6.method1051((byte) 95);
            }
        }
        var2.field2677 = var42;
        var3.field2677 = var31;
        var4.field2677 = var34;
        var5.field2677 = var37;
        var6.field2677 = var35;
        var7.field2677 = var40;
        var8.field2677 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field1330[var67] = (short) var2.method1063(-17162);
            if (var12 == 1) {
                this.field1316[var67] = var3.method1060((byte) -58);
            }
            if (var13 == 255) {
                this.field1346[var67] = var4.method1060((byte) -58);
            }
            if (var14 == 1) {
                this.field1351[var67] = var5.method1060((byte) -58);
            }
            if (var15 == 1) {
                this.field1317[var67] = var6.method1051((byte) 97);
            }
            if (var16 == 1) {
                this.field1323[var67] = (short) (var7.method1063(-17162) - 1);
            }
            if (this.field1313 != null) {
                if (this.field1323[var67] == -1) {
                    this.field1313[var67] = -1;
                } else {
                    this.field1313[var67] = (byte) (var8.method1051((byte) 91) - 1);
                }
            }
        }
        var2.field2677 = var33;
        var3.field2677 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1051((byte) -33);
            if (var75 == 1) {
                var68 = var2.method1046(-33) + var71;
                var69 = var2.method1046(-58) + var68;
                var70 = var2.method1046(-110) + var69;
                var71 = var70;
                this.field1342[var72] = var68;
                this.field1319[var72] = var69;
                this.field1347[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1046(-50) + var71;
                var71 = var70;
                this.field1342[var72] = var68;
                this.field1319[var72] = var69;
                this.field1347[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1046(-78) + var71;
                var71 = var70;
                this.field1342[var72] = var68;
                this.field1319[var72] = var69;
                this.field1347[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1046(-107) + var71;
                var71 = var70;
                this.field1342[var72] = var68;
                this.field1319[var72] = var78;
                this.field1347[var72] = var70;
            }
        }
        var2.field2677 = var50;
        var3.field2677 = var52;
        var4.field2677 = var54;
        var5.field2677 = var56;
        var6.field2677 = var58;
        var7.field2677 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field1338[var73] & 0xFF;
            if (var74 == 0) {
                this.field1325[var73] = (short) var2.method1063(-17162);
                this.field1355[var73] = (short) var2.method1063(-17162);
                this.field1357[var73] = (short) var2.method1063(-17162);
            }
            if (var74 == 1) {
                this.field1325[var73] = (short) var3.method1063(-17162);
                this.field1355[var73] = (short) var3.method1063(-17162);
                this.field1357[var73] = (short) var3.method1063(-17162);
                this.field1326[var73] = (short) var4.method1063(-17162);
                this.field1343[var73] = (short) var4.method1063(-17162);
                this.field1344[var73] = (short) var4.method1063(-17162);
                this.field1333[var73] = var5.method1060((byte) -58);
                this.field1328[var73] = var6.method1060((byte) -58);
                this.field1327[var73] = var7.method1060((byte) -58);
            }
            if (var74 == 2) {
                this.field1325[var73] = (short) var3.method1063(-17162);
                this.field1355[var73] = (short) var3.method1063(-17162);
                this.field1357[var73] = (short) var3.method1063(-17162);
                this.field1326[var73] = (short) var4.method1063(-17162);
                this.field1343[var73] = (short) var4.method1063(-17162);
                this.field1344[var73] = (short) var4.method1063(-17162);
                this.field1333[var73] = var5.method1060((byte) -58);
                this.field1328[var73] = var6.method1060((byte) -58);
                this.field1327[var73] = var7.method1060((byte) -58);
                this.field1311[var73] = var7.method1060((byte) -58);
                this.field1340[var73] = var7.method1060((byte) -58);
            }
            if (var74 == 3) {
                this.field1325[var73] = (short) var3.method1063(-17162);
                this.field1355[var73] = (short) var3.method1063(-17162);
                this.field1357[var73] = (short) var3.method1063(-17162);
                this.field1326[var73] = (short) var4.method1063(-17162);
                this.field1343[var73] = (short) var4.method1063(-17162);
                this.field1344[var73] = (short) var4.method1063(-17162);
                this.field1333[var73] = var5.method1060((byte) -58);
                this.field1328[var73] = var6.method1060((byte) -58);
                this.field1327[var73] = var7.method1060((byte) -58);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()Z")
    public final boolean method493() {
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V")
    private final void method494() {
        this.field1349 = null;
        this.field1329 = null;
        this.field1312 = null;
        this.field1350 = false;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lmb;II)Lvd;")
    public static final class67 method495(class178 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1197(arg2, arg1, -2);
        return var3 == null ? null : new class67(var3);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
    public static void method496() {
        field1356 = null;
        field1332 = null;
        field1336 = null;
        field1314 = null;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "()V")
    public final void method497() {
        for (int var1 = 0; var1 < this.field1331; var1++) {
            int var2 = this.field1352[var1];
            this.field1352[var1] = this.field1318[var1];
            this.field1318[var1] = -var2;
        }
        this.method494();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvd;I)I")
    private final int method498(class67 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1352[arg1];
        int var5 = arg0.field1321[arg1];
        int var6 = arg0.field1318[arg1];
        for (int var7 = 0; var7 < this.field1331; var7++) {
            if (this.field1352[var7] == var4 && this.field1321[var7] == var5 && this.field1318[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1352[this.field1331] = var4;
            this.field1321[this.field1331] = var5;
            this.field1318[this.field1331] = var6;
            if (arg0.field1315 != null) {
                this.field1315[this.field1331] = arg0.field1315[arg1];
            }
            var3 = this.field1331++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    private final void method499(int arg0) {
        int var2 = field1336[arg0];
        int var3 = field1314[arg0];
        for (int var4 = 0; var4 < this.field1331; var4++) {
            int var5 = this.field1352[var4] * var3 + this.field1321[var4] * var2 >> 16;
            this.field1321[var4] = this.field1321[var4] * var3 - this.field1352[var4] * var2 >> 16;
            this.field1352[var4] = var5;
        }
        this.method494();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[[I[[IIIIZZ)Lvd;")
    public final class67 method500(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method512();
        int var10 = this.field1320 + arg4;
        int var11 = this.field1310 + arg4;
        int var12 = this.field1335 + arg6;
        int var13 = this.field1322 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class67 var18;
        if (arg7) {
            var18 = new class67();
            var18.field1331 = this.field1331;
            var18.field1324 = this.field1324;
            var18.field1358 = this.field1358;
            var18.field1342 = this.field1342;
            var18.field1319 = this.field1319;
            var18.field1347 = this.field1347;
            var18.field1316 = this.field1316;
            var18.field1346 = this.field1346;
            var18.field1351 = this.field1351;
            var18.field1313 = this.field1313;
            var18.field1330 = this.field1330;
            var18.field1323 = this.field1323;
            var18.field1339 = this.field1339;
            var18.field1338 = this.field1338;
            var18.field1325 = this.field1325;
            var18.field1355 = this.field1355;
            var18.field1357 = this.field1357;
            var18.field1326 = this.field1326;
            var18.field1343 = this.field1343;
            var18.field1344 = this.field1344;
            var18.field1333 = this.field1333;
            var18.field1328 = this.field1328;
            var18.field1327 = this.field1327;
            var18.field1311 = this.field1311;
            var18.field1340 = this.field1340;
            var18.field1315 = this.field1315;
            var18.field1317 = this.field1317;
            var18.field1334 = this.field1334;
            var18.field1341 = this.field1341;
            var18.field1353 = this.field1353;
            var18.field1348 = this.field1348;
            var18.field1349 = this.field1349;
            var18.field1312 = this.field1312;
            var18.field1329 = this.field1329;
            if (arg0 == 3) {
                var18.field1352 = class144.method978(this.field1352, -14789);
                var18.field1321 = class144.method978(this.field1321, -14789);
                var18.field1318 = class144.method978(this.field1318, -14789);
            } else {
                var18.field1352 = this.field1352;
                var18.field1321 = new int[var18.field1331];
                var18.field1318 = this.field1318;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field1331; var19++) {
                int var20 = this.field1352[var19] + arg4;
                int var21 = this.field1318[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field1321[var19] = this.field1321[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field1331; var29++) {
                int var30 = (this.field1321[var29] << 16) / this.field1345;
                if (var30 < arg1) {
                    int var31 = this.field1352[var29] + arg4;
                    int var32 = this.field1318[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field1321[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field1321[var29];
                } else {
                    var18.field1321[var29] = this.field1321[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method509(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field1354 - this.field1345;
            for (int var43 = 0; var43 < this.field1331; var43++) {
                int var44 = this.field1352[var43] + arg4;
                int var45 = this.field1318[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field1321[var43] = var52 + this.field1321[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field1354 - this.field1345;
            for (int var54 = 0; var54 < this.field1331; var54++) {
                int var55 = this.field1352[var54] + arg4;
                int var56 = this.field1318[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field1321[var54] = ((this.field1321[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method494();
        } else {
            this.field1350 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "()V")
    public final void method501() {
        for (int var1 = 0; var1 < this.field1331; var1++) {
            this.field1318[var1] = -this.field1318[var1];
        }
        for (int var2 = 0; var2 < this.field1324; var2++) {
            int var3 = this.field1342[var2];
            this.field1342[var2] = this.field1347[var2];
            this.field1347[var2] = var3;
        }
        this.method494();
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "()V")
    public final void method502() {
        int var10002;
        if (this.field1315 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1331; var3++) {
                int var7 = this.field1315[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1334 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field1334[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1331) {
                int var6 = this.field1315[var5];
                this.field1334[var6][var1[var6]++] = var5++;
            }
            this.field1315 = null;
        }
        if (this.field1317 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1324; var10++) {
            int var14 = this.field1317[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field1341 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field1341[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field1324) {
            int var13 = this.field1317[var12];
            this.field1341[var13][var8[var13]++] = var12++;
        }
        this.field1317 = null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(III)I")
    public final int method503(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1331; var4++) {
            if (this.field1352[var4] == arg0 && this.field1321[var4] == arg1 && this.field1318[var4] == arg2) {
                return var4;
            }
        }
        this.field1352[this.field1331] = arg0;
        this.field1321[this.field1331] = arg1;
        this.field1318[this.field1331] = arg2;
        return this.field1331++;
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "()V")
    public final void method504() {
        for (int var1 = 0; var1 < this.field1331; var1++) {
            int var2 = this.field1318[var1];
            this.field1318[var1] = this.field1352[var1];
            this.field1352[var1] = -var2;
        }
        this.method494();
    }

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "()V")
    public final void method505() {
        this.field1315 = null;
        this.field1317 = null;
        this.field1334 = null;
        this.field1341 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)Lei;")
    public final class168 method506(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class232(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "()V")
    public final void method507() {
        if (this.field1349 != null) {
            return;
        }
        this.field1349 = new class175[this.field1331];
        for (int var1 = 0; var1 < this.field1331; var1++) {
            this.field1349[var1] = new class175();
        }
        for (int var2 = 0; var2 < this.field1324; var2++) {
            int var3 = this.field1342[var2];
            int var4 = this.field1319[var2];
            int var5 = this.field1347[var2];
            int var6 = this.field1352[var4] - this.field1352[var3];
            int var7 = this.field1321[var4] - this.field1321[var3];
            int var8 = this.field1318[var4] - this.field1318[var3];
            int var9 = this.field1352[var5] - this.field1352[var3];
            int var10 = this.field1321[var5] - this.field1321[var3];
            int var11 = this.field1318[var5] - this.field1318[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1316 == null) {
                var19 = 0;
            } else {
                var19 = this.field1316[var2];
            }
            if (var19 == 0) {
                class175 var20 = this.field1349[var3];
                var20.field2989 += var16;
                var20.field2982 += var17;
                var20.field2995 += var18;
                var20.field2983++;
                class175 var21 = this.field1349[var4];
                var21.field2989 += var16;
                var21.field2982 += var17;
                var21.field2995 += var18;
                var21.field2983++;
                class175 var22 = this.field1349[var5];
                var22.field2989 += var16;
                var22.field2982 += var17;
                var22.field2995 += var18;
                var22.field2983++;
            } else if (var19 == 1) {
                if (this.field1312 == null) {
                    this.field1312 = new class75[this.field1324];
                }
                class75 var23 = this.field1312[var2] = new class75();
                var23.field1458 = var16;
                var23.field1459 = var17;
                var23.field1461 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(III)V")
    public final void method508(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field1336[arg2];
            int var5 = field1314[arg2];
            for (int var6 = 0; var6 < this.field1331; var6++) {
                int var7 = this.field1352[var6] * var5 + this.field1321[var6] * var4 >> 16;
                this.field1321[var6] = this.field1321[var6] * var5 - this.field1352[var6] * var4 >> 16;
                this.field1352[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field1336[arg0];
            int var9 = field1314[arg0];
            for (int var10 = 0; var10 < this.field1331; var10++) {
                int var11 = this.field1321[var10] * var9 - this.field1318[var10] * var8 >> 16;
                this.field1318[var10] = this.field1321[var10] * var8 + this.field1318[var10] * var9 >> 16;
                this.field1321[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field1336[arg1];
        int var13 = field1314[arg1];
        for (int var14 = 0; var14 < this.field1331; var14++) {
            int var15 = this.field1352[var14] * var13 + this.field1318[var14] * var12 >> 16;
            this.field1318[var14] = this.field1318[var14] * var13 - this.field1352[var14] * var12 >> 16;
            this.field1352[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([[IIIIII)V")
    private final void method509(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method517(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method517(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method517(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method517(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method516(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method499(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method491(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()I")
    public final int method2() {
        if (!this.field1350) {
            this.method512();
        }
        return this.field1345;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "([B)V")
    private final void method510(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class152 var4 = new class152(arg0);
        class152 var5 = new class152(arg0);
        class152 var6 = new class152(arg0);
        class152 var7 = new class152(arg0);
        class152 var8 = new class152(arg0);
        var4.field2677 = arg0.length - 18;
        int var9 = var4.method1063(-17162);
        int var10 = var4.method1063(-17162);
        int var11 = var4.method1051((byte) 108);
        int var12 = var4.method1051((byte) -122);
        int var13 = var4.method1051((byte) -98);
        int var14 = var4.method1051((byte) 90);
        int var15 = var4.method1051((byte) 92);
        int var16 = var4.method1051((byte) -96);
        int var17 = var4.method1063(-17162);
        int var18 = var4.method1063(-17162);
        int var19 = var4.method1063(-17162);
        int var20 = var4.method1063(-17162);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1331 = var9;
        this.field1324 = var10;
        this.field1358 = var11;
        this.field1352 = new int[var9];
        this.field1321 = new int[var9];
        this.field1318 = new int[var9];
        this.field1342 = new int[var10];
        this.field1319 = new int[var10];
        this.field1347 = new int[var10];
        if (var11 > 0) {
            this.field1338 = new byte[var11];
            this.field1325 = new short[var11];
            this.field1355 = new short[var11];
            this.field1357 = new short[var11];
        }
        if (var16 == 1) {
            this.field1315 = new int[var9];
        }
        if (var12 == 1) {
            this.field1316 = new byte[var10];
            this.field1313 = new byte[var10];
            this.field1323 = new short[var10];
        }
        if (var13 == 255) {
            this.field1346 = new byte[var10];
        } else {
            this.field1339 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1351 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1317 = new int[var10];
        }
        this.field1330 = new short[var10];
        var4.field2677 = var21;
        var5.field2677 = var36;
        var6.field2677 = var38;
        var7.field2677 = var40;
        var8.field2677 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1051((byte) 84);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1046(-66);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1046(-52);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1046(-126);
            }
            this.field1352[var46] = var43 + var63;
            this.field1321[var46] = var44 + var64;
            this.field1318[var46] = var45 + var65;
            var43 = this.field1352[var46];
            var44 = this.field1321[var46];
            var45 = this.field1318[var46];
            if (var16 == 1) {
                this.field1315[var46] = var8.method1051((byte) 117);
            }
        }
        var4.field2677 = var32;
        var5.field2677 = var28;
        var6.field2677 = var26;
        var7.field2677 = var30;
        var8.field2677 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field1330[var47] = (short) var4.method1063(-17162);
            if (var12 == 1) {
                int var61 = var5.method1051((byte) 103);
                if ((var61 & 0x1) == 1) {
                    this.field1316[var47] = 1;
                    var2 = true;
                } else {
                    this.field1316[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field1313[var47] = (byte) (var61 >> 2);
                    this.field1323[var47] = this.field1330[var47];
                    this.field1330[var47] = 127;
                    if (this.field1323[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1313[var47] = -1;
                    this.field1323[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1346[var47] = var6.method1060((byte) -58);
            }
            if (var14 == 1) {
                this.field1351[var47] = var7.method1060((byte) -58);
            }
            if (var15 == 1) {
                this.field1317[var47] = var8.method1051((byte) 86);
            }
        }
        var4.field2677 = var25;
        var5.field2677 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1051((byte) -56);
            if (var57 == 1) {
                var48 = var4.method1046(-100) + var51;
                var49 = var4.method1046(-83) + var48;
                var50 = var4.method1046(-62) + var49;
                var51 = var50;
                this.field1342[var52] = var48;
                this.field1319[var52] = var49;
                this.field1347[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1046(-99) + var51;
                var51 = var50;
                this.field1342[var52] = var48;
                this.field1319[var52] = var49;
                this.field1347[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1046(-56) + var51;
                var51 = var50;
                this.field1342[var52] = var48;
                this.field1319[var52] = var49;
                this.field1347[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1046(-72) + var51;
                var51 = var50;
                this.field1342[var52] = var48;
                this.field1319[var52] = var60;
                this.field1347[var52] = var50;
            }
        }
        var4.field2677 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field1338[var53] = 0;
            this.field1325[var53] = (short) var4.method1063(-17162);
            this.field1355[var53] = (short) var4.method1063(-17162);
            this.field1357[var53] = (short) var4.method1063(-17162);
        }
        if (this.field1313 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field1313[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field1325[var56] & 0xFFFF) == this.field1342[var55] && (this.field1355[var56] & 0xFFFF) == this.field1319[var55] && (this.field1357[var56] & 0xFFFF) == this.field1347[var55]) {
                        this.field1313[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1313 = null;
            }
        }
        if (!var3) {
            this.field1323 = null;
        }
        if (!var2) {
            this.field1316 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Lij;")
    public final class166 method511(int arg0, int arg1, int arg2) {
        return this.method506(this.field1353, this.field1348, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "()V")
    private final void method512() {
        if (this.field1350) {
            return;
        }
        this.field1350 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field1331; var7++) {
            int var8 = this.field1352[var7];
            int var9 = this.field1321[var7];
            int var10 = this.field1318[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field1320 = (short) var1;
        this.field1310 = (short) var4;
        this.field1345 = (short) var2;
        this.field1354 = (short) var5;
        this.field1335 = (short) var3;
        this.field1322 = (short) var6;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIII)Lra;")
    public final class232 method513(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class232(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIBSB)I")
    public final int method514(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field1342[this.field1324] = arg0;
        this.field1319[this.field1324] = arg1;
        this.field1347[this.field1324] = arg2;
        this.field1316[this.field1324] = arg3;
        this.field1313[this.field1324] = -1;
        this.field1330[this.field1324] = arg4;
        this.field1323[this.field1324] = -1;
        this.field1351[this.field1324] = arg5;
        return this.field1324++;
    }

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "()Lvd;")
    public final class67 method515() {
        class67 var1 = new class67();
        if (this.field1316 != null) {
            var1.field1316 = new byte[this.field1324];
            for (int var2 = 0; var2 < this.field1324; var2++) {
                var1.field1316[var2] = this.field1316[var2];
            }
        }
        var1.field1331 = this.field1331;
        var1.field1324 = this.field1324;
        var1.field1358 = this.field1358;
        var1.field1352 = this.field1352;
        var1.field1321 = this.field1321;
        var1.field1318 = this.field1318;
        var1.field1342 = this.field1342;
        var1.field1319 = this.field1319;
        var1.field1347 = this.field1347;
        var1.field1346 = this.field1346;
        var1.field1351 = this.field1351;
        var1.field1313 = this.field1313;
        var1.field1330 = this.field1330;
        var1.field1323 = this.field1323;
        var1.field1339 = this.field1339;
        var1.field1338 = this.field1338;
        var1.field1325 = this.field1325;
        var1.field1355 = this.field1355;
        var1.field1357 = this.field1357;
        var1.field1326 = this.field1326;
        var1.field1343 = this.field1343;
        var1.field1344 = this.field1344;
        var1.field1333 = this.field1333;
        var1.field1328 = this.field1328;
        var1.field1327 = this.field1327;
        var1.field1311 = this.field1311;
        var1.field1340 = this.field1340;
        var1.field1315 = this.field1315;
        var1.field1317 = this.field1317;
        var1.field1334 = this.field1334;
        var1.field1341 = this.field1341;
        var1.field1349 = this.field1349;
        var1.field1312 = this.field1312;
        var1.field1353 = this.field1353;
        var1.field1348 = this.field1348;
        return var1;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    private final void method516(int arg0) {
        int var2 = field1336[arg0];
        int var3 = field1314[arg0];
        for (int var4 = 0; var4 < this.field1331; var4++) {
            int var5 = this.field1321[var4] * var3 - this.field1318[var4] * var2 >> 16;
            this.field1318[var4] = this.field1321[var4] * var2 + this.field1318[var4] * var3 >> 16;
            this.field1321[var4] = var5;
        }
        this.method494();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([[III)I")
    private static final int method517(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lij;IIIZ)V")
    public final void method518(class166 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class67 var6 = (class67) arg0;
        var6.method512();
        var6.method507();
        field1337++;
        int var7 = 0;
        int[] var8 = var6.field1352;
        int var9 = var6.field1331;
        for (int var10 = 0; var10 < this.field1331; var10++) {
            class175 var13 = this.field1349[var10];
            if (var13.field2983 != 0) {
                int var14 = this.field1321[var10] - arg2;
                if (var14 >= var6.field1345 && var14 <= var6.field1354) {
                    int var15 = this.field1352[var10] - arg1;
                    if (var15 >= var6.field1320 && var15 <= var6.field1310) {
                        int var16 = this.field1318[var10] - arg3;
                        if (var16 >= var6.field1335 && var16 <= var6.field1322) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class175 var18 = var6.field1349[var17];
                                if (var8[var17] == var15 && var6.field1318[var17] == var16 && var6.field1321[var17] == var14 && var18.field2983 != 0) {
                                    if (this.field1329 == null) {
                                        this.field1329 = new class175[this.field1331];
                                    }
                                    if (var6.field1329 == null) {
                                        var6.field1329 = new class175[var9];
                                    }
                                    class175 var19 = this.field1329[var10];
                                    if (var19 == null) {
                                        var19 = this.field1329[var10] = new class175(var13);
                                    }
                                    class175 var20 = var6.field1329[var17];
                                    if (var20 == null) {
                                        var20 = var6.field1329[var17] = new class175(var18);
                                    }
                                    var19.field2989 += var18.field2989;
                                    var19.field2982 += var18.field2982;
                                    var19.field2995 += var18.field2995;
                                    var19.field2983 += var18.field2983;
                                    var20.field2989 += var13.field2989;
                                    var20.field2982 += var13.field2982;
                                    var20.field2995 += var13.field2995;
                                    var20.field2983 += var13.field2983;
                                    var7++;
                                    field1356[var10] = field1337;
                                    field1332[var17] = field1337;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field1324; var11++) {
            if (field1356[this.field1342[var11]] == field1337 && field1356[this.field1319[var11]] == field1337 && field1356[this.field1347[var11]] == field1337) {
                if (this.field1316 == null) {
                    this.field1316 = new byte[this.field1324];
                }
                this.field1316[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field1324; var12++) {
            if (field1332[var6.field1342[var12]] == field1337 && field1332[var6.field1319[var12]] == field1337 && field1332[var6.field1347[var12]] == field1337) {
                if (var6.field1316 == null) {
                    var6.field1316 = new byte[var6.field1324];
                }
                var6.field1316[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    private class67() {
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([B)V")
    private class67(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method492(arg0);
        } else {
            this.method510(arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(III)V")
    public final void method519(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1331; var4++) {
            this.field1352[var4] = this.field1352[var4] * arg0 / 128;
            this.field1321[var4] = this.field1321[var4] * arg1 / 128;
            this.field1318[var4] = this.field1318[var4] * arg2 / 128;
        }
        this.method494();
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(III)V")
    public class67(int arg0, int arg1, int arg2) {
        this.field1352 = new int[arg0];
        this.field1321 = new int[arg0];
        this.field1318 = new int[arg0];
        this.field1315 = new int[arg0];
        this.field1342 = new int[arg1];
        this.field1319 = new int[arg1];
        this.field1347 = new int[arg1];
        this.field1316 = new byte[arg1];
        this.field1346 = new byte[arg1];
        this.field1351 = new byte[arg1];
        this.field1330 = new short[arg1];
        this.field1323 = new short[arg1];
        this.field1313 = new byte[arg1];
        this.field1317 = new int[arg1];
        if (arg2 > 0) {
            this.field1338 = new byte[arg2];
            this.field1325 = new short[arg2];
            this.field1355 = new short[arg2];
            this.field1357 = new short[arg2];
            this.field1326 = new short[arg2];
            this.field1343 = new short[arg2];
            this.field1344 = new short[arg2];
            this.field1333 = new byte[arg2];
            this.field1328 = new byte[arg2];
            this.field1327 = new byte[arg2];
            this.field1311 = new byte[arg2];
            this.field1340 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([Lvd;I)V")
    public class67(class67[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1331 = 0;
        this.field1324 = 0;
        this.field1358 = 0;
        this.field1339 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class67 var15 = arg0[var9];
            if (var15 != null) {
                this.field1331 += var15.field1331;
                this.field1324 += var15.field1324;
                this.field1358 += var15.field1358;
                if (var15.field1346 == null) {
                    if (this.field1339 == -1) {
                        this.field1339 = var15.field1339;
                    }
                    if (this.field1339 != var15.field1339) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field1316 != null;
                var5 |= var15.field1351 != null;
                var6 |= var15.field1317 != null;
                var7 |= var15.field1323 != null;
                var8 |= var15.field1313 != null;
            }
        }
        this.field1352 = new int[this.field1331];
        this.field1321 = new int[this.field1331];
        this.field1318 = new int[this.field1331];
        this.field1315 = new int[this.field1331];
        this.field1342 = new int[this.field1324];
        this.field1319 = new int[this.field1324];
        this.field1347 = new int[this.field1324];
        if (var3) {
            this.field1316 = new byte[this.field1324];
        }
        if (var4) {
            this.field1346 = new byte[this.field1324];
        }
        if (var5) {
            this.field1351 = new byte[this.field1324];
        }
        if (var6) {
            this.field1317 = new int[this.field1324];
        }
        if (var7) {
            this.field1323 = new short[this.field1324];
        }
        if (var8) {
            this.field1313 = new byte[this.field1324];
        }
        this.field1330 = new short[this.field1324];
        if (this.field1358 > 0) {
            this.field1338 = new byte[this.field1358];
            this.field1325 = new short[this.field1358];
            this.field1355 = new short[this.field1358];
            this.field1357 = new short[this.field1358];
            this.field1326 = new short[this.field1358];
            this.field1343 = new short[this.field1358];
            this.field1344 = new short[this.field1358];
            this.field1333 = new byte[this.field1358];
            this.field1328 = new byte[this.field1358];
            this.field1327 = new byte[this.field1358];
            this.field1311 = new byte[this.field1358];
            this.field1340 = new byte[this.field1358];
        }
        this.field1331 = 0;
        this.field1324 = 0;
        this.field1358 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class67 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1324; var12++) {
                    if (var3 && var11.field1316 != null) {
                        this.field1316[this.field1324] = var11.field1316[var12];
                    }
                    if (var4) {
                        if (var11.field1346 == null) {
                            this.field1346[this.field1324] = var11.field1339;
                        } else {
                            this.field1346[this.field1324] = var11.field1346[var12];
                        }
                    }
                    if (var5 && var11.field1351 != null) {
                        this.field1351[this.field1324] = var11.field1351[var12];
                    }
                    if (var6 && var11.field1317 != null) {
                        this.field1317[this.field1324] = var11.field1317[var12];
                    }
                    if (var7) {
                        if (var11.field1323 == null) {
                            this.field1323[this.field1324] = -1;
                        } else {
                            this.field1323[this.field1324] = var11.field1323[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field1313 == null || var11.field1313[var12] == -1) {
                            this.field1313[this.field1324] = -1;
                        } else {
                            this.field1313[this.field1324] = (byte) (var11.field1313[var12] + this.field1358);
                        }
                    }
                    this.field1330[this.field1324] = var11.field1330[var12];
                    this.field1342[this.field1324] = this.method498(var11, var11.field1342[var12]);
                    this.field1319[this.field1324] = this.method498(var11, var11.field1319[var12]);
                    this.field1347[this.field1324] = this.method498(var11, var11.field1347[var12]);
                    this.field1324++;
                }
                for (int var13 = 0; var13 < var11.field1358; var13++) {
                    byte var14 = this.field1338[this.field1358] = var11.field1338[var13];
                    if (var14 == 0) {
                        this.field1325[this.field1358] = (short) this.method498(var11, var11.field1325[var13]);
                        this.field1355[this.field1358] = (short) this.method498(var11, var11.field1355[var13]);
                        this.field1357[this.field1358] = (short) this.method498(var11, var11.field1357[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field1325[this.field1358] = var11.field1325[var13];
                        this.field1355[this.field1358] = var11.field1355[var13];
                        this.field1357[this.field1358] = var11.field1357[var13];
                        this.field1326[this.field1358] = var11.field1326[var13];
                        this.field1343[this.field1358] = var11.field1343[var13];
                        this.field1344[this.field1358] = var11.field1344[var13];
                        this.field1333[this.field1358] = var11.field1333[var13];
                        this.field1328[this.field1358] = var11.field1328[var13];
                        this.field1327[this.field1358] = var11.field1327[var13];
                    }
                    if (var14 == 2) {
                        this.field1311[this.field1358] = var11.field1311[var13];
                        this.field1340[this.field1358] = var11.field1340[var13];
                    }
                    this.field1358++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lvd;ZZZZ)V")
    public class67(class67 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1331 = arg0.field1331;
        this.field1324 = arg0.field1324;
        this.field1358 = arg0.field1358;
        if (arg1) {
            this.field1352 = arg0.field1352;
            this.field1321 = arg0.field1321;
            this.field1318 = arg0.field1318;
        } else {
            this.field1352 = new int[this.field1331];
            this.field1321 = new int[this.field1331];
            this.field1318 = new int[this.field1331];
            for (int var6 = 0; var6 < this.field1331; var6++) {
                this.field1352[var6] = arg0.field1352[var6];
                this.field1321[var6] = arg0.field1321[var6];
                this.field1318[var6] = arg0.field1318[var6];
            }
        }
        if (arg2) {
            this.field1330 = arg0.field1330;
        } else {
            this.field1330 = new short[this.field1324];
            for (int var7 = 0; var7 < this.field1324; var7++) {
                this.field1330[var7] = arg0.field1330[var7];
            }
        }
        if (arg3 || arg0.field1323 == null) {
            this.field1323 = arg0.field1323;
        } else {
            this.field1323 = new short[this.field1324];
            for (int var8 = 0; var8 < this.field1324; var8++) {
                this.field1323[var8] = arg0.field1323[var8];
            }
        }
        if (arg4) {
            this.field1351 = arg0.field1351;
        } else {
            this.field1351 = new byte[this.field1324];
            if (arg0.field1351 == null) {
                for (int var9 = 0; var9 < this.field1324; var9++) {
                    this.field1351[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1324; var10++) {
                    this.field1351[var10] = arg0.field1351[var10];
                }
            }
        }
        this.field1342 = arg0.field1342;
        this.field1319 = arg0.field1319;
        this.field1347 = arg0.field1347;
        this.field1316 = arg0.field1316;
        this.field1346 = arg0.field1346;
        this.field1313 = arg0.field1313;
        this.field1339 = arg0.field1339;
        this.field1338 = arg0.field1338;
        this.field1325 = arg0.field1325;
        this.field1355 = arg0.field1355;
        this.field1357 = arg0.field1357;
        this.field1326 = arg0.field1326;
        this.field1343 = arg0.field1343;
        this.field1344 = arg0.field1344;
        this.field1333 = arg0.field1333;
        this.field1328 = arg0.field1328;
        this.field1327 = arg0.field1327;
        this.field1311 = arg0.field1311;
        this.field1340 = arg0.field1340;
        this.field1315 = arg0.field1315;
        this.field1317 = arg0.field1317;
        this.field1334 = arg0.field1334;
        this.field1341 = arg0.field1341;
        this.field1349 = arg0.field1349;
        this.field1312 = arg0.field1312;
        this.field1329 = arg0.field1329;
        this.field1353 = arg0.field1353;
        this.field1348 = arg0.field1348;
    }
}
