import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class86 extends class172 {

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Z")
    public boolean field1228;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "[Lck;")
    public class86[] field1233;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "Z")
    public static boolean field1241 = true;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field1230 = 0;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1237 = "flash2:";

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "Ltc;")
    public class260 field1225;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lrf;")
    public class276 field1227;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1223++;
        int var8 = class268.method1965(arg5, class284.field4385, class328.field5042, -66);
        int var9 = class268.method1965(arg2, class284.field4385, class328.field5042, -93);
        int var10 = class268.method1965(arg3, class128.field2130, class43.field693, -56);
        int var11 = class268.method1965(arg7, class128.field2130, class43.field693, -77);
        int var12 = class268.method1965(arg5 + arg6, class284.field4385, class328.field5042, -127);
        int var13 = 82 % ((7 - arg1) / 62);
        int var14 = class268.method1965(arg2 - arg6, class284.field4385, class328.field5042, -57);
        for (int var15 = var8; var15 < var12; var15++) {
            class283.method2059(arg4, class133.field2235[var15], (byte) 97, var11, var10);
        }
        for (int var16 = var9; var16 > var14; var16--) {
            class283.method2059(arg4, class133.field2235[var16], (byte) 95, var11, var10);
        }
        int var17 = class268.method1965(arg3 + arg6, class128.field2130, class43.field693, -72);
        int var18 = class268.method1965(arg7 - arg6, class128.field2130, class43.field693, -109);
        for (int var19 = var12; var19 <= var14; var19++) {
            int[] var20 = class133.field2235[var19];
            class283.method2059(arg4, var20, (byte) 112, var17, var10);
            class283.method2059(arg0, var20, (byte) 98, var18, var17);
            class283.method2059(arg4, var20, (byte) 109, var11, var18);
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V", line = 60)
    public void method476(int arg0) {
        field1244++;
        if (arg0 != 0) {
            this.field1225 = (class260) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 73)
    public static void method773(byte arg0) {
        field1237 = null;
        int var1 = 87 / ((arg0 + 55) / 46);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)[I", line = 85)
    public final int[] method774(int arg0, int arg1, int arg2) {
        field1231++;
        if (arg0 != 0) {
            this.field1225 = (class260) null;
        }
        return this.field1233[arg2].field1228 ? this.field1233[arg2].method158(arg1, 70) : this.field1233[arg2].method156(arg1, (byte) -128)[0];
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)[[I", line = 107)
    public int[][] method156(int arg0, byte arg1) {
        field1243++;
        if (arg1 >= -126) {
            method783((class290[]) null, -98, (int[][][]) ((int[][][]) null), false);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BILrg;I)V", line = 121)
    public static final void method775(byte arg0, int arg1, class342 arg2, int arg3) {
        if (arg2.field5333 == 1) {
            class230.field3599++;
            class268.method1963((short) 40, "", arg2.field5433, -1, arg2.field5400, 0L, -25900, 0);
        }
        if (arg2.field5333 == 2 && !class210.field3237) {
            String var4 = class211.method1559(arg2, (byte) -101);
            if (var4 != null) {
                class294.field4565++;
                class268.method1963((short) 20, "<col=00ff00>" + arg2.field5444, arg2.field5433, -1, var4, 0L, -25900, -1);
            }
        }
        field1234++;
        if (arg0 >= -102) {
            return;
        }
        if (arg2.field5333 == 3) {
            class268.method1963((short) 11, "", arg2.field5433, -1, class120.field1871, 0L, -25900, 0);
            class151.field2464++;
        }
        if (arg2.field5333 == 4) {
            class102.field1538++;
            class268.method1963((short) 42, "", arg2.field5433, -1, arg2.field5400, 0L, -25900, 0);
        }
        if (arg2.field5333 == 5) {
            class268.method1963((short) 36, "", arg2.field5433, -1, arg2.field5400, 0L, -25900, 0);
            class34.field524++;
        }
        if (arg2.field5333 == 6 && class356.field5672 == null) {
            class288.field4490++;
            class268.method1963((short) 58, "", arg2.field5433, -1, arg2.field5400, 0L, -25900, -1);
        }
        if (arg2.field5279 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field5413; var6++) {
                for (int var7 = 0; var7 < arg2.field5355; var7++) {
                    int var8 = (arg2.field5370 + 32) * var6;
                    int var9 = (arg2.field5286 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg2.field5319[var5];
                        var8 += arg2.field5322[var5];
                    }
                    if (var9 <= arg1 && arg3 >= var8 && var9 + 32 > arg1 && var8 + 32 > arg3) {
                        class99.field1496 = arg2;
                        class206.field3176 = var5;
                        if (arg2.field5280[var5] > 0) {
                            class227 var10 = client.method1022(arg2);
                            class263 var11 = class48.method469(10, arg2.field5280[var5] - 1);
                            if (class78.field1136 == 1 && var10.method1703((byte) 80)) {
                                if (class45.field719 != arg2.field5433 || class33.field506 != var5) {
                                    class268.method1963((short) 26, class352.field5626 + " -> <col=ff9040>" + var11.field4058, arg2.field5433, -1, class143.field2350, (long) var11.field4075, -25900, var5);
                                    class135.field2256++;
                                }
                            } else if (class210.field3237 && var10.method1703((byte) 80)) {
                                class140 var12 = class285.field4432 == -1 ? null : class29.method331(class285.field4432, (byte) 3);
                                if ((class209.field3214 & 0x10) != 0 && (var12 == null || var11.method1932(0, var12.field2334, class285.field4432) != var12.field2334)) {
                                    class300.field4648++;
                                    class268.method1963((short) 19, class83.field1203 + " -> <col=ff9040>" + var11.field4058, arg2.field5433, class281.field4355, class202.field3130, (long) var11.field4075, -25900, var5);
                                }
                            } else {
                                class114.field1758++;
                                String[] var13 = var11.field4066;
                                if (class158.field2533) {
                                    var13 = class15.method165(var13, 15000);
                                }
                                if (var10.method1703((byte) 80)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 15;
                                            } else {
                                                var15 = 51;
                                            }
                                            class201.field3106++;
                                            class268.method1963(var15, "<col=ff9040>" + var11.field4058, arg2.field5433, -1, var13[var14], (long) var11.field4075, -25900, var5);
                                        }
                                    }
                                }
                                if (var10.method1692(-82)) {
                                    class268.method1963((short) 16, "<col=ff9040>" + var11.field4058, arg2.field5433, class221.field3440, class143.field2350, (long) var11.field4075, -25900, var5);
                                    class62.field956++;
                                }
                                if (var10.method1703((byte) 80) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class123.field1974++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 21;
                                            }
                                            if (var16 == 1) {
                                                var17 = 47;
                                            }
                                            if (var16 == 2) {
                                                var17 = 12;
                                            }
                                            class268.method1963(var17, "<col=ff9040>" + var11.field4058, arg2.field5433, -1, var13[var16], (long) var11.field4075, -25900, var5);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field5385;
                                if (class158.field2533) {
                                    var18 = class15.method165(var18, 15000);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class83.field1201++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 43;
                                            }
                                            if (var19 == 1) {
                                                var20 = 3;
                                            }
                                            if (var19 == 2) {
                                                var20 = 24;
                                            }
                                            if (var19 == 3) {
                                                var20 = 9;
                                            }
                                            if (var19 == 4) {
                                                var20 = 7;
                                            }
                                            class268.method1963(var20, "<col=ff9040>" + var11.field4058, arg2.field5433, -1, var18[var19], (long) var11.field4075, -25900, var5);
                                        }
                                    }
                                }
                                class268.method1963((short) 1009, "<col=ff9040>" + var11.field4058, arg2.field5433, class329.field5057, class171.field2729, (long) var11.field4075, -25900, var5);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field5340) {
            return;
        }
        if (!class210.field3237) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class113.method975(23192, var21, arg2);
                if (var22 != null) {
                    class268.method1963((short) 1007, arg2.field5392, arg2.field5433, class199.method1500((byte) 108, var21, arg2), var22, (long) (var21 + 1), -25900, arg2.field5380);
                    class193.field3036++;
                }
            }
            String var23 = class211.method1559(arg2, (byte) -101);
            if (var23 != null) {
                class294.field4565++;
                class268.method1963((short) 20, arg2.field5392, arg2.field5433, -1, var23, 0L, -25900, arg2.field5380);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class113.method975(23192, var24, arg2);
                if (var25 != null) {
                    class193.field3036++;
                    class268.method1963((short) 2, arg2.field5392, arg2.field5433, class199.method1500((byte) 109, var24, arg2), var25, (long) (var24 + 1), -25900, arg2.field5380);
                }
            }
            if (client.method1022(arg2).method1700(false)) {
                class288.field4490++;
                if (arg2.field5297 == null) {
                    class268.method1963((short) 58, "", arg2.field5433, -1, class174.field2762, 0L, -25900, arg2.field5380);
                } else {
                    class268.method1963((short) 58, "", arg2.field5433, -1, arg2.field5297, 0L, -25900, arg2.field5380);
                }
            }
        } else if (client.method1022(arg2).method1694(1) && (class209.field3214 & 0x20) != 0) {
            class268.method1963((short) 57, class83.field1203 + " -> " + arg2.field5392, arg2.field5433, class281.field4355, class202.field3130, 0L, -25900, arg2.field5380);
            class22.field338++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)I", line = 440)
    public int method776(int arg0) {
        field1236++;
        return arg0 == -1 ? -1 : -5;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZLug;)V", line = 455)
    public void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg1) {
            this.field1225 = (class260) null;
        }
        field1239++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILrg;)Lrg;", line = 466)
    public static final class342 method777(int arg0, class342 arg1) {
        field1238++;
        if (arg0 != -25984) {
            field1230 = 25;
        }
        class342 var2 = client.method1038(arg1);
        if (var2 == null) {
            var2 = arg1.field5396;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)I", line = 484)
    public int method778(int arg0) {
        field1226++;
        if (arg0 < 78) {
            this.field1227 = (class276) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[I", line = 495)
    public int[] method158(int arg0, int arg1) {
        if (arg1 <= 7) {
            method775((byte) 6, -37, (class342) null, 22);
        }
        field1240++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 506)
    public void method779(boolean arg0) {
        if (this.field1228) {
            this.field1225.method1916((byte) 124);
            this.field1225 = null;
        } else {
            this.field1227.method2029(-127);
            this.field1227 = null;
        }
        if (arg0) {
            field1229++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)I", line = 535)
    public static final int method780(int arg0, int arg1) {
        field1232++;
        if (arg1 != -13800) {
            field1237 = (String) null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)V", line = 550)
    public final void method781(int arg0, int arg1, int arg2) {
        field1235++;
        int var4 = this.field1245 == 255 ? arg0 : this.field1245;
        if (this.field1228) {
            this.field1225 = new class260(var4, arg0, arg1);
        } else {
            this.field1227 = new class276(var4, arg0, arg1);
        }
        if (arg2 != 9) {
            this.field1227 = (class276) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(III)[[I", line = 574)
    public final int[][] method782(int arg0, int arg1, int arg2) {
        field1224++;
        if (arg2 != 1) {
            this.field1228 = true;
        }
        if (this.field1233[arg1].field1228) {
            int[] var4 = this.field1233[arg1].method158(arg0, 110);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1233[arg1].method156(arg0, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([Lrk;I[[[IZ)V", line = 613)
    public static final void method783(class290[] arg0, int arg1, int[][][] arg2, boolean arg3) {
        field1242++;
        byte var4;
        if (arg3) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg3) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class146.field2386[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class146.field2386[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method2107(true, var7, var6);
                            }
                        }
                    }
                }
            }
            class261.field3999 += (int) (Math.random() * 5.0D) - 2;
            if (class261.field3999 < -16) {
                class261.field3999 = -16;
            }
            class221.field3437 += (int) (Math.random() * 5.0D) - 2;
            if (class221.field3437 < -8) {
                class221.field3437 = -8;
            }
            if (class221.field3437 > 8) {
                class221.field3437 = 8;
            }
            if (class261.field3999 > 16) {
                class261.field3999 = 16;
            }
        }
        if (arg1 >= -75) {
            field1241 = true;
        }
        int var9 = class221.field3437 >> 2 << 10;
        int var10 = class261.field3999 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class235.field3658[var13];
            if (!class240.field3737) {
                int var35 = (int) Math.sqrt(5100.0D);
                int var36 = var35 * 768 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        int var39 = class277.field4290[var13][var38 + 1][var37] - class277.field4290[var13][var38 - 1][var37];
                        byte var40 = 74;
                        int var41 = class277.field4290[var13][var38][var37 + 1] - class277.field4290[var13][var38][var37 - 1];
                        int var42 = (int) Math.sqrt((double) (var41 * var41 + var39 * var39 + 65536));
                        int var43 = (var39 << 8) / var42;
                        int var44 = -65536 / var42;
                        int var45 = (var41 << 8) / var42;
                        int var46 = (var43 * -50 + var44 * -10 + var45 * -50) / var36 + var40;
                        int var47 = (var14[var38][var37] >> 1) + (var14[var38 - 1][var37] >> 2) + (var14[var38][var37 - 1] >> 2) + (var14[var38 - -1][var37] >> 3) + (var14[var38][var37 + 1] >> 3);
                        var11[var38][var37] = var46 - var47;
                    }
                }
            } else if (class59.field927) {
                for (int var31 = 1; var31 < 103; var31++) {
                    for (int var32 = 1; var32 < 103; var32++) {
                        int var33 = (var14[var32][var31 + 1] >> 3) + (var14[var32 - 1][var31] >> 2) - (-(var14[var32][var31 + -1] >> 2) + -(var14[var32][var31] >> 1) + -(var14[var32 + 1][var31] >> 3));
                        byte var34 = 74;
                        var11[var32][var31] = var34 - var33;
                    }
                }
            } else {
                int var15 = (int) class103.field1549[0];
                int var16 = (int) class103.field1549[1];
                int var17 = (int) class103.field1549[2];
                int var18 = (int) Math.sqrt((double) (var17 * var17 + (var15 * var15 + (var16 * var16))));
                int var19 = var18 * 1024 >> 8;
                for (int var20 = 1; var20 < 103; var20++) {
                    for (int var21 = 1; var21 < 103; var21++) {
                        byte var22 = 96;
                        int var23 = class277.field4290[var13][var21 + 1][var20] - class277.field4290[var13][var21 - 1][var20];
                        int var24 = class277.field4290[var13][var21][var20 + 1] - class277.field4290[var13][var21][var20 - 1];
                        int var25 = (int) Math.sqrt((double) (var23 * var23 + var24 * var24 + 65536));
                        int var26 = -65536 / var25;
                        int var27 = (var24 << 8) / var25;
                        int var28 = (var14[var21][var20 + 1] >> 3) + (var14[var21 - 1][var20] >> 2) + (var14[var21][var20 + -1] >> 2) + (var14[var21 + 1][var20] >> 3) + (var14[var21][var20] >> 1);
                        int var29 = (var23 << 8) / var25;
                        int var30 = (var17 * var27 + (var15 * var29 + (var16 * var26))) / var19 + var22;
                        var11[var21][var20] = var30 - (int) ((float) var28 * 1.7F);
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class174.field2760[var48] = 0;
                class14.field235[var48] = 0;
                class317.field4889[var48] = 0;
                class66.field1002[var48] = 0;
                class297.field4608[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class197.field3082[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class203 var53 = class155.method1270((byte) -119, var52 - 1);
                            class174.field2760[var50] += var53.field3136;
                            class14.field235[var50] += var53.field3135;
                            class317.field4889[var50] += var53.field3142;
                            class66.field1002[var50] += var53.field3134;
                            var10002 = class297.field4608[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class197.field3082[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class203 var56 = class155.method1270((byte) -124, var55 - 1);
                            class174.field2760[var50] -= var56.field3136;
                            class14.field235[var50] -= var56.field3135;
                            class317.field4889[var50] -= var56.field3142;
                            class66.field1002[var50] -= var56.field3134;
                            var10002 = class297.field4608[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 + 5;
                        int var64 = var62 - 5;
                        if (var63 < 104) {
                            var58 += class14.field235[var63];
                            var57 += class317.field4889[var63];
                            var61 += class66.field1002[var63];
                            var60 += class297.field4608[var63];
                            var59 += class174.field2760[var63];
                        }
                        if (var64 >= 0) {
                            var60 -= class297.field4608[var64];
                            var57 -= class317.field4889[var64];
                            var58 -= class14.field235[var64];
                            var61 -= class66.field1002[var64];
                            var59 -= class174.field2760[var64];
                        }
                        if (var62 >= 0 && var60 > 0) {
                            var12[var49][var62] = class185.method1428(var57 / var60, var58 / var60, var59 * 256 / var61, (byte) -62);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label763: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg3 || class158.method1282(false) || (class146.field2386[0][var65][var66] & 0x2) != 0 || (class146.field2386[var13][var65][var66] & 0x10) == 0 && class48.method465(var13, -25542, var66, var65) == class68.field1046) {
                        if (class176.field2782 > var13) {
                            class176.field2782 = var13;
                        }
                        int var67 = class19.field314[var13][var65][var66] & 0xFF;
                        int var68 = class197.field3082[var13][var65][var66] & 0xFF;
                        if (var68 > 0 || var67 > 0) {
                            int var69 = class277.field4290[var13][var65][var66];
                            int var70 = class277.field4290[var13][var65 + 1][var66 + 1];
                            int var71 = class277.field4290[var13][var65 + 1][var66];
                            int var72 = class277.field4290[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var68 == 0 && class239.field3722[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var67 > 0 && !class91.method810(var67 - 1, (byte) -106).field3032) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var71 && var69 == var70 && var69 == var72) {
                                    class190.field2979[var13][var65][var66] = class41.method426(class190.field2979[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var77;
                            if (var68 > 0) {
                                var74 = var12[var65][var66];
                                int var75 = (var74 & 0x7F) + var10;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var9 + var74 & 0xFC00) + (var74 & 0x380) + var75;
                                var77 = class107.field1603[class50.method483(96, var76, -128)];
                            } else {
                                var77 = 0;
                                var74 = -1;
                            }
                            int var78 = var11[var65][var66];
                            int var79 = var11[var65 + 1][var66 + 1];
                            int var80 = var11[var65 + 1][var66];
                            int var81 = var11[var65][var66 + 1];
                            if (var67 == 0) {
                                class160.method1287(var13, var65, var66, 0, 0, -1, var69, var71, var70, var72, class50.method483(var78, var74, -127), class50.method483(var80, var74, -109), class50.method483(var79, var74, -121), class50.method483(var81, var74, -109), 0, 0, 0, 0, var77, 0);
                                if (class240.field3737 && var13 > 0 && var74 != -1 && class155.method1270((byte) -97, var68 - 1).field3131) {
                                    class127.method1099(0, 0, true, false, var65, var66, var69 - class277.field4290[0][var65][var66], -class277.field4290[0][var65 + 1][var66] + var71, var70 - class277.field4290[0][var65 + 1][var66 + 1], var72 - class277.field4290[0][var65][var66 + 1]);
                                }
                                if (class240.field3737 && !arg3 && class332.field5096 != null && var13 == 0) {
                                    for (int var97 = var65 - 1; var97 <= (var65 + 1); var97++) {
                                        for (int var98 = var66 - 1; var98 <= (var66 + 1); var98++) {
                                            if ((var65 != var97 || var66 != var98) && var97 >= 0 && var97 < 104 && var98 >= 0 && var98 < 104) {
                                                int var99 = class19.field314[var13][var97][var98] & 0xFF;
                                                if (var99 != 0) {
                                                    class192 var100 = class91.method810(var99 - 1, (byte) 85);
                                                    if (var100.field3024 != -1 && class231.method1730(-107, class107.field1619.method755(false, var100.field3024))) {
                                                        class332.field5096[var65][var66] = (var100.field3025 << 24) + var100.field3026;
                                                        continue label763;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var82 = class239.field3722[var13][var65][var66] + 1;
                                byte var83 = class337.field5188[var13][var65][var66];
                                class192 var84 = class91.method810(var67 - 1, (byte) 110);
                                if (class240.field3737 && !arg3 && class332.field5096 != null && var13 == 0) {
                                    if (var84.field3024 != -1 && class231.method1730(-95, class107.field1619.method755(false, var84.field3024))) {
                                        class332.field5096[var65][var66] = (var84.field3025 << 24) + var84.field3026;
                                    } else {
                                        label729: for (int var85 = var65 - 1; var85 <= var65 + 1; var85++) {
                                            for (int var86 = var66 - 1; var86 <= (var66 + 1); var86++) {
                                                if ((var65 != var85 || var66 != var86) && var85 >= 0 && var85 < 104 && var86 >= 0 && var86 < 104) {
                                                    int var87 = class19.field314[var13][var85][var86] & 0xFF;
                                                    if (var87 != 0) {
                                                        class192 var88 = class91.method810(var87 - 1, (byte) 123);
                                                        if (var88.field3024 != -1 && class231.method1730(-96, class107.field1619.method755(false, var88.field3024))) {
                                                            class332.field5096[var65][var66] = (var88.field3025 << 24) + var88.field3026;
                                                            break label729;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var89 = var84.field3024;
                                if (var89 >= 0 && !class107.field1619.method763(var89, (byte) -116)) {
                                    var89 = -1;
                                }
                                int var90;
                                int var91;
                                if (var89 >= 0) {
                                    var90 = class107.field1603[class104.method908((byte) 78, class107.field1619.method760(var89, 1), 96)];
                                    var91 = -1;
                                } else if (var84.field3019 == -1) {
                                    var91 = -2;
                                    var90 = 0;
                                } else {
                                    var91 = var84.field3019;
                                    int var92 = (var91 & 0x7F) + var10;
                                    if (var92 < 0) {
                                        var92 = 0;
                                    } else if (var92 > 127) {
                                        var92 = 127;
                                    }
                                    int var93 = (var91 & 0x380) + (var91 + var9 & 0xFC00) + var92;
                                    var90 = class107.field1603[class104.method908((byte) 80, var93, 96)];
                                }
                                if (var84.field3018 >= 0) {
                                    int var94 = var84.field3018;
                                    int var95 = (var94 & 0x7F) + var10;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var9 + var94 & 0xFC00) + (var94 & 0x380) + var95;
                                    var90 = class107.field1603[class104.method908((byte) 24, var96, 96)];
                                }
                                class160.method1287(var13, var65, var66, var82, var83, var89, var69, var71, var70, var72, class50.method483(var78, var74, -106), class50.method483(var80, var74, -120), class50.method483(var79, var74, -109), class50.method483(var81, var74, -106), class104.method908((byte) 84, var91, var78), class104.method908((byte) 82, var91, var80), class104.method908((byte) 89, var91, var79), class104.method908((byte) 101, var91, var81), var77, var90);
                                if (class240.field3737 && var13 > 0) {
                                    class127.method1099(var82, var83, var91 == -2 || !var84.field3016, var74 == -1 || !class155.method1270((byte) -85, var68 - 1).field3131, var65, var66, var69 - class277.field4290[0][var65][var66], -class277.field4290[0][var65 - -1][var66] + var71, var70 - class277.field4290[0][var65 + 1][var66 + 1], var72 - class277.field4290[0][var65][var66 - -1]);
                                }
                            }
                        }
                    }
                }
            }
            if (class240.field3737) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class277.field4290[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg3) {
                            class125[] var115 = class165.method1315(var102, class332.field5096, class19.field314[var13], arg2, var12, class337.field5188[var13], var101, var103, class277.field4290[var13], var13, class146.field2386, class239.field3722[var13], class121.field1924[0], class197.field3082[var13], var11, 0);
                            class270.method1982(var13, var115);
                            break;
                        }
                        class125[] var110 = class165.method1315(var102, (int[][]) null, class19.field314[var13], arg2, var12, class337.field5188[var13], var101, var103, class277.field4290[var13], var13, class146.field2386, class239.field3722[var13], (int[][]) null, class197.field3082[var13], var11, 0);
                        class125[] var111 = class230.method1728(var101, var103, var13, class277.field4290[var13], var102, class197.field3082[var13], class239.field3722[var13], class19.field314[var13], var11, class337.field5188[var13], class146.field2386, (byte) 120);
                        class125[] var112 = new class125[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class270.method1982(var13, var112);
                        class244.method1841(var102, var101, class299.field4636, var103, var13, class277.field4290[var13], class337.field5188[var13], -122, class19.field314[var13], class197.field3082[var13], class299.field4639, class239.field3722[var13]);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        int var108 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + var108 * var108 + 65536));
                        var102[var106][var105] = (float) var107 / var109;
                        var101[var106][var105] = -256.0F / var109;
                        var103[var106][var105] = (float) var108 / var109;
                    }
                    var105++;
                }
            }
            class197.field3082[var13] = (byte[][]) null;
            class19.field314[var13] = (byte[][]) null;
            class239.field3722[var13] = (byte[][]) null;
            class337.field5188[var13] = (byte[][]) null;
            class235.field3658[var13] = (byte[][]) null;
        }
        class134.method1139(-50, -10, -50);
        if (arg3) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class146.field2386[1][var116][var117] & 0x2) == 2) {
                    class146.method1219(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class190.field2979[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 < 104 && (class190.field2979[var118][var120][var121 + 1] & 0x1) != 0; var121++) {
                        }
                        int var122 = var119;
                        int var123 = var118;
                        while (var122 > 0 && (class190.field2979[var118][var120][var122 - 1] & 0x1) != 0) {
                            var122--;
                        }
                        label447: while (var123 > 0) {
                            for (int var124 = var122; var124 <= var121; var124++) {
                                if ((class190.field2979[var123 - 1][var120][var124] & 0x1) == 0) {
                                    break label447;
                                }
                            }
                            var123--;
                        }
                        int var125;
                        label435: for (var125 = var118; var125 < 3; var125++) {
                            for (int var126 = var122; var126 <= var121; var126++) {
                                if ((class190.field2979[var125 + 1][var120][var126] & 0x1) == 0) {
                                    break label435;
                                }
                            }
                        }
                        int var127 = (var121 + 1 - var122) * (var125 + 1 - var123);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class277.field4290[var125][var120][var122] - var128;
                            int var130 = class277.field4290[var123][var120][var122];
                            class149.method1241(1, var120 * 128, var120 * 128, var122 * 128, var121 * 128 + 128, var129, var130);
                            for (int var131 = var123; var131 <= var125; var131++) {
                                for (int var132 = var122; var132 <= var121; var132++) {
                                    class190.field2979[var131][var120][var132] = class301.method2169(class190.field2979[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class190.field2979[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134 = var120;
                        int var135 = var118;
                        while (var134 < 104 && (class190.field2979[var118][var134 + 1][var119] & 0x2) != 0) {
                            var134++;
                        }
                        while (var133 > 0 && (class190.field2979[var118][var133 - 1][var119] & 0x2) != 0) {
                            var133--;
                        }
                        label502: while (var135 > 0) {
                            for (int var136 = var133; var136 <= var134; var136++) {
                                if ((class190.field2979[var135 - 1][var136][var119] & 0x2) == 0) {
                                    break label502;
                                }
                            }
                            var135--;
                        }
                        int var137;
                        label490: for (var137 = var118; var137 < 3; var137++) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class190.field2979[var137 + 1][var138][var119] & 0x2) == 0) {
                                    break label490;
                                }
                            }
                        }
                        int var139 = (var137 + 1 - var135) * (var134 + 1 - var133);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class277.field4290[var137][var133][var119] - var140;
                            int var142 = class277.field4290[var135][var133][var119];
                            class149.method1241(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var135; var143 <= var137; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class190.field2979[var143][var144][var119] = class301.method2169(class190.field2979[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class190.field2979[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147 = var119;
                        int var148;
                        for (var148 = var119; var148 < 104 && (class190.field2979[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        while (var147 > 0 && (class190.field2979[var118][var120][var147 - 1] & 0x4) != 0) {
                            var147--;
                        }
                        label555: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class190.field2979[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label555;
                                }
                            }
                            var145--;
                        }
                        label544: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class190.field2979[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label544;
                                }
                            }
                            var146++;
                        }
                        if ((var146 + 1 - var145) * (var148 + 1 - var147) >= 4) {
                            int var151 = class277.field4290[var118][var145][var147];
                            class149.method1241(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class190.field2979[var118][var152][var153] = class301.method2169(class190.field2979[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IZ)V", line = 1591)
    public class86(int arg0, boolean arg1) {
        this.field1228 = arg1;
        this.field1233 = new class86[arg0];
    }
}
