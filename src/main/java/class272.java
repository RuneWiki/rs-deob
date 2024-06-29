import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class272 extends class88 {

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public int field4812 = 0;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public int field4823 = -1;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Lhj;")
    public static class69 field4816 = class181.method1318("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) -123);

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public int field4809;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public int field4810;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public int field4819;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public int field4822;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "[Lhk;")
    public static class121[] field4821;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "[[I")
    public static int[][] field4814;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public static final void method1862(int arg0) {
        class105.field1993 = 0;
        field4825++;
        if (arg0 != -3137) {
            return;
        }
        int var1 = (class156.field2904.field3985 >> 7) + class242.field4441;
        int var2 = (class156.field2904.field4005 >> 7) + class220.field3962;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class105.field1993 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class105.field1993 = 1;
        }
        if (class105.field1993 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class105.field1993 = 0;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    public static void method1863(int arg0) {
        field4814 = null;
        if (arg0 != -3239) {
            field4814 = null;
        }
        field4816 = null;
        field4821 = null;
    }
}
