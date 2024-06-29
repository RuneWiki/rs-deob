import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1251 = 0;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lsc;")
    private static class128 field1250 = class129.method1017(false, "Unexpected server response)3");

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lsc;")
    public static class128 field1253 = class129.method1017(false, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lsc;")
    public static class128 field1255 = class129.method1017(false, "<col=80ff00>");

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lsc;")
    public static class128 field1249 = field1250;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "[I")
    public static int[] field1256 = new int[] { 6, 0, 0, 0, 6, 0, 0, 11, 3, 0, 0, 0, 0, 0, 2, 4, 0, 0, 0, 6, 0, 0, 0, 0, 6, 0, 2, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 4, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, -2, 0, 0, 0, 5, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 5, 2, -2, 0, 0, 7, 0, -2, 0, 0, 3, 2, 0, 0, 0, 2, 0, 8, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, -2, 0, 10, 10, 0, 0, 0, 0, 6, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 4, 0, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, -2, 0, 11, 0, 0, 1, 0, 7, -2, 0, 0, 3, 0, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, 24, 0, 7, 2, 0, 0, -1, 3, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, -2, 0, 0 };

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lsc;")
    private static class128 field1258 = class129.method1017(false, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lsc;")
    public static class128 field1248 = field1258;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Lhe;")
    public static class54 field1257;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[Lb;")
    public static class8[] field1246;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method441(int arg0) {
        class124.field2802 = 0;
        class97.field2260 = arg0;
        class144.method1169(-125);
        field1247++;
        class40.method288(23097);
        class7.method33((byte) -122);
        for (int var1 = 0; var1 < class97.field2260; var1++) {
            int var3 = class124.field2799[var1];
            if (class29.field554 != class92.field2104[var3].field1006) {
                class92.field2104[var3].field1028 = null;
                class92.field2104[var3] = null;
            }
        }
        if (class128.field2942 != class158.field3626.field1924) {
            throw new RuntimeException("gnp1 pos:" + class158.field3626.field1924 + " psize:" + class128.field2942);
        }
        for (int var2 = 0; var2 < class41.field767; var2++) {
            if (class92.field2104[class68.field1528[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class41.field767);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method442(byte arg0) {
        field1253 = null;
        if (arg0 != 113) {
            method442((byte) -25);
        }
        field1258 = null;
        field1250 = null;
        field1246 = null;
        field1257 = null;
        field1256 = null;
        field1255 = null;
        field1248 = null;
        field1249 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/awt/Component;ILbb;I)Lnb;")
    public static final class92 method443(int arg0, Component arg1, int arg2, class10 arg3, int arg4) {
        field1252++;
        if (class49.field920 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class92 var5 = (class92) Class.forName("nf").getDeclaredConstructor().newInstance();
                var5.field2078 = new int[(class73.field1624 ? 2 : 1) * 256];
                var5.field2116 = arg2;
                var5.method283(arg1);
                var5.field2113 = (arg2 & -1024) + 1024;
                if (var5.field2113 > 16384) {
                    var5.field2113 = 16384;
                }
                var5.method280(var5.field2113);
                if (class71.field1602 > 0 && class84.field1873 == null) {
                    class84.field1873 = new class25();
                    class84.field1873.field494 = arg3;
                    arg3.method86(class84.field1873, arg0 + 12019, class71.field1602);
                }
                if (class84.field1873 != null) {
                    if (class84.field1873.field501[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class84.field1873.field501[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                if (arg0 != -11911) {
                    return null;
                }
                try {
                    class39 var6 = new class39(arg3, arg4);
                    var6.field2116 = arg2;
                    var6.field2078 = new int[(class73.field1624 ? 2 : 1) * 256];
                    var6.method283(arg1);
                    var6.field2113 = 16384;
                    var6.method280(var6.field2113);
                    if (class71.field1602 > 0 && class84.field1873 == null) {
                        class84.field1873 = new class25();
                        class84.field1873.field494 = arg3;
                        arg3.method86(class84.field1873, arg0 + 12026, class71.field1602);
                    }
                    if (class84.field1873 != null) {
                        if (class84.field1873.field501[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class84.field1873.field501[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class92();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)Lsc;")
    public static final class128 method444(int arg0, boolean arg1) {
        if (arg1) {
            field1251 = -71;
        }
        field1254++;
        return class51.method395(new class128[] { class111.method857(arg0 >> 24 & 0xFF, (byte) -42), class12.field199, class111.method857(arg0 >> 16 & 0xFF, (byte) -81), class12.field199, class111.method857(arg0 >> 8 & 0xFF, (byte) -11), class12.field199, class111.method857(arg0 & 0xFF, (byte) -83) }, arg1);
    }
}
