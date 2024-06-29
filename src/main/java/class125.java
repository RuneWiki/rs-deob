import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class125 extends class669 {

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "Z")
    private boolean field2093 = false;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "Lcu;")
    public static class206 field2087 = new class206(9, -1);

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "I")
    public static int field2094;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vr", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field2095;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method969(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lpj;I)V", line = 3)
    public static final void method966(class135 arg0, int arg1) {
        ++field2086;
        if (class703.field9899 != null) {
            class532 var2 = null;
            if (arg0.field2201 == arg1) {
                var2 = (class532) class219.method1390(arg0.field2194, arg0.field2195, arg0.field2198);
            }
            if (arg0.field2201 == 1) {
                var2 = (class532) class74.method581(arg0.field2194, arg0.field2195, arg0.field2198);
            }
            if (arg0.field2201 == 2) {
                var2 = (class532) class503.method2793(arg0.field2194, arg0.field2195, arg0.field2198, field2095 != null ? field2095 : (field2095 = method969("qi")));
            }
            if (~arg0.field2201 == -4) {
                var2 = (class532) class34.method269(arg0.field2194, arg0.field2195, arg0.field2198);
            }
            if (var2 != null) {
                arg0.field2203 = var2.method146(false);
                arg0.field2204 = var2.method151((byte) 78);
                arg0.field2207 = var2.method152(true);
            } else {
                arg0.field2204 = 0;
                arg0.field2203 = -1;
                arg0.field2207 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V", line = 49)
    public static final void method967(int arg0, int arg1, int arg2) {
        boolean var3 = class703.field9899[0][arg1][arg2] != null && class703.field9899[0][arg1][arg2].field408 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class703.field9899[var4][arg1][arg2] == null) {
                class24 var5 = class703.field9899[var4][arg1][arg2] = new class24(var4, arg1, arg2);
                if (var3) {
                    ++var5.field402;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Z", line = 70)
    public final boolean method1(int arg0) {
        if (arg0 != 9567) {
            method967(-31, -61, 113);
        }
        ++field2091;
        return true;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BII)V", line = 82)
    public final void method2(byte arg0, int arg1, int arg2) {
        if (arg0 < 77) {
            this.method1(-15);
        }
        ++field2090;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILnq;)V", line = 94)
    public final void method7(int arg0, int arg1, class430 arg2) {
        if (arg1 != -21254) {
            field2087 = null;
        }
        super.field9490.method897(arg2, true);
        ++field2088;
        super.field9490.method858(arg0, arg1 ^ -14165);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZI)V", line = 110)
    public final void method4(boolean arg0, int arg1) {
        super.field9490.method909(class521.field6963, 123, class586.field7773);
        if (arg1 != 9512) {
            this.field2093 = true;
        }
        ++field2092;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lej;)V", line = 121)
    public class125(class111 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZZ)V", line = 124)
    public final void method5(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field2093 = true;
        }
        ++field2094;
        class537 var3 = super.field9490.method838((byte) 31);
        if (var3 != null && arg0) {
            super.field9490.method845(1, -45);
            super.field9490.method897(var3, !arg1);
            super.field9490.method63(class439.field6038, true);
            super.field9490.method845(1, -26);
            super.field9490.method909(class445.field6091, 40, class586.field7773);
            super.field9490.method60(1, 2, true, false, class291.field4117);
            super.field9490.method828(26, class681.field9596, 0);
            class74 var4 = super.field9490.method879(0);
            var4.method558(!arg1, super.field9490.method900((byte) -110));
            super.field9490.method866(5758, class37.field558);
            super.field9490.method845(0, 123);
            this.field2093 = true;
        } else {
            super.field9490.method828(54, class681.field9596, 0);
        }
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V", line = 160)
    public final void method6(int arg0) {
        if (!this.field2093) {
            super.field9490.method828(45, class350.field4792, 0);
        } else {
            super.field9490.method845(1, arg0 ^ -21021);
            super.field9490.method63(class17.field268, true);
            super.field9490.method909(class521.field6963, -127, class521.field6963);
            super.field9490.method859((byte) 29, class149.field2382, 2);
            super.field9490.method828(35, class350.field4792, 0);
            super.field9490.method842(118);
            super.field9490.method897((class430) null, true);
            super.field9490.method845(0, arg0 + 21226);
            this.field2093 = false;
        }
        ++field2089;
        if (arg0 != -21106) {
            field2087 = null;
        }
        super.field9490.method909(class521.field6963, 30, class521.field6963);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)V", line = 186)
    public static void method968(byte arg0) {
        if (arg0 >= -75) {
            method968((byte) -57);
        }
        field2087 = null;
    }
}
