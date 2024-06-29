import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class376 extends class217 {

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lak;")
    public class324 field5067;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lff;")
    public static class9 field5066 = new class9(2);

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Z")
    public static boolean field5070 = false;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Lcu;")
    public static class206 field5071 = new class206(56, -1);

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field5073 = 0;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "[I")
    public static int[] field5072;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static void method2212(int arg0) {
        field5072 = null;
        field5071 = null;
        field5066 = null;
        if (arg0 < 62) {
            method2212(87);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V")
    public static final void method2213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= class442.field6058 && arg3 >= class310.field4279) {
            boolean var6;
            if (class600.field7959 > arg0) {
                arg0 = class600.field7959;
                var6 = false;
            } else if (class366.field4956 >= arg0) {
                var6 = true;
            } else {
                var6 = false;
                arg0 = class366.field4956;
            }
            boolean var7;
            if (arg4 < class600.field7959) {
                var7 = false;
                arg4 = class600.field7959;
            } else if (arg4 <= class366.field4956) {
                var7 = true;
            } else {
                var7 = false;
                arg4 = class366.field4956;
            }
            if (arg5 >= class310.field4279) {
                class475.method2668(arg2, arg4, 7, class236.field3325[arg5++], arg0);
            } else {
                arg5 = class310.field4279;
            }
            if (arg3 <= class442.field6058) {
                class475.method2668(arg2, arg4, 7, class236.field3325[arg3--], arg0);
            } else {
                arg3 = class442.field6058;
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg3; var8++) {
                    int[] var9 = class236.field3325[var8];
                    var9[arg0] = var9[arg4] = arg2;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg3; var11++) {
                    class236.field3325[var11][arg0] = arg2;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg3; var10++) {
                    class236.field3325[var10][arg4] = arg2;
                }
            }
        }
        field5069++;
        if (arg1 != 56) {
            method2212(-127);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lej;II[B)V")
    public class376(class111 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5067 = arg0.method884((byte) 96, false, arg2, arg3, class616.field8164, arg1);
        this.field5067.method947((byte) 115, false, false);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lej;II[I)V")
    public class376(class111 arg0, int arg1, int arg2, int[] arg3) {
        this.field5067 = arg0.method878(false, arg2, arg1, arg3, (byte) -22);
        this.field5067.method947((byte) -2, false, false);
    }
}
