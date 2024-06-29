import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class79 {

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    private int field1357 = 0;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[Lgd;")
    public class141[] field1343;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lhi;")
    public static class82 field1340 = class95.method664((byte) -108, "leuchten3:");

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[I")
    public static int[] field1342 = new int[4096];

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lhi;")
    public static class82 field1349 = class95.method664((byte) -52, "overlay2");

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "J")
    public static long field1353 = 0L;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "Lhi;")
    public static class82 field1360 = class95.method664((byte) -96, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "J")
    private long field1347;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lgd;")
    private class141 field1351;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Lgd;")
    private class141 field1355;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)Z", line = 4)
    public static final boolean method493(boolean arg0) {
        field1346++;
        if (arg0) {
            return false;
        } else if (class77.field1324 == 0) {
            return class86.field1537.method1437(16);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)Lgd;", line = 24)
    public final class141 method494(boolean arg0) {
        field1344++;
        if (this.field1357 > 0 && this.field1343[this.field1357 - 1] != this.field1355) {
            class141 var2 = this.field1355;
            this.field1355 = var2.field2423;
            return var2;
        }
        class141 var3;
        do {
            if (this.field1357 >= this.field1336) {
                if (!arg0) {
                    this.method494(true);
                }
                return null;
            }
            var3 = this.field1343[this.field1357++].field2423;
        } while (this.field1343[this.field1357 - 1] == var3);
        this.field1355 = var3.field2423;
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[Lgd;)I", line = 58)
    public final int method495(int arg0, class141[] arg1) {
        field1339++;
        int var3 = 0;
        if (arg0 != 4) {
            this.method498(-102);
        }
        for (int var4 = 0; var4 < this.field1336; var4++) {
            class141 var5 = this.field1343[var4];
            for (class141 var6 = var5.field2423; var6 != var5; var6 = var6.field2423) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 91)
    public final void method496(byte arg0) {
        field1335++;
        for (int var2 = 0; var2 < this.field1336; var2++) {
            class141 var3 = this.field1343[var2];
            while (true) {
                class141 var4 = var3.field2423;
                if (var3 == var4) {
                    break;
                }
                var4.method961((byte) 80);
            }
        }
        if (arg0 >= 12) {
            this.field1351 = null;
            this.field1355 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lbc;B)V", line = 124)
    public static final void method497(class153 arg0, byte arg1) {
        int var2 = -70 / ((58 - arg1) / 54);
        field1350++;
        while (true) {
            while (arg0.field2611 < arg0.field2598.length) {
                int var3 = 0;
                boolean var4 = false;
                int var5 = 0;
                if (arg0.method1082(-107) == 1) {
                    var5 = arg0.method1082(-59);
                    var3 = arg0.method1082(-53);
                    var4 = true;
                }
                int var6 = arg0.method1082(-50);
                int var7 = arg0.method1082(-79);
                int var8 = class157.field2719 + class17.field181 - (var7 * 64) - 1;
                int var9 = var6 * 64 - class166.field2905;
                if (var9 >= 0 && (var8 - 63) >= 0 && class244.field4242 > var9 + 63 && class157.field2719 > var8) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var4 || var5 * 8 <= var12 && var12 < (var5 * 8 + 8) && var13 >= var3 * 8 && var13 < (var3 * 8 + 8)) {
                                byte var14 = arg0.method1104(-1);
                                if (var14 != 0) {
                                    if (class283.field4756[var11][var10] == null) {
                                        class283.field4756[var11][var10] = new byte[4096];
                                    }
                                    class283.field4756[var11][var10][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method1104(-1);
                                    if (class44.field767[var11][var10] == null) {
                                        class44.field767[var11][var10] = new byte[4096];
                                    }
                                    class44.field767[var11][var10][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var4 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method1104(-1);
                        if (var17 != 0) {
                            arg0.field2611++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lgd;", line = 225)
    public final class141 method498(int arg0) {
        field1356++;
        if (this.field1351 == null) {
            return null;
        }
        class141 var2 = this.field1343[(int) (this.field1347 & (long) (this.field1336 - 1))];
        if (arg0 != -29646) {
            this.field1357 = 45;
        }
        while (this.field1351 != var2) {
            if (this.field1351.field2418 == this.field1347) {
                class141 var3 = this.field1351;
                this.field1351 = this.field1351.field2423;
                return var3;
            }
            this.field1351 = this.field1351.field2423;
        }
        this.field1351 = null;
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBIIIIII)V", line = 264)
    public static final void method499(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -65) {
            return;
        }
        if (arg2 >= 0 && arg7 >= 0 && arg2 < 103 && arg7 < 103) {
            if (arg0 == 0) {
                class90 var8 = class137.method932(arg3, arg2, arg7);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field1622 >>> 32);
                    if (arg6 == 2) {
                        var8.field1626 = new class160(var9, 2, arg4 + 4, arg3, arg2, arg7, arg5, false, var8.field1626);
                        var8.field1617 = new class160(var9, 2, arg4 + 1 & 0x3, arg3, arg2, arg7, arg5, false, var8.field1617);
                    } else {
                        var8.field1626 = new class160(var9, arg6, arg4, arg3, arg2, arg7, arg5, false, var8.field1626);
                    }
                }
            }
            if (arg0 == 1) {
                class182 var10 = class199.method1392(arg3, arg2, arg7);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field3106 >>> 32);
                    if (arg6 == 4 || arg6 == 5) {
                        var10.field3103 = new class160(var11, 4, arg4, arg3, arg2, arg7, arg5, false, var10.field3103);
                    } else if (arg6 == 6) {
                        var10.field3103 = new class160(var11, 4, arg4 + 4, arg3, arg2, arg7, arg5, false, var10.field3103);
                    } else if (arg6 == 7) {
                        var10.field3103 = new class160(var11, 4, (arg4 + 2 & 0x3) + 4, arg3, arg2, arg7, arg5, false, var10.field3103);
                    } else if (arg6 == 8) {
                        var10.field3103 = new class160(var11, 4, arg4 + 4, arg3, arg2, arg7, arg5, false, var10.field3103);
                        var10.field3107 = new class160(var11, 4, (arg4 + 2 & 0x3) + 4, arg3, arg2, arg7, arg5, false, var10.field3107);
                    }
                }
            }
            if (arg0 == 2) {
                class69 var12 = class296.method2047(arg3, arg2, arg7);
                if (arg6 == 11) {
                    arg6 = 10;
                }
                if (var12 != null) {
                    var12.field1075 = new class160(Integer.MAX_VALUE & (int) (var12.field1064 >>> 32), arg6, arg4, arg3, arg2, arg7, arg5, false, var12.field1075);
                }
            }
            if (arg0 == 3) {
                class123 var13 = class305.method2112(arg3, arg2, arg7);
                if (var13 != null) {
                    var13.field2150 = new class160((int) (var13.field2153 >>> 32) & Integer.MAX_VALUE, 22, arg4, arg3, arg2, arg7, arg5, false, var13.field2150);
                }
            }
        }
        field1358++;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V", line = 358)
    public class79(int arg0) {
        this.field1336 = arg0;
        this.field1343 = new class141[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class141 var3 = this.field1343[var2] = new class141();
            var3.field2422 = var3;
            var3.field2423 = var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)I", line = 380)
    public final int method500(int arg0) {
        field1354++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -5) {
            return -69;
        }
        while (this.field1336 > var3) {
            class141 var4 = this.field1343[var3];
            class141 var5 = var4.field2423;
            while (var4 != var5) {
                var5 = var5.field2423;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V", line = 415)
    public static final void method501(int arg0, byte arg1) {
        class138.field2365.method2177(arg0, -125);
        class285.field4796.method2177(arg0, 27);
        if (arg1 != 104) {
            method497((class153) null, (byte) -12);
        }
        field1352++;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Lgd;", line = 437)
    public final class141 method502(byte arg0) {
        if (arg0 != -104) {
            this.field1355 = (class141) null;
        }
        this.field1357 = 0;
        field1337++;
        return this.method494(true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JILgd;)V", line = 450)
    public final void method503(long arg0, int arg1, class141 arg2) {
        field1345++;
        if (arg1 > -42) {
            method506((byte) -72);
        }
        if (arg2.field2422 != null) {
            arg2.method961((byte) 111);
        }
        class141 var5 = this.field1343[(int) ((long) (this.field1336 - 1) & arg0)];
        arg2.field2423 = var5;
        arg2.field2418 = arg0;
        arg2.field2422 = var5.field2422;
        arg2.field2422.field2423 = arg2;
        arg2.field2423.field2422 = arg2;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V", line = 470)
    public static void method504(int arg0) {
        field1340 = null;
        field1360 = null;
        if (arg0 == 14805) {
            field1342 = null;
            field1349 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)I", line = 485)
    public final int method505(int arg0) {
        int var2 = 16 / ((arg0 + 23) / 41);
        field1348++;
        return this.field1336;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V", line = 494)
    public static final void method506(byte arg0) {
        class133 var1 = class254.field4368;
        synchronized (class254.field4368) {
            class112.field2035++;
            class272.field4579 = class80.field1367;
            class211.field3702 = class276.field4645;
            class202.field3471 = class330.field5622;
            class229.field3953 = class244.field4244;
            if (arg0 <= 124) {
                method499(-13, (byte) -57, 105, 25, -72, -123, 9, 92);
            }
            class166.field2904 = class135.field2335;
            class255.field4394 = class168.field2925;
            class179.field3063 = class212.field3712;
            class244.field4244 = 0;
        }
        field1359++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JI)Lgd;", line = 525)
    public final class141 method507(long arg0, int arg1) {
        this.field1347 = arg0;
        field1341++;
        class141 var4 = this.field1343[(int) ((long) (this.field1336 - 1) & arg0)];
        if (arg1 != 602425312) {
            return (class141) null;
        }
        for (this.field1351 = var4.field2423; this.field1351 != var4; this.field1351 = this.field1351.field2423) {
            if (this.field1351.field2418 == arg0) {
                class141 var5 = this.field1351;
                this.field1351 = this.field1351.field2423;
                return var5;
            }
        }
        this.field1351 = null;
        return null;
    }
}
