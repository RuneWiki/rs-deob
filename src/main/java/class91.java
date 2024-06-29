import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class91 extends class170 {

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "[Lsc;")
    public static class181[] field1445 = new class181[100];

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Z")
    public static boolean field1441 = false;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "[I")
    public static int[] field1452 = new int[100];

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "[I")
    public static int[] field1453 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Lsc;")
    public class181 field1444;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
    public final int method599(int arg0) {
        ++field1458;
        if (arg0 != 2) {
            method606(false);
        }
        return (int) (255L & super.field606 >>> 32);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljb;II)Ltg;")
    public static final class107 method600(class11 arg0, int arg1, int arg2) {
        ++field1454;
        if (arg1 <= 89) {
            return null;
        } else {
            return !class18.method173(arg0, (byte) 105, arg2) ? null : class20.method187((byte) 34);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1451;
        int var8 = arg7 - -arg4;
        int var9 = -arg4 + arg3;
        int var10 = -arg4 + arg1;
        for (int var11 = arg7; ~var8 < ~var11; ++var11) {
            class171.method1133(class149.field2507[var11], arg0, arg2, arg1, (byte) 125);
        }
        int var12 = arg0 + arg4;
        for (int var13 = arg3; var9 < var13; --var13) {
            class171.method1133(class149.field2507[var13], arg0, arg2, arg1, (byte) 125);
        }
        if (arg5 == -21527) {
            for (int var14 = var8; var9 >= var14; ++var14) {
                int[] var15 = class149.field2507[var14];
                class171.method1133(var15, arg0, arg2, var12, (byte) 125);
                class171.method1133(var15, var12, arg6, var10, (byte) 126);
                class171.method1133(var15, var10, arg2, arg1, (byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)J")
    public final long method602(int arg0) {
        ++field1447;
        return arg0 != 2 ? -6L : Long.MAX_VALUE & super.field2854;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(II)V")
    public class91(int arg0, int arg1) {
        super.field606 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public final void method603(int arg0) {
        if (arg0 <= -64) {
            super.field2854 = class213.method1414(-9292) - -500L | Long.MIN_VALUE & super.field2854;
            ++field1457;
            class75.field1199.method633(this, -122);
        }
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)I")
    public final int method604(int arg0) {
        ++field1450;
        return arg0 != -3633 ? 56 : (int) super.field606;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
    public final void method605(int arg0) {
        super.field2854 |= Long.MIN_VALUE;
        if (this.method602(arg0 + -32368) == 0L) {
            class8.field151.method633(this, 112);
        }
        if (arg0 != 32370) {
            method609((byte) -53, -97);
        }
        ++field1446;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    public static void method606(boolean arg0) {
        field1453 = null;
        if (!arg0) {
            field1448 = 33;
        }
        field1452 = null;
        field1445 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
    public static final void method607(byte arg0, int arg1) {
        class128.field2120.method1796(20, arg1);
        class115.field1876.method1796(20, arg1);
        ++field1455;
        int var2 = 111 % ((-38 - arg0) / 63);
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V")
    public static final void method608(int arg0) {
        class212.field3655.method1798(-76);
        ++field1456;
        class170.field2848.method1798(-118);
        int var1 = -70 / ((39 - arg0) / 35);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(BI)I")
    public static final int method609(byte arg0, int arg1) {
        ++field1449;
        class165 var2 = class244.method1652(-128, arg1);
        int var3 = var2.field2810;
        if (arg0 <= 77) {
            field1452 = null;
        }
        int var4 = var2.field2811;
        int var5 = var2.field2806;
        int var6 = class131.field2170[-var5 + var4];
        return class196.field3426[var3] >> var5 & var6;
    }
}
