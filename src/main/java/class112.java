import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class112 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1289 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
    public static int[] field1293 = new int[4096];

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
    public static int[] field1296 = new int[32];

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Z")
    public static boolean field1295;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method617(char arg0, String arg1, int arg2) {
        field1291++;
        if (arg2 != 16777215) {
            return null;
        }
        int var3 = class221.method1441(0, arg0, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method618(int arg0) {
        field1293 = null;
        field1296 = null;
        if (arg0 == -9536) {
            field1289 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static final void method619(int arg0) {
        field1294++;
        class307.field4396 = 0;
        int var1 = (class390.field5715.field1304 >> 7) + class40.field427;
        if (arg0 != 15247) {
            field1289 = null;
        }
        int var2 = (class390.field5715.field1311 >> 7) + class217.field2975;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class307.field4396 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class307.field4396 = 1;
        }
        if (class307.field4396 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class307.field4396 = 0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)I")
    public static final int method620(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 117) {
            return 56;
        } else {
            field1290++;
            int var5 = 65536 - class286.field4035[arg4 * 8192 / arg2] >> 1;
            return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
        }
    }
}
