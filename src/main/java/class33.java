import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class33 extends class88 {

    @OriginalMember(owner = "client!fb", name = "Sc", descriptor = "Lwb;")
    private static class130 field901 = class26.method212("glow3:", -32376);

    @OriginalMember(owner = "client!fb", name = "Wc", descriptor = "Lwb;")
    public static class130 field905 = field901;

    @OriginalMember(owner = "client!fb", name = "Xc", descriptor = "Lwb;")
    public static class130 field906 = class26.method212("gelb:", -32376);

    @OriginalMember(owner = "client!fb", name = "bd", descriptor = "Lwb;")
    private static class130 field910 = class26.method212("Classic", -32376);

    @OriginalMember(owner = "client!fb", name = "Tc", descriptor = "Lwb;")
    public static class130 field902 = class26.method212(",Zffentlicher Chat", -32376);

    @OriginalMember(owner = "client!fb", name = "ad", descriptor = "Lwb;")
    public static class130 field909 = class26.method212("sch-Utteln:", -32376);

    @OriginalMember(owner = "client!fb", name = "kd", descriptor = "Lwb;")
    public static class130 field919 = class26.method212("Sichtbare Karte vorbereitet)3", -32376);

    @OriginalMember(owner = "client!fb", name = "id", descriptor = "Lwb;")
    private static class130 field917 = class26.method212("flash3:", -32376);

    @OriginalMember(owner = "client!fb", name = "gd", descriptor = "Lwb;")
    public static class130 field915 = class26.method212("", -32376);

    @OriginalMember(owner = "client!fb", name = "hd", descriptor = "Z")
    public static boolean field916 = true;

    @OriginalMember(owner = "client!fb", name = "od", descriptor = "Lwb;")
    public static class130 field923 = field917;

    @OriginalMember(owner = "client!fb", name = "nd", descriptor = "[Lkb;")
    public static class62[] field922 = new class62[50];

    @OriginalMember(owner = "client!fb", name = "dd", descriptor = "Lwb;")
    public static class130 field912 = field910;

    @OriginalMember(owner = "client!fb", name = "Rc", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!fb", name = "Uc", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!fb", name = "Vc", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!fb", name = "Yc", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!fb", name = "Zc", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!fb", name = "cd", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!fb", name = "fd", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!fb", name = "jd", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!fb", name = "ld", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!fb", name = "md", descriptor = "Lk;")
    public static class60 field921;

    @OriginalMember(owner = "client!fb", name = "ed", descriptor = "Lo;")
    public class84 field913;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(B)Lr;", line = 3)
    public final class102 method10(byte arg0) {
        if (arg0 != -38) {
            method263((class59) null, 36, 94, -6);
        }
        ++field908;
        if (this.field913 == null) {
            return null;
        } else {
            class40 var2 = ~super.field2115 != 0 && super.field2139 == 0 ? class85.method641(super.field2115, 12) : null;
            class40 var3 = super.field2101 == -1 || ~super.field2101 == ~super.field2068 && var2 != null ? null : class85.method641(super.field2101, 12);
            class102 var4 = this.field913.method637(super.field2112, var2, true, super.field2109, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method764();
                super.field2078 = var4.field634;
                if (~super.field2117 != 0 && ~super.field2129 != 0) {
                    class102 var5 = class21.method190(super.field2117, -9101).method863(super.field2129, (byte) -106);
                    if (var5 != null) {
                        class102[] var6 = new class102[] { var4, var5 };
                        var5.method776(0, -super.field2095, 0);
                        var4 = new class102(var6, 2, true);
                    }
                }
                if (~this.field913.field1981 == -2) {
                    var4.field2467 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)Z", line = 59)
    public final boolean method259(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field920;
            return this.field913 != null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)V", line = 75)
    public static final void method260(int arg0) {
        ++field900;
        class67.field1682.method723((byte) -79);
        int var1 = class67.field1682.method721(8, (byte) -123);
        if (class58.field1466 > var1) {
            for (int var2 = var1; ~var2 > ~class58.field1466; ++var2) {
                class81.field1933[class14.field403++] = class24.field716[var2];
            }
        }
        if (~var1 < ~class58.field1466) {
            throw new RuntimeException("gnpov1");
        } else {
            class58.field1466 = 0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class24.field716[var3];
                class33 var5 = class26.field766[var4];
                int var6 = class67.field1682.method721(1, (byte) -125);
                if (var6 == 0) {
                    class24.field716[class58.field1466++] = var4;
                    var5.field2104 = class130.field3128;
                } else {
                    int var7 = class67.field1682.method721(2, (byte) -97);
                    if (var7 == 0) {
                        class24.field716[class58.field1466++] = var4;
                        var5.field2104 = class130.field3128;
                        class69.field1775[class45.field1220++] = var4;
                    } else if (~var7 == -2) {
                        class24.field716[class58.field1466++] = var4;
                        var5.field2104 = class130.field3128;
                        int var8 = class67.field1682.method721(3, (byte) -102);
                        var5.method652(false, 1, var8);
                        int var9 = class67.field1682.method721(1, (byte) -117);
                        if (~var9 == -2) {
                            class69.field1775[class45.field1220++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class24.field716[class58.field1466++] = var4;
                        var5.field2104 = class130.field3128;
                        int var10 = class67.field1682.method721(3, (byte) -118);
                        var5.method652(true, 1, var10);
                        int var11 = class67.field1682.method721(3, (byte) -105);
                        var5.method652(true, 1, var11);
                        int var12 = class67.field1682.method721(1, (byte) -102);
                        if (var12 == 1) {
                            class69.field1775[class45.field1220++] = var4;
                        }
                    } else if (var7 == 3) {
                        class81.field1933[class14.field403++] = var4;
                    }
                }
            }
            if (arg0 < 92) {
                method262(true, -73);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V", line = 190)
    public static final void method261(int arg0) {
        ++field914;
        class54.field1401.method401(26116);
        if (arg0 != -3) {
            method261(-90);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V", line = 207)
    public static final void method262(boolean arg0, int arg1) {
        ++field918;
        if (arg1 != -18946) {
            field919 = null;
        }
        for (int var2 = 0; class58.field1466 > var2; ++var2) {
            class33 var3 = class26.field766[class24.field716[var2]];
            int var4 = (class24.field716[var2] << 14) + 536870912;
            if (var3 != null && var3.method259(false) && !var3.field913.field1988 == !arg0 && var3.field913.method635(-23723)) {
                int var5 = var3.field2128 >> 7;
                int var6 = var3.field2071 >> 7;
                if (~var6 <= -1 && ~var6 > -105 && ~var5 <= -1 && var5 < 104) {
                    if (var3.field2076 == 1 && (127 & var3.field2071) == 64 && ~(127 & var3.field2128) == -65) {
                        if (~class94.field2278[var6][var5] == ~class117.field2904) {
                            continue;
                        }
                        class94.field2278[var6][var5] = class117.field2904;
                    }
                    if (!var3.field913.field1994) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class79.field1926.method267(class71.field1818, var3.field2071, var3.field2128, class27.method219(arg1 + 336156265, class71.field1818, var3.field2128 - -((var3.field2076 + -1) * 64), var3.field2076 * 64 + -64 + var3.field2071), var3.field2076 * 64 + -64 + 60, var3, var3.field2099, var4, var3.field2119);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lje;III)V", line = 263)
    public static final void method263(class59 arg0, int arg1, int arg2, int arg3) {
        ++field904;
        if (~(arg1 & 2) != -1) {
            arg0.field2116 = class67.field1682.method337((byte) 13);
            arg0.field2125 = class67.field1682.method351((byte) -109);
        }
        if (~(arg1 & 16) != -1) {
            arg0.field2074 = class67.field1682.method355((byte) 108);
            if (arg0.field2074.method964(true, 0) == 126) {
                arg0.field2074 = arg0.field2074.method977(1, true);
                class41.method400(arg0.field1515, (byte) 56, arg0.field2074, 2);
            } else if (class42.field1179 == arg0) {
                class41.method400(arg0.field1515, (byte) 56, arg0.field2074, 2);
            }
            arg0.field2089 = 150;
            arg0.field2114 = 0;
            arg0.field2087 = 0;
        }
        if (~(arg1 & 128) != -1) {
            int var4 = class67.field1682.method346(-32768);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class67.field1682.method350((byte) -123);
            if (~arg0.field2115 == ~var4 && ~var4 != 0) {
                int var6 = class85.method641(var4, 12).field1114;
                if (var6 == 1) {
                    arg0.field2134 = 0;
                    arg0.field2112 = 0;
                    arg0.field2131 = 0;
                    arg0.field2139 = var5;
                }
                if (var6 == 2) {
                    arg0.field2131 = 0;
                }
            } else if (~var4 == 0 || arg0.field2115 == -1 || ~class85.method641(var4, arg2 ^ 12).field1133 <= ~class85.method641(arg0.field2115, 12).field1133) {
                arg0.field2131 = 0;
                arg0.field2139 = var5;
                arg0.field2092 = arg0.field2140;
                arg0.field2115 = var4;
                arg0.field2134 = 0;
                arg0.field2112 = 0;
            }
        }
        if ((arg1 & 1) != 0) {
            int var7 = class67.field1682.method346(arg2 + -32768);
            int var8 = class67.field1682.method350((byte) -105);
            int var9 = class67.field1682.method367(-1);
            int var10 = class67.field1682.field1057;
            if (arg0.field1515 != null && arg0.field1484 != null) {
                long var11 = arg0.field1515.method988(-99);
                boolean var13 = false;
                if (~var8 >= -2) {
                    for (int var14 = 0; var14 < class109.field2657; ++var14) {
                        if (~class59.field1477[var14] == ~var11) {
                            var13 = true;
                            break;
                        }
                    }
                }
                if (!var13 && ~class14.field411 == -1) {
                    class101.field2428.field1057 = 0;
                    class67.field1682.method358(var9, false, class101.field2428.field1067, 0);
                    class101.field2428.field1057 = 0;
                    class130 var15 = class128.method944((byte) 13, class101.field2428).method969(0);
                    arg0.field2074 = var15.method967((byte) 56);
                    arg0.field2087 = var7 >> 8;
                    arg0.field2114 = 255 & var7;
                    arg0.field2089 = 150;
                    if (var8 != 2 && var8 != 3) {
                        if (var8 == 1) {
                            class41.method400(class15.method114(new class130[] { class83.field1949, arg0.field1515 }, -20349), (byte) 56, var15, 1);
                        } else {
                            class41.method400(arg0.field1515, (byte) 56, var15, 2);
                        }
                    } else {
                        class41.method400(class15.method114(new class130[] { class7.field232, arg0.field1515 }, -20349), (byte) 56, var15, 1);
                    }
                }
            }
            class67.field1682.field1057 = var9 + var10;
        }
        if (~(256 & arg1) != -1) {
            arg0.field2117 = class67.field1682.method349((byte) 55);
            int var16 = class67.field1682.method356(49152);
            if (arg0.field2117 == 65535) {
                arg0.field2117 = -1;
            }
            arg0.field2093 = class130.field3128 - -(65535 & var16);
            arg0.field2121 = 0;
            arg0.field2129 = 0;
            if (arg0.field2093 > class130.field3128) {
                arg0.field2129 = -1;
            }
            arg0.field2095 = var16 >> 16;
        }
        if ((64 & arg1) != 0) {
            int var17 = class67.field1682.method365((byte) -128);
            byte[] var18 = new byte[var17];
            class36 var19 = new class36(var18);
            class67.field1682.method358(var17, false, var18, 0);
            class103.field2527[arg3] = var19;
            arg0.method485((byte) 104, var19);
        }
        if ((arg1 & 4) != 0) {
            int var20 = class67.field1682.method333(0);
            int var21 = class67.field1682.method365((byte) -126);
            arg0.method651(101, var20, class130.field3128, var21);
            arg0.field2102 = class130.field3128 + 300;
            arg0.field2088 = class67.field1682.method333(0);
            arg0.field2090 = class67.field1682.method365((byte) -122);
        }
        if ((512 & arg1) != 0) {
            arg0.field2073 = class67.field1682.method333(0);
            arg0.field2142 = class67.field1682.method333(arg2);
            arg0.field2091 = class67.field1682.method367(-1);
            arg0.field2077 = class67.field1682.method365((byte) -126);
            arg0.field2133 = class67.field1682.method346(-32768) - -class130.field3128;
            arg0.field2070 = class67.field1682.method351((byte) -127) + class130.field3128;
            arg0.field2098 = class67.field1682.method365((byte) -122);
            arg0.method656(0);
        }
        if (~(arg1 & 1024) != -1) {
            int var22 = class67.field1682.method365((byte) -127);
            int var23 = class67.field1682.method333(0);
            arg0.method651(93, var22, class130.field3128, var23);
            arg0.field2102 = class130.field3128 + 300;
            arg0.field2088 = class67.field1682.method333(0);
            arg0.field2090 = class67.field1682.method365((byte) -126);
        }
        if ((arg1 & 32) != arg2) {
            arg0.field2085 = class67.field1682.method351((byte) -120);
            if (~arg0.field2085 == -65536) {
                arg0.field2085 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 492)
    public static final void method264(String arg0, Throwable arg1, byte arg2) {
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class120.method917(arg1, (byte) -55);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class39 var8 = class113.field2803.method843(new URL(class113.field2803.field2712.getCodeBase(), "clienterror.ws?c=" + class83.field1953 + "&u=" + class7.field252 + "&v1=" + class110.field2701 + "&v2=" + class110.field2702 + "&e=" + var7), (byte) 119);
            int var9 = -6 / ((-59 - arg2) / 41);
            while (~var8.field1099 == -1) {
                class37.method375(-1, 1L);
            }
            if (~var8.field1099 == -2) {
                DataInputStream var10 = (DataInputStream) var8.field1100;
                var10.read();
                var10.close();
            }
        } catch (Exception var11) {
        }
        ++field911;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(Z)V", line = 559)
    public static final void method265(boolean arg0) {
        ++field903;
        if (class132.field3194) {
            class47.field1260 = null;
            class83.field1959 = null;
            class101.field2447 = null;
            class1.field17 = null;
            class109.field2649 = null;
            class26.field767 = null;
            class51.field1354 = null;
            class43.field1194 = null;
            if (!arg0) {
                field901 = null;
            }
            class98.field2376 = null;
            class109.field2624 = null;
            class112.field2749 = null;
            class117.field2890 = null;
            class56.field1439 = null;
            class32.field888 = null;
            class92.field2206 = null;
            class111.field2742 = null;
            class130.field3068 = null;
            class43.field1190 = null;
            class106.field2567 = null;
            class108.field2616 = null;
            class67.field1740 = null;
            class42.field1184 = null;
            class65.method531(10, (byte) 102);
            class99.method736(-118, true);
            class132.field3194 = false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)V", line = 597)
    public static void method266(int arg0) {
        field919 = null;
        field906 = null;
        field909 = null;
        field905 = null;
        field922 = null;
        if (arg0 >= -117) {
            field915 = null;
        }
        field910 = null;
        field917 = null;
        field915 = null;
        field912 = null;
        field923 = null;
        field901 = null;
        field921 = null;
        field902 = null;
    }
}
