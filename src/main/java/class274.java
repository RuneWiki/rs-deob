import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class274 extends class396 {

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "[I")
    public static int[] field3875 = new int[32];

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "[[I")
    public static int[][] field3877 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lra;B)V")
    public static final void method1733(class57 arg0, byte arg1) {
        class96.field1075 = arg0;
        int var2 = 46 / ((34 - arg1) / 53);
        field3874++;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public static final void method1734(int arg0) {
        for (int var1 = 0; var1 < class114.field1321.length; var1++) {
            for (int var2 = 0; var2 < class114.field1321[var1].length; var2++) {
                class114.field1321[var1][var2] = class72.field812;
            }
        }
        if (arg0 != 2) {
            method1734(-81);
        }
        field3878++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILam;Ljava/lang/String;ZZ)V")
    public static final void method1735(int arg0, class378 arg1, String arg2, boolean arg3, boolean arg4) {
        field3873++;
        if (arg4) {
            if (class378.field5549.startsWith("win") && class378.field5553 != 3) {
                String var5 = null;
                if (arg1.field5559 != null) {
                    var5 = arg1.field5559.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class241 var6 = class24.method152(arg1, 0, true, arg2);
                    class92.field1014 = arg2;
                    class434.field6358 = var6;
                    class166.field2332 = arg1;
                    return;
                }
            }
            if (class378.field5549.startsWith("mac")) {
                String var7 = null;
                if (arg1.field5559 != null) {
                    var7 = arg1.field5559.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg3) {
                    class24.method152(arg1, 1, true, arg2);
                    return;
                }
            }
            class24.method152(arg1, 2, true, arg2);
        } else {
            class24.method152(arg1, 3, true, arg2);
        }
        if (arg0 != 25794) {
            field3877 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILql;ZII)V")
    public static final void method1736(int arg0, class437 arg1, boolean arg2, int arg3, int arg4) {
        field3879++;
        long var5 = (long) (arg4 << 28 | arg0 << 14 | arg3);
        class111 var7 = (class111) class319.field4527.method1204((byte) -70, var5);
        if (var7 == null) {
            class111 var8 = new class111();
            class319.field4527.method1202(-1, var5, var8);
            var8.field1280.method1125(-1, arg1);
            return;
        }
        class260 var9 = class392.method2498(arg1.field6402, -107);
        int var10 = var9.field3597;
        if (var9.field3581 == 1) {
            var10 = (arg1.field6401 + 1) * var10;
        }
        if (arg2) {
            return;
        }
        for (class437 var11 = (class437) var7.field1280.method1124(-1); var11 != null; var11 = (class437) var7.field1280.method1119(false)) {
            class260 var12 = class392.method2498(var11.field6402, -118);
            int var13 = var12.field3597;
            if (var12.field3581 == 1) {
                var13 = (var11.field6401 + 1) * var13;
            }
            if (var13 < var10) {
                class294.method1870(58, arg1, var11);
                return;
            }
        }
        var7.field1280.method1125(-1, arg1);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1737(int arg0, int arg1) {
        if (arg0 != 255) {
            field3877 = null;
        }
        field3876++;
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFF74) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)Z")
    public abstract boolean method297(int arg0);

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method298(byte arg0);

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static void method1738(int arg0) {
        if (arg0 != 9) {
            field3877 = null;
        }
        field3877 = null;
        field3875 = null;
    }
}
