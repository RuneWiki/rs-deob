import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 {

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
    public static int[] field19 = new int[2];

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "[[I")
    public static int[][] field20 = new int[104][104];

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lmb;")
    public static class96 field17 = class243.method1708("m-Ochte mit Ihnen handeln)3", (byte) 126);

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Z")
    public static boolean field18 = false;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lmb;")
    public static class96 field23 = class243.method1708("", (byte) 116);

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lmb;")
    public static class96 field14 = class243.method1708(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) 126);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static final void method8(byte arg0) {
        field22++;
        int var1 = -32 % ((arg0 - 26) / 42);
        class10.field166.method83(0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lw;B)V")
    public static final void method9(class107 arg0, byte arg1) {
        field13++;
        class107 var2 = class213.method1483((byte) -10, arg0);
        if (arg1 < 101) {
            method11(true, 28, 82);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class168.field2954;
            var4 = class232.field3979;
        } else {
            var3 = var2.field1919;
            var4 = var2.field1856;
        }
        class187.method1323(0, var3, arg0, false, var4);
        class272.method1853(arg0, var3, var4, 2);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static final void method10(int arg0) {
        for (class38 var1 = (class38) class217.field3726.method1811(2); var1 != null; var1 = (class38) class217.field3726.method1810(false)) {
            if (var1.field660) {
                var1.method300(13611);
            }
        }
        for (class38 var2 = (class38) class248.field4296.method1811(2); var2 != null; var2 = (class38) class248.field4296.method1810(false)) {
            if (var2.field660) {
                var2.method300(13611);
            }
        }
        int var3 = 99 % ((61 - arg0) / 32);
        field12++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZII)I")
    public static final int method11(boolean arg0, int arg1, int arg2) {
        field21++;
        int var3 = class38.method299(25069, arg2 - 1, arg1 + -1) - (-class38.method299(25069, arg2 - 1, arg1 - -1) - class38.method299(25069, arg2 + 1, arg1 - 1)) + class38.method299(25069, arg2 + 1, arg1 + 1);
        if (arg0) {
            int var4 = class38.method299(25069, arg2, arg1 - 1) + class38.method299(25069, arg2, arg1 + 1) - (-class38.method299(25069, arg2 + -1, arg1) - class38.method299(25069, arg2 + 1, arg1));
            int var5 = class38.method299(25069, arg2, arg1);
            return var3 / 16 + var5 / 4 + (var4 / 8);
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIBIZIIIIII)Z")
    public static final boolean method12(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg3 != -73) {
            field19 = null;
        }
        field15++;
        if (class236.field4047.method366((byte) 95) == 2) {
            return class185.method1306(arg0, arg9, arg11, arg6, arg7, arg2, arg1, arg4, arg5, arg10, arg8, 10529);
        } else if (class236.field4047.method366((byte) 95) > 2) {
            return class226.method1544(arg5, arg6, arg10, arg4, arg11, (byte) -95, arg1, arg8, class236.field4047.method366((byte) 95), arg0, arg9, arg7, arg2);
        } else {
            return class38.method301(arg4, arg2, arg11, arg9, arg8, arg1, arg6, arg7, arg10, arg0, arg5, 120);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIIII)V")
    public static final void method13(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field16++;
        if (arg0) {
            method14((byte) -61);
        }
        if (arg3 >= class9.field145 && arg3 <= class162.field2884) {
            int var5 = class268.method1841(class9.field149, client.field1994, 0, arg1);
            int var6 = class268.method1841(class9.field149, client.field1994, 0, arg2);
            class151.method1108(var5, arg4, var6, arg3, -1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method14(byte arg0) {
        field20 = null;
        field14 = null;
        field23 = null;
        if (arg0 > -43) {
            method9((class107) null, (byte) -106);
        }
        field17 = null;
        field19 = null;
    }
}
