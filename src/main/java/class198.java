import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class198 extends class276 implements class265 {

    @OriginalMember(owner = "client!km", name = "B", descriptor = "B")
    private byte field2694;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "Z")
    private boolean field2711;

    @OriginalMember(owner = "client!km", name = "U", descriptor = "B")
    private byte field2712;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "S")
    private short field2687;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "Z")
    private boolean field2700;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "Z")
    private boolean field2699;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "Z")
    private boolean field2691;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "Llg;")
    private class238 field2686;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "Lmj;")
    private class393 field2695;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!km", name = "V", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "[[S")
    public static short[][] field2693;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)I", line = 3)
    public final int method210(int arg0) {
        if (arg0 != -23890) {
            this.field2691 = false;
        }
        ++field2706;
        return 22;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I", line = 15)
    public final int method225(int arg0) {
        if (arg0 < 66) {
            this.field2691 = false;
        }
        ++field2701;
        return this.field2687 & 65535;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Len;B)V", line = 29)
    public final void method226(class174 arg0, byte arg1) {
        ++field2707;
        Object var3 = null;
        class238 var5;
        if (this.field2686 == null && this.field2691) {
            class403 var4 = this.method1268(true, 131072, arg0, -59);
            var5 = var4 != null ? var4.field5879 : null;
        } else {
            var5 = this.field2686;
            this.field2686 = null;
        }
        if (var5 != null) {
            class148.method880(var5, this.field2712, super.field3892, super.field3894, (boolean[]) null);
        }
        if (arg1 <= 88) {
            field2693 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)Z", line = 59)
    public final boolean method217(int arg0) {
        ++field2688;
        int var2 = -123 % ((arg0 - -60) / 37);
        return this.field2699;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILen;IBLfs;IZ)V", line = 76)
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        ++field2685;
        if (arg3 == -42) {
            if (arg4 instanceof class198) {
                class198 var8 = (class198) arg4;
                if (this.field2695 != null && var8.field2695 != null) {
                    this.field2695.method726(var8.field2695, arg2, arg0, arg5, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(B)V", line = 96)
    public static void method1265(byte arg0) {
        field2693 = null;
        if (arg0 <= 2) {
            method1266(-124, 32);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Z", line = 109)
    public static final boolean method1266(int arg0, int arg1) {
        if (arg0 != -8868) {
            method1269(-85, -48, -74, -42, -81);
        }
        ++field2690;
        class175 var2 = class327.method2012(arg1, false);
        if (var2 == null) {
            return false;
        } else if (~class378.field5553 != -4) {
            class85.field950 = var2.field2436;
            class23.field229 = var2.field2431;
            if (~class213.field2908 != -1) {
                class249.field3394 = class23.field229 + 40000;
                class2.field23 = class23.field229 + 50000;
                class375.field5469 = class249.field3394;
            }
            return true;
        } else {
            String var3 = "";
            if (~class213.field2908 != -1) {
                var3 = ":" + (var2.field2431 + 7000);
            }
            String var4 = "";
            if (class100.field1130 != null) {
                var4 = "/p=" + class100.field1130;
            }
            String var5 = "http://" + var2.field2436 + var3 + "/l=" + class297.field4234 + "/a=" + class404.field5884 + var4 + "/j" + (!class220.field3019 ? "0" : "1") + ",o" + (!class242.field3271 ? "0" : "1") + ",a2";
            try {
                class407.field5920.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BILen;)Lmj;", line = 160)
    public final class393 method209(byte arg0, int arg1, class174 arg2) {
        if (arg0 != 58) {
            return null;
        } else {
            ++field2713;
            return this.method1267(arg1, -4, arg2);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZLen;)Z", line = 174)
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        ++field2709;
        if (!arg2) {
            this.field2700 = false;
        }
        class393 var5 = this.method1267(65536, -4, arg3);
        if (var5 != null) {
            class71 var6 = arg3.method1015();
            var6.method123(super.field3892, super.field3889, super.field3894);
            return var5.method724(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Len;Lnl;IIIIZIZ)V", line = 195)
    public class198(class174 arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field4642, arg1.field4623);
        this.field2694 = (byte) arg7;
        this.field2711 = ~arg1.field4677 != -1;
        this.field2712 = (byte) arg2;
        this.field2687 = (short) arg1.field4592;
        super.field3892 = (short) arg3;
        this.field2700 = arg6;
        this.field2699 = arg8;
        super.field3894 = (short) arg5;
        this.field2691 = arg0.method963() && arg1.field4625 && !this.field2700 && class341.field5022 != 0;
        int var10 = 1024;
        if (this.field2699) {
            var10 |= 32768;
        }
        class403 var11 = this.method1268(this.field2691, var10, arg0, -33);
        if (var11 != null) {
            this.field2686 = var11.field5879;
            this.field2695 = var11.field5880;
            if (this.field2699) {
                this.field2695 = this.field2695.method717((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Len;I)V", line = 230)
    public final void method211(class174 arg0, int arg1) {
        ++field2696;
        if (arg1 != 0) {
            field2693 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILen;)Lir;", line = 242)
    public final class19 method213(int arg0, class174 arg1) {
        ++field2692;
        if (this.field2695 == null) {
            return null;
        } else {
            class71 var3 = arg1.method1015();
            var3.method123(super.field3892, super.field3889, super.field3894);
            class19 var4 = null;
            if (arg0 >= -5) {
                field2693 = null;
            }
            if (this.field2711) {
                var4 = class358.method2286(true, 1);
            }
            this.field2695.method775(var3, var4 != null ? var4.field197[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)I", line = 268)
    public final int method214(int arg0) {
        ++field2705;
        if (arg0 > -95) {
            this.method225(85);
        }
        return this.field2694;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLen;)V", line = 279)
    public final void method212(byte arg0, class174 arg1) {
        if (arg0 <= -29) {
            ++field2708;
            Object var3 = null;
            class238 var5;
            if (this.field2686 == null && this.field2691) {
                class403 var4 = this.method1268(true, 131072, arg1, -106);
                var5 = var4 == null ? null : var4.field5879;
            } else {
                var5 = this.field2686;
                this.field2686 = null;
            }
            if (var5 != null) {
                class190.method1219(var5, this.field2712, super.field3892, super.field3894, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILen;)Lmj;", line = 308)
    private final class393 method1267(int arg0, int arg1, class174 arg2) {
        ++field2710;
        if (this.field2695 != null && arg2.method1016(this.field2695.method720(), arg0) == 0) {
            return this.field2695;
        } else {
            if (arg1 != -4) {
                this.field2712 = -107;
            }
            class403 var4 = this.method1268(false, arg0, arg2, arg1 + -39);
            return var4 != null ? var4.field5880 : null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZILen;I)Lgi;", line = 328)
    private final class403 method1268(boolean arg0, int arg1, class174 arg2, int arg3) {
        ++field2702;
        class327 var5 = class157.method1036(0, this.field2687 & 65535);
        if (arg3 >= -14) {
            return null;
        } else {
            class319 var6;
            class319 var7;
            if (this.field2700) {
                var6 = class78.field887[0];
                var7 = class111.field1285[this.field2712];
            } else {
                var7 = class78.field887[this.field2712];
                if (~this.field2712 > -4) {
                    var6 = class78.field887[this.field2712 + 1];
                } else {
                    var6 = null;
                }
            }
            return var5.method2015(super.field3889, var6, this.field2694, 22, arg0, super.field3892, arg1, arg2, 111, var7, super.field3894);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)Z", line = 358)
    public final boolean method215(int arg0) {
        if (arg0 >= -92) {
            return false;
        } else {
            ++field2703;
            return this.field2691;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)V", line = 372)
    public static final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2698;
        class348 var5 = class385.method2464(arg3, 1302, arg1);
        var5.method2216((byte) 23);
        var5.field5093 = arg4;
        var5.field5091 = arg2;
        var5.field5094 = arg0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 388)
    public final void method207(byte arg0) {
        if (this.field2695 != null) {
            this.field2695.method752();
        }
        if (arg0 == 111) {
            ++field2697;
        }
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V", line = 403)
    public final void method224(int arg0) {
        ++field2689;
        this.field2699 = false;
        int var2 = -91 % ((52 - arg0) / 46);
        if (this.field2695 != null) {
            this.field2695.method774(this.field2695.method720() & -32769);
        }
    }
}
