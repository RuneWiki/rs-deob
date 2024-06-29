import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class317 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[I")
    public static int[] field4109 = new int[32];

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lnd;")
    public static class547 field4110;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lbl;")
    public static class651 field4106;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
    public static final int method1871(int arg0, int arg1) {
        return class498.field7019 == null ? 0 : class498.field7019[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method1872(int arg0) {
        field4109 = null;
        field4110 = null;
        field4106 = null;
        if (arg0 != -8) {
            field4106 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
    public static final void method1873(int arg0, int arg1) {
        field4107++;
        class37 var2 = class636.method3571(12, arg1, -86);
        if (arg0 < 68) {
            field4110 = null;
        }
        var2.method230(115);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public static final void method1874(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4111++;
        int var5 = class14.field272;
        int var6 = class455.field6073;
        int var7 = -120 % ((arg4 - 18) / 37);
        if (class676.field9448) {
            var5 += class209.method1347(0);
            var6 += class453.method2540(-57);
        }
        if (class717.field9983 == 1) {
            class481 var8 = class178.field2496[class211.field2793 / 100];
            var8.method2759(var5 - 8, var6 + -8);
            class236.method1478(-111, var6 - 8, var8.method142() + var5 + -8, var5 - 8, var6 - (8 - var8.method149()));
        }
        if (class717.field9983 == 2) {
            class481 var9 = class178.field2496[(class211.field2793 / 100) + 4];
            var9.method2759(var5 - 8, var6 - 8);
            class236.method1478(125, var6 - 8, var9.method142() + var5 + -8, var5 - 8, var9.method149() + var6 + -8);
        }
        class249.method1535(-25932);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4109[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
