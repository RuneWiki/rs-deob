import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class48 extends class504 {

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[B")
    public static byte[] field684 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "Lmga;")
    public static class666 field690 = new class666(4);

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "F")
    public static float field693;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "Lii;")
    public static class519 field694;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "Lgba;")
    public class625 field688;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "Lgba;")
    public class625 field692;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Ljava/lang/String;")
    public String field685;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Z")
    public boolean field686;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "[Ljava/lang/Object;")
    public Object[] field681;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static void method332(int arg0) {
        field684 = null;
        field694 = null;
        if (arg0 == 19678) {
            field690 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static final void method333(byte arg0) {
        if (arg0 != 0) {
            method333((byte) 16);
        }
        class212.field3041 = false;
        field680++;
        class449.method2540((byte) -82);
    }
}
