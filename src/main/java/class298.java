import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class298 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lea;")
    public static class474 field4404 = new class474("Loaded JAGDX", "JAGDX geladen", "JAGDX chargé", "JAGDX carregado");

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lig;")
    public static class206 field4408 = new class206(105, -1);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lkf;")
    public static class215 field4409;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 4)
    public static void method1990(int arg0) {
        field4408 = null;
        if (arg0 == -698) {
            field4404 = null;
            field4409 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Luh;", line = 21)
    public static final class145 method1991(int arg0, int arg1) {
        field4406++;
        if (arg1 != -28) {
            method1992(null, 112, -70, -95, 110, -18);
        }
        if (arg0 == 0) {
            return new class5();
        } else if (arg0 == 1) {
            return new class529();
        } else if (arg0 == 2) {
            return new class259();
        } else if (arg0 == 3) {
            return new class609();
        } else if (arg0 == 4) {
            return new class499();
        } else if (arg0 == 5) {
            return new class38();
        } else if (arg0 == 6) {
            return new class318();
        } else if (arg0 == 7) {
            return new class554();
        } else if (arg0 == 8) {
            return new class135();
        } else if (arg0 == 9) {
            return new class100();
        } else if (arg0 == 10) {
            return new class122();
        } else if (arg0 == 11) {
            return new class187();
        } else if (arg0 == 12) {
            return new class23();
        } else if (arg0 == 13) {
            return new class146();
        } else if (arg0 == 14) {
            return new class20();
        } else if (arg0 == 15) {
            return new class24();
        } else if (arg0 == 16) {
            return new class218();
        } else if (arg0 == 17) {
            return new class332();
        } else if (arg0 == 18) {
            return new class461();
        } else if (arg0 == 19) {
            return new class608();
        } else if (arg0 == 20) {
            return new class250();
        } else if (arg0 == 21) {
            return new class469();
        } else if (arg0 == 22) {
            return new class619();
        } else if (arg0 == 23) {
            return new class62();
        } else if (arg0 == 24) {
            return new class527();
        } else if (arg0 == 25) {
            return new class17();
        } else if (arg0 == 26) {
            return new class574();
        } else if (arg0 == 27) {
            return new class641();
        } else if (arg0 == 28) {
            return new class32();
        } else if (arg0 == 29) {
            return new class164();
        } else if (arg0 == 30) {
            return new class254();
        } else if (arg0 == 31) {
            return new class155();
        } else if (arg0 == 32) {
            return new class207();
        } else if (arg0 == 33) {
            return new class512();
        } else if (arg0 == 34) {
            return new class363();
        } else if (arg0 == 35) {
            return new class394();
        } else if (arg0 == 36) {
            return new class244();
        } else if (arg0 == 37) {
            return new class224();
        } else if (arg0 == 38) {
            return new class330();
        } else if (arg0 == 39) {
            return new class13();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lad;IIIII)Lah;", line = 341)
    public static final class325 method1992(class362 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4405++;
        if (arg4 >= -94) {
            method1992(null, -47, 64, 96, 103, 112);
        }
        if (!arg0.field5433 && (!class229.method1482(arg3, 88) || !class229.method1482(arg2, 52))) {
            return arg0.field5473 ? new class325(arg0, 34037, arg1, arg5, arg3, arg2, true) : new class325(arg0, arg1, arg5, arg3, arg2, class367.method2354(-224121456, arg3), class367.method2354(-224121456, arg2), true);
        } else {
            return new class325(arg0, 3553, arg1, arg5, arg3, arg2, true);
        }
    }
}
