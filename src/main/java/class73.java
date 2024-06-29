import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2031 = Calendar.getInstance();

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Z")
    public static boolean field2037 = false;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lrd;")
    private static class117 field2036 = class95.method812("Please try using a different world)3", (byte) 8);

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field2041 = 0;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lrd;")
    public static class117 field2040 = field2036;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field2035 = 0;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Lrd;")
    private static class117 field2039 = class95.method812("Enter name of friend to add to list", (byte) 8);

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Lrd;")
    public static class117 field2046 = field2036;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Lrd;")
    public static class117 field2043 = field2039;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lrd;")
    public static class117 field2045 = field2036;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lrd;")
    public static class117 field2056 = field2036;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lrd;")
    public static class117 field2054 = field2036;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Lrd;")
    private static class117 field2053 = class95.method812("Try again in 60 secs)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lrd;")
    public static class117 field2057 = field2036;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lrd;")
    private static class117 field2052 = class95.method812("We suspect someone knows your password)3", (byte) 8);

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lrd;")
    public static class117 field2050 = field2053;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "Lrd;")
    public static class117 field2055 = field2052;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "J")
    public long field2048;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lkd;")
    public class73 field2029;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Lkd;")
    public class73 field2038;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "[[[B")
    public static byte[][][] field2049;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    public static final int method689(int arg0, int arg1, int arg2) {
        field2058++;
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (arg2 <= 5) {
            field2045 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method690(int arg0) {
        field2055 = null;
        field2045 = null;
        field2053 = null;
        field2057 = null;
        field2040 = null;
        field2049 = null;
        field2056 = null;
        field2043 = null;
        field2039 = null;
        field2050 = null;
        field2031 = null;
        field2054 = null;
        if (arg0 != -27531) {
            field2050 = null;
        }
        field2036 = null;
        field2046 = null;
        field2052 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public final void method691(int arg0) {
        if (arg0 != 0) {
            field2041 = -119;
        }
        field2030++;
        if (this.field2029 != null) {
            this.field2029.field2038 = this.field2038;
            this.field2038.field2029 = this.field2029;
            this.field2029 = null;
            this.field2038 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Z")
    public final boolean method692(int arg0) {
        field2027++;
        int var2 = -36 / ((arg0 - 53) / 45);
        return this.field2029 != null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static final void method693(byte arg0) {
        field2033++;
        if (class42.field1207 != 0 || class21.field603 != null) {
            return;
        }
        int var1 = client.field624;
        if (class46.field1292 && class66.field1873 >= 516 && class68.field1909 >= 160 && class66.field1873 <= 765 && class68.field1909 <= 205) {
            var1 = 0;
        }
        if (class15.field354) {
            if (var1 != 1) {
                int var2 = class121.field2961;
                int var3 = class66.field1878;
                if (client.field613 == 0) {
                    var2 -= 4;
                    var3 -= 4;
                }
                if (client.field613 == 1) {
                    var2 -= 553;
                    var3 -= 205;
                }
                if (client.field613 == 2) {
                    var2 -= 17;
                    var3 -= 357;
                }
                if (class138.field3311 - 10 > var2 || var2 > class83.field2178 + class138.field3311 + 10 || var3 < class44.field1242 - 10 || class107.field2657 + class44.field1242 + 10 < var3) {
                    if (client.field613 == 2) {
                        class18.field458 = true;
                    }
                    if (client.field613 == 1) {
                        class13.field262 = true;
                    }
                    class15.field354 = false;
                }
            }
            if (var1 == 1) {
                int var4 = class138.field3311;
                int var5 = class44.field1242;
                int var6 = class83.field2178;
                int var7 = class66.field1873;
                int var8 = class68.field1909;
                if (client.field613 == 0) {
                    var8 -= 4;
                    var7 -= 4;
                }
                if (client.field613 == 1) {
                    var7 -= 553;
                    var8 -= 205;
                }
                int var9 = -1;
                if (client.field613 == 2) {
                    var7 -= 17;
                    var8 -= 357;
                }
                for (int var10 = 0; var10 < class21.field604; var10++) {
                    int var11 = (class21.field604 - var10 - 1) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var11 + 3 > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class41.method471(var9, (byte) 50);
                }
                class15.field354 = false;
                if (client.field613 == 1) {
                    class13.field262 = true;
                }
                if (client.field613 == 2) {
                    class18.field458 = true;
                }
            }
        } else {
            if (var1 == 1 && class21.field604 > 0) {
                int var12 = class79.field2119[class21.field604 - 1];
                if (var12 == 28 || var12 == 13 || var12 == 9 || var12 == 54 || var12 == 25 || var12 == 45 || var12 == 37 || var12 == 20 || var12 == 4 || var12 == 33 || var12 == 55 || var12 == 1005) {
                    int var13 = class68.field1932[class21.field604 - 1];
                    int var14 = class148.field3610[class21.field604 - 1];
                    class144 var15 = class15.method172(var14, -13778);
                    if (class14.method141(class97.method827((byte) 76, var15), -14453) || class127.method1012(class97.method827((byte) -114, var15), (byte) 89)) {
                        class46.field1305 = class68.field1909;
                        class42.field1207 = 2;
                        client.field608 = 0;
                        class92.field2323 = class66.field1873;
                        class40.field1160 = var13;
                        class7.field161 = false;
                        class26.field770 = var14;
                        if (var14 >> 16 == class121.field2977) {
                            class42.field1207 = 1;
                        }
                        if (var14 >> 16 == class56.field1553) {
                            class42.field1207 = 3;
                        }
                        return;
                    }
                }
            }
            if (var1 == 1 && (class43.field1229 == 1 || class60.method610(class21.field604 - 1, false)) && class21.field604 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class21.field604 > 0) {
                class41.method471(class21.field604 - 1, (byte) 115);
            }
            if (var1 == 2 && class21.field604 > 0) {
                class13.method109((byte) 82);
            }
        }
        if (arg0 < 112) {
            method689(-109, 3, 65);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILkf;)V")
    public static final void method694(int arg0, class75 arg1) {
        if (arg0 > -71) {
            return;
        }
        arg1.field2079 = false;
        if (arg1.field2077 != null) {
            arg1.field2077.field2111 = 0;
        }
        for (class75 var2 = arg1.method402(); var2 != null; var2 = arg1.method436()) {
            method694(-82, var2);
        }
        field2047++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static final void method695(boolean arg0) {
        field2032++;
        class119 var1 = class72.field2001;
        synchronized (class72.field2001) {
            class117.field2870 = field2041;
            if (arg0) {
                method693((byte) -22);
            }
            if (class49.field1430 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class49.field1435[var2] = false;
                }
                class49.field1430 = class16.field373;
            } else {
                while (class49.field1430 != class16.field373) {
                    int var3 = class41.field1172[class16.field373];
                    class16.field373 = class16.field373 + 1 & 0x7F;
                    if (var3 < 0) {
                        class49.field1435[~var3] = false;
                    } else {
                        class49.field1435[var3] = true;
                    }
                }
            }
            field2041 = class39.field1136;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lge;ILge;Lge;)V")
    public static final void method696(class47 arg0, int arg1, class47 arg2, class47 arg3) {
        class93.field2341 = arg0;
        class138.field3316 = arg3;
        class87.field2253 = arg2;
        if (arg1 != 127) {
            method697(-26, (byte) -54);
        }
        field2044++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
    public static final void method697(int arg0, byte arg1) {
        if (arg1 > -107) {
            field2036 = null;
        }
        field2028++;
        class32.method374(-55);
        int var2 = class90.method794(arg0, 80).field3040;
        if (var2 == 0) {
            return;
        }
        int var3 = class105.field2621[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class129.method1063(0.9D);
                ((class137) class129.field3125).method1112(true, 0.9D);
            }
            if (var3 == 2) {
                class129.method1063(0.8D);
                ((class137) class129.field3125).method1112(true, 0.8D);
            }
            if (var3 == 3) {
                class129.method1063(0.7D);
                ((class137) class129.field3125).method1112(true, 0.7D);
            }
            if (var3 == 4) {
                class129.method1063(0.6D);
                ((class137) class129.field3125).method1112(true, 0.6D);
            }
            class119.method984(-4226);
            class109.field2727 = true;
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
            if (class16.field383 != var4) {
                if (class16.field383 == 0 && class63.field1814 != -1) {
                    class53.method584(class71.field1980, class63.field1814, 0, 10000, false, var4);
                    class71.field1984 = false;
                } else if (var4 == 0) {
                    class142.method1132(20439);
                    class71.field1984 = false;
                } else {
                    class13.method111(var4, 14410);
                }
                class16.field383 = var4;
            }
        }
        if (var2 == 9) {
            class2.field53 = var3;
        }
        if (var2 == 5) {
            class43.field1229 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class72.field2024 = 127;
            }
            if (var3 == 1) {
                class72.field2024 = 96;
            }
            if (var3 == 2) {
                class72.field2024 = 64;
            }
            if (var3 == 3) {
                class72.field2024 = 32;
            }
            if (var3 == 4) {
                class72.field2024 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class63.field1813 = 127;
            }
            if (var3 == 1) {
                class63.field1813 = 96;
            }
            if (var3 == 2) {
                class63.field1813 = 64;
            }
            if (var3 == 3) {
                class63.field1813 = 32;
            }
            if (var3 == 4) {
                class63.field1813 = 0;
            }
        }
        if (var2 == 6) {
            class58.field1627 = var3;
        }
        if (var2 == 8) {
            class94.field2364 = var3;
            class18.field458 = true;
        }
    }
}
