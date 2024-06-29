import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class class281 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[[[I")
    public static int[][][] field4933 = new int[4][13][13];

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lqk;")
    private static class207 field4937 = class24.method212(255, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lqk;")
    public static class207 field4934 = field4937;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public int field4936;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field4940;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "[I")
    public static int[] field4945;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
    public static int method1906(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)Lqh;")
    public static final class200 method1907(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        field4941++;
        class200 var2 = (class200) class2.field38.method1387((long) arg1, 120);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class266.field4712.method705(32, arg1, -1);
        class200 var4 = new class200();
        if (var3 != null) {
            var4.method1397(-127, new class149(var3));
        }
        var4.method1393(false);
        class2.field38.method1385((long) arg1, var4, (byte) -126);
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method1908(byte arg0) {
        int var1 = -38 % ((33 - arg0) / 47);
        field4937 = null;
        field4945 = null;
        field4933 = null;
        field4934 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[Lmd;I)V")
    public static final void method1909(int arg0, class220[] arg1, int arg2) {
        if (arg0 > -23) {
            field4934 = null;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class220 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field3988 == 0) {
                    if (var4.field3959 != null) {
                        method1909(-105, var4.field3959, arg2);
                    }
                    class47 var5 = (class47) class171.field3028.method1867((long) var4.field3933, true);
                    if (var5 != null) {
                        class41.method313(arg2, true, var5.field934);
                    }
                }
                if (arg2 == 0 && var4.field3970 != null) {
                    class206 var6 = new class206();
                    var6.field3614 = var4;
                    var6.field3616 = var4.field3970;
                    class69.method501(76, var6);
                }
                if (arg2 == 1 && var4.field4023 != null) {
                    if (var4.field3893 >= 0) {
                        class220 var7 = class233.method1667(var4.field3933, 22);
                        if (var7 == null || var7.field3959 == null || var4.field3893 >= var7.field3959.length || var7.field3959[var4.field3893] != var4) {
                            continue;
                        }
                    }
                    class206 var8 = new class206();
                    var8.field3614 = var4;
                    var8.field3616 = var4.field4023;
                    class69.method501(69, var8);
                }
            }
        }
        field4935++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Z")
    public final boolean method1910(boolean arg0) {
        field4939++;
        if (arg0) {
            return false;
        } else {
            return (this.field4936 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Z")
    public final boolean method1911(int arg0) {
        field4943++;
        if (arg0 == 1) {
            return (this.field4936 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Z")
    public final boolean method1912(byte arg0) {
        if (arg0 >= -90) {
            return false;
        } else {
            field4932++;
            return (this.field4936 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLqk;)V")
    public static final void method1913(byte arg0, class207 arg1) {
        field4942++;
        if (arg0 != 99) {
            field4937 = null;
        }
        if (class123.field2134 >= 2) {
            if (arg1.method1462(class79.field1441, true)) {
                class240.method1698(121);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class71.method511(23692, (class207) null, 0, class105.method757(false, new class207[] { class223.field4086, class262.method1815(var4, (byte) 66), class14.field198 }));
            }
            if (arg1.method1462(class285.field5001, true)) {
                class240.method1698(117);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class71.method511(23692, (class207) null, 0, class105.method757(false, new class207[] { class155.field2730, class262.method1815(var7, (byte) -117), class14.field198 }));
                class275.method1868((byte) 114);
                class240.method1698(106);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class71.method511(23692, (class207) null, 0, class105.method757(false, new class207[] { class236.field4350, class262.method1815(var9, (byte) 96), class14.field198 }));
            }
            if (arg1.method1462(class140.field2422, true)) {
                class71.method511(23692, (class207) null, 0, class105.method757(false, new class207[] { class17.field265, class262.method1815(class1.method5((byte) 93), (byte) 68) }));
            }
            if (arg1.method1462(class88.field1601, true)) {
                class60.method445(arg0 + 28537);
            }
            if (arg1.method1462(class183.field3270, true)) {
                class101.field1822.method1014(true);
            }
            if (arg1.method1462(class110.field1925, true)) {
                class101.field1822.method1026(arg0 ^ 0x63);
            }
            if (arg1.method1462(class177.field3196, true)) {
                class20.field326.method1637((byte) 123);
                class98.field1738.method896(true);
                class101.field1822.method1019(-11);
            }
            if (arg1.method1462(class62.field1128, true)) {
                class227.field4166 = true;
            }
            if (arg1.method1462(class119.field2063, true)) {
                class193.method1345(10, 25);
            }
            if (arg1.method1462(class83.field1536, true)) {
                class31.field633 = true;
            }
            if (arg1.method1462(class234.field4327, true)) {
                class31.field633 = false;
            }
            if (arg1.method1462(class95.field1692, true)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class133.field2303[var10].field2721[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.method1453(0, class133.field2317)) {
                class64.method463(arg1.method1464(-23886, 15).method1442(-56));
                class254.method1769(arg0 ^ 0x9C, class20.field326);
                class269.field4768 = false;
            }
            if (arg1.method1453(0, class215.field3826) && class164.field2903 != 0) {
                class2.method11(30767, arg1.method1464(-23886, 6).method1442(-66));
            }
            if (arg1.method1462(class237.field4367, true) && class164.field2903 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1453(arg0 - 99, class270.field4771)) {
                class199.field3484 = arg1.method1464(arg0 ^ 0xFFFFA2D1, 12).method1443(-128).method1442(-116);
                class71.method511(23692, (class207) null, 0, class105.method757(false, new class207[] { class78.field1422, class262.method1815(class199.field3484, (byte) 73) }));
            }
            if (arg1.method1462(class12.field166, true)) {
                class138.field2385 = true;
            }
            if (arg1.method1462(class204.field3589, true)) {
                if (class99.field1762) {
                    class99.field1762 = false;
                    class71.method511(23692, (class207) null, 0, class81.field1486);
                } else {
                    class99.field1762 = true;
                    class71.method511(23692, (class207) null, 0, class147.field2524);
                }
            }
            if (arg1.method1462(class112.field1945, true)) {
                if (class51.field997) {
                    class286.field5111.method1446(-60);
                    class51.field997 = false;
                } else {
                    class138.field2394.method1446(-122);
                    class51.field997 = true;
                }
            }
        }
        class170.field3008++;
        class261.field4645.method767(1, (byte) 61);
        class261.field4645.method1041(true, arg1.method1450((byte) -128) - 1);
        class261.field4645.method1040(true, arg1.method1464(-23886, 2));
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)Z")
    public final boolean method1914(byte arg0) {
        if (arg0 == 110) {
            field4944++;
            return (this.field4936 & 0x1) != 0;
        } else {
            return true;
        }
    }
}
