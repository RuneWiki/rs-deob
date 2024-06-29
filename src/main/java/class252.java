import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class252 {

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field3999 = 1;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3993 = "M";

    @OriginalMember(owner = "client!al", name = "j", descriptor = "[C")
    public static char[] field3998 = new char[128];

    @OriginalMember(owner = "client!al", name = "c", descriptor = "B")
    public static byte field3991;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lfa;")
    public static class273 field3989;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method1741(boolean arg0) {
        if (!arg0) {
            method1744(94, 5);
        }
        field3993 = null;
        field3998 = null;
        field3989 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Z")
    public final boolean method1742(byte arg0) {
        field3990++;
        int var2 = 80 / ((23 - arg0) / 41);
        return (this.field4000 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z")
    public final boolean method1743(int arg0) {
        field3994++;
        if (arg0 == 2) {
            return (this.field4000 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lcb;")
    public static final class265 method1744(int arg0, int arg1) {
        field3992++;
        class265 var2 = (class265) class278.field4608.method1343(-70, (long) arg0);
        if (arg1 != 0) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class10.field135.method1877(arg0, 5, (byte) 108);
            class265 var4 = new class265();
            if (var3 != null) {
                var4.method1831(0, new class202(var3));
            }
            class278.field4608.method1337(var4, (long) arg0, -1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z")
    public final boolean method1745(int arg0) {
        field4002++;
        int var2 = 11 % ((arg0 - 63) / 54);
        return (this.field4000 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
    public static final void method1746(int arg0) {
        class215.method1506((byte) 59, false);
        field4001++;
        boolean var1 = true;
        class311.field5022 = 0;
        for (int var2 = 0; var2 < class225.field3574.length; var2++) {
            if (class173.field2688[var2] != -1 && class225.field3574[var2] == null) {
                class225.field3574[var2] = class145.field2296.method1877(0, class173.field2688[var2], (byte) 45);
                if (class225.field3574[var2] == null) {
                    var1 = false;
                    class311.field5022++;
                }
            }
            if (class18.field245[var2] != -1 && class242.field3841[var2] == null) {
                class242.field3841[var2] = class145.field2296.method1907(0, class18.field245[var2], class287.field4779[var2], -25529);
                if (class242.field3841[var2] == null) {
                    class311.field5022++;
                    var1 = false;
                }
            }
            if (class298.field4908 != null && class7.field56[var2] == null && class298.field4908[var2] != -1) {
                class7.field56[var2] = class145.field2296.method1907(0, class298.field4908[var2], class287.field4779[var2], -25529);
                if (class7.field56[var2] == null) {
                    class311.field5022++;
                    var1 = false;
                }
            }
        }
        if (class212.field3389 == null) {
            if (class189.field2921 == null || !class157.field2499.method1899(class189.field2921.field3486 + "_labels", true)) {
                class212.field3389 = new class288(0);
            } else if (class157.field2499.method1901(1, class189.field2921.field3486 + "_labels")) {
                class212.field3389 = class131.method878(-2, class141.field2180, class189.field2921.field3486 + "_labels", class157.field2499);
            } else {
                class311.field5022++;
                var1 = false;
            }
        }
        if (!var1) {
            class273.field4500 = 1;
            return;
        }
        class72.field1043 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class225.field3574.length; var4++) {
            byte[] var20 = class242.field3841[var4];
            if (var20 != null) {
                int var21 = (class53.field718[var4] >> 8) * 64 - class101.field1517;
                int var22 = (class53.field718[var4] & 0xFF) * 64 - class254.field4063;
                if (class34.field414) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class265.method1833(var22, -1, var20, var21);
            }
        }
        if (!var3) {
            class273.field4500 = 2;
            return;
        }
        boolean var5 = false;
        if (class273.field4500 != 0) {
            class152.method1007(true, class250.field3982 + "<br>(100%)", (byte) -121);
        }
        class217.method1521(1);
        class117.method762(-1);
        class305.method2089(arg0, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class183.field2841[var6].method943(arg0 + 119);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class128.field1972[var7][var18][var19] = 0;
                }
            }
        }
        class219.method1529(-198, false);
        class217.method1521(arg0 ^ 0x5);
        System.gc();
        class215.method1506((byte) 59, true);
        class260.method1804((byte) -41, false);
        if (!class34.field414) {
            class242.method1702(false, (byte) 107);
            class215.method1506((byte) 59, true);
            class20.method121(false, 50);
            if (class7.field56 != null) {
                class257.method1796(104);
            }
        }
        if (class34.field414) {
            class107.method695(false, (byte) -110);
            class215.method1506((byte) 59, true);
            class161.method1066(arg0 + 4, false);
        }
        class117.method762(-1);
        class215.method1506((byte) 59, true);
        class178.method1194(-1, false, class183.field2841, class34.field414 ? class193.field3049 : null);
        class215.method1506((byte) 59, true);
        int var8 = class161.field2538;
        if (var8 > class165.field2600) {
            var8 = class165.field2600;
        }
        if (class165.field2600 - 1 > var8) {
            int var9 = class165.field2600 - 1;
        }
        if (class165.method1108(0)) {
            class55.method323(0);
        } else {
            class55.method323(class161.field2538);
        }
        class68.method427((byte) -119);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class135.method906(var10, var17, arg0 ^ 0xFFFFBB8B);
            }
        }
        class45.method285((byte) -111);
        class217.method1521(1);
        class58.method355((byte) 42);
        class117.method762(-1);
        if (class224.field3565 != null && class103.field1551 != null && class115.field1733 == 25) {
            class272.field4465++;
            class276.field4572.method1391(0, 200);
            class276.field4572.method1425(1057001181, (byte) -110);
        }
        if (!class34.field414) {
            int var11 = (class113.field1711 - 6) / 8;
            int var12 = (class266.field4370 + 6) / 8;
            int var13 = (class266.field4370 - 6) / 8;
            int var14 = (class113.field1711 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var14 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= var12 + 1; var16++) {
                    if (var15 < var11 || var14 < var15 || var13 > var16 || var16 > var12) {
                        class145.field2296.method1905("m" + var15 + "_" + var16, 87);
                        class145.field2296.method1905("l" + var15 + "_" + var16, 109);
                    }
                }
            }
        }
        if (class115.field1733 == 28) {
            class229.method1614(10, 28);
        } else {
            class229.method1614(30, 28);
            if (class103.field1551 != null) {
                class276.field4572.method1391(0, 6);
            }
        }
        class37.method234(-54);
        class217.method1521(1);
        method1748(9801);
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)Z")
    public final boolean method1747(int arg0) {
        if (arg0 != -33) {
            this.field4000 = 3;
        }
        field3996++;
        return (this.field4000 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
    public static final void method1748(int arg0) {
        field4004++;
        class41.field513.method136(true);
        for (int var1 = 0; var1 < 32; var1++) {
            class211.field3384[var1] = 0L;
        }
        if (arg0 != 9801) {
            method1741(true);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class194.field3070[var2] = 0L;
        }
        class113.field1708 = 0;
    }
}
