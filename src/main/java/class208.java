import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class208 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lkn;")
    public static class442 field2861 = new class442("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
    public abstract void method1135(int arg0, int arg1);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method1348(int arg0) {
        class125.field1747.method900(0);
        field2859++;
        class50.field699.method900(0);
        class19.field353.method900(0);
        class440.field6187.method900(0);
        class155.field2181.method900(0);
        if (arg0 != 4670) {
            field2861 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static void method1349(int arg0) {
        field2861 = null;
        if (arg0 != -1) {
            method1349(-110);
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Lvk;")
    public abstract class207 method1146(int arg0);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[B")
    public abstract byte[] method1147(int arg0, int arg1);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1350(String arg0, byte arg1) {
        field2860++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        if (arg1 != -26) {
            return;
        }
        String var2 = class427.method2690(arg0, -23289);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class197.field2709; var3++) {
            String var4 = class249.field3517[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class427.method2690(var4, -23289);
            if (var5 != null && var5.equals(var2)) {
                class197.field2709--;
                for (int var6 = var3; var6 < class197.field2709; var6++) {
                    class249.field3517[var6] = class249.field3517[var6 + 1];
                    class303.field4182[var6] = class303.field4182[var6 + 1];
                    class245.field3464[var6] = class245.field3464[var6 + 1];
                    class69.field1017[var6] = class69.field1017[var6 + 1];
                    class187.field2528[var6] = class187.field2528[var6 + 1];
                }
                class159.field2236 = class367.field5186;
                class71.field1037++;
                class46.field648.method1178(63, 96);
                class46.field648.method173(class273.method1782((byte) 25, arg0), arg1 ^ 0xFFFFFF19);
                class46.field648.method160(arg0, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)I")
    public abstract int method1142(int arg0, boolean arg1);

    static {
        new class442("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }
}
