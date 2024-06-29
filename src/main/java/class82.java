import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 extends Canvas {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field2033;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Loc;")
    public static class99 field2030 = class48.method402((byte) -104, "gleiten:");

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2029 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field2041 = 0;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Loc;")
    public static class99 field2042 = class48.method402((byte) -104, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Loc;")
    public static class99 field2044 = class48.method402((byte) -104, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field2043 = 0;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lhe;")
    public static class54 field2036;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[[B")
    public static byte[][] field2038;

    @OriginalMember(owner = "client!lf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2033.update(arg0);
        field2037++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lc;")
    public static final class18 method707(int arg0, int arg1) {
        field2032++;
        if (arg0 != 12854) {
            field2041 = -40;
        }
        class18 var2 = (class18) class79.field1947.method997(arg0 - 12855, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class60.field1617.method903(14, (byte) -128, arg1);
        class18 var4 = new class18();
        if (var3 != null) {
            var4.method177(arg0 - 12728, new class57(var3));
        }
        class79.field1947.method993((byte) 100, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2034++;
        this.field2033.paint(arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static final void method708(byte arg0) {
        field2039++;
        if (class105.field2593 == 0) {
            return;
        }
        int var1 = 0;
        if (class67.field1719 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class81.field2003[var2] != null) {
                int var3 = class104.field2527[var2];
                class99 var4 = class137.field3420[var2];
                if (var4 != null && var4.method851(0, class33.field801)) {
                    var4 = var4.method813(5, (byte) 115);
                }
                if (var4 != null && var4.method851(0, class95.field2311)) {
                    var4 = var4.method813(5, (byte) 95);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class84.field2096 == 0 || class84.field2096 == 1 && class2.method7(var4, (byte) -51))) {
                    int var5 = 329 - var1 * 13;
                    if (class148.field3656 > 4 && class80.field1969 - 4 > var5 + -10 && class80.field1969 - 4 <= var5 - -3) {
                        int var6 = client.field529.method974(class20.method189(new class99[] { class73.field1843, class27.field680, var4, class81.field2003[var2] }, 97)) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (class148.field3656 < var6 + 4) {
                            if (class57.field1483 >= 1) {
                                class136.method1132(0, class20.method189(new class99[] { class144.field3598, var4 }, 83), 2037, 0, (byte) 21, class84.field2084, 0);
                                class108.field2632++;
                            }
                            class53.field1265++;
                            class5.field119++;
                            class136.method1132(0, class20.method189(new class99[] { class144.field3598, var4 }, 97), 2026, 0, (byte) 21, class47.field1155, 0);
                            class136.method1132(0, class20.method189(new class99[] { class144.field3598, var4 }, 29), 2016, 0, (byte) 21, class95.field2308, 0);
                        }
                    }
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class84.field2096 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
        if (arg0 != -95) {
            field2042 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method709(int arg0) {
        field2044 = null;
        field2038 = null;
        field2029 = null;
        field2042 = null;
        field2036 = null;
        field2030 = null;
        if (arg0 > -29) {
            field2041 = -123;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIZ[I)V")
    public static final void method710(int arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        class57.field1493.method874((byte) -96);
        class108.field2654.method216(0, 0);
        if (arg3) {
            if (arg4[arg1] != -1) {
                if (arg1 == 0) {
                    class111.field2787.method216(22, 10);
                }
                if (arg1 == 1) {
                    class118.field2909.method216(54, 8);
                }
                if (arg1 == 2) {
                    class118.field2909.method216(82, 8);
                }
                if (arg1 == 3) {
                    class145.field3617.method216(110, 8);
                }
                if (arg1 == 4) {
                    class128.field3138.method216(153, 8);
                }
                if (arg1 == 5) {
                    class128.field3138.method216(181, 8);
                }
                if (arg1 == 6) {
                    class95.field2314.method216(209, 9);
                }
            }
            if (arg4[0] != -1 && arg2 != 0) {
                class126.field3055[0].method216(29, 13);
            }
            if (arg4[1] != -1 && arg2 != 1) {
                class126.field3055[1].method216(53, 11);
            }
            if (arg4[2] != -1 && arg2 != 2) {
                class126.field3055[2].method216(82, 11);
            }
            if (arg4[3] != -1 && arg2 != 3) {
                class126.field3055[3].method216(115, 12);
            }
            if (arg4[4] != -1 && arg2 != 4) {
                class126.field3055[4].method216(153, 13);
            }
            if (arg4[5] != -1 && arg2 != 5) {
                class126.field3055[5].method216(180, 11);
            }
            if (arg4[6] != -1 && arg2 != 6) {
                class126.field3055[6].method216(208, 13);
            }
        }
        class9.field236.method874((byte) 41);
        field2031++;
        class105.field2607.method216(0, 0);
        if (arg3) {
            if (arg4[arg1] != -1) {
                if (arg1 == 7) {
                    class111.field2757.method216(42, 0);
                }
                if (arg1 == 8) {
                    class2.field33.method216(74, 0);
                }
                if (arg1 == 9) {
                    class2.field33.method216(102, 0);
                }
                if (arg1 == 10) {
                    class114.field2850.method216(130, 1);
                }
                if (arg1 == 11) {
                    class5.field121.method216(173, 0);
                }
                if (arg1 == 12) {
                    class5.field121.method216(201, 0);
                }
                if (arg1 == 13) {
                    class60.field1607.method216(229, 0);
                }
            }
            if (arg4[8] != -1 && arg2 != 8) {
                class126.field3055[7].method216(74, 2);
            }
            if (arg4[9] != -1 && arg2 != 9) {
                class126.field3055[8].method216(102, 3);
            }
            if (arg4[10] != -1 && arg2 != 10) {
                class126.field3055[9].method216(137, 4);
            }
            if (arg4[11] != -1 && arg2 != 11) {
                class126.field3055[10].method216(174, 2);
            }
            if (arg4[12] != -1 && arg2 != 12) {
                class126.field3055[11].method216(201, 2);
            }
            if (arg4[13] != -1 && arg2 != 13) {
                class126.field3055[12].method216(226, 2);
            }
        }
        try {
            Graphics var5 = class5.field99.getGraphics();
            class57.field1493.method109(516, 160, 0, var5);
            if (arg0 == 1619) {
                class9.field236.method109(496, 466, 0, var5);
            }
        } catch (Exception var6) {
            class5.field99.repaint();
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class82(Component arg0) {
        this.field2033 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IJ)V")
    public static final void method711(int arg0, long arg1) {
        if (arg0 < 19) {
            field2038 = null;
        }
        field2035++;
        if (arg1 == 0L) {
            return;
        }
        if (class36.field922 >= 100) {
            class48.method400(0, class89.field2204, -34, class137.field3407);
            return;
        }
        class99 var3 = class74.method671(-123, arg1).method849(-107);
        for (int var4 = 0; var4 < class36.field922; var4++) {
            if (class9.field229[var4] == arg1) {
                class48.method400(0, class20.method189(new class99[] { var3, class60.field1611 }, 124), 99, class137.field3407);
                return;
            }
        }
        for (int var5 = 0; var5 < class9.field230; var5++) {
            if (class88.field2185[var5] == arg1) {
                class48.method400(0, class20.method189(new class99[] { class33.field797, var3, class83.field2074 }, 33), 118, class137.field3407);
                return;
            }
        }
        if (var3.method829(class69.field1770.field3034, 4)) {
            return;
        }
        class9.field229[class36.field922++] = arg1;
        class104.field2540++;
        class52.field1243 = true;
        class134.field3276.method869((byte) 11, 167);
        class134.field3276.method490(true, arg1);
    }
}
