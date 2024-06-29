import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class312 extends class180 {

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field4253 = 0;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field4252 = -1;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Laq;")
    public class385 field4251;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Z")
    public static boolean field4249;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Z")
    public boolean field4250;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "[I")
    public static int[] field4254;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
    public static void method1882(int arg0) {
        field4254 = null;
        if (arg0 != -983492189) {
            field4252 = -41;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
    public static final void method1883(int arg0, byte arg1) {
        field4248++;
        if (class430.field5927 == arg0) {
            return;
        }
        class200.field2875 = class422.field5811 = class378.field5342[arg0];
        class338.field4636.method1106(50, (int) ((double) class200.field2875 * 34.46D));
        class109.field1544 = new int[4][class200.field2875 >> 3][class422.field5811 >> 3];
        class292.field4012 = new int[class200.field2875][class422.field5811];
        class126.field1733 = new int[class200.field2875][class422.field5811];
        if (arg1 < 23) {
            method1884(118);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class308.field4209[var2] = class274.method1721(class200.field2875, 5, class422.field5811);
        }
        class484.field6821 = new byte[4][class200.field2875][class422.field5811];
        class224.method1410(class422.field5811, class200.field2875, 0, 4);
        class236.method1482(class338.field4636, (byte) 57, class200.field2875 >> 3, class422.field5811 >> 3);
        class430.field5927 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public static final void method1884(int arg0) {
        class479[] var1 = class254.field3560;
        synchronized (class254.field3560) {
            int var2 = arg0;
            while (true) {
                if (var2 >= class254.field3560.length) {
                    break;
                }
                class254.field3560[var2] = new class479();
                class145.field2022[var2] = 0;
                var2++;
            }
        }
        field4247++;
    }

    static {
        new class112("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }
}
