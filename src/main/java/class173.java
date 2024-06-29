import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class173 implements Runnable {

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "[Lsl;")
    public volatile class460[] field2679 = new class460[2];

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Z")
    public volatile boolean field2676 = false;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Z")
    public volatile boolean field2677 = false;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Lpn;")
    public static class49 field2678 = new class49(18, 16);

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Lgt;")
    public class66 field2674;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method1237(int arg0) {
        field2678 = null;
        if (arg0 != 10) {
            method1238(-63);
        }
    }

    @OriginalMember(owner = "client!nn", name = "run", descriptor = "()V")
    public final void run() {
        field2675++;
        this.field2677 = true;
        try {
            while (!this.field2676) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class460 var2 = this.field2679[var1];
                    if (var2 != null) {
                        var2.method2818((byte) -73);
                    }
                }
                class468.method2848(10L, (byte) -87);
                class488.method2947(null, this.field2674, 80);
            }
        } catch (Exception var9) {
            class197.method1407(true, null, var9);
        } finally {
            Object var6 = null;
            this.field2677 = false;
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
    public static final void method1238(int arg0) {
        field2680++;
        class256.field4112 = false;
        class252.method1795(class162.field2451, class404.field5975, class354.field5246, class304.field4657, false);
        if (arg0 != 10) {
            method1238(58);
        }
    }

    static {
        new class179("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
