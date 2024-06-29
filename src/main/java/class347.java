import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class347 extends class310 {

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    private int field5522 = 1365;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    private int field5517 = 0;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    private int field5523 = 0;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    private int field5525 = 20;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Ljava/lang/String;")
    public static String field5521 = "shake:";

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "Z")
    public static boolean field5520 = false;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field5518 = 0;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "Ljava/lang/String;")
    public static String field5524 = "Loading...";

    @OriginalMember(owner = "client!n", name = "W", descriptor = "S")
    public static short field5526 = 320;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method77(int arg0, int arg1) {
        if (arg1 != -13093) {
            this.field5525 = 10;
        }
        field5519++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            for (int var4 = 0; var4 < class261.field4405; var4++) {
                int var5 = (class293.field4737[var4] << 12) / this.field5522 + this.field5523;
                int var6 = (class230.field3818[arg0] << 12) / this.field5522 + this.field5517;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                for (int var13 = var6 * var6 >> 12; var11 + var13 < 16384 && this.field5525 > var12; var13 = var10 * var10 >> 12) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var12++;
                    var9 = var7 + var11 - var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field5525 - 1 > var12 ? (var12 << 12) / this.field5525 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 68)
    public class347() {
        super(0, true);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)Lvd;", line = 77)
    public static final class321 method2432(int arg0) {
        field5515++;
        if (arg0 < 66) {
            method2433(-93, -58, -14, 44, 19, -70);
        }
        class321 var1 = (class321) class26.field319.method912(false);
        if (var1 != null) {
            var1.method330(15);
            var1.method1352(-45);
            return var1;
        }
        class321 var2;
        do {
            var2 = (class321) class196.field3121.method912(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method2267((byte) -26) > class47.method371(-96)) {
                return null;
            }
            var2.method330(15);
            var2.method1352(-88);
        } while ((Long.MIN_VALUE & var2.field2754) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)Z", line = 126)
    public static final boolean method2433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class215.field3440[arg0][var8][var9] == -class151.field2404) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class101.field1656[arg0][arg1][arg3] + arg5;
            if (!class326.method2295(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class326.method2295(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class326.method2295(var10, var12, var14)) {
                return false;
            } else if (class326.method2295(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class273.method2044(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class326.method2295(var6 + 1, class101.field1656[arg0][arg1][arg3] + arg5, var7 + 1) && class326.method2295(var6 + 128 - 1, class101.field1656[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class326.method2295(var6 + 128 - 1, class101.field1656[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class326.method2295(var6 + 1, class101.field1656[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIJ)Z", line = 186)
    public static final boolean method2434(int arg0, int arg1, int arg2, long arg3) {
        class36 var5 = class129.field2184[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field533 != null && var5.field533.field5397 == arg3) {
            return true;
        } else if (var5.field526 != null && var5.field526.field5406 == arg3) {
            return true;
        } else if (var5.field537 != null && var5.field537.field2972 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field531; var6++) {
                if (var5.field544[var6].field3279 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lqm;II)V", line = 229)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            field5520 = false;
        }
        if (arg2 == 0) {
            this.field5522 = arg0.method1765(true);
        } else if (arg2 == 1) {
            this.field5525 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field5523 = arg0.method1765(true);
        } else if (arg2 == 3) {
            this.field5517 = arg0.method1765(true);
        }
        field5516++;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V", line = 284)
    public static void method2435(int arg0) {
        if (arg0 >= -94) {
            method2435(30);
        }
        field5524 = null;
        field5521 = null;
    }
}
