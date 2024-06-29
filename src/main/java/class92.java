import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class92 {

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Lqf;")
    public class406 field1104 = new class406();

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "Lwq;")
    public static class92 field1120 = new class92();

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "S")
    public static short field1121 = 320;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "Lqf;")
    private class406 field1117;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lqf;BLwq;)V", line = 4)
    private final void method502(class406 arg0, byte arg1, class92 arg2) {
        field1109++;
        class406 var4 = this.field1104.field5854;
        this.field1104.field5854 = arg0.field5854;
        if (arg1 != -55) {
            return;
        }
        arg0.field5854.field5862 = this.field1104;
        if (this.field1104 != arg0) {
            arg0.field5854 = arg2.field1104.field5854;
            arg0.field5854.field5862 = arg0;
            var4.field5862 = arg2.field1104;
            arg2.field1104.field5854 = var4;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lwq;Z)V", line = 27)
    public final void method503(class92 arg0, boolean arg1) {
        this.method502(this.field1104.field5862, (byte) -55, arg0);
        field1115++;
        if (!arg1) {
            field1120 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)Z", line = 39)
    public final boolean method504(boolean arg0) {
        if (arg0) {
            this.method504(true);
        }
        field1119++;
        return this.field1104.field5862 == this.field1104;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V", line = 51)
    public final void method505(byte arg0) {
        while (true) {
            class406 var2 = this.field1104.field5862;
            if (this.field1104 == var2) {
                field1116++;
                if (arg0 != 44) {
                    this.field1104 = null;
                }
                this.field1117 = null;
                return;
            }
            var2.method2594((byte) -22);
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Lqf;", line = 72)
    public final class406 method506(byte arg0) {
        field1108++;
        class406 var2 = this.field1104.field5862;
        if (this.field1104 == var2) {
            this.field1117 = null;
            return null;
        }
        this.field1117 = var2.field5862;
        if (arg0 >= -127) {
            method516(29, (byte) -26);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 92)
    public static void method507(int arg0) {
        field1120 = null;
        if (arg0 != -2) {
            field1121 = -14;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILon;IZB)V", line = 102)
    public static final void method508(int arg0, class184 arg1, int arg2, boolean arg3, byte arg4) {
        field1106++;
        int var5 = arg1.field2618;
        if (arg1.field2548 == 0) {
            arg1.field2618 = arg1.field2585;
        } else if (arg1.field2548 == 1) {
            arg1.field2618 = arg0 - arg1.field2585;
        } else if (arg1.field2548 == 2) {
            arg1.field2618 = arg1.field2585 * arg0 >> 14;
        }
        int var6 = arg1.field2516;
        if (arg1.field2536 == 0) {
            arg1.field2516 = arg1.field2557;
        } else if (arg1.field2536 == 1) {
            arg1.field2516 = arg2 - arg1.field2557;
        } else if (arg1.field2536 == 2) {
            arg1.field2516 = arg1.field2557 * arg2 >> 14;
        }
        if (arg4 > -23) {
            field1120 = null;
        }
        if (arg1.field2548 == 4) {
            arg1.field2618 = arg1.field2528 * arg1.field2516 / arg1.field2656;
        }
        if (arg1.field2536 == 4) {
            arg1.field2516 = arg1.field2656 * arg1.field2618 / arg1.field2528;
        }
        if (class367.field5204 && (client.method1121(arg1).field3981 != 0 || arg1.field2524 == 0)) {
            if (arg1.field2516 < 5 && arg1.field2618 < 5) {
                arg1.field2618 = 5;
                arg1.field2516 = 5;
            } else {
                if (arg1.field2516 <= 0) {
                    arg1.field2516 = 5;
                }
                if (arg1.field2618 <= 0) {
                    arg1.field2618 = 5;
                }
            }
        }
        if (arg1.field2561 == 1337) {
            class113.field1390 = arg1;
        }
        if (arg3 && arg1.field2629 != null && arg1.field2618 != var5 || arg1.field2516 != var6) {
            class272 var7 = new class272();
            var7.field3851 = arg1;
            var7.field3848 = arg1.field2629;
            field1120.method509((byte) 117, var7);
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V", line = 346)
    public class92() {
        this.field1104.field5854 = this.field1104;
        this.field1104.field5862 = this.field1104;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLqf;)V", line = 191)
    public final void method509(byte arg0, class406 arg1) {
        field1111++;
        if (arg1.field5854 != null) {
            arg1.method2594((byte) -22);
        }
        arg1.field5854 = this.field1104.field5854;
        if (arg0 <= 97) {
            this.field1117 = null;
        }
        arg1.field5862 = this.field1104;
        arg1.field5854.field5862 = arg1;
        arg1.field5862.field5854 = arg1;
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)Lqf;", line = 213)
    public final class406 method510(byte arg0) {
        if (arg0 != 105) {
            method516(-14, (byte) -8);
        }
        field1118++;
        class406 var2 = this.field1104.field5854;
        if (this.field1104 == var2) {
            this.field1117 = null;
            return null;
        } else {
            this.field1117 = var2.field5854;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lqf;B)V", line = 238)
    public final void method511(class406 arg0, byte arg1) {
        if (arg0.field5854 != null) {
            arg0.method2594((byte) -22);
        }
        field1107++;
        arg0.field5862 = this.field1104.field5862;
        arg0.field5854 = this.field1104;
        arg0.field5854.field5862 = arg0;
        arg0.field5862.field5854 = arg0;
        if (arg1 > -95) {
            method507(118);
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Lqf;", line = 258)
    public final class406 method512(int arg0) {
        field1105++;
        class406 var2 = this.field1117;
        if (arg0 != -2) {
            this.method509((byte) 111, (class406) null);
        }
        if (this.field1104 == var2) {
            this.field1117 = null;
            return null;
        } else {
            this.field1117 = var2.field5854;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)Lqf;", line = 281)
    public final class406 method513(int arg0) {
        field1110++;
        class406 var2 = this.field1104.field5862;
        if (this.field1104 == var2) {
            return null;
        }
        if (arg0 != -2) {
            this.method511((class406) null, (byte) 94);
        }
        var2.method2594((byte) -22);
        return var2;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(Z)Lqf;", line = 301)
    public final class406 method514(boolean arg0) {
        field1113++;
        if (!arg0) {
            field1120 = null;
        }
        class406 var2 = this.field1117;
        if (this.field1104 == var2) {
            this.field1117 = null;
            return null;
        } else {
            this.field1117 = var2.field5862;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "(B)I", line = 324)
    public final int method515(byte arg0) {
        field1112++;
        int var2 = 0;
        if (arg0 != 96) {
            this.method513(74);
        }
        for (class406 var3 = this.field1104.field5862; var3 != this.field1104; var3 = var3.field5862) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)V", line = 362)
    public static final void method516(int arg0, byte arg1) {
        field1114++;
        class237 var2 = class222.field3111;
        synchronized (class222.field3111) {
            class222.field3111.method1629(arg0, 70);
        }
        int var3 = -71 % ((32 - arg1) / 56);
    }
}
