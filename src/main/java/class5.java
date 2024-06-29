import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field82 = 2;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[Ldf;")
    public static class28[] field85 = new class28[16];

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lid;")
    private static class60 field84 = class11.method72("To create a new account you need to", (byte) -106);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lid;")
    public static class60 field79 = field84;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[Lhd;")
    public static class53[] field83 = new class53[32768];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method16(int arg0) {
        field78++;
        int var1 = (class107.field2640.field828 >> 7) + class144.field3240;
        class112.field2696 = 0;
        int var2 = (class107.field2640.field854 >> 7) + class41.field1095;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class112.field2696 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class112.field2696 = 1;
        }
        if (class112.field2696 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class112.field2696 = 0;
        }
        if (arg0 != 3199) {
            field82 = 99;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method17(byte arg0) {
        field85 = null;
        field79 = null;
        if (arg0 == -72) {
            field83 = null;
            field84 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method18(int arg0, Component arg1) {
        field80++;
        arg1.removeKeyListener(class133.field3041);
        if (arg0 >= -35) {
            field84 = null;
        }
        arg1.removeFocusListener(class133.field3041);
        class52.field1315 = -1;
    }
}
