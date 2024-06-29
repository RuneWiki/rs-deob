import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class523 extends class486 {

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
    private int field7762;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    private int field7758;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
    private int field7760;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    private int field7750;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    private int field7761;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "Lgk;")
    private class463 field7753;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    private int field7757;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field7755 = 1;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "Lpi;")
    public static class340 field7749 = new class340(22, 7);

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "Ldn;")
    public static class201 field7751;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "Llm;")
    private class244 field7759;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "Ljava/lang/String;")
    public static String field7754;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "[[B")
    public static byte[][] field7763;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Llm;")
    public final class244 method762(int arg0) {
        if (arg0 != 27901) {
            this.field7758 = 123;
        }
        field7756++;
        if (this.field7759 == null) {
            class191.field2485[2] = this.field7758;
            class191.field2485[5] = this.field7750;
            class79 var2 = this.field7753.field1765;
            class191.field2485[4] = this.field7761;
            class191.field2485[3] = this.field7762;
            class191.field2485[0] = this.field7760;
            class191.field2485[1] = this.field7757;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method461(class191.field2485[var5], false)) {
                    return null;
                }
                class499 var7 = var2.method460(-26282, class191.field2485[var5]);
                int var8 = var7.field7331 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field7339 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class221.field2856[var6] = var2.method458(1.0F, var4, var4, (byte) 0, false, class191.field2485[var6]);
            }
            this.field7759 = new class244(this.field7753, 6407, var4, var3 != 0, class221.field2856);
        }
        return this.field7759;
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
    public static void method3107(int arg0) {
        field7749 = null;
        field7754 = null;
        if (arg0 != -1) {
            method3107(84);
        }
        field7751 = null;
        field7763 = null;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lgk;IIIIII)V")
    public class523(class463 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7762 = arg4;
        this.field7758 = arg3;
        this.field7760 = arg1;
        this.field7750 = arg6;
        this.field7761 = arg5;
        this.field7753 = arg0;
        this.field7757 = arg2;
    }
}
