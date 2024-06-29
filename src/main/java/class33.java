import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class33 extends class202 {

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "Lsb;")
    public static class98 field577 = class47.method368(" )2> <col=ffffff>", 0);

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "Lsb;")
    private static class98 field576 = class47.method368(" from your friend list first)3", 0);

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "Lsb;")
    public static class98 field575 = field576;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "Lsb;")
    private static class98 field584 = class47.method368("Free world", 0);

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "Lsb;")
    public static class98 field582 = field584;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "B")
    public byte field581;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "Lac;")
    public class188 field580;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "[I")
    public static int[] field572;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "[I")
    public static int[] field573;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "[[Lq;")
    public static class148[][] field585;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static final void method290(int arg0) {
        if (arg0 != -1) {
            return;
        }
        if (class197.field3394 != null) {
            class85 var1 = class197.field3394;
            synchronized (class197.field3394) {
                class197.field3394 = null;
            }
        }
        field583++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static final void method291(int arg0) {
        if (arg0 > -97) {
            return;
        }
        field579++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class226.field3894 - 1); var2++) {
                if (class212.field3630[var2] < 1000 && class212.field3630[var2 + 1] > 1000) {
                    class98 var3 = class217.field3751[var2];
                    var1 = false;
                    class217.field3751[var2] = class217.field3751[var2 + 1];
                    class217.field3751[var2 + 1] = var3;
                    class98 var4 = class112.field1994[var2];
                    class112.field1994[var2] = class112.field1994[var2 + 1];
                    class112.field1994[var2 + 1] = var4;
                    int var5 = class182.field3138[var2];
                    class182.field3138[var2] = class182.field3138[var2 + 1];
                    class182.field3138[var2 + 1] = var5;
                    int var6 = class129.field2309[var2];
                    class129.field2309[var2] = class129.field2309[var2 + 1];
                    class129.field2309[var2 + 1] = var6;
                    short var7 = class212.field3630[var2];
                    class212.field3630[var2] = class212.field3630[var2 + 1];
                    class212.field3630[var2 + 1] = var7;
                    long var8 = class88.field1569[var2];
                    class88.field1569[var2] = class88.field1569[var2 + 1];
                    class88.field1569[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public static void method292(boolean arg0) {
        field575 = null;
        field573 = null;
        field577 = null;
        field584 = null;
        field585 = null;
        if (arg0) {
            field585 = null;
        }
        field576 = null;
        field572 = null;
        field582 = null;
    }
}
