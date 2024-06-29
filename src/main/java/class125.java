import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class125 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Leh;")
    public static class47 field2509 = class195.method1282((byte) -4, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[I")
    public static int[] field2514 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Leh;")
    public static class47 field2513 = class195.method1282((byte) -4, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Z")
    public static boolean field2512 = false;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "[I")
    public static int[] field2515 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BI[Ldg;BI)V")
    public static final void method949(byte[] arg0, int arg1, class37[] arg2, byte arg3, int arg4) {
        int var5 = -62 / ((-arg3 - 18) / 57);
        field2511++;
        class68 var6 = new class68(arg0);
        int var7 = -1;
        while (true) {
            int var8 = var6.method603((byte) -121);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method603((byte) -114);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var6.method604((byte) -127);
                int var14 = var9 >> 12;
                int var15 = var13 & 0x3;
                int var16 = var13 >> 2;
                int var17 = arg4 + var11;
                int var18 = var12 + arg1;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    int var19 = var14;
                    if ((class182.field3490[1][var18][var17] & 0x2) == 2) {
                        var19 = var14 - 1;
                    }
                    class37 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg2[var19];
                    }
                    class14.method123(var17, var18, var15, var7, var20, var16, (byte) 81, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method950(int arg0) {
        field2509 = null;
        field2515 = null;
        field2514 = null;
        field2513 = null;
        if (arg0 != 21367) {
            method950(125);
        }
    }
}
