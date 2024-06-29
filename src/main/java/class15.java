import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class15 {

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lph;")
    public static class229 field182 = class266.method1858("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 0);

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lph;")
    public static class229 field180 = class266.method1858("::rect_debug", 0);

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Lph;")
    public static class229 field184 = class266.method1858("V-Brification des mises -9 jour )2 ", 0);

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Lph;")
    public static class229 field179 = class266.method1858("Fallen lassen", 0);

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field186 = 0;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "[Z")
    public static boolean[] field185 = new boolean[5];

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[S")
    public static short[] field181 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "[I")
    public static int[] field176 = new int[32];

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "[I")
    public static int[] field187;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "[[I")
    public static int[][] field188;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method85(boolean arg0) {
        class115.field1953 = 0;
        class314.field5337 = 0;
        class225.field3700 = -1;
        class7.field97 = 0;
        class121.field2033.field2670 = 0;
        class296.field4837 = -1;
        class272.field4549 = 0;
        class186.field3027 = arg0;
        class187.field3052 = 0;
        class195.field3265 = -1;
        field183++;
        class68.field1086 = 0;
        class134.field2187 = -1;
        class88.field1497.field2670 = 0;
        for (int var1 = 0; var1 < class114.field1931.length; var1++) {
            if (class114.field1931[var1] != null) {
                class114.field1931[var1].field5118 = -1;
            }
        }
        for (int var2 = 0; var2 < class187.field3035.length; var2++) {
            if (class187.field3035[var2] != null) {
                class187.field3035[var2].field5118 = -1;
            }
        }
        class25.method153(2);
        class217.field3565 = 1;
        class80.method595(30, (byte) -126);
        for (int var3 = 0; var3 < 100; var3++) {
            class187.field3036[var3] = true;
        }
        class105.method803((byte) 107);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V", line = 65)
    public static final void method86(int arg0, int arg1) {
        field175++;
        class281 var2 = class135.method957(arg0, arg1, 4);
        var2.method1933(0);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field176[var1] = var0 - 1;
            var0 += var0;
        }
        field187 = new int[2];
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 90)
    public static void method87(byte arg0) {
        field181 = null;
        field184 = null;
        field176 = null;
        int var1 = -16 / ((-arg0 - 2) / 39);
        field182 = null;
        field187 = null;
        field188 = (int[][]) null;
        field185 = null;
        field179 = null;
        field180 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 106)
    public static final void method88(int arg0) {
        class80.field1326 = arg0;
        for (int var1 = 0; var1 < class88.field1504; var1++) {
            for (int var2 = 0; var2 < class129.field2114; var2++) {
                if (class225.field3705[arg0][var1][var2] == null) {
                    class225.field3705[arg0][var1][var2] = new class72(arg0, var1, var2);
                }
            }
        }
    }
}
