import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class154 {

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    private int field2579 = 0;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Li;")
    private class112 field2573;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2572 = -1;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2578 = "Connecting to update server";

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2584 = "Loading...";

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lij;")
    public static class258 field2576;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lia;")
    private class83 field2585;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method1052(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2581++;
        if (arg1) {
            field2584 = null;
        }
        if (arg5 < 0 || arg4 < 0 || arg5 >= 103 || arg4 >= 103) {
            return;
        }
        if (arg3 == 0) {
            class212 var8 = class15.method88(arg0, arg5, arg4);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field3577 >>> 32);
                if (arg2 == 2) {
                    var8.field3572 = new class35(var9, 2, arg7 + 4, arg0, arg5, arg4, arg6, false, var8.field3572);
                    var8.field3575 = new class35(var9, 2, arg7 + 1 & 0x3, arg0, arg5, arg4, arg6, false, var8.field3575);
                } else {
                    var8.field3572 = new class35(var9, arg2, arg7, arg0, arg5, arg4, arg6, false, var8.field3572);
                }
            }
        }
        if (arg3 == 1) {
            class223 var10 = class156.method1072(arg0, arg5, arg4);
            if (var10 != null) {
                int var11 = (int) (var10.field3759 >>> 32) & Integer.MAX_VALUE;
                if (arg2 == 4 || arg2 == 5) {
                    var10.field3764 = new class35(var11, 4, arg7, arg0, arg5, arg4, arg6, false, var10.field3764);
                } else if (arg2 == 6) {
                    var10.field3764 = new class35(var11, 4, arg7 + 4, arg0, arg5, arg4, arg6, false, var10.field3764);
                } else if (arg2 == 7) {
                    var10.field3764 = new class35(var11, 4, (arg7 + 2 & 0x3) + 4, arg0, arg5, arg4, arg6, false, var10.field3764);
                } else if (arg2 == 8) {
                    var10.field3764 = new class35(var11, 4, arg7 + 4, arg0, arg5, arg4, arg6, false, var10.field3764);
                    var10.field3753 = new class35(var11, 4, (arg7 + 2 & 0x3) + 4, arg0, arg5, arg4, arg6, false, var10.field3753);
                }
            }
        }
        if (arg3 == 2) {
            if (arg2 == 11) {
                arg2 = 10;
            }
            class173 var12 = class98.method617(arg0, arg5, arg4);
            if (var12 != null) {
                var12.field2842 = new class35(Integer.MAX_VALUE & (int) (var12.field2850 >>> 32), arg2, arg7, arg0, arg5, arg4, arg6, false, var12.field2842);
            }
        }
        if (arg3 != 3) {
            return;
        }
        class11 var13 = class192.method1252(arg0, arg5, arg4);
        if (var13 != null) {
            var13.field158 = new class35((int) (var13.field159 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg0, arg5, arg4, arg6, false, var13.field158);
            return;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)Lia;")
    public final class83 method1053(byte arg0) {
        if (arg0 != -18) {
            field2576 = null;
        }
        this.field2579 = 0;
        field2586++;
        return this.method1055((byte) -22);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static final void method1054(int arg0) {
        class134.field2325.method58(arg0 ^ arg0);
        field2577++;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)Lia;")
    public final class83 method1055(byte arg0) {
        if (arg0 != -22) {
            return null;
        }
        field2580++;
        if (this.field2579 > 0 && this.field2573.field2021[this.field2579 - 1] != this.field2585) {
            class83 var2 = this.field2585;
            this.field2585 = var2.field1506;
            return var2;
        }
        while (this.field2579 < this.field2573.field2013) {
            class83 var3 = this.field2573.field2021[this.field2579++].field1506;
            if (this.field2573.field2021[this.field2579 - 1] != var3) {
                this.field2585 = var3.field1506;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
    public static final String[] method1056(String arg0, int arg1, char arg2) {
        int var3 = class143.method996((byte) -91, arg0, arg2);
        field2575++;
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            return null;
        }
        while (var7 < var3) {
            int var8;
            for (var8 = var6; arg2 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
            var7++;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([IIIIII)V")
    public static final void method1057(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class109 var6 = class79.field1367[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class216 var7 = var6.field1971;
        if (var7 != null) {
            int var8 = var7.field3651;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class251 var10 = var6.field1956;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4115;
        int var12 = var10.field4107;
        int var13 = var10.field4105;
        int var14 = var10.field4114;
        int[] var15 = class58.field1021[var11];
        int[] var16 = class122.field2145[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(DI)V")
    public static final void method1058(double arg0, int arg1) {
        if (arg1 != 256) {
            return;
        }
        field2574++;
        if (class219.field3670 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class98.field1679[var3] = var4 > 255 ? 255 : var4;
        }
        class219.field3670 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method1059(int arg0) {
        field2576 = null;
        if (arg0 != 6362) {
            method1057((int[]) null, 93, -84, 98, -123, -98);
        }
        field2578 = null;
        field2584 = null;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Li;)V")
    public class154(class112 arg0) {
        this.field2573 = arg0;
    }
}
