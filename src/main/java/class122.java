import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class122 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field1809 = 0;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lpj;")
    public static class284 field1813 = new class284();

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lbg;")
    public class264 field1811;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[[[I")
    public static int[][][] field1815;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)Lbd;")
    public static final class186 method862(byte arg0, int arg1) {
        field1816++;
        class186 var2 = (class186) class168.field2478.method675(31558, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class90.field1364.method1605(-128, class123.method869(arg1, -9), class6.method57(true, arg1));
        class186 var4 = new class186();
        if (arg0 <= 81) {
            method866(29, 95, 42, 9, -121, -122, 87, 40, -3, (byte) -103);
        }
        if (var3 != null) {
            var4.method1210(new class54(var3), 24002);
        }
        class168.field2478.method677((byte) 109, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method863(boolean arg0) {
        field1813 = null;
        field1815 = null;
        if (!arg0) {
            method863(true);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lj;")
    public static final class131 method864(int arg0, int arg1) {
        field1808++;
        class131 var2 = (class131) class211.field3148.method945((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class207.field3103.method1605(arg1 ^ 0xFFFFFF81, arg0, 1);
        class131 var4 = new class131();
        if (arg1 != 3) {
            method866(-21, 0, -33, -43, 113, 32, 106, 74, 83, (byte) 85);
        }
        if (var3 != null) {
            var4.method905(arg0, (byte) 95, new class54(var3));
        }
        class211.field3148.method941(var4, (long) arg0, -8447);
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lah;")
    public static final class110 method865(int arg0, byte arg1) {
        class110 var2 = (class110) class15.field288.method945((long) arg0, true);
        field1814++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class170.field2501.method1605(-126, arg0, 32);
        class110 var4 = new class110();
        if (var3 != null) {
            var4.method798((byte) -109, new class54(var3));
        }
        if (arg1 < 121) {
            return null;
        } else {
            var4.method794(0);
            class15.field288.method941(var4, (long) arg0, -8447);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        if (arg5 == arg7 && arg1 == arg2 && arg0 == arg8 && arg3 == arg4) {
            class55.method461(arg8, arg6, arg3, arg1, false, arg5);
        } else {
            int var10 = arg5 * 3;
            int var11 = arg5;
            int var12 = arg1 * 3;
            int var13 = arg1;
            int var14 = arg7 * 3;
            int var15 = arg0 * 3;
            int var16 = arg2 * 3;
            int var17 = arg4 * 3;
            int var18 = arg8 - (arg5 - var14) - var15;
            int var19 = arg3 + var16 - arg1 - var17;
            int var20 = var15 - (var14 - var10) - var14;
            int var21 = var12 + var17 - var16 - var16;
            int var22 = var14 - var10;
            int var23 = var16 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg5;
                int var34 = arg1 + (var28 + var32 + var30 >> 12);
                class55.method461(var33, arg6, var34, var13, false, var11);
                var13 = var34;
                var11 = var33;
            }
        }
        field1810++;
        if (arg9 != 116) {
            field1813 = null;
        }
    }
}
