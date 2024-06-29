import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class420 extends class226 implements class171 {

    @OriginalMember(owner = "client!on", name = "D", descriptor = "Z")
    private boolean field5733;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "B")
    private byte field5738;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "B")
    private byte field5732;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "Z")
    private boolean field5725;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "Z")
    private boolean field5748;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "S")
    private short field5726;

    @OriginalMember(owner = "client!on", name = "M", descriptor = "B")
    private byte field5742;

    @OriginalMember(owner = "client!on", name = "W", descriptor = "Z")
    private boolean field5752;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "Lgi;")
    private class416 field5744;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "Lge;")
    public class386 field5743;

    @OriginalMember(owner = "client!on", name = "Y", descriptor = "I")
    public static int field5754 = 0;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "Lih;")
    public static class108 field5741 = new class108(128);

    @OriginalMember(owner = "client!on", name = "Z", descriptor = "Z")
    public static boolean field5755 = false;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!on", name = "J", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!on", name = "P", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!on", name = "T", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!on", name = "U", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!on", name = "V", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!on", name = "X", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "[I")
    public static int[] field5730;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)I", line = 4)
    public final int method420(byte arg0) {
        int var2 = 62 % ((-21 - arg0) / 44);
        ++field5731;
        return this.field5742;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 15)
    public final void method423(int arg0) {
        if (arg0 == 22486) {
            if (this.field5743 != null) {
                this.field5743.method1454();
            }
            ++field5727;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Luo;IIZ)Z", line = 30)
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field5754 = 40;
        }
        ++field5746;
        class386 var5 = this.method2577(arg0, (byte) 55, 65536);
        if (var5 != null) {
            class450 var6 = arg0.method742();
            var6.method929(super.field2865, super.field2872, super.field2866);
            return var5.method1474(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Luo;ZIB)Lcb;", line = 62)
    private final class52 method2574(class118 arg0, boolean arg1, int arg2, byte arg3) {
        ++field5735;
        class446 var5 = class380.method2361(65535 & this.field5726, -29012);
        if (arg3 != 14) {
            return null;
        } else {
            class279 var6;
            class279 var7;
            if (this.field5733) {
                var6 = class219.field2709[0];
                var7 = class75.field915[this.field5732];
            } else {
                var7 = class219.field2709[this.field5732];
                if (~this.field5732 <= -4) {
                    var6 = null;
                } else {
                    var6 = class219.field2709[this.field5732 + 1];
                }
            }
            return var5.method2774(var6, this.field5738, super.field2872, super.field2866, super.field2865, false, var7, this.field5742, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Luo;B)V", line = 93)
    public final void method422(class118 arg0, byte arg1) {
        ++field5747;
        if (arg1 != -7) {
            this.method130((class118) null, (byte) -67);
        }
        Object var3 = null;
        class416 var5;
        if (this.field5744 == null && this.field5752) {
            class52 var4 = this.method2574(arg0, true, 131072, (byte) 14);
            var5 = var4 == null ? null : var4.field611;
        } else {
            var5 = this.field5744;
            this.field5744 = null;
        }
        if (var5 != null) {
            class434.method2649(var5, this.field5732, super.field2865, super.field2866, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Z", line = 122)
    public final boolean method412(int arg0) {
        ++field5734;
        return arg0 != 18942 ? false : this.field5752;
    }

    @OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V", line = 133)
    public static final void method2575(int arg0) {
        ++field5737;
        if (arg0 == 32417) {
            if (!class98.method602(65280) && ~class43.field513 != ~class41.field488) {
                class314.method1978(false, class143.field1684.field2482[0], class43.field513, class234.field3069, false, (byte) -119, class143.field1684.field2480[0], class108.field1296);
            } else {
                class321.method2002(class267.field3454, (byte) 45);
                if (~class43.field513 != ~class278.field3602) {
                    class296.method1880(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "h", descriptor = "(I)V", line = 153)
    public static void method2576(int arg0) {
        int var1 = 125 % ((arg0 - -36) / 42);
        field5730 = null;
        field5741 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Luo;IIIZBLpc;)V", line = 163)
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        ++field5749;
        if (arg6 instanceof class420) {
            class420 var8 = (class420) arg6;
            if (this.field5743 != null && var8.field5743 != null) {
                this.field5743.method1476(var8.field5743, arg2, arg3, arg1, arg4);
            }
        } else if (arg6 instanceof class442) {
            class442 var9 = (class442) arg6;
            if (this.field5743 != null && var9.field6121 != null) {
                this.field5743.method1476(var9.field6121, arg2, arg3, arg1, arg4);
            }
        }
        if (arg5 > -115) {
            field5730 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(Luo;B)Lkj;", line = 194)
    public final class175 method130(class118 arg0, byte arg1) {
        int var3 = -106 / ((11 - arg1) / 37);
        ++field5740;
        if (this.field5743 == null) {
            return null;
        } else {
            class450 var4 = arg0.method742();
            var4.method929(super.field2865, super.field2872, super.field2866);
            class175 var5 = null;
            if (this.field5725) {
                var5 = class68.method392((byte) 108, 1);
            }
            this.field5743.method1441(var4, var5 == null ? null : var5.field2030[0], 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Luo;Lnd;IIIIZIIZ)V", line = 221)
    public class420(class118 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class350.method2232(arg8, arg7, -2));
        super.field2865 = (short) arg3;
        this.field5733 = arg6;
        this.field5738 = (byte) arg8;
        super.field2866 = (short) arg5;
        this.field5732 = (byte) arg2;
        this.field5725 = arg1.field6235 != 0 && !arg6;
        this.field5748 = arg9;
        this.field5726 = (short) arg1.field6209;
        this.field5742 = (byte) arg7;
        this.field5752 = arg0.method708() && arg1.field6210 && !this.field5733 && class333.field4548 != 0;
        int var11 = 1024;
        if (this.field5748) {
            var11 |= 32768;
        }
        class52 var12 = this.method2574(arg0, this.field5752, var11, (byte) 14);
        if (var12 != null) {
            this.field5744 = var12.field611;
            this.field5743 = var12.field610;
            if (this.field5748) {
                this.field5743 = this.field5743.method1459((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Luo;II)Lge;", line = 256)
    public final class386 method419(class118 arg0, int arg1, int arg2) {
        if (arg1 != -20264) {
            this.method2574((class118) null, false, -26, (byte) -66);
        }
        ++field5739;
        return this.method2577(arg0, (byte) 55, arg2);
    }

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(I)V", line = 267)
    public final void method140(int arg0) {
        ++field5736;
        if (arg0 < -24) {
            this.field5748 = false;
            if (this.field5743 != null) {
                this.field5743.method1460(-32769 & this.field5743.method1465());
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)I", line = 282)
    public final int method417(byte arg0) {
        if (arg0 != -116) {
            this.field5752 = false;
        }
        ++field5753;
        return this.field5738;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLuo;)V", line = 306)
    public final void method138(byte arg0, class118 arg1) {
        if (arg0 <= 78) {
            this.field5732 = 37;
        }
        ++field5745;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)I", line = 316)
    public final int method409(int arg0) {
        ++field5729;
        if (arg0 != -50) {
            field5741 = null;
        }
        return 65535 & this.field5726;
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)Z", line = 329)
    public final boolean method129(int arg0) {
        if (arg0 != 3652) {
            field5730 = null;
        }
        ++field5728;
        return this.field5748;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Luo;BI)Lge;", line = 343)
    private final class386 method2577(class118 arg0, byte arg1, int arg2) {
        if (arg1 != 55) {
            field5730 = null;
        }
        ++field5750;
        if (this.field5743 != null && ~arg0.method721(this.field5743.method1465(), arg2) == -1) {
            return this.field5743;
        } else {
            class52 var4 = this.method2574(arg0, false, arg2, (byte) 14);
            return var4 != null ? var4.field610 : null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Luo;B)V", line = 371)
    public final void method411(class118 arg0, byte arg1) {
        ++field5751;
        if (arg1 != 88) {
            this.field5748 = false;
        }
        Object var3 = null;
        class416 var5;
        if (this.field5744 == null && this.field5752) {
            class52 var4 = this.method2574(arg0, true, 131072, (byte) 14);
            var5 = var4 == null ? null : var4.field611;
        } else {
            var5 = this.field5744;
            this.field5744 = null;
        }
        if (var5 != null) {
            class183.method1139(var5, this.field5732, super.field2865, super.field2866, (boolean[]) null);
        }
    }
}
