import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class41 extends class247 {

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lfe;")
    public static class231 field500 = null;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "B")
    public byte field502;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lvl;")
    public static class73 field497;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Ljava/lang/String;")
    public String field498;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/lang/String;")
    public String field501;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[[[B")
    public static byte[][][] field503;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lwf;IIIIIIZ)V")
    public static final void method236(class54 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field772.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field772[var9] - class220.field3458;
            int var23 = arg0.field778[var9] - class148.field2203;
            int var24 = arg0.field788[var9] - class140.field2008;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field780 != null) {
                class54.field791[var9] = var25;
                class54.field790[var9] = var28;
                class54.field787[var9] = var29;
            }
            class54.field773[var9] = (var25 << 9) / var29 + class221.field3459;
            class54.field774[var9] = (var28 << 9) / var29 + class221.field3463;
        }
        class221.field3472 = 0;
        int var10 = arg0.field776.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field776[var11];
            int var13 = arg0.field777[var11];
            int var14 = arg0.field770[var11];
            int var15 = class54.field773[var12];
            int var16 = class54.field773[var13];
            int var17 = class54.field773[var14];
            int var18 = class54.field774[var12];
            int var19 = class54.field774[var13];
            int var20 = class54.field774[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class198.field3142 && class59.method381(class221.field3459 + class19.field264, class221.field3463 + class188.field2944, var18, var19, var20, var15, var16, var17)) {
                    class234.field3777 = arg5;
                    class24.field302 = arg6;
                }
                if (!arg7) {
                    class221.field3475 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class221.field3461 || var16 > class221.field3461 || var17 > class221.field3461) {
                        class221.field3475 = true;
                    }
                    if (arg0.field780 == null || arg0.field780[var11] == -1) {
                        if (arg0.field782[var11] != 12345678) {
                            class221.method1563(var18, var19, var20, var15, var16, var17, arg0.field782[var11], arg0.field771[var11], arg0.field775[var11]);
                        }
                    } else if (!class234.field3773) {
                        int var21 = class221.field3464.method577((byte) 126, arg0.field780[var11]);
                        class221.method1563(var18, var19, var20, var15, var16, var17, class96.method657(var21, arg0.field782[var11]), class96.method657(var21, arg0.field771[var11]), class96.method657(var21, arg0.field775[var11]));
                    } else if (arg0.field785) {
                        class221.method1568(var18, var19, var20, var15, var16, var17, arg0.field782[var11], arg0.field771[var11], arg0.field775[var11], class54.field791[0], class54.field791[1], class54.field791[3], class54.field790[0], class54.field790[1], class54.field790[3], class54.field787[0], class54.field787[1], class54.field787[3], arg0.field780[var11]);
                    } else {
                        class221.method1568(var18, var19, var20, var15, var16, var17, arg0.field782[var11], arg0.field771[var11], arg0.field775[var11], class54.field791[var12], class54.field791[var13], class54.field791[var14], class54.field790[var12], class54.field790[var13], class54.field790[var14], class54.field787[var12], class54.field787[var13], class54.field787[var14], arg0.field780[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI[B)I")
    public static final int method237(byte arg0, int arg1, byte[] arg2) {
        int var3 = 55 / ((arg0 - 58) / 54);
        field504++;
        return class284.method1949(arg1, 0, arg2, -124);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class273 var20 = new class273(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class184.field2892[var21][arg1][arg2] == null) {
                    class184.field2892[var21][arg1][arg2] = new class113(var21, arg1, arg2);
                }
            }
            class184.field2892[arg0][arg1][arg2].field1645 = var20;
        } else if (arg3 == 1) {
            class273 var22 = new class273(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class184.field2892[var23][arg1][arg2] == null) {
                    class184.field2892[var23][arg1][arg2] = new class113(var23, arg1, arg2);
                }
            }
            class184.field2892[arg0][arg1][arg2].field1645 = var22;
        } else {
            class54 var24 = new class54(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class184.field2892[var25][arg1][arg2] == null) {
                    class184.field2892[var25][arg1][arg2] = new class113(var25, arg1, arg2);
                }
            }
            class184.field2892[arg0][arg1][arg2].field1657 = var24;
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public static void method239(int arg0) {
        field503 = null;
        if (arg0 > -82) {
            method239(13);
        }
        field497 = null;
        field500 = null;
    }
}
