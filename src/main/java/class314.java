import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class314 extends class712 {

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    private int field4485;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    private int field4487;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    private int field4478;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    private int field4480;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "Lrda;")
    private class663 field4483;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    private int field4494;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
    private int field4492;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4489 = null;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "[I")
    public static int[] field4490 = new int[1000];

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "Laea;")
    public static class50 field4479 = new class50();

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "Z")
    public static boolean field4493 = false;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "Lkaa;")
    public static class47 field4491 = new class47(80, 7);

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "Lhu;")
    public static class133 field4486;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "Ljc;")
    private class444 field4482;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
    public static void method1921(int arg0) {
        field4491 = null;
        field4486 = null;
        field4490 = null;
        field4489 = null;
        field4479 = null;
        if (arg0 <= 100) {
            method1921(61);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)Ljc;")
    public final class444 method1922(boolean arg0) {
        field4481++;
        if (this.field4482 == null) {
            class689.field9593[5] = this.field4478;
            class689.field9593[1] = this.field4492;
            class689.field9593[2] = this.field4494;
            class689.field9593[4] = this.field4487;
            class152 var2 = this.field4483.field717;
            class689.field9593[3] = this.field4485;
            class689.field9593[0] = this.field4480;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method85(class689.field9593[var5], -32345)) {
                    return null;
                }
                class758 var7 = var2.method91(class689.field9593[var5], (byte) 125);
                int var8 = var7.field10548 ? 64 : 128;
                if (var7.field10535 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class584.field7645[var6] = var2.method86(-127, var4, 1.0F, false, class689.field9593[var6], var4);
            }
            this.field4482 = new class444(this.field4483, 6407, var4, var3, class584.field7645);
        }
        return arg0 ? this.field4482 : null;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lrda;IIIIII)V")
    public class314(class663 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4485 = arg4;
        this.field4487 = arg5;
        this.field4478 = arg6;
        this.field4480 = arg1;
        this.field4483 = arg0;
        this.field4494 = arg3;
        this.field4492 = arg2;
    }
}
