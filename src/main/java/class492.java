import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class492 extends class544 {

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "S")
    public short field6867;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "Lcea;")
    public static class180 field6866 = new class180("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "Loca;")
    public static class220 field6865;

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
    public class492() {
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2840(int arg0, String arg1, int arg2) {
        field6864++;
        class557 var3 = class93.method564(arg0, -14073, arg2);
        var3.method3257(1948);
        var3.field8216 = arg1;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(S)V")
    public class492(short arg0) {
        this.field6867 = arg0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public static void method2841(byte arg0) {
        field6865 = null;
        field6866 = null;
        if (arg0 >= -100) {
            method2841((byte) 104);
        }
    }
}
