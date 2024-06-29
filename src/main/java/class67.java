import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class67 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lje;")
    private class152 field1137 = new class152();

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lhh;")
    public static class163 field1136 = class137.method1065(":", 17);

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[Lv;")
    public static class22[] field1140 = new class22[256];

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lhh;")
    public static class163 field1148 = class137.method1065("null", 17);

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Lhh;")
    public static class163 field1146 = class137.method1065("k", 17);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lje;")
    private class152 field1143;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Led;")
    public static class255 field1132;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILhh;)V")
    public static final void method460(int arg0, class163 arg1) {
        class149.field2809 = arg1;
        field1141++;
        if (class169.field3090.field3055 == null) {
            return;
        }
        try {
            if (arg0 != 256) {
                field1140 = null;
            }
            class163 var2 = class29.field460.method1196((byte) -118, class169.field3090.field3055);
            class163 var3 = class243.field4299.method1196((byte) -118, class169.field3090.field3055);
            class163 var4 = class145.method1101(0, new class163[] { var2, class246.field4332, arg1, class157.field2912, var3 });
            class163 var5;
            if (arg1.method1221(-23096) == 0) {
                var5 = class145.method1101(0, new class163[] { var4, class243.field4304 });
            } else {
                var5 = class145.method1101(0, new class163[] { var4, class20.field332, class153.method1131(13, class7.method55(arg0 ^ 0x100) + 94608000000L), class188.field3451, class129.method1026(94608000L, (byte) -113) });
            }
            class145.method1101(0, new class163[] { class147.field2792, var5, class191.field3495 }).method1215(class169.field3090.field3055, arg0 ^ 0x1FC);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Lje;")
    public final class152 method461(byte arg0) {
        if (arg0 < 64) {
            this.method462(-85);
        }
        class152 var2 = this.field1143;
        field1147++;
        if (this.field1137 == var2) {
            this.field1143 = null;
            return null;
        } else {
            this.field1143 = var2.field2854;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lje;")
    public final class152 method462(int arg0) {
        class152 var2 = this.field1137.field2854;
        field1133++;
        if (arg0 != 394243696) {
            this.method467((class152) null, false);
        }
        if (this.field1137 == var2) {
            return null;
        } else {
            var2.method1127(arg0 - 394267833);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static final void method463(int arg0) {
        int var1 = 14 % ((arg0 - 42) / 43);
        class65.field1107 = null;
        class257.field4505 = null;
        field1138++;
        class180.field3267 = null;
        class111.field2097 = null;
        class223.field4070 = null;
        class256.field4478 = null;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public final void method464(int arg0) {
        while (true) {
            class152 var2 = this.field1137.field2854;
            if (this.field1137 == var2) {
                field1139++;
                if (arg0 < 117) {
                    return;
                }
                this.field1143 = null;
                return;
            }
            var2.method1127(-24137);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lhb;")
    public static final class111 method465(int arg0, int arg1) {
        class111 var2 = (class111) class237.field4217.method114((long) arg0, 0);
        field1135++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 92 % ((arg1 + 26) / 42);
        byte[] var4 = class117.field2214.method973(class97.method764(114, arg0), true, class75.method551(arg0, 117));
        class111 var5 = new class111();
        var5.field2090 = arg0;
        if (var4 != null) {
            var5.method887(new class81(var4), 0);
        }
        class237.field4217.method117(var5, false, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(ILhh;)V")
    public static final void method466(int arg0, class163 arg1) {
        field1142++;
        if (class20.field328 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method1193((byte) 119);
        if (var3 == 0L) {
            return;
        }
        while (class20.field328.length > var2 && class20.field328[var2].field2641 != var3) {
            var2++;
        }
        if (class20.field328.length > var2 && class20.field328[var2] != null) {
            class191.field3499.method75(arg0, arg0 - 134);
            class191.field3499.method651(-645765520, class20.field328[var2].field2641);
            class151.field2837++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lje;Z)V")
    public final void method467(class152 arg0, boolean arg1) {
        if (arg0.field2855 != null) {
            arg0.method1127(-24137);
        }
        field1145++;
        if (arg1) {
            arg0.field2855 = this.field1137;
            arg0.field2854 = this.field1137.field2854;
            arg0.field2855.field2854 = arg0;
            arg0.field2854.field2855 = arg0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lje;")
    public final class152 method468(int arg0) {
        class152 var2 = this.field1137.field2854;
        field1131++;
        if (this.field1137 == var2) {
            this.field1143 = null;
            return null;
        } else {
            this.field1143 = var2.field2854;
            return arg0 > -104 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public static void method469(byte arg0) {
        int var1 = -14 % ((arg0 - 68) / 50);
        field1148 = null;
        field1140 = null;
        field1136 = null;
        field1146 = null;
        field1132 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lqh;I)Lqh;")
    public static final class69 method470(class69 arg0, int arg1) {
        field1134++;
        if (arg1 != 4223) {
            return null;
        } else if (arg0.field1302 == -1) {
            int var2 = arg0.field1188 >>> 16;
            for (class222 var3 = (class222) class92.field1739.method1747((byte) 93); var3 != null; var3 = (class222) class92.field1739.method1745(-32496)) {
                if (var3.field4049 == var2) {
                    return class124.method989((byte) 108, (int) var3.field2641);
                }
            }
            return null;
        } else {
            return class124.method989((byte) 115, arg0.field1302);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLje;)V")
    public final void method471(byte arg0, class152 arg1) {
        if (arg1.field2855 != null) {
            arg1.method1127(-24137);
        }
        arg1.field2855 = this.field1137.field2855;
        if (arg0 < -61) {
            arg1.field2854 = this.field1137;
            field1144++;
            arg1.field2855.field2854 = arg1;
            arg1.field2854.field2855 = arg1;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class67() {
        this.field1137.field2855 = this.field1137;
        this.field1137.field2854 = this.field1137;
    }
}
