import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class188 extends class182 {

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    private int field3186 = 0;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    private int field3190 = 4096;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3184 = "red:";

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "[I")
    public static int[] field3187 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 7)
    public static void method1306(byte arg0) {
        field3184 = null;
        field3187 = null;
        int var1 = -41 / ((-arg0 - 11) / 43);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 28)
    public class188() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[I", line = 36)
    public final int[] method125(int arg0, int arg1) {
        field3185++;
        int[] var3 = this.field3166.method775(arg1, 127);
        if (arg0 != 2) {
            field3184 = (String) null;
        }
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(arg1, 0, -127);
            for (int var5 = 0; var5 < class26.field672; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field3186 <= var6 && this.field3190 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lth;I)I", line = 70)
    public static final int method1307(class98 arg0, int arg1) {
        field3189++;
        int var2 = arg0.field1798;
        class5 var3 = arg0.method60(true);
        if (arg0.field206 == var3.field106) {
            var2 = arg0.field1787;
        } else if (arg0.field206 == var3.field80 || arg0.field206 == var3.field110 || arg0.field206 == var3.field91 || arg0.field206 == var3.field94) {
            var2 = arg0.field1786;
        } else if (arg0.field206 == var3.field82 || arg0.field206 == var3.field103 || arg0.field206 == var3.field99 || arg0.field206 == var3.field113) {
            var2 = arg0.field1797;
        }
        return arg1 <= 126 ? -64 : var2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Loe;IB)V", line = 99)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            return;
        }
        if (arg1 == 0) {
            this.field3186 = arg0.method989(103);
        } else if (arg1 == 1) {
            this.field3190 = arg0.method989(120);
        }
        field3183++;
    }
}
