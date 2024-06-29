import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class551 {

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public int field8219 = 128;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public int field8217 = 128;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public int field8223;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public int field8213;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public int field8220;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public int field8226;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Z")
    public static volatile boolean field8214 = true;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field8224 = 0;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public int field8215;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public int field8216;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public int field8221;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public int field8222;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lrg;I)V", line = 8)
    public final void method3337(class551 arg0, int arg1) {
        this.field8219 = arg0.field8219;
        field8225++;
        this.field8226 = arg0.field8226;
        this.field8220 = arg0.field8220;
        this.field8217 = arg0.field8217;
        this.field8213 = arg0.field8213;
        this.field8223 = arg0.field8223;
        if (arg1 >= -49) {
            this.method3338((byte) 30);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Lrg;", line = 27)
    public final class551 method3338(byte arg0) {
        field8218++;
        if (arg0 <= 113) {
            this.method3337(null, -99);
        }
        return new class551(this.field8223, this.field8219, this.field8217, this.field8213, this.field8220, this.field8226);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V", line = 58)
    public class551(int arg0) {
        this.field8223 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIII)V", line = 65)
    private class551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8213 = arg3;
        this.field8217 = arg2;
        this.field8223 = arg0;
        this.field8220 = arg4;
        this.field8226 = arg5;
        this.field8219 = arg1;
    }
}
