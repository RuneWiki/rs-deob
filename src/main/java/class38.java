import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class38 extends class279 {

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    private int field566 = -1;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Ltl;")
    public static class59 field568 = class85.method639("Lade Sprites )2 ", 9588);

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field579 = 7759444;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "[I")
    public static int[] field583 = new int[1000];

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "[I")
    private int[] field575;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "[I")
    public static int[] field576;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "[I")
    public static int[] field578;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "[Llj;")
    public static class5[] field571;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)[[I", line = 5)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != -7523) {
            method253(14, 23, 99, (byte) 59, 94, 84, -77, 75);
        }
        field582++;
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297 && this.method252(64)) {
            int var4 = this.field567 * (class284.field4887 == this.field577 ? arg1 : this.field577 * arg1 / class284.field4887);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class56.field835 == this.field567) {
                for (int var11 = 0; var11 < class56.field835; var11++) {
                    int var12 = this.field575[var4++];
                    var7[var11] = class93.method680(255, var12) << 4;
                    var6[var11] = class93.method680(var12 >> 4, 4080);
                    var5[var11] = class93.method680(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class56.field835; var8++) {
                    int var9 = this.field567 * var8 / class56.field835;
                    int var10 = this.field575[var4 + var9];
                    var7[var8] = class93.method680(4080, var10 << 4);
                    var6[var8] = class93.method680(var10 >> 4, 4080);
                    var5[var8] = class93.method680(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V", line = 78)
    public static void method251(byte arg0) {
        field578 = null;
        field576 = null;
        if (arg0 < 49) {
            method251((byte) 28);
        }
        field571 = null;
        field568 = null;
        field583 = null;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)Z", line = 92)
    private final boolean method252(int arg0) {
        field569++;
        if (this.field575 != null) {
            return true;
        } else if (this.field566 < 0) {
            if (arg0 != 64) {
                this.field567 = -24;
            }
            return false;
        } else {
            int var2 = class56.field835;
            int var3 = class284.field4887;
            int var4 = class138.field2272.method372(this.field566, arg0 - 64) ? 64 : 128;
            this.field575 = class138.field2272.method382(this.field566, true);
            this.field577 = var4;
            this.field567 = var4;
            class133.method973(var2, var3, 126);
            return this.field575 != null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILs;)V", line = 123)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field566 = arg2.method1214(-18254);
        }
        if (arg0 > -125) {
            field579 = -107;
        }
        field573++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIBIIII)V", line = 137)
    public static final void method253(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field572++;
        int var8 = arg5;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg4 - arg2;
        int var12 = arg5 - arg2;
        int var13 = arg4 * arg4;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        if (arg3 > -44) {
            field583 = (int[]) null;
        }
        int var17 = var16 << 1;
        int var18 = var13 << 1;
        int var19 = var14 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var14 - ((var21 - 1) * var18);
        int var23 = (1 - var21) * var13 + var19;
        int var24 = var13 << 2;
        int var25 = var12 << 1;
        int var26 = var16 - ((var25 - 1) * var20);
        int var27 = (1 - var25) * var15 + var17;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var19 * 3;
        int var32 = (var25 - 3) * var20;
        int var33 = var17 * 3;
        int var34 = (arg5 - 1) * var24;
        int var35 = (var21 - 3) * var18;
        int var36 = var29;
        int var37 = var30;
        int var38 = (var12 - 1) * var28;
        int[] var39 = class163.field2662[arg7];
        class174.method1283(7, arg0, var39, arg1 - arg4, -var11 + arg1);
        class174.method1283(7, arg6, var39, arg1 - var11, arg1 + var11);
        class174.method1283(7, arg0, var39, arg1 + var11, arg1 - -arg4);
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var31 += var29;
                    var9++;
                    var22 += var36;
                    var36 += var29;
                }
            }
            if (var22 < 0) {
                var23 += var31;
                var31 += var29;
                var22 += var36;
                var9++;
                var36 += var29;
            }
            boolean var40 = var8 <= var12;
            if (var40) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        var10++;
                        var26 += var37;
                        var27 += var33;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var27 += var33;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var27 += -var38;
                var38 -= var28;
                var26 += -var32;
                var32 -= var28;
            }
            var23 += -var34;
            var22 += -var35;
            var8--;
            int var41 = arg7 - var8;
            int var42 = arg1 + var9;
            int var43 = arg7 + var8;
            var35 -= var24;
            int var44 = arg1 - var9;
            var34 -= var24;
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class174.method1283(7, arg0, class163.field2662[var41], var44, var46);
                class174.method1283(7, arg6, class163.field2662[var41], var46, var45);
                class174.method1283(7, arg0, class163.field2662[var41], var45, var42);
                class174.method1283(7, arg0, class163.field2662[var43], var44, var46);
                class174.method1283(7, arg6, class163.field2662[var43], var46, var45);
                class174.method1283(7, arg0, class163.field2662[var43], var45, var42);
            } else {
                class174.method1283(7, arg0, class163.field2662[var41], var44, var42);
                class174.method1283(7, arg0, class163.field2662[var43], var44, var42);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 309)
    public final void method254(byte arg0) {
        super.method254((byte) 12);
        this.field575 = null;
        field570++;
        if (arg0 <= 11) {
            field578 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 345)
    public class38() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I", line = 351)
    public final int method255(int arg0) {
        field574++;
        if (arg0 != 32) {
            this.method87(107, -71);
        }
        return this.field566;
    }
}
