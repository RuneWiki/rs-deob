import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class174 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Ls;")
    public class245 field2806;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "[I")
    public int[] field2809;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lwe;")
    public static final class43 method1207(int arg0) {
        field2807++;
        int var1 = class263.field4168[0] * class207.field3348[0];
        byte[] var2 = class168.field2726[0];
        int[] var3 = new int[var1];
        if (arg0 != 255) {
            method1207(61);
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class131.field2187[class204.method1369(255, var2[var4])];
        }
        class43 var5 = new class43(class88.field1215, class64.field904, class70.field968[0], class249.field3993[0], class207.field3348[0], class263.field4168[0], var3);
        class111.method804(0);
        return var5;
    }
}
