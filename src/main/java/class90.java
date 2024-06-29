import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class90 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[[I")
    public static int[][] field1577 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Loh;")
    public static class258 field1582 = class153.method1046("::gc", 121);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Loh;")
    public static class258 field1585 = class153.method1046("null", 86);

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lmi;")
    public static class12 field1578 = new class12();

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field1589 = 500;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Z")
    public static boolean field1587 = true;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "J")
    public long field1575;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lrk;")
    public class123 field1573;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lrk;")
    public class123 field1579;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lrk;")
    public class123 field1584;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "[I")
    public static int[] field1590;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIB)I", line = 4)
    public static final int method671(int arg0, int arg1, int arg2, byte arg3) {
        field1574++;
        if ((class94.field1653[arg0][arg2][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class94.field1653[1][arg2][arg1] & 0x2) == 0) {
            if (arg3 > -23) {
                field1582 = (class258) null;
            }
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLs;)Ls;", line = 45)
    public static final class171 method672(byte arg0, class171 arg1) {
        int var2 = -123 / ((arg0 - 64) / 37);
        field1572++;
        if (arg1.field2923 != -1) {
            return class263.method1844(arg1.field2923, (byte) -70);
        }
        int var3 = arg1.field3061 >>> 16;
        class102 var4 = new class102(class276.field4750);
        for (class247 var5 = (class247) var4.method775(-3); var5 != null; var5 = (class247) var4.method777(false)) {
            if (var5.field4283 == var3) {
                return class263.method1844((int) var5.field2642, (byte) -70);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 84)
    public static void method673(int arg0) {
        field1582 = null;
        field1578 = null;
        field1577 = (int[][]) null;
        field1585 = null;
        if (arg0 <= 66) {
            method674(22, -21, (byte) -64);
        }
        field1590 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIB)V", line = 107)
    public static final void method674(int arg0, int arg1, byte arg2) {
        field1586++;
        short var3 = 256;
        if (class57.field901 > 0) {
            class162.method1081(class57.field901, (byte) 24);
            class57.field901 = 0;
        }
        int var4 = 0;
        if (arg2 <= 57) {
            method673(83);
        }
        int var5 = class211.field3635 * arg1;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class293.field5047[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class5.field66[var4++];
                int var11 = class211.field3640[var5++ + arg0];
                if (var10 == 0) {
                    class256.field4389.field573[var6++] = var11;
                } else {
                    int var12 = var10 + 18;
                    int var13 = -(var10 - 256) - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var14 = class11.field148[var10];
                    class256.field4389.field573[var6++] = class2.method15(-16711936, var12 * class2.method15(16711935, var14) + var13 * class2.method15(16711935, var11)) + class2.method15(16711680, var12 * class2.method15(var14, 65280) + (class2.method15(65280, var11) * var13)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class256.field4389.field573[var6++] = class211.field3640[var5++ + arg0];
            }
            var5 += class211.field3635 - 128;
        }
        class256.field4389.method321(arg0, arg1);
    }
}
