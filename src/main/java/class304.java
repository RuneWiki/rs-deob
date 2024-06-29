import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public abstract class class304 {

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "[I")
    public static int[] field4374 = new int[1];

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "F")
    public static float field4370;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Lji;")
    public static class637 field4371;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
    public abstract void method831(byte arg0);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Z")
    public abstract boolean method828(int arg0, int arg1);

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1914(int arg0, int arg1) {
        field4373++;
        if (arg0 < 50) {
            field4374 = null;
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([BI)Ltg;")
    public static final class244 method1915(byte[] arg0, int arg1) {
        field4369++;
        class244 var2 = new class244();
        class376 var3 = new class376(arg0);
        var3.field5459 = var3.field5518.length - 2;
        int var4 = var3.method2359(-1);
        int var5 = var3.field5518.length - var4 - 16 - 2;
        var3.field5459 = var5;
        int var6 = var3.method2384(82);
        var2.field3291 = var3.method2359(-1);
        var2.field3292 = var3.method2359(arg1);
        var2.field3285 = var3.method2359(-1);
        var2.field3282 = var3.method2359(-1);
        var2.field3288 = var3.method2359(arg1);
        var2.field3290 = var3.method2359(-1);
        int var7 = var3.method2398(-1372747256);
        if (var7 > 0) {
            var2.field3286 = new class706[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2359(-1);
                class706 var10 = new class706(class719.method4014(var9, (byte) -100));
                var2.field3286[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2384(125);
                    int var12 = var3.method2384(90);
                    var10.method3962((long) var11, new class119(var12), arg1 - 104);
                }
            }
        }
        var3.field5459 = 0;
        var2.field3296 = var3.method2383((byte) 105);
        var2.field3293 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field5459) {
            int var14 = var3.method2359(arg1);
            if (var14 == 3) {
                if (var2.field3287 == null) {
                    var2.field3287 = new String[var6];
                }
                var2.field3287[var13] = var3.method2379((byte) 85).intern();
            } else if (var14 == 54) {
                if (var2.field3289 == null) {
                    var2.field3289 = new long[var6];
                }
                var2.field3289[var13] = var3.method2366(true);
            } else {
                if (var2.field3298 == null) {
                    var2.field3298 = new int[var6];
                }
                if (var14 >= 150 || var14 == 21 || var14 == 38 || var14 == 39) {
                    var2.field3298[var13] = var3.method2398(-1372747256);
                } else {
                    var2.field3298[var13] = var3.method2384(74);
                }
            }
            var2.field3293[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public abstract void method823(int arg0);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIILcf;Lur;Z)V")
    public static final void method1916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class631 arg9, class564 arg10, boolean arg11) {
        class207.field2707 = arg5;
        class126.field1894 = arg7;
        if (arg11) {
            method1916(-27, 77, -74, 15, 54, 36, 10, 127, 29, null, null, true);
        }
        class579.field7761 = arg0;
        field4372++;
        class321.field4620 = arg1;
        class598.field8148 = arg4;
        class488.field6756 = null;
        class288.field4234 = arg8;
        class570.field7588 = arg6;
        class156.field2123 = arg2;
        class328.field4760 = arg10;
        class37.field576 = null;
        class482.field6668 = arg3;
        class660.field9130 = null;
        class764.field10569 = arg9;
        client.method2012(-73);
        class27.field407 = true;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)Lpfa;")
    public abstract class313 method825(int arg0);

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
    public static void method1917(int arg0) {
        field4374 = null;
        int var1 = -53 / ((-arg0 - 42) / 34);
        field4371 = null;
    }
}
