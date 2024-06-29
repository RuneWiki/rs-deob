import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class35 {

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field416 = 128;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field413 = 128;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field419 = 0;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvd;Z)V")
    public final void method218(class35 arg0, boolean arg1) {
        this.field417 = arg0.field417;
        this.field416 = arg0.field416;
        this.field413 = arg0.field413;
        this.field414 = arg0.field414;
        field412++;
        this.field415 = arg0.field415;
        this.field411 = arg0.field411;
        if (arg1) {
            this.method219(-126);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V")
    public class35(int arg0) {
        this.field414 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Lvd;")
    public final class35 method219(int arg0) {
        if (arg0 != 0) {
            this.method219(-111);
        }
        field418++;
        return new class35(this.field414, this.field413, this.field416, this.field417, this.field415, this.field411);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIII)V")
    private class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field417 = arg3;
        this.field414 = arg0;
        this.field411 = arg5;
        this.field415 = arg4;
        this.field416 = arg2;
        this.field413 = arg1;
    }
}
