import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ka")
public abstract class class95 extends class147 {

    @OriginalMember(owner = "ka", name = "T", descriptor = "S")
    public short field1945 = -32768;

    @OriginalMember(owner = "ka", name = "I", descriptor = "Lwa;")
    public static class203 field1934 = new class203(5000);

    @OriginalMember(owner = "ka", name = "N", descriptor = "[I")
    public static int[] field1939 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "ka", name = "M", descriptor = "Llf;")
    public static class109 field1938 = class35.method275("(U2", 2);

    @OriginalMember(owner = "ka", name = "O", descriptor = "I")
    public static int field1940 = 0;

    @OriginalMember(owner = "ka", name = "Q", descriptor = "Llf;")
    public static class109 field1942 = class35.method275("Bitte starten Sie eine Mitgliedschaft", 2);

    @OriginalMember(owner = "ka", name = "S", descriptor = "I")
    public static int field1944 = 0;

    @OriginalMember(owner = "ka", name = "P", descriptor = "Llf;")
    public static class109 field1941 = class35.method275(" )2> <col=ffff00>", 2);

    @OriginalMember(owner = "ka", name = "V", descriptor = "[J")
    public static long[] field1947 = new long[32];

    @OriginalMember(owner = "ka", name = "X", descriptor = "Llf;")
    private static class109 field1949 = class35.method275("Press (Wrecover a locked account(W on front page)3", 2);

    @OriginalMember(owner = "ka", name = "Y", descriptor = "J")
    public static long field1950 = 0L;

    @OriginalMember(owner = "ka", name = "Z", descriptor = "Llf;")
    public static class109 field1951 = field1949;

    @OriginalMember(owner = "ka", name = "G", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "ka", name = "H", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "ka", name = "J", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "ka", name = "K", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "ka", name = "U", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "ka", name = "W", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "ka", name = "L", descriptor = "Loh;")
    public static class138 field1937;

    @OriginalMember(owner = "ka", name = "R", descriptor = "Loh;")
    public static class138 field1943;

    @OriginalMember(owner = "ka", name = "b", descriptor = "(I)Lue;")
    public class189 method177(int arg0) {
        int var2 = 23 / ((arg0 - 61) / 46);
        field1933++;
        return null;
    }

    @OriginalMember(owner = "ka", name = "a", descriptor = "(IIIIIIIIJ)V")
    public void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1948++;
        class189 var11 = this.method177(112);
        if (var11 != null) {
            var11.method421(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1945 = var11.field1945;
        }
    }

    @OriginalMember(owner = "ka", name = "a", descriptor = "(IIII)V")
    public static final void method681(int arg0, int arg1, int arg2, int arg3) {
        field1935++;
        class200 var4 = class129.method932(arg0, -1, arg3);
        if (var4 != null && var4.field3930 != null) {
            class82 var5 = new class82();
            var5.field1608 = var4;
            var5.field1613 = var4.field3930;
            class42.method305(24087, var5);
        }
        class123.field2360 = true;
        class168.field3115 = arg0;
        int var6 = 16 % ((arg2 + 73) / 44);
        class156.field2939 = arg1;
        class8.field119 = arg3;
        class115.method851(var4, -23101);
    }

    @OriginalMember(owner = "ka", name = "b", descriptor = "(Z)V")
    public static void method682(boolean arg0) {
        field1934 = null;
        field1937 = null;
        if (arg0) {
            return;
        }
        field1949 = null;
        field1941 = null;
        field1943 = null;
        field1942 = null;
        field1951 = null;
        field1938 = null;
        field1939 = null;
        field1947 = null;
    }

    @OriginalMember(owner = "ka", name = "a", descriptor = "(IIIII)V")
    public static final void method683(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -3753) {
            field1938 = null;
        }
        field1932++;
    }

    @OriginalMember(owner = "ka", name = "a", descriptor = "(IIIIILka;IJZ)Z")
    public static final boolean method684(int arg0, int arg1, int arg2, int arg3, int arg4, class95 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class123.method881(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
