import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class377 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public int field5018 = 0;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "Lcea;")
    public static class180 field5024 = new class180("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "Lvj;")
    public static class373 field5025 = new class373(97, -2);

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "Ldn;")
    public static class438 field5020;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILos;)V")
    private final void method2193(int arg0, int arg1, class374 arg2) {
        int var4 = -54 % ((-arg0 - 78) / 35);
        if (arg1 == 5) {
            this.field5018 = arg2.method2136(false);
        }
        field5023++;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BLos;)V")
    public final void method2194(byte arg0, class374 arg1) {
        while (true) {
            int var3 = arg1.method2129(-126);
            if (var3 == 0) {
                if (arg0 != -30) {
                    return;
                }
                field5022++;
                return;
            }
            this.method2193(-117, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZI)V")
    public static final void method2195(int arg0, boolean arg1, int arg2) {
        field5021++;
        class91.field1121 = 3;
        if (arg0 > -74) {
            return;
        }
        class184.field2230 = arg2;
        class289.method1626(class644.field9387.field2713, class644.field9387.field2715, 93);
        if (arg1) {
            class81.method476(false, 10, "", "");
        } else {
            class398.method2285(1);
            class81.method476(false, -119, class315.field4025, class369.field4870);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public static void method2196(int arg0) {
        field5020 = null;
        field5024 = null;
        if (arg0 < 4) {
            method2195(59, true, -122);
        }
        field5025 = null;
    }
}
