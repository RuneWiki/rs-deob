import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 extends class40 {

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public int field801 = 0;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "[I")
    public int[] field800 = new int[5];

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "[Lcb;")
    public class15[] field803 = new class15[5];

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lec;")
    public static class28 field791 = class28.method210(-46, "Accept challenge @whi@");

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Lec;")
    public static class28 field793 = class28.method210(-46, "Connection timed out");

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Z")
    public static boolean field794 = false;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "Lec;")
    public static class28 field795 = class28.method210(-46, " more options");

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "Z")
    public static boolean field820 = false;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field812 = 0;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lec;")
    public static class28 field792 = class28.method210(-46, "Please try using a different world)3");

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "Lec;")
    public static class28 field807 = class28.method210(-46, "Import ready");

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    public static int field822 = 2;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "[I")
    public static int[] field825 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "[I")
    public static int[] field818 = new int[2000];

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "I")
    public static int field829 = 0;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "Lu;")
    public class115 field816;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "Lfe;")
    public class36 field802;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "Li;")
    public class48 field821;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "Lka;")
    public class61 field806;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "Lkb;")
    public class62 field819;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "Lna;")
    public class79 field815;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "Lba;")
    public class8 field823;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "Z")
    public boolean field796;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "Z")
    public boolean field809;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Z")
    public boolean field813;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[BZ)Lec;")
    public static final class28 method297(int arg0, int arg1, byte[] arg2, boolean arg3) {
        class28 var4 = new class28();
        var4.field606 = arg0;
        if (arg3) {
            field794 = false;
        }
        field814++;
        var4.field628 = new byte[arg0];
        class84.method637(arg2, arg1, var4.field628, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(III)V")
    public class36(int arg0, int arg1, int arg2) {
        this.field797 = arg1;
        this.field810 = this.field804 = arg0;
        this.field811 = arg2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method298(int arg0) {
        field817++;
        if (class80.field1847 == 0) {
            return;
        }
        int var1 = 0;
        if (arg0 != -23325) {
            field791 = null;
        }
        if (class21.field482 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class117.field2500[var2] != null) {
                class28 var3 = class125.field2705[var2];
                int var4 = class22.field501[var2];
                if (var3 != null && var3.method208(class88.field1961, false)) {
                    var3 = var3.method218(5, false);
                }
                if (var3 != null && var3.method208(class63.field1394, false)) {
                    var3 = var3.method218(5, false);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class126.field2735 == 0 || class126.field2735 == 1 && class27.method200((byte) 25, var3))) {
                    int var5 = 329 - var1 * 13;
                    var1++;
                    if (class23.field530 > 4 && var5 - 10 < class88.field1960 + -4 && var5 + 3 >= class88.field1960 + -4) {
                        int var6 = class124.field2697.method437(class68.method537(arg0 + 23326, new class28[] { class18.field373, var3, class117.field2500[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (class23.field530 < var6 + 4) {
                            if (class32.field691 >= 1) {
                                client.method124(-7765, class68.method537(1, new class28[] { class20.field444, var3 }), 0, 0, 2036, 0);
                                class127.field2751++;
                            }
                            class118.field2517++;
                            class94.field2065++;
                            client.method124(-7765, class68.method537(1, new class28[] { class32.field687, var3 }), 0, 0, 2045, 0);
                            client.method124(-7765, class68.method537(arg0 ^ -23326, new class28[] { class61.field1374, var3 }), 0, 0, 2013, 0);
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var4 == 5 || var4 == 6) && class126.field2735 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
    public static final void method299(byte arg0) {
        class46.method373(0);
        field827++;
        class65.method520(false);
        class90.method658(1188);
        class34.method289(arg0 ^ 0xFFFFFF89);
        class122.method924(1);
        client.method116(false);
        class110.method755(false);
        class28.method204(10);
        class76.method580(-28046);
        class12.method63(arg0 - 117);
        class28.method220((byte) 50);
        class48.method384(true);
        ((class3) class60.field1331).method18(arg0 ^ 0x60A8);
        class56.field1285.method929(0);
        class4.field61.method929(arg0 ^ 0x76);
        class55.field1258.method929(arg0 - 118);
        class117.field2491.method929(arg0 ^ 0x76);
        class7.field101.method929(0);
        class61.field1344.method929(0);
        class95.field2094.method929(0);
        if (arg0 == 118) {
            class46.field1044.method929(0);
            class109.field2309.method929(0);
            class72.field1596.method929(arg0 ^ 0x76);
            client.field380.method929(0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V")
    public static void method300(byte arg0) {
        field792 = null;
        field793 = null;
        field825 = null;
        field807 = null;
        field795 = null;
        field791 = null;
        int var1 = 45 / ((arg0 + 83) / 34);
        field818 = null;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
    public static final void method301(byte arg0) {
        int var1 = 0;
        if (arg0 < 35) {
            field822 = 9;
        }
        while (var1 < class64.field1430) {
            int var2 = class64.field1429[var1];
            class90 var3 = class88.field1956[var2];
            if (var3 != null) {
                class119.method881(var3.field1996.field2235, var3, (byte) -32);
            }
            var1++;
        }
        field789++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method302(int arg0) {
        field798++;
        if (class79.field1839 != 0) {
            return;
        }
        int var1 = class40.field868;
        if (class95.field2097 == 1 && class96.field2143 >= 516 && class32.field680 >= 160 && class96.field2143 <= 765 && class32.field680 <= 205) {
            var1 = 0;
        }
        if (class13.field243) {
            if (var1 != 1) {
                int var6 = class23.field530;
                int var7 = class88.field1960;
                if (class75.field1671 == 0) {
                    var6 -= 4;
                    var7 -= 4;
                }
                if (class75.field1671 == 1) {
                    var7 -= 205;
                    var6 -= 553;
                }
                if (class75.field1671 == 2) {
                    var7 -= 357;
                    var6 -= 17;
                }
                if (class61.field1345 - 10 > var6 || class61.field1345 + class31.field661 + 10 < var6 || var7 < class68.field1536 - 10 || class68.field1536 + class112.field2407 + 10 < var7) {
                    if (class75.field1671 == 1) {
                        class30.field646 = true;
                    }
                    class13.field243 = false;
                    if (class75.field1671 == 2) {
                        class95.field2092 = true;
                    }
                }
            }
            if (var1 == 1) {
                int var8 = class61.field1345;
                int var9 = class31.field661;
                int var10 = class68.field1536;
                int var11 = class96.field2143;
                int var12 = -1;
                int var13 = class32.field680;
                if (class75.field1671 == 0) {
                    var11 -= 4;
                    var13 -= 4;
                }
                if (class75.field1671 == 1) {
                    var11 -= 553;
                    var13 -= 205;
                }
                if (class75.field1671 == 2) {
                    var13 -= 357;
                    var11 -= 17;
                }
                for (int var14 = 0; var14 < class114.field2435; var14++) {
                    int var15 = (class114.field2435 - var14 - 1) * 15 + var10 + 31;
                    if (var8 < var11 && var11 < var8 + var9 && var15 - 13 < var13 && var13 < var15 + 3) {
                        var12 = var14;
                    }
                }
                if (var12 != -1) {
                    class105.method727(var12, (byte) -1);
                }
                if (class75.field1671 == 1) {
                    class30.field646 = true;
                }
                class13.field243 = false;
                if (class75.field1671 == 2) {
                    class95.field2092 = true;
                }
            }
        } else {
            if (var1 == 1 && class114.field2435 > 0) {
                int var2 = class74.field1636[class114.field2435 - 1];
                if (var2 == 56 || var2 == 24 || var2 == 23 || var2 == 5 || var2 == 47 || var2 == 20 || var2 == 39 || var2 == 3 || var2 == 41 || var2 == 43 || var2 == 8 || var2 == 1003) {
                    int var3 = class49.field1148[class114.field2435 - 1];
                    int var4 = class46.field1017[class114.field2435 - 1];
                    class78 var5 = class5.method27(0, var4);
                    if (var5.field1768 || var5.field1751) {
                        class65.field1490 = var4;
                        class78.field1744 = 0;
                        class87.field1933 = var3;
                        class98.field2173 = class32.field680;
                        class94.field2074 = class96.field2143;
                        class79.field1839 = 2;
                        if (var4 >> 16 == class40.field860) {
                            class79.field1839 = 1;
                        }
                        class5.field90 = false;
                        if (var4 >> 16 == class110.field2325) {
                            class79.field1839 = 3;
                        }
                        return;
                    }
                }
            }
            if (var1 == 1 && (class9.field175 == 1 || class56.method454((byte) -63, class114.field2435 - 1)) && class114.field2435 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class114.field2435 > 0) {
                class105.method727(class114.field2435 - 1, (byte) -1);
            }
            if (var1 == 2 && class114.field2435 > 0) {
                class15.method83((byte) 116);
            }
        }
        if (arg0 > -83) {
            method302(43);
        }
    }
}
