import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class270 implements Runnable {

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "[Lwi;")
    public volatile class195[] field4613 = new class195[2];

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Z")
    public volatile boolean field4607 = false;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Z")
    public volatile boolean field4609 = false;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lvm;")
    public static class297 field4611 = new class297(64);

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field4616 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lff;")
    public class4 field4614;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[B")
    public static byte[] field4615;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1864(int arg0) {
        class137.field2390 = 1;
        class57.field1052 = 0;
        class118.field2086 = -3;
        field4606++;
        class242.field4111 = false;
        class6.field99 = 0;
        class118.field2101 = arg0;
        class116.field2039 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lra;I)V", line = 21)
    public static final void method1865(class41 arg0, int arg1) {
        field4612++;
        byte[][] var2 = new byte[class40.field731][class154.field2753];
        int var3 = class297.field5148 >> 1;
        int var4 = class183.field3247 >> 2 << 10;
        while (arg0.field772.length > arg0.field738) {
            int var5 = 0;
            int var6 = 0;
            boolean var7 = false;
            if (arg0.method357(false) == 1) {
                var7 = true;
                var5 = arg0.method357(false);
                var6 = arg0.method357(false);
            }
            int var8 = arg0.method357(false);
            int var9 = arg0.method357(false);
            int var10 = var8 * 64 - class313.field5383;
            int var11 = class154.field2753 - (1 - class8.field133) - (var9 * 64);
            if (var10 >= 0 && var11 - 63 >= 0 && var10 + 63 < class40.field731 && var11 < class154.field2753) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var2[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var7 || var5 * 8 <= var12 && var5 * 8 + 8 > var12 && var14 >= (var6 * 8) && var6 * 8 + 8 > var14) {
                            var13[var11 - var14] = arg0.method323(9092);
                        }
                    }
                }
            } else if (var7) {
                arg0.field738 += 64;
            } else {
                arg0.field738 += 4096;
            }
        }
        int var15 = class40.field731;
        int var16 = class154.field2753;
        int[] var17 = new int[var16];
        if (arg1 != -3246) {
            field4616 = -72;
        }
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var15 > var24) {
                    int var25 = var2[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class53 var26 = class108.method762(-28, var25 - 1);
                        var17[var23] += var26.field973;
                        var18[var23] += var26.field966;
                        var21[var23] += var26.field971;
                        var19[var23] += var26.field976;
                        var10002 = var20[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var2[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class53 var29 = class108.method762(-27, var28 - 1);
                        var17[var23] -= var29.field973;
                        var18[var23] -= var29.field966;
                        var21[var23] -= var29.field971;
                        var19[var23] -= var29.field976;
                        var10002 = var20[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int var31 = 0;
                int[][] var32 = class254.field4354[var22 >> 6];
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    int var38 = var36 - 5;
                    if (var16 > var37) {
                        var33 += var21[var37];
                        var34 += var20[var37];
                        var30 += var17[var37];
                        var31 += var18[var37];
                        var35 += var19[var37];
                    }
                    if (var38 >= 0) {
                        var34 -= var20[var38];
                        var33 -= var21[var38];
                        var35 -= var19[var38];
                        var30 -= var17[var38];
                        var31 -= var18[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var32[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class189.method1375(var31 / var34, var33 / var34, var30 * 256 / var35, (byte) 53);
                        if (var2[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var32[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var4 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class150.method1123(var22, 63) + (class150.method1123(63, var36) << 6)] = class136.field2370[class119.method810(var42, 25709, 96)];
                        } else if (var39 != null) {
                            var39[(class150.method1123(63, var36) << 6) + class150.method1123(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 253)
    public static final void method1866(byte arg0) {
        class305.field5252.method2084(113);
        if (arg0 < 101) {
            method1867((byte) 18);
        }
        class9.field139.method2084(-71);
        class201.field3662.method2084(-28);
        field4608++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I", line = 267)
    public static final int method1867(byte arg0) {
        field4605++;
        if (arg0 >= -14) {
            field4611 = (class297) null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V", line = 309)
    public static final void method1868(int arg0, int arg1, int arg2) {
        field4610++;
        if (arg0 >= -82) {
            field4611 = (class297) null;
        }
        class77 var3 = class156.method1158(5, false, arg2);
        var3.method584(22992);
        var3.field1455 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 326)
    public static void method1869(boolean arg0) {
        if (arg0) {
            field4615 = null;
            field4611 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "run", descriptor = "()V", line = 340)
    public final void run() {
        field4604++;
        this.field4609 = true;
        try {
            while (!this.field4607) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class195 var2 = this.field4613[var1];
                    if (var2 != null) {
                        var2.method1415((byte) -102);
                    }
                }
                class46.method381(10L, 43);
                class274.method1896((byte) 124, (Object) null, this.field4614);
            }
        } catch (Exception var7) {
            class7.method48((String) null, (byte) 122, var7);
        } finally {
            this.field4609 = false;
        }
    }
}
