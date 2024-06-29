import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field1161 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lid;")
    public static class60 field1160 = class11.method72(":tradereq:", (byte) 121);

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[Z")
    public static boolean[] field1164 = new boolean[8];

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[J")
    public static long[] field1169 = new long[100];

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lid;")
    public static class60 field1171 = class11.method72("da dieser Computer gegen unsere ", (byte) -75);

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field1170 = 0;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BIII)V")
    public static final void method343(byte arg0, int arg1, int arg2, int arg3) {
        field1165++;
        if (arg3 < 128 || arg1 < 128 || arg3 > 13056 || arg1 > 13056) {
            class146.field3284 = -1;
            class109.field2660 = -1;
            return;
        }
        int var4 = class50.method381(class46.field1222, arg1, arg3, (byte) 10) - arg2;
        int var5 = arg3 - class140.field3198;
        if (arg0 != -77) {
            method344(-95, (byte) -65);
        }
        int var6 = arg1 - class128.field2931;
        int var7 = class127.field2900[class74.field1787];
        int var8 = class127.field2899[class63.field1567];
        int var9 = var4 - class101.field2461;
        int var10 = class127.field2899[class74.field1787];
        int var11 = class127.field2900[class63.field1567];
        int var12 = var5 * var10 + var6 * var7 >> 16;
        int var13 = var6 * var10 - var5 * var7 >> 16;
        int var15 = var8 * var9 - var11 * var13 >> 16;
        int var16 = var8 * var13 + var9 * var11 >> 16;
        if (var16 < 50) {
            class109.field2660 = -1;
            class146.field3284 = -1;
        } else {
            class146.field3284 = (var12 << 9) / var16 + 256;
            class109.field2660 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Lgd;")
    public static final class46 method344(int arg0, byte arg1) {
        field1167++;
        class46 var2 = (class46) class62.field1556.method918(106, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class24.field598.method473((byte) 112, 12, arg0);
        class46 var4 = new class46();
        if (var3 != null) {
            var4.method367(-1, new class103(var3));
        }
        var4.method364((byte) 35);
        if (arg1 > -39) {
            method343((byte) 8, 98, 104, 112);
        }
        class62.field1556.method914(var4, (long) arg0, (byte) 118);
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILie;II)[Le;")
    public static final class29[] method345(int arg0, class61 arg1, int arg2, int arg3) {
        int var4 = -66 % ((7 - arg2) / 47);
        field1162++;
        return class77.method628(arg0, arg3, arg1, -116) ? class54.method393(255) : null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method346(int arg0) {
        field1160 = null;
        if (arg0 == -3583) {
            field1164 = null;
            field1171 = null;
            field1169 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method347(byte arg0, int arg1) {
        field1168++;
        if (arg1 == 100 && class34.field787 > 0) {
            byte[] var2 = class41.field1081[--class34.field787];
            class41.field1081[class34.field787] = null;
            return var2;
        } else if (arg1 == 5000 && class50.field1279 > 0) {
            byte[] var3 = class43.field1147[--class50.field1279];
            class43.field1147[class50.field1279] = null;
            return var3;
        } else if (arg1 == 30000 && class31.field724 > 0) {
            byte[] var4 = class131.field2972[--class31.field724];
            class131.field2972[class31.field724] = null;
            return var4;
        } else if (arg0 >= -28) {
            return null;
        } else {
            return new byte[arg1];
        }
    }
}
