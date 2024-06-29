import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class36 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field441 = "Loading world list data";

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Z")
    public static boolean field442 = true;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
    public static boolean field443 = false;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[J")
    public static long[] field444 = new long[100];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 7)
    public static void method251(byte arg0) {
        field441 = null;
        field444 = null;
        if (arg0 >= -74) {
            field443 = true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)[Lle;", line = 41)
    public static final class127[] method252(int arg0) {
        field446++;
        class127[] var1 = new class127[class96.field1444];
        for (int var2 = arg0; var2 < class96.field1444; var2++) {
            int var3 = class203.field3051[var2] * class160.field2403[var2];
            byte[] var4 = class205.field3083[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class66.field865[class124.method893(var4[var6], 255)];
            }
            var1[var2] = new class127(class12.field136, class132.field2034, class203.field3039[var2], class184.field2754[var2], class203.field3051[var2], class160.field2403[var2], var5);
        }
        class10.method49((byte) 111);
        return var1;
    }
}
