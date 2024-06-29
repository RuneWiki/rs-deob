import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class83 extends class23 {

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "Z")
    public static boolean field1509;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "[[[I")
    public static int[][][] field1503;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZIII)I")
    public static final int method476(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            return -25;
        } else {
            ++field1507;
            if (~arg2 > ~arg1) {
                return arg1;
            } else {
                return arg3 < arg2 ? arg3 : arg2;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static void method477(boolean arg0) {
        if (arg0) {
            method477(false);
        }
        field1503 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method478(-81, 122, -68, -113, 15, -16);
        }
        if (arg1 == 0) {
            super.field373 = ~arg0.method1265(114) == -2;
        }
        ++field1505;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        if (arg1 != 1) {
            field1509 = false;
        }
        ++field1501;
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508) {
            int[] var4 = this.method155(arg0, (byte) 117, 2);
            int[][] var5 = this.method161(arg0, 0, 0);
            int[][] var6 = this.method161(arg0, 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[1];
            int[] var10 = var3[2];
            int[] var11 = var5[2];
            int[] var12 = var5[0];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class72.field1359; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var10[var16] = var15[var16];
                    } else {
                        int var18 = 4096 - var17;
                        var7[var16] = var12[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var9[var16] * var17 + var14[var16] * var18 >> 12;
                        var10[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var12[var16];
                    var8[var16] = var9[var16];
                    var10[var16] = var11[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIII)V")
    public static final void method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class279.field4924[0].method598(arg3, arg0);
        int var6 = (arg5 + -32) * arg5 / arg2;
        ++field1506;
        if (var6 < 8) {
            var6 = 8;
        }
        class279.field4924[1].method598(arg3, arg0 + -16 - -arg5);
        int var7 = (arg5 + -32 + -var6) * arg4 / (arg2 - arg5);
        class260.method1726(arg3, arg0 - -16, 16, arg5 + -32, class129.field2295);
        class260.method1726(arg3, arg0 + 16 - -var7, 16, var6, class114.field2012);
        class260.method1735(arg3, arg0 + var7 - -16, var6, class76.field1409);
        class260.method1735(arg3 + 1, arg0 + 16 + var7, var6, class76.field1409);
        class260.method1715(arg3, arg0 + var7 + 16, 16, class76.field1409);
        if (arg1 >= 16) {
            class260.method1715(arg3, arg0 + 17 - -var7, 16, class76.field1409);
            class260.method1735(arg3 - -15, arg0 + 16 + var7, var6, class134.field2351);
            class260.method1735(arg3 + 14, arg0 + 17 + var7, var6 + -1, class134.field2351);
            class260.method1715(arg3, var6 + 15 + arg0 + var7, 16, class134.field2351);
            class260.method1715(arg3 + 1, var6 + 14 + arg0 + var7, 15, class134.field2351);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field1508;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int[] var4 = this.method155(arg1, (byte) 91, 0);
            int[] var5 = this.method155(arg1, (byte) 110, 1);
            int[] var6 = this.method155(arg1, (byte) 100, 2);
            for (int var7 = 0; class72.field1359 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return arg0 > -13 ? null : var3;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class83() {
        super(3, false);
    }
}
