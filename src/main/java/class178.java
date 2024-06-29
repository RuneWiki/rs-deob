import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class178 extends class217 {

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "[I")
    public static int[] field2666 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method1198(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -73) {
            field2665 = 20;
        }
        super.field3172 = arg2;
        super.field3159 = arg0;
        super.field3157 = arg1;
        ++field2667;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IF)V", line = 18)
    public final void method1195(int arg0, float arg1) {
        super.field3161 = arg1;
        if (arg0 == 2857) {
            ++field2668;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZ)V", line = 29)
    public static final void method1295(byte arg0, boolean arg1) {
        ++field2669;
        class193.method1378(113);
        if (class659.method3694(9, class141.field2306)) {
            ++class368.field5212;
            if (class368.field5212 >= 50 || arg1) {
                class368.field5212 = 0;
                if (arg0 < 117) {
                    method1295((byte) 63, true);
                }
                if (!class244.field3488 && class600.field8551 != null) {
                    ++class243.field3477;
                    class302 var2 = class582.method3419(class253.field3632, (byte) 127, class626.field8901);
                    class501.method2928(0, var2);
                    try {
                        class323.method1951(false);
                    } catch (IOException var3) {
                        class244.field3488 = true;
                    }
                }
                class193.method1378(20);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIF)V", line = 69)
    public class178(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(B)V", line = 76)
    public static void method1296(byte arg0) {
        field2666 = null;
        if (arg0 <= 93) {
            field2665 = 2;
        }
    }
}
