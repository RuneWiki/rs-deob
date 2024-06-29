import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class52 extends class535 implements class68 {

    @OriginalMember(owner = "client!u", name = "N", descriptor = "S")
    private short field731;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "B")
    private byte field714;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Z")
    private boolean field723;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Z")
    private boolean field711;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Z")
    private boolean field712;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "B")
    private byte field733;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "B")
    private byte field737;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Z")
    private boolean field715;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Lia;")
    private class423 field740;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lka;")
    public class334 field710;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "[S")
    public static short[] field720 = new short[256];

    @OriginalMember(owner = "client!u", name = "O", descriptor = "Lla;")
    public static class319 field732 = new class319(13, 8);

    @OriginalMember(owner = "client!u", name = "S", descriptor = "[I")
    public static int[] field736 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Lla;")
    public static class319 field735 = new class319(44, 14);

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "Luu;")
    public static class191 field741;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILqa;I)Lka;", line = 5)
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        ++field734;
        return arg2 != 14221 ? null : this.method389(arg0, arg1, (byte) 104);
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V", line = 17)
    public final void method175(int arg0) {
        if (arg0 != 0) {
            this.field714 = 36;
        }
        this.field712 = false;
        ++field725;
        if (this.field710 != null) {
            this.field710.method62(this.field710.method46() & -65537);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I", line = 34)
    public final int method336(int arg0) {
        ++field721;
        if (arg0 != -6130) {
            this.field711 = true;
        }
        return this.field737;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I", line = 47)
    public final int method338(int arg0) {
        if (arg0 < 75) {
            field720 = null;
        }
        ++field728;
        return this.field731 & 65535;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLqa;)V", line = 61)
    public final void method333(boolean arg0, class165 arg1) {
        ++field718;
        Object var3 = null;
        class423 var5;
        if (this.field740 == null && this.field715) {
            class404 var4 = this.method388(262144, arg1, true, (byte) -117);
            var5 = var4 == null ? null : var4.field6124;
        } else {
            var5 = this.field740;
            this.field740 = null;
        }
        if (arg0) {
            if (var5 != null) {
                class335.method2169(var5, this.field733, super.field7860, super.field7858, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(ZLqa;)V", line = 89)
    public final void method135(boolean arg0, class165 arg1) {
        if (arg0) {
            this.method176(false);
        }
        ++field717;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V", line = 99)
    public static void method387(byte arg0) {
        field736 = null;
        field732 = null;
        field741 = null;
        field735 = null;
        field720 = null;
        int var1 = -73 % ((arg0 - -22) / 60);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Z", line = 116)
    public final boolean method339(int arg0) {
        if (arg0 != 3583) {
            field735 = null;
        }
        ++field729;
        return this.field715;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILa;IIILqa;Z)V", line = 128)
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        if (arg2 > -4) {
            this.method334(16);
        }
        ++field719;
        if (arg1 instanceof class52) {
            class52 var8 = (class52) arg1;
            if (this.field710 != null && var8.field710 != null) {
                this.field710.method50(var8.field710, arg3, arg0, arg4, arg6);
            }
        } else {
            if (arg1 instanceof class159) {
                class159 var9 = (class159) arg1;
                if (this.field710 != null && var9.field2057 != null) {
                    this.field710.method50(var9.field2057, arg3, arg0, arg4, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lqa;I)V", line = 159)
    public final void method330(class165 arg0, int arg1) {
        if (arg1 == 14470) {
            ++field727;
            Object var3 = null;
            class423 var5;
            if (this.field740 == null && this.field715) {
                class404 var4 = this.method388(262144, arg0, true, (byte) -122);
                var5 = var4 != null ? var4.field6124 : null;
            } else {
                var5 = this.field740;
                this.field740 = null;
            }
            if (var5 != null) {
                class235.method1562(var5, this.field733, super.field7860, super.field7858, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lqa;Lcd;IIIIZIIZ)V", line = 191)
    public class52(class165 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class376.method2363(arg7, 3, arg8));
        this.field731 = (short) arg1.field2936;
        this.field714 = (byte) arg8;
        this.field723 = arg1.field2930 != 0 && !arg6;
        this.field711 = arg6;
        super.field7860 = arg3;
        this.field712 = arg9;
        this.field733 = (byte) arg2;
        super.field7858 = arg5;
        this.field737 = (byte) arg7;
        this.field715 = arg0.method786() && arg1.field2889 && !this.field711 && class203.field2716.method552(-4, class378.field5771) != 0;
        int var11 = 2048;
        if (this.field712) {
            var11 |= 65536;
        }
        class404 var12 = this.method388(var11, arg0, this.field715, (byte) -120);
        if (var12 != null) {
            this.field740 = var12.field6124;
            this.field710 = var12.field6128;
            if (this.field712) {
                this.field710 = this.field710.method47((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILqa;ZB)Lkj;", line = 238)
    private final class404 method388(int arg0, class165 arg1, boolean arg2, byte arg3) {
        ++field726;
        int var5 = 22 / ((-66 - arg3) / 42);
        class209 var6 = class432.field6575.method1872(this.field731 & 65535, false);
        class23 var7;
        class23 var8;
        if (this.field711) {
            var7 = class414.field6317[0];
            var8 = class71.field988[this.field733];
        } else {
            if (~this.field733 <= -4) {
                var7 = null;
            } else {
                var7 = class414.field6317[this.field733 + 1];
            }
            var8 = class414.field6317[this.field733];
        }
        return var6.method1446(var7, this.field714, super.field7855, arg0, 262144, arg1, arg2, this.field737, var8, super.field7858, super.field7860);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILqa;B)Lka;", line = 268)
    private final class334 method389(int arg0, class165 arg1, byte arg2) {
        ++field730;
        if (this.field710 != null && ~arg1.method775(this.field710.method46(), arg0) == -1) {
            return this.field710;
        } else {
            class404 var4 = this.method388(arg0, arg1, false, (byte) -16);
            if (arg2 != 104) {
                this.method176(true);
            }
            return var4 == null ? null : var4.field6128;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BIILqa;)Z", line = 288)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field739;
        class334 var5 = this.method389(131072, arg3, (byte) 104);
        if (arg0 < 121) {
            return true;
        } else if (var5 != null) {
            class14 var6 = arg3.method751();
            var6.method141(super.field7860, super.field7855, super.field7858);
            return var5.method68(arg2, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V", line = 311)
    public final void method334(int arg0) {
        if (arg0 == 29893) {
            if (this.field710 != null) {
                this.field710.method83();
            }
            ++field738;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)Z", line = 325)
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field724;
            return this.field712;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILik;)I", line = 336)
    public static final int method390(int arg0, class141 arg1) {
        ++field722;
        int var2 = arg1.method949(arg0 + -11965, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 != 1) {
            if (~var2 != -3) {
                var3 = arg1.method949(arg0 ^ 11990, 11);
            } else {
                var3 = arg1.method949(arg0 + -11948, 8);
            }
        } else {
            var3 = arg1.method949(arg0 + -11984, 5);
        }
        if (arg0 != 12002) {
            field732 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I", line = 363)
    public final int method332(int arg0) {
        ++field713;
        if (arg0 != 6359) {
            method387((byte) -110);
        }
        return this.field714;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILqa;)Lou;", line = 375)
    public final class437 method136(int arg0, class165 arg1) {
        ++field716;
        if (this.field710 == null) {
            return null;
        } else {
            class14 var3 = arg1.method751();
            var3.method141(super.field7860, super.field7855, super.field7858);
            class437 var4 = null;
            if (this.field723) {
                var4 = class530.method3133(false, 1);
            }
            this.field710.method53(var3, var4 == null ? null : var4.field6608[0], arg0);
            return var4;
        }
    }
}
