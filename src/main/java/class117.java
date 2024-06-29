import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class117 {

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Z")
    public static boolean field1661 = true;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field1654 = 0;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field1655 = -1;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Z")
    public static boolean field1662 = false;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILcc;I)V", line = 16)
    public static final void method797(int arg0, int arg1, class263 arg2, int arg3) {
        if (arg2.field4024 == 1) {
            class219.field3086++;
            class168.method1100(arg2.field4083, (short) 20, 0L, "", 0, -501, -1, arg2.field4151);
        }
        if (arg0 != 96) {
            field1655 = 47;
        }
        field1660++;
        if (arg2.field4024 == 2 && !class72.field909) {
            String var4 = class299.method2112(arg2, 7625);
            if (var4 != null) {
                class168.method1100(arg2.field4083, (short) 18, 0L, "<col=00ff00>" + arg2.field4130, -1, -501, -1, var4);
                class264.field4162++;
            }
        }
        if (arg2.field4024 == 3) {
            class168.method1100(arg2.field4083, (short) 28, 0L, "", 0, -501, -1, class62.field789);
            class307.field4750++;
        }
        if (arg2.field4024 == 4) {
            class311.field4817++;
            class168.method1100(arg2.field4083, (short) 13, 0L, "", 0, arg0 ^ 0xFFFFFE6B, -1, arg2.field4151);
        }
        if (arg2.field4024 == 5) {
            class168.method1100(arg2.field4083, (short) 41, 0L, "", 0, -501, -1, arg2.field4151);
            class315.field4857++;
        }
        if (arg2.field4024 == 6 && class262.field3960 == null) {
            class168.method1100(arg2.field4083, (short) 6, 0L, "", -1, -501, -1, arg2.field4151);
            class14.field181++;
        }
        if (arg2.field3981 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field4155; var6++) {
                for (int var7 = 0; var7 < arg2.field4092; var7++) {
                    int var8 = (arg2.field4112 + 32) * var7;
                    int var9 = (arg2.field4099 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg2.field4147[var5];
                        var8 += arg2.field4013[var5];
                    }
                    if (arg1 >= var8 && var9 <= arg3 && (var8 + 32) > arg1 && (var9 + 32) > arg3) {
                        class59.field725 = var5;
                        class80.field1037 = arg2;
                        if (arg2.field4132[var5] > 0) {
                            class171 var10 = client.method1952(arg2);
                            class93 var11 = class60.method353(arg2.field4132[var5] - 1, (byte) -62);
                            if (class314.field4848 == 1 && var10.method1119(arg0 ^ 0x61)) {
                                if (class137.field1915 != arg2.field4083 || class277.field4319 != var5) {
                                    class168.method1100(arg2.field4083, (short) 43, (long) var11.field1202, class285.field4488 + " -> <col=ff9040>" + var11.field1167, var5, arg0 - 597, -1, class50.field629);
                                    class304.field4715++;
                                }
                            } else if (class72.field909 && var10.method1119(1)) {
                                class30 var12 = class161.field2219 == -1 ? null : class343.method2373(-47, class161.field2219);
                                if ((class37.field442 & 0x10) != 0 && (var12 == null || var11.method558(class161.field2219, arg0 ^ 0x60, var12.field377) != var12.field377)) {
                                    class168.method1100(arg2.field4083, (short) 35, (long) var11.field1202, class255.field3892 + " -> <col=ff9040>" + var11.field1167, var5, -501, class229.field3343, class260.field3943);
                                    class310.field4797++;
                                }
                            } else {
                                class254.field3869++;
                                String[] var13 = var11.field1163;
                                if (class35.field418) {
                                    var13 = class293.method2082(var13, (byte) 61);
                                }
                                if (var10.method1119(1)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class181.field2620++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 14;
                                            } else {
                                                var15 = 57;
                                            }
                                            class168.method1100(arg2.field4083, var15, (long) var11.field1202, "<col=ff9040>" + var11.field1167, var5, -501, -1, var13[var14]);
                                        }
                                    }
                                }
                                if (var10.method1125((byte) -95)) {
                                    class221.field3121++;
                                    class168.method1100(arg2.field4083, (short) 3, (long) var11.field1202, "<col=ff9040>" + var11.field1167, var5, -501, class47.field551, class50.field629);
                                }
                                if (var10.method1119(1) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class35.field417++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 51;
                                            }
                                            if (var16 == 1) {
                                                var17 = 19;
                                            }
                                            if (var16 == 2) {
                                                var17 = 37;
                                            }
                                            class168.method1100(arg2.field4083, var17, (long) var11.field1202, "<col=ff9040>" + var11.field1167, var5, -501, -1, var13[var16]);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field4084;
                                if (class35.field418) {
                                    var18 = class293.method2082(var18, (byte) 56);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class229.field3336++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 32;
                                            }
                                            if (var19 == 1) {
                                                var20 = 11;
                                            }
                                            if (var19 == 2) {
                                                var20 = 2;
                                            }
                                            if (var19 == 3) {
                                                var20 = 60;
                                            }
                                            if (var19 == 4) {
                                                var20 = 47;
                                            }
                                            class168.method1100(arg2.field4083, var20, (long) var11.field1202, "<col=ff9040>" + var11.field1167, var5, -501, -1, var18[var19]);
                                        }
                                    }
                                }
                                class168.method1100(arg2.field4083, (short) 1004, (long) var11.field1202, "<col=ff9040>" + var11.field1167, var5, arg0 - 597, class60.field738, class343.field5323);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field3993) {
            return;
        }
        if (!class72.field909) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class40.method233(arg2, var21, (byte) -59);
                if (var22 != null) {
                    class168.method1100(arg2.field4083, (short) 1002, (long) (var21 + 1), arg2.field3996, arg2.field4012, arg0 ^ 0xFFFFFE6B, class192.method1330((byte) -53, arg2, var21), var22);
                    class78.field978++;
                }
            }
            String var23 = class299.method2112(arg2, 7625);
            if (var23 != null) {
                class168.method1100(arg2.field4083, (short) 18, 0L, arg2.field3996, arg2.field4012, arg0 - 597, -1, var23);
                class264.field4162++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class40.method233(arg2, var24, (byte) -59);
                if (var25 != null) {
                    class168.method1100(arg2.field4083, (short) 49, (long) (var24 + 1), arg2.field3996, arg2.field4012, -501, class192.method1330((byte) -53, arg2, var24), var25);
                    class78.field978++;
                }
            }
            if (client.method1952(arg2).method1118((byte) -111)) {
                class14.field181++;
                if (arg2.field4025 == null) {
                    class168.method1100(arg2.field4083, (short) 6, 0L, "", arg2.field4012, -501, -1, class148.field2058);
                } else {
                    class168.method1100(arg2.field4083, (short) 6, 0L, "", arg2.field4012, -501, -1, arg2.field4025);
                }
            }
        } else if (client.method1952(arg2).method1128(1) && (class37.field442 & 0x20) != 0) {
            class53.field644++;
            class168.method1100(arg2.field4083, (short) 50, 0L, class255.field3892 + " -> " + arg2.field3996, arg2.field4012, -501, class229.field3343, class260.field3943);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 340)
    public static final void method798(byte arg0) {
        for (int var1 = -1; var1 < class204.field2864; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class180.field2612[var1];
            }
            class109 var3 = class328.field5009[var2];
            if (var3 != null && var3.field2437 > 0) {
                var3.field2437--;
                if (var3.field2437 == 0) {
                    var3.field2373 = null;
                }
            }
        }
        if (arg0 < 7) {
            method799(117, -87, -49, -110, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), 40, (class245) null, (byte) -43, 88, (float[][]) ((float[][]) null), (byte) -84, -5, (float[][]) ((float[][]) null), 92, false);
        }
        for (int var4 = 0; var4 < class127.field1735; var4++) {
            int var5 = class269.field4238[var4];
            class184 var6 = class223.field3159[var5];
            if (var6 != null && var6.field2437 > 0) {
                var6.field2437--;
                if (var6.field2437 == 0) {
                    var6.field2373 = null;
                }
            }
        }
        field1659++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII[[F[[IILgj;BI[[FBI[[FIZ)V", line = 397)
    public static final void method799(int arg0, int arg1, int arg2, int arg3, float[][] arg4, int[][] arg5, int arg6, class245 arg7, byte arg8, int arg9, float[][] arg10, byte arg11, int arg12, float[][] arg13, int arg14, boolean arg15) {
        field1657++;
        int var16 = (arg0 << 8) + 255;
        int var17 = (arg2 << 8) + 255;
        int var18 = (arg9 << 8) + 255;
        int var19 = (arg12 << 8) + 255;
        int[] var20 = class280.field4348[arg11];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, var20[var23 + var23], arg6, arg5, var19, arg13, false, 0.0F, arg10, var16, (int[][]) null, var20[var23 + var23 + 1], arg8);
        }
        if (arg15) {
            if (arg11 == 1) {
                var21 = new int[6];
                int var42 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 64, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 128, arg8);
                int var43 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 128, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 64, arg8);
                var21[3] = var42;
                var21[0] = var43;
                var21[4] = var22[0];
                var21[2] = var22[2];
                var21[5] = var22[2];
                var21[1] = var42;
            } else if (arg11 == 2) {
                var21 = new int[6];
                int var40 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 128, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 128, arg8);
                int var41 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 64, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 0, arg8);
                var21[3] = var40;
                var21[1] = var41;
                var21[0] = var22[0];
                var21[4] = var22[1];
                var21[2] = var40;
                var21[5] = var22[0];
            } else if (arg11 == 3) {
                var21 = new int[6];
                int var38 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 0, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 128, arg8);
                int var39 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 64, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 0, arg8);
                var21[1] = var22[1];
                var21[0] = var22[2];
                var21[2] = var38;
                var21[3] = var38;
                var21[4] = var39;
                var21[5] = var22[2];
            } else if (arg11 == 4) {
                int var37 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 0, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 128, arg8);
                var21 = new int[] { var22[3], var37, var22[0] };
            } else if (arg11 == 5) {
                int var36 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 128, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 128, arg8);
                var21 = new int[] { var22[2], var36, var22[3] };
            } else if (arg11 == 6) {
                var21 = new int[6];
                int var34 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 128, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 0, arg8);
                int var35 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 128, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 128, arg8);
                var21[0] = var22[3];
                var21[4] = var22[0];
                var21[3] = var35;
                var21[2] = var35;
                var21[1] = var34;
                var21[5] = var22[3];
            } else if (arg11 == 7) {
                var21 = new int[6];
                int var32 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 0, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 128, arg8);
                int var33 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 128, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 0, arg8);
                var21[0] = var22[1];
                var21[1] = var33;
                var21[2] = var32;
                var21[3] = var32;
                var21[5] = var22[1];
                var21[4] = var22[2];
            } else if (arg11 == 8) {
                var21 = new int[3];
                int var25 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 0, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 0, arg8);
                var21[2] = var22[4];
                var21[0] = var22[3];
                var21[1] = var25;
            } else if (arg11 == 9) {
                var21 = new int[15];
                int var29 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 128, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 64, arg8);
                int var30 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 96, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 32, arg8);
                int var31 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 64, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 0, arg8);
                var21[2] = var22[4];
                var21[10] = var22[2];
                var21[8] = var22[2];
                var21[9] = var30;
                var21[6] = var30;
                var21[12] = var30;
                var21[3] = var30;
                var21[1] = var29;
                var21[13] = var22[1];
                var21[11] = var22[1];
                var21[5] = var22[3];
                var21[14] = var31;
                var21[0] = var30;
                var21[7] = var22[3];
                var21[4] = var22[4];
            } else if (arg11 == 10) {
                var21 = new int[9];
                int var28 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 0, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 128, arg8);
                var21[0] = var22[2];
                var21[7] = var28;
                var21[2] = var22[3];
                var21[3] = var22[3];
                var21[8] = var22[0];
                var21[1] = var28;
                var21[4] = var28;
                var21[6] = var22[4];
                var21[5] = var22[4];
            } else if (arg11 == 11) {
                var21 = new int[12];
                int var26 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 0, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 64, arg8);
                int var27 = class309.method2173(var18, arg4, var17, arg3, (byte) 103, arg7, 128, arg6, arg5, var19, arg13, true, 0.0F, arg10, var16, (int[][]) null, 64, arg8);
                var21[1] = var26;
                var21[0] = var22[3];
                var21[2] = var22[0];
                var21[11] = var27;
                var21[4] = var22[2];
                var21[8] = var26;
                var21[10] = var22[1];
                var21[3] = var22[3];
                var21[5] = var26;
                var21[6] = var22[2];
                var21[7] = var27;
                var21[9] = var22[2];
            }
        }
        if (arg1 != -16658) {
            method797(76, -45, (class263) null, -27);
        }
        arg7.method1761(arg14, arg3, arg6, var22, var21, false);
    }
}
