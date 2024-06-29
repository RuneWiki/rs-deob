import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class84 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[[[I")
    public static int[][][] field1490 = new int[2][][];

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[Z")
    public static boolean[] field1488 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Leb;")
    public static class230 field1491 = class68.method589(0, "rect_debug=");

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1493 = 10;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[[[I")
    public static int[][][] field1487;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static final void method677(byte arg0) {
        int var1 = (class56.field1033.field2274 >> 7) + class272.field4795;
        class65.field1220 = 0;
        field1489++;
        int var2 = (class56.field1033.field2300 >> 7) + class155.field2759;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class65.field1220 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class65.field1220 = 1;
        }
        if (arg0 != -24) {
            field1488 = null;
        }
        if (class65.field1220 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class65.field1220 = 0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
    public static final int method678(int arg0) {
        if (arg0 != 4296) {
            field1491 = null;
        }
        field1492++;
        return 2;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method679(int arg0) {
        field1490 = null;
        field1488 = null;
        field1487 = null;
        field1491 = null;
        int var1 = 47 % ((-arg0 - 50) / 61);
    }
}
