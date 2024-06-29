import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class550 implements class126 {

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public int field7520;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public int field7519;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    public int field7525;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public int field7518;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "Lhv;")
    public class97 field7524;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "Lrn;")
    public class380 field7522;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public int field7517;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "Ljj;")
    public static class398 field7523 = new class398(51, -1);

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "[I")
    public static int[] field7526 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)V")
    public static void method3090(byte arg0) {
        field7526 = null;
        int var1 = -113 % ((-arg0 - 88) / 34);
        field7523 = null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)Ljv;")
    public class606 method472(byte arg0) {
        if (arg0 != -110) {
            this.field7522 = null;
        }
        field7521++;
        return null;
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lrn;Lhv;IIIII)V")
    public class550(class380 arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7520 = arg6;
        this.field7519 = arg5;
        this.field7525 = arg3;
        this.field7518 = arg2;
        this.field7524 = arg1;
        this.field7522 = arg0;
        this.field7517 = arg4;
    }
}
