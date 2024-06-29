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
public class client extends class128 {

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    public static boolean field2054;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
    public static int[] field2047;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "[[[I")
    public static int[][][] field2034;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 5)
    public static void method884(boolean arg0) {
        field2047 = null;
        field2034 = (int[][][]) null;
        if (!arg0) {
            method884(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILum;)V", line = 18)
    public static final void method885(int arg0, class82 arg1) {
        class229 var2 = (class229) class175.field2681.method1558(class108.method723(arg1.field1218, -116), false);
        if (arg0 != -9490) {
            method894(29, true, -16, (class82) null);
        }
        field2040++;
        if (var2 == null) {
            class270.method1785(arg1.field476[0], (class17) null, arg1, arg1.field505[0], class77.field1154, (class80) null, 0, -38);
        } else {
            var2.method1574(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 39)
    public final void method872(int arg0) {
        field2049++;
        if (class304.field4758 == 1000) {
            return;
        }
        class343.field5341++;
        if ((class343.field5341 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class242.field3828 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class109.field1692.setSeed((long) class242.field3828);
        }
        if (arg0 < 19) {
            this.method863(false);
        }
        this.method886((byte) 87);
        if (class253.field3956 != null) {
            class253.field3956.method2335(106);
        }
        class76.method537((byte) -8);
        class233.method1592(true);
        class139.method948(21211);
        class101.method688(0);
        if (class333.field5166) {
            class301.method1980();
        }
        if (class283.field4349 != null) {
            int var3 = class283.field4349.method1070((byte) -114);
            class3.field28 = var3;
        }
        if (class304.field4758 == 0) {
            this.method895(90);
            class293.method1909(0);
        } else if (class304.field4758 == 5) {
            this.method895(90);
            class293.method1909(0);
        } else if (class304.field4758 == 25 || class304.field4758 == 28) {
            class198.method1337(28);
        }
        if (class304.field4758 == 10) {
            this.method887(122);
            class40.method291(65);
            class233.method1594((byte) 59);
            class305.method2076((byte) -120);
        } else if (class304.field4758 == 30) {
            class76.method534((byte) 41);
        } else if (class304.field4758 == 40) {
            class305.method2076((byte) -120);
            if (class51.field728 != -3) {
                if (class51.field728 == 15) {
                    class303.method2061(0);
                } else if (class51.field728 != 2) {
                    class173.method1177((byte) -74);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 132)
    private final void method886(byte arg0) {
        field2045++;
        if (arg0 <= 85) {
            this.method886((byte) -18);
        }
        boolean var2 = class124.field1938.method1680(-116);
        if (!var2) {
            this.method893(-30725);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 151)
    private final void method887(int arg0) {
        for (class71.field1072 = 0; class228.method1566(-5040) && class71.field1072 < 128; class71.field1072++) {
            class196.field2948[class71.field1072] = class306.field4791;
            class226.field3621[class71.field1072] = class257.field4003;
        }
        field2039++;
        class81.field1208++;
        if (class253.field3936 != -1) {
            class230.method1578(0, 0, 0, class174.field2644, arg0 - 123, 0, class253.field3936, class334.field5203);
        }
        class71.field1068++;
        if (class333.field5166) {
            int var2 = 2359807;
            label192: for (int var3 = 0; var3 < 32768; var3++) {
                class80 var4 = class208.field3313[var3];
                if (var4 != null) {
                    byte var5 = var4.field1178.field4625;
                    if ((var5 & 0x2) > 0 && var4.field541 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field476[0] = (var4.field537 >> 7) + var6;
                            var4.field505[0] = (var4.field519 >> 7) + var7;
                            var4.field487[0] = 1;
                            class33.field425[class77.field1154].method1929(0, false, var4.method271((byte) 96), var4.method271((byte) 91), false, (byte) -79, var4.field537 >> 7, var4.field519 >> 7);
                            if (var4.field476[0] >= 0 && var4.field476[0] <= 104 - var4.method271((byte) 54) && var4.field505[0] >= 0 && var4.field505[0] <= (104 - var4.method271((byte) 84)) && class33.field425[class77.field1154].method1927(var4.field476[0], var4.field505[0], var4.field537 >> 7, var4.field519 >> 7, true)) {
                                if (var4.method271((byte) 86) > 1) {
                                    for (int var8 = var4.field476[0]; var8 < (var4.field476[0] + var4.method271((byte) 91)); var8++) {
                                        for (int var9 = var4.field505[0]; var9 < var4.field505[0] + var4.method271((byte) 47); var9++) {
                                            if ((class33.field425[class77.field1154].field4544[var8][var9] & var2) != 0) {
                                                continue label192;
                                            }
                                        }
                                    }
                                }
                                var4.field541 = 1;
                            }
                        }
                    }
                    class105.method714(arg0 ^ 0x3A, var4);
                    class112.method748((byte) 101, var4);
                    class106.method718(93, var4);
                    class33.field425[class77.field1154].method1915(var4.field519 >> 7, var4.field537 >> 7, false, true, var4.method271((byte) 51), var4.method271((byte) 85), false);
                }
            }
        }
        if (!class333.field5166) {
            class142.method990(-1);
        } else if (class146.field2290 == 0 && class19.field265 == 0) {
            if (class219.field3489 == 2) {
                class40.method294(108);
            } else {
                class104.method707(65535);
            }
            if (class298.field4598 >> 7 < 14 || (class298.field4598 >> 7) >= 90 || (class225.field3592 >> 7) < 14 || class225.field3592 >> 7 >= 90) {
                class131.method900(-1);
            }
        }
        if (arg0 != 122) {
            field2034 = (int[][][]) ((int[][][]) null);
        }
        while (true) {
            class120 var10;
            class207 var17;
            class207 var18;
            do {
                var10 = (class120) class310.field4917.method12(-76);
                if (var10 == null) {
                    while (true) {
                        class120 var11;
                        class207 var12;
                        class207 var13;
                        do {
                            var11 = (class120) class76.field1141.method12(123);
                            if (var11 == null) {
                                while (true) {
                                    class120 var14;
                                    class207 var15;
                                    class207 var16;
                                    do {
                                        var14 = (class120) class101.field1569.method12(arg0 - 238);
                                        if (var14 == null) {
                                            if (class50.field706 != null) {
                                                class50.method342((byte) 27);
                                            }
                                            if (class14.field145 != null && class14.field145.field3931 == 1) {
                                                if (class14.field145.field3929 != null) {
                                                    class158.method1097(-1, class83.field1256, class19.field261);
                                                }
                                                class19.field261 = null;
                                                class14.field145 = null;
                                                class83.field1256 = false;
                                            }
                                            if ((class343.field5341 % 1500) == 0) {
                                                class249.method1695(116);
                                            }
                                            return;
                                        }
                                        var15 = var14.field1845;
                                        if (var15.field3283 < 0) {
                                            break;
                                        }
                                        var16 = class78.method547(var15.field3232, 100);
                                    } while (var16 == null || var16.field3253 == null || var15.field3283 >= var16.field3253.length || var16.field3253[var15.field3283] != var15);
                                    class122.method834((byte) 58, var14);
                                }
                            }
                            var12 = var11.field1845;
                            if (var12.field3283 < 0) {
                                break;
                            }
                            var13 = class78.method547(var12.field3232, 100);
                        } while (var13 == null || var13.field3253 == null || var13.field3253.length <= var12.field3283 || var13.field3253[var12.field3283] != var12);
                        class122.method834((byte) 48, var11);
                    }
                }
                var17 = var10.field1845;
                if (var17.field3283 < 0) {
                    break;
                }
                var18 = class78.method547(var17.field3232, 127);
            } while (var18 == null || var18.field3253 == null || var17.field3283 >= var18.field3253.length || var18.field3253[var17.field3283] != var17);
            class122.method834((byte) 59, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljh;)Lhl;", line = 371)
    public static final class108 method888(class207 arg0) {
        class108 var1 = (class108) class262.field4050.method1558(((long) arg0.field3250 << 32) + (long) arg0.field3283, false);
        return var1 == null ? arg0.field3180 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljh;)Z", line = 376)
    public static final boolean method889(class207 arg0) {
        if (class269.field4149) {
            if (method888(arg0).field1664 != 0) {
                return false;
            }
            if (arg0.field3273 == 0) {
                return false;
            }
        }
        return arg0.field3197;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ljh;IIIIIII)V", line = 394)
    public static final void method890(class207[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class207 var9 = arg0[var8];
            if (var9 != null && var9.field3232 == arg1 && (!var9.field3267 || var9.field3273 == 0 || var9.field3173 || method888(var9).field1664 != 0 || class117.field1809 == var9 || var9.field3149 == 1338) && (!var9.field3267 || !method889(var9))) {
                int var10 = var9.field3177 + arg6;
                int var11 = var9.field3212 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3273 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3169 + var10;
                    int var17 = var9.field3239 + var11;
                    if (var9.field3273 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class50.field706 == var9) {
                    class152.field2391 = true;
                    class126.field1964 = var10;
                    class181.field2778 = var11;
                }
                if (!var9.field3267 || var12 < var14 && var13 < var15) {
                    if (var9.field3273 == 0) {
                        if (!var9.field3267 && method889(var9) && class168.field2575 != var9) {
                            continue;
                        }
                        if (var9.field3295 && class199.field2985 >= var12 && class107.field1636 >= var13 && class199.field2985 < var14 && class107.field1636 < var15) {
                            for (class120 var18 = (class120) class101.field1569.method10((byte) 100); var18 != null; var18 = (class120) class101.field1569.method13((byte) -32)) {
                                if (var18.field1847) {
                                    var18.method1284(0);
                                    var18.field1845.field3302 = false;
                                }
                            }
                            if (class207.field3290 == 0) {
                                class50.field706 = null;
                                class117.field1809 = null;
                            }
                            class76.field1132 = 0;
                        }
                    }
                    if (var9.field3267) {
                        boolean var19;
                        if (class199.field2985 >= var12 && class107.field1636 >= var13 && class199.field2985 < var14 && class107.field1636 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class63.field941 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class256.field3994 == 1 && class85.field1295 >= var12 && class7.field81 >= var13 && class85.field1295 < var14 && class7.field81 < var15) {
                            var21 = true;
                        }
                        if (var9.field3237 != null) {
                            for (int var22 = 0; var22 < var9.field3237.length; var22++) {
                                if (class294.field4534[var9.field3237[var22]]) {
                                    if (var9.field3203 == null || class343.field5341 >= var9.field3203[var22]) {
                                        byte var23 = var9.field3276[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class294.field4534[86] && !class294.field4534[82] && !class294.field4534[81]) && ((var23 & 0x2) == 0 || class294.field4534[86]) && ((var23 & 0x1) == 0 || class294.field4534[82]) && ((var23 & 0x4) == 0 || class294.field4534[81])) {
                                            class96.method659(-1, var22 + 1, "", var9.field3250, 123);
                                            int var24 = var9.field3299[var22];
                                            if (var9.field3203 == null) {
                                                var9.field3203 = new int[var9.field3237.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3203[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3203[var22] = class343.field5341 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3203 != null) {
                                    var9.field3203[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class68.method487(class85.field1295 - var10, true, class7.field81 - var11, var9);
                        }
                        if (class50.field706 != null && class50.field706 != var9 && var19 && method888(var9).method726((byte) 99)) {
                            class183.field2803 = var9;
                        }
                        if (class117.field1809 == var9) {
                            class259.field4032 = true;
                            class181.field2773 = var10;
                            class116.field1802 = var11;
                        }
                        if (var9.field3173 || var9.field3149 != 0) {
                            if (var19 && class3.field28 != 0 && var9.field3152 != null) {
                                class120 var25 = new class120();
                                var25.field1847 = true;
                                var25.field1845 = var9;
                                var25.field1846 = class3.field28;
                                var25.field1837 = var9.field3152;
                                class101.field1569.method7((byte) -51, var25);
                            }
                            if (class50.field706 != null || class294.field4529 != null || class260.field4036 || var9.field3149 != 1400 && class76.field1132 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3149 != 0) {
                                if (var9.field3149 == 1337) {
                                    class162.field2509 = var9;
                                    continue;
                                }
                                if (var9.field3149 == 1338) {
                                    if (var21) {
                                        class64.field970 = class85.field1295 - var10;
                                        class269.field4154 = class7.field81 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3149 == 1400) {
                                    class277.field4275 = var9;
                                    if (var21) {
                                        if (class294.field4534[82] && class215.field3399 > 0) {
                                            int var26 = (int) ((double) (class85.field1295 - var10 - var9.field3169 / 2) * 2.0D / (double) class276.field4253);
                                            int var27 = (int) ((double) (class7.field81 - var11 - var9.field3239 / 2) * 2.0D / (double) class276.field4253);
                                            int var28 = class129.field2023 + var26;
                                            int var29 = class342.field5334 + var27;
                                            int var30 = class78.field1161 + var28;
                                            int var31 = class129.field2021 + class338.field5233 - var29 - 1;
                                            class200 var32 = class200.method1347(84);
                                            int[] var33 = var32.method1349(var31, var30, 114);
                                            if (var33 != null) {
                                                class97.method669(false, var33[1], var33[2], var33[0]);
                                                class115.method791(128);
                                            }
                                            continue;
                                        }
                                        class76.field1132 = 1;
                                        class106.field1624 = class199.field2985;
                                        class282.field4332 = class107.field1636;
                                        continue;
                                    }
                                    if (var20 && class76.field1132 > 0) {
                                        if (class76.field1132 == 1 && (class199.field2985 != class106.field1624 || class282.field4332 != class107.field1636)) {
                                            class167.field2562 = class129.field2023;
                                            class60.field845 = class342.field5334;
                                            class76.field1132 = 2;
                                        }
                                        if (class76.field1132 == 2) {
                                            class298.method1963(93, (int) ((double) (class106.field1624 - class199.field2985) * 2.0D / (double) class246.field3863) + class167.field2562);
                                            class169.method1145((int) ((double) (class282.field4332 - class107.field1636) * 2.0D / (double) class246.field3863) + class60.field845, -1);
                                        }
                                        continue;
                                    }
                                    class76.field1132 = 0;
                                    continue;
                                }
                                if (var9.field3149 == 1401) {
                                    if (var20) {
                                        class323.method2187(var9.field3169, var9.field3239, class199.field2985 - var10, class107.field1636 - var11, (byte) -46);
                                    }
                                    continue;
                                }
                                if (var9.field3149 == 1402) {
                                    if (!class333.field5166) {
                                        class277.method1822(4096, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field3186 && var21) {
                                var9.field3186 = true;
                                if (var9.field3228 != null) {
                                    class120 var34 = new class120();
                                    var34.field1847 = true;
                                    var34.field1845 = var9;
                                    var34.field1843 = class85.field1295 - var10;
                                    var34.field1846 = class7.field81 - var11;
                                    var34.field1837 = var9.field3228;
                                    class101.field1569.method7((byte) -51, var34);
                                }
                            }
                            if (var9.field3186 && var20 && var9.field3285 != null) {
                                class120 var35 = new class120();
                                var35.field1847 = true;
                                var35.field1845 = var9;
                                var35.field1843 = class199.field2985 - var10;
                                var35.field1846 = class107.field1636 - var11;
                                var35.field1837 = var9.field3285;
                                class101.field1569.method7((byte) -51, var35);
                            }
                            if (var9.field3186 && !var20) {
                                var9.field3186 = false;
                                if (var9.field3123 != null) {
                                    class120 var36 = new class120();
                                    var36.field1847 = true;
                                    var36.field1845 = var9;
                                    var36.field1843 = class199.field2985 - var10;
                                    var36.field1846 = class107.field1636 - var11;
                                    var36.field1837 = var9.field3123;
                                    class76.field1141.method7((byte) -51, var36);
                                }
                            }
                            if (var20 && var9.field3141 != null) {
                                class120 var37 = new class120();
                                var37.field1847 = true;
                                var37.field1845 = var9;
                                var37.field1843 = class199.field2985 - var10;
                                var37.field1846 = class107.field1636 - var11;
                                var37.field1837 = var9.field3141;
                                class101.field1569.method7((byte) -51, var37);
                            }
                            if (!var9.field3302 && var19) {
                                var9.field3302 = true;
                                if (var9.field3303 != null) {
                                    class120 var38 = new class120();
                                    var38.field1847 = true;
                                    var38.field1845 = var9;
                                    var38.field1843 = class199.field2985 - var10;
                                    var38.field1846 = class107.field1636 - var11;
                                    var38.field1837 = var9.field3303;
                                    class101.field1569.method7((byte) -51, var38);
                                }
                            }
                            if (var9.field3302 && var19 && var9.field3206 != null) {
                                class120 var39 = new class120();
                                var39.field1847 = true;
                                var39.field1845 = var9;
                                var39.field1843 = class199.field2985 - var10;
                                var39.field1846 = class107.field1636 - var11;
                                var39.field1837 = var9.field3206;
                                class101.field1569.method7((byte) -51, var39);
                            }
                            if (var9.field3302 && !var19) {
                                var9.field3302 = false;
                                if (var9.field3144 != null) {
                                    class120 var40 = new class120();
                                    var40.field1847 = true;
                                    var40.field1845 = var9;
                                    var40.field1843 = class199.field2985 - var10;
                                    var40.field1846 = class107.field1636 - var11;
                                    var40.field1837 = var9.field3144;
                                    class76.field1141.method7((byte) -51, var40);
                                }
                            }
                            if (var9.field3225 != null) {
                                class120 var41 = new class120();
                                var41.field1845 = var9;
                                var41.field1837 = var9.field3225;
                                class310.field4917.method7((byte) -51, var41);
                            }
                            if (var9.field3220 != null && class274.field4223 > var9.field3297) {
                                if (var9.field3181 == null || class274.field4223 - var9.field3297 > 32) {
                                    class120 var46 = new class120();
                                    var46.field1845 = var9;
                                    var46.field1837 = var9.field3220;
                                    class101.field1569.method7((byte) -51, var46);
                                } else {
                                    label575: for (int var42 = var9.field3297; var42 < class274.field4223; var42++) {
                                        int var43 = class160.field2488[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3181.length; var44++) {
                                            if (var9.field3181[var44] == var43) {
                                                class120 var45 = new class120();
                                                var45.field1845 = var9;
                                                var45.field1837 = var9.field3220;
                                                class101.field1569.method7((byte) -51, var45);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field3297 = class274.field4223;
                            }
                            if (var9.field3155 != null && class44.field633 > var9.field3122) {
                                if (var9.field3224 == null || class44.field633 - var9.field3122 > 32) {
                                    class120 var51 = new class120();
                                    var51.field1845 = var9;
                                    var51.field1837 = var9.field3155;
                                    class101.field1569.method7((byte) -51, var51);
                                } else {
                                    label551: for (int var47 = var9.field3122; var47 < class44.field633; var47++) {
                                        int var48 = class262.field4051[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3224.length; var49++) {
                                            if (var9.field3224[var49] == var48) {
                                                class120 var50 = new class120();
                                                var50.field1845 = var9;
                                                var50.field1837 = var9.field3155;
                                                class101.field1569.method7((byte) -51, var50);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field3122 = class44.field633;
                            }
                            if (var9.field3294 != null && class101.field1576 > var9.field3145) {
                                if (var9.field3257 == null || class101.field1576 - var9.field3145 > 32) {
                                    class120 var56 = new class120();
                                    var56.field1845 = var9;
                                    var56.field1837 = var9.field3294;
                                    class101.field1569.method7((byte) -51, var56);
                                } else {
                                    label527: for (int var52 = var9.field3145; var52 < class101.field1576; var52++) {
                                        int var53 = class104.field1596[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3257.length; var54++) {
                                            if (var9.field3257[var54] == var53) {
                                                class120 var55 = new class120();
                                                var55.field1845 = var9;
                                                var55.field1837 = var9.field3294;
                                                class101.field1569.method7((byte) -51, var55);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field3145 = class101.field1576;
                            }
                            if (var9.field3266 != null && class162.field2503 > var9.field3234) {
                                if (var9.field3280 == null || class162.field2503 - var9.field3234 > 32) {
                                    class120 var61 = new class120();
                                    var61.field1845 = var9;
                                    var61.field1837 = var9.field3266;
                                    class101.field1569.method7((byte) -51, var61);
                                } else {
                                    label503: for (int var57 = var9.field3234; var57 < class162.field2503; var57++) {
                                        int var58 = class95.field1451[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3280.length; var59++) {
                                            if (var9.field3280[var59] == var58) {
                                                class120 var60 = new class120();
                                                var60.field1845 = var9;
                                                var60.field1837 = var9.field3266;
                                                class101.field1569.method7((byte) -51, var60);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field3234 = class162.field2503;
                            }
                            if (var9.field3168 != null && class132.field2091 > var9.field3271) {
                                if (var9.field3262 == null || class132.field2091 - var9.field3271 > 32) {
                                    class120 var66 = new class120();
                                    var66.field1845 = var9;
                                    var66.field1837 = var9.field3168;
                                    class101.field1569.method7((byte) -51, var66);
                                } else {
                                    label479: for (int var62 = var9.field3271; var62 < class132.field2091; var62++) {
                                        int var63 = class54.field760[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3262.length; var64++) {
                                            if (var9.field3262[var64] == var63) {
                                                class120 var65 = new class120();
                                                var65.field1845 = var9;
                                                var65.field1837 = var9.field3168;
                                                class101.field1569.method7((byte) -51, var65);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field3271 = class132.field2091;
                            }
                            if (class121.field1871 > var9.field3254 && var9.field3258 != null) {
                                class120 var67 = new class120();
                                var67.field1845 = var9;
                                var67.field1837 = var9.field3258;
                                class101.field1569.method7((byte) -51, var67);
                            }
                            if (class315.field4968 > var9.field3254 && var9.field3218 != null) {
                                class120 var68 = new class120();
                                var68.field1845 = var9;
                                var68.field1837 = var9.field3218;
                                class101.field1569.method7((byte) -51, var68);
                            }
                            if (class260.field4034 > var9.field3254 && var9.field3298 != null) {
                                class120 var69 = new class120();
                                var69.field1845 = var9;
                                var69.field1837 = var9.field3298;
                                class101.field1569.method7((byte) -51, var69);
                            }
                            if (class329.field5097 > var9.field3254 && var9.field3151 != null) {
                                class120 var70 = new class120();
                                var70.field1845 = var9;
                                var70.field1837 = var9.field3151;
                                class101.field1569.method7((byte) -51, var70);
                            }
                            if (class168.field2570 > var9.field3254 && var9.field3147 != null) {
                                class120 var71 = new class120();
                                var71.field1845 = var9;
                                var71.field1837 = var9.field3147;
                                class101.field1569.method7((byte) -51, var71);
                            }
                            var9.field3254 = class71.field1068;
                            if (var9.field3263 != null) {
                                for (int var72 = 0; var72 < class71.field1072; var72++) {
                                    class120 var73 = new class120();
                                    var73.field1845 = var9;
                                    var73.field1836 = class196.field2948[var72];
                                    var73.field1842 = class226.field3621[var72];
                                    var73.field1837 = var9.field3263;
                                    class101.field1569.method7((byte) -51, var73);
                                }
                            }
                            if (class245.field3854 && var9.field3248 != null) {
                                class120 var74 = new class120();
                                var74.field1845 = var9;
                                var74.field1837 = var9.field3248;
                                class101.field1569.method7((byte) -51, var74);
                            }
                        }
                    }
                    if (!var9.field3267 && class50.field706 == null && class294.field4529 == null && !class260.field4036) {
                        if ((var9.field3209 >= 0 || var9.field3240 != 0) && class199.field2985 >= var12 && class107.field1636 >= var13 && class199.field2985 < var14 && class107.field1636 < var15) {
                            if (var9.field3209 >= 0) {
                                class168.field2575 = arg0[var9.field3209];
                            } else {
                                class168.field2575 = var9;
                            }
                        }
                        if (var9.field3273 == 8 && class199.field2985 >= var12 && class107.field1636 >= var13 && class199.field2985 < var14 && class107.field1636 < var15) {
                            class310.field4907 = var9;
                        }
                        if (var9.field3187 > var9.field3239) {
                            class240.method1642(class199.field2985, var9.field3169 + var10, var9.field3187, class107.field1636, var9.field3239, var9, 8, var11);
                        }
                    }
                    if (var9.field3273 == 0) {
                        method890(arg0, var9.field3250, var12, var13, var14, var15, var10 - var9.field3245, var11 - var9.field3270);
                        if (var9.field3253 != null) {
                            method890(var9.field3253, var9.field3250, var12, var13, var14, var15, var10 - var9.field3245, var11 - var9.field3270);
                        }
                        class45 var75 = (class45) class166.field2557.method1558((long) var9.field3250, false);
                        if (var75 != null) {
                            class230.method1578(var11, var12, var10, var15, -1, var13, var75.field640, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1167)
    public static final void method891(int arg0) {
        for (int var1 = 0; var1 < class200.field3001; var1++) {
            class18 var2 = class273.method1796(0, var1);
            if (var2 != null && var2.field243 == 0) {
                class61.field852[var1] = 0;
                class156.field2442[var1] = 0;
            }
        }
        if (arg0 >= -1) {
            main((String[]) null);
        }
        field2043++;
        class211.field3345 = new class227(16);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 1192)
    public final void method868(byte arg0) {
        field2052++;
        method884(true);
        class311.method2136((byte) 2);
        class200.method1346(-1);
        class121.method826((byte) 91);
        class6.method36(arg0 + 104);
        class113.method757(2);
        class284.method1860(-94);
        class61.method411(-32);
        class128.method864(71);
        class333.method2297();
        class69.method493(-127);
        class4.method31((byte) -13);
        class95.method654(true);
        class68.method486(31785);
        class303.method1999(false);
        class88.method600(false);
        class247.method1673((byte) 101);
        class335.method2329((byte) -112);
        class253.method1702(-74);
        class306.method2079(10237);
        class70.method497(-77);
        class33.method250(-334548688);
        class188.method1293(arg0 + 100);
        class80.method550(false);
        class304.method2067(-1432991773);
        class294.method1922((byte) -69);
        class207.method1383((byte) 118);
        class288.method1880((byte) -38);
        class82.method563(-20062);
        class2.method15(false);
        class245.method1659(false);
        class227.method1547((byte) -71);
        class342.method2388(0);
        class215.method1435((byte) -29);
        class196.method1327(-25555);
        class63.method448(-527009460);
        class177.method1195(false);
        class3.method23(127);
        class172.method1164((byte) 102);
        class222.method1487(-80);
        class38.method277(1);
        class174.method1178(0);
        class17.method138(true);
        class208.method1401(arg0 - 5);
        class298.method1966(-1);
        class45.method314((byte) 82);
        class108.method735((byte) 127);
        class187.method1282(true);
        class277.method1820(0);
        class34.method255(false);
        class89.method615(125);
        class262.method1744((byte) 26);
        class105.method716(false);
        class138.method938(arg0 ^ 0xFFFFFF99);
        class246.method1664(arg0 ^ 0x6A9B);
        class293.method1910(arg0 ^ 0xFFFFFFA0);
        class29.method222(-78);
        class249.method1692((byte) -97);
        class332.method2275((byte) 84);
        class315.method2153(-32394);
        class150.method1059(false);
        class279.method1833();
        class322.method2181((byte) 63);
        class142.method995((byte) -124);
        class329.method2228(100);
        class192.method1311(true);
        class256.method1722(27297);
        class326.method2214();
        class175.method1184(31465);
        class114.method784();
        class118.method811(12345678);
        class340.method2358();
        class291.method1891(true);
        class141.method954();
        class179.method1224(5);
        class199.method1345((byte) 116);
        class307.method2118((byte) -94);
        class210.method1403(true);
        class301.method1985();
        class9.method56();
        class125.method842(49);
        class205.method1377(-109);
        class336.method2336((byte) -34);
        class79.method548(0);
        class180.method1253();
        class40.method289((byte) -65);
        class276.method1814((byte) -103);
        class325.method2208();
        class330.method2229((byte) -43);
        class165.method1127(115);
        class320.method2169(-1);
        class8.method46();
        class147.method1039();
        class310.method2129(false);
        class167.method1138(arg0 - 24132);
        class107.method722((byte) -48);
        class164.method1120(false);
        class163.method1115(true);
        class57.method380();
        class338.method2337(16004);
        class269.method1781((byte) 44);
        class280.method1849((byte) 13);
        class312.method2141(-124);
        class52.method354(121);
        class260.method1736((byte) 103);
        class183.method1260(2);
        class265.method1753(0);
        class10.method66(50);
        class26.method205(false);
        class242.method1650(-112);
        class309.method2122(-1);
        class148.method1046((byte) -94);
        class345.method2397(arg0 + 31067);
        class18.method141(906);
        class67.method482();
        class64.method462((byte) 20);
        class225.method1537((byte) 99);
        class146.method1023(-35);
        class39.method287(arg0 + 102);
        class213.method1427((byte) -25);
        class285.method1863(1000000);
        class25.method196();
        class84.method577((byte) 21);
        class221.method1472(-32303);
        class90.method622(1851);
        class7.method43((byte) 11);
        class97.method666(arg0 ^ 0xFFFFB371);
        class228.method1564(-20799);
        class110.method744((byte) 41);
        class143.method1000((byte) -74);
        class102.method696();
        class131.method901(-35);
        class12.method107();
        class334.method2325(arg0 ^ 0xFFFF9CFD);
        class193.method1315(0);
        class237.method1618(arg0 + 113);
        class24.method177((byte) -41);
        class130.method883(1);
        class271.method1787(97);
        class49.method341();
        class117.method803(arg0 ^ 0xFFFFFF95);
        class137.method934();
        class234.method1598((byte) 101);
        class264.method1747(-49);
        class120.method819(false);
        class94.method644(-1);
        class217.method1450();
        class58.method398(-2049);
        class157.method1094((byte) -86);
        class152.method1068((byte) 1);
        class23.method173(true);
        class123.method837(-4688);
        class212.method1421(true);
        class62.method414();
        class42.method306(true);
        class54.method363((byte) -128);
        class314.method2149(true);
        class65.method464();
        class11.method85();
        class182.method1259();
        class317.method2159(101);
        class127.method858();
        class238.method1622();
        class32.method237();
        class156.method1083(0);
        class112.method753((byte) -128);
        class36.method261(1);
        class75.method525(-89);
        class15.method118(0);
        class229.method1568((byte) -121);
        class203.method1366(arg0 + 101);
        class98.method676(128);
        class48.method332();
        class144.method1007(32768);
        class161.method1110(0);
        class19.method148(-11043);
        class122.method831(arg0 + 18);
        class339.method2344(256);
        class86.method588(101);
        class218.method1461((byte) 117);
        class92.method628((byte) -56);
        class27.method208((byte) 44);
        class235.method1609(100);
        if (arg0 != -99) {
            field2034 = (int[][][]) ((int[][][]) null);
        }
        class299.method1968((byte) -76);
        class96.method662((byte) 63);
        class259.method1728(arg0 + 193);
        class181.method1254((byte) 35);
        class283.method1858(-102);
        class302.method1987(arg0 + 98);
        class236.method1610((byte) 114);
        class318.method2162(arg0 + 100);
        class296.method1939();
        class91.method626(arg0 + 214);
        class261.method1739((byte) -96);
        class168.method1143(86);
        class37.method262((byte) 82);
        class220.method1467(0);
        class109.method739(-13496);
        class344.method2393();
        class251.method1699();
        class139.method946(true);
        class313.method2144((byte) 109);
        class166.method1131(arg0 ^ 0xFFFFFF9E);
        class35.method256((byte) -128);
        class292.method1906();
        class241.method1646();
        class226.method1542(0);
        class46.method316(0);
        class263.method1746();
        class278.method1829(true);
        class202.method1360();
        class267.method1770();
        class190.method1303(-28066);
        class170.method1155((byte) -126);
        class273.method1792((byte) -120);
        class76.method536((byte) 127);
        class56.method371((byte) 43);
        class129.method878(20254);
        class194.method1320(-8632);
        class211.method1413((byte) -33);
        class268.method1774(arg0 - 23877);
        class275.method1807(0);
        class305.method2074((byte) 111);
        class233.method1591(-128);
        class169.method1146(arg0 + 203);
        class43.method310((byte) 36);
        class133.method908(-92);
        class14.method114(0);
        class22.method169(-6623);
        class78.method545(-1201147760);
        class50.method343(-1);
        class100.method683(false);
        class158.method1096((byte) 3);
        class74.method522((byte) 56);
        class297.method1949(2);
        class230.method1577((byte) -112);
        class104.method708(-10910);
        class99.method680(30);
        class59.method402(-102);
        class155.method1080((byte) 48);
        class115.method792(-88);
        class274.method1800((byte) 60);
        class51.method348(true);
        class204.method1372(false);
        class87.method594(71);
        class266.method1763(18195);
        class154.method1074(-126);
        class206.method1381(0);
        class151.method1063((byte) -95);
        class173.method1175(31294);
        class93.method635(arg0 + 99);
        class219.method1464(-1);
        class160.method1107((byte) -126);
        class47.method329((byte) -121);
        class72.method517(arg0 ^ 0xFFFFEB56);
        class248.method1684((byte) 91);
        class184.method1270(-70);
        class162.method1112(arg0 ^ 0x20A48DF1);
        class124.method838(false);
        class85.method585((byte) -31);
        class81.method556((byte) -85);
        class255.method1717((byte) -67);
        class71.method514(arg0 ^ 0x432B);
        class323.method2183((byte) 92);
        class231.method1584(false);
        class240.method1641(arg0 ^ 0x68);
        class159.method1102(-119);
        class343.method2392((byte) -11);
        class116.method798(arg0 ^ 0xFFFFFF9D);
        class286.method1869(-108);
        class106.method719(123);
        class185.method1272(-1113);
        class282.method1856((byte) 49);
        class308.method2120((byte) 15);
        class136.method927(122);
        class197.method1334(381758408);
        class77.method544(-123);
        class101.method685(1);
        class30.method226((byte) -59);
        class83.method571(-62);
        class132.method905(arg0 + 101);
        class44.method313(-127);
        class126.method845((byte) -121);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1486)
    public final void method873(int arg0) {
        field2036++;
        if (arg0 != 14) {
            field2034 = (int[][][]) ((int[][][]) null);
        }
        class208.method1399(arg0 ^ 0xFFFFFD0D);
        class85.field1291 = new class214();
        class124.field1938 = new class247();
        if (class165.field2534 != 0) {
            class117.field1814 = new byte[50][];
        }
        class13.method109(-76, class89.field1359);
        if (class208.field3307 == 0) {
            class196.field2943 = this.getCodeBase().getHost();
            class274.field4220 = 43594;
            class152.field2401 = 443;
        } else if (class208.field3307 == 1) {
            class196.field2943 = this.getCodeBase().getHost();
            class274.field4220 = class214.field3386 + 40000;
            class152.field2401 = class214.field3386 + 50000;
        } else if (class208.field3307 == 2) {
            class152.field2401 = class214.field3386 + 50000;
            class196.field2943 = "127.0.0.1";
            class274.field4220 = class214.field3386 + 40000;
        }
        class221.field3506 = class152.field2401;
        if (class2.field25 == 1) {
            class204.field3085 = class230.field3715;
            class326.field5068 = 16777215;
            class326.field5071 = 0;
            class22.field281 = class75.field1112;
            class84.field1282 = class157.field2460;
            class210.field3338 = class273.field4199;
            class86.field1301 = true;
        } else {
            class210.field3338 = class72.field1089;
            class22.field281 = class4.field46;
            class84.field1282 = class181.field2783;
            class204.field3085 = class184.field2814;
        }
        class117.field1804 = class236.field3794 = class185.field2830 = class256.field3996 = new short[256];
        class43.field610 = class274.field4220;
        if (class224.field3576 == 3 && class208.field3307 != 2) {
            class19.field259 = class214.field3386;
        }
        class7.field82 = class274.field4220;
        class82.field1229 = class196.field2943;
        class23.field292 = class7.field82;
        class226.method1545(26);
        class335.method2332(class302.field4665, (byte) -124);
        class222.method1495(class302.field4665, (byte) -116);
        class283.field4349 = class311.method2140((byte) -5);
        if (class283.field4349 != null) {
            class283.field4349.method1072(arg0 - 14, class302.field4665);
        }
        class272.field4187 = class224.field3576;
        try {
            if (class89.field1359.field3563 != null) {
                class184.field2816 = new class70(class89.field1359.field3563, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class262.field4049[var2] = new class70(class89.field1359.field3580[var2], 6000, 0);
                }
                class133.field2102 = new class70(class89.field1359.field3573, 6000, 0);
                class264.field4073 = new class33(255, class184.field2816, class133.field2102, 500000);
                class122.field1901 = new class70(class89.field1359.field3572, 24, 0);
                class89.field1359.field3572 = null;
                class89.field1359.field3573 = null;
                class89.field1359.field3580 = null;
                class89.field1359.field3563 = null;
            }
        } catch (IOException var4) {
            class264.field4073 = null;
            class133.field2102 = null;
            class184.field2816 = null;
            class122.field1901 = null;
        }
        if (class208.field3307 != 0) {
            class315.field4964 = true;
        }
        class255.field3988 = class259.field4028;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ljh;)Ljh;", line = 1604)
    public static final class207 method892(class207 arg0) {
        int var1 = method888(arg0).method732(8494);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class78.method547(arg0.field3232, 94);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1626)
    private final void method893(int arg0) {
        field2053++;
        if (class215.field3403 < class124.field1938.field3896) {
            class91.field1418 = (class124.field1938.field3896 * 50 - 50) * 5;
            if (class91.field1418 > 3000) {
                class91.field1418 = 3000;
            }
            if (class43.field610 == class23.field292) {
                class23.field292 = class221.field3506;
            } else {
                class23.field292 = class43.field610;
            }
            if (class124.field1938.field3896 >= 2 && class124.field1938.field3894 == 6) {
                this.method865(true, "js5connect_outofdate");
                class304.field4758 = 1000;
                return;
            }
            if (class124.field1938.field3896 >= 4 && class124.field1938.field3894 == -1) {
                this.method865(true, "js5crc");
                class304.field4758 = 1000;
                return;
            }
            if (class124.field1938.field3896 >= 4 && (class304.field4758 == 0 || class304.field4758 == 5)) {
                if (class124.field1938.field3894 == 7 || class124.field1938.field3894 == 9) {
                    this.method865(true, "js5connect_full");
                } else if (class124.field1938.field3894 > 0) {
                    this.method865(true, "js5connect");
                } else {
                    this.method865(true, "js5io");
                }
                class304.field4758 = 1000;
                return;
            }
        }
        class215.field3403 = class124.field1938.field3896;
        if (class91.field1418 > 0) {
            class91.field1418--;
            return;
        }
        try {
            if (class146.field2302 == 0) {
                class90.field1378 = class89.field1359.method1508(-35, class23.field292, class82.field1229);
                class146.field2302++;
            }
            if (class146.field2302 == 1) {
                if (class90.field1378.field3931 == 2) {
                    this.method896(97, 1000);
                    return;
                }
                if (class90.field1378.field3931 == 1) {
                    class146.field2302++;
                }
            }
            if (class146.field2302 == 2) {
                class303.field4700 = new class88((Socket) class90.field1378.field3929, class89.field1359);
                class303 var2 = new class303(5);
                var2.method2034(arg0 ^ 0x7839, 15);
                var2.method2013(538, arg0 + 30679);
                class303.field4700.method598(0, 5, 1, var2.field4716);
                class146.field2302++;
                class285.field4370 = class195.method1322(116);
            }
            if (arg0 != -30725) {
                this.method893(23);
            }
            if (class146.field2302 == 3) {
                if (class304.field4758 == 0 || class304.field4758 == 5 || class303.field4700.method607(82) > 0) {
                    int var3 = class303.field4700.method602(61);
                    if (var3 != 0) {
                        this.method896(-99, var3);
                        return;
                    }
                    class146.field2302++;
                } else if ((class195.method1322(120) - class285.field4370) > 30000L) {
                    this.method896(-57, 1001);
                    return;
                }
            }
            if (class146.field2302 == 4) {
                boolean var4 = class304.field4758 == 5 || class304.field4758 == 10 || class304.field4758 == 28;
                class124.field1938.method1674(class303.field4700, -117, !var4);
                class90.field1378 = null;
                class303.field4700 = null;
                class146.field2302 = 0;
            }
        } catch (IOException var6) {
            this.method896(-51, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1774)
    public final void method863(boolean arg0) {
        field2051++;
        if (class304.field4758 == 1000) {
            return;
        }
        long var2 = class192.method1313((byte) 86) / 1000000L - class226.field3612;
        class226.field3612 = class192.method1313((byte) 101) / 1000000L;
        boolean var4 = class90.method624(-20);
        if (var4 && class58.field826 && class228.field3654 != null) {
            class228.field3654.method1193((byte) 18);
        }
        if ((class304.field4758 == 30 || class304.field4758 == 10) && (class280.field4325 || class268.field4127 != 0L && class195.method1322(116) > class268.field4127)) {
            class120.method818(2, class166.method1132(arg0), class280.field4325, class10.field99, class226.field3605);
        }
        if (class63.field919 == null) {
            Container var5;
            if (class63.field919 != null) {
                var5 = class63.field919;
            } else if (class261.field4045 == null) {
                var5 = class89.field1359.field3569;
            } else {
                var5 = class261.field4045;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class261.field4045 == var5) {
                Insets var8 = class261.field4045.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class312.field4943 != var6 || class136.field2112 != var7) {
                if (class224.field3567.startsWith("mac")) {
                    class312.field4943 = var6;
                    class136.field2112 = var7;
                } else {
                    class208.method1399(-765);
                }
                class268.field4127 = class195.method1322(122) + 500L;
            }
        }
        boolean var9 = arg0;
        if (class63.field919 != null && !class2.field8 && (class304.field4758 == 30 || class304.field4758 == 10)) {
            class120.method818(2, class175.field2682, false, -1, -1);
        }
        if (class245.field3840) {
            var9 = true;
            class245.field3840 = false;
        }
        if (var9) {
            class95.method649(-14227);
        }
        if (class333.field5166) {
            for (int var10 = 0; var10 < 100; var10++) {
                class2.field12[var10] = true;
            }
        }
        if (class304.field4758 == 0) {
            class38.method268(class71.field1058, var9, (byte) 58, class187.field2841, (Color) null);
        } else if (class304.field4758 == 5) {
            class163.method1118(false, class286.field4380, 34);
        } else if (class304.field4758 == 10) {
            class60.method408(-1);
        } else if (class304.field4758 == 25 || class304.field4758 == 28) {
            if (class19.field257 == 1) {
                if (class183.field2796 > class27.field351) {
                    class27.field351 = class183.field2796;
                }
                int var11 = (class27.field351 - class183.field2796) * 50 / class27.field351;
                class204.method1369(false, true, class200.field3016 + "<br>(" + var11 + "%)");
            } else if (class19.field257 == 2) {
                if (class255.field3990 > class101.field1575) {
                    class101.field1575 = class255.field3990;
                }
                int var12 = (class101.field1575 - class255.field3990) * 50 / class101.field1575 + 50;
                class204.method1369(false, true, class200.field3016 + "<br>(" + var12 + "%)");
            } else {
                class204.method1369(false, true, class200.field3016);
            }
        } else if (class304.field4758 == 30) {
            class175.method1183(var2, 128);
        } else if (class304.field4758 == 40) {
            class204.method1369(false, true, class23.field297 + "<br>" + class69.field1028);
        }
        if (class333.field5166 && class304.field4758 != 0) {
            class333.method2319();
            for (int var19 = 0; var19 < class64.field963; var19++) {
                class19.field267[var19] = false;
            }
        } else if ((class304.field4758 == 30 || class304.field4758 == 10) && class288.field4416 == 0 && !var9) {
            try {
                Graphics var16 = class302.field4665.getGraphics();
                for (int var17 = 0; var17 < class64.field963; var17++) {
                    if (class19.field267[var17]) {
                        class42.field594.method28(class167.field2563[var17], class233.field3750[var17], class15.field159[var17], class194.field2932[var17], 1, var16);
                        class19.field267[var17] = false;
                    }
                }
            } catch (Exception var20) {
                class302.field4665.repaint();
            }
        } else if (class304.field4758 != 0) {
            try {
                Graphics var13 = class302.field4665.getGraphics();
                class42.field594.method29(0, var13, 0, 30365);
                for (int var14 = 0; var14 < class64.field963; var14++) {
                    class19.field267[var14] = false;
                }
            } catch (Exception var21) {
                class302.field4665.repaint();
            }
        }
        if (class164.field2522) {
            class227.method1557((byte) -42);
        }
        if (class315.field4962 && class304.field4758 == 10 && class253.field3936 != -1) {
            class315.field4962 = false;
            class268.method1777(-27637, class89.field1359);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1996)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class183.method1261((byte) -63, "argument count");
            }
            class214.field3386 = Integer.parseInt(arg0[0]);
            class208.field3307 = 2;
            if (arg0[1].equals("live")) {
                class165.field2534 = 0;
            } else if (arg0[1].equals("rc")) {
                class165.field2534 = 1;
            } else if (arg0[1].equals("wip")) {
                class165.field2534 = 2;
            } else {
                class183.method1261((byte) -63, "modewhat");
            }
            class237.field3796 = false;
            class157.field2462 = class211.method1410(-22859, arg0[2]);
            if (class157.field2462 == -1) {
                if (arg0[2].equals("english")) {
                    class157.field2462 = 0;
                } else if (arg0[2].equals("german")) {
                    class157.field2462 = 1;
                } else {
                    class183.method1261((byte) -63, "language");
                }
            }
            class294.method1925(class157.field2462, 671744);
            class242.field3831 = false;
            class148.field2341 = false;
            if (arg0[3].equals("game0")) {
                class2.field25 = 0;
            } else if (arg0[3].equals("game1")) {
                class2.field25 = 1;
            } else {
                class183.method1261((byte) -63, "game");
            }
            class79.field1177 = 0;
            class123.field1928 = 0;
            class179.field2741 = false;
            class266.field4101 = "";
            client var1 = new client();
            class236.field3790 = var1;
            var1.method875(29, 110, class165.field2534 + 32, false, "runescape", 1024, 538, 768);
            class261.field4045.setLocation(40, 40);
        } catch (Exception var3) {
            class291.method1892((String) null, var3, -2);
        }
        field2046++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2060)
    public final void init() {
        field2050++;
        if (!this.method874(0)) {
            return;
        }
        class214.field3386 = Integer.parseInt(this.getParameter("worldid"));
        class208.field3307 = Integer.parseInt(this.getParameter("modewhere"));
        if (class208.field3307 < 0 || class208.field3307 > 1) {
            class208.field3307 = 0;
        }
        class165.field2534 = Integer.parseInt(this.getParameter("modewhat"));
        if (class165.field2534 < 0 || class165.field2534 > 2) {
            class165.field2534 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class237.field3796 = true;
        } else {
            class237.field3796 = false;
        }
        try {
            class157.field2462 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class157.field2462 = 0;
        }
        class294.method1925(class157.field2462, 671744);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class148.field2341 = true;
        } else {
            class148.field2341 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class242.field3831 = true;
        } else {
            class242.field3831 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class2.field25 = 1;
        } else {
            class2.field25 = 0;
        }
        try {
            class123.field1928 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class123.field1928 = 0;
        }
        class266.field4101 = this.getParameter("settings");
        if (class266.field4101 == null) {
            class266.field4101 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class79.field1177 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class79.field1177 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class179.field2741 = true;
        } else {
            class179.field2741 = false;
        }
        class236.field3790 = this;
        this.method866(765, class165.field2534 + 32, 503, 1538, 28);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZILum;)V", line = 2144)
    public static final void method894(int arg0, boolean arg1, int arg2, class82 arg3) {
        field2041++;
        if ((arg2 & 0x10) != 0) {
            int var4 = class230.field3713.method2003(-91);
            int var5 = class230.field3713.method2053(-21097);
            arg3.method273(class343.field5341, var5, var4, -107);
            arg3.field533 = class343.field5341 + 300;
            arg3.field554 = class230.field3713.method2038((byte) -96);
        }
        if ((arg2 & 0x400) != 0) {
            arg3.field480 = class230.field3713.method2053(-21097);
            arg3.field464 = class230.field3713.method2002(-89);
            arg3.field502 = class230.field3713.method2043((byte) -120);
            arg3.field518 = class230.field3713.method2043((byte) -117);
            arg3.field553 = class230.field3713.method1994(false) + class343.field5341;
            arg3.field466 = class230.field3713.method1992(true) + class343.field5341;
            arg3.field469 = class230.field3713.method2053(-21097);
            arg3.field541 = 1;
            arg3.field504 = 0;
        }
        if ((arg2 & 0x800) != 0) {
            int var6 = class230.field3713.method2016(2);
            if (var6 == 65535) {
                var6 = -1;
            }
            boolean var7 = true;
            int var8 = class230.field3713.method2037((byte) 58);
            if (var6 != -1 && arg3.field530 != -1 && class118.method809((byte) 67, class63.method428(false, var6).field2355).field3560 < class118.method809((byte) 41, class63.method428(false, arg3.field530).field2355).field3560) {
                var7 = false;
            }
            if (var7) {
                arg3.field534 = 0;
                arg3.field501 = var8 >> 16;
                arg3.field496 = 1;
                arg3.field506 = 0;
                arg3.field477 = (var8 & 0xFFFF) + class343.field5341;
                if (arg3.field477 > class343.field5341) {
                    arg3.field534 = -1;
                }
                arg3.field530 = var6;
                if (arg3.field530 != -1 && class343.field5341 == arg3.field477) {
                    int var9 = class63.method428(false, arg3.field530).field2355;
                    if (var9 != -1) {
                        class222 var10 = class118.method809((byte) 65, var9);
                        if (var10 != null && var10.field3529 != null) {
                            class229.method1571(arg3.field537, class79.field1173 == arg3, (byte) -110, arg3.field519, var10, 0);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x100) != 0) {
            int var11 = class230.field3713.method2003(-6);
            int var12 = class230.field3713.method2002(-90);
            arg3.method273(class343.field5341, var12, var11, -94);
        }
        if ((arg2 & 0x20) != 0) {
            int var13 = class230.field3713.method1992(true);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class230.field3713.method2053(-21097);
            class17.method126(-1, var14, arg3, var13);
        }
        if ((arg2 & 0x4) != 0) {
            int var15 = class230.field3713.method2053(-21097);
            byte[] var16 = new byte[var15];
            class303 var17 = new class303(var16);
            class230.field3713.method2028(0, var15, var16, 0);
            class70.field1050[arg0] = var17;
            arg3.method566(var17, -1);
        }
        if ((arg2 & 0x80) != 0) {
            arg3.field510 = class230.field3713.method2016(2);
            arg3.field540 = class230.field3713.method2016(2);
        }
        if ((arg2 & 0x8) != 0) {
            int var18 = class230.field3713.method2016(2);
            int var19 = class230.field3713.method2002(-90);
            int var20 = class230.field3713.method2038((byte) -111);
            int var21 = class230.field3713.field4679;
            boolean var22 = (var18 & 0x8000) != 0;
            if (arg3.field1218 != null && arg3.field1247 != null) {
                long var23 = class108.method723(arg3.field1218, -89);
                boolean var25 = false;
                if (var19 <= 1) {
                    if (!var22 && (class50.field707 && !class83.field1258 || class207.field3288)) {
                        var25 = true;
                    } else {
                        for (int var26 = 0; var26 < class190.field2891; var26++) {
                            if (class115.field1792[var26] == var23) {
                                var25 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var25 && class7.field83 == 0) {
                    class311.field4928.field4679 = 0;
                    class230.field3713.method2009(27, 0, var20, class311.field4928.field4716);
                    class311.field4928.field4679 = 0;
                    int var27 = -1;
                    String var29;
                    if (var22) {
                        class264 var28 = class220.method1469(32239, class311.field4928);
                        var27 = var28.field4070;
                        var18 &= 0x7FFF;
                        var29 = var28.field4072.method1010(class311.field4928, 60);
                    } else {
                        var29 = class180.method1238(class268.method1775(class131.method902(8, class311.field4928), (byte) -42));
                    }
                    arg3.field548 = var29.trim();
                    arg3.field513 = var18 & 0xFF;
                    arg3.field539 = 150;
                    arg3.field473 = var18 >> 8;
                    if (var19 == 2) {
                        class128.method862("<img=1>" + arg3.method565(18548), (String) null, var27, arg1, var29, var22 ? 17 : 1);
                    } else if (var19 == 1) {
                        class128.method862("<img=0>" + arg3.method565(18548), (String) null, var27, true, var29, var22 ? 17 : 1);
                    } else {
                        class128.method862(arg3.method565(18548), (String) null, var27, true, var29, var22 ? 17 : 2);
                    }
                }
            }
            class230.field3713.field4679 = var20 + var21;
        }
        if ((arg2 & 0x1) != 0) {
            arg3.field548 = class230.field3713.method2027(0);
            if (arg3.field548.charAt(0) == '~') {
                arg3.field548 = arg3.field548.substring(1);
                class343.method2390(arg3.field548, 2, false, arg3.method565(18548));
            } else if (class79.field1173 == arg3) {
                class343.method2390(arg3.field548, 2, false, arg3.method565(18548));
            }
            arg3.field539 = 150;
            arg3.field513 = 0;
            arg3.field473 = 0;
        }
        if ((arg2 & 0x200) != 0) {
            int var30 = class230.field3713.method2038((byte) -56);
            int[] var31 = new int[var30];
            int[] var32 = new int[var30];
            int[] var33 = new int[var30];
            for (int var34 = 0; var34 < var30; var34++) {
                int var35 = class230.field3713.method2016(2);
                if (var35 == 65535) {
                    var35 = -1;
                }
                var33[var34] = var35;
                var31[var34] = class230.field3713.method2038((byte) -73);
                var32[var34] = class230.field3713.method1994(!arg1);
            }
            class70.method505(var32, 0, var33, arg3, var31);
        }
        if ((arg2 & 0x40) != 0) {
            arg3.field551 = class230.field3713.method2030((byte) -70);
            if (arg3.field551 == 65535) {
                arg3.field551 = -1;
            }
        }
        if (!arg1) {
            method889((class207) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2421)
    private final void method895(int arg0) {
        if (!class315.field4962) {
            label243: while (true) {
                do {
                    if (!class228.method1566(arg0 ^ 0xFFFFEC0A)) {
                        break label243;
                    }
                } while (class257.field4003 != 's' && class257.field4003 != 'S');
                class315.field4962 = true;
            }
        }
        field2035++;
        if (class306.field4786 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class195.method1322(124);
            if (class194.field2931 == 0L) {
                class194.field2931 = var28;
            }
            if (var27 > 16384 && (var28 - class194.field2931) < 5000L) {
                if ((var28 - class139.field2149) > 1000L) {
                    System.gc();
                    class139.field2149 = var28;
                }
                class71.field1058 = class143.field2265;
                class187.field2841 = 5;
            } else {
                class187.field2841 = 5;
                class71.field1058 = class106.field1622;
                class306.field4786 = 10;
            }
        } else if (class306.field4786 == 10) {
            class147.method1031(4, 104, 104);
            for (int var2 = 0; var2 < 4; var2++) {
                class33.field425[var2] = new class294(104, 104);
            }
            class187.field2841 = 10;
            class306.field4786 = 30;
            class71.field1058 = class330.field5099;
        } else if (class306.field4786 == 30) {
            if (class253.field3956 == null) {
                class253.field3956 = new class335(class124.field1938, class85.field1291);
            }
            if (class253.field3956.method2330(255)) {
                class231.field3728 = class247.method1671(true, -18434, true, false, 0);
                class199.field2990 = class247.method1671(true, arg0 ^ 0xFFFFB7A4, true, false, 1);
                class121.field1861 = class247.method1671(true, -18434, false, true, 2);
                class36.field455 = class247.method1671(true, -18434, true, false, 3);
                class311.field4935 = class247.method1671(true, -18434, true, false, 4);
                class297.field4554 = class247.method1671(true, -18434, true, true, 5);
                class211.field3353 = class247.method1671(false, -18434, true, true, 6);
                class54.field762 = class247.method1671(true, arg0 ^ 0xFFFFB7A4, true, false, 7);
                class121.field1859 = class247.method1671(true, arg0 ^ 0xFFFFB7A4, true, false, 8);
                class90.field1381 = class247.method1671(true, -18434, true, false, 9);
                class81.field1201 = class247.method1671(true, arg0 - 18524, true, false, 10);
                class269.field4142 = class247.method1671(true, -18434, true, false, 11);
                class236.field3795 = class247.method1671(true, -18434, true, false, 12);
                class143.field2275 = class247.method1671(true, -18434, true, false, 13);
                class304.field4749 = class247.method1671(false, -18434, true, false, 14);
                class89.field1353 = class247.method1671(true, -18434, true, false, 15);
                class58.field818 = class247.method1671(true, -18434, true, false, 16);
                class234.field3761 = class247.method1671(true, -18434, true, false, 17);
                class143.field2262 = class247.method1671(true, arg0 - 18524, true, false, 18);
                class90.field1373 = class247.method1671(true, -18434, true, false, 19);
                class222.field3532 = class247.method1671(true, arg0 - 18524, true, false, 20);
                class172.field2609 = class247.method1671(true, arg0 - 18524, true, false, 21);
                class193.field2917 = class247.method1671(true, -18434, true, false, 22);
                class2.field13 = class247.method1671(true, -18434, true, true, 23);
                class112.field1718 = class247.method1671(true, -18434, true, false, 24);
                class125.field1959 = class247.method1671(true, -18434, true, false, 25);
                class183.field2794 = class247.method1671(true, -18434, true, true, 26);
                class88.field1332 = class247.method1671(true, -18434, true, false, 27);
                class225.field3590 = class247.method1671(true, arg0 ^ 0xFFFFB7A4, true, true, 28);
                class187.field2841 = 15;
                class306.field4786 = 40;
                class71.field1058 = class110.field1701;
            } else {
                class71.field1058 = class334.field5190;
                class187.field2841 = 12;
            }
        } else if (class306.field4786 == 40) {
            int var24 = 0;
            for (int var25 = 0; var25 < 29; var25++) {
                var24 += class226.field3617[var25].method1711(-1) * class303.field4674[var25] / 100;
            }
            if (var24 == 100) {
                class187.field2841 = 20;
                class71.field1058 = class282.field4330;
                class75.method523((byte) 6, class121.field1859);
                class15.method120(class121.field1859, arg0 ^ 0x24);
                class35.method257(class121.field1859, -3969);
                class306.field4786 = 41;
            } else {
                if (var24 != 0) {
                    class71.field1058 = class247.field3885 + var24 + "%";
                }
                class187.field2841 = 20;
            }
        } else if (class306.field4786 == 41) {
            if (class225.field3590.method2078((byte) -69)) {
                this.method897(28930, class225.field3590.method2102(1, 1));
                class187.field2841 = 25;
                class306.field4786 = 45;
                class71.field1058 = class154.field2416;
            } else {
                class71.field1058 = class304.field4751 + class225.field3590.method2106(arg0 + 10) + "%";
                class187.field2841 = 25;
            }
        } else if (class306.field4786 == 45) {
            class210.method1406(22050, class269.field4148, 2, (byte) 113);
            class211.field3342 = new class63();
            class211.field3342.method426(9, 128, 128);
            class228.field3654 = class215.method1439(class89.field1359, 0, class302.field4665, 22050, 0);
            class228.field3654.method1200(106, class211.field3342);
            class304.method2066(class89.field1353, class211.field3342, class311.field4935, class304.field4749, -1432991773);
            class196.field2944 = class215.method1439(class89.field1359, 0, class302.field4665, 2048, 1);
            class74.field1102 = new class28();
            class196.field2944.method1200(77, class74.field1102);
            class203.field3068 = new class3(22050, class282.field4337);
            class18.field253 = class211.field3353.method2107("scape main", (byte) 121);
            class187.field2841 = 30;
            class71.field1058 = class338.field5231;
            class306.field4786 = 50;
        } else if (class306.field4786 == 50) {
            int var22 = class261.method1737(10, class143.field2275, class121.field1859);
            int var23 = class56.method367((byte) -100);
            if (var23 > var22) {
                class71.field1058 = class26.field340 + var22 * 100 / var23 + "%";
                class187.field2841 = 35;
            } else {
                class71.field1058 = class125.field1950;
                class187.field2841 = 35;
                class306.field4786 = 60;
            }
        } else {
            if (arg0 != 90) {
                field2034 = (int[][][]) ((int[][][]) null);
            }
            if (class306.field4786 == 60) {
                int var3 = class299.method1972(class121.field1859, 67);
                int var4 = class70.method501(true);
                if (var3 < var4) {
                    class71.field1058 = class26.field338 + var3 * 100 / var4 + "%";
                    class187.field2841 = 40;
                } else {
                    class306.field4786 = 65;
                    class71.field1058 = class285.field4373;
                    class187.field2841 = 40;
                }
            } else if (class306.field4786 == 65) {
                class52.method352(class121.field1859, (byte) -66, class143.field2275);
                class187.field2841 = 45;
                class71.field1058 = class3.field29;
                class231.method1583(5, (byte) 115);
                class306.field4786 = 70;
            } else if (class306.field4786 == 70) {
                class121.field1861.method2078((byte) -69);
                byte var5 = 0;
                int var6 = var5 + class121.field1861.method2106(100);
                class58.field818.method2078((byte) -69);
                int var7 = var6 + class58.field818.method2106(100);
                class234.field3761.method2078((byte) -69);
                int var8 = var7 + class234.field3761.method2106(100);
                class143.field2262.method2078((byte) -69);
                int var9 = var8 + class143.field2262.method2106(arg0 ^ 0x3E);
                class90.field1373.method2078((byte) -69);
                int var10 = var9 + class90.field1373.method2106(arg0 + 10);
                class222.field3532.method2078((byte) -69);
                int var11 = var10 + class222.field3532.method2106(arg0 ^ 0x3E);
                class172.field2609.method2078((byte) -69);
                int var12 = var11 + class172.field2609.method2106(100);
                class193.field2917.method2078((byte) -69);
                int var13 = var12 + class193.field2917.method2106(100);
                class112.field1718.method2078((byte) -69);
                int var14 = var13 + class112.field1718.method2106(100);
                class125.field1959.method2078((byte) -69);
                int var15 = var14 + class125.field1959.method2106(100);
                class88.field1332.method2078((byte) -69);
                int var16 = var15 + class88.field1332.method2106(100);
                if (var16 < 1100) {
                    class187.field2841 = 50;
                    class71.field1058 = class150.field2366 + var16 / 11 + "%";
                } else {
                    class148.method1045(arg0 + 38, class121.field1861);
                    class208.method1402(class121.field1861, -69);
                    class107.method721(class121.field1861, (byte) -62);
                    class236.method1614(class121.field1861, (byte) -124, class54.field762);
                    class215.method1434(class58.field818, -88, class54.field762, true);
                    class266.method1764(class54.field762, class143.field2262, (byte) 105);
                    class221.method1473(true, class159.field2478, -6093, class54.field762, class90.field1373);
                    class184.method1267(class121.field1861, 2);
                    class324.method2192(true, class231.field3728, class222.field3532, class199.field2990);
                    class108.method728(17642, class121.field1861);
                    class120.method816((byte) -46, class54.field762, class172.field2609);
                    class289.method1884(class193.field2917, -80);
                    class303.method2000(class121.field1861, arg0 + 25);
                    class72.method519(class121.field1859, arg0 + 1958, class54.field762, class36.field455, class143.field2275);
                    class75.method528((byte) -18, class121.field1861);
                    class227.method1551((byte) 76, class234.field3761);
                    class221.method1471(new class39(), class125.field1959, 1274, class112.field1718);
                    class146.method1019((byte) -2, class125.field1959, class112.field1718);
                    class126.method844((byte) 112, class121.field1861);
                    class56.method366(arg0 - 8572, class121.field1861);
                    class84.method579(class121.field1861, 0);
                    class266.method1761(class121.field1861, (byte) -84, class121.field1859);
                    class302.method1989(-32449, class121.field1859, class121.field1861);
                    class187.field2841 = 50;
                    class71.field1058 = class84.field1280;
                    class190.method1306(0);
                    class306.field4786 = 80;
                }
            } else if (class306.field4786 == 80) {
                int var20 = class4.method24(0, class121.field1859);
                int var21 = class86.method590(4);
                if (var20 < var21) {
                    class187.field2841 = 60;
                    class71.field1058 = class29.field363 + var20 * 100 / var21 + "%";
                } else {
                    class187.method1283(class121.field1859, arg0 - 90);
                    class187.field2841 = 60;
                    class306.field4786 = 90;
                    class71.field1058 = class255.field3991;
                }
            } else if (class306.field4786 == 90) {
                if (class183.field2794.method2078((byte) -69)) {
                    class97 var17 = new class97(class90.field1381, class183.field2794, class121.field1859, 20, !class275.field4239);
                    class12.method108(var17);
                    if (class88.field1322 == 1) {
                        class12.method89(0.9F);
                    }
                    if (class88.field1322 == 2) {
                        class12.method89(0.8F);
                    }
                    if (class88.field1322 == 3) {
                        class12.method89(0.7F);
                    }
                    if (class88.field1322 == 4) {
                        class12.method89(0.6F);
                    }
                    class306.field4786 = 100;
                    class187.field2841 = 70;
                    class71.field1058 = class130.field2027;
                } else {
                    class71.field1058 = class24.field303 + class183.field2794.method2106(100) + "%";
                    class187.field2841 = 70;
                }
            } else if (class306.field4786 == 100) {
                if (class276.method1816((byte) -82, class121.field1859)) {
                    class306.field4786 = 110;
                }
            } else if (class306.field4786 == 110) {
                class294.field4531 = new class95();
                class89.field1359.method1515(10, (byte) -5, class294.field4531);
                class187.field2841 = 75;
                class306.field4786 = 120;
                class71.field1058 = class40.field573;
            } else if (class306.field4786 == 120) {
                if (class81.field1201.method2087("", "huffman", -76)) {
                    class334 var18 = new class334(class81.field1201.method2097("huffman", "", (byte) 29));
                    class293.method1914(arg0 - 14095, var18);
                    class187.field2841 = 80;
                    class306.field4786 = 130;
                    class71.field1058 = class205.field3093;
                } else {
                    class71.field1058 = class82.field1244 + "0%";
                    class187.field2841 = 80;
                }
            } else if (class306.field4786 == 130) {
                if (!class36.field455.method2078((byte) -69)) {
                    class71.field1058 = class329.field5088 + class36.field455.method2106(100) * 3 / 4 + "%";
                    class187.field2841 = 85;
                } else if (!class236.field3795.method2078((byte) -69)) {
                    class71.field1058 = class329.field5088 + (class236.field3795.method2106(100) / 10 + 75) + "%";
                    class187.field2841 = 85;
                } else if (!class143.field2275.method2078((byte) -69)) {
                    class71.field1058 = class329.field5088 + (class143.field2275.method2106(100) / 20 + 85) + "%";
                    class187.field2841 = 85;
                } else if (class2.field13.method2108("details", 0)) {
                    class37.method265(class81.field1197, false, class2.field13);
                    class67.method481(class54.field762);
                    class187.field2841 = 95;
                    class71.field1058 = class169.field2580;
                    class306.field4786 = 135;
                } else {
                    class71.field1058 = class329.field5088 + (class2.field13.method2085(-1, "details") / 10 + 90) + "%";
                    class187.field2841 = 85;
                }
            } else if (class306.field4786 == 135) {
                int var19 = class80.method553(arg0 - 215);
                if (var19 == -1) {
                    class71.field1058 = class262.field4055;
                    class187.field2841 = 95;
                } else if (var19 == 7 || var19 == 9) {
                    this.method865(true, "worldlistfull");
                    class231.method1583(1000, (byte) 112);
                } else if (class164.field2526) {
                    class71.field1058 = class51.field731;
                    class306.field4786 = 140;
                    class187.field2841 = 96;
                } else {
                    this.method865(true, "worldlistio_" + var19);
                    class231.method1583(1000, (byte) 112);
                }
            } else if (class306.field4786 == 140) {
                class299.field4642 = class36.field455.method2107("loginscreen", (byte) 125);
                class297.field4554.method2088(false, 675, true);
                class211.field3353.method2088(true, 675, true);
                class121.field1859.method2088(true, arg0 + 585, true);
                class143.field2275.method2088(true, 675, true);
                class81.field1201.method2088(true, 675, true);
                class36.field455.method2088(true, 675, true);
                class71.field1058 = class266.field4102;
                class306.field4786 = 150;
                class187.field2841 = 97;
                class164.field2522 = true;
            } else if (class306.field4786 == 150) {
                class49.method339();
                if (class315.field4962) {
                    class160.field2490 = 0;
                    class175.field2682 = 0;
                    class338.field5235 = 0;
                    class10.field95 = 0;
                }
                class315.field4962 = true;
                class268.method1777(-27637, class89.field1359);
                class120.method818(2, class175.field2682, false, -1, -1);
                class306.field4786 = 160;
                class71.field1058 = class332.field5141;
                class187.field2841 = 100;
            } else if (class306.field4786 == 160) {
                class345.method2395(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 2939)
    private final void method896(int arg0, int arg1) {
        class124.field1938.field3896++;
        int var3 = 66 % ((arg0 + 5) / 38);
        class90.field1378 = null;
        class303.field4700 = null;
        class124.field1938.field3894 = arg1;
        class146.field2302 = 0;
        field2038++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V", line = 2962)
    private final void method897(int arg0, byte[] arg1) {
        class303 var3 = new class303(arg1);
        field2044++;
        if (arg0 != 28930) {
            method884(true);
        }
        while (true) {
            int var4 = var3.method2043((byte) -109);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                int[] var5 = class152.field2407 = new int[6];
                var5[0] = var3.method1994(false);
                var5[1] = var3.method1994(false);
                var5[2] = var3.method1994(false);
                var5[3] = var3.method1994(false);
                var5[4] = var3.method1994(false);
                var5[5] = var3.method1994(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 3002)
    public final void method876(byte arg0) {
        field2037++;
        if (class333.field5166) {
            class333.method2289();
        }
        if (class63.field919 != null) {
            class95.method655(true, class89.field1359, class63.field919);
            class63.field919 = null;
        }
        if (class89.field1359 != null) {
            class89.field1359.method1512(this.getClass(), 118);
        }
        if (class294.field4531 != null) {
            class294.field4531.field1461 = false;
        }
        class294.field4531 = null;
        if (class308.field4851 != null) {
            class308.field4851.method596(false);
            class308.field4851 = null;
        }
        class97.method673((byte) -64, class302.field4665);
        class199.method1340(0, class302.field4665);
        if (class283.field4349 != null) {
            class283.field4349.method1071(class302.field4665, (byte) -120);
        }
        class126.method846(arg0 - 92);
        class170.method1147(-1096940916);
        class283.field4349 = null;
        if (class228.field3654 != null) {
            class228.field3654.method1202(98);
        }
        if (class196.field2944 != null) {
            class196.field2944.method1202(-115);
        }
        if (arg0 != 100) {
            this.method868((byte) -113);
        }
        class124.field1938.method1679((byte) -128);
        class85.field1291.method1430(arg0 - 2);
    }
}
