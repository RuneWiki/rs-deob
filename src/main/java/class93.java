import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class30 {

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public int field2076 = -1;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    public int field2082 = 5;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public int field2080 = -1;

    @OriginalMember(owner = "client!nc", name = "ob", descriptor = "I")
    public int field2095 = -1;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
    public int field2089 = 99;

    @OriginalMember(owner = "client!nc", name = "pb", descriptor = "Z")
    public boolean field2096 = false;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    public int field2083 = -1;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
    public int field2084 = 2;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
    public int field2088 = -1;

    @OriginalMember(owner = "client!nc", name = "qb", descriptor = "Lje;")
    public static class67 field2097 = class85.method592(255, "Hierhin gehen");

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "Lje;")
    public static class67 field2081 = class85.method592(255, "blaugr-Un:");

    @OriginalMember(owner = "client!nc", name = "tb", descriptor = "I")
    public static int field2100 = 10;

    @OriginalMember(owner = "client!nc", name = "rb", descriptor = "Lje;")
    public static class67 field2098 = class85.method592(255, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "Lna;")
    public static class91 field2090 = new class91(8);

    @OriginalMember(owner = "client!nc", name = "wb", descriptor = "Lje;")
    private static class67 field2103 = class85.method592(255, "Please wait)3)3)3");

    @OriginalMember(owner = "client!nc", name = "vb", descriptor = "Lje;")
    public static class67 field2102 = class85.method592(255, "blinken3:");

    @OriginalMember(owner = "client!nc", name = "yb", descriptor = "Lje;")
    public static class67 field2105 = field2103;

    @OriginalMember(owner = "client!nc", name = "xb", descriptor = "Lga;")
    public static class44 field2104 = new class44(5000);

    @OriginalMember(owner = "client!nc", name = "Bb", descriptor = "Lje;")
    public static class67 field2108 = class85.method592(255, "me");

    @OriginalMember(owner = "client!nc", name = "zb", descriptor = "B")
    public static byte field2106;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!nc", name = "mb", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!nc", name = "nb", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!nc", name = "sb", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!nc", name = "ub", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!nc", name = "Ab", descriptor = "Lua;")
    public static class140 field2107;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "[I")
    public int[] field2072;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "[I")
    private int[] field2073;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "[I")
    public int[] field2075;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "[I")
    public int[] field2085;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "[I")
    private int[] field2087;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILna;B)V")
    private final void method680(int arg0, class91 arg1, byte arg2) {
        if (arg0 == 1) {
            int var4 = arg1.method641(255);
            this.field2072 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2072[var5] = arg1.method641(255);
            }
            this.field2075 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2075[var6] = arg1.method641(255);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2075[var7] += arg1.method641(255) << 16;
            }
        } else if (arg0 == 2) {
            this.field2088 = arg1.method641(255);
        } else if (arg0 == 3) {
            int var13 = arg1.method649(false);
            this.field2087 = new int[var13 + 1];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2087[var14] = arg1.method649(false);
            }
            this.field2087[var13] = 9999999;
        } else if (arg0 == 4) {
            this.field2096 = true;
        } else if (arg0 == 5) {
            this.field2082 = arg1.method649(false);
        } else if (arg0 == 6) {
            this.field2080 = arg1.method641(255);
        } else if (arg0 == 7) {
            this.field2076 = arg1.method641(255);
        } else if (arg0 == 8) {
            this.field2089 = arg1.method649(false);
        } else if (arg0 == 9) {
            this.field2095 = arg1.method649(false);
        } else if (arg0 == 10) {
            this.field2083 = arg1.method649(false);
        } else if (arg0 == 11) {
            this.field2084 = arg1.method649(false);
        } else if (arg0 == 12) {
            int var10 = arg1.method649(false);
            this.field2073 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2073[var11] = arg1.method641(255);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2073[var12] = (arg1.method641(255) << 16) + this.field2073[var12];
            }
        } else if (arg0 == 13) {
            int var8 = arg1.method649(false);
            this.field2085 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2085[var9] = arg1.method637(91);
            }
        }
        field2101++;
        if (arg2 != -32) {
            this.method690(-86, -128, null, 113, null);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBI)V")
    public static final void method681(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -80) {
            field2100 = -10;
        }
        for (class75 var5 = (class75) class60.field1209.method26((byte) -114); var5 != null; var5 = (class75) class60.field1209.method18((byte) -128)) {
            if (var5.field1621 != -1 || var5.field1611 != null) {
                int var6 = 0;
                if (arg0 > var5.field1606) {
                    var6 += arg0 - var5.field1606;
                } else if (arg0 < var5.field1612) {
                    var6 += var5.field1612 - arg0;
                }
                if (arg1 > var5.field1598) {
                    var6 += arg1 - var5.field1598;
                } else if (arg1 < var5.field1601) {
                    var6 += var5.field1601 - arg1;
                }
                if (var6 - 64 > var5.field1624 || class129.field2842 == 0 || var5.field1602 != arg4) {
                    if (var5.field1619 != null) {
                        class95.field2132.method553(var5.field1619);
                        var5.field1619 = null;
                    }
                    if (var5.field1603 != null) {
                        class95.field2132.method553(var5.field1603);
                        var5.field1603 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1624 - var6) * class129.field2842 / var5.field1624;
                    if (var5.field1619 != null) {
                        var5.field1619.method691(var7);
                    } else if (var5.field1621 >= 0) {
                        class124 var8 = class124.method967(class39.field709, var5.field1621, 0);
                        if (var8 != null) {
                            class125 var9 = var8.method968().method969(client.field383);
                            class94 var10 = class94.method717(var9, 100, var7);
                            var10.method730(-1);
                            class95.field2132.method554(var10);
                            var5.field1619 = var10;
                        }
                    }
                    if (var5.field1603 != null) {
                        var5.field1603.method691(var7);
                        if (!var5.field1603.method113(-766)) {
                            var5.field1603 = null;
                        }
                    } else if (var5.field1611 != null && (var5.field1618 -= arg2) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field1611.length);
                        class124 var12 = class124.method967(class39.field709, var5.field1611[var11], 0);
                        if (var12 != null) {
                            class125 var13 = var12.method968().method969(client.field383);
                            class94 var14 = class94.method717(var13, 100, var7);
                            var14.method730(0);
                            class95.field2132.method554(var14);
                            var5.field1603 = var14;
                            var5.field1618 = (int) (Math.random() * (double) (var5.field1622 - var5.field1609)) + var5.field1609;
                        }
                    }
                }
            }
        }
        field2078++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILoe;Loe;)V")
    public static final void method682(int arg0, class102 arg1, class102 arg2) {
        field2079++;
        if (class67.field1315 == null) {
            class67.field1315 = class18.method124((byte) 122, class29.field519, class106.field2422, class14.field255);
        }
        if (class16.field284 == null) {
            class16.field284 = class56.method394(class106.field2422, class14.field255, class86.field1912, -16958);
        }
        if (class23.field426 == null) {
            class23.field426 = class56.method394(class106.field2422, class14.field255, class135.field3047, -16958);
        }
        if (class107.field2458 == null) {
            class107.field2458 = class56.method394(class106.field2422, class14.field255, class145.field3341, -16958);
        }
        class8.method70(0, 23, 765, 480, 0);
        class8.method69(0, 0, 125, 23, 12425273, 9135624);
        class8.method69(125, 0, 640, 23, 5197647, 2697513);
        arg1.method791(class144.field3312, 62, 15, 0, -1);
        if (class107.field2458 != null) {
            class107.field2458[1].method531(140, 1);
            arg2.method793(class132.field2913, 152, 10, 16777215, -1);
            class107.field2458[0].method531(140, 12);
            arg2.method793(class71.field1437, 152, 21, 16777215, -1);
        }
        if (class23.field426 != null) {
            short var3 = 280;
            if (class130.field2861[0] == 0 && class142.field3244[0] == 0) {
                class23.field426[2].method531(var3, 4);
            } else {
                class23.field426[0].method531(var3, 4);
            }
            short var4 = 390;
            if (class130.field2861[0] == 0 && class142.field3244[0] == 1) {
                class23.field426[3].method531(var3 + 15, 4);
            } else {
                class23.field426[1].method531(var3 + 15, 4);
            }
            arg1.method793(class35.field646, var3 + 32, 17, 16777215, -1);
            if (class130.field2861[0] == 1 && class142.field3244[0] == 0) {
                class23.field426[2].method531(var4, 4);
            } else {
                class23.field426[0].method531(var4, 4);
            }
            short var5 = 500;
            short var6 = 610;
            if (class130.field2861[0] == 1 && class142.field3244[0] == 1) {
                class23.field426[3].method531(var4 + 15, 4);
            } else {
                class23.field426[1].method531(var4 + 15, 4);
            }
            arg1.method793(class35.field650, var4 + 32, 17, 16777215, -1);
            if (class130.field2861[0] == 2 && class142.field3244[0] == 0) {
                class23.field426[2].method531(var5, 4);
            } else {
                class23.field426[0].method531(var5, 4);
            }
            if (class130.field2861[0] == 2 && class142.field3244[0] == 1) {
                class23.field426[3].method531(var5 + 15, 4);
            } else {
                class23.field426[1].method531(var5 + 15, 4);
            }
            arg1.method793(class88.field1951, var5 + 32, 17, 16777215, -1);
            if (class130.field2861[0] == 3 && class142.field3244[0] == 0) {
                class23.field426[2].method531(var6, 4);
            } else {
                class23.field426[0].method531(var6, 4);
            }
            if (class130.field2861[0] == 3 && class142.field3244[0] == 1) {
                class23.field426[3].method531(var6 + 15, 4);
            } else {
                class23.field426[1].method531(var6 + 15, 4);
            }
            arg1.method793(class84.field1862, var6 + 32, 17, 16777215, -1);
        }
        class8.method70(708, 4, 50, 16, 0);
        arg2.method791(class75.field1626, 733, 16, 16777215, -1);
        class149.field3403 = -1;
        if (class67.field1315 != null) {
            byte var7 = 88;
            byte var8 = 19;
            int var9 = 480 / (var8 + 1);
            int var10 = 765 / (var7 + 1);
            int var11;
            int var12;
            do {
                var11 = var9;
                var12 = var10;
                if ((var10 - 1) * var9 >= class35.field656) {
                    var10--;
                }
                if (class35.field656 <= (var9 - 1) * var10) {
                    var9--;
                }
                if (class35.field656 <= (var9 - 1) * var10) {
                    var9--;
                }
            } while (var9 != var11 || var10 != var12);
            int var13 = (480 - var8 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var7 * var10) / (var10 + 1);
            int var15 = (480 - var8 * var9 - (var9 + -1) * var13) / 2;
            int var16 = 0;
            if (var14 > 5) {
                var14 = 5;
            }
            int var17 = var15 + 23;
            int var18 = (765 - (var10 - 1) * var14 - var7 * var10) / 2;
            int var19 = var18;
            for (int var20 = 0; var20 < class35.field656; var20++) {
                class127 var21 = class99.field2209[var20];
                boolean var22 = true;
                class67 var23 = class60.method420(var21.field2782, 28498);
                if (var21.field2782 == -1) {
                    var22 = false;
                    var23 = class154.field3518;
                } else if (var21.field2782 > 1980) {
                    var23 = class14.field242;
                    var22 = false;
                }
                if (var19 <= class135.field3070 && class104.field2361 >= var17 && class135.field3070 < var7 + var19 && class104.field2361 < var8 + var17 && var22) {
                    class149.field3403 = var20;
                    class67.field1315[var21.field2778 ? 1 : 0].method915(var19, var17, 128, 16777215);
                } else {
                    class67.field1315[var21.field2778 ? 1 : 0].method906(var19, var17);
                }
                if (class16.field284 != null) {
                    class16.field284[(var21.field2778 ? 8 : 0) + var21.field2779].method531(var19 + 29, var17);
                }
                arg1.method791(class60.method420(var21.field2784, 28498), var19 + 15, var8 / 2 + var17 + 5, 0, -1);
                arg2.method791(var23, var19 + 60, var17 - (-(var8 / 2) - 5), 268435455, -1);
                var17 += var13 + var8;
                var16++;
                if (var16 >= var9) {
                    var17 = var15 + 23;
                    var19 += var7 + var14;
                    var16 = 0;
                }
            }
        }
        try {
            if (arg0 <= 12) {
                field2097 = null;
            }
            Graphics var24 = class98.field2193.getGraphics();
            class81.field1792.method102(true, 0, var24, 0);
        } catch (Exception var25) {
            class98.field2193.repaint();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZILad;)Lad;")
    public final class5 method683(boolean arg0, int arg1, class5 arg2) {
        field2099++;
        int var4 = this.field2075[arg1];
        class86 var5 = class75.method538(var4 >> 16, 21600);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method43(true);
        }
        if (!arg0) {
            this.method690(-62, 15, null, 7, null);
        }
        class5 var7 = arg2.method43(!var5.method600(var6, (byte) -95));
        var7.method30(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lna;Z)V")
    public final void method684(class91 arg0, boolean arg1) {
        field2092++;
        while (true) {
            int var3 = arg0.method649(false);
            if (var3 == 0) {
                if (arg1) {
                    method681(104, 33, 19, (byte) 17, 35);
                    return;
                } else {
                    return;
                }
            }
            this.method680(var3, arg0, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V")
    public static void method685(byte arg0) {
        field2104 = null;
        int var1 = -90 % ((40 - arg0) / 37);
        field2105 = null;
        field2103 = null;
        field2107 = null;
        field2108 = null;
        field2097 = null;
        field2081 = null;
        field2098 = null;
        field2090 = null;
        field2102 = null;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public final void method686(int arg0) {
        if (this.field2095 == -1) {
            if (this.field2087 == null) {
                this.field2095 = 0;
            } else {
                this.field2095 = 2;
            }
        }
        if (this.field2083 == -1) {
            if (this.field2087 == null) {
                this.field2083 = 0;
            } else {
                this.field2083 = 2;
            }
        }
        if (arg0 != 2) {
            method681(9, -24, 37, (byte) 91, -33);
        }
        field2086++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLad;)Lad;")
    public final class5 method687(int arg0, byte arg1, class5 arg2) {
        int var4 = this.field2075[arg0];
        field2074++;
        if (arg1 < 54) {
            field2102 = null;
        }
        class86 var5 = class75.method538(var4 >> 16, 21600);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method41(true);
        }
        class86 var7 = null;
        int var8 = 0;
        if (this.field2073 != null && arg0 < this.field2073.length) {
            int var9 = this.field2073[arg0];
            var7 = class75.method538(var9 >> 16, 21600);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class5 var11 = arg2.method41(!var5.method600(var6, (byte) -95));
            var11.method30(var5, var6);
            return var11;
        } else {
            class5 var10 = arg2.method41(!var5.method600(var6, (byte) -95) & !var7.method600(var8, (byte) -95));
            var10.method30(var5, var6);
            var10.method30(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBILad;)Lad;")
    public final class5 method688(int arg0, byte arg1, int arg2, class5 arg3) {
        int var5 = this.field2075[arg0];
        class86 var6 = class75.method538(var5 >> 16, 21600);
        field2091++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method41(true);
        }
        int var8 = arg2 & 0x3;
        class5 var9 = arg3.method41(!var6.method600(var7, (byte) -95));
        if (var8 == 1) {
            var9.method49();
        } else if (var8 == 2) {
            var9.method44();
        } else if (var8 == 3) {
            var9.method36();
        }
        if (arg1 != 20) {
            return null;
        }
        var9.method30(var6, var7);
        if (var8 == 1) {
            var9.method36();
        } else if (var8 == 2) {
            var9.method44();
        } else if (var8 == 3) {
            var9.method49();
        }
        return var9;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lad;ZI)Lad;")
    public final class5 method689(class5 arg0, boolean arg1, int arg2) {
        int var4 = this.field2075[arg2];
        if (arg1) {
            this.field2089 = -76;
        }
        field2093++;
        class86 var5 = class75.method538(var4 >> 16, 21600);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method41(true);
        } else {
            class5 var7 = arg0.method41(!var5.method600(var6, (byte) -95));
            var7.method30(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILnc;ILad;)Lad;")
    public final class5 method690(int arg0, int arg1, class93 arg2, int arg3, class5 arg4) {
        int var6 = this.field2075[arg3];
        field2077++;
        class86 var7 = class75.method538(var6 >> 16, 21600);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method689(arg4, false, arg0);
        }
        int var9 = arg2.field2075[arg0];
        class86 var10 = class75.method538(var9 >> 16, 21600);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class5 var12 = arg4.method41(!var7.method600(var8, (byte) -95));
            var12.method30(var7, var8);
            return var12;
        } else if (arg1 >= -9) {
            return null;
        } else {
            class5 var13 = arg4.method41(!var7.method600(var8, (byte) -95) & !var10.method600(var11, (byte) -95));
            var13.method31(var7, var8, var10, var11, this.field2087);
            return var13;
        }
    }
}
