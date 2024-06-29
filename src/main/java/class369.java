import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class369 implements class318 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Lvg;")
    private class56 field5425 = new class56(128);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "[I")
    private int[] field5423 = new int[class390.field5714.field119];

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "[I")
    public int[] field5434 = new int[class390.field5714.field119];

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field5436;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cr", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field5437;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V")
    public final void method2340(int arg0, int arg1, int arg2) {
        field5424++;
        class454 var4 = class529.field7739.method2099(true, arg1);
        int var5 = var4.field6746;
        if (arg2 != 27959) {
            method2343(-51, 127, null);
        }
        int var6 = var4.field6748;
        int var7 = var4.field6751;
        int var8 = class313.field4758[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2342(var9 & arg0 << var6 | this.field5434[var5] & ~var9, -21029, var5);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public final void method2341(byte arg0) {
        field5430++;
        if (arg0 != -35) {
            return;
        }
        for (int var2 = 0; var2 < class390.field5714.field119; var2++) {
            class518 var3 = class390.field5714.method52(var2, (byte) -91);
            if (var3 != null && var3.field7521 == 0) {
                this.field5423[var2] = 0;
                this.field5434[var2] = 0;
            }
        }
        this.field5425 = new class56(128);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)I")
    public final int method2110(byte arg0, int arg1) {
        field5429++;
        int var3 = 62 % ((arg0 - 51) / 59);
        return this.field5434[arg1];
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(III)V")
    public final void method2342(int arg0, int arg1, int arg2) {
        field5435++;
        this.field5434[arg2] = arg0;
        class75 var4 = (class75) this.field5425.method358((byte) 27, (long) arg2);
        if (var4 == null) {
            class75 var5 = new class75(class375.method2397((byte) -75) + 500L);
            this.field5425.method357(var5, 1, (long) arg2);
        } else {
            var4.field1267 = class375.method2397((byte) -75) + 500L;
        }
        if (arg1 != -21029) {
            this.field5423 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILza;)Z")
    public static final boolean method2343(int arg0, int arg1, class299 arg2) {
        field5426++;
        int var3 = (class338.field5076 - 104) / 2;
        int var4 = (class250.field4077 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg0; var52 <= 3; var52++) {
                    if (class379.method2415(-3, var52, var6, var51, arg0)) {
                        int var53 = var52;
                        if (class38.method251(1, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class234.method1585(var53, var6, (byte) -61, var51);
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
        if (arg1 >= -71) {
            return false;
        }
        class361.field5323 = arg2.method520(var7, 0, 512, 512, 512);
        class321.method2120((byte) -61);
        int var9 = ((int) (Math.random() * 20.0D) + 228 << 8) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class269.field4266][class269.field4266];
        for (int var13 = var3; var13 < var3 + 104; var13 += class269.field4266) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class269.field4266) {
                arg2.method571(0, 0, class269.field4266 * 4, class269.field4266 * 4);
                arg2.method567(-16777216);
                for (int var37 = arg0; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class269.field4266; var44++) {
                        for (int var50 = 0; var50 < class269.field4266; var50++) {
                            var12[var44][var50] = class379.method2415(-3, var37, var13 + var44, var36 - -var50, arg0);
                        }
                    }
                    class274.field4306[var37].method62(0, 0, 1024, var13, var36, class269.field4266 + var13, var36 - -class269.field4266, var12);
                    if (!class508.field7383) {
                        for (int var45 = -4; var45 < class269.field4266; var45++) {
                            for (int var46 = -4; var46 < class269.field4266; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var4 <= var48 && class379.method2415(-3, var37, var47, var48, arg0)) {
                                    int var49 = var37;
                                    if (class38.method251(1, var48, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class355.method2261(var49, -13326, var48, var10, (class269.field4266 - var46) * 4 - 4, arg2, var47, var45 * 4, var9);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class508.field7383) {
                    class407 var38 = class463.field6857[arg0];
                    for (int var39 = 0; var39 < class269.field4266; var39++) {
                        for (int var40 = 0; var40 < class269.field4266; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field6004[var41 - var38.field6019][var42 - var38.field6015];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method1991((class269.field4266 - var40) * 4 - 4, -1713569622, 4, 4, 121, var39 * 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method1986(1, -1713569622, var39 * 4, 4, (class269.field4266 - var40) * 4 - 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method1987((byte) -86, -1713569622, 4, (class269.field4266 - var40) * 4 - 4, var39 * 4 + 3);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method1986(1, -1713569622, var39 * 4, 4, (class269.field4266 - var40) * 4 + 3 - 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method1987((byte) -122, -1713569622, 4, (class269.field4266 - var40) * 4 - 4, var39 * 4);
                            }
                        }
                    }
                }
                arg2.method506(0, 0, class269.field4266 * 4, class269.field4266 * 4, var11, 2);
                class361.field5323.method1213(((var13 - var3) * 4) + 48, -((-var4 + var36) * 4) + 464 + -(class269.field4266 * 4), class269.field4266 * 4, class269.field4266 * 4, 0, 0);
            }
        }
        arg2.method577();
        arg2.method567(-16777215);
        class80.method713(-14703);
        class387.field5690 = 0;
        class215.field3255.method291(false);
        if (!class508.field7383) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg0; var21 <= (arg0 + 1) && var21 <= 3; var21++) {
                        if (class379.method2415(-3, var21, var14, var20, arg0)) {
                            class161 var22 = (class161) class404.method2542(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class161) class35.method217(var21, var14, var20, field5437 == null ? (field5437 = method2349("bs")) : field5437);
                            }
                            if (var22 == null) {
                                var22 = (class161) class454.method2781(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class161) class124.method921(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class395 var23 = class247.field3693.method2281(var22.method99((byte) -107), -9380);
                                if (!var23.field5777 || class324.field4918) {
                                    int var24 = var23.field5774;
                                    if (var23.field5825 != null) {
                                        for (int var25 = 0; var25 < var23.field5825.length; var25++) {
                                            if (var23.field5825[var25] != -1) {
                                                class395 var26 = class247.field3693.method2281(var23.field5825[var25], -9380);
                                                if (var26.field5774 >= 0) {
                                                    var24 = var26.field5774;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class30 var28 = class455.field6765.method2182(var24, (byte) -42);
                                            if (var28 != null && var28.field374) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class463.field6857[var21].field6004;
                                            int var32 = class463.field6857[var21].field6019;
                                            int var33 = class463.field6857[var21].field6015;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class284.field4429[class387.field5690] = var23.field5831;
                                        class192.field2953[class387.field5690] = var29;
                                        class38.field624[class387.field5690] = var30;
                                        class387.field5690++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class293.field4530 != null) {
                class103.field1596.field1355 = 1;
                class455.field6765.method2180(64, 1024, (byte) 119);
                for (int var15 = 0; var15 < class293.field4530.field77; var15++) {
                    int var16 = class293.field4530.field74[var15];
                    if (var16 >> 28 == class116.field1781.field1274) {
                        int var17 = ((var16 & 0xFFFF8F1) >> 14) - class422.field6201;
                        int var18 = (var16 & 0x3FFF) - class23.field273;
                        if (var17 >= 0 && class338.field5076 > var17 && var18 >= 0 && var18 < class250.field4077) {
                            class215.field3255.method292((byte) 121, new class50(var15));
                        } else {
                            class30 var19 = class455.field6765.method2182(class293.field4530.field81[var15], (byte) -42);
                            if (var19.field371 != null && (var19.field350 + var17) >= 0 && var19.field348 + var17 < class338.field5076 && (var19.field329 + var18) >= 0 && var19.field326 + var18 < class250.field4077) {
                                class215.field3255.method292((byte) 121, new class50(var15));
                            }
                        }
                    }
                }
                class455.field6765.method2180(64, 128, (byte) 116);
                class103.field1596.field1355 = 2;
                class103.field1596.method728((byte) 120);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lfh;B)V")
    public static final void method2344(class194 arg0, byte arg1) {
        if (arg1 >= -96) {
            method2348(-113, null);
        }
        field5431++;
        byte[] var2 = new byte[24];
        if (class99.field1529 != null) {
            try {
                class99.field1529.method1460(0L, -58);
                class99.field1529.method1457(var2, (byte) -26);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1355(24, (byte) 76, 0, var2);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIZ)V")
    public final void method2345(int arg0, int arg1, boolean arg2) {
        this.field5423[arg1] = arg0;
        field5436++;
        class75 var4 = (class75) this.field5425.method358((byte) 90, (long) arg1);
        if (var4 == null) {
            class75 var5 = new class75(4611686018427387905L);
            this.field5425.method357(var5, 1, (long) arg1);
        } else if (var4.field1267 != 4611686018427387905L) {
            var4.field1267 = class375.method2397((byte) -75) + 500L | 0x4000000000000000L;
        }
        if (arg2) {
            this.method2110((byte) 27, -56);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZI)V")
    public final void method2346(int arg0, boolean arg1, int arg2) {
        field5428++;
        class454 var4 = class529.field7739.method2099(true, arg0);
        int var5 = var4.field6746;
        int var6 = var4.field6748;
        int var7 = var4.field6751;
        int var8 = class313.field4758[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2345(arg2 << var6 & var9 | this.field5423[var5] & ~var9, var5, arg1);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BZ)I")
    public final int method2347(byte arg0, boolean arg1) {
        field5432++;
        long var3 = class375.method2397((byte) -75);
        for (class75 var5 = arg1 ? (class75) this.field5425.method359(true) : (class75) this.field5425.method365(-78); var5 != null; var5 = (class75) this.field5425.method365(-112)) {
            if ((var5.field1267 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field1267 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field1932;
                    this.field5434[var6] = this.field5423[var6];
                    var5.method947((byte) 126);
                    return var6;
                }
                var5.method947((byte) 97);
            }
        }
        if (arg0 < 79) {
            this.field5434 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILza;)V")
    public static final void method2348(int arg0, class299 arg1) {
        field5427++;
        int var2 = class404.field5975;
        int var3 = class354.field5246;
        int var4 = class304.field4657;
        int var5 = class162.field2451 - 3;
        byte var6 = 20;
        if (class171.field2626 == null || class162.field2454 == null) {
            if (class510.field7431.method739((byte) -69, class516.field7507) && class510.field7431.method739((byte) -113, class534.field7841)) {
                class171.field2626 = arg1.method574(class309.method2038(class510.field7431, class516.field7507, 0), true);
                class309 var7 = class309.method2038(class510.field7431, class534.field7841, 0);
                class162.field2454 = arg1.method574(var7, true);
                var7.method2040();
                class364.field5369 = arg1.method574(var7, true);
            } else {
                arg1.method506(var2, var3, var4, var6, class261.field4169 | 255 - class203.field3135 << 24, 1);
            }
        }
        if (arg0 != -8648) {
            return;
        }
        if (class171.field2626 != null && class162.field2454 != null) {
            int var8 = (var4 - (class162.field2454.method398() * 2)) / class171.field2626.method398();
            for (int var9 = 0; var9 < var8; var9++) {
                class171.field2626.method2316(var2 + class162.field2454.method398() + class171.field2626.method398() * var9, var3);
            }
            class162.field2454.method2316(var2, var3);
            class364.field5369.method2316(var2 + var4 - class364.field5369.method398(), var3);
        }
        class441.field6573.method2052(-1, class23.field267.method1265(class345.field5141, -73), class327.field4948 | 0xFF000000, true, var2 + 3, var3 - -14);
        arg1.method506(var2, var3 + var6, var4, var5 - var6, 255 - class203.field3135 << 24 | class261.field4169, 1);
        int var10 = class377.field5570.method1475((byte) -109);
        int var11 = class377.field5570.method1484(arg0 ^ 0x79B1);
        int var12 = 0;
        for (class376 var13 = (class376) class154.field2370.method295((byte) 114); var13 != null; var13 = (class376) class154.field2370.method296(true)) {
            int var31 = var6 + var3 + ((class540.field7909 - 1 - var12) * 16) + 13;
            var12++;
            if (var2 < var10 && var10 < (var2 + var4) && (var31 - 13) < var11 && var11 < var31 + 4 && var13.field5541) {
                arg1.method506(var2, var31 - 12, var4, 16, class236.field3552 | 255 - class136.field2074 << 24, 1);
            }
        }
        if ((class437.field6502 == null || class307.field4691 == null || class192.field2955 == null) && class510.field7431.method739((byte) -114, class424.field6229) && class510.field7431.method739((byte) -65, class56.field855) && class510.field7431.method739((byte) -59, class2.field16)) {
            class309 var14 = class309.method2038(class510.field7431, class56.field855, 0);
            class307.field4691 = arg1.method574(var14, true);
            var14.method2040();
            class276.field4341 = arg1.method574(var14, true);
            class437.field6502 = arg1.method574(class309.method2038(class510.field7431, class424.field6229, 0), true);
            class309 var15 = class309.method2038(class510.field7431, class2.field16, 0);
            class192.field2955 = arg1.method574(var15, true);
            var15.method2040();
            client.field7545 = arg1.method574(var15, true);
        }
        int var16 = 0;
        if (class437.field6502 != null && class307.field4691 != null && class192.field2955 != null) {
            int var17 = (var4 - (class192.field2955.method398() * 2)) / class437.field6502.method398();
            for (int var18 = 0; var18 < var17; var18++) {
                class437.field6502.method2316(class192.field2955.method398() + (var2 + (class437.field6502.method398() * var18)), var3 + var5 - class437.field6502.method399());
            }
            int var19 = (var5 - class192.field2955.method399() - var6) / class307.field4691.method399();
            for (int var20 = 0; var20 < var19; var20++) {
                class307.field4691.method2316(var2, var20 * class307.field4691.method399() + var6 + var3);
                class276.field4341.method2316(var2 + var4 - class276.field4341.method398(), var6 + (var3 - -(class307.field4691.method399() * var20)));
            }
            class192.field2955.method2316(var2, var3 + var5 - class192.field2955.method399());
            client.field7545.method2316(var4 + var2 - class192.field2955.method398(), var5 + var3 + -class192.field2955.method399());
        }
        for (class376 var21 = (class376) class154.field2370.method295((byte) -115); var21 != null; var21 = (class376) class154.field2370.method296(true)) {
            int var22 = var3 + var6 - (-((class540.field7909 - var16 - 1) * 16) - 13);
            int var23 = class327.field4948 | 0xFF000000;
            if (var10 > var2 && (var2 + var4) > var10 && (var22 - 13) < var11 && (var22 + 4) > var11 && var21.field5541) {
                var23 = class231.field3484 | 0xFF000000;
            }
            int[] var24 = null;
            if (class349.method2246((byte) -119, var21.field5546)) {
                var24 = class300.field4608.method2088((int) var21.field5553, 113).field3331;
            } else if (var21.field5552 != -1) {
                var24 = class300.field4608.method2088(var21.field5552, arg0 ^ 0xFFFFDE41).field3331;
            } else if (class33.method197(var21.field5546, 61)) {
                class5 var25 = (class5) class366.field5398.method358((byte) -128, (long) ((int) var21.field5553));
                if (var25 != null) {
                    class46 var26 = var25.field65;
                    class171 var27 = var26.field718;
                    if (var27.field2611 != null) {
                        var27 = var27.method1221(class288.field4476, arg0 ^ 0xFFFFDE38);
                    }
                    if (var27 != null) {
                        var24 = var27.field2623;
                    }
                }
            } else if (class299.method1993(true, var21.field5546)) {
                Object var28 = null;
                class395 var29;
                if (var21.field5546 == 1003) {
                    var29 = class247.field3693.method2281((int) var21.field5553, -9380);
                } else {
                    var29 = class247.field3693.method2281((int) (var21.field5553 >>> 32 & 0x7FFFFFFFL), -9380);
                }
                if (var29.field5825 != null) {
                    var29 = var29.method2485(class288.field4476, 120);
                }
                if (var29 != null) {
                    var24 = var29.field5768;
                }
            }
            String var30 = class354.method2259((byte) -124, var21);
            if (var24 != null) {
                var30 = var30 + class477.method2879(var24, (byte) -67);
            }
            class441.field6573.method2048(var22, class280.field4361, var23, class397.field5855, var2 + 3, 0, var30, 7701);
            var16++;
            if (var21.field5548) {
                class540.field7910.method2316((var2 + class447.field6643.method174(var30, (byte) -111)) + 5, var22 + -12);
            }
        }
        class404.method2539(class304.field4657, class404.field5975, (byte) -101, class162.field2451, class354.field5246);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)I")
    public final int method2111(int arg0, int arg1) {
        field5433++;
        int var3 = -33 / ((-arg1 - 8) / 58);
        class454 var4 = class529.field7739.method2099(true, arg0);
        int var5 = var4.field6746;
        int var6 = var4.field6748;
        int var7 = var4.field6751;
        int var8 = class313.field4758[var7 - var6];
        return this.field5434[var5] >> var6 & var8;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2349(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class179("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }
}
