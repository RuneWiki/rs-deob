import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lpe;")
    public static class109 field1485 = class141.method1120("m-Ochte sich mit Ihnen duellieren)3", 0);

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1490 = 2;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1493 = 0;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lbc;")
    public static class11 field1488 = new class11(64);

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lpe;")
    private static class109 field1495 = class141.method1120("Unexpected loginserver response)3", 0);

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lpe;")
    public static class109 field1494 = field1495;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "[I")
    public static int[] field1492;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILle;[Lla;ZI[B)V")
    public static final void method587(int arg0, class81 arg1, class77[] arg2, boolean arg3, int arg4, byte[] arg5) {
        if (!arg3) {
            return;
        }
        class13 var6 = new class13(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method147(false);
            if (var8 == 0) {
                field1489++;
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method147(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 12;
                int var12 = var9 & 0x3F;
                int var13 = var6.method142(27467);
                int var14 = var13 & 0x3;
                int var15 = var9 >> 6 & 0x3F;
                int var16 = arg0 + var15;
                int var17 = var13 >> 2;
                int var18 = arg4 + var12;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    int var19 = var11;
                    if ((class107.field2249[1][var16][var18] & 0x2) == 2) {
                        var19 = var11 - 1;
                    }
                    class77 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg2[var19];
                    }
                    class86.method725(var14, var20, arg1, var18, true, var7, var16, var11, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method588(int arg0) {
        field1492 = null;
        field1494 = null;
        int var1 = 74 % ((arg0 + 70) / 53);
        field1488 = null;
        field1495 = null;
        field1485 = null;
    }
}
