import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class128 {

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field50 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Ljava/lang/String;")
    public static String field47 = "Allocating memory";

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field54 = 0;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[Lel;")
    public static class213[] field48;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static final void method13(int arg0) {
        int var1 = class135.field2025 >> 7;
        if (arg0 != -30070) {
            return;
        }
        if (class248.field3941 < 128.0F) {
            class248.field3941 = 128.0F;
        }
        int var2 = class223.field3573 >> 7;
        if (class248.field3941 > 383.0F) {
            class248.field3941 = 383.0F;
        }
        field51++;
        while (class50.field818 >= 2048.0F) {
            class50.field818 -= 2048.0F;
        }
        int var3 = 0;
        while (class50.field818 < 0.0F) {
            class50.field818 += 2048.0F;
        }
        int var4 = class254.method1721(-580808345, class130.field1941, class223.field3573, class135.field2025);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class130.field1941;
                    if (var7 < 3 && (client.field2390[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class107.field1671[var7][var5][var6] & 0xFF) * 8 + var4 - class233.field3684[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class35.field616) {
            class35.field616 += (var9 - class35.field616) / 24;
        } else if (class35.field616 > var9) {
            class35.field616 += (var9 - class35.field616) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static void method14(int arg0) {
        int var1 = -64 % ((61 - arg0) / 63);
        field50 = null;
        field48 = null;
        field47 = null;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static final void method15(int arg0) {
        field53++;
        if (arg0 != -20827) {
            method14(85);
        }
        int[] var1 = new int[class159.field2373];
        int var2 = 0;
        for (int var3 = 0; var3 < class159.field2373; var3++) {
            class179 var5 = class123.method929(22497, var3);
            if (var5.field2755 >= 0 || var5.field2763 >= 0) {
                var1[var2++] = var3;
            }
        }
        class190.field2982 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class190.field2982[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Lpg;")
    public static final class78 method16(int arg0) {
        int var1 = 59 % ((arg0 + 15) / 60);
        field52++;
        try {
            return (class78) Class.forName("fl").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }
}
