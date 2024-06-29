import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class410 {

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "[S")
    public static short[] field5614;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5615;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lch;")
    public static class151 field5616;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public int field5610;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public int field5612;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public int field5613;

    static {
        new class151("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field5614 = new short[256];
        field5615 = new String[100];
        field5616 = new class151("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILkk;)V", line = 4)
    public final void method2452(int arg0, class161 arg1) {
        field5611++;
        while (true) {
            int var3 = arg1.method1172((byte) -111);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    field5616 = null;
                    return;
                }
            }
            this.method2454(113, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 25)
    public static void method2453(int arg0) {
        if (arg0 != -1) {
            field5616 = null;
        }
        field5615 = null;
        field5614 = null;
        field5616 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILkk;)V", line = 56)
    private final void method2454(int arg0, int arg1, class161 arg2) {
        if (arg1 == 1) {
            this.field5612 = arg2.method1134(-16848);
            this.field5613 = arg2.method1172((byte) -112);
            this.field5610 = arg2.method1172((byte) 120);
        }
        int var4 = 52 % ((arg0 - 34) / 56);
        field5609++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLae;)V", line = 75)
    public static final void method2455(byte arg0, class172 arg1) {
        field5608++;
        class172 var2 = class133.method988((byte) 111, arg1);
        if (arg0 != 85) {
            field5616 = null;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class364.field5007;
            var4 = class431.field6099;
        } else {
            var3 = var2.field2554;
            var4 = var2.field2579;
        }
        class292.method1912(var3, var4, false, arg1, (byte) 67);
        class309.method1977(var4, var3, arg1, arg0 ^ 0x57);
    }
}
