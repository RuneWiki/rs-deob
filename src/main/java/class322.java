import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class322 extends class80 {

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[B")
    public byte[] field4443;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field4445 = 0;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "Lvh;")
    public static class240 field4448;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public static final void method1814(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field4449++;
        class295 var5 = class12.method106(arg4, (byte) -100, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field4029 != null) {
            class44 var6 = new class44();
            var6.field605 = arg2;
            var6.field612 = var5.field4029;
            var6.field609 = arg0;
            var6.field613 = var5;
            class475.method2798(var6);
        }
        boolean var7 = true;
        if (var5.field3995 != 0) {
            var7 = class362.method2019(true, var5);
        }
        if (!var7 || !client.method1191(var5).method1226(arg1 - 18315, arg0 + -1)) {
            return;
        }
        if (arg0 == 1) {
            class356.method1978((byte) 57, class54.field747);
            class428.field6255++;
            class426.method2554(var5.field4072, arg4, arg3, 5290);
        }
        if (arg0 == 2) {
            class356.method1978((byte) 51, class23.field381);
            class424.field6194++;
            class426.method2554(var5.field4072, arg4, arg3, 5290);
        }
        if (arg0 == 3) {
            class356.method1978((byte) 114, class56.field773);
            class366.field5135++;
            class426.method2554(var5.field4072, arg4, arg3, 5290);
        }
        if (arg0 == 4) {
            class356.method1978((byte) 32, class278.field3753);
            class22.field321++;
            class426.method2554(var5.field4072, arg4, arg3, arg1 + 5283);
        }
        if (arg0 == 5) {
            class411.field6015++;
            class356.method1978((byte) 95, class115.field1558);
            class426.method2554(var5.field4072, arg4, arg3, arg1 ^ 0x14AD);
        }
        if (arg0 == 6) {
            class290.field3892++;
            class356.method1978((byte) 66, class183.field2563);
            class426.method2554(var5.field4072, arg4, arg3, 5290);
        }
        if (arg0 == arg1) {
            class356.method1978((byte) 49, class222.field3095);
            class94.field1276++;
            class426.method2554(var5.field4072, arg4, arg3, 5290);
        }
        if (arg0 == 8) {
            class39.field528++;
            class356.method1978((byte) 48, class175.field2499);
            class426.method2554(var5.field4072, arg4, arg3, 5290);
        }
        if (arg0 == 9) {
            class356.method1978((byte) 51, class18.field192);
            class213.field3042++;
            class426.method2554(var5.field4072, arg4, arg3, 5290);
        }
        if (arg0 == 10) {
            class309.field4231++;
            class356.method1978((byte) 48, class311.field4290);
            class426.method2554(var5.field4072, arg4, arg3, 5290);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIZI)V")
    public static final void method1815(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 >= class382.field5379 && class175.field2497 >= arg0) {
            int var5 = class497.method2935(class54.field753, arg1, class343.field4727, -127);
            int var6 = class497.method2935(class54.field753, arg4, class343.field4727, -127);
            class421.method2519(var6, (byte) 120, var5, arg2, arg0);
        }
        field4446++;
        if (arg3) {
            method1817(78);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    public static final void method1816(byte arg0) {
        class275.field3736.method65(false);
        field4447++;
        class61.field810.method65(false);
        class214.field3047.method65(false);
        class483.field7080.method65(false);
        class227.field3184.method65(false);
        if (arg0 != -22) {
            field4444 = -109;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method1817(int arg0) {
        field4448 = null;
        if (arg0 != 10) {
            field4444 = -18;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
    public class322(byte[] arg0) {
        this.field4443 = arg0;
    }
}
