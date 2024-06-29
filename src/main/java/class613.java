import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class613 extends class464 {

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    private int field8104;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    private int field8105;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Lej;")
    private class111 field8109;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    private int field8099;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    private int field8100;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    private int field8102;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    private int field8101;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field8106 = 0;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lbi;")
    public static class449 field8103;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "Lul;")
    private class537 field8107;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V", line = 5)
    public static void method3352(byte arg0) {
        field8103 = null;
        if (arg0 > -60) {
            method3353(77, -34L, null);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IJLoa;)V", line = 25)
    public static final void method3353(int arg0, long arg1, class651 arg2) {
        class233.field3267 = 0;
        class102.field1526 = 0;
        class379.field5082 = class530.field7064;
        field8097++;
        class530.field7064 = 0;
        int var4 = -52 % ((arg0 - 13) / 55);
        long var5 = class681.method3802(-23600);
        for (class485 var7 = (class485) class98.field1476.method328(0); var7 != null; var7 = (class485) class98.field1476.method331((byte) -30)) {
            if (var7.method2717(arg2, arg1)) {
                class102.field1526++;
            }
        }
        if (class565.field7478 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class98.field1476.method323(127) + ", running: " + class102.field1526);
            System.out.println("Emitters: " + class233.field3267 + " Particles: " + class530.field7064 + ". Time taken: " + (class681.method3802(-23600) - var5) + "ms");
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lul;", line = 59)
    public final class537 method2627(byte arg0) {
        field8108++;
        if (arg0 > -70) {
            this.field8104 = 110;
        }
        if (this.field8107 == null) {
            class254.field3521[3] = this.field8100;
            class254.field3521[5] = this.field8102;
            class498 var2 = this.field8109.field8808;
            class254.field3521[1] = this.field8101;
            class254.field3521[2] = this.field8099;
            class254.field3521[0] = this.field8105;
            class254.field3521[4] = this.field8104;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2759(32700, class254.field3521[var5])) {
                    return null;
                }
                class364 var7 = var2.method2760(class254.field3521[var5], 21351);
                int var8 = var7.field4933 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field4942 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class563.field7466[var6] = var2.method2761((byte) 92, var4, false, class254.field3521[var6], 1.0F, var4);
            }
            this.field8107 = this.field8109.method103(var3 != 0, var4, class563.field7466, 0);
        }
        return this.field8107;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lej;IIIIII)V", line = 122)
    public class613(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8104 = arg5;
        this.field8105 = arg1;
        this.field8109 = arg0;
        this.field8099 = arg3;
        this.field8100 = arg4;
        this.field8102 = arg6;
        this.field8101 = arg2;
    }
}
