import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class283 extends class298 {

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    private int field3968;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lkfa;")
    private class382 field3969;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    private int field3970;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    private int field3961;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    private int field3964;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    private int field3971;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field3963 = -1;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field3965 = 0;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lgfa;")
    private class656 field3962;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Lgfa;")
    public final class656 method1505(byte arg0) {
        field3966++;
        int var2 = 0 % ((arg0 + 74) / 37);
        if (this.field3962 == null) {
            class689.field9780[5] = this.field3964;
            class689.field9780[1] = this.field3968;
            class689.field9780[4] = this.field3971;
            class689.field9780[0] = this.field3970;
            class689.field9780[2] = this.field3961;
            class689.field9780[3] = this.field3967;
            class615 var3 = this.field3969.field1459;
            boolean var4 = false;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method2363((byte) -120, class689.field9780[var6])) {
                    return null;
                }
                class377 var8 = var3.method2359(-127, class689.field9780[var6]);
                int var9 = var8.field5222 ? 64 : 128;
                if (var9 > var5) {
                    var5 = var9;
                }
                if (var8.field5231 > 0) {
                    var4 = true;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class482.field6899[var7] = var3.method2360(var5, false, class689.field9780[var7], (byte) 118, 1.0F, var5);
            }
            this.field3962 = new class656(this.field3969, 6407, var5, var4, class482.field6899);
        }
        return this.field3962;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lkfa;IIIIII)V")
    public class283(class382 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3968 = arg2;
        this.field3967 = arg4;
        this.field3969 = arg0;
        this.field3970 = arg1;
        this.field3961 = arg3;
        this.field3964 = arg6;
        this.field3971 = arg5;
    }
}
