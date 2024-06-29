import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class645 extends class206 {

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public int field9346;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public int field9345;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9350 = new String[] { method4752(method4751("\u007fhi*\u000eem3(O")), method4752(method4751("\u007fhiUO")), method4752(method4751("\u007fhiRO")), method4752(method4751("\u007fhiWO")) };

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lwia;")
    public static class790 field9348 = new class790(46, 2);

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static void method4747(int arg0) {
        try {
            field9348 = null;
            if (arg0 != 10) {
                method4748(null);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9350[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ldf;)V")
    public static final void method4748(class420 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class420 var2 = null;
            for (class420 var3 = class106.field1228[var1]; var3 != null; var3 = var3.field6207) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class106.field1228[var1] = var3.field6207;
                    } else {
                        var2.field6207 = var3.field6207;
                    }
                    class222.field3412 = true;
                    return;
                }
                var2 = var3;
            }
            class420 var4 = null;
            for (class420 var5 = class273.field4136[var1]; var5 != null; var5 = var5.field6207) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class273.field4136[var1] = var5.field6207;
                    } else {
                        var4.field6207 = var5.field6207;
                    }
                    class222.field3412 = true;
                    return;
                }
                var4 = var5;
            }
            class420 var6 = null;
            for (class420 var7 = class74.field862[var1]; var7 != null; var7 = var7.field6207) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class74.field862[var1] = var7.field6207;
                    } else {
                        var6.field6207 = var7.field6207;
                    }
                    class222.field3412 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIII)V")
    public static final void method4749(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field9347++;
            class313 var5 = class196.method1670((long) arg0, 10, -116);
            var5.method2636((byte) 86);
            var5.field4952 = arg2;
            var5.field4958 = arg1;
            var5.field4951 = arg3;
            int var6 = -24 / ((arg4 - 9) / 34);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9350[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)V")
    public static final void method4750(int arg0, byte arg1) {
        try {
            field9349++;
            class313 var2 = class196.method1670((long) arg0, 1, -100);
            if (arg1 != 23) {
                field9348 = null;
            }
            var2.method2635(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9350[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
    public class645(int arg0, int arg1) {
        try {
            this.field9346 = arg0;
            this.field9345 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9350[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4751(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4752(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 71;
                    break;
                case 3:
                    var10005 = 22;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
