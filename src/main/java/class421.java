import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class421 extends class736 implements class362 {

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "Z")
    private boolean field5926;

    @OriginalMember(owner = "client!ns", name = "X", descriptor = "Z")
    private boolean field5933;

    @OriginalMember(owner = "client!ns", name = "qb", descriptor = "S")
    private short field5952;

    @OriginalMember(owner = "client!ns", name = "pb", descriptor = "B")
    private byte field5951;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "Z")
    private boolean field5924;

    @OriginalMember(owner = "client!ns", name = "bb", descriptor = "Z")
    private boolean field5937;

    @OriginalMember(owner = "client!ns", name = "mb", descriptor = "Lr;")
    private class192 field5948;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "Lka;")
    private class495 field5921;

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "Lpa;")
    public static class387 field5920 = new class387(4);

    @OriginalMember(owner = "client!ns", name = "hb", descriptor = "[I")
    public static int[] field5943 = new int[4];

    @OriginalMember(owner = "client!ns", name = "lb", descriptor = "Lwq;")
    public static class176 field5947 = null;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!ns", name = "W", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!ns", name = "Y", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!ns", name = "Z", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!ns", name = "ab", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!ns", name = "cb", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!ns", name = "db", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!ns", name = "eb", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!ns", name = "jb", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!ns", name = "kb", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!ns", name = "nb", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!ns", name = "ob", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!ns", name = "rb", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!ns", name = "sb", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!ns", name = "tb", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!ns", name = "gb", descriptor = "Ldu;")
    public static class373 field5942;

    @OriginalMember(owner = "client!ns", name = "fb", descriptor = "Lpw;")
    private class733 field5941;

    @OriginalMember(owner = "client!ns", name = "ib", descriptor = "Ljava/lang/Thread;")
    public static Thread field5944;

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lha;Ldja;IIIIIZIZ)V")
    public class421(class66 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4803);
        this.field5926 = arg1.field4761 != 0 && !arg7;
        this.field5933 = arg7;
        super.field7719 = arg6;
        this.field5952 = (short) arg1.field4759;
        this.field5951 = (byte) arg8;
        this.field5924 = arg9;
        super.field7718 = arg4;
        this.field5937 = arg0.method423() && arg1.field4831 && !this.field5933 && ~class145.field1852.field9017.method3212((byte) -36) != -1;
        int var11 = 2048;
        if (this.field5924) {
            var11 |= 65536;
        }
        class469 var12 = this.method2516(var11, this.field5937, 117, arg0);
        if (var12 != null) {
            this.field5948 = var12.field6701;
            this.field5921 = var12.field6700;
            if (this.field5924) {
                this.field5921 = this.field5921.method81((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Lha;B)Lpw;")
    public final class733 method255(class66 arg0, byte arg1) {
        ++field5925;
        if (this.field5941 == null) {
            this.field5941 = class302.method2004(super.field7718, super.field7719, -93, super.field7723, this.method2517(arg0, -26367, 0));
        }
        int var3 = -40 % ((arg1 - -45) / 63);
        return this.field5941;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILha;)V")
    public final void method651(int arg0, class66 arg1) {
        ++field5934;
        Object var3 = null;
        if (arg0 == -8836) {
            class192 var5;
            if (this.field5948 == null && this.field5937) {
                class469 var4 = this.method2516(262144, true, 108, arg1);
                var5 = var4 == null ? null : var4.field6701;
            } else {
                var5 = this.field5948;
                this.field5948 = null;
            }
            if (var5 != null) {
                class12.method126(var5, super.field7711, super.field7718, super.field7719, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I")
    public final int method643(boolean arg0) {
        ++field5938;
        if (arg0) {
            this.field5926 = false;
        }
        return this.field5951;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZILha;)Luf;")
    private final class469 method2516(int arg0, boolean arg1, int arg2, class66 arg3) {
        ++field5936;
        class322 var5 = class496.field7061.method319(41, this.field5952 & 65535);
        if (arg2 < 54) {
            this.field5948 = null;
        }
        class292 var6;
        class292 var7;
        if (!this.field5933) {
            var6 = class750.field10395[super.field7711];
            if (super.field7711 >= 3) {
                var7 = null;
            } else {
                var7 = class750.field10395[super.field7711 + 1];
            }
        } else {
            var7 = class750.field10395[0];
            var6 = class311.field4628[super.field7711];
        }
        return var5.method2091(super.field7718, 22, arg0, (class521) null, super.field7719, arg1, this.field5951, var7, var6, super.field7723, false, arg3);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILsf;Lha;BIIZ)V")
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        ++field5923;
        if (arg3 == 0) {
            if (arg1 instanceof class421) {
                class421 var8 = (class421) arg1;
                if (this.field5921 != null && var8.field5921 != null) {
                    this.field5921.method71(var8.field5921, arg4, arg5, arg0, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "(I)I")
    public final int method239(int arg0) {
        ++field5935;
        if (arg0 > -9) {
            this.field5926 = true;
        }
        return this.field5921 == null ? 0 : this.field5921.method67();
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZLha;I)Z")
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        ++field5922;
        class495 var5 = this.method2517(arg2, -26367, 131072);
        if (var5 != null) {
            class378 var6 = arg2.method433();
            var6.method1959(super.field7718, super.field7723, super.field7719);
            return !class475.field6760 ? var5.method83(arg3, arg0, var6, false, 0) : var5.method84(arg3, arg0, var6, false, 0, class412.field5822);
        } else {
            if (!arg1) {
                this.method255((class66) null, (byte) 85);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lha;II)Lka;")
    private final class495 method2517(class66 arg0, int arg1, int arg2) {
        ++field5932;
        if (this.field5921 != null && arg0.method451(this.field5921.method113(), arg2) == 0) {
            return this.field5921;
        } else if (arg1 != -26367) {
            return null;
        } else {
            class469 var4 = this.method2516(arg2, false, arg1 + 26464, arg0);
            return var4 != null ? var4.field6700 : null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)Z")
    public final boolean method248(byte arg0) {
        if (arg0 != -55) {
            this.method254((byte) 2);
        }
        ++field5927;
        return this.field5921 != null ? this.field5921.method88() : false;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)I")
    public final int method646(byte arg0) {
        if (arg0 != 45) {
            this.method651(82, (class66) null);
        }
        ++field5949;
        return 22;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Z")
    public final boolean method642(int arg0) {
        ++field5940;
        int var2 = 75 / ((arg0 - 77) / 38);
        return this.field5937;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
    public final void method647(int arg0) {
        if (arg0 != 32653) {
            this.method258((class66) null, (byte) -111);
        }
        if (this.field5921 != null) {
            this.field5921.method76();
        }
        ++field5939;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)Z")
    public final boolean method254(byte arg0) {
        if (arg0 != 104) {
            return false;
        } else {
            ++field5954;
            if (this.field5921 != null) {
                return !this.field5921.method68();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)I")
    public final int method246(int arg0) {
        if (arg0 > -104) {
            this.method244(116);
        }
        ++field5946;
        return this.field5921 == null ? 0 : this.field5921.method75();
    }

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "(I)V")
    public final void method240(int arg0) {
        if (arg0 != -1) {
            this.method253(102, true, (class66) null, 99);
        }
        this.field5924 = false;
        ++field5928;
        if (this.field5921 != null) {
            this.field5921.method85(this.field5921.method113() & -65537);
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(Z)V")
    public static void method2518(boolean arg0) {
        if (!arg0) {
            field5943 = null;
        }
        field5947 = null;
        field5943 = null;
        field5920 = null;
        field5944 = null;
        field5942 = null;
    }

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)Z")
    public final boolean method244(int arg0) {
        ++field5931;
        int var2 = -50 % ((-19 - arg0) / 57);
        return this.field5924;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lha;I)V")
    public final void method257(class66 arg0, int arg1) {
        ++field5930;
        if (arg1 <= 60) {
            field5947 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(ILha;)V")
    public final void method645(int arg0, class66 arg1) {
        int var3 = 121 / ((arg0 - -72) / 36);
        ++field5950;
        Object var4 = null;
        class192 var6;
        if (this.field5948 == null && this.field5937) {
            class469 var5 = this.method2516(262144, true, 96, arg1);
            var6 = var5 == null ? null : var5.field6701;
        } else {
            var6 = this.field5948;
            this.field5948 = null;
        }
        if (var6 != null) {
            class258.method1700(var6, super.field7711, super.field7718, super.field7719, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lha;B)Lhq;")
    public final class167 method258(class66 arg0, byte arg1) {
        ++field5953;
        if (this.field5921 == null) {
            return null;
        } else {
            class378 var3 = arg0.method433();
            var3.method1959(super.field7718, super.field7723, super.field7719);
            class167 var4 = class653.method3739(arg1 ^ 10, 1, this.field5926);
            if (class475.field6760) {
                this.field5921.method91(var3, var4.field2426[0], class412.field5822, 0);
            } else {
                this.field5921.method108(var3, var4.field2426[0], 0);
            }
            return arg1 != 10 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I")
    public final int method650(int arg0) {
        ++field5929;
        int var2 = -25 / ((arg0 - 24) / 53);
        return 65535 & this.field5952;
    }
}
