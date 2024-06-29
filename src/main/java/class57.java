import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public abstract class class57 {

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "Lao;")
    public static class191 field681 = new class191(64, 10);

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Llq;")
    public static final class389 method338(Throwable arg0, String arg1) {
        field678++;
        class389 var2;
        if (arg0 instanceof class389) {
            var2 = (class389) arg0;
            var2.field5636 = var2.field5636 + ' ' + arg1;
        } else {
            var2 = new class389(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public static void method339(byte arg0) {
        field681 = null;
        if (arg0 != -97) {
            method339((byte) 41);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)I")
    public abstract int method340(int arg0);

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)I")
    public abstract int method341(boolean arg0);

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)C")
    public abstract char method342(boolean arg0);

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Z")
    public abstract boolean method343(int arg0);

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)J")
    public abstract long method344(int arg0);

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
    public static final void method345(int arg0, int arg1) {
        field680++;
        if (class527.field7734 == arg1) {
            return;
        }
        if (class527.field7734 == 0) {
            class123.method732(-2);
        }
        if (arg1 == 12) {
            class519.method3102(class47.field493, class392.field5663, class516.field7509, -211);
        }
        if (arg1 != 12 && class363.field4961 != null) {
            class363.field4961.method2625(true);
            class363.field4961 = null;
        }
        if (arg1 == 2) {
            class523.method3115(true, class286.field3761 != class168.field2174);
        }
        if (arg1 == 6) {
            class216.method1373(11770, class281.field3723 != class168.field2174);
        }
        if (arg1 == 4) {
            class181.method1055(class392.field5663, (byte) -112, class516.field7509);
        } else if (arg1 == 5) {
            class519.method3102(class47.field493, class392.field5663, class516.field7509, arg0 - 212);
        } else if (arg1 == 8) {
            class519.method3102(class47.field493, class392.field5663, class516.field7509, -211);
        } else if (arg1 == 11) {
            class181.method1055(class392.field5663, (byte) -112, class516.field7509);
        }
        if (class80.method454(-8, class527.field7734)) {
            class517.field7627.field4921 = 2;
            class306.field4088.field4921 = 2;
            class316.field4207.field4921 = 2;
            class232.field3114.field4921 = 2;
            class533.field7851.field4921 = 2;
            class117.field1533.field4921 = 2;
            class49.field558.field4921 = 2;
        }
        if (class80.method454(-8, arg1)) {
            class321.field4274 = 0;
            class347.field4627 = 1;
            class462.field6894 = 1;
            class267.field3575 = 0;
            class17.field164 = 0;
            class477.method2910(arg0 + 2, true);
            class517.field7627.field4921 = 1;
            class306.field4088.field4921 = 1;
            class316.field4207.field4921 = 1;
            class232.field3114.field4921 = 1;
            class533.field7851.field4921 = 1;
            class117.field1533.field4921 = 1;
            class49.field558.field4921 = 1;
        }
        if (arg1 == 10 || arg1 == 2) {
            class38.method218(arg0);
        }
        if (arg1 == 1) {
            class446.method2753(class343.field4596, class282.field3733, arg0 + 17);
        } else {
            class294.method1764(0);
        }
        boolean var2 = arg0 == arg1 || class458.method2817(arg0 - 93, arg1) || class270.method1644((byte) -126, arg1);
        boolean var3 = class527.field7734 == 1 || class458.method2817(arg0 ^ 0x5, class527.field7734) || class270.method1644((byte) -55, class527.field7734);
        if (var2 != var3) {
            if (var2) {
                class43.field460 = class283.field3750;
                if (class319.field4256.field4655 == 0) {
                    class310.method1851(2, false);
                } else {
                    class114.method690(0, 2, 0, class96.field1214, class319.field4256.field4655, class283.field3750, false);
                }
                class162.field2108.method2768(false, -2075);
            } else {
                class310.method1851(2, false);
                class162.field2108.method2768(true, -2075);
            }
        }
        if (class80.method454(arg0 ^ 0xFFFFFFF9, arg1) || arg1 == 12) {
            class343.field4596.method1196();
        }
        class527.field7734 = arg1;
    }
}
