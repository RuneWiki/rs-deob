import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class739 {

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10518 = new String[] { method5364(method5363("?U{:\u0007x")), method5364(method5363(">Bvx")), method5364(method5363("+\u00194:9")), method5364(method5363("?U{:\u0006x")), method5364(method5363("?U{:0?dnf->P2")), method5364(method5363("?U{:\u0005x")) };

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public static int field10514;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field10515;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field10516;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public static int field10517;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIII)V")
    public static final void method5360(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field10515++;
            if (arg4 != -1) {
                method5362(true);
            }
            int var5 = class183.field2371;
            if (var5 != 0) {
                if (var5 == 1) {
                    class560.field8148 = arg0;
                    class387.field5646 = arg1;
                    class665.field9397 = arg3;
                    class183.field2371 = 2;
                    class151.field1932 = arg2;
                } else if (var5 == 2) {
                    if (class560.field8148 > arg0) {
                        class560.field8148 = arg0;
                    }
                    if (class151.field1932 < arg2) {
                        class151.field1932 = arg2;
                    }
                    if (class665.field9397 > arg3) {
                        class665.field9397 = arg3;
                    }
                    if (arg1 > class387.field5646) {
                        class387.field5646 = arg1;
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10518[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field10517++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10518[4] + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILao;IIBI)V")
    public static final void method5361(int arg0, class626 arg1, int arg2, int arg3, byte arg4, int arg5) {
        try {
            field10516++;
            if (arg4 != -37) {
                method5361(-89, null, -34, -70, (byte) 91, -26);
            }
            class224 var6 = null;
            for (class224 var7 = (class224) class631.field8964.method3977((byte) -127); var7 != null; var7 = (class224) class631.field8964.method3987(0)) {
                if (var7.field3256 == arg2 && var7.field3248 == arg3 && var7.field3247 == arg5 && var7.field3258 == arg0) {
                    var6 = var7;
                    break;
                }
            }
            if (var6 == null) {
                var6 = new class224();
                var6.field3247 = arg5;
                var6.field3248 = arg3;
                var6.field3258 = arg0;
                var6.field3256 = arg2;
                class631.field8964.method3984(var6, 0);
            }
            var6.field3243 = true;
            var6.field3245 = arg1;
            var6.field3259 = false;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10518[3] + arg0 + ',' + (arg1 == null ? field10518[1] : field10518[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V")
    public static final void method5362(boolean arg0) {
        try {
            field10514++;
            class153.field1957.method2043(arg0);
            class207.field3023.method2043(false);
            class140.field1821.method2043(false);
            class229.field3321.method2043(false);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10518[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5363(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5364(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
