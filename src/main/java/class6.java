import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lid;")
    public static class149 field69 = class60.method382("::fpsoff", (byte) 71);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lid;")
    public static class149 field67 = class60.method382("::gc", (byte) 80);

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lid;")
    public static class149 field70 = class60.method382("<col=ffb000>", (byte) 92);

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lid;")
    public static class149 field74 = class60.method382("::tween", (byte) 110);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lmb;")
    public static class160 field73;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Lug;")
    public class199 field71;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field72;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method33(byte arg0) {
        if (arg0 != 9) {
            field67 = null;
        }
        field67 = null;
        field69 = null;
        field70 = null;
        field74 = null;
        field73 = null;
        field72 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)V")
    public static final void method34(boolean arg0, int arg1) {
        field68++;
        byte var2 = 4;
        byte[][] var3 = class103.field1808;
        if (arg1 < 94) {
            return;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class279.method1923(64);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class184.field3319[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x37BAFB7) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = (var8 & 0x3FFD) >> 3;
                            int var12 = var8 >> 14 & 0x3FF;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class267.field4761.length; var14++) {
                                if (class267.field4761[var14] == var13 && var3[var14] != null) {
                                    var7 = true;
                                    class82.method612(var5 * 8, (var11 & 0x7) * 8, var6 * 8, var4, var3[var14], var10, class228.field3989, var9, 73, arg0, (var12 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class20.method113(var5 * 8, 8, var6 * 8, (byte) 123, 8, var4);
                    }
                }
            }
        }
    }
}
