import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class409 extends class5 implements class223 {

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "Lmj;")
    public class171 field5704;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Z")
    private boolean field5700;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field5703 = 64;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Lij;")
    public static class316 field5702;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "[I")
    public static int[] field5711;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z")
    public final boolean method706(boolean arg0) {
        ++field5716;
        return !arg0 ? true : this.field5704.method1222((byte) -94);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILea;Lac;ZII)V")
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 != 22546) {
            this.method696(-42, (class58) null);
        }
        ++field5701;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILea;)V")
    public final void method704(int arg0, class58 arg1) {
        ++field5717;
        this.field5704.method1216(-15436, arg1);
        if (arg0 != -29096) {
            this.method699(108, 100, (class58) null, (class216) null, true, 39, 24);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLea;)V")
    public final void method698(byte arg0, class58 arg1) {
        ++field5705;
        int var3 = 119 / ((arg0 - 24) / 49);
        this.field5704.method1226(-63, arg1);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lea;BI)Lts;")
    public final class116 method705(class58 arg0, byte arg1, int arg2) {
        if (arg1 != -63) {
            return null;
        } else {
            ++field5713;
            return this.field5704.method1223(0, arg0, false, 0, arg2, 18928, false);
        }
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)I")
    public final int method23(int arg0) {
        ++field5715;
        return arg0 > -84 ? -83 : this.field5704.method1217(-12);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(ILea;)Lms;")
    public final class450 method696(int arg0, class58 arg1) {
        ++field5696;
        class116 var3 = this.field5704.method1223(super.field40, arg1, false, super.field44, 1024, 18928, true);
        if (var3 == null) {
            return null;
        } else {
            class309 var4 = arg1.method210();
            if (arg0 != 0) {
                field5703 = -104;
            }
            var4.method1866(super.field40, super.field45, super.field44);
            class450 var5 = null;
            if (this.field5700) {
                var5 = class61.method494(-54, 1);
            }
            if (this.field5704.field2434 == null) {
                var3.method896(var4, var5 == null ? null : var5.field6451[0], 0);
            } else {
                class174 var6 = this.field5704.field2434.method1552();
                arg1.method172(var3, var6, var4, var5 != null ? var5.field6451[0] : null, 0);
            }
            this.field5704.method1225((byte) 111, arg1, true, super.field41, super.field55, super.field52, super.field47, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)I")
    public final int method711(boolean arg0) {
        ++field5712;
        return !arg0 ? 67 : this.field5704.field2445;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        if (arg0 != 46) {
            this.method711(false);
        }
        ++field5698;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lea;I)V")
    public final void method707(class58 arg0, int arg1) {
        if (arg1 < -99) {
            ++field5699;
            class116 var3 = this.field5704.method1223(super.field40, arg0, true, super.field44, 131072, 18928, true);
            if (var3 != null) {
                this.field5704.method1225((byte) 49, arg0, false, super.field41, super.field55, super.field52, super.field47, var3);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)V")
    public static void method2538(int arg0) {
        int var1 = -94 % ((-52 - arg0) / 59);
        field5711 = null;
        field5702 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final void method708(int arg0) {
        if (arg0 == 26389) {
            ++field5708;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)I")
    public final int method695(int arg0) {
        if (arg0 != 898) {
            return -110;
        } else {
            ++field5710;
            return this.field5704.field2438;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZILea;I)Z")
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        ++field5707;
        class116 var5 = this.field5704.method1223(super.field40, arg2, false, super.field44, 65536, 18928, false);
        if (var5 == null) {
            return false;
        } else {
            class309 var6 = arg2.method210();
            var6.method1866(super.field40, super.field45, super.field44);
            if (!arg0) {
                this.method708(-83);
            }
            return var5.method898(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)Z")
    public final boolean method697(int arg0) {
        if (arg0 < 115) {
            return true;
        } else {
            ++field5709;
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lea;Lp;IIIIIIIZIIIII)V")
    public class409(class58 arg0, class447 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field6308 == -2, class221.method1462(arg3, arg2, (byte) -18));
        this.field5704 = new class171(arg0, arg1, arg2, arg3, super.field42, arg5, arg6, arg8, arg9, arg14);
        this.field5700 = ~arg1.field6297 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
    public static final void method2539(byte arg0) {
        if (arg0 != 6) {
            method2539((byte) -66);
        }
        ++field5714;
        if (~class269.field3686 < -1) {
            class67.method539(false);
        } else {
            class186.field2680 = class398.field5513;
            class398.field5513 = null;
            class191.method1321(40, 40);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)V")
    public static final void method2540(int arg0, int arg1, int arg2, int arg3) {
        class88.field1232.method2261(arg1, -176);
        if (arg3 != -1) {
            field5702 = null;
        }
        ++field5718;
        class88.field1232.method2267(arg2, (byte) -103);
        class88.field1232.method2267(arg0, (byte) -103);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I")
    public final int method709(int arg0) {
        if (arg0 != 30030) {
            this.method697(5);
        }
        ++field5697;
        return this.field5704.field2437;
    }
}
