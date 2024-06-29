import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class97 extends class59 {

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Luc;")
    public class179 field1467;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field1466 = 0;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field1465 = 0;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Lvl;")
    public static class73 field1461;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "[[[I")
    public static int[][][] field1463;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1462++;
        int var8 = arg4 + arg7;
        int var9 = arg3 + arg7;
        if (arg5 != 1) {
            method662(0, -52, 21, -56, 14);
        }
        for (int var10 = arg4; var10 < var8; var10++) {
            class16.method97(arg5 - 8, class78.field1180[var10], arg2, arg0, arg3);
        }
        int var11 = arg6 - arg7;
        int var12 = arg2 - arg7;
        for (int var13 = arg6; var13 > var11; var13--) {
            class16.method97(-7, class78.field1180[var13], arg2, arg0, arg3);
        }
        for (int var14 = var8; var14 <= var11; var14++) {
            int[] var15 = class78.field1180[var14];
            class16.method97(arg5 - 8, var15, var9, arg0, arg3);
            class16.method97(-7, var15, var12, arg1, var9);
            class16.method97(-7, var15, arg2, arg0, var12);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method662(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class27.field313 * arg0 + class254.field4149 * arg3 >> 16;
        int var6 = class27.field313 * arg3 - class254.field4149 * arg0 >> 16;
        int var7 = class89.field1350 * arg1 + class248.field4025 * var6 >> 16;
        int var8 = class248.field4025 * arg1 - class89.field1350 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class89.field1350 * arg2 + class248.field4025 * var6 >> 16;
        int var12 = class248.field4025 * arg2 - class89.field1350 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class190.field2955 && var13 < class190.field2955) {
            return false;
        } else if (var9 > class169.field2607 && var13 > class169.field2607) {
            return false;
        } else if (var10 < class220.field3444 && var14 < class220.field3444) {
            return false;
        } else {
            return var10 <= class89.field1349 || var14 <= class89.field1349;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V")
    public static void method663(byte arg0) {
        if (arg0 <= 76) {
            method664(29, -30, -94, (class231) null);
        }
        field1463 = null;
        field1461 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILfe;)V")
    public static final void method664(int arg0, int arg1, int arg2, class231 arg3) {
        field1460++;
        if (class142.field2079 != null || class311.field4995 || arg3 == null || class247.method1763((byte) 10, arg3) == null) {
            return;
        }
        class142.field2079 = arg3;
        class82.field1247 = class247.method1763((byte) 10, arg3);
        class68.field1014 = arg2;
        class171.field2688 = 0;
        if (arg1 > -4) {
            method664(1, 73, 55, (class231) null);
        }
        class71.field1052 = arg0;
        class40.field479 = false;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Luc;)V")
    public class97(class179 arg0) {
        this.field1467 = arg0;
    }
}
