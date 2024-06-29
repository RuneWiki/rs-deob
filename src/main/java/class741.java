import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class741 implements Runnable {

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lvu;")
    private class677 field10397 = new class677();

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Z")
    private boolean field10401 = false;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field10402 = 0;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field10404;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field10389 = -1;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field10391;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field10392;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field10393;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field10394;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field10395;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field10396;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field10399;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field10400;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field10403;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "J")
    public static long field10390;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field10405;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILid;)Lob;")
    public final class4 method4146(int arg0, int arg1, class463 arg2) {
        field10395++;
        int var4 = 71 % ((arg0 + 59) / 47);
        class4 var5 = new class4();
        var5.field30 = 3;
        var5.field3444 = arg1;
        var5.field21 = arg2;
        var5.field6953 = false;
        this.method4149((byte) -124, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lha;BI)Z")
    public static final boolean method4147(class544 arg0, byte arg1, int arg2) {
        field10398++;
        int var3 = (class191.field3229 - 104) / 2;
        int var4 = (class314.field4720 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg2; var58 <= 3; var58++) {
                    if (class26.method147((byte) -34, var57, arg2, var58, var6)) {
                        int var59 = var58;
                        if (class584.method3365(false, var6, var57)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class681.method3798(var59, var57, var6, (byte) -43);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else if (arg1 == 22) {
            int[] var7 = new int[262144];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = -16777216;
            }
            class325.field4806 = arg0.method3185(0, var7, false, 512, 512, 512);
            class496.method3012((byte) -68);
            int var9 = ((int) (Math.random() * 20.0D)) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 16) + ((238 - -((int) (Math.random() * 20.0D))) + -10 << 8) + 238 - 10 | 0xFF000000;
            int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
            int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
            boolean[][] var12 = new boolean[class209.field3491 + 3][class209.field3491 + 2 + 1];
            for (int var13 = var3; var13 < (var3 + 104); var13 += class209.field3491) {
                for (int var36 = var4; var36 < (var4 + 104); var36 += class209.field3491) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (var13 > 0) {
                        var37 += 4;
                        var39 = var13 - 1;
                    }
                    int var40 = var36;
                    if (var36 > 0) {
                        var40 = var36 - 1;
                    }
                    int var41 = class209.field3491 + var13;
                    if (var41 < 104) {
                        var41++;
                    }
                    int var42 = class209.field3491 + var36;
                    if (var42 < 104) {
                        var42++;
                        var38 += 4;
                    }
                    arg0.method240(0, 0, class209.field3491 * 4 + var37, class209.field3491 * 4 + var38);
                    arg0.method1328(-16777216);
                    for (int var43 = arg2; var43 <= 3; var43++) {
                        for (int var50 = 0; var50 <= class209.field3491; var50++) {
                            for (int var56 = 0; var56 <= class209.field3491; var56++) {
                                var12[var50][var56] = class26.method147((byte) -55, var40 + var56, arg2, var43, var39 + var50);
                            }
                        }
                        class121.field1867[var43].method620(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class570.field8092) {
                            for (int var51 = -4; var51 < class209.field3491; var51++) {
                                for (int var52 = -4; var52 < class209.field3491; var52++) {
                                    int var53 = var13 + var51;
                                    int var54 = var36 + var52;
                                    if (var3 <= var53 && var4 <= var54 && class26.method147((byte) -106, var54, arg2, var43, var53)) {
                                        int var55 = var43;
                                        if (class584.method3365(false, var53, var54)) {
                                            var55 = var43 - 1;
                                        }
                                        if (var55 >= 0) {
                                            class555.method3235(arg0, var51 * 4 + var37, var54, (class209.field3491 - var52) * 4 + var38 - 4, var9, var10, var53, var55, 28937);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class570.field8092) {
                        class238 var44 = class247.field3958[arg2];
                        for (int var45 = 0; var45 < class209.field3491; var45++) {
                            for (int var46 = 0; var46 < class209.field3491; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                int var49 = var44.field3831[var47 - var44.field3832][var48 - var44.field3828];
                                if ((var49 & 0x40240000) != 0) {
                                    arg0.method3183(4, 4, -1713569622, (class209.field3491 - var46) * 4 + var38 - 4, arg1 + 36, var45 * 4 + var37);
                                } else if ((var49 & 0x800000) != 0) {
                                    arg0.method3188(4, -1713569622, var38 + ((class209.field3491 - var46) * 4) - 4, (byte) 66, var45 * 4 + var37);
                                } else if ((var49 & 0x2000000) != 0) {
                                    arg0.method3194(-21151, (class209.field3491 - var46) * 4 + var38 - 4, var45 * 4 + var37 + 3, -1713569622, 4);
                                } else if ((var49 & 0x8000000) != 0) {
                                    arg0.method3188(4, -1713569622, (class209.field3491 - var46) * 4 + var38 + 3 - 4, (byte) 32, var37 + (var45 * 4));
                                } else if ((var49 & 0x20000000) != 0) {
                                    arg0.method3194(arg1 ^ 0xFFFFAD77, (class209.field3491 - var46) * 4 + var38 - 4, var45 * 4 + var37, -1713569622, 4);
                                }
                            }
                        }
                    }
                    arg0.method410(var37, var38, class209.field3491 * 4, class209.field3491 * 4, var11, 2);
                    class325.field4806.method47((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class209.field3491 * 4), class209.field3491 * 4, class209.field3491 * 4, var37, var38);
                }
            }
            arg0.method374();
            arg0.method1328(-16777215);
            class353.method2259((byte) 80);
            class564.field7999 = 0;
            class384.field5758.method3465(0);
            if (!class570.field8092) {
                for (int var14 = var3; var14 < var3 + 104; var14++) {
                    for (int var20 = var4; var20 < (var4 + 104); var20++) {
                        for (int var21 = arg2; (arg2 + 1) >= var21 && var21 <= 3; var21++) {
                            if (class26.method147((byte) -101, var20, arg2, var21, var14)) {
                                class523 var22 = (class523) class558.method3243(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class523) class140.method1093(var21, var14, var20, field10405 == null ? (field10405 = method4154("tw")) : field10405);
                                }
                                if (var22 == null) {
                                    var22 = (class523) class486.method2948(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class523) class55.method521(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class595 var23 = class576.field8167.method3074(0, var22.method87(2836));
                                    if (!var23.field8421 || class384.field5763) {
                                        int var24 = var23.field8405;
                                        if (var23.field8351 != null) {
                                            for (int var25 = 0; var25 < var23.field8351.length; var25++) {
                                                if (var23.field8351[var25] != -1) {
                                                    class595 var26 = class576.field8167.method3074(0, var23.field8351[var25]);
                                                    if (var26.field8405 >= 0) {
                                                        var24 = var26.field8405;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class277 var28 = class617.field8704.method2550(var24, arg1 ^ 0x64);
                                                if (var28 != null && var28.field4238) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class247.field3958[var21].field3831;
                                                int var32 = class247.field3958[var21].field3832;
                                                int var33 = class247.field3958[var21].field3828;
                                                for (int var34 = 0; var34 < 10; var34++) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (var35 == 0 && var29 > var3 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                        var29--;
                                                    }
                                                    if (var35 == 1 && var29 < (var3 + 104 - 1) && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                        var29++;
                                                    }
                                                    if (var35 == 2 && var30 > var4 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                        var30--;
                                                    }
                                                    if (var35 == 3 && var4 + 104 - 1 > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                        var30++;
                                                    }
                                                }
                                            }
                                            class536.field7678[class564.field7999] = var23.field8386;
                                            class418.field6148[class564.field7999] = var29;
                                            class236.field3790[class564.field7999] = var30;
                                            class564.field7999++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class254.field4024 != null) {
                    class564.field7992.field6219 = 1;
                    class617.field8704.method2557(64, arg1 ^ 0x32, 1024);
                    for (int var15 = 0; var15 < class254.field4024.field9540; var15++) {
                        int var16 = class254.field4024.field9538[var15];
                        if ((var16 >> 28) == class145.field2251.field9470) {
                            int var17 = ((var16 & 0xFFFD637) >> 14) - class265.field4123;
                            int var18 = (var16 & 0x3FFF) - class723.field10155;
                            if (var17 >= 0 && class191.field3229 > var17 && var18 >= 0 && var18 < class314.field4720) {
                                class384.field5758.method3472(85, new class332(var15));
                            } else {
                                class277 var19 = class617.field8704.method2550(class254.field4024.field9537[var15], arg1 - 146);
                                if (var19.field4209 != null && var17 + var19.field4246 >= 0 && class191.field3229 > var17 + var19.field4213 && var19.field4208 + var18 >= 0 && (var18 + var19.field4214) < class314.field4720) {
                                    class384.field5758.method3472(107, new class332(var15));
                                }
                            }
                        }
                    }
                    class617.field8704.method2557(64, 36, 128);
                    class564.field7992.field6219 = 2;
                    class564.field7992.method2611((byte) 121);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)Lan;")
    public static final class134 method4148(boolean arg0, int arg1) {
        field10392++;
        if (arg1 >= 0 && arg1 < 100) {
            if (arg0) {
                method4151(true, null);
            }
            return class512.field7443[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLob;)V")
    private final void method4149(byte arg0, class4 arg1) {
        field10391++;
        class677 var3 = this.field10397;
        synchronized (this.field10397) {
            this.field10397.method3779(-14068, arg1);
            this.field10402++;
            if (arg0 < -93) {
                this.field10397.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field10401) {
            class677 var1 = this.field10397;
            class4 var2;
            synchronized (this.field10397) {
                var2 = (class4) this.field10397.method3775(30);
                if (var2 == null) {
                    try {
                        this.field10397.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field10402--;
            }
            try {
                if (var2.field30 == 2) {
                    var2.field21.method2835(var2.field29, (int) var2.field3444, var2.field29.length, (byte) 13);
                } else if (var2.field30 == 3) {
                    var2.field29 = var2.field21.method2837((int) var2.field3444, 5);
                }
            } catch (Exception var6) {
                class333.method2135(var6, null, -108);
            }
            var2.field6952 = false;
        }
        field10393++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILid;I)Lob;")
    public final class4 method4150(int arg0, class463 arg1, int arg2) {
        field10399++;
        class4 var4 = new class4();
        var4.field30 = 1;
        class677 var5 = this.field10397;
        synchronized (this.field10397) {
            if (arg2 != -8351) {
                method4147(null, (byte) 110, 92);
            }
            class4 var6 = (class4) this.field10397.method3772(true);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field3444 && var6.field21 == arg1 && var6.field30 == 2) {
                    var4.field6952 = false;
                    var4.field29 = var6.field29;
                    return var4;
                }
                var6 = (class4) this.field10397.method3780(23774);
            }
        }
        var4.field29 = arg1.method2837(arg0, 5);
        var4.field6953 = true;
        var4.field6952 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLpe;)V")
    public static final void method4151(boolean arg0, class109 arg1) {
        field10396++;
        if (arg0) {
            field10394 = 83;
        }
        int var2 = arg1.field1645 - class199.field3403;
        int var3 = arg1.field1608 * 512 + (arg1.method878(-5740) * 256);
        int var4 = arg1.field1619 * 512 + arg1.method878(-5740) * 256;
        arg1.field9475 += (var4 - arg1.field9475) / var2;
        arg1.field1703 = 0;
        arg1.field9477 += (var3 - arg1.field9477) / var2;
        if (arg1.field1666 == 0) {
            arg1.method897(8192, -118);
        }
        if (arg1.field1666 == 1) {
            arg1.method897(12288, -108);
        }
        if (arg1.field1666 == 2) {
            arg1.method897(0, -103);
        }
        if (arg1.field1666 == 3) {
            arg1.method897(4096, -76);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public final void method4152(int arg0) {
        field10403++;
        if (arg0 != -1) {
            this.field10402 = -91;
        }
        this.field10401 = true;
        class677 var2 = this.field10397;
        synchronized (this.field10397) {
            this.field10397.notifyAll();
        }
        try {
            this.field10404.join();
        } catch (InterruptedException var3) {
        }
        this.field10404 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[BLid;I)Lob;")
    public final class4 method4153(int arg0, byte[] arg1, class463 arg2, int arg3) {
        field10400++;
        class4 var5 = new class4();
        var5.field29 = arg1;
        var5.field3444 = arg3;
        var5.field21 = arg2;
        if (arg0 != -4539) {
            this.field10397 = null;
        }
        var5.field30 = 2;
        var5.field6953 = false;
        this.method4149((byte) -110, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lfc;)V")
    public class741(class731 arg0) {
        class162 var2 = arg0.method4066(-24533, this, 5);
        while (var2.field2512 == 0) {
            class484.method2932(true, 10L);
        }
        if (var2.field2512 == 2) {
            throw new RuntimeException();
        }
        this.field10404 = (Thread) var2.field2517;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4154(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
