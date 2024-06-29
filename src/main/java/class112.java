import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class112 extends class161 {

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public volatile int field1552 = -1;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field1548;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1551 = "Please remove ";

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Lwq;")
    public static class92 field1554 = new class92(0, 0);

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "[[Z")
    public static boolean[][] field1555 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field1556 = 0;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V", line = 9)
    public static void method827(boolean arg0) {
        field1555 = null;
        field1554 = null;
        field1551 = null;
        if (arg0) {
            method832((class447) null, (class447) null, false);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lsk;)V", line = 22)
    public static final void method828(class369 arg0) {
        if (class134.field2101 >= 255) {
            return;
        }
        class27.field317[class134.field2101] = arg0;
        class427.field6297[class134.field2101] = false;
        class134.field2101++;
        int var1 = arg0.field5600;
        if (arg0.field5609) {
            var1 = 0;
        }
        int var2 = arg0.field5600;
        if (arg0.field5594) {
            var2 = class81.field1006 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field809 + 64 - arg0.field810 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field810 + arg0.field809 - 64 >> 7;
            if (var6 >= class361.field5513) {
                var6 = class361.field5513 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field5602[var4++];
                int var9 = (var8 >>> 8) + (arg0.field812 + 64 - arg0.field810 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class156.field2449) {
                    var10 = class156.field2449 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class411.field6089[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class411.field6089[var3][var11][var7] = var12 | class134.field2101;
                    } else if ((var12 & 0xFF00) == 0) {
                        class411.field6089[var3][var11][var7] = var12 | class134.field2101 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class411.field6089[var3][var11][var7] = var12 | class134.field2101 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class411.field6089[var3][var11][var7] = var12 | class134.field2101 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 210)
    public class112(String arg0) {
        this.field1548 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V", line = 123)
    public static final void method829(int arg0, int arg1) {
        field1549++;
        class211 var2 = class281.method1921(arg0, arg1, (byte) -96);
        var2.method1489((byte) -100);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Le;ZII[BI[Lfn;)V", line = 136)
    public static final void method830(class312 arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5, class72[] arg6) {
        if (arg5 != -3) {
            method829(-113, -27);
        }
        field1550++;
        class186 var7 = new class186(arg4);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1281((byte) -79);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1299(-90);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method1322(false);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg3 + var12;
                if (var18 > 0 && var19 > 0 && var18 < (class80.field1003 - 1) && class380.field5751 - 1 > var19) {
                    class72 var20 = null;
                    if (!arg1) {
                        int var21 = var14;
                        if ((class31.field382[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg6[var21];
                        }
                    }
                    class250.method1732(arg1, var20, var18, arg0, var19, true, -1, var16, var17, var8, var14, 1, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljg;ILap;I)V", line = 224)
    public static final void method831(class186 arg0, int arg1, class279 arg2, int arg3) {
        if (arg1 != 25813) {
            return;
        }
        field1546++;
        class361 var4 = new class361();
        var4.field5520 = arg0.method1322(false);
        var4.field5518 = arg0.method1284(8388607);
        var4.field5511 = new byte[var4.field5520][][];
        var4.field5519 = new int[var4.field5520];
        var4.field5512 = new class26[var4.field5520];
        var4.field5521 = new class26[var4.field5520];
        var4.field5514 = new int[var4.field5520];
        var4.field5516 = new int[var4.field5520];
        for (int var5 = 0; var5 < var4.field5520; var5++) {
            try {
                int var6 = arg0.method1322(false);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg0.method1270(-9970);
                    String var8 = arg0.method1270(-9970);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method1284(arg1 + 8362794);
                    }
                    var4.field5519[var5] = var6;
                    var4.field5516[var5] = var9;
                    var4.field5512[var5] = arg2.method1888(class306.method2061(var7, class121.method873(arg1, 25813)), arg1 - 25926, var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg0.method1270(arg1 - 35783);
                    String var11 = arg0.method1270(arg1 - 35783);
                    int var12 = arg0.method1322(false);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg0.method1270(-9970);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method1284(arg1 ^ 0x7F9B2A);
                            var15[var16] = new byte[var17];
                            arg0.method1292(0, var15[var16], 1847860680, var17);
                        }
                    }
                    var4.field5519[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class306.method2061(var13[var19], arg1 - 25813);
                    }
                    var4.field5521[var5] = arg2.method1890(var18, var11, class306.method2061(var10, 0), 0);
                    var4.field5511[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5514[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5514[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5514[var5] = -3;
            } catch (Exception var23) {
                var4.field5514[var5] = -4;
            } catch (Throwable var24) {
                var4.field5514[var5] = -5;
            }
        }
        class58.field752.method245(500, var4);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lmo;Lmo;Z)V", line = 337)
    public static final void method832(class447 arg0, class447 arg1, boolean arg2) {
        class134.field2109 = arg0;
        field1547++;
        if (arg2) {
            field1556 = 43;
        }
        class179.field2931 = arg1;
    }
}
