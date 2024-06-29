import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class465 extends class271 implements class599 {

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "Z")
    private boolean field6104;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "Z")
    private boolean field6112;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "S")
    private short field6107;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "Z")
    private boolean field6106;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "B")
    private byte field6105;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "Z")
    private boolean field6110;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "Lha;")
    private class117 field6091;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "Lda;")
    private class470 field6098;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "Ltt;")
    public static class338 field6087 = new class338(56, 3);

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "Lcu;")
    private class475 field6086;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)I")
    public final int method176(byte arg0) {
        if (arg0 > -114) {
            return 32;
        } else {
            ++field6088;
            return this.field6098 == null ? 0 : this.field6098.method613();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public final void method703(int arg0) {
        if (arg0 == 6956) {
            ++field6097;
            if (this.field6098 != null) {
                this.field6098.method634();
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "(I)Z")
    public final boolean method168(int arg0) {
        ++field6102;
        if (arg0 != 20071) {
            return false;
        } else {
            return this.field6098 != null ? this.field6098.method657() : false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lr;Ltc;IIIIIZIZ)V")
    public class465(class562 arg0, class600 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field8289);
        this.field6104 = arg7;
        this.field6112 = arg9;
        super.field398 = arg4;
        super.field397 = arg6;
        this.field6107 = (short) arg1.field8345;
        this.field6106 = arg1.field8293 != 0 && !arg7;
        this.field6105 = (byte) arg8;
        this.field6110 = arg0.method1084() && arg1.field8305 && !this.field6104 && ~class602.field8408.method1870((byte) -113, class618.field8566) != -1;
        int var11 = 2048;
        if (this.field6112) {
            var11 |= 65536;
        }
        class606 var12 = this.method2590(arg0, this.field6110, -14575, var11);
        if (var12 != null) {
            this.field6091 = var12.field8446;
            this.field6098 = var12.field8448;
            if (this.field6112) {
                this.field6098 = this.field6098.method649((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)I")
    public final int method699(byte arg0) {
        ++field6095;
        return arg0 > -32 ? 79 : 22;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lr;ZII)Lht;")
    private final class606 method2590(class562 arg0, boolean arg1, int arg2, int arg3) {
        ++field6115;
        class600 var5 = class118.field1510.method3921(this.field6107 & 65535, -73);
        if (arg2 != -14575) {
            this.method707((class562) null, (byte) 62);
        }
        class270 var6;
        class270 var7;
        if (this.field6104) {
            var6 = class446.field5914[super.field386];
            var7 = class454.field5981[0];
        } else {
            if (super.field386 >= 3) {
                var7 = null;
            } else {
                var7 = class454.field5981[super.field386 + 1];
            }
            var6 = class454.field5981[super.field386];
        }
        return var5.method3321(super.field388, this.field6105, arg1, arg0, super.field397, false, super.field398, arg3, 22, var7, var6);
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)Z")
    public final boolean method161(int arg0) {
        ++field6114;
        return arg0 == 28602;
    }

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "(I)I")
    public final int method173(int arg0) {
        if (arg0 != 0) {
            this.field6112 = true;
        }
        ++field6113;
        return this.field6098 == null ? 0 : this.field6098.method621();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I")
    public final int method710(byte arg0) {
        ++field6116;
        if (arg0 <= 55) {
            field6087 = null;
        }
        return 65535 & this.field6107;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lr;I)Lcu;")
    public final class475 method174(class562 arg0, int arg1) {
        ++field6111;
        if (arg1 != -14700) {
            return null;
        } else {
            if (this.field6086 == null) {
                this.field6086 = class258.method1562(super.field398, (byte) -47, super.field397, this.method2593(arg0, 0, false), super.field388);
            }
            return this.field6086;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLr;II)Z")
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        ++field6109;
        class470 var5 = this.method2593(arg1, 131072, arg0);
        if (var5 != null) {
            class487 var6 = arg1.method1153();
            var6.method359(super.field398, super.field388, super.field397);
            return !class347.field4632 ? var5.method655(arg3, arg2, var6, false) : var5.method603(arg3, arg2, var6, false, class414.field5430);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lr;I)V")
    public final void method700(class562 arg0, int arg1) {
        ++field6100;
        Object var3 = null;
        if (arg1 == -21186) {
            class117 var5;
            if (this.field6091 == null && this.field6110) {
                class606 var4 = this.method2590(arg0, true, -14575, 262144);
                var5 = var4 != null ? var4.field8446 : null;
            } else {
                var5 = this.field6091;
                this.field6091 = null;
            }
            if (var5 != null) {
                class201.method1287(var5, super.field386, super.field398, super.field397, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lr;B)V")
    public final void method707(class562 arg0, byte arg1) {
        ++field6117;
        Object var3 = null;
        int var4 = -48 / ((arg1 - -28) / 54);
        class117 var6;
        if (this.field6091 == null && this.field6110) {
            class606 var5 = this.method2590(arg0, true, -14575, 262144);
            var6 = var5 != null ? var5.field8446 : null;
        } else {
            var6 = this.field6091;
            this.field6091 = null;
        }
        if (var6 != null) {
            class614.method3395(var6, super.field386, super.field398, super.field397, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public final void method175(byte arg0) {
        if (arg0 > 24) {
            ++field6099;
            this.field6112 = false;
            if (this.field6098 != null) {
                this.field6098.method602(this.field6098.method604() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field6101;
        return arg0 != 0 ? true : this.field6112;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Z")
    public final boolean method705(int arg0) {
        if (arg0 < 67) {
            this.field6107 = 53;
        }
        ++field6090;
        return this.field6110;
    }

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "(I)V")
    public static void method2591(int arg0) {
        if (arg0 != -10970) {
            field6087 = null;
        }
        field6087 = null;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)Z")
    public static final boolean method2592(byte arg0) {
        ++field6093;
        if (class480.field6682) {
            try {
                if ((Boolean) class507.method2883(class516.field7178, -4200, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 > -126) {
            method2591(-35);
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLr;)Lqw;")
    public final class329 method165(byte arg0, class562 arg1) {
        ++field6103;
        if (this.field6098 == null) {
            return null;
        } else {
            class487 var3 = arg1.method1153();
            var3.method359(super.field398, super.field388, super.field397);
            class329 var4 = null;
            if (arg0 < 109) {
                return null;
            } else {
                if (this.field6106) {
                    var4 = class541.method3035(27479, 1);
                }
                if (class347.field4632) {
                    this.field6098.method648(var3, var4 == null ? null : var4.field4414[0], class414.field5430, 0);
                } else {
                    this.field6098.method625(var3, var4 != null ? var4.field4414[0] : null, 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILir;ZILr;IB)V")
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        if (arg1 instanceof class465) {
            class465 var8 = (class465) arg1;
            if (this.field6098 != null && var8.field6098 != null) {
                this.field6098.method617(var8.field6098, arg5, arg3, arg0, arg2);
            }
        }
        ++field6092;
        if (arg6 >= -117) {
            this.field6110 = true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)I")
    public final int method706(int arg0) {
        ++field6108;
        return arg0 != 16259 ? 9 : this.field6105;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lr;Z)V")
    public final void method177(class562 arg0, boolean arg1) {
        if (!arg1) {
            this.method167(true, (class562) null, 80, -24);
        }
        ++field6094;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lr;IZ)Lda;")
    private final class470 method2593(class562 arg0, int arg1, boolean arg2) {
        ++field6096;
        if (this.field6098 != null && ~arg0.method1053(this.field6098.method604(), arg1) == -1) {
            return this.field6098;
        } else {
            class606 var4 = this.method2590(arg0, arg2, -14575, arg1);
            return var4 != null ? var4.field8448 : null;
        }
    }
}
