import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[B")
    private byte[] field1205;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "[I")
    private int[] field1207;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "[I")
    private int[] field1217;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lv;")
    public static class122 field1200 = class55.method425(-56, "Wordpack geladen)3");

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lv;")
    public static class122 field1206 = class55.method425(-85, "@or2@");

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1210 = -1;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lfc;")
    public static class34 field1211 = new class34();

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1218 = 0;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Lv;")
    public static class122 field1221 = class55.method425(-107, "und haben es deaktiviert)3 Benutzen Sie die");

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Lv;")
    public static class122 field1220 = class55.method425(-61, "backleft1");

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field1215 = 0;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "Lv;")
    public static class122 field1225 = class55.method425(-82, "\u001c1ffentlicher Chat");

    @OriginalMember(owner = "client!he", name = "E", descriptor = "Lv;")
    public static class122 field1226 = class55.method425(-68, "Freund hinzuf\u001c1gen");

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Lv;")
    public static class122 field1224 = class55.method425(-122, " )2> @lre@");

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Ld;")
    public static class19 field1222;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lab;")
    public static class3 field1203;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Lkb;")
    public static class62 field1219;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "Lkb;")
    public static class62 field1223;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BIIIB[B)I", line = 13)
    public final int method383(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        field1204++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg1 + arg3;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 95 % ((arg4 - 32) / 32);
        while (true) {
            byte var11 = arg0[var9];
            if (var11 >= 0) {
                var8++;
            } else {
                var8 = this.field1207[var8];
            }
            int var12;
            if ((var12 = this.field1207[var8]) < 0) {
                arg5[arg1++] = (byte) ~var12;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1207[var8];
            }
            int var13;
            if ((var13 = this.field1207[var8]) < 0) {
                arg5[arg1++] = (byte) ~var13;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1207[var8];
            }
            int var14;
            if ((var14 = this.field1207[var8]) < 0) {
                arg5[arg1++] = (byte) ~var14;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1207[var8];
            }
            int var15;
            if ((var15 = this.field1207[var8]) < 0) {
                arg5[arg1++] = (byte) ~var15;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1207[var8];
            }
            int var16;
            if ((var16 = this.field1207[var8]) < 0) {
                arg5[arg1++] = (byte) ~var16;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1207[var8];
            }
            int var17;
            if ((var17 = this.field1207[var8]) < 0) {
                arg5[arg1++] = (byte) ~var17;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1207[var8];
            }
            int var18;
            if ((var18 = this.field1207[var8]) < 0) {
                arg5[arg1++] = (byte) ~var18;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1207[var8];
            }
            int var19;
            if ((var19 = this.field1207[var8]) < 0) {
                arg5[arg1++] = (byte) ~var19;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 170)
    public static final void method384(int arg0) {
        field1199++;
        class60.field1551.method434((byte) -76);
        if (arg0 != -32) {
            field1210 = -34;
        }
        class59.field1518.method434((byte) -76);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BIII[BI)I", line = 183)
    public final int method385(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = 12 % ((arg2 + 18) / 47);
        int var8 = arg1 + arg3;
        field1209++;
        int var9 = 0;
        int var10 = arg5 << 3;
        while (var8 > arg1) {
            int var11 = arg4[arg1] & 0xFF;
            int var12 = this.field1217[var11];
            byte var13 = this.field1205[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 >> 3;
            int var15 = var10 & 0x7;
            var10 += var13;
            int var16 = var14 + (var15 + var13 - 1 >> 3);
            int var17 = var9 & -var15 >> 31;
            int var18 = var15 + 24;
            arg0[var14] = (byte) (var9 = class74.method623(var17, var12 >>> var18));
            if (var16 > var14) {
                var15 = var18 - 8;
                var14++;
                arg0[var14] = (byte) (var9 = var12 >>> var15);
                if (var14 < var16) {
                    var14++;
                    var15 -= 8;
                    arg0[var14] = (byte) (var9 = var12 >>> var15);
                    if (var16 > var14) {
                        var14++;
                        var15 -= 8;
                        arg0[var14] = (byte) (var9 = var12 >>> var15);
                        if (var16 > var14) {
                            var15 -= 8;
                            var14++;
                            arg0[var14] = (byte) (var9 = var12 << -var15);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var10 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 253)
    private static final void method386(int arg0, int arg1) {
        if (arg1 == -3) {
            class44.method374(class67.field1713, class131.field3142, class6.field150, false);
        } else if (arg1 == -2) {
            class44.method374(class107.field2643, class131.field3146, class131.field3143, false);
        } else if (arg1 == -1) {
            class44.method374(class67.field1723, class131.field3157, class82.field2130, false);
        } else if (arg1 == 3) {
            class44.method374(class2.field63, class131.field3165, class131.field3181, false);
        } else if (arg1 == 4) {
            class44.method374(class92.field2355, class131.field3141, class93.field2376, false);
        } else if (arg1 == 5) {
            class44.method374(class107.field2659, class131.field3177, class103.field2564, false);
        } else if (arg1 == 6) {
            class44.method374(class36.field956, class131.field3148, class56.field1457, false);
        } else if (arg1 == 7) {
            class44.method374(class10.field268, class131.field3137, class52.field1348, false);
        } else if (arg1 == 8) {
            class44.method374(class52.field1336, class131.field3162, class119.field2877, false);
        } else if (arg1 == 9) {
            class44.method374(class19.field488, class131.field3159, class59.field1539, false);
        } else if (arg1 == 10) {
            class44.method374(class84.field2190, class131.field3139, class119.field2870, false);
        } else if (arg1 == 11) {
            class44.method374(class46.field1195, class131.field3161, class21.field553, false);
        } else if (arg1 == 12) {
            class44.method374(class41.field1036, class131.field3149, class72.field1874, false);
        } else if (arg1 == 13) {
            class44.method374(class67.field1729, class131.field3136, class118.field2854, false);
        } else if (arg1 == 14) {
            class44.method374(class67.field1738, class131.field3173, class33.field823, false);
        } else if (arg1 == 16) {
            class44.method374(class67.field1739, class131.field3171, class51.field1324, false);
        } else if (arg1 == 17) {
            class44.method374(class25.field679, class131.field3150, class131.field3144, false);
        } else if (arg1 == 18) {
            class44.method374(class112.field2748, class131.field3166, class119.field2868, false);
        } else if (arg1 == 20) {
            class44.method374(class67.field1721, class131.field3154, class4.field114, false);
        } else if (arg1 == 22) {
            class44.method374(class38.field1007, class131.field3145, class125.field3047, false);
        } else if (arg1 == 23) {
            class44.method374(class67.field1718, class131.field3153, class76.field2040, false);
        } else if (arg1 == 24) {
            class44.method374(class108.field2665, class131.field3151, class118.field2858, false);
        } else if (arg1 == 25) {
            class44.method374(class67.field1719, class131.field3156, class42.field1125, false);
        } else if (arg1 == 26) {
            class44.method374(class80.field2101, class131.field3170, class73.field1886, false);
        } else {
            class44.method374(class67.field1722, class131.field3167, class51.field1302, false);
        }
        int var2 = 5 % ((70 - arg0) / 51);
        field1201++;
        class76.method641(10, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIII)Z", line = 360)
    public static final boolean method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1202++;
        if (!class45.method377((byte) 32, arg3)) {
            return false;
        }
        if (arg5 != -1) {
            field1225 = null;
        }
        boolean var9 = true;
        class117.method890(arg2, arg0, arg4, arg8);
        class36[] var10 = class76.field2039[arg3];
        for (int var11 = 0; var11 < var10.length; var11++) {
            class36 var12 = var10[var11];
            if (var12 != null && var12.field882 == arg6) {
                if (var12.field932 > 0) {
                    class55.method427(var12, (byte) -104);
                }
                int var13 = var12.field948 + arg2;
                int var14 = var12.field934 + arg0 - arg1;
                if (var12.field941 == 0) {
                    if (var12.field943 && !class127.method1001(var11, arg7, false)) {
                        continue;
                    }
                    if (var12.field879 > var12.field947 - var12.field955) {
                        var12.field879 = var12.field947 - var12.field955;
                    }
                    if (var12.field879 < 0) {
                        var12.field879 = 0;
                    }
                    var9 &= method387(var14, var12.field879, var13, arg3, var12.field891 + var13, -1, var11, arg7, var12.field955 + var14);
                    class117.method890(arg2, arg0, arg4, arg8);
                    if (var12.field947 > var12.field955) {
                        class26.method266(var12.field947, var14, var12.field955, var12.field891 + var13, (byte) 5, var12.field879);
                    }
                }
                if (var12.field941 != 1) {
                    if (var12.field941 == 2) {
                        int var15 = 0;
                        for (int var16 = 0; var16 < var12.field955; var16++) {
                            for (int var17 = 0; var17 < var12.field891; var17++) {
                                int var18 = (var12.field930 + 32) * var17 + var13;
                                int var19 = var14 + (var12.field954 + 32) * var16;
                                if (var15 < 20) {
                                    var18 += var12.field890[var15];
                                    var19 += var12.field960[var15];
                                }
                                if (var12.field897[var15] > 0) {
                                    int var21 = 0;
                                    int var22 = 0;
                                    int var23 = var12.field897[var15] - 1;
                                    if (class117.field2830 - 32 < var18 && class117.field2831 > var18 && var19 > class117.field2832 - 32 && var19 < class117.field2836 || class91.field2329 != 0 && class89.field2277 == var15) {
                                        int var24 = 0;
                                        if (class122.field2990 == 1 && class49.field1246 == var15 && (arg3 << 16) + var11 == class11.field334) {
                                            var24 = 16777215;
                                        }
                                        class124 var25 = class131.method1018(var12.field942[var15], var24, 32, var23);
                                        if (var25 == null) {
                                            var9 = false;
                                        } else {
                                            if (class91.field2329 != 0 && class89.field2277 == var15 && (arg3 << 16) + var11 == class95.field2436) {
                                                var21 = class7.field171 - class112.field2738;
                                                if (var21 < 5 && var21 > -5) {
                                                    var21 = 0;
                                                }
                                                var22 = class72.field1855 - class122.field2988;
                                                if (var22 < 5 && var22 > -5) {
                                                    var22 = 0;
                                                }
                                                if (class49.field1252 < 5) {
                                                    var21 = 0;
                                                    var22 = 0;
                                                }
                                                var25.method984(var18 + var21, var19 + var22, 128);
                                                if (arg6 != -1) {
                                                    class36 var26 = var10[arg6];
                                                    if (class117.field2832 > var19 + var22 && var26.field879 > 0) {
                                                        int var27 = (class117.field2832 - var19 - var22) * class64.field1663 / 3;
                                                        if (class64.field1663 * 10 < var27) {
                                                            var27 = class64.field1663 * 10;
                                                        }
                                                        if (var26.field879 < var27) {
                                                            var27 = var26.field879;
                                                        }
                                                        var26.field879 -= var27;
                                                        class122.field2988 += var27;
                                                    }
                                                    if (class117.field2836 < var19 + var22 + 32 && var26.field947 - var26.field955 > var26.field879) {
                                                        int var28 = (var19 + var22 + 32 - class117.field2836) * class64.field1663 / 3;
                                                        if (var28 > class64.field1663 * 10) {
                                                            var28 = class64.field1663 * 10;
                                                        }
                                                        if (var26.field947 - var26.field955 - var26.field879 < var28) {
                                                            var28 = var26.field947 - var26.field955 - var26.field879;
                                                        }
                                                        var26.field879 += var28;
                                                        class122.field2988 -= var28;
                                                    }
                                                }
                                            } else if (field1218 != 0 && class73.field1903 == var15 && (arg3 << 16) + var11 == class32.field784) {
                                                var25.method984(var18, var19, 128);
                                            } else {
                                                var25.method985(var18, var19);
                                            }
                                            if (var25.field3022 == 33 || var12.field942[var15] != 1) {
                                                int var29 = var12.field942[var15];
                                                class83.field2169.method800(class44.method372(1000, var29), var18 + var21 + 1, 10 - -var22 + var19, 0);
                                                class83.field2169.method800(class44.method372(1000, var29), var18 + var21, var19 - -var22 + 9, 16776960);
                                            }
                                        }
                                    }
                                } else if (var12.field908 != null && var15 < 20) {
                                    class124 var20 = var12.method314(119, var15);
                                    if (var20 != null) {
                                        var20.method985(var18, var19);
                                    } else if (class90.field2325) {
                                        var9 = false;
                                    }
                                }
                                var15++;
                            }
                        }
                    } else if (var12.field941 == 3) {
                        int var30;
                        if (class5.method71(var12, (byte) 97)) {
                            var30 = var12.field904;
                            if (class127.method1001(var11, arg7, false) && var12.field912 != 0) {
                                var30 = var12.field912;
                            }
                        } else {
                            var30 = var12.field918;
                            if (class127.method1001(var11, arg7, false) && var12.field913 != 0) {
                                var30 = var12.field913;
                            }
                        }
                        if (var12.field922 == 0) {
                            if (var12.field888) {
                                class117.method895(var13, var14, var12.field891, var12.field955, var30);
                            } else {
                                class117.method894(var13, var14, var12.field891, var12.field955, var30);
                            }
                        } else if (var12.field888) {
                            class117.method897(var13, var14, var12.field891, var12.field955, var30, 256 - (var12.field922 & 0xFF));
                        } else {
                            class117.method900(var13, var14, var12.field891, var12.field955, var30, 256 - (var12.field922 & 0xFF));
                        }
                    } else if (var12.field941 == 4) {
                        class105 var31 = class120.field2911[var12.field898];
                        class122 var32 = var12.field901;
                        int var33;
                        if (class5.method71(var12, (byte) 97)) {
                            var33 = var12.field904;
                            if (class127.method1001(var11, arg7, false) && var12.field912 != 0) {
                                var33 = var12.field912;
                            }
                            if (var12.field900.method946(70) > 0) {
                                var32 = var12.field900;
                            }
                        } else {
                            var33 = var12.field918;
                            if (class127.method1001(var11, arg7, false) && var12.field913 != 0) {
                                var33 = var12.field913;
                            }
                        }
                        if (var12.field937 == 6 && class24.field664) {
                            var33 = var12.field918;
                            var32 = class114.field2778;
                        }
                        if (class117.field2834 == 479) {
                            if (var33 == 16776960) {
                                var33 = 255;
                            }
                            if (var33 == 49152) {
                                var33 = 16777215;
                            }
                        }
                        class122 var34 = class38.method336(31, var12, var32);
                        var31.method815(var34, var13, var14, var12.field891, var12.field955, var33, var12.field926, var12.field952, var12.field940, var12.field917);
                    } else if (var12.field941 == 5) {
                        class124 var35 = var12.method320(-50, class5.method71(var12, (byte) 97));
                        if (var35 != null) {
                            var35.method985(var13, var14);
                        } else if (class90.field2325) {
                            var9 = false;
                        }
                    } else if (var12.field941 == 6) {
                        class77.method642(var13 + var12.field891 / 2, var12.field955 / 2 + var14);
                        int var36 = class77.field2049[var12.field923] * var12.field946 >> 16;
                        int var37 = class77.field2064[var12.field923] * var12.field946 >> 16;
                        boolean var38 = class5.method71(var12, (byte) 97);
                        int var39;
                        if (var38) {
                            var39 = var12.field927;
                        } else {
                            var39 = var12.field924;
                        }
                        class68 var40;
                        if (var12.field914 == 5) {
                            var40 = class56.field1461.method732(null, -114, null, -1, -1);
                        } else if (var39 == -1) {
                            var40 = var12.method324(class70.field1828.field1432, var38, arg5 - 72, -1, null);
                            if (var40 == null && class90.field2325) {
                                var9 = false;
                            }
                        } else {
                            class89 var41 = class51.method401(-30325, var39);
                            var40 = var12.method324(class70.field1828.field1432, var38, -96, var12.field958, var41);
                            if (var40 == null && class90.field2325) {
                                var9 = false;
                            }
                        }
                        if (var40 != null) {
                            var40.method549(0, var12.field893, 0, var12.field923, 0, var36, var37);
                        }
                        class77.method650();
                    } else {
                        if (var12.field941 == 7) {
                            int var42 = 0;
                            class105 var43 = class120.field2911[var12.field898];
                            for (int var44 = 0; var44 < var12.field955; var44++) {
                                for (int var45 = 0; var45 < var12.field891; var45++) {
                                    if (var12.field897[var42] > 0) {
                                        class10 var46 = class5.method69(var12.field897[var42] - 1, false);
                                        class122 var47 = var46.field222;
                                        if (var47 == null) {
                                            var47 = class37.field986;
                                        }
                                        if (var46.field221 || var12.field942[var42] != 1) {
                                            var47 = class59.method454(new class122[] { var47, class107.field2650, class51.method402(-117, var12.field942[var42]) }, 5176);
                                        }
                                        int var48 = (var12.field954 + 12) * var44 + var14;
                                        int var49 = var13 + (var12.field930 + 115) * var45;
                                        if (var12.field952 == 0) {
                                            var43.method802(var47, var49, var48, var12.field918, var12.field926);
                                        } else if (var12.field952 == 1) {
                                            var43.method814(var47, var12.field891 / 2 + var49, var48, var12.field918, var12.field926);
                                        } else {
                                            var43.method810(var47, var12.field891 + var49 - 1, var48, var12.field918, var12.field926);
                                        }
                                    }
                                    var42++;
                                }
                            }
                        }
                        if (var12.field941 == 8 && class60.method458(arg7, arg5 + 2, var11) && class119.field2900 == class115.field2802) {
                            int var50 = 0;
                            int var51 = 0;
                            class105 var52 = class60.field1553;
                            class122 var53 = var12.field901;
                            class122 var54 = class38.method336(70, var12, var53);
                            while (var54.method946(70) > 0) {
                                int var62 = var54.method955(24669, class37.field972);
                                class122 var63;
                                if (var62 == -1) {
                                    var63 = var54;
                                    var54 = class51.field1287;
                                } else {
                                    var63 = var54.method951(7835, var62, 0);
                                    var54 = var54.method960(var62 + 2, 126);
                                }
                                int var64 = var52.method808(var63);
                                var50 += var52.field2581 + 1;
                                if (var64 > var51) {
                                    var51 = var64;
                                }
                            }
                            var51 += 6;
                            int var55 = var13 + var12.field891 - var51 - 5;
                            var50 += 7;
                            if (var13 + 5 > var55) {
                                var55 = var13 + 5;
                            }
                            int var56 = var14 + var12.field955 + 5;
                            if (arg8 < var50 + var56) {
                                var56 = arg8 - var50;
                            }
                            if (arg4 < var51 + var55) {
                                var55 = arg4 - var51;
                            }
                            class117.method895(var55, var56, var51, var50, 16777120);
                            class117.method894(var55, var56, var51, var50, 0);
                            class122 var57 = var12.field901;
                            int var58 = var56 + var52.field2581 + 2;
                            class122 var59 = class38.method336(43, var12, var57);
                            while (var59.method946(70) > 0) {
                                int var60 = var59.method955(24669, class37.field972);
                                class122 var61;
                                if (var60 == -1) {
                                    var61 = var59;
                                    var59 = class51.field1287;
                                } else {
                                    var61 = var59.method951(arg5 + 7836, var60, 0);
                                    var59 = var59.method960(var60 + 2, 125);
                                }
                                var52.method802(var61, var55 + 3, var58, 0, false);
                                var58 += var52.field2581 + 1;
                            }
                        }
                    }
                }
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lmb;ILmb;)V", line = 874)
    public static final void method388(class74 arg0, int arg1, class74 arg2) {
        field1213++;
        if (arg1 < 90) {
            method392(false);
        }
        class115.field2808 = arg0;
        class24.field649 = arg2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 899)
    public static final void method389(byte arg0) {
        field1197++;
        if (class93.field2382 == 1) {
            if (class125.field3049 >= 539 && class125.field3049 <= 573 && class34.field865 >= 169 && class34.field865 < 205 && class84.field2191[0] != -1) {
                class114.field2796 = true;
                class62.field1588 = true;
                class43.field1146 = 0;
            }
            if (class125.field3049 >= 569 && class125.field3049 <= 599 && class34.field865 >= 168 && class34.field865 < 205 && class84.field2191[1] != -1) {
                class43.field1146 = 1;
                class114.field2796 = true;
                class62.field1588 = true;
            }
            if (class125.field3049 >= 597 && class125.field3049 <= 627 && class34.field865 >= 168 && class34.field865 < 205 && class84.field2191[2] != -1) {
                class62.field1588 = true;
                class114.field2796 = true;
                class43.field1146 = 2;
            }
            if (class125.field3049 >= 625 && class125.field3049 <= 669 && class34.field865 >= 168 && class34.field865 < 203 && class84.field2191[3] != -1) {
                class114.field2796 = true;
                class62.field1588 = true;
                class43.field1146 = 3;
            }
            if (class125.field3049 >= 666 && class125.field3049 <= 696 && class34.field865 >= 168 && class34.field865 < 205 && class84.field2191[4] != -1) {
                class114.field2796 = true;
                class62.field1588 = true;
                class43.field1146 = 4;
            }
            if (class125.field3049 >= 694 && class125.field3049 <= 724 && class34.field865 >= 168 && class34.field865 < 205 && class84.field2191[5] != -1) {
                class62.field1588 = true;
                class43.field1146 = 5;
                class114.field2796 = true;
            }
            if (class125.field3049 >= 722 && class125.field3049 <= 756 && class34.field865 >= 169 && class34.field865 < 205 && class84.field2191[6] != -1) {
                class62.field1588 = true;
                class114.field2796 = true;
                class43.field1146 = 6;
            }
            if (class125.field3049 >= 540 && class125.field3049 <= 574 && class34.field865 >= 466 && class34.field865 < 502 && class84.field2191[7] != -1) {
                class62.field1588 = true;
                class114.field2796 = true;
                class43.field1146 = 7;
            }
            if (class125.field3049 >= 572 && class125.field3049 <= 602 && class34.field865 >= 466 && class34.field865 < 503 && class84.field2191[8] != -1) {
                class114.field2796 = true;
                class62.field1588 = true;
                class43.field1146 = 8;
            }
            if (class125.field3049 >= 599 && class125.field3049 <= 629 && class34.field865 >= 466 && class34.field865 < 503 && class84.field2191[9] != -1) {
                class114.field2796 = true;
                class43.field1146 = 9;
                class62.field1588 = true;
            }
            if (class125.field3049 >= 627 && class125.field3049 <= 671 && class34.field865 >= 467 && class34.field865 < 502 && class84.field2191[10] != -1) {
                class62.field1588 = true;
                class114.field2796 = true;
                class43.field1146 = 10;
            }
            if (class125.field3049 >= 669 && class125.field3049 <= 699 && class34.field865 >= 466 && class34.field865 < 503 && class84.field2191[11] != -1) {
                class62.field1588 = true;
                class43.field1146 = 11;
                class114.field2796 = true;
            }
            if (class125.field3049 >= 696 && class125.field3049 <= 726 && class34.field865 >= 466 && class34.field865 < 503 && class84.field2191[12] != -1) {
                class62.field1588 = true;
                class114.field2796 = true;
                class43.field1146 = 12;
            }
            if (class125.field3049 >= 724 && class125.field3049 <= 758 && class34.field865 >= 466 && class34.field865 < 502 && class84.field2191[13] != -1) {
                class62.field1588 = true;
                class43.field1146 = 13;
                class114.field2796 = true;
            }
        }
        int var1 = 16 / ((-arg0 - 3) / 55);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V", line = 1023)
    public static final void method390(byte arg0) {
        field1198++;
        try {
            if (class67.field1714 == 0) {
                class66.field1686 = null;
                class103.field2568 = 0;
                class67.field1714 = 1;
                class73.field1888 = false;
                class126.field3057 = null;
            }
            if (class67.field1714 == 1) {
                if (class126.field3057 == null) {
                    class126.field3057 = class2.field70.method441((byte) -120, class102.field2531);
                }
                if (class126.field3057.field2454 == 2) {
                    throw new IOException();
                }
                if (class126.field3057.field2454 == 1) {
                    class66.field1686 = new class72((Socket) class126.field3057.field2456, class2.field70);
                    class67.field1714 = 2;
                    class126.field3057 = null;
                }
            }
            if (class67.field1714 == 2) {
                long var1 = class64.field1673 = class88.field2261.method959(-1);
                class74.field1935.field1617 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class74.field1935.method523(255, 14);
                class74.field1935.method523(255, var3);
                class66.field1686.method594((byte) 111, 0, class74.field1935.field1679, 2);
                class14.field372.field1617 = 0;
                class67.field1714 = 3;
            }
            if (class67.field1714 == 3) {
                int var4 = class66.field1686.method585((byte) -103);
                if (var4 != 0) {
                    method386(126, var4);
                    return;
                }
                class67.field1714 = 4;
                class14.field372.field1617 = 0;
            }
            if (class67.field1714 == 4) {
                if (class14.field372.field1617 < 8) {
                    int var5 = class66.field1686.method590((byte) -111);
                    if (var5 > 8 - class14.field372.field1617) {
                        var5 = 8 - class14.field372.field1617;
                    }
                    if (var5 > 0) {
                        class66.field1686.method593(var5, true, class14.field372.field1679, class14.field372.field1617);
                        class14.field372.field1617 += var5;
                    }
                }
                if (class14.field372.field1617 == 8) {
                    class14.field372.field1617 = 0;
                    class28.field733 = class14.field372.method510((byte) 98);
                    class67.field1714 = 5;
                }
            }
            if (arg0 == 45) {
                if (class67.field1714 == 5) {
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class28.field733 >> 32), (int) class28.field733 };
                    class74.field1935.field1617 = 0;
                    class74.field1935.method523(255, 10);
                    class74.field1935.method509((byte) -41, var6[0]);
                    class74.field1935.method509((byte) -118, var6[1]);
                    class74.field1935.method509((byte) -28, var6[2]);
                    class74.field1935.method509((byte) -111, var6[3]);
                    class74.field1935.method509((byte) -76, class2.field70.field1503);
                    class74.field1935.method480(class88.field2261.method959(-1), 299629920);
                    class74.field1935.method496((byte) -107, class88.field2250);
                    class74.field1935.method531(0, class43.field1133, class122.field2961);
                    class18.field414.field1617 = 0;
                    if (class44.field1156 == 40) {
                        class18.field414.method523(255, 18);
                    } else {
                        class18.field414.method523(255, 16);
                    }
                    class18.field414.method523(255, class74.field1935.field1617 + 53);
                    class18.field414.method509((byte) -47, 417);
                    class18.field414.method523(arg0 + 210, class109.field2703 ? 1 : 0);
                    class18.field414.method509((byte) -110, class22.field599.field1952);
                    class18.field414.method509((byte) -75, class108.field2673.field1952);
                    class18.field414.method509((byte) -60, class54.field1396.field1952);
                    class18.field414.method509((byte) -79, class63.field1605.field1952);
                    class18.field414.method509((byte) -128, class24.field662.field1952);
                    class18.field414.method509((byte) -126, class59.field1531.field1952);
                    class18.field414.method509((byte) -49, class93.field2396.field1952);
                    class18.field414.method509((byte) -48, class28.field715.field1952);
                    class18.field414.method509((byte) -112, class16.field397.field1952);
                    class18.field414.method509((byte) -53, client.field453.field1952);
                    class18.field414.method509((byte) -94, class70.field1845.field1952);
                    class18.field414.method509((byte) -92, class34.field868.field1952);
                    class18.field414.method491(class74.field1935.field1617, -41, 0, class74.field1935.field1679);
                    class66.field1686.method594((byte) 126, 0, class18.field414.field1679, class18.field414.field1617);
                    class74.field1935.method993(var6, arg0 ^ 0x7C);
                    for (int var7 = 0; var7 < 4; var7++) {
                        var6[var7] += 50;
                    }
                    class14.field372.method993(var6, 120);
                    class67.field1714 = 6;
                }
                if (class67.field1714 == 6 && class66.field1686.method590((byte) -95) > 0) {
                    int var8 = class66.field1686.method585((byte) -77);
                    if (var8 == 21 && class44.field1156 == 20) {
                        class67.field1714 = 7;
                    } else if (var8 == 2) {
                        class67.field1714 = 9;
                    } else if (var8 == 15 && class44.field1156 == 40) {
                        class73.method598((byte) -114);
                        return;
                    } else if (var8 == 23 && class34.field854 < 1) {
                        class34.field854++;
                        class67.field1714 = 0;
                    } else {
                        method386(123, var8);
                        return;
                    }
                }
                if (class67.field1714 == 7 && class66.field1686.method590((byte) 53) > 0) {
                    class34.field840 = class66.field1686.method585((byte) -91) * 60 + 180;
                    class67.field1714 = 8;
                }
                if (class67.field1714 == 8) {
                    class103.field2568 = 0;
                    class44.method374(class22.field606, class59.method454(new class122[] { class119.method914(class34.field840 / 60, 10), class109.field2683 }, arg0 ^ 0x1415), class21.field546, false);
                    if (--class34.field840 <= 0) {
                        class67.field1714 = 0;
                    }
                } else {
                    if (class67.field1714 == 9 && class66.field1686.method590((byte) -84) >= 8) {
                        class58.field1507 = class66.field1686.method585((byte) -105);
                        class82.field2134 = class66.field1686.method585((byte) -126) == 1;
                        class55.field1435 = class66.field1686.method585((byte) -71);
                        class55.field1435 <<= 0x8;
                        class55.field1435 += class66.field1686.method585((byte) -77);
                        class63.field1610 = class66.field1686.method585((byte) -98);
                        class66.field1686.method593(1, true, class14.field372.field1679, 0);
                        class14.field372.field1617 = 0;
                        class131.field3158 = class14.field372.method990(255);
                        class66.field1686.method593(2, true, class14.field372.field1679, 0);
                        class14.field372.field1617 = 0;
                        class74.field1969 = class14.field372.method506((byte) -90);
                        class67.field1714 = 10;
                    }
                    if (class67.field1714 != 10) {
                        class103.field2568++;
                        if (class103.field2568 > 2000) {
                            if (class34.field854 < 1) {
                                class34.field854++;
                                class67.field1714 = 0;
                                if (class72.field1853 == class102.field2531) {
                                    class102.field2531 = class25.field680;
                                } else {
                                    class102.field2531 = class72.field1853;
                                }
                            } else {
                                method386(124, -3);
                            }
                        }
                    } else if (class66.field1686.method590((byte) 121) >= class74.field1969) {
                        class14.field372.field1617 = 0;
                        class66.field1686.method593(class74.field1969, true, class14.field372.field1679, 0);
                        class81.method667((byte) -72);
                        class51.field1300 = -1;
                        class113.method863(-1, false);
                        class131.field3158 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class34.field854 < 1) {
                if (class72.field1853 == class102.field2531) {
                    class102.field2531 = class25.field680;
                } else {
                    class102.field2531 = class72.field1853;
                }
                class67.field1714 = 0;
                class34.field854++;
            } else {
                method386(-83, -2);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 1326)
    public static void method391(int arg0) {
        field1211 = null;
        field1222 = null;
        field1220 = null;
        field1206 = null;
        field1223 = null;
        field1200 = null;
        if (arg0 != 180) {
            return;
        }
        field1225 = null;
        field1203 = null;
        field1224 = null;
        field1219 = null;
        field1226 = null;
        field1221 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 1353)
    public static final void method392(boolean arg0) {
        field1208++;
        try {
            if (arg0) {
                field1220 = null;
            }
            Graphics var1 = class54.field1411.getGraphics();
            class37.field977.method122(117, var1, 17, 357);
        } catch (Exception var2) {
            class54.field1411.repaint();
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V", line = 1393)
    public class47(byte[] arg0) {
        int var2 = arg0.length;
        this.field1205 = arg0;
        this.field1207 = new int[8];
        this.field1217 = new int[var2];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1217[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class74.method623(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1207[var14] == 0) {
                            this.field1207[var14] = var4;
                        }
                        var14 = this.field1207[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1207.length) {
                        int[] var18 = new int[this.field1207.length * 2];
                        for (int var19 = 0; var19 < this.field1207.length; var19++) {
                            var18[var19] = this.field1207[var19];
                        }
                        this.field1207 = var18;
                    }
                }
                this.field1207[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
