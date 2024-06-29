import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class302 extends class71 {

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    private int field5368;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field5366 = 0;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field5374 = 0;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "Lbn;")
    public static class66 field5371;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "Lgf;")
    public static class8 field5373;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IB)[I", line = 5)
    public final int[] method199(int arg0, byte arg1) {
        field5372++;
        if (arg1 > -69) {
            this.method199(112, (byte) -85);
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            class25.method221(var3, 0, class215.field3787, this.field5368);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lok;III)[Llj;", line = 26)
    public static final class50[] method2142(class149 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 10113) {
            field5367++;
            return class137.method1066(arg2, arg1 ^ 0x440F, arg0, arg3) ? class279.method1987(arg1 ^ 0xFFFFD814) : null;
        } else {
            return (class50[]) null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V", line = 46)
    private class302(int arg0) {
        super(0, true);
        this.field5368 = 4096;
        this.field5368 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V", line = 73)
    public static void method2143(int arg0) {
        field5371 = null;
        field5373 = null;
        if (arg0 != -1) {
            method2142((class149) null, -107, -87, 57);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 89)
    public class302() {
        this(4096);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZLvh;)V", line = 104)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (arg0 == 0) {
            this.field5368 = (arg2.method483(-116) << 12) / 255;
        }
        if (arg1) {
            field5370++;
        }
    }
}
