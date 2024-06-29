import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class67 extends class242 {

    @OriginalMember(owner = "client!wf", name = "zc", descriptor = "I")
    public int field820 = 0;

    @OriginalMember(owner = "client!wf", name = "mc", descriptor = "I")
    public int field807 = -1;

    @OriginalMember(owner = "client!wf", name = "Ic", descriptor = "I")
    public int field829 = -1;

    @OriginalMember(owner = "client!wf", name = "Fc", descriptor = "I")
    public int field826 = 0;

    @OriginalMember(owner = "client!wf", name = "uc", descriptor = "Z")
    public boolean field815 = false;

    @OriginalMember(owner = "client!wf", name = "Dc", descriptor = "I")
    public int field824 = -1;

    @OriginalMember(owner = "client!wf", name = "tc", descriptor = "B")
    private byte field814 = 0;

    @OriginalMember(owner = "client!wf", name = "Hc", descriptor = "I")
    public int field828 = -1;

    @OriginalMember(owner = "client!wf", name = "Ac", descriptor = "I")
    public int field821 = -1;

    @OriginalMember(owner = "client!wf", name = "Qc", descriptor = "I")
    public int field837 = 255;

    @OriginalMember(owner = "client!wf", name = "Pc", descriptor = "I")
    public int field836 = 0;

    @OriginalMember(owner = "client!wf", name = "Yc", descriptor = "I")
    public int field845 = -1;

    @OriginalMember(owner = "client!wf", name = "yc", descriptor = "I")
    public int field819 = 0;

    @OriginalMember(owner = "client!wf", name = "Tc", descriptor = "I")
    public int field840 = 0;

    @OriginalMember(owner = "client!wf", name = "qc", descriptor = "I")
    public int field811 = -1;

    @OriginalMember(owner = "client!wf", name = "Rc", descriptor = "Lhi;")
    public static class323 field838 = null;

    @OriginalMember(owner = "client!wf", name = "Kc", descriptor = "I")
    public static int field831 = 0;

    @OriginalMember(owner = "client!wf", name = "ad", descriptor = "Z")
    public static boolean field847 = false;

    @OriginalMember(owner = "client!wf", name = "nc", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!wf", name = "oc", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!wf", name = "pc", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!wf", name = "rc", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!wf", name = "vc", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!wf", name = "wc", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!wf", name = "xc", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!wf", name = "Bc", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!wf", name = "Cc", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!wf", name = "Ec", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!wf", name = "Gc", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!wf", name = "Jc", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!wf", name = "Lc", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!wf", name = "Mc", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!wf", name = "Oc", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!wf", name = "Sc", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!wf", name = "Uc", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!wf", name = "Vc", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!wf", name = "Wc", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!wf", name = "Xc", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!wf", name = "Zc", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!wf", name = "sc", descriptor = "Ltb;")
    public class246 field813;

    @OriginalMember(owner = "client!wf", name = "bd", descriptor = "Ljava/lang/String;")
    public String field848;

    @OriginalMember(owner = "client!wf", name = "Nc", descriptor = "[[B")
    public static byte[][] field834;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILld;I)V", line = 6)
    public static final void method406(int arg0, int arg1, int arg2, class140 arg3, int arg4) {
        field809++;
        if (class74.field924 >= 400) {
            return;
        }
        if (arg3.field2101 != null) {
            arg3 = arg3.method961(-112);
        }
        int var5 = 21 % ((arg2 - 24) / 56);
        if (arg3 == null || !arg3.field2144) {
            return;
        }
        String var6 = arg3.field2141;
        if (arg3.field2100 != 0) {
            String var7 = class199.field3024 == 1 ? class25.field294 : class355.field5648;
            var6 = var6 + class295.method2098(arg3.field2100, 103, class11.field113.field840) + " (" + var7 + arg3.field2100 + ")";
        }
        if (class119.field1662 == 1) {
            class271.field4257++;
            method413(arg0, 0, class212.field3224, class201.field3074 + " -> <col=ffff00>" + var6, class50.field576, (short) 15, (long) arg1, arg4);
        } else if (class101.field1371) {
            class303 var15 = class283.field4515 == -1 ? null : class113.method733(class283.field4515, true);
            if ((class139.field2088 & 0x2) != 0 && (var15 == null || arg3.method967(2, var15.field4714, class283.field4515) != var15.field4714)) {
                class279.field4396++;
                method413(arg0, 0, class5.field48, class191.field2868 + " -> <col=ffff00>" + var6, class260.field4110, (short) 4, (long) arg1, arg4);
            }
        } else {
            class65.field776++;
            String[] var8 = arg3.field2098;
            if (class91.field1198) {
                var8 = class130.method894(var8, (byte) -99);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class199.field3024 != 0 || !var8[var9].equalsIgnoreCase(class91.field1201))) {
                        class321.field4987++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 49;
                        }
                        if (var9 == 1) {
                            var10 = 25;
                        }
                        if (var9 == 2) {
                            var10 = 13;
                        }
                        if (var9 == 3) {
                            var10 = 36;
                        }
                        int var11 = -1;
                        if (arg3.field2096 == var9) {
                            var11 = arg3.field2143;
                        }
                        if (arg3.field2163 == var9) {
                            var11 = arg3.field2140;
                        }
                        if (var9 == 4) {
                            var10 = 39;
                        }
                        method413(arg0, 0, var11, "<col=ffff00>" + var6, var8[var9], var10, (long) arg1, arg4);
                    }
                }
            }
            if (class199.field3024 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class91.field1201)) {
                        class68.field849++;
                        short var13 = 0;
                        if (class11.field113.field840 < arg3.field2100) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 49;
                        }
                        if (var12 == 1) {
                            var14 = 25;
                        }
                        if (var12 == 2) {
                            var14 = 13;
                        }
                        if (var12 == 3) {
                            var14 = 36;
                        }
                        if (var12 == 4) {
                            var14 = 39;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        method413(arg0, 0, arg3.field2119, "<col=ffff00>" + var6, var8[var12], var14, (long) arg1, arg4);
                    }
                }
            }
            method413(arg0, 0, class109.field1503, "<col=ffff00>" + var6, class291.field4584, (short) 1004, (long) arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZI)V", line = 168)
    public final void method407(int arg0, int arg1, boolean arg2, int arg3) {
        field842++;
        super.method1714(arg0, this.method412((byte) 127), false, arg1, arg2);
        if (arg3 != 0) {
            method420(-116, -62, false, -3, 15);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)V", line = 180)
    public final void method408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field833++;
        if (!this.field3756) {
            if (this.field813 == null) {
                return;
            }
            class111 var6 = this.field3807 != -1 && this.field3796 == 0 ? class289.method2067((byte) -59, this.field3807) : null;
            class111 var7 = this.field3778 == -1 || this.field815 || this.field3778 == this.method1719(-1).field4486 && var6 != null ? null : class289.method2067((byte) -40, this.field3778);
            class362 var8 = this.field813.method1739(false, this.field3715, this.field3740, this.field3717, false, this.field3748, var7, this.field3738, var6, this.field3710, this.field3769, -12722);
            if (var8 == null) {
                return;
            }
            this.method1709((class362) null, var8, (byte) 31);
        }
        if (this.field3798 != null) {
            this.field3798.method984(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V", line = 216)
    public static void method409(boolean arg0) {
        field838 = null;
        field834 = (byte[][]) null;
        if (!arg0) {
            field847 = false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIIJILlg;)V", line = 227)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class141 arg10) {
        field816++;
        if (this.field813 == null) {
            return;
        }
        class111 var13 = this.field3807 != -1 && this.field3796 == 0 ? class289.method2067((byte) -33, this.field3807) : null;
        class282 var14 = this.method1719(-1);
        boolean var15 = var14.field4483 != 0 || var14.field4462 != 0 || var14.field4501 != 0 || var14.field4476 != 0;
        class111 var16 = this.field3778 == -1 || this.field815 || this.field3778 == this.method1719(-1).field4486 && var13 != null ? null : class289.method2067((byte) -33, this.field3778);
        class362 var17 = this.field813.method1739(true, this.field3715, this.field3740, this.field3717, var15, this.field3748, var16, this.field3738, var13, this.field3710, this.field3769, -12722);
        int var18 = class161.method1166(-113);
        if (class272.field4317 && class357.field5667 < 96 && var18 > 50) {
            class194.method1349(-32315);
        }
        if (class313.field4898 != 0 && var18 < 50) {
            int var19 = 50 - var18;
            while (var19 > class72.field892) {
                class19.field234[class72.field892] = new byte[102400];
                class72.field892++;
            }
            while (var19 < class72.field892) {
                class72.field892--;
                class19.field234[class72.field892] = null;
            }
        }
        if (var17 == null) {
            return;
        }
        this.field3707 = var17.method417();
        if (class171.field2601 && (this.field813.field3879 == -1 || class178.method1229(this.field813.field3879, 8).field2147)) {
            class362 var20 = class160.method1163(160, 0, 240, 0, 1, var16 == null ? this.field3738 : this.field3715, this.field3800, this.field3767, arg0, var16 == null ? var13 : var16, 0, this.field3763, this.field3728, var17);
            if (class272.field4317) {
                float var21 = class272.method1932();
                float var22 = class272.method1956();
                class272.method1922();
                class272.method1936(var21, var22 - 150.0F);
                var20.method410(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class141) null);
                class272.method1942();
                class272.method1936(var21, var22);
            } else {
                var20.method410(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class141) null);
            }
        }
        if (class11.field113 == this) {
            for (int var23 = class106.field1471.length - 1; var23 >= 0; var23--) {
                class89 var24 = class106.field1471[var23];
                if (var24 != null && var24.field1177 != -1) {
                    if (var24.field1170 == 1 && var24.field1174 >= 0 && var24.field1174 < class251.field3974.length) {
                        class231 var25 = class251.field3974[var24.field1174];
                        if (var25 != null) {
                            int var26 = var25.field3767 / 32 - class11.field113.field3767 / 32;
                            int var27 = var25.field3763 / 32 - (class11.field113.field3763 / 32);
                            this.method421(var17, var24.field1177, arg3, (class141) null, arg6, arg1, arg5, arg9, arg0, -43, arg4, 360000, arg7, var26, arg2, var27);
                        }
                    }
                    if (var24.field1170 == 2) {
                        int var28 = (var24.field1175 - class322.field4999) * 4 + 2 - (class11.field113.field3767 / 32);
                        int var29 = (var24.field1169 - class16.field160) * 4 + 2 - (class11.field113.field3763 / 32);
                        int var30 = var24.field1176 * 4;
                        int var31 = var30 * var30;
                        this.method421(var17, var24.field1177, arg3, (class141) null, arg6, arg1, arg5, arg9, arg0, -61, arg4, var31, arg7, var28, arg2, var29);
                    }
                    if (var24.field1170 == 10 && var24.field1174 >= 0 && class105.field1443.length > var24.field1174) {
                        class67 var32 = class105.field1443[var24.field1174];
                        if (var32 != null) {
                            int var33 = var32.field3763 / 32 - (class11.field113.field3763 / 32);
                            int var34 = var32.field3767 / 32 - class11.field113.field3767 / 32;
                            this.method421(var17, var24.field1177, arg3, (class141) null, arg6, arg1, arg5, arg9, arg0, -51, arg4, 360000, arg7, var34, arg2, var33);
                        }
                    }
                }
            }
        }
        this.method1711(var17, (byte) -54);
        this.method1720(var17, -30468, arg0);
        class362 var35 = null;
        if (!this.field815 && this.field3703 != -1 && this.field3803 != -1) {
            class314 var36 = class255.method1803(this.field3703, (byte) -51);
            var35 = var36.method2216(this.field3752, this.field3791, this.field3803, 41);
            if (var35 != null) {
                var35.method854(0, -this.field3785, 0);
                if (var36.field4916) {
                    if (class91.field1202 != 0) {
                        var35.method828(class91.field1202);
                    }
                    if (class194.field2951 != 0) {
                        var35.method843(class194.field2951);
                    }
                    if (class291.field4586 != 0) {
                        var35.method854(0, class291.field4586, 0);
                    }
                }
            }
        }
        class362 var37 = null;
        if (!this.field815 && this.field3725 != null) {
            if (class102.field1381 >= this.field3793) {
                this.field3725 = null;
            }
            if (this.field3801 <= class102.field1381 && class102.field1381 < this.field3793) {
                if ((this.field3725 instanceof class75)) {
                    var37 = (class362) ((class75) this.field3725).method469(123);
                } else {
                    var37 = (class362) this.field3725;
                }
                var37.method854(this.field3708 - this.field3767, this.field3774 - this.field3800, this.field3704 - this.field3763);
                if (this.field3806 == 512) {
                    var37.method800();
                } else if (this.field3806 == 1024) {
                    var37.method809();
                } else if (this.field3806 == 1536) {
                    var37.method826();
                }
            }
        }
        if (class272.field4317) {
            this.method1709(var35, var17, (byte) 103);
            var17.field5720 = true;
            var17.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3798);
            if (var35 != null) {
                if (this.field3798 != null) {
                    class124 var38 = (class124) var35;
                    this.field3798.method983(var38.field1711, var38.field1752, true, var38.field1741, var38.field1723, var38.field1708);
                }
                var35.field5720 = true;
                var35.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3798);
            }
        } else {
            if (var35 != null) {
                var17 = ((class133) var17).method914(var35);
            }
            if (var37 != null) {
                var17 = ((class133) var17).method914(var37);
            }
            this.method1709(var35, var17, (byte) 58);
            var17.field5720 = true;
            var17.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3798);
        }
        if (var37 == null) {
            return;
        }
        if (this.field3806 == 512) {
            var37.method826();
        } else if (this.field3806 == 1024) {
            var37.method809();
        } else if (this.field3806 == 1536) {
            var37.method800();
        }
        var37.method854(this.field3767 - this.field3708, this.field3800 - this.field3774, this.field3763 - this.field3704);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Llf;B)V", line = 484)
    public final void method411(class143 arg0, byte arg1) {
        arg0.field2295 = 0;
        field830++;
        int var3 = arg0.method1043(true);
        if (arg1 >= -116) {
            this.field820 = -51;
        }
        int var4 = var3 & 0x1;
        boolean var5 = (var3 & 0x4) != 0;
        int var6 = super.method412((byte) 98);
        this.method1721(362, (var3 >> 3 & 0x7) + 1);
        this.field814 = (byte) (var3 >> 6 & 0x3);
        this.field3767 += (this.method412((byte) 108) - var6) * 64;
        int var7 = -1;
        int[] var8 = new int[12];
        this.field3763 += (this.method412((byte) 84) - var6) * 64;
        this.field811 = arg0.method1028(79030408);
        this.field829 = arg0.method1028(79030408);
        this.field836 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method1043(true);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method1043(true);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method1051(1);
                    this.field836 = arg0.method1043(true);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class352.field5615[var12 - 32768];
                    var8[var9] = class77.method492(var13, 1073741824);
                    int var14 = class190.method1302(var13, (byte) 43).field4858;
                    if (var14 != 0) {
                        this.field836 = var14;
                    }
                } else {
                    var8[var9] = class77.method492(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method1043(true);
            if (var17 < 0 || var17 >= class130.field1881[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field3746 = arg0.method1051(1);
        long var18 = arg0.method1013((byte) -70);
        this.field848 = class241.method1704(-78, var18);
        this.field840 = arg0.method1043(true);
        if (var5) {
            this.field819 = arg0.method1051(1);
            this.field807 = -1;
            this.field826 = this.field840;
        } else {
            this.field819 = 0;
            this.field826 = arg0.method1043(true);
            this.field807 = arg0.method1043(true);
            if (this.field807 == 255) {
                this.field807 = -1;
            }
        }
        int var20 = this.field820;
        this.field820 = arg0.method1043(true);
        if (this.field820 == 0) {
            class62.method385((byte) 102, this);
        } else {
            int var21 = this.field845;
            int var22 = this.field821;
            int var23 = this.field824;
            int var24 = this.field828;
            int var25 = this.field837;
            this.field845 = arg0.method1051(1);
            this.field821 = arg0.method1051(1);
            this.field828 = arg0.method1051(1);
            this.field824 = arg0.method1051(1);
            this.field837 = arg0.method1043(true);
            if (this.field820 != var20 || this.field845 != var21 || this.field821 != var22 || this.field828 != var24 || this.field824 != var23 || this.field837 != var25) {
                class246.method1748((byte) 94, this);
            }
        }
        if (this.field813 == null) {
            this.field813 = new class246();
        }
        int var26 = this.field813.field3879;
        this.field813.method1742(var15, var8, this.field3746, var4 == 1, 340979472, var7);
        if (var7 != var26) {
            this.field3767 = this.field3747[0] * 128 + this.method412((byte) 87) * 64;
            this.field3763 = this.field3786[0] * 128 + (this.method412((byte) 124) * 64);
        }
        if (this.field3798 != null) {
            this.field3798.method992();
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I", line = 639)
    public final int method412(byte arg0) {
        field825++;
        if (arg0 <= 71) {
            field838 = (class323) null;
        }
        return this.field813 == null || this.field813.field3879 == -1 ? super.method412((byte) 115) : class178.method1229(this.field813.field3879, 8).field2111;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;SJI)V", line = 656)
    public static final void method413(int arg0, int arg1, int arg2, String arg3, String arg4, short arg5, long arg6, int arg7) {
        if (arg1 != 0) {
            field838 = (class323) null;
        }
        field832++;
        if (class38.field437 || class74.field924 >= 500) {
            return;
        }
        class29.field342[class74.field924] = arg4;
        class222.field3357[class74.field924] = arg3;
        class304.field4734[class74.field924] = arg2 == -1 ? class161.field2479 : arg2;
        class105.field1442[class74.field924] = arg5;
        class276.field4346[class74.field924] = arg6;
        class296.field4669[class74.field924] = arg0;
        class125.field1771[class74.field924] = arg7;
        class74.field924++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Z", line = 686)
    public final boolean method414(byte arg0) {
        field844++;
        if (this.field813 == null) {
            return false;
        } else {
            int var2 = 94 % ((arg0 - 30) / 58);
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I", line = 705)
    public final int method415(int arg0) {
        field823++;
        return arg0 < 120 ? -53 : this.field3746;
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)V", line = 717)
    public static final void method416(int arg0) {
        field841++;
        if (arg0 == 1) {
            class346.field5485 = -1;
            class69.field860 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()I", line = 729)
    public final int method417() {
        field846++;
        return this.field3707;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IIIII)V", line = 738)
    public static final void method418(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < arg3) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                class347.field5501[var5][arg0] = arg1;
            }
        } else {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class347.field5501[var6][arg0] = arg1;
            }
        }
        if (arg4 < 108) {
            method413(-70, 78, -51, (String) null, (String) null, (short) -81, 124L, 97);
        }
        field827++;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)Ljava/lang/String;", line = 777)
    public final String method419(byte arg0) {
        String var2 = this.field848;
        field817++;
        if (class191.field2865 != null) {
            var2 = class191.field2865[this.field814] + var2;
        }
        if (arg0 == -51) {
            if (class289.field4557 != null) {
                var2 = var2 + class289.field4557[this.field814];
            }
            return var2;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZII)V", line = 828)
    public static final void method420(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            method406(-41, -26, -21, (class140) null, -4);
        }
        field810++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class112.method728(arg0 + arg4, class337.field5389, class344.field5460, -66);
        int var10 = class112.method728(arg0 - arg4, class337.field5389, class344.field5460, -49);
        class278.method1986(var10, class347.field5501[arg1], arg3, var9, (byte) -88);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                int var11 = arg1 + var6;
                int var12 = arg1 - var6;
                var7 -= var6 << 1;
                if (class244.field3844 <= var11 && class2.field22 >= var12) {
                    int var13 = class112.method728(arg0 + var5, class337.field5389, class344.field5460, -42);
                    int var14 = class112.method728(arg0 - var5, class337.field5389, class344.field5460, -56);
                    if (class2.field22 >= var11) {
                        class278.method1986(var14, class347.field5501[var11], arg3, var13, (byte) -92);
                    }
                    if (var12 >= class244.field3844) {
                        class278.method1986(var14, class347.field5501[var12], arg3, var13, (byte) -96);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class244.field3844 && class2.field22 >= var15) {
                int var17 = class112.method728(arg0 + var6, class337.field5389, class344.field5460, -119);
                int var18 = class112.method728(arg0 - var6, class337.field5389, class344.field5460, -99);
                if (var16 <= class2.field22) {
                    class278.method1986(var18, class347.field5501[var16], arg3, var17, (byte) 61);
                }
                if (var15 >= class244.field3844) {
                    class278.method1986(var18, class347.field5501[var15], arg3, var17, (byte) -104);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lbf;IILlg;IIIIIIIIIIII)V", line = 902)
    private final void method421(class362 arg0, int arg1, int arg2, class141 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg9 > -21) {
            this.field837 = 48;
        }
        field835++;
        int var17 = arg13 * arg13 + (arg15 * arg15);
        if (var17 < 16 || arg11 < var17) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg13, (double) arg15) * 325.949D) & 0x7FF;
        class362 var19 = class228.method1583(this.field3767, this.field3763, this.field3800, arg0, true, var18, arg1);
        if (var19 == null) {
            return;
        }
        if (!class272.field4317) {
            var19.method410(0, arg5, arg14, arg2, arg10, arg6, arg4, arg12, -1L, arg7, arg3);
            return;
        }
        float var20 = class272.method1932();
        float var21 = class272.method1956();
        class272.method1922();
        class272.method1936(var20, var21 - 150.0F);
        var19.method410(0, arg5, arg14, arg2, arg10, arg6, arg4, arg12, -1L, arg7, arg3);
        class272.method1942();
        class272.method1936(var20, var21);
    }

    @OriginalMember(owner = "client!wf", name = "finalize", descriptor = "()V", line = 959)
    protected final void finalize() {
        field812++;
        if (this.field3798 != null) {
            this.field3798.method987();
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IZ)I", line = 994)
    public static final int method422(int arg0, boolean arg1) {
        field818++;
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        if (arg1) {
            method418(-111, 64, 29, -68, 101);
        }
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
