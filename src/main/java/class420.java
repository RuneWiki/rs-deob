import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class420 extends class59 {

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "I")
    public int field6124;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "Z")
    public boolean field6119;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "Z")
    public boolean field6123;

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "[S")
    public short[] field6138;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "I")
    public int field6128;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "I")
    private int field6140;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public static int field6120 = 0;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "Z")
    public static boolean field6129 = true;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "[Z")
    public static boolean[] field6121 = new boolean[100];

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "Ljava/lang/String;")
    public static String field6136 = "Connection lost.";

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "[I")
    public static int[] field6130 = new int[50];

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public static int field6133 = -1;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    private int field6125;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
    private int field6127;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "I")
    private int field6137;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
    private int field6141;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "Lof;")
    public static class421 field6134;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(II)V")
    public static final void method2635(int arg0, int arg1) {
        ++field6122;
        class221 var2 = class447.method2795(11, (byte) -49, arg0);
        if (arg1 <= 102) {
            field6134 = null;
        }
        var2.method1689(116);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lja;ZI[Lc;IIIIZI[BI)V")
    public static final void method2636(class90 arg0, boolean arg1, int arg2, class158[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, byte[] arg10, int arg11) {
        ++field6126;
        if (!arg1) {
            method2636((class90) null, false, -126, (class158[]) null, -69, -109, 5, -30, false, -8, (byte[]) null, -79);
        }
        class37 var12 = new class37(arg10);
        int var13 = -1;
        while (true) {
            int var14 = var12.method309(117);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method316((byte) 113);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method271((byte) 105);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg7 == ~var19 && arg2 <= var18 && var18 < arg2 - -8 && var17 >= arg6 && ~var17 > ~(arg6 - -8)) {
                    class45 var23 = class451.method2812(85, var13);
                    int var24 = arg5 - -class133.method1104(7 & var17, var22, 7 & var18, -2, arg11, var23.field724, var23.field717);
                    int var25 = arg4 + class399.method2544(var17 & 7, (byte) -113, var23.field717, var18 & 7, arg11, var23.field724, var22);
                    if (~var24 < -1 && var25 > 0 && var24 < class183.field2703 + -1 && ~(class66.field1056 + -1) < ~var25) {
                        class158 var26 = null;
                        if (!arg8) {
                            int var27 = arg9;
                            if (~(2 & class278.field4176[1][var24][var25]) == -3) {
                                var27 = arg9 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg3[var27];
                            }
                        }
                        class111.method966(var13, var24, arg9, arg8, var25, arg9, -1, (byte) 110, true, var21, 3 & var22 - -arg11, arg0, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIBLqo;)V")
    public static final void method2637(int arg0, int arg1, byte arg2, class127 arg3) {
        if (~(arg0 & 64) != -1) {
            arg3.field5678 = class268.field4020.method322((byte) -34);
            if (~arg3.field5678.charAt(0) != -127) {
                if (class86.field1394 == arg3) {
                    class202.method1540(2, arg3.method1074(true, (byte) 83), arg3.field5678, true, arg3.method1077(false, 0), 0);
                }
            } else {
                arg3.field5678 = arg3.field5678.substring(1);
                class202.method1540(2, arg3.method1074(true, (byte) 126), arg3.field5678, true, arg3.method1077(false, 0), 0);
            }
            arg3.field5655 = 0;
            arg3.field5652 = 0;
            arg3.field5628 = 150;
        }
        ++field6135;
        if (~(arg0 & 32) != -1) {
            arg3.field5668 = class268.field4020.method294(-1280438392);
            arg3.field5634 = class268.field4020.method320((byte) -87);
        }
        if (~(arg0 & 512) != -1) {
            int var4 = class268.field4020.method310(-32717);
            int[] var5 = new int[var4];
            int[] var6 = new int[var4];
            int[] var7 = new int[var4];
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = class268.field4020.method288(-16826);
                if (var9 == 65535) {
                    var9 = -1;
                }
                var5[var8] = var9;
                var6[var8] = class268.field4020.method279((byte) 119);
                var7[var8] = class268.field4020.method294(arg2 + -1280438291);
            }
            class282.method2004(arg3, var5, (byte) 122, var6, var7);
        }
        if ((arg0 & 2048) != 0) {
            arg3.field5633 = class268.field4020.method276(-1536);
            arg3.field5616 = class268.field4020.method276(-1536);
            arg3.field5624 = class268.field4020.method310(-32717);
            arg3.field5604 = class268.field4020.method279((byte) 58);
            arg3.field5601 = class268.field4020.method294(arg2 + -1280438291) - -class267.field4002;
            arg3.field5667 = class268.field4020.method293(21569) + class267.field4002;
            arg3.field5676 = class268.field4020.method279((byte) 86);
            arg3.field5695 = 1;
            arg3.field5698 = 0;
        }
        if (~(4 & arg0) != -1) {
            int var10 = class268.field4020.method320((byte) -87);
            if (~var10 == -65536) {
                var10 = -1;
            }
            int var11 = class268.field4020.method279((byte) 83);
            class390.method2467(var10, -1, var11, arg3);
        }
        if ((4096 & arg0) != 0) {
            int var12 = class268.field4020.method316((byte) 121);
            int var13 = class268.field4020.method271((byte) 106);
            arg3.method2466(var13, class267.field4002, 39, var12);
        }
        if ((256 & arg0) != 0) {
            int var14 = class268.field4020.method294(arg2 ^ 1280438291);
            arg3.field5638 = class268.field4020.method279((byte) 55);
            arg3.field5653 = class268.field4020.method271((byte) 115);
            arg3.field5602 = var14 & 32767;
            arg3.field5632 = ~(var14 & 32768) != -1;
            arg3.field5610 = class267.field4002 + arg3.field5638 + arg3.field5602;
        }
        if (~(1 & arg0) != -1) {
            int var15 = class268.field4020.method276(arg2 + -1435);
            byte[] var16 = new byte[var15];
            class37 var17 = new class37(var16);
            class268.field4020.method273(var16, -1, 0, var15);
            class329.field4742[arg1] = var17;
            arg3.method1072(var17, arg2 + 101);
        }
        if (~(arg0 & 2) != -1) {
            int var18 = class268.field4020.method320((byte) -87);
            int var19 = class268.field4020.method310(-32717);
            int var20 = class268.field4020.method279((byte) 113);
            int var21 = class268.field4020.field565;
            boolean var22 = (var18 & 32768) != 0;
            if (arg3.field2066 != null && arg3.field2072 != null) {
                boolean var23 = false;
                if (var19 <= 1) {
                    if (!var22 && (class223.field3313 && !class36.field509 || class198.field2892)) {
                        var23 = true;
                    } else if (class285.method2014((byte) 87, arg3.field2066)) {
                        var23 = true;
                    }
                }
                if (!var23 && class334.field4792 == 0) {
                    class187.field2750.field565 = 0;
                    class268.field4020.method285(0, (byte) 110, var20, class187.field2750.field578);
                    class187.field2750.field565 = 0;
                    int var24 = -1;
                    String var26;
                    if (var22) {
                        var18 &= 32767;
                        class265 var25 = class15.method93(class187.field2750, 31731);
                        var24 = var25.field3984;
                        var26 = var25.field3978.method1296(class187.field2750, true);
                    } else {
                        var26 = class164.method1270(0, class60.method461(class36.method257(class187.field2750, 32767), -120));
                    }
                    arg3.field5678 = var26.trim();
                    arg3.field5652 = var18 >> 8;
                    arg3.field5655 = 255 & var18;
                    arg3.field5628 = 150;
                    int var27;
                    if (var19 != 1 && var19 != 2) {
                        var27 = !var22 ? 2 : 17;
                    } else {
                        var27 = var22 ? 17 : 1;
                    }
                    if (~var19 == -3) {
                        class292.method2038((String) null, (byte) -126, "<img=1>" + arg3.method1077(false, 0), var27, var24, 0, var26, "<img=1>" + arg3.method1074(true, (byte) 123));
                    } else if (~var19 == -2) {
                        class292.method2038((String) null, (byte) -113, "<img=0>" + arg3.method1077(false, 0), var27, var24, 0, var26, "<img=0>" + arg3.method1074(true, (byte) 99));
                    } else {
                        class292.method2038((String) null, (byte) -116, arg3.method1077(false, 0), var27, var24, 0, var26, arg3.method1074(true, (byte) 59));
                    }
                }
            }
            class268.field4020.field565 = var20 + var21;
        }
        if (~(arg0 & 1024) != -1) {
            int var28 = class268.field4020.method320((byte) -87);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = class268.field4020.method286(27914);
            boolean var30 = true;
            if (var28 != -1 && arg3.field5683 != -1) {
                if (arg3.field5683 != var28) {
                    class389 var31 = class321.method2140(var28, (byte) 18);
                    class389 var32 = class321.method2140(arg3.field5683, (byte) 6);
                    if (var31.field5597 != -1 && var32.field5597 != -1) {
                        class51 var33 = class113.method974(var31.field5597, (byte) -95);
                        class51 var34 = class113.method974(var32.field5597, (byte) -105);
                        if (var34.field840 > var33.field840) {
                            var30 = false;
                        }
                    }
                } else {
                    class389 var35 = class321.method2140(var28, (byte) -125);
                    if (var35.field5590 && ~var35.field5597 != 0) {
                        class51 var36 = class113.method974(var35.field5597, (byte) -107);
                        int var37 = var36.field817;
                        if (var37 != 0) {
                            if (var37 != 1) {
                                if (var37 == 2) {
                                    arg3.field5677 = 0;
                                    var30 = false;
                                }
                            } else {
                                var30 = true;
                            }
                        } else {
                            var30 = false;
                        }
                    }
                }
            }
            if (var30) {
                arg3.field5672 = var29 >> 16;
                arg3.field5651 = 0;
                arg3.field5630 = 0;
                arg3.field5605 = (65535 & var29) + class267.field4002;
                arg3.field5681 = 1;
                arg3.field5683 = var28;
                if (class267.field4002 < arg3.field5605) {
                    arg3.field5630 = -1;
                }
                if (arg3.field5683 != -1 && class267.field4002 == arg3.field5605) {
                    int var38 = class321.method2140(arg3.field5683, (byte) 58).field5597;
                    if (~var38 != 0) {
                        class51 var39 = class113.method974(var38, (byte) -72);
                        if (var39 != null && var39.field835 != null) {
                            class50.method399(0, arg3.field6519, (byte) 87, var39, arg3.field6520, class86.field1394 == arg3);
                        }
                    }
                }
            }
        }
        if (arg2 != -101) {
            method2637(121, 22, (byte) 69, (class127) null);
        }
        if ((arg0 & 16) != 0) {
            arg3.field5625 = class268.field4020.method288(-16826);
            if (arg3.field5625 == 65535) {
                arg3.field5625 = -1;
            }
        }
        if (~(8 & arg0) != -1) {
            int var40 = class268.field4020.method316((byte) 112);
            int var41 = class268.field4020.method276(-1536);
            arg3.method2466(var41, class267.field4002, 60, var40);
            arg3.field5669 = class267.field4002 - -300;
            arg3.field5670 = class268.field4020.method279((byte) 76);
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
    public static void method2638(int arg0) {
        if (arg0 != 15578) {
            method2635(-93, -100);
        }
        field6121 = null;
        field6130 = null;
        field6136 = null;
        field6134 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBZ)V")
    public final void method2639(int arg0, byte arg1, boolean arg2) {
        if (arg1 > 33) {
            ++field6139;
            int var6;
            if (!arg2) {
                int var4 = 2047 & this.field6127 * arg0 / 50 + this.field6140;
                int var5 = this.field6141;
                if (~var5 != -2) {
                    if (~var5 != -4) {
                        if (var5 != 4) {
                            if (var5 != 2) {
                                if (var5 == 5) {
                                    var6 = (var4 >= 1024 ? -var4 + 2048 : var4) << 1;
                                } else {
                                    var6 = 2048;
                                }
                            } else {
                                var6 = var4;
                            }
                        } else {
                            var6 = var4 >> 10 << 11;
                        }
                    } else {
                        var6 = class90.field1430[var4] >> 1;
                    }
                } else {
                    var6 = (class56.field897[var4 << 3] >> 5) + 1024;
                }
            } else {
                var6 = 2048;
            }
            super.field941 = (float) ((this.field6137 * var6 >> 11) + this.field6125) / 2048.0F;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V")
    public final void method2640(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6137 = arg2;
        ++field6131;
        this.field6127 = arg4;
        this.field6141 = arg0;
        if (arg3 < 98) {
            method2635(80, 17);
        }
        this.field6125 = arg1;
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
    private final void method2641(int arg0) {
        if (arg0 == 16207) {
            ++field6132;
            int var2 = this.field6128;
            if (~var2 != -3) {
                if (var2 != 3) {
                    if (var2 != 4) {
                        if (var2 != 5) {
                            if (var2 != 12) {
                                if (var2 != 13) {
                                    if (var2 != 10) {
                                        if (~var2 != -12) {
                                            if (~var2 != -7) {
                                                if (~var2 != -8) {
                                                    if (var2 != 8) {
                                                        if (~var2 != -10) {
                                                            if (~var2 != -15) {
                                                                if (~var2 != -16) {
                                                                    if (~var2 == -17) {
                                                                        this.field6125 = 1792;
                                                                        this.field6137 = 256;
                                                                        this.field6127 = 8192;
                                                                        this.field6141 = 1;
                                                                    } else {
                                                                        this.field6137 = 2048;
                                                                        this.field6127 = 2048;
                                                                        this.field6141 = 0;
                                                                        this.field6125 = 0;
                                                                    }
                                                                } else {
                                                                    this.field6127 = 4096;
                                                                    this.field6137 = 512;
                                                                    this.field6141 = 1;
                                                                    this.field6125 = 1536;
                                                                }
                                                            } else {
                                                                this.field6137 = 768;
                                                                this.field6141 = 1;
                                                                this.field6127 = 2048;
                                                                this.field6125 = 1280;
                                                            }
                                                        } else {
                                                            this.field6137 = 1024;
                                                            this.field6125 = 1024;
                                                            this.field6141 = 3;
                                                            this.field6127 = 4096;
                                                        }
                                                    } else {
                                                        this.field6127 = 2048;
                                                        this.field6137 = 1024;
                                                        this.field6141 = 3;
                                                        this.field6125 = 1024;
                                                    }
                                                } else {
                                                    this.field6125 = 1280;
                                                    this.field6137 = 768;
                                                    this.field6127 = 4096;
                                                    this.field6141 = 3;
                                                }
                                            } else {
                                                this.field6137 = 768;
                                                this.field6127 = 2048;
                                                this.field6141 = 3;
                                                this.field6125 = 1280;
                                            }
                                        } else {
                                            this.field6141 = 3;
                                            this.field6127 = 4096;
                                            this.field6137 = 512;
                                            this.field6125 = 1536;
                                        }
                                    } else {
                                        this.field6141 = 3;
                                        this.field6125 = 1536;
                                        this.field6127 = 2048;
                                        this.field6137 = 512;
                                    }
                                } else {
                                    this.field6141 = 2;
                                    this.field6137 = 2048;
                                    this.field6125 = 0;
                                    this.field6127 = 8192;
                                }
                            } else {
                                this.field6141 = 2;
                                this.field6125 = 0;
                                this.field6137 = 2048;
                                this.field6127 = 2048;
                            }
                        } else {
                            this.field6127 = 8192;
                            this.field6125 = 0;
                            this.field6141 = 4;
                            this.field6137 = 2048;
                        }
                    } else {
                        this.field6137 = 2048;
                        this.field6141 = 4;
                        this.field6125 = 0;
                        this.field6127 = 2048;
                    }
                } else {
                    this.field6127 = 4096;
                    this.field6137 = 2048;
                    this.field6141 = 1;
                    this.field6125 = 0;
                }
            } else {
                this.field6125 = 0;
                this.field6127 = 2048;
                this.field6137 = 2048;
                this.field6141 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
    protected class420() {
        if (class90.field1430 == null) {
            class22.method154(-31746);
        }
        this.method2641(16207);
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lec;)V")
    public class420(class37 arg0) {
        if (class90.field1430 == null) {
            class22.method154(-31746);
        }
        this.field6124 = arg0.method271((byte) 118);
        this.field6119 = ~(this.field6124 & 8) != -1;
        this.field6123 = ~(this.field6124 & 16) != -1;
        this.field6124 &= 7;
        super.field942 = arg0.method320((byte) -87);
        super.field945 = arg0.method320((byte) -87);
        super.field944 = arg0.method320((byte) -87);
        super.field943 = arg0.method271((byte) 116);
        int var2 = super.field943 * 2 + 1;
        this.field6138 = new short[var2];
        for (int var3 = 0; ~this.field6138.length < ~var3; ++var3) {
            short var5 = (short) arg0.method320((byte) -87);
            int var6 = var5 >>> 8;
            if (var6 >= var2) {
                var6 = var2 + -1;
            }
            int var7 = var5 & 255;
            if (var2 - var6 < var7) {
                var7 = -var6 + var2;
            }
            this.field6138[var3] = (short) class439.method2744(var7, var6 << 8);
        }
        super.field943 = (super.field943 << 7) + 64;
        if (class187.field2773 == null) {
            super.field948 = class435.field6350[65535 & class231.method1719(-24927, arg0.method320((byte) -87))];
        } else {
            super.field948 = class187.field2773[arg0.method320((byte) -87)];
        }
        int var4 = arg0.method271((byte) 110);
        this.field6128 = 31 & var4;
        this.field6140 = 1792 & var4 << 3;
        if (~this.field6128 != -32) {
            this.method2641(16207);
        }
    }
}
