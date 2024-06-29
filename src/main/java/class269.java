import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class269 extends class156 {

    @OriginalMember(owner = "client!wl", name = "Gb", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!wl", name = "Hb", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!wl", name = "Ib", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIB)V", line = 5)
    public static final void method1645(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field3772;
        class338 var5 = class380.method2294((byte) 76, arg2, 4);
        var5.method2052((byte) -34);
        var5.field4930 = arg1;
        var5.field4926 = arg0;
        var5.field4924 = arg3;
        if (arg4 == 116) {
            ;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(FI)V", line = 21)
    public final void method1646(float arg0, int arg1) {
        if (arg1 == -136782152) {
            ++field3774;
            int var3 = NativeStream.floatToRawIntBits(arg0);
            super.field2041[super.field2018++] = (byte) (var3 >> 24);
            super.field2041[super.field2018++] = (byte) (var3 >> 16);
            super.field2041[super.field2018++] = (byte) (var3 >> 8);
            super.field2041[super.field2018++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(FZ)V", line = 38)
    public final void method1647(float arg0, boolean arg1) {
        ++field3773;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field2041[super.field2018++] = (byte) var3;
        super.field2041[super.field2018++] = (byte) (var3 >> 8);
        super.field2041[super.field2018++] = (byte) (var3 >> 16);
        super.field2041[super.field2018++] = (byte) (var3 >> 24);
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V", line = 55)
    public class269(int arg0) {
        super(arg0);
    }
}
