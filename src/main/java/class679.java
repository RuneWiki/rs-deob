import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class679 {

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "Z")
    public static boolean field9577 = false;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "Llh;")
    public static class492 field9576 = new class492(0, 0);

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Let;")
    public static class556 field9581;

    @OriginalMember(owner = "client!cp", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field9582++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIII)V", line = 12)
    public static final void method3789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9579++;
        if (arg0 != -1732) {
            return;
        }
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg5 >= class310.field4279 && arg5 <= class442.field6058) {
            int var20 = class300.method1829(class600.field7959, arg2 + arg4, -60, class366.field4956);
            int var21 = class300.method1829(class600.field7959, arg4 - arg2, 118, class366.field4956);
            class475.method2668(arg1, var20, 7, class236.field3325[arg5], var21);
        }
        int var22 = (arg3 - 1) * var15;
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
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var7--;
            var22 -= var15;
            var18 -= var15;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var24 >= class310.field4279 && class442.field6058 >= var23) {
                int var25 = class300.method1829(class600.field7959, arg4 + var6, -90, class366.field4956);
                int var26 = class300.method1829(class600.field7959, arg4 - var6, -58, class366.field4956);
                if (var23 >= class310.field4279) {
                    class475.method2668(arg1, var25, 7, class236.field3325[var23], var26);
                }
                if (var24 <= class442.field6058) {
                    class475.method2668(arg1, var25, 7, class236.field3325[var24], var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)I", line = 112)
    public final int method3790(int arg0, int arg1, int arg2) {
        field9583++;
        if (arg1 < 97) {
            return 8;
        }
        int var4 = arg2 >= class149.field2387 ? arg2 : class149.field2387;
        if (class591.field7814 == this) {
            return 0;
        } else if (class345.field4737 == this) {
            return var4 - arg0;
        } else if (class274.field3804 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V", line = 135)
    public static void method3791(byte arg0) {
        field9576 = null;
        field9581 = null;
        int var1 = 41 % ((29 - arg0) / 58);
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)Z", line = 146)
    public static final boolean method3792(int arg0, int arg1, int arg2) {
        field9578++;
        if (arg2 != -853061855) {
            method3789(7, 99, -82, 39, -56, 73);
        }
        return (class492.method2747((byte) 117, arg1, arg0) | (arg0 & 0x2000) != 0 | class414.method2373(arg0, true, arg1)) & class66.method533(arg0, -15077, arg1);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBI)V", line = 159)
    public static final void method3793(int arg0, byte arg1, int arg2) {
        field9580++;
        int var3 = class193.field2823.method2847(class72.field1088.method546(class516.field6892, (byte) -35), (byte) -127);
        for (class117 var4 = (class117) class480.field6411.method3257(-39); var4 != null; var4 = (class117) class480.field6411.method3263((byte) -112)) {
            int var8 = class578.method3173(14, var4);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class398.field5290 * 16 + 21;
        int var6 = arg0 - var3 / 2;
        if (class627.field8461 < (var3 + var6)) {
            var6 = class627.field8461 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (class149.field2387 < (var5 + arg2)) {
            var7 = class149.field2387 - var5;
        }
        class259.field3566 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        if (arg1 <= -13) {
            class483.field6540 = var3;
            class340.field4703 = var7;
            class388.field5142 = true;
            class342.field4707 = class398.field5290 * 16 + (class664.field9427 ? 26 : 22);
        }
    }
}
