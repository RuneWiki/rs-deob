import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class404 {

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "S")
    public short field5927;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Z")
    public boolean field5933;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "B")
    public byte field5932;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public int field5930;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "B")
    public byte field5928;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "S")
    public short field5929;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "S")
    public short field5935;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Lri;")
    public static class74 field5931 = new class74(13, 3);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "Ldn;")
    public static class357 field5937;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 9)
    public static void method2433(int arg0) {
        field5937 = null;
        if (arg0 == 3) {
            field5931 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)Lcr;", line = 25)
    public final class404 method2434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 3) {
            this.field5933 = false;
        }
        field5936++;
        return new class404(arg1, arg3, arg0, arg4, this.field5935, this.field5927, this.field5929, this.field5932, this.field5928, this.field5933);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 41)
    public class404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field5927 = (short) arg5;
        this.field5933 = arg9;
        this.field5932 = (byte) arg7;
        this.field5930 = arg0;
        this.field5928 = (byte) arg8;
        this.field5929 = (short) arg6;
        this.field5935 = (short) arg4;
    }
}
