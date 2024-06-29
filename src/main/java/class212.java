import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class212 {

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3289 = 0;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
    public static int[] field3290 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[Z")
    public static boolean[] field3291 = new boolean[8];

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3287 = " has logged out.";

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ljb;")
    public static class276 field3285;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Log;")
    public static final class226 method1418(byte arg0, int arg1) {
        field3286++;
        class226 var2 = (class226) class258.field3952.method1701(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field1747.method1163(arg1, 0, 48);
        if (arg0 != -21) {
            field3283 = -29;
        }
        if (var3 == null) {
            return null;
        }
        class226 var4 = new class226();
        class37 var5 = new class37(var3);
        var5.field588 = var5.field583.length - 2;
        int var6 = var5.method293(104);
        int var7 = var5.field583.length - var6 - 2 - 12;
        var5.field588 = var7;
        int var8 = var5.method307(-57);
        var4.field3534 = var5.method293(-75);
        var4.field3548 = var5.method293(-120);
        var4.field3535 = var5.method293(108);
        var4.field3538 = var5.method293(105);
        int var9 = var5.method333((byte) -59);
        if (var9 > 0) {
            var4.field3540 = new class211[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method293(-86);
                class211 var12 = new class211(class208.method1388((byte) 80, var11));
                var4.field3540[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method307(-121);
                    int var14 = var5.method307(-51);
                    var12.method1409((long) var13, 1, new class229(var14));
                }
            }
        }
        var5.field588 = 0;
        var4.field3539 = var5.method298(arg0 + 143);
        var4.field3547 = new int[var8];
        int var15 = 0;
        var4.field3549 = new int[var8];
        var4.field3543 = new String[var8];
        while (var7 > var5.field588) {
            int var16 = var5.method293(91);
            if (var16 == 3) {
                var4.field3543[var15] = var5.method331(16312).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3549[var15] = var5.method333((byte) -59);
            } else {
                var4.field3549[var15] = var5.method307(class76.method605(arg0, 63));
            }
            var4.field3547[var15++] = var16;
        }
        class258.field3952.method1704((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static final void method1419(int arg0) {
        if (arg0 != 511) {
            method1420(-34);
        }
        class251.field3858 = new class211(32);
        field3293++;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method1420(int arg0) {
        if (arg0 != 0) {
            method1420(-79);
        }
        field3287 = null;
        field3285 = null;
        field3290 = null;
        field3291 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)J")
    public abstract long method805(byte arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public abstract void method808(boolean arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I")
    public abstract int method807(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V")
    public static final void method1421(int arg0, byte arg1) {
        field3284++;
        class33.field532.method1778(arg0, -62);
        class80.field1338.method1778(arg0, -88);
        class74.field1243.method1778(arg0, -86);
        if (arg1 < 0) {
            field3289 = -104;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1422(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg1 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class276.field4353 - class57.field882) * var8 / 100 + class57.field882;
        int var10 = 2048 - arg0 & 0x7FF;
        int var11 = arg4 * var9 >> 8;
        int var12 = 0;
        field3288++;
        int var13 = 0;
        int var14 = -114 / ((62 - arg3) / 56);
        int var15 = 2048 - arg2 & 0x7FF;
        int var16 = var11;
        if (var15 != 0) {
            int var17 = class97.field1556[var15];
            int var18 = class97.field1557[var15];
            var13 = -var11 * var18 >> 16;
            var16 = var11 * var17 >> 16;
        }
        if (var10 != 0) {
            int var19 = class97.field1557[var10];
            var12 = var16 * var19 >> 16;
            int var20 = class97.field1556[var10];
            var16 = var16 * var20 >> 16;
        }
        class295.field4631 = arg6 - var13;
        class142.field2182 = arg0;
        class266.field4245 = arg5 - var12;
        class25.field373 = arg2;
        class69.field1100 = arg7 - var16;
    }
}
