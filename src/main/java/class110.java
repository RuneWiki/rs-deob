import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class110 extends class144 {

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    private int field1478 = 32768;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "Lrc;")
    public static class9 field1471 = new class9(30);

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        ++field1474;
        class175.method1131((byte) -126);
        if (arg0 >= -109) {
            field1479 = -126;
        }
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
    public static void method683(int arg0) {
        field1471 = null;
        if (arg0 != 1046795) {
            method683(-6);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Llg;Z)V")
    public static final void method684(class11 arg0, boolean arg1) {
        ++field1480;
        class16.method98(200000, -61, arg0);
        if (arg1) {
            field1473 = 75;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field1482;
        int[][] var3 = super.field2053.method1542(117, arg1);
        if (super.field2053.field3408) {
            int[] var4 = this.method934(-18877, 1, arg1);
            int[] var5 = this.method934(-18877, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class104.field1411 < ~var9; ++var9) {
                int var10 = (1046795 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field1478 >> 12;
                int var12 = class9.field135[var10] * var11 >> 12;
                int var13 = class287.field4477[var10] * var11 >> 12;
                int var14 = class166.field2391 & (var13 >> 12) + arg1;
                int var15 = var9 - -(var12 >> 12) & class112.field1487;
                int[][] var16 = this.method927(var14, true, 0);
                var6[var9] = var16[0][var15];
                var7[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return arg0 != 5 ? null : var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field1476;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field2059 = arg1.method1407(124) == 1;
            }
        } else {
            this.field1478 = arg1.method1380(true) << 4;
        }
        if (arg2 != 20630) {
            field1479 = -56;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field1477;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int[] var4 = this.method934(-18877, 1, arg0);
            int[] var5 = this.method934(-18877, 2, arg0);
            for (int var6 = 0; class104.field1411 > var6; ++var6) {
                int var7 = (var4[var6] & 4093) >> 4;
                int var8 = var5[var6] * this.field1478 >> 12;
                int var9 = class9.field135[var7] * var8 >> 12;
                int var10 = class287.field4477[var7] * var8 >> 12;
                int var11 = class166.field2391 & (var10 >> 12) + arg0;
                int var12 = class112.field1487 & var6 - -(var9 >> 12);
                int[] var13 = this.method934(-18877, 0, var11);
                var3[var6] = var13[var12];
            }
        }
        return arg1 != 255 ? null : var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(CZ)Z")
    public static final boolean method685(char arg0, boolean arg1) {
        ++field1481;
        if (arg1) {
            return true;
        } else {
            return ~arg0 <= -49 && ~arg0 >= -58;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method686(long arg0, boolean arg1) {
        ++field1472;
        if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                if (!arg1) {
                    method686(100L, false);
                }
                long var4 = arg0;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    char var9 = class116.field1598[(int) (-(arg0 * 37L) + var7)];
                    if (var9 == '_') {
                        var9 = 160;
                        int var10 = var6.length() + -1;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class110() {
        super(3, false);
    }
}
