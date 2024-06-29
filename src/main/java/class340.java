import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class340 {

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lig;")
    private class687 field4949 = new class687();

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Ldp;")
    private class514 field4957 = new class514();

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    private int field4959;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    private int field4958;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "Ldfa;")
    private class477 field4960;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4961 = new String[] { method2736(method2735("l\u0010=D8")), method2736(method2735("l\u0010=B8")), method2736(method2735("l\u0010=@8")), method2736(method2735("l\u0010=C8")), method2736(method2735("t\t\u007fm")), method2736(method2735("aR=/m")), method2736(method2735("l\u0010=E8")), method2736(method2735("l\u0010==yt\u0015g?8")) };

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field4956 = 328;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lpca;")
    public static class774 field4955;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZJ)Lig;")
    public final class687 method2730(boolean arg0, long arg1) {
        try {
            field4954++;
            if (!arg0) {
                this.method2730(false, 97L);
            }
            class687 var4 = (class687) this.field4960.method3693(false, arg1);
            if (var4 != null) {
                this.field4957.method3937(arg0, var4);
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4961[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
    public final void method2731(boolean arg0) {
        try {
            field4952++;
            if (arg0) {
                this.field4949 = null;
            }
            this.field4957.method3936((byte) 98);
            this.field4960.method3690((byte) 79);
            this.field4949 = new class687();
            this.field4959 = this.field4958;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4961[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(ZJ)V")
    public final void method2732(boolean arg0, long arg1) {
        try {
            field4953++;
            class687 var4 = (class687) this.field4960.method3693(arg0, arg1);
            if (var4 != null) {
                var4.method4294(0);
                var4.method4911(120);
                this.field4959++;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4961[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method2733(int arg0) {
        try {
            int var1 = 69 % ((arg0 - 34) / 55);
            field4955 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4961[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(JILig;)V")
    public final void method2734(long arg0, int arg1, class687 arg2) {
        try {
            if (this.field4959 == 0) {
                class687 var5 = this.field4957.method3938((byte) 124);
                var5.method4294(0);
                var5.method4911(117);
                if (this.field4949 == var5) {
                    class687 var6 = this.field4957.method3938((byte) -86);
                    var6.method4294(0);
                    var6.method4911(122);
                }
            } else {
                this.field4959--;
            }
            field4950++;
            this.field4960.method3691(arg2, arg0, arg1);
            this.field4957.method3937(true, arg2);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4961[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4961[4] : field4961[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(I)V")
    public class340(int arg0) {
        try {
            this.field4959 = arg0;
            this.field4958 = arg0;
            int var2;
            for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
            }
            this.field4960 = new class477(var2);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4961[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2735(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2736(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
