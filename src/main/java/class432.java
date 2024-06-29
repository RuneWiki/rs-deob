import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class432 {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field6464 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lvv;")
    public static class313 field6463 = new class313(31, 3);

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field6467 = 0;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 11)
    public static final void method2627(byte arg0) {
        field6465++;
        if (arg0 != 126) {
            method2628(122);
        }
        for (class451 var1 = (class451) class305.field4874.method2538(arg0 - 129); var1 != null; var1 = (class451) class305.field4874.method2535((byte) -60)) {
            if (var1.field6731) {
                var1.method2702(arg0 ^ 0x7E);
            }
        }
        for (class451 var2 = (class451) class511.field7481.method2538(-3); var2 != null; var2 = (class451) class511.field7481.method2535((byte) -112)) {
            if (var2.field6731) {
                var2.method2702(0);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 47)
    public static void method2628(int arg0) {
        field6463 = null;
        int var1 = -94 / ((24 - arg0) / 45);
    }
}
