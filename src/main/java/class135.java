import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class135 extends class305 {

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[F")
    public static float[] field1804 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lvd;")
    public static class39 field1809;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return -21;
        } else {
            ++field1808;
            return super.field4323.method4104(74).method3290(27945) ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(ILhb;)V")
    public class135(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        ++field1805;
        if (arg0 != -27751) {
            method954((byte) -81);
        }
        super.field4320 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method952(int arg0) {
        ++field1807;
        if (arg0 < 71) {
            method952(-42);
        }
        ++class466.field6825;
        class468 var1 = class93.method734(class29.field284, class346.field4997, 8174);
        var1.field6839.method3730(122, 0);
        class120.method872((byte) 127, var1);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            method952(79);
        }
        ++field1810;
        return 1;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I")
    public final int method953(int arg0) {
        ++field1803;
        if (arg0 != 17503) {
            this.method305((byte) 127);
        }
        return super.field4320;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lhb;)V")
    public class135(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field1806;
        if (super.field4320 < 1 || super.field4320 > 3) {
            super.field4320 = this.method305((byte) 68);
        }
        if (arg0 >= -40) {
            this.method306(15, 49);
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public static void method954(byte arg0) {
        int var1 = 74 / ((arg0 - 41) / 47);
        field1804 = null;
        field1809 = null;
    }
}
