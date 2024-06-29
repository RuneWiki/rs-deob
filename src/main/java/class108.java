import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class108 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Z")
    public static boolean field1851 = false;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[Z")
    public static boolean[] field1856 = new boolean[100];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Ljava/util/Random;")
    public static Random field1849 = new Random();

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[Ljb;")
    public static class268[] field1855;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
    public static final void method775(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1854++;
        int var5 = 0;
        if (arg2 >= -18) {
            field1853 = 85;
        }
        int var6 = arg4;
        int var7 = -1;
        int var8 = class141.method1027(class277.field4967, arg0 + arg4, false, class147.field2593);
        int var9 = class141.method1027(class277.field4967, arg0 - arg4, false, class147.field2593);
        class58.method337(var9, class76.field1406[arg1], arg3, var8, false);
        int var10 = -arg4;
        while (var6 > var5) {
            var7 += 2;
            var10 += var7;
            if (var10 > 0) {
                var6--;
                var10 -= var6 << 1;
                int var11 = arg1 + var6;
                int var12 = arg1 - var6;
                if (var11 >= class26.field342 && class271.field4820 >= var12) {
                    int var13 = class141.method1027(class277.field4967, arg0 + var5, false, class147.field2593);
                    int var14 = class141.method1027(class277.field4967, arg0 - var5, false, class147.field2593);
                    if (class271.field4820 >= var11) {
                        class58.method337(var14, class76.field1406[var11], arg3, var13, false);
                    }
                    if (class26.field342 <= var12) {
                        class58.method337(var14, class76.field1406[var12], arg3, var13, false);
                    }
                }
            }
            var5++;
            int var15 = arg1 + var5;
            int var16 = arg1 - var5;
            if (var15 >= class26.field342 && var16 <= class271.field4820) {
                int var17 = class141.method1027(class277.field4967, arg0 + var6, false, class147.field2593);
                int var18 = class141.method1027(class277.field4967, arg0 - var6, false, class147.field2593);
                if (var15 <= class271.field4820) {
                    class58.method337(var18, class76.field1406[var15], arg3, var17, false);
                }
                if (class26.field342 <= var16) {
                    class58.method337(var18, class76.field1406[var16], arg3, var17, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static final void method776(byte arg0) {
        if (arg0 != 73) {
            field1853 = -86;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class253.field4549 - 1); var2++) {
                if (class216.field3942[var2] < 1000 && class216.field3942[var2 + 1] > 1000) {
                    var1 = false;
                    class93 var3 = class86.field1553[var2];
                    class86.field1553[var2] = class86.field1553[var2 + 1];
                    class86.field1553[var2 + 1] = var3;
                    class93 var4 = class228.field4089[var2];
                    class228.field4089[var2] = class228.field4089[var2 + 1];
                    class228.field4089[var2 + 1] = var4;
                    int var5 = class38.field586[var2];
                    class38.field586[var2] = class38.field586[var2 + 1];
                    class38.field586[var2 + 1] = var5;
                    int var6 = class168.field2963[var2];
                    class168.field2963[var2] = class168.field2963[var2 + 1];
                    class168.field2963[var2 + 1] = var6;
                    int var7 = class214.field3911[var2];
                    class214.field3911[var2] = class214.field3911[var2 + 1];
                    class214.field3911[var2 + 1] = var7;
                    short var8 = class216.field3942[var2];
                    class216.field3942[var2] = class216.field3942[var2 + 1];
                    class216.field3942[var2 + 1] = var8;
                    long var9 = class73.field1319[var2];
                    class73.field1319[var2] = class73.field1319[var2 + 1];
                    class73.field1319[var2 + 1] = var9;
                }
            }
        }
        field1852++;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method777(byte arg0) {
        field1849 = null;
        field1855 = null;
        field1856 = null;
        if (arg0 > -115) {
            field1851 = false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Lwc;")
    public static final class229 method778(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field645; var4++) {
            class229 var5 = var3.field637[var4];
            if ((var5.field4094 >> 29 & 0x3L) == 2L && var5.field4095 == arg1 && var5.field4099 == arg2) {
                class275.method1846(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(SZ)Z")
    public static final boolean method779(short arg0, boolean arg1) {
        field1857++;
        if (arg0 == 33 || arg0 == 10 || arg0 == 40 || arg0 == 14 || arg0 == 46 || arg0 == 18 || arg0 == 38 || arg0 == 6) {
            return true;
        } else if (arg0 == 37 || arg0 == 58 || arg0 == 1002 || arg0 == 1007) {
            return true;
        } else {
            if (!arg1) {
                field1853 = 42;
            }
            if (arg0 == 11 || arg0 == 28 || arg0 == 43 || arg0 == 4 || arg0 == 34) {
                return true;
            } else {
                return arg0 == 8 || arg0 == 19 || arg0 == 17 || arg0 == 20 || arg0 == 1 || arg0 == 59;
            }
        }
    }
}
