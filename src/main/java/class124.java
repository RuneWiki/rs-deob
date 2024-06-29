import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class class124 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Z")
    public static boolean field2097 = false;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lce;")
    private static class126 field2099 = class206.method1445(-7923, "Members object");

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lce;")
    public static class126 field2098 = class206.method1445(-7923, "::qa_op_test");

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lce;")
    public static class126 field2101 = field2099;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 19)
    public static void method828(int arg0) {
        field2101 = null;
        field2099 = null;
        if (arg0 <= 15) {
            method828(103);
        }
        field2098 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)V", line = 36)
    public static final void method829(int arg0, byte arg1, int arg2) {
        field2103++;
        if (class29.field395 > 0) {
            class89.method623(arg1 + 32, class29.field395);
            class29.field395 = 0;
        }
        short var3 = 256;
        int var4 = class276.field4619 * arg0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 1;
        if (arg1 != 18) {
            method829(-53, (byte) 3, -76);
        }
        while ((var3 - 1) > var7) {
            int var8 = (var3 - var7) * class296.field4925[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class276.field4626[var4++ + arg2];
                int var11 = class120.field2018[var5++];
                if (var11 == 0) {
                    class218.field3662.field3196[var6++] = var10;
                } else {
                    int var12 = var11 + 18;
                    int var13 = 256 - var11 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class315.field5417[var11];
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    class218.field3662.field3196[var6++] = class47.method289(-16711936, class47.method289(16711935, var10) * var13 + var12 * class47.method289(16711935, var14)) + class47.method289(16711680, class47.method289(65280, var10) * var13 + var12 * class47.method289(var14, 65280)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class218.field3662.field3196[var6++] = class276.field4626[arg2 + var4++];
            }
            var4 += class276.field4619 - 128;
            var7++;
        }
        if (class56.field846) {
            class101.method680(class218.field3662.field3196, arg2, arg0, class218.field3662.field4595, class218.field3662.field4601);
        } else {
            class218.field3662.method1332(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lnf;I)Lnf;")
    public abstract class247 method830(class247 arg0, int arg1);
}
