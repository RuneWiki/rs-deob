import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class457 extends class138 {

    @OriginalMember(owner = "client!kj", name = "zb", descriptor = "Ljj;")
    public static class398 field6220 = new class398(15, 3);

    @OriginalMember(owner = "client!kj", name = "Ab", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!kj", name = "Bb", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!kj", name = "Cb", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!kj", name = "Db", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "(I)V", line = 3)
    public static void method2583(int arg0) {
        if (arg0 >= 56) {
            field6220 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "(I)V", line = 20)
    public static final void method2584(int arg0) {
        ++field6221;
        if (!class426.field5927) {
            class159.method1068(class285.field3867, 0);
            if (arg0 <= -22) {
                if (class644.field9128 != null) {
                    class159.method1068(class644.field9128, 0);
                }
                class426.field5927 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V", line = 43)
    public class457(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBIII)V", line = 49)
    public static final void method2585(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field6222;
        int var5 = -17 % ((28 - arg1) / 52);
        if (arg2 >= arg4) {
            class653.method3620(arg2, arg4, false, arg0, class319.field4673[arg3]);
        } else {
            class653.method3620(arg4, arg2, false, arg0, class319.field4673[arg3]);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IF)V", line = 67)
    public final void method2586(int arg0, float arg1) {
        ++field6223;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field1712[super.field1745++] = (byte) var3;
        super.field1712[super.field1745++] = (byte) (var3 >> 8);
        super.field1712[super.field1745++] = (byte) (var3 >> 16);
        if (arg0 == -26561) {
            super.field1712[super.field1745++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(FI)V", line = 85)
    public final void method2587(float arg0, int arg1) {
        ++field6224;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field1712[super.field1745++] = (byte) (var3 >> 24);
        super.field1712[super.field1745++] = (byte) (var3 >> 16);
        if (arg1 != -11186) {
            field6220 = null;
        }
        super.field1712[super.field1745++] = (byte) (var3 >> 8);
        super.field1712[super.field1745++] = (byte) var3;
    }
}
