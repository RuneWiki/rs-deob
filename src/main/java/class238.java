import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class238 extends class206 {

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public int field3609 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public int field3610 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jda", name = "v", descriptor = "I")
    public int field3606 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
    public int field3607 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "I")
    public int field3615 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "I")
    public int field3616 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
    public int field3618 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jda", name = "x", descriptor = "I")
    public int field3614 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "Lco;")
    public class131 field3611;

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3619 = new String[] { method2046(method2045("he5!\u0004*")), method2046(method2045("y/z!8")), method2046(method2045("lt8c")), method2046(method2045("he5!\u0006*")), method2046(method2045("he5!\u0007*")), method2046(method2045("he5!yko={{*")), method2046(method2045("he5!\u0001*")) };

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!jda", name = "w", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field3613;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "[Ldf;")
    public static class420[] field3604;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
    public static final void method2041(byte arg0) {
        try {
            field3605++;
            if (arg0 == -43 && class324.field5123 != null) {
                for (int var1 = 0; var1 < class324.field5123.length; var1++) {
                    for (int var2 = 0; var2 < class324.field5123[var1].length; var2++) {
                        class324.field5123[var1][var2] = class719.field10409;
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3619[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
    public static void method2042(int arg0) {
        try {
            if (arg0 != -6915) {
                field3613 = null;
            }
            field3613 = null;
            field3604 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3619[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BII)Z")
    public final boolean method2043(byte arg0, int arg1, int arg2) {
        try {
            field3612++;
            if (arg0 < 111) {
                this.method2043((byte) 27, 21, -43);
            }
            if (this.field3614 <= arg2 && arg2 <= this.field3615 && this.field3607 <= arg1 && arg1 <= this.field3606) {
                return true;
            } else {
                return this.field3610 <= arg2 && arg2 <= this.field3609 && arg1 >= this.field3618 && arg1 <= this.field3616;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3619[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z[I[Ljava/lang/Object;)V")
    public static final void method2044(boolean arg0, int[] arg1, Object[] arg2) {
        try {
            if (arg0) {
                field3608++;
                class69.method626(0, arg1, (byte) -62, arg2, arg1.length - 1);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3619[3] + arg0 + ',' + (arg1 == null ? field3619[2] : field3619[1]) + ',' + (arg2 == null ? field3619[2] : field3619[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lco;)V")
    public class238(class131 arg0) {
        try {
            this.field3611 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3619[5] + (arg0 == null ? field3619[2] : field3619[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2045(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2046(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
