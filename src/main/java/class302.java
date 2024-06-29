import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class302 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Loe;")
    public static class9 field4576 = new class9(5000);

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field4579 = -1;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "[I")
    public static int[] field4580 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Lbm;")
    public static class307 field4577;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V", line = 13)
    public static final void method2007(int arg0, int arg1, int arg2) {
        field4573++;
        if (class266.field4113 > 0) {
            class247.method1635(128, class266.field4113);
            class266.field4113 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = arg0;
        int var6 = class270.field4172 * arg2;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class334.field5130[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class54.field1079[var5++];
                int var11 = class270.field4170[var6++ + arg1];
                if (var10 == 0) {
                    class234.field3681.field3353[var4++] = var11;
                } else {
                    int var12 = var10 + 18;
                    int var13 = 238 - var10;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var14 = class21.field452[var10];
                    class234.field3681.field3353[var4++] = class61.method475(-16711936, var13 * class61.method475(var11, 16711935) + class61.method475(var14, 16711935) * var12) + class61.method475(16711680, var12 * class61.method475(var14, 65280) + class61.method475(65280, var11) * var13) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class234.field3681.field3353[var4++] = class270.field4170[var6++ + arg1];
            }
            var6 += class270.field4172 - 128;
        }
        if (class249.field3893) {
            class115.method751(class234.field3681.field3353, arg1, arg2, class234.field3681.field4377, class234.field3681.field4383);
        } else {
            class234.field3681.method892(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 95)
    public static void method2008(int arg0) {
        field4577 = null;
        field4576 = null;
        if (arg0 >= -45) {
            method2009(-3, 96, -97);
        }
        field4580 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V", line = 107)
    public static final void method2009(int arg0, int arg1, int arg2) {
        class95.field1709 = (float) arg2;
        field4575++;
        if (class135.field2271 == 2) {
            class131.field2213 = arg2;
            class43.field820 = arg1;
        }
        if (arg0 < 77) {
            field4576 = (class9) null;
        }
        class120.field2090 = (float) arg1;
        class103.method670(true);
        class35.field707 = true;
    }
}
