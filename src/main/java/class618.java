import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class618 {

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "I")
    public int field8932 = -1;

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
    public static int field8934 = 1405;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "Lsfa;")
    public static class693 field8927;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "Lwga;")
    public class745 field8926;

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "[I")
    public int[] field8933;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field8929;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V")
    public static final void method3578(int arg0) {
        if (arg0 != 24584) {
            method3578(64);
        }
        field8930++;
        class159.method1205(-20915);
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V")
    public static void method3579(int arg0) {
        field8927 = null;
        if (arg0 != 16501) {
            method3578(-24);
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Z")
    public static final boolean method3580(int arg0, int arg1, int arg2) {
        if (arg0 == 544) {
            field8931++;
            return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
        } else {
            return true;
        }
    }
}
