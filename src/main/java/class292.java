import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class292 extends class397 {

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "Liu;")
    public static class390 field4169 = new class390(89, 8);

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
    public static int field4172 = 0;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class292() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field4171;
        if (arg0 != -780833076) {
            return null;
        } else {
            int[] var3 = super.field5854.method465(arg1, 108);
            if (super.field5854.field991) {
                for (int var4 = 0; class164.field2152 > var4; ++var4) {
                    this.method1761(-36, arg1, var4);
                    int[] var5 = this.method2376(64, 0, class176.field2413);
                    var3[var4] = var5[class438.field6407];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        ++field4166;
        int[][] var3 = super.field5848.method1692(arg1, 112);
        if (arg0 <= 81) {
            field4169 = null;
        }
        if (super.field5848.field3939) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class164.field2152; ++var7) {
                this.method1761(-62, arg1, var7);
                int[][] var8 = this.method2377(class176.field2413, -41, 0);
                var4[var7] = var8[0][class438.field6407];
                var5[var7] = var8[1][class438.field6407];
                var6[var7] = var8[2][class438.field6407];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(III)V")
    private final void method1761(int arg0, int arg1, int arg2) {
        ++field4167;
        if (arg0 < -7) {
            int var4 = class228.field3210[arg2];
            int var5 = class447.field6523[arg1];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class176.field2413 = arg1;
                class438.field6407 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class176.field2413 = arg2;
                class438.field6407 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class438.field6407 = -arg1 + class164.field2152;
                class176.field2413 = arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class176.field2413 = class508.field7746 - arg1;
                class438.field6407 = arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class176.field2413 = -arg1 + class508.field7746;
                class438.field6407 = class164.field2152 - arg2;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class176.field2413 = -arg2 + class508.field7746;
                class438.field6407 = -arg1 + class164.field2152;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class176.field2413 = -arg2 + class508.field7746;
                class438.field6407 = arg1;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class176.field2413 = arg1;
                class438.field6407 = class164.field2152 - arg2;
            }
            class438.field6407 &= class107.field1429;
            class176.field2413 &= class340.field4948;
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
    public static void method1762(int arg0) {
        if (arg0 != 8) {
            field4172 = -122;
        }
        field4169 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field4170;
        if (arg1 == 80) {
            if (~arg0 == -1) {
                super.field5859 = arg2.method941((byte) 125) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IC)Z")
    public static final boolean method1763(int arg0, char arg1) {
        if (arg0 != 14947) {
            return true;
        } else {
            ++field4168;
            return ~arg1 <= -66 && ~arg1 >= -91 || ~arg1 <= -98 && ~arg1 >= -123;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)Z")
    public static final boolean method1764(int arg0, int arg1) {
        int var2 = -105 / ((arg1 - 20) / 58);
        ++field4165;
        return arg0 >= 4 && arg0 <= 8;
    }
}
