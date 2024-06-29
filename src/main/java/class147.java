import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class147 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lwi;")
    private class330 field1949 = new class330(64);

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lwi;")
    public class330 field1959 = new class330(64);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Luu;")
    private class191 field1945;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Luu;")
    public class191 field1951;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Z")
    public static boolean field1952 = false;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lla;")
    public static class319 field1954 = new class319(48, -1);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[[I")
    public static int[][] field1958 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lof;")
    public static class446 field1960 = new class446("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 5)
    public final void method971(int arg0, int arg1) {
        class330 var3 = this.field1949;
        synchronized (this.field1949) {
            this.field1949.method2140(-118, arg0);
        }
        field1953++;
        class330 var4 = this.field1959;
        synchronized (this.field1959) {
            if (arg1 != -25104) {
                this.method971(-85, 9);
            }
            this.field1959.method2140(arg1 ^ 0x6274, arg0);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 22)
    public static final String method972(byte arg0, Throwable arg1) throws IOException {
        field1950++;
        String var3;
        if (arg1 instanceof class304) {
            class304 var2 = (class304) arg1;
            var3 = var2.field4440 + " | ";
            arg1 = var2.field4436;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg0 != 71) {
            return null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 96)
    public final void method973(byte arg0) {
        class330 var2 = this.field1949;
        synchronized (this.field1949) {
            if (arg0 != 99) {
                return;
            }
            this.field1949.method2135(0);
        }
        field1955++;
        class330 var3 = this.field1959;
        synchronized (this.field1959) {
            this.field1959.method2135(0);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZ)V", line = 113)
    public final void method974(int arg0, int arg1, boolean arg2) {
        this.field1949 = new class330(arg1);
        if (arg2) {
            field1960 = null;
        }
        field1946++;
        this.field1959 = new class330(arg0);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 125)
    public final void method975(byte arg0) {
        field1948++;
        class330 var2 = this.field1949;
        synchronized (this.field1949) {
            this.field1949.method2127((byte) 120);
        }
        class330 var3 = this.field1959;
        synchronized (this.field1959) {
            if (arg0 == 56) {
                this.field1959.method2127((byte) -68);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)Law;", line = 150)
    public final class53 method976(boolean arg0, int arg1) {
        field1947++;
        class330 var3 = this.field1949;
        class53 var4;
        synchronized (this.field1949) {
            var4 = (class53) this.field1949.method2133((long) arg1, (byte) 40);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field1945;
        byte[] var6;
        synchronized (this.field1945) {
            var6 = this.field1945.method1281(34, arg1, 73);
        }
        class53 var7 = new class53();
        var7.field748 = this;
        if (var6 != null) {
            var7.method394(new class164(var6), 0);
        }
        class330 var8 = this.field1949;
        synchronized (this.field1949) {
            this.field1949.method2131(var7, (long) arg1, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Liv;ILuu;Luu;)V", line = 794)
    public class147(class65 arg0, int arg1, class191 arg2, class191 arg3) {
        this.field1945 = arg2;
        this.field1951 = arg3;
        this.field1945.method1290(false, 34);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)V", line = 187)
    public static final void method977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1956++;
        int var7 = class20.field310;
        int[] var8 = class55.field778;
        class521.field7665 = 0;
        for (int var9 = 0; var9 < class333.field5187 + var7; var9++) {
            class258 var32 = null;
            class275 var33;
            if (var9 < var7) {
                var33 = class241.field3398[var8[var9]];
            } else {
                var33 = ((class24) class406.field6158.method1747((long) class224.field3114[var9 - var7], false)).field348;
                var32 = ((class17) var33).field274;
                if (var32.field3627 != null) {
                    var32 = var32.method1660(class288.field4208, (byte) 74);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field3853 >= 0 && (class206.field2765 == var33.field3824 || class56.field800.field1866 == var33.field1866)) {
                class126.method868(var33, arg4, arg1 >> 1, arg5 >> 1, var33.method179(10544), arg3, true);
                if (class247.field3449[0] >= 0) {
                    if (var33.field3862 != null && (var7 <= var9 || class137.field1831 == 0 || class137.field1831 == 3 || class137.field1831 == 1 && class411.method2533((byte) -44, ((class96) var33).field1393)) && class329.field5133 > class521.field7665) {
                        class329.field5138[class521.field7665] = class175.field2338.method564(84, var33.field3862) / 2;
                        class329.field5132[class521.field7665] = class247.field3449[0];
                        class329.field5136[class521.field7665] = class247.field3449[1];
                        class329.field5135[class521.field7665] = var33.field3816;
                        class329.field5137[class521.field7665] = var33.field3854;
                        class329.field5139[class521.field7665] = var33.field3879;
                        class329.field5134[class521.field7665] = var33.field3862;
                        class521.field7665++;
                    }
                    int var34 = arg2 + class247.field3449[1];
                    int var45;
                    if (var33.field3884 || var33.field3865 <= class393.field6017) {
                        var45 = var34 - Math.max(class175.field2338.field1201, class372.field5670[0].method305());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var9 < var7) {
                            class96 var37 = class241.field3398[var8[var9]];
                            var38 = var33.method1759(-82).field7138;
                            if (var37.field1388) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field3606;
                            if (var38 == -1) {
                                var38 = var33.method1759(arg0 ^ 0xFFFFA7A5).field7138;
                            }
                        }
                        class341[] var39 = class372.field5670;
                        if (var38 != -1) {
                            class341[] var40 = (class341[]) class359.field5512.method2133((long) var38, (byte) 21);
                            if (var40 == null) {
                                class252[] var41 = class252.method1638(class266.field3709, var38, 0);
                                if (var41 != null) {
                                    var40 = new class341[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class400.field6090.method774(var41[var42], true);
                                    }
                                    class359.field5512.method2131(var40, (long) var38, false);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class341 var43 = var39[0];
                        class341 var44 = var39[var36];
                        var45 = var34 - Math.max(class175.field2338.field1201, var43.method305());
                        int var46 = class247.field3449[0] + arg6 - (var43.method296() >> 1);
                        int var47 = var43.method296() * var33.field3898 / 255;
                        if (var33.field3898 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2201(var46, var45);
                        class400.field6090.method828(var46, var45, var46 + var47, var45 + var43.method305());
                        var44.method2201(var46, var45);
                        class400.field6090.method739(arg6, arg2, arg1 + arg6, arg2 + arg5);
                    }
                    var45 -= 2;
                    if (!var33.field3884) {
                        if (class393.field6017 < var33.field3876) {
                            class341 var48 = class406.field6163[var33.field3858 ? 2 : 0];
                            class341 var49 = class406.field6163[var33.field3858 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class17) {
                                var51 = var32.field3613;
                                if (var51 == -1) {
                                    var51 = var33.method1759(arg0 ^ 0x5850).field7184;
                                }
                            } else {
                                var51 = var33.method1759(-121).field7184;
                            }
                            if (var51 != -1) {
                                class341[] var52 = (class341[]) class172.field2318.method2133((long) var51, (byte) 54);
                                if (var52 == null) {
                                    class252[] var53 = class252.method1638(class266.field3709, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class341[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class400.field6090.method774(var53[var54], true);
                                        }
                                        class172.field2318.method2131(var52, (long) var51, false);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field3858 ? 2 : 0];
                                    var49 = var52[var33.field3858 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field3876 - class393.field6017;
                            int var58;
                            if (var55 > var33.field3904) {
                                int var56 = var55 - var33.field3904;
                                int var57 = var33.field3866 == 0 ? 0 : (var33.field3883 - var56) / var33.field3866 * var33.field3866;
                                var58 = var57 * var48.method296() / var33.field3883;
                            } else {
                                var58 = var48.method296();
                            }
                            int var59 = var48.method305();
                            var45 -= var59;
                            int var60 = class247.field3449[0] + (arg6 - (var48.method296() >> 1));
                            var48.method2201(var60, var45);
                            class400.field6090.method828(var60, var45, var58 + var60, var45 + var59);
                            var49.method2201(var60, var45);
                            class400.field6090.method739(arg6, arg2, arg1 + arg6, arg2 - -arg5);
                            var45 -= 2;
                        }
                        if (var9 < var7) {
                            class96 var62 = (class96) var33;
                            if (var62.field1392 != -1) {
                                var45 -= 25;
                                class407.field6181[var62.field1392].method2201(arg6 + class247.field3449[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field1425 != -1) {
                                var45 -= 25;
                                class296.field4380[var62.field1425].method2201(class247.field3449[0] + arg6 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field3598 >= 0 && class296.field4380.length > var32.field3598) {
                            var45 -= 25;
                            class341 var61 = class296.field4380[var32.field3598];
                            var61.method2201(arg6 + class247.field3449[0] - (var61.method296() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class96) {
                        int var69 = 0;
                        class519[] var70 = class361.field5531;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class519 var76 = var70[var71];
                            if (var76 != null && var76.field7630 == 1 && class224.field3114[var9 - var7] == var76.field7629) {
                                class341 var77 = class389.field5944[var76.field7626];
                                if (var77.method305() > var69) {
                                    var69 = var77.method305();
                                }
                                if (class393.field6017 % 20 < 10) {
                                    var77.method2201(arg6 + class247.field3449[0] - 12, -var77.method305() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class519[] var64 = class361.field5531;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class519 var67 = var64[var65];
                            if (var67 != null && var67.field7630 == 10 && var8[var9] == var67.field7629) {
                                class341 var68 = class389.field5944[var67.field7626];
                                if (var63 < var68.method305()) {
                                    var63 = var68.method305();
                                }
                                var68.method2201(class247.field3449[0] + arg6 - 12, -var68.method305() + var45);
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (var33.field3852[var73] > class393.field6017) {
                            int var74 = var33.method179(10544) / 2;
                            class126.method868(var33, arg4, arg1 >> 1, arg5 >> 1, var74, arg3, true);
                            if (class247.field3449[0] > -1) {
                                int var75 = class493.field7268[var33.field3891[var73]].method296();
                                if (var73 == 1) {
                                    class247.field3449[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class247.field3449[1] -= 10;
                                    class247.field3449[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class247.field3449[1] -= 10;
                                    class247.field3449[0] += var75 - 9;
                                }
                                class493.field7268[var33.field3891[var73]].method2201(arg6 + class247.field3449[0] - (var75 >> 1), class247.field3449[1] + arg2 - 12);
                                class536.field7867.method1714(Integer.toString(var33.field3897[var73]), false, -1, class247.field3449[1] + arg2 + 3, 0, class247.field3449[0] + arg6 - 1);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -22590) {
            return;
        }
        for (int var10 = 0; var10 < class178.field2376; var10++) {
            int var28 = class539.field7904[var10];
            class275 var29;
            if (var28 >= 2048) {
                var29 = ((class24) class406.field6158.method1747((long) (var28 - 2048), false)).field348;
            } else {
                var29 = class241.field3398[var28];
            }
            int var30 = class225.field3118[var10];
            class275 var31;
            if (var30 >= 2048) {
                var31 = ((class24) class406.field6158.method1747((long) (var30 - 2048), false)).field348;
            } else {
                var31 = class241.field3398[var30];
            }
            class294.method1879(arg6, var31, 64, arg4, var29, arg1, arg3, arg5, --var29.field3900, arg2);
        }
        int var11 = class175.field2338.field1201 + class175.field2338.field1191 + 2;
        for (int var12 = 0; var12 < class521.field7665; var12++) {
            int var13 = class329.field5132[var12];
            int var14 = class329.field5136[var12];
            int var15 = class329.field5138[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((class329.field5136[var27] - var11) < (var14 + 2) && (var14 - var11) < (class329.field5136[var27] + 2) && (var13 - var15) < (class329.field5138[var27] + class329.field5132[var27]) && class329.field5132[var27] - class329.field5138[var27] < var13 - -var15 && class329.field5136[var27] - var11 < var14) {
                        var16 = true;
                        var14 = class329.field5136[var27] - var11;
                    }
                }
            }
            class329.field5136[var12] = var14;
            String var17 = class329.field5134[var12];
            if (class332.field5174 == 0) {
                int var18 = 16776960;
                if (class329.field5135[var12] < 6) {
                    var18 = class222.field3104[class329.field5135[var12]];
                }
                if (class329.field5135[var12] == 6) {
                    var18 = (class206.field2765 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class329.field5135[var12] == 7) {
                    var18 = (class206.field2765 % 20) >= 10 ? 65535 : 255;
                }
                if (class329.field5135[var12] == 8) {
                    var18 = (class206.field2765 % 20) < 10 ? 45056 : 8454016;
                }
                if (class329.field5135[var12] == 9) {
                    int var19 = 150 - class329.field5139[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = var19 * 5 + 65280 - 500;
                    }
                }
                if (class329.field5135[var12] == 10) {
                    int var20 = 150 - class329.field5139[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 + 500 - (var20 * 5);
                    }
                }
                if (class329.field5135[var12] == 11) {
                    int var21 = 150 - class329.field5139[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class329.field5137[var12] == 0) {
                    class199.field2653.method1714(var17, false, var22, arg2 + var14, -16777216, arg6 + var13);
                }
                if (class329.field5137[var12] == 1) {
                    class199.field2653.method1723(var22, (byte) -11, class206.field2765, var17, arg6 + var13, arg2 + var14, -16777216);
                }
                if (class329.field5137[var12] == 2) {
                    class199.field2653.method1708(arg6 + var13, -16777216, var17, var22, arg2 + var14, arg0 ^ 0xFFFFF63F, class206.field2765);
                }
                if (class329.field5137[var12] == 3) {
                    class199.field2653.method1717(arg2 + var14, var17, (byte) -105, arg6 + var13, -16777216, var22, 150 - class329.field5139[var12], class206.field2765);
                }
                if (class329.field5137[var12] == 4) {
                    int var23 = (150 - class329.field5139[var12]) * (class175.field2338.method564(-80, var17) + 100) / 150;
                    class400.field6090.method828(arg6 + var13 - 50, arg2, arg6 + var13 + 50, arg2 + arg5);
                    class199.field2653.method1712((byte) 66, var17, var22, -16777216, arg6 + var13 + 50 - var23, arg2 + var14);
                    class400.field6090.method739(arg6, arg2, arg1 + arg6, arg2 + arg5);
                }
                if (class329.field5137[var12] == 5) {
                    int var24 = 150 - class329.field5139[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class175.field2338.field1201 + class175.field2338.field1191;
                    class400.field6090.method828(arg6, arg2 + var14 - (var26 - -1), arg6 - -arg1, arg2 + var14 + 5);
                    class199.field2653.method1714(var17, false, var22, arg2 + var14 + var25, -16777216, arg6 + var13);
                    class400.field6090.method739(arg6, arg2, arg6 + arg1, arg2 - -arg5);
                }
            } else {
                class199.field2653.method1714(var17, false, -256, arg2 + var14, -16777216, arg6 + var13);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 775)
    public static void method978(int arg0) {
        if (arg0 != -24081) {
            method977(-87, -76, -123, -114, 6, -6, -114);
        }
        field1960 = null;
        field1954 = null;
        field1958 = null;
    }
}
