import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class330 extends class389 {

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    public int field4878 = (int) (class490.method2840(true) / 1000L);

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "Ljava/lang/String;")
    public String field4881;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "S")
    public short field4879;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    public static int field4877 = 0;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "[[Z")
    public static boolean[][] field4880 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "Z")
    public static boolean field4882 = false;

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
    public static int field4883 = -1;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "Lpu;")
    public static class522 field4876;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
    public static void method2075(byte arg0) {
        if (arg0 < 58) {
            field4882 = false;
        }
        field4876 = null;
        field4880 = null;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
    public static final void method2076(int arg0) {
        class499.field7078 = arg0;
        field4875++;
        int var1 = (class648.field9106.field3024 >> 9) + class109.field1672;
        int var2 = (class648.field9106.field3029 >> 9) + class203.field2874;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class499.field7078 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class499.field7078 = 1;
        }
        if (class499.field7078 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class499.field7078 = 0;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class330(String arg0, int arg1) {
        this.field4881 = arg0;
        this.field4879 = (short) arg1;
    }
}
