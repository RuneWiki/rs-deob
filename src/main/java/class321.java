import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class321 {

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "Lhu;")
    public static class238 field3980 = new class238();

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "F")
    public static float field3984;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method1865(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= arg1) {
            class54.method333(arg4, class207.field2840[arg0], arg3 ^ 0xFFFFFFEA, arg1, arg2);
        } else {
            class54.method333(arg1, class207.field2840[arg0], 7, arg4, arg2);
        }
        if (arg3 != -19) {
            method1866(false);
        }
        field3982++;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Z)V", line = 28)
    public static void method1866(boolean arg0) {
        if (arg0) {
            field3980 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)Lqd;", line = 38)
    public static final class601 method1867(int arg0, int arg1) {
        if (arg1 != 20683) {
            return null;
        }
        field3983++;
        if (arg0 == 0) {
            return new class609();
        } else if (arg0 == 1) {
            return new class598();
        } else if (arg0 == 2) {
            return new class776();
        } else if (arg0 == 3) {
            return new class559();
        } else if (arg0 == 4) {
            return new class777();
        } else if (arg0 == 5) {
            return new class763();
        } else if (arg0 == 6) {
            return new class282();
        } else if (arg0 == 7) {
            return new class469();
        } else if (arg0 == 8) {
            return new class410();
        } else if (arg0 == 9) {
            return new class484();
        } else if (arg0 == 10) {
            return new class107();
        } else if (arg0 == 11) {
            return new class608();
        } else if (arg0 == 12) {
            return new class120();
        } else if (arg0 == 13) {
            return new class269();
        } else if (arg0 == 14) {
            return new class732();
        } else if (arg0 == 15) {
            return new class189();
        } else if (arg0 == 16) {
            return new class110();
        } else if (arg0 == 17) {
            return new class754();
        } else if (arg0 == 18) {
            return new class229();
        } else if (arg0 == 19) {
            return new class452();
        } else if (arg0 == 20) {
            return new class648();
        } else if (arg0 == 21) {
            return new class249();
        } else if (arg0 == 22) {
            return new class177();
        } else if (arg0 == 23) {
            return new class751();
        } else if (arg0 == 24) {
            return new class669();
        } else if (arg0 == 25) {
            return new class430();
        } else if (arg0 == 26) {
            return new class726();
        } else if (arg0 == 27) {
            return new class62();
        } else if (arg0 == 28) {
            return new class255();
        } else if (arg0 == 29) {
            return new class557();
        } else if (arg0 == 30) {
            return new class316();
        } else if (arg0 == 31) {
            return new class43();
        } else if (arg0 == 32) {
            return new class172();
        } else if (arg0 == 33) {
            return new class606();
        } else if (arg0 == 34) {
            return new class47();
        } else if (arg0 == 35) {
            return new class409();
        } else if (arg0 == 36) {
            return new class789();
        } else if (arg0 == 37) {
            return new class343();
        } else if (arg0 == 38) {
            return new class137();
        } else if (arg0 == 39) {
            return new class354();
        } else {
            return null;
        }
    }
}
