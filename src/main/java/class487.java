import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class487 extends class498 {

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Lso;")
    public static class433 field6924 = new class433();

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Ldg;")
    public static class376 field6926 = new class376(29, 6);

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field6928 = -1;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "F")
    public static float field6927;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Lpga;")
    public static class494 field6929;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)V")
    public static void method2829(boolean arg0) {
        field6924 = null;
        if (arg0) {
            field6926 = null;
            field6929 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Z")
    public static final boolean method2830(int arg0, int arg1, int arg2) {
        ++field6921;
        int var3 = -24 / ((21 - arg1) / 53);
        return ~(arg0 & 384) != -1;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIIIF)V")
    public class487(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
    public final void method772(int arg0, int arg1, int arg2, int arg3) {
        super.field7064 = arg1;
        super.field7049 = arg2;
        if (arg3 <= 36) {
            this.method771((byte) -108, 1.1554446F);
        }
        super.field7059 = arg0;
        ++field6920;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lsf;")
    public static final class483 method2831(Canvas arg0, byte arg1) {
        ++field6922;
        if (arg1 >= -89) {
            return null;
        } else {
            try {
                Class var2 = Class.forName("jaa");
                class483 var3 = (class483) var2.newInstance();
                var3.method1664(11, arg0);
                return var3;
            } catch (Throwable var5) {
                class247 var4 = new class247();
                var4.method1664(120, arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)[Lff;")
    public static final class9[] method2832(byte arg0) {
        ++field6923;
        if (arg0 != 39) {
            field6928 = 78;
        }
        return new class9[] { class318.field4688, class539.field7550, class60.field1145, class187.field2697, class539.field7542, class270.field4057, class55.field1074, class103.field1616, class106.field1640, class360.field5173, class623.field8727, class632.field8822, class513.field7257, class34.field584 };
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BF)V")
    public final void method771(byte arg0, float arg1) {
        ++field6925;
        super.field7057 = arg1;
        int var3 = 61 / ((-46 - arg0) / 52);
    }
}
