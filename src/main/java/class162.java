import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class162 {

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3295 = 0;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[Lo;")
    public static class134[] field3292 = new class134[256];

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Ldd;")
    private static class35 field3294 = class180.method1196((byte) 0, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[Lj;")
    public static class89[] field3297 = new class89[4];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Ldd;")
    public static class35 field3289 = class180.method1196((byte) 0, " )2> ");

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Ldd;")
    public static class35 field3288 = field3294;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lo;")
    public static class134 field3293;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static void method1075(byte arg0) {
        field3289 = null;
        if (arg0 >= -15) {
            method1076(null, (byte) 88, false);
        }
        field3294 = null;
        field3293 = null;
        field3297 = null;
        field3292 = null;
        field3288 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ldd;BZ)V")
    public static final void method1076(class35 arg0, byte arg1, boolean arg2) {
        field3287++;
        byte var3 = 4;
        if (arg1 > -22) {
            return;
        }
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class26.field574.method1318(arg0, 250);
        int var7 = class26.field574.method1316(arg0, 250) * 13;
        class140.method970(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 + var3, 0);
        class140.method959(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 - -var3, 16777215);
        class26.field574.method1313(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class209.method1377(var3 + var3 + var7, var3 + var6 + var3, 5488, var4 - var3, -var3 + var5);
        if (!arg2) {
            class70.method565(-17803, var7, var4, var6, var5);
            return;
        }
        try {
            Graphics var8 = class118.field2618.getGraphics();
            class97.field2141.method359(true, 0, var8, 0);
        } catch (Exception var9) {
            class118.field2618.repaint();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZJ)V")
    public static final void method1077(boolean arg0, long arg1) {
        field3290++;
        if (!arg0) {
            field3295 = 69;
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class136.field2912; var3++) {
            if (class5.field82[var3] == arg1) {
                class31.field637++;
                class136.field2912--;
                for (int var4 = var3; var4 < class136.field2912; var4++) {
                    class5.field82[var4] = class5.field82[var4 + 1];
                    class58.field1449[var4] = class58.field1449[var4 + 1];
                }
                class100.field2208 = class13.field232;
                class1.field11.method659(71, true);
                class1.field11.method239((byte) 119, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lag;I)V")
    public static final void method1078(class8 arg0, int arg1) {
        field3296++;
        if (arg1 > 124) {
            class191.field3845 = arg0;
        }
    }
}
