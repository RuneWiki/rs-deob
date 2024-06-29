import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class251 {

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
    public int field3706 = 128;

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
    public int field3709 = 128;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
    public static int field3707 = 13156520;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "Lwia;")
    public static class791 field3710;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V", line = 7)
    public static void method1652(int arg0) {
        field3710 = null;
        if (arg0 != 128) {
            field3703 = 21;
        }
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(I)V", line = 64)
    public class251(int arg0) {
        this.field3711 = arg0;
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIII)V", line = 71)
    private class251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3709 = arg1;
        this.field3711 = arg0;
        this.field3704 = arg5;
        this.field3702 = arg3;
        this.field3708 = arg4;
        this.field3706 = arg2;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(BLrga;)V", line = 30)
    public final void method1653(byte arg0, class251 arg1) {
        this.field3711 = arg1.field3711;
        this.field3709 = arg1.field3709;
        this.field3706 = arg1.field3706;
        this.field3708 = arg1.field3708;
        this.field3704 = arg1.field3704;
        field3705++;
        if (arg0 != 104) {
            this.field3711 = -121;
        }
        this.field3702 = arg1.field3702;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)Lrga;", line = 46)
    public final class251 method1654(byte arg0) {
        field3712++;
        if (arg0 > -124) {
            this.field3711 = -126;
        }
        return new class251(this.field3711, this.field3709, this.field3706, this.field3702, this.field3708, this.field3704);
    }
}
