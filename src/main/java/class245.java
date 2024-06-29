import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class245 {

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Z")
    public boolean field3569 = true;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Z")
    public static boolean field3562 = false;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "J")
    public static long field3565 = 0L;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3566 = "Created gameworld";

    @OriginalMember(owner = "client!df", name = "i", descriptor = "J")
    public static long field3564 = 0L;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lbc;")
    public static class282 field3561;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method1584(byte arg0) {
        field3561 = null;
        if (arg0 != -114) {
            method1586(-100, true, -19, -74, -90, 70, -69, -14, 114, -106, -128, -125);
        }
        field3566 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Lob;")
    public static final class177 method1585(int arg0, int arg1) {
        class177 var2 = (class177) class73.field875.method65((byte) -112, (long) arg1);
        field3568++;
        if (arg0 != 10) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class165.field2378.method1861(arg1, 34, 1);
            class177 var4 = new class177();
            if (var3 != null) {
                var4.method1146(arg1, new class216(var3), true);
            }
            class73.field875.method64((long) arg1, -1, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZIIIIIIIIII)V")
    public static final void method1586(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3556++;
        int var12 = -1;
        if (~class259.field3767 < arg0) {
            if (class87.field1184 <= 10) {
                var12 = class87.field1184 * 5;
            } else {
                var12 = 50 - ((class87.field1184 - 10) * 5);
            }
        }
        int var13 = arg9 - arg6;
        int var14 = arg4 - arg3;
        int var15 = 983040 / arg8;
        int var16 = 983040 / arg10;
        for (int var17 = -var16; var17 < var13 + var16; var17++) {
            int var19 = arg10 * var17 + arg7 >> 16;
            int var20 = (var17 + 1) * arg10 + arg7 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var22 = arg5 + var19;
                int var23 = var17 + arg6 >> 6;
                int var10000 = arg5 + var20;
                if (var23 >= 0 && var23 <= class105.field1428.length - 1) {
                    int[][] var25 = class105.field1428[var23];
                    for (int var26 = -var15; var26 < var14 + var15; var26++) {
                        int var27 = arg2 + (arg8 * var26) >> 16;
                        int var28 = arg2 + ((var26 + 1) * arg8) >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            var10000 = arg11 + var28;
                            int var31 = arg11 + var27;
                            int var32 = arg3 + var26 >> 6;
                            if (var32 >= 0 && var25.length - 1 >= var32 && var25[var32] != null) {
                                int var33 = ((var26 + arg3 & 0x3F) << 6) + (arg6 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class273 var35 = class164.method1081(0, var34 - 1);
                                    if (!class24.field290[var35.field4000]) {
                                        if (var12 != -1 && class196.field2800 == var35.field4000) {
                                            class261 var36 = new class261();
                                            var36.field3793 = var31;
                                            var36.field3796 = var22;
                                            var36.field3799 = var35.field4000;
                                            class202.field2862.method1522(var36, 127);
                                        } else {
                                            class190.field2742[var35.field4000].method848(var22 - 7, var31 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class261 var18 = (class261) class202.field2862.method1532(-119); var18 != null; var18 = (class261) class202.field2862.method1523(-98)) {
            class155.method1016(var18.field3796, var18.field3793, 15, 16776960, var12);
            class155.method1016(var18.field3796, var18.field3793, 13, 16776960, var12);
            class155.method1016(var18.field3796, var18.field3793, 11, 16776960, var12);
            class155.method1016(var18.field3796, var18.field3793, 9, 16776960, var12);
            class190.field2742[var18.field3799].method848(var18.field3796 - 7, var18.field3793 + -7);
        }
        class202.field2862.method1528(false);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3558 = arg4;
        this.field3567 = arg2;
        this.field3559 = arg0;
        this.field3563 = arg5;
        this.field3569 = arg6;
        this.field3570 = arg3;
        this.field3557 = arg1;
    }
}
