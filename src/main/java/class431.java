import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public abstract class class431 extends class321 {

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "I")
    public int field6267;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "[F")
    public static float[] field6265 = new float[4];

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;IC)I")
    public static final int method2571(String arg0, int arg1, char arg2) {
        field6264++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        if (arg1 != 3553) {
            method2573(104, null, -112, 48, 102, false, null, (byte) 123);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method38(int arg0);

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "(I)V")
    public static void method2572(int arg0) {
        field6265 = null;
        if (arg0 != 27763) {
            method2571(null, 25, (char) 65520);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I[IIIIZLuca;B)Lei;")
    public static final class506 method2573(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, class287 arg6, byte arg7) {
        if (arg7 != -81) {
            method2572(-8);
        }
        field6266++;
        if (!arg6.field4144 && (!class346.method2145(-1, arg2) || !class346.method2145(-1, arg3))) {
            return arg6.field4132 ? new class506(arg6, 34037, arg2, arg3, arg5, arg1, arg4, arg0) : new class506(arg6, arg2, arg3, class240.method1478(-28325, arg2), class240.method1478(arg7 - 28244, arg3), arg1);
        } else {
            return new class506(arg6, 3553, arg2, arg3, arg5, arg1, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "(I)Z")
    public abstract boolean method40(int arg0);

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(I)V")
    public class431(int arg0) {
        this.field6267 = arg0;
    }
}
