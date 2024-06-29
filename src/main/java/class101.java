import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class101 {

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field1364 = 0;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "[I")
    public static int[] field1367 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Z")
    public static boolean field1366 = true;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Lqa;")
    public static class243 field1360;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
    public static void method685(boolean arg0) {
        field1367 = null;
        field1360 = null;
        if (!arg0) {
            field1360 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public static final void method686(int arg0, int arg1) {
        if (arg0 != -4028) {
            method686(84, -98);
        }
        field1368++;
        class249.field3592 = new class24(arg1);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIII)V")
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class50.field695 >= arg5 && class180.field2375 <= arg3) {
            boolean var6;
            if (class203.field2942 > arg1) {
                arg1 = class203.field2942;
                var6 = false;
            } else if (class297.field4268 < arg1) {
                var6 = false;
                arg1 = class297.field4268;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg4 < class203.field2942) {
                var7 = false;
                arg4 = class203.field2942;
            } else if (class297.field4268 < arg4) {
                var7 = false;
                arg4 = class297.field4268;
            } else {
                var7 = true;
            }
            if (class180.field2375 > arg5) {
                arg5 = class180.field2375;
            } else {
                class370.method2440(arg4, class227.field3201[arg5++], arg0, arg1, arg2 - 865);
            }
            if (arg3 > class50.field695) {
                arg3 = class50.field695;
            } else {
                class370.method2440(arg4, class227.field3201[arg3--], arg0, arg1, arg2 ^ 0x3CD);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg3; var8++) {
                    int[] var9 = class227.field3201[var8];
                    var9[arg1] = var9[arg4] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg3; var11++) {
                    class227.field3201[var11][arg1] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg3; var10++) {
                    class227.field3201[var10][arg4] = arg0;
                }
            }
        }
        field1361++;
        if (arg2 != 921) {
            field1367 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)B")
    public static final byte method688(int arg0, int arg1, int arg2) {
        field1362++;
        if (arg0 != 17626) {
            method689(-50, (class437) null, false, -32, (int[][]) null);
        }
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILnr;ZI[[I)V")
    public static final void method689(int arg0, class437 arg1, boolean arg2, int arg3, int[][] arg4) {
        field1363++;
        if (arg3 > -116) {
            return;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            int[][] var6;
            if (arg4 == null) {
                var6 = null;
            } else {
                var6 = new int[class324.field4652 + 1][class336.field4964 + 1];
                for (int var7 = 0; var7 <= class336.field4964; var7++) {
                    for (int var8 = 0; var8 <= class324.field4652; var8++) {
                        var6[var8][var7] = class128.field1703[var5][var8][var7] - arg4[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg2) {
                if (class417.field6217) {
                    var9 |= 0x2;
                }
                if (class273.field4024) {
                    var10 |= 0x8;
                }
                if (class176.field2300 != 0) {
                    if (var5 == 0 || class160.field2099 >= 96) {
                        var10 |= 0x10;
                    }
                    var9 |= 0x1;
                }
            }
            if (class417.field6217) {
                var10 |= 0x7;
            }
            class337 var11 = arg1.method2153(class324.field4652, class336.field4964, class128.field1703[var5], var6, 128, var9, var10);
            class403.method2611(var5, var11);
        }
    }
}
