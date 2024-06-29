import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class85 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lmh;")
    public static class62 field1384 = class201.method1405(true, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lmh;")
    public static class62 field1388 = class201.method1405(true, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[[B")
    public static byte[][] field1382;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 15)
    public static void method648(boolean arg0) {
        field1388 = null;
        field1382 = (byte[][]) null;
        if (!arg0) {
            field1384 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIZIII)V", line = 40)
    public static final void method649(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            return;
        }
        field1381++;
        if (arg5 < 0 || arg1 < 0 || arg5 >= 103 || arg1 >= 103) {
            return;
        }
        if (arg3 == 0) {
            class54 var8 = class143.method1057(arg0, arg5, arg1);
            if (var8 != null) {
                int var9 = (int) (var8.field787 >>> 32) & Integer.MAX_VALUE;
                if (arg7 == 2) {
                    var8.field786 = new class265(var9, 2, arg2 + 4, arg0, arg5, arg1, arg6, false, var8.field786);
                    var8.field788 = new class265(var9, 2, arg2 + 1 & 0x3, arg0, arg5, arg1, arg6, false, var8.field788);
                } else {
                    var8.field786 = new class265(var9, arg7, arg2, arg0, arg5, arg1, arg6, false, var8.field786);
                }
            }
        }
        if (arg3 == 1) {
            class268 var10 = class204.method1423(arg0, arg5, arg1);
            if (var10 != null) {
                int var11 = (int) (var10.field4554 >>> 32) & Integer.MAX_VALUE;
                if (arg7 == 4 || arg7 == 5) {
                    var10.field4559 = new class265(var11, 4, arg2, arg0, arg5, arg1, arg6, false, var10.field4559);
                } else if (arg7 == 6) {
                    var10.field4559 = new class265(var11, 4, arg2 + 4, arg0, arg5, arg1, arg6, false, var10.field4559);
                } else if (arg7 == 7) {
                    var10.field4559 = new class265(var11, 4, (arg2 + 2 & 0x3) + 4, arg0, arg5, arg1, arg6, false, var10.field4559);
                } else if (arg7 == 8) {
                    var10.field4559 = new class265(var11, 4, arg2 + 4, arg0, arg5, arg1, arg6, false, var10.field4559);
                    var10.field4552 = new class265(var11, 4, (arg2 + 2 & 0x3) + 4, arg0, arg5, arg1, arg6, false, var10.field4552);
                }
            }
        }
        if (arg3 == 2) {
            if (arg7 == 11) {
                arg7 = 10;
            }
            class164 var12 = class198.method1385(arg0, arg5, arg1);
            if (var12 != null) {
                var12.field2672 = new class265(Integer.MAX_VALUE & (int) (var12.field2668 >>> 32), arg7, arg2, arg0, arg5, arg1, arg6, false, var12.field2672);
            }
        }
        if (arg3 == 3) {
            class32 var13 = class216.method1531(arg0, arg5, arg1);
            if (var13 != null) {
                var13.field443 = new class265(Integer.MAX_VALUE & (int) (var13.field442 >>> 32), 22, arg2, arg0, arg5, arg1, arg6, false, var13.field443);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V", line = 139)
    public static final void method650(boolean arg0, int arg1) {
        if (arg0) {
            class304.field5228.method1390(arg1, -53);
            class54.field785.method1390(arg1, -114);
            class301.field5182.method1390(arg1, -69);
            field1385++;
        }
    }
}
