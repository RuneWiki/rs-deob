import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class451 extends class463 {

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field6205 = 0;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "F")
    public static float field6206;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "[[I")
    public static int[][] field6202;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method2505(byte arg0, int arg1, int arg2) {
        ++field6203;
        if (arg0 > -54) {
            field6206 = -0.16628216F;
        }
        return ~(arg1 & 34) != -1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZBI)V", line = 14)
    public static final void method2506(boolean arg0, byte arg1, int arg2) {
        if (arg1 == -89) {
            ++field6207;
            class472 var3 = class236.method1367(arg2, true, arg0);
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field6581.length; ++var4) {
                    var3.field6581[var4] = -1;
                    var3.field6587[var4] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZF)V", line = 45)
    public final void method2507(boolean arg0, float arg1) {
        super.field6436 = arg1;
        if (arg0) {
            field6205 = -79;
        }
        ++field6204;
    }

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V", line = 65)
    public static void method2508(int arg0) {
        field6202 = null;
        if (arg0 != -1) {
            field6202 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIF)V", line = 75)
    public class451(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V", line = 78)
    public final void method2509(int arg0, int arg1, int arg2, int arg3) {
        super.field6438 = arg1;
        ++field6208;
        super.field6439 = arg3;
        int var5 = -16 % ((-10 - arg0) / 38);
        super.field6428 = arg2;
    }
}
