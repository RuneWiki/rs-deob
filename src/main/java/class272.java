import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class272 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Lmc;")
    public static class78 field3616 = new class78(71, 0);

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field3620 = 0;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3622 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Lss;")
    public class272 field3619;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Lss;")
    public class272 field3621;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIII)V")
    public static final void method1539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3618++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 - arg3) * var16;
        int var20 = (arg5 - 1) * var15;
        class330.method1834(arg0 + arg2, class102.field1472[arg1], arg4, arg0 - arg2, 25084);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg1 - var7;
            int var22 = arg1 + var7;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class330.method1834(var23, class102.field1472[var21], arg4, var24, 25084);
            class330.method1834(var23, class102.field1472[var22], arg4, var24, 25084);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public static void method1540(byte arg0) {
        if (arg0 > -91) {
            method1540((byte) -128);
        }
        field3616 = null;
        field3622 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public final void method1541(int arg0) {
        field3617++;
        if (this.field3619 == null) {
            return;
        }
        this.field3619.field3621 = this.field3621;
        this.field3621.field3619 = this.field3619;
        if (arg0 != -3) {
            method1539(21, -121, -29, 34, 90, 65);
        }
        this.field3619 = null;
        this.field3621 = null;
    }
}
