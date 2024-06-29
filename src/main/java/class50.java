import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class50 {

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    private int field1241 = 65000;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Ljb;")
    private class55 field1236 = null;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Ljb;")
    private class55 field1247 = null;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lpd;")
    public static class94 field1234 = class28.method249(119, "k");

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lpd;")
    private static class94 field1240 = class28.method249(-67, "Choose Option");

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lpd;")
    public static class94 field1231 = class28.method249(-110, "redstone2");

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Lpd;")
    public static class94 field1242 = class28.method249(44, "mapback");

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Lpd;")
    public static class94 field1246 = field1240;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lpd;")
    private static class94 field1245 = class28.method249(45, "New User");

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lpd;")
    public static class94 field1239 = field1245;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Lpd;")
    private static class94 field1251 = class28.method249(-73, "Connection lost");

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1255 = 99;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Lpd;")
    public static class94 field1259 = field1251;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "Lpd;")
    private static class94 field1258 = class28.method249(-110, "Private chat");

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1249 = 0;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Lpd;")
    private static class94 field1254 = class28.method249(-87, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lpd;")
    public static class94 field1257 = class28.method249(38, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Lpd;")
    public static class94 field1250 = field1254;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Lpd;")
    public static class94 field1238 = field1258;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lvc;")
    public static class128 field1233 = new class128(10);

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "Lpd;")
    public static class94 field1262 = class28.method249(-97, "0(U");

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "Lpd;")
    public static class94 field1263 = class28.method249(-65, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Lvc;")
    public static class128 field1261 = new class128(260);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI[BZI)Z", line = 4)
    private final boolean method392(boolean arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field1229++;
        class55 var6 = this.field1236;
        synchronized (this.field1236) {
            try {
                int var7;
                if (arg3) {
                    if (this.field1247.method444((byte) 123) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field1247.method445((byte) -121, (long) (arg1 * 6));
                    this.field1247.method435((byte) -100, 6, class36.field940, 0);
                    var7 = ((class36.field940[3] & 0xFF) << 16) + (class36.field940[4] << 8 & 0xFF00) + (class36.field940[5] & 0xFF);
                    if (var7 <= 0 || this.field1236.method444((byte) 102) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1236.method444((byte) 63) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class36.field940[0] = (byte) (arg4 >> 16);
                class36.field940[1] = (byte) (arg4 >> 8);
                class36.field940[2] = (byte) arg4;
                class36.field940[3] = (byte) (var7 >> 16);
                if (!arg0) {
                    return false;
                }
                class36.field940[4] = (byte) (var7 >> 8);
                class36.field940[5] = (byte) var7;
                this.field1247.method445((byte) -92, (long) (arg1 * 6));
                this.field1247.method442(6, -1, 0, class36.field940);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg3) {
                        label110: {
                            this.field1236.method445((byte) -128, (long) (var7 * 520));
                            try {
                                this.field1236.method435((byte) -98, 8, class36.field940, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class36.field940[0] & 0xFF) << 8) + (class36.field940[1] & 0xFF);
                            var13 = (class36.field940[6] & 0xFF) + ((class36.field940[5] & 0xFF) << 8) + ((class36.field940[4] & 0xFF) << 16);
                            int var15 = ((class36.field940[2] & 0xFF) << 8) + (class36.field940[3] & 0xFF);
                            int var16 = class36.field940[7] & 0xFF;
                            if (arg1 == var14 && var12 == var15 && this.field1228 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field1236.method444((byte) 122) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg3 = false;
                        var13 = (int) ((this.field1236.method444((byte) 100) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class36.field940[0] = (byte) (arg1 >> 8);
                    class36.field940[1] = (byte) arg1;
                    class36.field940[2] = (byte) (var12 >> 8);
                    class36.field940[3] = (byte) var12;
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    var12++;
                    class36.field940[4] = (byte) (var13 >> 16);
                    class36.field940[5] = (byte) (var13 >> 8);
                    class36.field940[6] = (byte) var13;
                    class36.field940[7] = (byte) this.field1228;
                    int var19 = arg4 - var11;
                    this.field1236.method445((byte) -99, (long) (var7 * 520));
                    this.field1236.method442(8, -1, 0, class36.field940);
                    var7 = var13;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field1236.method442(var19, -1, var11, arg2);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLme;)Z", line = 137)
    public static final boolean method393(byte arg0, class77 arg1) {
        if (arg0 != -52) {
            return true;
        }
        int var2 = arg1.field1896;
        field1235++;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class73.field1786++;
            class23.field607++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, class120.field3008[var2] }, true), class21.field578, 0, 30, arg0 ^ 0x7863);
            class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, class120.field3008[var2] }, true), class27.field748, 0, 42, -30801);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class121.field3029++;
            class97.method738(0, 0, class4.method20(new class94[] { class43.field1088, arg1.field1905 }, true), class21.field578, 0, 10, arg0 - 30749);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLjava/awt/Component;Ls;)V", line = 184)
    public static final void method394(boolean arg0, Component arg1, class111 arg2) {
        field1243++;
        if (client.field476) {
            return;
        }
        class46.field1140 = class36.method285(arg2, (byte) -114, class95.field2447, class38.field981);
        class64.field1590 = class36.method285(arg2, (byte) -114, class108.field2690, class38.field981);
        class86.field2198 = class36.method285(arg2, (byte) -114, field1242, class38.field981);
        class74.field1806 = class36.method285(arg2, (byte) -114, class26.field698, class38.field981);
        class87.field2206 = class36.method285(arg2, (byte) -114, class47.field1151, class38.field981);
        class79.field2003 = class36.method285(arg2, (byte) -114, class7.field135, class38.field981);
        class8.field235 = class2.method10(arg1, (byte) 125, 96, 479);
        class64.field1590.method33(0, 0);
        class86.field2199 = class2.method10(arg1, (byte) 115, 156, 172);
        class130.method1031();
        class86.field2198.method33(0, 0);
        class92.field2360 = class2.method10(arg1, (byte) 126, 261, 190);
        class46.field1140.method33(0, 0);
        class135.field3319 = class2.method10(arg1, (byte) 121, 334, 512);
        class130.method1031();
        class28.field815 = class2.method10(arg1, (byte) 112, 50, 496);
        class69.field1663 = class2.method10(arg1, (byte) 89, 37, 269);
        class87.field2201 = class2.method10(arg1, (byte) 120, 45, 249);
        class116 var3 = class89.method669(arg2, class69.field1675, arg0, class38.field981);
        class52.field1305 = class2.method10(arg1, (byte) 96, var3.field2930, var3.field2929);
        var3.method872(0, 0);
        class116 var4 = class89.method669(arg2, class42.field1062, true, class38.field981);
        class13.field319 = class2.method10(arg1, (byte) 120, var4.field2930, var4.field2929);
        var4.method872(0, 0);
        class116 var5 = class89.method669(arg2, class52.field1309, true, class38.field981);
        class105.field2622 = class2.method10(arg1, (byte) 105, var5.field2930, var5.field2929);
        var5.method872(0, 0);
        class116 var6 = class89.method669(arg2, class110.field2724, arg0, class38.field981);
        class14.field356 = class2.method10(arg1, (byte) 109, var6.field2930, var6.field2929);
        var6.method872(0, 0);
        class116 var7 = class89.method669(arg2, class67.field1637, true, class38.field981);
        class40.field1026 = class2.method10(arg1, (byte) 105, var7.field2930, var7.field2929);
        var7.method872(0, 0);
        class116 var8 = class89.method669(arg2, class25.field681, true, class38.field981);
        class38.field986 = class2.method10(arg1, (byte) 98, var8.field2930, var8.field2929);
        var8.method872(0, 0);
        class116 var9 = class89.method669(arg2, class21.field580, true, class38.field981);
        class81.field2061 = class2.method10(arg1, (byte) 88, var9.field2930, var9.field2929);
        var9.method872(0, 0);
        class116 var10 = class89.method669(arg2, class70.field1699, true, class38.field981);
        class108.field2689 = class2.method10(arg1, (byte) 99, var10.field2930, var10.field2929);
        var10.method872(0, 0);
        class116 var11 = class89.method669(arg2, class107.field2655, true, class38.field981);
        class55.field1402 = class2.method10(arg1, (byte) 122, var11.field2930, var11.field2929);
        var11.method872(0, 0);
        class38.field996 = class36.method285(arg2, (byte) -114, class99.field2507, class38.field981);
        class75.field1836 = class36.method285(arg2, (byte) -114, field1231, class38.field981);
        class80.field2045 = class36.method285(arg2, (byte) -114, class94.field2391, class38.field981);
        class17.field431 = class38.field996.method30();
        class17.field431.method32();
        class31.field879 = class75.field1836.method30();
        class31.field879.method32();
        class17.field425 = class38.field996.method30();
        class17.field425.method31();
        class87.field2226 = class75.field1836.method30();
        class87.field2226.method31();
        class86.field2190 = class80.field2045.method30();
        class86.field2190.method31();
        class51.field1278 = class38.field996.method30();
        class51.field1278.method32();
        class51.field1278.method31();
        class89.field2319 = class75.field1836.method30();
        class89.field2319.method32();
        class89.field2319.method31();
        class134.field3264 = class84.method613(class38.field981, class122.field3088, arg2, -26288);
        class88.field2272 = new int[33];
        class27.field738 = new int[33];
        class75.field1823 = new int[151];
        class115.field2909 = new int[151];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class86.field2198.field105[class86.field2198.field102 * var12 + var19] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class88.field2272[var12] = var17;
            class27.field738[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 0;
            int var15 = 999;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class86.field2198.field105[class86.field2198.field102 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var15 == 999) {
                        var15 = var16;
                    }
                } else if (var15 != 999) {
                    var14 = var16;
                    break;
                }
            }
            class115.field2909[var13 - 5] = var15 - 25;
            class75.field1823[var13 - 5] = var14 - var15;
        }
        client.field476 = true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 339)
    public static final void method395(int arg0) {
        if (arg0 < 71) {
            return;
        }
        field1232++;
        if (class100.field2535 != 0 || class117.field2938 != null) {
            return;
        }
        int var1 = class86.field2157;
        if (class31.field882 == 1 && class28.field788 >= 516 && class63.field1526 >= 160 && class28.field788 <= 765 && class63.field1526 <= 205) {
            var1 = 0;
        }
        if (!class62.field1516) {
            if (var1 == 1 && class97.field2478 > 0) {
                int var12 = class38.field995[class97.field2478 - 1];
                if (var12 == 24 || var12 == 15 || var12 == 40 || var12 == 11 || var12 == 34 || var12 == 26 || var12 == 27 || var12 == 8 || var12 == 35 || var12 == 43 || var12 == 41 || var12 == 1006) {
                    int var13 = class134.field3273[class97.field2478 - 1];
                    int var14 = class9.field237[class97.field2478 - 1];
                    class77 var15 = class63.method466((byte) -38, var13);
                    if (var15.field1880 || var15.field1860) {
                        client.field489 = 0;
                        class136.field3325 = var14;
                        class64.field1566 = class63.field1526;
                        class100.field2535 = 2;
                        class33.field906 = false;
                        if (var13 >> 16 == class103.field2603) {
                            class100.field2535 = 1;
                        }
                        class119.field2977 = var13;
                        class17.field423 = class28.field788;
                        if (var13 >> 16 == class115.field2925) {
                            class100.field2535 = 3;
                        }
                        return;
                    }
                }
            }
            if (var1 == 1 && (class99.field2520 == 1 || class77.method575(24, class97.field2478 - 1)) && class97.field2478 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class97.field2478 > 0) {
                class120.method898(170, class97.field2478 - 1);
            }
            if (var1 != 2 || class97.field2478 <= 0) {
                return;
            }
            class89.method668((byte) 17);
            return;
        }
        if (var1 != 1) {
            int var2 = class84.field2121;
            int var3 = class94.field2411;
            if (class40.field1035 == 0) {
                var2 -= 4;
                var3 -= 4;
            }
            if (class40.field1035 == 1) {
                var2 -= 205;
                var3 -= 553;
            }
            if (class40.field1035 == 2) {
                var3 -= 17;
                var2 -= 357;
            }
            if (class79.field2028 - 10 > var3 || var3 > class79.field2028 + class52.field1306 + 10 || var2 < class128.field3212 - 10 || var2 > class128.field3212 + class135.field3313 + 10) {
                class62.field1516 = false;
                if (class40.field1035 == 2) {
                    class73.field1781 = true;
                }
                if (class40.field1035 == 1) {
                    class135.field3323 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class79.field2028;
        int var5 = class128.field3212;
        int var6 = class52.field1306;
        int var7 = class28.field788;
        int var8 = class63.field1526;
        if (class40.field1035 == 0) {
            var8 -= 4;
            var7 -= 4;
        }
        if (class40.field1035 == 1) {
            var8 -= 205;
            var7 -= 553;
        }
        int var9 = -1;
        if (class40.field1035 == 2) {
            var8 -= 357;
            var7 -= 17;
        }
        for (int var10 = 0; var10 < class97.field2478; var10++) {
            int var11 = (class97.field2478 - var10 - 1) * 15 + var5 + 31;
            if (var4 < var7 && var4 + var6 > var7 && var11 - 13 < var8 && var11 + 3 > var8) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class120.method898(170, var9);
        }
        if (class40.field1035 == 1) {
            class135.field3323 = true;
        }
        class62.field1516 = false;
        if (class40.field1035 == 2) {
            class73.field1781 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 537)
    public static void method396(boolean arg0) {
        field1263 = null;
        field1238 = null;
        field1257 = null;
        field1251 = null;
        field1234 = null;
        field1259 = null;
        field1240 = null;
        if (arg0) {
            field1263 = null;
        }
        field1258 = null;
        field1246 = null;
        field1242 = null;
        field1262 = null;
        field1254 = null;
        field1233 = null;
        field1250 = null;
        field1261 = null;
        field1239 = null;
        field1245 = null;
        field1231 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[B", line = 574)
    public final byte[] method397(int arg0, int arg1) {
        field1248++;
        class55 var3 = this.field1236;
        synchronized (this.field1236) {
            if (arg1 != -5989) {
                return null;
            }
            try {
                if ((long) (arg0 * 6 + 6) > this.field1247.method444((byte) 87)) {
                    return null;
                }
                this.field1247.method445((byte) -128, (long) (arg0 * 6));
                this.field1247.method435((byte) -100, 6, class36.field940, 0);
                int var6 = ((class36.field940[0] & 0xFF) << 16) + ((class36.field940[1] & 0xFF) << 8) + (class36.field940[2] & 0xFF);
                int var7 = ((class36.field940[4] & 0xFF) << 8) + ((class36.field940[3] & 0xFF) << 16) + (class36.field940[5] & 0xFF);
                if (var6 < 0 || this.field1241 < var6) {
                    return null;
                } else if (var7 > 0 && (long) var7 <= this.field1236.method444((byte) 118) / 520L) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var11 < var6) {
                        if (var7 == 0) {
                            return null;
                        }
                        int var14 = var6 - var11;
                        this.field1236.method445((byte) -92, (long) (var7 * 520));
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1236.method435((byte) -51, var14 + 8, class36.field940, 0);
                        int var15 = ((class36.field940[0] & 0xFF) << 8) + (class36.field940[1] & 0xFF);
                        int var16 = ((class36.field940[2] & 0xFF) << 8) + (class36.field940[3] & 0xFF);
                        int var17 = ((class36.field940[4] & 0xFF) << 16) - (-((class36.field940[5] & 0xFF) << 8) - (class36.field940[6] & 0xFF));
                        int var18 = class36.field940[7] & 0xFF;
                        if (arg0 == var15 && var12 == var16 && this.field1228 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field1236.method444((byte) 118) / 520L) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class36.field940[var21 + 8];
                                }
                                var7 = var17;
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI[B)Z", line = 656)
    public final boolean method398(int arg0, byte arg1, int arg2, byte[] arg3) {
        field1237++;
        class55 var5 = this.field1236;
        synchronized (this.field1236) {
            if (arg0 < 0 || arg0 > this.field1241) {
                throw new IllegalArgumentException();
            } else if (arg1 >= -96) {
                return true;
            } else {
                boolean var7 = this.method392(true, arg2, arg3, true, arg0);
                if (!var7) {
                    var7 = this.method392(true, arg2, arg3, false, arg0);
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 691)
    public static final void method399(byte arg0) {
        class43.field1090.method1013(-1);
        if (arg0 < -15) {
            class39.field1016.method1013(-1);
            field1253++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Luc;BI)Lpd;", line = 705)
    public static final class94 method400(class122 arg0, byte arg1, int arg2) {
        field1252++;
        try {
            int var3 = -28 / ((31 - arg1) / 60);
            class94 var4 = new class94();
            var4.field2396 = arg0.method948(-90);
            if (arg2 < var4.field2396) {
                var4.field2396 = arg2;
            }
            var4.field2382 = new byte[var4.field2396];
            arg0.field3047 += class110.field2755.method164(0, 1, var4.field2382, var4.field2396, arg0.field3074, arg0.field3047);
            return var4;
        } catch (Exception var5) {
            return class66.field1635;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(ILjb;Ljb;I)V", line = 957)
    public class50(int arg0, class55 arg1, class55 arg2, int arg3) {
        this.field1228 = arg0;
        this.field1247 = arg2;
        this.field1236 = arg1;
        this.field1241 = arg3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIII)I", line = 763)
    public static final int method401(byte arg0, int arg1, int arg2, int arg3) {
        field1230++;
        int var4 = 256 - arg3;
        int var5 = 14 / ((arg0 - 27) / 39);
        return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg3 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V", line = 780)
    public static final void method402(int arg0, int arg1) {
        class70.method527((byte) 99);
        int var2 = class95.method730(23, arg1).field2545;
        if (arg0 < 110) {
            field1261 = null;
        }
        field1260++;
        if (var2 == 0) {
            return;
        }
        int var3 = class37.field953[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class124.method990(0.9D);
                ((class79) class124.field3148).method587(0.9D, (byte) 122);
            }
            if (var3 == 2) {
                class124.method990(0.8D);
                ((class79) class124.field3148).method587(0.8D, (byte) 120);
            }
            if (var3 == 3) {
                class124.method990(0.7D);
                ((class79) class124.field3148).method587(0.7D, (byte) 121);
            }
            if (var3 == 4) {
                class124.method990(0.6D);
                ((class79) class124.field3148).method587(0.6D, (byte) 121);
            }
            class62.method463(6562);
            class9.field249 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class112.field2837 != var4) {
                if (class112.field2837 == 0 && class36.field946 != -1) {
                    class123.method969(false, class77.field1978, class36.field946, 0, var4, true, 0);
                    class103.field2595 = 0;
                } else if (var4 == 0) {
                    class123.method968(81);
                    class103.field2595 = 0;
                } else {
                    class70.method515(46, var4);
                }
                class112.field2837 = var4;
            }
        }
        if (var2 == 6) {
            class17.field438 = var3;
        }
        if (var2 == 5) {
            class99.field2520 = var3;
        }
        if (var2 == 8) {
            class73.field1781 = true;
            class4.field94 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class20.field537 = 127;
            }
            if (var3 == 1) {
                class20.field537 = 96;
            }
            if (var3 == 2) {
                class20.field537 = 64;
            }
            if (var3 == 3) {
                class20.field537 = 32;
            }
            if (var3 == 4) {
                class20.field537 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class31.field897 = 127;
            }
            if (var3 == 1) {
                class31.field897 = 96;
            }
            if (var3 == 2) {
                class31.field897 = 64;
            }
            if (var3 == 3) {
                class31.field897 = 32;
            }
            if (var3 == 4) {
                class31.field897 = 0;
            }
        }
        if (var2 == 9) {
            class107.field2660 = var3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "toString", descriptor = "()Ljava/lang/String;", line = 937)
    public final String toString() {
        field1256++;
        return "Cache:" + this.field1228;
    }
}
