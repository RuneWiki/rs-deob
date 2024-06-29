import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lec;")
    private static class32 field2053 = class73.method594("K", true);

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lec;")
    public static class32 field2056 = class73.method594("Begeben Sie sich in ein freies Gebiet)1 um", true);

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lec;")
    public static class32 field2054 = field2053;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lec;")
    public static class32 field2052 = field2053;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2057 = -1;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lec;")
    public static class32 field2061 = class73.method594("Sichtbare Karte vorbereitet)3", true);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method675(byte arg0) {
        field2052 = null;
        field2056 = null;
        field2061 = null;
        field2053 = null;
        int var1 = 30 % ((50 - arg0) / 38);
        field2054 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lf;Lec;Z)Lec;")
    public static final class32 method676(class36 arg0, class32 arg1, boolean arg2) {
        field2051++;
        if (arg1.method267(1, class128.field2938) == -1) {
            return arg2 ? null : arg1;
        }
        while (true) {
            int var3 = arg1.method267(1, class56.field1309);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.method267(1, class38.field913);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.method267(1, class71.field1665);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.method267(1, class38.field921);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.method267(1, class135.field3147);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.method267(1, class112.field2619);
                                                    if (var8 == -1) {
                                                        return arg2 ? null : arg1;
                                                    }
                                                    class32 var9 = class77.field1787;
                                                    if (class92.field2124 != null) {
                                                        var9 = class28.method191(-116, class92.field2124.field353);
                                                        try {
                                                            if (class92.field2124.field352 != null) {
                                                                byte[] var10 = ((String) class92.field2124.field352).getBytes("ISO-8859-1");
                                                                var9 = class26.method186(var10, (byte) -44, 0, var10.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg1 = class52.method403(new class32[] { arg1.method241((byte) 95, 0, var8), var9, arg1.method268((byte) -128, var8 + 4) }, (byte) -20);
                                                }
                                            }
                                            arg1 = class52.method403(new class32[] { arg1.method241((byte) -120, 0, var7), class53.method421(true, class157.method1220((byte) 23, arg0, 4)), arg1.method268((byte) -61, var7 + 2) }, (byte) -20);
                                        }
                                    }
                                    arg1 = class52.method403(new class32[] { arg1.method241((byte) 96, 0, var6), class53.method421(!arg2, class157.method1220((byte) 23, arg0, 3)), arg1.method268((byte) -102, var6 + 2) }, (byte) -20);
                                }
                            }
                            arg1 = class52.method403(new class32[] { arg1.method241((byte) 50, 0, var5), class53.method421(!arg2, class157.method1220((byte) 23, arg0, 2)), arg1.method268((byte) -53, var5 + 2) }, (byte) -20);
                        }
                    }
                    arg1 = class52.method403(new class32[] { arg1.method241((byte) -116, 0, var4), class53.method421(true, class157.method1220((byte) 23, arg0, 1)), arg1.method268((byte) -5, var4 + 2) }, (byte) -20);
                }
            }
            arg1 = class52.method403(new class32[] { arg1.method241((byte) -118, 0, var3), class53.method421(!arg2, class157.method1220((byte) 23, arg0, 0)), arg1.method268((byte) -15, var3 + 2) }, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lea;I)V")
    public static final void method677(class30 arg0, int arg1) {
        field2059++;
        int var2 = 126 / ((69 - arg1) / 55);
        class4.field56 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILqd;)V")
    public static final void method678(int arg0, class115 arg1) {
        field2058++;
        arg1.field2696 = 0;
        if (arg1.field2753 == 0) {
            arg1.field2744 = 1024;
        }
        if (arg1.field2753 == arg0) {
            arg1.field2744 = 1536;
        }
        if (arg1.field2753 == 2) {
            arg1.field2744 = 0;
        }
        if (arg1.field2753 == 3) {
            arg1.field2744 = 512;
        }
        int var2 = arg1.field2732 - class140.field3219;
        int var3 = arg1.field2713 * 64 + arg1.field2712 * 128;
        int var4 = arg1.field2719 * 128 + arg1.field2713 * 64;
        arg1.field2700 += (var4 - arg1.field2700) / var2;
        arg1.field2749 += (var3 - arg1.field2749) / var2;
    }
}
