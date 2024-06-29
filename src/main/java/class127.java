import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class127 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1416 = 1;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[Z")
    public static boolean[] field1418 = new boolean[8];

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
    public static int[] field1425 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lwo;")
    public static class285 field1420;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[Lbn;")
    public static class264[] field1426;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
    public static final void method818(int arg0, int arg1) {
        field1421++;
        class12 var2 = class390.method2422(arg0 + 341526138, arg1, 6);
        var2.method65(-116);
        if (arg0 != 28902) {
            method820(-125);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLuo;)V")
    private static final void method819(byte arg0, class118 arg1) {
        field1423++;
        int var2 = class148.field1735;
        int var3 = class76.field941;
        int var4 = class143.field1686;
        int var5 = class194.field2298;
        int var6 = -10660793;
        arg1.method739((byte) 107, var6, var2, var4, var3, var5);
        arg1.method739((byte) -126, -16777216, var2 + 1, var4 + -2, var3 + 1, 16);
        arg1.method731(var2 + 1, var3 + 18, var4 - 2, -16777216, (byte) 119, var5 - 19);
        class210.field2544.method206(var6, var2 + 3, var3 - -14, -1, true, class126.field1409.method434(class373.field5057, -8192));
        int var7 = class358.field4866.method1860(16);
        int var8 = class358.field4866.method1858(-18493);
        int var9 = 0;
        class266 var10 = (class266) class97.field1138.method1690((byte) -113);
        if (arg0 > -17) {
            return;
        }
        while (var10 != null) {
            int var11 = (class57.field660 - (var9 + 1)) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && var8 > var11 - 13 && var11 + 3 > var8) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class94.method590(var10.field3424, 45)) {
                var13 = class131.method843((byte) 5, (int) var10.field3427).field716;
            } else if (class213.method1308(var10.field3424, 106)) {
                class298 var14 = class220.field2726[(int) var10.field3427];
                if (var14 != null) {
                    var13 = var14.field3971.field4174;
                }
            } else if (class276.method1737(2, var10.field3424)) {
                if (var10.field3424 == 1011) {
                    var13 = class380.method2361((int) var10.field3427, -29012).field6220;
                } else {
                    var13 = class380.method2361((int) (var10.field3427 >>> 32 & 0x7FFFFFFFL), -29012).field6220;
                }
            }
            String var15 = class302.method1921(false, var10);
            if (var13 != null) {
                var15 = var15 + class337.method2161(var13, (byte) -34);
            }
            var9++;
            class210.field2544.method189(var2 + 3, 0, var11, var15, class53.field621, class192.field2257, var12, (byte) 105);
            var10 = (class266) class97.field1138.method1699((byte) 116);
        }
        class339.method2176(class148.field1735, -103, class76.field941, class143.field1686, class194.field2298);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method820(int arg0) {
        if (arg0 != -1) {
            method822((byte) -112, (class118) null);
        }
        field1418 = null;
        field1425 = null;
        field1420 = null;
        field1426 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILol;II)J")
    public static final long method821(int arg0, class171 arg1, int arg2, int arg3) {
        field1424++;
        if (arg3 != 1539) {
            field1426 = null;
        }
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class446 var10 = class380.method2361(arg1.method409(-50), -29012);
        long var11 = (long) (arg1.method420((byte) -71) << 14 | arg2 << 7 | arg0 | arg1.method417((byte) -116) << 20 | 0x40000000);
        if (var10.field6235 == 0) {
            var11 |= var8;
        }
        if (var10.field6215 == 1) {
            var11 |= var4;
        }
        if (var10.field6239) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method409(arg3 ^ 0xFFFFF9CD) << 32;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(BLuo;)V")
    public static final void method822(byte arg0, class118 arg1) {
        int var2 = -52 % ((arg0 + 63) / 58);
        if (class231.field3044) {
            class152.method975(arg1, (byte) -51);
        } else {
            method819((byte) -100, arg1);
        }
        field1419++;
    }
}
