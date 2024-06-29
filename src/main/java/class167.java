import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class167 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lth;")
    public static class187 field3371 = new class187();

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[J")
    public static long[] field3373 = new long[200];

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[Ld;")
    public static class31[] field3375 = new class31[4];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    public static int[] field3374;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method1101(byte arg0) {
        field3375 = null;
        field3373 = null;
        field3371 = null;
        int var1 = -96 % ((arg0 + 10) / 39);
        field3374 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBII)V")
    public static final void method1102(int arg0, byte arg1, int arg2, int arg3) {
        field3370++;
        if (class196.field3897 != 0 && arg0 != 0 && class197.field3934 < 50 && arg2 != -1) {
            class175.field3582[class197.field3934] = arg2;
            class21.field422[class197.field3934] = arg0;
            class79.field1859[class197.field3934] = arg3;
            class126.field2745[class197.field3934] = null;
            class187.field3802[class197.field3934] = 0;
            class197.field3934++;
        }
        int var4 = -24 / ((arg1 - 13) / 51);
    }
}
