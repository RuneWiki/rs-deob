import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class228 {

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "Z")
    public static boolean field2962 = false;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field2956 = 0;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Ljw;")
    public static class259 field2959 = new class259(12, 7);

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "Loq;")
    public static class657 field2963;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "Z")
    public boolean field2961;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I", line = 3)
    public static final int method1414(int arg0, int arg1, int arg2) {
        field2953++;
        int var3 = arg1 >>> 31;
        int var4 = 68 / ((-arg2 - 41) / 43);
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lsv;ILr;)I", line = 17)
    public static final int method1415(class425 arg0, int arg1, class562 arg2) {
        field2955++;
        int var3 = 36 / ((arg1 + 38) / 39);
        if (arg0.field5729 != -1) {
            return arg0.field5729;
        }
        if (arg0.field5739 != -1) {
            class105 var4 = arg2.field7682.method2959(90, arg0.field5739);
            if (!var4.field1249) {
                return var4.field1262;
            }
        }
        return arg0.field5723;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 42)
    public static void method1416(byte arg0) {
        field2959 = null;
        field2963 = null;
        if (arg0 != 103) {
            method1414(-35, 99, -75);
        }
    }
}
