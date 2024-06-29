import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class331 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4576 = new Rectangle[100];

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lvt;")
    public static class344 field4579;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "F")
    public static float field4580;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!ei", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4575++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLjq;)Ljq;")
    public static final class447 method2082(byte arg0, class447 arg1) {
        field4577++;
        class447 var2 = client.method3570(arg1);
        if (var2 == null) {
            var2 = arg1.field6297;
        }
        int var3 = 99 % ((65 - arg0) / 51);
        return var2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method2083(byte arg0) {
        field4576 = null;
        field4579 = null;
        if (arg0 != 53) {
            field4579 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4576[var0] = new Rectangle();
        }
        field4578 = 0;
        field4579 = new class344("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
        new class344(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    }
}
