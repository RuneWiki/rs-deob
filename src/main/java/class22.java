import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class22 implements class268 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
    public static int[] field554 = new int[50];

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field555 = new String[100];

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[I")
    public static int[] field556 = new int[2048];

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field558 = 2301979;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field553;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 6)
    public static void method192(byte arg0) {
        field553 = null;
        field554 = null;
        field556 = null;
        field555 = null;
        if (arg0 != -2) {
            method192((byte) -85);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(JII[I)Ljava/lang/String;", line = 20)
    public final String method193(long arg0, int arg1, int arg2, int[] arg3) {
        field552++;
        if (arg1 == 0) {
            class99 var7 = class155.method1103(arg3[0], -2);
            return var7.method759((int) arg0, (byte) 93);
        }
        if (arg2 != -23895) {
            field556 = (int[]) null;
        }
        if (arg1 == 1 || arg1 == 10) {
            class11 var6 = class296.method2124(arg2 ^ 0xFFFFA2A9, (int) arg0);
            return var6.field318;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class155.method1103(arg3[0], -2).method759((int) arg0, (byte) 53);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIILml;IJ)Z", line = 56)
    public static final boolean method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class152 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class251.method1769(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
