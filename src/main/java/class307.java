import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class307 extends class439 {

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "J")
    public long field4381;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field4379;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method1930(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class225.field3278 = arg0;
        class427.field6246 = 0x1 << class225.field3278;
        class495.field7211 = class427.field6246 >> 1;
        class303.field4349 = (int) Math.sqrt((double) (class495.field7211 * class495.field7211 + class495.field7211 * class495.field7211));
        class505.field7406 = class427.field6246 >> 2;
        class292.field4186 = class427.field6246;
        class246.field3560 = arg2;
        class254.field3675 = arg3;
        class117.field1846 = arg4;
        class73.field1223 = new class165[arg1][class246.field3560][class254.field3675];
        class145.field2135 = new class35[arg1];
        if (arg5) {
            class436.field6338 = new int[class246.field3560][class254.field3675];
            class214.field3090 = new byte[class246.field3560][class254.field3675];
            class273.field3951 = new byte[class246.field3560][class254.field3675];
            class74.field1242 = new class165[1][class246.field3560][class254.field3675];
            class62.field1063 = new class35[1];
        } else {
            class436.field6338 = null;
            class214.field3090 = null;
            class273.field3951 = null;
            class74.field1242 = null;
            class62.field1063 = null;
        }
        if (arg6) {
            class371.field5544 = new long[arg1][arg2][arg3];
            class242.field3512 = new class480[65535];
            class145.field2144 = new boolean[65535];
            class224.field3245 = 0;
        } else {
            class371.field5544 = null;
            class242.field3512 = null;
            class145.field2144 = null;
            class224.field3245 = 0;
        }
        class67.method581(false);
        class207.field2982 = new class322[1000];
        class396.field5825 = 0;
        class86.field1437 = new class322[1000];
        class18.field287 = 0;
        class439.field6402 = new int[arg1][class246.field3560 + 1][class254.field3675 + 1];
        class381.field5681 = new class370[5000];
        class288.field4149 = 0;
        class298.field4257 = new boolean[class117.field1846 + class117.field1846 + 1][class117.field1846 + class117.field1846 + 1];
        class342.field5220 = new boolean[class117.field1846 + class117.field1846 + 2][class117.field1846 + class117.field1846 + 2];
        class274.field3957 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)V")
    public static void method1931(boolean arg0) {
        if (arg0) {
            method1932(71, null);
        }
        field4379 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1932(int arg0, String[] arg1) {
        field4380++;
        String[] var2 = new String[5];
        int var3 = 121 / ((arg0 + 31) / 58);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = var4 + ": ";
            if (arg1 != null && arg1[var4] != null) {
                var2[var4] = var2[var4] + arg1[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
    public class307() {
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(J)V")
    public class307(long arg0) {
        this.field4381 = arg0;
    }
}
