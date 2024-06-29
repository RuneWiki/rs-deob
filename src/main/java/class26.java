import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class26 {

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Ljava/lang/String;")
    public static String field306 = "purple:";

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "[I")
    public static int[] field309 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "J")
    public long field304;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lni;")
    public class26 field298;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Lni;")
    public class26 field301;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field307;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[[Lwf;")
    public static class333[][] field308;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 4)
    public static final void method174(byte arg0) {
        field299++;
        if (!class276.field3954 || arg0 != 126) {
            return;
        }
        class333 var1 = class283.method1926(class315.field4649, (byte) 82, class71.field936);
        if (var1 != null && var1.field5111 != null) {
            class135 var2 = new class135();
            var2.field1836 = var1.field5111;
            var2.field1831 = var1;
            class276.method1869(true, var2);
        }
        class276.field3954 = false;
        class99.field1300 = -1;
        class142.method1097(88, var1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 39)
    public static void method175(int arg0) {
        field306 = null;
        field307 = null;
        int var1 = -93 / ((9 - arg0) / 50);
        field308 = (class333[][]) null;
        field309 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V", line = 52)
    public static final void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field297++;
        int var6 = arg1;
        int var7 = 0;
        int var8 = 17 / ((arg5 - 27) / 32);
        int var9 = arg1 * arg1;
        int var10 = arg3 * arg3;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg1 << 1;
        int var14 = var9 - ((var13 - 1) * var11);
        int var15 = (1 - var13) * var10 + var12;
        int var16 = var10 << 2;
        int var17 = var9 << 2;
        int var18 = ((var7 << 1) + 3) * var12;
        int var19 = (var7 + 1) * var17;
        int var20 = ((arg1 << 1) - 3) * var11;
        if (arg0 >= class207.field2937 && class25.field292 >= arg0) {
            int var21 = class289.method1984(class245.field3574, arg3 + arg4, 1, class321.field4722);
            int var22 = class289.method1984(class245.field3574, arg4 - arg3, 1, class321.field4722);
            class96.method697((byte) 115, class331.field4902[arg0], arg2, var22, var21);
        }
        int var23 = (arg1 - 1) * var16;
        while (var6 > 0) {
            if (var15 < 0) {
                while (var15 < 0) {
                    var15 += var18;
                    var14 += var19;
                    var19 += var17;
                    var18 += var17;
                    var7++;
                }
            }
            var6--;
            if (var14 < 0) {
                var14 += var19;
                var19 += var17;
                var15 += var18;
                var7++;
                var18 += var17;
            }
            var15 += -var23;
            int var24 = arg0 - var6;
            var14 += -var20;
            var23 -= var16;
            int var25 = arg0 + var6;
            var20 -= var16;
            if (var25 >= class207.field2937 && class25.field292 >= var24) {
                int var26 = class289.method1984(class245.field3574, arg4 + var7, 1, class321.field4722);
                int var27 = class289.method1984(class245.field3574, arg4 - var7, 1, class321.field4722);
                if (class207.field2937 <= var24) {
                    class96.method697((byte) 115, class331.field4902[var24], arg2, var27, var26);
                }
                if (var25 <= class25.field292) {
                    class96.method697((byte) 115, class331.field4902[var25], arg2, var27, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)Z", line = 156)
    public final boolean method177(byte arg0) {
        field305++;
        if (arg0 >= -78) {
            method174((byte) 109);
        }
        return this.field298 != null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 171)
    public static final String method178(byte arg0, int arg1) {
        if (arg0 != 126) {
            return (String) null;
        }
        String var2 = Integer.toString(arg1);
        field303++;
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() <= 9) {
            return var2.length() <= 6 ? " <col=ffff00>" + var2 + "</col>" : " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class212.field2994 + " (" + var2 + ")</col>";
        } else {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class97.field1275 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V", line = 201)
    public final void method179(byte arg0) {
        field300++;
        if (this.field298 != null && arg0 == 51) {
            this.field298.field301 = this.field301;
            this.field301.field298 = this.field298;
            this.field298 = null;
            this.field301 = null;
        }
    }
}
