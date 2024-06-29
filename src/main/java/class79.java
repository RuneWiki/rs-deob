import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class79 extends class29 {

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "[Loc;")
    public class87[] field1903;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "Lqe;")
    public static class101 field1905 = new class101();

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "Lwb;")
    private static class130 field1913 = class26.method212("Login limit exceeded)3", -32376);

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "[Lwb;")
    public static class130[] field1915 = new class130[200];

    @OriginalMember(owner = "client!na", name = "qb", descriptor = "Lwb;")
    public static class130 field1921 = class26.method212("p11_full", -32376);

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
    public static int field1914 = 0;

    @OriginalMember(owner = "client!na", name = "ob", descriptor = "Lwb;")
    public static class130 field1919 = field1913;

    @OriginalMember(owner = "client!na", name = "sb", descriptor = "Lwb;")
    public static class130 field1923 = class26.method212("Lade Benutzeroberfl-=che )2 ", -32376);

    @OriginalMember(owner = "client!na", name = "nb", descriptor = "Lwb;")
    public static class130 field1918 = class26.method212("::fpsoff", -32376);

    @OriginalMember(owner = "client!na", name = "tb", descriptor = "I")
    public static int field1924 = -1;

    @OriginalMember(owner = "client!na", name = "ub", descriptor = "Lwb;")
    private static class130 field1925 = class26.method212("as it was used to break our rules)3", -32376);

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "Lwb;")
    private static class130 field1916 = class26.method212("glow1:", -32376);

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "Lwb;")
    public static class130 field1917 = field1916;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "Lwb;")
    public static class130 field1910 = field1925;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "Lwb;")
    private static class130 field1912 = class26.method212("slide:", -32376);

    @OriginalMember(owner = "client!na", name = "pb", descriptor = "Lwb;")
    public static class130 field1920 = field1912;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!na", name = "rb", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "Lda;")
    public static class20 field1911;

    @OriginalMember(owner = "client!na", name = "vb", descriptor = "Lfc;")
    public static class34 field1926;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "Lmc;")
    public static class75 field1909;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lk;III)[Lqd;", line = 8)
    public static final class100[] method606(class60 arg0, int arg1, int arg2, int arg3) {
        field1906++;
        if (arg3 != -21844) {
            field1923 = null;
        }
        return class24.method210(arg0, (byte) 125, arg1, arg2) ? class83.method619((byte) -32) : null;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V", line = 29)
    public static final void method607(int arg0) {
        field1908++;
        if (class46.field1246 != 0) {
            return;
        }
        class105.field2546[0] = client.field541;
        class3.field73[0] = 1004;
        class26.field757 = 1;
        if (class112.field2768 != -1) {
            class69.field1783 = -1;
            class92.field2214 = -1;
            class106.method798(503, 765, true, class112.field2768, class18.field483, class101.field2429, 0, 0, 0, -1, 0);
            class129.field3052 = class92.field2214;
            class52.field1364 = class69.field1783;
            return;
        }
        class40.method387((byte) -9);
        boolean var1 = false;
        class92.field2214 = -1;
        class69.field1783 = -1;
        if (class18.field483 > 4 && class101.field2429 > 4 && class18.field483 < 516 && class101.field2429 < 338) {
            if (class115.field2843 == -1) {
                class18.method154(1);
            } else {
                class106.method798(338, 516, true, class115.field2843, class18.field483, class101.field2429, 4, 0, 0, -1, 4);
            }
        }
        class129.field3052 = class92.field2214;
        class92.field2214 = -1;
        class52.field1364 = class69.field1783;
        class69.field1783 = -1;
        if (class18.field483 > 553 && class101.field2429 > 205 && class18.field483 < 743 && class101.field2429 < 466) {
            if (class105.field2538 != -1) {
                class106.method798(466, 743, true, class105.field2538, class18.field483, class101.field2429, 205, 1, 0, -1, 553);
            } else if (class71.field1814[class42.field1181] != -1) {
                class106.method798(466, 743, true, class71.field1814[class42.field1181], class18.field483, class101.field2429, 205, 1, 0, -1, 553);
            }
        }
        if (class92.field2214 != class61.field1565) {
            class20.field585 = true;
            class61.field1565 = class92.field2214;
        }
        if (class83.field1962 != class69.field1783) {
            class20.field585 = true;
            class83.field1962 = class69.field1783;
        }
        class69.field1783 = -1;
        class92.field2214 = -1;
        if (class18.field483 > 17 && class101.field2429 > 357 && class18.field483 < 496 && class101.field2429 < 453) {
            if (class22.field632 != -1) {
                class106.method798(453, 496, true, class22.field632, class18.field483, class101.field2429, 357, 2, 0, -1, 17);
            } else if (class6.field200 != -1) {
                class106.method798(453, 496, true, class6.field200, class18.field483, class101.field2429, 357, 3, 0, -1, 17);
            } else if (class101.field2429 < 434 && class18.field483 < 426) {
                class36.method324(class101.field2429 - 357, class18.field483 + -17, false);
            }
        }
        if ((class22.field632 != -1 || class6.field200 != -1) && class92.field2214 != class52.field1368) {
            class129.field3047 = true;
            class52.field1368 = class92.field2214;
        }
        if ((class22.field632 != -1 || class6.field200 != -1) && field1924 != class69.field1783) {
            field1924 = class69.field1783;
            class129.field3047 = true;
        }
        if (arg0 != -25634) {
            return;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class26.field757 - 1; var2++) {
                if (class3.field73[var2] < 1000 && class3.field73[var2 + 1] > 1000) {
                    class130 var3 = class105.field2546[var2];
                    class105.field2546[var2] = class105.field2546[var2 + 1];
                    class105.field2546[var2 + 1] = var3;
                    var1 = false;
                    int var4 = class3.field73[var2];
                    class3.field73[var2] = class3.field73[var2 + 1];
                    class3.field73[var2 + 1] = var4;
                    int var5 = class14.field409[var2];
                    class14.field409[var2] = class14.field409[var2 + 1];
                    class14.field409[var2 + 1] = var5;
                    int var6 = class47.field1269[var2];
                    class47.field1269[var2] = class47.field1269[var2 + 1];
                    class47.field1269[var2 + 1] = var6;
                    int var7 = class99.field2390[var2];
                    class99.field2390[var2] = class99.field2390[var2 + 1];
                    class99.field2390[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V", line = 169)
    public static void method608(byte arg0) {
        field1912 = null;
        field1916 = null;
        field1910 = null;
        field1918 = null;
        field1905 = null;
        field1920 = null;
        field1926 = null;
        field1913 = null;
        field1923 = null;
        field1925 = null;
        field1909 = null;
        field1919 = null;
        if (arg0 != -74) {
            field1913 = null;
        }
        field1915 = null;
        field1921 = null;
        field1911 = null;
        field1917 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Z", line = 202)
    public final boolean method609(int arg0, int arg1) {
        field1904++;
        if (arg0 > -103) {
            field1917 = null;
        }
        return this.field1903[arg1].field2064;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lk;Lk;IZ)V", line = 267)
    public class79(class60 arg0, class60 arg1, int arg2, boolean arg3) {
        class108 var5 = new class108();
        int var6 = arg0.method511(3, arg2);
        this.field1903 = new class87[var6];
        int[] var7 = arg0.method489(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method508(var7[var8], 0, arg2);
            class26 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class26 var12 = (class26) var5.method813(111); var12 != null; var12 = (class26) var5.method814((byte) -19)) {
                if (var12.field745 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method512(var11, -6151, 0);
                } else {
                    var13 = arg1.method512(0, -6151, var11);
                }
                var10 = new class26(var11, var13);
                var5.method819(var10, -78);
            }
            this.field1903[var7[var8]] = new class87(var9, var10);
        }
    }
}
