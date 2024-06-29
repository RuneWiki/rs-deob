import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class225 extends class158 {

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field4159 = 0;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field4160 = 0;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Ldc;")
    private static class37 field4162 = class185.method1233((byte) 86, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Ldc;")
    public static class37 field4161 = field4162;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Lwa;")
    public static class238 field4163;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4158;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method1476(int arg0) {
        class206.field3850 = arg0;
        for (int var1 = 0; var1 < class238.field4372; var1++) {
            for (int var2 = 0; var2 < client.field682; var2++) {
                if (class180.field3354[arg0][var1][var2] == null) {
                    class180.field3354[arg0][var1][var2] = new class18(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I")
    public static final int method1477(int arg0, int arg1, int arg2) {
        if (arg0 > -121) {
            return 20;
        }
        field4166++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static void method1478(int arg0) {
        field4162 = null;
        if (arg0 == -789436973) {
            field4161 = null;
            field4163 = null;
            field4158 = null;
        }
    }
}
