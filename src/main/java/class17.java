import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class17 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "[I")
    public static int[] field184 = new int[13];

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field186 = 0;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lla;")
    public static class422 field182;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method105(byte arg0) {
        field183++;
        if (class594.field8336 == 0) {
            return;
        }
        try {
            if (++class551.field7854 > 2000) {
                if (class166.field2624 != null) {
                    class166.field2624.method3118(25);
                    class166.field2624 = null;
                }
                if (class184.field3104 >= 2) {
                    class751.field10468 = -5;
                    class594.field8336 = 0;
                    return;
                }
                class372.field5642.method3108(0);
                class184.field3104++;
                class594.field8336 = 1;
                class551.field7854 = 0;
            }
            if (arg0 == 10) {
                if (class594.field8336 == 1) {
                    class382.field5737 = class372.field5642.method3109(class706.field9962, arg0 + 60);
                    class594.field8336 = 2;
                }
                if (class594.field8336 == 2) {
                    if (class382.field5737.field2512 == 2) {
                        throw new IOException();
                    }
                    if (class382.field5737.field2512 != 1) {
                        return;
                    }
                    class166.field2624 = class599.method3445(7500, (Socket) class382.field5737.field2517, 2036970792);
                    class382.field5737 = null;
                    class683.method3809(0);
                    class594.field8336 = 4;
                }
                if (class594.field8336 == 4 && class166.field2624.method3114(1, (byte) 127)) {
                    class166.field2624.method3120(0, (byte) -36, 1, class624.field8742.field4543);
                    int var1 = class624.field8742.field4543[0] & 0xFF;
                    class751.field10468 = var1;
                    class594.field8336 = 0;
                    class166.field2624.method3118(25);
                    class166.field2624 = null;
                }
            }
        } catch (IOException var2) {
            if (class166.field2624 != null) {
                class166.field2624.method3118(25);
                class166.field2624 = null;
            }
            if (class184.field3104 >= 2) {
                class594.field8336 = 0;
                class751.field10468 = -4;
            } else {
                class372.field5642.method3108(arg0 ^ 0xA);
                class551.field7854 = 0;
                class594.field8336 = 1;
                class184.field3104++;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static final void method106(byte arg0) {
        field185++;
        for (int var1 = 0; var1 < class356.field5394; var1++) {
            int var2 = class45.field758[var1];
            class53 var3 = (class53) class332.field4881.method3512(true, (long) var2);
            if (var3 != null) {
                class461 var4 = var3.field847;
                class23.method124(127, var4.field6688.field7303, var4);
            }
        }
        if (arg0 != 24) {
            method107((byte) -91);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
    public static void method107(byte arg0) {
        if (arg0 == 72) {
            field184 = null;
            field182 = null;
        }
    }
}
