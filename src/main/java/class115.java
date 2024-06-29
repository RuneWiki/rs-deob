import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class115 {

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[Lri;")
    public static class39[] field1643 = new class39[14];

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field1640 = -1;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1638 = -1;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "[I")
    public static int[] field1645 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1646 = "wishes to trade with you.";

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lcg;")
    public static class48 field1642;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V")
    public static final void method749(int arg0, byte arg1) {
        class274.field4382.method1695(arg0, 0);
        if (arg1 <= 91) {
            field1638 = 57;
        }
        class137.field2174.method1695(arg0, 0);
        field1644++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)V")
    public static final void method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1641++;
        if (arg0 != 4767) {
            field1642 = null;
        }
        class95.method531(128, arg5);
        int var7 = 0;
        int var8 = arg5 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class14.field186[arg4];
        int var16 = arg6 - var8;
        class78.method433(var16, arg6 - arg5, var15, arg2, (byte) 123);
        int var17 = arg6 + var8;
        class78.method433(var17, var16, var15, arg1, (byte) 123);
        class78.method433(arg5 + arg6, var17, var15, arg2, (byte) 123);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class283.field4519[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class14.field186[arg4 - var9];
                    int[] var19 = class14.field186[arg4 + var9];
                    int var20 = class283.field4519[var9];
                    int var21 = arg6 + var7;
                    int var22 = arg6 - var7;
                    int var23 = arg6 - var20;
                    int var24 = arg6 + var20;
                    class78.method433(var23, var22, var19, arg2, (byte) 123);
                    class78.method433(var24, var23, var19, arg1, (byte) 123);
                    class78.method433(var21, var24, var19, arg2, (byte) 123);
                    class78.method433(var23, var22, var18, arg2, (byte) 123);
                    class78.method433(var24, var23, var18, arg1, (byte) 123);
                    class78.method433(var21, var24, var18, arg2, (byte) 123);
                } else {
                    int[] var25 = class14.field186[arg4 + var9];
                    int[] var26 = class14.field186[arg4 - var9];
                    int var27 = arg6 - var7;
                    int var28 = arg6 + var7;
                    class78.method433(var28, var27, var25, arg2, (byte) 123);
                    class78.method433(var28, var27, var26, arg2, (byte) 123);
                }
            }
            int[] var29 = class14.field186[arg4 + var7];
            int[] var30 = class14.field186[arg4 - var7];
            int var31 = arg6 - var9;
            int var32 = arg6 + var9;
            if (var8 <= var7) {
                class78.method433(var32, var31, var29, arg2, (byte) 123);
                class78.method433(var32, var31, var30, arg2, (byte) 123);
            } else {
                int var33 = var11 < var7 ? class283.field4519[var7] : var11;
                int var34 = arg6 + var33;
                int var35 = arg6 - var33;
                class78.method433(var35, var31, var29, arg2, (byte) 123);
                class78.method433(var34, var35, var29, arg1, (byte) 123);
                class78.method433(var32, var34, var29, arg2, (byte) 123);
                class78.method433(var35, var31, var30, arg2, (byte) 123);
                class78.method433(var34, var35, var30, arg1, (byte) 123);
                class78.method433(var32, var34, var30, arg2, (byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Leh;IIZLeh;)Lri;")
    public static final class39 method751(class137 arg0, int arg1, int arg2, boolean arg3, class137 arg4) {
        if (arg1 <= 62) {
            field1645 = null;
        }
        field1639++;
        boolean var5 = true;
        int[] var6 = arg0.method942(arg2, true);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method934(-1, var6[var7], arg2);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg4.method934(-1, var9, 0);
                } else {
                    var10 = arg4.method934(-1, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class39(arg0, arg4, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BJ)V")
    public static final void method752(byte arg0, long arg1) {
        if (arg0 != -62) {
            method754(103);
        }
        field1647++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class280.method1871(arg1 - 1L, arg0 ^ 0xFFFFFFBE);
            class280.method1871(1L, 104);
        } else {
            class280.method1871(arg1, 102);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method753(String arg0, byte arg1) {
        if (arg1 < 9) {
            field1646 = null;
        }
        field1637++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method754(int arg0) {
        field1643 = null;
        int var1 = -39 % ((-arg0 - 72) / 44);
        field1642 = null;
        field1645 = null;
        field1646 = null;
    }
}
