import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class222 extends class260 {

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "[I")
    public static int[] field3055 = new int[8];

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IB)V", line = 4)
    public final void method9(int arg0, byte arg1) {
        super.field3868 = arg0;
        if (arg1 == -107) {
            ++field3051;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lfca;)V", line = 15)
    public class222(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 20)
    public final void method2(boolean arg0) {
        if (super.field3868 != 1 && ~super.field3868 != -1) {
            super.field3868 = this.method8((byte) 4);
        }
        if (!arg0) {
            ++field3057;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(ILfca;)V", line = 34)
    public class222(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 37)
    public static void method1476(int arg0) {
        field3055 = null;
        if (arg0 != -11905) {
            field3055 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)I", line = 49)
    public final int method4(int arg0, byte arg1) {
        int var3 = -100 / ((-53 - arg1) / 50);
        ++field3054;
        return 1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I", line = 64)
    public final int method8(byte arg0) {
        ++field3056;
        if (arg0 != 4) {
            this.method9(-1, (byte) -87);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)I", line = 75)
    public final int method1477(int arg0) {
        ++field3053;
        return arg0 < 3 ? -94 : super.field3868;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V", line = 86)
    public static final void method1478(byte arg0) {
        if (class23.field367 == null) {
            class628 var1 = new class628();
            byte[] var2 = var1.method3532(16, -31095, 128, 128);
            class23.field367 = class229.method1498(var2, false, -137);
        }
        ++field3052;
        if (class29.field419 == null) {
            class10 var3 = new class10();
            byte[] var4 = var3.method83(-93, 128, 128, 16);
            class29.field419 = class229.method1498(var4, false, -137);
        }
        if (arg0 > -91) {
            field3055 = null;
        }
    }
}
