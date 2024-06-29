import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class671 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field9453;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public int field9450;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public int field9449;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public int field9447;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9458 = new String[] { method4832(method4831("u\u0019m\u0014m")), method4832(method4831("u\u0019mk,s\u001a7im")), method4832(method4831("u\u0019m\u0016m")), method4832(method4831("u\u0019m#*N\u00071>+z[")), method4832(method4831("s\u0006/;")), method4832(method4831("f]my8")), method4832(method4831("u\u0019m\u0015m")) };

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field9454 = 0;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lqh;")
    public static class149 field9451;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lht;")
    public static class792 field9456;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BZ)V", line = 4)
    public static final void method4828(byte arg0, boolean arg1) {
        try {
            field9457++;
            class635.method4633(86);
            if (class211.method1781(class559.field8139, (byte) -60)) {
                int var2 = 59 % ((-arg0 - 47) / 59);
                class779[] var3 = class60.field926;
                for (int var4 = 0; var4 < var3.length; var4++) {
                    class779 var5 = var3[var4];
                    var5.field11107++;
                    if (var5.field11107 < 50 && !arg1) {
                        return;
                    }
                    var5.field11107 = 0;
                    if (!var5.field11101 && var5.field11096 != null) {
                        class38.field595++;
                        class274 var6 = class375.method2969((byte) 1, class691.field9664, var5.field11100);
                        var5.method5608(var6, 29867);
                        try {
                            var5.method5603(0);
                        } catch (IOException var8) {
                            var5.field11101 = true;
                        }
                    }
                }
                class635.method4633(113);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9458[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 56)
    public static void method4829(int arg0) {
        try {
            field9451 = null;
            if (arg0 == -18339) {
                field9456 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9458[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "toString", descriptor = "()Ljava/lang/String;", line = 70)
    public final String toString() {
        try {
            field9448++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9458[3] + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIII)V", line = 77)
    public class671(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field9453 = arg3;
            this.field9450 = arg1;
            this.field9449 = arg0;
            this.field9447 = arg2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9458[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lvo;Lvo;I)V", line = 94)
    public static final void method4830(class782 arg0, class782 arg1, int arg2) {
        try {
            class51.field724++;
            field9455++;
            class274 var3 = class375.method2969((byte) 1, class287.field4067, class60.field916.field11100);
            var3.field3885.method5121(-127, arg1.field11158);
            var3.field3885.method5138((byte) -103, arg1.field11276);
            if (arg2 > 97) {
                var3.field3885.method5143(94, arg0.field11206);
                var3.field3885.method5122(arg0.field11158, (byte) 19);
                var3.field3885.method5082(-128, arg0.field11276);
                var3.field3885.method5143(-93, arg1.field11206);
                class60.field916.method5608(var3, 29867);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9458[6] + (arg0 == null ? field9458[4] : field9458[5]) + ',' + (arg1 == null ? field9458[4] : field9458[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4831(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4832(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 67;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
