import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class318 {

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lnf;")
    private class251 field4798 = new class251();

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    private int field4787;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    private int field4807;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Ltd;")
    private class192 field4801;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field4790 = 0;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4806 = "Please remove ";

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field4785 = 0;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lf;")
    public static class329 field4793 = null;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Llm;")
    public static class210 field4786;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "[Lbk;")
    public static class157[] field4792;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[[[I")
    public static int[][][] field4797;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZJ)V", line = 6)
    public final void method2172(boolean arg0, long arg1) {
        field4791++;
        class321 var4 = (class321) this.field4801.method1320(arg1, 13002);
        if (arg0) {
            this.field4798 = (class251) null;
        }
        if (var4 != null) {
            var4.method714(-76);
            var4.method1353(29792);
            this.field4807++;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[B)Ljava/lang/String;", line = 26)
    public static final String method2173(int arg0, int arg1, int arg2, byte[] arg3) {
        field4796++;
        char[] var4 = new char[arg1];
        if (arg0 != 7816) {
            method2184(-71);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg3[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class301.field4603[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V", line = 68)
    public final void method2174(int arg0, int arg1) {
        if (class198.field2970 != null) {
            for (class321 var3 = (class321) this.field4798.method1696(arg0 ^ 0xFFFFCED5); var3 != null; var3 = (class321) this.field4798.method1695(arg0 + 125)) {
                if (var3.method425((byte) -113)) {
                    if (var3.method421(-15306) == null) {
                        var3.method714(-90);
                        var3.method1353(29792);
                        this.field4807++;
                    }
                } else if (++var3.field2955 > (long) arg1) {
                    class321 var4 = class198.field2970.method11(-1, var3);
                    this.field4801.method1319(126, var3.field1603, var4);
                    class160.method1131(var3, -179, var4);
                    var3.method714(-74);
                    var3.method1353(29792);
                }
            }
        }
        field4784++;
        if (arg0 != -12634) {
            method2178(true, -73);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 118)
    public final void method2175(long arg0, Object arg1, int arg2) {
        field4805++;
        int var5 = 113 / ((arg2 - 19) / 32);
        this.method2172(false, arg0);
        if (this.field4807 == 0) {
            class321 var6 = (class321) this.field4798.method1698((byte) 105);
            var6.method714(-64);
            var6.method1353(29792);
        } else {
            this.field4807--;
        }
        class64 var7 = new class64(arg1);
        this.field4801.method1319(119, arg0, var7);
        this.field4798.method1697(34, var7);
        var7.field2955 = 0L;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 145)
    public final void method2176(byte arg0) {
        if (arg0 > -14) {
            this.method2180(-99L, (byte) 25);
        }
        for (class321 var2 = (class321) this.field4798.method1696(63); var2 != null; var2 = (class321) this.field4798.method1695(-12509)) {
            if (var2.method425((byte) -114)) {
                var2.method714(-43);
                var2.method1353(29792);
                this.field4807++;
            }
        }
        field4795++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V", line = 177)
    public static final void method2177(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class183.field2743; var3++) {
            for (int var4 = 0; var4 < class311.field4734; var4++) {
                for (int var5 = 0; var5 < class191.field2844; var5++) {
                    class221 var6 = class158.field2367[var3][var4][var5];
                    if (var6 != null) {
                        class163 var7 = var6.field3370;
                        if (var7 != null && var7.field2451.method564()) {
                            class269.method1893(var7.field2451, var3, var4, var5, 1, 1);
                            if (var7.field2452 != null && var7.field2452.method564()) {
                                class269.method1893(var7.field2452, var3, var4, var5, 1, 1);
                                var7.field2451.method558(var7.field2452, 0, 0, 0, false);
                                var7.field2452 = var7.field2452.method551(arg0, arg1, arg2);
                            }
                            var7.field2451 = var7.field2451.method551(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3374; var8++) {
                            class311 var9 = var6.field3354[var8];
                            if (var9 != null && var9.field4728.method564()) {
                                class269.method1893(var9.field4728, var3, var4, var5, var9.field4722 + 1 - var9.field4724, var9.field4726 - var9.field4735 + 1);
                                var9.field4728 = var9.field4728.method551(arg0, arg1, arg2);
                            }
                        }
                        class187 var10 = var6.field3364;
                        if (var10 != null && var10.field2781.method564()) {
                            class245.method1653(var10.field2781, var3, var4, var5);
                            var10.field2781 = var10.field2781.method551(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Leb;", line = 252)
    public static final class274 method2178(boolean arg0, int arg1) {
        field4789++;
        class274 var2 = (class274) class88.field1313.method2180((long) arg1, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class252.field3763.method1441(arg1, (byte) -44, 33);
        class274 var4 = new class274();
        if (var3 != null) {
            var4.method1935(16777215, new class263(var3), arg1);
        }
        class88.field1313.method2175((long) arg1, var4, -85);
        return arg0 ? var4 : (class274) null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 287)
    public static void method2179(int arg0) {
        field4797 = (int[][][]) null;
        if (arg0 != -1) {
            field4797 = (int[][][]) ((int[][][]) null);
        }
        field4793 = null;
        field4806 = null;
        field4786 = null;
        field4792 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 304)
    public final Object method2180(long arg0, byte arg1) {
        class321 var4 = (class321) this.field4801.method1320(arg0, arg1 ^ 0x32D5);
        field4794++;
        if (arg1 != 31) {
            return (Object) null;
        } else if (var4 == null) {
            return null;
        } else {
            Object var5 = var4.method421(-15306);
            if (var5 == null) {
                var4.method714(-80);
                var4.method1353(arg1 ^ 0x747F);
                this.field4807++;
                return null;
            }
            if (var4.method425((byte) 101)) {
                class64 var6 = new class64(var5);
                this.field4801.method1319(arg1 ^ 0x5D, var4.field1603, var6);
                this.field4798.method1697(34, var6);
                var6.field2955 = 0L;
                var4.method714(arg1 + 96);
                var4.method1353(arg1 ^ 0x747F);
            } else {
                this.field4798.method1697(34, var4);
                var4.field2955 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/lang/String;)I", line = 347)
    public static final int method2181(byte arg0, String arg1) {
        field4800++;
        if (class155.field2325 == null || arg1.length() == 0) {
            return -1;
        }
        if (arg0 > -70) {
            method2179(105);
        }
        for (int var2 = 0; var2 < class155.field2325.field1996; var2++) {
            if (class210.method1460(arg1, (byte) -97, class201.method1379("<br>", -47, class155.field2325.field2007[var2], " "))) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 374)
    public final void method2182(boolean arg0) {
        field4788++;
        this.field4798.method1692((byte) 93);
        this.field4801.method1327((byte) 84);
        this.field4807 = this.field4787;
        if (arg0) {
            this.method2174(-119, -33);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Lpj;", line = 387)
    public static final class59 method2183(int arg0) {
        field4808++;
        class59 var1 = new class59(class12.field136, class132.field2034, class203.field3039[0], class184.field2754[0], class203.field3051[0], class160.field2403[0], class205.field3083[0], class66.field865);
        if (arg0 == 8410) {
            class10.method49((byte) 119);
            return var1;
        } else {
            return (class59) null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 407)
    public static final void method2184(int arg0) {
        if (arg0 != -20238) {
            field4792 = (class157[]) null;
        }
        for (class167 var1 = (class167) class295.field4522.method1321((byte) -125); var1 != null; var1 = (class167) class295.field4522.method1330((byte) -31)) {
            int var2 = var1.field2505;
            if (class72.method463(-119, var2)) {
                boolean var3 = true;
                class329[] var4 = class278.field4231[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field5022;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1603;
                    class329 var7 = class80.method541((byte) 96, var6);
                    if (var7 != null) {
                        class247.method1666(var7, -128);
                    }
                }
            }
        }
        field4799++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 460)
    public static final void method2185(String arg0, boolean arg1) {
        field4804++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg1) {
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V", line = 479)
    public static final void method2186(int arg0) {
        if (!class5.field27) {
            if (class115.field1761 != 0) {
                class121.field1897 = class103.field1642;
                class317.field4783 = class136.field2066;
            } else if (class253.field3813 == 0) {
                class317.field4783 = class132.field2036;
                class121.field1897 = class237.field3557;
            } else {
                class317.field4783 = class207.field3140;
                class121.field1897 = class28.field387;
            }
            class190.field2829 = 1;
            class307.field4677[0] = class121.field1898;
            class201.field2998[0] = 1002;
            class155.field2322[0] = class156.field2330;
            class180.field2686[0] = "";
        }
        field4803++;
        if (class123.field1926 != -1) {
            class302.method2094(arg0 ^ 0xFFFFABA9, class123.field1926);
        }
        for (int var1 = 0; var1 < class325.field4898; var1++) {
            if (class22.field298[var1]) {
                class131.field2021[var1] = true;
            }
            class51.field641[var1] = class22.field298[var1];
            class22.field298[var1] = false;
        }
        if (arg0 != 21509) {
            field4790 = 120;
        }
        if (class117.field1817) {
            class326.field4911 = true;
        }
        class140.field2113 = class304.field4641;
        class201.field2999 = -1;
        field4793 = null;
        class217.field3293 = -1;
        class78.field1084 = null;
        if (class123.field1926 != -1) {
            class325.field4898 = 0;
            class323.method2209(true);
        }
        if (class117.field1817) {
            class308.method2133();
        } else {
            class46.method300();
        }
        class42.method280(94);
        if (class5.field27) {
            if (class30.field401) {
                class214.method1478(false);
            } else {
                class10.method51(arg0 ^ 0xFFFFABA1);
            }
        } else if (field4793 != null) {
            class180.method1250((byte) 63, class55.field694, class21.field260, field4793);
        } else if (class201.field2999 != -1) {
            class180.method1250((byte) 63, class201.field2999, class217.field3293, (class329) null);
        }
        int var2 = class5.field27 ? -1 : class326.method2223(-1);
        if (var2 == -1) {
            var2 = class90.field1340;
        }
        class61.method412(var2, arg0 ^ 0x4A197A4C);
        if (class10.field95 == 1) {
            class10.field95 = 2;
        }
        if (class283.field4281 == 1) {
            class283.field4281 = 2;
        }
        if (class125.field1965 == 3) {
            for (int var3 = 0; var3 < class325.field4898; var3++) {
                if (class51.field641[var3]) {
                    if (class117.field1817) {
                        class308.method2125(class228.field3473[var3], class15.field168[var3], class6.field29[var3], class307.field4678[var3], 16711935, 128);
                    } else {
                        class46.method319(class228.field3473[var3], class15.field168[var3], class6.field29[var3], class307.field4678[var3], 16711935, 128);
                    }
                } else if (class131.field2021[var3]) {
                    if (class117.field1817) {
                        class308.method2125(class228.field3473[var3], class15.field168[var3], class6.field29[var3], class307.field4678[var3], 16711680, 128);
                    } else {
                        class46.method319(class228.field3473[var3], class15.field168[var3], class6.field29[var3], class307.field4678[var3], 16711680, 128);
                    }
                }
            }
        }
        class255.method1729(class114.field1750.field1505, class288.field4352, class114.field1750.field1566, class180.field2697, 124);
        class288.field4352 = 0;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)I", line = 623)
    public final int method2187(byte arg0) {
        field4802++;
        int var2 = 0;
        class321 var3 = (class321) this.field4798.method1696(88);
        if (arg0 <= 88) {
            return 50;
        }
        while (var3 != null) {
            if (!var3.method425((byte) 109)) {
                var2++;
            }
            var3 = (class321) this.field4798.method1695(-12509);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V", line = 655)
    public class318(int arg0) {
        this.field4787 = arg0;
        int var2 = 1;
        this.field4807 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field4801 = new class192(var2);
    }
}
