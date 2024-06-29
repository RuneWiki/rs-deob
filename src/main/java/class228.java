import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class228 implements class239 {

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lkn;")
    private class52 field3667 = new class52(256);

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "Lwf;")
    private class306 field3668;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lwf;")
    private class306 field3649;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[Lli;")
    private class110[] field3648;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
    public static int[] field3647 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
    public static int[] field3652 = new int[50];

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "F")
    public static float field3656 = 0.0F;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
    public static int[] field3662 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3657 = "Hidden";

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static volatile int field3664 = -1;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field3669 = 0;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lbn;")
    public static class177 field3654;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[Z")
    public static boolean[] field3658;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(II)Lgf;", line = 4)
    public static final class221 method1561(int arg0, int arg1) {
        field3661++;
        class221 var2 = (class221) class115.field1790.method1294((long) arg1, 117);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class248.field3911.method2103(0, 31, arg1);
        class221 var4 = new class221();
        int var5 = 17 % ((arg0 - 13) / 46);
        if (var3 != null) {
            var4.method1470(arg1, new class303(var3), (byte) 85);
        }
        class115.field1790.method1292((long) arg1, -102, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIIIFB)[I", line = 31)
    public final int[] method1562(boolean arg0, int arg1, int arg2, int arg3, float arg4, byte arg5) {
        if (arg5 <= 66) {
            return (int[]) null;
        } else {
            field3670++;
            return this.method674(0, arg1).method996(this.field3649, this.field3648[arg1].field1696, -17998, arg0, (double) arg4, arg3, this, arg2);
        }
    }

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "(II)Llk;", line = 45)
    public class143 method674(int arg0, int arg1) {
        field3651++;
        if (arg0 != 0) {
            return (class143) null;
        }
        class312 var3 = this.field3667.method355((long) arg1, 6487);
        if (var3 != null) {
            return (class143) var3;
        }
        byte[] var4 = this.field3668.method2102(arg1, 1);
        if (var4 == null) {
            return null;
        } else {
            class143 var5 = new class143(new class303(var4));
            this.field3667.method350((long) arg1, var5, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IB)Lli;", line = 74)
    public final class110 method1563(int arg0, byte arg1) {
        if (arg1 > -16) {
            return (class110) null;
        } else {
            field3655++;
            return this.field3648[arg0];
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 88)
    public static void method1564(int arg0) {
        if (arg0 != -20799) {
            method1566(-101);
        }
        field3654 = null;
        field3662 = null;
        field3647 = null;
        field3658 = null;
        field3652 = null;
        field3657 = null;
    }

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "(II)V", line = 122)
    public static final void method1565(int arg0, int arg1) {
        field3659++;
        class15 var2 = (class15) class247.field3868.method1558((long) arg0, false);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field154.length; var3++) {
            var2.field154[var3] = -1;
            var2.field151[var3] = 0;
        }
        if (arg1 != 28521) {
            field3654 = (class177) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z", line = 166)
    public static final boolean method1566(int arg0) {
        field3663++;
        class179 var1 = class158.field2464;
        synchronized (class158.field2464) {
            if (arg0 != -5040) {
                return true;
            } else if (class33.field417 == class18.field255) {
                return false;
            } else {
                class306.field4791 = class306.field4793[class33.field417];
                class257.field4003 = class71.field1062[class33.field417];
                class33.field417 = class33.field417 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lwf;Lwf;Lwf;)V", line = 188)
    public class228(class306 arg0, class306 arg1, class306 arg2) {
        this.field3668 = arg1;
        this.field3649 = arg2;
        class303 var4 = new class303(arg0.method2103(0, 0, 0));
        int var5 = var4.method1994(false);
        this.field3648 = new class110[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2043((byte) -112) == 1) {
                this.field3648[var6] = new class110();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3648[var7] != null) {
                this.field3648[var7].field1700 = var4.method2043((byte) -111) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3648[var8] != null) {
                this.field3648[var8].field1708 = var4.method2043((byte) -116) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3648[var9] != null) {
                this.field3648[var9].field1694 = var4.method2043((byte) -127) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3648[var10] != null) {
                this.field3648[var10].field1706 = var4.method2043((byte) -125) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3648[var11] != null) {
                this.field3648[var11].field1707 = var4.method2001(-3);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3648[var12] != null) {
                this.field3648[var12].field1695 = var4.method2001(-3);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3648[var13] != null) {
                this.field3648[var13].field1699 = var4.method2001(-3);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3648[var14] != null) {
                this.field3648[var14].field1698 = var4.method2001(-3);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3648[var15] != null) {
                this.field3648[var15].field1704 = (short) var4.method1994(false);
            }
        }
        if (var4.field4679 < var4.field4716.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field3648[var16] != null) {
                    var4.method2001(-3);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field3648[var17] != null) {
                    var4.method2001(-3);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field3648[var18] != null) {
                    var4.method2043((byte) -126);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field3648[var19] != null) {
                    this.field3648[var19].field1696 = var4.method2043((byte) -109) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field3648[var20] != null) {
                    var4.method2001(-3);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field3648[var21] != null) {
                    var4.method2043((byte) -120);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field3648[var22] != null) {
                    var4.method2043((byte) -121);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field3648[var23] != null) {
                    var4.method2043((byte) -121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(BI)Z", line = 403)
    public final boolean method1567(byte arg0, int arg1) {
        field3666++;
        if (arg0 <= 10) {
            return false;
        } else {
            class143 var3 = this.method674(0, arg1);
            return var3 != null && var3.method1002(this, this.field3649, 0);
        }
    }
}
