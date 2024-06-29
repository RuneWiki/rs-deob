import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class12 extends class248 {

    @OriginalMember(owner = "client!nc", name = "kc", descriptor = "I")
    public static int field135 = 0;

    @OriginalMember(owner = "client!nc", name = "pc", descriptor = "Ljava/lang/String;")
    public static String field140 = "Unable to find ";

    @OriginalMember(owner = "client!nc", name = "oc", descriptor = "I")
    public static int field139 = -2;

    @OriginalMember(owner = "client!nc", name = "nc", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!nc", name = "qc", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!nc", name = "rc", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!nc", name = "sc", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!nc", name = "tc", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!nc", name = "uc", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!nc", name = "vc", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!nc", name = "wc", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!nc", name = "xc", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!nc", name = "mc", descriptor = "Lse;")
    public class102 field137;

    @OriginalMember(owner = "client!nc", name = "lc", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field136;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIJILui;)V")
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        ++field147;
        if (this.field137 != null) {
            class76 var13 = super.field3741 != -1 && ~super.field3677 == -1 ? class232.method1609((byte) -32, super.field3741) : null;
            class76 var14 = ~super.field3752 == 0 || super.field3752 == this.method1708(0).field4703 && var13 != null ? null : class232.method1609((byte) -32, super.field3752);
            class58 var15 = this.field137.method799(var14, super.field3692, super.field3685, super.field3708, 0, super.field3732, super.field3740, super.field3678, var13, super.field3747);
            if (var15 != null) {
                super.field3726 = var15.method17();
                class102 var16 = this.field137;
                if (var16.field1752 != null) {
                    var16 = var16.method795(65535);
                }
                if (class22.field247 && var16.field1726) {
                    class58 var17 = class145.method1082(this.field137.field1781, this.field137.field1754, this.field137.field1738, var14 != null ? super.field3685 : super.field3747, arg0, super.field3759, true, var15, this.field137.field1767, var14 != null ? var14 : var13, super.field3753, this.field137.field1758, super.field3739, super.field3660);
                    var17.method16(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field3690);
                }
                this.method1703(123, var15);
                this.method1715(var15, 28061, arg0);
                class58 var18 = null;
                if (super.field3718 != -1 && super.field3672 != -1) {
                    class120 var19 = class152.method1126(super.field3718, (byte) -1);
                    var18 = var19.method895(super.field3689, super.field3688, (byte) 99, super.field3672);
                    if (var18 != null) {
                        var18.method423(0, -super.field3663, 0);
                        if (var19.field1964) {
                            if (~class7.field72 != -1) {
                                var18.method411(class7.field72);
                            }
                            if (class295.field4753 != 0) {
                                var18.method405(class295.field4753);
                            }
                            if (class73.field1154 != 0) {
                                var18.method423(0, class73.field1154, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class257) var15).method1762(var18);
                }
                this.method1704(var18, var15, true);
                if (~this.field137.field1738 == -2) {
                    var15.field854 = true;
                }
                var15.method16(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3690);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Lsh;")
    public static final class31 method88(int arg0, int arg1) {
        ++field145;
        class31 var2 = (class31) class272.field4399.method1418((long) arg0, 0);
        if (arg1 != 27838) {
            method89(-45);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class47.field653.method1868(class147.method1092((byte) 96, arg0), class250.method1731(127, arg0), arg1 + -27837);
            class31 var4 = new class31();
            var4.field352 = arg0;
            if (var3 != null) {
                var4.method202(new class53(var3), 0);
            }
            var4.method199((byte) 43);
            if (~var4.field323 != 0) {
                var4.method192((byte) -96, method88(var4.field378, 27838), method88(var4.field323, 27838));
            }
            if (var4.field369 != -1) {
                var4.method200(method88(var4.field336, arg1), method88(var4.field369, 27838), -17529);
            }
            if (!class171.field2583 && var4.field364) {
                var4.field385 = class102.field1739;
                var4.field354 = class225.field3305;
                var4.field349 = class224.field3297;
                var4.field353 = false;
                var4.field348 = 0;
            }
            class272.field4399.method1421((long) arg0, var4, (byte) 88);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
    public static void method89(int arg0) {
        field140 = null;
        field136 = null;
        int var1 = -66 % (arg0 / 54);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILse;)V")
    public final void method90(int arg0, class102 arg1) {
        if (arg0 != -1) {
            this.finalize();
        }
        this.field137 = arg1;
        ++field143;
        if (super.field3690 != null) {
            super.field3690.method654();
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)Z")
    public final boolean method91(int arg0) {
        ++field146;
        if (this.field137 == null) {
            return false;
        } else {
            if (arg0 < 34) {
                field136 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()I")
    public final int method17() {
        ++field138;
        return super.field3726;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I")
    public final int method92(int arg0) {
        ++field144;
        if (this.field137.field1752 != null) {
            class102 var2 = this.field137.method795(65535);
            if (var2 != null && ~var2.field1724 != 0) {
                return var2.field1724;
            }
        }
        if (arg0 > -90) {
            this.method15(-34, 111, 20, 31, 72);
        }
        return super.field3723;
    }

    @OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (super.field3690 != null) {
            super.field3690.method658();
        }
        ++field141;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field148;
        if (this.field137 != null) {
            if (!super.field3698) {
                class76 var6 = ~super.field3741 != 0 && ~super.field3677 == -1 ? class232.method1609((byte) -32, super.field3741) : null;
                class76 var7 = super.field3752 == -1 || super.field3752 == this.method1708(0).field4703 && var6 != null ? null : class232.method1609((byte) -32, super.field3752);
                class58 var8 = this.field137.method799(var7, super.field3692, super.field3685, super.field3708, 0, super.field3732, super.field3740, super.field3678, var6, super.field3747);
                if (var8 == null) {
                    return;
                }
                this.method1704((class58) null, var8, true);
            }
            if (super.field3690 != null) {
                super.field3690.method650(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }
}
