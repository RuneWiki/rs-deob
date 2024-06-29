import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class586 {

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public int field8503;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field8504;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Ldc;")
    public static class302 field8500 = new class302();

    @OriginalMember(owner = "client!il", name = "l", descriptor = "[Z")
    public static boolean[] field8509 = new boolean[100];

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field8505;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public int field8506;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public int field8508;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Lq;")
    public class151 field8502;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "Ljj;")
    public static class236 field8507;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lil;")
    public class586 field8499;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Lkq;")
    public final class696 method3349(int arg0) {
        if (arg0 == 100) {
            field8501++;
            return class108.method819(this.field8504, (byte) 32);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Lil;")
    public final class586 method3350(int arg0, int arg1) {
        if (arg1 != 100) {
            field8509 = null;
        }
        field8498++;
        return new class586(this.field8504, arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method3351(byte arg0) {
        field8509 = null;
        field8500 = null;
        field8507 = null;
        if (arg0 > -65) {
            field8500 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(II)V")
    public class586(int arg0, int arg1) {
        this.field8503 = arg1;
        this.field8504 = arg0;
    }
}
