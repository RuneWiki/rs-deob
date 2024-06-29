import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class84 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lke;")
    private static class65 field2213 = class1.method17("Loaded textures", -119);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lke;")
    public static class65 field2216 = class1.method17("Ihr Charakter)2Profil wird in:", -125);

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lke;")
    public static class65 field2220 = field2213;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2224 = -1;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lke;")
    private static class65 field2223 = class1.method17("Accept challenge", -121);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lke;")
    public static class65 field2211 = class1.method17(":duelreq:", -125);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lke;")
    private static class65 field2231 = class1.method17("glow2:", -123);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lke;")
    public static class65 field2210 = field2223;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lke;")
    public static class65 field2212 = field2231;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Luc;")
    public static class119 field2221;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
    public static int[] field2217;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIILjd;II)V", line = 8)
    public static final synchronized void method748(boolean arg0, int arg1, int arg2, int arg3, int arg4, class58 arg5, int arg6, int arg7) {
        if (arg3 != 765) {
            return;
        }
        field2226++;
        if (!class81.method707((byte) 94)) {
            return;
        }
        class114.field2850 = arg0;
        class27.field664 = arg1;
        class80.field2138 = -1;
        class39.field1004 = arg6;
        class117.field2930 = arg5;
        class64.field1683 = true;
        class72.field1890 = arg2;
        class125.field3043 = arg7;
        class62.field1635 = arg4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 37)
    public static void method749(int arg0) {
        if (arg0 != 357) {
            return;
        }
        field2231 = null;
        field2212 = null;
        field2220 = null;
        field2221 = null;
        field2223 = null;
        field2213 = null;
        field2217 = null;
        field2216 = null;
        field2211 = null;
        field2210 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcc;ZZ)Z", line = 58)
    public static final boolean method750(class15 arg0, boolean arg1, boolean arg2) {
        class12.field246 = 20;
        field2219++;
        try {
            class93.field2464 = (class128) Class.forName("cb").getDeclaredConstructor().newInstance();
            return true;
        } catch (Throwable var4) {
            if (arg1) {
                field2211 = null;
            }
            class106 var3 = arg0.method101(0);
            if (var3 != null) {
                class93.field2464 = new class120(arg0, var3);
                return true;
            } else if (arg2) {
                class93.field2464 = new class113(arg0);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)V", line = 93)
    public static final void method751(boolean arg0, int arg1) {
        field2229++;
        if (class32.field833.field1067 >> 7 == class13.field283 && class32.field833.field1070 >> 7 == class64.field1661) {
            class13.field283 = 0;
        }
        int var2 = class72.field1895;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = arg1; var3 < var2; var3++) {
            int var4;
            class114 var5;
            if (arg0) {
                var4 = 33538048;
                var5 = class32.field833;
            } else {
                var4 = class10.field187[var3] << 14;
                var5 = class52.field1324[class10.field187[var3]];
            }
            if (var5 != null && var5.method363(0)) {
                var5.field2836 = false;
                if ((class41.field1065 && class72.field1895 > 50 || class72.field1895 > 200) && !arg0 && var5.field1064 == var5.field1062) {
                    var5.field2836 = true;
                }
                int var6 = var5.field1067 >> 7;
                int var7 = var5.field1070 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field2869 == null || var5.field2858 > class76.field2028 || class76.field2028 >= var5.field2841) {
                        if ((var5.field1067 & 0x7F) == 64 && (var5.field1070 & 0x7F) == 64) {
                            if (class46.field1216[var6][var7] == class112.field2775) {
                                continue;
                            }
                            class46.field1216[var6][var7] = class112.field2775;
                        }
                        var5.field2863 = class58.method495(var5.field1070, var5.field1067, true, class19.field462);
                        class89.field2377.method599(class19.field462, var5.field1067, var5.field1070, var5.field2863, 60, var5, var5.field1081, var4, var5.field1050);
                    } else {
                        var5.field2836 = false;
                        var5.field2863 = class58.method495(var5.field1070, var5.field1067, true, class19.field462);
                        class89.field2377.method588(class19.field462, var5.field1067, var5.field1070, var5.field2863, 60, var5, var5.field1081, var4, var5.field2844, var5.field2868, var5.field2843, var5.field2840);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 177)
    public static final synchronized void method752(int arg0) {
        field2218++;
        if (!class81.method707((byte) 94)) {
            return;
        }
        class125.method986(-110);
        class117.field2930 = null;
        if (arg0 != -19964) {
            method751(true, -66);
        }
        class64.field1683 = false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILke;ZLjd;ILke;BI)V", line = 195)
    public static final synchronized void method753(int arg0, class65 arg1, boolean arg2, class58 arg3, int arg4, class65 arg5, byte arg6, int arg7) {
        field2215++;
        if (class81.method707((byte) 94)) {
            int var8 = -85 / ((arg6 - 35) / 58);
            int var9 = arg3.method490(arg5, 92);
            int var10 = arg3.method470(28389, arg1, var9);
            method748(arg2, arg0, arg7, 765, var10, arg3, arg4, var9);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 234)
    public static final synchronized void method754(byte arg0) {
        if (arg0 != 94) {
            method748(true, 116, 88, -53, -81, null, 16, -116);
        }
        field2225++;
        class101.method843((byte) 10);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)V", line = 247)
    public static final synchronized void method755(int arg0, byte arg1) {
        field2214++;
        if (!class81.method707((byte) 94)) {
            return;
        }
        class117.method951((byte) -61, arg0);
        if (arg1 <= 37) {
            method757(null, null, true);
        }
        class64.field1683 = false;
        class117.field2930 = null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 264)
    public static final synchronized void method756(int arg0) {
        field2222++;
        if (arg0 != 0 || !class81.method707((byte) 94)) {
            return;
        }
        if (class64.field1683) {
            byte[] var1 = class33.method261(arg0 ^ 0xFFFFFF92, class125.field3043, class62.field1635, class39.field1004, class117.field2930);
            if (var1 != null) {
                if (class72.field1890 >= 0) {
                    class99.method830(class114.field2850, var1, class72.field1890, -122, class27.field664);
                } else if (class80.field2138 >= 0) {
                    class24.method191(class27.field664, 107, class114.field2850, class80.field2138, var1);
                } else {
                    class66.method567(class27.field664, class114.field2850, var1, 78);
                }
                class64.field1683 = false;
                class117.field2930 = null;
            }
        }
        class46.method393(32584);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcc;Ljava/awt/Component;Z)Lr;", line = 303)
    public static final class105 method757(class15 arg0, Component arg1, boolean arg2) {
        if (!arg2) {
            return null;
        }
        class87.method779(arg1, (byte) 124, arg0);
        field2228++;
        class105 var3 = new class105();
        class75.method668(!arg2, var3);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V", line = 323)
    public static final void method758(int arg0) {
        field2227++;
        if (class80.field2128 != 0) {
            return;
        }
        class29.field783[0] = class112.field2792;
        class23.field557[0] = 1004;
        class125.field3040 = 1;
        if (class10.field213 != -1) {
            class87.field2304 = -1;
            class89.field2378 = -1;
            class92.method801(0, 0, 503, class10.field213, 0, 765, class52.field1320, class91.field2418, -1, false, 0);
            class47.field1227 = class87.field2304;
            class41.field1048 = class89.field2378;
            return;
        }
        class100.method837(-6672);
        class87.field2304 = -1;
        if (arg0 != -65) {
            return;
        }
        boolean var1 = false;
        class89.field2378 = -1;
        if (class91.field2418 > 4 && class52.field1320 > 4 && class91.field2418 < 516 && class52.field1320 < 338) {
            if (class93.field2472 == -1) {
                class91.method796((byte) -29);
            } else {
                class92.method801(4, 0, 338, class93.field2472, 0, 516, class52.field1320, class91.field2418, -1, false, 4);
            }
        }
        class41.field1048 = class89.field2378;
        class89.field2378 = -1;
        class47.field1227 = class87.field2304;
        class87.field2304 = -1;
        if (class91.field2418 > 553 && class52.field1320 > 205 && class91.field2418 < 743 && class52.field1320 < 466) {
            if (class66.field1767 != -1) {
                class92.method801(205, 0, 466, class66.field1767, 1, 743, class52.field1320, class91.field2418, -1, false, 553);
            } else if (class27.field728[class89.field2368] != -1) {
                class92.method801(205, 0, 466, class27.field728[class89.field2368], 1, 743, class52.field1320, class91.field2418, -1, false, 553);
            }
        }
        if (class87.field2304 != class10.field221) {
            class116.field2910 = true;
            class10.field221 = class87.field2304;
        }
        if (class92.field2434 != class89.field2378) {
            class116.field2910 = true;
            class92.field2434 = class89.field2378;
        }
        class87.field2304 = -1;
        class89.field2378 = -1;
        if (class91.field2418 > 17 && class52.field1320 > 357 && class91.field2418 < 496 && class52.field1320 < 453) {
            if (class117.field2939 != -1) {
                class92.method801(357, 0, 453, class117.field2939, 2, 496, class52.field1320, class91.field2418, -1, false, 17);
            } else if (class51.field1312 != -1) {
                class92.method801(357, 0, 453, class51.field1312, 3, 496, class52.field1320, class91.field2418, -1, false, 17);
            } else if (class52.field1320 < 434 && class91.field2418 < 426) {
                class50.method404(-14, class52.field1320 - 357, class91.field2418 + -17);
            }
        }
        if ((class117.field2939 != -1 || class51.field1312 != -1) && class87.field2304 != class10.field172) {
            class10.field172 = class87.field2304;
            class39.field996 = true;
        }
        if ((class117.field2939 != -1 || class51.field1312 != -1) && class89.field2378 != class114.field2854) {
            class114.field2854 = class89.field2378;
            class39.field996 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class125.field3040 - 1; var2++) {
                if (class23.field557[var2] < 1000 && class23.field557[var2 + 1] > 1000) {
                    var1 = false;
                    class65 var3 = class29.field783[var2];
                    class29.field783[var2] = class29.field783[var2 + 1];
                    class29.field783[var2 + 1] = var3;
                    int var4 = class23.field557[var2];
                    class23.field557[var2] = class23.field557[var2 + 1];
                    class23.field557[var2 + 1] = var4;
                    int var5 = class113.field2812[var2];
                    class113.field2812[var2] = class113.field2812[var2 + 1];
                    class113.field2812[var2 + 1] = var5;
                    int var6 = class75.field2017[var2];
                    class75.field2017[var2] = class75.field2017[var2 + 1];
                    class75.field2017[var2 + 1] = var6;
                    int var7 = class7.field135[var2];
                    class7.field135[var2] = class7.field135[var2 + 1];
                    class7.field135[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLjd;IIIZ)V", line = 485)
    public static final synchronized void method759(int arg0, byte arg1, class58 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2230++;
        if (!class81.method707((byte) 94)) {
            return;
        }
        if (arg1 != -124) {
            field2217 = null;
        }
        class114.field2850 = arg6;
        class117.field2930 = arg2;
        class39.field1004 = arg0;
        class72.field1890 = -1;
        class62.field1635 = arg4;
        class64.field1683 = true;
        class125.field3043 = arg5;
        class80.field2138 = -1;
        class27.field664 = arg3;
    }
}
