import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class78 {

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Lma;")
    public static class5 field1217 = class12.method119(")2", (byte) 63);

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lni;")
    public static class202 field1215;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Z")
    public static boolean field1211;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[[[B")
    public static byte[][][] field1213;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 5)
    public static void method538(int arg0) {
        int var1 = 110 % ((40 - arg0) / 51);
        field1217 = null;
        field1215 = null;
        field1213 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 16)
    public static final void method539(int arg0, int arg1) {
        if (arg0 == -1 && !class278.field4726) {
            class133.method864(1);
        } else if (arg0 != -1 && (class272.field4649 != arg0 || !class196.method1286(0)) && class247.field4092 != 0 && !class278.field4726) {
            class210.method1396(class247.field4092, false, (byte) -27, arg0, 0, class182.field2775, 2);
        }
        if (arg1 > -69) {
            method539(20, -91);
        }
        class272.field4649 = arg0;
        field1212++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII)V", line = 55)
    public static final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1216++;
        if (arg2 != 0) {
            method540(-100, -75, -1, -8, -85, -126);
        }
        for (int var6 = arg0; var6 <= arg3; var6++) {
            class239.method1690(arg1, 23267, arg5, class137.field2032[var6], arg4);
        }
    }
}
