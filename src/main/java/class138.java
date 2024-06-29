import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class138 {

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "Liha;")
    private class29 field1932 = new class29(16);

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Lgda;")
    private class58 field1940;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1943 = new String[] { method1289(method1288("\u0006\\\u000fqN")), method1289(method1288("\u0006\\\u000ftN")), method1289(method1288("\u0000^MZ")), method1289(method1288("\u0006\\\u000f\n\u000f\u0000BU\bN")), method1289(method1288("\u0015\u0005\u000f\u0018\u001b")), method1289(method1288("\u0006\\\u000fuN")), method1289(method1288("\u0006\\\u000f~N")), method1289(method1288("\nN@")), method1289(method1288("\u0006\\\u000fwN")), method1289(method1288("\u0006\\\u000fpN")), method1289(method1288("\u0006\\\u000fsN")), method1289(method1288("\u0006\\\u000frN")) };

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "Lhl;")
    public static class556 field1938 = new class556(130, 12);

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "Lak;")
    public static class369 field1942 = new class369();

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIIZI)V", line = 4)
    public static final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        try {
            field1936++;
            if ((arg6 ? class623.field8996.field6354.method4796(true) : class623.field8996.field6358.method4796(true)) != 0 && arg7 != 0 && class490.field7395 < 50 && arg4 != -1) {
                class771.field11308[class490.field7395++] = new class746((byte) (arg6 ? 3 : 2), arg4, arg7, arg1, arg0, arg5, arg3, null);
            }
            if (arg2 == 30) {
                ;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1943[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(B)V", line = 23)
    public static void method1281(byte arg0) {
        try {
            int var1 = 26 / ((arg0 + 29) / 53);
            field1942 = null;
            field1938 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1943[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V", line = 33)
    public final void method1282(int arg0, int arg1) {
        try {
            field1935++;
            class29 var3 = this.field1932;
            synchronized (this.field1932) {
                if (arg1 != 862629443) {
                    this.field1940 = null;
                }
                this.field1932.method294(arg0, -630);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1943[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IB)Ltha;", line = 49)
    public final class307 method1283(int arg0, byte arg1) {
        try {
            field1933++;
            class29 var3 = this.field1932;
            class307 var4;
            synchronized (this.field1932) {
                var4 = (class307) this.field1932.method302(-87, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field1940;
            byte[] var6;
            synchronized (this.field1940) {
                var6 = this.field1940.method604((byte) -126, arg0, 30);
                if (arg1 < 77) {
                    this.method1287(108);
                }
            }
            class307 var7 = new class307();
            if (var6 != null) {
                var7.method2638(new class176(var6), 13618);
            }
            class29 var8 = this.field1932;
            synchronized (this.field1932) {
                this.field1932.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1943[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 84)
    public final void method1284(byte arg0) {
        try {
            class29 var2 = this.field1932;
            synchronized (this.field1932) {
                this.field1932.method304(1);
            }
            field1941++;
            if (arg0 > -27) {
                this.method1283(-93, (byte) -44);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1943[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)V", line = 100)
    public static final void method1285(byte arg0) {
        try {
            if (arg0 < 59) {
                field1942 = null;
            }
            if (class663.method4811((byte) -8, class315.field5127) || class592.method4342(false, class315.field5127)) {
                class700.method5079(class133.field1896 >> 12, class791.field11550 >> 12, 5000, 0);
            } else {
                int var1 = class438.field6846.field1201[0] >> 3;
                int var2 = class438.field6846.field1200[0] >> 3;
                if (var1 >= 0 && var1 < (class126.field1823 >> 3) && var2 >= 0 && var2 < (class169.field2725 >> 3)) {
                    class700.method5079(var2, var1, 5000, 0);
                } else {
                    class700.method5079(class169.field2725 >> 4, class126.field1823 >> 4, 0, 0);
                }
            }
            field1937++;
            class570.method4198(65280);
            class289.method2438(-398200286);
            class18.method123(2);
            class391.method3181(43);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1943[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIILjava/awt/Canvas;)Lwga;", line = 130)
    public static final class782 method1286(int arg0, int arg1, int arg2, Canvas arg3) {
        try {
            field1934++;
            try {
                if (arg0 == 6582) {
                    Class var4 = Class.forName(field1943[7]);
                    class782 var5 = (class782) var4.getDeclaredConstructor().newInstance();
                    var5.method2167(arg2, arg3, 0, arg1);
                    return var5;
                } else {
                    return null;
                }
            } catch (Throwable var8) {
                class374 var6 = new class374();
                var6.method2167(arg2, arg3, 0, arg1);
                return var6;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1943[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1943[2] : field1943[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 154)
    public final void method1287(int arg0) {
        try {
            field1939++;
            class29 var2 = this.field1932;
            synchronized (this.field1932) {
                this.field1932.method298(5);
                int var3 = 47 / ((arg0 + 29) / 42);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1943[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 171)
    public class138(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field1940 = arg2;
            this.field1940.method580(120, 30);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1943[3] + (arg0 == null ? field1943[2] : field1943[4]) + ',' + arg1 + ',' + (arg2 == null ? field1943[2] : field1943[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1288(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1289(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 110;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
