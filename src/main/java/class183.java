import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class183 extends class611 {

    @OriginalMember(owner = "client!vda", name = "T", descriptor = "Llga;")
    public static class712 field2232 = new class712(71, 7);

    @OriginalMember(owner = "client!vda", name = "Mb", descriptor = "F")
    public static float field2237 = 0.0F;

    @OriginalMember(owner = "client!vda", name = "Ib", descriptor = "Lea;")
    public static class547 field2233 = new class547(17, 8);

    @OriginalMember(owner = "client!vda", name = "Jb", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!vda", name = "Kb", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!vda", name = "Lb", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "(II)I", line = 3)
    public static final int method1035(int arg0, int arg1) {
        if (arg0 != 8) {
            method1035(43, -97);
        }
        ++field2236;
        if (arg1 < 96) {
            return 0;
        } else {
            return arg1 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(I)V", line = 20)
    public class183(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "(I)V", line = 23)
    public static void method1036(int arg0) {
        if (arg0 >= -66) {
            method1035(-69, 69);
        }
        field2233 = null;
        field2232 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BF)V", line = 34)
    public final void method1037(byte arg0, float arg1) {
        int var3 = 73 % ((-49 - arg0) / 45);
        ++field2235;
        int var4 = Stream.floatToRawIntBits(arg1);
        super.field8529[super.field8520++] = (byte) (var4 >> 24);
        super.field8529[super.field8520++] = (byte) (var4 >> 16);
        super.field8529[super.field8520++] = (byte) (var4 >> 8);
        super.field8529[super.field8520++] = (byte) var4;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(BF)V", line = 49)
    public final void method1038(byte arg0, float arg1) {
        ++field2234;
        int var3 = Stream.floatToRawIntBits(arg1);
        if (arg0 != -52) {
            field2232 = null;
        }
        super.field8529[super.field8520++] = (byte) var3;
        super.field8529[super.field8520++] = (byte) (var3 >> 8);
        super.field8529[super.field8520++] = (byte) (var3 >> 16);
        super.field8529[super.field8520++] = (byte) (var3 >> 24);
    }
}
