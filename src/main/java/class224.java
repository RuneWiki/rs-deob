import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class224 extends class25 {

    @OriginalMember(owner = "client!gk", name = "ic", descriptor = "Z")
    public boolean field3475 = false;

    @OriginalMember(owner = "client!gk", name = "tc", descriptor = "I")
    public int field3486 = 0;

    @OriginalMember(owner = "client!gk", name = "lc", descriptor = "I")
    public int field3478 = -1;

    @OriginalMember(owner = "client!gk", name = "kc", descriptor = "I")
    public int field3477 = -1;

    @OriginalMember(owner = "client!gk", name = "sc", descriptor = "I")
    public int field3485 = 0;

    @OriginalMember(owner = "client!gk", name = "yc", descriptor = "I")
    public int field3491 = -1;

    @OriginalMember(owner = "client!gk", name = "Jc", descriptor = "B")
    private byte field3502 = 0;

    @OriginalMember(owner = "client!gk", name = "Hc", descriptor = "I")
    public int field3500 = -1;

    @OriginalMember(owner = "client!gk", name = "Fc", descriptor = "I")
    public int field3498 = 0;

    @OriginalMember(owner = "client!gk", name = "Ac", descriptor = "I")
    public int field3493 = -1;

    @OriginalMember(owner = "client!gk", name = "Lc", descriptor = "I")
    public int field3504 = 0;

    @OriginalMember(owner = "client!gk", name = "Pc", descriptor = "I")
    public int field3508 = 255;

    @OriginalMember(owner = "client!gk", name = "Mc", descriptor = "I")
    public int field3505 = -1;

    @OriginalMember(owner = "client!gk", name = "Qc", descriptor = "I")
    public int field3509 = -1;

    @OriginalMember(owner = "client!gk", name = "jc", descriptor = "I")
    public int field3476 = 0;

    @OriginalMember(owner = "client!gk", name = "qc", descriptor = "I")
    public static volatile int field3483 = 0;

    @OriginalMember(owner = "client!gk", name = "mc", descriptor = "I")
    public static int field3479 = -1;

    @OriginalMember(owner = "client!gk", name = "Nc", descriptor = "I")
    public static int field3506 = 1;

    @OriginalMember(owner = "client!gk", name = "nc", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!gk", name = "oc", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!gk", name = "pc", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!gk", name = "rc", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!gk", name = "wc", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!gk", name = "zc", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!gk", name = "Bc", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!gk", name = "Cc", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!gk", name = "Dc", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!gk", name = "Ec", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!gk", name = "Gc", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!gk", name = "Ic", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!gk", name = "Kc", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!gk", name = "Oc", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!gk", name = "Rc", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!gk", name = "Sc", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!gk", name = "Tc", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!gk", name = "uc", descriptor = "Lvd;")
    public class261 field3487;

    @OriginalMember(owner = "client!gk", name = "vc", descriptor = "Ljava/lang/String;")
    public String field3488;

    @OriginalMember(owner = "client!gk", name = "xc", descriptor = "[B")
    public static byte[] field3490;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lca;B)V")
    public final void method1527(class54 arg0, byte arg1) {
        arg0.field887 = 0;
        int var3 = arg0.method407(255);
        int var4 = 1 & var3;
        ++field3481;
        boolean var5 = ~(4 & var3) != -1;
        int var6 = super.method168(-99);
        int var7 = -1;
        int[] var8 = new int[12];
        this.method169(((60 & var3) >> 3) + 1, 23138);
        this.field3502 = (byte) (3 & var3 >> 6);
        super.field425 += (-var6 + this.method168(-86)) * 64;
        super.field455 += 64 * (this.method168(arg1 ^ -88) - var6);
        this.field3493 = arg0.method459(false);
        this.field3509 = arg0.method459(false);
        this.field3476 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg0.method407(255);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method407(255);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var7 = arg0.method423(75);
                    this.field3476 = arg0.method407(255);
                    break;
                }
                if (var12 >= 32768) {
                    int var25 = class248.field3851[var12 + -32768];
                    var8[var9] = class186.method1215(var25, 1073741824);
                    int var26 = class140.method951((byte) -94, var25).field280;
                    if (~var26 != -1) {
                        this.field3476 = var26;
                    }
                } else {
                    var8[var9] = class186.method1215(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var24 = arg0.method407(255);
            if (var24 < 0 || ~class206.field3086[var14].length >= ~var24) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field436 = arg0.method423(87);
        long var15 = arg0.method429(-1313681368);
        this.field3488 = class37.method287(var15, (byte) 124);
        this.field3485 = arg0.method407(255);
        if (!var5) {
            this.field3486 = 0;
            this.field3504 = arg0.method407(255);
            this.field3491 = arg0.method407(255);
            if (this.field3491 == 255) {
                this.field3491 = -1;
            }
        } else {
            this.field3486 = arg0.method423(-97);
            this.field3504 = this.field3485;
            this.field3491 = -1;
        }
        int var17 = this.field3498;
        this.field3498 = arg0.method407(255);
        if (~this.field3498 == -1) {
            class142.method958(-103, this);
        } else {
            int var18 = this.field3500;
            int var19 = this.field3477;
            int var20 = this.field3478;
            int var21 = this.field3508;
            int var22 = this.field3505;
            this.field3500 = arg0.method423(90);
            this.field3477 = arg0.method423(arg1 ^ 75);
            this.field3478 = arg0.method423(107);
            this.field3505 = arg0.method423(-125);
            this.field3508 = arg0.method407(255);
            if (this.field3498 != var17 || this.field3500 != var18 || this.field3477 != var19 || ~this.field3478 != ~var20 || ~this.field3505 != ~var22 || ~this.field3508 != ~var21) {
                class212.method1423(arg1 ^ -17957, this);
            }
        }
        if (this.field3487 == null) {
            this.field3487 = new class261();
        }
        int var23 = this.field3487.field4008;
        if (arg1 != 45) {
            field3506 = 14;
        }
        this.field3487.method1773(~var4 == -2, arg1 ^ -111, super.field436, var13, var7, var8);
        if (var7 != var23) {
            super.field425 = super.field449[0] * 128 + this.method168(-91) * 64;
            super.field455 = super.field493[0] * 128 + 64 * this.method168(arg1 ^ -118);
        }
        if (super.field421 != null) {
            super.field421.method213();
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIII)V")
    public final void method1528(boolean arg0, int arg1, int arg2, int arg3) {
        super.method167(this.method168(arg3 ^ -61), 0, arg2, arg0, arg1);
        if (arg3 != 79) {
            this.field3476 = 53;
        }
        ++field3501;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
    public final int method168(int arg0) {
        if (arg0 >= -79) {
            return -119;
        } else {
            ++field3495;
            return this.field3487 != null && this.field3487.field4008 != -1 ? class114.method820((byte) -62, this.field3487.field4008).field2813 : super.method168(-108);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(CII)C")
    public static final char method1529(char arg0, int arg1, int arg2) {
        ++field3482;
        if (arg2 < 77) {
            field3511 = -126;
        }
        if (~arg0 <= -193 && ~arg0 >= -256) {
            if (arg0 >= 192 && ~arg0 >= -199) {
                return 'A';
            }
            if (arg0 == 199) {
                return 'C';
            }
            if (~arg0 <= -201 && ~arg0 >= -204) {
                return 'E';
            }
            if (arg0 >= 204 && ~arg0 >= -208) {
                return 'I';
            }
            if (arg0 == 209 && ~arg1 != -1) {
                return 'N';
            }
            if (arg0 >= 210 && arg0 <= 214) {
                return 'O';
            }
            if (~arg0 <= -218 && ~arg0 >= -221) {
                return 'U';
            }
            if (arg0 == 221) {
                return 'Y';
            }
            if (~arg0 == -224) {
                return 's';
            }
            if (arg0 >= 224 && ~arg0 >= -231) {
                return 'a';
            }
            if (~arg0 == -232) {
                return 'c';
            }
            if (~arg0 <= -233 && ~arg0 >= -236) {
                return 'e';
            }
            if (arg0 >= 236 && arg0 <= 239) {
                return 'i';
            }
            if (arg0 == 241 && arg1 != 0) {
                return 'n';
            }
            if (~arg0 <= -243 && arg0 <= 246) {
                return 'o';
            }
            if (~arg0 <= -250 && ~arg0 >= -253) {
                return 'u';
            }
            if (~arg0 == -254 || arg0 == 255) {
                return 'y';
            }
        }
        if (arg0 == 338) {
            return 'O';
        } else if (~arg0 == -340) {
            return 'o';
        } else if (arg0 == 376) {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)I")
    public final int method172(byte arg0) {
        if (arg0 != -89) {
            return 81;
        } else {
            ++field3507;
            return super.field436;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3503;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILaa;IIIIILpb;IIIIIIII)V")
    private final void method1530(int arg0, class31 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class2 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        ++field3494;
        if (arg2 != 2204) {
            this.field3505 = 100;
        }
        int var17 = arg15 * arg15 - -(arg14 * arg14);
        if (var17 >= 16 && ~arg6 <= ~var17) {
            int var18 = 2047 & (int) (Math.atan2((double) arg15, (double) arg14) * 325.949D);
            class2 var19 = class202.method1346(super.field455, arg2 ^ 2205, super.field425, var18, arg0, super.field411, arg7);
            if (var19 != null) {
                var19.method22(0, arg11, arg12, arg5, arg8, arg3, arg10, arg9, -1L, arg4, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
    public static void method1531(int arg0) {
        field3490 = null;
        if (arg0 != 4228) {
            method1532(-98, true, -27, -76, -32, 68);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZIIII)V")
    public static final void method1532(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~arg4 > -2) {
            arg4 = 1;
        }
        ++field3497;
        class227.field3544 = (short) arg4;
        if (arg5 == 0) {
            if (arg2 < 1) {
                arg2 = 1;
            }
            class1.field25 = (short) arg2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3499;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)Z")
    public final boolean method173(byte arg0) {
        ++field3496;
        if (arg0 != 109) {
            this.field3485 = -101;
        }
        return this.field3487 != null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "()I")
    public final int method19() {
        ++field3512;
        return super.field414;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIIJILaa;)V")
    public final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class31 arg10) {
        ++field3480;
        if (this.field3487 != null) {
            class220 var13 = super.field483 != -1 && ~super.field475 == -1 ? class108.method781(super.field483, -1) : null;
            class220 var14 = super.field399 == -1 || this.field3475 || super.field399 == this.method165((byte) -109).field1651 && var13 != null ? null : class108.method781(super.field399, -1);
            class2 var15 = this.field3487.method1761(super.field485, super.field422, var14, super.field412, super.field437, var13, super.field453, super.field405, true, super.field456, 1073741823);
            int var16 = class12.method83(2);
            if (class138.field1999 != 0 && var16 < 50) {
                int var17 = -var16 + 50;
                while (class12.field170 < var17) {
                    class297.field4571[class12.field170] = new byte[102400];
                    ++class12.field170;
                }
                while (class12.field170 > var17) {
                    --class12.field170;
                    class297.field4571[class12.field170] = null;
                }
            }
            if (var15 != null) {
                super.field414 = var15.method19();
                if (class134.field1967 && (this.field3487.field4008 == -1 || class114.method820((byte) -62, this.field3487.field4008).field2848)) {
                    class2 var18 = class62.method514(super.field425, 240, var15, 1, 0, 160, super.field398, arg0, var14 != null ? var14 : var13, 0, super.field455, var14 == null ? super.field412 : super.field405, super.field411, 103);
                    var18.method22(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class31) null);
                }
                if (class185.field2687 == this) {
                    for (int var19 = class234.field3610.length + -1; var19 >= 0; --var19) {
                        class130 var20 = class234.field3610[var19];
                        if (var20 != null && ~var20.field1919 != 0) {
                            if (var20.field1913 == 1 && ~var20.field1904 <= -1 && ~class243.field3762.length < ~var20.field1904) {
                                class87 var21 = class243.field3762[var20.field1904];
                                if (var21 != null) {
                                    int var22 = var21.field455 / 32 - class185.field2687.field455 / 32;
                                    int var23 = var21.field425 / 32 + -(class185.field2687.field425 / 32);
                                    this.method1530(var20.field1919, (class31) null, 2204, arg5, arg9, arg3, 360000, var15, arg4, arg7, arg6, arg1, arg2, arg0, var22, var23);
                                }
                            }
                            if (var20.field1913 == 2) {
                                int var24 = (var20.field1907 - class188.field2774) * 4 + -(class185.field2687.field455 / 32) + 2;
                                int var25 = (var20.field1916 - class90.field1367) * 4 + -(class185.field2687.field425 / 32) + 2;
                                int var26 = var20.field1905 * 4;
                                int var27 = var26 * var26;
                                this.method1530(var20.field1919, (class31) null, 2204, arg5, arg9, arg3, var27, var15, arg4, arg7, arg6, arg1, arg2, arg0, var24, var25);
                            }
                            if (var20.field1913 == 10 && var20.field1904 >= 0 && ~class166.field2438.length < ~var20.field1904) {
                                class224 var28 = class166.field2438[var20.field1904];
                                if (var28 != null) {
                                    int var29 = var28.field425 / 32 + -(class185.field2687.field425 / 32);
                                    int var30 = var28.field455 / 32 - class185.field2687.field455 / 32;
                                    this.method1530(var20.field1919, (class31) null, 2204, arg5, arg9, arg3, 360000, var15, arg4, arg7, arg6, arg1, arg2, arg0, var30, var29);
                                }
                            }
                        }
                    }
                }
                this.method175(20219, var15);
                class2 var31 = null;
                this.method166(arg0, var15, (byte) -99);
                if (!this.field3475 && ~super.field491 != 0 && ~super.field488 != 0) {
                    class104 var32 = class296.method1957(super.field491, true);
                    var31 = var32.method757(super.field460, super.field488, (byte) -31, super.field459);
                    if (var31 != null) {
                        var31.method39(0, -super.field415, 0);
                        if (var32.field1525) {
                            if (class63.field1061 != 0) {
                                var31.method24(class63.field1061);
                            }
                            if (class131.field1930 != 0) {
                                var31.method10(class131.field1930);
                            }
                            if (~class283.field4332 != -1) {
                                var31.method39(0, class283.field4332, 0);
                            }
                        }
                    }
                }
                class2 var33 = null;
                if (!this.field3475 && super.field397 != null) {
                    if (~class120.field1794 <= ~super.field433) {
                        super.field397 = null;
                    }
                    if (class120.field1794 >= super.field467 && ~class120.field1794 > ~super.field433) {
                        if (super.field397 instanceof class109) {
                            var33 = (class2) ((class109) super.field397).method788((byte) -42);
                        } else {
                            var33 = (class2) super.field397;
                        }
                        var33.method39(-super.field425 + super.field450, -super.field411 + super.field468, -super.field455 + super.field497);
                        if (~super.field484 == -513) {
                            var33.method25();
                        } else if (super.field484 != 1024) {
                            if (~super.field484 == -1537) {
                                var33.method13();
                            }
                        } else {
                            var33.method38();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class263) var15).method1790(var31);
                }
                if (var33 != null) {
                    var15 = ((class263) var15).method1790(var33);
                }
                var15.field35 = true;
                var15.method22(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field421);
                if (var33 != null) {
                    if (~super.field484 == -513) {
                        var33.method13();
                    } else if (super.field484 == 1024) {
                        var33.method38();
                    } else if (super.field484 == 1536) {
                        var33.method25();
                    }
                    var33.method39(-super.field450 + super.field425, -super.field468 + super.field411, -super.field497 + super.field455);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V")
    public static final void method1533(int arg0, int arg1) {
        class195.field2954 = new int[arg1];
        class62.field1034 = new int[arg1];
        ++field3492;
        class86.field1312 = new int[arg1];
        class3.field48 = new int[arg1];
        if (arg0 != 12) {
            method1529('K', 2, 119);
        }
        class221.field3443 = new int[arg1];
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method1534(int arg0) {
        int var2 = 77 / ((-37 - arg0) / 62);
        String var3 = this.field3488;
        ++field3510;
        if (class154.field2253 != null) {
            var3 = class154.field2253[this.field3502] + var3;
        }
        if (class269.field4202 != null) {
            var3 = var3 + class269.field4202[this.field3502];
        }
        return var3;
    }
}
