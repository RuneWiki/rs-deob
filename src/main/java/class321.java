import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class321 {

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field4858 = 2;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field4866 = 500;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public int field4855;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public int field4862;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public int field4864;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public int field4868;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    public int field4870;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "[B")
    public byte[] field4861;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "[B")
    public byte[] field4865;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static final void method2118(byte arg0) {
        field4857++;
        class242 var1 = class13.field144;
        synchronized (class13.field144) {
            class13.field144.method1637((byte) 13);
        }
        int var2 = 96 % ((arg0 + 29) / 40);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)V")
    public static final void method2119(boolean arg0, int arg1) {
        class401.field5920 = 0;
        class20.field220 = 0;
        field4863++;
        class439.method2722(0);
        class16.method93(true, arg0);
        class317.method2109(-114);
        boolean var2 = false;
        if (arg1 <= 96) {
            return;
        }
        for (int var3 = 0; var3 < class401.field5920; var3++) {
            int var5 = class295.field4547[var3];
            class5 var6 = (class5) class366.field5398.method358((byte) -121, (long) var5);
            class46 var7 = var6.field65;
            if (class256.field4112 && class169.method1208(var5, 1)) {
                class173.method1238(10);
            }
            if (class446.field6625 != var7.field7610) {
                if (var7.field718.method1219(true)) {
                    class150.method1078(var7, true);
                }
                var7.method315(32841, null);
                var6.method947((byte) 112);
                var2 = true;
            }
        }
        if (var2) {
            class412.field6081 = class366.field5398.method364(0);
            class366.field5398.method361((byte) -32, class166.field2507);
        }
        if (class429.field6369 != class424.field6231.field2982) {
            throw new RuntimeException("gnp1 pos:" + class424.field6231.field2982 + " psize:" + class429.field6369);
        }
        for (int var4 = 0; var4 < class231.field3482; var4++) {
            if (class366.field5398.method358((byte) 70, (long) class234.field3513[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class231.field3482);
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
    public static final void method2120(byte arg0) {
        class73.field1248.method502(((float) class40.field667.field4207 * 0.1F + 0.7F) * 1.1523438F);
        field4856++;
        class73.field1248.method596(class46.field729, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class73.field1248.method534(class23.field270, -1, 256);
        class73.field1248.method526(class489.field7140);
        if (arg0 != -61) {
            method2119(true, 59);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public static final void method2121(int arg0) {
        if (class445.field6617 < 0) {
            class240.field3593 = -1;
            class445.field6617 = 0;
            class357.field5290 = -1;
        }
        field4867++;
        if (class362.field5357 < class445.field6617) {
            class445.field6617 = class362.field5357;
            class240.field3593 = -1;
            class357.field5290 = -1;
        }
        if (arg0 != 24659) {
            field4859 = -123;
        }
        if (class274.field4298 < 0) {
            class274.field4298 = 0;
            class240.field3593 = -1;
            class357.field5290 = -1;
        }
        if (class274.field4298 > class362.field5349) {
            class240.field3593 = -1;
            class357.field5290 = -1;
            class274.field4298 = class362.field5349;
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
    public static final void method2122(int arg0) {
        field4860++;
        if (class301.field4613 == class287.field4471) {
            return;
        }
        try {
            class220.method1510(-116, "tbrefresh", class281.field4379);
            if (arg0 > -116) {
                field4859 = -74;
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Laa;Z)Z")
    public static final boolean method2123(class76 arg0, boolean arg1) {
        boolean var2 = class407.field6024 == class288.field4475;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method698(28);
        if (arg0.field1283 < 0 || arg0.field1277 < 0 || arg0.field1271 >= class474.field6947 || arg0.field1272 >= class443.field6603) {
            return false;
        }
        for (int var6 = arg0.field1283; var6 <= arg0.field1271; var6++) {
            for (int var9 = arg0.field1277; var9 <= arg0.field1272; var9++) {
                class281 var10 = class141.method1018(arg0.field1274, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field1283) {
                        var11++;
                    }
                    if (var6 < arg0.field1271) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field1277) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field1272) {
                        var11 += 2;
                    }
                    class21 var12 = class144.method1030(arg0, 0, var11);
                    class21 var13 = var10.field4381;
                    if (var13 == null) {
                        var10.field4381 = var12;
                    } else {
                        while (var13.field235 != null) {
                            var13 = var13.field235;
                        }
                        var13.field235 = var12;
                    }
                    var10.field4369 = (byte) (var10.field4369 | var11);
                    if (var2 && (class295.field4548[var6][var9] & 0xFF000000) != 0) {
                        var3 = class295.field4548[var6][var9];
                        var4 = class341.field5093[var6][var9];
                        var5 = class101.field1543[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field1283; var7 <= arg0.field1271; var7++) {
                for (int var8 = arg0.field1277; var8 <= arg0.field1272; var8++) {
                    if ((class295.field4548[var7][var8] & 0xFF000000) == 0) {
                        class295.field4548[var7][var8] = var3;
                        class341.field5093[var7][var8] = var4;
                        class101.field1543[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class195.field3065[class327.field4957++] = arg0;
        }
        return true;
    }
}
