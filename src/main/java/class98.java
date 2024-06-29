import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class98 {

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public static int field1028 = 2;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "[I")
    public static int[] field1030 = new int[4096];

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "J")
    public static long field1024;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "Z")
    public boolean field1026;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/String;CB)I")
    public static final int method685(String arg0, char arg1, byte arg2) {
        field1029++;
        int var3 = 0;
        int var4 = arg0.length();
        int var5 = 0;
        int var6 = -54 / ((arg2 - 27) / 55);
        while (var5 < var4) {
            if (arg1 == arg0.charAt(var5)) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILfh;)Ljava/lang/String;")
    public static final String method686(int arg0, class649 arg1) {
        if (arg0 != 31734) {
            field1030 = null;
        }
        field1031++;
        if (arg1.field9280 == null || arg1.field9280.length() == 0) {
            return arg1.field9269 == null || arg1.field9269.length() <= 0 ? arg1.field9265 : arg1.field9265 + class486.field6936.method2936(class489.field6978, arg0 ^ 0xFFFF8430) + arg1.field9269;
        } else if (arg1.field9269 == null || arg1.field9269.length() <= 0) {
            return arg1.field9265 + class486.field6936.method2936(class489.field6978, arg0 - 31609) + arg1.field9280;
        } else {
            return arg1.field9265 + class486.field6936.method2936(class489.field6978, -102) + arg1.field9269 + class486.field6936.method2936(class489.field6978, -85) + arg1.field9280;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
    public static void method687(byte arg0) {
        if (arg0 <= 93) {
            method687((byte) -10);
        }
        field1030 = null;
    }
}
