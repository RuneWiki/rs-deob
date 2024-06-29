import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class440 {

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field6579 = 0;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "[I")
    public static int[] field6578 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Lpi;")
    public static class342 field6580 = new class342("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "[Lwg;")
    public static class291[] field6581 = new class291[14];

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "[Lvr;")
    public static class89[] field6577;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public static void method2641(int arg0) {
        field6577 = null;
        field6580 = null;
        if (arg0 != 1) {
            method2641(-82);
        }
        field6578 = null;
        field6581 = null;
    }
}
