import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class243 {

    @OriginalMember(owner = "client!aj", name = "uc", descriptor = "I")
    public int field9 = -1;

    @OriginalMember(owner = "client!aj", name = "wc", descriptor = "I")
    public int field11 = 0;

    @OriginalMember(owner = "client!aj", name = "Cc", descriptor = "I")
    public int field17 = -1;

    @OriginalMember(owner = "client!aj", name = "Gc", descriptor = "I")
    public int field21 = -1;

    @OriginalMember(owner = "client!aj", name = "nc", descriptor = "B")
    private byte field2 = 0;

    @OriginalMember(owner = "client!aj", name = "zc", descriptor = "I")
    public int field14 = -1;

    @OriginalMember(owner = "client!aj", name = "yc", descriptor = "I")
    public int field13 = 0;

    @OriginalMember(owner = "client!aj", name = "mc", descriptor = "I")
    public int field1 = 255;

    @OriginalMember(owner = "client!aj", name = "Oc", descriptor = "Z")
    public boolean field29 = false;

    @OriginalMember(owner = "client!aj", name = "Hc", descriptor = "I")
    public int field22 = 0;

    @OriginalMember(owner = "client!aj", name = "sc", descriptor = "I")
    public int field7 = -1;

    @OriginalMember(owner = "client!aj", name = "Rc", descriptor = "I")
    public int field32 = -1;

    @OriginalMember(owner = "client!aj", name = "Uc", descriptor = "I")
    public int field35 = -1;

    @OriginalMember(owner = "client!aj", name = "qc", descriptor = "I")
    public int field5 = 0;

    @OriginalMember(owner = "client!aj", name = "Xc", descriptor = "I")
    public int field38 = 0;

    @OriginalMember(owner = "client!aj", name = "Fc", descriptor = "I")
    public static int field20 = 5063219;

    @OriginalMember(owner = "client!aj", name = "Bc", descriptor = "[I")
    public static int[] field16 = new int[5];

    @OriginalMember(owner = "client!aj", name = "Nc", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!aj", name = "Dc", descriptor = "Ljava/lang/String;")
    public static String field18 = "shake:";

    @OriginalMember(owner = "client!aj", name = "Ic", descriptor = "Ljava/lang/String;")
    public static String field23 = "purple:";

    @OriginalMember(owner = "client!aj", name = "vc", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aj", name = "Ac", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aj", name = "Ec", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aj", name = "Jc", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!aj", name = "Kc", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aj", name = "Lc", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!aj", name = "oc", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "Pc", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!aj", name = "Tc", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!aj", name = "Vc", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!aj", name = "Wc", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!aj", name = "pc", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "rc", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "tc", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!aj", name = "Sc", descriptor = "Lpj;")
    public class172 field33;

    @OriginalMember(owner = "client!aj", name = "xc", descriptor = "Lgi;")
    public static class205 field12;

    @OriginalMember(owner = "client!aj", name = "Mc", descriptor = "Lmj;")
    public static class218 field27;

    @OriginalMember(owner = "client!aj", name = "Qc", descriptor = "Ljava/lang/String;")
    public String field31;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        ++field19;
        if (arg0 != 5) {
            return false;
        } else {
            return this.field33 != null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILvl;)V")
    public static final void method2(int arg0, class73 arg1) {
        ++field10;
        class218.field3409 = arg1;
        if (arg0 != 50) {
            method7(-123, (class191) null, (class1) null, -62, -92, (class86) null, -4, 124);
        }
    }

    @OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field25;
        if (super.field3926 != null) {
            super.field3926.method428();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field26;
        if (!super.field3985) {
            if (this.field33 == null) {
                return;
            }
            class57 var6 = ~super.field3987 != 0 && super.field3977 == 0 ? class174.method1241(-125, super.field3987) : null;
            class57 var7 = super.field3946 == -1 || this.field29 || ~super.field3946 == ~this.method1725(-120).field2517 && var6 != null ? null : class174.method1241(-128, super.field3946);
            class208 var8 = this.field33.method1238(var7, false, super.field3932, super.field3889, (byte) 74, super.field3969, super.field3973, false, super.field3951, super.field3980, var6, super.field3959);
            if (var8 == null) {
                return;
            }
            this.method1726((byte) 6, (class208) null, var8);
        }
        if (super.field3926 != null) {
            super.field3926.method416(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()I")
    public final int method4() {
        ++field34;
        return super.field3960;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIII)V")
    public final void method5(boolean arg0, int arg1, int arg2, int arg3) {
        ++field30;
        super.method1732(arg2, arg0, this.method8((byte) -50), arg1 ^ -360012, arg3);
        if (arg1 != 360000) {
            this.field2 = 7;
        }
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method6(int arg0) {
        if (arg0 != 113) {
            this.method6(-49);
        }
        ++field37;
        String var2 = this.field31;
        if (class170.field2639 != null) {
            var2 = class170.field2639[this.field2] + var2;
        }
        if (class56.field810 != null) {
            var2 = var2 + class56.field810[this.field2];
        }
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILpg;Laj;IILuk;II)V")
    public static final void method7(int arg0, class191 arg1, class1 arg2, int arg3, int arg4, class86 arg5, int arg6, int arg7) {
        ++field15;
        class251 var8 = new class251();
        var8.field4114 = arg0;
        var8.field4116 = arg3 * 128;
        var8.field4105 = arg6 * 128;
        if (arg1 == null) {
            if (arg5 != null) {
                var8.field4113 = arg5;
                class134 var9 = arg5.field1321;
                if (var9.field1894 != null) {
                    var8.field4096 = true;
                    var9 = var9.method855((byte) -114);
                }
                if (var9 != null) {
                    var8.field4121 = (var9.field1925 + arg3) * 128;
                    var8.field4103 = (var9.field1925 + arg6) * 128;
                    var8.field4110 = class222.method1574(arg5, -11);
                    var8.field4100 = var9.field1924;
                    var8.field4122 = var9.field1934 * 128;
                }
                class206.field3234.method1540(var8, (byte) -119);
            } else if (arg2 != null) {
                var8.field4115 = arg2;
                var8.field4103 = (arg6 + arg2.method8((byte) -63)) * 128;
                var8.field4121 = (arg3 - -arg2.method8((byte) -110)) * 128;
                var8.field4110 = class59.method382(32, arg2);
                var8.field4122 = arg2.field11 * 128;
                var8.field4100 = arg2.field1;
                class13.field190.method1054(arg7 ^ -18673, var8, class176.method1256((byte) 127, arg2.field31));
            }
        } else {
            var8.field4120 = arg1.field3016;
            var8.field4097 = arg1.field3035;
            var8.field4100 = arg1.field3030;
            var8.field4101 = arg1;
            var8.field4122 = arg1.field3002 * 128;
            var8.field4119 = arg1.field3005;
            var8.field4110 = arg1.field3006;
            int var10 = arg1.field2993;
            int var11 = arg1.field3039;
            if (arg4 == 1 || ~arg4 == -4) {
                var11 = arg1.field2993;
                var10 = arg1.field3039;
            }
            var8.field4103 = (arg6 + var10) * 128;
            var8.field4121 = (arg3 - -var11) * 128;
            if (arg1.field2963 != null) {
                var8.field4096 = true;
                var8.method1794(true);
            }
            if (var8.field4097 != null) {
                var8.field4117 = (int) (Math.random() * (double) (-var8.field4119 + var8.field4120)) + var8.field4119;
            }
            class241.field3882.method1540(var8, (byte) -88);
        }
        if (arg7 != 17733) {
            field27 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)I")
    public final int method8(byte arg0) {
        if (arg0 >= -39) {
            return 28;
        } else {
            ++field3;
            return this.field33 != null && ~this.field33.field2693 != 0 ? class118.method780(this.field33.field2693, -29837).field1925 : super.method8((byte) -70);
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field6;
        if (arg0 != 0) {
            this.method12(47, 105, 94, 84, (class65) null, 104, -87, -50, 47, -19, (class208) null, -70, 83, 100, 28, -106);
        }
        return super.field3898;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIIJILom;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        ++field4;
        if (this.field33 != null) {
            class57 var13 = ~super.field3987 != 0 && super.field3977 == 0 ? class174.method1241(-127, super.field3987) : null;
            class163 var14 = this.method1725(-128);
            boolean var15 = ~var14.field2512 != -1 || ~var14.field2531 != -1 || var14.field2503 != 0 || var14.field2536 != 0;
            class57 var16 = ~super.field3946 == 0 || this.field29 || super.field3946 == this.method1725(-120).field2517 && var13 != null ? null : class174.method1241(78, super.field3946);
            class208 var17 = this.field33.method1238(var16, var15, super.field3932, super.field3889, (byte) 93, super.field3969, super.field3973, true, super.field3951, super.field3980, var13, super.field3959);
            int var18 = class167.method1141(-128);
            if (class206.field3232 != 0 && var18 < 50) {
                int var19 = -var18 + 50;
                while (class304.field4833 < var19) {
                    class22.field285[class304.field4833] = new byte[102400];
                    ++class304.field4833;
                }
                while (~class304.field4833 < ~var19) {
                    --class304.field4833;
                    class22.field285[class304.field4833] = null;
                }
            }
            if (var17 != null) {
                super.field3960 = var17.method4();
                if (class89.field1333 && (~this.field33.field2693 == 0 || class118.method780(this.field33.field2693, -29837).field1920)) {
                    class208 var20 = class100.method680(super.field3986, super.field3920, arg0, (byte) 1, 160, 0, var17, super.field3956, 240, var16 == null ? super.field3980 : super.field3959, 0, super.field3915, var16 != null ? var16 : var13, 1);
                    var20.method10(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class65) null);
                }
                if (class214.field3347 == this) {
                    for (int var21 = class130.field1865.length - 1; ~var21 <= -1; --var21) {
                        class306 var22 = class130.field1865[var21];
                        if (var22 != null && ~var22.field4874 != 0) {
                            if (~var22.field4882 == -2 && ~var22.field4875 <= -1 && ~class191.field3045.length < ~var22.field4875) {
                                class86 var23 = class191.field3045[var22.field4875];
                                if (var23 != null) {
                                    int var24 = var23.field3915 / 32 + -(class214.field3347.field3915 / 32);
                                    int var25 = var23.field3920 / 32 + -(class214.field3347.field3920 / 32);
                                    this.method12(var22.field4874, arg5, arg4, arg7, (class65) null, var25, var24, arg2, arg0, arg3, var17, arg1, 2047, arg9, arg6, 360000);
                                }
                            }
                            if (var22.field4882 == 2) {
                                int var26 = (-class113.field1653 + var22.field4891) * 4 - (-2 - -(class214.field3347.field3915 / 32));
                                int var27 = (-class5.field77 + var22.field4888) * 4 + -(class214.field3347.field3920 / 32) - -2;
                                int var28 = var22.field4887 * 4;
                                int var29 = var28 * var28;
                                this.method12(var22.field4874, arg5, arg4, arg7, (class65) null, var27, var26, arg2, arg0, arg3, var17, arg1, 2047, arg9, arg6, var29);
                            }
                            if (~var22.field4882 == -11 && ~var22.field4875 <= -1 && var22.field4875 < class35.field409.length) {
                                class1 var30 = class35.field409[var22.field4875];
                                if (var30 != null) {
                                    int var31 = var30.field3915 / 32 + -(class214.field3347.field3915 / 32);
                                    int var32 = var30.field3920 / 32 + -(class214.field3347.field3920 / 32);
                                    this.method12(var22.field4874, arg5, arg4, arg7, (class65) null, var32, var31, arg2, arg0, arg3, var17, arg1, 2047, arg9, arg6, 360000);
                                }
                            }
                        }
                    }
                }
                class208 var33 = null;
                this.method1722(47, var17);
                this.method1734(arg0, var17, 2);
                if (!this.field29 && super.field3904 != -1 && ~super.field3930 != 0) {
                    class214 var34 = class92.method629(super.field3904, 12288);
                    var33 = var34.method1500(super.field3909, super.field3930, super.field3893, (byte) -116);
                    if (var33 != null) {
                        var33.method342(0, -super.field3963, 0);
                        if (var34.field3343) {
                            if (~class205.field3218 != -1) {
                                var33.method323(class205.field3218);
                            }
                            if (~class260.field4229 != -1) {
                                var33.method331(class260.field4229);
                            }
                            if (class168.field2596 != 0) {
                                var33.method342(0, class168.field2596, 0);
                            }
                        }
                    }
                }
                class208 var35 = null;
                if (!this.field29 && super.field3955 != null) {
                    if (super.field3912 <= class311.field4996) {
                        super.field3955 = null;
                    }
                    if (~class311.field4996 <= ~super.field3968 && ~class311.field4996 > ~super.field3912) {
                        if (super.field3955 instanceof class52) {
                            var35 = (class208) ((class52) super.field3955).method350(true);
                        } else {
                            var35 = (class208) super.field3955;
                        }
                        var35.method342(-super.field3915 + super.field3942, -super.field3986 + super.field3922, super.field3965 - super.field3920);
                        if (~super.field3924 == -513) {
                            var35.method311();
                        } else if (~super.field3924 == -1025) {
                            var35.method341();
                        } else if (~super.field3924 == -1537) {
                            var35.method316();
                        }
                    }
                }
                if (var33 != null) {
                    var17 = ((class51) var17).method320(var33);
                }
                if (var35 != null) {
                    var17 = ((class51) var17).method320(var35);
                }
                this.method1726((byte) 6, var33, var17);
                var17.field3264 = true;
                var17.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3926);
                if (var35 != null) {
                    if (super.field3924 == 512) {
                        var35.method316();
                    } else if (~super.field3924 == -1025) {
                        var35.method341();
                    } else if (super.field3924 == 1536) {
                        var35.method311();
                    }
                    var35.method342(-super.field3942 + super.field3915, -super.field3922 + super.field3986, -super.field3965 + super.field3920);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLim;)V")
    public final void method11(boolean arg0, class170 arg1) {
        if (arg0) {
            field18 = null;
        }
        arg1.field2676 = 0;
        int var3 = arg1.method1218(65);
        ++field36;
        int var4 = var3 & 1;
        boolean var5 = (var3 & 4) != 0;
        int var6 = -1;
        int var7 = super.method8((byte) -127);
        int[] var8 = new int[12];
        this.method1729((var3 >> 3 & 7) + 1, (byte) 6);
        this.field2 = (byte) ((232 & var3) >> 6);
        super.field3915 += 64 * (this.method8((byte) -47) - var7);
        super.field3920 += (this.method8((byte) -102) - var7) * 64;
        this.field7 = arg1.method1215(128);
        this.field21 = arg1.method1215(128);
        this.field38 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg1.method1218(-124);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method1218(113);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var6 = arg1.method1186((byte) -36);
                    this.field38 = arg1.method1218(125);
                    break;
                }
                if (~var12 <= -32769) {
                    int var25 = class39.field471[var12 + -32768];
                    var8[var9] = class243.method1723(var25, 1073741824);
                    int var26 = class104.method696((byte) -26, var25).field2423;
                    if (~var26 != -1) {
                        this.field38 = var26;
                    }
                } else {
                    var8[var9] = class243.method1723(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var24 = arg1.method1218(96);
            if (~var24 > -1 || ~var24 <= ~class291.field4685[var14].length) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field3898 = arg1.method1186((byte) -72);
        long var15 = arg1.method1181(27081);
        this.field31 = class178.method1264(var15, (byte) 103);
        this.field13 = arg1.method1218(-55);
        if (var5) {
            this.field5 = arg1.method1186((byte) -117);
            this.field22 = this.field13;
            this.field35 = -1;
        } else {
            this.field5 = 0;
            this.field22 = arg1.method1218(125);
            this.field35 = arg1.method1218(-35);
            if (this.field35 == 255) {
                this.field35 = -1;
            }
        }
        int var17 = this.field11;
        this.field11 = arg1.method1218(105);
        if (this.field11 != 0) {
            int var18 = this.field17;
            int var19 = this.field14;
            int var20 = this.field32;
            int var21 = this.field9;
            int var22 = this.field1;
            this.field17 = arg1.method1186((byte) -48);
            this.field14 = arg1.method1186((byte) -90);
            this.field9 = arg1.method1186((byte) -70);
            this.field32 = arg1.method1186((byte) -44);
            this.field1 = arg1.method1218(-40);
            if (~this.field11 != ~var17 || ~this.field17 != ~var18 || this.field14 != var19 || ~this.field9 != ~var21 || this.field32 != var20 || ~this.field1 != ~var22) {
                class238.method1667(this, (byte) 68);
            }
        } else {
            class142.method928(this, (byte) -128);
        }
        if (this.field33 == null) {
            this.field33 = new class172();
        }
        int var23 = this.field33.field2693;
        this.field33.method1227(var8, 16384, var13, ~var4 == -2, super.field3898, var6);
        if (var6 != var23) {
            super.field3915 = super.field3970[0] * 128 + this.method8((byte) -53) * 64;
            super.field3920 = super.field3972[0] * 128 + this.method8((byte) -103) * 64;
        }
        if (super.field3926 != null) {
            super.field3926.method421();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIILom;IIIIILli;IIIII)V")
    private final void method12(int arg0, int arg1, int arg2, int arg3, class65 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class208 arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        ++field24;
        int var17 = arg5 * arg5 + arg6 * arg6;
        if (var17 >= 16 && ~var17 >= ~arg15) {
            int var18 = arg12 & (int) (325.949D * Math.atan2((double) arg6, (double) arg5));
            class208 var19 = class218.method1532((byte) 69, arg0, super.field3986, super.field3915, super.field3920, var18, arg10);
            if (var19 != null) {
                var19.method10(0, arg11, arg7, arg9, arg2, arg1, arg14, arg3, -1L, arg13, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)V")
    public static void method13(int arg0) {
        field12 = null;
        field27 = null;
        field18 = null;
        field23 = null;
        field16 = null;
        if (arg0 != 0) {
            method2(9, (class73) null);
        }
    }
}
