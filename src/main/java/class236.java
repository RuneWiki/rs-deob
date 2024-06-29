import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class236 {

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[I")
    public static int[] field4119 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Z")
    public static boolean field4117 = false;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method1635(byte arg0) {
        if (arg0 <= -28) {
            field4119 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)V")
    public static final void method1636(int arg0, boolean arg1) {
        field4121++;
        if (arg0 > -49) {
            return;
        }
        byte var2 = 4;
        byte[][] var3 = class257.field4498;
        for (int var4 = 0; var4 < var2; var4++) {
            class190.method1361(205);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class106.field1748[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x340D43D) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFDDF8) >> 14;
                            int var11 = (var7 & 0x3FFB) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class101.field1681.length; var13++) {
                                if (class101.field1681[var13] == var12 && var3[var13] != null) {
                                    class193.method1371(var9, var6 * 8, var3[var13], var5 * 8, (var11 & 0x7) * 8, arg1, var4, class159.field2605, 59, (var10 & 0x7) * 8, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ldf;Ldf;ILdf;I)V")
    public static final void method1637(class51 arg0, class51 arg1, int arg2, class51 arg3, int arg4) {
        class20.method97(arg2, arg1, 3, arg0, arg4, arg3);
        field4120++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)Lug;")
    public static final class187 method1638(int arg0, byte[] arg1) {
        if (arg0 != 8) {
            return null;
        }
        field4118++;
        if (arg1 == null) {
            return null;
        } else {
            class54 var2 = new class54(arg1, class96.field1591, class125.field2123, class221.field3837, class106.field1751, class67.field1100);
            class111.method804((byte) -14);
            return var2;
        }
    }
}
