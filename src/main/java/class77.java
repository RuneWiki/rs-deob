import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class77 extends class538 implements class194 {

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "Lrg;")
    public static class596 field1007 = new class596(6, 7);

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "Llaa;")
    public static class105 field1014;

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Llj;I[BIZ)V", line = 4)
    public class77(class565 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1015 = arg1;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)I", line = 12)
    public final int method590(int arg0) {
        ++field1011;
        int var2 = 123 / ((arg0 - -23) / 36);
        return this.field1015;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)I", line = 23)
    public final int method591(boolean arg0) {
        ++field1013;
        if (!arg0) {
            field1014 = null;
        }
        return super.field7271;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)V", line = 41)
    public static void method592(int arg0) {
        if (arg0 == -10336) {
            field1014 = null;
            field1007 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)J", line = 53)
    public final long method593(int arg0) {
        ++field1009;
        return arg0 != -24269 ? 112L : 0L;
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)V", line = 64)
    public final void method594(int arg0) {
        int var2 = -126 % ((arg0 - 14) / 61);
        super.field7273.method3232((byte) 126, this);
        ++field1006;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[BII)V", line = 75)
    public final void method595(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method3044(arg3 + 24007, arg1, arg2);
        ++field1012;
        this.field1015 = arg0;
        if (arg3 != -24007) {
            this.method593(69);
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Llj;ILjaclib/memory/Buffer;IZ)V", line = 89)
    public class77(class565 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1015 = arg1;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZIIFIIIB)[I", line = 97)
    public static final int[] method596(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, byte arg7) {
        ++field1008;
        int[] var8 = new int[arg4];
        class629 var9 = new class629();
        var9.field8723 = arg1;
        var9.field8732 = arg6;
        var9.field8729 = (int) (arg3 * 4096.0F);
        var9.field8720 = arg2;
        var9.field8717 = arg5;
        var9.field8726 = arg0;
        var9.method29((byte) -47);
        class360.method2061((byte) 87, arg4, 1);
        if (arg7 >= -70) {
            method596(false, -13, 126, -1.5741864F, 100, 48, -67, (byte) 22);
        }
        var9.method3522(var8, 0, 4095);
        return var8;
    }
}
