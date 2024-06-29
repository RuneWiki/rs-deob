import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class515 {

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    public int field7487 = -1;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "Lhga;")
    public static class158 field7482 = new class158(14, 5);

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "[Lrk;")
    public static class30[] field7491 = new class30[2048];

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public int field7480;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public int field7483;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
    public int field7484;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
    public int field7485;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public int field7486;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
    public int field7488;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public int field7489;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
    public int field7492;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
    public static void method3120(int arg0) {
        field7482 = null;
        field7491 = null;
        if (arg0 != -19410) {
            method3120(105);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIILk;II)Ljava/awt/Frame;")
    public static final Frame method3121(int arg0, int arg1, int arg2, class525 arg3, int arg4, int arg5) {
        field7490++;
        if (!arg3.method3166((byte) -12)) {
            return null;
        }
        if (arg4 == arg5) {
            class615[] var6 = class373.method2458(arg3, 0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field8738 == arg2 && var6[var8].field8734 == arg0 && (arg1 == 0 || var6[var8].field8737 == arg1) && (!var7 || arg4 < var6[var8].field8739)) {
                    var7 = true;
                    arg4 = var6[var8].field8739;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class701 var9 = arg3.method3165(arg0, arg4, arg2, false, arg1);
        while (var9.field9884 == 0) {
            class549.method3313(10L, 127);
        }
        Frame var10 = (Frame) var9.field9885;
        if (var10 == null) {
            return null;
        } else if (var9.field9884 == 2) {
            class405.method2595(arg3, arg5 ^ 0x2, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)Z")
    public static final boolean method3122(int arg0, int arg1, int arg2) {
        field7481++;
        if (arg1 == 32) {
            return (arg2 & 0x20) != 0;
        } else {
            return false;
        }
    }
}
