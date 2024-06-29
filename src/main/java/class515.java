import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class515 extends class481 implements class602 {

    @OriginalMember(owner = "client!hca", name = "cb", descriptor = "Z")
    private boolean field7183 = false;

    @OriginalMember(owner = "client!hca", name = "Y", descriptor = "Ljp;")
    public class374 field7179;

    @OriginalMember(owner = "client!hca", name = "R", descriptor = "Z")
    private boolean field7172;

    @OriginalMember(owner = "client!hca", name = "db", descriptor = "I")
    public static int field7184 = 500;

    @OriginalMember(owner = "client!hca", name = "C", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!hca", name = "D", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!hca", name = "E", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!hca", name = "F", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!hca", name = "G", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!hca", name = "H", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!hca", name = "I", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!hca", name = "K", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!hca", name = "L", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!hca", name = "M", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!hca", name = "N", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!hca", name = "O", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!hca", name = "P", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!hca", name = "Q", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!hca", name = "S", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!hca", name = "T", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!hca", name = "U", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!hca", name = "V", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!hca", name = "W", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!hca", name = "X", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!hca", name = "Z", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!hca", name = "ab", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!hca", name = "bb", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!hca", name = "J", descriptor = "Lln;")
    private class398 field7164;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (arg0 != -13127) {
            this.field7164 = null;
        }
        ++field7174;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        ++field7173;
        return arg0 != -34;
    }

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "(Lha;B)V")
    public final void method131(class66 arg0, byte arg1) {
        if (arg1 == 53) {
            ++field7170;
            class497 var3 = this.field7179.method2341(103, arg0, true, 262144, true);
            if (var3 != null) {
                int var4 = super.field2802 >> 9;
                int var5 = super.field2810 >> 9;
                class109 var6 = arg0.method475();
                var6.method814(super.field2802, super.field2815, super.field2810);
                this.field7179.method2347(false, var4, var4, var6, arg0, var5, var5, (byte) -118, var3);
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(Lha;B)Lpia;")
    public final class104 method114(class66 arg0, byte arg1) {
        ++field7159;
        class497 var3 = this.field7179.method2341(62, arg0, false, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class109 var4 = arg0.method475();
            var4.method814(super.field2802, super.field2815, super.field2810);
            if (arg1 != 115) {
                return null;
            } else {
                class104 var5 = class568.method3241(1, (byte) -115, this.field7172);
                int var6 = super.field2802 >> 9;
                int var7 = super.field2810 >> 9;
                this.field7179.method2347(true, var6, var6, var4, arg0, var7, var7, (byte) -118, var3);
                if (!class408.field5786) {
                    var3.method254(var4, var5.field1479[0], 0);
                } else {
                    var3.method258(var4, var5.field1479[0], class72.field972, 0);
                }
                if (this.field7179.field5452 != null) {
                    class586 var8 = this.field7179.field5452.method1057();
                    if (!class408.field5786) {
                        arg0.method534(var8);
                    } else {
                        arg0.method524(var8, class72.field972);
                    }
                }
                this.field7183 = var3.method272() || this.field7179.field5452 != null;
                if (this.field7164 != null) {
                    class478.method2827(true, super.field2802, var3, this.field7164, super.field2810, super.field2815);
                } else {
                    this.field7164 = class122.method882(var3, super.field2810, super.field2802, super.field2815, 99);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(Lha;B)Lln;")
    public final class398 method119(class66 arg0, byte arg1) {
        ++field7157;
        return arg1 > -35 ? null : this.field7164;
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)I")
    public final int method1750(int arg0) {
        if (arg0 != 29244) {
            this.field7164 = null;
        }
        ++field7163;
        return this.field7179.field5456;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILfq;BIILha;Z)V")
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        if (arg2 == -103) {
            ++field7176;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "(I)Z")
    public final boolean method777(int arg0) {
        ++field7162;
        int var2 = 23 % ((arg0 - -34) / 59);
        return this.field7183;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)I")
    public final int method1744(int arg0) {
        ++field7167;
        if (arg0 != 21215) {
            this.field7183 = true;
        }
        return this.field7179.field5474;
    }

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "(I)V")
    public static final void method3006(int arg0) {
        ++field7180;
        class2 var1 = null;
        try {
            class621 var2 = class786.field10800.method1547((byte) 25, "", true);
            while (var2.field8405 == 0) {
                class171.method1152(1L, false);
            }
            if (~var2.field8405 == arg0) {
                var1 = (class2) var2.field8403;
                class254 var3 = class125.field1721.method2251(false);
                var1.method8(var3.field3725, 0, var3.field3789, 29620);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method6(108);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)I")
    public final int method767(boolean arg0) {
        ++field7169;
        if (arg0) {
            this.field7183 = false;
        }
        return this.field7179.method2342(true);
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lha;Llp;IIIIIZIII)V")
    public class515(class66 arg0, class412 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class619.method3429(arg9, arg8, -83));
        this.field7179 = new class374(arg0, arg1, arg8, arg9, super.field2813, arg3, this, arg7, arg10);
        this.field7172 = ~arg1.field5905 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V")
    public final void method1745(boolean arg0) {
        ++field7181;
        if (!arg0) {
            this.method127(96);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ldt;B)Lps;")
    public static final class105 method3007(class254 arg0, byte arg1) {
        ++field7161;
        if (arg1 != 51) {
            method3007((class254) null, (byte) 89);
        }
        return new class105(arg0.method1695(423951304), arg0.method1695(arg1 ^ 423951355), arg0.method1695(arg1 ^ 423951355), arg0.method1695(arg1 + 423951253), arg0.method1722(false), arg0.method1722(false), arg0.method1731((byte) 64));
    }

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "(I)Z")
    public final boolean method769(int arg0) {
        ++field7158;
        return arg0 >= -70 ? false : false;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Z")
    public final boolean method1747(byte arg0) {
        ++field7178;
        int var2 = -105 % ((-41 - arg0) / 60);
        return this.field7179.method2353(-1);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)V")
    public static final void method3008(int arg0, int arg1) {
        if (arg0 > 4) {
            class163.field2163 = arg1;
            class672.field9007 = -1;
            ++field7182;
            class419.field6021 = 3;
            class7.field54 = 100;
        }
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(B)I")
    public final int method774(byte arg0) {
        if (arg0 != 115) {
            this.field7172 = true;
        }
        ++field7165;
        return this.field7179.method2351(-116);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lha;B)V")
    public final void method1742(class66 arg0, byte arg1) {
        ++field7160;
        this.field7179.method2343(arg0, false);
        if (arg1 <= 68) {
            this.field7183 = false;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljca;Z)V")
    public final void method3009(class711 arg0, boolean arg1) {
        this.field7179.method2349(arg0, arg1);
        ++field7168;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)I")
    public final int method1748(int arg0) {
        ++field7177;
        if (arg0 != 5875) {
            field7184 = -65;
        }
        return this.field7179.field5447;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        ++field7175;
        if (arg2 != 6238) {
            this.method131((class66) null, (byte) 88);
        }
        class497 var5 = this.field7179.method2341(arg2 ^ 6162, arg1, false, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class109 var6 = arg1.method475();
            var6.method814(super.field2802, super.field2815, super.field2810);
            return class408.field5786 ? var5.method245(arg0, arg3, var6, false, 0, class72.field972) : var5.method248(arg0, arg3, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(Lha;B)V")
    public final void method1752(class66 arg0, byte arg1) {
        this.field7179.method2352((byte) 121, arg0);
        ++field7171;
        if (arg1 >= -17) {
            this.field7172 = true;
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(Z)V")
    public static final void method3010(boolean arg0) {
        if (!arg0) {
            method3007((class254) null, (byte) 116);
        }
        class697.field9244 = false;
        ++field7166;
        class166.method1137(false);
    }
}
