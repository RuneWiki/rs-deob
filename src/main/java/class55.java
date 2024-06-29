import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class55 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Loa;")
    private static class99 field899 = class221.method1463(2844, "Loading fonts )2 ");

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
    public static int[] field898 = new int[2];

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Loa;")
    public static class99 field901 = field899;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Ltg;")
    public static class182 field903;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Ltg;")
    public static class182 field905;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[[[B")
    public static byte[][][] field902;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static final void method373(byte arg0) {
        class189.field3336.method1813(-1);
        int var1 = 111 / ((arg0 + 35) / 52);
        field906++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lpg;II)V")
    public static final void method374(class75 arg0, int arg1, int arg2) {
        field907++;
        if (arg0.field1314 > class56.field926) {
            class206.method1380(arg0, 64);
        } else if (arg0.field1334 < class56.field926) {
            class184.method1263(true, arg0);
        } else {
            class105.method723((byte) 47, arg0);
        }
        if (arg0.field1325 < 128 || arg0.field1301 < 128 || arg0.field1325 >= 13184 || arg0.field1301 >= 13184) {
            arg0.field1314 = 0;
            arg0.field1313 = -1;
            arg0.field1284 = -1;
            arg0.field1334 = 0;
            arg0.field1325 = arg0.field1317[0] * 128 + (arg0.method516((byte) -65) * 64);
            arg0.field1301 = arg0.field1259[0] * 128 + arg0.method516((byte) -65) * 64;
            arg0.method518(false);
        }
        if (arg2 != -31227) {
            field901 = null;
        }
        if (class168.field3006 == arg0 && (arg0.field1325 < 1536 || arg0.field1301 < 1536 || arg0.field1325 >= 11776 || arg0.field1301 >= 11776)) {
            arg0.field1314 = 0;
            arg0.field1284 = -1;
            arg0.field1313 = -1;
            arg0.field1334 = 0;
            arg0.field1325 = arg0.field1317[0] * 128 + (arg0.method516((byte) -65) * 64);
            arg0.field1301 = arg0.field1259[0] * 128 + arg0.method516((byte) -65) * 64;
            arg0.method518(false);
        }
        class264.method1763(arg0, 32768);
        class22.method132(arg2 ^ 0xFFFFF924, arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method375(int arg0) {
        field902 = null;
        field898 = null;
        if (arg0 < 25) {
            method375(-108);
        }
        field905 = null;
        field903 = null;
        field901 = null;
        field899 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([[II)V")
    public static final void method376(int[][] arg0, int arg1) {
        field908++;
        if (arg1 != -26304) {
            field901 = null;
        }
        class124.field2177 = arg0;
    }
}
