import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class359 {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[Ljca;")
    public static class711[] field5218 = new class711[2048];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lnba;")
    public static class312 field5223;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5219;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[Ljfa;")
    public static class302[] field5221;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZ)Z", line = 4)
    public static final boolean method2253(int arg0, int arg1, boolean arg2) {
        field5222++;
        if (arg2) {
            method2254(1);
        }
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 15)
    public static void method2254(int arg0) {
        field5218 = null;
        field5223 = null;
        field5221 = null;
        field5219 = null;
        if (arg0 != -13) {
            method2254(15);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIILha;IIILft;I)V", line = 29)
    public static final void method2255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class66 arg6, int arg7, int arg8, int arg9, class4 arg10, int arg11) {
        field5217++;
        if (arg8 < arg1 && arg1 < (arg8 + arg3) && (arg4 - 13) < arg5 && arg4 + 3 > arg5) {
            arg11 = arg9;
        }
        String var12 = class36.method243(30697, arg10);
        class546.field7704.method522(0, arg11, class725.field10175, 0, var12, arg7 + arg8, class170.field2438, arg4);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIB)V", line = 55)
    public static final void method2256(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5220++;
        class678 var5 = class630.method3597(29636, 8, (long) arg3);
        var5.method3834((byte) 107);
        var5.field9639 = arg2;
        var5.field9649 = arg1;
        int var6 = -8 % ((61 - arg4) / 46);
        var5.field9651 = arg0;
    }
}
