import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class210 {

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Z")
    public static volatile boolean field3001 = true;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lo;")
    public static class254 field3000;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lhg;")
    public static final class182 method1359(byte arg0, int arg1) {
        field2998++;
        class182 var2 = (class182) class78.field1090.method540((byte) -115, (long) arg1);
        if (arg0 > -121) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class50.field724.method1576(-67, arg1, 0);
            class182 var4 = new class182(var3);
            var4.method839(class169.field2346, (int[]) null);
            class78.field1090.method543(var4, (long) arg1, 858993459);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method1360(byte arg0) {
        field3000 = null;
        if (arg0 < 15) {
            method1364(46, 9);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public static final void method1361(int arg0, int arg1) {
        class231.field3497.method536(-57, arg0);
        if (arg1 <= 93) {
            field3001 = true;
        }
        field2997++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method1362(int arg0) {
        field2996++;
        boolean var1 = true;
        class100.method659(false, false);
        class68.field934 = 0;
        for (int var2 = 0; var2 < class146.field2029.length; var2++) {
            if (class202.field2808[var2] != -1 && class146.field2029[var2] == null) {
                class146.field2029[var2] = class197.field2726.method1576(-70, class202.field2808[var2], 0);
                if (class146.field2029[var2] == null) {
                    class68.field934++;
                    var1 = false;
                }
            }
            if (class180.field2519[var2] != -1 && class287.field4548[var2] == null) {
                class287.field4548[var2] = class197.field2726.method1560(class83.field1132[var2], 0, (byte) 82, class180.field2519[var2]);
                if (class287.field4548[var2] == null) {
                    class68.field934++;
                    var1 = false;
                }
            }
            if (class135.field1897 != null && class82.field1114[var2] == null && class135.field1897[var2] != -1) {
                class82.field1114[var2] = class197.field2726.method1560(class83.field1132[var2], 0, (byte) 99, class135.field1897[var2]);
                if (class82.field1114[var2] == null) {
                    class68.field934++;
                    var1 = false;
                }
            }
        }
        if (class292.field4588 == null) {
            if (class20.field285 == null || !class174.field2455.method1556(-128, class20.field285.field3901 + "_labels")) {
                class292.field4588 = new class172(0);
            } else if (class174.field2455.method1553((byte) -118, class20.field285.field3901 + "_labels")) {
                class292.field4588 = class123.method806(class174.field2455, class20.field285.field3901 + "_labels", (byte) 104);
            } else {
                class68.field934++;
                var1 = false;
            }
        }
        if (!var1) {
            class231.field3496 = 1;
            return;
        }
        boolean var3 = true;
        class92.field1279 = 0;
        for (int var4 = 0; var4 < class146.field2029.length; var4++) {
            byte[] var20 = class287.field4548[var4];
            if (var20 != null) {
                int var21 = (class274.field4242[var4] >> 8) * 64 - class37.field565;
                int var22 = (class274.field4242[var4] & 0xFF) * 64 - class216.field3255;
                if (class125.field1755) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class46.method303(var22, (byte) -115, var20, var21);
            }
        }
        if (!var3) {
            class231.field3496 = 2;
            return;
        }
        if (class231.field3496 != 0) {
            class22.method165(true, class13.field128 + "<br>(100%)", arg0 - 26423);
        }
        class156.method1038(false);
        class21.method161(false);
        boolean var5 = false;
        class269.method1777(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class122.field1703[var6].method1841((byte) 100);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class230.field3489[var7][var18][var19] = 0;
                }
            }
        }
        class47.method312(false, arg0 - 20954);
        class156.method1038(false);
        System.gc();
        class100.method659(true, false);
        class36.method240(false, -14493);
        if (!class125.field1755) {
            class42.method276((byte) 57, false);
            class100.method659(true, false);
            class33.method221(arg0 ^ 0xFFFF98FB, false);
            if (class82.field1114 != null) {
                class245.method1652(-1);
            }
        }
        if (arg0 != 26424) {
            field3001 = false;
        }
        if (class125.field1755) {
            class148.method995((byte) -43, false);
            class100.method659(true, false);
            class28.method180(false, arg0 ^ 0x1DBD);
        }
        class21.method161(false);
        class100.method659(true, false);
        class77.method498(class125.field1755 ? class239.field3652 : null, false, 22905, class122.field1703);
        class100.method659(true, false);
        int var8 = class138.field1927;
        if (var8 > class295.field4642) {
            var8 = class295.field4642;
        }
        if (var8 < class295.field4642 - 1) {
            int var9 = class295.field4642 - 1;
        }
        if (class34.method231(127)) {
            class77.method495(0);
        } else {
            class77.method495(class138.field1927);
        }
        class154.method1020(true);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class249.method1667(var17, 4, var10);
            }
        }
        class101.method660(66);
        class156.method1038(false);
        class61.method378(false);
        class21.method161(false);
        if (class17.field179 != null && class290.field4567 != null && class79.field1097 == 25) {
            class281.field4359.method1864(82, (byte) -69);
            class213.field3210++;
            class281.field4359.method1435(-115, 1057001181);
        }
        if (!class125.field1755) {
            int var11 = (class101.field1422 - 6) / 8;
            int var12 = (class101.field1422 + 6) / 8;
            int var13 = (class178.field2495 - 6) / 8;
            int var14 = (class178.field2495 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var12 < var15 || var16 < var13 || var16 > var14) {
                        class197.field2726.method1551("m" + var15 + "_" + var16, (byte) 78);
                        class197.field2726.method1551("l" + var15 + "_" + var16, (byte) 78);
                    }
                }
            }
        }
        if (class79.field1097 == 28) {
            class145.method977(99, 10);
        } else {
            class145.method977(126, 30);
            if (class290.field4567 != null) {
                class281.field4359.method1864(246, (byte) -69);
            }
        }
        class234.method1540((byte) 111);
        class156.method1038(false);
        class139.method942((byte) -77);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
    public static final boolean method1363(int arg0, int arg1, int arg2) {
        field3003++;
        if (!class15.field146) {
            return false;
        }
        int var3 = -113 / ((-arg0 - 27) / 61);
        int var4 = arg1 & 0xFFFF;
        int var5 = arg1 >> 16;
        if (class158.field2208[var5] == null || class158.field2208[var5][var4] == null) {
            return false;
        }
        class211 var6 = class158.field2208[var5][var4];
        if (arg2 == -1 && var6.field3035 == 0) {
            for (int var7 = 0; var7 < class68.field925; var7++) {
                if (class221.field3306[var7] == 22 || class221.field3306[var7] == 1006 || class221.field3306[var7] == 50 || class221.field3306[var7] == 40 || class221.field3306[var7] == 26) {
                    for (class211 var8 = class67.method421(class144.field2001[var7], 0); var8 != null; var8 = class139.method940(0, var8)) {
                        if (var6.field3093 == var8.field3093) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < class68.field925; var9++) {
                if (class219.field3299[var9] == arg2 && class144.field2001[var9] == var6.field3093 && (class221.field3306[var9] == 22 || class221.field3306[var9] == 1006 || class221.field3306[var9] == 50 || class221.field3306[var9] == 40 || class221.field3306[var9] == 26)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
    public static final void method1364(int arg0, int arg1) {
        field2999++;
        class155.field2160.method536(arg1 + 110, arg0);
        if (arg1 != 0) {
            method1364(-125, -42);
        }
    }
}
