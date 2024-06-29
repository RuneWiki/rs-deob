import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class217 extends class199 {

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field3301 = new String[100];

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "Z")
    public static boolean field3303 = true;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "Lpg;")
    public static class320 field3298 = new class320(32);

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public int field3309;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "Lsn;")
    public static class319 field3310;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "Ljava/lang/String;")
    public String field3299;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "[I")
    public int[] field3300;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "[I")
    public int[] field3305;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "[Lgd;")
    public class170[] field3304;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "[Ljava/lang/String;")
    public String[] field3307;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V", line = 4)
    public static final void method1532(int arg0, int arg1) {
        if (arg0 >= -29) {
            field3301 = (String[]) null;
        }
        if (class158.field2373 == null || class158.field2373.length < arg1) {
            class158.field2373 = new int[arg1];
        }
        field3296++;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V", line = 21)
    public static void method1533(boolean arg0) {
        if (!arg0) {
            method1534(-26, 86, 18, -77, 110);
        }
        field3298 = null;
        field3301 = null;
        field3310 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)Z", line = 35)
    public static final boolean method1534(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class53.field908 * arg0 + class44.field704 * arg3 >> 16;
        int var6 = class53.field908 * arg3 - class44.field704 * arg0 >> 16;
        int var7 = class279.field4292 * arg1 + class171.field2607 * var6 >> 16;
        int var8 = class171.field2607 * arg1 - class279.field4292 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class279.field4292 * arg2 + class171.field2607 * var6 >> 16;
        int var12 = class171.field2607 * arg2 - class279.field4292 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class325.field5062 && var13 < class325.field5062) {
            return false;
        } else if (var9 > class5.field50 && var13 > class5.field50) {
            return false;
        } else if (var10 < class91.field1445 && var14 < class91.field1445) {
            return false;
        } else {
            return var10 <= class53.field899 || var14 <= class53.field899;
        }
    }
}
