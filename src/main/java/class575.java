import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class575 extends class458 implements class706 {

    @OriginalMember(owner = "client!fia", name = "R", descriptor = "Z")
    private boolean field8117;

    @OriginalMember(owner = "client!fia", name = "ob", descriptor = "B")
    private byte field8140;

    @OriginalMember(owner = "client!fia", name = "cb", descriptor = "S")
    private short field8128;

    @OriginalMember(owner = "client!fia", name = "ab", descriptor = "B")
    private byte field8126;

    @OriginalMember(owner = "client!fia", name = "S", descriptor = "Z")
    private boolean field8118;

    @OriginalMember(owner = "client!fia", name = "hb", descriptor = "Z")
    private boolean field8133;

    @OriginalMember(owner = "client!fia", name = "M", descriptor = "Lka;")
    private class471 field8113;

    @OriginalMember(owner = "client!fia", name = "Y", descriptor = "Lr;")
    private class180 field8124;

    @OriginalMember(owner = "client!fia", name = "jb", descriptor = "Lbd;")
    public static class60 field8135 = new class60(3, 5);

    @OriginalMember(owner = "client!fia", name = "O", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!fia", name = "P", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!fia", name = "T", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!fia", name = "U", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!fia", name = "V", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!fia", name = "W", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!fia", name = "X", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!fia", name = "Z", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!fia", name = "bb", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!fia", name = "db", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!fia", name = "eb", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!fia", name = "fb", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!fia", name = "gb", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!fia", name = "ib", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!fia", name = "kb", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!fia", name = "lb", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!fia", name = "mb", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!fia", name = "nb", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!fia", name = "N", descriptor = "Lkj;")
    private class566 field8114;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)I")
    public final int method865(int arg0) {
        ++field8136;
        if (arg0 != 30374) {
            this.method864((class58) null, (byte) -66);
        }
        return this.field8140;
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lha;Lhba;IIIIIZIIII)V")
    public class575(class58 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field1250 = arg6;
        this.field8117 = ~arg1.field207 != -1 && !arg7;
        this.field8140 = (byte) arg11;
        super.field1264 = arg4;
        this.field8128 = (short) arg1.field236;
        this.field8126 = (byte) arg10;
        this.field8118 = arg7;
        this.field8133 = arg0.method487() && arg1.field177 && !this.field8118 && class557.field7812.field6542.method1222(false) != 0;
        class102 var13 = this.method3289(arg0, this.field8133, 2048, (byte) 71);
        if (var13 != null) {
            this.field8113 = var13.field1213;
            this.field8124 = var13.field1214;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(ILha;)Lkj;")
    public final class566 method744(int arg0, class58 arg1) {
        if (arg0 != 0) {
            method3291(false);
        }
        ++field8139;
        if (this.field8114 == null) {
            this.field8114 = class654.method3596(super.field1255, this.method3290(arg1, 9757, 0), super.field1264, super.field1250, (byte) 14);
        }
        return this.field8114;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)Z")
    public final boolean method867(byte arg0) {
        ++field8134;
        return arg0 <= 82 ? false : this.field8133;
    }

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "(B)I")
    public static final int method3288(byte arg0) {
        ++field8115;
        if (arg0 >= -100) {
            field8135 = null;
        }
        return ~class221.field2883 == -2 ? class155.field2166 : 0;
    }

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "(I)I")
    public final int method749(int arg0) {
        ++field8122;
        if (arg0 != 32767) {
            return 42;
        } else {
            return this.field8113 != null ? this.field8113.method253() : 0;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lha;ZIB)Lqha;")
    private final class102 method3289(class58 arg0, boolean arg1, int arg2, byte arg3) {
        ++field8131;
        if (arg3 != 71) {
            method3288((byte) 55);
        }
        class10 var5 = class612.field8588.method558((byte) 35, this.field8128 & 65535);
        class278 var6;
        class278 var7;
        if (this.field8118) {
            var6 = class588.field8292[0];
            var7 = class135.field1969[super.field1258];
        } else {
            if (super.field1258 >= 3) {
                var6 = null;
            } else {
                var6 = class588.field8292[super.field1258 + 1];
            }
            var7 = class588.field8292[super.field1258];
        }
        return var5.method71(arg3 ^ -26, super.field1255, var7, var6, arg1, this.field8140, super.field1264, super.field1250, arg0, arg2, this.field8126);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        if (arg0) {
            this.method3290((class58) null, -48, 20);
        }
        ++field8119;
        return this.field8113 == null ? false : this.field8113.method224();
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(BLha;)Lml;")
    public final class387 method755(byte arg0, class58 arg1) {
        ++field8120;
        if (this.field8113 == null) {
            return null;
        } else {
            if (arg0 != -127) {
                this.method3290((class58) null, 88, 108);
            }
            class513 var3 = arg1.method439();
            var3.method339(super.field6453 + super.field1264, super.field1255, super.field6458 + super.field1250);
            class387 var4 = class65.method544(this.field8117, 1, 24824);
            if (!class180.field2409) {
                this.field8113.method221(var3, var4.field5482[0], 0);
            } else {
                this.field8113.method262(var3, var4.field5482[0], class516.field7361, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(BLha;)V")
    public final void method753(byte arg0, class58 arg1) {
        ++field8132;
        int var3 = 27 / ((18 - arg0) / 40);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lha;II)Lka;")
    private final class471 method3290(class58 arg0, int arg1, int arg2) {
        ++field8125;
        if (arg1 != 9757) {
            this.method746(-43);
        }
        if (this.field8113 != null && ~arg0.method466(this.field8113.method228(), arg2) == -1) {
            return this.field8113;
        } else {
            class102 var4 = this.method3289(arg0, false, arg2, (byte) 71);
            return var4 == null ? null : var4.field1213;
        }
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(B)I")
    public final int method861(byte arg0) {
        if (arg0 != -17) {
            this.method755((byte) 74, (class58) null);
        }
        ++field8123;
        return 65535 & this.field8128;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILha;)V")
    public final void method860(int arg0, class58 arg1) {
        ++field8130;
        Object var3 = null;
        class180 var5;
        if (this.field8124 == null && this.field8133) {
            class102 var4 = this.method3289(arg1, true, 262144, (byte) 71);
            var5 = var4 == null ? null : var4.field1214;
        } else {
            var5 = this.field8124;
            this.field8124 = null;
        }
        if (var5 != null) {
            class583.method3312(var5, super.field1258, super.field1264, super.field1250, (boolean[]) null);
        }
        if (arg0 <= 15) {
            this.method753((byte) 125, (class58) null);
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(B)I")
    public final int method868(byte arg0) {
        if (arg0 != -10) {
            return 78;
        } else {
            ++field8116;
            return this.field8126;
        }
    }

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "(B)I")
    public final int method750(byte arg0) {
        if (arg0 != 14) {
            this.field8133 = false;
        }
        ++field8121;
        return this.field8113 == null ? 0 : this.field8113.method218();
    }

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "(I)Z")
    public final boolean method746(int arg0) {
        if (arg0 > -106) {
            this.field8113 = null;
        }
        ++field8138;
        if (this.field8113 == null) {
            return true;
        } else {
            return !this.field8113.method243();
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        ++field8137;
        class471 var5 = this.method3290(arg0, 9757, 131072);
        if (var5 != null) {
            class513 var6 = arg0.method439();
            var6.method339(super.field1264, super.field1255, super.field1250);
            return class180.field2409 ? var5.method229(arg3, arg2, var6, false, 0, class516.field7361) : var5.method233(arg3, arg2, var6, false, 0);
        } else {
            return arg1 != 0;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lha;B)V")
    public final void method864(class58 arg0, byte arg1) {
        if (arg1 != -73) {
            this.method752((class58) null, 116, -70, -29);
        }
        ++field8129;
        Object var3 = null;
        class180 var5;
        if (this.field8124 == null && this.field8133) {
            class102 var4 = this.method3289(arg0, true, 262144, (byte) 71);
            var5 = var4 == null ? null : var4.field1214;
        } else {
            var5 = this.field8124;
            this.field8124 = null;
        }
        if (var5 != null) {
            class412.method2537(var5, super.field1258, super.field1264, super.field1250, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(Z)V")
    public static void method3291(boolean arg0) {
        field8135 = null;
        if (!arg0) {
            field8135 = null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "(B)V")
    public final void method866(byte arg0) {
        if (arg0 != -62) {
            this.field8133 = false;
        }
        ++field8127;
        if (this.field8113 != null) {
            this.field8113.method230();
        }
    }
}
