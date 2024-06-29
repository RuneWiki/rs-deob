import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class658 extends class613 implements class484 {

    @OriginalMember(owner = "client!am", name = "rb", descriptor = "Z")
    private boolean field9185;

    @OriginalMember(owner = "client!am", name = "T", descriptor = "Z")
    private boolean field9161;

    @OriginalMember(owner = "client!am", name = "Z", descriptor = "S")
    private short field9167;

    @OriginalMember(owner = "client!am", name = "lb", descriptor = "Z")
    private boolean field9179;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "B")
    private byte field9158;

    @OriginalMember(owner = "client!am", name = "R", descriptor = "B")
    private byte field9159;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "Z")
    private boolean field9155;

    @OriginalMember(owner = "client!am", name = "nb", descriptor = "Lka;")
    public class496 field9181;

    @OriginalMember(owner = "client!am", name = "sb", descriptor = "Lr;")
    private class194 field9186;

    @OriginalMember(owner = "client!am", name = "mb", descriptor = "Lwv;")
    public static class37 field9180 = new class37(8, 7);

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!am", name = "V", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!am", name = "W", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!am", name = "X", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!am", name = "Y", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!am", name = "ab", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!am", name = "bb", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!am", name = "cb", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!am", name = "db", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!am", name = "eb", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!am", name = "fb", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!am", name = "gb", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!am", name = "hb", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!am", name = "jb", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!am", name = "kb", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!am", name = "ob", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!am", name = "pb", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!am", name = "qb", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!am", name = "ib", descriptor = "Lrn;")
    private class281 field9176;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(Z)Z", line = 8)
    public final boolean method910(boolean arg0) {
        if (!arg0) {
            this.field9167 = -70;
        }
        ++field9177;
        return this.field9161;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)I", line = 19)
    public final int method1482(boolean arg0) {
        if (!arg0) {
            return -14;
        } else {
            ++field9168;
            return this.field9158;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLha;II)Lbaa;", line = 31)
    private final class547 method3755(boolean arg0, class65 arg1, int arg2, int arg3) {
        ++field9157;
        class282 var5 = class277.field4038.method3919(true, this.field9167 & 65535);
        if (arg2 != 7) {
            this.method906(-117);
        }
        class294 var6;
        class294 var7;
        if (this.field9179) {
            var6 = class774.field10642[super.field5749];
            var7 = class411.field5572[0];
        } else {
            if (super.field5749 >= 3) {
                var7 = null;
            } else {
                var7 = class411.field5572[super.field5749 + 1];
            }
            var6 = class411.field5572[super.field5749];
        }
        return var5.method1827((byte) 106, this.field9158, arg3, (class520) null, arg1, var7, var6, arg0, super.field5742, super.field5741, super.field5746, this.field9159);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)I", line = 61)
    public final int method1483(int arg0) {
        if (arg0 != 24853) {
            this.field9176 = null;
        }
        ++field9184;
        return this.field9167 & 65535;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V", line = 74)
    public static final void method3756(int arg0, byte arg1) {
        class793.method4365((byte) -33);
        if (arg1 >= -54) {
            method3756(19, (byte) 92);
        }
        ++field9169;
        int var2 = class653.field9128.method19((byte) -124, arg0).field9723;
        if (~var2 != -1) {
            int var3 = class537.field7727.field10294[arg0];
            if (var2 == 6) {
                class28.field408 = var3;
            }
            if (var2 == 5) {
                class16.field303 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(ILha;)V", line = 101)
    public final void method912(int arg0, class65 arg1) {
        if (arg0 < 52) {
            this.field9179 = true;
        }
        ++field9183;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Z", line = 111)
    public final boolean method1488(byte arg0) {
        int var2 = -4 / ((-7 - arg0) / 60);
        ++field9175;
        return this.field9155;
    }

    @OriginalMember(owner = "client!am", name = "h", descriptor = "(B)V", line = 122)
    public static void method3757(byte arg0) {
        if (arg0 != 52) {
            method3756(49, (byte) -125);
        }
        field9180 = null;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 132)
    public final void method1484(int arg0) {
        if (arg0 > -107) {
            this.method1478((byte) 75);
        }
        ++field9165;
        if (this.field9181 != null) {
            this.field9181.method107();
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lha;BI)Lka;", line = 147)
    private final class496 method3758(class65 arg0, byte arg1, int arg2) {
        ++field9164;
        if (this.field9181 != null && arg0.method512(this.field9181.method68(), arg2) == 0) {
            return this.field9181;
        } else {
            if (arg1 != -102) {
                this.field9159 = 63;
            }
            class547 var4 = this.method3755(false, arg0, 7, arg2);
            return var4 == null ? null : var4.field7866;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Lha;I)Lrn;", line = 171)
    public final class281 method901(class65 arg0, int arg1) {
        ++field9162;
        if (this.field9176 == null) {
            this.field9176 = class490.method2922((byte) 117, super.field5742, this.method3758(arg0, (byte) -102, 0), super.field5746, super.field5741);
        }
        if (arg1 < 50) {
            this.method1488((byte) -118);
        }
        return this.field9176;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 186)
    public static final boolean method3759(String arg0, boolean arg1) {
        ++field9172;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~class22.field365 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class440.field5967[var2])) {
                    return true;
                }
            }
            if (arg0.equalsIgnoreCase(class210.field3250.field9768)) {
                return true;
            } else {
                if (!arg1) {
                    method3757((byte) 56);
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILha;)Z", line = 217)
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field9178;
        if (arg1 != -17458) {
            this.method909(true);
        }
        class496 var5 = this.method3758(arg3, (byte) -102, 131072);
        if (var5 != null) {
            class326 var6 = arg3.method514();
            var6.method1869(super.field5742, super.field5741, super.field5746);
            return !class576.field8120 ? var5.method95(arg0, arg2, var6, false, 0) : var5.method77(arg0, arg2, var6, false, 0, class740.field10205);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(Z)Z", line = 238)
    public final boolean method909(boolean arg0) {
        ++field9166;
        if (arg0) {
            return false;
        } else if (this.field9181 == null) {
            return true;
        } else {
            return !this.field9181.method72();
        }
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(I)I", line = 253)
    public final int method917(int arg0) {
        if (arg0 != -1760267218) {
            return -4;
        } else {
            ++field9156;
            return this.field9181 == null ? 0 : this.field9181.method75();
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLha;)V", line = 266)
    public final void method1479(byte arg0, class65 arg1) {
        ++field9174;
        Object var3 = null;
        int var4 = -9 % ((arg0 - -19) / 48);
        class194 var6;
        if (this.field9186 == null && this.field9155) {
            class547 var5 = this.method3755(true, arg1, 7, 262144);
            var6 = var5 == null ? null : var5.field7863;
        } else {
            var6 = this.field9186;
            this.field9186 = null;
        }
        if (var6 != null) {
            class759.method4223(var6, super.field5749, super.field5742, super.field5746, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLje;IIILha;I)V", line = 293)
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        if (arg2 != 0) {
            this.field9158 = 23;
        }
        if (arg1 instanceof class658) {
            class658 var8 = (class658) arg1;
            if (this.field9181 != null && var8.field9181 != null) {
                this.field9181.method67(var8.field9181, arg4, arg6, arg3, arg0);
            }
        } else if (arg1 instanceof class442) {
            class442 var9 = (class442) arg1;
            if (this.field9181 != null && var9.field6013 != null) {
                this.field9181.method67(var9.field6013, arg4, arg6, arg3, arg0);
            }
        }
        ++field9182;
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "(I)V", line = 326)
    public final void method903(int arg0) {
        ++field9170;
        this.field9161 = false;
        if (this.field9181 != null) {
            this.field9181.method111(-65537 & this.field9181.method68());
        }
        if (arg0 != -772) {
            this.method910(false);
        }
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)Z", line = 342)
    public final boolean method906(int arg0) {
        int var2 = -91 % ((11 - arg0) / 35);
        ++field9154;
        return this.field9181 != null ? this.field9181.method121() : false;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lha;I)Lmaa;", line = 356)
    public final class495 method918(class65 arg0, int arg1) {
        ++field9160;
        if (this.field9181 == null) {
            return null;
        } else {
            class326 var3 = arg0.method514();
            if (arg1 != -30514) {
                this.field9161 = false;
            }
            var3.method1869(super.field5742, super.field5741, super.field5746);
            class495 var4 = class86.method652(this.field9185, 0, 1);
            if (class576.field8120) {
                this.field9181.method106(var3, var4.field7067[0], class740.field10205, 0);
            } else {
                this.field9181.method88(var3, var4.field7067[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)I", line = 387)
    public final int method1478(byte arg0) {
        ++field9163;
        return arg0 <= 108 ? 80 : this.field9159;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lha;Lkv;IIIIIZIIZ)V", line = 399)
    public class658(class65 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class8.method53((byte) -32, arg9, arg8));
        this.field9185 = ~arg1.field4149 != -1 && !arg7;
        super.field5742 = arg4;
        this.field9161 = arg10;
        this.field9167 = (short) arg1.field4100;
        this.field9179 = arg7;
        this.field9158 = (byte) arg8;
        this.field9159 = (byte) arg9;
        super.field5746 = arg6;
        this.field9155 = arg0.method483() && arg1.field4115 && !this.field9179 && ~class21.field353.field10062.method4001(-50) != -1;
        int var12 = 2048;
        if (this.field9161) {
            var12 |= 65536;
        }
        class547 var13 = this.method3755(this.field9155, arg0, 7, var12);
        if (var13 != null) {
            this.field9181 = var13.field7866;
            this.field9186 = var13.field7863;
            if (this.field9161) {
                this.field9181 = this.field9181.method93((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILha;)V", line = 432)
    public final void method1487(int arg0, class65 arg1) {
        ++field9171;
        Object var3 = null;
        class194 var5;
        if (this.field9186 == null && this.field9155) {
            class547 var4 = this.method3755(true, arg1, 7, 262144);
            var5 = var4 == null ? null : var4.field7863;
        } else {
            var5 = this.field9186;
            this.field9186 = null;
        }
        int var6 = 46 % ((arg0 - 4) / 39);
        if (var5 != null) {
            class46.method336(var5, super.field5749, super.field5742, super.field5746, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)I", line = 461)
    public final int method916(boolean arg0) {
        if (!arg0) {
            this.field9185 = true;
        }
        ++field9173;
        return this.field9181 != null ? this.field9181.method118() : 0;
    }
}
