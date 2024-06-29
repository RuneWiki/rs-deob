import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class295 {

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Z")
    public static volatile boolean field4256 = true;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Z")
    public static boolean field4254 = true;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4258;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
    public static final void method1857(byte arg0, int arg1) {
        field4255++;
        if (arg0 < 71) {
            method1857((byte) 18, 85);
        }
        class225.field3369 = arg1;
        class395 var2 = class557.field7878;
        synchronized (class557.field7878) {
            class557.field7878.method2406(107);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method1858(int arg0) {
        field4258 = null;
        if (arg0 != 1311506432) {
            method1857((byte) -86, -9);
        }
    }

    static {
        new class567("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field4258 = null;
    }
}
