import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class16 {

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[[I")
    public int[][] field388;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Lv;")
    private static class122 field408 = class55.method425(-125, "skill)2");

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lv;")
    public static class122 field385 = field408;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Lhd;")
    public static class46 field406 = new class46();

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "Lv;")
    public static class122 field412 = class55.method425(-52, "Wen m\u001c1chten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Lv;")
    private static class122 field411 = class55.method425(-118, "World");

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Lv;")
    public static class122 field410 = field411;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lrd;")
    public static class106 field397;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 10)
    public final void method145(byte arg0) {
        if (arg0 != -30) {
            return;
        }
        for (int var2 = 0; var2 < this.field394; var2++) {
            for (int var3 = 0; var3 < this.field400; var3++) {
                if (var2 == 0 || var3 == 0 || this.field394 - 1 == var2 || this.field400 - 1 == var3) {
                    this.field388[var2][var3] = 16777215;
                } else {
                    this.field388[var2][var3] = 16777216;
                }
            }
        }
        field387++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 41)
    public static void method146(int arg0) {
        field412 = null;
        field408 = null;
        if (arg0 > -101) {
            return;
        }
        field397 = null;
        field410 = null;
        field406 = null;
        field385 = null;
        field411 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBIIIZI)V", line = 59)
    public final void method147(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field393++;
        int var8 = arg6 - this.field403;
        int var9 = 256;
        if (arg1 < 22) {
            field409 = 121;
        }
        if (arg5) {
            var9 += 131072;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg2;
            arg2 = arg4;
            arg4 = var10;
        }
        int var11 = arg0 - this.field382;
        for (int var12 = var11; var12 < arg2 + var11; var12++) {
            if (var12 >= 0 && this.field394 > var12) {
                for (int var13 = var8; var13 < arg4 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field400) {
                        this.method151(var13, (byte) 44, var12, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V", line = 110)
    public final void method148(byte arg0, int arg1, int arg2) {
        if (arg0 == 26) {
            int var4 = arg2 - this.field403;
            field383++;
            int var5 = arg1 - this.field382;
            this.field388[var5][var4] = class30.method286(this.field388[var5][var4], 14680063);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V", line = 130)
    public static final void method149(byte arg0) {
        field392++;
        class127 var1 = (class127) class24.field645.method311((byte) 101);
        int var2 = 124 / ((arg0 + 22) / 49);
        while (var1 != null) {
            if (class34.field848 != var1.field3108 || field396 > var1.field3104) {
                var1.method249(0);
            } else if (var1.field3110 <= field396) {
                if (var1.field3094 > 0) {
                    class80 var3 = class94.field2423[var1.field3094 - 1];
                    if (var3 != null && var3.field343 >= 0 && var3.field343 < 13312 && var3.field349 >= 0 && var3.field349 < 13312) {
                        var1.method1006(var3.field343, (byte) 59, var3.field349, field396, class108.method837((byte) 59, var3.field343, var3.field349, var1.field3108) - var1.field3084);
                    }
                }
                if (var1.field3094 < 0) {
                    int var4 = -var1.field3094 - 1;
                    class55 var5;
                    if (class55.field1435 == var4) {
                        var5 = class70.field1828;
                    } else {
                        var5 = class125.field3043[var4];
                    }
                    if (var5 != null && var5.field343 >= 0 && var5.field343 < 13312 && var5.field349 >= 0 && var5.field349 < 13312) {
                        var1.method1006(var5.field343, (byte) -101, var5.field349, field396, class108.method837((byte) 59, var5.field343, var5.field349, var1.field3108) - var1.field3084);
                    }
                }
                var1.method1005(class64.field1663, false);
                class90.field2306.method39(class34.field848, (int) var1.field3107, (int) var1.field3078, (int) var1.field3096, 60, var1, var1.field3100, -1, false);
            }
            var1 = (class127) class24.field645.method302((byte) -69);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V", line = 183)
    private final void method150(int arg0, int arg1, int arg2, int arg3) {
        this.field388[arg1][arg2] = class74.method623(this.field388[arg1][arg2], arg3);
        field389++;
        if (arg0 >= -67) {
            this.field403 = 32;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBII)V", line = 197)
    private final void method151(int arg0, byte arg1, int arg2, int arg3) {
        field407++;
        this.field388[arg2][arg0] = class30.method286(this.field388[arg2][arg0], 16777215 - arg3);
        if (arg1 != 44) {
            this.method157(68, 42, 89, 22, -38, -118, true);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIZ)V", line = 217)
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field403;
        int var8 = arg3 - this.field382;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method150(-104, var8, var7, 128);
                this.method150(-81, var8 - 1, var7, 8);
            }
            if (arg2 == 1) {
                this.method150(-81, var8, var7, 2);
                this.method150(-119, var8, var7 + 1, 32);
            }
            if (arg2 == 2) {
                this.method150(-99, var8, var7, 8);
                this.method150(arg4 ^ 0x53, var8 + 1, var7, 128);
            }
            if (arg2 == 3) {
                this.method150(-99, var8, var7, 32);
                this.method150(arg4 ^ 0x7B, var8, var7 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method150(-81, var8, var7, 1);
                this.method150(-121, var8 - 1, var7 + 1, 16);
            }
            if (arg2 == 1) {
                this.method150(-111, var8, var7, 4);
                this.method150(-108, var8 + 1, var7 + 1, 64);
            }
            if (arg2 == 2) {
                this.method150(-93, var8, var7, 16);
                this.method150(-120, var8 + 1, var7 + -1, 1);
            }
            if (arg2 == 3) {
                this.method150(arg4 - 90, var8, var7, 64);
                this.method150(-100, var8 - 1, var7 + -1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method150(arg4 - 99, var8, var7, 130);
                this.method150(-73, var8 - 1, var7, 8);
                this.method150(arg4 ^ 0x6D, var8, var7 + 1, 32);
            }
            if (arg2 == 1) {
                this.method150(-119, var8, var7, 10);
                this.method150(-121, var8, var7 + 1, 32);
                this.method150(-128, var8 + 1, var7, 128);
            }
            if (arg2 == 2) {
                this.method150(-92, var8, var7, 40);
                this.method150(-99, var8 + 1, var7, 128);
                this.method150(arg4 - 80, var8, var7 - 1, 2);
            }
            if (arg2 == 3) {
                this.method150(-106, var8, var7, 160);
                this.method150(-70, var8, var7 - 1, 2);
                this.method150(-94, var8 - 1, var7, 8);
            }
        }
        if (arg4 != -4) {
            method160(44, 123);
        }
        field390++;
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method150(-87, var8, var7, 65536);
                this.method150(-121, var8 - 1, var7, 4096);
            }
            if (arg2 == 1) {
                this.method150(-102, var8, var7, 1024);
                this.method150(-76, var8, var7 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method150(-118, var8, var7, 4096);
                this.method150(arg4 - 117, var8 + 1, var7, 65536);
            }
            if (arg2 == 3) {
                this.method150(-115, var8, var7, 16384);
                this.method150(arg4 ^ 0x6A, var8, var7 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method150(-119, var8, var7, 512);
                this.method150(-75, var8 - 1, var7 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method150(-80, var8, var7, 2048);
                this.method150(arg4 - 93, var8 + 1, var7 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method150(-91, var8, var7, 8192);
                this.method150(-125, var8 + 1, var7 + -1, 512);
            }
            if (arg2 == 3) {
                this.method150(-128, var8, var7, 32768);
                this.method150(arg4 - 89, var8 + -1, var7 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method150(-114, var8, var7, 66560);
            this.method150(-105, var8 - 1, var7, 4096);
            this.method150(-99, var8, var7 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method150(-97, var8, var7, 5120);
            this.method150(-117, var8, var7 + 1, 16384);
            this.method150(-86, var8 + 1, var7, 65536);
        }
        if (arg2 == 2) {
            this.method150(-118, var8, var7, 20480);
            this.method150(-103, var8 + 1, var7, 65536);
            this.method150(-69, var8, var7 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method150(-98, var8, var7, 81920);
            this.method150(-75, var8, var7 - 1, 1024);
            this.method150(arg4 - 100, var8 + -1, var7, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 424)
    public static final void method153(int arg0) {
        field401++;
        if (class131.field3158 == 145) {
            int var1 = class14.field372.method520(-110);
            int var2 = (var1 >> 4 & 0x7) + class73.field1887;
            int var3 = (var1 & 0x7) + class47.field1214;
            int var4 = class14.field372.method506((byte) -90);
            int var5 = class14.field372.method506((byte) -90);
            int var6 = class14.field372.method506((byte) -90);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class34 var7 = class50.field1260[class34.field848][var2][var3];
                if (var7 != null) {
                    for (class102 var8 = (class102) var7.method311((byte) 91); var8 != null; var8 = (class102) var7.method302((byte) -55)) {
                        if ((var4 & 0x7FFF) == var8.field2529 && var8.field2538 == var5) {
                            var8.field2538 = var6;
                            break;
                        }
                    }
                    class109.method849((byte) -92, var3, var2);
                }
            }
        } else if (class131.field3158 == 244) {
            int var9 = class14.field372.method508(-87);
            int var10 = class14.field372.method524((byte) -1);
            int var11 = class14.field372.method502((byte) 44);
            int var12 = class14.field372.method494(255);
            int var13 = (var12 >> 4 & 0x7) + class73.field1887;
            int var14 = (var12 & 0x7) + class47.field1214;
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && class55.field1435 != var11) {
                class102 var15 = new class102();
                var15.field2538 = var10;
                var15.field2529 = var9;
                if (class50.field1260[class34.field848][var13][var14] == null) {
                    class50.field1260[class34.field848][var13][var14] = new class34();
                }
                class50.field1260[class34.field848][var13][var14].method312(false, var15);
                class109.method849((byte) 53, var14, var13);
            }
        } else if (class131.field3158 == 42) {
            int var16 = class14.field372.method524((byte) -123);
            int var17 = class14.field372.method530((byte) 92);
            int var18 = (var17 >> 4 & 0x7) + class73.field1887;
            int var19 = (var17 & 0x7) + class47.field1214;
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class34 var20 = class50.field1260[class34.field848][var18][var19];
                if (var20 != null) {
                    for (class102 var21 = (class102) var20.method311((byte) 83); var21 != null; var21 = (class102) var20.method302((byte) -60)) {
                        if ((var16 & 0x7FFF) == var21.field2529) {
                            var21.method249(0);
                            break;
                        }
                    }
                    if (var20.method311((byte) 109) == null) {
                        class50.field1260[class34.field848][var18][var19] = null;
                    }
                    class109.method849((byte) 47, var19, var18);
                }
            }
        } else if (class131.field3158 == 169) {
            int var22 = class14.field372.method520(-121);
            int var23 = class73.field1887 + (var22 >> 4 & 0x7);
            int var24 = (var22 & 0x7) + class47.field1214;
            int var25 = class14.field372.method482(0) + var23;
            int var26 = var24 + class14.field372.method482(0);
            int var27 = class14.field372.method501(-1653);
            int var28 = class14.field372.method506((byte) -90);
            int var29 = class14.field372.method520(-118) * 4;
            int var30 = class14.field372.method520(-113) * 4;
            int var31 = class14.field372.method506((byte) -90);
            int var32 = class14.field372.method506((byte) -90);
            int var33 = class14.field372.method520(-121);
            int var34 = class14.field372.method520(-116);
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && var28 != 65535) {
                int var35 = var23 * 128 + 64;
                int var36 = var25 * 128 + 64;
                int var37 = var26 * 128 + 64;
                int var38 = var24 * 128 + 64;
                class127 var39 = new class127(var28, class34.field848, var35, var38, class108.method837((byte) 59, var35, var38, class34.field848) - var29, field396 + var31, field396 + var32, var33, var34, var27, var30);
                var39.method1006(var36, (byte) -109, var37, field396 + var31, -var30 + class108.method837((byte) 59, var36, var37, class34.field848));
                class24.field645.method312(false, var39);
            }
        } else if (class131.field3158 == 227) {
            int var40 = class14.field372.method530((byte) 92);
            int var41 = (var40 >> 4 & 0x7) + class73.field1887;
            int var42 = (var40 & 0x7) + class47.field1214;
            int var43 = class14.field372.method497((byte) 8);
            int var44 = var43 & 0x3;
            int var45 = var43 >> 2;
            int var46 = class72.field1876[var45];
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                class7.method80(var42, var44, -1, 0, class34.field848, var41, -1, var46, (byte) 97, var45);
            }
        } else if (class131.field3158 == 204) {
            int var47 = class14.field372.method497((byte) 8);
            int var48 = var47 >> 2;
            int var49 = class72.field1876[var48];
            int var50 = var47 & 0x3;
            int var51 = class14.field372.method530((byte) 92);
            int var52 = (var51 & 0x7) + class47.field1214;
            int var53 = (var51 >> 4 & 0x7) + class73.field1887;
            int var54 = class14.field372.method506((byte) -90);
            if (var53 >= 0 && var52 >= 0 && var53 < 103 && var52 < 103) {
                int var55 = class93.field2372[class34.field848][var53][var52];
                int var56 = class93.field2372[class34.field848][var53 + 1][var52];
                int var57 = class93.field2372[class34.field848][var53 + 1][var52 + 1];
                int var58 = class93.field2372[class34.field848][var53][var52 + 1];
                if (var49 == 0) {
                    class8 var59 = class90.field2306.method16(class34.field848, var53, var52);
                    if (var59 != null) {
                        int var60 = var59.field178 >> 14 & 0x7FFF;
                        if (var48 == 2) {
                            var59.field203 = new class66(var60, 2, var50 + 4, var55, var56, var57, var58, var54, false);
                            var59.field183 = new class66(var60, 2, var50 + 1 & 0x3, var55, var56, var57, var58, var54, false);
                        } else {
                            var59.field203 = new class66(var60, var48, var50, var55, var56, var57, var58, var54, false);
                        }
                    }
                }
                if (var49 == 1) {
                    class81 var61 = class90.field2306.method11(class34.field848, var53, var52);
                    if (var61 != null) {
                        var61.field2111 = new class66(var61.field2107 >> 14 & 0x7FFF, 4, 0, var55, var56, var57, var58, var54, false);
                    }
                }
                if (var49 == 2) {
                    if (var48 == 11) {
                        var48 = 10;
                    }
                    class37 var62 = class90.field2306.method46(class34.field848, var53, var52);
                    if (var62 != null) {
                        var62.field976 = new class66(var62.field987 >> 14 & 0x7FFF, var48, var50, var55, var56, var57, var58, var54, false);
                    }
                }
                if (var49 == 3) {
                    class32 var63 = class90.field2306.method49(class34.field848, var53, var52);
                    if (var63 != null) {
                        var63.field788 = new class66(var63.field776 >> 14 & 0x7FFF, 22, var50, var55, var56, var57, var58, var54, false);
                    }
                }
            }
        } else {
            if (class131.field3158 == 196) {
                int var64 = class14.field372.method520(-119);
                int var65 = class73.field1887 + (var64 >> 4 & 0x7);
                int var66 = (var64 & 0x7) + class47.field1214;
                int var67 = class14.field372.method506((byte) -90);
                int var68 = class14.field372.method520(-108);
                int var69 = var68 >> 4 & 0xF;
                int var70 = var68 & 0x7;
                if (class70.field1828.field287[0] >= var65 - var69 && class70.field1828.field287[0] <= var65 + var69 && class70.field1828.field307[0] >= var66 - var69 && var66 + var69 >= class70.field1828.field307[0] && class56.field1465 != 0 && var70 > 0 && class83.field2151 < 50) {
                    class6.field149[class83.field2151] = var67;
                    class28.field722[class83.field2151] = var70;
                    class50.field1262[class83.field2151] = 0;
                    class10.field213[class83.field2151] = null;
                    class83.field2151++;
                }
            }
            if (arg0 > 0) {
                if (class131.field3158 == 249) {
                    int var71 = class14.field372.method520(-124);
                    int var72 = class47.field1214 + (var71 & 0x7);
                    int var73 = (var71 >> 4 & 0x7) + class73.field1887;
                    int var74 = class14.field372.method506((byte) -90);
                    int var75 = class14.field372.method520(-126);
                    int var76 = class14.field372.method506((byte) -90);
                    if (var73 >= 0 && var72 >= 0 && var73 < 104 && var72 < 104) {
                        int var77 = var73 * 128 + 64;
                        int var78 = var72 * 128 + 64;
                        class94 var79 = new class94(var74, class34.field848, var77, var78, class108.method837((byte) 59, var77, var78, class34.field848) - var75, var76, field396);
                        class25.field672.method312(false, var79);
                    }
                } else if (class131.field3158 == 113) {
                    int var80 = class14.field372.method520(-118);
                    int var81 = var80 & 0x3;
                    int var82 = var80 >> 2;
                    int var83 = class72.field1876[var82];
                    int var84 = class14.field372.method520(-111);
                    int var85 = (var84 >> 4 & 0x7) + class73.field1887;
                    int var86 = (var84 & 0x7) + class47.field1214;
                    int var87 = class14.field372.method508(-88);
                    if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                        class7.method80(var86, var81, var87, 0, class34.field848, var85, -1, var83, (byte) 104, var82);
                    }
                } else {
                    if (class131.field3158 == 21) {
                        int var88 = class14.field372.method506((byte) -90);
                        int var89 = class14.field372.method530((byte) 92);
                        int var90 = var89 & 0x3;
                        int var91 = var89 >> 2;
                        int var92 = class72.field1876[var91];
                        int var93 = class14.field372.method524((byte) 62);
                        int var94 = class14.field372.method520(-120);
                        int var95 = (var94 & 0x7) + class47.field1214;
                        int var96 = class73.field1887 + (var94 >> 4 & 0x7);
                        int var97 = class14.field372.method524((byte) -119);
                        byte var98 = class14.field372.method492(126);
                        byte var99 = class14.field372.method492(122);
                        int var100 = class14.field372.method524((byte) 62);
                        byte var101 = class14.field372.method514(128);
                        byte var102 = class14.field372.method514(128);
                        class55 var103;
                        if (class55.field1435 == var88) {
                            var103 = class70.field1828;
                        } else {
                            var103 = class125.field3043[var88];
                        }
                        if (var103 != null) {
                            class42 var104 = class14.method124((byte) 52, var100);
                            int var105 = class93.field2372[class34.field848][var96][var95];
                            int var106 = class93.field2372[class34.field848][var96 + 1][var95 + 1];
                            int var107 = class93.field2372[class34.field848][var96 + 1][var95];
                            int var108 = class93.field2372[class34.field848][var96][var95 + 1];
                            class68 var109 = var104.method367(var107, var108, var106, var91, 11548, var105, var90);
                            if (var109 != null) {
                                class7.method80(var95, 0, -1, var93 + 1, class34.field848, var96, var97 + 1, var92, (byte) 123, 0);
                                var103.field1446 = field396 + var93;
                                var103.field1422 = field396 + var97;
                                var103.field1453 = var109;
                                int var110 = var104.field1090;
                                if (var98 > var101) {
                                    byte var111 = var98;
                                    var98 = var101;
                                    var101 = var111;
                                }
                                int var112 = var104.field1080;
                                if (var102 > var99) {
                                    byte var113 = var102;
                                    var102 = var99;
                                    var99 = var113;
                                }
                                if (var90 == 1 || var90 == 3) {
                                    var110 = var104.field1080;
                                    var112 = var104.field1090;
                                }
                                var103.field1423 = var95 * 128 + var112 * 64;
                                var103.field1431 = var96 * 128 + var110 * 64;
                                var103.field1449 = class108.method837((byte) 59, var103.field1431, var103.field1423, class34.field848);
                                var103.field1452 = var96 + var98;
                                var103.field1427 = var95 + var99;
                                var103.field1440 = var96 + var101;
                                var103.field1421 = var95 + var102;
                            }
                        }
                    }
                    if (class131.field3158 == 121) {
                        int var114 = class14.field372.method502((byte) 44);
                        int var115 = class14.field372.method502((byte) 44);
                        int var116 = class14.field372.method494(255);
                        int var117 = (var116 >> 4 & 0x7) + class73.field1887;
                        int var118 = (var116 & 0x7) + class47.field1214;
                        if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                            class102 var119 = new class102();
                            var119.field2529 = var115;
                            var119.field2538 = var114;
                            if (class50.field1260[class34.field848][var117][var118] == null) {
                                class50.field1260[class34.field848][var117][var118] = new class34();
                            }
                            class50.field1260[class34.field848][var117][var118].method312(false, var119);
                            class109.method849((byte) -89, var118, var117);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIZII)V", line = 953)
    public final void method154(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field403;
        int var8 = arg5 - this.field382;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method151(var7, (byte) 44, var8, 128);
                this.method151(var7, (byte) 44, var8 - 1, 8);
            }
            if (arg2 == 1) {
                this.method151(var7, (byte) 44, var8, 2);
                this.method151(var7 + 1, (byte) 44, var8, 32);
            }
            if (arg2 == 2) {
                this.method151(var7, (byte) 44, var8, 8);
                this.method151(var7, (byte) 44, var8 + 1, 128);
            }
            if (arg2 == 3) {
                this.method151(var7, (byte) 44, var8, 32);
                this.method151(var7 - 1, (byte) 44, var8, 2);
            }
        }
        if (arg1) {
            return;
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method151(var7, (byte) 44, var8, 1);
                this.method151(var7 + 1, (byte) 44, var8 - 1, 16);
            }
            if (arg2 == 1) {
                this.method151(var7, (byte) 44, var8, 4);
                this.method151(var7 + 1, (byte) 44, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method151(var7, (byte) 44, var8, 16);
                this.method151(var7 - 1, (byte) 44, var8 + 1, 1);
            }
            if (arg2 == 3) {
                this.method151(var7, (byte) 44, var8, 64);
                this.method151(var7 - 1, (byte) 44, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method151(var7, (byte) 44, var8, 130);
                this.method151(var7, (byte) 44, var8 - 1, 8);
                this.method151(var7 + 1, (byte) 44, var8, 32);
            }
            if (arg2 == 1) {
                this.method151(var7, (byte) 44, var8, 10);
                this.method151(var7 + 1, (byte) 44, var8, 32);
                this.method151(var7, (byte) 44, var8 + 1, 128);
            }
            if (arg2 == 2) {
                this.method151(var7, (byte) 44, var8, 40);
                this.method151(var7, (byte) 44, var8 + 1, 128);
                this.method151(var7 - 1, (byte) 44, var8, 2);
            }
            if (arg2 == 3) {
                this.method151(var7, (byte) 44, var8, 160);
                this.method151(var7 - 1, (byte) 44, var8, 2);
                this.method151(var7, (byte) 44, var8 - 1, 8);
            }
        }
        field384++;
        if (!arg3) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method151(var7, (byte) 44, var8, 65536);
                this.method151(var7, (byte) 44, var8 - 1, 4096);
            }
            if (arg2 == 1) {
                this.method151(var7, (byte) 44, var8, 1024);
                this.method151(var7 + 1, (byte) 44, var8, 16384);
            }
            if (arg2 == 2) {
                this.method151(var7, (byte) 44, var8, 4096);
                this.method151(var7, (byte) 44, var8 + 1, 65536);
            }
            if (arg2 == 3) {
                this.method151(var7, (byte) 44, var8, 16384);
                this.method151(var7 - 1, (byte) 44, var8, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method151(var7, (byte) 44, var8, 512);
                this.method151(var7 + 1, (byte) 44, var8 - 1, 8192);
            }
            if (arg2 == 1) {
                this.method151(var7, (byte) 44, var8, 2048);
                this.method151(var7 + 1, (byte) 44, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method151(var7, (byte) 44, var8, 8192);
                this.method151(var7 - 1, (byte) 44, var8 + 1, 512);
            }
            if (arg2 == 3) {
                this.method151(var7, (byte) 44, var8, 32768);
                this.method151(var7 - 1, (byte) 44, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method151(var7, (byte) 44, var8, 66560);
            this.method151(var7, (byte) 44, var8 - 1, 4096);
            this.method151(var7 + 1, (byte) 44, var8, 16384);
        }
        if (arg2 == 1) {
            this.method151(var7, (byte) 44, var8, 5120);
            this.method151(var7 + 1, (byte) 44, var8, 16384);
            this.method151(var7, (byte) 44, var8 + 1, 65536);
        }
        if (arg2 == 2) {
            this.method151(var7, (byte) 44, var8, 20480);
            this.method151(var7, (byte) 44, var8 + 1, 65536);
            this.method151(var7 - 1, (byte) 44, var8, 1024);
        }
        if (arg2 == 3) {
            this.method151(var7, (byte) 44, var8, 81920);
            this.method151(var7 - 1, (byte) 44, var8, 1024);
            this.method151(var7, (byte) 44, var8 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBIIII)Z", line = 1160)
    public final boolean method155(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 <= 5) {
            this.method157(33, 61, -17, -62, 34, 57, true);
        }
        field404++;
        if (arg1 == arg6 && arg3 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field382;
        int var9 = arg6 - this.field382;
        int var10 = arg3 - this.field403;
        int var11 = arg5 - this.field403;
        if (arg0 == 0) {
            if (arg4 == 0) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field388[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field388[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field388[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field388[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field388[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field388[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field388[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field388[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var9 && var11 + 1 == var10 && (this.field388[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var11 - 1 == var10 && (this.field388[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var9 && var10 == var11 && (this.field388[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)Z", line = 1357)
    public final boolean method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -227) {
            this.method162(-111, -10, 81);
        }
        field405++;
        if (arg5 == arg6 && arg0 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field382;
        int var9 = arg3 - this.field403;
        int var10 = arg5 - this.field382;
        int var11 = arg0 - this.field403;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var8 + 1 == var10 && var9 == var11 && (this.field388[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field388[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field388[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field388[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field388[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field388[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 + 1 == var10 && var9 == var11 && (this.field388[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field388[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field388[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field388[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field388[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field388[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIZ)V", line = 1450)
    public final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 == 1 || arg0 == 3) {
            int var8 = arg4;
            arg4 = arg2;
            arg2 = var8;
        }
        int var9 = arg5 - this.field403;
        int var10 = 256;
        if (arg6) {
            var10 += 131072;
        }
        field398++;
        int var11 = arg3 - this.field382;
        int var12 = var11;
        if (arg1 != -23009) {
            return;
        }
        while (arg4 + var11 > var12) {
            if (var12 >= 0 && this.field394 > var12) {
                for (int var13 = var9; var13 < var9 + arg2; var13++) {
                    if (var13 >= 0 && var13 < this.field400) {
                        this.method150(-85, var12, var13, var10);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZIIIII)Z", line = 1501)
    public final boolean method158(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field386++;
        int var9 = arg4 + arg7 - 1;
        int var10 = arg1 + arg6 - 1;
        if (arg3 >= arg4 && arg3 <= var9 && arg0 >= arg1 && arg0 <= var10) {
            return true;
        } else if (arg4 - 1 == arg3 && arg0 >= arg1 && var10 >= arg0 && (this.field388[arg3 - this.field382][arg0 - this.field403] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg3 && arg1 <= arg0 && arg0 <= var10 && (this.field388[arg3 - this.field382][arg0 - this.field403] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg0 && arg3 >= arg4 && var9 >= arg3 && (this.field388[arg3 - this.field382][arg0 - this.field403] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            if (arg2) {
                this.method147(86, (byte) -47, -96, -113, 97, true, -108);
            }
            return var10 + 1 == arg0 && arg4 <= arg3 && var9 >= arg3 && (this.field388[arg3 - this.field382][arg0 - this.field403] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)[Lab;", line = 1538)
    public static final class3[] method159(int arg0) {
        field402++;
        class3[] var1 = new class3[class119.field2898];
        for (int var2 = arg0; var2 < class119.field2898; var2++) {
            class3 var3 = var1[var2] = new class3();
            var3.field94 = client.field455;
            var3.field97 = class49.field1251;
            var3.field100 = class118.field2847[var2];
            var3.field95 = class45.field1169[var2];
            var3.field99 = class89.field2271[var2];
            var3.field93 = class60.field1542[var2];
            var3.field96 = class82.field2142;
            var3.field98 = class118.field2838[var2];
        }
        class61.method469(111);
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V", line = 1572)
    public static final void method160(int arg0, int arg1) {
        field399++;
        if (arg0 != 0) {
            field410 = null;
        }
        class52.method411(arg1, 95);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)I", line = 1583)
    public static final int method161(int arg0, int arg1, int arg2) {
        if (arg1 <= 23) {
            return 29;
        } else {
            field395++;
            long var3 = (long) ((arg0 << 16) + arg2);
            return class75.field2025 != null && class75.field2025.field644 == var3 ? class64.field1643.field1617 * 99 / (class64.field1643.field1679.length - class75.field2025.field2129) + 1 : 0;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V", line = 1599)
    public final void method162(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field382;
        field391++;
        if (arg1 > -34) {
            this.field388 = null;
        }
        int var5 = arg2 - this.field403;
        this.field388[var4][var5] = class74.method623(this.field388[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V", line = 1618)
    public class16(int arg0, int arg1) {
        this.field400 = arg1;
        this.field403 = 0;
        this.field394 = arg0;
        this.field388 = new int[this.field394][this.field400];
        this.field382 = 0;
        this.method145((byte) -30);
    }
}
