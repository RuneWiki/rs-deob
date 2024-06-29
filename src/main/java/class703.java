import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class703 extends class418 {

    @OriginalMember(owner = "client!ph", name = "Ib", descriptor = "I")
    public static int field9804 = 0;

    @OriginalMember(owner = "client!ph", name = "Jb", descriptor = "Lme;")
    public static class668 field9805 = new class668(8);

    @OriginalMember(owner = "client!ph", name = "Kb", descriptor = "[Lwca;")
    public static class36[] field9806 = new class36[4];

    @OriginalMember(owner = "client!ph", name = "Gb", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!ph", name = "Hb", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!ph", name = "Lb", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!ph", name = "Nb", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!ph", name = "Mb", descriptor = "Lra;")
    public static class361 field9808;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(BLjava/lang/String;)I", line = 3)
    public static final int method3845(byte arg0, String arg1) {
        if (arg0 != -94) {
            method3848(69);
        }
        ++field9807;
        return class174.method1179(arg1, true, -2442, 10);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(FI)V", line = 16)
    public final void method3846(float arg0, int arg1) {
        if (arg1 <= -9) {
            ++field9802;
            int var3 = Stream.floatToRawIntBits(arg0);
            super.field5393[super.field5367++] = (byte) var3;
            super.field5393[super.field5367++] = (byte) (var3 >> 8);
            super.field5393[super.field5367++] = (byte) (var3 >> 16);
            super.field5393[super.field5367++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(FI)V", line = 33)
    public final void method3847(float arg0, int arg1) {
        ++field9803;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field5393[super.field5367++] = (byte) (var3 >> 24);
        super.field5393[super.field5367++] = (byte) (var3 >> 16);
        int var4 = 69 % ((arg1 - 50) / 47);
        super.field5393[super.field5367++] = (byte) (var3 >> 8);
        super.field5393[super.field5367++] = (byte) var3;
    }

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "(I)V", line = 49)
    public static void method3848(int arg0) {
        field9808 = null;
        if (arg0 != -530554264) {
            method3845((byte) 26, (String) null);
        }
        field9805 = null;
        field9806 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V", line = 63)
    public class703(int arg0) {
        super(arg0);
    }
}
