import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class659 extends class353 implements class526 {

    @OriginalMember(owner = "client!ki", name = "ib", descriptor = "Z")
    private boolean field9162;

    @OriginalMember(owner = "client!ki", name = "kb", descriptor = "B")
    private byte field9164;

    @OriginalMember(owner = "client!ki", name = "nb", descriptor = "Z")
    private boolean field9167;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "B")
    private byte field9150;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "S")
    private short field9145;

    @OriginalMember(owner = "client!ki", name = "rb", descriptor = "Z")
    private boolean field9171;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "Lha;")
    private class54 field9149;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "Lda;")
    private class55 field9151;

    @OriginalMember(owner = "client!ki", name = "jb", descriptor = "[I")
    public static int[] field9163 = new int[4096];

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field9152 = "";

    @OriginalMember(owner = "client!ki", name = "hb", descriptor = "Loh;")
    public static class370 field9161 = new class370(9, 2);

    @OriginalMember(owner = "client!ki", name = "ub", descriptor = "Llh;")
    public static class487 field9174 = new class487(15, 8);

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "F")
    public static float field9159;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!ki", name = "gb", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!ki", name = "lb", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!ki", name = "mb", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!ki", name = "ob", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!ki", name = "pb", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!ki", name = "qb", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!ki", name = "sb", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!ki", name = "tb", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "Lcr;")
    private class533 field9144;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)Z")
    public final boolean method209(byte arg0) {
        int var2 = -24 / ((arg0 - 31) / 42);
        ++field9169;
        return this.field9151 == null ? false : this.field9151.method430();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)I")
    public static final int method3699(int arg0, int arg1, int arg2) {
        ++field9154;
        if (class227.field3163 == -1) {
            return 1;
        } else {
            if (~class503.field6917 != ~arg2) {
                class569.method3263(class65.field801.method555(class697.field9900, true), 4, arg2);
                if (~class503.field6917 != ~arg2) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class611.field8473.getSize();
                if (arg1 != 500) {
                    field9152 = null;
                }
                class124.method890(class65.field801.method555(class697.field9900, true), class273.field3741, arg1 ^ -501, true, class334.field4506, class136.field1916);
                class270 var4 = class29.method282(0, (byte) 125, class227.field3163, class125.field1812);
                long var5 = class577.method3295((byte) 15);
                class334.field4506.method193();
                class250.field3403.method689(0, class265.field3586, 0);
                class334.field4506.method93(class250.field3403);
                class334.field4506.method161(var3.width / 2, var3.height / 2, 512, 512);
                class334.field4506.method105(1.0F);
                class334.field4506.method117(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class55 var7 = class334.field4506.method106(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label45: for (int var9 = 0; var9 < 500; ++var9) {
                    class334.field4506.method101(0);
                    class334.field4506.method89();
                    for (int var10 = 15; var10 >= 0; --var10) {
                        for (int var11 = 0; ~var10 <= ~var11; ++var11) {
                            class524.field7112.method689((int) (((float) var11 + -((float) var10 / 2.0F)) * (float) class631.field8750), 0, (var10 + 1) * class631.field8750);
                            ++var8;
                            var7.method465(class524.field7112, (class551) null, 0);
                            if (~(class577.method3295((byte) 15) - var5) <= ~((long) arg0)) {
                                break label45;
                            }
                        }
                    }
                }
                class334.field4506.method98();
                long var12 = (long) (var8 * 1000) / (class577.method3295((byte) 15) - var5);
                class334.field4506.method101(0);
                class334.field4506.method89();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILr;)Lcr;")
    public final class533 method214(int arg0, class166 arg1) {
        if (this.field9144 == null) {
            this.field9144 = class333.method1966(super.field4042, 16, super.field4052, this.method3700(0, false, arg1), super.field4047);
        }
        ++field9170;
        int var3 = -12 / ((arg0 - 81) / 43);
        return this.field9144;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)I")
    public final int method222(boolean arg0) {
        if (!arg0) {
            return 70;
        } else {
            ++field9173;
            return this.field9164;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZLr;)Lda;")
    private final class55 method3700(int arg0, boolean arg1, class166 arg2) {
        ++field9166;
        if (this.field9151 != null && arg2.method134(this.field9151.method422(), arg0) == 0) {
            return this.field9151;
        } else {
            class604 var4 = this.method3703(-31471, arg1, arg0, arg2);
            return var4 == null ? null : var4.field8408;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public final void method208(int arg0) {
        ++field9142;
        if (arg0 == -18279) {
            if (this.field9151 != null) {
                this.field9151.method432();
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lr;I)Lbca;")
    public final class614 method221(class166 arg0, int arg1) {
        ++field9148;
        if (this.field9151 == null) {
            return null;
        } else {
            if (arg1 != -5) {
                field9163 = null;
            }
            class392 var3 = arg0.method166();
            var3.method689(super.field4697 + super.field4042, super.field4052, super.field4696 + super.field4047);
            class614 var4 = null;
            if (this.field9167) {
                var4 = class524.method2987(6257, 1);
            }
            if (!class340.field4563) {
                this.field9151.method465(var3, var4 != null ? var4.field8572[0] : null, 0);
            } else {
                this.field9151.method453(var3, var4 == null ? null : var4.field8572[0], class22.field250, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)Z")
    public final boolean method216(boolean arg0) {
        ++field9143;
        return !arg0 ? true : true;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)I")
    public final int method226(int arg0) {
        ++field9155;
        if (arg0 != 6329) {
            this.field9164 = -79;
        }
        return this.field9151 == null ? 0 : this.field9151.method426();
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Z")
    public final boolean method219(int arg0) {
        ++field9172;
        int var2 = 102 % ((arg0 - 28) / 40);
        return this.field9171;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field9158;
        class55 var5 = this.method3700(131072, false, arg3);
        if (arg1 != 0) {
            this.method213((byte) -105);
        }
        if (var5 != null) {
            class392 var6 = arg3.method166();
            var6.method689(super.field4042, super.field4052, super.field4047);
            return class340.field4563 ? var5.method419(arg2, arg0, var6, false, class22.field250) : var5.method448(arg2, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIBI)Z")
    public static final boolean method3701(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field9160;
        if ((2 & class492.field6720[0][arg2][arg4]) != 0) {
            return true;
        } else if (arg3 != -51) {
            return true;
        } else if ((16 & class492.field6720[arg1][arg2][arg4]) != 0) {
            return false;
        } else {
            return arg0 == class595.method3362((byte) -60, arg1, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I")
    public final int method211(byte arg0) {
        ++field9165;
        int var2 = 35 / ((38 - arg0) / 41);
        return 65535 & this.field9145;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lr;I)V")
    public final void method225(class166 arg0, int arg1) {
        if (arg1 != -32013) {
            method3702(85);
        }
        ++field9156;
        Object var3 = null;
        class54 var5;
        if (this.field9149 == null && this.field9171) {
            class604 var4 = this.method3703(-31471, true, 262144, arg0);
            var5 = var4 == null ? null : var4.field8406;
        } else {
            var5 = this.field9149;
            this.field9149 = null;
        }
        if (var5 != null) {
            class482.method2706(var5, super.field4050, super.field4042, super.field4047, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
    public final int method213(byte arg0) {
        if (arg0 <= 39) {
            this.field9149 = null;
        }
        ++field9157;
        return this.field9150;
    }

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "(I)V")
    public static void method3702(int arg0) {
        field9174 = null;
        field9152 = null;
        if (arg0 != 0) {
            field9174 = null;
        }
        field9161 = null;
        field9163 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lr;Z)V")
    public final void method220(class166 arg0, boolean arg1) {
        ++field9168;
        if (!arg1) {
            this.field9164 = -92;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLr;)V")
    public final void method210(byte arg0, class166 arg1) {
        if (arg0 != 12) {
            field9163 = null;
        }
        ++field9146;
        Object var3 = null;
        class54 var5;
        if (this.field9149 == null && this.field9171) {
            class604 var4 = this.method3703(-31471, true, 262144, arg1);
            var5 = var4 == null ? null : var4.field8406;
        } else {
            var5 = this.field9149;
            this.field9149 = null;
        }
        if (var5 != null) {
            class403.method2350(var5, super.field4050, super.field4042, super.field4047, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZILr;)Lfh;")
    private final class604 method3703(int arg0, boolean arg1, int arg2, class166 arg3) {
        ++field9147;
        class301 var5 = class475.field6543.method2685(this.field9145 & 65535, -106);
        if (arg0 != -31471) {
            this.method208(-50);
        }
        class37 var6;
        class37 var7;
        if (!this.field9162) {
            if (super.field4050 < 3) {
                var6 = class497.field6766[super.field4050 - -1];
            } else {
                var6 = null;
            }
            var7 = class497.field6766[super.field4050];
        } else {
            var7 = class52.field606[super.field4050];
            var6 = class497.field6766[0];
        }
        return var5.method1826(super.field4042, 11553, super.field4047, var6, arg1, arg2, arg3, var7, this.field9164, super.field4052, this.field9150);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lr;Ljs;IIIIIZIIII)V")
    public class659(class166 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field9162 = arg7;
        super.field4042 = arg4;
        this.field9164 = (byte) arg10;
        this.field9167 = arg1.field4164 != 0 && !arg7;
        super.field4047 = arg6;
        this.field9150 = (byte) arg11;
        this.field9145 = (short) arg1.field4131;
        this.field9171 = arg0.method94() && arg1.field4128 && !this.field9162 && ~class366.field4875.method3770(class503.field6917, true) != -1;
        class604 var13 = this.method3703(-31471, this.field9171, 2048, arg0);
        if (var13 != null) {
            this.field9149 = var13.field8406;
            this.field9151 = var13.field8408;
        }
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)I")
    public final int method217(int arg0) {
        if (arg0 <= 29) {
            return 126;
        } else {
            ++field9153;
            return this.field9151 == null ? 0 : this.field9151.method463();
        }
    }
}
