import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class121 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[[I")
    public static int[][] field2178 = new int[104][104];

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lcd;")
    private static class64 field2179 = class44.method335((byte) 71, "Loaded sprites");

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lcd;")
    public static class64 field2180 = field2179;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[I")
    public static int[] field2183 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "S")
    public static short field2182 = 320;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lcd;")
    public static class64 field2187 = class44.method335((byte) 71, "_");

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Z")
    public static boolean field2185;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 5)
    public static final void method851(int arg0) {
        field2186++;
        if (arg0 < class269.field4654) {
            class74.method596((byte) 9);
        } else {
            class54.field895 = class216.field3626;
            class216.field3626 = null;
            class153.method1107(40, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 34)
    public static void method852(int arg0) {
        field2179 = null;
        field2183 = null;
        field2187 = null;
        field2178 = (int[][]) null;
        if (arg0 != -1885) {
            field2182 = 62;
        }
        field2180 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lid;", line = 49)
    public static final class248 method853(int arg0, int arg1) {
        field2176++;
        class248 var2 = (class248) class78.field1461.method329((long) arg1, (byte) -63);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class253.field4399.method1580(0, arg0, arg1);
        if (var3 == null) {
            return null;
        }
        class248 var4 = new class248();
        class13 var5 = new class13(var3);
        var5.field281 = var5.field254.length - 2;
        int var6 = var5.method112((byte) 92);
        int var7 = var5.field254.length - var6 - 2 - 12;
        var5.field281 = var7;
        int var8 = var5.method105((byte) 127);
        var4.field4308 = var5.method112((byte) 92);
        var4.field4325 = var5.method112((byte) 92);
        var4.field4315 = var5.method112((byte) 92);
        var4.field4319 = var5.method112((byte) 92);
        int var9 = var5.method152((byte) -103);
        if (var9 > 0) {
            var4.field4324 = new class159[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method112((byte) 92);
                class159 var12 = new class159(class143.method1013((byte) 113, var11));
                var4.field4324[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method105((byte) 72);
                    int var14 = var5.method105((byte) 74);
                    var12.method1149(new class84(var14), (long) var13, -77);
                }
            }
        }
        int var15 = 0;
        var5.field281 = 0;
        var4.field4307 = var5.method147(arg0 ^ 0xFFFFFF81);
        var4.field4306 = new int[var8];
        var4.field4314 = new int[var8];
        var4.field4309 = new class64[var8];
        while (var5.field281 < var7) {
            int var16 = var5.method112((byte) 92);
            if (var16 == 3) {
                var4.field4309[var15] = var5.method104((byte) 104);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field4314[var15] = var5.method152((byte) -84);
            } else {
                var4.field4314[var15] = var5.method105((byte) 72);
            }
            var4.field4306[var15++] = var16;
        }
        class78.field1461.method331((long) arg1, var4, (byte) -124);
        return var4;
    }
}
