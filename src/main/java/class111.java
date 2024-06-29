import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class111 implements class67 {

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lie;")
    private class53 field2735 = new class53();

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    private int field2750 = 128;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "D")
    private double field2753 = 1.0D;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    private int field2760 = 0;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Ljd;")
    private class58 field2749;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    private int field2754;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[Lje;")
    private class59[] field2733;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Lke;")
    public static class65 field2742 = class1.method17("l", -128);

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lke;")
    private static class65 field2740 = class1.method17("World", -113);

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lke;")
    public static class65 field2734 = field2740;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lke;")
    public static class65 field2730 = class1.method17("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -118);

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lke;")
    private static class65 field2738 = class1.method17("Login attempts exceeded)3", -115);

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lke;")
    private static class65 field2731 = class1.method17("Press (Wchange your password(W on front page)3", -125);

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lke;")
    public static class65 field2745 = field2738;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field2751 = 1;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field2746 = 0;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "Lke;")
    public static class65 field2756 = class1.method17(" ", -122);

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lke;")
    public static class65 field2747 = field2731;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Lg;")
    public static class39 field2759 = new class39(new byte[5000]);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)I", line = 7)
    public static final int method906(int arg0, boolean arg1) {
        field2732++;
        class78 var2 = method908((byte) 43, arg0);
        if (!arg1) {
            field2756 = null;
        }
        int var3 = var2.field2094;
        int var4 = var2.field2079;
        int var5 = var2.field2068;
        int var6 = class130.field3156[var4 - var5];
        return var6 & class32.field843[var3] >> var5;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 31)
    public static void method907(int arg0) {
        field2730 = null;
        field2738 = null;
        field2731 = null;
        field2756 = null;
        field2734 = null;
        field2740 = null;
        field2759 = null;
        field2745 = null;
        field2747 = null;
        if (arg0 != -1) {
            method909(true);
        }
        field2742 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(BI)Lna;", line = 61)
    private static final class78 method908(byte arg0, int arg1) {
        if (arg0 != 43) {
            field2738 = null;
        }
        class78 var2 = (class78) class1.field26.method833((byte) -53, (long) arg1);
        field2757++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class21.field511.method477(14, (byte) 127, arg1);
        class78 var4 = new class78();
        if (var3 != null) {
            var4.method686(0, new class39(var3));
        }
        class1.field26.method836((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 85)
    public static final void method909(boolean arg0) {
        field2728++;
        int var1 = class58.field1575.method649(35, 8);
        if (class72.field1895 > var1) {
            for (int var2 = var1; var2 < class72.field1895; var2++) {
                class75.field2014[field2746++] = class10.field187[var2];
            }
        }
        if (!arg0) {
            return;
        }
        if (var1 > class72.field1895) {
            throw new RuntimeException("gppov1");
        }
        class72.field1895 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class10.field187[var3];
            class114 var5 = class52.field1324[var4];
            int var6 = class58.field1575.method649(84, 1);
            if (var6 == 0) {
                class10.field187[class72.field1895++] = var4;
                var5.field1110 = class76.field2028;
            } else {
                int var7 = class58.field1575.method649(111, 2);
                if (var7 == 0) {
                    class10.field187[class72.field1895++] = var4;
                    var5.field1110 = class76.field2028;
                    class46.field1211[class75.field2019++] = var4;
                } else if (var7 == 1) {
                    class10.field187[class72.field1895++] = var4;
                    var5.field1110 = class76.field2028;
                    int var8 = class58.field1575.method649(43, 3);
                    var5.method366(var8, !arg0, false);
                    int var9 = class58.field1575.method649(100, 1);
                    if (var9 == 1) {
                        class46.field1211[class75.field2019++] = var4;
                    }
                } else if (var7 == 2) {
                    class10.field187[class72.field1895++] = var4;
                    var5.field1110 = class76.field2028;
                    int var10 = class58.field1575.method649(78, 3);
                    var5.method366(var10, !arg0, true);
                    int var11 = class58.field1575.method649(60, 3);
                    var5.method366(var11, !arg0, true);
                    int var12 = class58.field1575.method649(62, 1);
                    if (var12 == 1) {
                        class46.field1211[class75.field2019++] = var4;
                    }
                } else if (var7 == 3) {
                    class75.field2014[field2746++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Z", line = 195)
    public final boolean method570(byte arg0, int arg1) {
        field2741++;
        int var3 = -20 % ((arg0 - 68) / 36);
        return this.field2733[arg1].field1598;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)I", line = 213)
    public final int method571(int arg0, byte arg1) {
        if (arg1 == -93) {
            field2729++;
            return this.field2733[arg0] == null ? 0 : this.field2733[arg0].field1603;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 239)
    public static final void method910(int arg0) {
        field2743++;
        while (class58.field1575.method647(class54.field1392, false) >= 26) {
            int var1 = class58.field1575.method649(105, 14);
            if (var1 == 16383) {
                break;
            }
            boolean var2 = false;
            if (class31.field817[var1] == null) {
                var2 = true;
                class31.field817[var1] = new class129();
            }
            class129 var3 = class31.field817[var1];
            class56.field1464[class113.field2818++] = var1;
            var3.field1110 = class76.field2028;
            int var4 = class58.field1575.method649(arg0 + 84, 1);
            var3.field3126 = class74.method654(class58.field1575.method649(81, 13), 9);
            int var5 = class58.field1575.method649(51, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class58.field1575.method649(100, 1);
            if (var6 == 1) {
                class46.field1211[class75.field2019++] = var1;
            }
            int var7 = class58.field1575.method649(arg0 ^ 0x51, 5);
            int var8 = class33.field870[class58.field1575.method649(113, 3)];
            var3.field1077 = var3.field3126.field1417;
            if (var2) {
                var3.field1081 = var8;
            }
            var3.field1055 = var3.field3126.field1413;
            var3.field1116 = var3.field3126.field1426;
            var3.field1068 = var3.field3126.field1434;
            var3.field1120 = var3.field3126.field1416;
            var3.field1059 = var3.field3126.field1442;
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field1047 = var3.field3126.field1424;
            var3.field1069 = var3.field3126.field1406;
            var3.field1064 = var3.field3126.field1433;
            if (var3.field1055 == 0) {
                var3.field1081 = 0;
            }
            var3.method362(var4 == 1, class32.field833.field1097[0] + var7, (byte) 115, class32.field833.field1105[0] + var5);
        }
        if (arg0 != 5) {
            field2740 = null;
        }
        class58.field1575.method643((byte) -70);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Z", line = 317)
    public final boolean method569(int arg0, int arg1) {
        if (arg0 != 6494) {
            field2747 = null;
        }
        field2748++;
        return this.field2750 == 64;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 341)
    public final void method911(byte arg0) {
        field2752++;
        for (int var2 = 0; var2 < this.field2733.length; var2++) {
            if (this.field2733[var2] != null) {
                this.field2733[var2].method500();
            }
        }
        this.field2735 = new class53();
        this.field2760 = this.field2754;
        if (arg0 != 13) {
            method908((byte) 10, 93);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Ljd;Ljd;IDI)V", line = 515)
    public class111(class58 arg0, class58 arg1, int arg2, double arg3, int arg4) {
        this.field2753 = arg3;
        this.field2749 = arg1;
        this.field2754 = arg2;
        this.field2760 = this.field2754;
        this.field2750 = arg4;
        int[] var7 = arg0.method478(false, 0);
        int var8 = var7.length;
        this.field2733 = new class59[arg0.method479((byte) 53, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class39 var10 = new class39(arg0.method477(0, (byte) 127, var7[var9]));
            this.field2733[var7[var9]] = new class59(var10);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(BI)V", line = 372)
    public final void method912(byte arg0, int arg1) {
        int var3 = 0;
        if (arg0 != -127) {
            this.field2735 = null;
        }
        while (this.field2733.length > var3) {
            class59 var4 = this.field2733[var3];
            if (var4 != null && var4.field1595 != 0 && var4.field1604) {
                var4.method499(arg1);
                var4.field1604 = false;
            }
            var3++;
        }
        field2744++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(DI)V", line = 416)
    public final void method913(double arg0, int arg1) {
        field2739++;
        if (arg1 != -1) {
            this.method912((byte) 37, 115);
        }
        this.field2753 = arg0;
        this.method911((byte) 13);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[I", line = 433)
    public final int[] method568(int arg0, byte arg1) {
        field2755++;
        class59 var3 = this.field2733[arg0];
        int var4 = 22 % ((arg1 - 59) / 50);
        if (var3 != null) {
            if (var3.field1600 != null) {
                this.field2735.method427(var3, -79);
                var3.field1604 = true;
                return var3.field1600;
            }
            boolean var5 = var3.method501(this.field2753, this.field2750, this.field2749);
            if (var5) {
                if (this.field2760 == 0) {
                    class59 var6 = (class59) this.field2735.method418((byte) -19);
                    var6.method500();
                } else {
                    this.field2760--;
                }
                this.field2735.method427(var3, 100);
                var3.field1604 = true;
                return var3.field1600;
            }
        }
        return null;
    }
}
