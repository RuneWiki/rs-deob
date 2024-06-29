import java.awt.Font;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 extends class70 {

    @OriginalMember(owner = "client!k", name = "J", descriptor = "[Lfc;")
    public class39[] field1442;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "[B")
    public byte[] field1455;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "[I")
    private int[] field1440;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "[S")
    public short[] field1449;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "[B")
    public byte[] field1443;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "[Lta;")
    public class132[] field1453;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "[B")
    public byte[] field1458;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "Z")
    public static boolean field1445 = false;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "[I")
    public static int[] field1438 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!k", name = "R", descriptor = "Lqf;")
    private static class117 field1450 = class72.method514(102, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "Lqf;")
    public static class117 field1457 = field1450;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "Lqf;")
    public static class117 field1462 = class72.method514(120, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "Lqf;")
    private static class117 field1460 = class72.method514(103, "From");

    @OriginalMember(owner = "client!k", name = "T", descriptor = "Lqf;")
    public static class117 field1451 = field1460;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1439 = new CRC32();

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "Lqf;")
    private static class117 field1464 = class72.method514(116, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "Lqf;")
    public static class117 field1463 = field1464;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "Lqf;")
    public static class117 field1466 = class72.method514(113, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "Lqf;")
    private static class117 field1467 = class72.method514(101, "button near the top of that page)3");

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "Lqf;")
    public static class117 field1465 = field1467;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "Ljava/awt/Font;")
    public static Font field1459;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V")
    public static final void method482(int arg0, int arg1, int arg2, int arg3) {
        field1437++;
        class89 var4 = class82.method643(arg3, (byte) 112, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2108 != null) {
            class18.method145(var4.field2108, var4, 0, 0, null, 18859, arg1);
        }
        boolean var5 = true;
        if (var4.field2136 > 0) {
            var5 = class27.method208((byte) 126, var4);
        }
        if (!var5 || !class94.method743(arg1 - 1, class42.method292(var4, arg0 + -5439), (byte) -112)) {
            return;
        }
        if (arg1 == 1) {
            class4.field72++;
            class99.field2373.method961(225, -1198);
            class99.field2373.method600(arg3, -30515);
            class99.field2373.method556(arg2, true);
        }
        if (arg1 == 2) {
            class99.field2373.method961(163, -1198);
            class99.field2373.method600(arg3, arg0 - 30507);
            class148.field3622++;
            class99.field2373.method556(arg2, true);
        }
        if (arg1 == 3) {
            class99.field2373.method961(79, arg0 ^ 0x4AA);
            class58.field1178++;
            class99.field2373.method600(arg3, -30515);
            class99.field2373.method556(arg2, true);
        }
        if (arg1 == 4) {
            class99.field2373.method961(147, -1198);
            class80.field1818++;
            class99.field2373.method600(arg3, -30515);
            class99.field2373.method556(arg2, true);
        }
        if (arg1 == 5) {
            class99.field2373.method961(74, -1198);
            class99.field2373.method600(arg3, -30515);
            class48.field964++;
            class99.field2373.method556(arg2, true);
        }
        if (arg1 == 6) {
            class99.field2373.method961(122, -1198);
            class148.field3613++;
            class99.field2373.method600(arg3, -30515);
            class99.field2373.method556(arg2, true);
        }
        if (~arg1 == arg0) {
            class99.field2373.method961(42, -1198);
            class99.field2373.method600(arg3, arg0 ^ 0x7735);
            class99.field2373.method556(arg2, true);
            class29.field563++;
        }
        if (arg1 == 8) {
            class73.field1608++;
            class99.field2373.method961(255, -1198);
            class99.field2373.method600(arg3, -30515);
            class99.field2373.method556(arg2, true);
        }
        if (arg1 == 9) {
            class122.field2904++;
            class99.field2373.method961(159, -1198);
            class99.field2373.method600(arg3, arg0 - 30507);
            class99.field2373.method556(arg2, true);
        }
        if (arg1 == 10) {
            class78.field1778++;
            class99.field2373.method961(121, -1198);
            class99.field2373.method600(arg3, -30515);
            class99.field2373.method556(arg2, true);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZI)I")
    public static final int method483(int arg0, int arg1, boolean arg2, int arg3) {
        field1444++;
        int var4 = arg3 & 0x3;
        if (!arg2) {
            method489((byte) 79, -110, 48);
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
    public static final void method484(int arg0) {
        field1461++;
        if (!class89.field2160) {
            return;
        }
        class89 var1 = class82.method643(class55.field1125, (byte) 124, class124.field2933);
        if (var1 != null && var1.field2036 != null) {
            class18.method145(var1.field2036, var1, 0, 0, null, 18859, 0);
        }
        int var2 = -70 / ((arg0 + 11) / 57);
        class89.field2160 = false;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([BLhf;B[I)Z")
    public final boolean method485(byte[] arg0, class55 arg1, byte arg2, int[] arg3) {
        field1441++;
        int var5 = 0;
        if (arg2 < 15) {
            return true;
        }
        class39 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field1440[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method407(var9 >> 2, 0, arg3);
                        } else {
                            var6 = arg1.method405(arg3, (byte) 51, var9 >> 2);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field1442[var8] = var6;
                        this.field1440[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
    public static final void method486(byte arg0) {
        field1456++;
        if (class27.field531 < 2 && class90.field2179 == 0 && !class89.field2160) {
            return;
        }
        if (arg0 > -96) {
            method489((byte) -98, 53, 69);
        }
        class117 var1;
        if (class90.field2179 == 1 && class27.field531 < 2) {
            var1 = class73.method530((byte) -83, new class117[] { class13.field190, class102.field2464, class146.field3571, class103.field2500 });
        } else if (class89.field2160 && class27.field531 < 2) {
            var1 = class73.method530((byte) -83, new class117[] { class90.field2199, class102.field2464, class115.field2723, class103.field2500 });
        } else {
            var1 = class82.field1884[class27.field531 - 1];
        }
        if (class27.field531 > 2) {
            var1 = class73.method530((byte) -83, new class117[] { var1, class55.field1145, class79.method614(15591, class27.field531 - 2), class48.field1027 });
        }
        class144.field3554.method321(var1, 4, 15, 16777215, 0, class43.field856 / 1000);
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
    public static void method487(int arg0) {
        field1438 = null;
        field1466 = null;
        field1451 = null;
        field1460 = null;
        field1459 = null;
        field1450 = null;
        field1463 = null;
        field1465 = null;
        field1457 = null;
        field1439 = null;
        field1462 = null;
        field1467 = null;
        int var1 = 27 % ((-arg0 - 1) / 55);
        field1464 = null;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V")
    public final void method488(byte arg0) {
        if (arg0 == 33) {
            field1446++;
            this.field1440 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class69() {
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "([B)V")
    public class69(byte[] arg0) {
        this.field1442 = new class39[128];
        this.field1455 = new byte[128];
        this.field1440 = new int[128];
        this.field1449 = new short[128];
        this.field1443 = new byte[128];
        this.field1453 = new class132[128];
        int var2 = 0;
        this.field1458 = new byte[128];
        class77 var3 = new class77(arg0);
        while (var3.field1748[var3.field1691 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method592((byte) -120);
        }
        var3.field1691++;
        var2++;
        int var6 = var3.field1691;
        var3.field1691 += var2;
        int var7;
        for (var7 = 0; var3.field1748[var3.field1691 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method592((byte) -109);
        }
        var3.field1691++;
        int var10 = var3.field1691;
        var7++;
        var3.field1691 += var7;
        int var11;
        for (var11 = 0; var3.field1748[var3.field1691 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method592((byte) -120);
        }
        var11++;
        var3.field1691++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method570((byte) 123);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class132[] var19 = new class132[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class132 var103 = var19[var20] = new class132();
            int var104 = var3.method570((byte) 123);
            if (var104 > 0) {
                var103.field3139 = new byte[var104 * 2];
            }
            int var105 = var3.method570((byte) 123);
            if (var105 > 0) {
                var103.field3121 = new byte[var105 * 2 + 2];
                var103.field3121[1] = 64;
            }
        }
        int var21 = var3.method570((byte) 123);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var3.method570((byte) 123);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var3.field1748[var3.field1691 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method592((byte) -106);
        }
        var25++;
        var3.field1691++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method570((byte) 123);
            this.field1449[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method570((byte) 123);
            this.field1449[var31] = (short) (this.field1449[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var34 == 0) {
                if (var26.length > var33) {
                    var34 = var26[var33++];
                } else {
                    var34 = -1;
                }
                var32 = var3.method566((byte) -24);
            }
            this.field1449[var35] = (short) (this.field1449[var35] + class16.method135(32768, var32 - 1 << 14));
            this.field1440[var35] = var32;
            var34--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1440[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field1748[var6++] - 1;
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field1443[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1440[var43] != 0) {
                if (var40 == 0) {
                    var42 = var3.field1748[var10++] + 16 << 2;
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field1458[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        class132 var45 = null;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1440[var47] != 0) {
                if (var44 == 0) {
                    var45 = var19[var14[var46]];
                    if (var46 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var46++];
                    }
                }
                var44--;
                this.field1453[var47] = var45;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var50 == 0) {
                if (var48 < var26.length) {
                    var50 = var26[var48++];
                } else {
                    var50 = -1;
                }
                if (this.field1440[var51] > 0) {
                    var49 = var3.method570((byte) 123) + 1;
                }
            }
            this.field1455[var51] = (byte) var49;
            var50--;
        }
        this.field1448 = var3.method570((byte) 123) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class132 var100 = var19[var52];
            if (var100.field3139 != null) {
                for (int var101 = 1; var101 < var100.field3139.length; var101 += 2) {
                    var100.field3139[var101] = var3.method592((byte) -125);
                }
            }
            if (var100.field3121 != null) {
                for (int var102 = 3; var102 < var100.field3121.length - 2; var102 += 2) {
                    var100.field3121[var102] = var3.method592((byte) -122);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method592((byte) -107);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method592((byte) -115);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class132 var97 = var19[var55];
            if (var97.field3121 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3121.length; var99 += 2) {
                    var98 = var98 + var3.method570((byte) 123) + 1;
                    var97.field3121[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class132 var94 = var19[var56];
            if (var94.field3139 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3139.length; var96 += 2) {
                    var95 = var3.method570((byte) 123) + var95 + 1;
                    var94.field3139[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method570((byte) 123);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method570((byte) 123) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1455[var61] = (byte) (this.field1455[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                var62 += 2;
                int var67 = (var66 - var59) / 2 + (var66 - var59) * var60;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class72.method516(var67, var66 - var59, 4346);
                    var67 += var65 - var60;
                    this.field1455[var68] = (byte) (this.field1455[var68] * var69 + 32 >> 6);
                }
                var60 = var65;
                var59 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field1455[var64] = (byte) (this.field1455[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var3.method570((byte) 123);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var3.method570((byte) 123) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1458[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1458[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) * var73 + (var79 - var72) / 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class72.method516(var81, var79 - var72, 4346);
                    int var84 = (this.field1458[var82] & 0xFF) + var83;
                    var81 += var80 - var73;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1458[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field1458[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1458[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3124 = var3.method570((byte) 123);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class132 var93 = var19[var87];
            if (var93.field3139 != null) {
                var93.field3118 = var3.method570((byte) 123);
            }
            if (var93.field3121 != null) {
                var93.field3140 = var3.method570((byte) 123);
            }
            if (var93.field3124 > 0) {
                var93.field3125 = var3.method570((byte) 123);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3137 = var3.method570((byte) 123);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class132 var92 = var19[var89];
            if (var92.field3137 > 0) {
                var92.field3123 = var3.method570((byte) 123);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class132 var91 = var19[var90];
            if (var91.field3123 > 0) {
                var91.field3135 = var3.method570((byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BII)Lqf;")
    public static final class117 method489(byte arg0, int arg1, int arg2) {
        int var3 = arg1 - arg2;
        field1447++;
        if (var3 < -9) {
            return class80.field1824;
        }
        if (arg0 != 66) {
            field1451 = null;
        }
        if (var3 < -6) {
            return class99.field2385;
        } else if (var3 < -3) {
            return class50.field1062;
        } else if (var3 < 0) {
            return class47.field954;
        } else if (var3 > 9) {
            return class115.field2729;
        } else if (var3 > 6) {
            return class48.field1006;
        } else if (var3 > 3) {
            return class40.field799;
        } else if (var3 > 0) {
            return class68.field1432;
        } else {
            return class89.field2158;
        }
    }
}
