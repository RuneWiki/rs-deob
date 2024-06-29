import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lec;")
    public static class28 field1510 = class28.method210(-46, "(U(Y");

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lec;")
    public static class28 field1519 = class28.method210(-46, "Loaded sprites");

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lec;")
    public static class28 field1512 = class28.method210(-46, "To cancel this request:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WCancel recovery questions(W)3");

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lec;")
    public static class28 field1508 = class28.method210(-46, "Connecting to update server");

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1517 = 20;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lec;")
    public static class28 field1521 = class28.method210(-46, "Prepared visibility map");

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lvb;")
    public static class122 field1514;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILnd;ILud;)V")
    public static final void method526(int arg0, class82 arg1, int arg2, class119 arg3) {
        field1520++;
        if (class4.field73) {
            return;
        }
        class83 var4 = new class83();
        var4.field1890 = arg3.method879((byte) 45);
        var4.field1891 = arg3.method882(124);
        var4.field1887 = new class97[var4.field1890];
        var4.field1885 = new int[var4.field1890];
        var4.field1886 = new class97[var4.field1890];
        var4.field1881 = new int[var4.field1890];
        var4.field1903 = new int[var4.field1890];
        var4.field1883 = new byte[var4.field1890][][];
        if (arg0 >= -99) {
            field1510 = null;
        }
        for (int var5 = 0; var5 < var4.field1890; var5++) {
            try {
                int var6 = arg3.method879((byte) 45);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var7 = 0;
                    String var8 = new String(arg3.method885((byte) -124).method207((byte) -125));
                    String var9 = new String(arg3.method885((byte) -89).method207((byte) 82));
                    if (var6 == 1) {
                        var7 = arg3.method882(-98);
                    }
                    var4.field1881[var5] = var6;
                    var4.field1885[var5] = var7;
                    var4.field1886[var5] = arg1.method626((byte) -79, class91.method662(-23097, var8), var9);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg3.method885((byte) -112).method207((byte) -46));
                    String var11 = new String(arg3.method885((byte) -99).method207((byte) -95));
                    int var12 = arg3.method879((byte) 45);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg3.method885((byte) -119).method207((byte) 93));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method882(122);
                            var15[var16] = new byte[var17];
                            arg3.method891(0, var17, var15[var16], -1);
                        }
                    }
                    var4.field1881[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class91.method662(-23097, var13[var19]);
                    }
                    var4.field1887[var5] = arg1.method627(false, var18, var11, class91.method662(-23097, var10));
                    var4.field1883[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1903[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1903[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1903[var5] = -3;
            } catch (Exception var23) {
                var4.field1903[var5] = -4;
            } catch (Throwable var24) {
                var4.field1903[var5] = -5;
            }
        }
        class7.field110.method337(25563, var4);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ldd;B)V")
    public static final void method527(class23 arg0, byte arg1) {
        class34.field780 = arg0;
        field1516++;
        if (arg1 >= -49) {
            field1512 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static final synchronized void method528(boolean arg0) {
        field1525++;
        class22.method164((byte) 115);
        class53.field1206 = arg0;
        class31.field669 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZLvb;IIILec;Lec;I)V")
    public static final synchronized void method529(boolean arg0, class122 arg1, int arg2, int arg3, int arg4, class28 arg5, class28 arg6, int arg7) {
        field1518++;
        int var8 = arg1.method942(arg6, arg2 - 1);
        if (arg2 != 2) {
            field1517 = 61;
        }
        int var9 = arg1.method930((byte) 24, var8, arg5);
        method535(var9, var8, (byte) -51, arg7, arg3, arg4, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public static final synchronized void method530(boolean arg0) {
        if (!arg0) {
            method528(true);
        }
        if (class53.field1206) {
            byte[] var1 = class61.method494(class22.field498, class31.field669, class46.field1031, 99, class32.field688);
            if (var1 != null) {
                if (class126.field2725 >= 0) {
                    class12.method62(class109.field2288, 22391, class126.field2725, class122.field2661, var1);
                } else if (class17.field320 < 0) {
                    class77.method587(var1, 112, class122.field2661, class109.field2288);
                } else {
                    class95.method685(var1, class122.field2661, class109.field2288, -15947, class17.field320);
                }
                class31.field669 = null;
                class53.field1206 = false;
            }
        }
        field1524++;
        client.method123(false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final synchronized void method531(int arg0) {
        field1513++;
        if (arg0 != -2) {
            field1509 = -21;
        }
        class86.method643(-31914);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([BLbb;ZI)V")
    public static final void method532(byte[] arg0, class9 arg1, boolean arg2, int arg3) {
        field1515++;
        if (arg2) {
            field1510 = null;
        }
        class105 var4 = new class105();
        var4.field2215 = arg1;
        var4.field2217 = arg3;
        var4.field2226 = arg0;
        var4.field2222 = 0;
        class42 var5 = class114.field2426;
        synchronized (class114.field2426) {
            class114.field2426.method337(25563, var4);
        }
        class94.method676(false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIILvb;Z)V")
    public static final synchronized void method533(int arg0, int arg1, int arg2, int arg3, int arg4, class122 arg5, boolean arg6) {
        class122.field2661 = arg2;
        class22.field498 = arg3;
        class109.field2288 = arg6;
        class31.field669 = arg5;
        class32.field688 = arg0;
        class17.field320 = -1;
        field1523++;
        class53.field1206 = true;
        int var7 = -53 % ((arg4 + 2) / 60);
        class46.field1031 = arg1;
        class126.field2725 = -1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
    public static final synchronized void method534(int arg0, int arg1) {
        class103.method724(arg1, -12527);
        if (arg0 <= 63) {
            field1508 = null;
        }
        field1522++;
        class53.field1206 = false;
        class31.field669 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBIIIZLvb;)V")
    public static final synchronized void method535(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6, class122 arg7) {
        class53.field1206 = true;
        class31.field669 = arg7;
        class17.field320 = -1;
        if (arg2 != -51) {
            field1509 = -83;
        }
        class122.field2661 = arg4;
        field1511++;
        class126.field2725 = arg5;
        class22.field498 = arg3;
        class32.field688 = arg1;
        class46.field1031 = arg0;
        class109.field2288 = arg6;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method536(byte arg0) {
        field1508 = null;
        if (arg0 > -116) {
            method536((byte) 19);
        }
        field1514 = null;
        field1521 = null;
        field1510 = null;
        field1519 = null;
        field1512 = null;
    }
}
