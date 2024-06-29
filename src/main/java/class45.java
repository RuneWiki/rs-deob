import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class45 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "Lwq;")
    private class178 field517 = new class178(64);

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "Lla;")
    private class476 field524;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field526 = new String[] { method358(method357("X!\b\u0018\u0017\u0006")), method358(method357("X!\b\u0018\u0016\u0006")), method358(method357("@6\u0005Z")), method358(method357("X!\b\u0018nG-\u0000Bl\u0006")), method358(method357("UmG\u0018/")), method358(method357("X!\b\u0018\u0013\u0006")), method358(method357("X!\b\u0018\u0015\u0006")), method358(method357("X!\b\u0018\u0014\u0006")), method358(method357("X!\b\u0018\u0011\u0006")), method358(method357("X!\b\u0018\u0010\u0006")) };

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "Lel;")
    public static class573 field525 = new class573(97, 6);

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V")
    public static final void method350(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field518++;
            if (arg1 <= arg0) {
                class319.method2702(class243.field3731[arg4], arg1, arg0, true, arg3);
            } else {
                class319.method2702(class243.field3731[arg4], arg0, arg1, true, arg3);
            }
            int var5 = -120 / ((arg2 + 21) / 41);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field526[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)Lwi;")
    public final class491 method351(int arg0, int arg1) {
        try {
            field522++;
            class178 var3 = this.field517;
            class491 var4;
            synchronized (this.field517) {
                var4 = (class491) this.field517.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field524;
            byte[] var6;
            synchronized (this.field524) {
                var6 = this.field524.method3632(arg1, arg0, -9);
            }
            class491 var7 = new class491();
            if (var6 != null) {
                var7.method3712(new class163(var6), 83);
            }
            class178 var8 = this.field517;
            synchronized (this.field517) {
                this.field517.method1556((long) arg0, var7, arg1 - 30);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field526[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
    public final void method352(byte arg0) {
        try {
            class178 var2 = this.field517;
            synchronized (this.field517) {
                this.field517.method1559(0);
            }
            if (arg0 < -56) {
                field521++;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field526[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)V")
    public static void method353(byte arg0) {
        try {
            if (arg0 != 2) {
                field525 = null;
            }
            field525 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field526[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BI)V")
    public final void method354(byte arg0, int arg1) {
        try {
            field520++;
            class178 var3 = this.field517;
            synchronized (this.field517) {
                this.field517.method1557(arg1, (byte) -118);
            }
            if (arg0 >= -100) {
                method350(-72, -74, 21, -128, -88);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field526[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public final void method355(int arg0) {
        try {
            field519++;
            class178 var2 = this.field517;
            synchronized (this.field517) {
                if (arg0 < 78) {
                    this.field517 = null;
                }
                this.field517.method1569(10574);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field526[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)I")
    public static final int method356(byte arg0) {
        try {
            field523++;
            int var1 = class722.field10460.method4649(3);
            if ((class717.field10385.length - 1) > var1) {
                class722.field10460 = class717.field10385[var1 + 1];
            }
            if (arg0 >= -19) {
                field525 = null;
            }
            return 100;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field526[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lto;ILla;)V")
    public class45(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field524 = arg2;
            this.field524.method3646(31, (byte) -38);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field526[3] + (arg0 == null ? field526[2] : field526[4]) + ',' + arg1 + ',' + (arg2 == null ? field526[2] : field526[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method357(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method358(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
