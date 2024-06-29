import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class151 extends class512 {

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "Llo;")
    public static class306 field2417 = new class306("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "Z")
    public static boolean field2419 = false;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "Llo;")
    public static class306 field2420 = new class306("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "Ljc;")
    public static class356 field2421 = new class356(14, 4);

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
    public static int field2425 = 0;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "[I")
    public static int[] field2422 = new int[100];

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field2424 = 0;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "Lla;")
    public static class296 field2423;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)V", line = 4)
    public static void method1073(byte arg0) {
        if (arg0 != -65) {
            method1073((byte) -123);
        }
        field2422 = null;
        field2421 = null;
        field2423 = null;
        field2417 = null;
        field2420 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)[I", line = 18)
    public final int[] method75(int arg0, byte arg1) {
        ++field2418;
        int[] var3 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int var4 = class412.field6233[arg0];
            for (int var5 = 0; class402.field6113 > var5; ++var5) {
                var3[var5] = this.method1074(4096, var4, class276.field4540[var5]) % 4096;
            }
        }
        int var6 = 11 % ((arg1 - 43) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)I", line = 52)
    private final int method1074(int arg0, int arg1, int arg2) {
        ++field2416;
        if (arg0 != 4096) {
            return 89;
        } else {
            int var4 = arg1 * 57 + arg2;
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V", line = 70)
    public class151() {
        super(0, true);
    }
}
