import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class675 implements class481 {

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field9686 = 0;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field9684 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field9683;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 8)
    public static void method3837(int arg0) {
        field9683 = null;
        if (arg0 != -10926) {
            field9685 = 104;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lfa;ILjn;Ljava/awt/Canvas;I)Lr;", line = 20)
    public static final class165 method3838(class212 arg0, int arg1, class668 arg2, Canvas arg3, int arg4) {
        field9687++;
        if (!class19.method334(-31431)) {
            throw new RuntimeException("");
        } else if (class602.method3469(6298, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg1);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            if (arg4 != 8833) {
                field9684 = -95;
            }
            class349 var8 = new class349(var5, arg3, var6, arg0, arg2, arg1);
            var8.method2336(6);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[ILgfa;J)Ljava/lang/String;", line = 54)
    public final String method2813(byte arg0, int[] arg1, class696 arg2, long arg3) {
        if (arg0 != 101) {
            method3837(15);
        }
        field9688++;
        if (class665.field9414 == arg2) {
            class40 var6 = class502.field7010.method1921(2, arg1[0]);
            return var6.method454(0, (int) arg3);
        } else if (class158.field1921 == arg2 || class519.field7616 == arg2) {
            class238 var7 = class65.field1021.method178(false, (int) arg3);
            return var7.field3261;
        } else if (class308.field4082 == arg2 || class171.field2091 == arg2 || class470.field6565 == arg2) {
            return class502.field7010.method1921(2, arg1[0]).method454(0, (int) arg3);
        } else {
            return null;
        }
    }
}
