import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class95 extends class136 {

    @OriginalMember(owner = "client!nb", name = "Fb", descriptor = "Z")
    private boolean field1390 = false;

    @OriginalMember(owner = "client!nb", name = "Mb", descriptor = "I")
    private int field1397 = -1;

    @OriginalMember(owner = "client!nb", name = "Nb", descriptor = "Z")
    private volatile boolean field1398 = false;

    @OriginalMember(owner = "client!nb", name = "Lb", descriptor = "Lra;")
    private class69 field1396;

    @OriginalMember(owner = "client!nb", name = "xb", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!nb", name = "Vb", descriptor = "Lra;")
    private class69 field1406;

    @OriginalMember(owner = "client!nb", name = "Db", descriptor = "I")
    public static int field1388 = 100;

    @OriginalMember(owner = "client!nb", name = "Pb", descriptor = "Lqj;")
    public static class196 field1400 = class80.method502("Ladevorgang )2 bitte warten Sie)3", -48);

    @OriginalMember(owner = "client!nb", name = "Qb", descriptor = "[Lf;")
    public static class58[] field1401 = new class58[6];

    @OriginalMember(owner = "client!nb", name = "wb", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!nb", name = "yb", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!nb", name = "zb", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client!nb", name = "Ab", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!nb", name = "Bb", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!nb", name = "Eb", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!nb", name = "Gb", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client!nb", name = "Hb", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!nb", name = "Ib", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!nb", name = "Jb", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!nb", name = "Kb", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!nb", name = "Ob", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!nb", name = "Rb", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!nb", name = "Sb", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!nb", name = "Tb", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!nb", name = "Ub", descriptor = "Lhc;")
    public static class173 field1405;

    @OriginalMember(owner = "client!nb", name = "Cb", descriptor = "[Z")
    private volatile boolean[] field1387;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "[[I")
    public static int[][] field1380;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(II)V")
    public final void method585(int arg0, int arg1) {
        ++field1385;
        if (this.method820(-1, arg0)) {
            if (arg1 > -68) {
                this.method585(-99, 52);
            }
            class200.method1352(-322623056, arg0, this.field1382);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static void method586(int arg0) {
        field1380 = null;
        field1405 = null;
        field1400 = null;
        field1401 = null;
        if (arg0 != Integer.MAX_VALUE) {
            field1405 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)[Lwi;")
    public static final class233[] method587(int arg0) {
        ++field1403;
        class233[] var1 = new class233[class76.field1102];
        if (arg0 > -84) {
            method589(77, 102, -28);
        }
        for (int var2 = 0; var2 < class76.field1102; ++var2) {
            int var3 = class77.field1126[var2] * class31.field392[var2];
            byte[] var4 = class203.field3645[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; ~var6 > ~var3; ++var6) {
                var5[var6] = class84.field1237[class65.method409(var4[var6], 255)];
            }
            var1[var2] = new class233(class149.field2391, class92.field1347, class234.field4169[var2], class240.field4261[var2], class77.field1126[var2], class31.field392[var2], var5);
        }
        class168.method1099(false);
        return var1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I")
    public final int method588(boolean arg0) {
        ++field1402;
        if (this.field1398) {
            return 100;
        } else if (super.field2007 != null) {
            return 99;
        } else {
            int var2 = class258.method1735(this.field1382, 0, 255);
            if (var2 >= 100) {
                var2 = 99;
            }
            if (arg0) {
                field1380 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lra;Lra;IZZZ)V")
    public class95(class69 arg0, class69 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1396 = arg1;
        this.field1382 = arg2;
        this.field1406 = arg0;
        this.field1390 = arg5;
        class111.method662(this.field1382, 65, this);
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(III)I")
    public static final int method589(int arg0, int arg1, int arg2) {
        ++field1395;
        if (arg2 != -9799) {
            field1405 = null;
        }
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 - -1376312589;
        return (var5 & 133826106) >> 19;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(IB)V")
    public static final void method590(int arg0, byte arg1) {
        ++field1393;
        class233 var2;
        if (class149.field2376 != null) {
            var2 = (class233) class149.field2376;
        } else {
            var2 = new class233(512, 512);
        }
        int[] var3 = var2.field4151;
        int var4 = var3.length;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (-var6 + 103) * 4 * 512 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if (~(24 & class88.field1300[arg0][var25][var6]) == -1) {
                    class210.method1453(var3, var24, 512, arg0, var25, var6);
                }
                if (~arg0 > -4 && (8 & class88.field1300[arg0 + 1][var25][var6]) != 0) {
                    class210.method1453(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (228 + (int) (Math.random() * 20.0D) << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (20.0D * Math.random()) + 228;
        var2.method1561();
        if (arg1 == -32) {
            int var8 = 228 + (int) (Math.random() * 20.0D) << 16;
            for (int var9 = 1; ~var9 > -104; ++var9) {
                for (int var23 = 1; var23 < 103; ++var23) {
                    if ((class88.field1300[arg0][var23][var9] & 24) == 0) {
                        class220.method1500(var23, var9, arg0, var8, var7, false);
                    }
                    if (arg0 < 3 && (8 & class88.field1300[arg0 + 1][var23][var9]) != 0) {
                        class220.method1500(var23, var9, arg0 + 1, var8, var7, false);
                    }
                }
            }
            class251.field4439 = 0;
            for (int var10 = 0; ~var10 > -105; ++var10) {
                for (int var11 = 0; ~var11 > -105; ++var11) {
                    long var12 = class197.method1339(class27.field335, var10, var11);
                    if (var12 != 0L) {
                        class145 var14 = class83.method521((int) (var12 >>> 32) & Integer.MAX_VALUE, (byte) 95);
                        int var15 = var14.field2241;
                        if (var14.field2232 != null) {
                            for (int var16 = 0; var14.field2232.length > var16; ++var16) {
                                if (~var14.field2232[var16] != 0) {
                                    class145 var17 = class83.method521(var14.field2232[var16], (byte) 94);
                                    if (var17.field2241 >= 0) {
                                        var15 = var17.field2241;
                                        break;
                                    }
                                }
                            }
                        }
                        if (~var15 <= -1) {
                            int var18 = var11;
                            int var19 = var10;
                            if (var15 != 22 && ~var15 != -30 && var15 != 34 && var15 != 36 && ~var15 != -47 && ~var15 != -48 && var15 != 48) {
                                int[][] var20 = class188.field3298[class27.field335].field2462;
                                for (int var21 = 0; var21 < 10; ++var21) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (~var22 == -1 && var19 > 0 && ~var19 < ~(var10 + -3) && ~(19661064 & var20[var19 + -1][var18]) == -1) {
                                        --var19;
                                    }
                                    if (var22 == 1 && ~var19 > -104 && var10 - -3 > var19 && ~(19661184 & var20[var19 - -1][var18]) == -1) {
                                        ++var19;
                                    }
                                    if (var22 == 2 && ~var18 < -1 && var18 > var11 - 3 && ~(19661058 & var20[var19][var18 + -1]) == -1) {
                                        --var18;
                                    }
                                    if (var22 == 3 && ~var18 > -104 && var18 < var11 + 3 && ~(var20[var19][var18 + 1] & 19661088) == -1) {
                                        ++var18;
                                    }
                                }
                            }
                            class71.field1011[class251.field4439] = var14.field2244;
                            class154.field2492[class251.field4439] = var19;
                            class56.field697[class251.field4439] = var18;
                            ++class251.field4439;
                        }
                    }
                }
            }
            class149.field2376 = var2;
            class43.field490.method896((byte) -63);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)I")
    public static final int method591(boolean arg0) {
        if (arg0) {
            field1400 = null;
        }
        ++field1404;
        return 16;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZILra;I[B)V")
    public final void method592(boolean arg0, int arg1, class69 arg2, int arg3, byte[] arg4) {
        if (arg3 < -44) {
            ++field1386;
            if (this.field1396 != arg2) {
                if (!arg0 && this.field1397 == arg1) {
                    this.field1398 = true;
                }
                if (arg4 == null || ~arg4.length >= -3) {
                    this.field1387[arg1] = false;
                    if (this.field1390 || arg0) {
                        class256.method1726((byte) 2, -30, this, this.field1382, super.field1993[arg1], arg1, arg0);
                    }
                    return;
                }
                class58.field782.reset();
                class58.field782.update(arg4, 0, arg4.length + -2);
                int var6 = (int) class58.field782.getValue();
                int var7 = (arg4[arg4.length + -2] << 8 & 65280) - -(arg4[arg4.length - 1] & 255);
                if (super.field1993[arg1] != var6 || super.field2017[arg1] != var7) {
                    this.field1387[arg1] = false;
                    if (this.field1390 || arg0) {
                        class256.method1726((byte) 2, 99, this, this.field1382, super.field1993[arg1], arg1, arg0);
                    }
                    return;
                }
                this.field1387[arg1] = true;
                if (arg0) {
                    super.field2007[arg1] = class149.method938(arg4, false, true);
                    return;
                }
            } else {
                if (this.field1398) {
                    throw new RuntimeException();
                }
                if (arg4 == null) {
                    class256.method1726((byte) 0, 101, this, 255, this.field1384, this.field1382, true);
                    return;
                }
                class58.field782.reset();
                class58.field782.update(arg4, 0, arg4.length);
                int var8 = (int) class58.field782.getValue();
                if (~this.field1384 != ~var8) {
                    class256.method1726((byte) 0, 93, this, 255, this.field1384, this.field1382, true);
                    return;
                }
                class56 var9;
                try {
                    var9 = new class56(class227.method1539(48, arg4));
                } catch (RuntimeException var12) {
                    class256.method1726((byte) 0, 116, this, 255, this.field1384, this.field1382, true);
                    return;
                }
                int var10 = var9.method367(1);
                if (~var10 != -6 && var10 != 6) {
                    class256.method1726((byte) 0, 99, this, 255, this.field1384, this.field1382, true);
                    return;
                }
                int var11 = 0;
                if (~var10 <= -7) {
                    var11 = var9.method311(0);
                }
                if (this.field1391 != var11) {
                    class256.method1726((byte) 0, 99, this, 255, this.field1384, this.field1382, true);
                    return;
                }
                this.method849(false, arg4);
                this.method594(false);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)I")
    public final int method593(int arg0, int arg1) {
        ++field1399;
        if (!this.method820(-1, arg1)) {
            return 0;
        } else if (super.field2007[arg1] != null) {
            return 100;
        } else if (this.field1387[arg1]) {
            return 100;
        } else {
            if (arg0 != 0) {
                this.field1397 = 9;
            }
            return class258.method1735(arg1, 0, this.field1382);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V")
    private final void method594(boolean arg0) {
        this.field1387 = new boolean[super.field2007.length];
        if (arg0) {
            field1401 = null;
        }
        for (int var2 = 0; var2 < this.field1387.length; ++var2) {
            this.field1387[var2] = false;
        }
        ++field1389;
        if (this.field1406 == null) {
            this.field1398 = true;
        } else {
            this.field1397 = -1;
            for (int var3 = 0; this.field1387.length > var3; ++var3) {
                if (~super.field2003[var3] < -1) {
                    class179.method1178(this, this.field1406, var3, 1);
                    this.field1397 = var3;
                }
            }
            if (this.field1397 == -1) {
                this.field1398 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI[BZI)V")
    public final void method595(boolean arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field1394;
        if (!arg0) {
            arg2[arg2.length + -2] = (byte) (super.field2017[arg1] >> 8);
            arg2[arg2.length + -1] = (byte) super.field2017[arg1];
            if (this.field1406 != null) {
                class212.method1465(arg1, this.field1406, 0, arg2);
                this.field1387[arg1] = true;
            }
            if (arg3) {
                super.field2007[arg1] = class149.method938(arg2, false, true);
            }
        } else {
            if (this.field1398) {
                throw new RuntimeException();
            }
            if (this.field1396 != null) {
                class212.method1465(this.field1382, this.field1396, 0, arg2);
            }
            this.method849(false, arg2);
            this.method594(false);
        }
        if (arg4 <= 5) {
            method587(-69);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)V")
    public final void method596(int arg0, int arg1) {
        ++field1381;
        if (this.method820(-1, arg1)) {
            if (this.field1406 != null && this.field1387 != null && this.field1387[arg1]) {
                class47.method255(this.field1406, arg1, -61, this);
            } else {
                class256.method1726((byte) 2, arg0 + 23494, this, this.field1382, super.field1993[arg1], arg1, true);
            }
            if (arg0 != -23369) {
                this.method594(true);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(III)V")
    public final void method597(int arg0, int arg1, int arg2) {
        if (arg1 != 31219) {
            this.field1391 = -1;
        }
        this.field1384 = arg0;
        this.field1391 = arg2;
        ++field1383;
        if (this.field1396 == null) {
            class256.method1726((byte) 0, 120, this, 255, this.field1384, this.field1382, true);
        } else {
            class47.method255(this.field1396, this.field1382, -58, this);
        }
    }

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "(II)I")
    public static final int method598(int arg0, int arg1) {
        if (arg1 != -23628) {
            field1380 = null;
        }
        ++field1392;
        return arg0 & 255;
    }
}
