import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class320 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Z")
    public static boolean field1945 = true;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "Llm;")
    public static class210 field1944;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Llm;")
    public static class210 field1948;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
    public static int[] field1947;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "[[[B")
    public static byte[][][] field1952;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lf;)Lf;", line = 4)
    public static final class329 method898(class329 arg0) {
        int var1 = method902(arg0).method129(-1016220482);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class80.method541((byte) 96, arg0.field5091);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 24)
    private final void method899(int arg0) {
        field1950++;
        if (arg0 == 0) {
            boolean var2 = class274.field4208.method649(-18808);
            if (!var2) {
                this.method901(-67);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 43)
    public final void method900(byte arg0) {
        field1943++;
        class304.method2104(92);
        class161.field2417 = new class16();
        class274.field4208 = new class92();
        if (class21.field259 != 0) {
            class268.field4111 = new byte[50][];
        }
        class316.method2163(class274.field4200, 2954);
        if (class252.field3769 == 0) {
            class213.field3234 = this.getCodeBase().getHost();
            class110.field1697 = 43594;
            class76.field994 = 443;
        } else if (class252.field3769 == 1) {
            class213.field3234 = this.getCodeBase().getHost();
            class76.field994 = class44.field543 + 50000;
            class110.field1697 = class44.field543 + 40000;
        } else if (class252.field3769 == 2) {
            class110.field1697 = class44.field543 + 40000;
            class76.field994 = class44.field543 + 50000;
            class213.field3234 = "127.0.0.1";
        }
        class178.field2636 = class110.field1697;
        if (class237.field3555 == 1) {
            class178.field2634 = class299.field4560;
            class110.field1706 = class75.field971;
            class96.field1446 = true;
            class140.field2118 = class13.field154;
            class250.field3731 = class183.field2745;
            class280.field4260 = 16777215;
            class280.field4255 = 0;
        } else {
            class178.field2634 = class218.field3313;
            class250.field3731 = class132.field2033;
            class110.field1706 = class299.field4573;
            class140.field2118 = class205.field3095;
        }
        class283.field4286 = class213.field3234;
        if (class262.field3960 == 3 && class252.field3769 != 2) {
            class258.field3921 = class44.field543;
        }
        class302.field4614 = class178.field2636;
        class207.field3130 = class110.field1697;
        class266.field4089 = class156.field2339 = class66.field855 = class218.field3314 = new short[256];
        int var2 = 99 / ((48 - arg0) / 59);
        class41.field498 = class76.field994;
        class224.method1561(24599);
        class182.method1262(120, class315.field4764);
        class269.method1894((byte) 58, class315.field4764);
        class150.field2260 = class172.method1200(0);
        if (class150.field2260 != null) {
            class150.field2260.method187(class315.field4764, -3325);
        }
        class179.field2661 = class262.field3960;
        try {
            if (class274.field4200.field3961 != null) {
                class296.field4540 = new class182(class274.field4200.field3961, 5200, 0);
                for (int var3 = 0; var3 < 28; var3++) {
                    class162.field2447[var3] = new class182(class274.field4200.field3968[var3], 6000, 0);
                }
                class170.field2560 = new class182(class274.field4200.field3969, 6000, 0);
                class147.field2212 = new class283(255, class296.field4540, class170.field2560, 500000);
                class224.field3418 = new class182(class274.field4200.field3974, 24, 0);
                class274.field4200.field3974 = null;
                class274.field4200.field3961 = null;
                class274.field4200.field3968 = null;
                class274.field4200.field3969 = null;
            }
        } catch (IOException var5) {
            class147.field2212 = null;
            class296.field4540 = null;
            class224.field3418 = null;
            class170.field2560 = null;
        }
        if (class252.field3769 != 0) {
            class203.field3050 = true;
        }
        class145.field2200 = class57.field716;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 158)
    private final void method901(int arg0) {
        field1961++;
        if (class274.field4208.field1391 > class35.field432) {
            class141.field2122 = (class274.field4208.field1391 - 1) * 5 * 50;
            if (class141.field2122 > 3000) {
                class141.field2122 = 3000;
            }
            if (class302.field4614 == class207.field3130) {
                class302.field4614 = class41.field498;
            } else {
                class302.field4614 = class207.field3130;
            }
            if (class274.field4208.field1391 >= 2 && class274.field4208.field1393 == 6) {
                this.method2192("js5connect_outofdate", (byte) -31);
                class293.field4490 = 1000;
                return;
            }
            if (class274.field4208.field1391 >= 4 && class274.field4208.field1393 == -1) {
                this.method2192("js5crc", (byte) -31);
                class293.field4490 = 1000;
                return;
            }
            if (class274.field4208.field1391 >= 4 && (class293.field4490 == 0 || class293.field4490 == 5)) {
                if (class274.field4208.field1393 == 7 || class274.field4208.field1393 == 9) {
                    this.method2192("js5connect_full", (byte) -31);
                } else if (class274.field4208.field1393 <= 0) {
                    this.method2192("js5io", (byte) -31);
                } else {
                    this.method2192("js5connect", (byte) -31);
                }
                class293.field4490 = 1000;
                return;
            }
        }
        class35.field432 = class274.field4208.field1391;
        if (class141.field2122 > 0) {
            class141.field2122--;
            return;
        }
        try {
            if (class268.field4114 == 0) {
                class7.field48 = class274.field4200.method1777(class283.field4286, 0, class302.field4614);
                class268.field4114++;
            }
            if (class268.field4114 == 1) {
                if (class7.field48.field3456 == 2) {
                    this.method906(113, 1000);
                    return;
                }
                if (class7.field48.field3456 == 1) {
                    class268.field4114++;
                }
            }
            if (class268.field4114 == 2) {
                class300.field4577 = new class161((Socket) class7.field48.field3452, class274.field4200);
                class263 var2 = new class263(5);
                var2.method1813(55, 15);
                var2.method1815(112, 534);
                class300.field4577.method1134(var2.field3986, true, 5, 0);
                class268.field4114++;
                class170.field2552 = class231.method1594(-20375);
            }
            if (class268.field4114 == 3) {
                if (class293.field4490 == 0 || class293.field4490 == 5 || class300.field4577.method1137(-2266) > 0) {
                    int var3 = class300.field4577.method1141(65280);
                    if (var3 != 0) {
                        this.method906(112, var3);
                        return;
                    }
                    class268.field4114++;
                } else if (class231.method1594(-20375) - class170.field2552 > 30000L) {
                    this.method906(116, 1001);
                    return;
                }
            }
            if (class268.field4114 == 4) {
                boolean var4 = class293.field4490 == 5 || class293.field4490 == 10 || class293.field4490 == 28;
                class274.field4208.method646((byte) -44, !var4, class300.field4577);
                class7.field48 = null;
                class268.field4114 = 0;
                class300.field4577 = null;
            }
            int var5 = 101 / ((-arg0) / 52);
        } catch (IOException var7) {
            this.method906(109, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lf;)Li;", line = 305)
    public static final class21 method902(class329 arg0) {
        class21 var1 = (class21) class233.field3497.method1320(((long) arg0.field5086 << 32) + (long) arg0.field5040, 13002);
        return var1 == null ? arg0.field4957 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lf;)Z", line = 309)
    public static final boolean method903(class329 arg0) {
        if (class250.field3733) {
            if (method902(arg0).field242 != 0) {
                return false;
            }
            if (arg0.field5066 == 0) {
                return false;
            }
        }
        return arg0.field5026;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 323)
    public static final void main(String[] arg0) {
        field1953++;
        try {
            if (arg0.length != 4) {
                class318.method2185("argument count", true);
            }
            class44.field543 = Integer.parseInt(arg0[0]);
            class252.field3769 = 2;
            if (arg0[1].equals("live")) {
                class21.field259 = 0;
            } else if (arg0[1].equals("rc")) {
                class21.field259 = 1;
            } else if (arg0[1].equals("wip")) {
                class21.field259 = 2;
            } else {
                class318.method2185("modewhat", true);
            }
            class176.field2610 = false;
            class256.field3882 = class327.method2226((byte) 111, arg0[2]);
            if (class256.field3882 == -1) {
                if (arg0[2].equals("english")) {
                    class256.field3882 = 0;
                } else if (arg0[2].equals("german")) {
                    class256.field3882 = 1;
                } else {
                    class318.method2185("language", true);
                }
            }
            class203.method1391(class256.field3882, (byte) 103);
            class49.field624 = false;
            class194.field2908 = false;
            if (arg0[3].equals("game0")) {
                class237.field3555 = 0;
            } else if (arg0[3].equals("game1")) {
                class237.field3555 = 1;
            } else {
                class318.method2185("game", true);
            }
            class9.field78 = 0;
            class11.field128 = false;
            class5.field24 = 0;
            class171.field2569 = "";
            client var1 = new client();
            class142.field2150 = var1;
            var1.method2189("runescape", class21.field259 + 32, 534, 28, 1024, 768, false, 100);
            class106.field1661.setLocation(40, 40);
        } catch (Exception var3) {
            class19.method122(var3, (String) null, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lf;IIIIIII)V", line = 400)
    public static final void method904(class329[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class329 var9 = arg0[var8];
            if (var9 != null && var9.field5091 == arg1 && (!var9.field5022 || var9.field5066 == 0 || var9.field5000 || method902(var9).field242 != 0 || class189.field2819 == var9 || var9.field5032 == 1338) && (!var9.field5022 || !method903(var9))) {
                int var10 = var9.field4929 + arg6;
                int var11 = var9.field4962 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field5066 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field5018 + var10;
                    int var17 = var9.field4994 + var11;
                    if (var9.field5066 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class145.field2197 == var9) {
                    class194.field2898 = true;
                    class305.field4657 = var10;
                    class236.field3541 = var11;
                }
                if (!var9.field5022 || var12 < var14 && var13 < var15) {
                    if (var9.field5066 == 0) {
                        if (!var9.field5022 && method903(var9) && class38.field469 != var9) {
                            continue;
                        }
                        if (var9.field4951 && class132.field2036 >= var12 && class237.field3557 >= var13 && class132.field2036 < var14 && class237.field3557 < var15) {
                            for (class286 var18 = (class286) class211.field3202.method1109(30); var18 != null; var18 = (class286) class211.field3202.method1115((byte) 127)) {
                                if (var18.field4316) {
                                    var18.method714(107);
                                    var18.field4330.field5052 = false;
                                }
                            }
                            if (class245.field3654 == 0) {
                                class145.field2197 = null;
                                class189.field2819 = null;
                            }
                            class78.field1085 = 0;
                        }
                    }
                    if (var9.field5022) {
                        boolean var19;
                        if (class132.field2036 >= var12 && class237.field3557 >= var13 && class132.field2036 < var14 && class237.field3557 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class183.field2744 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class253.field3813 == 1 && class207.field3140 >= var12 && class28.field387 >= var13 && class207.field3140 < var14 && class28.field387 < var15) {
                            var21 = true;
                        }
                        if (var9.field4980 != null) {
                            for (int var22 = 0; var22 < var9.field4980.length; var22++) {
                                if (class120.field1879[var9.field4980[var22]]) {
                                    if (var9.field5069 == null || class304.field4641 >= var9.field5069[var22]) {
                                        byte var23 = var9.field5011[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class120.field1879[86]) && ((var23 & 0x1) == 0 || class120.field1879[82]) && ((var23 & 0x4) == 0 || class120.field1879[81])) {
                                            class8.method38(-1, var9.field5086, var22 + 1, 89, "");
                                            int var24 = var9.field5049[var22];
                                            if (var9.field5069 == null) {
                                                var9.field5069 = new int[var9.field4980.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field5069[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field5069[var22] = class304.field4641 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field5069 != null) {
                                    var9.field5069[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class204.method1405(class28.field387 - var11, class207.field3140 - var10, var9, 4447);
                        }
                        if (class145.field2197 != null && class145.field2197 != var9 && var19 && method902(var9).method133(-1)) {
                            class287.field4339 = var9;
                        }
                        if (class189.field2819 == var9) {
                            class185.field2762 = true;
                            class301.field4602 = var10;
                            class140.field2116 = var11;
                        }
                        if (var9.field5000 || var9.field5032 != 0) {
                            if (var19 && class11.field117 != 0 && var9.field4933 != null) {
                                class286 var25 = new class286();
                                var25.field4316 = true;
                                var25.field4330 = var9;
                                var25.field4327 = class11.field117;
                                var25.field4310 = var9.field4933;
                                class211.field3202.method1108(var25, 65280);
                            }
                            if (class145.field2197 != null || class191.field2852 != null || class5.field27 || var9.field5032 != 1400 && class78.field1085 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field5032 != 0) {
                                if (var9.field5032 == 1337) {
                                    class164.field2480 = var9;
                                    class247.method1666(var9, -127);
                                    continue;
                                }
                                if (var9.field5032 == 1338) {
                                    if (var21) {
                                        class82.field1155 = class207.field3140 - var10;
                                        class138.field2103 = class28.field387 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field5032 == 1400) {
                                    class94.field1430 = var9;
                                    if (var21) {
                                        if (class120.field1879[82] && class192.field2863 > 0) {
                                            int var26 = (int) ((double) (class207.field3140 - var10 - var9.field5018 / 2) * 2.0D / (double) class75.field980);
                                            int var27 = (int) ((double) (class28.field387 - var11 - var9.field4994 / 2) * 2.0D / (double) class75.field980);
                                            int var28 = class233.field3504 + var26;
                                            int var29 = class203.field3037 + var27;
                                            int var30 = class292.field4439 + var28;
                                            int var31 = class111.field1719 + class296.field4533 - var29 - 1;
                                            class159.method1129(var30, 0, var31, (byte) -91);
                                            class248.method1671((byte) 40);
                                            continue;
                                        }
                                        class78.field1085 = 1;
                                        class315.field4762 = class132.field2036;
                                        class283.field4282 = class237.field3557;
                                        continue;
                                    }
                                    if (var20 && class78.field1085 > 0) {
                                        if (class78.field1085 == 1 && (class315.field4762 != class132.field2036 || class283.field4282 != class237.field3557)) {
                                            class195.field2944 = class233.field3504;
                                            class198.field2976 = class203.field3037;
                                            class78.field1085 = 2;
                                        }
                                        if (class78.field1085 == 2) {
                                            class8.method34((int) ((double) (class315.field4762 - class132.field2036) * 2.0D / (double) class61.field802) + class195.field2944, true);
                                            class44.method287((byte) -11, (int) ((double) (class283.field4282 - class237.field3557) * 2.0D / (double) class61.field802) + class198.field2976);
                                        }
                                        continue;
                                    }
                                    class78.field1085 = 0;
                                    continue;
                                }
                                if (var9.field5032 == 1401) {
                                    if (var20) {
                                        class146.method1044(var9.field5018, class237.field3557 - var11, class132.field2036 - var10, var9.field4994, (byte) 22);
                                    }
                                    continue;
                                }
                                if (var9.field5032 == 1402) {
                                    if (!class117.field1817) {
                                        class247.method1666(var9, -127);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field5003 && var21) {
                                var9.field5003 = true;
                                if (var9.field5030 != null) {
                                    class286 var32 = new class286();
                                    var32.field4316 = true;
                                    var32.field4330 = var9;
                                    var32.field4329 = class207.field3140 - var10;
                                    var32.field4327 = class28.field387 - var11;
                                    var32.field4310 = var9.field5030;
                                    class211.field3202.method1108(var32, 65280);
                                }
                            }
                            if (var9.field5003 && var20 && var9.field5020 != null) {
                                class286 var33 = new class286();
                                var33.field4316 = true;
                                var33.field4330 = var9;
                                var33.field4329 = class132.field2036 - var10;
                                var33.field4327 = class237.field3557 - var11;
                                var33.field4310 = var9.field5020;
                                class211.field3202.method1108(var33, 65280);
                            }
                            if (var9.field5003 && !var20) {
                                var9.field5003 = false;
                                if (var9.field5010 != null) {
                                    class286 var34 = new class286();
                                    var34.field4316 = true;
                                    var34.field4330 = var9;
                                    var34.field4329 = class132.field2036 - var10;
                                    var34.field4327 = class237.field3557 - var11;
                                    var34.field4310 = var9.field5010;
                                    class287.field4335.method1108(var34, 65280);
                                }
                            }
                            if (var20 && var9.field4968 != null) {
                                class286 var35 = new class286();
                                var35.field4316 = true;
                                var35.field4330 = var9;
                                var35.field4329 = class132.field2036 - var10;
                                var35.field4327 = class237.field3557 - var11;
                                var35.field4310 = var9.field4968;
                                class211.field3202.method1108(var35, 65280);
                            }
                            if (!var9.field5052 && var19) {
                                var9.field5052 = true;
                                if (var9.field5061 != null) {
                                    class286 var36 = new class286();
                                    var36.field4316 = true;
                                    var36.field4330 = var9;
                                    var36.field4329 = class132.field2036 - var10;
                                    var36.field4327 = class237.field3557 - var11;
                                    var36.field4310 = var9.field5061;
                                    class211.field3202.method1108(var36, 65280);
                                }
                            }
                            if (var9.field5052 && var19 && var9.field5100 != null) {
                                class286 var37 = new class286();
                                var37.field4316 = true;
                                var37.field4330 = var9;
                                var37.field4329 = class132.field2036 - var10;
                                var37.field4327 = class237.field3557 - var11;
                                var37.field4310 = var9.field5100;
                                class211.field3202.method1108(var37, 65280);
                            }
                            if (var9.field5052 && !var19) {
                                var9.field5052 = false;
                                if (var9.field5080 != null) {
                                    class286 var38 = new class286();
                                    var38.field4316 = true;
                                    var38.field4330 = var9;
                                    var38.field4329 = class132.field2036 - var10;
                                    var38.field4327 = class237.field3557 - var11;
                                    var38.field4310 = var9.field5080;
                                    class287.field4335.method1108(var38, 65280);
                                }
                            }
                            if (var9.field5073 != null) {
                                class286 var39 = new class286();
                                var39.field4330 = var9;
                                var39.field4310 = var9.field5073;
                                class217.field3302.method1108(var39, 65280);
                            }
                            if (var9.field4974 != null && class124.field1937 > var9.field5036) {
                                if (var9.field5048 == null || class124.field1937 - var9.field5036 > 32) {
                                    class286 var44 = new class286();
                                    var44.field4330 = var9;
                                    var44.field4310 = var9.field4974;
                                    class211.field3202.method1108(var44, 65280);
                                } else {
                                    label568: for (int var40 = var9.field5036; var40 < class124.field1937; var40++) {
                                        int var41 = class176.field2606[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field5048.length; var42++) {
                                            if (var9.field5048[var42] == var41) {
                                                class286 var43 = new class286();
                                                var43.field4330 = var9;
                                                var43.field4310 = var9.field4974;
                                                class211.field3202.method1108(var43, 65280);
                                                break label568;
                                            }
                                        }
                                    }
                                }
                                var9.field5036 = class124.field1937;
                            }
                            if (var9.field4959 != null && class234.field3511 > var9.field5094) {
                                if (var9.field4941 == null || class234.field3511 - var9.field5094 > 32) {
                                    class286 var49 = new class286();
                                    var49.field4330 = var9;
                                    var49.field4310 = var9.field4959;
                                    class211.field3202.method1108(var49, 65280);
                                } else {
                                    label544: for (int var45 = var9.field5094; var45 < class234.field3511; var45++) {
                                        int var46 = class172.field2580[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field4941.length; var47++) {
                                            if (var9.field4941[var47] == var46) {
                                                class286 var48 = new class286();
                                                var48.field4330 = var9;
                                                var48.field4310 = var9.field4959;
                                                class211.field3202.method1108(var48, 65280);
                                                break label544;
                                            }
                                        }
                                    }
                                }
                                var9.field5094 = class234.field3511;
                            }
                            if (var9.field4947 != null && class116.field1769 > var9.field5068) {
                                if (var9.field5060 == null || class116.field1769 - var9.field5068 > 32) {
                                    class286 var54 = new class286();
                                    var54.field4330 = var9;
                                    var54.field4310 = var9.field4947;
                                    class211.field3202.method1108(var54, 65280);
                                } else {
                                    label520: for (int var50 = var9.field5068; var50 < class116.field1769; var50++) {
                                        int var51 = class240.field3582[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field5060.length; var52++) {
                                            if (var9.field5060[var52] == var51) {
                                                class286 var53 = new class286();
                                                var53.field4330 = var9;
                                                var53.field4310 = var9.field4947;
                                                class211.field3202.method1108(var53, 65280);
                                                break label520;
                                            }
                                        }
                                    }
                                }
                                var9.field5068 = class116.field1769;
                            }
                            if (var9.field4931 != null && class90.field1342 > var9.field4988) {
                                if (var9.field4977 == null || class90.field1342 - var9.field4988 > 32) {
                                    class286 var59 = new class286();
                                    var59.field4330 = var9;
                                    var59.field4310 = var9.field4931;
                                    class211.field3202.method1108(var59, 65280);
                                } else {
                                    label496: for (int var55 = var9.field4988; var55 < class90.field1342; var55++) {
                                        int var56 = class10.field100[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field4977.length; var57++) {
                                            if (var9.field4977[var57] == var56) {
                                                class286 var58 = new class286();
                                                var58.field4330 = var9;
                                                var58.field4310 = var9.field4931;
                                                class211.field3202.method1108(var58, 65280);
                                                break label496;
                                            }
                                        }
                                    }
                                }
                                var9.field4988 = class90.field1342;
                            }
                            if (var9.field4927 != null && class304.field4625 > var9.field4965) {
                                if (var9.field5098 == null || class304.field4625 - var9.field4965 > 32) {
                                    class286 var64 = new class286();
                                    var64.field4330 = var9;
                                    var64.field4310 = var9.field4927;
                                    class211.field3202.method1108(var64, 65280);
                                } else {
                                    label472: for (int var60 = var9.field4965; var60 < class304.field4625; var60++) {
                                        int var61 = class296.field4530[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field5098.length; var62++) {
                                            if (var9.field5098[var62] == var61) {
                                                class286 var63 = new class286();
                                                var63.field4330 = var9;
                                                var63.field4310 = var9.field4927;
                                                class211.field3202.method1108(var63, 65280);
                                                break label472;
                                            }
                                        }
                                    }
                                }
                                var9.field4965 = class304.field4625;
                            }
                            if (class233.field3498 > var9.field5019 && var9.field5053 != null) {
                                class286 var65 = new class286();
                                var65.field4330 = var9;
                                var65.field4310 = var9.field5053;
                                class211.field3202.method1108(var65, 65280);
                            }
                            if (class315.field4761 > var9.field5019 && var9.field5005 != null) {
                                class286 var66 = new class286();
                                var66.field4330 = var9;
                                var66.field4310 = var9.field5005;
                                class211.field3202.method1108(var66, 65280);
                            }
                            if (class48.field607 > var9.field5019 && var9.field4954 != null) {
                                class286 var67 = new class286();
                                var67.field4330 = var9;
                                var67.field4310 = var9.field4954;
                                class211.field3202.method1108(var67, 65280);
                            }
                            if (class248.field3700 > var9.field5019 && var9.field5090 != null) {
                                class286 var68 = new class286();
                                var68.field4330 = var9;
                                var68.field4310 = var9.field5090;
                                class211.field3202.method1108(var68, 65280);
                            }
                            if (class56.field712 > var9.field5019 && var9.field4967 != null) {
                                class286 var69 = new class286();
                                var69.field4330 = var9;
                                var69.field4310 = var9.field4967;
                                class211.field3202.method1108(var69, 65280);
                            }
                            var9.field5019 = class225.field3423;
                            if (var9.field5037 != null) {
                                for (int var70 = 0; var70 < class9.field84; var70++) {
                                    class286 var71 = new class286();
                                    var71.field4330 = var9;
                                    var71.field4326 = class64.field842[var70];
                                    var71.field4320 = class281.field4266[var70];
                                    var71.field4310 = var9.field5037;
                                    class211.field3202.method1108(var71, 65280);
                                }
                            }
                            if (class67.field882 && var9.field4949 != null) {
                                class286 var72 = new class286();
                                var72.field4330 = var9;
                                var72.field4310 = var9.field4949;
                                class211.field3202.method1108(var72, 65280);
                            }
                        }
                    }
                    if (!var9.field5022 && class145.field2197 == null && class191.field2852 == null && !class5.field27) {
                        if ((var9.field5004 >= 0 || var9.field5021 != 0) && class132.field2036 >= var12 && class237.field3557 >= var13 && class132.field2036 < var14 && class237.field3557 < var15) {
                            if (var9.field5004 >= 0) {
                                class38.field469 = arg0[var9.field5004];
                            } else {
                                class38.field469 = var9;
                            }
                        }
                        if (var9.field5066 == 8 && class132.field2036 >= var12 && class237.field3557 >= var13 && class132.field2036 < var14 && class237.field3557 < var15) {
                            class69.field918 = var9;
                        }
                        if (var9.field4932 > var9.field4994) {
                            class237.method1624(class132.field2036, var9.field4932, var9.field4994, 6, var9, var11, var9.field5018 + var10, class237.field3557);
                        }
                    }
                    if (var9.field5066 == 0) {
                        method904(arg0, var9.field5086, var12, var13, var14, var15, var10 - var9.field5093, var11 - var9.field5023);
                        if (var9.field4964 != null) {
                            method904(var9.field4964, var9.field5086, var12, var13, var14, var15, var10 - var9.field5093, var11 - var9.field5023);
                        }
                        class167 var73 = (class167) class295.field4522.method1320((long) var9.field5086, 13002);
                        if (var73 != null) {
                            class145.method1034(var14, var73.field2505, 1908, var12, var11, var13, var10, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1159)
    public final void init() {
        field1951++;
        if (!this.method2191((byte) -70)) {
            return;
        }
        class44.field543 = Integer.parseInt(this.getParameter("worldid"));
        class252.field3769 = Integer.parseInt(this.getParameter("modewhere"));
        if (class252.field3769 < 0 || class252.field3769 > 1) {
            class252.field3769 = 0;
        }
        class21.field259 = Integer.parseInt(this.getParameter("modewhat"));
        if (class21.field259 < 0 || class21.field259 > 2) {
            class21.field259 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class176.field2610 = true;
        } else {
            class176.field2610 = false;
        }
        try {
            class256.field3882 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class256.field3882 = 0;
        }
        class203.method1391(class256.field3882, (byte) 110);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class194.field2908 = true;
        } else {
            class194.field2908 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class49.field624 = true;
        } else {
            class49.field624 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class237.field3555 = 1;
        } else {
            class237.field3555 = 0;
        }
        try {
            class5.field24 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class5.field24 = 0;
        }
        class171.field2569 = this.getParameter("settings");
        if (class171.field2569 == null) {
            class171.field2569 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class9.field78 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class9.field78 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class11.field128 = true;
        } else {
            class11.field128 = false;
        }
        class142.field2150 = this;
        this.method2200(765, class21.field259 + 32, 503, 1534, -50);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1240)
    public final void method905(boolean arg0) {
        field1955++;
        if (class293.field4490 == 1000) {
            return;
        }
        boolean var2 = class320.method2196(true);
        if (var2 && class146.field2205 && class225.field3426 != null) {
            class225.field3426.method1244(-3155);
        }
        if ((class293.field4490 == 30 || class293.field4490 == 10) && (class149.field2248 || class84.field1252 != 0L && class231.method1594(-20375) > class84.field1252)) {
            class307.method2119(class91.field1360, arg0, class204.field3064, class149.field2248, class48.method329((byte) 81));
        }
        if (class90.field1344 == null) {
            Container var3;
            if (class90.field1344 != null) {
                var3 = class90.field1344;
            } else if (class106.field1661 == null) {
                var3 = class274.field4200.field3963;
            } else {
                var3 = class106.field1661;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class106.field1661 == var3) {
                Insets var6 = class106.field1661.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class13.field152 != var4 || class40.field480 != var5) {
                if (class262.field3966.startsWith("mac")) {
                    class13.field152 = var4;
                    class40.field480 = var5;
                } else {
                    class304.method2104(126);
                }
                class84.field1252 = class231.method1594(-20375) + 500L;
            }
        }
        if (class90.field1344 != null && !class58.field780 && (class293.field4490 == 30 || class293.field4490 == 10)) {
            class307.method2119(-1, false, -1, false, class144.field2175);
        }
        boolean var7 = arg0;
        if (class121.field1896) {
            class121.field1896 = false;
            var7 = true;
        }
        if (var7) {
            class281.method1964(-19123);
        }
        if (class117.field1817) {
            for (int var8 = 0; var8 < 100; var8++) {
                class22.field298[var8] = true;
            }
        }
        if (class293.field4490 == 0) {
            class54.method354((Color) null, (byte) 91, var7, class281.field4261, class7.field40);
        } else if (class293.field4490 == 5) {
            class329.method2240(class217.field3299, (byte) -122, false);
        } else if (class293.field4490 == 10) {
            class266.method1866(-1);
        } else if (class293.field4490 == 25 || class293.field4490 == 28) {
            if (class21.field249 == 1) {
                if (class28.field377 > class162.field2446) {
                    class162.field2446 = class28.field377;
                }
                int var9 = (class162.field2446 - class28.field377) * 50 / class162.field2446;
                class274.method1930(class35.field434 + "<br>(" + var9 + "%)", false, 1);
            } else if (class21.field249 == 2) {
                if (class271.field4154 > class270.field4134) {
                    class270.field4134 = class271.field4154;
                }
                int var10 = (class270.field4134 - class271.field4154) * 50 / class270.field4134 + 50;
                class274.method1930(class35.field434 + "<br>(" + var10 + "%)", false, 1);
            } else {
                class274.method1930(class35.field434, false, 1);
            }
        } else if (class293.field4490 == 30) {
            class318.method2186(21509);
        } else if (class293.field4490 == 40) {
            class274.method1930(class67.field879 + "<br>" + class42.field515, false, 1);
        }
        if (class117.field1817 && class293.field4490 != 0) {
            class117.method826();
            for (int var11 = 0; var11 < class325.field4898; var11++) {
                class131.field2021[var11] = false;
            }
        } else if ((class293.field4490 == 30 || class293.field4490 == 10) && class125.field1965 == 0 && !var7) {
            try {
                Graphics var12 = class315.field4764.getGraphics();
                for (int var13 = 0; var13 < class325.field4898; var13++) {
                    if (class131.field2021[var13]) {
                        class171.field2574.method236(class15.field168[var13], class228.field3473[var13], var12, class6.field29[var13], (byte) 40, class307.field4678[var13]);
                        class131.field2021[var13] = false;
                    }
                }
            } catch (Exception var19) {
                class315.field4764.repaint();
            }
        } else if (class293.field4490 != 0) {
            try {
                Graphics var15 = class315.field4764.getGraphics();
                class171.field2574.method238(0, var15, 0, 0);
                for (int var16 = 0; var16 < class325.field4898; var16++) {
                    class131.field2021[var16] = false;
                }
            } catch (Exception var18) {
                class315.field4764.repaint();
            }
        }
        if (class176.field2605) {
            class326.method2222((byte) -22);
        }
        if (class309.field4704 && class293.field4490 == 10 && class123.field1926 != -1) {
            class309.field4704 = false;
            class6.method17(class274.field4200, (byte) 38);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 1457)
    private final void method906(int arg0, int arg1) {
        class7.field48 = null;
        class274.field4208.field1391++;
        class274.field4208.field1393 = arg1;
        class268.field4114 = 0;
        class300.field4577 = null;
        if (arg0 >= 103) {
            field1946++;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1475)
    public final void method907(int arg0) {
        if (class117.field1817) {
            class117.method817();
        }
        if (class90.field1344 != null) {
            class130.method968(class274.field4200, (byte) 120, class90.field1344);
            class90.field1344 = null;
        }
        field1962++;
        if (class274.field4200 != null) {
            class274.field4200.method1773(this.getClass(), -126);
        }
        if (class320.field4842 != null) {
            class320.field4842.field1291 = false;
        }
        class320.field4842 = null;
        if (class168.field2517 != null) {
            class168.field2517.method1138(arg0 - 16726723);
            class168.field2517 = null;
        }
        class66.method436((byte) -41, class315.field4764);
        class210.method1446((byte) -40, class315.field4764);
        if (arg0 != -141) {
            field1944 = (class210) null;
        }
        if (class150.field2260 != null) {
            class150.field2260.method188(class315.field4764, (byte) -34);
        }
        class270.method1908(23);
        class236.method1616(124);
        class150.field2260 = null;
        if (class225.field3426 != null) {
            class225.field3426.method1238(2);
        }
        if (class17.field211 != null) {
            class17.field211.method1238(2);
        }
        class274.field4208.method650((byte) 35);
        class161.field2417.method106(128);
        try {
            if (class296.field4540 != null) {
                class296.field4540.method1261(arg0 + 141);
            }
            if (class162.field2447 != null) {
                for (int var2 = 0; var2 < class162.field2447.length; var2++) {
                    if (class162.field2447[var2] != null) {
                        class162.field2447[var2].method1261(arg0 + 141);
                    }
                }
            }
            if (class170.field2560 != null) {
                class170.field2560.method1261(0);
            }
            if (class224.field3418 != null) {
                class224.field3418.method1261(0);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V", line = 1559)
    private final void method908(boolean arg0) {
        if (!arg0) {
            field1948 = (class210) null;
        }
        field1958++;
        for (class9.field84 = 0; class295.method2060((byte) 99) && class9.field84 < 128; class9.field84++) {
            class64.field842[class9.field84] = class64.field850;
            class281.field4266[class9.field84] = class329.field4948;
        }
        class288.field4352++;
        if (class123.field1926 != -1) {
            class145.method1034(class136.field2071, class123.field1926, 1908, 0, 0, 0, 0, class251.field3747);
        }
        class225.field3423++;
        if (class117.field1817) {
            int var2 = 19137023;
            label195: for (int var3 = 0; var3 < 32768; var3++) {
                class69 var4 = class187.field2788[var3];
                if (var4 != null) {
                    byte var5 = var4.field914.field776;
                    if ((var5 & 0x2) > 0 && var4.field1483 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1504[0] = 1;
                            var4.field1541[0] = (var4.field1566 >> 7) + var6;
                            var4.field1516[0] = (var4.field1505 >> 7) + var7;
                            class325.field4896[class180.field2697].method1306(var4.field1505 >> 7, (byte) 44, var4.field1566 >> 7, 0, var4.method696((byte) 117), false, var4.method696((byte) 117));
                            if (var4.field1541[0] >= 0 && var4.field1541[0] <= (104 - var4.method696((byte) 117)) && var4.field1516[0] >= 0 && var4.field1516[0] <= 104 - var4.method696((byte) 117) && class325.field4896[class180.field2697].method1304(var4.field1516[0], var4.field1566 >> 7, var4.field1505 >> 7, var4.field1541[0], 118)) {
                                if (var4.method696((byte) 117) > 1) {
                                    for (int var8 = var4.field1541[0]; var4.field1541[0] + var4.method696((byte) 117) > var8; var8++) {
                                        for (int var9 = var4.field1516[0]; var9 < var4.field1516[0] + var4.method696((byte) 117); var9++) {
                                            if ((var2 & class325.field4896[class180.field2697].field2857[var8][var9]) != 0) {
                                                continue label195;
                                            }
                                        }
                                    }
                                }
                                var4.field1483 = 1;
                            }
                        }
                    }
                    class268.method1882(var4, arg0);
                    class134.method986(19477, var4);
                    class266.method1870((byte) 13, var4);
                    class325.field4896[class180.field2697].method1315(var4.field1505 >> 7, var4.field1566 >> 7, var4.method696((byte) 117), (byte) -38, false, var4.method696((byte) 117));
                }
            }
        }
        if (!class117.field1817) {
            class147.method1047((byte) -125);
        } else if (class144.field2174 == 0 && class234.field3515 == 0) {
            if (class56.field710 == 2) {
                class180.method1249(-64);
            } else {
                class171.method1193(0);
            }
            if (class302.field4612 >> 7 < 14 || (class302.field4612 >> 7) >= 90 || class203.field3052 >> 7 < 14 || (class203.field3052 >> 7) >= 90) {
                class10.method45(-1);
            }
        }
        while (true) {
            class286 var10;
            class329 var11;
            class329 var12;
            do {
                var10 = (class286) class217.field3302.method1114(-13454);
                if (var10 == null) {
                    while (true) {
                        class286 var13;
                        class329 var17;
                        class329 var18;
                        do {
                            var13 = (class286) class287.field4335.method1114(-13454);
                            if (var13 == null) {
                                while (true) {
                                    class286 var14;
                                    class329 var15;
                                    class329 var16;
                                    do {
                                        var14 = (class286) class211.field3202.method1114(-13454);
                                        if (var14 == null) {
                                            if (class145.field2197 != null) {
                                                class159.method1125(-28222);
                                            }
                                            if (class213.field3229 != null && class213.field3229.field3456 == 1) {
                                                if (class213.field3229.field3452 != null) {
                                                    class97.method687(3, class268.field4116, class58.field741);
                                                }
                                                class213.field3229 = null;
                                                class268.field4116 = null;
                                                class58.field741 = false;
                                            }
                                            if ((class304.field4641 % 1500) == 0) {
                                                class122.method885((byte) -72);
                                            }
                                            return;
                                        }
                                        var15 = var14.field4330;
                                        if (var15.field5040 < 0) {
                                            break;
                                        }
                                        var16 = class80.method541((byte) 96, var15.field5091);
                                    } while (var16 == null || var16.field4964 == null || var15.field5040 >= var16.field4964.length || var16.field4964[var15.field5040] != var15);
                                    class9.method39(var14, 6514);
                                }
                            }
                            var17 = var13.field4330;
                            if (var17.field5040 < 0) {
                                break;
                            }
                            var18 = class80.method541((byte) 96, var17.field5091);
                        } while (var18 == null || var18.field4964 == null || var17.field5040 >= var18.field4964.length || var18.field4964[var17.field5040] != var17);
                        class9.method39(var13, 6514);
                    }
                }
                var11 = var10.field4330;
                if (var11.field5040 < 0) {
                    break;
                }
                var12 = class80.method541((byte) 96, var11.field5091);
            } while (var12 == null || var12.field4964 == null || var11.field5040 >= var12.field4964.length || var12.field4964[var11.field5040] != var11);
            class9.method39(var10, 6514);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 1777)
    private final void method909(byte arg0) {
        field1956++;
        if (arg0 >= -98) {
            this.method906(49, -63);
        }
        if (!class309.field4704) {
            label240: while (true) {
                do {
                    if (!class295.method2060((byte) 110)) {
                        break label240;
                    }
                } while (class329.field4948 != 's' && class329.field4948 != 'S');
                class309.field4704 = true;
            }
        }
        if (class284.field4299 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class231.method1594(-20375);
            if (class123.field1931 == 0L) {
                class123.field1931 = var28;
            }
            if (var27 > 16384 && (var28 - class123.field1931) < 5000L) {
                if ((var28 - class3.field15) > 1000L) {
                    System.gc();
                    class3.field15 = var28;
                }
                class7.field40 = class230.field3479;
                class281.field4261 = 5;
            } else {
                class281.field4261 = 5;
                class7.field40 = class258.field3915;
                class284.field4299 = 10;
            }
        } else if (class284.field4299 == 10) {
            class31.method216(4, 104, 104);
            for (int var25 = 0; var25 < 4; var25++) {
                class325.field4896[var25] = new class191(104, 104);
            }
            class284.field4299 = 30;
            class7.field40 = class222.field3390;
            class281.field4261 = 10;
        } else if (class284.field4299 == 30) {
            if (class120.field1884 == null) {
                class120.field1884 = new class128(class274.field4208, class161.field2417);
            }
            if (class120.field1884.method953(-67)) {
                class206.field3102 = class171.method1195(true, false, 105, 0, true);
                class213.field3228 = class171.method1195(true, false, 112, 1, true);
                class15.field171 = class171.method1195(false, true, 124, 2, true);
                class226.field3451 = class171.method1195(true, false, 99, 3, true);
                class113.field1744 = class171.method1195(true, false, 109, 4, true);
                class222.field3389 = class171.method1195(true, true, 114, 5, true);
                class48.field613 = class171.method1195(true, true, 126, 6, false);
                class9.field76 = class171.method1195(true, false, 124, 7, true);
                class68.field898 = class171.method1195(true, false, 99, 8, true);
                class267.field4100 = class171.method1195(true, false, 103, 9, true);
                class81.field1142 = class171.method1195(true, false, 117, 10, true);
                class70.field925 = class171.method1195(true, false, 116, 11, true);
                class125.field1966 = class171.method1195(true, false, 112, 12, true);
                class257.field3889 = class171.method1195(true, false, 114, 13, true);
                class217.field3287 = class171.method1195(true, false, 125, 14, false);
                class261.field3956 = class171.method1195(true, false, 106, 15, true);
                class35.field433 = class171.method1195(true, false, 124, 16, true);
                class251.field3751 = class171.method1195(true, false, 113, 17, true);
                class76.field987 = class171.method1195(true, false, 105, 18, true);
                class228.field3465 = class171.method1195(true, false, 104, 19, true);
                class168.field2518 = class171.method1195(true, false, 112, 20, true);
                class182.field2726 = class171.method1195(true, false, 114, 21, true);
                class189.field2820 = class171.method1195(true, false, 107, 22, true);
                class49.field620 = class171.method1195(true, true, 125, 23, true);
                class16.field180 = class171.method1195(true, false, 96, 24, true);
                field1948 = class171.method1195(true, false, 101, 25, true);
                class321.field4851 = class171.method1195(true, true, 121, 26, true);
                class188.field2802 = class171.method1195(true, false, 105, 27, true);
                class284.field4299 = 40;
                class7.field40 = class226.field3436;
                class281.field4261 = 15;
            } else {
                class281.field4261 = 12;
                class7.field40 = class228.field3463;
            }
        } else if (class284.field4299 == 40) {
            int var23 = 0;
            for (int var24 = 0; var24 < 28; var24++) {
                var23 += class76.field982[var24].method1753((byte) -99) * class38.field456[var24] / 100;
            }
            if (var23 == 100) {
                class7.field40 = class16.field182;
                class281.field4261 = 20;
                class265.method1862(class68.field898, (byte) 124);
                class162.method1146(class68.field898, 24005);
                class273.method1928(50, class68.field898);
                class284.field4299 = 45;
            } else {
                class281.field4261 = 20;
                if (var23 != 0) {
                    class7.field40 = class79.field1087 + var23 + "%";
                }
            }
        } else if (class284.field4299 == 45) {
            class63.method418(class178.field2630, 2, (byte) 110, 22050);
            class206.field3112 = new class290();
            class206.field3112.method2034(0, 128, 9);
            class225.field3426 = class140.method1010(2, class274.field4200, class315.field4764, 22050, 0);
            class225.field3426.method1245(class206.field3112, -6683);
            class55.method362(class217.field3287, class113.field1744, (byte) -45, class206.field3112, class261.field3956);
            class17.field211 = class140.method1010(2, class274.field4200, class315.field4764, 2048, 1);
            class72.field936 = new class328();
            class17.field211.method1245(class72.field936, -6683);
            class185.field2766 = new class200(22050, class248.field3696);
            class80.field1132 = class48.field613.method1448((byte) 10, "scape main");
            class7.field40 = class285.field4309;
            class284.field4299 = 50;
            class281.field4261 = 30;
        } else if (class284.field4299 == 50) {
            int var2 = class111.method772(class257.field3889, 10, class68.field898);
            int var3 = class93.method660(6);
            if (var3 <= var2) {
                class7.field40 = class51.field635;
                class284.field4299 = 60;
                class281.field4261 = 35;
            } else {
                class281.field4261 = 35;
                class7.field40 = class288.field4348 + var2 * 100 / var3 + "%";
            }
        } else if (class284.field4299 == 60) {
            int var4 = method913(class68.field898, true);
            int var5 = class310.method2147(48);
            if (var5 > var4) {
                class7.field40 = class298.field4559 + var4 * 100 / var5 + "%";
                class281.field4261 = 40;
            } else {
                class7.field40 = class177.field2619;
                class281.field4261 = 40;
                class284.field4299 = 65;
            }
        } else if (class284.field4299 == 65) {
            class228.method1578(class68.field898, (byte) -56, class257.field3889);
            class281.field4261 = 45;
            class7.field40 = class159.field2386;
            class163.method1155(5, 10);
            class284.field4299 = 70;
        } else if (class284.field4299 == 70) {
            byte var11 = 0;
            class15.field171.method1465(false);
            int var12 = var11 + class15.field171.method1437((byte) 91);
            class35.field433.method1465(false);
            int var13 = var12 + class35.field433.method1437((byte) 91);
            class251.field3751.method1465(false);
            int var14 = var13 + class251.field3751.method1437((byte) 91);
            class76.field987.method1465(false);
            int var15 = var14 + class76.field987.method1437((byte) 91);
            class228.field3465.method1465(false);
            int var16 = var15 + class228.field3465.method1437((byte) 91);
            class168.field2518.method1465(false);
            int var17 = var16 + class168.field2518.method1437((byte) 91);
            class182.field2726.method1465(false);
            int var18 = var17 + class182.field2726.method1437((byte) 91);
            class189.field2820.method1465(false);
            int var19 = var18 + class189.field2820.method1437((byte) 91);
            class16.field180.method1465(false);
            int var20 = var19 + class16.field180.method1437((byte) 91);
            field1948.method1465(false);
            int var21 = var20 + field1948.method1437((byte) 91);
            class188.field2802.method1465(false);
            int var22 = var21 + class188.field2802.method1437((byte) 91);
            if (var22 < 1100) {
                class281.field4261 = 50;
                class7.field40 = class311.field4738 + var22 / 11 + "%";
            } else {
                class150.method1080(class15.field171, (byte) -1);
                class151.method1087(class15.field171, true);
                class309.method2137(class15.field171, (byte) -75);
                class172.method1199((byte) 102, class9.field76, class15.field171);
                class162.method1149(class35.field433, class9.field76, true, -95);
                class234.method1609(class9.field76, class76.field987, (byte) 123);
                class202.method1381(class80.field1130, class9.field76, true, class228.field3465, 0);
                class314.method2158(false, class15.field171);
                class294.method2055((byte) -63, class206.field3102, class213.field3228, class168.field2518);
                class196.method1349(class15.field171, true);
                class226.method1577(class182.field2726, (byte) 121, class9.field76);
                class124.method897((byte) -83, class189.field2820);
                method910(-19255, class15.field171);
                class259.method1761(class9.field76, class257.field3889, -18124, class226.field3451, class68.field898);
                class267.method1881((byte) -26, class15.field171);
                class200.method1369((byte) -110, class251.field3751);
                class306.method2113(field1948, class16.field180, 26081, new class247());
                class162.method1151(false, field1948, class16.field180);
                class16.method104(27665, class15.field171);
                class54.method359(class15.field171, 1, class68.field898);
                class196.method1354(-100, class15.field171, class68.field898);
                class281.field4261 = 50;
                class7.field40 = class152.field2299;
                class189.method1292(97);
                class284.field4299 = 80;
            }
        } else if (class284.field4299 == 80) {
            int var6 = class252.method1702(class68.field898, (byte) 65);
            int var7 = class296.method2067((byte) -21);
            if (var7 > var6) {
                class7.field40 = class67.field892 + var6 * 100 / var7 + "%";
                class281.field4261 = 60;
            } else {
                class94.method669(class68.field898, (byte) 67);
                class281.field4261 = 60;
                class7.field40 = class186.field2777;
                class284.field4299 = 90;
            }
        } else if (class284.field4299 == 90) {
            if (class321.field4851.method1465(false)) {
                class292 var10 = new class292(class267.field4100, class321.field4851, class68.field898, 20, !class151.field2274);
                class148.method1067(var10);
                if (class272.field4167 == 1) {
                    class148.method1057(0.9F);
                }
                if (class272.field4167 == 2) {
                    class148.method1057(0.8F);
                }
                if (class272.field4167 == 3) {
                    class148.method1057(0.7F);
                }
                if (class272.field4167 == 4) {
                    class148.method1057(0.6F);
                }
                class284.field4299 = 100;
                class281.field4261 = 70;
                class7.field40 = class79.field1102;
            } else {
                class7.field40 = class202.field3026 + class321.field4851.method1437((byte) 91) + "%";
                class281.field4261 = 70;
            }
        } else if (class284.field4299 == 100) {
            if (class79.method536(class68.field898, (byte) -99)) {
                class284.field4299 = 110;
            }
        } else if (class284.field4299 == 110) {
            class320.field4842 = new class87();
            class274.field4200.method1770((byte) 88, 10, class320.field4842);
            class7.field40 = class16.field179;
            class284.field4299 = 120;
            class281.field4261 = 75;
        } else if (class284.field4299 == 120) {
            if (class81.field1142.method1453("huffman", (byte) -113, "")) {
                class293 var9 = new class293(class81.field1142.method1436("", "huffman", (byte) -59));
                class157.method1119((byte) -110, var9);
                class284.field4299 = 130;
                class7.field40 = class194.field2907;
                class281.field4261 = 80;
            } else {
                class7.field40 = class166.field2503 + "0%";
                class281.field4261 = 80;
            }
        } else if (class284.field4299 == 130) {
            if (!class226.field3451.method1465(false)) {
                class7.field40 = class134.field2052 + class226.field3451.method1437((byte) 91) * 3 / 4 + "%";
                class281.field4261 = 85;
            } else if (!class125.field1966.method1465(false)) {
                class7.field40 = class134.field2052 + (class125.field1966.method1437((byte) 91) / 10 + 75) + "%";
                class281.field4261 = 85;
            } else if (!class257.field3889.method1465(false)) {
                class7.field40 = class134.field2052 + (class257.field3889.method1437((byte) 91) / 20 + 85) + "%";
                class281.field4261 = 85;
            } else if (class49.field620.method1451("details", -64)) {
                class69.method457(class49.field620, -1, class11.field114);
                class284.field4299 = 135;
                class7.field40 = class201.field3015;
                class281.field4261 = 95;
            } else {
                class7.field40 = class134.field2052 + ((class49.field620.method1450(-23076, "details") / 10) + 90) + "%";
                class281.field4261 = 85;
            }
        } else if (class284.field4299 == 135) {
            int var8 = class197.method1357(-27886);
            if (var8 == -1) {
                class7.field40 = class36.field441;
                class281.field4261 = 95;
            } else if (var8 == 7 || var8 == 9) {
                this.method2192("worldlistfull", (byte) -31);
                class163.method1155(1000, 10);
            } else if (class75.field977) {
                class284.field4299 = 140;
                class281.field4261 = 96;
                class7.field40 = class38.field455;
            } else {
                this.method2192("worldlistio_" + var8, (byte) -31);
                class163.method1155(1000, 10);
            }
        } else if (class284.field4299 == 140) {
            class184.field2759 = class226.field3451.method1448((byte) 10, "loginscreen");
            class222.field3389.method1444(-2519, true, false);
            class48.field613.method1444(-2519, true, true);
            class68.field898.method1444(-2519, true, true);
            class257.field3889.method1444(-2519, true, true);
            class81.field1142.method1444(-2519, true, true);
            class226.field3451.method1444(-2519, true, true);
            class284.field4299 = 150;
            class281.field4261 = 97;
            class176.field2605 = true;
            class7.field40 = class9.field80;
        } else if (class284.field4299 == 150) {
            class133.method980();
            if (class309.field4704) {
                class19.field231 = 0;
                class157.field2348 = 0;
                class144.field2175 = 0;
                class194.field2902 = 0;
            }
            class309.field4704 = true;
            class6.method17(class274.field4200, (byte) -126);
            class307.method2119(-1, false, -1, false, class144.field2175);
            class284.field4299 = 160;
            class281.field4261 = 100;
            class7.field40 = class286.field4322;
        } else if (class284.field4299 == 160) {
            class150.method1084(-28967, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILlm;)V", line = 2288)
    private static final void method910(int arg0, class210 arg1) {
        field1959++;
        if (arg0 != -19255) {
            field1944 = (class210) null;
        }
        class164.field2484 = arg1;
        class42.field513 = class164.field2484.method1464((byte) 92, 16);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 2300)
    public final void method911(boolean arg0) {
        field1960++;
        method915(false);
        class193.method1336(126);
        class61.method409((byte) -86);
        class115.method791(128);
        class57.method379(!arg0);
        class135.method990((byte) 67);
        class38.method257(-14);
        class320.method2193(1);
        class117.method805();
        class198.method1362(15429536);
        class213.method1475(96);
        class87.method603(9);
        class323.method2212(64);
        class263.method1805(-102);
        class161.method1143(-1);
        class92.method657(-22031);
        class16.method100(-30922);
        class258.method1757((byte) -10);
        class210.method1452(7884);
        class182.method1263(-1);
        class283.method1974(127);
        class318.method2179(-1);
        class69.method456(0);
        class7.method22(122);
        class191.method1313(false);
        class329.method2244((byte) 101);
        class314.method2159(123);
        class195.method1345((byte) 61);
        class156.method1117(31768);
        class192.method1325(-11224);
        class29.method189(37);
        class60.method405(0);
        class265.method1856((byte) -40);
        class179.method1243((byte) 119);
        class200.method1372(120);
        class255.method1734(70);
        class272.method1926((byte) -5);
        class98.method694((byte) -47);
        class221.method1548(5);
        class22.method154((byte) -45);
        class218.method1500(103);
        class58.method386(-138);
        class167.method1169(55);
        class21.method130(200);
        class101.method715(-113);
        class251.method1700(115);
        class170.method1190(17605);
        class185.method1274(false);
        class134.method983((byte) 87);
        class122.method882(false);
        class298.method2077(96);
        class327.method2225((byte) -126);
        class267.method1880((byte) -104);
        class315.method2162(121);
        class269.method1892((byte) -125);
        class78.method527(0);
        class316.method2169((byte) -53);
        class212.method1472(-1);
        class285.method1982(0);
        class13.method74(0);
        class93.method661(-123);
        class124.method895(8);
        class36.method251((byte) -75);
        class280.method1952();
        class296.method2063(arg0);
        class119.method869();
        class245.method1657((byte) 75);
        class83.method559();
        class253.method1723(false);
        class77.method505();
        class9.method43((byte) 126);
        class43.method285(2);
        class194.method1338(0);
        class76.method483(1);
        class174.method1214();
        class249.method1685(true);
        class197.method1358(-3);
        class225.method1572((byte) 97);
        class157.method1121((byte) -127);
        class89.method612();
        class140.method1007(true);
        class84.method585(-127);
        class14.method87();
        class246.method1663((byte) -128);
        class207.method1425(-1);
        class104.method729(915793988);
        class95.method679();
        class31.method207();
        class266.method1874(32);
        class30.method197(27717);
        class206.method1417(-14544);
        class80.method537(64);
        class82.method547(1);
        class46.method309();
        class306.method2112(3);
        class63.method416((byte) -114);
        class248.method1673(2);
        class88.method606(128);
        class35.method250((byte) -112);
        class304.method2105(765);
        class120.method879((byte) 120);
        class237.method1620(arg0);
        class125.method916(116);
        class242.method1640(4);
        class48.method333((byte) 69);
        class168.method1172((byte) 94);
        class56.method370(-41);
        class256.method1739(0);
        class270.method1904(false);
        class11.method60((byte) -25);
        class247.method1665((byte) 120);
        class106.method753(-16);
        class234.method1605(true);
        class274.method1933(29432);
        class45.method295((byte) 75);
        class292.method2045((byte) 73);
        class136.method992((byte) 113);
        class55.method365((byte) -43);
        class148.method1075();
        class293.method2053((byte) 7);
        class23.method158(-23265);
        class284.method1981(-95);
        class301.method2092((byte) -93);
        class178.method1229(-121);
        class146.method1046(-1);
        class133.method981();
        class176.method1221(0);
        class20.method125(46);
        class189.method1290(true);
        class286.method1993(126);
        class233.method1603((byte) -119);
        class183.method1267(5);
        class86.method599();
        class311.method2151((byte) 115);
        class44.method290(-125);
        class163.method1156(5);
        class226.method1575(-1);
        class187.method1280((byte) 73);
        class295.method2059((byte) 108);
        class228.method1582((byte) -22);
        class99.method703();
        class70.method461(arg0);
        class19.method121(-122);
        class149.method1077((byte) -59);
        class277.method1937();
        class12.method73((byte) -98);
        class4.method9();
        class250.method1687(true);
        class32.method226();
        class208.method1429();
        class288.method1998(0);
        class90.method637(-6095);
        class172.method1201((byte) -17);
        class169.method1181((byte) 125);
        class223.method1559(35);
        class252.method1705(2);
        class181.method1253(9);
        class141.method1011(0);
        class53.method353();
        class268.method1885(1280);
        class109.method761(-3);
        class308.method2131();
        class96.method681(-9);
        class79.method530((byte) 112);
        class113.method783((byte) 94);
        class154.method1104(5668);
        class166.method1165(-128);
        class164.method1160(-4190);
        class17.method107(false);
        class310.method2146((byte) 45);
        class261.method1764(-112);
        class40.method268((byte) 118);
        class42.method281((byte) -121);
        class153.method1097(240);
        class325.method2216((byte) 59);
        class158.method1124(255);
        class162.method1148(-113);
        class72.method467(4);
        class121.method881((byte) 118);
        class8.method36(-126);
        class278.method1940((byte) 93);
        class229.method1588();
        class217.method1494((byte) 109);
        class321.method2203(2);
        class64.method426((byte) -52);
        class147.method1051(0);
        class151.method1091(4);
        class34.method240();
        class47.method322();
        class241.method1633(30305);
        class26.method169(79);
        class184.method1270(1);
        class139.method1004();
        class143.method1023();
        class51.method342(2);
        class49.method339((byte) -83);
        class102.method725();
        class232.method1598();
        class142.method1020(255);
        class74.method477(63);
        class110.method763(124);
        class240.method1629(-696178004);
        class66.method437((byte) -121);
        class326.method2221(true);
        class123.method887(true);
        class15.method97(false);
        class203.method1394(-21819);
        class309.method2140((byte) 77);
        class3.method6(-127);
        class271.method1914((byte) -63);
        class131.method969(97);
        class171.method1194(2);
        class138.method1002(-48);
        class159.method1128(90);
        class259.method1760((byte) -84);
        class94.method666((byte) -6);
        class291.method2037(true);
        class236.method1617(114);
        class150.method1083(4096);
        class205.method1412((byte) -17);
        class279.method1947((byte) -109);
        class305.method2110(-115);
        class202.method1382(-85);
        class28.method179(-69);
        class130.method967(1328);
        class201.method1376((byte) -20);
        class81.method544(3);
        class97.method688(0);
        class243.method1647(0);
        class144.method1028(97);
        class190.method1297((byte) -125);
        class68.method454(118);
        class155.method1106(102);
        class67.method442(0);
        class177.method1226((byte) -92);
        class257.method1746(21347);
        class294.method2056(1);
        class73.method470((byte) 22);
        class91.method644(false);
        class300.method2088(-113);
        class126.method924(32);
        class299.method2082((byte) 70);
        class224.method1564(false);
        class180.method1247(51);
        class188.method1285((byte) 125);
        class75.method478((byte) -125);
        class111.method775(false);
        class116.method794(false);
        class10.method50(-106);
        class37.method255(128);
        class302.method2096(32);
        class132.method973(-30028);
        class114.method787((byte) -127);
        class209.method1430((byte) -110);
        class54.method357((byte) 59);
        class287.method1994(85);
        class160.method1130(false);
        class317.method2171(-21027);
        class186.method1279(-124);
        class281.method1967(74);
        class6.method14(!arg0);
        class230.method1593((byte) 75);
        class107.method756(1);
        class222.method1556(false);
        class211.method1466((byte) -107);
        class152.method1093(-16209);
        class145.method1040((byte) -97);
        class307.method2118(1194478476);
        if (class320.field4848) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V", line = 2577)
    public static final void method912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class157.field2357 <= arg8 && arg8 <= class184.field2761 && arg6 >= class157.field2357 && class184.field2761 >= arg6 && arg3 >= class157.field2357 && arg3 <= class184.field2761 && arg0 >= class157.field2357 && class184.field2761 >= arg0 && class185.field2769 <= arg9 && class166.field2494 >= arg9 && arg2 >= class185.field2769 && class166.field2494 >= arg2 && arg5 >= class185.field2769 && class166.field2494 >= arg5 && class185.field2769 <= arg1 && arg1 <= class166.field2494) {
            class55.method361(arg1, arg3, arg5, arg6, arg8, arg2, 3, arg0, arg9, arg7);
        } else {
            class306.method2115(arg7, (byte) -17, arg9, arg8, arg6, arg0, arg5, arg1, arg2, arg3);
        }
        field1954++;
        if (arg4 != 13) {
            method915(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Llm;Z)I", line = 2597)
    private static final int method913(class210 arg0, boolean arg1) {
        field1957++;
        int var2 = 0;
        if (arg0.method1431(class305.field4648, -44)) {
            var2++;
        }
        if (arg0.method1431(class197.field2964, -109)) {
            var2++;
        }
        if (!arg1) {
            method898((class329) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2617)
    public final void method914(byte arg0) {
        field1949++;
        if (class293.field4490 == 1000) {
            return;
        }
        class304.field4641++;
        if (class304.field4641 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class162.field2439 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class170.field2548.setSeed((long) class162.field2439);
        }
        if (arg0 > -117) {
            return;
        }
        this.method899(0);
        if (class120.field1884 != null) {
            class120.field1884.method954((byte) 60);
        }
        class189.method1293((byte) 13);
        class237.method1621(94);
        class267.method1877((byte) 101);
        class129.method959(0);
        if (class117.field1817) {
            class174.method1210();
        }
        if (class150.field2260 != null) {
            int var3 = class150.field2260.method185(-13199);
            class11.field117 = var3;
        }
        if (class293.field4490 == 0) {
            this.method909((byte) -107);
            class142.method1021(-56);
        } else if (class293.field4490 == 5) {
            this.method909((byte) -101);
            class142.method1021(-71);
        } else if (class293.field4490 == 25 || class293.field4490 == 28) {
            class35.method248((byte) 116);
        }
        if (class293.field4490 == 10) {
            this.method908(true);
            class147.method1052(-110);
            class305.method2109((byte) 125);
            class12.method71(-2001);
        } else if (class293.field4490 == 30) {
            class153.method1099(-35);
        } else if (class293.field4490 == 40) {
            class12.method71(-2001);
            if (class170.field2555 != -3) {
                if (class170.field2555 == 15) {
                    class268.method1886(true);
                } else if (class170.field2555 != 2) {
                    class11.method57(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V", line = 2715)
    public static void method915(boolean arg0) {
        field1944 = null;
        field1948 = null;
        field1952 = (byte[][][]) null;
        field1947 = null;
        if (arg0) {
            field1944 = (class210) null;
        }
    }
}
