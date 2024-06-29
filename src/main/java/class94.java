import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class94 extends class241 {

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[I")
    public static int[] field1850 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field1855 = -1;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Loh;")
    public static class263 field1854 = class253.method1681(-122, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "Loh;")
    public static class263 field1858 = class253.method1681(-125, "::errortest");

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "Loh;")
    public static class263 field1860 = class253.method1681(-123, ")1a2)1m");

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "[I")
    public static int[] field1857;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZZ)V")
    public static final void method658(boolean arg0, boolean arg1) {
        class51.field1100 = 99;
        class181.field3291 = new int[104];
        field1861++;
        class232.field4062 = new int[104];
        class255.field4448 = new int[104];
        class35.field821 = new int[104];
        class86.field1727 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        if (!arg1) {
            field1855 = 119;
        }
        class103.field1967 = new byte[var2][104][104];
        class275.field4821 = new byte[var2][104][104];
        class86.field1730 = new byte[var2][104][104];
        class232.field4052 = new byte[var2][105][105];
        client.field2763 = new int[var2][105][105];
        class75.field1543 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static final void method659(int arg0) {
        field1851++;
        class77.method523(-26187);
        class7.method43(-6623);
        class180.method1207(-21024);
        class157.method1025((byte) 121);
        class44.method271(arg0 - 105);
        class205.method1417(0);
        class134.method884(-69);
        class18.method125(arg0 - 24402);
        class90.method634(false);
        class61.method372((byte) -91);
        class168.method1113((byte) -74);
        class62.method382(-52);
        if (arg0 != 104) {
            field1850 = null;
        }
        class6.method40(arg0 + 10391);
        class100.method682((byte) -67);
        ((class8) class270.field4764).method50(1);
        class190.field3414.method1470((byte) 45);
        class47.field1025.method593(-127);
        class173.field3139.method593(68);
        class59.field1222.method593(-108);
        class17.field389.method593(-123);
        class190.field3413.method593(-118);
        class142.field2609.method593(arg0 - 220);
        class53.field1128.method593(-115);
        class204.field3664.method593(-113);
        class185.field3342.method593(arg0 ^ 0x3A);
        class118.field2198.method593(arg0 ^ 0xFFFFFFEC);
        class182.field3303.method593(arg0 + 4);
        class102.field1946.method830(50);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)Z")
    public static final boolean method660(int arg0) {
        field1846++;
        if (arg0 != 10683) {
            method658(false, true);
        }
        return class177.field3242 == 0 ? class63.field1275.method1193(119) : true;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    public static final void method661(int arg0) {
        field1852++;
        if (class162.field2949 == 0) {
            return;
        }
        try {
            if ((++class178.field3274) > 2000) {
                if (class166.field3023 != null) {
                    class166.field3023.method809((byte) 112);
                    class166.field3023 = null;
                }
                if (class248.field4330 >= 1) {
                    class236.field4120 = -5;
                    class162.field2949 = 0;
                    return;
                }
                class178.field3274 = 0;
                class162.field2949 = 1;
                class248.field4330++;
                if (class182.field3298 == class118.field2201) {
                    class118.field2201 = class245.field4323;
                } else {
                    class118.field2201 = class182.field3298;
                }
            }
            if (class162.field2949 == 1) {
                class111.field2098 = class95.field1867.method1736(-108, class118.field2201, class32.field793);
                class162.field2949 = 2;
            }
            if (class162.field2949 == 2) {
                if (class111.field2098.field4114 == 2) {
                    throw new IOException();
                }
                if (class111.field2098.field4114 != 1) {
                    return;
                }
                class166.field3023 = new class125((Socket) class111.field2098.field4117, class95.field1867);
                class111.field2098 = null;
                class166.field3023.method806(0, class154.field2792.field3497, class154.field2792.field3469, -119);
                if (class30.field745 != null) {
                    class30.field745.method1575(0);
                }
                if (class93.field1843 != null) {
                    class93.field1843.method1575(0);
                }
                int var1 = class166.field3023.method800((byte) -126);
                if (class30.field745 != null) {
                    class30.field745.method1575(0);
                }
                if (class93.field1843 != null) {
                    class93.field1843.method1575(0);
                }
                if (var1 != 21) {
                    class162.field2949 = 0;
                    class236.field4120 = var1;
                    class166.field3023.method809((byte) 89);
                    class166.field3023 = null;
                    return;
                }
                class162.field2949 = 3;
            }
            if (class162.field2949 == 3) {
                if (class166.field3023.method803(-100) < 1) {
                    return;
                }
                class78.field1598 = new class263[class166.field3023.method800((byte) -126)];
                class162.field2949 = 4;
            }
            if (class162.field2949 == 4) {
                if (class166.field3023.method803(-91) >= class78.field1598.length * 8) {
                    class189.field3394.field3497 = 0;
                    class166.field3023.method810(0, -1, class78.field1598.length * 8, class189.field3394.field3469);
                    for (int var2 = 0; var2 < class78.field1598.length; var2++) {
                        class78.field1598[var2] = class233.method1565(37, class189.field3394.method1274(-778468320));
                    }
                    class162.field2949 = 0;
                    class236.field4120 = 21;
                    class166.field3023.method809((byte) 102);
                    class166.field3023 = null;
                }
            } else if (arg0 < 74) {
                method662((byte) 54);
            }
        } catch (IOException var3) {
            if (class166.field3023 != null) {
                class166.field3023.method809((byte) 118);
                class166.field3023 = null;
            }
            if (class248.field4330 < 1) {
                class248.field4330++;
                class178.field3274 = 0;
                if (class182.field3298 == class118.field2201) {
                    class118.field2201 = class245.field4323;
                } else {
                    class118.field2201 = class182.field3298;
                }
                class162.field2949 = 1;
            } else {
                class236.field4120 = -4;
                class162.field2949 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method662(byte arg0) {
        field1854 = null;
        if (arg0 == 109) {
            field1860 = null;
            field1858 = null;
            field1857 = null;
            field1850 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILue;)V")
    public static final void method663(int arg0, class86 arg1) {
        if (arg0 != 104) {
            method661(-72);
        }
        class39.field895 = arg1;
        field1848++;
    }
}
