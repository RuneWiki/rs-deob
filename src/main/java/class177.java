import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class177 extends class160 {

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    private int field2320;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2322 = new String[] { method1487(method1486("A@,O\u0015")), method1487(method1486("A@,M\u0015")), method1487(method1486("A@,6T[Jv4\u0015")), method1487(method1486("A@,H\u0015")), method1487(method1486("A@,N\u0015")), method1487(method1486("[Vnf")), method1487(method1486("N\r,$@")), method1487(method1486("A@,C\u0015")), method1487(method1486("A@,L\u0015")), method1487(method1486("A@,I\u0015")) };

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lwm;")
    public static class440 field2315;

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIII)V", line = 5)
    public class177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        try {
            this.field2314 = arg3;
            this.field2320 = arg0;
            this.field2318 = arg2;
            this.field2311 = arg1;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2322[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V", line = 19)
    public final void method1350(int arg0, int arg1, int arg2) {
        try {
            if (arg1 == 5781) {
                ++field2317;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2322[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lem;B)V", line = 29)
    public static final void method1481(class339 arg0, byte arg1) {
        try {
            ++field2321;
            class576 var2 = (class576) class572.field8289.method3693(false, (long) arg0.field2200);
            if (var2 != null) {
                var2.method4279(-1);
            } else {
                class54.method568(arg0, arg0.field2256[0], 0, arg0.field2252[0], (class717) null, (class789) null, arg0.field2981, false);
            }
            if (arg1 != 1) {
                field2315 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2322[8] + (arg0 != null ? field2322[6] : field2322[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 52)
    public static final void method1482(int arg0) {
        try {
            ++field2319;
            if (arg0 != -14523) {
                field2315 = null;
            }
            if (class322.method2551(class559.field8139, arg0 ^ 14529)) {
                class794.method5727(-1, false);
            } else {
                class747.field10650 = class60.field916.field11096;
                class60.field916.field11096 = null;
                class699.method5035(14, 31754);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2322[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V", line = 71)
    public final void method1349(int arg0, int arg1, int arg2) {
        try {
            ++field2312;
            int var4 = this.field2320 * arg1 >> 12;
            int var5 = this.field2318 * arg1 >> 12;
            if (arg0 != 3289650) {
                field2315 = null;
            }
            int var6 = this.field2311 * arg2 >> 12;
            int var7 = this.field2314 * arg2 >> 12;
            class721.method5221(super.field2049, var4, var5, var6, arg0 ^ 1534114238, var7);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2322[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 91)
    public static void method1483(byte arg0) {
        try {
            field2315 = null;
            if (arg0 <= 90) {
                field2315 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2322[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V", line = 101)
    public final void method1348(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 <= 13) {
                this.field2318 = -118;
            }
            ++field2313;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2322[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILqu;Lka;Lqu;)V", line = 113)
    public static final void method1484(int arg0, class84 arg1, class761 arg2, class84 arg3) {
        try {
            if (arg3.method828(7492) && arg1.method828(7492)) {
                class437 var4 = arg3.field1183;
                class437 var5 = arg1.field1183;
                arg2.method5517(arg1.field1186, var4.field6431, -106, var4.field6450[arg3.field1167], arg1.field1189, var5.field6450[arg1.field1167], arg3.field1166, arg3.field1186, arg1.field1175, arg3.field1189, arg1.field1166, arg3.field1169, var5.field6426 | var4.field6426, arg3.field1175, arg1.field1169);
            }
            if (arg0 <= 63) {
                field2315 = null;
            }
            ++field2316;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2322[7] + arg0 + ',' + (arg1 != null ? field2322[6] : field2322[5]) + ',' + (arg2 != null ? field2322[6] : field2322[5]) + ',' + (arg3 != null ? field2322[6] : field2322[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()V", line = 136)
    public static final void method1485() {
        for (int var0 = 0; var0 < class650.field9243.length; ++var0) {
            class650.field9243[var0].method248();
        }
        class650.field9243 = null;
    }

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1486(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1487(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
