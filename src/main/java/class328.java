import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class328 {

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4458 = "Use";

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field4456 = -1;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Z")
    public static boolean field4457;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)Z", line = 4)
    public static final boolean method2079(int arg0, boolean arg1) {
        field4459++;
        class198.field2820 = true;
        if (arg1) {
            method2079(126, false);
        }
        class69.field1040 = arg0 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method2080(boolean arg0) {
        field4455++;
        class410 var1 = class75.field1123;
        synchronized (class75.field1123) {
            class75.field1123.method2533(0);
            if (!arg0) {
                field4451 = -53;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIII)V", line = 34)
    public static final void method2081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4453++;
        if (arg1 > -99) {
            method2085(false);
        }
        int var8 = class359.method2251(class134.field1917, arg5, 56, class39.field595);
        int var9 = class359.method2251(class134.field1917, arg7, 88, class39.field595);
        int var10 = class359.method2251(class69.field1047, arg4, -58, class433.field6144);
        int var11 = class359.method2251(class69.field1047, arg0, 87, class433.field6144);
        int var12 = class359.method2251(class134.field1917, arg2 + arg5, 45, class39.field595);
        int var13 = class359.method2251(class134.field1917, arg7 - arg2, 56, class39.field595);
        for (int var14 = var8; var14 < var12; var14++) {
            class396.method2436(-1070, arg3, var10, class186.field2697[var14], var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class396.method2436(-1070, arg3, var10, class186.field2697[var15], var11);
        }
        int var16 = class359.method2251(class69.field1047, arg4 + arg2, 102, class433.field6144);
        int var17 = class359.method2251(class69.field1047, arg0 - arg2, -69, class433.field6144);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class186.field2697[var18];
            class396.method2436(-1070, arg3, var10, var19, var16);
            class396.method2436(-1070, arg6, var16, var19, var17);
            class396.method2436(-1070, arg3, var17, var19, var11);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V", line = 91)
    public static final void method2082(int arg0, int arg1, int arg2) {
        int var3 = class148.field2284 * arg2 >> 8;
        field4452++;
        if (arg0 == -1 && !class166.field2473) {
            class399.method2451(1);
        } else if (arg0 != -1 && (class96.field1386 != arg0 || !class276.method1772(-25972)) && var3 != 0 && !class166.field2473) {
            class340.method2157((byte) 82, false, var3, class138.field1943, arg0, 2, 0);
        }
        class96.field1386 = arg0;
        if (arg1 != -11028) {
            method2080(true);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I", line = 125)
    public static final int method2083(int arg0, int arg1) {
        field4460++;
        return arg0 == 0 ? arg1 >>> 7 : -86;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V", line = 138)
    public static final void method2084(int arg0, int arg1) {
        int var2 = -102 / ((-arg1 - 5) / 33);
        class94.field1364 = arg0;
        field4461++;
        class410 var3 = class75.field1123;
        synchronized (class75.field1123) {
            class75.field1123.method2533(0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)V", line = 157)
    public static void method2085(boolean arg0) {
        if (arg0) {
            field4458 = null;
        }
    }
}
