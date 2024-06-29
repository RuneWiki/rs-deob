import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class38 implements class169 {

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "Laj;")
    private class333 field585;

    @OriginalMember(owner = "client!uja", name = "g", descriptor = "I")
    public static int field589 = 0;

    @OriginalMember(owner = "client!uja", name = "i", descriptor = "Z")
    public static boolean field591 = false;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!uja", name = "d", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!uja", name = "e", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!uja", name = "f", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!uja", name = "h", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method266(boolean arg0) {
        field586++;
        if (!arg0) {
            method267(1.9383951F, -0.23207028F, 64, 1.1540762F, -17);
        }
        if (class406.field5886 != null && class224.field3075 != null) {
            return;
        }
        class406.field5886 = new int[256];
        class224.field3075 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class406.field5886[var1] = (int) (Math.sin(var2) * 4096.0D);
            class224.field3075[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(FFIFI)F", line = 40)
    public static final float method267(float arg0, float arg1, int arg2, float arg3, int arg4) {
        field587++;
        if (arg2 == -5853) {
            float[] var5 = class391.field5767[arg4];
            return var5[2] * arg3 + var5[0] * arg1 + var5[1] * arg0;
        } else {
            return -1.2987642F;
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)Ljq;", line = 56)
    public final class539 method268(int arg0) {
        if (arg0 != -12696) {
            method270(1, -117, 95, 90, 1);
        }
        field590++;
        return class539.field7327;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(B)I", line = 77)
    public final int method269(byte arg0) {
        field583++;
        int var2 = 6 / ((arg0 - 6) / 59);
        return this.field585.method2113(false) ? 100 : this.field585.method2103(-117);
    }

    @OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Laj;)V", line = 91)
    public class38(class333 arg0) {
        this.field585 = arg0;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIII)V", line = 102)
    public static final void method270(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field588++;
        if (arg0 != -2409) {
            return;
        }
        for (int var5 = 0; var5 < class131.field1940; var5++) {
            Rectangle var6 = class296.field4291[var5];
            if ((var6.x + var6.width) > arg1 && arg1 + arg4 > var6.x && (var6.y + var6.height) > arg3 && (arg2 + arg3) > var6.y) {
                class627.field8773[var5] = true;
            }
        }
        class716.method4001(arg1 + arg4, (byte) -102, arg2 + arg3, arg3, arg1);
    }
}
