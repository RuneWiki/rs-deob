import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class50 extends class194 {

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    private int field576 = 3216;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    private int field577 = 4096;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "[I")
    private int[] field580 = new int[3];

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    private int field581 = 3216;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "[[S")
    public static short[][] field579;

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 482)
    public class50() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V", line = 24)
    public static void method276(byte arg0) {
        field579 = null;
        if (arg0 >= -111) {
            method279((byte) 32, (String) null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILbe;I)V", line = 39)
    public static final void method277(int arg0, int arg1, class131 arg2, int arg3) {
        if ((arg1 & 2048) != 0) {
            int var4 = class215.field2658.method1583(arg0 ^ 127);
            int[] var5 = new int[var4];
            int[] var6 = new int[var4];
            int[] var7 = new int[var4];
            for (int var8 = 0; ~var8 > ~var4; ++var8) {
                int var9 = class215.field2658.method1578(115);
                if (var9 == 65535) {
                    var9 = -1;
                }
                var5[var8] = var9;
                var6[var8] = class215.field2658.method1567(true);
                var7[var8] = class215.field2658.method1578(23);
            }
            class335.method2150(1, var6, var7, arg2, var5);
        }
        ++field584;
        if ((arg1 & 256) != 0) {
            int var10 = class215.field2658.method1569(true);
            arg2.field2444 = class215.field2658.method1567(true);
            arg2.field2462 = class215.field2658.method1572(-3);
            arg2.field2390 = ~(32768 & var10) != -1;
            arg2.field2461 = var10 & 32767;
            arg2.field2424 = class106.field1273 - -arg2.field2461 - -arg2.field2444;
        }
        if ((32 & arg1) != 0) {
            arg2.field2418 = class215.field2658.method1565(arg0 ^ 119);
            if (~arg2.field2418.charAt(0) == -127) {
                arg2.field2418 = arg2.field2418.substring(1);
                class330.method2124(arg2.method846(false, 0), false, arg2.method844(-11905, true), 2, 0, arg2.field2418);
            } else if (class143.field1684 == arg2) {
                class330.method2124(arg2.method846(false, 0), false, arg2.method844(arg0 ^ 11904, true), 2, 0, arg2.field2418);
            }
            arg2.field2463 = 150;
            arg2.field2393 = 0;
            arg2.field2426 = 0;
        }
        if ((2 & arg1) != 0) {
            int var11 = class215.field2658.method1563(-128);
            byte[] var12 = new byte[var11];
            class242 var13 = new class242(var12);
            class215.field2658.method1550(var11, 0, (byte) 126, var12);
            class299.field3998[arg3] = var13;
            arg2.method847(var13, -66);
        }
        if ((arg1 & 128) != 0) {
            int var14 = class215.field2658.method1559((byte) -70);
            int var15 = class215.field2658.method1572(-3);
            arg2.method1256(var14, class106.field1273, var15, 2);
            arg2.field2422 = class106.field1273 + 300;
            arg2.field2402 = class215.field2658.method1572(-3);
        }
        if (~(arg1 & 64) != -1) {
            arg2.field2399 = class215.field2658.method1587((byte) -102);
            if (arg2.field2399 == 65535) {
                arg2.field2399 = -1;
            }
        }
        if (~(arg1 & 1) != -1) {
            int var16 = class215.field2658.method1569(true);
            int var17 = class215.field2658.method1572(-3);
            int var18 = class215.field2658.method1572(-3);
            int var19 = class215.field2658.field3211;
            boolean var20 = ~(var16 & 32768) != -1;
            if (arg2.field1480 != null && arg2.field1466 != null) {
                boolean var21 = false;
                if (var17 <= 1) {
                    if (!var20 && (class374.field5070 && !class265.field3419 || class352.field4788)) {
                        var21 = true;
                    } else if (class430.method2622(arg2.field1480, 4)) {
                        var21 = true;
                    }
                }
                if (!var21 && ~class229.field2909 == -1) {
                    class242.field3231.field3211 = 0;
                    class215.field2658.method1574(0, (byte) -67, class242.field3231.field3188, var18);
                    class242.field3231.field3211 = 0;
                    int var22 = -1;
                    String var24;
                    if (var20) {
                        var16 &= 32767;
                        class246 var23 = class379.method2355((byte) 17, class242.field3231);
                        var22 = var23.field3255;
                        var24 = var23.field3253.method567(class242.field3231, true);
                    } else {
                        var24 = method279((byte) 5, class68.method395(class1.method1(0, class242.field3231), arg0 ^ -29767));
                    }
                    arg2.field2418 = var24.trim();
                    arg2.field2463 = 150;
                    arg2.field2393 = 255 & var16;
                    arg2.field2426 = var16 >> 8;
                    int var25;
                    if (var17 != 1 && var17 != 2) {
                        var25 = var20 ? 17 : 2;
                    } else {
                        var25 = var20 ? 17 : 1;
                    }
                    if (var17 != 2) {
                        if (var17 != 1) {
                            class175.method1099(var22, var24, (String) null, arg2.method846(false, 0), var25, arg2.method844(-11905, true), 0, (byte) 20);
                        } else {
                            class175.method1099(var22, var24, (String) null, "<img=0>" + arg2.method846(false, 0), var25, "<img=0>" + arg2.method844(-11905, true), 0, (byte) 20);
                        }
                    } else {
                        class175.method1099(var22, var24, (String) null, "<img=1>" + arg2.method846(false, arg0 + 1), var25, "<img=1>" + arg2.method844(-11905, true), 0, (byte) 20);
                    }
                }
            }
            class215.field2658.field3211 = var18 + var19;
        }
        if (~(1024 & arg1) != -1) {
            int var26 = class215.field2658.method1559((byte) -92);
            int var27 = class215.field2658.method1583(-128);
            arg2.method1256(var26, class106.field1273, var27, arg0 ^ -3);
        }
        if (~(4096 & arg1) != -1) {
            int var28 = class215.field2658.method1578(-18);
            if (~var28 == -65536) {
                var28 = -1;
            }
            int var29 = class215.field2658.method1570((byte) 114);
            boolean var30 = true;
            if (~var28 != 0 && arg2.field2467 != -1) {
                if (arg2.field2467 != var28) {
                    class167 var31 = class179.method1124((byte) -42, var28);
                    class167 var32 = class179.method1124((byte) -42, arg2.field2467);
                    if (var31.field1935 != -1 && var32.field1935 != -1) {
                        class156 var33 = class430.method2621((byte) -106, var31.field1935);
                        class156 var34 = class430.method2621((byte) -113, var32.field1935);
                        if (~var33.field1827 > ~var34.field1827) {
                            var30 = false;
                        }
                    }
                } else {
                    class167 var35 = class179.method1124((byte) -42, var28);
                    if (var35.field1937 && ~var35.field1935 != 0) {
                        class156 var36 = class430.method2621((byte) -62, var35.field1935);
                        int var37 = var36.field1804;
                        if (var37 == 0) {
                            var30 = false;
                        } else if (var37 == 1) {
                            var30 = true;
                        } else if (~var37 == -3) {
                            var30 = false;
                            arg2.field2398 = 0;
                        }
                    }
                }
            }
            if (var30) {
                arg2.field2417 = (var29 & 65535) + class106.field1273;
                arg2.field2464 = 0;
                arg2.field2430 = 0;
                arg2.field2416 = var29 >> 16;
                arg2.field2467 = var28;
                arg2.field2404 = 1;
                if (arg2.field2417 > class106.field1273) {
                    arg2.field2464 = -1;
                }
                if (~arg2.field2467 != 0 && ~class106.field1273 == ~arg2.field2417) {
                    int var38 = class179.method1124((byte) -42, arg2.field2467).field1935;
                    if (var38 != -1) {
                        class156 var39 = class430.method2621((byte) -124, var38);
                        if (var39 != null && var39.field1821 != null) {
                            class325.method2038(arg2.field1516, arg2.field1514, class143.field1684 == arg2, var39, 0, (byte) -100);
                        }
                    }
                }
            }
        }
        if ((8 & arg1) != 0) {
            arg2.field2436 = class215.field2658.method1551(51);
            arg2.field2389 = class215.field2658.method1578(116);
        }
        if ((arg1 & 4) != 0) {
            int var40 = class215.field2658.method1551(38);
            if (~var40 == -65536) {
                var40 = -1;
            }
            int var41 = class215.field2658.method1563(arg0 + -127);
            class451.method2798(92, arg2, var40, var41);
        }
        if (~(512 & arg1) != arg0) {
            arg2.field2395 = class215.field2658.method1572(-3);
            arg2.field2440 = class215.field2658.method1563(-128);
            arg2.field2414 = class215.field2658.method1583(-128);
            arg2.field2419 = class215.field2658.method1563(-128);
            arg2.field2454 = class215.field2658.method1569(true) - -class106.field1273;
            arg2.field2446 = class215.field2658.method1578(16) - -class106.field1273;
            arg2.field2396 = class215.field2658.method1572(-3);
            arg2.field2486 = 1;
            arg2.field2491 = 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[I", line = 370)
    public final int[] method55(int arg0, int arg1) {
        ++field578;
        int var3 = -6 % ((57 - arg1) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int var5 = class12.field154 * this.field577 >> 12;
            int[] var6 = this.method1203(0, 108, class210.field2551 & arg0 + -1);
            int[] var7 = this.method1203(0, 126, arg0);
            int[] var8 = this.method1203(0, 58, class210.field2551 & arg0 + 1);
            for (int var9 = 0; ~var9 > ~class138.field1579; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[var9 - 1 & class442.field6113] + -var7[var9 - -1 & class442.field6113]) * var5 >> 12;
                int var12 = var11 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                int var13 = var10 >> 4;
                if (~var12 < -256) {
                    var12 = 255;
                }
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = 255 & class79.field963[((var13 + 1) * var13 >> 1) + var12];
                int var15 = var10 * var14 >> 8;
                int var16 = var14 * 4096 >> 8;
                int var17 = var11 * var14 >> 8;
                int var18 = this.field580[0] * var17 >> 12;
                int var19 = this.field580[2] * var16 >> 12;
                int var20 = this.field580[1] * var15 >> 12;
                var4[var9] = var18 + var19 - -var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILbg;)V", line = 438)
    public final void method54(int arg0, int arg1, class242 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field581 = arg2.method1587((byte) -102);
                }
            } else {
                this.field576 = arg2.method1587((byte) -102);
            }
        } else {
            this.field577 = arg2.method1587((byte) -102);
        }
        int var5 = 91 % ((52 - arg1) / 61);
        ++field583;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V", line = 486)
    private final void method278(boolean arg0) {
        ++field586;
        double var2 = Math.cos((double) ((float) this.field581 / 4096.0F));
        this.field580[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field576 / 4096.0F)));
        this.field580[1] = (int) (Math.cos((double) ((float) this.field576 / 4096.0F)) * var2 * 4096.0D);
        if (arg0) {
            method277(65, -66, (class131) null, 92);
        }
        this.field580[2] = (int) (4096.0D * Math.sin((double) ((float) this.field581 / 4096.0F)));
        int var4 = this.field580[0] * this.field580[0] >> 12;
        int var5 = this.field580[1] * this.field580[1] >> 12;
        int var6 = this.field580[2] * this.field580[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field580[1] = (this.field580[1] << 12) / var7;
            this.field580[2] = (this.field580[2] << 12) / var7;
            this.field580[0] = (this.field580[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 516)
    public static final String method279(byte arg0, String arg1) {
        ++field582;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != 5) {
            return null;
        } else {
            for (int var4 = 0; var4 < var2; ++var4) {
                char var8 = arg1.charAt(var4);
                if (var8 == '<' || ~var8 == -63) {
                    var3 += 3;
                }
            }
            StringBuffer var5 = new StringBuffer(var2 + var3);
            for (int var6 = 0; var6 < var2; ++var6) {
                char var7 = arg1.charAt(var6);
                if (var7 == '<') {
                    var5.append("<lt>");
                } else if (~var7 == -63) {
                    var5.append("<gt>");
                } else {
                    var5.append(var7);
                }
            }
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V", line = 565)
    public final void method280(int arg0) {
        ++field585;
        int var2 = 60 / ((28 - arg0) / 63);
        this.method278(false);
    }
}
