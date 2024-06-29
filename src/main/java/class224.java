import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class224 extends class305 {

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    private int field3419;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
    public static int field3421 = 0;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field3420;
        int[] var3 = super.field4677.method2174(arg0, -126);
        if (arg1 != 4688) {
            field3421 = -39;
        }
        if (super.field4677.field5040) {
            class325.method2134(var3, 0, class91.field1471, this.field3419);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
    public static final byte[] method1545(int arg0, int arg1, int arg2, Object arg3) {
        ++field3422;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class350.method2248(16, arg1, arg0, var4);
        } else if (arg3 instanceof class199) {
            class199 var5 = (class199) arg3;
            return var5.method1027(arg0, false, arg1);
        } else {
            int var6 = 74 % ((19 - arg2) / 34);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 >= 76) {
            if (~arg0 == -1) {
                this.field3419 = (arg1.method1337((byte) 113) << 12) / 255;
            }
            ++field3418;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class224() {
        this(4096);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILso;Lso;)V")
    public static final void method1546(int arg0, int arg1, int arg2, class202 arg3, class202 arg4) {
        class281 var5 = class141.method1018(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field4376 = arg3;
            var5.field4389 = arg4;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
    public class224(int arg0) {
        super(0, true);
        this.field3419 = 4096;
        this.field3419 = arg0;
    }
}
