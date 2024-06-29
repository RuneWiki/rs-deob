import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class143 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2256 = new String[200];

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2262 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Leh;")
    public static class137 field2259;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "[Lnf;")
    public static class227[] field2255;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[[[B")
    public static byte[][][] field2260;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Leh;Leh;BLeh;Leh;)V")
    public static final void method991(class137 arg0, class137 arg1, byte arg2, class137 arg3, class137 arg4) {
        if (arg2 >= -116) {
            return;
        }
        field2254++;
        class61.field800 = arg4;
        class235.field3881 = arg1;
        class113.field1631 = arg3;
        class18.field224 = arg0;
        class75.field937 = new class123[class18.field224.method930((byte) 126)][];
        class181.field2888 = new boolean[class18.field224.method930((byte) 126)];
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III[B)Z")
    public static final boolean method992(int arg0, int arg1, int arg2, byte[] arg3) {
        field2261++;
        if (arg1 != -30979) {
            field2262 = null;
        }
        boolean var4 = true;
        class96 var5 = new class96(arg3);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method592(arg1 ^ 0xFFFF86E4);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method539(-401085592);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var5.method584(arg1 + 31234) >> 2;
                    int var14 = var8 & 0x3F;
                    int var15 = var12 + arg2;
                    int var16 = arg0 + var14;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class228 var17 = class256.method1749(var6, 0);
                        if (var13 != 22 || class96.field1281 || var17.field3669 != 0 || var17.field3676 == 1 || var17.field3700) {
                            var9 = true;
                            if (!var17.method1618(-1)) {
                                class204.field3224++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method539(arg1 ^ 0x17E86D95);
                if (var10 == 0) {
                    break;
                }
                var5.method584(arg1 + 31234);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method993(int arg0) {
        field2255 = null;
        field2260 = null;
        field2262 = null;
        if (arg0 <= -107) {
            field2256 = null;
            field2259 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static final void method994(int arg0) {
        field2257++;
        int var1 = -44 % ((arg0 - 45) / 42);
        if (!class226.method1599((byte) 117) && class244.field4011 != class126.field2025) {
            class117.method757(false, class286.field4571.field3836[0], class286.field4571.field3829[0], class83.field1030, -93, class118.field1674, class244.field4011, false);
        } else if (class264.field4260 != class244.field4011 && class293.method1969(126, class244.field4011)) {
            class264.field4260 = class244.field4011;
            class176.method1222(false);
        }
    }
}
