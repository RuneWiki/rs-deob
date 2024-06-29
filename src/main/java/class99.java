import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class99 extends class47 {

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    private int field1301 = -1;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    private int field1293 = 0;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    private int field1297 = -32768;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    private int field1307 = 0;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "Z")
    public boolean field1311 = false;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Lqm;")
    private class247 field1310;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "F")
    public static float field1298;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Lid;")
    private class274 field1308;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "[[[I")
    public static int[][][] field1291;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Luc;", line = 6)
    private final class201 method594(int arg0) {
        if (arg0 < 103) {
            this.field1311 = false;
        }
        field1290++;
        class159 var2 = class120.method818((byte) 96, this.field1295);
        class201 var3;
        if (this.field1311) {
            var3 = var2.method1054(-1, -1, 3899, 0);
        } else {
            var3 = var2.method1054(this.field1301, this.field1307, 3899, this.field1293);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V", line = 29)
    public static final void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1287++;
        int var7 = arg3 - arg4;
        int var8 = arg2 + arg4;
        for (int var9 = arg2; var9 < var8; var9++) {
            class279.method1997(arg1, -824384948, arg5, arg0, class206.field2886[var9]);
        }
        if (arg6 != 793982496) {
            field1309 = 3;
        }
        int var10 = arg1 - arg4;
        for (int var11 = arg3; var11 > var7; var11--) {
            class279.method1997(arg1, -824384948, arg5, arg0, class206.field2886[var11]);
        }
        int var12 = arg5 + arg4;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class206.field2886[var13];
            class279.method1997(var12, -824384948, arg5, arg0, var14);
            class279.method1997(arg1, -824384948, var10, arg0, var14);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)I", line = 71)
    public static final int method596(int arg0, int arg1) {
        field1299++;
        int var2 = 0 % ((arg0 - 60) / 41);
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()I", line = 87)
    public final int method11() {
        field1296++;
        return this.field1297;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V", line = 96)
    public final void method597(int arg0, byte arg1) {
        field1294++;
        int var3 = 7 / ((32 - arg1) / 48);
        if (this.field1311) {
            return;
        }
        this.field1293 += arg0;
        while (this.field1310.field3746[this.field1307] < this.field1293) {
            this.field1293 -= this.field1310.field3746[this.field1307];
            this.field1307++;
            if (this.field1310.field3734.length <= this.field1307) {
                this.field1311 = true;
                break;
            }
        }
        if (!this.field1311) {
            class337.method2329(false, this.field1310, (byte) -97, this.field1292, this.field1300, this.field1307);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 127)
    public static final String method598(byte arg0, int arg1) {
        String var2 = Integer.toString(arg1);
        field1302++;
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class145.field2019 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class247.field3738 + " (" + var2 + ")</col>";
        } else {
            int var4 = -61 / ((arg0) / 63);
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IB)V", line = 166)
    public static final void method599(int arg0, byte arg1) {
        field1289++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class121.field1702[arg0];
        int var3 = class168.field2332[arg0];
        int var4 = class30.field371[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class223.field3149[arg0];
        long var6 = class223.field3149[arg0];
        if (var4 == 8) {
            class287.field4511 = class148.field2055;
            class311.field4821 = class224.field3184;
            class158.field2179 = 2;
            class113.field1609 = 0;
            class140.field1954.method573(arg1 ^ 0x11, 79);
            class161.field2224++;
            class140.field1954.method642(-121, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class140.field1954.method684(class118.field1668 + var2, false);
            class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
            class140.field1954.method663(class142.field1992 + var3, arg1 ^ 0xED);
        }
        if (var4 == 1003) {
            class158.field2179 = 2;
            class311.field4821 = class224.field3184;
            class113.field1609 = 0;
            class236.field3462++;
            class287.field4511 = class148.field2055;
            class140.field1954.method573(126, 96);
            class140.field1954.method663(var5, arg1 + 19);
        }
        if (var4 == 60) {
            class140.field1954.method573(123, 143);
            class104.field1338++;
            class140.field1954.method639((byte) -123, var2);
            class140.field1954.method663(var3, arg1 ^ 0xED);
            class140.field1954.method663(var5, 128);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, arg1 ^ 0xA7AF7D);
            class276.field4299 = var3;
        }
        if (var4 == 1) {
            class287.field4511 = class148.field2055;
            class113.field1609 = 0;
            class147.field2043++;
            class158.field2179 = 2;
            class311.field4821 = class224.field3184;
            class140.field1954.method573(arg1 ^ 0x18, 67);
            class140.field1954.method684(class142.field1992 + var3, false);
            class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
            class140.field1954.method642(51, class118.field1668 + var2);
            class140.field1954.method684(var5, false);
        }
        if (var4 == 50) {
            class140.field1954.method573(118, 221);
            class140.field1954.method663(class112.field1595, arg1 + 19);
            class311.field4801++;
            class140.field1954.method639((byte) 42, class225.field3194);
            class140.field1954.method663(var3, 128);
            class140.field1954.method680(var2, (byte) -124);
        }
        if (var4 == 29) {
            class113.field1609 = 0;
            class158.field2179 = 2;
            class311.field4821 = class224.field3184;
            class287.field4511 = class148.field2055;
            class140.field1954.method573(121, 137);
            class140.field1954.method663(Integer.MAX_VALUE & (int) (var6 >>> 32), 128);
            class140.field1954.method663(var2 + class118.field1668, 128);
            class137.field1921++;
            class140.field1954.method662(true, var3 + class142.field1992);
            class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
        }
        if (var4 == 30) {
            class184 var8 = class223.field3159[var5];
            if (var8 != null) {
                class311.field4821 = class224.field3184;
                class158.field2179 = 2;
                class26.field342++;
                class113.field1609 = 0;
                class287.field4511 = class148.field2055;
                class140.field1954.method573(arg1 + 18, 97);
                class140.field1954.method642(94, var5);
                class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
            }
        }
        if (var4 == 42) {
            class68.field892++;
            class158.field2179 = 2;
            class287.field4511 = class148.field2055;
            class113.field1609 = 0;
            class311.field4821 = class224.field3184;
            class140.field1954.method573(121, 238);
            class140.field1954.method642(118, class112.field1595);
            class140.field1954.method674(-111, class184.field2650[82] ? 1 : 0);
            class140.field1954.method641(arg1 + 1773202411, class225.field3194);
            class140.field1954.method663(var5, 128);
            class140.field1954.method663(class118.field1668 + var2, 128);
            class140.field1954.method642(-107, class142.field1992 + var3);
        }
        if (var4 == 4) {
            class184 var9 = class223.field3159[var5];
            if (var9 != null) {
                class96.field1247++;
                class287.field4511 = class148.field2055;
                class158.field2179 = 2;
                class311.field4821 = class224.field3184;
                class113.field1609 = 0;
                class140.field1954.method573(126, 121);
                class140.field1954.method642(-127, class277.field4319);
                class140.field1954.method674(-117, class184.field2650[82] ? 1 : 0);
                class140.field1954.method642(40, class260.field3940);
                class140.field1954.method684(var5, false);
                class140.field1954.method639((byte) -122, class137.field1915);
            }
        }
        if (var4 == 45) {
            class109 var10 = class328.field5009[var5];
            if (var10 != null) {
                class287.field4511 = class148.field2055;
                class158.field2179 = 2;
                class311.field4821 = class224.field3184;
                class30.field378++;
                class113.field1609 = 0;
                class140.field1954.method573(116, 116);
                class140.field1954.method642(79, var5);
                class140.field1954.method684(class112.field1595, false);
                class140.field1954.method641(1773202520, class225.field3194);
                class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
            }
        }
        if (var4 == 13) {
            class140.field1954.method573(arg1 ^ 0x17, 208);
            class282.field4424++;
            class140.field1954.method641(1773202520, var2);
            class263 var11 = class91.method530(var2, 10989328);
            if (var11.field4007 != null && var11.field4007[0][0] == 5) {
                int var12 = var11.field4007[0][1];
                class226.field3235[var12] = 1 - class226.field3235[var12];
                class319.method2227(var12, -2708);
            }
        }
        if (var4 == 5) {
            if (var5 == 0) {
                class198.method1367(class138.field1940, var3, var2);
            } else if (var5 == 1) {
                if (class154.field2151 > 0 && class184.field2650[82] && class184.field2650[81]) {
                    class198.method1373(class118.field1668 + var2, class142.field1992 + var3, true, class138.field1940);
                } else {
                    class318.method2220(var3, false, 1, var2);
                    class140.field1954.method648(class109.field1523, (byte) 38);
                    class140.field1954.method648(class337.field5211, (byte) 38);
                    class140.field1954.method662(true, (int) class280.field4344);
                    class140.field1954.method648(57, (byte) 38);
                    class140.field1954.method648(class227.field3248, (byte) 38);
                    class140.field1954.method648(class196.field2807, (byte) 38);
                    class140.field1954.method648(89, (byte) 38);
                    class140.field1954.method662(true, class118.field1664.field2392);
                    class140.field1954.method662(true, class118.field1664.field2357);
                    class140.field1954.method648(class127.field1744, (byte) 38);
                    class140.field1954.method648(63, (byte) 38);
                }
            }
        }
        if (var4 == 17) {
            class109 var13 = class328.field5009[var5];
            if (var13 != null) {
                class158.field2179 = 2;
                class113.field1609 = 0;
                class287.field4511 = class148.field2055;
                class158.field2183++;
                class311.field4821 = class224.field3184;
                class140.field1954.method573(123, 19);
                class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
                class140.field1954.method684(var5, false);
            }
        }
        if (var4 == 1006) {
            class113.field1609 = 0;
            class79.field1005++;
            class311.field4821 = class224.field3184;
            class158.field2179 = 2;
            class287.field4511 = class148.field2055;
            class140.field1954.method573(117, 49);
            class140.field1954.method684(var5, false);
        }
        if (var4 == 16) {
            class184 var14 = class223.field3159[var5];
            if (var14 != null) {
                class287.field4511 = class148.field2055;
                class311.field4821 = class224.field3184;
                class158.field2179 = 2;
                class125.field1732++;
                class113.field1609 = 0;
                class140.field1954.method573(115, 166);
                class140.field1954.method663(var5, 128);
                class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
            }
        }
        if (var4 == 1004) {
            class263 var15 = class91.method530(var2, 10989328);
            if (var15 == null || var15.field4047[var3] < 100000) {
                class140.field1954.method573(118, 49);
                class79.field1005++;
                class140.field1954.method684(var5, false);
            } else {
                class150.method1010(var15.field4047[var3] + " x " + class60.method353(var5, (byte) -50).field1167, 0, (byte) -59, "");
            }
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, 10989328);
            class276.field4299 = var3;
        }
        if (var4 == 23) {
            class109 var16 = class328.field5009[var5];
            if (var16 != null) {
                class287.field4511 = class148.field2055;
                class311.field4821 = class224.field3184;
                class264.field4166++;
                class158.field2179 = 2;
                class113.field1609 = 0;
                class140.field1954.method573(115, 158);
                class140.field1954.method671(class184.field2650[82] ? 1 : 0, arg1 + 146);
                class140.field1954.method663(var5, 128);
            }
        }
        if (var4 == 1005) {
            class158.field2179 = 2;
            class113.field1609 = 0;
            class287.field4511 = class148.field2055;
            class311.field4821 = class224.field3184;
            class184 var17 = class223.field3159[var5];
            if (var17 != null) {
                class282 var18 = var17.field2657;
                if (var18.field4401 != null) {
                    var18 = var18.method2021((byte) 22);
                }
                if (var18 != null) {
                    class140.field1954.method573(120, 72);
                    class140.field1954.method662(true, var18.field4432);
                    class55.field672++;
                }
            }
        }
        if (var4 == 25) {
            class257.field3899++;
            class158.field2179 = 2;
            class311.field4821 = class224.field3184;
            class287.field4511 = class148.field2055;
            class113.field1609 = 0;
            class140.field1954.method573(126, 61);
            class140.field1954.method674(-117, class184.field2650[82] ? 1 : 0);
            class140.field1954.method662(true, var3 + class142.field1992);
            class140.field1954.method663(var5, 128);
            class140.field1954.method662(true, class118.field1668 + var2);
        }
        if (var4 == 11) {
            class140.field1954.method573(arg1 + 16, 171);
            class133.field1835++;
            class140.field1954.method662(true, var3);
            class140.field1954.method663(var5, 128);
            class140.field1954.method630((byte) 81, var2);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, 10989328);
            class276.field4299 = var3;
        }
        if (var4 == 6 && class262.field3960 == null) {
            class309.method2170(var2, false, var3);
            class262.field3960 = class176.method1211(1, var2, var3);
            class239.method1712(arg1 - 109, class262.field3960);
        }
        if (var4 == 46) {
            class184 var19 = class223.field3159[var5];
            if (var19 != null) {
                class113.field1609 = 0;
                class158.field2179 = 2;
                class287.field4511 = class148.field2055;
                class311.field4821 = class224.field3184;
                class259.field3930++;
                class140.field1954.method573(118, 254);
                class140.field1954.method684(var5, false);
                class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
            }
        }
        if (var4 == 28) {
            class68.method426(true);
        }
        if (var4 == 2) {
            class140.field1954.method573(120, 179);
            class140.field1954.method684(var5, false);
            class133.field1827++;
            class140.field1954.method662(true, var3);
            class140.field1954.method641(1773202520, var2);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, 10989328);
            class276.field4299 = var3;
        }
        if (var4 == 26) {
            if (var5 == 0) {
                class221.field3117 = 1;
                class198.method1367(class138.field1940, var3, var2);
            } else if (var5 == 1) {
                class329.field5033++;
                class140.field1954.method573(arg1 ^ 0x17, 251);
                class140.field1954.method662(true, class142.field1992 + var3);
                class140.field1954.method684(class112.field1595, false);
                class140.field1954.method663(class118.field1668 + var2, arg1 + 19);
                class140.field1954.method680(class225.field3194, (byte) -84);
            }
        }
        if (var4 == 1001) {
            class158.field2179 = 2;
            class187.field2696++;
            class287.field4511 = class148.field2055;
            class113.field1609 = 0;
            class311.field4821 = class224.field3184;
            class140.field1954.method573(arg1 + 8, 8);
            class140.field1954.method663(var3 + class142.field1992, arg1 + 19);
            class140.field1954.method663(Integer.MAX_VALUE & (int) (var6 >>> 32), arg1 + 19);
            class140.field1954.method662(true, class118.field1668 + var2);
            class140.field1954.method646((byte) 0, class184.field2650[82] ? 1 : 0);
        }
        if (var4 == 37) {
            class140.field1954.method573(115, 178);
            class49.field604++;
            class140.field1954.method663(var5, 128);
            class140.field1954.method639((byte) -111, var2);
            class140.field1954.method662(true, var3);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, 10989328);
            class276.field4299 = var3;
        }
        if (var4 == 44) {
            class287.field4511 = class148.field2055;
            class216.field3038++;
            class158.field2179 = 2;
            class311.field4821 = class224.field3184;
            class113.field1609 = 0;
            class140.field1954.method573(arg1 ^ 0x19, 145);
            class140.field1954.method646((byte) 0, class184.field2650[82] ? 1 : 0);
            class140.field1954.method642(84, class118.field1668 + var2);
            class140.field1954.method642(54, var3 + class142.field1992);
            class140.field1954.method684(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
        }
        if (var4 == 59) {
            class311.field4821 = class224.field3184;
            class67.field877++;
            class158.field2179 = 2;
            class113.field1609 = 0;
            class287.field4511 = class148.field2055;
            class140.field1954.method573(127, 134);
            class140.field1954.method663(class142.field1992 + var3, 128);
            class140.field1954.method662(true, var5);
            class140.field1954.method674(-121, class184.field2650[82] ? 1 : 0);
            class140.field1954.method663(class118.field1668 + var2, 128);
        }
        if (var4 == 43) {
            class81.field1041++;
            class140.field1954.method573(arg1 + 7, 138);
            class140.field1954.method684(class277.field4319, false);
            class140.field1954.method663(var3, 128);
            class140.field1954.method642(arg1 ^ 0x25, class260.field3940);
            class140.field1954.method641(1773202520, class137.field1915);
            class140.field1954.method642(25, var5);
            class140.field1954.method680(var2, (byte) -90);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, arg1 + 10989219);
            class276.field4299 = var3;
        }
        if (var4 == 7) {
            class153.field2104++;
            class158.field2179 = 2;
            class311.field4821 = class224.field3184;
            class113.field1609 = 0;
            class287.field4511 = class148.field2055;
            class140.field1954.method573(124, 204);
            class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
            class140.field1954.method662(true, var3 + class142.field1992);
            class140.field1954.method642(arg1 ^ 0xFFFFFFFB, class260.field3940);
            class140.field1954.method642(-107, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class140.field1954.method639((byte) -109, class137.field1915);
            class140.field1954.method684(class118.field1668 + var2, false);
            class140.field1954.method663(class277.field4319, arg1 ^ 0xED);
        }
        if (var4 == 33) {
            class304.field4717++;
            class158.field2179 = 2;
            class287.field4511 = class148.field2055;
            class113.field1609 = 0;
            class311.field4821 = class224.field3184;
            class140.field1954.method573(arg1 + 11, 10);
            class140.field1954.method684(var3 + class142.field1992, false);
            class140.field1954.method684(var5, false);
            class140.field1954.method663(class260.field3940, arg1 + 19);
            class140.field1954.method662(true, class277.field4319);
            class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
            class140.field1954.method642(arg1 ^ 0x2A, class118.field1668 + var2);
            class140.field1954.method639((byte) 33, class137.field1915);
        }
        if (var4 == 40) {
            class184 var20 = class223.field3159[var5];
            if (var20 != null) {
                class287.field4511 = class148.field2055;
                class264.field4160++;
                class113.field1609 = 0;
                class311.field4821 = class224.field3184;
                class158.field2179 = 2;
                class140.field1954.method573(116, 151);
                class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
                class140.field1954.method663(var5, 128);
            }
        }
        if (var4 == 51) {
            class140.field1954.method573(124, 159);
            class140.field1954.method684(var5, false);
            class140.field1954.method680(var2, (byte) -113);
            class116.field1640++;
            class140.field1954.method684(var3, false);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, arg1 + 10989219);
            class276.field4299 = var3;
        }
        if (var4 == 9) {
            class109 var21 = class328.field5009[var5];
            if (var21 != null) {
                class298.field4648++;
                class287.field4511 = class148.field2055;
                class113.field1609 = 0;
                class158.field2179 = 2;
                class311.field4821 = class224.field3184;
                class140.field1954.method573(arg1 ^ 0x1B, 216);
                class140.field1954.method642(-116, var5);
                class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
            }
        }
        if (var4 == 22) {
            class113.field1609 = 0;
            class287.field4511 = class148.field2055;
            class158.field2179 = 2;
            class26.field343++;
            class311.field4821 = class224.field3184;
            class140.field1954.method573(115, 89);
            class140.field1954.method663(class118.field1668 + var2, 128);
            class140.field1954.method662(true, var3 + class142.field1992);
            class140.field1954.method674(126, class184.field2650[82] ? 1 : 0);
            class140.field1954.method630((byte) 81, class225.field3194);
            class140.field1954.method642(-125, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class140.field1954.method662(true, class112.field1595);
        }
        if (var4 == 58) {
            class109 var22 = class328.field5009[var5];
            if (var22 != null) {
                class287.field4511 = class148.field2055;
                class158.field2179 = 2;
                class311.field4821 = class224.field3184;
                class113.field1609 = 0;
                class27.field351++;
                class140.field1954.method573(120, 111);
                class140.field1954.method663(var5, 128);
                class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
            }
        }
        if (var4 == 18) {
            class263 var23 = class176.method1211(1, var2, var3);
            if (var23 != null) {
                class168.method1101(30509);
                class171 var24 = client.method1952(var23);
                class129.method867(var24.field2468, var2, arg1 ^ 0xFFFFFF81, var24.method1123(84), var23.field3978, var3, var23.field4057);
                class314.field4848 = 0;
                class260.field3943 = class299.method2112(var23, 7625);
                if (var23.field3993) {
                    class255.field3892 = var23.field3996 + "<col=ffffff>";
                } else {
                    class255.field3892 = "<col=00ff00>" + var23.field4130 + "<col=ffffff>";
                }
                if (class260.field3943 == null) {
                    class260.field3943 = "Null";
                }
            }
            return;
        }
        if (var4 == 35) {
            class187.field2704++;
            class140.field1954.method573(118, 219);
            class140.field1954.method642(-125, var3);
            class140.field1954.method663(var5, 128);
            class140.field1954.method642(121, class112.field1595);
            class140.field1954.method630((byte) 81, var2);
            class140.field1954.method641(1773202520, class225.field3194);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, 10989328);
            class276.field4299 = var3;
        }
        if (var4 == 24) {
            class184 var25 = class223.field3159[var5];
            if (var25 != null) {
                class252.field3833++;
                class287.field4511 = class148.field2055;
                class113.field1609 = 0;
                class158.field2179 = 2;
                class311.field4821 = class224.field3184;
                class140.field1954.method573(123, 140);
                class140.field1954.method684(var5, false);
                class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
            }
        }
        if (var4 == 34) {
            class109 var26 = class328.field5009[var5];
            if (var26 != null) {
                class287.field4511 = class148.field2055;
                class19.field246++;
                class113.field1609 = 0;
                class311.field4821 = class224.field3184;
                class158.field2179 = 2;
                class140.field1954.method573(121, 212);
                class140.field1954.method642(-121, var5);
                class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
            }
        }
        if (var4 == 21) {
            class109 var27 = class328.field5009[var5];
            if (var27 != null) {
                class158.field2179 = 2;
                class311.field4821 = class224.field3184;
                class117.field1656++;
                class113.field1609 = 0;
                class287.field4511 = class148.field2055;
                class140.field1954.method573(arg1 ^ 0x11, 210);
                class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
                class140.field1954.method663(var5, 128);
            }
        }
        if (var4 == 20) {
            boolean var28 = true;
            class263 var29 = class91.method530(var2, 10989328);
            if (var29.field4113 > 0) {
                var28 = class216.method1491(var29, (byte) -122);
            }
            if (var28) {
                class140.field1954.method573(117, 208);
                class140.field1954.method641(1773202520, var2);
                class282.field4424++;
            }
        }
        if (var4 == 19) {
            class140.field1954.method573(118, 201);
            class140.field1954.method642(arg1 ^ 0xFFFFFFE8, var5);
            class140.field1954.method630((byte) 81, var2);
            class224.field3178++;
            class140.field1954.method663(var3, arg1 ^ 0xED);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, 10989328);
            class276.field4299 = var3;
        }
        if (var4 == 14) {
            class43.field512++;
            class140.field1954.method573(118, 38);
            class140.field1954.method684(var5, false);
            class140.field1954.method680(var2, (byte) -127);
            class140.field1954.method642(arg1 - 212, var3);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, arg1 ^ 0xA7AF7D);
            class276.field4299 = var3;
        }
        if (var4 == 36) {
            class109 var30 = class328.field5009[var5];
            if (var30 != null) {
                class113.field1609 = 0;
                class198.field2841++;
                class311.field4821 = class224.field3184;
                class158.field2179 = 2;
                class287.field4511 = class148.field2055;
                class140.field1954.method573(127, 83);
                class140.field1954.method646((byte) 0, class184.field2650[82] ? 1 : 0);
                class140.field1954.method642(-104, var5);
            }
        }
        if (var4 == 32) {
            class140.field1954.method573(120, 245);
            class140.field1954.method680(var2, (byte) -87);
            class225.field3188++;
            class140.field1954.method663(var5, 128);
            class140.field1954.method663(var3, 128);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, 10989328);
            class276.field4299 = var3;
        }
        if (var4 == 12) {
            class184 var31 = class223.field3159[var5];
            if (var31 != null) {
                class117.field1658++;
                class158.field2179 = 2;
                class311.field4821 = class224.field3184;
                class287.field4511 = class148.field2055;
                class113.field1609 = 0;
                class140.field1954.method573(116, 13);
                class140.field1954.method662(true, var5);
                class140.field1954.method684(class112.field1595, false);
                class140.field1954.method680(class225.field3194, (byte) -124);
                class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
            }
        }
        if (var4 == 38) {
            class109 var32 = class328.field5009[var5];
            if (var32 != null) {
                class311.field4821 = class224.field3184;
                class287.field4511 = class148.field2055;
                class158.field2179 = 2;
                class147.field2039++;
                class113.field1609 = 0;
                class140.field1954.method573(120, 102);
                class140.field1954.method642(-119, var5);
                class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
            }
        }
        if (var4 == 41) {
            class140.field1954.method573(125, 208);
            class282.field4424++;
            class140.field1954.method641(1773202520, var2);
            class263 var33 = class91.method530(var2, 10989328);
            if (var33.field4007 != null && var33.field4007[0][0] == 5) {
                int var34 = var33.field4007[0][1];
                if (class226.field3235[var34] != var33.field3986[0]) {
                    class226.field3235[var34] = var33.field3986[0];
                    class319.method2227(var34, -2708);
                }
            }
        }
        if (var4 == 39) {
            class311.field4821 = class224.field3184;
            class279.field4334++;
            class113.field1609 = 0;
            class287.field4511 = class148.field2055;
            class158.field2179 = 2;
            class140.field1954.method573(arg1 + 9, 46);
            class140.field1954.method646((byte) 0, class184.field2650[82] ? 1 : 0);
            class140.field1954.method662(true, class118.field1668 + var2);
            class140.field1954.method642(44, class142.field1992 + var3);
            class140.field1954.method642(123, var5);
        }
        if (var4 == 31) {
            class109 var35 = class328.field5009[var5];
            if (var35 != null) {
                class23.field320++;
                class113.field1609 = 0;
                class158.field2179 = 2;
                class287.field4511 = class148.field2055;
                class311.field4821 = class224.field3184;
                class140.field1954.method573(121, 113);
                class140.field1954.method684(class277.field4319, false);
                class140.field1954.method646((byte) 0, class184.field2650[82] ? 1 : 0);
                class140.field1954.method662(true, class260.field3940);
                class140.field1954.method630((byte) 81, class137.field1915);
                class140.field1954.method684(var5, false);
            }
        }
        if (var4 == 10) {
            if (var5 == 0) {
                class48.field583 = 1;
                class198.method1367(class138.field1940, var3, var2);
            } else if (class154.field2151 > 0 && class184.field2650[82] && class184.field2650[81]) {
                class198.method1373(class118.field1668 + var2, class142.field1992 + var3, true, class138.field1940);
            } else {
                class291.field4563++;
                class140.field1954.method573(arg1 + 18, 232);
                class140.field1954.method684(class118.field1668 + var2, false);
                class140.field1954.method663(class142.field1992 + var3, 128);
            }
        }
        if (var4 == 15) {
            class113.field1609 = 0;
            class214.field3005++;
            class311.field4821 = class224.field3184;
            class158.field2179 = 2;
            class287.field4511 = class148.field2055;
            class140.field1954.method573(115, 228);
            class140.field1954.method662(true, var5);
            class140.field1954.method671(class184.field2650[82] ? 1 : 0, 255);
            class140.field1954.method642(arg1 ^ 0xFFFFFFE8, class118.field1668 + var2);
            class140.field1954.method663(class142.field1992 + var3, 128);
        }
        if (var4 == 47) {
            class89.field1105++;
            class140.field1954.method573(122, 73);
            class140.field1954.method663(var5, arg1 ^ 0xED);
            class140.field1954.method639((byte) -108, var2);
            class140.field1954.method684(var3, false);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, 10989328);
            class276.field4299 = var3;
        }
        if (var4 == 48) {
            class158.field2179 = 2;
            class130.field1793++;
            class113.field1609 = 0;
            class287.field4511 = class148.field2055;
            class311.field4821 = class224.field3184;
            class140.field1954.method573(115, 94);
            class140.field1954.method684(class142.field1992 + var3, false);
            class140.field1954.method646((byte) 0, class184.field2650[82] ? 1 : 0);
            class140.field1954.method662(true, var2 + class118.field1668);
            class140.field1954.method663(Integer.MAX_VALUE & (int) (var6 >>> 32), 128);
        }
        if (arg1 != 109) {
            return;
        }
        if (var4 == 49 || var4 == 1002) {
            class216.method1495(arg1 - 109, var3, var5, class148.field2061[arg0], var2);
        }
        if (var4 == 57) {
            class140.field1954.method573(arg1 + 17, 65);
            class140.field1954.method680(var2, (byte) -104);
            class140.field1954.method662(true, var3);
            class140.field1954.method663(var5, 128);
            class121.field1703 = 0;
            class89.field1114 = class91.method530(var2, 10989328);
            class276.field4299 = var3;
            class239.field3590++;
        }
        if (var4 != 3) {
            if (class314.field4848 != 0) {
                class314.field4848 = 0;
                class239.method1712(0, class91.method530(class137.field1915, 10989328));
            }
            if (class72.field909) {
                class168.method1101(30509);
            }
            if (class89.field1114 != null && class121.field1703 == 0) {
                class239.method1712(0, class89.field1114);
            }
            return;
        }
        class168.method1101(30509);
        class263 var36 = class91.method530(var2, arg1 + 10989219);
        class314.field4848 = 1;
        class137.field1915 = var2;
        class277.field4319 = var3;
        class260.field3940 = var5;
        class239.method1712(arg1 - 109, var36);
        class285.field4488 = "<col=ff9040>" + class60.method353(var5, (byte) -102).field1167 + "<col=ffffff>";
        if (class285.field4488 == null) {
            class285.field4488 = "null";
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V", line = 1276)
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1292 = arg2;
        this.field1300 = arg3;
        this.field1295 = arg0;
        this.field1312 = arg1;
        this.field1305 = arg6 + arg5;
        this.field1304 = arg4;
        int var8 = class120.method818((byte) 96, this.field1295).field2205;
        if (var8 == -1) {
            this.field1311 = true;
        } else {
            this.field1311 = false;
            this.field1310 = class185.method1289(var8, (byte) 119);
        }
        if (this.field1305 == arg6) {
            class337.method2329(false, this.field1310, (byte) -97, this.field1292, this.field1300, this.field1307);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)Z", line = 1205)
    public static final boolean method600(int arg0, int arg1, int arg2) {
        int var3 = class109.field1491[arg0][arg1][arg2];
        if (-class208.field2947 == var3) {
            return false;
        } else if (class208.field2947 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class184.method1282(var4 + 1, class167.field2324[arg0][arg1][arg2], var5 + 1) && class184.method1282(var4 + 128 - 1, class167.field2324[arg0][arg1 + 1][arg2], var5 + 1) && class184.method1282(var4 + 128 - 1, class167.field2324[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class184.method1282(var4 + 1, class167.field2324[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class109.field1491[arg0][arg1][arg2] = class208.field2947;
                return true;
            } else {
                class109.field1491[arg0][arg1][arg2] = -class208.field2947;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIIJILid;)V", line = 1248)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class274 arg10) {
        class201 var13 = this.method594(112);
        field1303++;
        if (var13 != null) {
            var13.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1308);
            this.field1297 = var13.method11();
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V", line = 1268)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1306++;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 1304)
    public static void method601(int arg0) {
        field1291 = (int[][][]) null;
        if (arg0 != -58) {
            field1309 = -47;
        }
    }
}
