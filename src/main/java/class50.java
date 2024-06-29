import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class50 {

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public int field713 = -1;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "Z")
    public boolean field718 = false;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "[I")
    private int[] field710 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field707 = -1;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "[Lbk;")
    public static class126[] field719 = new class126[14];

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field714 = 0;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Ldb;")
    public static class102 field705 = new class102(2);

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "[I")
    private int[] field715;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "[S")
    private short[] field702;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "[S")
    private short[] field703;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[S")
    private short[] field704;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "[S")
    private short[] field720;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method320(int arg0) {
        field712++;
        boolean var2 = true;
        if (arg0 != -5612) {
            this.field704 = (short[]) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field710[var3] != -1 && !class119.field1811.method1269(0, this.field710[var3], (byte) -15)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 29)
    public static void method321(byte arg0) {
        if (arg0 != 76) {
            field705 = (class102) null;
        }
        field719 = null;
        field705 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V", line = 41)
    public static final void method322(int arg0, int arg1) {
        if (arg0 != -1) {
            field714 = -21;
        }
        if (class260.field4151 == arg1 && arg1 != 0) {
            class40 var2 = class174.field2890[arg1];
            var2.method72(class45.field626);
        }
        field721++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)Lgd;", line = 61)
    public final class134 method323(boolean arg0) {
        field706++;
        class134[] var2 = new class134[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field710[var4] != -1) {
                var2[var3++] = class134.method997(class119.field1811, this.field710[var4], 0);
            }
        }
        class134 var5 = new class134(var2, var3);
        if (this.field703 != null) {
            for (int var6 = 0; var6 < this.field703.length; var6++) {
                var5.method987(this.field703[var6], this.field704[var6]);
            }
        }
        if (arg0) {
            this.field715 = (int[]) null;
        }
        if (this.field720 != null) {
            for (int var7 = 0; var7 < this.field720.length; var7++) {
                var5.method984(this.field720[var7], this.field702[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)Lgd;", line = 119)
    public final class134 method324(boolean arg0) {
        field722++;
        if (this.field715 == null) {
            return null;
        }
        class134[] var2 = new class134[this.field715.length];
        int var3 = 0;
        if (arg0) {
            return (class134) null;
        }
        while (var3 < this.field715.length) {
            var2[var3] = class134.method997(class119.field1811, this.field715[var3], 0);
            var3++;
        }
        class134 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class134(var2, var2.length);
        }
        if (this.field703 != null) {
            for (int var5 = 0; var5 < this.field703.length; var5++) {
                var4.method987(this.field703[var5], this.field704[var5]);
            }
        }
        if (this.field720 != null) {
            for (int var6 = 0; var6 < this.field720.length; var6++) {
                var4.method984(this.field720[var6], this.field702[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljj;I)V", line = 188)
    public final void method325(class44 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method286((byte) -110);
            if (var3 == 0) {
                if (arg1 > -123) {
                    method322(68, 18);
                }
                field711++;
                return;
            }
            this.method329((byte) -98, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 206)
    public static final void method326(int arg0, Component arg1) {
        field709++;
        Method var2 = class124.field1949;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg0 != 9063) {
            field714 = -53;
        }
        arg1.addKeyListener(class29.field396);
        arg1.addFocusListener(class29.field396);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIB)V", line = 231)
    public static final void method327(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 93) {
            return;
        }
        if (class261.field4169 != 0 && arg0 != 0 && class135.field2148 < 50 && arg2 != -1) {
            class193.field3153[class135.field2148] = arg2;
            class265.field4285[class135.field2148] = arg0;
            class105.field1541[class135.field2148] = arg1;
            class343.field5333[class135.field2148] = null;
            class111.field1651[class135.field2148] = 0;
            class8.field116[class135.field2148] = arg3;
            class135.field2148++;
        }
        field716++;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(Z)Z", line = 258)
    public final boolean method328(boolean arg0) {
        field717++;
        if (this.field715 == null) {
            return true;
        } else if (arg0) {
            return false;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field715.length; var3++) {
                if (!class119.field1811.method1269(0, this.field715[var3], (byte) -60)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BILjj;)V", line = 298)
    private final void method329(byte arg0, int arg1, class44 arg2) {
        field708++;
        if (arg0 > -72) {
            field707 = -113;
        }
        if (arg1 == 1) {
            this.field713 = arg2.method286((byte) -103);
        } else if (arg1 == 2) {
            int var8 = arg2.method286((byte) -84);
            this.field715 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field715[var9] = arg2.method271(21081);
            }
        } else if (arg1 == 3) {
            this.field718 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method286((byte) -67);
            this.field704 = new short[var4];
            this.field703 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field703[var5] = (short) arg2.method271(21081);
                this.field704[var5] = (short) arg2.method271(21081);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method286((byte) -77);
            this.field702 = new short[var6];
            this.field720 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field720[var7] = (short) arg2.method271(21081);
                this.field702[var7] = (short) arg2.method271(21081);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field710[arg1 - 60] = arg2.method271(21081);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIZ)V", line = 374)
    public static final void method330(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class45.field633 = arg1;
        class158.field2618 = arg2;
        class116.field1765 = arg3;
        class66.field958 = new class204[arg0][class45.field633][class158.field2618];
        class97.field1380 = new int[arg0][class45.field633 + 1][class158.field2618 + 1];
        if (class232.field3690) {
            class340.field5292 = new class206[4][];
        }
        if (arg4) {
            class310.field4833 = new class204[1][class45.field633][class158.field2618];
            class280.field4519 = new int[class45.field633][class158.field2618];
            class189.field3099 = new int[1][class45.field633 + 1][class158.field2618 + 1];
            if (class232.field3690) {
                class310.field4840 = new class206[1][];
            }
        } else {
            class310.field4833 = (class204[][][]) null;
            class280.field4519 = (int[][]) null;
            class189.field3099 = (int[][][]) null;
            class310.field4840 = (class206[][]) null;
        }
        class295.method2107(false);
        class261.field4167 = new class20[500];
        class336.field5259 = 0;
        class81.field1135 = new class20[500];
        class64.field926 = 0;
        class130.field2057 = new int[arg0][class45.field633 + 1][class158.field2618 + 1];
        class94.field1291 = new class153[5000];
        class274.field4415 = 0;
        class243.field3843 = new class153[100];
        class213.field3485 = new boolean[class116.field1765 + class116.field1765 + 1][class116.field1765 + class116.field1765 + 1];
        class316.field4906 = new boolean[class116.field1765 + class116.field1765 + 2][class116.field1765 + class116.field1765 + 2];
        class201.field3272 = new byte[arg0][class45.field633][class158.field2618];
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lkb;Z)V", line = 425)
    public static final void method331(class204 arg0, boolean arg1) {
        class169.field2790.method1232(114, arg0);
        while (true) {
            class204 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class204[][] var7;
            class204 var78;
            do {
                class204 var77;
                do {
                    class204 var76;
                    do {
                        class204 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class204) class169.field2790.method1234((byte) 91);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3365);
                                            var3 = var2.field3340;
                                            var4 = var2.field3337;
                                            var5 = var2.field3350;
                                            var6 = var2.field3348;
                                            var7 = class324.field5032[var5];
                                            float var8 = 0.0F;
                                            if (class232.field3690) {
                                                if (class189.field3099 == class110.field1642) {
                                                    int var9 = class280.field4519[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class115.field1745 != var10) {
                                                        class115.field1745 = var10;
                                                        class212.method1532(var10, 2);
                                                        class87.method596(class208.method1508((byte) -69));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class131.field2077 != var11) {
                                                        class131.field2077 = var11;
                                                        class123.method885((byte) -126, var11);
                                                    }
                                                    int var12 = class97.field1380[0][var3 + 1][var4] + class97.field1380[0][var3][var4] + class97.field1380[0][var3][var4 + 1] + class97.field1380[0][var3 + 1][var4 + 1] >> 2;
                                                    class179.method1343(3, -var12, -3);
                                                    var8 = 201.5F;
                                                    class232.method1682(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class232.method1682(var8);
                                                }
                                            }
                                            if (!var2.field3352) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class204 var13 = class324.field5032[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field3365) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class224.field3578 && var3 > class85.field1186) {
                                                    class204 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field3365 && (var14.field3352 || (var2.field3354 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class224.field3578 && var3 < class197.field3207 - 1) {
                                                    class204 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field3365 && (var15.field3352 || (var2.field3354 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class177.field2951 && var4 > class180.field2983) {
                                                    class204 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field3365 && (var16.field3352 || (var2.field3354 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class177.field2951 && var4 < class113.field1720 - 1) {
                                                    class204 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field3365 && (var17.field3352 || (var2.field3354 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3352 = false;
                                            if (var2.field3341 != null) {
                                                class204 var18 = var2.field3341;
                                                if (class232.field3690) {
                                                    class232.method1682(201.5F - (float) (var18.field3348 + 1) * 50.0F);
                                                }
                                                if (var18.field3344 == null) {
                                                    if (var18.field3357 != null) {
                                                        if (class13.method77(0, var3, var4)) {
                                                            class34.method187(var18.field3357, class259.field4143, class137.field2162, class20.field286, class157.field2606, var3, var4, true);
                                                        } else {
                                                            class34.method187(var18.field3357, class259.field4143, class137.field2162, class20.field286, class157.field2606, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class13.method77(0, var3, var4)) {
                                                    class128.method926(var18.field3344, 0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var3, var4, true);
                                                } else {
                                                    class128.method926(var18.field3344, 0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var3, var4, false);
                                                }
                                                class225 var19 = var18.field3364;
                                                if (var19 != null) {
                                                    if (class232.field3690) {
                                                        if ((var19.field3597 & var2.field3363) == 0) {
                                                            class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                        } else {
                                                            class118.method815(var19.field3597, class298.field4704, class165.field2753, class172.field2866, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field3599.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var19.field3593 - class298.field4704, var19.field3605 - class165.field2753, var19.field3596 - class172.field2866, var19.field3595, var5, (class294) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field3360; var20++) {
                                                    class153 var21 = var18.field3343[var20];
                                                    if (var21 != null) {
                                                        if (class232.field3690) {
                                                            class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                        }
                                                        var21.field2373.method38(var21.field2369, class259.field4143, class137.field2162, class20.field286, class157.field2606, var21.field2368 - class298.field4704, var21.field2372 - class165.field2753, var21.field2359 - class172.field2866, var21.field2358, var5, (class294) null);
                                                    }
                                                }
                                                if (class232.field3690) {
                                                    class232.method1682(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field3344 == null) {
                                                if (var2.field3357 != null) {
                                                    if (class13.method77(var6, var3, var4)) {
                                                        class34.method187(var2.field3357, class259.field4143, class137.field2162, class20.field286, class157.field2606, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class34.method187(var2.field3357, class259.field4143, class137.field2162, class20.field286, class157.field2606, var3, var4, false);
                                                    }
                                                }
                                            } else if (class13.method77(var6, var3, var4)) {
                                                class128.method926(var2.field3344, var6, class259.field4143, class137.field2162, class20.field286, class157.field2606, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field3344.field414 != 12345678 || class116.field1768 && var5 <= class83.field1171) {
                                                    class128.method926(var2.field3344, var6, class259.field4143, class137.field2162, class20.field286, class157.field2606, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class113 var23 = var2.field3347;
                                                if (var23 != null && (var23.field1729 & 0x80000000L) != 0L) {
                                                    if (class232.field3690 && var23.field1734) {
                                                        class232.method1682(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class232.field3690) {
                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                    }
                                                    var23.field1728.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var23.field1730 - class298.field4704, var23.field1724 - class165.field2753, var23.field1733 - class172.field2866, var23.field1729, var5, (class294) null);
                                                    if (class232.field3690 && var23.field1734) {
                                                        class232.method1682(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class225 var26 = var2.field3364;
                                            class38 var27 = var2.field3342;
                                            if (var26 != null || var27 != null) {
                                                if (class224.field3578 == var3) {
                                                    var24++;
                                                } else if (class224.field3578 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class177.field2951 == var4) {
                                                    var24 += 3;
                                                } else if (class177.field2951 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class309.field4826[var24];
                                                var2.field3363 = class223.field3565[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field3597 & class142.field2222[var24]) == 0) {
                                                    var2.field3345 = 0;
                                                } else if (var26.field3597 == 16) {
                                                    var2.field3345 = 3;
                                                    var2.field3359 = class165.field2746[var24];
                                                    var2.field3351 = 3 - var2.field3359;
                                                } else if (var26.field3597 == 32) {
                                                    var2.field3345 = 6;
                                                    var2.field3359 = class86.field1196[var24];
                                                    var2.field3351 = 6 - var2.field3359;
                                                } else if (var26.field3597 == 64) {
                                                    var2.field3345 = 12;
                                                    var2.field3359 = class209.field3429[var24];
                                                    var2.field3351 = 12 - var2.field3359;
                                                } else {
                                                    var2.field3345 = 9;
                                                    var2.field3359 = class176.field2943[var24];
                                                    var2.field3351 = 9 - var2.field3359;
                                                }
                                                if ((var26.field3597 & var25) != 0 && !class84.method572(var6, var3, var4, var26.field3597)) {
                                                    if (class232.field3690) {
                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                    }
                                                    var26.field3599.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var26.field3593 - class298.field4704, var26.field3605 - class165.field2753, var26.field3596 - class172.field2866, var26.field3595, var5, (class294) null);
                                                }
                                                if ((var26.field3602 & var25) != 0 && !class84.method572(var6, var3, var4, var26.field3602)) {
                                                    if (class232.field3690) {
                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                    }
                                                    var26.field3594.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var26.field3593 - class298.field4704, var26.field3605 - class165.field2753, var26.field3596 - class172.field2866, var26.field3595, var5, (class294) null);
                                                }
                                            }
                                            if (var27 != null && !class101.method699(var6, var3, var4, var27.field485.method33())) {
                                                if (class232.field3690) {
                                                    class232.method1682(var8 - 0.5F);
                                                }
                                                if ((var27.field492 & var25) != 0) {
                                                    if (class232.field3690) {
                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                    }
                                                    var27.field485.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var27.field491 + var27.field487 - class298.field4704, var27.field486 - class165.field2753, var27.field483 + var27.field493 - class172.field2866, var27.field488, var5, (class294) null);
                                                } else if (var27.field492 == 256) {
                                                    int var28 = var27.field491 - class298.field4704;
                                                    int var29 = var27.field486 - class165.field2753;
                                                    int var30 = var27.field483 - class172.field2866;
                                                    int var31 = var27.field490;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class232.field3690) {
                                                            class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                        }
                                                        var27.field485.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var27.field487 + var28, var29, var27.field493 + var30, var27.field488, var5, (class294) null);
                                                    } else if (var27.field494 != null) {
                                                        if (class232.field3690) {
                                                            class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                        }
                                                        var27.field494.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var28, var29, var30, var27.field488, var5, (class294) null);
                                                    }
                                                }
                                                if (class232.field3690) {
                                                    class232.method1682(var8);
                                                }
                                            }
                                            if (var22) {
                                                class113 var34 = var2.field3347;
                                                if (var34 != null && (var34.field1729 & 0x80000000L) == 0L) {
                                                    if (class232.field3690 && var34.field1734) {
                                                        class232.method1682(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class232.field3690) {
                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                    }
                                                    var34.field1728.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var34.field1730 - class298.field4704, var34.field1724 - class165.field2753, var34.field1733 - class172.field2866, var34.field1729, var5, (class294) null);
                                                    if (class232.field3690 && var34.field1734) {
                                                        class232.method1682(var8);
                                                    }
                                                }
                                                class32 var35 = var2.field3349;
                                                if (var35 != null && var35.field438 == 0) {
                                                    if (class232.field3690) {
                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                    }
                                                    if (var35.field433 != null) {
                                                        var35.field433.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var35.field441 - class298.field4704, var35.field428 - class165.field2753, var35.field430 - class172.field2866, var35.field429, var5, (class294) null);
                                                    }
                                                    if (var35.field434 != null) {
                                                        var35.field434.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var35.field441 - class298.field4704, var35.field428 - class165.field2753, var35.field430 - class172.field2866, var35.field429, var5, (class294) null);
                                                    }
                                                    if (var35.field426 != null) {
                                                        var35.field426.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var35.field441 - class298.field4704, var35.field428 - class165.field2753, var35.field430 - class172.field2866, var35.field429, var5, (class294) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field3354;
                                            if (var36 != 0) {
                                                if (var3 < class224.field3578 && (var36 & 0x4) != 0) {
                                                    class204 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field3365) {
                                                        class169.field2790.method1232(96, var37);
                                                    }
                                                }
                                                if (var4 < class177.field2951 && (var36 & 0x2) != 0) {
                                                    class204 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field3365) {
                                                        class169.field2790.method1232(100, var38);
                                                    }
                                                }
                                                if (var3 > class224.field3578 && (var36 & 0x1) != 0) {
                                                    class204 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field3365) {
                                                        class169.field2790.method1232(120, var39);
                                                    }
                                                }
                                                if (var4 > class177.field2951 && (var36 & 0x8) != 0) {
                                                    class204 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field3365) {
                                                        class169.field2790.method1232(110, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3345 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field3360; var42++) {
                                                if (class146.field2275 != var2.field3343[var42].field2362 && (var2.field3355[var42] & var2.field3345) == var2.field3359) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class225 var43 = var2.field3364;
                                                if (!class84.method572(var6, var3, var4, var43.field3597)) {
                                                    if (class232.field3690) {
                                                        label882: {
                                                            if ((var43.field3595 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3593 - class298.field4704;
                                                                int var45 = var43.field3596 - class172.field2866;
                                                                int var46 = (int) (var43.field3595 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class158.field2618 - 1) {
                                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class45.field633 - 1 && var4 < class158.field2618 - 1) {
                                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class45.field633 - 1 && var4 > 0) {
                                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field3599.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var43.field3593 - class298.field4704, var43.field3605 - class165.field2753, var43.field3596 - class172.field2866, var43.field3595, var5, (class294) null);
                                                }
                                                var2.field3345 = 0;
                                            }
                                        }
                                        if (!var2.field3339) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field3360;
                                            var2.field3339 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class153 var50 = var2.field3343[var49];
                                                if (class146.field2275 != var50.field2362) {
                                                    for (int var51 = var50.field2371; var51 <= var50.field2355; var51++) {
                                                        for (int var52 = var50.field2366; var52 <= var50.field2361; var52++) {
                                                            class204 var53 = var7[var51][var52];
                                                            if (var53.field3352) {
                                                                var2.field3339 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field3345 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field2371) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field2355) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field2366) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field2361) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field3345) == var2.field3351) {
                                                                    var2.field3339 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class243.field3843[var48++] = var50;
                                                    int var55 = class224.field3578 - var50.field2371;
                                                    int var56 = var50.field2355 - class224.field3578;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class177.field2951 - var50.field2366;
                                                    int var58 = var50.field2361 - class177.field2951;
                                                    if (var58 > var57) {
                                                        var50.field2365 = var55 + var58;
                                                    } else {
                                                        var50.field2365 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class153 var62 = class243.field3843[var61];
                                                    if (class146.field2275 != var62.field2362) {
                                                        if (var62.field2365 > var59) {
                                                            var59 = var62.field2365;
                                                            var60 = var61;
                                                        } else if (var62.field2365 == var59) {
                                                            int var63 = var62.field2368 - class298.field4704;
                                                            int var64 = var62.field2359 - class172.field2866;
                                                            int var65 = class243.field3843[var60].field2368 - class298.field4704;
                                                            int var66 = class243.field3843[var60].field2359 - class172.field2866;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class153 var67 = class243.field3843[var60];
                                                var67.field2362 = class146.field2275;
                                                if (!class53.method339(var6, var67.field2371, var67.field2355, var67.field2366, var67.field2361, var67.field2373.method33())) {
                                                    if (class232.field3690) {
                                                        if ((var67.field2358 & 0xFC000L) == 147456L) {
                                                            class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                                                            int var68 = var67.field2368 - class298.field4704;
                                                            int var69 = var67.field2359 - class172.field2866;
                                                            int var70 = (int) (var67.field2358 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class118.method820(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class118.method820(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class118.method820(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class118.method820(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class118.method818(class298.field4704, class165.field2753, class172.field2866, var5, var67.field2371, var67.field2366, var67.field2355, var67.field2361);
                                                        }
                                                    }
                                                    var67.field2373.method38(var67.field2369, class259.field4143, class137.field2162, class20.field286, class157.field2606, var67.field2368 - class298.field4704, var67.field2372 - class165.field2753, var67.field2359 - class172.field2866, var67.field2358, var5, (class294) null);
                                                }
                                                for (int var71 = var67.field2371; var71 <= var67.field2355; var71++) {
                                                    for (int var72 = var67.field2366; var72 <= var67.field2361; var72++) {
                                                        class204 var73 = var7[var71][var72];
                                                        if (var73.field3345 != 0) {
                                                            class169.field2790.method1232(127, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field3365) {
                                                            class169.field2790.method1232(92, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3339) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field3339 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3365);
                            } while (var2.field3345 != 0);
                            if (var3 > class224.field3578 || var3 <= class85.field1186) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field3365);
                        if (var3 < class224.field3578 || var3 >= class197.field3207 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field3365);
                    if (var4 > class177.field2951 || var4 <= class180.field2983) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field3365);
                if (var4 < class177.field2951 || var4 >= class113.field1720 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field3365);
            var2.field3365 = false;
            class261.field4164--;
            class32 var79 = var2.field3349;
            if (var79 != null && var79.field438 != 0) {
                if (class232.field3690) {
                    class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                }
                if (var79.field433 != null) {
                    var79.field433.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var79.field441 - class298.field4704, var79.field428 - class165.field2753 - var79.field438, var79.field430 - class172.field2866, var79.field429, var5, (class294) null);
                }
                if (var79.field434 != null) {
                    var79.field434.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var79.field441 - class298.field4704, var79.field428 - class165.field2753 - var79.field438, var79.field430 - class172.field2866, var79.field429, var5, (class294) null);
                }
                if (var79.field426 != null) {
                    var79.field426.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var79.field441 - class298.field4704, var79.field428 - class165.field2753 - var79.field438, var79.field430 - class172.field2866, var79.field429, var5, (class294) null);
                }
            }
            if (var2.field3363 != 0) {
                class38 var80 = var2.field3342;
                if (var80 != null && !class101.method699(var6, var3, var4, var80.field485.method33())) {
                    if ((var80.field492 & var2.field3363) != 0) {
                        if (class232.field3690) {
                            class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                        }
                        var80.field485.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var80.field491 + var80.field487 - class298.field4704, var80.field486 - class165.field2753, var80.field483 + var80.field493 - class172.field2866, var80.field488, var5, (class294) null);
                    } else if (var80.field492 == 256) {
                        int var81 = var80.field491 - class298.field4704;
                        int var82 = var80.field486 - class165.field2753;
                        int var83 = var80.field483 - class172.field2866;
                        int var84 = var80.field490;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class232.field3690) {
                                class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                            }
                            var80.field485.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var80.field487 + var81, var82, var80.field493 + var83, var80.field488, var5, (class294) null);
                        } else if (var80.field494 != null) {
                            if (class232.field3690) {
                                class118.method817(class298.field4704, class165.field2753, class172.field2866, var5, var3, var4);
                            }
                            var80.field494.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var81, var82, var83, var80.field488, var5, (class294) null);
                        }
                    }
                }
                class225 var87 = var2.field3364;
                if (var87 != null) {
                    if ((var87.field3602 & var2.field3363) != 0 && !class84.method572(var6, var3, var4, var87.field3602)) {
                        if (class232.field3690) {
                            class118.method815(var87.field3602, class298.field4704, class165.field2753, class172.field2866, var6, var3, var4);
                        }
                        var87.field3594.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var87.field3593 - class298.field4704, var87.field3605 - class165.field2753, var87.field3596 - class172.field2866, var87.field3595, var5, (class294) null);
                    }
                    if ((var87.field3597 & var2.field3363) != 0 && !class84.method572(var6, var3, var4, var87.field3597)) {
                        if (class232.field3690) {
                            class118.method815(var87.field3597, class298.field4704, class165.field2753, class172.field2866, var6, var3, var4);
                        }
                        var87.field3599.method38(0, class259.field4143, class137.field2162, class20.field286, class157.field2606, var87.field3593 - class298.field4704, var87.field3605 - class165.field2753, var87.field3596 - class172.field2866, var87.field3595, var5, (class294) null);
                    }
                }
            }
            if (var5 < class205.field3373 - 1) {
                class204 var88 = class324.field5032[var5 + 1][var3][var4];
                if (var88 != null && var88.field3365) {
                    class169.field2790.method1232(108, var88);
                }
            }
            if (var3 < class224.field3578) {
                class204 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field3365) {
                    class169.field2790.method1232(88, var89);
                }
            }
            if (var4 < class177.field2951) {
                class204 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field3365) {
                    class169.field2790.method1232(92, var90);
                }
            }
            if (var3 > class224.field3578) {
                class204 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field3365) {
                    class169.field2790.method1232(99, var91);
                }
            }
            if (var4 > class177.field2951) {
                class204 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field3365) {
                    class169.field2790.method1232(124, var92);
                }
            }
        }
    }
}
