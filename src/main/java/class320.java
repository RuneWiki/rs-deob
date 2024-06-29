import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class320 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lbi;")
    public static class104 field4978 = new class104(62, 16);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lbi;")
    public static class104 field4979 = new class104(108, 0);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lpt;")
    public static class403 field4981;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4980;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIIII)V")
    public static final void method2142(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class210.field3245 = 0L;
        field4977++;
        int var5 = class5.method47(-1129530388);
        if (~arg3 == arg4 || var5 == 3) {
            arg0 = true;
        }
        if (!class19.field198.method1304()) {
            arg0 = true;
        }
        class398.method2569(arg3, arg2, arg0, arg1, (byte) 97, var5);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static void method2143(boolean arg0) {
        field4981 = null;
        field4979 = null;
        field4978 = null;
        field4980 = null;
        if (!arg0) {
            method2142(false, 111, -120, -16, 98);
        }
    }
}
