import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class100 implements Runnable {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lmi;")
    private class408 field1347 = new class408();

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field1357 = new Thread(this);

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[Lle;")
    public static class65[] field1353 = new class65[16];

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field1355 = 0;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[I")
    public static int[] field1351 = new int[64];

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "[J")
    public static long[] field1346 = new long[32];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lvp;")
    public static class194 field1350;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "[I")
    public static int[] field1352;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lnr;ILqj;)V", line = 3)
    public static final void method675(class437 arg0, int arg1, class238 arg2) {
        field1354++;
        class25[] var3 = class25.method222(arg2, class402.field5981, 0);
        class280.field4124 = new class243[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class280.field4124[var4] = arg0.method2166(var3[var4], true);
        }
        class25[] var5 = class25.method222(arg2, class306.field4373, 0);
        class50.field697 = new class243[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class50.field697[var6] = arg0.method2166(var5[var6], true);
        }
        class25[] var7 = class25.method222(arg2, class425.field6319, 0);
        class407.field6100 = new class243[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class407.field6100[var8] = arg0.method2166(var7[var8], true);
        }
        class25[] var9 = class25.method222(arg2, class165.field2143, 0);
        class420.field6263 = new class243[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class420.field6263[var10] = arg0.method2166(var9[var10], true);
        }
        class25[] var11 = class25.method222(arg2, class219.field3102, 0);
        class384.field5747 = new class243[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class384.field5747[var12] = arg0.method2166(var11[var12], true);
        }
        class25[] var13 = class25.method222(arg2, class213.field3021, 0);
        class188.field2553 = new class243[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class188.field2553[var14] = arg0.method2166(var13[var14], true);
        }
        class25[] var15 = class25.method222(arg2, class169.field2217, 0);
        class30.field518 = new class243[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class30.field518[var16] = arg0.method2166(var15[var16], true);
        }
        class25[] var17 = class25.method222(arg2, class232.field3278, 0);
        class320.field4573 = new class243[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class320.field4573[var18] = arg0.method2166(var17[var18], true);
        }
        class25[] var19 = class25.method222(arg2, class106.field1423, 0);
        class193.field2718 = new class243[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class193.field2718[var20] = arg0.method2166(var19[var20], true);
        }
        class25[] var21 = class25.method222(arg2, class91.field1265, 0);
        class328.field4712 = new class243[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class328.field4712[var22] = arg0.method2166(var21[var22], true);
        }
        class25[] var23 = class25.method222(arg2, class119.field1603, 0);
        class197.field2825 = new class243[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class197.field2825[var24] = arg0.method2166(var23[var24], true);
        }
        class25[] var25 = class25.method222(arg2, class125.field1659, 0);
        class152.field1983 = new class243[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class152.field1983[var26] = arg0.method2166(var25[var26], true);
        }
        class25[] var27 = class25.method222(arg2, class437.field6412, 0);
        class246.field3425 = new class243[var27.length];
        if (arg1 != -31889) {
            method680(-117, (byte) -33);
        }
        for (int var28 = 0; var28 < var27.length; var28++) {
            class246.field3425[var28] = arg0.method2166(var27[var28], true);
        }
        class115.field1563 = arg0.method2166(class25.method225(arg2, class132.field1774, 0), true);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I", line = 136)
    public static final int method676(byte arg0) {
        field1341++;
        return arg0 >= -37 ? -87 : 15;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILo;)V", line = 150)
    private final void method677(int arg0, class393 arg1) {
        class408 var3 = this.field1347;
        synchronized (this.field1347) {
            this.field1347.method2660((byte) -122, arg1);
            this.field1347.notify();
            if (arg0 != 85) {
                field1352 = null;
            }
        }
        field1356++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIZII)V", line = 164)
    public static final void method678(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1340++;
        int var6 = arg2 - arg1;
        int var7 = arg5 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class340.method2252(7787, arg1, arg5, arg0, arg4);
            }
        } else if (var7 == 0) {
            class160.method1009(arg4, arg0, arg2, arg1, (byte) 31);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (arg1 < class203.field2942) {
                var10 = var9 + (class203.field2942 * var8 >> 12);
                var11 = class203.field2942;
            } else if (class297.field4268 >= arg1) {
                var10 = arg4;
                var11 = arg1;
            } else {
                var10 = (class297.field4268 * var8 >> 12) + var9;
                var11 = class297.field4268;
            }
            int var12;
            int var13;
            if (class203.field2942 > arg2) {
                var13 = (class203.field2942 * var8 >> 12) + var9;
                var12 = class203.field2942;
            } else if (arg2 <= class297.field4268) {
                var12 = arg2;
                var13 = arg5;
            } else {
                var12 = class297.field4268;
                var13 = (class297.field4268 * var8 >> 12) + var9;
            }
            if (class180.field2375 > var10) {
                var10 = class180.field2375;
                var11 = (class180.field2375 - var9 << 12) / var8;
            } else if (class50.field695 < var10) {
                var10 = class50.field695;
                var11 = (class50.field695 - var9 << 12) / var8;
            }
            if (class180.field2375 > var13) {
                var12 = (class180.field2375 - var9 << 12) / var8;
                var13 = class180.field2375;
            } else if (class50.field695 < var13) {
                var13 = class50.field695;
                var12 = (class50.field695 - var9 << 12) / var8;
            }
            class265.method1660(var11, var12, arg3, var13, arg0, var10);
        }
    }

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V", line = 262)
    public final void run() {
        field1339++;
        while (true) {
            class408 var1 = this.field1347;
            class410 var3;
            synchronized (this.field1347) {
                class393 var2;
                for (var2 = this.field1347.method2647((byte) 93); var2 == null; var2 = this.field1347.method2647((byte) 93)) {
                    try {
                        this.field1347.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class410)) {
                    return;
                }
                var3 = (class410) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field6137).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field6138 = var5;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lfl;Lnr;I)V", line = 300)
    public static final void method679(class386 arg0, class437 arg1, int arg2) {
        field1343++;
        if (arg2 != -4648) {
            method675((class437) null, -17, (class238) null);
        }
        if (class76.field1019 == null) {
            return;
        }
        if (class424.field6305 < 10) {
            if (!class76.field1021.method1453((byte) 58, class76.field1019.field2325)) {
                class424.field6305 = class300.field4299.method1470(class76.field1019.field2325, 0) / 10;
                return;
            }
            class259.method1629((byte) -56);
            class424.field6305 = 10;
        }
        if (class424.field6305 == 10) {
            class76.field1044 = class76.field1019.field2323 >> 6 << 6;
            class76.field1041 = class76.field1019.field2322 >> 6 << 6;
            class76.field1046 = (class76.field1019.field2315 >> 6 << 6) + 64 - class76.field1044;
            class76.field1032 = (class76.field1019.field2332 >> 6 << 6) + 64 - class76.field1041;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class76.field1019.method1079(-120, class184.field2482 + (field1350.field5284 >> 7), class193.field2688, (field1350.field5298 >> 7) + class38.field620, var3)) {
                var5 = var3[2] - class76.field1044;
                var4 = var3[1] - class76.field1041;
            }
            if (!class66.field941 && var4 >= 0 && class76.field1032 > var4 && var5 >= 0 && class76.field1046 > var5) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class133.field1778 = var6;
                class169.field2222 = var7;
            } else if (class108.field1486 == -1 || class268.field3928 == -1) {
                class76.field1019.method1083((class76.field1019.field2329 & 0xFFFDFFB) >> 14, var3, class76.field1019.field2329 & 0x3FFF, -1);
                class133.field1778 = var3[2] - class76.field1044;
                class169.field2222 = var3[1] - class76.field1041;
            } else {
                class76.field1019.method1083(class108.field1486, var3, class268.field3928, arg2 ^ 0x1227);
                if (var3 != null) {
                    class133.field1778 = var3[2] - class76.field1044;
                    class169.field2222 = var3[1] - class76.field1041;
                }
                class268.field3928 = -1;
                class108.field1486 = -1;
                class66.field941 = false;
            }
            if (class76.field1019.field2334 == 37) {
                class76.field1027 = 3.0F;
                class76.field1026 = 3.0F;
            } else if (class76.field1019.field2334 == 50) {
                class76.field1027 = 4.0F;
                class76.field1026 = 4.0F;
            } else if (class76.field1019.field2334 == 75) {
                class76.field1027 = 6.0F;
                class76.field1026 = 6.0F;
            } else if (class76.field1019.field2334 == 100) {
                class76.field1027 = 8.0F;
                class76.field1026 = 8.0F;
            } else if (class76.field1019.field2334 == 200) {
                class76.field1027 = 16.0F;
                class76.field1026 = 16.0F;
            } else {
                class76.field1027 = 8.0F;
                class76.field1026 = 8.0F;
            }
            class76.field1030 = (int) class76.field1027 >> 1;
            class76.field1029 = class57.method389(class76.field1030, -1);
            class363.method2383(125);
            class76.method485();
            class106.field1425 = new class408();
            class76.field1025 += (int) (Math.random() * 5.0D) - 2;
            if (class76.field1025 < -8) {
                class76.field1025 = -8;
            }
            if (class76.field1025 > 8) {
                class76.field1025 = 8;
            }
            class76.field1023 += (int) (Math.random() * 5.0D) - 2;
            if (class76.field1023 < -16) {
                class76.field1023 = -16;
            }
            if (class76.field1023 > 16) {
                class76.field1023 = 16;
            }
            class76.method476(arg0, class76.field1025 >> 2 << 10, class76.field1023 >> 1);
            class292.method1872(1024, 256, -60);
            class391.method2557(256, 256, (byte) 0);
            class101.method686(-4028, 4096);
            class258.method1626(arg2 ^ 0x1227, 256);
            class424.field6305 = 20;
        } else if (class424.field6305 == 20) {
            class315.method1966((byte) 44, true);
            class76.method481(arg1, class76.field1025, class76.field1023);
            class424.field6305 = 60;
            class315.method1966((byte) 104, true);
            class16.method112(arg2 ^ 0x1227);
        } else if (class424.field6305 == 60) {
            if (class76.field1021.method1479(-1, class76.field1019.field2325 + "_staticelements")) {
                if (!class76.field1021.method1453((byte) 58, class76.field1019.field2325 + "_staticelements")) {
                    return;
                }
                class76.field1022 = class227.method1410(class76.field1019.field2325 + "_staticelements", class76.field1021, (byte) 61, class17.field208);
            } else {
                class76.field1022 = new class396(0);
            }
            class76.method470();
            class424.field6305 = 70;
            class315.method1966((byte) -119, true);
            class16.method112(-1);
        } else if (class424.field6305 == 70) {
            class319.field4569 = new class378(arg1, 11, true, class319.field4561);
            class424.field6305 = 73;
            class315.method1966((byte) -125, true);
            class16.method112(-1);
        } else if (class424.field6305 == 73) {
            class50.field696 = new class378(arg1, 12, true, class319.field4561);
            class424.field6305 = 76;
            class315.method1966((byte) 65, true);
            class16.method112(-1);
        } else if (class424.field6305 == 76) {
            class339.field4990 = new class378(arg1, 14, true, class319.field4561);
            class424.field6305 = 79;
            class315.method1966((byte) 86, true);
            class16.method112(-1);
        } else if (class424.field6305 == 79) {
            class124.field1655 = new class378(arg1, 17, true, class319.field4561);
            class424.field6305 = 82;
            class315.method1966((byte) 116, true);
            class16.method112(-1);
        } else if (class424.field6305 == 82) {
            class106.field1418 = new class378(arg1, 19, true, class319.field4561);
            class424.field6305 = 85;
            class315.method1966((byte) -124, true);
            class16.method112(-1);
        } else if (class424.field6305 == 85) {
            class1.field8 = new class378(arg1, 22, true, class319.field4561);
            class424.field6305 = 88;
            class315.method1966((byte) -127, true);
            class16.method112(-1);
        } else if (class424.field6305 == 88) {
            class437.field6421 = new class378(arg1, 26, true, class319.field4561);
            class424.field6305 = 91;
            class315.method1966((byte) 79, true);
            class16.method112(arg2 ^ 0x1227);
        } else {
            class312.field4473 = new class378(arg1, 30, true, class319.field4561);
            class424.field6305 = 100;
            class315.method1966((byte) 108, true);
            class16.method112(-1);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V", line = 533)
    public static final void method680(int arg0, byte arg1) {
        field1349++;
        class363 var2 = (class363) class157.field2069.method954(123, (long) arg0);
        if (var2 == null) {
            return;
        }
        if (arg1 < 17) {
            method679((class386) null, (class437) null, 120);
        }
        for (int var3 = 0; var3 < var2.field5302.length; var3++) {
            var2.field5302[var3] = -1;
            var2.field5312[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 567)
    public static void method681(byte arg0) {
        field1350 = null;
        field1346 = null;
        field1351 = null;
        field1353 = null;
        field1352 = null;
        if (arg0 <= 123) {
            field1353 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IB)I", line = 591)
    public static final int method682(int arg0, byte arg1) {
        if (arg1 != -43) {
            method682(-22, (byte) -58);
        }
        field1348++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 602)
    public final void method683(int arg0) {
        field1342++;
        if (this.field1357 == null) {
            return;
        }
        this.method677(85, new class393());
        try {
            this.field1357.join();
        } catch (InterruptedException var2) {
        }
        if (arg0 != -11400) {
            field1358 = -104;
        }
        this.field1357 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;Z)Lsa;", line = 621)
    public final class410 method684(String arg0, boolean arg1) {
        field1344++;
        if (this.field1357 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class410 var3 = new class410(arg0);
            if (arg1) {
                return null;
            } else {
                this.method677(85, var3);
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 653)
    public class100() {
        this.field1357.setDaemon(true);
        this.field1357.start();
    }
}
