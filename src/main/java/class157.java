import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class157 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public int field2423 = 4;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    private int field2426 = 0;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    private int field2430 = 4;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[S")
    private short[] field2440 = new short[512];

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    private int field2429 = 4;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    private int field2444 = 4;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
    public static int[] field2432 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field2436 = -1;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field2443 = 0;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Z")
    public static boolean field2427;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[S")
    private short[] field2425;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 6)
    private final void method1134(int arg0) {
        this.field2425 = new short[this.field2423];
        if (arg0 < 11) {
            field2443 = 32;
        }
        for (int var2 = 0; var2 < this.field2423; var2++) {
            this.field2425[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        field2428++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILvl;)V", line = 29)
    public static final void method1136(int arg0, class6 arg1) {
        field2434++;
        if (arg0 != 1) {
            method1139(34, (class337) null);
        }
        while (true) {
            while (arg1.field115.length > arg1.field111) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg1.method58(-288140008) == 1) {
                    var4 = true;
                    var2 = arg1.method58(arg0 - 288140009);
                    var3 = arg1.method58(arg0 ^ 0xEED35519);
                }
                int var5 = arg1.method58(-288140008);
                int var6 = arg1.method58(-288140008);
                int var7 = var5 * 64 - class60.field885;
                int var8 = class4.field42 + class340.field5301 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class251.field3959 > var7 + 63 && class340.field5301 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || var2 * 8 <= var11 && (var2 * 8 + 8) > var11 && var12 >= var3 * 8 && (var3 * 8 + 8) > var12) {
                                int var13 = arg1.method58(-288140008);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method58(arg0 ^ 0xEED35519);
                                        if (class231.field3609[var9][var10] == null) {
                                            class231.field3609[var9][var10] = new byte[4096];
                                        }
                                        class231.field3609[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method31(arg0 ^ 0xFFFFA699);
                                        if (class212.field3348[var9][var10] == null) {
                                            class212.field3348[var9][var10] = new int[4096];
                                        }
                                        class212.field3348[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg1.method31(-22888);
                                        if (class265.field4147[var9][var10] == null) {
                                            class265.field4147[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class121 var17 = class249.method1790(78, var16);
                                        if (var17.field1690 != null) {
                                            var17 = var17.method878((byte) 31);
                                            if (var17 == null || var17.field1699 == -1) {
                                                continue;
                                            }
                                        }
                                        class265.field4147[var9][var10][(63 - var12 << 6) + var11] = var17.field1705 + 1;
                                        class144 var18 = new class144();
                                        var18.field2274 = var17.field1699;
                                        var18.field2281 = var7;
                                        var18.field2280 = var8;
                                        class204.field3237.method19(var18, -1058);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var4 ? 64 : 4096); var19++) {
                        int var20 = arg1.method58(arg0 - 288140009);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field111++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field111 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field111 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIII)V", line = 677)
    public class157(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2426 = arg0;
        this.field2430 = arg4;
        this.field2444 = arg2;
        this.field2423 = arg1;
        this.field2429 = arg3;
        this.method1134(21);
        this.method1141(-256);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)I", line = 185)
    public static final int method1138(int arg0) {
        field2438++;
        if (arg0 != -29869) {
            field2427 = false;
        }
        return class238.field3732;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILql;)V", line = 197)
    public static final void method1139(int arg0, class337 arg1) {
        class166 var2 = (class166) class99.field1304.method2168(class83.method608(arg1.field5277, (byte) -67), (byte) -116);
        if (var2 != null) {
            if (var2.field2721 != null) {
                class86.field1174.method1313(var2.field2721);
                var2.field2721 = null;
            }
            var2.method2028(arg0 + 13321);
        }
        field2424++;
        if (arg0 != 8) {
            method1136(109, (class6) null);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V", line = 227)
    public final void method1140(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 28 / ((arg3 + 31) / 57);
        field2441++;
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg0; var8++) {
            var6[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var7[var9] = (var9 << 12) / arg2;
        }
        int[] var10 = new int[arg1];
        for (int var11 = 0; var11 < arg1; var11++) {
            var10[var11] = (var11 << 12) / arg1;
        }
        this.method1137((byte) -66);
        for (int var12 = 0; var12 < arg1; var12++) {
            for (int var13 = 0; var13 < arg2; var13++) {
                for (int var14 = 0; var14 < arg0; var14++) {
                    for (int var15 = 0; var15 < this.field2423; var15++) {
                        int var16 = this.field2425[var15] << 12;
                        int var17 = var10[var12] * var16 >> 12;
                        int var18 = var7[var13] * var16 >> 12;
                        int var19 = this.field2429 * var18;
                        int var20 = this.field2429 * var16 >> 12;
                        int var21 = this.field2444 * var16 >> 12;
                        int var22 = this.field2430 * var16 >> 12;
                        int var23 = this.field2430 * var17;
                        int var24 = var19 >> 12;
                        int var25 = var24 + 1;
                        int var26 = var19 & 0xFFF;
                        int var27 = var6[var14] * var16 >> 12;
                        int var28 = var26 - 4096;
                        int var29 = class243.field3791[var26];
                        int var30 = var23 >> 12;
                        int var31 = var30 + 1;
                        int var32 = var30 & 0xFF;
                        int var33;
                        if (var25 >= var20) {
                            var33 = 0;
                        } else {
                            var33 = var25 & 0xFF;
                        }
                        int var34;
                        if (var31 >= var22) {
                            var34 = 0;
                        } else {
                            var34 = var31 & 0xFF;
                        }
                        short var35 = this.field2440[var34];
                        short var36 = this.field2440[var33 + var35];
                        int var37 = this.field2444 * var27;
                        int var38 = var37 >> 12;
                        short var39 = this.field2440[var32];
                        int var40 = var38 + 1;
                        short var41 = this.field2440[var33 + var39];
                        int var42 = var37 & 0xFFF;
                        int var43 = var23 & 0xFFF;
                        int var44 = var42 - 4096;
                        int var45 = class243.field3791[var42];
                        int var46 = class243.field3791[var43];
                        int var47 = var24 & 0xFF;
                        int var48;
                        if (var40 >= var21) {
                            var48 = 0;
                        } else {
                            var48 = var40 & 0xFF;
                        }
                        int var49 = var38 & 0xFF;
                        int var50 = var43 - 4096;
                        short var51 = this.field2440[var35 + var47];
                        short var52 = this.field2440[var39 + var47];
                        int var53 = class150.method1097(var43, var26, this.field2440[var49 + var52], (byte) -128, var42);
                        int var54 = class150.method1097(var43, var26, this.field2440[var48 + var52], (byte) -128, var44);
                        int var55 = var53 + ((var54 - var53) * var45 >> 12);
                        int var56 = class150.method1097(var43, var28, this.field2440[var41 + var49], (byte) -128, var42);
                        int var57 = class150.method1097(var43, var28, this.field2440[var48 + var41], (byte) -128, var44);
                        int var58 = ((var57 - var56) * var45 >> 12) + var56;
                        int var59 = var55 + ((var58 - var55) * var29 >> 12);
                        int var60 = class150.method1097(var50, var26, this.field2440[var49 + var51], (byte) -128, var42);
                        int var61 = class150.method1097(var50, var26, this.field2440[var48 + var51], (byte) -128, var44);
                        int var62 = var60 + ((var61 - var60) * var45 >> 12);
                        int var63 = class150.method1097(var50, var28, this.field2440[var36 + var49], (byte) -128, var42);
                        int var64 = class150.method1097(var50, var28, this.field2440[var36 + var48], (byte) -128, var44);
                        int var65 = ((var64 - var63) * var45 >> 12) + var63;
                        int var66 = var62 + ((var65 - var62) * var29 >> 12);
                        this.method1143(-9140, var15, ((var66 - var59) * var46 >> 12) + var59);
                    }
                    this.method1135(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V", line = 392)
    private final void method1141(int arg0) {
        Random var2 = new Random((long) this.field2426);
        field2435++;
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2440[var3] = (short) var3;
        }
        if (arg0 != -256) {
            return;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class207.method1523(var5, arg0 + 149, var2);
            short var7 = this.field2440[var6];
            this.field2440[var6] = this.field2440[var5];
            this.field2440[var5] = this.field2440[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V", line = 430)
    public static final void method1142(int arg0) {
        for (int var1 = 0; var1 < class277.field4285; var1++) {
            int var2 = class36.field526[var1];
            class212 var3 = class59.field870[var2];
            int var4 = class111.field1544.method58(-288140008);
            if ((var4 & 0x40) != 0) {
                var4 += class111.field1544.method58(-288140008) << 8;
            }
            if ((var4 & 0x200) != 0) {
                var3.field4730 = class111.field1544.method39((byte) 97);
                var3.field4681 = class111.field1544.method89(123);
            }
            if ((var4 & 0x4) != 0) {
                var3.field4726 = class111.field1544.method72((byte) -66);
                if (var3.field4726 == 65535) {
                    var3.field4726 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var5 = class111.field1544.method42((byte) 15);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class111.field1544.method72((byte) -66);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var8[var9] = var10;
                    var6[var9] = class111.field1544.method38(115);
                    var7[var9] = class111.field1544.method72((byte) -66);
                }
                class260.method1871(var3, var6, (byte) 117, var7, var8);
            }
            if ((var4 & 0x20) != 0) {
                int var11 = class111.field1544.method42((byte) 90);
                int var12 = class111.field1544.method58(-288140008);
                var3.method2093(class229.field3595, var12, var11, -105);
            }
            if ((var4 & 0x1) != 0) {
                int var13 = class111.field1544.method72((byte) -66);
                int var14 = class111.field1544.method38(76);
                if (var13 == 65535) {
                    var13 = -1;
                }
                class134.method980(var14, false, var13, var3);
            }
            if ((var4 & 0x10) != 0) {
                int var15 = class111.field1544.method85(1);
                int var16 = class111.field1544.method42((byte) 53);
                var3.method2093(class229.field3595, var16, var15, -114);
                var3.field4734 = class229.field3595 + 300;
                var3.field4721 = class111.field1544.method38(118);
            }
            if ((var4 & 0x80) != 0) {
                int var17 = class111.field1544.method39((byte) 49);
                if (var17 == 65535) {
                    var17 = -1;
                }
                int var18 = class111.field1544.method73((byte) 19);
                boolean var19 = true;
                if (var17 != -1 && var3.field4703 != -1 && class295.method2064(0, class9.method124(var17, 1431655765).field3647).field4338 < class295.method2064(0, class9.method124(var3.field4703, 1431655765).field3647).field4338) {
                    var19 = false;
                }
                if (var19) {
                    var3.field4685 = var18 >> 16;
                    var3.field4712 = 1;
                    var3.field4704 = 0;
                    var3.field4732 = (var18 & 0xFFFF) + class229.field3595;
                    var3.field4679 = 0;
                    var3.field4703 = var17;
                    if (var3.field4732 > class229.field3595) {
                        var3.field4679 = -1;
                    }
                    if (var3.field4703 != -1 && class229.field3595 == var3.field4732) {
                        int var20 = class9.method124(var3.field4703, 1431655765).field3647;
                        if (var20 != -1) {
                            class281 var21 = class295.method2064(0, var20);
                            if (var21 != null && var21.field4319 != null) {
                                class91.method658(var21, true, false, var3.field4698, 0, var3.field4731);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field4706 = class111.field1544.method40(false);
                var3.field4672 = 100;
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field3346.method1191(0)) {
                    class298.method2075(var3, 71);
                }
                var3.method1541(104, class41.method339(76, class111.field1544.method39((byte) 100)));
                var3.method2098(var3.field3346.field2555, (byte) 43);
                var3.field4684 = var3.field3346.field2604;
                var3.field4690 = var3.field3346.field2581;
                if (var3.field3346.method1191(0)) {
                    class58.method475(var3, (class337) null, 0, class154.field2392, var3.field4708[0], 128, var3.field4675[0], (class121) null);
                }
            }
        }
        field2442++;
        if (arg0 < 89) {
            method1138(-17);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)I", line = 634)
    public static final int method1144(byte arg0, int arg1, int arg2) {
        field2431++;
        int var3 = arg2 * 57 + arg1;
        if (arg0 == 72) {
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (var5 & 0x7FBD8BF) >> 19;
        } else {
            return 121;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V", line = 654)
    public static void method1145(byte arg0) {
        if (arg0 > -14) {
            field2427 = true;
        }
        field2432 = null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public abstract void method1135(int arg0);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public abstract void method1137(byte arg0);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public abstract void method1143(int arg0, int arg1, int arg2);
}
