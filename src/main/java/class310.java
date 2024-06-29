import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class310 extends class483 {

    @OriginalMember(owner = "client!nq", name = "rb", descriptor = "Z")
    public boolean field4158 = false;

    @OriginalMember(owner = "client!nq", name = "qb", descriptor = "Z")
    public boolean field4157 = false;

    @OriginalMember(owner = "client!nq", name = "nb", descriptor = "Z")
    public boolean field4154 = false;

    @OriginalMember(owner = "client!nq", name = "Ab", descriptor = "Z")
    public boolean field4167 = false;

    @OriginalMember(owner = "client!nq", name = "wb", descriptor = "Z")
    public boolean field4163 = false;

    @OriginalMember(owner = "client!nq", name = "xb", descriptor = "I")
    public static int field4164 = 0;

    @OriginalMember(owner = "client!nq", name = "jb", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!nq", name = "kb", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!nq", name = "lb", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!nq", name = "mb", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!nq", name = "ob", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!nq", name = "pb", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!nq", name = "sb", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!nq", name = "tb", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!nq", name = "ub", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!nq", name = "vb", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!nq", name = "yb", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!nq", name = "zb", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!nq", name = "Bb", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!nq", name = "Cb", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!nq", name = "Db", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!nq", name = "Eb", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!nq", name = "Fb", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!nq", name = "Gb", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!nq", name = "Hb", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)I", line = 3)
    public final int method1850(int arg0) {
        ++field4170;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class495.field6687.field1356 && !class495.field6687.field1357) {
            if (!class112.field1360.startsWith("win")) {
                var3 = true;
            } else {
                if (!class112.field1351.startsWith("amd64") && !class112.field1351.startsWith("x86_64")) {
                    var2 = true;
                }
                var4 = true;
                var3 = true;
            }
        }
        if (this.field4158) {
            var3 = false;
        }
        if (this.field4167) {
            var2 = false;
        }
        if (this.field4163) {
            var4 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method1853(false);
        } else {
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class669.method3709(2, -21664, 1000);
                } catch (Exception var16) {
                }
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class669.method3709(3, -21664, 1000);
                    if (class161.field2038 == 3) {
                        class276 var8 = class9.field103.method794();
                        long var9 = var8.field3740 & 281474976710655L;
                        int var11 = var8.field3738;
                        if (~var11 != -4319) {
                            if (~var11 == -4099) {
                                var3 &= ~var9 <= -60129613780L;
                            }
                        } else {
                            var3 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class669.method3709(1, -21664, 1000);
                } catch (Exception var14) {
                }
            }
            if (var5 == -1 && var6 == -1 && var7 == -1) {
                return this.method1853(false);
            } else if (arg0 != 2) {
                return 77;
            } else {
                int var12 = (int) ((float) var7 * 1.1F);
                int var13 = (int) ((float) var6 * 1.1F);
                if (var12 < var5 && ~var13 > ~var5) {
                    return this.method1862((byte) 71, var5);
                } else {
                    return ~var12 >= ~var13 ? this.method1863(var13, (byte) -112, 1) : this.method1863(var12, (byte) -110, 3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V", line = 181)
    public final void method1851(int arg0) {
        ++field4152;
        this.method1865(true, (byte) 89);
        super.field6509 = true;
        super.field6513 = super.field6517 = 0;
        super.field6498 = true;
        super.field6531 = true;
        super.field6491 = true;
        if (arg0 == 18493) {
            super.field6499 = true;
            super.field6496 = true;
            super.field6501 = true;
            super.field6503 = 1;
            super.field6510 = true;
            super.field6522 = true;
            super.field6536 = true;
            super.field6497 = super.field6506 = 2;
            super.field6500 = true;
            if (class77.field969 > 95) {
                class635.method3462(2, true);
            } else {
                class635.method3462(0, true);
            }
            super.field6529 = 0;
            super.field6534 = false;
            super.field6525 = true;
            this.method1859(687);
            this.method1858(false, 0);
            super.field6532 = 4;
            class107.method572(123);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)I", line = 224)
    public final int method1852(int arg0, boolean arg1) {
        if (!arg1) {
            field4165 = -110;
        }
        ++field4160;
        if (class403.method2372(arg0, -88) && !class30.method187(123, class476.field6436)) {
            return ~class77.field969 > -97 && class662.method3675(arg0, -5) && super.field6515 == 0 ? 1 : super.field6515;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)I", line = 248)
    private final int method1853(boolean arg0) {
        ++field4174;
        byte var2;
        if (~class77.field969 > -97) {
            var2 = 1;
            this.method1866(1);
        } else {
            int var3 = class474.method2661(-65536);
            if (var3 <= 100) {
                var2 = 4;
                this.method1851(18493);
            } else if (var3 > 500) {
                if (var3 <= 1000) {
                    this.method1854(-12451);
                    var2 = 2;
                } else {
                    this.method1866(1);
                    var2 = 1;
                }
            } else {
                this.method1860(false);
                var2 = 3;
            }
        }
        if (arg0) {
            this.method1856(85, (class112) null);
        }
        if (class161.field2038 != 0) {
            super.field6511 = 0;
            class564.method3180(0, (byte) 73);
        }
        this.method1856(0, class495.field6687);
        return var2;
    }

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)V", line = 311)
    public final void method1854(int arg0) {
        ++field4168;
        if (arg0 != -12451) {
            this.method1863(-25, (byte) 68, 105);
        }
        this.method1865(true, (byte) 89);
        super.field6536 = false;
        super.field6522 = false;
        super.field6503 = 0;
        super.field6509 = false;
        super.field6513 = super.field6517 = 0;
        super.field6510 = false;
        super.field6531 = false;
        super.field6497 = super.field6506 = 0;
        super.field6500 = true;
        super.field6501 = false;
        super.field6499 = false;
        super.field6496 = false;
        super.field6491 = false;
        super.field6498 = false;
        class635.method3462(0, true);
        super.field6525 = true;
        super.field6529 = 0;
        super.field6534 = false;
        this.method1859(687);
        this.method1858(false, 2);
        super.field6532 = 2;
        class107.method572(125);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I", line = 346)
    public final int method1855(int arg0, int arg1) {
        if (arg0 != 28869) {
            return 15;
        } else {
            ++field4172;
            if (this.field4154) {
                return 0;
            } else if (!this.method1861(arg1, 97)) {
                return 1;
            } else {
                return super.field6498 ? 2 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILcr;)V", line = 365)
    public final void method1856(int arg0, class112 arg1) {
        ++field4169;
        class428 var3 = null;
        try {
            class280 var4 = arg1.method625(true, -25857, "");
            while (var4.field3773 == 0) {
                class660.method3668(arg0 + -1, 1L);
            }
            if (~var4.field3773 == -2) {
                var3 = (class428) var4.field3772;
                class138 var5 = new class138(class635.method3464(-15195));
                this.method2690(var5, (byte) 98);
                var3.method2465(var5.field1712, 0, -20626, var5.field1745);
            }
        } catch (Exception var7) {
        }
        if (arg0 == 0) {
            try {
                if (var3 != null) {
                    var3.method2467((byte) 106);
                }
            } catch (Exception var6) {
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lcr;)V", line = 1011)
    public class310(class112 arg0) {
        super.field6532 = 3;
        super.field6533 = 3;
        this.method1865(true, (byte) 89);
        super.field6509 = true;
        super.field6539 = 0;
        super.field6510 = true;
        super.field6497 = 2;
        super.field6501 = true;
        super.field6531 = true;
        super.field6524 = 0;
        super.field6514 = 127;
        super.field6512 = 127;
        super.field6523 = 127;
        super.field6503 = 1;
        super.field6496 = false;
        super.field6506 = 0;
        super.field6517 = 0;
        super.field6522 = true;
        super.field6491 = true;
        super.field6494 = true;
        super.field6528 = 127;
        super.field6500 = true;
        super.field6536 = true;
        super.field6526 = 127;
        super.field6498 = true;
        super.field6513 = 0;
        if (~class77.field969 <= -97) {
            class635.method3462(2, true);
        } else {
            class635.method3462(0, true);
        }
        super.field6507 = 2;
        super.field6518 = class334.field4911 == 1 ? 2 : 4;
        super.field6520 = false;
        super.field6525 = true;
        super.field6534 = false;
        super.field6511 = 2;
        super.field6515 = 0;
        super.field6529 = 0;
        super.field6495 = true;
        super.field6519 = 0;
        super.field6535 = false;
        class428 var2 = null;
        try {
            class280 var3 = arg0.method625(true, -25857, "");
            while (var3.field3773 == 0) {
                class660.method3668(-1, 1L);
            }
            if (var3.field3773 == 1) {
                var2 = (class428) var3.field3772;
                byte[] var4 = new byte[(int) var2.method2468(0)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method2466(var4, (byte) -37, var5, var4.length - var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1864(new class138(var4), (byte) 95);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2467((byte) 106);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IZ)Z", line = 406)
    public final boolean method1857(int arg0, boolean arg1) {
        if (!arg1) {
            return true;
        } else {
            ++field4150;
            return ~arg0 == -1 ? super.field6505 : true;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(ZI)V", line = 421)
    public final void method1858(boolean arg0, int arg1) {
        ++field4162;
        if (arg0) {
            this.field4154 = false;
        }
        class327.field4770 = true;
        class620.field8429 = null;
        super.field6515 = arg1;
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V", line = 435)
    private final void method1859(int arg0) {
        if (~class334.field4911 >= -2) {
            super.field6518 = 2;
        } else {
            super.field6518 = 4;
        }
        if (arg0 != 687) {
            this.method1864((class138) null, (byte) -82);
        }
        ++field4159;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V", line = 466)
    public final void method1860(boolean arg0) {
        this.method1865(true, (byte) 89);
        ++field4155;
        super.field6501 = true;
        super.field6499 = true;
        super.field6531 = true;
        super.field6491 = false;
        super.field6500 = true;
        super.field6513 = super.field6517 = 0;
        super.field6498 = true;
        super.field6536 = true;
        super.field6503 = 1;
        super.field6509 = true;
        super.field6510 = true;
        super.field6497 = super.field6506 = 1;
        super.field6522 = true;
        super.field6496 = arg0;
        if (class77.field969 > 95) {
            class635.method3462(1, true);
        } else {
            class635.method3462(0, true);
        }
        super.field6529 = 0;
        super.field6525 = true;
        super.field6534 = false;
        this.method1859(687);
        this.method1858(false, 1);
        super.field6532 = 3;
        class107.method572(127);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)Z", line = 502)
    public final boolean method1861(int arg0, int arg1) {
        int var3 = -118 % ((-33 - arg1) / 58);
        ++field4161;
        return arg0 == 0 && !this.field4157 ? super.field6505 : true;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)I", line = 516)
    private final int method1862(byte arg0, int arg1) {
        ++field4173;
        if (arg0 != 71) {
            this.method1853(false);
        }
        byte var3;
        if (~arg1 >= -12001) {
            if (~arg1 >= -5001) {
                if (~arg1 < -2001) {
                    this.method1854(-12451);
                    var3 = 2;
                } else {
                    var3 = 1;
                    this.method1866(1);
                }
            } else {
                this.method1860(false);
                var3 = 3;
            }
        } else {
            this.method1851(18493);
            var3 = 4;
        }
        if (~class161.field2038 != -3) {
            super.field6511 = 2;
            class564.method3180(2, (byte) 63);
        }
        this.method1856(0, class495.field6687);
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IBI)I", line = 568)
    private final int method1863(int arg0, byte arg1, int arg2) {
        if (arg1 >= -55) {
            return -84;
        } else {
            ++field4171;
            byte var4;
            if (~arg0 < -20001) {
                this.method1851(18493);
                var4 = 4;
            } else if (~arg0 >= -10001) {
                if (arg0 > 5000) {
                    var4 = 2;
                    this.method1854(-12451);
                } else {
                    var4 = 1;
                    this.method1866(1);
                }
            } else {
                this.method1860(false);
                var4 = 3;
            }
            if (class161.field2038 != arg2) {
                super.field6511 = arg2;
                class564.method3180(arg2, (byte) 21);
            }
            this.method1856(0, class495.field6687);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Ldga;B)V", line = 619)
    private final void method1864(class138 arg0, byte arg1) {
        ++field4151;
        if (arg0.field1712.length + -arg0.field1745 >= 1) {
            int var3 = arg0.method957((byte) -72);
            if (var3 >= 0 && ~var3 >= -23) {
                byte var4;
                if (var3 == 22) {
                    var4 = 45;
                } else if (var3 == 21) {
                    var4 = 44;
                } else if (var3 != 20) {
                    if (var3 == 19) {
                        var4 = 42;
                    } else if (var3 != 18) {
                        if (var3 == 17) {
                            var4 = 40;
                        } else if (var3 == 16) {
                            var4 = 38;
                        } else if (var3 != 15) {
                            if (~var3 != -15) {
                                if (var3 == 13) {
                                    var4 = 35;
                                } else if (var3 == 12) {
                                    var4 = 34;
                                } else if (~var3 != -12) {
                                    if (~var3 != -11) {
                                        if (var3 != 9) {
                                            if (~var3 != -9) {
                                                if (var3 == 7) {
                                                    var4 = 29;
                                                } else if (var3 == 6) {
                                                    var4 = 28;
                                                } else if (var3 != 5) {
                                                    if (var3 != 4) {
                                                        if (~var3 == -4) {
                                                            var4 = 23;
                                                        } else if (var3 != 2) {
                                                            if (var3 != 1) {
                                                                var4 = 19;
                                                            } else {
                                                                var4 = 23;
                                                            }
                                                        } else {
                                                            var4 = 22;
                                                        }
                                                    } else {
                                                        var4 = 24;
                                                    }
                                                } else {
                                                    var4 = 28;
                                                }
                                            } else {
                                                var4 = 30;
                                            }
                                        } else {
                                            var4 = 31;
                                        }
                                    } else {
                                        var4 = 32;
                                    }
                                } else {
                                    var4 = 33;
                                }
                            } else {
                                var4 = 36;
                            }
                        } else {
                            var4 = 37;
                        }
                    } else {
                        var4 = 41;
                    }
                } else {
                    var4 = 43;
                }
                if (~var4 >= ~(arg0.field1712.length + -arg0.field1745)) {
                    super.field6533 = arg0.method957((byte) -81);
                    if (~super.field6533 <= -2) {
                        if (super.field6533 > 4) {
                            super.field6533 = 4;
                        }
                    } else {
                        super.field6533 = 1;
                    }
                    this.method1865(arg0.method957((byte) -97) == 1, (byte) 89);
                    super.field6498 = ~arg0.method957((byte) -92) == -2;
                    super.field6500 = arg0.method957((byte) -80) == 1;
                    super.field6509 = ~arg0.method957((byte) -80) == -2;
                    super.field6503 = ~arg0.method957((byte) -92) != -2 ? 0 : 1;
                    super.field6531 = arg0.method957((byte) -116) == 1;
                    super.field6522 = ~arg0.method957((byte) -110) == -2;
                    super.field6536 = ~arg0.method957((byte) -111) == -2;
                    super.field6497 = arg0.method957((byte) -79);
                    if (~super.field6497 < -3) {
                        super.field6497 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field6506 = arg0.method957((byte) -113);
                    }
                    if (var3 < 2) {
                        super.field6501 = arg0.method957((byte) -69) == 1;
                        arg0.method957((byte) -69);
                    } else {
                        super.field6501 = ~arg0.method957((byte) -63) == -2;
                        if (var3 >= 17) {
                            super.field6496 = arg0.method957((byte) -119) == 1;
                        }
                    }
                    super.field6491 = arg0.method957((byte) -111) == 1;
                    super.field6510 = arg0.method957((byte) -73) == 1;
                    super.field6513 = arg0.method957((byte) -125);
                    if (super.field6513 > 2) {
                        super.field6513 = 2;
                    }
                    super.field6517 = super.field6513;
                    super.field6494 = ~arg0.method957((byte) -85) == -2;
                    super.field6512 = arg0.method957((byte) -65);
                    if (super.field6512 > 127) {
                        super.field6512 = 127;
                    }
                    if (~var3 <= -21) {
                        super.field6514 = arg0.method957((byte) -122);
                        if (super.field6514 > 127) {
                            super.field6514 = 127;
                        }
                    } else {
                        super.field6514 = super.field6512;
                    }
                    super.field6528 = arg0.method957((byte) -82);
                    super.field6526 = arg0.method957((byte) -106);
                    if (super.field6526 > 127) {
                        super.field6526 = 127;
                    }
                    if (var3 < 21) {
                        super.field6523 = super.field6528;
                    } else {
                        super.field6523 = arg0.method957((byte) -75);
                        if (~super.field6523 < -128) {
                            super.field6523 = 127;
                        }
                    }
                    if (~var3 <= -2) {
                        super.field6524 = arg0.method922((byte) -116);
                        super.field6539 = arg0.method922((byte) -121);
                    }
                    if (arg1 == 95) {
                        if (var3 >= 3 && ~var3 > -7) {
                            arg0.method957((byte) -65);
                        }
                        if (var3 >= 4) {
                            int var5 = arg0.method957((byte) -81);
                            if (~var5 > -1 || var5 > 2) {
                                var5 = 0;
                            }
                            if (~class77.field969 > -97) {
                                var5 = 0;
                            }
                            class635.method3462(var5, true);
                        }
                        if (~var3 <= -6) {
                            super.field6519 = arg0.method943(arg1 ^ -18);
                        }
                        int var6 = 0;
                        if (var3 >= 6) {
                            super.field6507 = var6 = arg0.method957((byte) -91);
                        }
                        if (~super.field6507 != -2 && ~super.field6507 != -3) {
                            super.field6507 = 2;
                        }
                        if (~var3 <= -8) {
                            super.field6520 = ~arg0.method957((byte) -96) == -2;
                        }
                        if (~var3 <= -9) {
                            super.field6535 = arg0.method957((byte) -65) == 1;
                        }
                        if (var3 >= 9) {
                            super.field6529 = arg0.method957((byte) -73);
                        }
                        if (~super.field6529 > -1 || ~super.field6529 < ~class86.method479(class77.field969, -32769)) {
                            super.field6529 = 0;
                        }
                        if (var3 >= 10) {
                            super.field6534 = arg0.method957((byte) -112) != 0;
                        }
                        if (var3 >= 11) {
                            super.field6495 = ~arg0.method957((byte) -68) != -1;
                        }
                        if (~var3 <= -13) {
                            super.field6503 = arg0.method957((byte) -117);
                        }
                        if (~super.field6503 > -1 || ~super.field6503 < -3) {
                            super.field6503 = 1;
                        }
                        if (~var3 <= -14) {
                            super.field6525 = arg0.method957((byte) -65) == 1;
                        }
                        if (~var3 > -15) {
                            if (var6 == 0) {
                                super.field6511 = 2;
                            } else {
                                super.field6511 = 1;
                            }
                        } else {
                            super.field6511 = arg0.method957((byte) -127);
                        }
                        if (super.field6511 < 0 || ~super.field6511 < -6) {
                            super.field6511 = 2;
                        }
                        if (~var3 <= -16) {
                            super.field6518 = arg0.method957((byte) -120);
                            if (~super.field6518 > -1 || super.field6518 > 4) {
                                super.field6518 = ~class334.field4911 == -2 ? 2 : 4;
                            }
                        }
                        if (~var3 <= -17) {
                            super.field6499 = ~arg0.method957((byte) -79) == -2;
                            try {
                                if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                    super.field6499 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (~var3 > -18 && super.field6511 == 0) {
                            super.field6511 = 2;
                        }
                        if (~var3 <= -19) {
                            super.field6532 = arg0.method957((byte) -66);
                            if (~super.field6532 > -1 || ~super.field6532 < -5) {
                                super.field6532 = 0;
                            }
                        }
                        if (var3 >= 19) {
                            super.field6515 = arg0.method957((byte) -114);
                        } else if (super.field6532 != 1 && ~super.field6532 != -3) {
                            if (~super.field6532 == -4) {
                                super.field6515 = 1;
                            } else {
                                super.field6515 = 0;
                            }
                        } else {
                            super.field6515 = 2;
                        }
                        if (~var3 <= -23) {
                            super.field6530 = arg0.method957((byte) -82);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZB)V", line = 958)
    public final void method1865(boolean arg0, byte arg1) {
        ++field4166;
        if (arg1 == 89) {
            super.field6505 = arg0;
            if (class578.field7980 != null) {
                class578.field7980.method1745(21272, !this.method1861(class161.field2038, 46));
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)V", line = 972)
    public final void method1866(int arg0) {
        this.method1865(false, (byte) 89);
        ++field4153;
        super.field6531 = false;
        super.field6491 = false;
        super.field6513 = super.field6517 = 0;
        super.field6496 = false;
        super.field6536 = false;
        super.field6510 = false;
        super.field6522 = false;
        super.field6497 = super.field6506 = 0;
        super.field6498 = false;
        super.field6501 = false;
        super.field6509 = false;
        super.field6503 = 0;
        super.field6499 = false;
        super.field6500 = false;
        class635.method3462(0, true);
        super.field6534 = false;
        super.field6525 = false;
        super.field6529 = 0;
        this.method1859(687);
        this.method1858(false, 2);
        super.field6532 = arg0;
        class107.method572(127);
    }
}
