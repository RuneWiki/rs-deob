import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class174 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Z")
    public static boolean field2860 = true;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public static final void method1221() {
        for (int var0 = 0; var0 < class52.field895; var0++) {
            for (int var4 = 0; var4 < class48.field758; var4++) {
                for (int var5 = 0; var5 < class192.field3229; var5++) {
                    class27.field395[var0][var4][var5] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class46.field730; var1++) {
            class147.field2471[var1] = null;
        }
        class46.field730 = 0;
        for (int var2 = 0; var2 < class16.field256; var2++) {
            class216.field3752[var2] = null;
        }
        class16.field256 = 0;
        for (int var3 = 0; var3 < class132.field2206.length; var3++) {
            class132.field2206[var3] = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIILwc;)V")
    public static final void method1222(int arg0, int arg1, int arg2, class213 arg3) {
        field2863++;
        if (class170.field2780 != 0 && class170.field2780 != 3 || !arg3.method1465(false)) {
            return;
        }
        int var4 = arg3.field3661[arg0];
        if (var4 > arg2 || arg2 > arg3.field3637[arg0] + var4) {
            return;
        }
        int var5 = arg0 - arg3.field3608 / 2;
        int var6 = class120.field1993 + class119.field1991 & 0x7FF;
        int var7 = arg2 - arg3.field3603 / 2;
        int var8 = class73.field1155[var6];
        if (arg1 < 75) {
            field2861 = 127;
        }
        int var9 = (class109.field1849 + 256) * var8 >> 8;
        int var10 = class73.field1167[var6];
        int var11 = (class109.field1849 + 256) * var10 >> 8;
        int var12 = var5 * var9 + var7 * var11 >> 11;
        int var13 = class44.field706.field4319 + var12 >> 7;
        int var14 = var5 * var11 - var7 * var9 >> 11;
        int var15 = class44.field706.field4348 - var14 >> 7;
        if (class179.field2954 > 0 && class144.field2405[82] && class144.field2405[81]) {
            class109.method791(class11.field160 + var13, (byte) -72, class257.field4496, class241.field4179 + var15);
            return;
        }
        boolean var16 = class202.method1403(var15, true, 2, 0, class44.field706.field4343[0], 0, 0, var13, class44.field706.field4336[0], 0, 0, 1);
        if (!var16) {
            return;
        }
        class95.field1575.method919(-4742, var7);
        class95.field1575.method919(-4742, var5);
        class95.field1575.method895(-14, class120.field1993);
        class95.field1575.method919(-4742, 57);
        class95.field1575.method919(-4742, class119.field1991);
        class95.field1575.method919(-4742, class109.field1849);
        class95.field1575.method919(-4742, 89);
        class95.field1575.method895(-23, class44.field706.field4319);
        class95.field1575.method895(-24, class44.field706.field4348);
        class95.field1575.method919(-4742, class45.field724);
        class95.field1575.method919(-4742, 63);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method1223(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
    public static final void method1224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class59.method390(arg4, arg1, arg2 + arg4, arg0 + arg1);
        class59.method393(arg4, arg1, arg2, arg0, 0);
        field2862++;
        if (class74.field1182 < 100) {
            return;
        }
        if (class184.field3047 == null || class184.field3047.field2806 != arg2 || class184.field3047.field2800 != arg0) {
            class254 var5 = new class254(arg2, arg0);
            class59.method384(var5.field4447, arg2, arg0);
            class16.method81(class85.field1433, 0, arg0, (byte) 61, 0, class5.field38, 0, 0, arg2);
            class184.field3047 = var5;
            class192.field3209.method126(-99);
        }
        class184.field3047.method1100(arg4, arg1);
        int var6 = class57.field951 * arg2 / class5.field38 + arg4;
        int var7 = class67.field1094 * arg2 / class5.field38;
        int var8 = class179.field2959 * arg0 / class85.field1433 + arg1;
        int var9 = class39.field615 * arg0 / class85.field1433;
        if (arg3 >= -103) {
            field2861 = 19;
        }
        class59.method387(var6, var8, var7, var9, 16711680, 128);
        class59.method375(var6, var8, var7, var9, 16711680);
        if (class55.field940 <= 0 || class55.field940 % 10 >= 5) {
            return;
        }
        for (class76 var10 = (class76) class114.field1920.method1720(true); var10 != null; var10 = (class76) class114.field1920.method1712((byte) 112)) {
            if (class98.field1645 == var10.field1231) {
                int var11 = var10.field1228 * arg2 / class5.field38 + arg4;
                int var12 = var10.field1225 * arg0 / class85.field1433 + arg1;
                class59.method393(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1225(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)I")
    public abstract int method1226(int arg0);
}
