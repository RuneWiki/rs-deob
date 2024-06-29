import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class53 extends class5 {

    @OriginalMember(owner = "client!de", name = "kc", descriptor = "I")
    public int field764 = 0;

    @OriginalMember(owner = "client!de", name = "yc", descriptor = "I")
    public int field778 = -1;

    @OriginalMember(owner = "client!de", name = "wc", descriptor = "I")
    public int field776 = -1;

    @OriginalMember(owner = "client!de", name = "Ec", descriptor = "I")
    public int field784 = -1;

    @OriginalMember(owner = "client!de", name = "Bc", descriptor = "Z")
    public boolean field781 = false;

    @OriginalMember(owner = "client!de", name = "Kc", descriptor = "I")
    public int field790 = 0;

    @OriginalMember(owner = "client!de", name = "Hc", descriptor = "I")
    private int field787 = 0;

    @OriginalMember(owner = "client!de", name = "Dc", descriptor = "I")
    public int field783 = -1;

    @OriginalMember(owner = "client!de", name = "Ic", descriptor = "I")
    public int field788 = 0;

    @OriginalMember(owner = "client!de", name = "tc", descriptor = "I")
    public int field773 = 0;

    @OriginalMember(owner = "client!de", name = "Pc", descriptor = "I")
    public int field795 = -1;

    @OriginalMember(owner = "client!de", name = "Rc", descriptor = "I")
    public int field797 = -1;

    @OriginalMember(owner = "client!de", name = "Nc", descriptor = "I")
    public int field793 = 0;

    @OriginalMember(owner = "client!de", name = "Lc", descriptor = "I")
    public int field791 = -1;

    @OriginalMember(owner = "client!de", name = "Ac", descriptor = "Lh;")
    public static class190 field780 = new class190(512);

    @OriginalMember(owner = "client!de", name = "Oc", descriptor = "[J")
    public static long[] field794 = new long[100];

    @OriginalMember(owner = "client!de", name = "nc", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!de", name = "oc", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!de", name = "pc", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!de", name = "qc", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!de", name = "rc", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!de", name = "sc", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!de", name = "uc", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!de", name = "vc", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!de", name = "zc", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!de", name = "Cc", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!de", name = "Fc", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!de", name = "Gc", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!de", name = "Jc", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!de", name = "Mc", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!de", name = "Qc", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!de", name = "lc", descriptor = "Lmd;")
    public class220 field765;

    @OriginalMember(owner = "client!de", name = "xc", descriptor = "Lve;")
    public static class233 field777;

    @OriginalMember(owner = "client!de", name = "Sc", descriptor = "Lve;")
    public static class233 field798;

    @OriginalMember(owner = "client!de", name = "mc", descriptor = "Ljava/lang/String;")
    public String field766;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method348(int arg0) {
        ++field767;
        if (arg0 != -1) {
            return null;
        } else {
            String var2 = this.field766;
            if (class130.field1897 != null) {
                var2 = class130.field1897[this.field787] + var2;
            }
            if (class59.field897 != null) {
                var2 = var2 + class59.field897[this.field787];
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        ++field772;
        if (arg0 != 0) {
            this.method350(67, (class114) null);
        }
        return this.field765 != null && ~this.field765.field3243 != 0 ? class14.method115(this.field765.field3243, (byte) -113).field4283 : super.method57(0);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()I")
    public final int method36() {
        ++field771;
        return super.field57;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(Z)V")
    public static final void method349(boolean arg0) {
        class266.field4005 = 0;
        if (arg0) {
            int var1 = (class55.field847.field45 >> 7) - -class113.field1615;
            ++field768;
            int var2 = (class55.field847.field94 >> 7) + class95.field1445;
            if (var1 >= 3053 && ~var1 >= -3157 && ~var2 <= -3057 && var2 <= 3136) {
                class266.field4005 = 1;
            }
            if (var1 >= 3072 && ~var1 >= -3119 && var2 >= 9492 && ~var2 >= -9536) {
                class266.field4005 = 1;
            }
            if (class266.field4005 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
                class266.field4005 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILkl;)V")
    public final void method350(int arg0, class114 arg1) {
        arg1.field1673 = 0;
        int var3 = arg1.method760(false);
        ++field786;
        int var4 = var3 & 1;
        boolean var5 = (var3 & 4) != 0;
        int var6 = super.method57(0);
        int[] var7 = new int[12];
        int var8 = -1;
        this.method67(((56 & var3) >> 3) + 1, 17505);
        this.field787 = (var3 & 222) >> 6;
        super.field45 += 64 * (this.method57(0) - var6);
        super.field94 += 64 * (-var6 + this.method57(0));
        this.field783 = arg1.method741(3083);
        this.field778 = arg1.method741(3083);
        this.field788 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg1.method760(false);
            if (~var10 == -1) {
                var7[var9] = 0;
            } else {
                int var11 = arg1.method760(false);
                int var12 = (var10 << 8) - -var11;
                if (var9 == 0 && ~var12 == -65536) {
                    var8 = arg1.method756(-29901);
                    this.field788 = arg1.method760(false);
                    break;
                }
                if (~var12 <= -32769) {
                    int var24 = class171.field2461[var12 + -32768];
                    var7[var9] = class163.method1093(1073741824, var24);
                    int var25 = class259.method1735(var24, -14667).field4350;
                    if (~var25 != -1) {
                        this.field788 = var25;
                    }
                } else {
                    var7[var9] = class163.method1093(Integer.MIN_VALUE, var12 + -256);
                }
            }
        }
        if (arg0 < 12) {
            this.method348(-85);
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var23 = arg1.method760(false);
            if (var23 < 0 || var23 >= class224.field3348[var14].length) {
                var23 = 0;
            }
            var13[var14] = var23;
        }
        super.field107 = arg1.method756(-29901);
        long var15 = arg1.method769(-1682);
        this.field766 = class204.method1321((byte) 109, var15);
        this.field764 = arg1.method760(false);
        if (!var5) {
            this.field790 = 0;
            this.field773 = arg1.method760(false);
            this.field784 = arg1.method760(false);
            if (~this.field784 == -256) {
                this.field784 = -1;
            }
        } else {
            this.field790 = arg1.method756(-29901);
            this.field773 = this.field764;
            this.field784 = -1;
        }
        int var17 = this.field793;
        this.field793 = arg1.method760(false);
        if (this.field793 != 0) {
            int var18 = this.field791;
            int var19 = this.field795;
            int var20 = this.field797;
            int var21 = this.field776;
            this.field795 = arg1.method756(-29901);
            this.field791 = arg1.method756(-29901);
            this.field797 = arg1.method756(-29901);
            this.field776 = arg1.method756(-29901);
            if (this.field793 != var17 || ~this.field795 != ~var19 || this.field791 != var18 || this.field797 != var20 || this.field776 != var21) {
                class191.method1230((byte) -107, this);
            }
        } else {
            class260.method1741(127, this);
        }
        if (this.field765 == null) {
            this.field765 = new class220();
        }
        int var22 = this.field765.field3243;
        this.field765.method1408(super.field107, var7, var8, 25954, var13, var4 == 1);
        if (var8 != var22) {
            super.field45 = super.field119[0] * 128 - -(64 * this.method57(0));
            super.field94 = super.field50[0] * 128 - -(this.method57(0) * 64);
        }
        if (super.field39 != null) {
            super.field39.method728();
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
    public static void method351(int arg0) {
        field780 = null;
        field794 = null;
        if (arg0 == 3496) {
            field777 = null;
            field798 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIIJILqa;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class112 arg10) {
        ++field785;
        if (this.field765 != null) {
            class196 var13 = ~super.field98 != 0 && super.field88 == 0 ? class70.method478(super.field98, false) : null;
            class196 var14 = ~super.field112 == 0 || this.field781 || super.field112 == this.method73((byte) -44).field531 && var13 != null ? null : class70.method478(super.field112, false);
            class2 var15 = this.field765.method1417(super.field101, super.field123, super.field133, (byte) -13, super.field77, super.field63, true, var14, var13, super.field132, super.field38);
            int var16 = class87.method595(125);
            if (~class118.field1732 != -1 && ~var16 > -51) {
                int var17 = 50 - var16;
                while (~var17 < ~class256.field3887) {
                    class195.field2811[class256.field3887] = new byte[102400];
                    ++class256.field3887;
                }
                while (~var17 > ~class256.field3887) {
                    --class256.field3887;
                    class195.field2811[class256.field3887] = null;
                }
            }
            if (var15 != null) {
                super.field57 = var15.method36();
                if (class1.field11 && (~this.field765.field3243 == 0 || class14.method115(this.field765.field3243, (byte) -113).field4246)) {
                    class2 var18 = class200.method1297(arg0, 0, super.field94, super.field45, 240, 160, var14 == null ? super.field38 : super.field77, var14 != null ? var14 : var13, super.field83, var15, 1, (byte) 47, super.field113, 0);
                    var18.method10(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class112) null);
                }
                if (class55.field847 == this) {
                    for (int var19 = class210.field3024.length + -1; var19 >= 0; --var19) {
                        class39 var20 = class210.field3024[var19];
                        if (var20 != null && ~var20.field571 != 0) {
                            if (var20.field574 == 1 && ~var20.field578 <= -1 && class82.field1268.length > var20.field578) {
                                class72 var21 = class82.field1268[var20.field578];
                                if (var21 != null) {
                                    int var22 = var21.field45 / 32 + -(class55.field847.field45 / 32);
                                    int var23 = var21.field94 / 32 + -(class55.field847.field94 / 32);
                                    this.method354(arg3, (class112) null, arg9, -63, var15, arg2, var22, arg0, arg4, var23, arg7, arg1, arg6, arg5, var20.field571);
                                }
                            }
                            if (var20.field574 == 2) {
                                int var24 = (-class95.field1445 + var20.field576) * 4 + 2 + -(class55.field847.field94 / 32);
                                int var25 = (-class113.field1615 + var20.field584) * 4 - class55.field847.field45 / 32 + 2;
                                this.method354(arg3, (class112) null, arg9, -111, var15, arg2, var25, arg0, arg4, var24, arg7, arg1, arg6, arg5, var20.field571);
                            }
                            if (var20.field574 == 10 && ~var20.field578 <= -1 && ~class194.field2777.length < ~var20.field578) {
                                class53 var26 = class194.field2777[var20.field578];
                                if (var26 != null) {
                                    int var27 = var26.field45 / 32 + -(class55.field847.field45 / 32);
                                    int var28 = var26.field94 / 32 + -(class55.field847.field94 / 32);
                                    this.method354(arg3, (class112) null, arg9, 68, var15, arg2, var27, arg0, arg4, var28, arg7, arg1, arg6, arg5, var20.field571);
                                }
                            }
                        }
                    }
                }
                this.method62(var15, (byte) 68);
                class2 var29 = null;
                this.method63(var15, arg0, (byte) 93);
                if (!this.field781 && ~super.field81 != 0 && ~super.field120 != 0) {
                    class7 var30 = class274.method1848(true, super.field81);
                    var29 = var30.method77(super.field120, super.field46, (byte) -34, super.field90);
                    if (var29 != null) {
                        var29.method22(0, -super.field111, 0);
                        if (var30.field157) {
                            if (~class179.field2550 != -1) {
                                var29.method35(class179.field2550);
                            }
                            if (~class184.field2623 != -1) {
                                var29.method14(class184.field2623);
                            }
                            if (~class235.field3540 != -1) {
                                var29.method22(0, class235.field3540, 0);
                            }
                        }
                    }
                }
                class2 var31 = null;
                if (!this.field781 && super.field65 != null) {
                    if (class82.field1267 >= super.field78) {
                        super.field65 = null;
                    }
                    if (class82.field1267 >= super.field64 && super.field78 > class82.field1267) {
                        if (!(super.field65 instanceof class26)) {
                            var31 = (class2) super.field65;
                        } else {
                            var31 = (class2) ((class26) super.field65).method191(1);
                        }
                        var31.method22(-super.field45 + super.field86, -super.field113 + super.field55, -super.field94 + super.field128);
                        if (super.field127 == 512) {
                            var31.method33();
                        } else if (~super.field127 == -1025) {
                            var31.method32();
                        } else if (~super.field127 == -1537) {
                            var31.method34();
                        }
                    }
                }
                if (var29 != null) {
                    var15 = ((class215) var15).method1379(var29);
                }
                if (var31 != null) {
                    var15 = ((class215) var15).method1379(var31);
                }
                var15.field24 = true;
                var15.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field39);
                if (var31 != null) {
                    if (~super.field127 == -513) {
                        var31.method34();
                    } else if (super.field127 != 1024) {
                        if (super.field127 == 1536) {
                            var31.method33();
                        }
                    } else {
                        var31.method32();
                    }
                    var31.method22(super.field45 - super.field86, -super.field55 + super.field113, super.field94 - super.field128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZBZ)V")
    public static final void method352(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4) {
        if (arg3 > -12) {
            method349(true);
        }
        ++field770;
        class63.method442(true, arg1, 0, arg4, arg2, class263.field3960.length + -1, arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
    public final void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field796;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != 23467) {
            field775 = 42;
        }
        ++field774;
        return super.field107;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZII)V")
    public final void method353(int arg0, boolean arg1, int arg2, int arg3) {
        ++field782;
        if (arg3 == -101) {
            super.method65(arg1, arg0, this.method57(0), (byte) 1, arg2);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)Z")
    public final boolean method71(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field789;
            return this.field765 != null;
        }
    }

    @OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field769;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILqa;IILpa;IIIIIIIIII)V")
    private final void method354(int arg0, class112 arg1, int arg2, int arg3, class2 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        ++field792;
        int var16 = arg6 * arg6 + arg9 * arg9;
        if (var16 >= 16 && ~var16 >= -360001) {
            int var17 = (int) (Math.atan2((double) arg6, (double) arg9) * 325.949D) & 2047;
            class2 var18 = class159.method1071(arg4, var17, arg14, super.field94, super.field113, (byte) 46, super.field45);
            if (var18 != null) {
                var18.method10(0, arg11, arg5, arg0, arg8, arg13, arg12, arg10, -1L, arg2, arg1);
            }
            int var19 = 48 / ((-11 - arg3) / 35);
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
    public static final void method355(byte arg0) {
        ++field779;
        int var1 = class32.field470 * 128 - -64;
        int var2 = class5.field53 * 128 + 64;
        int var3 = class81.method542(var1, -1, class163.field2364, var2) + -class16.field238;
        if (~class219.field3233 > -101) {
            if (~class89.field1355 > ~var1) {
                class89.field1355 += (-class89.field1355 + var1) * class219.field3233 / 1000 + class103.field1532;
                if (~var1 > ~class89.field1355) {
                    class89.field1355 = var1;
                }
            }
            if (var2 > class223.field3341) {
                class223.field3341 += class103.field1532 - -((var2 - class223.field3341) * class219.field3233 / 1000);
                if (~var2 > ~class223.field3341) {
                    class223.field3341 = var2;
                }
            }
            if (~class223.field3341 < ~var2) {
                class223.field3341 -= (-var2 + class223.field3341) * class219.field3233 / 1000 + class103.field1532;
                if (~class223.field3341 > ~var2) {
                    class223.field3341 = var2;
                }
            }
            if (class89.field1355 > var1) {
                class89.field1355 -= (-var1 + class89.field1355) * class219.field3233 / 1000 + class103.field1532;
                if (class89.field1355 < var1) {
                    class89.field1355 = var1;
                }
            }
            if (var3 > class169.field2442) {
                class169.field2442 += (-class169.field2442 + var3) * class219.field3233 / 1000 + class103.field1532;
                if (class169.field2442 > var3) {
                    class169.field2442 = var3;
                }
            }
            if (class169.field2442 > var3) {
                class169.field2442 -= (-var3 + class169.field2442) * class219.field3233 / 1000 + class103.field1532;
                if (var3 > class169.field2442) {
                    class169.field2442 = var3;
                }
            }
        } else {
            class89.field1355 = class32.field470 * 128 + 64;
            class223.field3341 = class5.field53 * 128 + 64;
            class169.field2442 = class81.method542(class89.field1355, -1, class163.field2364, class223.field3341) - class16.field238;
        }
        int var4 = class89.field1362 * 128 + 64;
        int var5 = class135.field1960 * 128 - -64;
        int var6 = class81.method542(var4, -1, class163.field2364, var5) + -class259.field3921;
        int var7 = -class89.field1355 + var4;
        int var8 = var5 - class223.field3341;
        int var9 = -class169.field2442 + var6;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
        if (~var11 > -129) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 2047;
        int var13 = -class30.field439 + var12;
        if (var11 > 383) {
            var11 = 383;
        }
        if (class146.field2097 < var11) {
            class146.field2097 += (-class146.field2097 + var11) * class55.field839 / 1000 + class179.field2549;
            if (var11 < class146.field2097) {
                class146.field2097 = var11;
            }
        }
        if (~var13 < -1025) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (~var13 < -1) {
            class30.field439 += class55.field839 * var13 / 1000 + class179.field2549;
            class30.field439 &= 2047;
        }
        if (var13 < 0) {
            class30.field439 -= -var13 * class55.field839 / 1000 + class179.field2549;
            class30.field439 &= 2047;
        }
        int var14 = var12 - class30.field439;
        int var15 = -98 % ((-25 - arg0) / 57);
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var11 < class146.field2097) {
            class146.field2097 -= class179.field2549 - -((-var11 + class146.field2097) * class55.field839 / 1000);
            if (var11 > class146.field2097) {
                class146.field2097 = var11;
            }
        }
        if (~var14 > -1 && ~var13 < -1 || ~var14 < -1 && var13 < 0) {
            class30.field439 = var12;
        }
    }
}
