import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class358 {

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[I")
    public static int[] field5173 = new int[100];

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
    public static boolean field5172 = true;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "[[I")
    public static int[][] field5170 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "F")
    public static float field5176 = 0.0F;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "[Lvj;")
    public static class256[] field5177;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[[S")
    public static short[][] field5175;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILvq;Luh;ZB[Lqr;)V", line = 10)
    public static final void method2332(int arg0, class269 arg1, class92 arg2, boolean arg3, byte arg4, class41[] arg5) {
        field5171++;
        if (!arg3) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class80.field1034; var7++) {
                    for (int var8 = 0; var8 < class381.field5414; var8++) {
                        if ((class320.field4692[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class320.field4692[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg5[var9].method284((byte) -100, var8, var7);
                            }
                        }
                    }
                }
            }
        }
        int[][] var10 = new int[class80.field1034][class381.field5414];
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var13 = 0; var13 < class381.field5414; var13++) {
                class247.field3701[var13] = 0;
                class267.field3914[var13] = 0;
                class127.field1762[var13] = 0;
                class209.field2993[var13] = 0;
                class415.field5929[var13] = 0;
            }
            for (int var14 = -5; var14 < class80.field1034; var14++) {
                for (int var15 = 0; var15 < class381.field5414; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (class80.field1034 > var24) {
                        int var25 = class10.field130[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class386 var26 = class204.method1422(1, var25 - 1);
                            class247.field3701[var15] += var26.field5458;
                            class267.field3914[var15] += var26.field5467;
                            class127.field1762[var15] += var26.field5465;
                            class209.field2993[var15] += var26.field5459;
                            var10002 = class415.field5929[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class10.field130[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class386 var29 = class204.method1422(1, var28 - 1);
                            class247.field3701[var15] -= var29.field5458;
                            class267.field3914[var15] -= var29.field5467;
                            class127.field1762[var15] -= var29.field5465;
                            class209.field2993[var15] -= var29.field5459;
                            var10002 = class415.field5929[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class381.field5414; var21++) {
                        int var22 = var21 + 5;
                        if (var22 < class381.field5414) {
                            var18 += class127.field1762[var22];
                            var16 += class247.field3701[var22];
                            var19 += class209.field2993[var22];
                            var17 += class267.field3914[var22];
                            var20 += class415.field5929[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var16 -= class247.field3701[var23];
                            var18 -= class127.field1762[var23];
                            var20 -= class415.field5929[var23];
                            var19 -= class209.field2993[var23];
                            var17 -= class267.field3914[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class295.method1997(var16 * 256 / var19, var17 / var20, var18 / var20, (byte) -95);
                        }
                    }
                }
            }
            class204.method1420(-7011, arg1, var10, class439.field6280[var11], class214.field3049[var11], class381.field5414, arg2, class336.field4877[var11], arg3, class80.field1034, class246.field3678[var11], class10.field130[var11], var11);
            class10.field130[var11] = null;
            class246.field3678[var11] = null;
            class336.field4877[var11] = null;
            class214.field3049[var11] = null;
        }
        if (arg4 != 14) {
            return;
        }
        if (!arg3) {
            if (class120.field1626) {
                class47.method310();
            }
            if (class194.field2802 != 0) {
                class451.method2811();
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            class439.field6280[var12].method355();
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 226)
    public static void method2333(int arg0) {
        field5177 = null;
        field5175 = null;
        field5170 = null;
        if (arg0 == 24419) {
            field5173 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Lao;", line = 248)
    public static final class158 method2334(int arg0) {
        field5178++;
        class226.field3374 = 0;
        if (arg0 != -5397) {
            field5170 = null;
        }
        return class440.method2744(-21860);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)V", line = 269)
    public static final void method2335(byte arg0, int arg1) {
        class291.method1974(77);
        field5174++;
        class19.method108(1);
        class284.method1955(true, arg1, 72);
        class341.method2238(class15.field216, 0, class327.field4745, class59.field786);
        class197.method1402(class59.field786, class15.field216, 125);
        int var2 = 107 / ((-arg0 - 72) / 48);
        class349.method2285(class120.field1622, (byte) 106);
        class255.method1770((byte) 6);
        class158.method1152(-113);
        if (class423.field6041 == 10) {
            class9.method49((byte) -125, false);
        } else if (class423.field6041 == 30) {
            class390.method2463(25, true);
            return;
        } else if (class423.field6041 == 5) {
            class393.method2475(-113, class59.field786, class15.field216);
            return;
        }
    }
}
