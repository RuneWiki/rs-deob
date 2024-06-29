import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 extends class123 {

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "[I")
    private int[] field1388;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "[B")
    public byte[] field1390;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[Lr;")
    public class116[] field1380;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "[B")
    public byte[] field1391;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "[B")
    public byte[] field1393;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "[S")
    public short[] field1379;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "[Lhc;")
    public class52[] field1385;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "[B")
    public static byte[] field1384 = new byte[520];

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "Loa;")
    public static class98 field1382 = class38.method349(255, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "Lb;")
    public static class8 field1378 = new class8(new byte[5000]);

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "[I")
    public static int[] field1394 = new int[2048];

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "Loa;")
    public static class98 field1395 = class38.method349(255, "Spieler");

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "Loa;")
    public static class98 field1396 = class38.method349(255, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "[Loa;")
    public static class98[] field1397 = new class98[100];

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Loa;")
    public static class98 field1398 = class38.method349(255, "Angreifen");

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "[I")
    public static int[] field1399;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public static final void method525(int arg0) {
        int var1 = 80 % (arg0 / 50);
        class73.field1509.method734(-224779128);
        class52.field1151.method734(-224779128);
        field1377++;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    public final void method526(int arg0) {
        field1383++;
        this.field1388 = null;
        if (arg0 != 0) {
            this.method527(-83, null, null, null);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[BLva;[I)Z")
    public final boolean method527(int arg0, byte[] arg1, class141 arg2, int[] arg3) {
        field1387++;
        boolean var5 = true;
        class116 var6 = null;
        if (arg0 != -28965) {
            this.method526(12);
        }
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1388[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg2.method1133(0, var9 >> 2, arg3);
                        } else {
                            var6 = arg2.method1132((byte) 89, var9 >> 2, arg3);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field1380[var8] = var6;
                        this.field1388[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
    public static void method528(byte arg0) {
        field1378 = null;
        field1384 = null;
        field1394 = null;
        field1395 = null;
        field1396 = null;
        field1397 = null;
        field1398 = null;
        field1399 = null;
        field1382 = null;
        if (arg0 >= -57) {
            method529((byte) 37, -52, -59, -43, 54, -77, 98, -34, 44);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method529(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1389++;
        if (arg0 >= -90) {
            method529((byte) 14, -42, -102, -17, 81, 50, -114, 18, -12);
        }
        if (client.method202(arg2, -642990672)) {
            class31.method302(arg4, 0, arg6, class36.field901[arg2], (byte) -36, arg7, arg8, -1, arg1, arg5, 0, arg3);
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public static final void method530(int arg0) {
        if (arg0 == -30662) {
            class22.field554 = true;
            field1392++;
            class94.field2151 = true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class65() {
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
    public class65(byte[] arg0) {
        this.field1388 = new int[128];
        this.field1390 = new byte[128];
        this.field1380 = new class116[128];
        this.field1391 = new byte[128];
        int var2 = 0;
        this.field1393 = new byte[128];
        this.field1379 = new short[128];
        this.field1385 = new class52[128];
        class8 var3 = new class8(arg0);
        while (var3.field132[var3.field182 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method57(98);
        }
        var2++;
        int var6 = 0;
        var3.field182++;
        int var7 = var3.field182;
        var3.field182 += var2;
        while (var3.field132[var3.field182 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method57(23);
        }
        var6++;
        var3.field182++;
        int var10 = var3.field182;
        var3.field182 += var6;
        int var11;
        for (var11 = 0; var3.field132[var3.field182 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method57(101);
        }
        var11++;
        var3.field182++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method62((byte) 89);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class52[] var19 = new class52[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class52 var103 = var19[var20] = new class52();
            int var104 = var3.method62((byte) 119);
            if (var104 > 0) {
                var103.field1138 = new byte[var104 * 2];
            }
            int var105 = var3.method62((byte) 127);
            if (var105 > 0) {
                var103.field1146 = new byte[var105 * 2 + 2];
                var103.field1146[1] = 64;
            }
        }
        int var21 = var3.method62((byte) 94);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method62((byte) 81);
        int var24 = 0;
        byte[] var25 = var23 <= 0 ? null : new byte[var23 * 2];
        while (var3.field132[var3.field182 + var24] != 0) {
            var24++;
        }
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var3.method57(21);
        }
        int var28 = 0;
        var3.field182++;
        var24++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method62((byte) 119);
            this.field1379[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method62((byte) 90);
            this.field1379[var31] = (short) (this.field1379[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var3.method83(-1);
            }
            var32--;
            this.field1379[var35] = (short) (this.field1379[var35] + class150.method1211(var34 - 1 << 14, 32768));
            this.field1388[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1388[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var3.field132[var7++] - 1;
                }
                var36--;
                this.field1390[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1388[var43] != 0) {
                if (var41 == 0) {
                    if (var40 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var3.field132[var10++] + 16 << 2;
                }
                this.field1393[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class52 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1388[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field1385[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var50 >= var26.length) {
                    var48 = -1;
                } else {
                    var48 = var26[var50++];
                }
                if (this.field1388[var51] > 0) {
                    var49 = var3.method62((byte) 91) + 1;
                }
            }
            this.field1391[var51] = (byte) var49;
            var48--;
        }
        this.field1381 = var3.method62((byte) 120) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class52 var100 = var19[var52];
            if (var100.field1138 != null) {
                for (int var101 = 1; var101 < var100.field1138.length; var101 += 2) {
                    var100.field1138[var101] = var3.method57(101);
                }
            }
            if (var100.field1146 != null) {
                for (int var102 = 3; var102 < var100.field1146.length - 2; var102 += 2) {
                    var100.field1146[var102] = var3.method57(56);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method57(67);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method57(37);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class52 var97 = var19[var55];
            if (var97.field1146 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1146.length; var99 += 2) {
                    var98 = var98 + var3.method62((byte) 90) + 1;
                    var97.field1146[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class52 var94 = var19[var56];
            if (var94.field1138 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1138.length; var96 += 2) {
                    var95 += var3.method62((byte) 104) + 1;
                    var94.field1138[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method62((byte) 125);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var3.method62((byte) 109) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field1391[var61] = (byte) (this.field1391[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                var62 += 2;
                int var67 = (var66 - var60) * var59 + (var66 - var60) / 2;
                for (int var68 = var60; var68 < var66; var68++) {
                    int var69 = class130.method1054((byte) -98, var67, var66 - var60);
                    var67 += var65 - var59;
                    this.field1391[var68] = (byte) (this.field1391[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var60; var64 < 128; var64++) {
                this.field1391[var64] = (byte) (this.field1391[var64] * var59 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method62((byte) 80);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 -= -var3.method62((byte) 108) - 1;
                var25[var71] = (byte) var70;
            }
            int var72 = var25[1] << 1;
            byte var73 = var25[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field1393[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1393[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                int var79 = var25[var75 + 1] << 1;
                byte var80 = var25[var75];
                int var81 = (var80 - var73) / 2 + (var80 - var73) * var72;
                var75 += 2;
                for (int var82 = var73; var82 < var80; var82++) {
                    int var83 = class130.method1054((byte) -98, var81, var80 - var73);
                    int var84 = (this.field1393[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var79 - var72;
                    this.field1393[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var73; var76 < 128; var76++) {
                int var78 = (this.field1393[var76] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1393[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1149 = var3.method62((byte) 90);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class52 var93 = var19[var87];
            if (var93.field1138 != null) {
                var93.field1142 = var3.method62((byte) 85);
            }
            if (var93.field1146 != null) {
                var93.field1141 = var3.method62((byte) 77);
            }
            if (var93.field1149 > 0) {
                var93.field1156 = var3.method62((byte) 87);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1152 = var3.method62((byte) 76);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class52 var92 = var19[var89];
            if (var92.field1152 > 0) {
                var92.field1140 = var3.method62((byte) 115);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class52 var91 = var19[var90];
            if (var91.field1140 > 0) {
                var91.field1147 = var3.method62((byte) 105);
            }
        }
    }
}
