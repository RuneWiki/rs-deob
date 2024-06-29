import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class596 extends class719 implements class362 {

    @OriginalMember(owner = "client!ul", name = "ib", descriptor = "B")
    private byte field8416;

    @OriginalMember(owner = "client!ul", name = "mb", descriptor = "S")
    private short field8420;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "Z")
    private boolean field8395;

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "Z")
    private boolean field8401;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "Z")
    private boolean field8393;

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "B")
    private byte field8405;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "Z")
    private boolean field8397;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "Lka;")
    public class495 field8402;

    @OriginalMember(owner = "client!ul", name = "jb", descriptor = "Lr;")
    private class192 field8417;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "Lke;")
    public static class622 field8394 = new class622(90, 2);

    @OriginalMember(owner = "client!ul", name = "lb", descriptor = "[I")
    public static int[] field8419 = new int[256];

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!ul", name = "bb", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!ul", name = "cb", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!ul", name = "db", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!ul", name = "eb", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!ul", name = "fb", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!ul", name = "gb", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!ul", name = "hb", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!ul", name = "kb", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!ul", name = "nb", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!ul", name = "ob", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!ul", name = "pb", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!ul", name = "qb", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!ul", name = "ab", descriptor = "Lpw;")
    private class733 field8408;

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lha;Ldja;IIIIIZIIZ)V")
    public class596(class66 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class446.method2683(arg8, 82, arg9));
        this.field8416 = (byte) arg9;
        this.field8420 = (short) arg1.field4759;
        this.field8395 = arg10;
        this.field8401 = arg7;
        super.field7718 = arg4;
        super.field7719 = arg6;
        this.field8393 = ~arg1.field4761 != -1 && !arg7;
        this.field8405 = (byte) arg8;
        this.field8397 = arg0.method423() && arg1.field4831 && !this.field8401 && class145.field1852.field9017.method3212((byte) -98) != 0;
        int var12 = 2048;
        if (this.field8395) {
            var12 |= 65536;
        }
        class469 var13 = this.method3450(arg0, this.field8397, 0, var12);
        if (var13 != null) {
            this.field8402 = var13.field6700;
            this.field8417 = var13.field6701;
            if (this.field8395) {
                this.field8402 = this.field8402.method81((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)Z")
    public final boolean method248(byte arg0) {
        ++field8404;
        if (arg0 != -55) {
            return true;
        } else {
            return this.field8402 == null ? false : this.field8402.method88();
        }
    }

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "(I)I")
    public final int method239(int arg0) {
        if (arg0 > -9) {
            this.field8416 = -83;
        }
        ++field8413;
        return this.field8402 != null ? this.field8402.method67() : 0;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z")
    public final boolean method642(int arg0) {
        ++field8396;
        int var2 = -55 / ((77 - arg0) / 38);
        return this.field8397;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(Z)V")
    public static void method3449(boolean arg0) {
        field8419 = null;
        field8394 = null;
        if (!arg0) {
            method3449(true);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lha;ZII)Luf;")
    private final class469 method3450(class66 arg0, boolean arg1, int arg2, int arg3) {
        ++field8418;
        class322 var5 = class496.field7061.method319(-128, this.field8420 & 65535);
        class292 var6;
        class292 var7;
        if (!this.field8401) {
            var6 = class750.field10395[super.field7711];
            if (~super.field7711 <= -4) {
                var7 = null;
            } else {
                var7 = class750.field10395[super.field7711 + 1];
            }
        } else {
            var7 = class750.field10395[0];
            var6 = class311.field4628[super.field7711];
        }
        if (arg2 != 0) {
            this.method254((byte) 27);
        }
        return var5.method2091(super.field7718, this.field8405, arg3, (class521) null, super.field7719, arg1, this.field8416, var7, var6, super.field7723, false, arg0);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Lha;B)Lpw;")
    public final class733 method255(class66 arg0, byte arg1) {
        int var3 = -6 % ((arg1 - -45) / 63);
        if (this.field8408 == null) {
            this.field8408 = class302.method2004(super.field7718, super.field7719, -125, super.field7723, this.method3451(89, arg0, 0));
        }
        ++field8403;
        return this.field8408;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lha;B)Lhq;")
    public final class167 method258(class66 arg0, byte arg1) {
        ++field8392;
        if (arg1 != 10) {
            return null;
        } else if (this.field8402 == null) {
            return null;
        } else {
            class378 var3 = arg0.method433();
            var3.method1959(super.field7718, super.field7723, super.field7719);
            class167 var4 = class653.method3739(0, 1, this.field8393);
            if (!class475.field6760) {
                this.field8402.method108(var3, var4.field2426[0], 0);
            } else {
                this.field8402.method91(var3, var4.field2426[0], class412.field5822, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
    public final void method647(int arg0) {
        if (this.field8402 != null) {
            this.field8402.method76();
        }
        if (arg0 != 32653) {
            this.field8402 = null;
        }
        ++field8406;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(ILha;)V")
    public final void method645(int arg0, class66 arg1) {
        ++field8412;
        int var3 = 44 / ((-72 - arg0) / 36);
        Object var4 = null;
        class192 var6;
        if (this.field8417 == null && this.field8397) {
            class469 var5 = this.method3450(arg1, true, 0, 262144);
            var6 = var5 != null ? var5.field6701 : null;
        } else {
            var6 = this.field8417;
            this.field8417 = null;
        }
        if (var6 != null) {
            class258.method1700(var6, super.field7711, super.field7718, super.field7719, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lha;I)V")
    public final void method257(class66 arg0, int arg1) {
        ++field8411;
        if (arg1 <= 60) {
            this.method651(-61, (class66) null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
    public final int method646(byte arg0) {
        ++field8407;
        if (arg0 != 45) {
            method3449(false);
        }
        return this.field8405;
    }

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "(I)Z")
    public final boolean method244(int arg0) {
        ++field8421;
        int var2 = 51 / ((arg0 - -19) / 57);
        return this.field8395;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)I")
    public final int method643(boolean arg0) {
        ++field8415;
        if (arg0) {
            field8414 = 101;
        }
        return this.field8416;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILha;I)Lka;")
    private final class495 method3451(int arg0, class66 arg1, int arg2) {
        ++field8424;
        if (this.field8402 != null && ~arg1.method451(this.field8402.method113(), arg2) == -1) {
            return this.field8402;
        } else {
            int var4 = 17 % ((-45 - arg0) / 52);
            class469 var5 = this.method3450(arg1, false, 0, arg2);
            return var5 == null ? null : var5.field6700;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILsf;Lha;BIIZ)V")
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        if (!(arg1 instanceof class596)) {
            if (arg1 instanceof class175) {
                class175 var8 = (class175) arg1;
                if (this.field8402 != null && var8.field2479 != null) {
                    this.field8402.method71(var8.field2479, arg4, arg5, arg0, arg6);
                }
            }
        } else {
            class596 var9 = (class596) arg1;
            if (this.field8402 != null && var9.field8402 != null) {
                this.field8402.method71(var9.field8402, arg4, arg5, arg0, arg6);
            }
        }
        ++field8410;
        if (arg3 != 0) {
            method3449(true);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILha;)V")
    public final void method651(int arg0, class66 arg1) {
        ++field8409;
        Object var3 = null;
        class192 var5;
        if (this.field8417 == null && this.field8397) {
            class469 var4 = this.method3450(arg1, true, arg0 ^ -8836, 262144);
            var5 = var4 == null ? null : var4.field6701;
        } else {
            var5 = this.field8417;
            this.field8417 = null;
        }
        if (var5 != null) {
            class12.method126(var5, super.field7711, super.field7718, super.field7719, (boolean[]) null);
        }
        if (arg0 != -8836) {
            this.method642(103);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZLha;I)Z")
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        ++field8423;
        if (!arg1) {
            return true;
        } else {
            class495 var5 = this.method3451(-97, arg2, 131072);
            if (var5 != null) {
                class378 var6 = arg2.method433();
                var6.method1959(super.field7718, super.field7723, super.field7719);
                return !class475.field6760 ? var5.method83(arg3, arg0, var6, false, 0) : var5.method84(arg3, arg0, var6, false, 0, class412.field5822);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)I")
    public final int method246(int arg0) {
        if (arg0 >= -104) {
            this.field8405 = -58;
        }
        ++field8399;
        return this.field8402 == null ? 0 : this.field8402.method75();
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
    public final int method650(int arg0) {
        ++field8400;
        int var2 = -30 / ((24 - arg0) / 53);
        return this.field8420 & 65535;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)Z")
    public final boolean method254(byte arg0) {
        ++field8398;
        if (arg0 != 104) {
            this.method255((class66) null, (byte) -26);
        }
        if (this.field8402 != null) {
            return !this.field8402.method68();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "(I)V")
    public final void method240(int arg0) {
        ++field8422;
        this.field8395 = false;
        if (this.field8402 != null) {
            this.field8402.method85(this.field8402.method113() & -65537);
        }
        if (arg0 != -1) {
            this.field8420 = -42;
        }
    }
}
