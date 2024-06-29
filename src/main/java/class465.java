import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class465 extends class188 implements class281 {

    @OriginalMember(owner = "client!cq", name = "db", descriptor = "Z")
    private boolean field6656;

    @OriginalMember(owner = "client!cq", name = "X", descriptor = "B")
    private byte field6650;

    @OriginalMember(owner = "client!cq", name = "mb", descriptor = "Z")
    private boolean field6665;

    @OriginalMember(owner = "client!cq", name = "nb", descriptor = "Z")
    private boolean field6666;

    @OriginalMember(owner = "client!cq", name = "W", descriptor = "S")
    private short field6649;

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "Z")
    private boolean field6638;

    @OriginalMember(owner = "client!cq", name = "kb", descriptor = "Lka;")
    private class470 field6663;

    @OriginalMember(owner = "client!cq", name = "lb", descriptor = "Lr;")
    private class182 field6664;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "Z")
    public static boolean field6642 = false;

    @OriginalMember(owner = "client!cq", name = "jb", descriptor = "Ltp;")
    public static class532 field6662 = null;

    @OriginalMember(owner = "client!cq", name = "ib", descriptor = "Lsn;")
    public static class629 field6661 = new class629("WTWIP", 3);

    @OriginalMember(owner = "client!cq", name = "sb", descriptor = "Ldh;")
    public static class320 field6671 = new class320(94, 3);

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!cq", name = "R", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!cq", name = "U", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!cq", name = "V", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!cq", name = "Y", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!cq", name = "Z", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!cq", name = "ab", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!cq", name = "bb", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!cq", name = "cb", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!cq", name = "eb", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!cq", name = "fb", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!cq", name = "gb", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!cq", name = "hb", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!cq", name = "ob", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!cq", name = "pb", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!cq", name = "qb", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!cq", name = "rb", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!cq", name = "Q", descriptor = "Lrc;")
    public static class536 field6643;

    @OriginalMember(owner = "client!cq", name = "T", descriptor = "Llca;")
    private class642 field6646;

    @OriginalMember(owner = "client!cq", name = "tb", descriptor = "[Lfi;")
    public static class554[] field6672;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "(I)Z", line = 4)
    public final boolean method991(int arg0) {
        int var2 = 114 % ((65 - arg0) / 48);
        ++field6660;
        return this.field6656;
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)I", line = 16)
    public final int method1241(byte arg0) {
        ++field6647;
        if (arg0 != 99) {
            field6642 = false;
        }
        return this.field6649 & 65535;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)Z", line = 27)
    public final boolean method1239(boolean arg0) {
        if (!arg0) {
            this.field6646 = null;
        }
        ++field6653;
        return this.field6638;
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(B)I", line = 39)
    public final int method1236(byte arg0) {
        ++field6669;
        if (arg0 != -78) {
            field6662 = null;
        }
        return 22;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIII)V", line = 50)
    public static final void method2825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6668;
        class277.field3403 = arg3;
        class450.field6492 = arg4;
        class504.field7092 = arg0;
        class687.field9703 = arg5;
        class711.field10016 = arg2;
        if (class687.field9703 >= 100) {
            int var6 = class277.field3403 * 512 - -256;
            int var7 = class450.field6492 * 512 + 256;
            int var8 = class676.method3845(var7, var6, 0, class122.field1278) + -class504.field7092;
            int var9 = -class167.field1855 + var6;
            int var10 = -class204.field2409 + var8;
            int var11 = -class590.field8319 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 - -(var11 * var11)));
            class27.field281 = 16383 & (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D);
            class152.field1670 = 16383 & (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11));
            class522.field7423 = 0;
            if (class27.field281 < 1024) {
                class27.field281 = 1024;
            }
            if (class27.field281 > 3072) {
                class27.field281 = 3072;
            }
        }
        class406.field5556 = -1;
        class16.field147 = -1;
        class496.field7014 = arg1;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V", line = 98)
    public final void method1237(byte arg0) {
        if (this.field6663 != null) {
            this.field6663.method223();
        }
        ++field6670;
        if (arg0 > -68) {
            this.method987(false, (class58) null, (class361) null, -120, -61, 121, -33);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZBLha;)Lbt;", line = 112)
    private final class42 method2826(int arg0, boolean arg1, byte arg2, class58 arg3) {
        if (arg2 != -116) {
            return null;
        } else {
            ++field6667;
            class316 var5 = class445.field6442.method3972((byte) 98, 65535 & this.field6649);
            class278 var6;
            class278 var7;
            if (this.field6665) {
                var6 = class159.field1758[super.field4633];
                var7 = class11.field88[0];
            } else {
                if (super.field4633 < 3) {
                    var7 = class11.field88[super.field4633 + 1];
                } else {
                    var7 = null;
                }
                var6 = class11.field88[super.field4633];
            }
            return var5.method1894(this.field6650, -45, arg0, var7, arg1, super.field4629, arg3, super.field4627, 22, var6, super.field4635);
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lha;Lvc;IIIIIZIZ)V", line = 142)
    public class465(class58 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4021);
        super.field4635 = arg4;
        super.field4629 = arg6;
        this.field6656 = arg9;
        this.field6650 = (byte) arg8;
        this.field6665 = arg7;
        this.field6666 = arg1.field4001 != 0 && !arg7;
        this.field6649 = (short) arg1.field3962;
        this.field6638 = arg0.method376() && arg1.field4029 && !this.field6665 && ~class654.field9334.field9856.method2185(-125) != -1;
        int var11 = 2048;
        if (this.field6656) {
            var11 |= 65536;
        }
        class42 var12 = this.method2826(var11, this.field6638, (byte) -116, arg0);
        if (var12 != null) {
            this.field6663 = var12.field475;
            this.field6664 = var12.field474;
            if (this.field6656) {
                this.field6663 = this.field6663.method237((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)I", line = 175)
    public final int method985(int arg0) {
        if (arg0 != 4) {
            this.field6638 = false;
        }
        ++field6658;
        return this.field6663 != null ? this.field6663.method190() : 0;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(ILha;)Llca;", line = 191)
    public final class642 method983(int arg0, class58 arg1) {
        if (this.field6646 == null) {
            this.field6646 = class191.method1161(super.field4629, this.method2827(arg1, arg0 ^ 65, 0), super.field4635, super.field4627, arg0 ^ 4371);
        }
        if (arg0 != 0) {
            this.method1237((byte) -84);
        }
        ++field6651;
        return this.field6646;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 207)
    public final void method982(int arg0) {
        ++field6657;
        this.field6656 = false;
        if (this.field6663 != null) {
            this.field6663.method207(this.field6663.method213() & -65537);
        }
        if (arg0 != 2) {
            this.method1238((class58) null, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lha;II)Lka;", line = 222)
    private final class470 method2827(class58 arg0, int arg1, int arg2) {
        int var4 = -70 % ((arg1 - -17) / 63);
        ++field6648;
        if (this.field6663 != null && ~arg0.method418(this.field6663.method213(), arg2) == -1) {
            return this.field6663;
        } else {
            class42 var5 = this.method2826(arg2, false, (byte) -116, arg0);
            return var5 == null ? null : var5.field475;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lha;B)V", line = 242)
    public final void method1238(class58 arg0, byte arg1) {
        ++field6639;
        Object var3 = null;
        class182 var5;
        if (this.field6664 == null && this.field6638) {
            class42 var4 = this.method2826(262144, true, (byte) -116, arg0);
            var5 = var4 != null ? var4.field474 : null;
        } else {
            var5 = this.field6664;
            this.field6664 = null;
        }
        if (var5 != null) {
            class158.method979(var5, super.field4633, super.field4635, super.field4629, (boolean[]) null);
        }
        if (arg1 >= -15) {
            this.method989(87);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)I", line = 270)
    public final int method1243(byte arg0) {
        if (arg0 != 117) {
            return -24;
        } else {
            ++field6655;
            return this.field6650;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lha;I)V", line = 286)
    public final void method990(class58 arg0, int arg1) {
        int var3 = 1 % ((-2 - arg1) / 62);
        ++field6652;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLha;)Llba;", line = 296)
    public final class547 method994(byte arg0, class58 arg1) {
        if (arg0 != -112) {
            this.method1237((byte) -96);
        }
        ++field6637;
        if (this.field6663 == null) {
            return null;
        } else {
            class165 var3 = arg1.method422();
            var3.method1019(super.field4635, super.field4627, super.field4629);
            class547 var4 = class652.method3702(this.field6666, -9477, 1);
            if (class626.field8994) {
                this.field6663.method188(var3, var4.field7870[0], class586.field8268, 0);
            } else {
                this.field6663.method228(var3, var4.field7870[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZLha;Lrr;IIII)V", line = 323)
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 0) {
            this.field6649 = 33;
        }
        if (arg2 instanceof class465) {
            class465 var8 = (class465) arg2;
            if (this.field6663 != null && var8.field6663 != null) {
                this.field6663.method230(var8.field6663, arg4, arg6, arg5, arg0);
            }
        }
        ++field6654;
    }

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "(I)V", line = 343)
    public static void method2828(int arg0) {
        field6661 = null;
        field6672 = null;
        field6662 = null;
        field6671 = null;
        if (arg0 != 512) {
            field6642 = true;
        }
        field6643 = null;
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z", line = 366)
    public final boolean method986(int arg0) {
        ++field6644;
        int var2 = 104 % ((arg0 - -50) / 60);
        if (this.field6663 != null) {
            return !this.field6663.method202();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "(Z)I", line = 381)
    public final int method992(boolean arg0) {
        ++field6640;
        if (arg0) {
            this.field6646 = null;
        }
        return this.field6663 == null ? 0 : this.field6663.method217();
    }

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "(I)Z", line = 394)
    public final boolean method989(int arg0) {
        ++field6641;
        if (arg0 >= -112) {
            this.field6638 = false;
        }
        return this.field6663 == null ? false : this.field6663.method197();
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILha;I)Z", line = 413)
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field6659;
        class470 var5 = this.method2827(arg2, -105, 131072);
        if (var5 != null) {
            class165 var6 = arg2.method422();
            var6.method1019(super.field4635, super.field4627, super.field4629);
            return !class626.field8994 ? var5.method227(arg0, arg1, var6, false, 0) : var5.method191(arg0, arg1, var6, false, 0, class586.field8268);
        } else {
            return arg3 != -1 ? false : false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILha;)V", line = 434)
    public final void method1244(int arg0, class58 arg1) {
        ++field6645;
        Object var3 = null;
        class182 var5;
        if (this.field6664 == null && this.field6638) {
            class42 var4 = this.method2826(262144, true, (byte) -116, arg1);
            var5 = var4 != null ? var4.field474 : null;
        } else {
            var5 = this.field6664;
            this.field6664 = null;
        }
        if (arg0 != 17513) {
            this.method1239(true);
        }
        if (var5 != null) {
            class663.method3772(var5, super.field4633, super.field4635, super.field4629, (boolean[]) null);
        }
    }
}
