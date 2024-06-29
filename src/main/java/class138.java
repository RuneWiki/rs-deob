import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class138 {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Z")
    public boolean field2152 = false;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Z")
    public static boolean field2149 = false;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2150 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILe;I)V")
    public static final void method1006(int arg0, class312 arg1, int arg2) {
        class213.method1499(arg1);
        field2151++;
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class80.field1003; var3++) {
                for (int var4 = 0; var4 < class380.field5751; var4++) {
                    if ((class31.field382[1][var3][var4] & 0x2) == 2) {
                        class333.method2205(var3, var4);
                    }
                }
            }
        }
        if (arg2 > -109) {
            return;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            for (int var6 = 0; var6 <= class380.field5751; var6++) {
                for (int var7 = 0; var7 <= class80.field1003; var7++) {
                    if ((class369.field5616[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (class380.field5751 > var9 && (class369.field5616[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        while (var8 > 0 && (class369.field5616[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        label170: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class369.field5616[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label170;
                                }
                            }
                            var10--;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class369.field5616[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label159;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var9 + 1 - var8) * (var11 + 1 - var10);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class281.field4509[var11][var7][var8] - var15;
                            int var17 = class281.field4509[var10][var7][var8];
                            class160.method1116(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class369.field5616[var18][var7][var19] = (byte) class37.method242(class369.field5616[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class369.field5616[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (var20 > 0 && (class369.field5616[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        while (class80.field1003 > var21 && (class369.field5616[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        label223: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class369.field5616[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label223;
                                }
                            }
                            var22--;
                        }
                        label212: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class369.field5616[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label212;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var21 + 1 - var20) * (var23 + 1 - var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class281.field4509[var23][var20][var6] - var27;
                            int var29 = class281.field4509[var22][var20][var6];
                            class160.method1116(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class369.field5616[var30][var31][var6] = (byte) class37.method242(class369.field5616[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class369.field5616[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; var34 > 0 && (class369.field5616[var5][var7][var34 - 1] & 0x4) != 0; var34--) {
                        }
                        int var35;
                        for (var35 = var6; class380.field5751 > var35 && (class369.field5616[var5][var7][var35 + 1] & 0x4) != 0; var35++) {
                        }
                        label276: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class369.field5616[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label276;
                                }
                            }
                            var32--;
                        }
                        label265: while (class80.field1003 > var33) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class369.field5616[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label265;
                                }
                            }
                            var33++;
                        }
                        if (((var35 + 1 - var34) * (var33 + 1 - var32)) >= 4) {
                            int var38 = class281.field4509[var5][var32][var34];
                            class160.method1116(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class369.field5616[var5][var39][var40] = (byte) class37.method242(class369.field5616[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjg;I)V")
    private final void method1007(int arg0, int arg1, class186 arg2, int arg3) {
        if (arg0 == 1) {
            this.field2158 = arg2.method1272((byte) -107);
        } else if (arg0 == 2) {
            this.field2153 = arg2.method1275(~arg3);
        } else if (arg0 == 3) {
            this.field2152 = true;
        } else if (arg0 == 4) {
            this.field2158 = -1;
        }
        if (arg3 == 0) {
            field2147++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIBLe;)Lgl;")
    public final class356 method1008(boolean arg0, int arg1, byte arg2, class312 arg3) {
        field2154++;
        long var5 = (long) ((arg0 ? 262144 : 0) | this.field2158 | arg1 << 16 | arg3.field4911 << 19);
        class356 var7 = (class356) class102.field1417.method331((byte) 69, var5);
        if (var7 != null) {
            return var7;
        } else if (!class199.field3201.method2762(1, this.field2158)) {
            return null;
        } else if (arg2 > -34) {
            return null;
        } else {
            class100 var8 = class100.method756(class199.field3201, this.field2158, 0);
            if (var8 != null) {
                var8.field1397 = var8.field1398 = var8.field1403 = var8.field1402 = 0;
                if (arg0) {
                    var8.method757();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method748();
                }
            }
            class356 var10 = arg3.method641(var8, true);
            if (var10 != null) {
                class102.field1417.method341(123, var5, var10);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lkk;IIIII)V")
    public static final void method1009(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1422 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field1416[var6] != null) {
                arg0.field1422++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field1422; var7++) {
            int var8 = class411.field6089[arg1][arg2][arg3];
            while (var8 != 0) {
                class369 var12 = class27.field317[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field1416[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class411.field6089[arg1][arg4][arg5];
            while (var9 != 0) {
                class369 var11 = class27.field317[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field1416[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field1422 - 1; var10++) {
                arg0.field1416[var10] = arg0.field1416[var10 + 1];
            }
            arg0.field1422--;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1010(byte arg0) {
        if (arg0 != -69) {
            field2149 = false;
        }
        field2150 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjg;I)V")
    public final void method1011(int arg0, class186 arg1, int arg2) {
        field2157++;
        if (arg0 != -1) {
            field2156 = -19;
        }
        while (true) {
            int var4 = arg1.method1322(false);
            if (var4 == 0) {
                return;
            }
            this.method1007(var4, arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
    public final boolean method1012(int arg0) {
        if (arg0 != 15493) {
            this.field2158 = -118;
        }
        field2146++;
        return class199.field3201.method2762(1, this.field2158);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
    public static final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2148++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg4 * arg4;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class256.method1769(arg2 + arg4, class277.field4414[arg3], (byte) 45, arg1, arg2 - arg4);
        int var20 = (arg0 + arg5) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class256.method1769(var23, class277.field4414[var21], (byte) 125, arg1, var24);
            class256.method1769(var23, class277.field4414[var22], (byte) 88, arg1, var24);
        }
    }
}
