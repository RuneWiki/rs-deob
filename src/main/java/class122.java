import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class class122 {

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1445 = new String[] { method1065(method1064("WAy~\u0016")), method1065(method1064("WAyr\u0016")), method1065(method1064("WAy\bWSZ#\n\u0016")), method1065(method1064("F\u001dy\u001aC")), method1065(method1064("WAys\u0016")), method1065(method1064("SF;X")), method1065(method1064("WAy|\u0016")), method1065(method1064("WAy}\u0016")) };

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1439 = "";

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Lika;")
    public static class447 field1441;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "Lla;")
    public static class476 field1440;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIII)I", line = 6)
    public static final int method1057(int arg0, int arg1, int arg2, int arg3) {
        try {
            int var7 = arg2 & 0x3;
            int var4 = -57 / ((-arg1 - 38) / 46);
            field1442++;
            if (var7 == 0) {
                return arg0;
            } else if (var7 == 1) {
                return arg3;
            } else if (var7 == 2) {
                return 7 - arg0;
            } else {
                return 7 - arg3;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1445[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 29)
    public static void method1058(byte arg0) {
        try {
            field1439 = null;
            field1440 = null;
            int var1 = 62 % ((arg0 + 80) / 35);
            field1441 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1445[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([J[Ljava/lang/Object;B)V", line = 49)
    public static final void method1059(long[] arg0, Object[] arg1, byte arg2) {
        try {
            class612.method4528(arg1, 0, -62, arg0.length - 1, arg0);
            field1438++;
            if (arg2 < 3) {
                method1057(-75, -124, 29, 54);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1445[4] + (arg0 == null ? field1445[5] : field1445[3]) + ',' + (arg1 == null ? field1445[5] : field1445[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(III)V", line = 59)
    public class122(int arg0, int arg1, int arg2) {
        try {
            this.field1434 = arg1;
            this.field1435 = arg2;
            this.field1437 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1445[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)V", line = 70)
    public static final void method1060(byte arg0, int arg1) {
        try {
            field1444++;
            if (arg0 >= -107) {
                method1059(null, null, (byte) 85);
            }
            class313 var2 = class196.method1670((long) arg1, 6, 112);
            var2.method2635(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1445[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 86)
    public static final void method1063(int arg0) {
        try {
            field1443++;
            class501.field7244++;
            int var1 = -127 / ((arg0 - 33) / 40);
            class280 var2 = class610.method4508(class73.field836, class279.field4190, (byte) -78);
            var2.field4197.method1428((byte) -24, class451.method3463(1));
            var2.field4197.method1406(class179.field2489, 380332136);
            var2.field4197.method1406(class94.field1062, 380332136);
            var2.field4197.method1428((byte) -24, class289.field4305.field826.method4430(false));
            class106.method934((byte) 53, var2);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1445[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIB)V")
    public abstract void method1056(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZII)V")
    public abstract void method1061(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
    public abstract void method1062(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1064(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1065(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
