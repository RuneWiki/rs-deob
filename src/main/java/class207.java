import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class207 {

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
    public static int[] field3271 = new int[4];

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[Lbb;")
    public static class92[] field3273 = new class92[6];

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "[Z")
    public static boolean[] field3274 = new boolean[8];

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lja;")
    public static class64 field3272;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "[I")
    public static int[] field3270;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[[Lob;")
    public static class292[][] field3269;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 5)
    public static void method1507(int arg0) {
        field3273 = null;
        if (arg0 < 67) {
            field3269 = (class292[][]) ((class292[][]) null);
        }
        field3270 = null;
        field3272 = null;
        field3271 = null;
        field3274 = null;
        field3269 = (class292[][]) null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I", line = 21)
    public static final int method1508(int arg0, int arg1) {
        field3268++;
        if (arg0 < 81) {
            field3272 = (class64) null;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)Lfk;", line = 40)
    public static final class45 method1509(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4220; var4++) {
            class45 var5 = var3.field4217[var4];
            if ((var5.field776 >> 29 & 0x3L) == 2L && var5.field770 == arg1 && var5.field772 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V", line = 75)
    public static final void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3267++;
        int var8 = class308.method2129(arg2, class195.field3108, class188.field2995, 1252946087);
        int var9 = class308.method2129(arg4, class195.field3108, class188.field2995, 1252946087);
        int var10 = class308.method2129(arg6, class116.field1888, class319.field4965, 1252946087);
        int var11 = class308.method2129(arg7, class116.field1888, class319.field4965, arg0 + 1252946085);
        int var12 = class308.method2129(arg2 + arg1, class195.field3108, class188.field2995, arg0 ^ 0x4AAE70A5);
        int var13 = class308.method2129(arg4 - arg1, class195.field3108, class188.field2995, arg0 ^ 0x4AAE70A5);
        for (int var14 = var8; var14 < var12; var14++) {
            class86.method614(arg3, arg0 - 24893, var11, var10, class102.field1729[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class86.method614(arg3, -24891, var11, var10, class102.field1729[var15]);
        }
        int var16 = class308.method2129(arg6 + arg1, class116.field1888, class319.field4965, 1252946087);
        int var17 = class308.method2129(arg7 - arg1, class116.field1888, class319.field4965, 1252946087);
        int var18 = var12;
        if (arg0 != 2) {
            field3273 = (class92[]) null;
        }
        while (var18 <= var13) {
            int[] var19 = class102.field1729[var18];
            class86.method614(arg3, -24891, var16, var10, var19);
            class86.method614(arg5, arg0 - 24893, var17, var16, var19);
            class86.method614(arg3, -24891, var11, var17, var19);
            var18++;
        }
    }
}
