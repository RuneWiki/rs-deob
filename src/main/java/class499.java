import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class499 implements Runnable {

    @OriginalMember(owner = "client!no", name = "f", descriptor = "[Lon;")
    public volatile class223[] field7322 = new class223[2];

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Z")
    public volatile boolean field7318 = false;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "Z")
    public volatile boolean field7320 = false;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "Los;")
    public static class309 field7317 = new class309("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!no", name = "e", descriptor = "Lmo;")
    public static class531 field7321 = new class531(2, 18);

    @OriginalMember(owner = "client!no", name = "j", descriptor = "Ls;")
    public static class186 field7326;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "Lje;")
    public static class278 field7327;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "Los;")
    public static class309 field7328;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "[I")
    public static int[] field7330;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "Llt;")
    public class480 field7325;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "[I")
    public static int[] field7329;

    static {
        new class309("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field7326 = new class186(94, -1);
        field7327 = new class278(8, 0, 4, 1);
        field7328 = new class309("glow2:", "leuchten2:", "brillant2:", "brilho2:");
        field7330 = new int[25];
        new class309("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field7331 = 0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZ)I", line = 3)
    public static final int method3009(int arg0, int arg1, boolean arg2) {
        field7319++;
        if (arg2) {
            return 0;
        }
        if (arg1 > -62) {
            field7321 = null;
        }
        class11 var3 = class271.method1714(arg0, 0, arg2);
        if (var3 == null) {
            return class169.field2755.method2680(5, arg0).field2960;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field151.length; var5++) {
            if (var3.field151[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class169.field2755.method2680(5, arg0).field2960 - var3.field151.length);
    }

    @OriginalMember(owner = "client!no", name = "run", descriptor = "()V", line = 39)
    public final void run() {
        this.field7320 = true;
        field7323++;
        try {
            while (!this.field7318) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class223 var2 = this.field7322[var1];
                    if (var2 != null) {
                        var2.method1492((byte) -10);
                    }
                }
                class50.method470(10L, -5);
                class463.method2777(this.field7325, null, 1001);
            }
        } catch (Exception var9) {
            class486.method2913(null, var9, (byte) -126);
        } finally {
            Object var6 = null;
            this.field7320 = false;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 77)
    public static void method3010(byte arg0) {
        field7328 = null;
        field7321 = null;
        field7326 = null;
        field7317 = null;
        field7327 = null;
        field7329 = null;
        field7330 = null;
        if (arg0 > -94) {
            method3010((byte) 70);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)I", line = 95)
    public static final int method3011(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method3010((byte) -114);
        }
        field7324++;
        return arg1 == 4 || arg1 == 5 ? class529.field7721[arg0 & 0x3] : 256;
    }
}
