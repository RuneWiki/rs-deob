import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class462 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[Lkia;")
    public static class620[] field6504 = new class620[128];

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[I")
    public static int[] field6500 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[I")
    public static int[] field6506;

    @OriginalMember(owner = "client!qg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6502++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(II)V")
    public class462(int arg0, int arg1) {
        this.field6501 = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
    public static final void method2741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6499++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        if (arg4 > -120) {
            return;
        }
        int var8 = -1;
        int var9 = class24.method150(arg3 + arg1, class71.field960, false, class549.field7665);
        int var10 = class24.method150(arg3 - arg1, class71.field960, false, class549.field7665);
        class643.method3557(var10, class445.field6320[arg0], (byte) 64, arg2, var9);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (class143.field2050 <= var12 && class461.field6495 >= var11) {
                    int var13 = class24.method150(arg3 + var5, class71.field960, false, class549.field7665);
                    int var14 = class24.method150(arg3 - var5, class71.field960, false, class549.field7665);
                    if (class461.field6495 >= var12) {
                        class643.method3557(var14, class445.field6320[var12], (byte) 50, arg2, var13);
                    }
                    if (class143.field2050 <= var11) {
                        class643.method3557(var14, class445.field6320[var11], (byte) 77, arg2, var13);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class143.field2050 && var15 <= class461.field6495) {
                int var17 = class24.method150(arg3 + var6, class71.field960, false, class549.field7665);
                int var18 = class24.method150(arg3 - var6, class71.field960, false, class549.field7665);
                if (class461.field6495 >= var16) {
                    class643.method3557(var18, class445.field6320[var16], (byte) 111, arg2, var17);
                }
                if (var15 >= class143.field2050) {
                    class643.method3557(var18, class445.field6320[var15], (byte) 86, arg2, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)I")
    public static final int method2742(int arg0, int arg1, int arg2) {
        field6505++;
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        int var4 = -10 / ((29 - arg0) / 41);
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method2743(int arg0) {
        field6506 = null;
        if (arg0 < 36) {
            field6500 = null;
        }
        field6504 = null;
        field6500 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)V")
    public static final void method2744(int arg0, int arg1, int arg2) {
        class135.field1974++;
        field6503++;
        if (arg2 != 2) {
            method2742(108, 84, 76);
        }
        class519 var3 = class357.method2293(class427.field5994, class207.field2724, (byte) 90);
        var3.field7384.method3718((byte) 85, arg0);
        var3.field7384.method3749(arg1, (byte) -81);
        class151.method1027(var3, arg2 - 10);
    }
}
