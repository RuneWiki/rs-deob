import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class308 extends InputStream {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4848 = "cyan:";

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lra;")
    public static class88 field4851;

    @OriginalMember(owner = "client!df", name = "read", descriptor = "()I", line = 5)
    public final int read() {
        class96.method657(30000L, (byte) -115);
        field4850++;
        return -1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBIIII)V", line = 15)
    public static final void method2119(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4849++;
        class253.method1704(arg3 - arg5, arg3 + arg5, arg0, class175.field2675[arg2], arg1 ^ 0xFFFFFFEA);
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg5 * arg5;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = var8 << 2;
        int var13 = arg4 << 1;
        int var14 = (1 - var13) * var8 + var10;
        int var15 = ((var6 << 1) + 3) * var10;
        int var16 = var9 << 2;
        int var17 = var9 - ((var13 - 1) * var11);
        int var18 = ((arg4 << 1) - 3) * var11;
        if (arg1 != -19) {
            method2120((byte) 79);
        }
        int var19 = (arg4 - 1) * var12;
        int var20 = (var6 + 1) * var16;
        while (var7 > 0) {
            var7--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var15;
                    var6++;
                    var17 += var20;
                    var20 += var16;
                    var15 += var16;
                }
            }
            if (var17 < 0) {
                var14 += var15;
                var6++;
                var17 += var20;
                var20 += var16;
                var15 += var16;
            }
            int var21 = arg2 + var7;
            var17 += -var18;
            var14 += -var19;
            int var22 = arg2 - var7;
            var18 -= var12;
            var19 -= var12;
            int var23 = arg3 + var6;
            int var24 = arg3 - var6;
            class253.method1704(var24, var23, arg0, class175.field2675[var22], arg1 + 26);
            class253.method1704(var24, var23, arg0, class175.field2675[var21], arg1 + 26);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 98)
    public static void method2120(byte arg0) {
        if (arg0 != 15) {
            method2119(-107, (byte) 30, -114, 46, -126, -3);
        }
        field4848 = null;
        field4851 = null;
    }
}
