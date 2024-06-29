import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class22 extends class296 {

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
    public final void method134(int arg0, int arg1, int arg2) {
        ++field273;
        int var4 = this.field278 * arg0 >> 12;
        int var5 = this.field277 * arg0 >> 12;
        int var6 = this.field272 * arg1 >> 12;
        int var7 = this.field276 * arg1 >> 12;
        class220.method1387(var7, false, var5, var4, super.field3920, var6);
        if (arg2 >= -125) {
            this.method135(-54, (byte) -98, -93);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIIII)V")
    public class22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field272 = arg1;
        this.field276 = arg3;
        this.field278 = arg0;
        this.field277 = arg2;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)V")
    public final void method135(int arg0, byte arg1, int arg2) {
        ++field279;
        int var4 = this.field278 * arg0 >> 12;
        int var5 = this.field277 * arg0 >> 12;
        if (arg1 > 20) {
            int var6 = this.field272 * arg2 >> 12;
            int var7 = this.field276 * arg2 >> 12;
            class471.method2720(super.field3919, var5, super.field3920, var6, 0, super.field3918, var7, var4);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)V")
    public final void method136(byte arg0, int arg1, int arg2) {
        ++field274;
        if (arg0 != 122) {
            this.field278 = -86;
        }
        int var4 = this.field278 * arg2 >> 12;
        int var5 = this.field277 * arg2 >> 12;
        int var6 = this.field272 * arg1 >> 12;
        int var7 = this.field276 * arg1 >> 12;
        class195.method1273(0, var7, var4, super.field3919, var6, super.field3918, var5);
    }
}
