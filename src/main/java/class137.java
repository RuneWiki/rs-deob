import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class137 extends class99 {

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Z")
    public static boolean field2026 = true;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "[I")
    public static int[] field2035 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lma;")
    public static class5 field2028 = class12.method119("Ausw-=hlen", (byte) 60);

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2038 = 0;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "[Lma;")
    public static class5[] field2040 = new class5[1000];

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Lme;")
    public static class71 field2027;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "[[I")
    public static int[][] field2032;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V", line = 4)
    private static final void method889(byte arg0) {
        field2030++;
        int var1 = class103.field1541.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class103.field1541[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class231.field3843; var4++) {
                    if (class294.field4958[var2] == class228.field3789[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class228.field3789[class231.field3843] = class294.field4958[var2];
                    var3 = class231.field3843++;
                }
                int var5 = 0;
                class221 var6 = new class221(class103.field1541[var2]);
                while (class103.field1541[var2].length > var6.field3610 && var5 < 511) {
                    int var7 = var6.method1524((byte) 76);
                    int var8 = var7 >> 14;
                    int var9 = var5++ << 6 | var3;
                    int var10 = (var7 & 0x1FE5) >> 7;
                    int var11 = (class294.field4958[var2] >> 8) * 64 - (class193.field3017 - var10);
                    int var12 = var7 & 0x3F;
                    int var13 = (class294.field4958[var2] & 0xFF) * 64 + var12 - class74.field1158;
                    class288 var14 = class186.method1230(29, var6.method1524((byte) 72));
                    if (class119.field1804[var9] == null && (var14.field4861 & 0x1) > 0 && class276.field4709 == var8 && var11 >= 0 && var11 + var14.field4905 < 104 && var13 >= 0 && var14.field4905 + var13 < 104) {
                        class119.field1804[var9] = new class177();
                        class177 var15 = class119.field1804[var9];
                        class73.field1153[class129.field1940++] = var9;
                        var15.field2699 = var14;
                        var15.field226 = var15.field2699.field4905;
                        var15.field217 = class50.field784;
                        var15.field210 = var15.field2699.field4856;
                        var15.field202 = var15.field2699.field4903;
                        var15.field233 = var15.field2699.field4902;
                        var15.field206 = var15.field2699.field4857;
                        var15.field229 = var15.field2699.field4888;
                        var15.field218 = var15.field2699.field4852;
                        var15.field230 = var15.field2699.field4875;
                        var15.field201 = var15.field2699.field4853;
                        if (var15.field218 == 0) {
                            var15.field174 = 0;
                        }
                        var15.method121(var11, true, -22763, var13);
                    }
                }
            }
        }
        if (arg0 < 30) {
            method890(106, (class5) null, 89, (class5) null, 73, (short) -60, -14L);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILma;ILma;ISJ)V", line = 108)
    public static final void method890(int arg0, class5 arg1, int arg2, class5 arg3, int arg4, short arg5, long arg6) {
        field2025++;
        if (arg2 != 29639 || class251.field4162 || class282.field4794 >= 500) {
            return;
        }
        class118.field1786[class282.field4794] = arg3;
        class20.field344[class282.field4794] = arg1;
        class104.field1554[class282.field4794] = arg5;
        class213.field3392[class282.field4794] = arg6;
        class294.field4963[class282.field4794] = arg4;
        class240.field3989[class282.field4794] = arg0;
        class282.field4794++;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V", line = 137)
    public static final void method891(byte arg0) {
        field2039++;
        class40.method287(0, false);
        class288.field4867 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class111.field1657.length; var2++) {
            if (class189.field2964[var2] != -1 && class111.field1657[var2] == null) {
                class111.field1657[var2] = class86.field1302.method1342(121, class189.field2964[var2], 0);
                if (class111.field1657[var2] == null) {
                    class288.field4867++;
                    var1 = false;
                }
            }
            if (class48.field755[var2] != -1 && class288.field4877[var2] == null) {
                class288.field4877[var2] = class86.field1302.method1330(class48.field755[var2], 0, 74, class72.field1134[var2]);
                if (class288.field4877[var2] == null) {
                    var1 = false;
                    class288.field4867++;
                }
            }
            if (class41.field628[var2] != -1 && class105.field1562[var2] == null) {
                class105.field1562[var2] = class86.field1302.method1342(106, class41.field628[var2], 0);
                if (class105.field1562[var2] == null) {
                    var1 = false;
                    class288.field4867++;
                }
            }
            if (class282.field4790[var2] != -1 && class161.field2465[var2] == null) {
                class161.field2465[var2] = class86.field1302.method1342(-83, class282.field4790[var2], 0);
                if (class161.field2465[var2] == null) {
                    class288.field4867++;
                    var1 = false;
                }
            }
            if (class146.field2117 != null && class103.field1541[var2] == null && class146.field2117[var2] != -1) {
                class103.field1541[var2] = class86.field1302.method1330(class146.field2117[var2], 0, -120, class72.field1134[var2]);
                if (class103.field1541[var2] == null) {
                    var1 = false;
                    class288.field4867++;
                }
            }
        }
        if (class213.field3387 == null || !class93.field1420.method1334(class288.method1940((byte) 58, new class5[] { class213.field3387.field1486, class219.field3552 }), (byte) -34)) {
            class118.field1792 = null;
        } else if (class93.field1420.method1333(class288.method1940((byte) 113, new class5[] { class213.field3387.field1486, class219.field3552 }), true)) {
            class118.field1792 = class16.method139(class93.field1420, -32734, class288.method1940((byte) 96, new class5[] { class213.field3387.field1486, class219.field3552 }));
        } else {
            class288.field4867++;
            var1 = false;
        }
        if (!var1) {
            class180.field2726 = 1;
            return;
        }
        class147.field2138 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class111.field1657.length; var4++) {
            byte[] var5 = class288.field4877[var4];
            if (var5 != null) {
                int var6 = (class294.field4958[var4] & 0xFF) * 64 - class74.field1158;
                int var7 = (class294.field4958[var4] >> 8) * 64 - class193.field3017;
                if (class204.field3265) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class225.method1595(var6, (byte) -8, var7, var5);
            }
            byte[] var8 = class161.field2465[var4];
            if (var8 != null) {
                int var9 = (class294.field4958[var4] >> 8) * 64 - class193.field3017;
                int var10 = (class294.field4958[var4] & 0xFF) * 64 - class74.field1158;
                if (class204.field3265) {
                    var9 = 10;
                    var10 = 10;
                }
                var3 &= class225.method1595(var10, (byte) 6, var9, var8);
            }
        }
        if (!var3) {
            class180.field2726 = 2;
            return;
        }
        if (class180.field2726 != 0) {
            class97.method620(class288.method1940((byte) 60, new class5[] { class112.field1666, class170.field2610 }), -66, true);
        }
        class177.method1155((byte) 96);
        class106.method672(-32768);
        boolean var11 = false;
        class217.method1465();
        for (int var12 = 0; var12 < class111.field1657.length; var12++) {
            if (class161.field2465[var12] != null || class105.field1562[var12] != null) {
                var11 = true;
                break;
            }
        }
        if (!class265.field4531) {
            var11 = false;
        }
        if (var11) {
            class88.method582(1);
        } else {
            class21.method175();
        }
        for (int var13 = 0; var13 < 4; var13++) {
            class242.field4031[var13].method375(-8823);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class18.field321[var14][var15][var16] = 0;
                }
            }
        }
        class286.method1931(false, (byte) -5);
        class134.field1989.method1161();
        int var17 = 5 / ((-arg0 - 32) / 33);
        for (int var18 = 0; var18 < 13; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                class134.field1987[var18][var19].field4347 = true;
            }
        }
        class53.method413();
        class192.method1261(13);
        class177.method1155((byte) 96);
        System.gc();
        class40.method287(0, true);
        class144.method914(105, false);
        if (!class204.field3265) {
            class15.method136((byte) 110, false);
            class40.method287(0, true);
            int var20 = class151.field2183.field175[0] >> 3;
            int var21 = class151.field2183.field186[0] >> 3;
            class67.method477(false, var20, var21);
            class165.method1104(false, -46);
            if (class103.field1541 != null) {
                method889((byte) 94);
            }
        }
        if (class204.field3265) {
            class237.method1675(false, -115);
            class40.method287(0, true);
            int var22 = class151.field2183.field175[0] >> 3;
            int var23 = class151.field2183.field186[0] >> 3;
            class67.method477(false, var22, var23);
            class81.method554(false, (byte) 94);
        }
        class106.method672(-32768);
        class40.method287(0, true);
        class97.method618((byte) -13, false, class242.field4031);
        class53.method406();
        class40.method287(0, true);
        int var24 = class24.field415;
        if (class276.field4701 < var24) {
            var24 = class276.field4701;
        }
        if ((class276.field4701 - 1) > var24) {
            int var25 = class276.field4701 - 1;
        }
        if (class152.method956((byte) -112)) {
            class268.method1842(0);
        } else {
            class268.method1842(class24.field415);
        }
        class252.method1759(35);
        if (var11) {
            class50.method379(true);
            class144.method914(105, true);
            if (!class204.field3265) {
                class15.method136((byte) 110, true);
                class40.method287(0, true);
                class165.method1104(true, -41);
            }
            if (class204.field3265) {
                class237.method1675(true, -84);
                class40.method287(0, true);
                class81.method554(true, (byte) 111);
            }
            class106.method672(-32768);
            class40.method287(0, true);
            class97.method618((byte) -13, true, class242.field4031);
            class40.method287(0, true);
            class252.method1759(78);
            class50.method379(false);
        }
        for (int var26 = 0; var26 < 13; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                class134.field1987[var26][var27].method1777(class208.field3304[0], var26 * 8, var27 * 8);
            }
        }
        for (int var28 = 0; var28 < 104; var28++) {
            for (int var29 = 0; var29 < 104; var29++) {
                class217.method1470((byte) -57, var29, var28);
            }
        }
        class181.method1182((byte) -93);
        class177.method1155((byte) 96);
        class301.method2048(false);
        class106.method672(-32768);
        if (class81.field1263 != null && class47.field725 != null && class5.field58 == 25) {
            class152.field2210++;
            class147.field2127.method1389((byte) -80, 28);
            class147.field2127.method1513(1057001181, false);
        }
        if (!class204.field3265) {
            int var30 = (class280.field4741 + 6) / 8;
            int var31 = (field2031 - 6) / 8;
            int var32 = (class280.field4741 - 6) / 8;
            int var33 = (field2031 + 6) / 8;
            for (int var34 = var32 - 1; var34 <= (var30 + 1); var34++) {
                for (int var35 = var31 - 1; var35 <= (var33 + 1); var35++) {
                    if (var32 > var34 || var30 < var34 || var31 > var35 || var35 > var33) {
                        class86.field1302.method1340(class288.method1940((byte) 60, new class5[] { class129.field1934, class175.method1148(var34, false), class271.field4643, class175.method1148(var35, false) }), false);
                        class86.field1302.method1340(class288.method1940((byte) 110, new class5[] { class235.field3890, class175.method1148(var34, false), class271.field4643, class175.method1148(var35, false) }), false);
                    }
                }
            }
        }
        if (class5.field58 == 28) {
            class112.method741(10, 5);
        } else {
            class112.method741(30, 5);
            if (class47.field725 != null) {
                class147.field2127.method1389((byte) -74, 179);
            }
        }
        class177.method1155((byte) 96);
        class105.method665(0);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 636)
    public static final void method892(boolean arg0) {
        field2033++;
        if (class208.field3303 == 0 || !arg0) {
            return;
        }
        try {
            if (++class257.field4394 > 2000) {
                if (class47.field725 != null) {
                    class47.field725.method1184(!arg0);
                    class47.field725 = null;
                }
                if (class241.field4019 >= 1) {
                    class142.field2084 = -5;
                    class208.field3303 = 0;
                    return;
                }
                if (class219.field3543 == class14.field266) {
                    class219.field3543 = class145.field2103;
                } else {
                    class219.field3543 = class14.field266;
                }
                class257.field4394 = 0;
                class241.field4019++;
                class208.field3303 = 1;
            }
            if (class208.field3303 == 1) {
                class50.field795 = class267.field4597.method978(class176.field2687, true, class219.field3543);
                class208.field3303 = 2;
            }
            if (class208.field3303 == 2) {
                if (class50.field795.field497 == 2) {
                    throw new IOException();
                }
                if (class50.field795.field497 != 1) {
                    return;
                }
                class47.field725 = new class181((Socket) class50.field795.field496, class267.field4597);
                class50.field795 = null;
                class47.field725.method1185(-22036, class147.field2127.field3610, class147.field2127.field3617, 0);
                if (class1.field11 != null) {
                    class1.field11.method1124(0);
                }
                if (class49.field766 != null) {
                    class49.field766.method1124(0);
                }
                int var1 = class47.field725.method1179(0);
                if (class1.field11 != null) {
                    class1.field11.method1124(0);
                }
                if (class49.field766 != null) {
                    class49.field766.method1124(0);
                }
                if (var1 != 21) {
                    class142.field2084 = var1;
                    class208.field3303 = 0;
                    class47.field725.method1184(false);
                    class47.field725 = null;
                    return;
                }
                class208.field3303 = 3;
            }
            if (class208.field3303 == 3) {
                if (class47.field725.method1180(false) < 1) {
                    return;
                }
                class73.field1152 = new class5[class47.field725.method1179(0)];
                class208.field3303 = 4;
            }
            if (class208.field3303 == 4) {
                if (class47.field725.method1180(!arg0) < (class73.field1152.length * 8)) {
                    return;
                }
                class200.field3184.field3610 = 0;
                class47.field725.method1183(class73.field1152.length * 8, 0, -14925, class200.field3184.field3617);
                for (int var2 = 0; var2 < class73.field1152.length; var2++) {
                    class73.field1152[var2] = class245.method1719(class200.field3184.method1510(20396), (byte) -45);
                }
                class142.field2084 = 21;
                class208.field3303 = 0;
                class47.field725.method1184(false);
                class47.field725 = null;
                return;
            }
        } catch (IOException var4) {
            if (class47.field725 != null) {
                class47.field725.method1184(!arg0);
                class47.field725 = null;
            }
            if (class241.field4019 < 1) {
                class241.field4019++;
                class208.field3303 = 1;
                if (class219.field3543 == class14.field266) {
                    class219.field3543 = class145.field2103;
                } else {
                    class219.field3543 = class14.field266;
                }
                class257.field4394 = 0;
            } else {
                class142.field2084 = -4;
                class208.field3303 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 794)
    public static void method893(int arg0) {
        field2027 = null;
        if (arg0 != 0) {
            field2028 = (class5) null;
        }
        field2028 = null;
        field2040 = null;
        field2035 = null;
        field2032 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 808)
    public static final void method894(int arg0) {
        class97.method627(-48);
        class80.method550(~arg0);
        field2041++;
        class152.method958(arg0 ^ arg0);
        class287.method1933((byte) 121);
        class221.method1556(true);
        class195.method1282(true);
        class221.method1530((byte) 60);
        class55.method421((byte) 59);
        class188.method1239(true);
        class256.method1786(256);
        class265.method1822(-128);
        class185.method1210(32);
        class105.method668(true);
        class217.method1466(117);
        class84.field1288.method522(59);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Lrb;", line = 840)
    public static final class139 method895(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class139 var4 = var3.field3156;
            var3.field3156 = null;
            return var4;
        }
    }
}
