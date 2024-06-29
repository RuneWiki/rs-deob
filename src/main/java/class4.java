import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class634 {

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "Ljt;")
    public static class104 field29 = new class104("", 16);

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
    public class4() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        field30++;
        if (arg0 >= -55) {
            method15(51);
        }
        return class246.field2980;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lgh;IIIII)Ljava/awt/Frame;")
    public static final Frame method14(class546 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field28++;
        if (!arg0.method3216(-121)) {
            return null;
        }
        if (arg4 == 0) {
            class440[] var6 = class375.method2184(arg0, -125);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field6388 == arg2 && var6[var8].field6382 == arg1 && (arg5 == 0 || var6[var8].field6383 == arg5) && (!var7 || arg4 < var6[var8].field6385)) {
                    arg4 = var6[var8].field6385;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class290 var9 = arg0.method3205(arg2, arg5, arg4, arg3 + 112, arg1);
        while (var9.field3573 == 0) {
            class524.method3076(arg3 + 4, 10L);
        }
        Frame var10 = (Frame) var9.field3577;
        if (var10 == null) {
            return null;
        } else if (~var9.field3573 == arg3) {
            class66.method491((byte) -128, arg0, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V")
    public static void method15(int arg0) {
        field29 = null;
        if (arg0 != 3594) {
            method14(null, -109, -40, -90, -110, -74);
        }
    }
}
