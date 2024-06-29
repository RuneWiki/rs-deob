import java.awt.Canvas;
import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class142 {

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public int field3128 = -1;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lic;")
    public static class59 field3118 = class59.method433(0, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
    public static int[] field3121 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lic;")
    public static class59 field3124 = class59.method433(0, "au");

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lbb;")
    public class10 field3119;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Ldd;")
    public static class26 field3127;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3115;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field3120;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
    public static int[] field3123;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "[I")
    public int[] field3126;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[Lic;")
    public class59[] field3117;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lq;IBI[Lkd;[B)V")
    public static final void method1058(class111 arg0, int arg1, byte arg2, int arg3, class73[] arg4, byte[] arg5) {
        field3116++;
        class157 var6 = new class157(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1171(arg2 - 32840);
            if (var8 == 0) {
                if (arg2 != 72) {
                    field3127 = null;
                    return;
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1171(-32768);
                if (var10 == 0) {
                    break;
                }
                int var11 = var6.method1194(false);
                int var12 = var11 >> 2;
                int var13 = var11 & 0x3;
                var9 += var10 - 1;
                int var14 = var9 >> 6 & 0x3F;
                int var15 = var9 & 0x3F;
                int var16 = var15 + arg3;
                int var17 = var9 >> 12;
                int var18 = arg1 + var14;
                if (var18 > 0 && var16 > 0 && var18 < 103 && var16 < 103) {
                    int var19 = var17;
                    if ((class121.field2785[1][var18][var16] & 0x2) == 2) {
                        var19 = var17 - 1;
                    }
                    class73 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg4[var19];
                    }
                    class21.method120(var13, var7, var17, var12, arg0, var16, var20, var18, arg2 ^ 0x42);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)V")
    public static final void method1059(boolean arg0, byte arg1) {
        class35.method268((byte) 107);
        int var2 = 96 / ((-arg1 - 56) / 45);
        field3122++;
        class33.field893++;
        if (class33.field893 < 50 && !arg0) {
            return;
        }
        class33.field893 = 0;
        if (class126.field2857 || class102.field2491 == null) {
            return;
        }
        client.field489++;
        class125.field2842.method1072(85, -1);
        try {
            class102.field2491.method306(class125.field2842.field3457, 0, 15731, class125.field2842.field3473);
            class125.field2842.field3457 = 0;
        } catch (IOException var3) {
            class126.field2857 = true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method1060(boolean arg0) {
        field3127 = null;
        field3123 = null;
        field3118 = null;
        field3120 = null;
        field3115 = null;
        field3121 = null;
        if (!arg0) {
            method1059(true, (byte) 58);
        }
        field3124 = null;
    }
}
