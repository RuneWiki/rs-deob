import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class339 extends class14 {

    @OriginalMember(owner = "client!ew", name = "P", descriptor = "I")
    private int field4423 = 4096;

    @OriginalMember(owner = "client!ew", name = "R", descriptor = "I")
    private int field4425 = 4096;

    @OriginalMember(owner = "client!ew", name = "M", descriptor = "I")
    private int field4420 = 4096;

    @OriginalMember(owner = "client!ew", name = "O", descriptor = "Lok;")
    public static class166 field4422 = new class166(2, 16);

    @OriginalMember(owner = "client!ew", name = "S", descriptor = "Lwv;")
    public static class26 field4426 = new class26("WTWIP", 3);

    @OriginalMember(owner = "client!ew", name = "T", descriptor = "Z")
    public static boolean field4427 = false;

    @OriginalMember(owner = "client!ew", name = "J", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ew", name = "K", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ew", name = "L", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ew", name = "N", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ew", name = "Q", descriptor = "Lff;")
    public static class9 field4424;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method141(int arg0, int arg1) {
        ++field4421;
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091) {
            int[][] var4 = this.method139(0, 2, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class115.field1637 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field4423 * var12 >> 12;
                    var9[var11] = this.field4420 * var13 >> 12;
                    var10[var11] = this.field4425 * var14 >> 12;
                } else {
                    var8[var11] = this.field4423;
                    var9[var11] = this.field4420;
                    var10[var11] = this.field4425;
                }
            }
        }
        if (arg0 != -30909) {
            this.field4425 = -62;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V", line = 69)
    public class339() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 72)
    public static final String method1926(int arg0, long arg1) {
        ++field4418;
        if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else if (arg0 != 1007) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg1 != 0L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    char var9 = class105.field1551[(int) (-(arg1 * 37L) + var7)];
                    if (var9 == '_') {
                        int var10 = var6.length() + -1;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                        var9 = 160;
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

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(FBFF)I", line = 123)
    public static final int method1927(float arg0, byte arg1, float arg2, float arg3) {
        ++field4419;
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        if (arg1 <= 24) {
            method1928(-114);
        }
        float var5 = !(arg0 < 0.0F) ? arg0 : -arg0;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 < var5 && var6 < var5) {
            return !(arg0 > 0.0F) ? 1 : 0;
        } else if (var6 > var4 && var6 > var5) {
            return arg2 > 0.0F ? 2 : 3;
        } else {
            return arg3 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IBLmd;)V", line = 170)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = 127 % ((-51 - arg1) / 37);
        ++field4417;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4425 = arg2.method2212((byte) 83);
                }
            } else {
                this.field4420 = arg2.method2212((byte) 83);
            }
        } else {
            this.field4423 = arg2.method2212((byte) 83);
        }
    }

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "(I)V", line = 221)
    public static void method1928(int arg0) {
        field4426 = null;
        field4424 = null;
        if (arg0 != 0) {
            method1926(60, 123L);
        }
        field4422 = null;
    }
}
