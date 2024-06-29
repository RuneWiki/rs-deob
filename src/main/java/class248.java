import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class248 {

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "B")
    public byte field3704;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    private int field3703;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Leh;")
    public class248 field3695;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lge;")
    public static class511 field3697 = new class511(20);

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Z")
    public static boolean field3714 = false;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field3711 = 2;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field3715 = -1;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public int field3706;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "[Llt;")
    public static class486[] field3713;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 14)
    public static void method1618(int arg0) {
        field3697 = null;
        if (arg0 > 110) {
            field3713 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)Lob;", line = 30)
    public final class529 method1619(boolean arg0) {
        field3698++;
        return arg0 ? null : class479.method2833(4096, this.field3703);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Leh;", line = 47)
    public final class248 method1620(int arg0, int arg1, int arg2, int arg3) {
        field3696++;
        if (arg1 != 20) {
            this.field3705 = 91;
        }
        return new class248(this.field3703, arg0, arg2, arg3, this.field3704);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIB)V", line = 68)
    public class248(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field3708 = arg3;
        this.field3704 = arg4;
        this.field3703 = arg0;
        this.field3710 = arg2;
        this.field3712 = arg1;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Leh;I)V", line = 79)
    public class248(class248 arg0, int arg1) {
        this.field3695 = arg0;
        this.field3703 = this.field3695.field3703;
        this.field3708 = this.field3695.field3708 + arg1;
        this.field3710 = this.field3695.field3710 + arg1;
        this.field3704 = this.field3695.field3704;
        this.field3712 = this.field3695.field3712 + arg1;
    }
}
