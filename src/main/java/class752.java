import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class752 extends class125 {

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "Llc;")
    public static class435 field10475 = new class435(4, -2);

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    public static int field10471;

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public static int field10473;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "I")
    public static int field10476;

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
    public static int field10477;

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public static int field10478;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(Z)I", line = 3)
    public final int method4186(boolean arg0) {
        if (arg0) {
            this.method155(false, -61);
        }
        ++field10473;
        return super.field1732;
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)V", line = 14)
    public static final void method4187(int arg0) {
        class401.method2439(arg0 + 1723, class131.field1810);
        ++field10478;
        ++class671.field9571;
        if (class753.field10505 && class601.field8527) {
            int var1 = arg0;
            int var2 = 0;
            if (class416.field5919) {
                var1 = class352.method2243(113);
                var2 = class695.method3915((byte) 86);
            }
            int var3 = class535.field7789.method2459(-32213) - -var1;
            int var4 = class535.field7789.method2452(-76) - -var2;
            int var5 = var4 - class285.field3968;
            int var6 = var3 - class416.field5920;
            if (class187.field2616 > var6) {
                var6 = class187.field2616;
            }
            if (~class600.field8521 < ~var5) {
                var5 = class600.field8521;
            }
            if (class187.field2616 - -class83.field1211.field2016 < class131.field1810.field2016 + var6) {
                var6 = class187.field2616 + class83.field1211.field2016 - class131.field1810.field2016;
            }
            if (class600.field8521 - -class83.field1211.field1997 < var5 - -class131.field1810.field1997) {
                var5 = class600.field8521 - -class83.field1211.field1997 + -class131.field1810.field1997;
            }
            int var7 = var6 - (class187.field2616 - class83.field1211.field1988);
            int var8 = -class600.field8521 + class83.field1211.field1970 + var5;
            if (!class535.field7789.method2451(3791)) {
                if (class564.field8175) {
                    class61.method571(false);
                    if (class131.field1810.field1993 != null) {
                        class362 var9 = new class362();
                        var9.field5300 = var7;
                        var9.field5303 = class66.field1022;
                        var9.field5297 = class131.field1810.field1993;
                        var9.field5289 = var8;
                        var9.field5304 = class131.field1810;
                        class529.method3207(var9);
                    }
                    if (class66.field1022 != null && client.method2724(class131.field1810) != null) {
                        class571.method3399(class131.field1810, -1, class66.field1022);
                    }
                } else if ((~class316.field4268 == -2 || class91.method708(arg0 ^ -2001)) && ~class456.field6499 < -3) {
                    class187.method1325(class537.field7800 + class285.field3968, class502.field7297 + class416.field5920, 102);
                } else if (class12.method58((byte) -3)) {
                    class187.method1325(class537.field7800 + class285.field3968, class502.field7297 + class416.field5920, -123);
                }
                class131.field1810 = null;
            } else {
                if (~class671.field9571 < ~class131.field1810.field2073) {
                    int var10 = var6 - class502.field7297;
                    int var11 = -class537.field7800 + var5;
                    if (var10 > class131.field1810.field2097 || -class131.field1810.field2097 > var10 || var11 > class131.field1810.field2097 || ~(-class131.field1810.field2097) < ~var11) {
                        class564.field8175 = true;
                    }
                }
                if (class131.field1810.field2033 != null && class564.field8175) {
                    class362 var12 = new class362();
                    var12.field5297 = class131.field1810.field2033;
                    var12.field5304 = class131.field1810;
                    var12.field5300 = var7;
                    var12.field5289 = var8;
                    class529.method3207(var12);
                }
            }
        } else {
            if (class671.field9571 > 1) {
                class131.field1810 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lgp;)V", line = 137)
    public class752(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(ILgp;)V", line = 143)
    public class752(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)Z", line = 149)
    public final boolean method4188(int arg0) {
        ++field10472;
        if (super.field1733.method3309((byte) -22) == class391.field5635) {
            return !super.field1733.method3308(arg0 ^ 7678);
        } else {
            if (arg0 != -7558) {
                field10475 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)I", line = 169)
    public final int method158(byte arg0) {
        int var2 = 14 / ((arg0 - -63) / 49);
        ++field10474;
        return 1;
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(Z)V", line = 183)
    public final void method156(boolean arg0) {
        if (super.field1733.method3309((byte) -22) == class391.field5635) {
            if (super.field1733.method3308(-91)) {
                super.field1732 = 0;
            }
        } else {
            super.field1732 = 1;
        }
        if (!arg0) {
            this.method4186(false);
        }
        ++field10471;
        if (super.field1732 != 0 && super.field1732 != 1) {
            super.field1732 = this.method158((byte) 38);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI)I", line = 204)
    public final int method155(boolean arg0, int arg1) {
        ++field10477;
        if (super.field1733.method3309((byte) -22) == class391.field5635) {
            if (super.field1733.method3308(-99)) {
                return 3;
            } else {
                return arg1 != 0 && super.field1733.field7972.method1587(false) != 1 ? 2 : 1;
            }
        } else {
            if (!arg0) {
                this.method158((byte) -102);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "(I)V", line = 228)
    public static void method4189(int arg0) {
        field10475 = null;
        if (arg0 != 25561) {
            field10475 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BI)V", line = 238)
    public final void method157(byte arg0, int arg1) {
        ++field10476;
        if (arg0 <= -32) {
            super.field1732 = arg1;
        }
    }
}
