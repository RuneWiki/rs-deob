import java.applet.Applet;
import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class95 {

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "Lhm;")
    private class208 field1231 = new class208(64);

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "Lpfa;")
    private class275 field1234;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public static int field1235 = 0;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "Lra;")
    public static class98 field1227 = new class98();

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "[I")
    public static int[] field1238 = new int[13];

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "[I")
    public static int[] field1239 = new int[2048];

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "Ljava/applet/Applet;")
    public static Applet field1241;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1236;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)Lsw;")
    public final class706 method706(int arg0, int arg1) {
        field1229++;
        class208 var3 = this.field1231;
        class706 var4;
        synchronized (this.field1231) {
            var4 = (class706) this.field1231.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field1234;
        byte[] var6;
        synchronized (this.field1234) {
            var6 = this.field1234.method1659(93, arg0, 5);
            if (arg1 != 19147) {
                field1240 = -52;
            }
        }
        class706 var7 = new class706();
        if (var6 != null) {
            var7.method3897((byte) -114, new class572(var6));
        }
        class208 var8 = this.field1231;
        synchronized (this.field1231) {
            this.field1231.method1230((byte) 53, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZB)V")
    public static final void method707(boolean arg0, byte arg1) {
        if (arg0) {
            if (class305.field3866 != -1) {
                class72.method572(50, class305.field3866);
            }
            for (class293 var2 = (class293) class216.field2530.method3830((byte) -51); var2 != null; var2 = (class293) class216.field2530.method3838((byte) -92)) {
                if (!var2.method1565((byte) 123)) {
                    var2 = (class293) class216.field2530.method3830((byte) 114);
                    if (var2 == null) {
                        break;
                    }
                }
                class190.method1128(false, -127, true, var2);
            }
            class305.field3866 = -1;
            class216.field2530 = new class694(8);
            class443.method2436(0);
            class305.field3866 = class97.field1251;
            class602.method3309(false, 3);
            class377.method2172(100);
            class620.method3449(class305.field3866);
        }
        field1233++;
        class180.field2124 = true;
        if (arg1 <= 99) {
            field1235 = 48;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1230++;
        class589 var10 = null;
        for (class589 var11 = (class589) class26.field303.method1909(true); var11 != null; var11 = (class589) class26.field303.method1916((byte) 110)) {
            if (var11.field7906 == arg7 && var11.field7904 == arg9 && var11.field7910 == arg8 && var11.field7915 == arg2) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class589();
            var10.field7906 = arg7;
            var10.field7904 = arg9;
            var10.field7910 = arg8;
            var10.field7915 = arg2;
            if (arg9 >= 0 && arg8 >= 0 && arg9 < class85.field1090 && class656.field8932 > arg8) {
                class509.method2774(var10, (byte) -118);
            }
            class26.field303.method1904(var10, -68);
        }
        var10.field7916 = arg0;
        var10.field7912 = arg5;
        var10.field7903 = arg3;
        var10.field7902 = arg6;
        var10.field7908 = arg1;
        int var12 = 103 % ((arg4 - 55) / 38);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lpp;B)V")
    public static final void method709(class365 arg0, byte arg1) {
        int var2 = 52 % ((arg1 - 47) / 42);
        field1228++;
        class112 var3 = (class112) class664.field9022.method3828((long) arg0.field495, (byte) -91);
        if (var3 == null) {
            class132.method859(null, arg0.field508[0], null, arg0.field8010, arg0, arg0.field511[0], 0, 3);
        } else {
            var3.method776(111);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
    public static void method710(int arg0) {
        field1236 = null;
        field1239 = null;
        field1227 = null;
        field1238 = null;
        if (arg0 == 9875) {
            field1241 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
    public static final void method711(int arg0) {
        field1232++;
        if (class510.field6384 == null) {
            class510.field6384 = class179.method1063(arg0 ^ 0x7);
            class113.field1422 = class510.field6384[0];
            class203.field2364 = class321.method1854(-116);
        }
        if (class185.field2182 == null) {
            class403.method2266((byte) -84);
        }
        class179 var1 = class113.field1422;
        if (arg0 != 100) {
            field1235 = 38;
        }
        int var2 = class268.method1588(arg0 - 222);
        if (class113.field1422 == var1) {
            class433.field5463 = class113.field1422.field2090.method3726((byte) 113, class71.field912);
            if (class113.field1422.field2088) {
                class223.field2766 = (class113.field1422.field2094 - class113.field1422.field2085) * var2 / 100 + class113.field1422.field2085;
            }
            if (class113.field1422.field2089) {
                class433.field5463 = class433.field5463 + class223.field2766 + "%";
            }
        } else if (class179.field2116 == class113.field1422) {
            class185.field2182 = null;
            class78.method609(10503, 3);
        } else {
            class433.field5463 = var1.field2093.method3726((byte) 112, class71.field912);
            class223.field2766 = var1.field2094;
            if (class113.field1422.field2089) {
                class433.field5463 = class433.field5463 + var1.field2094 + "%";
            }
            if (class113.field1422.field2088 || var1.field2088) {
                class203.field2364 = class321.method1854(-36);
            }
        }
        if (class185.field2182 == null) {
            return;
        }
        class185.field2182.method2422(class203.field2364, class433.field5463, (byte) 106, class113.field1422, class223.field2766);
        if (class518.field6555 == null) {
            return;
        }
        for (int var3 = class709.field9907 + 1; var3 < class518.field6555.length; var3++) {
            if (class518.field6555[var3].method905(-15038) >= 100 && (var3 - 1) == class709.field9907 && class470.field5804 >= 1 && class185.field2182.method2432(65535)) {
                try {
                    class518.field6555[var3].method901(true);
                } catch (Exception var4) {
                    class518.field6555 = null;
                    return;
                }
                class185.field2182.method2423((byte) -122, class518.field6555[var3]);
                class709.field9907++;
                if ((class518.field6555.length - 1) <= class709.field9907 && class518.field6555.length > 1) {
                    class709.field9907 = class680.field9258.method2656(2359) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lbs;ILpfa;)V")
    public class95(class643 arg0, int arg1, class275 arg2) {
        this.field1234 = arg2;
        this.field1234.method1655(5, (byte) -82);
    }
}
