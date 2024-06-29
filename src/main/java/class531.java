import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class531 {

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7702 = new String[] { method4022(method4021("$,1uh")), method4022(method4021("$,1wh")), method4022(method4021("$,1vh")) };

    @OriginalMember(owner = "client!je", name = "a", descriptor = "D")
    public static double field7697;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lha;")
    public static class18 field7699;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Llga;")
    public static class47 field7700;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 4)
    public static void method4018(int arg0) {
        try {
            field7700 = null;
            if (arg0 == 16) {
                field7699 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7702[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 19)
    public static final void method4019(int arg0, int arg1) {
        try {
            if (arg1 <= 72) {
                method4020(102, (byte) 79);
            }
            field7701++;
            class500 var2 = (class500) class687.field9624.method3693(false, (long) arg0);
            if (var2 != null) {
                var2.field7313.method3111(4507);
                class63.method682(123, var2.field7305, var2.field7310);
                var2.method4294(0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7702[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)I", line = 39)
    public static final int method4020(int arg0, byte arg1) {
        try {
            field7698++;
            if (arg1 >= -42) {
                field7697 = -0.9549275745733687D;
            }
            int var2 = arg0 & 0x3F;
            int var3 = (arg0 & 0xFF) >> 6;
            if (var2 == 18) {
                if (var3 == 0) {
                    return 1;
                }
                if (var3 == 1) {
                    return 2;
                }
                if (var3 == 2) {
                    return 4;
                }
                if (var3 == 3) {
                    return 8;
                }
            } else if (var2 == 19 || var2 == 21) {
                if (var3 == 0) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
            return 0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7702[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!je", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4021(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!je", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4022(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
