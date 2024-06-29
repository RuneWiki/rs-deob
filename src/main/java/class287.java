import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class287 extends class518 {

    @OriginalMember(owner = "client!nn", name = "V", descriptor = "Z")
    public boolean field3980 = false;

    @OriginalMember(owner = "client!nn", name = "X", descriptor = "Z")
    public boolean field3982 = false;

    @OriginalMember(owner = "client!nn", name = "bb", descriptor = "I")
    public static int field3986 = 0;

    @OriginalMember(owner = "client!nn", name = "cb", descriptor = "Lwj;")
    public static class270 field3987 = new class270(80, 6);

    @OriginalMember(owner = "client!nn", name = "R", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!nn", name = "U", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!nn", name = "W", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!nn", name = "Y", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!nn", name = "Z", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!nn", name = "ab", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)I")
    public final int method1708(int arg0, int arg1) {
        if (arg1 >= -99) {
            this.method1708(3, 106);
        }
        ++field3976;
        if (this.field3980) {
            return 0;
        } else if (!this.method1712(arg0, false)) {
            return 1;
        } else {
            return !super.field7665 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)Lsi;")
    public final class391 method1709(byte arg0) {
        ++field3979;
        class391 var2 = new class391(41);
        var2.method2302(arg0 ^ -61, 17);
        var2.method2302(-4, super.field7666);
        var2.method2302(-4, !super.field7639 ? 0 : 1);
        var2.method2302(-4, !super.field7665 ? 0 : 1);
        var2.method2302(-4, super.field7649 ? 1 : 0);
        var2.method2302(-4, super.field7652 ? 1 : 0);
        var2.method2302(-4, 0);
        var2.method2302(-4, super.field7667 ? 1 : 0);
        var2.method2302(-4, !super.field7660 ? 0 : 1);
        var2.method2302(-4, super.field7664 ? 1 : 0);
        var2.method2302(-4, super.field7659);
        var2.method2302(-4, super.field7644);
        var2.method2302(-4, super.field7647 ? 1 : 0);
        var2.method2302(-4, !super.field7641 ? 0 : 1);
        var2.method2302(-4, !super.field7636 ? 0 : 1);
        if (arg0 != 63) {
            return null;
        } else {
            var2.method2302(-4, super.field7653 ? 1 : 0);
            var2.method2302(-4, super.field7663);
            var2.method2302(-4, !super.field7646 ? 0 : 1);
            var2.method2302(-4, super.field7650);
            var2.method2302(-4, super.field7671);
            var2.method2302(-4, super.field7640);
            var2.method2355(arg0 ^ 1686288151, super.field7642);
            var2.method2355(1686288168, super.field7637);
            var2.method2302(-4, class122.method861((byte) 125));
            var2.method2359(super.field7645, -113);
            var2.method2302(-4, super.field7643);
            var2.method2302(-4, !super.field7633 ? 0 : 1);
            var2.method2302(arg0 + -67, super.field7654 ? 1 : 0);
            var2.method2302(-4, super.field7669);
            var2.method2302(-4, !super.field7656 ? 0 : 1);
            var2.method2302(arg0 ^ -61, !super.field7638 ? 0 : 1);
            var2.method2302(-4, super.field7661);
            var2.method2302(-4, super.field7631 ? 1 : 0);
            var2.method2302(-4, super.field7662);
            var2.method2302(-4, super.field7635);
            var2.method2302(-4, !super.field7632 ? 0 : 1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)V")
    public final void method1710(boolean arg0, int arg1) {
        super.field7639 = arg0;
        ++field3977;
        if (arg1 > -52) {
            field3986 = -79;
        }
        if (class78.field1141 != null) {
            class78.field1141.method2110(!this.method1712(class152.field2332, false), (byte) 13);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lsi;I)V")
    private final void method1711(class391 arg0, int arg1) {
        ++field3983;
        if (arg0.field5678.length - arg0.field5719 >= 1) {
            int var3 = arg0.method2348(arg1 ^ -22332);
            if (var3 >= 0 && var3 <= 17) {
                byte var4;
                if (~var3 == -18) {
                    var4 = 40;
                } else if (var3 == 16) {
                    var4 = 38;
                } else if (~var3 != -16) {
                    if (var3 == 14) {
                        var4 = 36;
                    } else if (~var3 != -14) {
                        if (~var3 == -13) {
                            var4 = 34;
                        } else if (~var3 == -12) {
                            var4 = 33;
                        } else if (~var3 == -11) {
                            var4 = 32;
                        } else if (~var3 == -10) {
                            var4 = 31;
                        } else if (~var3 != -9) {
                            if (~var3 == -8) {
                                var4 = 29;
                            } else if (var3 != 6) {
                                if (~var3 == -6) {
                                    var4 = 28;
                                } else if (var3 == 4) {
                                    var4 = 24;
                                } else if (~var3 != -4) {
                                    if (~var3 == -3) {
                                        var4 = 22;
                                    } else if (var3 == 1) {
                                        var4 = 23;
                                    } else {
                                        var4 = 19;
                                    }
                                } else {
                                    var4 = 23;
                                }
                            } else {
                                var4 = 28;
                            }
                        } else {
                            var4 = 30;
                        }
                    } else {
                        var4 = 35;
                    }
                } else {
                    var4 = 37;
                }
                if (~var4 >= ~(arg0.field5678.length - arg0.field5719)) {
                    super.field7666 = arg0.method2348(-2);
                    if (~super.field7666 > -2) {
                        super.field7666 = 1;
                    } else if (~super.field7666 < -5) {
                        super.field7666 = 4;
                    }
                    this.method1710(arg0.method2348(-2) == 1, -106);
                    super.field7665 = ~arg0.method2348(-2) == -2;
                    super.field7649 = ~arg0.method2348(arg1 ^ -22332) == -2;
                    super.field7652 = ~arg0.method2348(-2) == -2;
                    super.field7661 = arg0.method2348(arg1 ^ -22332) == 1 ? 1 : 0;
                    super.field7667 = ~arg0.method2348(-2) == -2;
                    super.field7660 = arg0.method2348(-2) == 1;
                    super.field7664 = arg0.method2348(-2) == 1;
                    super.field7659 = arg0.method2348(-2);
                    if (~super.field7659 < -3) {
                        super.field7659 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field7644 = arg0.method2348(-2);
                    }
                    if (var3 >= 2) {
                        super.field7647 = arg0.method2348(arg1 ^ -22332) == 1;
                        if (~var3 <= -18) {
                            super.field7641 = ~arg0.method2348(-2) == -2;
                        }
                    } else {
                        super.field7647 = arg0.method2348(-2) == 1;
                        arg0.method2348(-2);
                    }
                    super.field7636 = arg0.method2348(arg1 + -22332) == 1;
                    super.field7653 = ~arg0.method2348(-2) == -2;
                    super.field7663 = arg0.method2348(-2);
                    if (super.field7663 > 2) {
                        super.field7663 = 2;
                    }
                    super.field7670 = super.field7663;
                    super.field7646 = ~arg0.method2348(-2) == -2;
                    super.field7650 = arg0.method2348(-2);
                    if (super.field7650 > 127) {
                        super.field7650 = 127;
                    }
                    super.field7671 = arg0.method2348(-2);
                    super.field7640 = arg0.method2348(-2);
                    if (~super.field7640 < -128) {
                        super.field7640 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field7642 = arg0.method2353((byte) 116);
                        super.field7637 = arg0.method2353((byte) 113);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg0.method2348(-2);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method2348(-2);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class261.field3627 < 96) {
                            var5 = 0;
                        }
                        class292.method1732(2794, var5);
                    }
                    if (var3 >= 5) {
                        super.field7645 = arg0.method2361((byte) -56);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field7643 = var6 = arg0.method2348(arg1 ^ -22332);
                    }
                    if (~super.field7643 != -2 && ~super.field7643 != -3) {
                        super.field7643 = 2;
                    }
                    if (var3 >= 7) {
                        super.field7633 = arg0.method2348(arg1 + -22332) == 1;
                    }
                    if (var3 >= 8) {
                        super.field7654 = arg0.method2348(-2) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field7669 = arg0.method2348(-2);
                    }
                    if (super.field7669 < 0 || super.field7669 > class76.method607(class261.field3627, -20636)) {
                        super.field7669 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field7656 = arg0.method2348(-2) != 0;
                    }
                    if (var3 >= 11) {
                        super.field7638 = ~arg0.method2348(-2) != -1;
                    }
                    if (~var3 <= -13) {
                        super.field7661 = arg0.method2348(arg1 + -22332);
                    }
                    if (super.field7661 < 0 || super.field7661 > 2) {
                        super.field7661 = 1;
                    }
                    if (arg1 != 22330) {
                        field3987 = null;
                    }
                    if (~var3 <= -14) {
                        super.field7631 = arg0.method2348(arg1 ^ -22332) == 1;
                    }
                    if (~var3 <= -15) {
                        super.field7662 = arg0.method2348(-2);
                    } else if (~var6 != -1) {
                        super.field7662 = 1;
                    } else {
                        super.field7662 = 2;
                    }
                    if (super.field7662 < 0 || ~super.field7662 < -4) {
                        super.field7662 = 2;
                    }
                    if (var3 >= 15) {
                        super.field7635 = arg0.method2348(-2);
                        if (~super.field7635 > -1 || super.field7635 > 4) {
                            super.field7635 = ~class437.field6392 == -2 ? 2 : 4;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field7632 = ~arg0.method2348(-2) == -2;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field7632 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && ~super.field7662 == -1) {
                        super.field7662 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)Z")
    public final boolean method1712(int arg0, boolean arg1) {
        ++field3985;
        if (arg1) {
            this.method1710(false, 107);
        }
        return arg0 == 0 && !this.field3982 ? super.field7639 : true;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Z")
    public final boolean method1713(int arg0, int arg1) {
        ++field3981;
        if (arg1 != -22186) {
            field3986 = 38;
        }
        return arg0 == 0 ? super.field7639 : true;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILem;ILma;IILdq;ILjava/lang/String;Lla;II)V")
    public static final void method1714(int arg0, class150 arg1, int arg2, class10 arg3, int arg4, int arg5, class490 arg6, int arg7, String arg8, class315 arg9, int arg10, int arg11) {
        if (arg5 >= 65) {
            ++field3978;
            int var12;
            if (class491.field7168 == 4) {
                var12 = (int) class498.field7255 & 16383;
            } else {
                var12 = 16383 & (int) class498.field7255 + class302.field4143;
            }
            int var13 = 10 + Math.max(arg1.field2204 / 2, arg1.field2322 / 2);
            int var14 = arg7 * arg7 + arg11 * arg11;
            if (~var14 >= ~(var13 * var13)) {
                int var15 = class183.field2684[var12];
                int var16 = class183.field2678[var12];
                if (~class491.field7168 != -5) {
                    var16 = var16 * 256 / (class162.field2435 + 256);
                    var15 = var15 * 256 / (class162.field2435 + 256);
                }
                int var17 = arg7 * var15 + arg11 * var16 >> 15;
                int var18 = arg7 * var16 + -(arg11 * var15) >> 15;
                int var19 = arg6.method2865(-122, 100, (class16[]) null, arg8);
                int var20 = var17 - var19 / 2;
                int var21 = arg6.method2866(0, (class16[]) null, (byte) 89, 100, arg8);
                if (var20 >= -arg1.field2204 && arg1.field2204 >= var20 && -arg1.field2322 <= var18 && arg1.field2322 >= var18) {
                    arg9.method1832(0, arg3, 50, arg1.field2204 / 2 + arg2 + var20, arg10, arg2, arg8, 0, 1, arg0, arg0 - -(arg1.field2322 / 2) + -var21 - (var18 - -arg4), 0, (class16[]) null, var19, (int[]) null, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLdr;)V")
    public final void method1715(byte arg0, class504 arg1) {
        ++field3984;
        class355 var3 = null;
        try {
            class56 var4 = arg1.method2954(-29744, "");
            while (~var4.field667 == -1) {
                class157.method1046(-128, 1L);
            }
            if (~var4.field667 == -2) {
                var3 = (class355) var4.field670;
                class391 var5 = this.method1709((byte) 63);
                var3.method2121(0, (byte) -121, var5.field5719, var5.field5678);
            }
            int var6 = -82 % ((arg0 - -46) / 61);
        } catch (Exception var8) {
        }
        try {
            if (var3 != null) {
                var3.method2126(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method1716(int arg0) {
        if (arg0 < 48) {
            method1714(55, (class150) null, -31, (class10) null, 23, -2, (class490) null, -56, (String) null, (class315) null, -11, 3);
        }
        field3987 = null;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Ldr;)V")
    public class287(class504 arg0) {
        super.field7666 = 3;
        this.method1710(true, -126);
        super.field7665 = true;
        super.field7659 = 2;
        super.field7667 = true;
        super.field7671 = 255;
        super.field7637 = 0;
        super.field7641 = false;
        super.field7647 = true;
        super.field7660 = true;
        super.field7642 = 0;
        super.field7663 = 0;
        super.field7636 = true;
        super.field7650 = 127;
        super.field7652 = true;
        super.field7644 = 0;
        super.field7653 = true;
        super.field7664 = true;
        super.field7670 = 0;
        super.field7640 = 127;
        super.field7649 = true;
        super.field7646 = true;
        super.field7661 = 1;
        if (~class261.field3627 <= -97) {
            class292.method1732(2794, 2);
        } else {
            class292.method1732(2794, 0);
        }
        super.field7662 = 2;
        super.field7631 = true;
        super.field7656 = false;
        super.field7669 = 0;
        super.field7635 = ~class437.field6392 == -2 ? 2 : 4;
        super.field7654 = false;
        super.field7645 = 0;
        super.field7643 = 2;
        super.field7633 = false;
        super.field7638 = true;
        class355 var2 = null;
        try {
            class56 var3 = arg0.method2954(-29744, "");
            while (var3.field667 == 0) {
                class157.method1046(-128, 1L);
            }
            if (~var3.field667 == -2) {
                var2 = (class355) var3.field670;
                byte[] var4 = new byte[(int) var2.method2125(54)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method2124(var5, var4.length - var5, var4, false);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method1711(new class391(var4), 22330);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2126(-1);
            }
        } catch (Exception var7) {
        }
    }
}
