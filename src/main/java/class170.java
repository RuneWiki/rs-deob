import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class170 {

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public final int field3051;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public final int field3043;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public final int field3048;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Lig;")
    public final class180 field3052;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3041 = 0;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3047 = -1;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lsf;")
    public static class108 field3042 = class140.method973(255, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lsf;")
    public static class108 field3044 = class140.method973(255, "jaune:");

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field3045 = 0;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "Lsf;")
    public static class108 field3053 = class140.method973(255, "hitbar_default");

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 16)
    public static void method1176(int arg0) {
        field3044 = null;
        field3042 = null;
        if (arg0 != -30805) {
            method1176(33);
        }
        field3053 = null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Lja;", line = 37)
    public static final class64 method1177(int arg0) {
        field3046++;
        try {
            if (arg0 != 20381) {
                field3047 = 99;
            }
            return (class64) Class.forName("sc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V", line = 63)
    public static final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class317.field5455 < 100) {
            class166.method1160((byte) -95);
        }
        field3050++;
        if (class231.field4051) {
            class50.method345(arg2, arg0, arg1 + arg2, arg0 + arg3);
        } else {
            class28.method185(arg2, arg0, arg1 + arg2, arg0 + arg3);
        }
        if (class317.field5455 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg2;
            int var7 = arg0 + (arg3 / 2) - (var5 + 18);
            if (class231.field4051) {
                class50.method348(arg2, arg0, arg1, arg3, 0);
                class50.method353(var6 - 152, var7, 304, 34, 9179409);
                class50.method353(var6 - 151, var7 + 1, 302, 32, 0);
                class50.method348(var6 - 150, var7 + 2, class317.field5455 * 3, 30, 9179409);
                class50.method348(class317.field5455 * 3 + var6 - 150, var7 + 2, 300 - (class317.field5455 * 3), 30, 0);
            } else {
                class28.method193(arg2, arg0, arg1, arg3, 0);
                class28.method183(var6 - 152, var7, 304, 34, 9179409);
                class28.method183(var6 - 151, var7 + 1, 302, 32, 0);
                class28.method193(var6 - 150, var7 + 2, class317.field5455 * 3, 30, 9179409);
                class28.method193(class317.field5455 * 3 + var6 - 150, var7 + 2, 300 - class317.field5455 * 3, 30, 0);
            }
            class256.field4525.method545(class156.field2815, var6, var7 + var5, 16777215, -1);
            return;
        }
        class140.field2466 = (int) ((float) (arg1 * 2) / class147.field2643);
        class194.field3493 = class126.field2121 - ((int) ((float) arg3 / class147.field2643));
        class120.field2049 = class202.field3652 - ((int) ((float) arg1 / class147.field2643));
        int var8 = class202.field3652 - (int) ((float) arg1 / class147.field2643);
        class84.field1345 = (int) ((float) (arg3 * 2) / class147.field2643);
        if (arg4 < 101) {
            field3053 = (class108) null;
        }
        int var9 = class126.field2121 - ((int) ((float) arg3 / class147.field2643));
        int var10 = (int) ((float) arg1 / class147.field2643) + class202.field3652;
        int var11 = (int) ((float) arg3 / class147.field2643) + class126.field2121;
        if (class231.field4051) {
            if (class121.field2074 == null || class121.field2074.field2347 != arg1 || class121.field2074.field2329 != arg3) {
                class121.field2074 = null;
                class121.field2074 = new class214(arg1, arg3);
            }
            class28.method189(class121.field2074.field141, arg1, arg3);
            class286.method2049(var9, var10, arg3, 192, var8, 0, arg1, 0, var11);
            class172.method1222(-116, 0, var8, arg3, arg1, var10, var11, 0, var9);
            class20.method139(-72, var10, 0, arg3, 0, var8, var9, arg1, var11);
            class121.field2074.method68(arg2, arg0);
        } else {
            class286.method2049(var9, var10, arg0 + arg3, 192, var8, arg0, arg1 + arg2, arg2, var11);
            class172.method1222(-112, arg0, var8, arg0 + arg3, arg1 + arg2, var10, var11, arg2, var9);
            class20.method139(-52, var10, arg2, arg0 + arg3, arg0, var8, var9, arg1 + arg2, var11);
        }
        if (class286.field5011 > 0) {
            class286.field5011--;
        }
        if (!class55.field804) {
            return;
        }
        int var12 = arg0 + arg3 - 8;
        int var13 = arg1 + arg2 - 5;
        class158.field2850.method526(class117.method833(new class108[] { class39.field541, class79.method518(false, class160.field2876) }, false), var13, var12, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var17 = var12 - 15;
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var16 = 16776960;
        if (var15 > 65536) {
            var16 = 16711680;
        }
        class158.field2850.method526(class117.method833(new class108[] { class286.field5010, class79.method518(false, var15), class252.field4388 }, false), var13, var17, var16, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)La;", line = 172)
    public static final class278 method1179(byte arg0) {
        field3040++;
        if (class219.field3896 < class15.field201.length) {
            return class15.field201[class219.field3896++];
        } else {
            int var1 = -18 % ((-arg0 - 63) / 45);
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIII)V", line = 217)
    public class170(int arg0, int arg1, int arg2, int arg3) {
        class180 var5 = class2.method16(0, arg0);
        this.field3051 = arg3;
        this.field3043 = arg2;
        this.field3048 = arg1;
        if (class231.field4051 || var5.field3260 == -1) {
            this.field3052 = var5;
        } else {
            this.field3052 = class2.method16(0, var5.field3260);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lig;III)V", line = 234)
    public class170(class180 arg0, int arg1, int arg2, int arg3) {
        this.field3051 = arg3;
        this.field3052 = arg0;
        this.field3043 = arg2;
        this.field3048 = arg1;
    }
}
