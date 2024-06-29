import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class299 extends class16 {

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    private int field4666 = 4096;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field4667 = new String[8];

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field4662;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "[[S")
    public static short[][] field4664;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)Z", line = 8)
    public static final boolean method2084(int arg0, boolean arg1) {
        byte var2 = 0;
        field4661++;
        byte var3 = 0;
        if (class261.field4154 == null) {
            if (class186.field2991 || class271.field4304 == null) {
                class261.field4154 = new class298(512, 512);
            } else {
                class261.field4154 = (class298) class271.field4304;
            }
            int[] var4 = class261.field4154.field4659;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var8 = (var3 + 103 - var7) * 4 * 512 + 24628;
                for (int var9 = var2 + 1; var9 < (104 - (var2 + 1)); var9++) {
                    if ((class81.field1229[arg0][var9][var7] & 0x18) == 0) {
                        class232.method1668(var4, var8, 512, arg0, var9, var7);
                    }
                    if (arg0 < 3 && (class81.field1229[arg0 + 1][var9][var7] & 0x8) != 0) {
                        class232.method1668(var4, var8, 512, arg0 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class260.field4153 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class303.method2120(class148.field2209, var2 + var10, var11 - -var3);
                    if (var12 != 0L) {
                        class149 var14 = class291.method2043((int) (var12 >>> 32) & Integer.MAX_VALUE, 23006);
                        int var15 = var14.field2227;
                        if (var14.field2223 != null) {
                            for (int var16 = 0; var16 < var14.field2223.length; var16++) {
                                if (var14.field2223[var16] != -1) {
                                    class149 var17 = class291.method2043(var14.field2223[var16], 23006);
                                    if (var17.field2227 >= 0) {
                                        var15 = var17.field2227;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var2 + var10;
                            int var19 = var3 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class50.field685[class148.field2209].field889;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var18 > (var10 - 3) && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var18 < var10 + 3 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > var11 - 3 && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class284.field4490[class260.field4153] = var14.field2299;
                            class18.field246[class260.field4153] = var18 - var2;
                            class152.field2333[class260.field4153] = var19 - var3;
                            class260.field4153++;
                        }
                    }
                }
            }
        }
        class261.field4154.method2082();
        if (arg1) {
            method2087(false);
        }
        int var23 = ((((int) (Math.random() * 20.0D)) + 238) - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var24 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class81.field1229[arg0][var2 + var26][var3 + var25] & 0x18) == 0 && !class210.method1539(var23, var25, var24, arg0, -122, var2, var3, var26)) {
                    if (class186.field2991) {
                        class216.field3480 = null;
                    } else {
                        class289.field4563.method2054(-25);
                    }
                    return false;
                }
                if (arg0 < 3 && (class81.field1229[arg0 + 1][var2 + var26][var25 + var3] & 0x8) != 0 && !class210.method1539(var23, var25, var24, arg0 + 1, -114, var2, var3, var26)) {
                    if (class186.field2991) {
                        class216.field3480 = null;
                    } else {
                        class289.field4563.method2054(-25);
                    }
                    return false;
                }
            }
        }
        if (class186.field2991) {
            int[] var27 = class261.field4154.field4659;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class271.field4304 = new class14(class261.field4154);
        } else {
            class271.field4304 = class261.field4154;
        }
        if (class186.field2991) {
            class216.field3480 = null;
        } else {
            class289.field4563.method2054(-25);
        }
        class261.field4154 = null;
        return true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([IBI[JI)V", line = 239)
    public static final void method2085(int[] arg0, byte arg1, int arg2, long[] arg3, int arg4) {
        if (arg4 < arg2) {
            int var5 = (arg4 + arg2) / 2;
            long var6 = arg3[var5];
            int var8 = arg4;
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var6;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var9;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg3[var10] < (long) (var10 & 0x1) + var6) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var8];
                    arg3[var8] = var11;
                    int var13 = arg0[var10];
                    arg0[var10] = arg0[var8];
                    arg0[var8++] = var13;
                }
            }
            arg3[arg2] = arg3[var8];
            arg3[var8] = var6;
            arg0[arg2] = arg0[var8];
            arg0[var8] = var9;
            method2085(arg0, (byte) -72, var8 - 1, arg3, arg4);
            method2085(arg0, (byte) -72, arg2, arg3, var8 + 1);
        }
        if (arg1 == -72) {
            field4663++;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(ZI)[I", line = 296)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            field4664 = (short[][]) ((short[][]) null);
        }
        field4670++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int[] var4 = this.method103(0, 4389, class240.field3798 & arg1 - 1);
            int[] var5 = this.method103(0, 4389, arg1);
            int[] var6 = this.method103(0, 4389, class240.field3798 & arg1 + 1);
            for (int var7 = 0; var7 < class276.field4376; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field4666;
                int var9 = (var5[var7 + 1 & class148.field2215] - var5[class148.field2215 & var7 - 1]) * this.field4666;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 345)
    public class299() {
        super(1, true);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Llg;B)V", line = 349)
    public static final void method2086(class132 arg0, byte arg1) {
        field4669++;
        if (arg0.field1956 == 0) {
            return;
        }
        class206 var2 = arg0.method899(true);
        if (arg0.field1976 != -1 && arg0.field1976 < 32768) {
            class196 var3 = class297.field4657[arg0.field1976];
            if (var3 != null) {
                int var4 = arg0.field1980 - var3.field1980;
                int var5 = arg0.field1944 - var3.field1944;
                if (var4 != 0 || var5 != 0) {
                    arg0.field1973 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1976 >= 32768) {
            int var6 = arg0.field1976 - 32768;
            if (class254.field4032 == var6) {
                var6 = 2047;
            }
            class320 var7 = class100.field1523[var6];
            if (var7 != null) {
                int var8 = arg0.field1980 - var7.field1980;
                int var9 = arg0.field1944 - var7.field1944;
                if (var8 != 0 || var9 != 0) {
                    arg0.field1973 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1964 != 0 || arg0.field2004 != 0) && (arg0.field1951 == 0 || arg0.field2041 > 0)) {
            int var10 = arg0.field1980 - (arg0.field1964 - class181.field2925 - class181.field2925) * 64;
            int var11 = arg0.field1944 - ((arg0.field2004 - class24.field351 - class24.field351) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field1973 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field2004 = 0;
            arg0.field1964 = 0;
        }
        if (arg1 != -30) {
            field4667 = (String[]) null;
        }
        int var12 = arg0.field1973 - arg0.field2037 & 0x7FF;
        if (var12 == 0) {
            arg0.field2029 = 0;
            arg0.field2005 = 0;
        } else if (var2.field3365 == 0) {
            arg0.field2005++;
            if (var12 <= 1024) {
                arg0.field2037 += arg0.field1956;
                boolean var13 = true;
                if (var12 < arg0.field1956 || (2048 - arg0.field1956) < var12) {
                    var13 = false;
                    arg0.field2037 = arg0.field1973;
                }
                if (arg0.field2005 > 25 || var13) {
                    arg0.field1994 = var2.field3345;
                    if (arg0.field1951 <= 0) {
                        if (var2.field3388 != -1) {
                            arg0.field1994 = var2.field3388;
                        }
                    } else if (arg0.field1972[arg0.field1951 - 1] == 2) {
                        if (var2.field3384 != -1) {
                            arg0.field1994 = var2.field3384;
                        } else if (var2.field3347 != -1) {
                            arg0.field1994 = var2.field3347;
                        }
                    } else if (arg0.field1972[arg0.field1951 - 1] == 0) {
                        if (var2.field3382 != -1) {
                            arg0.field1994 = var2.field3382;
                        } else if (var2.field3380 != -1) {
                            arg0.field1994 = var2.field3380;
                        }
                    } else if (var2.field3368 != -1) {
                        arg0.field1994 = var2.field3368;
                    }
                }
            } else {
                boolean var14 = true;
                arg0.field2037 -= arg0.field1956;
                if (var12 < arg0.field1956 || var12 > (2048 - arg0.field1956)) {
                    var14 = false;
                    arg0.field2037 = arg0.field1973;
                }
                if (arg0.field2005 > 25 || var14) {
                    arg0.field1994 = var2.field3345;
                    if (arg0.field1951 > 0) {
                        if (arg0.field1972[arg0.field1951 - 1] == 2) {
                            if (var2.field3369 != -1) {
                                arg0.field1994 = var2.field3369;
                            } else if (var2.field3347 != -1) {
                                arg0.field1994 = var2.field3347;
                            }
                        } else if (arg0.field1972[arg0.field1951 - 1] == 0) {
                            if (var2.field3367 != -1) {
                                arg0.field1994 = var2.field3367;
                            } else if (var2.field3380 != -1) {
                                arg0.field1994 = var2.field3380;
                            }
                        } else if (var2.field3359 != -1) {
                            arg0.field1994 = var2.field3359;
                        }
                    } else if (var2.field3352 != -1) {
                        arg0.field1994 = var2.field3352;
                    }
                }
            }
            arg0.field2037 &= 0x7FF;
        } else {
            arg0.field1994 = -1;
            int var15 = arg0.field1973 << 5;
            if (arg0.field2009 != var15) {
                arg0.field2015 = 0;
                int var16 = var15 - arg0.field1979 & 0xFFFF;
                arg0.field2009 = var15;
                int var17 = arg0.field2029 * arg0.field2029 / (var2.field3365 * 2);
                if (arg0.field2029 > 0 && var17 <= var16 && var16 - var17 < 32768) {
                    arg0.field1946 = var16 / 2;
                    arg0.field2038 = true;
                    int var18 = var2.field3375 * var2.field3375 / (var2.field3365 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (arg0.field1946 > var18) {
                        arg0.field1946 = var16 - var18;
                    }
                } else if (arg0.field2029 < 0 && var17 <= (65536 - var16) && (65536 - var16 - var17) < 32768) {
                    arg0.field2038 = true;
                    int var19 = var2.field3375 * var2.field3375 / (var2.field3365 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    arg0.field1946 = (65536 - var16) / 2;
                    if (var19 < arg0.field1946) {
                        arg0.field1946 = 65536 - var16 - var19;
                    }
                } else {
                    arg0.field2038 = false;
                }
            }
            if (arg0.field2029 == 0) {
                int var20 = arg0.field2009 - arg0.field1979 & 0xFFFF;
                if (var20 < var2.field3365) {
                    arg0.field1979 = arg0.field2009;
                } else {
                    arg0.field2038 = true;
                    arg0.field2015 = 0;
                    int var21 = var2.field3375 * var2.field3375 / (var2.field3365 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 >= 32768) {
                        arg0.field1946 = (65536 - var20) / 2;
                        if (var21 < arg0.field1946) {
                            arg0.field1946 = 65536 - var20 - var21;
                        }
                        arg0.field2029 = -var2.field3365;
                    } else {
                        arg0.field1946 = var20 / 2;
                        if (arg0.field1946 > var21) {
                            arg0.field1946 = var20 - var21;
                        }
                        arg0.field2029 = var2.field3365;
                    }
                }
            } else if (arg0.field2029 > 0) {
                if (arg0.field2015 >= arg0.field1946) {
                    arg0.field2038 = false;
                }
                if (!arg0.field2038) {
                    arg0.field2029 -= var2.field3365;
                    if (arg0.field2029 < 0) {
                        arg0.field2029 = 0;
                    }
                } else if (arg0.field2029 < var2.field3375) {
                    arg0.field2029 += var2.field3365;
                }
            } else {
                if (arg0.field2015 >= arg0.field1946) {
                    arg0.field2038 = false;
                }
                if (!arg0.field2038) {
                    arg0.field2029 += var2.field3365;
                    if (arg0.field2029 > 0) {
                        arg0.field2029 = 0;
                    }
                } else if ((-var2.field3375) < arg0.field2029) {
                    arg0.field2029 -= var2.field3365;
                }
            }
            arg0.field1979 += arg0.field2029;
            if (arg0.field2029 <= 0) {
                arg0.field2015 -= arg0.field2029;
            } else {
                arg0.field2015 += arg0.field2029;
            }
            arg0.field1979 &= 0xFFFF;
            arg0.field2037 = arg0.field1979 >> 5;
            if (arg0.field2029 >= 0) {
                if (arg0.field1951 > 0) {
                    if (arg0.field1972[arg0.field1951 - 1] == 2) {
                        if (var2.field3384 != -1) {
                            arg0.field1994 = var2.field3384;
                        } else if (var2.field3347 != -1) {
                            arg0.field1994 = var2.field3347;
                        }
                    } else if (arg0.field1972[arg0.field1951 - 1] == 0) {
                        if (var2.field3382 != -1) {
                            arg0.field1994 = var2.field3382;
                        } else if (var2.field3380 != -1) {
                            arg0.field1994 = var2.field3380;
                        }
                    }
                }
                if (arg0.field1994 == -1) {
                    if (var2.field3368 != -1) {
                        arg0.field1994 = var2.field3368;
                    } else if (var2.field3388 != -1) {
                        arg0.field1994 = var2.field3388;
                    }
                }
            } else {
                if (arg0.field1951 > 0) {
                    if (arg0.field1972[arg0.field1951 - 1] == 2) {
                        if (var2.field3369 != -1) {
                            arg0.field1994 = var2.field3369;
                        } else if (var2.field3347 != -1) {
                            arg0.field1994 = var2.field3347;
                        }
                    } else if (arg0.field1972[arg0.field1951 - 1] == 0) {
                        if (var2.field3367 != -1) {
                            arg0.field1994 = var2.field3367;
                        } else if (var2.field3380 != -1) {
                            arg0.field1994 = var2.field3380;
                        }
                    }
                }
                if (arg0.field1994 == -1) {
                    if (var2.field3359 != -1) {
                        arg0.field1994 = var2.field3359;
                    } else if (var2.field3352 != -1) {
                        arg0.field1994 = var2.field3352;
                    }
                }
            }
            if (arg0.field1994 == -1) {
                arg0.field1994 = var2.field3345;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V", line = 789)
    public static void method2087(boolean arg0) {
        field4667 = null;
        field4662 = null;
        field4664 = (short[][]) null;
        if (!arg0) {
            method2086((class132) null, (byte) 18);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/lang/Object;Z)[B", line = 801)
    public static final byte[] method2088(int arg0, Object arg1, boolean arg2) {
        field4672++;
        if (arg1 == null) {
            return null;
        } else if (arg0 != 65408) {
            return (byte[]) null;
        } else if ((arg1 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg1);
            return arg2 ? class329.method2277((byte) 81, var4) : var4;
        } else if (arg1 instanceof class235) {
            class235 var3 = (class235) arg1;
            return var3.method817(-9827);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 839)
    public static final void method2089(int arg0) {
        if (arg0 < 35) {
            field4667 = (String[]) null;
        }
        class119 var1 = (class119) class64.field835.method1807((byte) 42);
        field4671++;
        while (var1 != null) {
            class88 var2 = var1.field1830;
            if (class148.field2209 != var2.field1339 || class48.field648 > var2.field1338) {
                var1.method465((byte) -122);
            } else if (var2.field1330 <= class48.field648) {
                if (var2.field1332 > 0) {
                    class196 var3 = class297.field4657[var2.field1332 - 1];
                    if (var3 != null && var3.field1980 >= 0 && var3.field1980 < 13312 && var3.field1944 >= 0 && var3.field1944 < 13312) {
                        var2.method637(class227.method1653(var3.field1980, var3.field1944, -12282, var2.field1339) - var2.field1353, class48.field648, (byte) 91, var3.field1944, var3.field1980);
                    }
                }
                if (var2.field1332 < 0) {
                    int var4 = -var2.field1332 - 1;
                    class320 var5;
                    if (class254.field4032 == var4) {
                        var5 = class13.field159;
                    } else {
                        var5 = class100.field1523[var4];
                    }
                    if (var5 != null && var5.field1980 >= 0 && var5.field1980 < 13312 && var5.field1944 >= 0 && var5.field1944 < 13312) {
                        var2.method637(class227.method1653(var5.field1980, var5.field1944, -12282, var2.field1339) - var2.field1353, class48.field648, (byte) -114, var5.field1944, var5.field1980);
                    }
                }
                var2.method640(0, class274.field4353);
                class290.method2033(class148.field2209, (int) var2.field1348, (int) var2.field1343, (int) var2.field1341, 60, var2, var2.field1326, -1L, false);
            }
            var1 = (class119) class64.field835.method1808(18051);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLim;I)V", line = 898)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4666 = arg1.method1396(-49);
        }
        field4668++;
        if (arg0 != -7) {
            field4662 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIZZI)V", line = 920)
    public static final void method2090(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field4660++;
        if (arg0 != 2 || arg2 <= arg6) {
            return;
        }
        int var7 = (arg2 + arg6) / 2;
        int var8 = arg6;
        class255 var9 = class266.field4196[var7];
        class266.field4196[var7] = class266.field4196[arg2];
        class266.field4196[arg2] = var9;
        for (int var10 = arg6; var10 < arg2; var10++) {
            if (class249.method1762(var9, arg1, class266.field4196[var10], arg4, arg3, arg5, 0) <= 0) {
                class255 var11 = class266.field4196[var10];
                class266.field4196[var10] = class266.field4196[var8];
                class266.field4196[var8++] = var11;
            }
        }
        class266.field4196[arg2] = class266.field4196[var8];
        class266.field4196[var8] = var9;
        method2090(2, arg1, var8 - 1, arg3, arg4, arg5, arg6);
        method2090(2, arg1, arg2, arg3, arg4, arg5, var8 + 1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)I", line = 964)
    public static final int method2091(byte arg0, int arg1, int arg2) {
        if (arg0 != -77) {
            return 81;
        }
        field4665++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
