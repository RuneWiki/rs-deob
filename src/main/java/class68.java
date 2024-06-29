import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class68 extends class110 {

    @OriginalMember(owner = "client!jf", name = "qb", descriptor = "I")
    public int field1668 = 1000;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "Lmb;")
    public static class84 field1648 = class79.method672(true, "p11_full");

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
    public static int field1654 = 3;

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
    public static int field1657 = 0;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field1644 = 0;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Lmb;")
    public static class84 field1645 = null;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "Lmb;")
    public static class84 field1652 = class79.method672(true, "::errortest");

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lmb;")
    public static class84 field1653 = class79.method672(true, ")1");

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "Lmb;")
    public static class84 field1658 = null;

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "[I")
    public static int[] field1661 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
    public static volatile int field1646 = 0;

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "Lmb;")
    private static class84 field1664 = class79.method672(true, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
    public static int field1660 = 50;

    @OriginalMember(owner = "client!jf", name = "nb", descriptor = "Z")
    public static boolean field1665 = true;

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "[I")
    public static int[] field1656 = new int[100];

    @OriginalMember(owner = "client!jf", name = "ob", descriptor = "Lmb;")
    private static class84 field1666 = class79.method672(true, "No reply from loginserver)3");

    @OriginalMember(owner = "client!jf", name = "pb", descriptor = "Lmb;")
    public static class84 field1667 = field1664;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "Lmb;")
    public static class84 field1647 = field1666;

    @OriginalMember(owner = "client!jf", name = "rb", descriptor = "Lmb;")
    public static class84 field1669 = class79.method672(true, "Name eingeben:");

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "[Z")
    public static boolean[] field1649;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)V")
    public static final void method602(boolean arg0) {
        field1659++;
        if (client.field465 == 0 && !class19.field409) {
            class131.field3136++;
            class129.method1051(class20.field427, 48, class95.field2361, 16711680, class60.field1498, 0, class59.field1470);
        }
        int var1 = -1;
        for (int var2 = 0; var2 < class26.field641; var2++) {
            int var3 = class26.field622[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var6 == 2 && class133.field3173.method499(class13.field251, var4, var5, var3) >= 0) {
                    class36 var8 = class77.method661(var7, -74);
                    if (var8.field802 != null) {
                        var8 = var8.method269(-1);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (client.field465 == 1) {
                        class129.method1051(var4, 30, class51.method408(new class84[] { class17.field367, class52.field1185, var8.field810 }, 106), 16711680, var5, var3, class141.field3398);
                        class36.field796++;
                    } else if (!class19.field409) {
                        class63.field1558++;
                        class84[] var9 = var8.field764;
                        if (class30.field708) {
                            var9 = class143.method1174(5, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class53.field1196++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 40;
                                    }
                                    if (var10 == 1) {
                                        var11 = 43;
                                    }
                                    if (var10 == 2) {
                                        var11 = 16;
                                    }
                                    if (var10 == 3) {
                                        var11 = 58;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1005;
                                    }
                                    class129.method1051(var4, var11, class51.method408(new class84[] { class138.field3322, var8.field810 }, 3), 16711680, var5, var3, var9[var10]);
                                }
                            }
                        }
                        class129.method1051(var4, 1006, class51.method408(new class84[] { class138.field3322, var8.field810 }, -63), 16711680, var5, var8.field763 << 14, class10.field175);
                    } else if ((class122.field2957 & 0x4) == 4) {
                        class129.method1051(var4, 7, class51.method408(new class84[] { class5.field72, class52.field1185, var8.field810 }, -53), 16711680, var5, var3, class40.field911);
                        class57.field1317++;
                    }
                }
                if (var6 == 1) {
                    class103 var12 = class69.field1673[var7];
                    if (var12.field2510.field3367 == 1 && (var12.field3549 & 0x7F) == 64 && (var12.field3535 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class77.field1940; var13++) {
                            class103 var16 = class69.field1673[class87.field2146[var13]];
                            if (var16 != null && var12 != var16 && var16.field2510.field3367 == 1 && var12.field3549 == var16.field3549 && var12.field3535 == var16.field3535) {
                                class49.method356(var4, var5, class87.field2146[var13], (byte) -39, var16.field2510);
                            }
                        }
                        for (int var14 = 0; var14 < class71.field1746; var14++) {
                            class62 var15 = class44.field978[class80.field1990[var14]];
                            if (var15 != null && var12.field3549 == var15.field3549 && var12.field3535 == var15.field3535) {
                                class38.method284(20, var15, class80.field1990[var14], var5, var4);
                            }
                        }
                    }
                    class49.method356(var4, var5, var7, (byte) -39, var12.field2510);
                }
                if (var6 == 0) {
                    class62 var17 = class44.field978[var7];
                    if ((var17.field3549 & 0x7F) == 64 && (var17.field3535 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class77.field1940; var18++) {
                            class103 var21 = class69.field1673[class87.field2146[var18]];
                            if (var21 != null && var21.field2510.field3367 == 1 && var17.field3549 == var21.field3549 && var17.field3535 == var21.field3535) {
                                class49.method356(var4, var5, class87.field2146[var18], (byte) -39, var21.field2510);
                            }
                        }
                        for (int var19 = 0; var19 < class71.field1746; var19++) {
                            class62 var20 = class44.field978[class80.field1990[var19]];
                            if (var20 != null && var17 != var20 && var17.field3549 == var20.field3549 && var17.field3535 == var20.field3535) {
                                class38.method284(20, var20, class80.field1990[var19], var5, var4);
                            }
                        }
                    }
                    class38.method284(20, var17, var7, var5, var4);
                }
                if (var6 == 3) {
                    class16 var22 = class39.field875[class13.field251][var4][var5];
                    if (var22 != null) {
                        for (class14 var23 = (class14) var22.method101(-19268); var23 != null; var23 = (class14) var22.method113(28480)) {
                            class13 var24 = class98.method813(-1, var23.field274);
                            if (client.field465 == 1) {
                                class129.method1051(var4, 32, class51.method408(new class84[] { class17.field367, class1.field24, var24.field215 }, 111), 16711680, var5, var23.field274, class141.field3398);
                                class52.field1144++;
                            } else if (!class19.field409) {
                                class84[] var25 = var24.field263;
                                if (class30.field708) {
                                    var25 = class143.method1174(5, var25);
                                }
                                class88.field2197++;
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        byte var27 = 0;
                                        class106.field2570++;
                                        if (var26 == 0) {
                                            var27 = 15;
                                        }
                                        if (var26 == 1) {
                                            var27 = 51;
                                        }
                                        if (var26 == 2) {
                                            var27 = 45;
                                        }
                                        if (var26 == 3) {
                                            var27 = 3;
                                        }
                                        if (var26 == 4) {
                                            var27 = 33;
                                        }
                                        class129.method1051(var4, var27, class51.method408(new class84[] { class84.field2106, var24.field215 }, -89), 16711680, var5, var23.field274, var25[var26]);
                                    } else if (var26 == 2) {
                                        class129.method1051(var4, 45, class51.method408(new class84[] { class84.field2106, var24.field215 }, 125), 16711680, var5, var23.field274, class136.field3242);
                                        class10.field164++;
                                    }
                                }
                                class129.method1051(var4, 1002, class51.method408(new class84[] { class84.field2106, var24.field215 }, 126), 16711680, var5, var23.field274, class10.field175);
                            } else if ((class122.field2957 & 0x1) == 1) {
                                class129.method1051(var4, 34, class51.method408(new class84[] { class5.field72, class1.field24, var24.field215 }, 106), 16711680, var5, var23.field274, class40.field911);
                                class108.field2606++;
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            method605(87);
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public static void method603(int arg0) {
        field1645 = null;
        field1648 = null;
        field1666 = null;
        field1658 = null;
        field1647 = null;
        field1669 = null;
        field1649 = null;
        field1656 = null;
        if (arg0 != 58) {
            method606(false);
        }
        field1664 = null;
        field1661 = null;
        field1667 = null;
        field1652 = null;
        field1653 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method604(int arg0, String arg1, Throwable arg2) {
        field1663++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class69.method607(64, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class75.field1856.field3610 != null) {
                class85 var8 = class75.field1856.method1197(new URL(class75.field1856.field3610.getCodeBase(), "clienterror.ws?c=" + class126.field3057 + "&u=" + class136.field3278 + "&v1=" + class147.field3603 + "&v2=" + class147.field3612 + "&e=" + var7), (byte) 48);
                if (arg0 != 20233) {
                    field1658 = null;
                }
                while (var8.field2117 == 0) {
                    class22.method149(arg0 ^ 0x4F41, 1L);
                }
                if (var8.field2117 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2118;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
    public static final void method605(int arg0) {
        class17.field378.method599(-99);
        if (arg0 == 23723) {
            field1662++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIIII)V")
    public void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1650++;
        class26 var10 = this.method89(-6767);
        if (var10 != null) {
            this.field1668 = var10.field1668;
            var10.method193(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)Ldd;")
    public class26 method89(int arg0) {
        if (arg0 != -6767) {
            field1667 = null;
        }
        field1655++;
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(Z)V")
    public static final void method606(boolean arg0) {
        class6.field119 = 0;
        if (!arg0) {
            method603(-52);
        }
        class96.field2385 = 0;
        field1651++;
        class117.method953(false);
        class1.method4(-89);
        class15.method94(74);
        for (int var1 = 0; var1 < class6.field119; var1++) {
            int var3 = class96.field2379[var1];
            if (class5.field100 != class69.field1673[var3].field3519) {
                class69.field1673[var3].field2510 = null;
                class69.field1673[var3] = null;
            }
        }
        if (class86.field2128 != class87.field2148.field1128) {
            throw new RuntimeException("gnp1 pos:" + class87.field2148.field1128 + " psize:" + class86.field2128);
        }
        for (int var2 = 0; var2 < class77.field1940; var2++) {
            if (class69.field1673[class87.field2146[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class77.field1940);
            }
        }
    }
}
