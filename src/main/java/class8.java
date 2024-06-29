import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class8 extends class239 {

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Luv;")
    public static class3 field65 = new class3(27, 3);

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "[Lhr;")
    public static class556[] field69 = new class556[14];

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public static void method33(byte arg0) {
        int var1 = 91 % ((42 - arg0) / 34);
        field65 = null;
        field69 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIII)V")
    public class8(int arg0, int arg1, int arg2, int arg3) {
        this.field63 = arg1;
        this.field64 = arg3;
        this.field66 = arg0;
        this.field62 = arg2;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
    public static final void method34(byte arg0) {
        class82.field1119 = 0;
        field67++;
        int var1 = (class147.field1899.field6362 >> 9) + class525.field7310;
        int var2 = (class147.field1899.field6368 >> 9) + class58.field786;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class82.field1119 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class82.field1119 = 1;
        }
        if (arg0 != -69) {
            field69 = null;
        }
        if (class82.field1119 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class82.field1119 = 0;
        }
    }

    static {
        new class344("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }
}
