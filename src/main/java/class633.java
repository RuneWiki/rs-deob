import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class633 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lmu;")
    public static class303 field8702 = new class303(40, -1);

    @OriginalMember(owner = "client!am", name = "e", descriptor = "[Lbja;")
    public static class32[] field8705 = new class32[37];

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[I")
    public static int[] field8704 = new int[3];

    @OriginalMember(owner = "client!am", name = "f", descriptor = "[I")
    public static int[] field8706 = new int[250];

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 8)
    public static void method3612(byte arg0) {
        if (arg0 > 54) {
            field8702 = null;
            field8706 = null;
            field8704 = null;
            field8705 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V", line = 21)
    public static final void method3613(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class697.field9413; var5++) {
            Rectangle var6 = class27.field743[var5];
            if ((var6.x + var6.width) > arg0 && var6.x < (arg0 + arg1) && (var6.y + var6.height) > arg2 && var6.y < arg2 + arg4) {
                class286.field3995[var5] = true;
            }
        }
        field8701++;
        class546.method3152(arg3 - 5590, arg0, arg0 + arg1, arg2, arg2 + arg4);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lga;ZZ)V", line = 42)
    public static final void method3614(class404 arg0, boolean arg1, boolean arg2) {
        arg0.field5936 = arg2;
        if (!class719.field9783) {
            class479.method2810(arg0, class375.field5308);
        } else if (arg1) {
            class516.field7188[class516.field7188.length - 1].method3471(arg0, false);
        } else {
            int var3 = class108.method968(arg0.field5931);
            int var4 = class684.field9265[2] * arg0.method37(-25675) / arg0.field5934;
            int var5 = class108.method968(arg0.field5931 - var4);
            int var6 = class108.method968(arg0.field5931 + var4);
            if (var5 == var6) {
                class516.field7188[var3].method3471(arg0, false);
            } else if (var6 - var5 == 1) {
                class516.field7188[class165.field2594 + var5].method3471(arg0, false);
            } else {
                class516.field7188[class516.field7188.length - 1].method3471(arg0, false);
            }
        }
    }
}
