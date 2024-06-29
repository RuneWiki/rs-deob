import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class67 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field761 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "[C")
    public static char[] field764 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "[I")
    public static int[] field767 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Z")
    public static boolean field763 = true;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Lfr;")
    public static class236 field766;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 3)
    public static final void method396(int arg0) {
        class369.field5410 = new class442(8);
        field762++;
        class56.field634 = arg0;
        for (class389 var1 = (class389) class268.field3774.method1604((byte) -120); var1 != null; var1 = (class389) class268.field3774.method1612(-1)) {
            var1.method2489();
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 26)
    public static final void method397(int arg0) {
        field759++;
        if (arg0 != -16560) {
            method396(115);
        }
        int var1 = class249.field3379.method817(115, 8);
        if (var1 < class148.field2082) {
            for (int var2 = var1; var2 < class148.field2082; var2++) {
                class99.field1113[class305.field4362++] = class294.field4217[var2];
            }
        }
        if (var1 > class148.field2082) {
            throw new RuntimeException("gppov1");
        }
        class148.field2082 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class294.field4217[var3];
            class133 var5 = class375.field5473[var4];
            int var6 = class249.field3379.method817(60, 1);
            if (var6 == 0) {
                class294.field4217[class148.field2082++] = var4;
                var5.field6320 = class221.field3033;
            } else {
                int var7 = class249.field3379.method817(arg0 ^ 0x40D7, 2);
                if (var7 == 0) {
                    class294.field4217[class148.field2082++] = var4;
                    var5.field6320 = class221.field3033;
                    class204.field2798[class189.field2578++] = var4;
                } else if (var7 == 1) {
                    class294.field4217[class148.field2082++] = var4;
                    var5.field6320 = class221.field3033;
                    int var8 = class249.field3379.method817(51, 3);
                    var5.method2694(1, var8, (byte) -127);
                    int var9 = class249.field3379.method817(-119, 1);
                    if (var9 == 1) {
                        class204.field2798[class189.field2578++] = var4;
                    }
                } else if (var7 == 2) {
                    class294.field4217[class148.field2082++] = var4;
                    var5.field6320 = class221.field3033;
                    if (class249.field3379.method817(-123, 1) == 1) {
                        int var10 = class249.field3379.method817(-114, 3);
                        var5.method2694(2, var10, (byte) -127);
                        int var11 = class249.field3379.method817(76, 3);
                        var5.method2694(2, var11, (byte) -127);
                    } else {
                        int var12 = class249.field3379.method817(-121, 3);
                        var5.method2694(0, var12, (byte) -127);
                    }
                    int var13 = class249.field3379.method817(arg0 + 16583, 1);
                    if (var13 == 1) {
                        class204.field2798[class189.field2578++] = var4;
                    }
                } else if (var7 == 3) {
                    class99.field1113[class305.field4362++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V", line = 139)
    public static final void method398(Object[] arg0, int arg1, int arg2, long[] arg3, int arg4) {
        field760++;
        if (arg1 > arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            for (int var10 = arg4; var10 < arg1; var10++) {
                if ((var7 + ((long) (var10 & 0x1))) > arg3[var10]) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method398(arg0, var6 - 1, 107, arg3, arg4);
            method398(arg0, arg1, 17, arg3, var6 + 1);
        }
        if (arg2 <= 16) {
            method399(-15, (class319) null, true, (class39[]) null, 86, (class174) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILac;Z[Ldl;ILen;)V", line = 199)
    public static final void method399(int arg0, class319 arg1, boolean arg2, class39[] arg3, int arg4, class174 arg5) {
        if (!arg2) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class279.field3935; var7++) {
                    for (int var8 = 0; var8 < class164.field2287; var8++) {
                        if ((class166.field2327[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class166.field2327[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg3[var9].method241(var7, var8, (byte) 62);
                            }
                        }
                    }
                }
            }
        }
        field758++;
        int[][] var10 = new int[class279.field3935][class164.field2287];
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var14 = 0; var14 < class164.field2287; var14++) {
                class422.field6055[var14] = 0;
                class139.field1980[var14] = 0;
                class247.field3360[var14] = 0;
                class134.field1881[var14] = 0;
                class115.field1341[var14] = 0;
            }
            for (int var15 = -5; var15 < class279.field3935; var15++) {
                for (int var16 = 0; var16 < class164.field2287; var16++) {
                    int var25 = var15 + 5;
                    int var10002;
                    if (var25 < class279.field3935) {
                        int var26 = class330.field4716[var11][var25][var16] & 0xFF;
                        if (var26 > 0) {
                            class151 var27 = class52.method311(-117, var26 - 1);
                            class422.field6055[var16] += var27.field2122;
                            class139.field1980[var16] += var27.field2116;
                            class247.field3360[var16] += var27.field2118;
                            class134.field1881[var16] += var27.field2117;
                            var10002 = class115.field1341[var16]++;
                        }
                    }
                    int var28 = var15 - 5;
                    if (var28 >= 0) {
                        int var29 = class330.field4716[var11][var28][var16] & 0xFF;
                        if (var29 > 0) {
                            class151 var30 = class52.method311(-86, var29 - 1);
                            class422.field6055[var16] -= var30.field2122;
                            class139.field1980[var16] -= var30.field2116;
                            class247.field3360[var16] -= var30.field2118;
                            class134.field1881[var16] -= var30.field2117;
                            var10002 = class115.field1341[var16]--;
                        }
                    }
                }
                if (var15 >= 0) {
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    int var21 = 0;
                    for (int var22 = -5; var22 < class164.field2287; var22++) {
                        int var23 = var22 + 5;
                        if (var23 < class164.field2287) {
                            var19 += class247.field3360[var23];
                            var18 += class139.field1980[var23];
                            var17 += class422.field6055[var23];
                            var20 += class134.field1881[var23];
                            var21 += class115.field1341[var23];
                        }
                        int var24 = var22 - 5;
                        if (var24 >= 0) {
                            var21 -= class115.field1341[var24];
                            var20 -= class134.field1881[var24];
                            var18 -= class139.field1980[var24];
                            var19 -= class247.field3360[var24];
                            var17 -= class422.field6055[var24];
                        }
                        if (var22 >= 0 && var20 > 0 && var21 > 0) {
                            var10[var15][var22] = class152.method909(var18 / var21, false, var17 * 256 / var20, var19 / var21);
                        }
                    }
                }
            }
            class173.method1143(arg1, class279.field3935, class299.field4266[var11], 0, class401.field5825[var11], var11, class132.field1814[var11], arg2, var10, class330.field4716[var11], class94.field1040[var11], class164.field2287, arg5);
            class330.field4716[var11] = null;
            class401.field5825[var11] = null;
            class299.field4266[var11] = null;
            class94.field1040[var11] = null;
        }
        int var12 = 70 % ((arg4 + 39) / 33);
        if (!arg2) {
            if (class216.field2943) {
                class262.method1654();
            }
            if (class341.field5022 != 0) {
                class149.method891();
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            class132.field1814[var13].method1981();
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 411)
    public static void method400(byte arg0) {
        if (arg0 > 19) {
            field767 = null;
            field761 = null;
            field764 = null;
            field766 = null;
        }
    }
}
