import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class595 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lwr;")
    public class388 field8612;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field8613;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Luf;")
    public static class380 field8604;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lbaa;II)V")
    public abstract void method301(class445 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public void method1489(int arg0) {
        field8605++;
        if (arg0 != -1) {
            this.method1487(true);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public void method1485(int arg0) {
        field8608++;
        if (arg0 != -1) {
            this.field8612 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public void method1488(byte arg0) {
        field8609++;
        if (arg0 != 4) {
            this.method297((byte) -88);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIZZ)V")
    public static final void method3520(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg4) {
            field8613 = null;
        }
        field8607++;
        if (class377.method2232(125, arg2)) {
            class440.method2598(class618.field8850[arg2], arg1, arg0, arg3, -1, 125);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZZ)V")
    public abstract void method302(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Z")
    public abstract boolean method297(byte arg0);

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
    public void method1484(byte arg0) {
        if (arg0 >= -123) {
            this.method297((byte) -68);
        }
        field8611++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)V")
    public abstract void method299(int arg0, boolean arg1);

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V")
    public static void method3521(byte arg0) {
        if (arg0 == 7) {
            field8604 = null;
            field8613 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public void method1486(int arg0) {
        if (arg0 <= 113) {
            this.method302(true, false);
        }
        field8606++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public void method1487(boolean arg0) {
        field8610++;
        if (arg0) {
            this.method301(null, -94, 117);
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(B)V")
    public abstract void method298(byte arg0);

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lwr;)V")
    public class595(class388 arg0) {
        this.field8612 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public abstract void method303(int arg0, int arg1, int arg2);

    static {
        new class104("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field8613 = null;
    }
}
