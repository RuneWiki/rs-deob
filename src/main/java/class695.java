import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class695 extends class180 implements class302 {

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "Z")
    private boolean field9739 = false;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "Lfb;")
    public class626 field9733;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "Z")
    private boolean field9732;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    public static int field9738 = -1;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!mo", name = "Y", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!mo", name = "Z", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!mo", name = "ab", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!mo", name = "bb", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!mo", name = "cb", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!mo", name = "db", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!mo", name = "eb", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!mo", name = "gb", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!mo", name = "X", descriptor = "Lll;")
    private class334 field9745;

    @OriginalMember(owner = "client!mo", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field9753;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)Z", line = 3)
    public final boolean method402(int arg0) {
        ++field9736;
        if (arg0 != 623404585) {
            this.method413((byte) 89);
        }
        return this.field9739;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lr;Llr;IIIIIZIIIII)V", line = 14)
    public class695(class167 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field9733 = new class626(arg0, arg1, arg10, arg11, super.field9695, arg3, this, arg7, arg12);
        this.field9732 = ~arg1.field9830 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(ILr;)Lod;", line = 35)
    public final class468 method403(int arg0, class167 arg1) {
        if (arg0 > -38) {
            return null;
        } else {
            ++field9746;
            class55 var3 = this.field9733.method3647(arg1, false, true, -1, 2048);
            if (var3 == null) {
                return null;
            } else {
                class393 var4 = arg1.method339();
                var4.method503(super.field9696 - -super.field3027, super.field9701, super.field9705 - -super.field3024);
                class468 var5 = null;
                if (this.field9732) {
                    var5 = class429.method2720(1, 0);
                }
                int var6 = super.field9696 >> 9;
                int var7 = super.field9705 >> 9;
                this.field9733.method3646(var3, var6, var7, var7, true, arg1, var6, (byte) -109, var4);
                if (!class534.field7778) {
                    var3.method606(var4, var5 == null ? null : var5.field6948[0], 0);
                } else {
                    var3.method613(var4, var5 == null ? null : var5.field6948[0], class609.field8652, 0);
                }
                if (this.field9733.field8836 != null) {
                    class79 var8 = this.field9733.field8836.method3250();
                    if (!class534.field7778) {
                        arg1.method354(var8);
                    } else {
                        arg1.method320(var8, class609.field8652);
                    }
                }
                this.field9739 = var3.method614() || this.field9733.field8836 != null;
                if (this.field9745 != null) {
                    class251.method1789(this.field9745, -128, super.field9701, super.field9696, var3, super.field9705);
                } else {
                    this.field9745 = class166.method1342(var3, super.field9705, super.field9696, super.field9701, 30640);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZILr;I)Z", line = 90)
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field9747;
        class55 var5 = this.field9733.method3647(arg2, arg0, false, -1, 131072);
        if (var5 == null) {
            return false;
        } else {
            class393 var6 = arg2.method339();
            var6.method503(super.field3027 + super.field9696, super.field9701, super.field3024 + super.field9705);
            return class534.field7778 ? var5.method598(arg3, arg1, var6, false, class609.field8652) : var5.method648(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Z", line = 107)
    public final boolean method395(int arg0) {
        if (arg0 != -29400) {
            return false;
        } else {
            ++field9748;
            return this.field9733.method3657((byte) -106);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILr;)V", line = 119)
    public final void method396(int arg0, class167 arg1) {
        if (arg0 == -32646) {
            ++field9737;
            this.field9733.method3652((byte) 71, arg1);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lr;I)V", line = 131)
    public final void method407(class167 arg0, int arg1) {
        ++field9749;
        this.field9733.method3648((byte) -87, arg0);
        int var3 = -105 / ((arg1 - -10) / 40);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLr;)Lll;", line = 141)
    public final class334 method408(byte arg0, class167 arg1) {
        if (arg0 != 111) {
            return null;
        } else {
            ++field9740;
            return this.field9745;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)I", line = 152)
    public final int method401(byte arg0) {
        if (arg0 < 50) {
            this.method392(false, 113, (class167) null, -100);
        }
        ++field9750;
        return this.field9733.field8837;
    }

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)Z", line = 164)
    public final boolean method414(int arg0) {
        ++field9751;
        if (arg0 != 0) {
            field9753 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V", line = 179)
    public static final void method3924(boolean arg0) {
        if (!arg0) {
            method3926(-79, -66, -116);
        }
        ++field9734;
        ++class66.field846;
        class165 var1 = class271.method1917(class420.field6424, (byte) -76, class23.field368);
        var1.field2776.method65(class33.method452(2), -77);
        var1.field2776.method25(arg0, class56.field732);
        var1.field2776.method25(arg0, class259.field4147);
        var1.field2776.method65(class17.field282.field4846, -77);
        class642.method3726(-684096285, var1);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)I", line = 199)
    public final int method413(byte arg0) {
        if (arg0 != 11) {
            this.method393(-89);
        }
        ++field9744;
        return this.field9733.field8846;
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)I", line = 211)
    public final int method393(int arg0) {
        if (arg0 != 0) {
            this.method414(-124);
        }
        ++field9743;
        return this.field9733.method3654(-104);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I", line = 222)
    public final int method394(byte arg0) {
        int var2 = -124 % ((-14 - arg0) / 51);
        ++field9742;
        return this.field9733.field8854;
    }

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "(I)V", line = 238)
    public static void method3925(int arg0) {
        if (arg0 == 0) {
            field9753 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V", line = 250)
    public final void method409(int arg0) {
        if (arg0 == -7728) {
            ++field9735;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z", line = 261)
    public static final boolean method3926(int arg0, int arg1, int arg2) {
        ++field9741;
        if (arg1 != 0) {
            field9753 = null;
        }
        return (arg0 & 2048) != 0 && ~(arg2 & 55) != -1;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lr;Z)V", line = 272)
    public final void method412(class167 arg0, boolean arg1) {
        ++field9752;
        class55 var3 = this.field9733.method3647(arg0, arg1, true, -1, 262144);
        if (var3 != null) {
            int var4 = super.field9696 >> 9;
            int var5 = super.field9705 >> 9;
            class393 var6 = arg0.method339();
            var6.method503(super.field9696, super.field9701, super.field9705);
            this.field9733.method3646(var3, var4, var5, var5, false, arg0, var4, (byte) -99, var6);
        }
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(B)I", line = 294)
    public final int method406(byte arg0) {
        if (arg0 < 108) {
            this.method395(32);
        }
        ++field9754;
        return this.field9733.method3651(30556);
    }
}
