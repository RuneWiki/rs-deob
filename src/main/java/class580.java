import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class580 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Luc;")
    public static class27 field7768 = new class27(5, 6);

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[Liaa;")
    public static class462[] field7774 = null;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field7773 = 0;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lca;")
    public static class285 field7776 = new class285();

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
    public final int method3205(int arg0, int arg1, int arg2) {
        field7775++;
        int var4 = class309.field3890 <= arg0 ? arg0 : class309.field3890;
        if (class527.field6656 == this) {
            return 0;
        } else if (class509.field6375 == this) {
            return var4 - arg2;
        } else {
            if (arg1 != -7963) {
                field7773 = -84;
            }
            return class286.field3622 == this ? (var4 - arg2) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7772++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Canvas;BLe;)Loa;")
    public static final class650 method3206(Canvas arg0, byte arg1, class498 arg2) {
        field7771++;
        if (arg1 != -21) {
            method3209(-1);
        }
        return new class57(arg0, arg2);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lji;Z)Lio;")
    public static final class406 method3207(class572 arg0, boolean arg1) {
        field7769++;
        class690 var2 = class555.method2957((byte) 48, arg0);
        int var3 = arg0.method3064(-2031091464);
        if (!arg1) {
            field7774 = null;
        }
        int var4 = arg0.method3064(-2031091464);
        return new class406(var2.field9578, var2.field9576, var2.field9571, var2.field9577, var2.field9574, var2.field9572, var2.field9568, var2.field9570, var2.field9569, var3, var4);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static void method3208(int arg0) {
        field7776 = null;
        field7768 = null;
        if (arg0 != -26862) {
            field7776 = null;
        }
        field7774 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public static final void method3209(int arg0) {
        class129.field1566 = -1;
        if (arg0 <= -40) {
            class136.field1651 = null;
            field7770++;
        }
    }
}
