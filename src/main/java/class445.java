import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class445 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
    public static int[] field6180 = new int[8];

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6173 = "";

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Lkq;")
    public static class345 field6181 = new class345();

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[Z")
    public static boolean[] field6183 = new boolean[8];

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field6185 = 0;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field6184 = 0;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "B")
    public static byte field6186 = -6;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "F")
    public static float field6176;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Ljava/applet/Applet;")
    public static Applet field6182;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Luu;Luu;Luu;Luu;I)V")
    public static final void method2717(class237 arg0, class237 arg1, class237 arg2, class237 arg3, int arg4) {
        class297.field4233 = arg2;
        if (arg4 != -1751013887) {
            field6184 = -84;
        }
        field6172++;
        class433.field6046 = arg0;
        class216.field2822 = arg1;
        class266.field3900 = new class755[class216.field2822.method1584((byte) 110)][];
        class518.field7230 = new boolean[class216.field2822.method1584((byte) 60)];
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V")
    public static final void method2718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6174++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg3 * arg3;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        if (arg0 <= 7) {
            return;
        }
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg5 >= class291.field4181 && arg5 <= class262.field3848) {
            int var20 = class41.method223(true, class726.field10064, class607.field8185, arg1 + arg3);
            int var21 = class41.method223(true, class726.field10064, class607.field8185, arg1 - arg3);
            class102.method675(arg2, -84, var21, var20, class538.field7454[arg5]);
        }
        int var22 = (arg4 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            var22 -= var15;
            var7--;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var24 >= class291.field4181 && class262.field3848 >= var23) {
                int var25 = class41.method223(true, class726.field10064, class607.field8185, arg1 + var6);
                int var26 = class41.method223(true, class726.field10064, class607.field8185, arg1 - var6);
                if (class291.field4181 <= var23) {
                    class102.method675(arg2, -112, var26, var25, class538.field7454[var23]);
                }
                if (class262.field3848 >= var24) {
                    class102.method675(arg2, 117, var26, var25, class538.field7454[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6177++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method2719(int arg0) {
        field6183 = null;
        field6180 = null;
        field6173 = null;
        if (arg0 == 1433) {
            field6181 = null;
            field6182 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)I")
    public static final int method2720(byte arg0, int arg1) {
        field6175++;
        if (arg0 > -9) {
            field6180 = null;
        }
        return arg1 & 0x7F;
    }
}
