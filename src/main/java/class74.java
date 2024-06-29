import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class74 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1162 = 0;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[S")
    public static short[] field1167 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1164 = -1;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Lbf;")
    public static class202 field1166 = new class202(50);

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Leg;")
    public static class37 field1168 = class174.method1167("clignotant2:", 74);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Ljl;")
    public static class101 field1169;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[[[I")
    public static int[][][] field1163;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method495(int arg0) {
        field1163 = null;
        field1166 = null;
        field1168 = null;
        if (arg0 != 1) {
            method496((class67) null, -88, 53, 127, -38, 23);
        }
        field1167 = null;
        field1169 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lme;IIIII)V")
    public static final void method496(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class274.field4815 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class175.field2936) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class160.field2675 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class111 var14 = class286.field5048[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class218.field3754[var11][var12 + 1][var13] + class218.field3754[var11][var12][var13] + class218.field3754[var11][var12][var13 + 1] + class218.field3754[var11][var12 + 1][var13 + 1]) / 4 - (class218.field3754[arg1][arg2 + 1][arg3] + class218.field3754[arg1][arg2][arg3] + class218.field3754[arg1][arg2][arg3 + 1] + class218.field3754[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class79 var16 = var14.field1868;
                                    if (var16 != null) {
                                        if (var16.field1221.method464()) {
                                            arg0.method468(var16.field1221, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1235 != null && var16.field1235.method464()) {
                                            arg0.method468(var16.field1235, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1880; var17++) {
                                        class27 var18 = var14.field1858[var17];
                                        if (var18 != null && var18.field400.method464() && (var18.field402 == var12 || var7 == var12) && (var18.field397 == var13 || var9 == var13)) {
                                            int var19 = var18.field387 + 1 - var18.field402;
                                            int var20 = var18.field399 + 1 - var18.field397;
                                            arg0.method468(var18.field400, (var18.field402 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field397 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljl;I)I")
    public static final int method497(class101 arg0, int arg1) {
        field1165++;
        int var2 = 0;
        if (arg0.method658(class132.field2217, (byte) 35)) {
            var2++;
        }
        if (arg0.method658(class275.field4859, (byte) 33)) {
            var2++;
        }
        if (arg0.method658(class67.field1062, (byte) 41)) {
            var2++;
        }
        if (arg0.method658(class124.field2084, (byte) 67)) {
            var2++;
        }
        if (arg0.method658(class282.field4985, (byte) 46)) {
            var2++;
        }
        if (arg0.method658(class291.field5127, (byte) 64)) {
            var2++;
        }
        if (arg0.method658(class126.field2122, (byte) 102)) {
            var2++;
        }
        if (arg0.method658(class260.field4606, (byte) 50)) {
            var2++;
        }
        if (arg0.method658(class84.field1323, (byte) 49)) {
            var2++;
        }
        if (arg0.method658(class129.field2146, (byte) 112)) {
            var2++;
        }
        if (arg0.method658(class284.field5016, (byte) 33)) {
            var2++;
        }
        if (arg0.method658(class232.field4002, (byte) 102)) {
            var2++;
        }
        if (arg0.method658(class267.field4670, (byte) 73)) {
            var2++;
        }
        if (arg0.method658(class22.field288, (byte) 42)) {
            var2++;
        }
        if (arg1 != 1) {
            field1162 = -62;
        }
        if (arg0.method658(class29.field428, (byte) 71)) {
            var2++;
        }
        if (arg0.method658(class94.field1480, (byte) 80)) {
            var2++;
        }
        return var2;
    }
}
