import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class82 extends class128 {

    @OriginalMember(owner = "client!el", name = "D", descriptor = "[Lbd;")
    public class86[] field1127;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field1124 = 0;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1131 = "scroll:";

    @OriginalMember(owner = "client!el", name = "L", descriptor = "[I")
    public static int[] field1135 = new int[100];

    @OriginalMember(owner = "client!el", name = "C", descriptor = "Llm;")
    public static class150 field1126 = new class150(4);

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "Lnh;")
    public static class305 field1125;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "Lvf;")
    public static class31 field1129;

    // $FF: synthetic field
    @OriginalMember(owner = "client!el", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1139;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ISLjava/lang/String;Ljava/lang/String;IIJB)V")
    public static final void method518(int arg0, short arg1, String arg2, String arg3, int arg4, int arg5, long arg6, byte arg7) {
        field1130++;
        if (class171.field2447) {
            return;
        }
        if (class179.field2721 < 500) {
            class205.field3062[class179.field2721] = arg2;
            class137.field1877[class179.field2721] = arg3;
            class84.field1186[class179.field2721] = arg0 == -1 ? class43.field645 : arg0;
            class151.field2101[class179.field2721] = arg1;
            class51.field717[class179.field2721] = arg6;
            class228.field3567[class179.field2721] = arg5;
            class250.field3910[class179.field2721] = arg4;
            class179.field2721++;
        }
        if (arg7 < 56) {
            method519(45, -49);
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lnh;Lnh;IZ)V")
    public class82(class305 arg0, class305 arg1, int arg2, boolean arg3) {
        class58 var5 = new class58();
        int var6 = arg0.method2067(arg2, (byte) 51);
        this.field1127 = new class86[var6];
        int[] var7 = arg0.method2071(4846, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class29 var9 = null;
            byte[] var10 = arg0.method2050(116, arg2, var7[var8]);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class29 var12 = (class29) var5.method369((byte) -113); var12 != null; var12 = (class29) var5.method362(false)) {
                if (var12.field448 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2063(0, var11, (byte) 95);
                } else {
                    var13 = arg1.method2063(var11, 0, (byte) 109);
                }
                var9 = new class29(var11, var13);
                var5.method370((byte) -22, var9);
            }
            this.field1127[var7[var8]] = new class86(var10, var9);
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V")
    public static final void method519(int arg0, int arg1) {
        field1133++;
        if (class142.field1961 == arg1) {
            return;
        }
        if (class142.field1961 == 0) {
            class23.method151(false);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 40) {
            class114.method724(62);
        }
        if (arg0 >= -107) {
            method524(111, (byte) -105, (String) null, 30, (String) null, (String) null);
        }
        if (arg1 != 40 && class213.field3213 != null) {
            class213.field3213.method1211((byte) -84);
            class213.field3213 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class139.field1927 = 1;
            class17.field295 = 0;
            class39.field586 = 0;
            class14.field231 = 0;
            class37.field574 = 1;
            class108.method687(52, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class211.method1314(true);
        }
        if (arg1 == 5) {
            class280.method1820(class311.field5009, 84);
        } else {
            class147.method922(true);
        }
        boolean var3 = class142.field1961 == 5 || class142.field1961 == 10 || class142.field1961 == 28;
        if (var2 != var3) {
            if (var2) {
                class102.field1457 = class13.field207;
                if (class51.field716 == 0) {
                    class54.method346(2, 31058);
                } else {
                    class205.method1280(0, false, 2, (byte) 62, 255, class13.field207, class240.field3737);
                }
                class104.field1498.method1113(false, (byte) -123);
            } else {
                class54.method346(2, 31058);
                class104.field1498.method1113(true, (byte) 82);
            }
        }
        class142.field1961 = arg1;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(II)Z")
    public final boolean method520(int arg0, int arg1) {
        if (arg1 != 7502) {
            method526(119);
        }
        field1123++;
        return this.field1127[arg0].field1249;
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V")
    public static final void method521(int arg0) {
        try {
            Method var1 = (field1139 == null ? (field1139 = method528("java.lang.Runtime")) : field1139).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class42.field632 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field1132++;
        if (arg0 != -1163264472) {
            field1131 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([IZ)[I")
    public static final int[] method522(int[] arg0, boolean arg1) {
        field1137++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        if (!arg1) {
            method524(-67, (byte) 25, (String) null, -126, (String) null, (String) null);
        }
        class285.method1878(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(II)Z")
    public final boolean method523(int arg0, int arg1) {
        int var3 = -59 / ((23 - arg1) / 55);
        field1128++;
        return this.field1127[arg0].field1247;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
    public static final void method524(int arg0, byte arg1, String arg2, int arg3, String arg4, String arg5) {
        if (arg1 != 79) {
            field1135 = null;
        }
        field1138++;
        class233.method1530((String) null, arg2, -1, arg5, arg3, (byte) -51, arg0, arg4);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static final void method525(boolean arg0) {
        class5.method25(15167);
        class192.method1217((byte) -126);
        class242.method1591(110);
        class305.method2078(-1);
        field1136++;
        class206.method1288(37);
        class142.method894(6574);
        class282.method1837(10619);
        class124.method795((byte) 111);
        class4.method19(true);
        class32.method198(true);
        class223.method1463(-128);
        class301.method2012((byte) -124);
        if (arg0) {
            return;
        }
        class106.method673((byte) 122);
        class252.method1638(-28129);
        class112.method714((byte) -31);
        class272.method1774((byte) 62);
        class53.method341(0);
        class115.method738(1);
        class114.method730(-24687);
        class244.method1603((byte) 99);
        class314.method2120((byte) 108);
        field1126.method948((byte) 58);
        class83.field1154.method948((byte) 58);
        class295.field4708.method948((byte) 58);
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
    public static void method526(int arg0) {
        field1126 = null;
        field1129 = null;
        field1125 = null;
        field1135 = null;
        field1131 = null;
        if (arg0 > -72) {
            field1129 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)V")
    public static final void method527(int arg0, boolean arg1) {
        class98.field1425.method943(arg0, arg1);
        field1134++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method528(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
