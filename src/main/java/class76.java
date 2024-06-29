import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class76 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "[[[I")
    public static int[][][] field1314;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
    public static final void method544(boolean arg0) {
        if (class493.field7198 != 3) {
            class244.field4183 = class291.field4734;
        }
        if (!arg0) {
            method546(49);
        }
        field1311++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
    public static final void method545(int arg0, int arg1, int arg2, int arg3) {
        field1312++;
        class266 var4 = class308.method1961(true, arg3, arg2);
        var4.method1781((byte) 95);
        var4.field4454 = arg1;
        var4.field4453 = arg0;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public static void method546(int arg0) {
        if (arg0 != 0) {
            field1314 = null;
        }
        field1314 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILia;)Ljava/lang/String;")
    public static final String method547(int arg0, class23 arg1) {
        field1313++;
        if (arg0 != 32767) {
            field1314 = null;
        }
        return class118.method943(arg1, 32767, (byte) -27);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Lhc;")
    public static final class218 method548(int arg0, int arg1, int arg2) {
        class465 var3 = class66.field977[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6901;
    }

    static {
        new class306("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }
}
