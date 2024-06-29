import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class198 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lcd;")
    public static class64 field3379 = class44.method335((byte) 71, "<col=00ff80>");

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lue;")
    public static class14 field3383 = new class14(0, 0);

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lcd;")
    private static class64 field3387 = class44.method335((byte) 71, "Loading sprites )2 ");

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Lcd;")
    public static class64 field3385 = field3387;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
    public static int[] field3386;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1386(int arg0) {
        field3384++;
        for (class172 var1 = (class172) class159.field2805.method1143(arg0); var1 != null; var1 = (class172) class159.field2805.method1147((byte) 18)) {
            int var2 = var1.field2967;
            if (class159.method1148(-1, var2)) {
                class60[] var3 = class272.field4675[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field1017;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field417;
                    class60 var7 = class125.method907(var6, -84);
                    if (var7 != null) {
                        class190.method1342(var7, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 63)
    public static void method1387(byte arg0) {
        field3383 = null;
        field3379 = null;
        field3386 = null;
        field3385 = null;
        field3387 = null;
        if (arg0 >= -117) {
            field3387 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lja;III)V", line = 77)
    public static final void method1388(class60 arg0, int arg1, int arg2, int arg3) {
        if (~arg0.field1159 == arg3) {
            arg0.field1032 = arg0.field1094;
        } else if (arg0.field1159 == 1) {
            arg0.field1032 = (arg1 - arg0.field1016) / 2 + arg0.field1094;
        } else if (arg0.field1159 == 2) {
            arg0.field1032 = arg1 - arg0.field1094 - arg0.field1016;
        } else if (arg0.field1159 == 3) {
            arg0.field1032 = arg0.field1094 * arg1 >> 14;
        } else if (arg0.field1159 == 4) {
            arg0.field1032 = (arg1 - arg0.field1016) / 2 + (arg0.field1094 * arg1 >> 14);
        } else {
            arg0.field1032 = arg1 - (arg0.field1094 * arg1 >> 14) - arg0.field1016;
        }
        field3380++;
        if (arg0.field1168 == 0) {
            arg0.field1040 = arg0.field1021;
        } else if (arg0.field1168 == 1) {
            arg0.field1040 = (arg2 - arg0.field1163) / 2 + arg0.field1021;
        } else if (arg0.field1168 == 2) {
            arg0.field1040 = arg2 - arg0.field1021 - arg0.field1163;
        } else if (arg0.field1168 == 3) {
            arg0.field1040 = arg0.field1021 * arg2 >> 14;
        } else if (arg0.field1168 == 4) {
            arg0.field1040 = (arg0.field1021 * arg2 >> 14) + (arg2 - arg0.field1163) / 2;
        } else {
            arg0.field1040 = arg2 - arg0.field1163 - (arg0.field1021 * arg2 >> 14);
        }
        if (!class17.field346 || !(client.method1762(arg0) != 0 || arg0.field1091 == 0)) {
            return;
        }
        if (arg0.field1040 < 0) {
            arg0.field1040 = 0;
        } else if (arg2 < (arg0.field1040 + arg0.field1163)) {
            arg0.field1040 = arg2 - arg0.field1163;
        }
        if (arg0.field1032 < 0) {
            arg0.field1032 = 0;
        } else if (arg1 < (arg0.field1032 + arg0.field1016)) {
            arg0.field1032 = arg1 - arg0.field1016;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 154)
    public static final void method1389(int arg0, int arg1) {
        field3382++;
        if (arg0 != -13173) {
            method1388((class60) null, 41, -53, 76);
        }
        if (class89.field1605 == null || class89.field1605.length < arg1) {
            class89.field1605 = new int[arg1];
        }
    }
}
