import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class55 {

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1136 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lak;")
    public static class135 field1131 = new class135(64);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lpj;")
    public static class237 field1146 = class33.method353("Benutzeroberfl-=che geladen)3", 79);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lpj;")
    public static class237 field1145 = class33.method353("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 76);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lfa;")
    public static class239 field1144;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public static final void method482(int arg0, int arg1, int arg2) {
        field1132++;
        if (class57.field1172 > 0) {
            class148.method1003(class57.field1172, -45);
            class57.field1172 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        if (arg2 > -94) {
            method485(89, -8, 21, 36, 101, 71, -102, -34, 36, -76, -119);
        }
        int var5 = 0;
        int var6 = class192.field3335 * arg1;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class229.field3910[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class259.field4448[var4++];
                int var12 = class192.field3330[var6++ + arg0];
                if (var11 == 0) {
                    class83.field1558.field3867[var5++] = var12;
                } else {
                    int var13 = 256 - var11 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = var11 + 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class76.field1445[var11];
                    class83.field1558.field3867[var5++] = class272.method1817(class272.method1817(65280, var15) * var14 + var13 * class272.method1817(var12, 65280), 16711680) + class272.method1817(-16711936, var14 * class272.method1817(16711935, var15) + (var13 * class272.method1817(var12, 16711935))) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class83.field1558.field3867[var5++] = class192.field3330[var6++ + arg0];
            }
            var6 += class192.field3335 - 128;
        }
        class83.field1558.method808(arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method483(int arg0) {
        field1137++;
        class115.field2020.method1834(arg0 - 26611);
        field1144 = null;
        class41.field930 = 1;
        if (arg0 != 3) {
            field1131 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLaf;)V")
    public static final void method484(byte arg0, class67 arg1) {
        class10.field196 = 3;
        class177.method1226(true, true);
        class122.field2153 = 0;
        class113.field1983 = 255;
        class141.field2499 = true;
        class59.field1207 = true;
        class22.field401 = true;
        class83.field1557 = false;
        class63.field1256 = true;
        class17.field298 = 0;
        class13.field227 = true;
        field1143++;
        class177.field3096 = 0;
        class204.field3497 = 127;
        class78.field1459 = 127;
        class91.field1656 = 2;
        class238.field4159 = true;
        class20.field382 = true;
        if (arg0 != -28) {
            field1145 = null;
        }
        class165 var2 = null;
        class31.field619 = 0;
        class223.field3837 = true;
        class59.field1212 = true;
        class92.field1662 = true;
        class52.field1099 = true;
        class121.field2135 = 0;
        try {
            class103 var3 = arg1.method548("runescape", arg0 ^ 0xFFFFFF91);
            while (var3.field1823 == 0) {
                class84.method645(1, 1L);
            }
            if (var3.field1823 == 1) {
                var2 = (class165) var3.field1826;
                byte[] var4 = new byte[(int) var2.method1158((byte) 73)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1156(var4, var4.length - var5, var5, 85);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class232.method1543(new class32(var4), 53);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1153((byte) -11);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1141++;
        if (arg8 > -17) {
            return;
        }
        int var11 = arg3 - arg2;
        if (arg3 < class115.field2017) {
            var11++;
        }
        int var12 = arg4 - arg7;
        if (arg4 < class148.field2629) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var44 = arg5 * var13 + arg0 >> 16;
            int var45 = arg0 + ((var13 + 1) * arg5) >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg7 + var13 >> 6;
                if (var47 >= 0 && class144.field2603.length - 1 >= var47) {
                    int var48 = arg6 + var44;
                    int var49 = arg6 + var45;
                    int[][] var50 = class144.field2603[var47];
                    byte[][] var51 = class97.field1718[var47];
                    byte[][] var52 = class205.field3502[var47];
                    byte[][] var53 = class21.field391[var47];
                    byte[][] var54 = class79.field1479[var47];
                    byte[][] var55 = class149.field2647[var47];
                    for (int var56 = 0; var56 < var11; var56++) {
                        int var57 = (var56 + 1) * arg9 + arg10 >> 16;
                        int var58 = arg9 * var56 + arg10 >> 16;
                        int var59 = var57 - var58;
                        if (var59 > 0) {
                            int var60 = arg1 + var57;
                            int var61 = arg2 + var56 >> 6;
                            int var62 = arg1 + var58;
                            int var63 = arg2 + var56 & 0x3F;
                            int var64 = arg7 + var13 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var61 < 0 || var61 > var50.length - 1 || var50[var61] == null) {
                                if (class65.field1296.field3844 != -1) {
                                    var66 = class65.field1296.field3844;
                                } else if ((arg2 + var56 & 0x4) == (arg7 + var13 & 0x4)) {
                                    var66 = class110.field1932[class69.field1354 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var61 < 0 || var61 > (var50.length - 1)) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class192.method1301(var48, var62, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var50[var61][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var51[var61] == null ? 0 : class110.field1932[var51[var61][var65] & 0xFF];
                            int var68 = var55[var61] == null ? 0 : class110.field1932[var55[var61][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class192.method1301(var48, var62, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    byte var69 = var52[var61] == null ? 0 : var52[var61][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class192.method1301(var48, var62, var46, var59, var67);
                                    } else {
                                        class52.method467(var46, var67, -74, true, var66, var62, var69 & 0x3, var59, var48, var70 >> 2, class192.field3330);
                                    }
                                }
                                if (var68 != 0) {
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    byte var71 = var54[var61][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class192.method1301(var48, var62, var46, var59, var68);
                                    }
                                    class52.method467(var46, var68, -89, var67 == 0, 0, var62, var71 & 0x3, var59, var48, var72 >> 2, class192.field3330);
                                }
                            }
                            if (var53[var61] != null) {
                                int var73 = var53[var61][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var59 == 1) {
                                        var74 = var62;
                                    } else {
                                        var74 = var60 - 1;
                                    }
                                    int var75;
                                    if (var46 == 1) {
                                        var75 = var48;
                                    } else {
                                        var75 = var49 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var73 -= 4;
                                        var76 = 13369344;
                                    }
                                    if (var73 == 1) {
                                        class192.method1312(var48, var62, var59, var76);
                                    } else if (var73 == 2) {
                                        class192.method1307(var48, var62, var46, var76);
                                    } else if (var73 == 3) {
                                        class192.method1312(var75, var62, var59, var76);
                                    } else if (var73 == 4) {
                                        class192.method1307(var48, var74, var46, var76);
                                    } else if (var73 == 9) {
                                        class192.method1312(var48, var62, var59, 16777215);
                                        class192.method1307(var48, var62, var46, var76);
                                    } else if (var73 == 10) {
                                        class192.method1312(var75, var62, var59, 16777215);
                                        class192.method1307(var48, var62, var46, var76);
                                    } else if (var73 == 11) {
                                        class192.method1312(var75, var62, var59, 16777215);
                                        class192.method1307(var48, var74, var46, var76);
                                    } else if (var73 == 12) {
                                        class192.method1312(var48, var62, var59, 16777215);
                                        class192.method1307(var48, var74, var46, var76);
                                    } else if (var73 == 17) {
                                        class192.method1307(var48, var62, 1, var76);
                                    } else if (var73 == 18) {
                                        class192.method1307(var75, var62, 1, var76);
                                    } else if (var73 == 19) {
                                        class192.method1307(var75, var74, 1, var76);
                                    } else if (var73 == 20) {
                                        class192.method1307(var48, var74, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class192.method1307(var48 + var78, -var78 + var74, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class192.method1307(var48 + var77, var62 + var77, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var79 = arg6 + var44;
                    for (int var80 = 0; var80 < var11; var80++) {
                        int var82;
                        if (class65.field1296.field3844 != -1) {
                            var82 = class65.field1296.field3844;
                        } else if ((arg2 + var80 & 0x4) == (arg7 + var13 & 0x4)) {
                            var82 = class110.field1932[class69.field1354 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var83 = (arg10 + ((var80 + 1) * arg9) >> 16) + arg1;
                        int var84 = (arg9 * var80 + arg10 >> 16) + arg1;
                        int var85 = var83 - var84;
                        class192.method1301(var79, var84, var46, var85, var82);
                    }
                    var10000 = arg6 + var45;
                }
            }
        }
        for (int var14 = -2; var14 < var12 + 2; var14++) {
            int var15 = (var14 + 1) * arg5 + arg0 >> 16;
            int var16 = arg0 + (arg5 * var14) >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                var10000 = arg6 + var15;
                int var19 = arg7 + var14 >> 6;
                int var20 = arg6 + var16;
                if (var19 >= 0 && (class131.field2311.length - 1) >= var19) {
                    short[][] var21 = class131.field2311[var19];
                    for (int var22 = -2; var22 < var11 + 2; var22++) {
                        int var23 = arg9 * var22 + arg10 >> 16;
                        int var24 = (var22 + 1) * arg9 + arg10 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg2 + var22 >> 6;
                            int var27 = arg1 + var23;
                            var10000 = arg1 + var24;
                            if (var26 >= 0 && var26 <= var21.length - 1) {
                                int var29 = (arg2 + var22 & 0x3F << 6) + (arg7 + var14 & 0x3F);
                                if (var21[var26] != null) {
                                    int var30 = var21[var26][var29] & 0x3FFF;
                                    int var31 = (var21[var26][var29] & 0xFD82) >> 14;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var32 = class252.field4342[var30 - 1].field2741 * var25 / 4;
                                            int var33 = class252.field4342[var30 - 1].field2753 * var25 / 4;
                                            int var34 = class252.field4342[var30 - 1].field2740 * var17 / 4;
                                            class252.field4342[var30 - 1].method1056(var20, var27 - var33, var34, var32);
                                        } else if (var31 == 1) {
                                            int var41 = class184.field3225[var30 - 1].field2740 * var17 / 4;
                                            int var42 = class184.field3225[var30 - 1].field2741 * var25 / 4;
                                            int var43 = class184.field3225[var30 - 1].field2753 * var25 / 4;
                                            class184.field3225[var30 - 1].method1056(var20, var27 - var43, var41, var42);
                                        } else if (var31 == 2) {
                                            int var38 = class73.field1408[var30 - 1].field2740 * var17 / 4;
                                            int var39 = class73.field1408[var30 - 1].field2753 * var25 / 4;
                                            int var40 = class73.field1408[var30 - 1].field2741 * var25 / 4;
                                            class73.field1408[var30 - 1].method1056(var20, var27 - var39, var38, var40);
                                        } else if (var31 == 3) {
                                            int var35 = class107.field1907[var30 - 1].field2740 * var17 / 4;
                                            int var36 = class107.field1907[var30 - 1].field2741 * var25 / 4;
                                            int var37 = class107.field1907[var30 - 1].field2753 * var25 / 4;
                                            class107.field1907[var30 - 1].method1056(var20, var27 - var37, var35, var36);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BII)V")
    public static final void method486(byte arg0, int arg1, int arg2) {
        if (class106.field1862 != arg1) {
            class182.field3199 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class182.field3199[var3] = (var3 << 12) / arg1;
            }
            class110.field1937 = arg1 - 1;
            class158.field2845 = arg1 == 64 ? 2048 : 4096;
            class106.field1862 = arg1;
        }
        field1134++;
        if (class193.field3342 != arg2) {
            if (class106.field1862 == arg2) {
                class185.field3233 = class182.field3199;
            } else {
                class185.field3233 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class185.field3233[var4] = (var4 << 12) / arg2;
                }
            }
            class193.field3342 = arg2;
            class254.field4363 = arg2 - 1;
        }
        if (arg0 > -29) {
            field1138 = 96;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLie;)Lwh;")
    public static final class189 method487(boolean arg0, class32 arg1) {
        field1133++;
        class189 var2 = new class189();
        if (arg0) {
            field1144 = null;
        }
        var2.field3293 = arg1.method339(-16777216);
        var2.field3291 = class14.method127(var2.field3293, -122);
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILw;)Lw;")
    public static final class141 method488(int arg0, class141 arg1) {
        field1140++;
        if (arg1.field2535 != -1) {
            return class70.method572(20043, arg1.field2535);
        }
        int var2 = arg1.field2530 >>> 16;
        if (arg0 != 2074180784) {
            return null;
        }
        class275 var3 = new class275(class164.field2915);
        for (class58 var4 = (class58) var3.method1871((byte) -40); var4 != null; var4 = (class58) var3.method1872(9361)) {
            if (var4.field1191 == var2) {
                return class70.method572(20043, (int) var4.field1530);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILpj;SLpj;JIB)V")
    public static final void method489(int arg0, class237 arg1, short arg2, class237 arg3, long arg4, int arg5, byte arg6) {
        if (arg6 > -69) {
            return;
        }
        field1139++;
        if (class247.field4306 || class271.field4664 >= 500) {
            return;
        }
        class180.field3168[class271.field4664] = arg1;
        class215.field3747[class271.field4664] = arg3;
        class235.field4090[class271.field4664] = arg2;
        class35.field760[class271.field4664] = arg4;
        class119.field2089[class271.field4664] = arg0;
        class135.field2358[class271.field4664] = arg5;
        class271.field4664++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
    public static final int method490(int arg0, int arg1) {
        field1142++;
        if (arg1 < 0) {
            return 0;
        }
        class44 var2 = (class44) class64.field1280.method568((long) arg1, -1);
        if (var2 == null) {
            return class3.method52(arg1, (byte) -50).field4468;
        }
        int var3 = 0;
        for (int var4 = arg0; var4 < var2.field970.length; var4++) {
            if (var2.field970[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class3.method52(arg1, (byte) -98).field4468 - var2.field970.length);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lfa;I)V")
    public static final void method491(class239 arg0, int arg1) {
        field1147++;
        class28.field574 = arg0;
        if (arg1 != -6219) {
            field1138 = -20;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static void method492(int arg0) {
        field1145 = null;
        field1131 = null;
        field1144 = null;
        if (arg0 != -2593) {
            method489(118, (class237) null, (short) 32, (class237) null, -106L, 14, (byte) 23);
        }
        field1146 = null;
    }
}
