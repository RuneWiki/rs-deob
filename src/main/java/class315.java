import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class315 {

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field4761 = 0;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4760 = "cyan:";

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field4762 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4764;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([IIIII)V", line = 5)
    public static final void method2160(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        arg3--;
        field4758++;
        int var6 = arg2 - 1;
        int var5 = var6 - arg4;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg0[var7] = arg1;
            int var8 = var7 + 1;
            arg0[var8] = arg1;
            int var9 = var8 + 1;
            arg0[var9] = arg1;
            int var10 = var9 + 1;
            arg0[var10] = arg1;
            int var11 = var10 + 1;
            arg0[var11] = arg1;
            int var12 = var11 + 1;
            arg0[var12] = arg1;
            int var13 = var12 + 1;
            arg0[var13] = arg1;
            arg3 = var13 + 1;
            arg0[arg3] = arg1;
        }
        while (arg3 < var6) {
            arg3++;
            arg0[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILlm;I)Lle;", line = 32)
    public static final class127 method2161(int arg0, class210 arg1, int arg2) {
        field4766++;
        if (arg2 != 0) {
            method2160((int[]) null, 81, 83, -46, -122);
        }
        return class329.method2245(arg0, arg1, 63) ? class228.method1580((byte) -11) : null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 58)
    public static void method2162(int arg0) {
        if (arg0 >= 67) {
            field4760 = null;
            field4764 = null;
        }
    }
}
