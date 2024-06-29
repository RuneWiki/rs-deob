import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class257 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Lba;")
    public class188 field4061 = new class188();

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lgj;")
    public static class257 field4069 = new class257();

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "F")
    public static float field4071;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Lba;")
    private class188 field4072;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lio;III)V", line = 8)
    public static final void method1807(class294 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class236.field3633) {
            class196 var4 = class194.field2947[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3003 != null && var4.field3003.field5697.method851()) {
                arg0.method845(var4.field3003.field5697, 128, 0, 0, true);
            }
        }
        if (arg3 < class236.field3633) {
            class196 var5 = class194.field2947[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3003 != null && var5.field3003.field5697.method851()) {
                arg0.method845(var5.field3003.field5697, 0, 0, 128, true);
            }
        }
        if (arg2 < class236.field3633 && arg3 < class293.field4607) {
            class196 var6 = class194.field2947[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3003 != null && var6.field3003.field5697.method851()) {
                arg0.method845(var6.field3003.field5697, 128, 0, 128, true);
            }
        }
        if (arg2 < class236.field3633 && arg3 > 0) {
            class196 var7 = class194.field2947[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3003 != null && var7.field3003.field5697.method851()) {
                arg0.method845(var7.field3003.field5697, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lba;", line = 57)
    public final class188 method1808(int arg0) {
        field4059++;
        if (arg0 != 0) {
            field4069 = (class257) null;
        }
        class188 var2 = this.field4061.field2835;
        if (this.field4061 == var2) {
            return null;
        } else {
            var2.method1290(arg0 ^ 0xFFFFFFA1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 301)
    public class257() {
        this.field4061.field2833 = this.field4061;
        this.field4061.field2835 = this.field4061;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Lba;", line = 83)
    public final class188 method1809(int arg0) {
        field4070++;
        class188 var2 = this.field4072;
        if (this.field4061 == var2) {
            this.field4072 = null;
            return null;
        } else if (arg0 == 128) {
            this.field4072 = var2.field2835;
            return var2;
        } else {
            return (class188) null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILba;)V", line = 107)
    public final void method1810(int arg0, class188 arg1) {
        field4064++;
        if (arg0 != 0) {
            field4067 = 6;
        }
        if (arg1.field2833 != null) {
            arg1.method1290(arg0 + 106);
        }
        arg1.field2833 = this.field4061;
        arg1.field2835 = this.field4061.field2835;
        arg1.field2833.field2835 = arg1;
        arg1.field2835.field2833 = arg1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 125)
    public final void method1811(byte arg0) {
        if (arg0 != -30) {
            field4073 = -63;
        }
        field4066++;
        while (true) {
            class188 var2 = this.field4061.field2835;
            if (this.field4061 == var2) {
                this.field4072 = null;
                return;
            }
            var2.method1290(-3);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Lba;", line = 148)
    public final class188 method1812(int arg0) {
        field4063++;
        class188 var2 = this.field4061.field2835;
        if (arg0 != 1) {
            field4067 = 89;
        }
        if (this.field4061 == var2) {
            this.field4072 = null;
            return null;
        } else {
            this.field4072 = var2.field2835;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V", line = 170)
    public static void method1813(int arg0) {
        field4069 = null;
        if (arg0 != 10057) {
            field4067 = -99;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lba;Z)V", line = 183)
    public final void method1814(class188 arg0, boolean arg1) {
        if (!arg1) {
            this.method1817((byte) 83);
        }
        field4068++;
        if (arg0.field2833 != null) {
            arg0.method1290(-43);
        }
        arg0.field2833 = this.field4061.field2833;
        arg0.field2835 = this.field4061;
        arg0.field2833.field2835 = arg0;
        arg0.field2835.field2833 = arg0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)I", line = 211)
    public static final int method1815(boolean arg0, int arg1) {
        field4065++;
        long var2 = class9.method57(arg1 ^ 0xFFFFC8CA);
        class161 var4 = arg0 ? (class161) class181.field2727.method761(57) : (class161) class181.field2727.method757(-1);
        if (arg1 != 1) {
            field4067 = -13;
        }
        while (var4 != null) {
            if (var2 > (var4.field2485 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field2485 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2834;
                    class255.field4041[var5] = class323.field5113[var5];
                    var4.method1290(arg1 + 115);
                    return var5;
                }
                var4.method1290(arg1 ^ 0x70);
            }
            var4 = (class161) class181.field2727.method757(-1);
        }
        return -1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)Lba;", line = 249)
    public final class188 method1816(byte arg0) {
        field4060++;
        class188 var2 = this.field4061.field2833;
        if (this.field4061 == var2) {
            this.field4072 = null;
            return null;
        }
        if (arg0 < 114) {
            this.method1810(47, (class188) null);
        }
        this.field4072 = var2.field2833;
        return var2;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)Z", line = 270)
    public final boolean method1817(byte arg0) {
        if (arg0 <= 122) {
            this.method1814((class188) null, true);
        }
        field4062++;
        return this.field4061.field2835 == this.field4061;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)Lba;", line = 283)
    public final class188 method1818(byte arg0) {
        field4058++;
        class188 var2 = this.field4072;
        if (arg0 != -95) {
            return (class188) null;
        } else if (this.field4061 == var2) {
            this.field4072 = null;
            return null;
        } else {
            this.field4072 = var2.field2833;
            return var2;
        }
    }
}
