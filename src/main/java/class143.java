import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class143 extends RuntimeException {

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Ljava/lang/String;")
    public String field2813;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2806;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "[I")
    public static int[] field2808 = new int[32];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Leh;")
    public static class47 field2805 = class195.method1282((byte) -4, "::clientdrop");

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field2816 = 0;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Leh;")
    public static class47 field2818 = class195.method1282((byte) -4, "gelb:");

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Leh;")
    private static class47 field2807 = class195.method1282((byte) -4, "Login server offline)3");

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Leh;")
    public static class47 field2819 = class195.method1282((byte) -4, "(U1");

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Leh;")
    public static class47 field2809 = class195.method1282((byte) -4, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Leh;")
    public static class47 field2817 = field2807;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Leh;")
    private static class47 field2820 = class195.method1282((byte) -4, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Leh;")
    public static class47 field2810 = field2820;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Z")
    public static final boolean method1021(int arg0) {
        field2815++;
        try {
            if (class9.field211 == 2) {
                if (class204.field4013 == null) {
                    class204.field4013 = class71.method629(class86.field1848, class20.field387, class3.field36);
                    if (class204.field4013 == null) {
                        return false;
                    }
                }
                if (client.field537 == null) {
                    client.field537 = new class148(class140.field2751, class107.field2232);
                }
                if (class181.field3468.method786(class76.field1654, 101, client.field537, class204.field4013, 22050)) {
                    class181.field3468.method773((byte) 110);
                    class181.field3468.method760((byte) 28, class189.field3668);
                    class181.field3468.method789(class204.field4013, false, class86.field1841);
                    class9.field211 = 0;
                    class204.field4013 = null;
                    client.field537 = null;
                    class86.field1848 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class181.field3468.method792((byte) -35);
            class204.field4013 = null;
            class9.field211 = 0;
            client.field537 = null;
            class86.field1848 = null;
        }
        if (arg0 != -15252) {
            method1023(125, -128, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method1022(byte arg0) {
        field2818 = null;
        field2810 = null;
        field2809 = null;
        field2819 = null;
        field2808 = null;
        field2820 = null;
        if (arg0 != -52) {
            field2810 = null;
        }
        field2817 = null;
        field2805 = null;
        field2807 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II[Lgf;)V")
    public static final void method1023(int arg0, int arg1, class61[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class61 var5 = arg2[var3];
            if (var5 != null) {
                if (var5.field1311 == 0) {
                    if (var5.field1227 != null) {
                        method1023(-92, arg1, var5.field1227);
                    }
                    class63 var6 = (class63) class138.field2710.method1342((long) var5.field1211, (byte) -20);
                    if (var6 != null) {
                        class76.method662((byte) -35, var6.field1349, arg1);
                    }
                }
                if (arg1 == 0 && var5.field1202 != null) {
                    class43 var7 = new class43();
                    var7.field859 = var5;
                    var7.field871 = var5.field1202;
                    class188.method1242(var7, 123);
                }
                if (arg1 == 1 && var5.field1302 != null) {
                    if (var5.field1263 >= 0) {
                        class61 var8 = class23.method224(var5.field1211, 484111152);
                        if (var8 == null || var8.field1227 == null || var8.field1227.length <= var5.field1263 || var8.field1227[var5.field1263] != var5) {
                            continue;
                        }
                    }
                    class43 var9 = new class43();
                    var9.field859 = var5;
                    var9.field871 = var5.field1302;
                    class188.method1242(var9, 110);
                }
            }
        }
        int var4 = 29 % ((arg0 + 48) / 40);
        field2812++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lah;Leh;ILah;Leh;)Ljh;")
    public static final class89 method1024(class9 arg0, class47 arg1, int arg2, class9 arg3, class47 arg4) {
        if (arg2 != 0) {
            method1023(3, 43, null);
        }
        field2814++;
        int var5 = arg0.method75(arg4, 31499);
        int var6 = arg0.method77(arg1, var5, true);
        return class158.method1082(var6, arg2 - 1, var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class143(Throwable arg0, String arg1) {
        this.field2813 = arg1;
        this.field2806 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2808[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
