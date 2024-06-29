import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class46 extends class391 implements class83 {

    @OriginalMember(owner = "client!lu", name = "ab", descriptor = "S")
    private short field707;

    @OriginalMember(owner = "client!lu", name = "bb", descriptor = "Z")
    private boolean field708;

    @OriginalMember(owner = "client!lu", name = "fb", descriptor = "B")
    private byte field712;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "Z")
    private boolean field693;

    @OriginalMember(owner = "client!lu", name = "W", descriptor = "B")
    private byte field703;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "Z")
    private boolean field687;

    @OriginalMember(owner = "client!lu", name = "cb", descriptor = "Lda;")
    private class395 field709;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "Lha;")
    private class425 field689;

    @OriginalMember(owner = "client!lu", name = "S", descriptor = "Lmea;")
    public static class355 field700 = new class355("", 13);

    @OriginalMember(owner = "client!lu", name = "ib", descriptor = "[Lgk;")
    public static class540[] field715 = new class540[2048];

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!lu", name = "V", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!lu", name = "Y", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!lu", name = "db", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!lu", name = "gb", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!lu", name = "jb", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!lu", name = "kb", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!lu", name = "lb", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!lu", name = "mb", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!lu", name = "eb", descriptor = "Lf;")
    public static class256 field711;

    @OriginalMember(owner = "client!lu", name = "Z", descriptor = "Lifa;")
    private class62 field706;

    @OriginalMember(owner = "client!lu", name = "hb", descriptor = "[Lkv;")
    public static class16[] field714;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)I", line = 5)
    public final int method258(int arg0) {
        ++field704;
        if (arg0 != -1) {
            this.method265((class98) null, true);
        }
        return this.field709 != null ? this.field709.method1018() : 0;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Lr;I)V", line = 16)
    public final void method259(class98 arg0, int arg1) {
        ++field692;
        if (arg1 != 11771) {
            this.method265((class98) null, false);
        }
    }

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "(I)V", line = 28)
    public static void method260(int arg0) {
        field715 = null;
        field711 = null;
        field700 = null;
        if (arg0 >= 116) {
            field714 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIZLr;)Z", line = 44)
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        if (arg2) {
            return false;
        } else {
            ++field688;
            class395 var5 = this.method269(118, 131072, arg3);
            if (var5 != null) {
                class151 var6 = arg3.method682();
                var6.method883(super.field7895, super.field7894, super.field7896);
                return class384.field5767 ? var5.method1022(arg0, arg1, var6, false, class515.field7222) : var5.method1026(arg0, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(DB)V", line = 66)
    public static final void method262(double arg0, byte arg1) {
        ++field719;
        int var3 = 125 % ((9 - arg1) / 55);
        if (class526.field7479 != arg0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                int var5 = (int) (255.0D * Math.pow((double) var4 / 255.0D, arg0));
                class251.field3292[var4] = ~var5 < -256 ? 255 : var5;
            }
            class526.field7479 = arg0;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)I", line = 93)
    public final int method263(byte arg0) {
        ++field698;
        if (arg0 < 10) {
            method260(121);
        }
        return this.field703;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)I", line = 105)
    public final int method264(int arg0) {
        if (arg0 != -5273) {
            return -82;
        } else {
            ++field705;
            return this.field712;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lr;Z)V", line = 117)
    public final void method265(class98 arg0, boolean arg1) {
        if (arg1) {
            ++field696;
            Object var3 = null;
            class425 var5;
            if (this.field689 == null && this.field687) {
                class193 var4 = this.method267(arg0, -2462, true, 262144);
                var5 = var4 != null ? var4.field2595 : null;
            } else {
                var5 = this.field689;
                this.field689 = null;
            }
            if (var5 != null) {
                class91.method508(var5, super.field7900, super.field7895, super.field7896, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Z", line = 147)
    public final boolean method266(int arg0) {
        if (arg0 != 28107) {
            return true;
        } else {
            ++field710;
            return this.field687;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lr;IZI)Ldg;", line = 159)
    private final class193 method267(class98 arg0, int arg1, boolean arg2, int arg3) {
        ++field691;
        class289 var5 = class60.field965.method2596(arg1 + 2462, 65535 & this.field707);
        if (arg1 != -2462) {
            return null;
        } else {
            class682 var6;
            class682 var7;
            if (!this.field708) {
                if (super.field7900 >= 3) {
                    var6 = null;
                } else {
                    var6 = class262.field3404[super.field7900 - -1];
                }
                var7 = class262.field3404[super.field7900];
            } else {
                var6 = class262.field3404[0];
                var7 = class383.field5753[super.field7900];
            }
            return var5.method1781(this.field703, var7, 19886, arg3, var6, super.field7894, this.field712, super.field7896, arg2, arg0, super.field7895);
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(Lr;I)Lifa;", line = 193)
    public final class62 method268(class98 arg0, int arg1) {
        ++field695;
        if (arg1 != 0) {
            field715 = null;
        }
        if (this.field706 == null) {
            this.field706 = class249.method1513(super.field7896, super.field7894, this.method269(120, 0, arg0), 2, super.field7895);
        }
        return this.field706;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lr;Llt;IIIIIZIIII)V", line = 212)
    public class46(class98 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field707 = (short) arg1.field4224;
        this.field708 = arg7;
        this.field712 = (byte) arg10;
        this.field693 = arg1.field4250 != 0 && !arg7;
        this.field703 = (byte) arg11;
        super.field7895 = arg4;
        super.field7896 = arg6;
        this.field687 = arg0.method671() && arg1.field4219 && !this.field708 && ~class335.field4872.method3786(class62.field996, false) != -1;
        class193 var13 = this.method267(arg0, -2462, this.field687, 2048);
        if (var13 != null) {
            this.field709 = var13.field2594;
            this.field689 = var13.field2595;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILr;)Lda;", line = 237)
    private final class395 method269(int arg0, int arg1, class98 arg2) {
        ++field694;
        if (this.field709 != null && arg2.method706(this.field709.method1027(), arg1) == 0) {
            return this.field709;
        } else {
            class193 var4 = this.method267(arg2, -2462, false, arg1);
            if (arg0 < 64) {
                return null;
            } else {
                return var4 == null ? null : var4.field2594;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)Z", line = 261)
    public final boolean method270(int arg0) {
        if (arg0 > -42) {
            this.field689 = null;
        }
        ++field697;
        return true;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)I", line = 279)
    public final int method271(boolean arg0) {
        ++field702;
        if (arg0) {
            this.method263((byte) -59);
        }
        return this.field709 != null ? this.field709.method1007() : 0;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lr;I)Lhr;", line = 291)
    public final class218 method272(class98 arg0, int arg1) {
        ++field699;
        if (this.field709 == null) {
            return null;
        } else {
            class151 var3 = arg0.method682();
            if (arg1 != -1) {
                return null;
            } else {
                var3.method883(super.field5913 + super.field7895, super.field7894, super.field5912 + super.field7896);
                class218 var4 = null;
                if (this.field693) {
                    var4 = class187.method1237(1, (byte) 80);
                }
                if (class384.field5767) {
                    this.field709.method1030(var3, var4 != null ? var4.field2902[0] : null, class515.field7222, 0);
                } else {
                    this.field709.method1054(var3, var4 != null ? var4.field2902[0] : null, 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLr;)V", line = 322)
    public final void method273(byte arg0, class98 arg1) {
        ++field716;
        Object var3 = null;
        class425 var5;
        if (this.field689 == null && this.field687) {
            class193 var4 = this.method267(arg1, -2462, true, 262144);
            var5 = var4 == null ? null : var4.field2595;
        } else {
            var5 = this.field689;
            this.field689 = null;
        }
        if (var5 != null) {
            class445.method2628(var5, super.field7900, super.field7895, super.field7896, (boolean[]) null);
        }
        int var6 = -119 % ((2 - arg0) / 56);
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)Z", line = 349)
    public final boolean method274(int arg0) {
        ++field701;
        if (arg0 != -1510217528) {
            this.method269(75, -36, (class98) null);
        }
        return this.field709 != null ? this.field709.method1024() : false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", line = 371)
    public static final void method275(String arg0, int arg1, String arg2, String arg3, int arg4, String arg5, int arg6) {
        if (arg4 == 255) {
            class408.method2504(arg5, arg6, arg0, -1, arg1, arg2, (String) null, arg3, arg4 + -255);
            ++field718;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 382)
    public final void method276(int arg0) {
        if (this.field709 != null) {
            this.field709.method1016();
        }
        if (arg0 >= 63) {
            ++field713;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)I", line = 395)
    public final int method277(byte arg0) {
        ++field690;
        return arg0 != 95 ? 55 : 65535 & this.field707;
    }
}
