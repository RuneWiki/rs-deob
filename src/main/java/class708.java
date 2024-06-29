import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class708 extends class121 implements class274 {

    @OriginalMember(owner = "client!wia", name = "L", descriptor = "S")
    private short field9341;

    @OriginalMember(owner = "client!wia", name = "Y", descriptor = "B")
    private byte field9354;

    @OriginalMember(owner = "client!wia", name = "Q", descriptor = "Z")
    private boolean field9346;

    @OriginalMember(owner = "client!wia", name = "fb", descriptor = "B")
    private byte field9361;

    @OriginalMember(owner = "client!wia", name = "db", descriptor = "Z")
    private boolean field9359;

    @OriginalMember(owner = "client!wia", name = "T", descriptor = "Z")
    private boolean field9349;

    @OriginalMember(owner = "client!wia", name = "W", descriptor = "Lr;")
    private class736 field9352;

    @OriginalMember(owner = "client!wia", name = "V", descriptor = "Lka;")
    private class299 field9351;

    @OriginalMember(owner = "client!wia", name = "I", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!wia", name = "J", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!wia", name = "K", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!wia", name = "M", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!wia", name = "O", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!wia", name = "P", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!wia", name = "R", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!wia", name = "S", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!wia", name = "U", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!wia", name = "X", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!wia", name = "Z", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!wia", name = "ab", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!wia", name = "bb", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!wia", name = "cb", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!wia", name = "eb", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!wia", name = "gb", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!wia", name = "hb", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!wia", name = "ib", descriptor = "Lid;")
    private class486 field9364;

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lha;Lih;IIIIIZIIII)V")
    public class708(class570 arg0, class773 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field2900 = arg6;
        this.field9341 = (short) arg1.field10531;
        this.field9354 = (byte) arg11;
        this.field9346 = arg1.field10488 != 0 && !arg7;
        this.field9361 = (byte) arg10;
        this.field9359 = arg7;
        super.field2896 = arg4;
        this.field9349 = arg0.method900() && arg1.field10500 && !this.field9359 && class485.field6252.field6952.method665(false) != 0;
        class216 var13 = this.method3826(arg0, this.field9349, 126, 2048);
        if (var13 != null) {
            this.field9352 = var13.field2942;
            this.field9351 = var13.field2944;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lha;ZII)Lsa;")
    private final class216 method3826(class570 arg0, boolean arg1, int arg2, int arg3) {
        ++field9355;
        if (arg2 < 125) {
            this.field9349 = true;
        }
        class773 var5 = class390.field4983.method4292(65535 & this.field9341, (byte) -75);
        class358 var6;
        class358 var7;
        if (this.field9359) {
            var6 = class735.field9973[super.field2889];
            var7 = class383.field4790[0];
        } else {
            var6 = class383.field4790[super.field2889];
            if (~super.field2889 <= -4) {
                var7 = null;
            } else {
                var7 = class383.field4790[super.field2889 + 1];
            }
        }
        return var5.method4210(arg3, this.field9354, var6, arg0, super.field2900, this.field9361, super.field2892, super.field2896, var7, (class702) null, false, arg1);
    }

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "(B)Z")
    public final boolean method743(byte arg0) {
        if (arg0 >= -76) {
            this.field9341 = 44;
        }
        ++field9340;
        if (this.field9351 != null) {
            return !this.field9351.method1235();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(ILha;)Lid;")
    public final class486 method170(int arg0, class570 arg1) {
        if (this.field9364 == null) {
            this.field9364 = class77.method476(super.field2892, super.field2900, this.method3827(arg1, 0, 0), super.field2896, 5);
        }
        ++field9347;
        int var3 = -1 % ((-9 - arg0) / 63);
        return this.field9364;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        int var5 = 83 % ((arg3 - -23) / 37);
        ++field9344;
        class299 var6 = this.method3827(arg2, 0, 131072);
        if (var6 != null) {
            class465 var7 = arg2.method948();
            var7.method449(super.field2896, super.field2892, super.field2900);
            return class653.field8360 ? var6.method1233(arg0, arg1, var7, false, 0, class628.field7974) : var6.method1264(arg0, arg1, var7, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(ILha;)Lpi;")
    public final class266 method187(int arg0, class570 arg1) {
        ++field9353;
        if (arg0 != -29562) {
            return null;
        } else if (this.field9351 == null) {
            return null;
        } else {
            class465 var3 = arg1.method948();
            var3.method449(super.field1621 + super.field2896, super.field2892, super.field1627 + super.field2900);
            class266 var4 = class689.method3680((byte) -15, this.field9346, 1);
            if (class653.field8360) {
                this.field9351.method1292(var3, var4.field3533[0], class628.field7974, 0);
            } else {
                this.field9351.method1297(var3, var4.field3533[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(B)V")
    public final void method1012(byte arg0) {
        ++field9357;
        if (arg0 <= 115) {
            this.field9364 = null;
        }
        if (this.field9351 != null) {
            this.field9351.method1259();
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Z")
    public final boolean method1008(byte arg0) {
        if (arg0 >= -51) {
            this.field9351 = null;
        }
        ++field9363;
        return this.field9349;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)I")
    public final int method1013(byte arg0) {
        ++field9362;
        int var2 = 74 / ((76 - arg0) / 36);
        return this.field9354;
    }

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "(I)I")
    public final int method747(int arg0) {
        if (arg0 != 15258) {
            this.field9361 = -23;
        }
        ++field9343;
        return this.field9351 == null ? 0 : this.field9351.method1260();
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILha;)V")
    public final void method1014(int arg0, class570 arg1) {
        ++field9350;
        Object var3 = null;
        class736 var5;
        if (this.field9352 == null && this.field9349) {
            class216 var4 = this.method3826(arg1, true, arg0 + 8035, 262144);
            var5 = var4 == null ? null : var4.field2942;
        } else {
            var5 = this.field9352;
            this.field9352 = null;
        }
        if (var5 != null) {
            class648.method3502(var5, super.field2889, super.field2896, super.field2900, (boolean[]) null);
        }
        if (arg0 != -7908) {
            this.method1008((byte) -103);
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lha;I)V")
    public final void method182(class570 arg0, int arg1) {
        ++field9360;
        if (arg1 > -87) {
            this.field9341 = -27;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)I")
    public final int method1010(int arg0) {
        if (arg0 != -6546) {
            this.method1012((byte) 116);
        }
        ++field9338;
        return 65535 & this.field9341;
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(Z)Z")
    public final boolean method738(boolean arg0) {
        ++field9345;
        if (!arg0) {
            return false;
        } else {
            return this.field9351 != null ? this.field9351.method1272() : false;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lha;II)Lka;")
    private final class299 method3827(class570 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field9354 = -42;
        }
        ++field9342;
        if (this.field9351 != null && arg0.method941(this.field9351.method1239(), arg2) == 0) {
            return this.field9351;
        } else {
            class216 var4 = this.method3826(arg0, false, 127, arg2);
            return var4 != null ? var4.field2944 : null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Z)I")
    public final int method1007(boolean arg0) {
        if (!arg0) {
            return 61;
        } else {
            ++field9356;
            return this.field9361;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILft;I[I)V")
    public static final void method3828(int arg0, class727 arg1, int arg2, int[] arg3) {
        if (arg1.field4748 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field4748.length; ++var5) {
                if (~arg1.field4748[var5] != ~arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field4700 != -1) {
                class11 var6 = class143.field1864.method4265(true, arg1.field4700);
                int var7 = var6.field102;
                if (~var7 == -2) {
                    arg1.field4667 = 1;
                    arg1.field4663 = 0;
                    arg1.field4729 = 0;
                    arg1.field4721 = 0;
                    arg1.field4692 = arg2;
                    if (!arg1.field4688) {
                        class117.method699(arg1.field4721, var6, false, arg1);
                    }
                }
                if (var7 == 2) {
                    arg1.field4663 = 0;
                }
            }
        }
        ++field9339;
        boolean var8 = true;
        if (arg0 == 65535) {
            for (int var9 = 0; arg3.length > var9; ++var9) {
                if (~arg3[var9] != 0) {
                    var8 = false;
                }
                if (arg1.field4748 == null || ~arg1.field4748[var9] == 0 || class143.field1864.method4265(true, arg3[var9]).field92 >= class143.field1864.method4265(true, arg1.field4748[var9]).field92) {
                    arg1.field4748 = arg3;
                    arg1.field4692 = arg2;
                    arg1.field4765 = arg1.field4764;
                }
            }
            if (var8) {
                arg1.field4748 = arg3;
                arg1.field4692 = arg2;
                arg1.field4765 = arg1.field4764;
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "(B)I")
    public final int method745(byte arg0) {
        ++field9348;
        if (arg0 >= -85) {
            this.field9351 = null;
        }
        return this.field9351 != null ? this.field9351.method1296() : 0;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(BLha;)V")
    public final void method1015(byte arg0, class570 arg1) {
        ++field9358;
        Object var3 = null;
        class736 var5;
        if (this.field9352 == null && this.field9349) {
            class216 var4 = this.method3826(arg1, true, 126, 262144);
            var5 = var4 == null ? null : var4.field2942;
        } else {
            var5 = this.field9352;
            this.field9352 = null;
        }
        if (var5 != null) {
            class407.method2371(var5, super.field2889, super.field2896, super.field2900, (boolean[]) null);
        }
        if (arg0 >= -71) {
            this.method1007(false);
        }
    }
}
