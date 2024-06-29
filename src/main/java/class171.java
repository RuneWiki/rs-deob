import jaggl.memory.NativeBuffer;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class171 extends class60 implements class1 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private int field2540;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lbd;")
    public static class44 field2541 = new class44("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lbt;ILjaggl/memory/NativeBuffer;)V")
    public class171(class33 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field2540 = arg1;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lbt;I[BI)V")
    public class171(class33 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2540 = arg1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III[B)V")
    public final void method1(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field2539;
        this.method510(arg3, arg1);
        this.field2540 = arg0;
        if (arg2 < 55) {
            field2548 = -123;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)I")
    public final int method2(boolean arg0) {
        if (arg0) {
            this.method3(true);
        }
        ++field2546;
        return this.field2540;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1208(byte arg0, String arg1) {
        class10.method52("", 33, 0, arg1, "", 0);
        int var2 = 56 / ((-28 - arg0) / 48);
        ++field2547;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILl;Ljava/awt/Canvas;I)Lqa;")
    public static final class167 method1209(int arg0, class16 arg1, Canvas arg2, int arg3) {
        ++field2543;
        if (arg0 != 9) {
            field2548 = -3;
        }
        return new class85(arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
    public final int method4(int arg0) {
        if (arg0 > -24) {
            return -99;
        } else {
            ++field2545;
            return 0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Z")
    public static final boolean method1210(int arg0, int arg1) {
        ++field2544;
        if (arg1 != -11) {
            return true;
        } else {
            return arg0 == 9 || ~arg0 == -11 || arg0 == 11;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)J")
    public final long method3(boolean arg0) {
        if (arg0) {
            this.field2540 = -18;
        }
        ++field2542;
        return super.field1080.method2641();
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method1211(int arg0) {
        field2541 = null;
        if (arg0 != 0) {
            method1210(-94, -48);
        }
    }

    static {
        new class44("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        new class44("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
