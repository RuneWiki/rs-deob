import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class554 implements class549 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
    public boolean field7713;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lft;")
    public class4 field7710;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public int field7716;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field7707;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public int field7715;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public int field7717;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field7706;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lps;")
    public class105 field7709;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field7704;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "J")
    public static long field7711 = -1L;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lhu;")
    public static class143 field7705;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Llf;", line = 7)
    public final class251 method94(int arg0) {
        field7712++;
        if (arg0 != 1024) {
            this.field7715 = -46;
        }
        return class434.field5732;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 24)
    public static void method3247(int arg0) {
        field7705 = null;
        if (arg0 != 0) {
            method3247(-48);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(ILps;Lft;IIIIIIIZ)V", line = 45)
    public class554(int arg0, class105 arg1, class4 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field7708 = arg7;
        this.field7713 = arg10;
        this.field7710 = arg2;
        this.field7714 = arg4;
        this.field7716 = arg5;
        this.field7707 = arg0;
        this.field7715 = arg6;
        this.field7717 = arg3;
        this.field7706 = arg9;
        this.field7709 = arg1;
        this.field7704 = arg8;
    }
}
