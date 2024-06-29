import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class417 extends class524 implements class706 {

    @OriginalMember(owner = "client!nv", name = "ab", descriptor = "B")
    private byte field5883;

    @OriginalMember(owner = "client!nv", name = "fb", descriptor = "Z")
    private boolean field5888;

    @OriginalMember(owner = "client!nv", name = "V", descriptor = "Z")
    private boolean field5878;

    @OriginalMember(owner = "client!nv", name = "gb", descriptor = "Z")
    private boolean field5889;

    @OriginalMember(owner = "client!nv", name = "ob", descriptor = "S")
    private short field5897;

    @OriginalMember(owner = "client!nv", name = "db", descriptor = "B")
    private byte field5886;

    @OriginalMember(owner = "client!nv", name = "nb", descriptor = "Z")
    private boolean field5896;

    @OriginalMember(owner = "client!nv", name = "Z", descriptor = "Lka;")
    public class471 field5882;

    @OriginalMember(owner = "client!nv", name = "X", descriptor = "Lr;")
    private class180 field5880;

    @OriginalMember(owner = "client!nv", name = "qb", descriptor = "Lkk;")
    public static class188 field5899 = new class188(16);

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!nv", name = "Q", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!nv", name = "R", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!nv", name = "S", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!nv", name = "U", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!nv", name = "W", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!nv", name = "Y", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!nv", name = "bb", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!nv", name = "cb", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!nv", name = "eb", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!nv", name = "hb", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!nv", name = "ib", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!nv", name = "jb", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!nv", name = "kb", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!nv", name = "mb", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!nv", name = "pb", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!nv", name = "rb", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!nv", name = "sb", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!nv", name = "tb", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!nv", name = "T", descriptor = "Lkj;")
    private class566 field5876;

    @OriginalMember(owner = "client!nv", name = "lb", descriptor = "[I")
    public static int[] field5894;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lha;III)Z", line = 4)
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        ++field5877;
        if (arg1 != 0) {
            this.field5897 = -68;
        }
        class471 var5 = this.method2562(131072, arg0, arg1 + -1);
        if (var5 != null) {
            class513 var6 = arg0.method439();
            var6.method339(super.field1264, super.field1255, super.field1250);
            return !class180.field2409 ? var5.method233(arg3, arg2, var6, false, 0) : var5.method229(arg3, arg2, var6, false, 0, class516.field7361);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I", line = 26)
    public final int method865(int arg0) {
        if (arg0 != 30374) {
            this.method2560(94);
        }
        ++field5870;
        return this.field5886;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLha;)V", line = 38)
    public final void method753(byte arg0, class58 arg1) {
        ++field5900;
        int var3 = 59 / ((18 - arg0) / 40);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(ILha;)Lkj;", line = 56)
    public final class566 method744(int arg0, class58 arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field5885;
            if (this.field5876 == null) {
                this.field5876 = class654.method3596(super.field1255, this.method2562(0, arg1, -1), super.field1264, super.field1250, (byte) 14);
            }
            return this.field5876;
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)V", line = 72)
    public final void method866(byte arg0) {
        ++field5879;
        if (arg0 == -62) {
            if (this.field5882 != null) {
                this.field5882.method230();
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "(I)I", line = 87)
    public final int method2560(int arg0) {
        int var2 = -33 % ((69 - arg0) / 56);
        ++field5892;
        return this.field5882 != null ? this.field5882.method266() / 4 : 15;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLha;IILkba;II)V", line = 97)
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        if (arg5 != 22501) {
            this.field5876 = null;
        }
        if (!(arg4 instanceof class557)) {
            if (arg4 instanceof class417) {
                class417 var8 = (class417) arg4;
                if (this.field5882 != null && var8.field5882 != null) {
                    this.field5882.method237(var8.field5882, arg6, arg2, arg3, arg0);
                }
            }
        } else {
            class557 var9 = (class557) arg4;
            if (this.field5882 != null && var9.field7821 != null) {
                this.field5882.method237(var9.field7821, arg6, arg2, arg3, arg0);
            }
        }
        ++field5890;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lha;B)V", line = 126)
    public final void method864(class58 arg0, byte arg1) {
        if (arg1 != -73) {
            this.field5886 = -100;
        }
        ++field5898;
        Object var3 = null;
        class180 var5;
        if (this.field5880 == null && this.field5896) {
            class102 var4 = this.method2563(262144, true, arg0, (byte) -121);
            var5 = var4 == null ? null : var4.field1214;
        } else {
            var5 = this.field5880;
            this.field5880 = null;
        }
        if (var5 != null) {
            class412.method2537(var5, super.field1258, super.field1264, super.field1250, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)I", line = 156)
    public final int method868(byte arg0) {
        if (arg0 != -10) {
            this.method755((byte) 121, (class58) null);
        }
        ++field5873;
        return this.field5883;
    }

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "(I)V", line = 170)
    public static void method2561(int arg0) {
        field5899 = null;
        field5894 = null;
        if (arg0 < 71) {
            method2561(4);
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)I", line = 182)
    public final int method861(byte arg0) {
        if (arg0 != -17) {
            this.method744(84, (class58) null);
        }
        ++field5895;
        return this.field5897 & 65535;
    }

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "(I)V", line = 197)
    public final void method614(int arg0) {
        ++field5902;
        if (arg0 != 26062) {
            this.method614(-16);
        }
        this.field5889 = false;
        if (this.field5882 != null) {
            this.field5882.method242(-65537 & this.field5882.method228());
        }
    }

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "(I)I", line = 212)
    public final int method749(int arg0) {
        ++field5891;
        if (arg0 != 32767) {
            return -78;
        } else {
            return this.field5882 == null ? 0 : this.field5882.method253();
        }
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)Z", line = 224)
    public final boolean method746(int arg0) {
        ++field5884;
        if (this.field5882 != null) {
            return !this.field5882.method243();
        } else {
            if (arg0 > -106) {
                field5899 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)Z", line = 242)
    public final boolean method867(byte arg0) {
        ++field5893;
        if (arg0 < 82) {
            this.method615(false, (class58) null, -2, -91, (class105) null, -5, -47);
        }
        return this.field5896;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILha;I)Lka;", line = 253)
    private final class471 method2562(int arg0, class58 arg1, int arg2) {
        ++field5901;
        if (this.field5882 != null && ~arg1.method466(this.field5882.method228(), arg0) == -1) {
            return this.field5882;
        } else if (arg2 != -1) {
            return null;
        } else {
            class102 var4 = this.method2563(arg0, false, arg1, (byte) -89);
            return var4 == null ? null : var4.field1213;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)Z", line = 273)
    public final boolean method751(boolean arg0) {
        ++field5881;
        if (arg0) {
            return true;
        } else {
            return this.field5882 != null ? this.field5882.method224() : false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(BLha;)Lml;", line = 289)
    public final class387 method755(byte arg0, class58 arg1) {
        ++field5872;
        if (this.field5882 == null) {
            return null;
        } else {
            class513 var3 = arg1.method439();
            var3.method339(super.field1264, super.field1255, super.field1250);
            if (arg0 != -127) {
                this.method753((byte) -1, (class58) null);
            }
            class387 var4 = class65.method544(this.field5888, 1, arg0 ^ -24711);
            if (class180.field2409) {
                this.field5882.method262(var3, var4.field5482[0], class516.field7361, 0);
            } else {
                this.field5882.method221(var3, var4.field5482[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(B)I", line = 318)
    public final int method750(byte arg0) {
        if (arg0 != 14) {
            this.field5897 = -8;
        }
        ++field5871;
        return this.field5882 == null ? 0 : this.field5882.method218();
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lha;Lhba;IIIIIZIIIIIIZ)V", line = 333)
    public class417(class58 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field203 == 1, class238.method1525((byte) -32, arg12, arg13));
        super.field1258 = (byte) arg3;
        this.field5883 = (byte) arg12;
        this.field5888 = ~arg1.field207 != -1 && !arg7;
        this.field5878 = arg7;
        this.field5889 = arg14;
        this.field5897 = (short) arg1.field236;
        this.field5886 = (byte) arg13;
        this.field5896 = arg0.method487() && arg1.field177 && !this.field5878 && ~class557.field7812.field6542.method1222(false) != -1;
        int var16 = 2048;
        if (this.field5889) {
            var16 |= 65536;
        }
        class102 var17 = this.method2563(var16, this.field5896, arg0, (byte) 45);
        if (var17 != null) {
            this.field5882 = var17.field1213;
            this.field5880 = var17.field1214;
            if (this.field5889) {
                this.field5882 = this.field5882.method226((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILha;)V", line = 366)
    public final void method860(int arg0, class58 arg1) {
        ++field5875;
        Object var3 = null;
        if (arg0 > 15) {
            class180 var5;
            if (this.field5880 == null && this.field5896) {
                class102 var4 = this.method2563(262144, true, arg1, (byte) 52);
                var5 = var4 == null ? null : var4.field1214;
            } else {
                var5 = this.field5880;
                this.field5880 = null;
            }
            if (var5 != null) {
                class583.method3312(var5, super.field1258, super.field1264, super.field1250, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z", line = 394)
    public final boolean method621(int arg0) {
        if (arg0 > -103) {
            this.field5889 = false;
        }
        ++field5874;
        return this.field5889;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZLha;B)Lqha;", line = 406)
    private final class102 method2563(int arg0, boolean arg1, class58 arg2, byte arg3) {
        ++field5887;
        class10 var5 = class612.field8588.method558((byte) 111, 65535 & this.field5897);
        int var6 = -118 % ((-25 - arg3) / 61);
        class278 var7;
        class278 var8;
        if (this.field5878) {
            var7 = class588.field8292[0];
            var8 = class135.field1969[super.field1258];
        } else {
            if (super.field1258 >= 3) {
                var7 = null;
            } else {
                var7 = class588.field8292[super.field1258 - -1];
            }
            var8 = class588.field8292[super.field1258];
        }
        return var5.method71(-65, super.field1255, var8, var7, arg1, this.field5883 != 11 ? this.field5886 : this.field5886 + 4, super.field1264, super.field1250, arg2, arg0, this.field5883 == 11 ? 10 : this.field5883);
    }
}
