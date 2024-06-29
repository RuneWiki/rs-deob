import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class510 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
    public static int[] field7753 = new int[14];

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lgn;")
    public static class475 field7754 = new class475(32, 3);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method3062(int arg0) {
        field7754 = null;
        field7753 = null;
        if (arg0 <= 85) {
            field7753 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
    public static final int method3063(byte arg0, int arg1) {
        field7756++;
        if (arg0 != 89) {
            method3063((byte) -108, 55);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
    public static final void method3064(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7755++;
        if (arg0 != -638886783) {
            field7754 = null;
        }
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class372.method2266(class473.field6839, -20228, class63.field933, arg4 + arg2);
        int var10 = class372.method2266(class473.field6839, arg0 + 638866555, class63.field933, arg4 - arg2);
        class238.method1440(class41.field629[arg3], arg1, var9, var10, -14726);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (class7.field131 <= var12 && var11 <= class92.field1252) {
                    int var13 = class372.method2266(class473.field6839, -20228, class63.field933, arg4 + var5);
                    int var14 = class372.method2266(class473.field6839, -20228, class63.field933, arg4 - var5);
                    if (class92.field1252 >= var12) {
                        class238.method1440(class41.field629[var12], arg1, var13, var14, arg0 ^ 0x26149AFB);
                    }
                    if (class7.field131 <= var11) {
                        class238.method1440(class41.field629[var11], arg1, var13, var14, -14726);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (var16 >= class7.field131 && class92.field1252 >= var15) {
                int var17 = class372.method2266(class473.field6839, arg0 + 638866555, class63.field933, arg4 + var6);
                int var18 = class372.method2266(class473.field6839, -20228, class63.field933, arg4 - var6);
                if (var16 <= class92.field1252) {
                    class238.method1440(class41.field629[var16], arg1, var17, var18, arg0 ^ 0x26149AFB);
                }
                if (var15 >= class7.field131) {
                    class238.method1440(class41.field629[var15], arg1, var17, var18, arg0 + 638872057);
                }
            }
        }
    }
}
