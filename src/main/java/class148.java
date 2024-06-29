import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class148 {

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field1945 = 0;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "[I")
    public static int[] field1946 = new int[6];

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "F")
    public static float field1944;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "Lgv;")
    public static class58 field1951;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLug;)V", line = 9)
    public final void method892(byte arg0, class396 arg1) {
        field1950++;
        if (arg0 <= 51) {
            return;
        }
        while (true) {
            int var3 = arg1.method2388((byte) -120);
            if (var3 == 0) {
                return;
            }
            this.method894(arg1, (byte) -81, var3);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V", line = 30)
    public static void method893(byte arg0) {
        field1946 = null;
        field1951 = null;
        int var1 = 75 % ((arg0 + 51) / 56);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lug;BI)V", line = 40)
    private final void method894(class396 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field1949 = arg0.method2386(-23648);
            this.field1947 = arg0.method2388((byte) -123);
            this.field1952 = arg0.method2388((byte) -124);
        }
        if (arg1 < -40) {
            field1948++;
        }
    }
}
