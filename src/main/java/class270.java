import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class270 {

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "Lui;")
    private class251 field3826 = new class251(256);

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "Ld;")
    private class673 field3821;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "Ljj;")
    private class334 field3824;

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3829 = new String[] { method2216(method2215("*\u0013\u00018\u0016")), method2216(method2215("*\u0013\u0001=\u0016")), method2216(method2215("*\u0013\u0001;\u0016")), method2216(method2215(".\u0013C\u0015")), method2216(method2215(";H\u0001WC")), method2216(method2215("*\u0013\u0001EW.\u000f[G\u0016")), method2216(method2215("*\u0013\u0001:\u0016")) };

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "Lui;")
    public static class251 field3827 = new class251(5);

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "[I")
    public static int[] field3828 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public final void method2211(byte arg0) {
        try {
            field3822++;
            int var2 = 21 / ((-arg0 - 56) / 39);
            this.field3826.method2043(false);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3829[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V")
    public final void method2212(byte arg0) {
        try {
            field3825++;
            this.field3826.method2038(0, 5);
            if (arg0 != 60) {
                field3828 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3829[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method2213(int arg0) {
        try {
            if (arg0 != 2023) {
                field3828 = null;
            }
            field3828 = null;
            field3827 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3829[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)Lcf;")
    public final class196 method2214(int arg0, byte arg1) {
        try {
            field3823++;
            Object var3 = this.field3826.method2053(0, (long) arg0);
            if (var3 != null) {
                return (class196) var3;
            } else if (this.field3821.method4504(arg0, -31410)) {
                class684 var4 = this.field3821.method4500(arg1 - 23615, arg0);
                int var5 = var4.field9599 ? 64 : this.field3824.field4769;
                if (arg1 != -26) {
                    return null;
                }
                class196 var7;
                if (var4.field9585 && this.field3824.method217()) {
                    float[] var8 = this.field3821.method4501(false, var5, arg0, var5, true, 0.7F);
                    var7 = this.field3824.method2667(var5, var4.field9597 != 0, (byte) 58, var8, class385.field5635, var5);
                } else {
                    int[] var6;
                    if (var4.field9584 != 2 && class619.method4555(var4.field9605, -83)) {
                        var6 = this.field3821.method4502(0.7F, var5, arg1 - 84, var5, arg0, true);
                    } else {
                        var6 = this.field3821.method4499(var5, var5, -7994, false, 0.7F, arg0);
                    }
                    var7 = this.field3824.method2613(var5, 10, var4.field9597 != 0, var6, var5);
                }
                var7.method1706(-18440, var4.field9601, var4.field9590);
                this.field3826.method2051((long) arg0, var7, arg1 ^ 0xFFFFFFBB);
                return var7;
            } else {
                return null;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3829[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ljj;Ld;)V")
    public class270(class334 arg0, class673 arg1) {
        try {
            this.field3821 = arg1;
            this.field3824 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3829[5] + (arg0 == null ? field3829[3] : field3829[4]) + ',' + (arg1 == null ? field3829[3] : field3829[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2215(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2216(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
