import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class49 {

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public int field689 = 128;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public int field694 = 128;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lgs;Z)V")
    public final void method460(class49 arg0, boolean arg1) {
        this.field687 = arg0.field687;
        this.field695 = arg0.field695;
        this.field694 = arg0.field694;
        if (!arg1) {
            this.field695 = -98;
        }
        this.field689 = arg0.field689;
        this.field692 = arg0.field692;
        field686++;
        this.field688 = arg0.field688;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZI)V")
    public static final void method461(int arg0, boolean arg1, int arg2) {
        field690++;
        if (!arg1) {
            class714 var3 = class350.method2072((long) arg2, 6, (byte) 123);
            var3.method4043(6380);
            var3.field10021 = arg0;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Lgs;")
    public final class49 method462(int arg0) {
        if (arg0 >= -40) {
            return null;
        } else {
            field693++;
            return new class49(this.field687, this.field689, this.field694, this.field692, this.field688, this.field695);
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(I)V")
    public class49(int arg0) {
        this.field687 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IIIIII)V")
    private class49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field689 = arg1;
        this.field687 = arg0;
        this.field694 = arg2;
        this.field692 = arg3;
        this.field688 = arg4;
        this.field695 = arg5;
    }
}
