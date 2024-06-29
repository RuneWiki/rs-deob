import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class314 extends class117 {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Ldq;")
    public static class493 field4008 = new class493(43, 2);

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)I")
    public static final int method1841(int arg0, int arg1) {
        if (arg0 != 127) {
            field4008 = null;
        }
        field4010++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBII)I")
    public static final int method1842(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4012++;
        if (var4 == 0) {
            return arg0;
        }
        if (arg1 > -46) {
            field4008 = null;
        }
        if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
    public static final void method1843(byte arg0) {
        field4013++;
        if (class500.method3009(class483.field7059, -117) || class395.method2282((byte) 74, class483.field7059)) {
            class223.method1356(class310.field3971 >> 10, 17010, 5000, class193.field2500 >> 10);
        } else {
            int var1 = class23.field336.field4944[0] >> 3;
            int var2 = class23.field336.field4936[0] >> 3;
            if (var1 >= 0 && (class452.field6526 >> 3) > var1 && var2 >= 0 && (class440.field6307 >> 3) > var2) {
                class223.method1356(var1, arg0 ^ 0x4270, 5000, var2);
            } else {
                class223.method1356(class452.field6526 >> 4, 17010, 0, class440.field6307 >> 4);
            }
        }
        if (arg0 != 2) {
            method1844(false);
        }
        class244.method1485(16711680);
        class309.method1800(810439968);
        class494.method2993((byte) -25);
        class266.method1583(256);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(Z)V")
    public static void method1844(boolean arg0) {
        if (arg0) {
            field4008 = null;
        }
        field4008 = null;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    public static final void method1845(int arg0) {
        field4006++;
        int var1 = -101 % ((12 - arg0) / 48);
        try {
            if (class176.field2324 == 1) {
                int var2 = class155.field1965.method2681(42);
                if (var2 > 0 && class155.field1965.method2678((byte) -79)) {
                    int var3 = var2 - class9.field148;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class155.field1965.method2664((byte) -78, var3);
                } else {
                    class155.field1965.method2686((byte) 69);
                    class155.field1965.method2673(22915);
                    class173.field2247 = null;
                    class434.field6169 = null;
                    if (class534.field7859 == null) {
                        class176.field2324 = 0;
                    } else {
                        class176.field2324 = 2;
                    }
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class155.field1965.method2686((byte) 96);
            class434.field6169 = null;
            class534.field7859 = null;
            class173.field2247 = null;
            class176.field2324 = 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIII)V")
    public class314(int arg0, int arg1, int arg2, int arg3) {
        this.field4007 = arg0;
        this.field4009 = arg1;
        this.field4014 = arg2;
        this.field4011 = arg3;
    }

    static {
        new class335("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
