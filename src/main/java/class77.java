import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class77 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1377 = 7759444;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    public static int[] field1379 = new int[32];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 12)
    public static void method584(byte arg0) {
        field1379 = null;
        int var1 = 119 % ((arg0 - 16) / 63);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILek;II)Lka;", line = 22)
    public static final class211 method585(int arg0, class206 arg1, int arg2, int arg3) {
        field1376++;
        if (class76.method581(arg1, 61, arg0, arg3)) {
            if (arg2 > -86) {
                method585(-37, (class206) null, 112, -23);
            }
            return class231.method1612(0);
        } else {
            return null;
        }
    }
}
