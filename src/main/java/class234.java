import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class234 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[Lkj;")
    public static class32[] field4046 = new class32[50];

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Loh;")
    public static class258 field4047 = class153.method1046("(U (X", 88);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lgb;")
    public static class213 field4044;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 9)
    public static void method1560(int arg0) {
        field4047 = null;
        field4046 = null;
        if (arg0 <= -23) {
            field4044 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ls;III)V", line = 22)
    public static final void method1561(class171 arg0, int arg1, int arg2, int arg3) {
        field4045++;
        if (class206.field3558 != null || class252.field4342 || arg0 == null || class290.method2039(-127, arg0) == null) {
            return;
        }
        class206.field3558 = arg0;
        class188.field3336 = class290.method2039(-93, arg0);
        class180.field3213 = arg3;
        class281.field4830 = false;
        class127.field2255 = arg2;
        class190.field3361 = arg1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZJI)Loh;", line = 52)
    public static final class258 method1562(int arg0, int arg1, boolean arg2, long arg3, int arg4) {
        class258 var6 = class92.method687(0, false);
        field4048++;
        if (arg3 < 0L) {
            var6.method1766(arg4 ^ 0x6A, class240.field4179);
            arg3 = -arg3;
        }
        class258 var7 = class48.field719;
        class258 var8 = class169.field2880;
        if (arg1 == arg4) {
            var8 = class48.field719;
            var7 = class169.field2880;
        }
        if (arg1 == 2) {
            var7 = class169.field2880;
            var8 = class228.field3924;
        }
        class258 var9 = class92.method687(0, false);
        class258 var10 = class92.method687(0, false);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method1766(-124, class218.method1481(-123, (int) (arg3 % 10L)));
            arg3 /= 10L;
        }
        int var12 = 0;
        if (arg3 == 0L) {
            var9 = class32.field387;
        }
        while (arg3 > 0L) {
            if (arg2 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1766(92, var8);
            }
            var12++;
            var9.method1766(70, class218.method1481(arg4 ^ 0x4A, (int) (arg3 % 10L)));
            arg3 /= 10L;
        }
        if (var10.method1816(false) > 0) {
            var10.method1766(-101, var7);
        }
        return class100.method755(-6, new class258[] { var6, var9.method1784(true), var10.method1784(true) });
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 132)
    public static final void method1563(boolean arg0) {
        field4049++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class69.field1195 - 1); var2++) {
                if (class227.field3910[var2] < 1000 && class227.field3910[var2 + 1] > 1000) {
                    var1 = false;
                    class258 var3 = class225.field3849[var2];
                    class225.field3849[var2] = class225.field3849[var2 + 1];
                    class225.field3849[var2 + 1] = var3;
                    class258 var4 = class242.field4205[var2];
                    class242.field4205[var2] = class242.field4205[var2 + 1];
                    class242.field4205[var2 + 1] = var4;
                    int var5 = class225.field3863[var2];
                    class225.field3863[var2] = class225.field3863[var2 + 1];
                    class225.field3863[var2 + 1] = var5;
                    int var6 = class70.field1219[var2];
                    class70.field1219[var2] = class70.field1219[var2 + 1];
                    class70.field1219[var2 + 1] = var6;
                    short var7 = class227.field3910[var2];
                    class227.field3910[var2] = class227.field3910[var2 + 1];
                    class227.field3910[var2 + 1] = var7;
                    long var8 = class217.field3741[var2];
                    class217.field3741[var2] = class217.field3741[var2 + 1];
                    class217.field3741[var2 + 1] = var8;
                }
            }
        }
        if (!arg0) {
            method1562(113, 100, false, -78L, -18);
        }
    }
}
