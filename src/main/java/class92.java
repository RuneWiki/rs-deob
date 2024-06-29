import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class92 extends class171 {

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "[I")
    private int[] field1469;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "[Lrl;")
    public class189[] field1473;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "[B")
    public byte[] field1479;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "[B")
    public byte[] field1470;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "[Lid;")
    public class253[] field1457;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "[S")
    public short[] field1475;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "[B")
    public byte[] field1480;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "[S")
    public static short[] field1458 = new short[256];

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Lok;")
    private static class146 field1463 = class235.method1724(-12908, "Loading textures )2 ");

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Lok;")
    public static class146 field1462 = class235.method1724(-12908, "loginscreen");

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Lok;")
    public static class146 field1460 = class235.method1724(-12908, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field1468 = 0;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Lok;")
    public static class146 field1474 = field1463;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field1464 = -1;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "Lok;")
    public static class146 field1465 = class235.method1724(-12908, "(Y");

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lok;")
    private static class146 field1472 = class235.method1724(-12908, "Loading title screen )2 ");

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field1476 = 0;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "Lok;")
    public static class146 field1478 = class235.method1724(-12908, "Lade)3)3)3");

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Lok;")
    private static class146 field1467 = class235.method1724(-12908, "Face here");

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "Lok;")
    public static class146 field1484 = field1467;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "Lok;")
    public static class146 field1482 = field1472;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Lbn;")
    public static class62 field1456;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "[[Lr;")
    public static class264[][] field1459;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([J[II)V", line = 5)
    public static final void method631(long[] arg0, int[] arg1, int arg2) {
        field1477++;
        class4.method15((byte) -71, 0, arg1, arg0, arg0.length - 1);
        if (arg2 != 128) {
            field1456 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)Lk;", line = 16)
    public static final class228 method632(byte arg0) {
        field1455++;
        int var1 = -41 / ((arg0 + 1) / 63);
        return class267.field4600 < class288.field4927.length ? class288.field4927[class267.field4600++] : null;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V", line = 30)
    public static void method633(byte arg0) {
        field1456 = null;
        field1463 = null;
        field1460 = null;
        field1458 = null;
        field1482 = null;
        field1462 = null;
        field1474 = null;
        field1478 = null;
        field1459 = (class264[][]) null;
        field1467 = null;
        field1472 = null;
        if (arg0 == -1) {
            field1484 = null;
            field1465 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V", line = 83)
    public final void method634(int arg0) {
        this.field1469 = null;
        if (arg0 >= -103) {
            method633((byte) -12);
        }
        field1466++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lrb;[B[II)Z", line = 97)
    public final boolean method635(class215 arg0, byte[] arg1, int[] arg2, int arg3) {
        int var5 = 0;
        field1471++;
        boolean var6 = true;
        class253 var7 = null;
        for (int var8 = arg3; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1469[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method1599(var9 >> 2, 0, arg2);
                        } else {
                            var7 = arg0.method1602((byte) 59, arg2, var9 >> 2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1457[var8] = var7;
                        this.field1469[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()V", line = 146)
    public static final void method636() {
        class229.field3821 = 0;
        label194: for (int var0 = 0; var0 < class117.field1889; var0++) {
            class302 var1 = class210.field3471[var0];
            if (class216.field3565 != null) {
                for (int var2 = 0; var2 < class216.field3565.length; var2++) {
                    if (class216.field3565[var2] != -1000000 && (var1.field5163 <= class216.field3565[var2] || var1.field5164 <= class216.field3565[var2]) && (var1.field5166 <= class203.field3380[var2] || var1.field5174 <= class203.field3380[var2]) && (var1.field5166 >= class156.field2616[var2] || var1.field5174 >= class156.field2616[var2]) && (var1.field5178 <= class56.field994[var2] || var1.field5175 <= class56.field994[var2]) && (var1.field5178 >= class133.field2240[var2] || var1.field5175 >= class133.field2240[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field5181 == 1) {
                int var3 = var1.field5187 + class132.field2230 - class106.field1703;
                if (var3 >= 0 && var3 <= class132.field2230 + class132.field2230) {
                    int var4 = var1.field5170 + class132.field2230 - class175.field2932;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field5183 + class132.field2230 - class175.field2932;
                    if (var5 > class132.field2230 + class132.field2230) {
                        var5 = class132.field2230 + class132.field2230;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class202.field3364[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class82.field1311 - var1.field5166;
                        if (var7 > 32) {
                            var1.field5176 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field5176 = 2;
                            var7 = -var7;
                        }
                        var1.field5169 = (var1.field5178 - class287.field4923 << 8) / var7;
                        var1.field5173 = (var1.field5175 - class287.field4923 << 8) / var7;
                        var1.field5180 = (var1.field5163 - class298.field5066 << 8) / var7;
                        var1.field5191 = (var1.field5164 - class298.field5066 << 8) / var7;
                        class64.field1106[class229.field3821++] = var1;
                    }
                }
            } else if (var1.field5181 == 2) {
                int var8 = var1.field5170 + class132.field2230 - class175.field2932;
                if (var8 >= 0 && var8 <= class132.field2230 + class132.field2230) {
                    int var9 = var1.field5187 + class132.field2230 - class106.field1703;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field5177 + class132.field2230 - class106.field1703;
                    if (var10 > class132.field2230 + class132.field2230) {
                        var10 = class132.field2230 + class132.field2230;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class202.field3364[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class287.field4923 - var1.field5178;
                        if (var12 > 32) {
                            var1.field5176 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field5176 = 4;
                            var12 = -var12;
                        }
                        var1.field5165 = (var1.field5166 - class82.field1311 << 8) / var12;
                        var1.field5167 = (var1.field5174 - class82.field1311 << 8) / var12;
                        var1.field5180 = (var1.field5163 - class298.field5066 << 8) / var12;
                        var1.field5191 = (var1.field5164 - class298.field5066 << 8) / var12;
                        class64.field1106[class229.field3821++] = var1;
                    }
                }
            } else if (var1.field5181 == 4) {
                int var13 = var1.field5163 - class298.field5066;
                if (var13 > 128) {
                    int var14 = var1.field5170 + class132.field2230 - class175.field2932;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field5183 + class132.field2230 - class175.field2932;
                    if (var15 > class132.field2230 + class132.field2230) {
                        var15 = class132.field2230 + class132.field2230;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field5187 + class132.field2230 - class106.field1703;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field5177 + class132.field2230 - class106.field1703;
                        if (var17 > class132.field2230 + class132.field2230) {
                            var17 = class132.field2230 + class132.field2230;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class202.field3364[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field5176 = 5;
                            var1.field5165 = (var1.field5166 - class82.field1311 << 8) / var13;
                            var1.field5167 = (var1.field5174 - class82.field1311 << 8) / var13;
                            var1.field5169 = (var1.field5178 - class287.field4923 << 8) / var13;
                            var1.field5173 = (var1.field5175 - class287.field4923 << 8) / var13;
                            class64.field1106[class229.field3821++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I", line = 403)
    public static final int method637(int arg0, int arg1, int arg2) {
        int var3 = -72 % ((arg2) / 51);
        field1481++;
        int var4 = arg0 >> 31 & arg1 - 1;
        return ((arg0 >>> 31) + arg0) % arg1 + var4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V", line = 429)
    public static final void method638(int arg0, int arg1, int arg2, int arg3) {
        class264 var4 = class165.method1289(arg0, true, arg2);
        if (var4 != null && var4.field4433 != null) {
            class124 var5 = new class124();
            var5.field2039 = var4;
            var5.field2031 = var4.field4433;
            class43.method297(3335, var5);
        }
        if (arg1 <= 14) {
            return;
        }
        client.field4081 = arg0;
        class180.field3023 = arg3;
        class272.field4668 = true;
        field1461++;
        class214.field3535 = arg2;
        class164.method1280(false, var4);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 463)
    public class92() {
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B)V", line = 465)
    public class92(byte[] arg0) {
        this.field1469 = new int[128];
        this.field1473 = new class189[128];
        this.field1479 = new byte[128];
        this.field1470 = new byte[128];
        this.field1457 = new class253[128];
        this.field1475 = new short[128];
        this.field1480 = new byte[128];
        int var2 = 0;
        class47 var3 = new class47(arg0);
        while (var3.field860[var3.field857 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method352(255);
        }
        var2++;
        var3.field857++;
        int var6 = var3.field857;
        var3.field857 += var2;
        int var7;
        for (var7 = 0; var3.field860[var3.field857 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method352(255);
        }
        var3.field857++;
        var7++;
        int var10 = var3.field857;
        var3.field857 += var7;
        int var11;
        for (var11 = 0; var3.field860[var3.field857 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method352(255);
        }
        var11++;
        var3.field857++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method368(94);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class189[] var19 = new class189[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class189 var21 = var19[var20] = new class189();
            int var22 = var3.method368(64);
            if (var22 > 0) {
                var21.field3130 = new byte[var22 * 2];
            }
            int var23 = var3.method368(75);
            if (var23 > 0) {
                var21.field3137 = new byte[var23 * 2 + 2];
                var21.field3137[1] = 64;
            }
        }
        int var24 = var3.method368(123);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method368(47);
        int var27;
        for (var27 = 0; var3.field860[var3.field857 + var27] != 0; var27++) {
        }
        byte[] var28 = new byte[var27];
        for (int var29 = 0; var29 < var27; var29++) {
            var28[var29] = var3.method352(255);
        }
        var27++;
        int var30 = 0;
        byte[] var31 = var26 > 0 ? new byte[var26 * 2] : null;
        var3.field857++;
        for (int var32 = 0; var32 < 128; var32++) {
            var30 += var3.method368(-121);
            this.field1475[var32] = (short) var30;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method368(32);
            this.field1475[var34] = (short) (this.field1475[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var28.length > var37) {
                    var35 = var28[var37++];
                } else {
                    var35 = -1;
                }
                var36 = var3.method351(-23095);
            }
            var35--;
            this.field1475[var38] = (short) (this.field1475[var38] + class82.method582(32768, var36 - 1 << 14));
            this.field1469[var38] = var36;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1469[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field860[var6++] - 1;
                    if (var39 >= var4.length) {
                        var40 = -1;
                    } else {
                        var40 = var4[var39++];
                    }
                }
                this.field1479[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1469[var46] != 0) {
                if (var43 == 0) {
                    if (var8.length > var45) {
                        var43 = var8[var45++];
                    } else {
                        var43 = -1;
                    }
                    var44 = var3.field860[var10++] + 16 << 2;
                }
                this.field1480[var46] = (byte) var44;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class189 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field1469[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var48 >= var12.length) {
                        var47 = -1;
                    } else {
                        var47 = var12[var48++];
                    }
                }
                var47--;
                this.field1473[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var28.length > var51) {
                    var52 = var28[var51++];
                } else {
                    var52 = -1;
                }
                if (this.field1469[var54] > 0) {
                    var53 = var3.method368(-114) + 1;
                }
            }
            var52--;
            this.field1470[var54] = (byte) var53;
        }
        this.field1483 = var3.method368(-121) + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class189 var56 = var19[var55];
            if (var56.field3130 != null) {
                for (int var57 = 1; var57 < var56.field3130.length; var57 += 2) {
                    var56.field3130[var57] = var3.method352(255);
                }
            }
            if (var56.field3137 != null) {
                for (int var58 = 3; var58 < var56.field3137.length - 2; var58 += 2) {
                    var56.field3137[var58] = var3.method352(255);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method352(255);
            }
        }
        if (var31 != null) {
            for (int var60 = 1; var60 < var31.length; var60 += 2) {
                var31[var60] = var3.method352(255);
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class189 var62 = var19[var61];
            if (var62.field3137 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field3137.length; var64 += 2) {
                    var63 = var63 + var3.method368(-123) + 1;
                    var62.field3137[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class189 var66 = var19[var65];
            if (var66.field3130 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field3130.length; var68 += 2) {
                    var67 = var67 + var3.method368(119) + 1;
                    var66.field3130[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method368(94);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method368(-103) + (var69 + 1);
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field1470[var73] = (byte) (this.field1470[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                int var76 = (var75 - var71) / 2 + (var75 - var71) * var72;
                byte var77 = var25[var74 + 1];
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class95.method657((byte) -109, var75 - var71, var76);
                    this.field1470[var78] = (byte) (this.field1470[var78] * var79 + 32 >> 6);
                    var76 += var77 - var72;
                }
                var74 += 2;
                var72 = var77;
                var71 = var75;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field1470[var80] = (byte) (this.field1470[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var31 != null) {
            int var82 = var3.method368(-125);
            var31[0] = (byte) var82;
            for (int var83 = 2; var83 < var31.length; var83 += 2) {
                var82 = var82 + var3.method368(91) + 1;
                var31[var83] = (byte) var82;
            }
            byte var84 = var31[0];
            int var85 = var31[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field1480[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field1480[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var31.length) {
                int var89 = var31[var88 + 1] << 1;
                byte var90 = var31[var88];
                var88 += 2;
                int var91 = (var90 - var84) * var85 + ((var90 - var84) / 2);
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class95.method657((byte) 44, var90 - var84, var91);
                    int var94 = (this.field1480[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    var91 += var89 - var85;
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field1480[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field1480[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field1480[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var16; var98++) {
            var19[var98].field3136 = var3.method368(121);
        }
        for (int var99 = 0; var99 < var16; var99++) {
            class189 var100 = var19[var99];
            if (var100.field3130 != null) {
                var100.field3132 = var3.method368(58);
            }
            if (var100.field3137 != null) {
                var100.field3123 = var3.method368(-102);
            }
            if (var100.field3136 > 0) {
                var100.field3126 = var3.method368(111);
            }
        }
        for (int var101 = 0; var101 < var16; var101++) {
            var19[var101].field3122 = var3.method368(43);
        }
        for (int var102 = 0; var102 < var16; var102++) {
            class189 var103 = var19[var102];
            if (var103.field3122 > 0) {
                var103.field3133 = var3.method368(-99);
            }
        }
        for (int var104 = 0; var104 < var16; var104++) {
            class189 var105 = var19[var104];
            if (var105.field3133 > 0) {
                var105.field3138 = var3.method368(-99);
            }
        }
    }
}
