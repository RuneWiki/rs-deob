import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class634 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Z")
    public static boolean field8938 = true;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Ljo;")
    public static class351 field8939 = new class351(85, -1);

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Ltga;")
    public static class64 field8942 = new class64(16);

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lpa;")
    public static class387 field8944 = new class387(10);

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 8)
    public static void method3612(int arg0) {
        if (arg0 >= 64) {
            field8939 = null;
            field8944 = null;
            field8942 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V", line = 22)
    public static final void method3613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8941++;
        int var6 = arg1 - arg0;
        int var7 = arg3 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class185.method1376(-26825, arg5, arg1, arg0, arg4);
            }
        } else if (var6 == 0) {
            class139.method972(arg0, arg3, 120, arg4, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg4;
                arg4 = arg0;
                int var10 = arg3;
                arg3 = arg1;
                arg0 = var9;
                arg1 = var10;
            }
            if (arg3 < arg4) {
                int var11 = arg4;
                int var12 = arg0;
                arg4 = arg3;
                arg3 = var11;
                arg0 = arg1;
                arg1 = var12;
            }
            int var13 = arg0;
            if (arg2 <= 0) {
                field8944 = null;
            }
            int var14 = arg3 - arg4;
            int var15 = arg1 - arg0;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg0 < arg1 ? 1 : -1;
            if (var8) {
                for (int var19 = arg4; var19 <= arg3; var19++) {
                    var16 += var15;
                    class347.field5087[var19][var13] = arg5;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg4; var18 <= arg3; var18++) {
                    var16 += var15;
                    class347.field5087[var13][var18] = arg5;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V", line = 144)
    public static final void method3614(int arg0, int arg1, int arg2, int arg3) {
        field8940++;
        if (class603.field8490 == arg2 && class4.field53 == arg1 && class135.field1747 == arg3) {
            return;
        }
        class432.field6151 = true;
        class603.field8490 = arg2;
        class4.field53 = arg1;
        class135.field1747 = arg3;
        double var4 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        if (arg0 != -1) {
            return;
        }
        class503.field7194 = -var10 * var12;
        class251.field3553 = var14;
        class399.field5664 = var8;
        class422.field5966 = var10;
        class476.field6765 = 0.0D;
        class714.field10071 = var8 * var12;
        class61.field838 = var12;
        class345.field5084 = -var8 * var14;
        class395.field5606 = var10 * var14;
    }
}
