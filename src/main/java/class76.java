import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class76 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1070 = 0;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lhj;")
    public static class29 field1074 = new class29(512);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
    public static int[] field1076 = new int[25];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lsd;")
    public static class27 field1072;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 14)
    public static void method612(byte arg0) {
        field1074 = null;
        field1076 = null;
        if (arg0 >= -7) {
            field1074 = (class29) null;
        }
        field1072 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I", line = 31)
    public static final int method613(byte arg0) {
        field1071++;
        if (class63.field951 != null) {
            return 3;
        } else if (class36.field534 && class106.field1634) {
            return 2;
        } else if (arg0 < 83) {
            return -2;
        } else if (class36.field534 && !class106.field1634) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIII)V", line = 55)
    public static final void method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1073++;
        if (class179.method1294(arg3, arg7 ^ 0x1)) {
            if (arg7 == 0) {
                class252.method1750(arg0, arg6, arg5, -1, class305.field4779[arg3], arg1, arg2, arg4, -1, arg8);
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class40.field597[var9] = true;
            }
        } else {
            class40.field597[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 90)
    public static final void method615(int arg0, Component arg1) {
        arg1.removeKeyListener(class126.field1994);
        field1075++;
        if (arg0 >= 112) {
            arg1.removeFocusListener(class126.field1994);
            class255.field3805 = -1;
        }
    }
}
