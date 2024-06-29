import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class58 extends class8 {

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field825 = 0;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field827 = new String[5];

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field829 = 0;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Ldg;")
    public static class142 field828;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public static void method421(int arg0) {
        if (arg0 == 6557) {
            field827 = null;
            field828 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
    public static final void method422(int arg0) {
        int var1 = -10 % ((arg0 + 2) / 53);
        int var2 = (class186.field2993.field1979 >> 7) + class282.field4487;
        class78.field1136 = 0;
        field823++;
        int var3 = (class186.field2993.field1910 >> 7) + class99.field1465;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class78.field1136 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class78.field1136 = 1;
        }
        if (class78.field1136 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class78.field1136 = 0;
        }
    }
}
