import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class269 {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3178 = 500;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3181 = 0;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lei;")
    public static class191 field3180 = new class191();

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIB)V", line = 5)
    public static final void method1591(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3179++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        if (arg4 <= 7) {
            field3178 = -94;
        }
        class455.method2755(arg3, class4.field49[arg2], (byte) 88, arg0 + arg1, -arg0 + arg1);
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class4.field49[arg2 + var6];
                int[] var10 = class4.field49[arg2 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class455.method2755(arg3, var9, (byte) 31, var11, var12);
                class455.method2755(arg3, var10, (byte) 109, var11, var12);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class4.field49[arg2 + var5];
            int[] var16 = class4.field49[arg2 - var5];
            class455.method2755(arg3, var15, (byte) 114, var13, var14);
            class455.method2755(arg3, var16, (byte) 91, var13, var14);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 57)
    public static void method1592(byte arg0) {
        field3180 = null;
        if (arg0 != -127) {
            method1591(-99, -38, -112, 65, (byte) 11);
        }
    }
}
