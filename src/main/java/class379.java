import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class379 extends class366 {

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public int field5390 = 0;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "[S")
    public static short[] field5388 = new short[256];

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public static int field5387 = 0;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "Lpm;")
    public static class349 field5386 = new class349("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!am", name = "H", descriptor = "[I")
    public static int[] field5391 = new int[64];

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(B)V", line = 3)
    public static void method2415(byte arg0) {
        field5388 = null;
        if (arg0 == -12) {
            field5386 = null;
            field5391 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Llf;BI)V", line = 18)
    private final void method2416(class130 arg0, byte arg1, int arg2) {
        if (arg1 <= 88) {
            field5394 = 46;
        }
        field5392++;
        if (arg2 == 2) {
            this.field5390 = arg0.method798(false);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lmq;", line = 40)
    public static final class297 method2417(int arg0, int arg1) {
        field5389++;
        class297 var2 = (class297) class198.field2833.method99(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 3144) {
            field5386 = null;
        }
        byte[] var3 = class261.field3861.method643(36, arg1, true);
        class297 var4 = new class297();
        var4.field4319 = arg1;
        if (var3 != null) {
            var4.method2009(new class130(var3), (byte) -54);
        }
        var4.method2003(false);
        class198.field2833.method90(var4, (long) arg1, 0);
        return var4;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Llf;I)V", line = 82)
    public final void method2418(class130 arg0, int arg1) {
        field5393++;
        while (true) {
            int var3 = arg0.method837(true);
            if (var3 == 0) {
                if (arg1 > -41) {
                    field5391 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method2416(arg0, (byte) 95, var3);
        }
    }
}
