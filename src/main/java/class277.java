import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class277 {

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4177 = new String[] { method2283(method2282("VXY3:\u0013")), method2283(method2282("VXY39\u0013")), method2283(method2282("VXY3;\u0013")) };

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "Z")
    public static boolean field4172 = false;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "Lwh;")
    public static class158 field4174 = null;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "I")
    public static int field4176 = 0;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "Lla;")
    public static class476 field4170;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 3)
    public static final String method2279(byte arg0, int arg1) {
        try {
            field4173++;
            if (arg0 != 93) {
                field4172 = false;
            }
            class753 var2 = (class753) class195.field2615.method977((long) arg1, 1);
            if (var2 != null) {
                class732 var3 = var2.field10955.method924((byte) -111);
                if (var3 != null) {
                    double var4 = var2.field10955.method909((byte) 87);
                    if (var4 >= (double) var3.method5337(true) && (double) var3.method5335((byte) 126) >= var4) {
                        return var3.method5340(0);
                    }
                }
            }
            return null;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4177[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)V", line = 38)
    public static void method2280(byte arg0) {
        try {
            field4170 = null;
            if (arg0 > -39) {
                field4175 = 78;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4177[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V", line = 64)
    public static final void method2281(byte arg0) {
        try {
            if (class646.field9353 != null) {
                class646.field9353.method4051((byte) 19);
            }
            field4171++;
            if (class417.field6140 != null) {
                class417.field6140.method4051((byte) 19);
            }
            int var1 = -49 % ((arg0 + 67) / 59);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4177[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2282(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2283(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
