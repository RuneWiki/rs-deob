import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class163 extends class329 {

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "Ljava/lang/String;")
    public String field2140;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2141 = "";

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "F")
    public static float field2142;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIZIIII)V", line = 5)
    public static final void method934(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field2143++;
        int var7 = arg1 + arg5;
        int var8 = arg6 - arg5;
        for (int var9 = arg1; var9 < var7; var9++) {
            class57.method362(arg3, class550.field7650[var9], arg0, arg4, -119);
        }
        for (int var10 = arg6; var10 > var8; var10--) {
            class57.method362(arg3, class550.field7650[var10], arg0, arg4, 42);
        }
        int var11 = arg4 - arg5;
        if (arg2) {
            return;
        }
        int var12 = arg3 + arg5;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class550.field7650[var13];
            class57.method362(arg3, var14, arg0, var12, -128);
            class57.method362(var11, var14, arg0, arg4, 109);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 49)
    public static void method935(int arg0) {
        field2141 = null;
        if (arg0 > -89) {
            field2141 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V", line = 60)
    public class163() {
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 67)
    public class163(String arg0, int arg1) {
        this.field2140 = arg0;
    }
}
