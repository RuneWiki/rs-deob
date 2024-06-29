import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class86 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lad;")
    private static class5 field1975 = class88.method674("flash1:", 115);

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lad;")
    public static class5 field1977 = field1975;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[I")
    public static int[] field1988 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field1989 = 0;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lad;")
    private static class5 field1981 = class88.method674("Unexpected loginserver response)3", 49);

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lad;")
    public static class5 field1984 = class88.method674("Musik)2Engine vorbereitet)3", 114);

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lad;")
    public static class5 field1983 = field1981;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lad;")
    public static class5 field1994 = class88.method674("Untersuchen", 120);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lsb;")
    public static class110 field1993;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILaa;ILgb;)V", line = 12)
    public static final void method649(int arg0, class2 arg1, int arg2, class39 arg3) {
        field1987++;
        class43 var4 = new class43();
        var4.field1083 = arg3.method330(-30864);
        var4.field1110 = arg3.method322((byte) -118);
        var4.field1088 = new int[var4.field1083];
        var4.field1098 = new byte[var4.field1083][][];
        var4.field1100 = new int[var4.field1083];
        var4.field1087 = new int[var4.field1083];
        var4.field1096 = new class62[var4.field1083];
        var4.field1099 = new class62[var4.field1083];
        for (int var5 = 0; var5 < var4.field1083; var5++) {
            try {
                int var6 = arg3.method330(-30864);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method301(-1).method71((byte) -128));
                    int var18 = 0;
                    String var19 = new String(arg3.method301(-1).method71((byte) -126));
                    if (var6 == 1) {
                        var18 = arg3.method322((byte) -118);
                    }
                    var4.field1087[var5] = var6;
                    var4.field1100[var5] = var18;
                    var4.field1099[var5] = arg1.method6(121, var19, class131.method1021((byte) -95, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method301(-1).method71((byte) -124));
                    String var8 = new String(arg3.method301(-1).method71((byte) -127));
                    int var9 = arg3.method330(-30864);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method301(-1).method71((byte) -125));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method322((byte) -118);
                            var12[var13] = new byte[var14];
                            arg3.method313(0, (byte) 89, var14, var12[var13]);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field1087[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class131.method1021((byte) -95, var10[var16]);
                    }
                    var4.field1096[var5] = arg1.method15(var8, var15, (byte) -94, class131.method1021((byte) -95, var7));
                    var4.field1098[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1088[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1088[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1088[var5] = -3;
            } catch (Exception var23) {
                var4.field1088[var5] = -4;
            } catch (Throwable var24) {
                var4.field1088[var5] = -5;
            }
        }
        if (arg2 > 86) {
            class58.field1419.method176(var4, -19597);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I", line = 124)
    public static final int method650(int arg0) {
        if (arg0 != 10849) {
            field1983 = null;
        }
        field1974++;
        return class18.field474++;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 137)
    public static final void method651(int arg0) {
        if (arg0 != 9775) {
            field1979 = -70;
        }
        field1995++;
        class78.field1858.method101((byte) -94);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lab;Z)V", line = 163)
    public static final void method652(class3 arg0, boolean arg1) {
        field1991++;
        arg0.field53 = arg1;
        if (arg0.field54 != -1) {
            class72 var2 = class78.method605(arg0.field54, (byte) 20);
            if (var2 == null || var2.field1727 == null) {
                arg0.field54 = -1;
            } else {
                arg0.field44++;
                if (arg0.field58 < var2.field1727.length && arg0.field44 > var2.field1742[arg0.field58]) {
                    arg0.field58++;
                    arg0.field44 = 1;
                }
                if (var2.field1727.length <= arg0.field58) {
                    arg0.field58 = 0;
                    arg0.field44 = 0;
                }
            }
        }
        if (arg0.field103 != -1 && class69.field1636 >= arg0.field110) {
            if (arg0.field108 < 0) {
                arg0.field108 = 0;
            }
            int var3 = class52.method434(arg0.field103, arg1).field2724;
            if (var3 == -1) {
                arg0.field103 = -1;
            } else {
                class72 var4 = class78.method605(var3, (byte) 20);
                if (var4 == null || var4.field1727 == null) {
                    arg0.field103 = -1;
                } else {
                    arg0.field72++;
                    if (var4.field1727.length > arg0.field108 && arg0.field72 > var4.field1742[arg0.field108]) {
                        arg0.field72 = 1;
                        arg0.field108++;
                    }
                    if (arg0.field108 >= var4.field1727.length && (arg0.field108 < 0 || arg0.field108 >= var4.field1727.length)) {
                        arg0.field103 = -1;
                    }
                }
            }
        }
        if (arg0.field85 != -1 && arg0.field82 <= 1) {
            class72 var5 = class78.method605(arg0.field85, (byte) 20);
            if (var5.field1724 == 1 && arg0.field78 > 0 && class69.field1636 >= arg0.field102 && arg0.field65 < class69.field1636) {
                arg0.field82 = 1;
                return;
            }
        }
        if (arg0.field85 != -1 && arg0.field82 == 0) {
            class72 var6 = class78.method605(arg0.field85, (byte) 20);
            if (var6 == null || var6.field1727 == null) {
                arg0.field85 = -1;
            } else {
                arg0.field57++;
                if (var6.field1727.length > arg0.field109 && var6.field1742[arg0.field109] < arg0.field57) {
                    arg0.field57 = 1;
                    arg0.field109++;
                }
                if (arg0.field109 >= var6.field1727.length) {
                    arg0.field109 -= var6.field1732;
                    arg0.field43++;
                    if (var6.field1722 <= arg0.field43) {
                        arg0.field85 = -1;
                    }
                    if (arg0.field109 < 0 || arg0.field109 >= var6.field1727.length) {
                        arg0.field85 = -1;
                    }
                }
                arg0.field53 = var6.field1721;
            }
        }
        if (arg0.field82 > 0) {
            arg0.field82--;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILrd;)Z", line = 296)
    public static final boolean method653(int arg0, int arg1, class106 arg2) {
        field1978++;
        byte[] var3 = arg2.method863(91, arg1);
        if (var3 == null) {
            return false;
        }
        class135.method1036(var3, false);
        if (arg0 != -4) {
            field1989 = -2;
        }
        return true;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[B)I", line = 327)
    public static final int method654(int arg0, int arg1, byte[] arg2) {
        if (arg1 == -29019) {
            field1985++;
            return class72.method577(0, arg2, arg0, 3738);
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Lqe;", line = 342)
    public static final class101 method655(byte arg0, int arg1) {
        field1976++;
        class101 var2 = (class101) class59.field1444.method98(arg0 - 125, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class9.field303.method857(30580, 4, arg1);
        if (arg0 != 117) {
            field1975 = null;
        }
        class101 var4 = new class101();
        if (var3 != null) {
            var4.method815(arg1, new class39(var3), 67);
        }
        var4.method808(false);
        class59.field1444.method102((long) arg1, var4, 74);
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 381)
    public static final void method656(int arg0) {
        field1990++;
        for (int var1 = 0; var1 < class33.field790; var1++) {
            int var2 = class25.field611[var1];
            class61 var3 = class103.field2504[var2];
            if (var3 != null) {
                class25.method210(-28943, var3, var3.field1498.field2925);
            }
        }
        if (arg0 != -23957) {
            field1975 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)Z", line = 422)
    public static final boolean method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1992++;
        if (class116.method928(97, arg5)) {
            return arg2 == 1515 ? class58.method465(0, -1, arg0, 0, arg5, class121.field3013[arg5], arg6, arg1, 0, arg4, arg3) : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V", line = 441)
    public static void method658(int arg0) {
        field1983 = null;
        field1994 = null;
        field1988 = null;
        field1977 = null;
        field1984 = null;
        field1981 = null;
        field1975 = null;
        if (arg0 == 0) {
            field1993 = null;
        }
    }
}
