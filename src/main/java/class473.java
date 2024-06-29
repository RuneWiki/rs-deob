import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class473 extends class480 implements class691 {

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "Z")
    private boolean field6600;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "B")
    private byte field6597;

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "Z")
    private boolean field6616;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "S")
    private short field6612;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "B")
    private byte field6598;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "Z")
    private boolean field6596;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "Lda;")
    private class55 field6613;

    @OriginalMember(owner = "client!qj", name = "fb", descriptor = "Lha;")
    private class54 field6617;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field6604 = 104;

    @OriginalMember(owner = "client!qj", name = "mb", descriptor = "[Ljava/lang/String;")
    public static String[] field6624 = new String[100];

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field6602 = new String[100];

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!qj", name = "gb", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!qj", name = "hb", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!qj", name = "ib", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!qj", name = "jb", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!qj", name = "kb", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!qj", name = "lb", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!qj", name = "nb", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!qj", name = "ob", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!qj", name = "pb", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!qj", name = "qb", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!qj", name = "rb", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "Lsr;")
    private class229 field6611;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "Lkb;")
    public static class640 field6605;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V", line = 3)
    public final void method1071(int arg0) {
        if (arg0 != -31121) {
            this.method2782((class165) null, -79, 120);
        }
        if (this.field6613 != null) {
            this.field6613.method114();
        }
        ++field6620;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)I", line = 16)
    public final int method172(byte arg0) {
        ++field6601;
        if (arg0 != -117) {
            this.method166((class165) null, 18, -32, 37);
        }
        return this.field6613 == null ? 0 : this.field6613.method72();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILr;ZB)Lfe;", line = 27)
    private final class528 method2780(int arg0, class165 arg1, boolean arg2, byte arg3) {
        ++field6623;
        class232 var5 = class37.field703.method807(0, this.field6612 & 65535);
        class37 var6;
        class37 var7;
        if (!this.field6616) {
            var6 = class399.field5631[super.field535];
            if (~super.field535 > -4) {
                var7 = class399.field5631[super.field535 + 1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class340.field4500[super.field535];
            var7 = class399.field5631[0];
        }
        if (arg3 != -86) {
            method2785(16);
        }
        return var5.method1417(false, super.field531, arg1, this.field6598, var7, arg0, arg2, super.field530, super.field527, this.field6597, var6);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(BLr;)Lsr;", line = 57)
    public final class229 method161(byte arg0, class165 arg1) {
        if (this.field6611 == null) {
            this.field6611 = class430.method2587((byte) 77, super.field527, super.field531, super.field530, this.method2782(arg1, 0, -1));
        }
        ++field6603;
        return arg0 < 100 ? null : this.field6611;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lr;B)Llt;", line = 72)
    public final class626 method170(class165 arg0, byte arg1) {
        ++field6615;
        if (this.field6613 == null) {
            return null;
        } else {
            class394 var3 = arg0.method315();
            var3.method712(super.field6731 + super.field530, super.field527, super.field531 - -super.field6732);
            class626 var4 = null;
            if (this.field6600) {
                var4 = class547.method3208(1, -16660);
            }
            if (!class547.field7943) {
                this.field6613.method67(var3, var4 == null ? null : var4.field8985[0], 0);
            } else {
                this.field6613.method122(var3, var4 == null ? null : var4.field8985[0], class676.field9693, 0);
            }
            if (arg1 != -2) {
                method2783(false);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZIIII)Lqo;", line = 104)
    public static final class21 method2781(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6621;
        class21 var5 = new class21();
        var5.field540 = arg3;
        var5.field541 = arg1;
        if (arg4 >= -17) {
            method2781(false, -26, -31, 55, -92);
        }
        class113.field1442.method3670((long) arg2, var5, (byte) 127);
        class71.method633(arg3, 113);
        class17 var6 = class400.method2420((byte) -108, arg2);
        if (var6 != null) {
            class314.method1836(var6, false);
        }
        if (client.field3750 != null) {
            class314.method1836(client.field3750, false);
            client.field3750 = null;
        }
        class421.method2544(16);
        if (var6 != null) {
            class431.method2592(!arg0, var6, -1);
        }
        if (!arg0) {
            class545.method3198(arg3);
        }
        if (!arg0 && ~class127.field1619 != 0) {
            class534.method3137(1, class127.field1619, 2);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I", line = 146)
    public final int method1072(int arg0) {
        ++field6628;
        if (arg0 != 4378) {
            this.method1067((byte) 2);
        }
        return this.field6612 & 65535;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lr;II)Lda;", line = 158)
    private final class55 method2782(class165 arg0, int arg1, int arg2) {
        ++field6607;
        if (this.field6613 != null && ~arg0.method306(this.field6613.method118(), arg1) == -1) {
            return this.field6613;
        } else {
            if (arg2 != -1) {
                this.method1072(-30);
            }
            class528 var4 = this.method2780(arg1, arg0, false, (byte) -86);
            return var4 != null ? var4.field7718 : null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 182)
    public static final void method2783(boolean arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class25.field587[var1] = false;
        }
        ++field6609;
        class366.field4932 = 0;
        class586.field8507 = 1;
        class311.field4115 = 0;
        class221.field2860 = -1;
        class51.field842 = -1;
        class40.field752 = -1;
        class38.field713 = -1;
        if (arg0) {
            field6605 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lr;III)Z", line = 207)
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        ++field6614;
        if (arg3 > -20) {
            this.field6613 = null;
        }
        class55 var5 = this.method2782(arg0, 131072, -1);
        if (var5 != null) {
            class394 var6 = arg0.method315();
            var6.method712(super.field530, super.field527, super.field531);
            return class547.field7943 ? var5.method124(arg1, arg2, var6, false, class676.field9693) : var5.method129(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I", line = 232)
    public final int method1067(byte arg0) {
        ++field6629;
        int var2 = -4 / ((arg0 - -1) / 37);
        return this.field6597;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)Z", line = 242)
    public final boolean method165(byte arg0) {
        if (arg0 > -21) {
            return false;
        } else {
            ++field6619;
            return this.field6613 != null ? this.field6613.method112() : false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Z", line = 262)
    public final boolean method1069(int arg0) {
        ++field6625;
        if (arg0 != 17819) {
            this.field6617 = null;
        }
        return this.field6596;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lr;Lfga;IIIIIZIIII)V", line = 276)
    public class473(class165 arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field6600 = arg1.field3029 != 0 && !arg7;
        super.field531 = arg6;
        this.field6597 = (byte) arg11;
        this.field6616 = arg7;
        this.field6612 = (short) arg1.field3056;
        this.field6598 = (byte) arg10;
        super.field530 = arg4;
        this.field6596 = arg0.method215() && arg1.field3097 && !this.field6616 && ~class221.field2851.method1844(class375.field5039, true) != -1;
        class528 var13 = this.method2780(2048, arg0, this.field6596, (byte) -86);
        if (var13 != null) {
            this.field6613 = var13.field7718;
            this.field6617 = var13.field7717;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lr;Z)V", line = 300)
    public final void method162(class165 arg0, boolean arg1) {
        ++field6610;
        if (arg1) {
            method2781(false, -35, -27, -9, 6);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLr;)V", line = 314)
    public final void method1073(byte arg0, class165 arg1) {
        ++field6606;
        Object var3 = null;
        if (arg0 != 73) {
            this.method1071(-58);
        }
        class54 var5;
        if (this.field6617 == null && this.field6596) {
            class528 var4 = this.method2780(262144, arg1, true, (byte) -86);
            var5 = var4 != null ? var4.field7717 : null;
        } else {
            var5 = this.field6617;
            this.field6617 = null;
        }
        if (var5 != null) {
            class122.method855(var5, super.field535, super.field530, super.field531, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)I", line = 351)
    public final int method173(int arg0) {
        if (arg0 != 32249) {
            return 72;
        } else {
            ++field6618;
            return this.field6613 == null ? 0 : this.field6613.method65();
        }
    }

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "(I)V", line = 368)
    public static final void method2784(int arg0) {
        class271.field3704 = 0;
        ++field6608;
        class34.field679.method1131((byte) -91);
        if (arg0 != -26286) {
            field6605 = null;
        }
        class361.field4805 = false;
    }

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "(I)V", line = 382)
    public static void method2785(int arg0) {
        field6624 = null;
        if (arg0 != 0) {
            method2785(117);
        }
        field6602 = null;
        field6605 = null;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)Z", line = 398)
    public final boolean method175(int arg0) {
        ++field6622;
        if (arg0 != 0) {
            this.field6598 = -55;
        }
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I", line = 410)
    public final int method1070(int arg0) {
        ++field6599;
        return arg0 != -24359 ? 25 : this.field6598;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILr;)V", line = 427)
    public final void method1068(int arg0, class165 arg1) {
        ++field6627;
        Object var3 = null;
        class54 var5;
        if (this.field6617 == null && this.field6596) {
            class528 var4 = this.method2780(262144, arg1, true, (byte) -86);
            var5 = var4 != null ? var4.field7717 : null;
        } else {
            var5 = this.field6617;
            this.field6617 = null;
        }
        if (arg0 > -22) {
            field6604 = 106;
        }
        if (var5 != null) {
            class30.method389(var5, super.field535, super.field530, super.field531, (boolean[]) null);
        }
    }
}
