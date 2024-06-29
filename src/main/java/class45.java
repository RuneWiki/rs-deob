import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class45 extends class665 implements class721 {

    @OriginalMember(owner = "client!gs", name = "Z", descriptor = "Z")
    private boolean field495;

    @OriginalMember(owner = "client!gs", name = "fb", descriptor = "Z")
    private boolean field501;

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "S")
    private short field486;

    @OriginalMember(owner = "client!gs", name = "V", descriptor = "B")
    private byte field491;

    @OriginalMember(owner = "client!gs", name = "S", descriptor = "B")
    private byte field488;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "Z")
    private boolean field481;

    @OriginalMember(owner = "client!gs", name = "ib", descriptor = "Lka;")
    private class473 field504;

    @OriginalMember(owner = "client!gs", name = "cb", descriptor = "Lr;")
    private class183 field498;

    @OriginalMember(owner = "client!gs", name = "eb", descriptor = "Lio;")
    public static class439 field500 = new class439(9, 2);

    @OriginalMember(owner = "client!gs", name = "pb", descriptor = "I")
    public static int field511 = 0;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!gs", name = "U", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!gs", name = "W", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!gs", name = "X", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!gs", name = "Y", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!gs", name = "ab", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!gs", name = "bb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!gs", name = "db", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!gs", name = "gb", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!gs", name = "jb", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!gs", name = "kb", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!gs", name = "lb", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!gs", name = "mb", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!gs", name = "nb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!gs", name = "ob", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!gs", name = "qb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!gs", name = "hb", descriptor = "Lria;")
    private class286 field503;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(B)I")
    public final int method309(byte arg0) {
        if (arg0 > -16) {
            return 30;
        } else {
            ++field510;
            return this.field491;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lha;B)V")
    public final void method310(class60 arg0, byte arg1) {
        if (arg1 == -88) {
            ++field490;
            Object var3 = null;
            class183 var5;
            if (this.field498 == null && this.field481) {
                class77 var4 = this.method324(arg0, 262144, 65, true);
                var5 = var4 != null ? var4.field1067 : null;
            } else {
                var5 = this.field498;
                this.field498 = null;
            }
            if (var5 != null) {
                class58.method405(var5, super.field8417, super.field8423, super.field8428, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLha;)V")
    public static final void method311(byte arg0, class60 arg1) {
        ++field497;
        if (arg0 > -67) {
            field511 = -18;
        }
        if (class569.field8064.method1196(-2) != 0) {
            if (~class63.field916.field10200.method3848(17503) != -1) {
                if (class201.field3012 == null) {
                    Canvas var2 = new Canvas();
                    var2.setSize(36, 32);
                    class201.field3012 = class282.method1804(class492.field7019, var2, class409.field6166, 0, 0, -98);
                    class145.field1937 = class201.field3012.method474(class649.method3771(0, class338.field4915, class567.field8053, 6), class129.method920(class640.field8990, class567.field8053, 0), true);
                }
                for (class252 var3 = (class252) class569.field8064.method1195(0); var3 != null; var3 = (class252) class569.field8064.method1201(2)) {
                    class336.field4876.method2086(var3.field3632, !var3.field3634 ? null : class130.field1749.field9495, 32, var3.field3638, class145.field1937, var3.field3629, false, class201.field3012, arg1, var3.field3630, var3.field3636, false);
                    var3.method1304((byte) 7);
                }
            } else {
                for (class252 var4 = (class252) class569.field8064.method1195(0); var4 != null; var4 = (class252) class569.field8064.method1201(2)) {
                    class336.field4876.method2086(var4.field3632, !var4.field3634 ? null : class130.field1749.field9495, 32, var4.field3638, class427.field6332, var4.field3629, false, arg1, arg1, var4.field3630, var4.field3636, false);
                    var4.method1304((byte) 7);
                }
                class459.method2805(118);
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IBLha;I)Z")
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        ++field496;
        class473 var5 = this.method326(-126, arg2, 131072);
        if (arg1 > -44) {
            return false;
        } else if (var5 != null) {
            class738 var6 = arg2.method442();
            var6.method774(super.field8423, super.field8421, super.field8428);
            return !class418.field6258 ? var5.method277(arg0, arg3, var6, false, 0) : var5.method283(arg0, arg3, var6, false, 0, class188.field2859);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "(B)I")
    public final int method313(byte arg0) {
        ++field508;
        if (arg0 != 3) {
            this.field495 = false;
        }
        return this.field504 != null ? this.field504.method269() : 0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lha;Z)V")
    public final void method314(class60 arg0, boolean arg1) {
        ++field483;
        if (arg1) {
            this.method315((byte) 114);
        }
    }

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "(B)I")
    public final int method315(byte arg0) {
        if (arg0 != 106) {
            return 91;
        } else {
            ++field512;
            return this.field504 == null ? 0 : this.field504.method253();
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
    public final void method316(byte arg0) {
        ++field509;
        if (this.field504 != null) {
            this.field504.method272();
        }
        if (arg0 != -66) {
            this.field481 = true;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)I")
    public final int method317(int arg0) {
        if (arg0 < 112) {
            return -126;
        } else {
            ++field499;
            return 65535 & this.field486;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILha;)V")
    public final void method318(int arg0, class60 arg1) {
        ++field502;
        Object var3 = null;
        int var4 = 31 / ((8 - arg0) / 57);
        class183 var6;
        if (this.field498 == null && this.field481) {
            class77 var5 = this.method324(arg1, 262144, 93, true);
            var6 = var5 != null ? var5.field1067 : null;
        } else {
            var6 = this.field498;
            this.field498 = null;
        }
        if (var6 != null) {
            class467.method2833(var6, super.field8417, super.field8423, super.field8428, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Lha;B)Lc;")
    public final class187 method319(class60 arg0, byte arg1) {
        ++field506;
        if (this.field504 == null) {
            return null;
        } else {
            class738 var3 = arg0.method442();
            int var4 = 88 / ((-25 - arg1) / 60);
            var3.method774(super.field9348 + super.field8423, super.field8421, super.field8428 - -super.field9345);
            class187 var5 = class650.method3774(105, this.field501, 1);
            if (!class418.field6258) {
                this.field504.method265(var3, var5.field2851[0], 0);
            } else {
                this.field504.method235(var3, var5.field2851[0], class188.field2859, 0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "(B)Z")
    public final boolean method320(byte arg0) {
        if (arg0 != 84) {
            return true;
        } else {
            ++field507;
            if (this.field504 != null) {
                return !this.field504.method262();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)Z")
    public final boolean method321(byte arg0) {
        ++field494;
        if (arg0 > -125) {
            this.method324((class60) null, -91, -6, false);
        }
        return this.field481;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lha;Lsu;IIIIIZIIII)V")
    public class45(class60 arg0, class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field8423 = arg4;
        super.field8428 = arg6;
        this.field495 = arg7;
        this.field501 = ~arg1.field3113 != -1 && !arg7;
        this.field486 = (short) arg1.field3158;
        this.field491 = (byte) arg10;
        this.field488 = (byte) arg11;
        this.field481 = arg0.method456() && arg1.field3175 && !this.field495 && ~class63.field916.field10185.method2160(17503) != -1;
        class77 var13 = this.method324(arg0, 2048, 95, this.field481);
        if (var13 != null) {
            this.field504 = var13.field1068;
            this.field498 = var13.field1067;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILvt;)I")
    public static final int method322(int arg0, class304 arg1) {
        if (arg0 != -3) {
            method311((byte) 116, (class60) null);
        }
        ++field489;
        int var2 = arg1.method1914(11356, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (~var2 == -2) {
            var3 = arg1.method1914(11356, 5);
        } else if (~var2 == -3) {
            var3 = arg1.method1914(11356, 8);
        } else {
            var3 = arg1.method1914(11356, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILrg;)Lkn;")
    public static final class742 method323(int arg0, class645 arg1) {
        ++field505;
        int var2 = -66 % ((-62 - arg0) / 42);
        int var3 = arg1.method3720(-19541);
        return new class742(var3);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lha;IIZ)Lqw;")
    private final class77 method324(class60 arg0, int arg1, int arg2, boolean arg3) {
        ++field492;
        class211 var5 = class239.field3470.method388(this.field486 & 65535, 100);
        if (arg2 < 64) {
            return null;
        } else {
            class280 var6;
            class280 var7;
            if (!this.field495) {
                var6 = class531.field7566[super.field8417];
                if (~super.field8417 > -4) {
                    var7 = class531.field7566[super.field8417 - -1];
                } else {
                    var7 = null;
                }
            } else {
                var7 = class531.field7566[0];
                var6 = class46.field568[super.field8417];
            }
            return var5.method1443((byte) 123, arg3, var7, this.field488, super.field8421, arg1, (class572) null, this.field491, arg0, super.field8423, super.field8428, var6);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lha;I)Lria;")
    public final class286 method325(class60 arg0, int arg1) {
        if (arg1 != 92160000) {
            this.field503 = null;
        }
        ++field485;
        if (this.field503 == null) {
            this.field503 = class60.method527(this.method326(-119, arg0, 0), super.field8428, super.field8423, super.field8421, -22060);
        }
        return this.field503;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILha;I)Lka;")
    private final class473 method326(int arg0, class60 arg1, int arg2) {
        ++field487;
        if (this.field504 != null && ~arg1.method491(this.field504.method255(), arg2) == -1) {
            return this.field504;
        } else {
            if (arg0 > -114) {
                this.method318(115, (class60) null);
            }
            class77 var4 = this.method324(arg1, arg2, 88, false);
            return var4 != null ? var4.field1068 : null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)I")
    public final int method327(int arg0) {
        ++field493;
        return arg0 >= -116 ? 60 : this.field488;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lha;IB)Lhia;")
    public static final class66 method328(class60 arg0, int arg1, byte arg2) {
        ++field482;
        if (arg2 != 69) {
            field500 = null;
        }
        class451 var3 = class332.method2097(arg1, true, 31236, arg0);
        return var3 == null ? null : var3.field6665;
    }

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "(B)Z")
    public final boolean method329(byte arg0) {
        int var2 = 77 / ((arg0 - -33) / 42);
        ++field484;
        return this.field504 != null ? this.field504.method275() : false;
    }

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)V")
    public static void method330(int arg0) {
        field500 = null;
        if (arg0 != 6302) {
            field500 = null;
        }
    }
}
