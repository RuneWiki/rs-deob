import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class640 extends class766 {

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "Ljava/lang/String;")
    public String field9016;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "Z")
    public static boolean field9011 = false;

    @OriginalMember(owner = "client!oca", name = "r", descriptor = "[F")
    public static float[] field9015 = new float[16384];

    @OriginalMember(owner = "client!oca", name = "q", descriptor = "[F")
    public static float[] field9014 = new float[16384];

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "F")
    public static float field9017 = 1.0F;

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    public static int field9012 = -1;

    @OriginalMember(owner = "client!oca", name = "v", descriptor = "I")
    public static int field9019 = 0;

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "I")
    public static int field9018;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field9015[var2] = (float) Math.sin((double) var2 * var0);
            field9014[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method3633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -35) {
            field9017 = 0.4340199F;
        }
        for (int var5 = 0; var5 < class538.field7479; var5++) {
            Rectangle var6 = class342.field4863[var5];
            if (arg0 < var6.x + var6.width && (arg0 + arg4) > var6.x && (var6.y + var6.height) > arg2 && (arg1 + arg2) > var6.y) {
                class780.field10685[var5] = true;
            }
        }
        field9013++;
        class528.method3090(3985, arg2 + arg1, arg2, arg0, arg0 + arg4);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V", line = 38)
    public static void method3634(byte arg0) {
        field9014 = null;
        if (arg0 != 57) {
            field9017 = 0.34135902F;
        }
        field9015 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)I", line = 49)
    public static final int method3635(int arg0, int arg1) {
        if (arg0 != 26171) {
            method3634((byte) -25);
        }
        field9018++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V", line = 78)
    public class640() {
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 94)
    public class640(String arg0, int arg1) {
        this.field9016 = arg0;
    }
}
