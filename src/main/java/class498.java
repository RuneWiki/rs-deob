import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class498 {

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "Z")
    public static boolean field7050 = false;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "[Z")
    public static boolean[] field7053 = new boolean[100];

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "Leh;")
    public static class246 field7051 = new class246(77, 2);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "J")
    public long field7060;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Lpi;")
    public static class350 field7049;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "Lul;")
    public static class411 field7057;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Lev;")
    public class498 field7055;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "Lev;")
    public class498 field7056;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "[[B")
    public static byte[][] field7054;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V", line = 3)
    public final void method2891(int arg0) {
        field7048++;
        if (this.field7056 == null) {
            return;
        }
        int var2 = -42 % ((-arg0 - 62) / 59);
        this.field7056.field7055 = this.field7055;
        this.field7055.field7056 = this.field7056;
        this.field7056 = null;
        this.field7055 = null;
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)V", line = 20)
    public static void method2892(byte arg0) {
        field7053 = null;
        field7054 = null;
        field7051 = null;
        field7049 = null;
        field7057 = null;
        if (arg0 <= 18) {
            method2893(52);
        }
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V", line = 34)
    public static final void method2893(int arg0) {
        class228.field3359 = arg0;
        for (int var1 = 0; var1 < class6.field109; var1++) {
            for (int var2 = 0; var2 < class272.field4032; var2++) {
                if (class268.field3910[arg0][var1][var2] == null) {
                    class268.field3910[arg0][var1][var2] = new class239(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)Z", line = 68)
    public final boolean method2894(int arg0) {
        field7052++;
        if (arg0 != 0) {
            this.method2894(-104);
        }
        return this.field7056 != null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZLhm;)V", line = 97)
    public static final void method2895(boolean arg0, class150 arg1) {
        field7059++;
        if (arg1.field2022 == 5 && arg1.field2089 != -1) {
            class311.method1884(-16777216, arg1, class385.field5414);
        }
        if (!arg0) {
            method2892((byte) -107);
        }
    }
}
