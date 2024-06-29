import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class226 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[B")
    public byte[] field3864 = new byte[18002];

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[[B")
    public byte[][] field3876 = new byte[6][258];

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[I")
    public int[] field3875 = new int[16];

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "[[I")
    public int[][] field3879 = new int[6][258];

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "[B")
    public byte[] field3887 = new byte[256];

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[B")
    public byte[] field3863 = new byte[4096];

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
    public int[] field3867 = new int[257];

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "[Z")
    public boolean[] field3880 = new boolean[256];

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field3884 = 0;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "[B")
    public byte[] field3899 = new byte[18002];

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "[[I")
    public int[][] field3897 = new int[6][258];

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public int field3891 = 0;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "[Z")
    public boolean[] field3901 = new boolean[16];

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "[[I")
    public int[][] field3900 = new int[6][258];

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "[I")
    public int[] field3895 = new int[256];

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "[I")
    public int[] field3898 = new int[6];

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Lr;")
    private static class66 field3896 = class93.method641(43, "M");

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Lr;")
    public static class66 field3885 = field3896;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public static int field3892 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lr;")
    public static class66 field3872 = field3896;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "B")
    public byte field3873;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field3866;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field3869;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field3870;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lqf;")
    public static class236 field3865;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[B")
    public byte[] field3871;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "[B")
    public byte[] field3888;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1439(int arg0) {
        field3896 = null;
        field3872 = null;
        field3865 = null;
        if (arg0 == 18002) {
            field3885 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)I")
    public static final int method1440(int arg0, boolean arg1) {
        if (arg1) {
            return 80;
        }
        field3893++;
        class234 var2 = class96.method664((byte) 81, arg0);
        int var3 = var2.field4094;
        int var4 = var2.field4096;
        int var5 = class125.field2351[var3 - var4];
        int var6 = var2.field4083;
        return var5 & class89.field1726[var6] >> var4;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method1441(int arg0) {
        if (arg0 > -84) {
            method1442(-32, (class63[]) null, 85);
        }
        class83.field1607.method1613((byte) 94);
        field3902++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[Lha;I)V")
    public static final void method1442(int arg0, class63[] arg1, int arg2) {
        for (int var3 = arg0; var3 < arg1.length; var3++) {
            class63 var4 = arg1[var3];
            if (var4 != null && var4.field1122 == arg2 && (!var4.field1186 || !client.method596(var4))) {
                if (var4.field1219 == 0) {
                    if (!var4.field1186 && client.method596(var4) && class158.field2850 != var4) {
                        continue;
                    }
                    method1442(arg0, arg1, var4.field1115);
                    if (var4.field1092 != null) {
                        method1442(arg0, var4.field1092, var4.field1115);
                    }
                    class75 var5 = (class75) class230.field3981.method1381((long) var4.field1115, arg0 - 53);
                    if (var5 != null) {
                        class155.method1053(var5.field1492, -1);
                    }
                }
                if (var4.field1219 == 6) {
                    if (var4.field1154 != -1 || var4.field1192 != -1) {
                        boolean var6 = class56.method373(arg0, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field1192;
                        } else {
                            var7 = var4.field1154;
                        }
                        if (var7 != -1) {
                            class224 var8 = class47.method335((byte) -36, var7);
                            if (var8 != null) {
                                var4.field1094 += class193.field3347;
                                while (var8.field3834[var4.field1079] < var4.field1094) {
                                    var4.field1094 -= var8.field3834[var4.field1079];
                                    var4.field1079++;
                                    if (var4.field1079 >= var8.field3811.length) {
                                        var4.field1079 -= var8.field3848;
                                        if (var4.field1079 < 0 || var8.field3811.length <= var4.field1079) {
                                            var4.field1079 = 0;
                                        }
                                    }
                                    class215.method1385(var4, -124);
                                }
                            }
                        }
                    }
                    if (var4.field1233 != 0 && !var4.field1186) {
                        int var9 = var4.field1233 >> 16;
                        int var10 = class193.field3347 * var9;
                        var4.field1187 = var4.field1187 + var10 & 0x7FF;
                        int var11 = var4.field1233 << 16 >> 16;
                        int var12 = class193.field3347 * var11;
                        var4.field1137 = var4.field1137 + var12 & 0x7FF;
                        class215.method1385(var4, arg0 - 115);
                    }
                }
            }
        }
        field3877++;
    }
}
