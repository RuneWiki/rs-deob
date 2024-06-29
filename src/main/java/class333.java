import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class333 {

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "Lkd;")
    public class263 field4121 = new class263();

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "Lkd;")
    private class263 field4126;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Lkd;", line = 3)
    public final class263 method1903(byte arg0) {
        field4118++;
        if (arg0 <= 19) {
            this.method1910(null, -11, null);
        }
        class263 var2 = this.field4126;
        if (this.field4121 == var2) {
            this.field4126 = null;
            return null;
        } else {
            this.field4126 = var2.field3319;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lkd;I)V", line = 24)
    public final void method1904(class263 arg0, int arg1) {
        field4131++;
        if (arg0.field3319 != null) {
            arg0.method1566(-51);
        }
        if (arg1 >= -5) {
            this.method1911(-108);
        }
        arg0.field3320 = this.field4121;
        arg0.field3319 = this.field4121.field3319;
        arg0.field3319.field3320 = arg0;
        arg0.field3320.field3319 = arg0;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V", line = 42)
    public static final void method1905(byte arg0) {
        field4122++;
        class210 var1 = (class210) class301.field3832.method1909(true);
        int var2 = -59 / ((arg0 + 48) / 51);
        while (var1 != null) {
            class367 var3 = var1.field2485;
            if (var3.field4734) {
                var1.method1566(-49);
                var3.method2141(-57);
            } else if (var3.field4729 <= class665.field9027) {
                var3.method2136(-96, class231.field3008);
                if (var3.field4734) {
                    var1.method1566(-74);
                } else {
                    class223.method1332(var3, true);
                }
            }
            var1 = (class210) class301.field3832.method1916((byte) 108);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Lkd;", line = 77)
    public final class263 method1906(int arg0) {
        field4119++;
        class263 var2 = this.field4121.field3320;
        if (arg0 <= 50) {
            this.method1908((byte) -52);
        }
        if (this.field4121 == var2) {
            return null;
        } else {
            var2.method1566(-101);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILkd;)V", line = 95)
    public final void method1907(int arg0, class263 arg1) {
        field4123++;
        if (arg1.field3319 != null) {
            arg1.method1566(-60);
        }
        arg1.field3320 = this.field4121.field3320;
        arg1.field3319 = this.field4121;
        arg1.field3319.field3320 = arg1;
        if (arg0 == 30081) {
            arg1.field3320.field3319 = arg1;
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)Z", line = 112)
    public final boolean method1908(byte arg0) {
        field4120++;
        if (arg0 >= -66) {
            this.field4126 = null;
        }
        return this.field4121.field3320 == this.field4121;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)Lkd;", line = 123)
    public final class263 method1909(boolean arg0) {
        field4129++;
        if (!arg0) {
            return null;
        }
        class263 var2 = this.field4121.field3320;
        if (this.field4121 == var2) {
            this.field4126 = null;
            return null;
        } else {
            this.field4126 = var2.field3320;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lws;ILkd;)V", line = 150)
    private final void method1910(class333 arg0, int arg1, class263 arg2) {
        int var4 = 95 % ((arg1 + 55) / 44);
        field4124++;
        class263 var5 = this.field4121.field3319;
        this.field4121.field3319 = arg2.field3319;
        arg2.field3319.field3320 = this.field4121;
        if (this.field4121 != arg2) {
            arg2.field3319 = arg0.field4121.field3319;
            arg2.field3319.field3320 = arg2;
            arg0.field4121.field3319 = var5;
            var5.field3320 = arg0.field4121;
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)Lkd;", line = 175)
    public final class263 method1911(int arg0) {
        if (arg0 != 7) {
            this.field4121 = null;
        }
        field4117++;
        class263 var2 = this.field4121.field3319;
        if (this.field4121 == var2) {
            this.field4126 = null;
            return null;
        } else {
            this.field4126 = var2.field3319;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)I", line = 195)
    public final int method1912(int arg0) {
        field4127++;
        if (arg0 != 16) {
            this.field4126 = null;
        }
        int var2 = 0;
        class263 var3 = this.field4121.field3320;
        while (this.field4121 != var3) {
            var3 = var3.field3320;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(B)V", line = 221)
    public final void method1913(byte arg0) {
        while (true) {
            class263 var2 = this.field4121.field3320;
            if (this.field4121 == var2) {
                if (arg0 < 42) {
                    this.method1914(89, null);
                }
                field4125++;
                this.field4126 = null;
                return;
            }
            var2.method1566(-95);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILws;)V", line = 243)
    public final void method1914(int arg0, class333 arg1) {
        if (arg0 != 16) {
            method1905((byte) -127);
        }
        this.method1910(arg1, arg0 ^ 0xFFFFFF95, this.field4121.field3320);
        field4130++;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V", line = 312)
    public class333() {
        this.field4121.field3319 = this.field4121;
        this.field4121.field3320 = this.field4121;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII)V", line = 270)
    public static final void method1915(int arg0, int arg1, int arg2, int arg3) {
        class565 var4 = class407.field5237[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class539 var5 = var4.field7082;
        class539 var6 = var4.field7073;
        if (var5 != null) {
            var5.field6800 = var5.field6800 * arg3 / (0x10 << class480.field5972 - 7);
            var5.field6795 = var5.field6795 * arg3 / (0x10 << class480.field5972 - 7);
        }
        if (var6 != null) {
            var6.field6800 = var6.field6800 * arg3 / (0x10 << class480.field5972 - 7);
            var6.field6795 = var6.field6795 * arg3 / (0x10 << class480.field5972 - 7);
        }
    }

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(B)Lkd;", line = 292)
    public final class263 method1916(byte arg0) {
        field4128++;
        class263 var2 = this.field4126;
        if (this.field4121 == var2) {
            this.field4126 = null;
            return null;
        } else if (arg0 < 76) {
            return null;
        } else {
            this.field4126 = var2.field3320;
            return var2;
        }
    }
}
