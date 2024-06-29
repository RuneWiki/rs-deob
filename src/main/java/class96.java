import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public abstract class class96 {

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field1396 = -1;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "Lbi;")
    public static class104 field1392 = new class104(92, 6);

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "[F")
    public static float[] field1398 = new float[16384];

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "[F")
    public static float[] field1400 = new float[16384];

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "Lid;")
    public static class295 field1394;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cw", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field1401;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "[I")
    public static int[] field1399;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "[S")
    public static short[] field1397;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public static final void method651(int arg0) {
        field1395++;
        int var1 = class234.field3861;
        if (arg0 != 14996) {
            method651(-108);
        }
        int[] var2 = class21.field245;
        for (int var3 = 0; var3 < var1; var3++) {
            class350 var4 = class264.field4276[var2[var3]];
            if (var4 != null) {
                class372.method2420(false, var4.method415(-4), var4);
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
    public static void method652(int arg0) {
        if (arg0 != -8078) {
            method652(42);
        }
        field1392 = null;
        field1399 = null;
        field1398 = null;
        field1400 = null;
        field1394 = null;
        field1397 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lza;II)Z")
    public static final boolean method653(class497 arg0, int arg1, int arg2) {
        field1393++;
        int var3 = (class135.field1839 - 104) / 2;
        int var4 = (class197.field3038 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class402.method2585((byte) 126, var52, arg2, var51, var6)) {
                        int var53 = var52;
                        if (class303.method2041(var51, var6, (byte) 113)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class79.method568(-113, var6, var51, var53);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class256.field4148 = arg0.method1232(var7, 0, 512, 512, 512);
        class436.method2747(-115);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 228 | 0x22B0FF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class123.field1670][class123.field1670];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class123.field1670) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class123.field1670) {
                arg0.method1307(0, 0, class123.field1670 * 4, class123.field1670 * 4);
                arg0.method1317(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class123.field1670; var44++) {
                        for (int var50 = 0; var50 < class123.field1670; var50++) {
                            var12[var44][var50] = class402.method2585((byte) 120, var37, arg2, var36 + var50, var13 + var44);
                        }
                    }
                    class244.field3956[var37].method690(0, 0, 1024, var13, var36, class123.field1670 + var13, class123.field1670 + var36, var12);
                    if (!class148.field1997) {
                        for (int var45 = -4; var45 < class123.field1670; var45++) {
                            for (int var46 = -4; var46 < class123.field1670; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var48 >= var4 && class402.method2585((byte) 107, var37, arg2, var48, var47)) {
                                    int var49 = var37;
                                    if (class303.method2041(var48, var47, (byte) 57)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class326.method2177(arg0, (byte) -113, var45 * 4, var10, var49, var48, var47, var9, (class123.field1670 - var46) * 4 - 4);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class148.field1997) {
                    class284 var38 = class352.field5488[arg2];
                    for (int var39 = 0; var39 < class123.field1670; var39++) {
                        for (int var40 = 0; var40 < class123.field1670; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field4485[var41 - var38.field4494][var42 - var38.field4480];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method3042(4, (byte) -106, (class123.field1670 - var40) * 4 - 4, -1713569622, var39 * 4, 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method3046((class123.field1670 - var40) * 4 - 4, -1713569622, var39 * 4, 2, 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method3036(4, var39 * 4 + 3, -1713569622, (byte) 109, (class123.field1670 - var40) * 4 - 4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method3046((class123.field1670 - var40) * 4 + 3 - 4, -1713569622, var39 * 4, 2, 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method3036(4, var39 * 4, -1713569622, (byte) 57, (class123.field1670 - var40) * 4 - 4);
                            }
                        }
                    }
                }
                arg0.method1260(0, 0, class123.field1670 * 4, class123.field1670 * 4, var11, 2);
                class256.field4148.method631((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class123.field1670 * 4), class123.field1670 * 4, class123.field1670 * 4, 0, 0);
            }
        }
        arg0.method1228();
        arg0.method1317(-16777215);
        if (arg1 < 111) {
            method653(null, 109, -66);
        }
        class236.method1667(2318);
        class388.field5923 = 0;
        class61.field952.method2120((byte) 27);
        if (!class148.field1997) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg2; (arg2 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class402.method2585((byte) 103, var21, arg2, var20, var14)) {
                            class267 var22 = (class267) class76.method548(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class267) class49.method352(var21, var14, var20, field1401 == null ? (field1401 = method654("jq")) : field1401);
                            }
                            if (var22 == null) {
                                var22 = (class267) class409.method2611(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class267) class75.method544(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class156 var23 = class454.field7029.method3002(-1, var22.method96((byte) 118));
                                if (!var23.field2063 || class153.field2049) {
                                    int var24 = var23.field2127;
                                    if (var23.field2134 != null) {
                                        for (int var25 = 0; var25 < var23.field2134.length; var25++) {
                                            if (var23.field2134[var25] != -1) {
                                                class156 var26 = class454.field7029.method3002(-1, var23.field2134[var25]);
                                                if (var26.field2127 >= 0) {
                                                    var24 = var26.field2127;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class210 var28 = class457.field7049.method662(var24, true);
                                            if (var28 != null && var28.field3237) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class352.field5488[var21].field4485;
                                            int var32 = class352.field5488[var21].field4494;
                                            int var33 = class352.field5488[var21].field4480;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class55.field819[class388.field5923] = var23.field2082;
                                        class31.field323[class388.field5923] = var29;
                                        class305.field4792[class388.field5923] = var30;
                                        class388.field5923++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class76.field1130 != null) {
                class483.field7346.field2342 = 1;
                class457.field7049.method661(64, 1024, 2);
                for (int var15 = 0; var15 < class76.field1130.field3702; var15++) {
                    int var16 = class76.field1130.field3706[var15];
                    if (var16 >> 28 == class358.field5565.field6419) {
                        int var17 = ((var16 & 0xFFFF628) >> 14) - class453.field7018;
                        int var18 = (var16 & 0x3FFF) - class126.field1718;
                        if (var17 >= 0 && class135.field1839 > var17 && var18 >= 0 && class197.field3038 > var18) {
                            class61.field952.method2124(new class330(var15), (byte) 107);
                        } else {
                            class210 var19 = class457.field7049.method662(class76.field1130.field3705[var15], true);
                            if (var19.field3253 != null && var19.field3234 + var17 >= 0 && (var17 + var19.field3244) < class135.field1839 && (var19.field3243 + var18) >= 0 && class197.field3038 > (var19.field3261 + var18)) {
                                class61.field952.method2124(new class330(var15), (byte) -46);
                            }
                        }
                    }
                }
                class457.field7049.method661(64, 128, 2);
                class483.field7346.field2342 = 2;
                class483.field7346.method1013(0);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLcr;)Lcr;")
    public abstract class122 method517(byte arg0, class122 arg1);

    // $FF: synthetic method
    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method654(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1400[var2] = (float) Math.sin((double) var2 * var0);
            field1398[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
