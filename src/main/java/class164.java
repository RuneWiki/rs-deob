import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class164 extends class236 {

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[S")
    public static short[] field2686 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "[I")
    public static int[] field2687 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field2688 = 0;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field2691 = -1;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static final void method1154(boolean arg0) {
        field2685++;
        class185.field3060 = 0;
        class44.field712 = 0;
        class57.method368((byte) 123);
        class20.method95(!arg0);
        class177.method1240(1);
        class217.method1488((byte) -127);
        for (int var1 = 0; var1 < class44.field712; var1++) {
            int var3 = class16.field238[var1];
            if (class179.field2960 != class66.field1055[var3].field4309) {
                if (class66.field1055[var3].field1716 > 0) {
                    class17.method86(class66.field1055[var3], 14420);
                }
                class66.field1055[var3] = null;
            }
        }
        if (arg0) {
            field2688 = 17;
        }
        if (class70.field1128 != class97.field1622.field2026) {
            throw new RuntimeException("gpp1 pos:" + class97.field1622.field2026 + " psize:" + class70.field1128);
        }
        for (int var2 = 0; var2 < class86.field1444; var2++) {
            if (class66.field1055[class75.field1195[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class86.field1444);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ldf;ZI)V")
    public static final void method1155(class51 arg0, boolean arg1, int arg2) {
        field2690++;
        byte var3 = 4;
        int var4 = arg2 + var3;
        int var5 = var3 + 6;
        int var6 = class177.field2891.method1319(arg0, 250);
        int var7 = class177.field2891.method1326(arg0, 250) * 13;
        class59.method393(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 0);
        class59.method375(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        class177.field2891.method1328(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class2.method6(var5 - var3, var4 - var3, arg2 - 6, var3 + var6 + var3, var3 + var7 + var3);
        if (!arg1) {
            class97.method720(var7, var6, var4, var5, (byte) -46);
            return;
        }
        try {
            Graphics var8 = class31.field452.getGraphics();
            class192.field3209.method122(true, var8, 0, 0);
        } catch (Exception var9) {
            class31.field452.repaint();
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
    public static void method1156(byte arg0) {
        field2687 = null;
        field2686 = null;
        if (arg0 < 98) {
            field2688 = 11;
        }
    }
}
