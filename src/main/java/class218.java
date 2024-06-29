import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class218 extends class270 implements class323 {

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "B")
    private byte field2800;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "B")
    private byte field2798;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "B")
    private byte field2788;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "Z")
    private boolean field2811;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "Z")
    private boolean field2802;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "S")
    private short field2795;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "Z")
    private boolean field2804;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "Z")
    private boolean field2801;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "Lj;")
    private class254 field2797;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Lc;")
    public class507 field2809;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Z")
    public static boolean field2785 = false;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I", line = 7)
    public final int method413(int arg0) {
        ++field2786;
        return arg0 != -30502 ? 31 : 65535 & this.field2795;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lqa;B)Lvs;", line = 20)
    public final class465 method172(class129 arg0, byte arg1) {
        ++field2792;
        if (this.field2809 == null) {
            return null;
        } else {
            int var3 = 50 % ((48 - arg1) / 60);
            class142 var4 = arg0.method847();
            var4.method982(super.field3421, super.field3422, super.field3420);
            class465 var5 = null;
            if (this.field2811) {
                var5 = class92.method635(1, -16461);
            }
            this.field2809.method520(var4, var5 == null ? null : var5.field6843[0], 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILeo;Leo;)V", line = 47)
    public static final void method1392(int arg0, class423 arg1, class423 arg2) {
        class420.method2472((byte) -101, class234.field3050);
        ++field2794;
        ++class278.field3548;
        class319.field4112.method572(-106, arg1.field5734);
        class319.field4112.method562(54, arg2.field5734);
        if (arg0 == 12574) {
            class319.field4112.method609(arg2.field5756, -87);
            class319.field4112.method560(false, arg1.field5756);
            class319.field4112.method609(arg2.field5763, -49);
            class319.field4112.method609(arg1.field5763, -100);
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)I", line = 66)
    public final int method415(int arg0) {
        ++field2806;
        if (arg0 != -15317) {
            this.field2811 = false;
        }
        return this.field2788;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IILqa;)Lc;", line = 78)
    private final class507 method1393(int arg0, int arg1, class129 arg2) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field2803;
            if (this.field2809 != null && arg2.method880(this.field2809.method475(), arg0) == 0) {
                return this.field2809;
            } else {
                class445 var4 = this.method1395(arg2, false, (byte) 71, arg0);
                return var4 == null ? null : var4.field6188;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 98)
    public final void method173(byte arg0) {
        this.field2802 = false;
        if (arg0 != -32) {
            field2785 = false;
        }
        ++field2789;
        if (this.field2809 != null) {
            this.field2809.method517(this.field2809.method475() & -65537);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lqa;I)V", line = 114)
    public final void method416(class129 arg0, int arg1) {
        ++field2810;
        Object var3 = null;
        class254 var5;
        if (this.field2797 == null && this.field2801) {
            class445 var4 = this.method1395(arg0, true, (byte) 76, 262144);
            var5 = var4 != null ? var4.field6182 : null;
        } else {
            var5 = this.field2797;
            this.field2797 = null;
        }
        if (var5 != null) {
            class518.method3076(var5, this.field2798, super.field3421, super.field3420, (boolean[]) null);
        }
        if (arg1 != 16663) {
            field2785 = false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)Z", line = 142)
    public final boolean method177(int arg0) {
        ++field2791;
        return arg0 != 5 ? true : this.field2802;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lqa;B)V", line = 153)
    public final void method421(class129 arg0, byte arg1) {
        ++field2808;
        if (arg1 > -88) {
            field2785 = true;
        }
        Object var3 = null;
        class254 var5;
        if (this.field2797 == null && this.field2801) {
            class445 var4 = this.method1395(arg0, true, (byte) 38, 262144);
            var5 = var4 == null ? null : var4.field6182;
        } else {
            var5 = this.field2797;
            this.field2797 = null;
        }
        if (var5 != null) {
            class24.method161(var5, this.field2798, super.field3421, super.field3420, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLqa;)V", line = 183)
    public final void method175(byte arg0, class129 arg1) {
        if (arg0 != 91) {
            method1396((byte) -20);
        }
        ++field2783;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 206)
    public static final void method1394(boolean arg0, String arg1) {
        ++field2784;
        if (arg1 != null) {
            if ((~class364.field4692 > -101 || class28.field478) && ~class364.field4692 > -201) {
                String var2 = class61.method347(31608, arg1);
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class364.field4692; ++var3) {
                        String var7 = class61.method347(31608, class231.field2996[var3]);
                        if (var7 != null && var7.equals(var2)) {
                            class360.method2120(arg1 + class510.field7490.method1127(class379.field4920, arg0), 102);
                            return;
                        }
                        if (class276.field3538[var3] != null) {
                            String var8 = class61.method347(31608, class276.field3538[var3]);
                            if (var8 != null && var8.equals(var2)) {
                                class360.method2120(arg1 + class510.field7490.method1127(class379.field4920, arg0), 116);
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; class104.field1424 > var4; ++var4) {
                        String var5 = class61.method347(31608, class271.field3444[var4]);
                        if (var5 != null && var5.equals(var2)) {
                            class360.method2120(class486.field7060.method1127(class379.field4920, false) + arg1 + class380.field4945.method1127(class379.field4920, false), 123);
                            return;
                        }
                        if (class303.field3925[var4] != null) {
                            String var6 = class61.method347(31608, class303.field3925[var4]);
                            if (var6 != null && var6.equals(var2)) {
                                class360.method2120(class486.field7060.method1127(class379.field4920, arg0) + arg1 + class380.field4945.method1127(class379.field4920, false), 88);
                                return;
                            }
                        }
                    }
                    if (arg0) {
                        field2785 = true;
                    }
                    if (class61.method347(31608, class37.field573.field7630).equals(var2)) {
                        class360.method2120(class521.field7732.method1127(class379.field4920, arg0), 72);
                    } else {
                        class420.method2472((byte) -101, class408.field5463);
                        ++class527.field7786;
                        class319.field4112.method565(52, class415.method2442(-97, arg1));
                        class319.field4112.method597(-128, arg1);
                    }
                }
            } else {
                class360.method2120(class192.field2490.method1127(class379.field4920, false), 83);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZILqa;)Z", line = 303)
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field2813;
        class507 var5 = this.method1393(131072, 0, arg3);
        if (var5 != null) {
            class142 var6 = arg3.method847();
            var6.method982(super.field3421, super.field3422, super.field3420);
            return var5.method499(arg0, arg2, var6, false);
        } else {
            if (arg1) {
                this.field2809 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLrn;ZIILqa;I)V", line = 327)
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        if (arg0 != 91) {
            this.method174((byte) 122, (class242) null, true, -27, -123, (class129) null, 126);
        }
        ++field2807;
        if (!(arg1 instanceof class218)) {
            if (arg1 instanceof class107) {
                class107 var8 = (class107) arg1;
                if (this.field2809 != null && var8.field1456 != null) {
                    this.field2809.method483(var8.field1456, arg6, arg4, arg3, arg2);
                    return;
                }
            }
        } else {
            class218 var9 = (class218) arg1;
            if (this.field2809 == null || var9.field2809 == null) {
                return;
            }
            this.field2809.method483(var9.field2809, arg6, arg4, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)Z", line = 360)
    public final boolean method417(boolean arg0) {
        if (arg0) {
            field2785 = false;
        }
        ++field2812;
        return this.field2801;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I", line = 372)
    public final int method414(int arg0) {
        ++field2796;
        return arg0 != 17350 ? -99 : this.field2800;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lqa;ZBI)Ldf;", line = 387)
    private final class445 method1395(class129 arg0, boolean arg1, byte arg2, int arg3) {
        ++field2787;
        if (arg2 <= 24) {
            return null;
        } else {
            class402 var5 = class52.field715.method1164(this.field2795 & 65535, 0);
            class251 var6;
            class251 var7;
            if (this.field2804) {
                var6 = class405.field5436[0];
                var7 = class283.field3620[this.field2798];
            } else {
                var7 = class405.field5436[this.field2798];
                if (this.field2798 >= 3) {
                    var6 = null;
                } else {
                    var6 = class405.field5436[this.field2798 + 1];
                }
            }
            return var5.method2383(super.field3421, (byte) 20, arg1, arg3, var6, this.field2800, super.field3422, super.field3420, var7, this.field2788, arg0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILqa;)Lc;", line = 417)
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        if (arg1 != -32039) {
            this.field2802 = false;
        }
        ++field2790;
        return this.method1393(arg0, arg1 + 32039, arg2);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lqa;Ljt;IIIIZIIZ)V", line = 429)
    public class218(class129 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class70.method399(arg8, arg7, 123));
        super.field3421 = arg3;
        this.field2800 = (byte) arg7;
        this.field2798 = (byte) arg2;
        this.field2788 = (byte) arg8;
        this.field2811 = arg1.field5347 != 0 && !arg6;
        this.field2802 = arg9;
        super.field3420 = arg5;
        this.field2795 = (short) arg1.field5377;
        this.field2804 = arg6;
        this.field2801 = arg0.method903() && arg1.field5420 && !this.field2804 && ~class421.field5647.method3097((byte) 124, class520.field7690) != -1;
        int var11 = 2048;
        if (this.field2802) {
            var11 |= 65536;
        }
        class445 var12 = this.method1395(arg0, this.field2801, (byte) 62, var11);
        if (var12 != null) {
            this.field2797 = var12.field6182;
            this.field2809 = var12.field6188;
            if (this.field2802) {
                this.field2809 = this.field2809.method510((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 466)
    public final void method418(int arg0) {
        if (arg0 != -14924) {
            method1396((byte) -66);
        }
        if (this.field2809 != null) {
            this.field2809.method492();
        }
        ++field2799;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 479)
    public static final void method1396(byte arg0) {
        ++field2793;
        int var1 = 0;
        if (arg0 != 110) {
            field2805 = -83;
        }
        while (~var1 > -101) {
            class76.field967[var1] = true;
            ++var1;
        }
    }
}
