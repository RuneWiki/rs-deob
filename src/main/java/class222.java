import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class222 {

    @OriginalMember(owner = "client!su", name = "f", descriptor = "[I")
    private int[] field3413;

    @OriginalMember(owner = "client!su", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3415 = new String[] { method1931(method1930("m)u,\u001d")), method1931(method1930("m)u*\u001d")), method1931(method1930("m)u-\u001d")), method1931(method1930("p)7\u0002")), method1931(method1930("m)u+\u001d")), method1931(method1930("eru@H")), method1931(method1930("m)uR\\p5/P\u001d")), method1931(method1930("m)u/\u001d")) };

    @OriginalMember(owner = "client!su", name = "j", descriptor = "Z")
    public static boolean field3405 = false;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field3408 = 2;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "Z")
    public static boolean field3412 = true;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "Lwia;")
    public static class790 field3407 = new class790(49, 7);

    @OriginalMember(owner = "client!su", name = "g", descriptor = "Lum;")
    public static class550 field3414 = new class550("", 13);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1925(boolean arg0) {
        try {
            field3407 = null;
            field3414 = null;
            if (arg0) {
                method1928(null, (byte) -61);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3415[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)I", line = 14)
    public final int method1926(int arg0, int arg1) {
        try {
            field3406++;
            int var3 = (this.field3413.length >> 1) - 1;
            if (arg0 != 1) {
                method1925(false);
            }
            int var4 = arg1 & var3;
            while (true) {
                int var5 = this.field3413[var4 + var4 + 1];
                if (var5 == -1) {
                    return -1;
                }
                if (this.field3413[var4 + var4] == arg1) {
                    return var5;
                }
                var4 = var3 & var4 + 1;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3415[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V", line = 50)
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field3409++;
            int var5 = -70 % ((41 - arg0) / 50);
            if (arg4 == 8 || arg4 == 16) {
                for (int var6 = 0; var6 < class241.field3642; var6++) {
                    class367 var7 = class107.field1235[var6];
                    if (var7.field5617 == arg4 && var7.field5620 == arg1 && var7.field5625 == arg2 || var7.field5611 == arg1 && var7.field5625 == arg2) {
                        if (class241.field3642 != var6) {
                            class467.method3554(class107.field1235, var6 + 1, class107.field1235, var6, class107.field1235.length - var6 - 1);
                        }
                        class241.field3642--;
                        return;
                    }
                }
            } else {
                class96 var8 = class734.field10683[arg3][arg1][arg2];
                if (var8 != null) {
                    if (arg4 == 1) {
                        var8.field1087 = 0;
                    } else if (arg4 == 2) {
                        var8.field1078 = 0;
                    }
                }
                class385.method3079(15611);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3415[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lic;B)V", line = 106)
    public static final void method1928(class726 arg0, byte arg1) {
        try {
            field3410++;
            class142 var2 = (class142) class761.field11026.method977((long) arg0.field3780, 1);
            if (arg1 < 80) {
                method1925(true);
            }
            if (var2 == null) {
                class483.method3682(arg0.field3859[0], 0, null, 29075, arg0.field6200, arg0, arg0.field3863[0], null);
            } else {
                var2.method1211(1733170857);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3415[4] + (arg0 == null ? field3415[3] : field3415[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIBLfda;)V", line = 125)
    public static final void method1929(int arg0, int arg1, byte arg2, class338 arg3) {
        try {
            class324.field5123[arg0][arg1] = arg3;
            field3411++;
            if (arg2 != -95) {
                field3405 = true;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3415[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3415[3] : field3415[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "([I)V", line = 143)
    public class222(int[] arg0) {
        try {
            int var2;
            for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
            }
            this.field3413 = new int[var2 + var2];
            for (int var3 = 0; var3 < var2 + var2; var3++) {
                this.field3413[var3] = -1;
            }
            int var4 = 0;
            while (var4 < arg0.length) {
                int var5;
                for (var5 = arg0[var4] & var2 - 1; this.field3413[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
                }
                this.field3413[var5 + var5] = arg0[var4];
                this.field3413[var5 + var5 + 1] = var4++;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3415[6] + (arg0 == null ? field3415[3] : field3415[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1930(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!su", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1931(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
