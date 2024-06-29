import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class412 extends class719 implements class362 {

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "Z")
    private boolean field5816 = false;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "Lkm;")
    public class371 field5808;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "Z")
    private boolean field5807;

    @OriginalMember(owner = "client!wj", name = "fb", descriptor = "I")
    public static int field5823 = 7000;

    @OriginalMember(owner = "client!wj", name = "eb", descriptor = "I")
    public static int field5822 = field5823;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "Leca;")
    public static class789 field5814 = new class789();

    @OriginalMember(owner = "client!wj", name = "mb", descriptor = "Lke;")
    public static class622 field5830 = new class622(27, -1);

    @OriginalMember(owner = "client!wj", name = "ob", descriptor = "[Ljava/lang/String;")
    public static String[] field5832 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!wj", name = "pb", descriptor = "Lke;")
    public static class622 field5833 = new class622(122, 1);

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!wj", name = "cb", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!wj", name = "db", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!wj", name = "gb", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!wj", name = "hb", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!wj", name = "ib", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!wj", name = "jb", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!wj", name = "kb", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!wj", name = "lb", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!wj", name = "nb", descriptor = "Lcb;")
    public static class544 field5831;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Lpw;")
    private class733 field5804;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Lha;B)Lpw;", line = 4)
    public final class733 method255(class66 arg0, byte arg1) {
        int var3 = -41 % ((-45 - arg1) / 63);
        ++field5806;
        return this.field5804;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILsf;Lha;BIIZ)V", line = 17)
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 != 0) {
            field5830 = null;
        }
        ++field5820;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lha;B)Lhq;", line = 29)
    public final class167 method258(class66 arg0, byte arg1) {
        ++field5812;
        class495 var3 = this.field5808.method2292(false, arg0, 2048, true, 15514);
        if (var3 == null) {
            return null;
        } else {
            class378 var4 = arg0.method433();
            var4.method1959(super.field7718, super.field7723, super.field7719);
            class167 var5 = class653.method3739(0, 1, this.field5807);
            if (arg1 != 10) {
                field5823 = 4;
            }
            int var6 = super.field7718 >> 9;
            int var7 = super.field7719 >> 9;
            this.field5808.method2300(var7, -127, var7, var6, arg0, var3, var4, true, var6);
            if (class475.field6760) {
                var3.method91(var4, var5.field2426[0], field5822, 0);
            } else {
                var3.method108(var4, var5.field2426[0], 0);
            }
            if (this.field5808.field5347 != null) {
                class443 var8 = this.field5808.field5347.method184();
                if (!class475.field6760) {
                    arg0.method437(var8);
                } else {
                    arg0.method464(var8, field5822);
                }
            }
            this.field5816 = var3.method88() || this.field5808.field5347 != null;
            if (this.field5804 == null) {
                this.field5804 = class302.method2004(super.field7718, super.field7719, -109, super.field7723, var3);
            } else {
                class299.method1997(var3, super.field7723, 5378, super.field7718, this.field5804, super.field7719);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 82)
    public final void method647(int arg0) {
        if (arg0 != 32653) {
            this.method239(-51);
        }
        ++field5828;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLha;I)Z", line = 92)
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        ++field5826;
        class495 var5 = this.field5808.method2292(false, arg2, 131072, false, 15514);
        if (var5 == null) {
            return false;
        } else if (!arg1) {
            return false;
        } else {
            class378 var6 = arg2.method433();
            var6.method1959(super.field7718, super.field7723, super.field7719);
            return !class475.field6760 ? var5.method83(arg3, arg0, var6, false, 0) : var5.method84(arg3, arg0, var6, false, 0, field5822);
        }
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)Z", line = 112)
    public final boolean method244(int arg0) {
        ++field5829;
        int var2 = 122 / ((arg0 - -19) / 57);
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lha;I)V", line = 122)
    public final void method257(class66 arg0, int arg1) {
        ++field5813;
        class495 var3 = this.field5808.method2292(true, arg0, 262144, true, 15514);
        if (arg1 < 60) {
            this.method645(57, (class66) null);
        }
        if (var3 != null) {
            int var4 = super.field7718 >> 9;
            int var5 = super.field7719 >> 9;
            class378 var6 = arg0.method433();
            var6.method1959(super.field7718, super.field7723, super.field7719);
            this.field5808.method2300(var5, 120, var5, var4, arg0, var3, var6, false, var4);
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)Z", line = 150)
    public final boolean method254(byte arg0) {
        if (arg0 != 104) {
            this.field5808 = null;
        }
        ++field5815;
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)V", line = 161)
    public final void method240(int arg0) {
        if (arg0 != -1) {
            this.method253(-111, false, (class66) null, -14);
        }
        ++field5809;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILha;)V", line = 175)
    public final void method651(int arg0, class66 arg1) {
        if (arg0 != -8836) {
            field5814 = null;
        }
        this.field5808.method2299(arg1, (byte) 104);
        ++field5805;
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V", line = 186)
    public static void method2473(byte arg0) {
        field5833 = null;
        if (arg0 >= -123) {
            field5833 = null;
        }
        field5830 = null;
        field5832 = null;
        field5814 = null;
        field5831 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I", line = 200)
    public final int method646(byte arg0) {
        if (arg0 != 45) {
            return -122;
        } else {
            ++field5819;
            return this.field5808.field5323;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(ILha;)V", line = 211)
    public final void method645(int arg0, class66 arg1) {
        int var3 = -98 % ((-72 - arg0) / 36);
        this.field5808.method2294((byte) 94, arg1);
        ++field5827;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)I", line = 222)
    public final int method650(int arg0) {
        int var2 = 56 % ((24 - arg0) / 53);
        ++field5821;
        return this.field5808.field5354;
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)I", line = 232)
    public final int method246(int arg0) {
        if (arg0 >= -104) {
            return 22;
        } else {
            ++field5810;
            return this.field5808.method2303((byte) 26);
        }
    }

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "(I)I", line = 243)
    public final int method239(int arg0) {
        ++field5818;
        return arg0 >= -9 ? -39 : this.field5808.method2304((byte) 14);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)Z", line = 256)
    public final boolean method248(byte arg0) {
        if (arg0 != -55) {
            this.method258((class66) null, (byte) -83);
        }
        ++field5824;
        return this.field5816;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)Z", line = 274)
    public final boolean method642(int arg0) {
        ++field5825;
        int var2 = 62 / ((77 - arg0) / 38);
        return this.field5808.method2297(98);
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lha;Ldja;IIIIIZIII)V", line = 315)
    public class412(class66 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class781.method4284(arg9, arg8, false));
        this.field5808 = new class371(arg0, arg1, arg8, arg9, super.field7710, arg3, this, arg7, arg10);
        this.field5807 = arg1.field4761 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLpi;)V", line = 289)
    public final void method2474(byte arg0, class521 arg1) {
        this.field5808.method2298(arg1, 15480);
        if (arg0 < 0) {
            this.method248((byte) -19);
        }
        ++field5817;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)I", line = 300)
    public final int method643(boolean arg0) {
        ++field5811;
        return arg0 ? -29 : this.field5808.field5339;
    }
}
