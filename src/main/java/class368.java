import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class368 {

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Z")
    public static boolean field5407 = false;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field5409 = -1;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Z")
    public static boolean field5405;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[[I")
    public static int[][] field5403;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)J")
    public static final long method2295(boolean arg0) {
        if (!arg0) {
            field5408 = 43;
        }
        field5406++;
        return class364.field5379.method1501(-26653);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method2296(int arg0) {
        field5403 = null;
        if (arg0 != -1) {
            method2295(false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static final void method2297(int arg0) {
        field5404++;
        try {
            if (arg0 != -1) {
                method2295(true);
            }
            if (class60.field718 == 1) {
                int var1 = class448.field6563.method1887(arg0 ^ 0xFFFFF3FF);
                if (var1 > 0 && class448.field6563.method1871(-105)) {
                    int var2 = var1 - class265.field4068;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class448.field6563.method1900(var2, (byte) -122);
                } else {
                    class448.field6563.method1880((byte) 13);
                    class448.field6563.method1894(8359040);
                    class95.field1358 = null;
                    if (class216.field3506 == null) {
                        class60.field718 = 0;
                    } else {
                        class60.field718 = 2;
                    }
                    class271.field4151 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class448.field6563.method1880((byte) 123);
            class216.field3506 = null;
            class271.field4151 = null;
            class60.field718 = 0;
            class95.field1358 = null;
        }
    }

    static {
        new class234("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }
}
