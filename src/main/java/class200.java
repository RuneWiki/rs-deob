import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class200 implements class167 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lks;")
    private class463 field2400;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Z")
    public static boolean field2406 = false;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lks;)V")
    public class200(class463 arg0) {
        this.field2400 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)V")
    public final void method821(int arg0, boolean arg1) {
        int var3 = 103 / ((arg0 - 53) / 52);
        field2403++;
        if (arg1) {
            class363.field4526.method645(0, 0, class701.field9880, class705.field9921, this.field2400.field6491, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IJ)V")
    public static final void method1297(int arg0, long arg1) {
        field2401++;
        class532.field7493.setTime(new Date(arg1));
        if (arg0 != -30414) {
            field2406 = false;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public final void method684(int arg0) {
        field2402++;
        if (arg0 != 30573) {
            field2405 = -30;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZII)V")
    public static final void method1298(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2404++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class155.method1103(class471.field6572, arg1 + arg4, arg2, class223.field2604);
        int var10 = class155.method1103(class471.field6572, arg1 - arg4, arg2, class223.field2604);
        class455.method2755(arg0, class4.field49[arg3], (byte) 55, var9, var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (var12 >= class187.field2268 && var11 <= class461.field6480) {
                    int var13 = class155.method1103(class471.field6572, arg1 + var5, false, class223.field2604);
                    int var14 = class155.method1103(class471.field6572, arg1 - var5, arg2, class223.field2604);
                    if (var12 <= class461.field6480) {
                        class455.method2755(arg0, class4.field49[var12], (byte) 123, var13, var14);
                    }
                    if (var11 >= class187.field2268) {
                        class455.method2755(arg0, class4.field49[var11], (byte) 117, var13, var14);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (var16 >= class187.field2268 && class461.field6480 >= var15) {
                int var17 = class155.method1103(class471.field6572, arg1 + var6, arg2, class223.field2604);
                int var18 = class155.method1103(class471.field6572, arg1 - var6, false, class223.field2604);
                if (var16 <= class461.field6480) {
                    class455.method2755(arg0, class4.field49[var16], (byte) 69, var17, var18);
                }
                if (class187.field2268 <= var15) {
                    class455.method2755(arg0, class4.field49[var15], (byte) 108, var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Z")
    public final boolean method685(int arg0) {
        field2407++;
        return arg0 == -18299;
    }
}
