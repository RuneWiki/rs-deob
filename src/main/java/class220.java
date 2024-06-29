import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class220 extends class74 {

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Ljava/lang/String;")
    public static String field3449 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field3450 = 0;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "Lta;")
    public static class262 field3438 = new class262(4);

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "Lb;")
    public static class84 field3451 = new class84();

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3452 = "Loading...";

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lf;ILja;I)V")
    public static final void method1470(class37 arg0, int arg1, class59 arg2, int arg3) {
        class215 var4 = new class215();
        field3441++;
        var4.field3319 = arg0.method333((byte) -59);
        var4.field3325 = arg0.method307(-110);
        var4.field3323 = new byte[var4.field3319][][];
        var4.field3310 = new int[var4.field3319];
        var4.field3311 = new class248[var4.field3319];
        var4.field3321 = new int[var4.field3319];
        var4.field3317 = new class248[var4.field3319];
        var4.field3324 = new int[var4.field3319];
        for (int var5 = arg3; var5 < var4.field3319; var5++) {
            try {
                int var6 = arg0.method333((byte) -59);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method331(16312);
                    String var18 = arg0.method331(arg3 + 16312);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method307(-77);
                    }
                    var4.field3321[var5] = var6;
                    var4.field3310[var5] = var19;
                    var4.field3317[var5] = arg2.method470(class15.method152(var17, 1), arg3 - 72, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method331(16312);
                    String var8 = arg0.method331(16312);
                    int var9 = arg0.method333((byte) -59);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method331(16312);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method307(-64);
                            var12[var13] = new byte[var14];
                            arg0.method290(var12[var13], var14, 0, (byte) -113);
                        }
                    }
                    var4.field3321[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class15.method152(var10[var16], 1);
                    }
                    var4.field3311[var5] = arg2.method476((byte) 83, var8, var15, class15.method152(var7, 1));
                    var4.field3323[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3324[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3324[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3324[var5] = -3;
            } catch (Exception var23) {
                var4.field3324[var5] = -4;
            } catch (Throwable var24) {
                var4.field3324[var5] = -5;
            }
        }
        class34.field533.method1013(312991604, var4);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V")
    public static final void method1471(int arg0, boolean arg1) {
        class237.field3666 = null;
        class242.field3750 = null;
        class39.field654 = null;
        class122.field1874 = 0;
        class288.field4530 = null;
        class222.field3467 = null;
        field3442++;
        class157.field2413 = null;
        class216.field3334 = null;
        class18.field285 = null;
        class50.field799 = null;
        if (arg1 && class87.field1422 != null) {
            class66.field1045 = class87.field1422.field4699;
        } else {
            class66.field1045 = -1;
        }
        class87.field1422 = null;
        class273.field4310 = null;
        class37.field639.method1016(false);
        class277.field4358 = null;
        class69.field1102 = null;
        class197.field3094 = -1;
        class263.field4121 = null;
        class293.field4615 = null;
        class181.field2698 = null;
        class141.field2180 = null;
        class43.field698 = null;
        class108.field1718 = null;
        class116.field1808 = arg0;
        class140.field2169 = null;
        class120.field1856 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        field3445++;
        return arg0 == 4 ? class224.field3522 : null;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
    public static void method1472(int arg0) {
        if (arg0 == 22009) {
            field3451 = null;
            field3449 = null;
            field3438 = null;
            field3452 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class220() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)I")
    public static final int method1473(int arg0) {
        field3439++;
        try {
            if (class214.field3298 == 0) {
                if ((class269.method1823(-61) - 5000L) < class116.field1803) {
                    return 0;
                }
                class272.field4302 = class22.field329.method480(class153.field2341, (byte) -100, class76.field1279);
                class164.field2492 = class269.method1823(-118);
                class214.field3298 = 1;
            }
            int var1 = -76 / ((arg0 - 4) / 43);
            if (class269.method1823(-41) > (class164.field2492 + 30000L)) {
                return class263.method1791((byte) 24, 1000);
            }
            if (class214.field3298 == 1) {
                if (class272.field4302.field3828 == 2) {
                    return class263.method1791((byte) 24, 1001);
                }
                if (class272.field4302.field3828 != 1) {
                    return -1;
                }
                class118.field1829 = new class184((Socket) class272.field4302.field3831, class22.field329);
                int var2 = 0;
                class272.field4302 = null;
                if (class244.field3791) {
                    var2 = class264.field4211;
                }
                class292.field4607.field588 = 0;
                class292.field4607.method287(440742616, 23);
                class292.field4607.method289(var2, 98);
                class118.field1829.method1243(0, class292.field4607.field583, class292.field4607.field588, (byte) -98);
                if (class33.field531 != null) {
                    class33.field531.method66((byte) 122);
                }
                if (class46.field737 != null) {
                    class46.field737.method66((byte) 122);
                }
                int var3 = class118.field1829.method1232(22221);
                if (class33.field531 != null) {
                    class33.field531.method66((byte) 122);
                }
                if (class46.field737 != null) {
                    class46.field737.method66((byte) 122);
                }
                if (var3 != 0) {
                    return class263.method1791((byte) 24, var3);
                }
                class214.field3298 = 2;
            }
            if (class214.field3298 == 2) {
                if (class118.field1829.method1240((byte) 124) < 2) {
                    return -1;
                }
                class222.field3471 = class118.field1829.method1232(22221);
                class222.field3471 <<= 0x8;
                class222.field3471 += class118.field1829.method1232(22221);
                class118.field1830 = new byte[class222.field3471];
                class159.field2444 = 0;
                class214.field3298 = 3;
            }
            if (class214.field3298 != 3) {
                return -1;
            }
            int var4 = class118.field1829.method1240((byte) 101);
            if (var4 < 1) {
                return -1;
            }
            if (var4 > class222.field3471 - class159.field2444) {
                var4 = class222.field3471 - class159.field2444;
            }
            class118.field1829.method1231(class159.field2444, class118.field1830, var4, 0);
            class159.field2444 += var4;
            if (class222.field3471 > class159.field2444) {
                return -1;
            } else if (class7.method86(class118.field1830, true)) {
                class121.field1868 = new class209[class222.field3474];
                int var5 = 0;
                for (int var6 = class149.field2309; var6 <= class137.field2130; var6++) {
                    class209 var7 = class3.method42((byte) -74, var6);
                    if (var7 != null) {
                        class121.field1868[var5++] = var7;
                    }
                }
                class118.field1829.method1242((byte) 113);
                class214.field3298 = 0;
                class179.field2683 = 0;
                class118.field1829 = null;
                class118.field1830 = null;
                class116.field1803 = class269.method1823(-28);
                return 0;
            } else {
                return class263.method1791((byte) 24, 1002);
            }
        } catch (IOException var8) {
            return class263.method1791((byte) 24, 1003);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lna;I[I[I[I)V")
    public static final void method1474(class32 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        field3440++;
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field4215.length) {
                if ((var7 & 0x1) != 0) {
                    if (var8 == -1) {
                        arg0.field4215[var9] = null;
                    } else {
                        class223 var10 = class28.method224(var8, arg1 + 17445);
                        int var11 = var10.field3509;
                        class85 var12 = arg0.field4215[var9];
                        if (var12 != null) {
                            if (var12.field1398 == var8) {
                                if (var11 == 0) {
                                    var12 = arg0.field4215[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1392 = 0;
                                    var12.field1395 = 0;
                                    var12.field1400 = 1;
                                    var12.field1402 = 0;
                                    var12.field1401 = var6;
                                    class56.method452((byte) -93, 0, arg0.field4176, var10, false, arg0.field4123);
                                } else if (var11 == 2) {
                                    var12.field1395 = 0;
                                }
                            } else if (var10.field3481 >= class28.method224(var12.field1398, 60).field3481) {
                                var12 = arg0.field4215[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class85 var13 = arg0.field4215[var9] = new class85();
                            var13.field1401 = var6;
                            var13.field1398 = var8;
                            var13.field1392 = 0;
                            var13.field1395 = 0;
                            var13.field1400 = 1;
                            var13.field1402 = 0;
                            class56.method452((byte) -69, 0, arg0.field4176, var10, false, arg0.field4123);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg1 != -17370) {
            method1471(-78, true);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IC)Z")
    public static final boolean method1475(int arg0, char arg1) {
        field3444++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg0 < 121) {
            field3451 = null;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class241.field3733;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1476(byte arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        field3443++;
        if (arg0 != 62) {
            field3438 = null;
        }
        class236.method1588(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lja;I)V")
    public static final void method1477(class59 arg0, int arg1) {
        field3447++;
        class24 var2 = null;
        try {
            class248 var3 = arg0.method477(99, "runescape");
            while (var3.field3828 == 0) {
                class42.method354(1L, false);
            }
            if (var3.field3828 == 1) {
                var2 = (class24) var3.field3831;
                class37 var4 = class266.method1813(arg1);
                var2.method196(var4.field583, (byte) 109, var4.field588, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method199(126);
            }
        } catch (Exception var5) {
        }
        if (arg1 != 0) {
            field3449 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lka;B)V")
    public static final void method1478(class264 arg0, byte arg1) {
        field3446++;
        if (arg0.field4167 == 0) {
            return;
        }
        class8 var2 = arg0.method1801((byte) 116);
        if (arg0.field4140 != -1 && arg0.field4140 < 32768) {
            class32 var3 = class72.field1144[arg0.field4140];
            if (var3 != null) {
                int var4 = arg0.field4176 - var3.field4176;
                int var5 = arg0.field4123 - var3.field4123;
                if (var4 != 0 || var5 != 0) {
                    arg0.field4199 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field4140 >= 32768) {
            int var6 = arg0.field4140 - 32768;
            if (class294.field4623 == var6) {
                var6 = 2047;
            }
            class28 var7 = class41.field675[var6];
            if (var7 != null) {
                int var8 = arg0.field4176 - var7.field4176;
                int var9 = arg0.field4123 - var7.field4123;
                if (var8 != 0 || var9 != 0) {
                    arg0.field4199 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field4158 != 0 || arg0.field4128 != 0) && (arg0.field4208 == 0 || arg0.field4178 > 0)) {
            int var10 = arg0.field4176 - ((arg0.field4158 - class118.field1828 - class118.field1828) * 64);
            int var11 = arg0.field4123 - ((arg0.field4128 - (class129.field2008 + class129.field2008)) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field4199 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field4128 = 0;
            arg0.field4158 = 0;
        }
        int var12 = 66 / ((-arg1 - 40) / 48);
        int var13 = arg0.field4199 - arg0.field4159 & 0x7FF;
        if (var13 == 0) {
            arg0.field4205 = 0;
            arg0.field4183 = 0;
        } else if (var2.field171 == 0) {
            arg0.field4183++;
            if (var13 > 1024) {
                arg0.field4159 -= arg0.field4167;
                boolean var21 = true;
                if (arg0.field4167 > var13 || var13 > 2048 - arg0.field4167) {
                    var21 = false;
                    arg0.field4159 = arg0.field4199;
                }
                if (arg0.field4183 > 25 || var21) {
                    arg0.field4148 = var2.field165;
                    if (arg0.field4208 > 0) {
                        if (arg0.field4193[arg0.field4208 - 1] == 2) {
                            if (var2.field174 != -1) {
                                arg0.field4148 = var2.field174;
                            } else if (var2.field167 != -1) {
                                arg0.field4148 = var2.field167;
                            }
                        } else if (arg0.field4193[arg0.field4208 - 1] == 0) {
                            if (var2.field147 != -1) {
                                arg0.field4148 = var2.field147;
                            } else if (var2.field148 != -1) {
                                arg0.field4148 = var2.field148;
                            }
                        } else if (var2.field175 != -1) {
                            arg0.field4148 = var2.field175;
                        }
                    } else if (var2.field168 != -1) {
                        arg0.field4148 = var2.field168;
                    }
                }
            } else {
                arg0.field4159 += arg0.field4167;
                boolean var22 = true;
                if (arg0.field4167 > var13 || 2048 - arg0.field4167 < var13) {
                    var22 = false;
                    arg0.field4159 = arg0.field4199;
                }
                if (arg0.field4183 > 25 || var22) {
                    arg0.field4148 = var2.field165;
                    if (arg0.field4208 <= 0) {
                        if (var2.field169 != -1) {
                            arg0.field4148 = var2.field169;
                        }
                    } else if (arg0.field4193[arg0.field4208 - 1] == 2) {
                        if (var2.field150 != -1) {
                            arg0.field4148 = var2.field150;
                        } else if (var2.field167 != -1) {
                            arg0.field4148 = var2.field167;
                        }
                    } else if (arg0.field4193[arg0.field4208 - 1] == 0) {
                        if (var2.field154 != -1) {
                            arg0.field4148 = var2.field154;
                        } else if (var2.field148 != -1) {
                            arg0.field4148 = var2.field148;
                        }
                    } else if (var2.field138 != -1) {
                        arg0.field4148 = var2.field138;
                    }
                }
            }
            arg0.field4159 &= 0x7FF;
        } else {
            arg0.field4148 = -1;
            int var14 = arg0.field4199 << 5;
            if (arg0.field4147 != var14) {
                arg0.field4147 = var14;
                arg0.field4162 = 0;
                int var15 = arg0.field4205 * arg0.field4205 / (var2.field171 * 2);
                int var16 = var14 - arg0.field4173 & 0xFFFF;
                if (arg0.field4205 > 0 && var15 <= var16 && (var16 - var15) < 32768) {
                    arg0.field4154 = true;
                    arg0.field4133 = var16 / 2;
                    int var17 = var2.field170 * var2.field170 / (var2.field171 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (arg0.field4133 > var17) {
                        arg0.field4133 = var16 - var17;
                    }
                } else if (arg0.field4205 < 0 && 65536 - var16 >= var15 && (65536 - var16 - var15) < 32768) {
                    arg0.field4133 = (65536 - var16) / 2;
                    arg0.field4154 = true;
                    int var18 = var2.field170 * var2.field170 / (var2.field171 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (arg0.field4133 > var18) {
                        arg0.field4133 = 65536 - var18 - var16;
                    }
                } else {
                    arg0.field4154 = false;
                }
            }
            if (arg0.field4205 == 0) {
                int var19 = arg0.field4147 - arg0.field4173 & 0xFFFF;
                if (var2.field171 > var19) {
                    arg0.field4173 = arg0.field4147;
                } else {
                    arg0.field4154 = true;
                    int var20 = var2.field170 * var2.field170 / (var2.field171 * 2);
                    if (var20 > 32767) {
                        var20 = 32767;
                    }
                    arg0.field4162 = 0;
                    if (var19 >= 32768) {
                        arg0.field4133 = (65536 - var19) / 2;
                        arg0.field4205 = -var2.field171;
                        if (var20 < arg0.field4133) {
                            arg0.field4133 = 65536 - var19 - var20;
                        }
                    } else {
                        arg0.field4205 = var2.field171;
                        arg0.field4133 = var19 / 2;
                        if (arg0.field4133 > var20) {
                            arg0.field4133 = var19 - var20;
                        }
                    }
                }
            } else if (arg0.field4205 <= 0) {
                if (arg0.field4133 <= arg0.field4162) {
                    arg0.field4154 = false;
                }
                if (!arg0.field4154) {
                    arg0.field4205 += var2.field171;
                    if (arg0.field4205 > 0) {
                        arg0.field4205 = 0;
                    }
                } else if (arg0.field4205 > (-var2.field170)) {
                    arg0.field4205 -= var2.field171;
                }
            } else {
                if (arg0.field4162 >= arg0.field4133) {
                    arg0.field4154 = false;
                }
                if (!arg0.field4154) {
                    arg0.field4205 -= var2.field171;
                    if (arg0.field4205 < 0) {
                        arg0.field4205 = 0;
                    }
                } else if (arg0.field4205 < var2.field170) {
                    arg0.field4205 += var2.field171;
                }
            }
            arg0.field4173 += arg0.field4205;
            if (arg0.field4205 <= 0) {
                arg0.field4162 -= arg0.field4205;
            } else {
                arg0.field4162 += arg0.field4205;
            }
            arg0.field4173 &= 0xFFFF;
            arg0.field4159 = arg0.field4173 >> 5;
            if (arg0.field4205 >= 0) {
                if (arg0.field4208 > 0) {
                    if (arg0.field4193[arg0.field4208 - 1] == 2) {
                        if (var2.field150 != -1) {
                            arg0.field4148 = var2.field150;
                        } else if (var2.field167 != -1) {
                            arg0.field4148 = var2.field167;
                        }
                    } else if (arg0.field4193[arg0.field4208 - 1] == 0) {
                        if (var2.field154 != -1) {
                            arg0.field4148 = var2.field154;
                        } else if (var2.field148 != -1) {
                            arg0.field4148 = var2.field148;
                        }
                    }
                }
                if (arg0.field4148 == -1) {
                    if (var2.field138 != -1) {
                        arg0.field4148 = var2.field138;
                    } else if (var2.field169 != -1) {
                        arg0.field4148 = var2.field169;
                    }
                }
            } else {
                if (arg0.field4208 > 0) {
                    if (arg0.field4193[arg0.field4208 - 1] == 2) {
                        if (var2.field174 != -1) {
                            arg0.field4148 = var2.field174;
                        } else if (var2.field167 != -1) {
                            arg0.field4148 = var2.field167;
                        }
                    } else if (arg0.field4193[arg0.field4208 - 1] == 0) {
                        if (var2.field147 != -1) {
                            arg0.field4148 = var2.field147;
                        } else if (var2.field148 != -1) {
                            arg0.field4148 = var2.field148;
                        }
                    }
                }
                if (arg0.field4148 == -1) {
                    if (var2.field175 != -1) {
                        arg0.field4148 = var2.field175;
                    } else if (var2.field168 != -1) {
                        arg0.field4148 = var2.field168;
                    }
                }
            }
            if (arg0.field4148 == -1) {
                arg0.field4148 = var2.field165;
                return;
            }
        }
    }
}
