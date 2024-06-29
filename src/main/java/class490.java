import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class490 extends class551 {

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "Loda;")
    public static class559 field7415 = new class559("runescape", 0);

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "Lica;")
    private class205 field7414;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "[Z")
    public static boolean[] field7416;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([ILhca;I[I[I)V")
    public static final void method2963(int[] arg0, class179 arg1, int arg2, int[] arg3, int[] arg4) {
        field7412++;
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && arg1.field1074.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field1074[var9] = null;
                    } else {
                        class224 var10 = class470.field7205.method3498(false, var6);
                        int var11 = var10.field3301;
                        class251 var12 = arg1.field1074[var9];
                        if (var12 != null) {
                            if (var12.field3649 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field1074[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3654 = 0;
                                    var12.field3644 = 1;
                                    var12.field3653 = 0;
                                    var12.field3651 = 0;
                                    var12.field3646 = var8;
                                    class295.method1830(0, arg1.field3463, (byte) 97, arg1.field3457, var10, class239.field3493 == arg1, arg1.field3464);
                                } else if (var11 == 2) {
                                    var12.field3653 = 0;
                                }
                            } else if (var10.field3308 >= class470.field7205.method3498(false, var12.field3649).field3308) {
                                var12 = arg1.field1074[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class251 var13 = arg1.field1074[var9] = new class251();
                            var13.field3644 = 1;
                            var13.field3653 = 0;
                            var13.field3651 = 0;
                            var13.field3654 = 0;
                            var13.field3646 = var8;
                            var13.field3649 = var6;
                            class295.method1830(0, arg1.field3463, (byte) 54, arg1.field3457, var10, class239.field3493 == arg1, arg1.field3464);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg2 < 97) {
            method2968(113, 63, 84);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method2964(int arg0, String arg1, int arg2) {
        field7406++;
        if (this.field7414 == null) {
            return arg1;
        } else if (arg2 == -28742) {
            class647 var4 = (class647) this.field7414.method1333((long) arg0, false);
            return var4 == null ? arg1 : var4.field9387;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public static void method2965(boolean arg0) {
        field7415 = null;
        field7416 = null;
        if (arg0) {
            field7410 = 118;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLps;)V")
    public final void method2966(byte arg0, class428 arg1) {
        field7411++;
        if (arg0 != 94) {
            method2965(true);
        }
        while (true) {
            int var3 = arg1.method2561((byte) -122);
            if (var3 == 0) {
                return;
            }
            this.method2967(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZLps;)V")
    private final void method2967(int arg0, boolean arg1, class428 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method2561((byte) -84);
            if (this.field7414 == null) {
                int var5 = class479.method2908((byte) -99, var4);
                this.field7414 = new class205(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method2561((byte) 123) == 1;
                int var8 = arg2.method2601(69);
                class496 var9;
                if (var7) {
                    var9 = new class647(arg2.method2585(-39));
                } else {
                    var9 = new class269(arg2.method2589(-11179));
                }
                this.field7414.method1341(var9, (byte) 59, (long) var8);
            }
        }
        field7409++;
        if (arg1) {
            field7410 = -88;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)Z")
    public static final boolean method2968(int arg0, int arg1, int arg2) {
        field7408++;
        if (arg2 != 24431) {
            method2968(-82, -44, 79);
        }
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II[BIIIII[B)V")
    public static final void method2969(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg0 != -27373) {
            field7415 = null;
        }
        field7407++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg8[var10001] += arg2[arg7++];
                int var14 = arg6++;
                arg8[var14] += arg2[arg7++];
                int var15 = arg6++;
                arg8[var15] += arg2[arg7++];
                int var16 = arg6++;
                arg8[var16] += arg2[arg7++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg8[var10001] += arg2[arg7++];
            }
            arg7 += arg1;
            arg6 += arg4;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZI)I")
    public final int method2970(int arg0, boolean arg1, int arg2) {
        field7413++;
        if (this.field7414 == null) {
            return arg0;
        } else {
            class269 var4 = (class269) this.field7414.method1333((long) arg2, arg1);
            return var4 == null ? arg0 : var4.field3986;
        }
    }
}
