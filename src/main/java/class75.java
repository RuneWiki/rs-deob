import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class75 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Le;")
    public static class191 field1276 = class54.method368(" loggt sich ein)3", 2047);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[[[Lef;")
    public static class175[][][] field1281 = new class175[4][104][104];

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1282 = 0;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1280 = -1;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "J")
    public static long field1279 = 0L;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "J")
    public static volatile long field1285 = 0L;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Z")
    public static boolean field1289 = true;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[I")
    public static int[] field1277;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lji;Z)V")
    public static final void method482(class225 arg0, boolean arg1) {
        field1286++;
        if (class51.field923 != null) {
            try {
                class51.field923.method1132(0L, (byte) 120);
                class51.field923.method1140((byte) -106, arg0.field3996, arg0.field3995, 24);
            } catch (Exception var2) {
            }
        }
        if (!arg1) {
            field1280 = 76;
        }
        arg0.field3996 += 24;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static final void method483(boolean arg0) {
        for (int var1 = -1; var1 < class260.field4586; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class73.field1271[var1];
            }
            class76 var6 = class245.field4357[var5];
            if (var6 != null && var6.field2981 > 0) {
                var6.field2981--;
                if (var6.field2981 == 0) {
                    var6.field2993 = null;
                }
            }
        }
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < class197.field3514; var2++) {
            int var3 = class256.field4542[var2];
            class156 var4 = class115.field1901[var3];
            if (var4 != null && var4.field2981 > 0) {
                var4.field2981--;
                if (var4.field2981 == 0) {
                    var4.field2993 = null;
                }
            }
        }
        field1287++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lse;")
    public static final class90 method484(int arg0, int arg1) {
        if (arg0 >= -95) {
            return null;
        }
        class90 var2 = (class90) class88.field1436.method991((long) arg1, -25858);
        field1288++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class51.field933.method826((byte) 35, 1, arg1);
        class90 var4 = new class90();
        if (var3 != null) {
            var4.method543(arg1, new class225(var3), -1);
        }
        class88.field1436.method987(var4, (long) arg1, -2438);
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)I")
    public static final int method485(int arg0, int arg1) {
        field1283++;
        if (arg1 != -1044) {
            method484(-31, 110);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method486(byte arg0) {
        int var1 = -53 / ((arg0 + 60) / 56);
        field1281 = null;
        field1276 = null;
        field1277 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIBII)V")
    public static final void method487(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1278++;
        int var7 = 98 / ((arg4 - 32) / 62);
        class79[] var8 = class152.field2608;
        for (int var9 = 0; var9 < var8.length; var9++) {
            class79 var10 = var8[var9];
            if (var10 != null && var10.field1344 == 2) {
                class183.method1233(-87, arg1 >> 1, arg6 >> 1, (var10.field1345 - class193.field3474 << 7) + var10.field1351, arg3, arg5, var10.field1343 * 2, (var10.field1353 - class225.field4061 << 7) + var10.field1346);
                if (class5.field52 > -1 && class135.field2267 % 20 < 10) {
                    class110.field1856[var10.field1341].method598(arg0 + class5.field52 - 12, class114.field1885 + arg2 + -28);
                }
            }
        }
    }
}
