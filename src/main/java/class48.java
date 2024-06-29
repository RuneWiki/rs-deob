import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class48 {

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[I")
    private int[] field659;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[I")
    private int[] field656;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    public static int[] field647 = new int[100];

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field648 = 0;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field664 = -1;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Z")
    public static boolean field663 = false;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    private int field649;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIBII)V", line = 8)
    public static final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field661++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class181.field2921 - class237.field3751) * var8 / 100 + class237.field3751;
        int var10 = arg3 * var9 >> 8;
        int var11 = 2048 - arg4 & 0x7FF;
        int var12 = 0;
        int var13 = 0;
        int var14 = var10;
        if (var11 != 0) {
            int var15 = class25.field355[var11];
            var13 = -var10 * var15 >> 16;
            int var16 = class25.field359[var11];
            var14 = var10 * var16 >> 16;
        }
        if (arg5 >= -68) {
            return;
        }
        int var17 = 2048 - arg0 & 0x7FF;
        if (var17 != 0) {
            int var18 = class25.field355[var17];
            var12 = var14 * var18 >> 16;
            int var19 = class25.field359[var17];
            var14 = var14 * var19 >> 16;
        }
        class27.field388 = arg7 - var14;
        class281.field4425 = arg4;
        class74.field983 = arg1 - var12;
        class161.field2644 = arg2 - var13;
        class185.field2971 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V", line = 68)
    public static final void method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field660++;
        int var6 = (arg3 - 32) * arg3 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg4 / (arg1 - arg3);
        class63.field828[arg0].method854(arg2, arg5);
        class63.field828[1].method854(arg2, arg3 + arg5 - 16);
        if (!class186.field2991) {
            class216.method1573(arg2, arg5 + 16, 16, arg3 - 32, class289.field4562);
            class216.method1573(arg2, arg5 + var7 + 16, 16, var6, class151.field2319);
            class216.method1589(arg2, arg5 + var7 + 16, var6, class77.field1174);
            class216.method1589(arg2 + 1, arg5 + var7 - -16, var6, class77.field1174);
            class216.method1587(arg2, arg5 + var7 + 16, 16, class77.field1174);
            class216.method1587(arg2, arg5 + var7 + 17, 16, class77.field1174);
            class216.method1589(arg2 + 15, 16 - -var7 + arg5, var6, class90.field1372);
            class216.method1589(arg2 + 14, arg5 + var7 - -17, var6 - 1, class90.field1372);
            class216.method1587(arg2, arg5 + var7 - (-var6 + -15), 16, class90.field1372);
            class216.method1587(arg2 + 1, arg5 - (-14 - var7) + var6, 15, class90.field1372);
            return;
        }
        class344.method2375(arg2, arg5 + 16, 16, arg3 - 32, class289.field4562);
        class344.method2375(arg2, arg5 + var7 + 16, 16, var6, class151.field2319);
        class344.method2374(arg2, var7 + arg5 + 16, var6, class77.field1174);
        class344.method2374(arg2 + 1, arg5 + 16 + var7, var6, class77.field1174);
        class344.method2373(arg2, var7 + arg5 + 16, 16, class77.field1174);
        class344.method2373(arg2, arg5 + var7 + 17, 16, class77.field1174);
        class344.method2374(arg2 + 15, arg5 + 16 - -var7, var6, class90.field1372);
        class344.method2374(arg2 + 14, arg5 + var7 - -17, var6 - 1, class90.field1372);
        class344.method2373(arg2, arg5 + var6 + var7 + 15, 16, class90.field1372);
        class344.method2373(arg2 + 1, arg5 + 14 + var6 + var7, 15, class90.field1372);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 117)
    public static final void method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class293 var20 = new class293(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class251.field3996[var21][arg1][arg2] == null) {
                    class251.field3996[var21][arg1][arg2] = new class230(var21, arg1, arg2);
                }
            }
            class251.field3996[arg0][arg1][arg2].field3670 = var20;
        } else if (arg3 == 1) {
            class293 var22 = new class293(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class251.field3996[var23][arg1][arg2] == null) {
                    class251.field3996[var23][arg1][arg2] = new class230(var23, arg1, arg2);
                }
            }
            class251.field3996[arg0][arg1][arg2].field3670 = var22;
        } else {
            class61 var24 = new class61(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class251.field3996[var25][arg1][arg2] == null) {
                    class251.field3996[var25][arg1][arg2] = new class230(var25, arg1, arg2);
                }
            }
            class251.field3996[arg0][arg1][arg2].field3685 = var24;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 167)
    public static final void method333(int arg0) {
        class140.field2092++;
        class21.field313.method1541(-76, 127);
        field666++;
        for (class224 var1 = (class224) class176.field2870.method1746((byte) -33); var1 != null; var1 = (class224) class176.field2870.method1749((byte) 85)) {
            if (var1.field3563 == 0) {
                class100.method707(var1, 122, true);
            }
        }
        if (class10.field109 != null) {
            class219.method1600(class10.field109, 97);
            class10.field109 = null;
        }
        if (arg0 != 0) {
            field647 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZZIIIIII)V", line = 203)
    public static final void method334(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field657++;
        if (!arg0 && class31.field437 == arg5 && class336.field5209 == arg7 && class146.field2190 == arg6 || class152.method1062(127)) {
            return;
        }
        class31.field437 = arg5;
        class336.field5209 = arg7;
        class146.field2190 = arg6;
        if (class152.method1062(119)) {
            class146.field2190 = 0;
        }
        if (arg2 != -14842) {
            field647 = (int[]) null;
        }
        if (arg1) {
            class173.method1180(28, 65280);
        } else {
            class173.method1180(25, 65280);
        }
        class303.method2126(true, class288.field4533, -42);
        int var8 = class181.field2925;
        class181.field2925 = arg5 * 8 - 48;
        int var9 = class24.field351;
        class24.field351 = arg7 * 8 - 48;
        class175.field2795 = class128.method883(class31.field437 * 8, class336.field5209 * 8, (byte) -111);
        class329.field5128 = null;
        int var10 = class181.field2925 - var8;
        int var11 = class181.field2925;
        int var12 = class24.field351 - var9;
        int var13 = class24.field351;
        if (arg1) {
            class176.field2875 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class196 var18 = class297.field4657[var17];
                if (var18 != null) {
                    var18.field1944 -= var12 * 128;
                    var18.field1980 -= var10 * 128;
                    if (var18.field1980 >= 0 && var18.field1980 <= 13184 && var18.field1944 >= 0 && var18.field1944 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field1969[var19] -= var10;
                            var18.field2006[var19] -= var12;
                        }
                        class128.field1906[class176.field2875++] = var17;
                    } else {
                        class297.field4657[var17].method1439((byte) 21, (class118) null);
                        class297.field4657[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class196 var15 = class297.field4657[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field1969[var16] -= var10;
                        var15.field2006[var16] -= var12;
                    }
                    var15.field1944 -= var12 * 128;
                    var15.field1980 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class320 var21 = class100.field1523[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field1969[var22] -= var10;
                    var21.field2006[var22] -= var12;
                }
                var21.field1944 -= var12 * 128;
                var21.field1980 -= var10 * 128;
            }
        }
        byte var23 = 0;
        class148.field2209 = arg6;
        class13.field159.method2236(arg4, arg3, arg2 + 33517, false);
        byte var24 = 104;
        byte var25 = 1;
        if (var10 < 0) {
            var23 = 103;
            var25 = -1;
            var24 = -1;
        }
        byte var26 = 0;
        byte var27 = 104;
        byte var28 = 1;
        if (var12 < 0) {
            var28 = -1;
            var27 = -1;
            var26 = 103;
        }
        for (int var29 = var23; var29 != var24; var29 += var25) {
            for (int var30 = var26; var30 != var27; var30 += var28) {
                int var31 = var10 + var29;
                int var32 = var12 + var30;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class116.field1745[var33][var29][var30] = class116.field1745[var33][var31][var32];
                    } else {
                        class116.field1745[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class125 var34 = (class125) class119.field1831.method1807((byte) 69); var34 != null; var34 = (class125) class119.field1831.method1808(18051)) {
            var34.field1865 -= var10;
            var34.field1872 -= var12;
            if (var34.field1865 < 0 || var34.field1872 < 0 || var34.field1865 >= 104 || var34.field1872 >= 104) {
                var34.method465((byte) -122);
            }
        }
        class126.field1879 = 0;
        if (class174.field2784 != 0) {
            class174.field2784 -= var10;
            class300.field4690 -= var12;
        }
        if (arg1) {
            class113.field1691 -= var12;
            class255.field4041 -= var10;
            class277.field4378 -= var12;
            class198.field3258 -= var10;
            class27.field388 -= var12 * 128;
            class74.field983 -= var10 * 128;
        } else {
            class282.field4461 = 1;
        }
        if (class186.field2991 && arg1 && (Math.abs(var10) > 104 || Math.abs(var12) > 104)) {
            class232.method1670((byte) 61);
        }
        class149.field2288 = -1;
        class136.field2049.method1811((byte) 25);
        class64.field835.method1811((byte) 25);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)I", line = 451)
    public final int method335(byte arg0) {
        if (this.field652-- == 0) {
            this.method338(-4);
            this.field652 = 255;
        }
        int var2 = 72 / ((arg0 + 63) / 52);
        field655++;
        return this.field659[this.field652];
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 472)
    private final void method336(byte arg0) {
        field650++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var12 + var15;
            int var19 = var4 + var17;
            var6 = var18 ^ var15 >>> 16;
            int var20 = var3 + var6;
            int var21 = var15 + var19;
            var5 = var21 ^ var19 << 10;
            int var22 = var2 + var5;
            int var23 = var19 + var20;
            var4 = var23 ^ var20 >>> 4;
            int var24 = var20 + var22;
            int var25 = var4 + var11;
            var3 = var24 ^ var22 << 8;
            var8 = var3 + var14;
            int var26 = var22 + var25;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var17;
        }
        if (arg0 >= -2) {
            method333(95);
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field659[var27 + 3] + var6;
            int var29 = this.field659[var27 + 2] + var7;
            int var30 = this.field659[var27 + 5] + var4;
            int var31 = this.field659[var27 + 1] + var8;
            int var32 = this.field659[var27 + 4] + var5;
            int var33 = this.field659[var27 + 7] + var2;
            int var34 = this.field659[var27] + var9;
            int var35 = var34 ^ var31 << 11;
            int var36 = this.field659[var27 + 6] + var3;
            int var37 = var29 + var31;
            int var38 = var37 ^ var29 >>> 2;
            int var39 = var32 + var38;
            int var40 = var28 + var35;
            int var41 = var29 + var40;
            int var42 = var41 ^ var40 << 8;
            int var43 = var30 + var42;
            int var44 = var39 + var40;
            var6 = var44 ^ var39 >>> 16;
            int var45 = var6 + var36;
            int var46 = var39 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var5 + var33;
            int var48 = var43 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var45 + var47;
            var3 = var49 ^ var47 << 8;
            int var50 = var4 + var35;
            var8 = var3 + var38;
            int var51 = var47 + var50;
            var2 = var51 ^ var50 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var50;
            this.field656[var27] = var9;
            this.field656[var27 + 1] = var8;
            this.field656[var27 + 2] = var7;
            this.field656[var27 + 3] = var6;
            this.field656[var27 + 4] = var5;
            this.field656[var27 + 5] = var4;
            this.field656[var27 + 6] = var3;
            this.field656[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field656[var52 + 2] + var7;
            int var54 = this.field656[var52 + 7] + var2;
            int var55 = this.field656[var52 + 3] + var6;
            int var56 = this.field656[var52 + 4] + var5;
            int var57 = this.field656[var52] + var9;
            int var58 = this.field656[var52 + 6] + var3;
            int var59 = this.field656[var52 + 1] + var8;
            int var60 = this.field656[var52 + 5] + var4;
            int var61 = var57 ^ var59 << 11;
            int var62 = var53 + var59;
            int var63 = var55 + var61;
            int var64 = var62 ^ var53 >>> 2;
            int var65 = var56 + var64;
            int var66 = var53 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var60 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var6 + var58;
            int var72 = var5 + var54;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
            this.field656[var52] = var9;
            this.field656[var52 + 1] = var8;
            this.field656[var52 + 2] = var7;
            this.field656[var52 + 3] = var6;
            this.field656[var52 + 4] = var5;
            this.field656[var52 + 5] = var4;
            this.field656[var52 + 6] = var3;
            this.field656[var52 + 7] = var2;
        }
        this.method338(-4);
        this.field652 = 256;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 616)
    public static final void method337(int arg0, int arg1) {
        int var2 = -76 % ((arg1 + 43) / 44);
        class185.field2976.method1625(arg0, (byte) 55);
        field651++;
        class95.field1454.method1625(arg0, (byte) 114);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 636)
    private final void method338(int arg0) {
        this.field654 += ++this.field662;
        if (arg0 != -4) {
            field665 = 101;
        }
        field658++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field656[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field649 ^= this.field649 << 13;
                } else {
                    this.field649 ^= this.field649 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field649 ^= this.field649 << 2;
            } else {
                this.field649 ^= this.field649 >>> 16;
            }
            this.field649 += this.field656[var2 + 128 & 0xFF];
            int var4;
            this.field656[var2] = var4 = this.field649 + this.field656[class200.method1465(var3 >> 2, 255)] + this.field654;
            this.field659[var2] = this.field654 = var3 + this.field656[class200.method1465(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)V", line = 679)
    public static final void method339(boolean arg0, int arg1) {
        class40.method279(arg1 + 37354);
        field653++;
        if (arg1 != -12095 || class144.field2159 != 30 && class144.field2159 != 25) {
            return;
        }
        class41.field576++;
        if (class41.field576 < 50 && !arg0) {
            return;
        }
        class41.field576 = 0;
        if (!class208.field3403 && class69.field901 != null) {
            class97.field1486++;
            class21.field313.method1541(-98, 251);
            try {
                class69.field901.method2101(class21.field313.field3128, (byte) 18, 0, class21.field313.field3129);
                class21.field313.field3129 = 0;
            } catch (IOException var3) {
                class208.field3403 = true;
            }
        }
        class40.method279(25259);
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 720)
    private class48() {
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V", line = 724)
    public static void method340(byte arg0) {
        if (arg0 >= -96) {
            method333(-39);
        }
        field647 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([I)V", line = 735)
    public class48(int[] arg0) {
        this.field659 = new int[256];
        this.field656 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field659[var2] = arg0[var2];
        }
        this.method336((byte) -11);
    }
}
