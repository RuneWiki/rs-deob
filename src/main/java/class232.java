import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class232 extends class278 {

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "Lfg;")
    public static class83 field3216 = new class83(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "I")
    public static int field3217 = 104;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "(I)V", line = 8)
    public static final void method1354(int arg0) {
        class117.field1581 = 0;
        field3215++;
        int var1 = (class75.field1089.field466 >> 7) + class215.field3059;
        int var2 = (class75.field1089.field461 >> 7) + class79.field1134;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class117.field1581 = 1;
        }
        if (arg0 != -9536) {
            method1354(-48);
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class117.field1581 = 1;
        }
        if (class117.field1581 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class117.field1581 = 0;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V", line = 32)
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(II)I", line = 35)
    public static final int method1355(int arg0, int arg1) {
        return class171.field2451 == null ? 0 : (class171.field2451[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "(I)V", line = 38)
    public static void method1356(int arg0) {
        if (arg0 == 12637) {
            field3216 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)[I", line = 48)
    public final int[] method208(int arg0, int arg1) {
        field3214++;
        return arg0 == -9 ? class192.field2736 : null;
    }
}
