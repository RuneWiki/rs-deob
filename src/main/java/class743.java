import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class743 {

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "Lui;")
    private class251 field10556 = new class251(128);

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "Llga;")
    private class47 field10554;

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10564 = new String[] { method5386(method5385("If5Y\u000e")), method5386(method5385("P+zY1\u001a")), method5386(method5385("\\=w\u001b")), method5386(method5385("X)z")), method5386(method5385("P+zY0\u001a")), method5386(method5385("P+zYO[&r\u0003M\u001a")), method5386(method5385("P+zY2\u001a")) };

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "J")
    public static long field10555 = 0L;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "Lch;")
    public static class752 field10561 = null;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "F")
    public static float field10560;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
    public static int field10562;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "J")
    public static long field10557;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bca", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field10563;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)Lrd;")
    public final class798 method5381(byte arg0, int arg1) {
        try {
            field10562++;
            class251 var3 = this.field10556;
            class798 var4;
            synchronized (this.field10556) {
                var4 = (class798) this.field10556.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            byte[] var5 = this.field10554.method512(class616.method4538((byte) -109, arg1), class105.method1000(-119, arg1), (byte) -21);
            class798 var6 = new class798();
            if (var5 != null) {
                var6.method5756(28876, new class711(var5));
            }
            class251 var7 = this.field10556;
            synchronized (this.field10556) {
                this.field10556.method2051((long) arg1, var6, 93);
            }
            return arg0 >= -36 ? null : var6;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10564[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method5382(String arg0, boolean arg1) {
        try {
            if (arg1) {
                field10559++;
                return class747.method5406(arg0, field10563 == null ? (field10563 = method5384(field10564[3])) : field10563, arg1);
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10564[1] + (arg0 == null ? field10564[2] : field10564[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IB)[I")
    public static final int[] method5383(int arg0, byte arg1) {
        try {
            field10558++;
            int[] var2 = new int[3];
            class635.method4635(true, class356.method2849(arg0, (byte) -43));
            var2[0] = class267.field3785.get(5);
            var2[1] = class267.field3785.get(2);
            if (arg1 < 56) {
                return null;
            } else {
                var2[2] = class267.field3785.get(1);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10564[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lfs;ILlga;)V")
    public class743(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field10554 = arg2;
            if (this.field10554 != null) {
                int var4 = this.field10554.method535((byte) -110) - 1;
                this.field10554.method509(true, var4);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10564[5] + (arg0 == null ? field10564[2] : field10564[0]) + ',' + arg1 + ',' + (arg2 == null ? field10564[2] : field10564[0]) + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method5384(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5385(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5386(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
