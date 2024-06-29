import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class610 implements class673 {

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "Lvl;")
    private class340 field8743 = new class340(256);

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "Llga;")
    private class47 field8742;

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "Llga;")
    private class47 field8731;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    private int field8740;

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "[Lqf;")
    private class684[] field8734;

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8744 = new String[] { method4508(method4507("OE`3\u0002\t")), method4508(method4507("OUmq")), method4508(method4507("Z\u000e/3>")), method4508(method4507("OE`3\u007fHNhi}\t")), method4508(method4507("OE`3\u0007\t")), method4508(method4507("OE`3\u0006\t")), method4508(method4507("OE`3\u0005\t")), method4508(method4507("OE`3\u0001\t")), method4508(method4507("OE`3\n\t")), method4508(method4507("OE`3\u000b\t")), method4508(method4507("OE`3\u0000\t")), method4508(method4507("OE`3\u0004\t")) };

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "[I")
    public static int[] field8739 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!nea", name = "o", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "Lo;")
    public static class484 field8737;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
    public static final void method4498(int arg0) {
        try {
            field8732++;
            class476 var1 = class60.field916.field11099;
            for (int var2 = 0; var2 < class225.field3274; var2++) {
                int var3 = class90.field1258[var2];
                class717 var4 = ((class527) class479.field7063.method3693(false, (long) var3)).field7672;
                int var5 = var1.method5128(0);
                if ((var5 & 0x10) != 0) {
                    var5 += var1.method5128(0) << 8;
                }
                if ((var5 & 0x1000) != 0) {
                    var5 += var1.method5128(0) << 16;
                }
                if ((var5 & 0x200) != 0) {
                    int var6 = var1.method5116((byte) -119);
                    int var7 = var1.method5120((byte) 51);
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    int var8 = var1.method5128(0);
                    int var9 = var8 & 0x7;
                    int var10 = var8 >> 3 & 0xF;
                    if (var10 == 15) {
                        var10 = -1;
                    }
                    var4.method1433(1, false, var10, var7, (byte) -77, var6, var9);
                }
                if ((var5 & 0x100) != 0) {
                    var4.field2229 = var1.method5125((byte) 116);
                    var4.field2242 = var1.method5088(-16996);
                    var4.field2241 = var1.method5131((byte) 76);
                    var4.field2236 = (byte) var1.method5134(-18632);
                    var4.field2249 = class694.field9700 + var1.method5103((byte) 52);
                    var4.field2245 = class694.field9700 + var1.method5140((byte) -2);
                }
                if ((var5 & 0x1) != 0) {
                    if (var4.field10229.method1169((byte) -109)) {
                        class249.method2028(var4, -2997);
                    }
                    var4.method5200(class321.field4379.method600(-64, var1.method5116((byte) -107)), -1);
                    var4.method1445(var4.field10229.field1717, 4978);
                    var4.field2231 = var4.field10229.field1702 << 3;
                    if (var4.field10229.method1169((byte) -91)) {
                        class54.method568(null, var4.field2256[0], 0, var4.field2252[0], var4, null, var4.field2981, false);
                    }
                }
                if ((var5 & 0x80000) != 0) {
                    var4.field10214 = var1.method5146(-31933);
                    if (var4.field10214 == 65535) {
                        var4.field10214 = var4.field10229.field1665;
                    }
                }
                if ((var5 & 0x400) != 0) {
                    int var11 = var1.method5119(124);
                    int[] var12 = new int[var11];
                    int[] var13 = new int[var11];
                    int[] var14 = new int[var11];
                    for (int var15 = 0; var15 < var11; var15++) {
                        int var16 = var1.method5146(-31933);
                        if (var16 == 65535) {
                            var16 = -1;
                        }
                        var12[var15] = var16;
                        var13[var15] = var1.method5132((byte) 16);
                        var14[var15] = var1.method5146(-31933);
                    }
                    class669.method4814(11301, var12, var4, var13, var14);
                }
                if ((var5 & 0x40000) != 0) {
                    int var17 = var1.method5140((byte) -2);
                    int var18 = var1.method5149(18547);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    int var19 = var1.method5134(-18632);
                    int var20 = var19 & 0x7;
                    int var21 = var19 >> 3 & 0xF;
                    if (var21 == 15) {
                        var21 = -1;
                    }
                    var4.method1433(2, false, var21, var18, (byte) -101, var17, var20);
                }
                if ((var5 & 0x4000) != 0) {
                    int var22 = var1.method5103((byte) 99);
                    var4.field2202 = var1.method5119(85);
                    var4.field2185 = var1.method5132((byte) 16);
                    var4.field2220 = (var22 & 0x8000) != 0;
                    var4.field2225 = var22 & 0x7FFF;
                    var4.field2177 = class694.field9700 + var4.field2202 + var4.field2225;
                }
                if ((var5 & 0x2000) != 0) {
                    var4.field2233 = var1.method5131((byte) 78);
                    var4.field2244 = var1.method5125((byte) -34);
                    var4.field2240 = var1.method5125((byte) 126);
                    var4.field2247 = var1.method5131((byte) 113);
                    var4.field2237 = var1.method5103((byte) 119) + class694.field9700;
                    var4.field2246 = var1.method5103((byte) 108) + class694.field9700;
                    var4.field2238 = var1.method5134(-18632);
                    var4.field2240 += var4.field2252[0];
                    var4.field2233 += var4.field2252[0];
                    var4.field2247 += var4.field2256[0];
                    var4.field2244 += var4.field2256[0];
                    var4.field2257 = 1;
                    var4.field2258 = 0;
                }
                if ((var5 & 0x800) != 0) {
                    int var23 = var1.method5119(80);
                    int[] var24 = new int[var23];
                    int[] var25 = new int[var23];
                    for (int var26 = 0; var26 < var23; var26++) {
                        int var27 = var1.method5103((byte) 65);
                        if ((var27 & 0xC000) == 49152) {
                            int var28 = var1.method5146(-31933);
                            var24[var26] = class10.method71(var28, var27 << 16);
                        } else {
                            var24[var26] = var27;
                        }
                        var25[var26] = var1.method5116((byte) -111);
                    }
                    var4.method1435(var24, (byte) 49, var25);
                }
                if ((var5 & 0x40) != 0) {
                    int var29 = var1.method5103((byte) 74);
                    if (var29 == 65535) {
                        var29 = -1;
                    }
                    int var30 = var1.method5130(false);
                    int var31 = var1.method5128(0);
                    int var32 = var31 & 0x7;
                    int var33 = (var31 & 0x7B) >> 3;
                    if (var33 == 15) {
                        var33 = -1;
                    }
                    var4.method1433(0, false, var33, var30, (byte) -79, var29, var32);
                }
                if ((var5 & 0x8) != 0) {
                    int[] var34 = new int[4];
                    for (int var35 = 0; var35 < 4; var35++) {
                        var34[var35] = var1.method5140((byte) -2);
                        if (var34[var35] == 65535) {
                            var34[var35] = -1;
                        }
                    }
                    int var36 = var1.method5128(0);
                    class688.method4920(var34, var4, var36, true, 1);
                }
                if ((var5 & 0x8000) != 0) {
                    int var37 = var4.field10229.field1692.length;
                    int var38 = 0;
                    if (var4.field10229.field1667 != null) {
                        var38 = var4.field10229.field1667.length;
                    }
                    int var39 = 0;
                    if (var4.field10229.field1679 != null) {
                        var39 = var4.field10229.field1679.length;
                    }
                    int var40 = var1.method5128(0);
                    if ((var40 & 0x1) == 1) {
                        var4.field10212 = null;
                    } else {
                        int[] var41 = null;
                        if ((var40 & 0x2) == 2) {
                            var41 = new int[var37];
                            for (int var42 = 0; var42 < var37; var42++) {
                                var41[var42] = var1.method5116((byte) -124);
                            }
                        }
                        short[] var43 = null;
                        if ((var40 & 0x4) == 4) {
                            var43 = new short[var38];
                            for (int var44 = 0; var44 < var38; var44++) {
                                var43[var44] = (short) var1.method5146(-31933);
                            }
                        }
                        short[] var45 = null;
                        if ((var40 & 0x8) == 8) {
                            var45 = new short[var39];
                            for (int var46 = 0; var46 < var39; var46++) {
                                var45[var46] = (short) var1.method5140((byte) -2);
                            }
                        }
                        long var47 = (long) (var4.field10230++) << 32 | (long) var3;
                        var4.field10212 = new class434(var47, var41, var43, var45);
                    }
                }
                if ((var5 & 0x10000) != 0) {
                    var4.field10211 = var1.method5144(-16414);
                    if ("".equals(var4.field10211) || var4.field10211.equals(var4.field10229.field1690)) {
                        var4.field10211 = var4.field10229.field1690;
                    }
                }
                if ((var5 & 0x20) != 0) {
                    var4.field10213 = var1.method5103((byte) 105);
                    var4.field10215 = var1.method5116((byte) -109);
                }
                if ((var5 & 0x2) != 0) {
                    var4.field2170 = var1.method5144(-16414);
                    var4.field2222 = 100;
                }
                if ((var5 & 0x80) != 0) {
                    var4.field2219 = var1.method5140((byte) -2);
                    if (var4.field2219 == 65535) {
                        var4.field2219 = -1;
                    }
                }
                if ((var5 & 0x4) != 0) {
                    int var49 = var1.method5132((byte) 16);
                    if (var49 > 0) {
                        for (int var50 = 0; var50 < var49; var50++) {
                            int var51 = -1;
                            int var52 = -1;
                            int var53 = var1.method5090(-72);
                            int var54 = -1;
                            if (var53 == 32767) {
                                var53 = var1.method5090(-90);
                                var52 = var1.method5090(-85);
                                var51 = var1.method5090(-87);
                                var54 = var1.method5090(-102);
                            } else if (var53 == 32766) {
                                var53 = -1;
                            } else {
                                var52 = var1.method5090(-53);
                            }
                            int var55 = var1.method5090(-67);
                            int var56 = var1.method5128(0);
                            var4.method1444(var53, class694.field9700, var56, var51, -19284, var52, var54, var55);
                        }
                    }
                }
                if ((var5 & 0x20000) != 0) {
                    int var57 = var4.field10229.field1723.length;
                    int var58 = 0;
                    if (var4.field10229.field1667 != null) {
                        var58 = var4.field10229.field1667.length;
                    }
                    if (var4.field10229.field1679 != null) {
                        var58 = var4.field10229.field1679.length;
                    }
                    byte var59 = 0;
                    int var60 = var1.method5132((byte) 16);
                    if ((var60 & 0x1) != 1) {
                        int[] var61 = null;
                        if ((var60 & 0x2) == 2) {
                            var61 = new int[var57];
                            for (int var62 = 0; var62 < var57; var62++) {
                                var61[var62] = var1.method5103((byte) 53);
                            }
                        }
                        short[] var63 = null;
                        if ((var60 & 0x4) == 4) {
                            var63 = new short[var58];
                            for (int var64 = 0; var64 < var58; var64++) {
                                var63[var64] = (short) var1.method5103((byte) 51);
                            }
                        }
                        short[] var65 = null;
                        if ((var60 & 0x8) == 8) {
                            var65 = new short[var59];
                            for (int var66 = 0; var66 < var59; var66++) {
                                var65[var66] = (short) var1.method5140((byte) -2);
                            }
                        }
                        long var67 = (long) (var4.field10224++) << 32 | (long) var3;
                        new class434(var67, var61, var63, var65);
                    }
                }
            }
            int var69 = 0 / ((arg0 - 36) / 44);
        } catch (RuntimeException var71) {
            throw class665.method4799(var71, field8744[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIZFI)[I")
    public final int[] method4499(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5) {
        try {
            field8730++;
            return arg2 == -7994 ? this.method4505((byte) -82, arg5).method1289((double) arg4, arg0, this.field8734[arg5].field9582, this, true, this.field8742, arg1) : null;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8744[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(II)Lqf;")
    public final class684 method4500(int arg0, int arg1) {
        try {
            field8733++;
            if (arg0 != -23641) {
                this.method4502(-0.95379376F, -12, 79, 79, -29, false);
            }
            return this.field8734[arg1];
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8744[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZIIIZF)[F")
    public final float[] method4501(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5) {
        try {
            field8736++;
            return arg4 ? this.method4505((byte) -110, arg2).method1290(this.field8734[arg2].field9582, 0, this, arg1, arg3, this.field8742) : null;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8744[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(FIIIIZ)[I")
    public final int[] method4502(float arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            field8729++;
            if (arg2 >= -81) {
                method4498(-106);
            }
            return this.method4505((byte) -113, arg4).method1288(255, (double) arg0, this, arg1, this.field8742, arg3, arg5, this.field8734[arg4].field9582);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8744[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)I")
    public final int method4503(boolean arg0) {
        try {
            field8738++;
            if (!arg0) {
                this.field8740 = -22;
            }
            return this.field8740;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8744[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)Z")
    public final boolean method4504(int arg0, int arg1) {
        try {
            if (arg1 != -31410) {
                this.field8740 = -43;
            }
            field8741++;
            class152 var3 = this.method4505((byte) -77, arg0);
            return var3 != null && var3.method1292(this.field8742, 255, this);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8744[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI)Loq;")
    private final class152 method4505(byte arg0, int arg1) {
        try {
            field8735++;
            class687 var3 = this.field8743.method2730(true, (long) arg1);
            if (var3 != null) {
                return (class152) var3;
            }
            byte[] var4 = this.field8731.method520((byte) 108, arg1);
            if (arg0 >= -75) {
                this.field8740 = 92;
            }
            if (var4 == null) {
                return null;
            } else {
                class152 var5 = new class152(new class711(var4));
                this.field8743.method2734((long) arg1, -1, var5);
                return var5;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8744[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V")
    public static void method4506(int arg0) {
        try {
            int var1 = 95 / ((arg0 + 71) / 34);
            field8739 = null;
            field8737 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8744[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Llga;Llga;Llga;)V")
    public class610(class47 arg0, class47 arg1, class47 arg2) {
        try {
            this.field8742 = arg2;
            this.field8731 = arg1;
            class711 var4 = new class711(arg0.method512(0, 0, (byte) -23));
            this.field8740 = var4.method5116((byte) -109);
            this.field8734 = new class684[this.field8740];
            for (int var5 = 0; var5 < this.field8740; var5++) {
                if (var4.method5128(0) == 1) {
                    this.field8734[var5] = new class684();
                }
            }
            for (int var6 = 0; var6 < this.field8740; var6++) {
                if (this.field8734[var6] != null) {
                    this.field8734[var6].field9583 = var4.method5128(0) == 0;
                }
            }
            for (int var7 = 0; var7 < this.field8740; var7++) {
                if (this.field8734[var7] != null) {
                    this.field8734[var7].field9599 = var4.method5128(0) == 1;
                }
            }
            for (int var8 = 0; var8 < this.field8740; var8++) {
                if (this.field8734[var8] != null) {
                    this.field8734[var8].field9586 = var4.method5128(0) == 1;
                }
            }
            for (int var9 = 0; var9 < this.field8740; var9++) {
                if (this.field8734[var9] != null) {
                    this.field8734[var9].field9602 = var4.method5125((byte) 98);
                }
            }
            for (int var10 = 0; var10 < this.field8740; var10++) {
                if (this.field8734[var10] != null) {
                    this.field8734[var10].field9589 = var4.method5125((byte) -72);
                }
            }
            for (int var11 = 0; var11 < this.field8740; var11++) {
                if (this.field8734[var11] != null) {
                    this.field8734[var11].field9605 = var4.method5125((byte) -124);
                }
            }
            for (int var12 = 0; var12 < this.field8740; var12++) {
                if (this.field8734[var12] != null) {
                    this.field8734[var12].field9600 = var4.method5125((byte) 99);
                }
            }
            for (int var13 = 0; var13 < this.field8740; var13++) {
                if (this.field8734[var13] != null) {
                    this.field8734[var13].field9596 = (short) var4.method5116((byte) -116);
                }
            }
            for (int var14 = 0; var14 < this.field8740; var14++) {
                if (this.field8734[var14] != null) {
                    this.field8734[var14].field9598 = var4.method5125((byte) 118);
                }
            }
            for (int var15 = 0; var15 < this.field8740; var15++) {
                if (this.field8734[var15] != null) {
                    this.field8734[var15].field9592 = var4.method5125((byte) 112);
                }
            }
            for (int var16 = 0; var16 < this.field8740; var16++) {
                if (this.field8734[var16] != null) {
                    this.field8734[var16].field9587 = var4.method5128(0) == 1;
                }
            }
            for (int var17 = 0; var17 < this.field8740; var17++) {
                if (this.field8734[var17] != null) {
                    this.field8734[var17].field9582 = var4.method5128(0) == 1;
                }
            }
            for (int var18 = 0; var18 < this.field8740; var18++) {
                if (this.field8734[var18] != null) {
                    this.field8734[var18].field9597 = var4.method5125((byte) 109);
                }
            }
            for (int var19 = 0; var19 < this.field8740; var19++) {
                if (this.field8734[var19] != null) {
                    this.field8734[var19].field9601 = var4.method5128(0) == 1;
                }
            }
            for (int var20 = 0; var20 < this.field8740; var20++) {
                if (this.field8734[var20] != null) {
                    this.field8734[var20].field9590 = var4.method5128(0) == 1;
                }
            }
            for (int var21 = 0; var21 < this.field8740; var21++) {
                if (this.field8734[var21] != null) {
                    this.field8734[var21].field9585 = var4.method5128(0) == 1;
                }
            }
            for (int var22 = 0; var22 < this.field8740; var22++) {
                if (this.field8734[var22] != null) {
                    this.field8734[var22].field9593 = var4.method5128(0);
                }
            }
            for (int var23 = 0; var23 < this.field8740; var23++) {
                if (this.field8734[var23] != null) {
                    this.field8734[var23].field9588 = var4.method5113(18443);
                }
            }
            for (int var24 = 0; var24 < this.field8740; var24++) {
                if (this.field8734[var24] != null) {
                    this.field8734[var24].field9584 = var4.method5128(0);
                }
            }
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field8744[3] + (arg0 == null ? field8744[1] : field8744[2]) + ',' + (arg1 == null ? field8744[1] : field8744[2]) + ',' + (arg2 == null ? field8744[1] : field8744[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4507(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4508(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
