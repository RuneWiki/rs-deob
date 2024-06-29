import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class24 extends class206 {

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field307 = 0;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Lvd;")
    public static class126 field312 = new class126(16);

    @OriginalMember(owner = "client!od", name = "H", descriptor = "Lwa;")
    public static class75 field318 = class66.method560("null", false);

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lre;")
    public class262 field301;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Lre;")
    public class262 field304;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Lwa;")
    public class75 field315;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Z")
    public boolean field303;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "[I")
    public static int[] field317;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "[Lqj;")
    public static class238[] field316;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "[Lbh;")
    public static class258[] field306;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field302;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V", line = 14)
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field305++;
        int var6 = arg4;
        int var7 = arg4 * arg4;
        int var8 = arg2;
        int var9 = arg3 * arg3;
        int var10 = var7 << 1;
        int var11 = var9 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var9 + var10;
        int var14 = var7 - ((var12 - 1) * var11);
        int var15 = ((arg4 << 1) - 3) * var11;
        int var16 = ((arg2 << 1) + 3) * var10;
        if (class90.field1495 <= arg1 && arg1 <= class294.field5041) {
            int var17 = class14.method74(class288.field4956, arg3 + arg5, -1178441849, class153.field2635);
            int var18 = class14.method74(class288.field4956, arg5 - arg3, -1178441849, class153.field2635);
            class150.method1151(7, class63.field1096[arg1], var18, arg0, var17);
        }
        int var19 = var9 << 2;
        int var20 = var7 << 2;
        int var21 = (arg2 + 1) * var20;
        int var22 = (arg4 - 1) * var19;
        while (var6 > 0) {
            var6--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var16;
                    var16 += var20;
                    var8++;
                    var14 += var21;
                    var21 += var20;
                }
            }
            if (var14 < 0) {
                var14 += var21;
                var13 += var16;
                var8++;
                var16 += var20;
                var21 += var20;
            }
            var13 += -var22;
            var14 += -var15;
            int var23 = arg1 - var6;
            var15 -= var19;
            var22 -= var19;
            int var24 = arg1 + var6;
            if (class90.field1495 <= var24 && var23 <= class294.field5041) {
                int var25 = class14.method74(class288.field4956, arg5 + var8, -1178441849, class153.field2635);
                int var26 = class14.method74(class288.field4956, arg5 - var8, -1178441849, class153.field2635);
                if (var23 >= class90.field1495) {
                    class150.method1151(7, class63.field1096[var23], var26, arg0, var25);
                }
                if (class294.field5041 >= var24) {
                    class150.method1151(7, class63.field1096[var24], var26, arg0, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 116)
    public static void method167(int arg0) {
        field306 = null;
        field316 = null;
        field318 = null;
        if (arg0 != 14787) {
            field312 = (class126) null;
        }
        field317 = null;
        field312 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIILja;ZIII)V", line = 142)
    public static final void method168(int arg0, int arg1, int arg2, int arg3, class60 arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0) {
            field312 = (class126) null;
        }
        if (arg8 >= 0 && arg8 < 104 && arg6 >= 0 && arg6 < 104) {
            if (!arg5) {
                class204.field3459[arg1][arg8][arg6] = 0;
            }
            while (true) {
                int var9 = arg4.method501(0);
                if (var9 == 0) {
                    if (arg5) {
                        class53.field879[0][arg8][arg6] = class60.field1058[0][arg8][arg6];
                    } else if (arg1 == 0) {
                        class53.field879[0][arg8][arg6] = -class240.method1755(arg3 + arg6 + 556238, 932731 - -arg7 + arg8, (byte) 76) * 8;
                    } else {
                        class53.field879[arg1][arg8][arg6] = class53.field879[arg1 - 1][arg8][arg6] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg4.method501(0);
                    if (arg5) {
                        class53.field879[0][arg8][arg6] = var10 * 8 + class60.field1058[0][arg8][arg6];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg1 == 0) {
                            class53.field879[0][arg8][arg6] = -var10 * 8;
                        } else {
                            class53.field879[arg1][arg8][arg6] = class53.field879[arg1 - 1][arg8][arg6] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class261.field4365[arg1][arg8][arg6] = arg4.method511(arg2 - 115);
                    class52.field860[arg1][arg8][arg6] = (byte) ((var9 - 2) / 4);
                    class66.field1147[arg1][arg8][arg6] = (byte) class235.method1710(arg0 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class242.field4102[arg1][arg8][arg6] = (byte) (var9 - 81);
                } else if (!arg5) {
                    class204.field3459[arg1][arg8][arg6] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg4.method501(arg2);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg4.method501(0);
                    break;
                }
                if (var11 <= 49) {
                    arg4.method501(arg2);
                }
            }
        }
        field314++;
    }
}
