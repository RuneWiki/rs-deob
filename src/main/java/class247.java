import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class247 {

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Lvs;")
    public class593 field3600;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "B")
    public byte field3595;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lio;")
    public static class439 field3593 = new class439(5, 1);

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[F")
    public static float[] field3601 = new float[4];

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Ltaa;")
    public static class409 field3594 = new class409(2);

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lut;")
    public class125 field3587;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lcba;")
    public class552 field3590;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Lia;")
    public class591 field3599;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lpn;")
    public class747 field3588;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method1642(int arg0) {
        field3601 = null;
        field3594 = null;
        field3593 = null;
        if (arg0 != 1) {
            method1642(-88);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Z")
    public final boolean method1643(int arg0) {
        int var2 = -53 / ((40 - arg0) / 40);
        field3591++;
        return this.field3595 == 2 || this.field3595 == 3;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(BIIIIIILvs;)V")
    public class247(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class593 arg7) {
        this.field3600 = arg7;
        this.field3586 = arg3;
        this.field3598 = arg1;
        this.field3596 = arg2;
        this.field3602 = arg4;
        this.field3595 = arg0;
        this.field3592 = arg6;
        this.field3597 = arg5;
    }
}
