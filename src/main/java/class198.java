import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class198 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "Z")
    public boolean field3611 = true;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public int field3624;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public int field3623;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public int field3610;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "Lke;")
    private static class256 field3616 = class316.method2202("purple:", 27626);

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "[I")
    public static int[] field3612 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Lke;")
    public static class256 field3621 = class316.method2202("m", 27626);

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "[[[I")
    public static int[][][] field3613 = new int[4][13][13];

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Lke;")
    public static class256 field3622 = class316.method2202("Lade Wordpack )2 ", 27626);

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Lke;")
    public static class256 field3615 = class316.method2202("sch-Utteln:", 27626);

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Lke;")
    public static class256 field3618 = class316.method2202("::rebuild", 27626);

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "Lke;")
    public static class256 field3625 = field3616;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "Lke;")
    public static class256 field3626 = field3616;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "Ljava/awt/Frame;")
    public static Frame field3627;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "[Lke;")
    public static class256[] field3619;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 23)
    public static void method1425(int arg0) {
        if (arg0 > -19) {
            return;
        }
        field3613 = (int[][][]) null;
        field3625 = null;
        field3619 = null;
        field3618 = null;
        field3627 = null;
        field3616 = null;
        field3612 = null;
        field3622 = null;
        field3615 = null;
        field3626 = null;
        field3621 = null;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIIZ)V", line = 69)
    public class198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3617 = arg1;
        this.field3611 = arg6;
        this.field3624 = arg5;
        this.field3623 = arg2;
        this.field3620 = arg3;
        this.field3610 = arg0;
        this.field3614 = arg4;
    }
}
