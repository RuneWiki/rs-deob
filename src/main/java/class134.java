import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class134 {

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2172 = 0;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2176 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2179 = -1;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lt;")
    public static class212 field2180;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2173;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIZIIIII)V")
    public static final void method913(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 >= class34.field561 && arg9 <= class148.field2371 && arg3 >= class34.field561 && arg3 <= class148.field2371 && arg8 >= class34.field561 && class148.field2371 >= arg8 && arg2 >= class34.field561 && class148.field2371 >= arg2 && arg1 >= class52.field766 && class191.field3112 >= arg1 && arg7 >= class52.field766 && class191.field3112 >= arg7 && class52.field766 <= arg0 && arg0 <= class191.field3112 && arg6 >= class52.field766 && arg6 <= class191.field3112) {
            class271.method1798(arg7, arg5, arg8, arg2, arg3, arg6, -50, arg1, arg0, arg9);
        } else {
            class120.method826(arg9, arg8, arg1, arg6, arg0, arg2, arg7, arg3, arg5, 735407212);
        }
        if (!arg4) {
            method913(-52, 72, 10, -9, true, -108, 99, 106, -76, -128);
        }
        field2168++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/lang/String;ZI)V")
    public static final void method914(int arg0, int arg1, String arg2, boolean arg3, int arg4) {
        field2169++;
        class248 var5 = class79.method571(arg4, arg1, (byte) -74);
        if (var5 == null) {
            return;
        }
        if (var5.field3986 != null) {
            class78 var6 = new class78();
            var6.field1265 = var5.field3986;
            var6.field1258 = arg2;
            var6.field1256 = arg0;
            var6.field1251 = var5;
            class139.method959((byte) 115, var6);
        }
        boolean var7 = true;
        if (var5.field3957 > 0) {
            var7 = class186.method1313(126, var5);
        }
        if (!var7 || !client.method1126(var5).method179((byte) -118, arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class275.field4504++;
            class311.field5027.method2081(arg3, 215);
            class311.field5027.method1831(arg1, 119690440);
            class311.field5027.method1824(arg4, 28357);
        }
        if (arg3) {
            method916(-75);
        }
        if (arg0 == 2) {
            class311.field5027.method2081(false, 77);
            class311.field5027.method1831(arg1, 119690440);
            class233.field3642++;
            class311.field5027.method1824(arg4, 28357);
        }
        if (arg0 == 3) {
            class311.field5027.method2081(false, 63);
            class238.field3737++;
            class311.field5027.method1831(arg1, 119690440);
            class311.field5027.method1824(arg4, 28357);
        }
        if (arg0 == 4) {
            class179.field2962++;
            class311.field5027.method2081(false, 33);
            class311.field5027.method1831(arg1, 119690440);
            class311.field5027.method1824(arg4, 28357);
        }
        if (arg0 == 5) {
            class311.field5027.method2081(arg3, 89);
            class311.field5027.method1831(arg1, 119690440);
            class102.field1610++;
            class311.field5027.method1824(arg4, 28357);
        }
        if (arg0 == 6) {
            class244.field3872++;
            class311.field5027.method2081(false, 99);
            class311.field5027.method1831(arg1, 119690440);
            class311.field5027.method1824(arg4, 28357);
        }
        if (arg0 == 7) {
            class97.field1534++;
            class311.field5027.method2081(false, 107);
            class311.field5027.method1831(arg1, 119690440);
            class311.field5027.method1824(arg4, 28357);
        }
        if (arg0 == 8) {
            class311.field5027.method2081(arg3, 82);
            class307.field4987++;
            class311.field5027.method1831(arg1, 119690440);
            class311.field5027.method1824(arg4, 28357);
        }
        if (arg0 == 9) {
            class23.field430++;
            class311.field5027.method2081(false, 83);
            class311.field5027.method1831(arg1, 119690440);
            class311.field5027.method1824(arg4, 28357);
        }
        if (arg0 == 10) {
            class311.field5027.method2081(false, 79);
            class58.field852++;
            class311.field5027.method1831(arg1, 119690440);
            class311.field5027.method1824(arg4, 28357);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIB)V")
    public static final void method915(int arg0, int arg1, byte arg2) {
        field2177++;
        class291 var3 = class61.method389(arg0, 12, arg2 ^ 0x70);
        if (arg2 != 112) {
            field2172 = 7;
        }
        var3.method2009(arg2 - 163);
        var3.field4763 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method916(int arg0) {
        field2176 = null;
        if (arg0 == 0) {
            field2173 = null;
            field2180 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZZI[BI[Lkb;)V")
    private static final void method917(boolean arg0, boolean arg1, int arg2, byte[] arg3, int arg4, class55[] arg5) {
        field2171++;
        if (arg1) {
            return;
        }
        class274 var6 = new class274(arg3);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1853(-2);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method1863((byte) -111);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFDE) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method1849(255);
                int var15 = var14 >> 2;
                int var16 = arg4 + var12;
                int var17 = arg2 + var11;
                int var18 = var14 & 0x3;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    class55 var19 = null;
                    if (!arg0) {
                        int var20 = var13;
                        if ((class214.field3386[1][var16][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class263.method1775(var13, var7, arg0, 75, var13, var17, !arg0, var18, var15, var19, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lgi;I)Z")
    public static final boolean method918(class164 arg0, int arg1) {
        field2175++;
        if (arg0.method1168(0, class171.field2803)) {
            return true;
        } else {
            if (arg1 != -19873) {
                method917(false, false, 15, (byte[]) null, -37, (class55[]) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BILnb;I)V")
    public static final void method919(byte arg0, int arg1, class223 arg2, int arg3) {
        if (arg0 != -70) {
            method919((byte) 46, 28, (class223) null, -16);
        }
        class102.field1621.method1549(0);
        field2170++;
        if (class219.field3443) {
            return;
        }
        for (class119 var4 = (class119) arg2.method1553(true); var4 != null; var4 = (class119) arg2.method1551(0)) {
            class125 var5 = class223.method1550((byte) 99, var4.field1877);
            if (class255.method1728(var5, (byte) 126)) {
                class78.method568(var5, var4, arg1, -3, arg3);
                if (var4.field1884) {
                    class199.method1373(2, var5, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method920(byte arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        int var2 = 86 % ((-arg0 - 56) / 42);
        System.exit(1);
        field2167++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method921(int arg0, String arg1, boolean arg2) {
        short[] var3 = new short[16];
        String var4 = arg1.toLowerCase();
        field2178++;
        if (arg0 != 2) {
            return;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < class140.field2283; var6++) {
            class158 var9 = class107.method754(arg0 ^ 0xFFFFAFAF, var6);
            if ((!arg2 || var9.field2587) && var9.field2525 == -1 && var9.field2548 == -1 && var9.field2522 == 0 && var9.field2532.toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 250) {
                    class101.field1594 = null;
                    class46.field674 = -1;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class46.field674 = var5;
        String[] var7 = new String[class46.field674];
        class101.field1594 = var3;
        class53.field773 = 0;
        for (int var8 = 0; var8 < class46.field674; var8++) {
            var7[var8] = class107.method754(arg0 - 20565, var3[var8]).field2532;
        }
        class99.method705(class101.field1594, -1550383356, var7);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZB)V")
    public static final void method922(boolean arg0, byte arg1) {
        if (arg1 != -6) {
            method916(44);
        }
        byte[][] var2 = class197.field3176;
        field2174++;
        int var3 = class158.field2563.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class122.field1938[var4] >> 8) * 64 - class75.field1211;
                int var7 = (class122.field1938[var4] & 0xFF) * 64 - class145.field2327;
                class243.method1653(false);
                method917(arg0, false, var7, var5, var6, class310.field5021);
            }
        }
    }
}
