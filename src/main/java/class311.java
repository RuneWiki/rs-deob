import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class311 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field4287 = 0;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4286 = 0;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
    public static int[] field4289 = new int[8];

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
    public static int[] field4290;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method1896(String arg0, int arg1, int arg2) {
        field4285++;
        if (arg1 != -1) {
            method1898(-71, 69, (byte) -111);
        }
        return class528.method3187(true, arg2, arg0, (byte) -106);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1897(int arg0) {
        if (arg0 <= 66) {
            field4289 = null;
        }
        field4289 = null;
        field4290 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIB)V")
    public static final void method1898(int arg0, int arg1, byte arg2) {
        field4284++;
        int var3 = class470.field6636.method2126((byte) 74, class13.field118.method3408(96, class63.field795));
        for (class583 var4 = (class583) class174.field2677.method124((byte) 42); var4 != null; var4 = (class583) class174.field2677.method120(71)) {
            int var8 = class526.method3100(var4, 8359);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        if (arg2 < 84) {
            field4287 = -19;
        }
        var3 += 8;
        int var5 = class103.field1484 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (class165.field2605 < var3 + var6) {
            var6 = class165.field2605 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (class47.field562 < arg1 + var5) {
            var7 = class47.field562 - var5;
        }
        class37.field454 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class340.field4704 = var3;
        class131.field1805 = (class398.field5469 ? 26 : 22) + class103.field1484 * 16;
        class446.field6245 = true;
        class483.field6896 = var7;
    }

    static {
        new class572("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }
}
