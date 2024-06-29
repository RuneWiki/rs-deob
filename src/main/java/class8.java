import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class8 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Ljf;")
    public static class229 field81 = class212.method1457((byte) 115, "clignotant3:");

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lpc;")
    public static class91 field79 = new class91(64);

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lpm;")
    public static class103 field84;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lvj;")
    public static class107 field87;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lnf;")
    public static class67 field80;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field86;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[Lgd;")
    public static class312[] field78;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[[[B")
    public static byte[][][] field82;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIII)V", line = 14)
    public static final void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field83++;
        if (arg4 >= class149.field2578 && class327.field5490 >= arg6 && class56.field991 <= arg5 && arg3 <= class142.field2458) {
            class136.method930(arg0, arg3, arg6, arg4, arg2, true, arg5, arg1);
        } else {
            class95.method657(arg1, arg5, arg2, (byte) -54, arg0, arg6, arg3, arg4);
        }
        int var8 = 39 / ((-arg7 - 3) / 50);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 44)
    public static void method45(boolean arg0) {
        field79 = null;
        field78 = null;
        field80 = null;
        field81 = null;
        field82 = (byte[][][]) null;
        field84 = null;
        field87 = null;
        if (!arg0) {
            field86 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILpk;)V", line = 62)
    public static final void method46(int arg0, class112 arg1) {
        field85++;
        int var2 = arg1.field1998 - class199.field3475;
        int var3 = arg1.field1970 * 128 + arg1.method299(true) * 64;
        if (arg0 != 1536) {
            return;
        }
        int var4 = arg1.field1979 * 128 + arg1.method299(true) * 64;
        arg1.field1983 += (var3 - arg1.field1983) / var2;
        arg1.field2005 = 0;
        if (arg1.field1988 == 0) {
            arg1.field1964 = 1024;
        }
        arg1.field2028 += (var4 - arg1.field2028) / var2;
        if (arg1.field1988 == 1) {
            arg1.field1964 = 1536;
        }
        if (arg1.field1988 == 2) {
            arg1.field1964 = 0;
        }
        if (arg1.field1988 == 3) {
            arg1.field1964 = 512;
        }
    }
}
