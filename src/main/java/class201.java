import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class201 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3290 = " is already on your friend list.";

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "[I")
    public static int[] field3296 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
    public static boolean field3294 = true;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLim;)Lrh;", line = 4)
    public static final class146 method1469(byte arg0, class192 arg1) {
        field3289++;
        if (arg0 >= -10) {
            field3294 = true;
        }
        return new class146(arg1.method1389(106), arg1.method1389(100), arg1.method1389(97), arg1.method1389(127), arg1.method1378(false), arg1.method1378(false), arg1.method1399(-1172389784));
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[ILek;[I[I)V", line = 20)
    public static final void method1470(int arg0, int[] arg1, class196 arg2, int[] arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg4[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field2012.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field2012[var9] = null;
                    } else {
                        class80 var10 = class37.method236(var6, 20254);
                        int var11 = var10.field1207;
                        class188 var12 = arg2.field2012[var9];
                        if (var12 != null) {
                            if (var12.field3058 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field2012[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3057 = 0;
                                    var12.field3048 = var8;
                                    var12.field3055 = 0;
                                    var12.field3059 = 0;
                                    var12.field3052 = 1;
                                    class253.method1789(19080, arg2.field1944, var10, 0, arg2.field1980, false);
                                } else if (var11 == 2) {
                                    var12.field3057 = 0;
                                }
                            } else if (var10.field1197 >= class37.method236(var12.field3058, 20254).field1197) {
                                var12 = arg2.field2012[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class188 var13 = arg2.field2012[var9] = new class188();
                            var13.field3057 = 0;
                            var13.field3052 = 1;
                            var13.field3058 = var6;
                            var13.field3048 = var8;
                            var13.field3055 = 0;
                            var13.field3059 = 0;
                            class253.method1789(19080, arg2.field1944, var10, 0, arg2.field1980, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg0 != 1) {
            field3296 = (int[]) null;
        }
        field3291++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIZ)V", line = 114)
    public static final void method1471(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class166.field2690 = 0L;
        field3292++;
        int var5 = class60.method416(-61);
        if (arg2 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class6.field65.startsWith("mac") && arg2 > 0) {
            arg0 = true;
        }
        boolean var6 = arg4;
        if (arg2 > 0 == var5 <= 0) {
            var6 = true;
        }
        if (arg0 && arg2 > 0) {
            var6 = true;
        }
        class310.method2166(arg1, arg2, var5, arg3, (byte) -118, var6, arg0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 155)
    public static void method1472(int arg0) {
        field3296 = null;
        field3290 = null;
        if (arg0 != -23211) {
            field3296 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BI)Lrg;", line = 167)
    public static final class104 method1473(byte[] arg0, int arg1) {
        field3293++;
        if (arg0 == null) {
            return null;
        } else if (arg1 <= 98) {
            return (class104) null;
        } else {
            class104 var2 = new class104(arg0, class163.field2657, class162.field2647, class244.field3885, class21.field316, class3.field20);
            class17.method115((byte) -108);
            return var2;
        }
    }
}
