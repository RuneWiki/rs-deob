import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class681 {

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public int field9468 = 128;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "I")
    public int field9471 = 128;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    public int field9472;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    public int field9466;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public int field9470;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public int field9467;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "[I")
    public static int[] field9465 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "Lmba;")
    public static class646 field9473 = new class646();

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field9464;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field9469;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V", line = 7)
    public static void method3837(byte arg0) {
        field9473 = null;
        field9465 = null;
        if (arg0 >= -21) {
            field9473 = null;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(I)V", line = 60)
    public class681(int arg0) {
        this.field9472 = arg0;
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(IIIIII)V", line = 67)
    private class681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9468 = arg1;
        this.field9472 = arg0;
        this.field9466 = arg3;
        this.field9470 = arg5;
        this.field9471 = arg2;
        this.field9467 = arg4;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILffa;)V", line = 29)
    public final void method3838(int arg0, class681 arg1) {
        this.field9466 = arg1.field9466;
        field9469++;
        this.field9467 = arg1.field9467;
        this.field9471 = arg1.field9471;
        if (arg0 > 27) {
            this.field9472 = arg1.field9472;
            this.field9468 = arg1.field9468;
            this.field9470 = arg1.field9470;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)Lffa;", line = 47)
    public final class681 method3839(byte arg0) {
        field9464++;
        int var2 = -114 / ((60 - arg0) / 48);
        return new class681(this.field9472, this.field9468, this.field9471, this.field9466, this.field9467, this.field9470);
    }
}
