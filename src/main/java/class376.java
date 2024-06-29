import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class376 {

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public int field5324 = -1;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "[Lrp;")
    public static class400[] field5326 = new class400[16];

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "Luu;")
    public class258 field5330;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "[I")
    public int[] field5328;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "[Lbt;")
    public static class39[] field5329;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field5327;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ltt;IIIII)Ljava/awt/Frame;")
    public static final Frame method2189(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5325++;
        if (!arg0.method631(5631)) {
            return null;
        }
        if (arg5 == 0) {
            class18[] var6 = class632.method3514(true, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field271 == arg3 && var6[var8].field270 == arg2 && (arg1 == 0 || var6[var8].field267 == arg1) && (!var7 || var6[var8].field272 > arg5)) {
                    arg5 = var6[var8].field272;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class260 var9 = arg0.method620((byte) -48, arg5, arg2, arg3, arg1);
        if (arg4 != -6007) {
            field5329 = null;
        }
        while (var9.field3702 == 0) {
            class419.method2390(arg4 + 6133, 10L);
        }
        Frame var10 = (Frame) var9.field3706;
        if (var10 == null) {
            return null;
        } else if (var9.field3702 == 2) {
            class439.method2516(false, var10, arg0);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method2190(int arg0) {
        field5326 = null;
        if (arg0 >= 24) {
            field5329 = null;
        }
    }
}
