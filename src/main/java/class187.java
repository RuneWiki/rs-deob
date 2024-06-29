import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class187 extends class350 implements class395 {

    @OriginalMember(owner = "client!tm", name = "bb", descriptor = "Z")
    private boolean field2776;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "B")
    private byte field2753;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "B")
    private byte field2762;

    @OriginalMember(owner = "client!tm", name = "P", descriptor = "Z")
    private boolean field2764;

    @OriginalMember(owner = "client!tm", name = "R", descriptor = "S")
    private short field2766;

    @OriginalMember(owner = "client!tm", name = "Q", descriptor = "B")
    private byte field2765;

    @OriginalMember(owner = "client!tm", name = "O", descriptor = "Z")
    private boolean field2763;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "Lsr;")
    private class135 field2757;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "Lrc;")
    private class100 field2752;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "Lec;")
    public static class37 field2750 = new class37(new byte[5000]);

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!tm", name = "S", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!tm", name = "U", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!tm", name = "V", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!tm", name = "W", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!tm", name = "Z", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!tm", name = "ab", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!tm", name = "cb", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!tm", name = "db", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!tm", name = "X", descriptor = "Ldp;")
    public static class174 field2772;

    @OriginalMember(owner = "client!tm", name = "Y", descriptor = "[I")
    public static int[] field2773;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILja;II)Z", line = 3)
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        if (arg2 != 28033) {
            this.field2752 = null;
        }
        ++field2755;
        class100 var5 = this.method1453(arg1, -9, 65536);
        if (var5 != null) {
            class202 var6 = arg1.method709();
            var6.method1527(super.field4980, super.field4972, super.field4975);
            return var5.method574(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZLjo;IILjo;I)I", line = 27)
    public static final int method1450(boolean arg0, boolean arg1, class218 arg2, int arg3, int arg4, class218 arg5, int arg6) {
        ++field2767;
        int var7 = method1454(arg2, arg0, arg5, 84, arg6);
        if (var7 != 0) {
            return !arg0 ? var7 : -var7;
        } else if (arg3 == -1) {
            return 0;
        } else if (arg4 >= -104) {
            return 71;
        } else {
            int var8 = method1454(arg2, arg1, arg5, 63, arg3);
            return !arg1 ? var8 : -var8;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)I", line = 64)
    public final int method1013(boolean arg0) {
        ++field2760;
        if (arg0) {
            method1456(111);
        }
        return this.field2766 & 65535;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 75)
    public final void method1023(int arg0) {
        if (this.field2752 != null) {
            this.field2752.method520();
        }
        ++field2771;
        if (arg0 < 40) {
            this.field2757 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lmb;B)V", line = 88)
    public static final void method1451(class258 arg0, byte arg1) {
        ++field2769;
        class258 var2 = class127.method1079(arg0, false);
        int var3;
        int var4;
        if (var2 != null) {
            var3 = var2.field3764;
            var4 = var2.field3758;
        } else {
            var3 = class113.field1819;
            var4 = class277.field4170;
        }
        class60.method462(var3, false, 69, var4, arg0);
        if (arg1 < 120) {
            method1452(113, -118, 7, -127, 100);
        }
        class121.method1015(arg0, var3, -127, var4);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BILja;)Lrc;", line = 115)
    public final class100 method1025(byte arg0, int arg1, class90 arg2) {
        if (arg0 != -84) {
            return null;
        } else {
            ++field2748;
            return this.method1453(arg2, -9, arg1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V", line = 130)
    public static final void method1452(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2768;
        int var5 = 39 % ((-41 - arg1) / 34);
        class383.field5497 = arg3;
        class308.field4507 = arg2;
        class278.field4184 = arg0;
        class185.field2727 = arg4;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Z", line = 143)
    public final boolean method1018(byte arg0) {
        ++field2747;
        return arg0 > -16 ? true : this.field2763;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lja;II)Lrc;", line = 155)
    private final class100 method1453(class90 arg0, int arg1, int arg2) {
        ++field2759;
        if (arg1 != -9) {
            return null;
        } else if (this.field2752 != null && arg0.method677(this.field2752.method560(), arg2) == 0) {
            return this.field2752;
        } else {
            class209 var4 = this.method1455((byte) -128, arg2, false, arg0);
            return var4 == null ? null : var4.field3048;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lja;Lfb;IIIIZIIIII)V", line = 177)
    public class187(class90 arg0, class45 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class126.method1067(arg11, (byte) -98, arg10));
        this.field2776 = arg6;
        this.field2753 = (byte) arg11;
        this.field2762 = (byte) arg2;
        this.field2764 = ~arg1.field697 != -1;
        this.field2766 = (short) arg1.field733;
        super.field4975 = (short) arg5;
        super.field4980 = (short) arg3;
        this.field2765 = (byte) arg10;
        this.field2763 = arg0.method730() && arg1.field728 && !this.field2776 && ~class238.field3438 != -1;
        class209 var13 = this.method1455((byte) -126, 1024, this.field2763, arg0);
        if (var13 != null) {
            this.field2757 = var13.field3046;
            this.field2752 = var13.field3048;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljo;ZLjo;II)I", line = 202)
    private static final int method1454(class218 arg0, boolean arg1, class218 arg2, int arg3, int arg4) {
        ++field2751;
        if (~arg4 == -2) {
            int var5 = arg2.field3999;
            int var6 = arg0.field3999;
            if (!arg1) {
                if (~var6 == 0) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return -var6 + var5;
        } else if (~arg4 == -3) {
            return class180.method1405(arg2.method1648(8).field1444, true, class202.field2945, arg0.method1648(8).field1444);
        } else if (~arg4 == -4) {
            if (arg2.field3223.equals("-")) {
                if (arg0.field3223.equals("-")) {
                    return 0;
                } else {
                    return !arg1 ? 1 : -1;
                }
            } else if (arg0.field3223.equals("-")) {
                return !arg1 ? -1 : 1;
            } else {
                return class180.method1405(arg2.field3223, true, class202.field2945, arg0.field3223);
            }
        } else if (arg4 == 4) {
            if (arg2.method1905(-27936)) {
                return !arg0.method1905(-27936) ? 1 : 0;
            } else {
                return arg0.method1905(-27936) ? -1 : 0;
            }
        } else if (arg4 == 5) {
            if (!arg2.method1908(0)) {
                return !arg0.method1908(0) ? 0 : -1;
            } else {
                return !arg0.method1908(0) ? 1 : 0;
            }
        } else {
            if (arg3 < 60) {
                field2778 = -48;
            }
            if (arg4 == 6) {
                if (arg2.method1906(false)) {
                    return arg0.method1906(false) ? 0 : 1;
                } else {
                    return !arg0.method1906(false) ? 0 : -1;
                }
            } else if (~arg4 == -8) {
                if (!arg2.method1903((byte) -28)) {
                    return arg0.method1903((byte) -28) ? -1 : 0;
                } else {
                    return !arg0.method1903((byte) -28) ? 1 : 0;
                }
            } else if (~arg4 == -9) {
                int var7 = arg2.field3230;
                int var8 = arg0.field3230;
                if (arg1) {
                    if (~var7 == -1001) {
                        var7 = -1;
                    }
                    if (~var8 == -1001) {
                        var8 = -1;
                    }
                } else {
                    if (~var8 == 0) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return -var8 + var7;
            } else {
                return arg2.field3233 - arg0.field3233;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)I", line = 301)
    public final int method1024(int arg0) {
        if (arg0 != 20691) {
            this.method1025((byte) 93, -19, (class90) null);
        }
        ++field2770;
        return this.field2765;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLja;)V", line = 317)
    public final void method1022(boolean arg0, class90 arg1) {
        ++field2749;
        Object var3 = null;
        if (arg0) {
            class135 var5;
            if (this.field2757 == null && this.field2763) {
                class209 var4 = this.method1455((byte) -127, 131072, true, arg1);
                var5 = var4 != null ? var4.field3046 : null;
            } else {
                var5 = this.field2757;
                this.field2757 = null;
            }
            if (var5 != null) {
                class365.method2332(var5, this.field2762, super.field4980, super.field4975, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BIZLja;)Lob;", line = 346)
    private final class209 method1455(byte arg0, int arg1, boolean arg2, class90 arg3) {
        ++field2754;
        int var5 = -14 / ((-64 - arg0) / 62);
        class45 var6 = class451.method2812(69, 65535 & this.field2766);
        class126 var7;
        class126 var8;
        if (!this.field2776) {
            if (~this.field2762 <= -4) {
                var7 = null;
            } else {
                var7 = class311.field4527[this.field2762 + 1];
            }
            var8 = class311.field4527[this.field2762];
        } else {
            var8 = class18.field262[this.field2762];
            var7 = class311.field4527[0];
        }
        return var6.method361(-183837885, this.field2765, arg3, arg2, super.field4972, var7, super.field4980, this.field2753, arg1, var8, super.field4975);
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V", line = 375)
    public static void method1456(int arg0) {
        field2773 = null;
        field2772 = null;
        field2750 = null;
        if (arg0 <= 90) {
            method1454((class218) null, false, (class218) null, -6, 84);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLja;)Lkh;", line = 390)
    public final class69 method134(byte arg0, class90 arg1) {
        ++field2774;
        if (this.field2752 == null) {
            return null;
        } else {
            class202 var3 = arg1.method709();
            if (arg0 < 90) {
                return null;
            } else {
                var3.method1527(super.field4980 + super.field4979, super.field4972, super.field4978 + super.field4975);
                class69 var4 = null;
                if (this.field2764) {
                    var4 = class256.method1849(1, 113);
                }
                this.field2752.method530(var3, var4 != null ? var4.field1128[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lja;I)V", line = 417)
    public final void method1021(class90 arg0, int arg1) {
        ++field2756;
        Object var3 = null;
        int var4 = 63 / ((-58 - arg1) / 56);
        class135 var6;
        if (this.field2757 == null && this.field2763) {
            class209 var5 = this.method1455((byte) 99, 131072, true, arg0);
            var6 = var5 != null ? var5.field3046 : null;
        } else {
            var6 = this.field2757;
            this.field2757 = null;
        }
        if (var6 != null) {
            class50.method395(var6, this.field2762, super.field4980, super.field4975, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I", line = 449)
    public final int method1020(int arg0) {
        ++field2758;
        if (arg0 != 15829) {
            this.field2752 = null;
        }
        return this.field2753;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILja;)V", line = 460)
    public final void method137(int arg0, class90 arg1) {
        int var3 = -96 / ((-31 - arg0) / 51);
        ++field2761;
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)I", line = 469)
    public final int method1457(int arg0) {
        ++field2775;
        if (arg0 != 12124) {
            field2778 = 43;
        }
        return this.field2752 != null ? this.field2752.method541() : 0;
    }
}
