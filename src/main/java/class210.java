import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class210 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field3472 = 0;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[I")
    public static int[] field3476 = new int[32768];

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lok;")
    public static class146 field3478 = class235.method1724(-12908, "gleiten:");

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field3480 = -1;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Loh;")
    public static class15 field3474;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "[I")
    public static int[] field3485;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[Lvf;")
    public static class302[] field3471;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Lgb;", line = 6)
    public static final class164 method1577(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class164 var4 = var3.field205;
            var3.field205 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 22)
    public static void method1578(int arg0) {
        field3485 = null;
        int var1 = -31 / ((arg0 + 27) / 32);
        field3478 = null;
        field3476 = null;
        field3471 = null;
        field3474 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V", line = 48)
    public static final void method1579(int arg0, int arg1) {
        class248.field4136 = new int[arg1];
        class232.field3878 = new int[arg1];
        field3477++;
        class27.field464 = new int[arg1];
        if (arg0 != -25802) {
            method1577(48, 111, -89);
        }
        class85.field1353 = new int[arg1];
        class28.field484 = new int[arg1];
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)V", line = 108)
    public static final void method1580(boolean arg0, int arg1) {
        if (arg1 >= -95) {
            method1577(109, -69, 96);
        }
        field3473++;
        byte var2;
        byte[][] var3;
        if (class271.field4640 && arg0) {
            var2 = 1;
            var3 = class294.field4994;
        } else {
            var2 = 4;
            var3 = class88.field1396;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class3.method9(-115);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class52.field944[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3B39B31) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 3 & 0x7FF;
                            int var10 = (var7 & 0xFFE653) >> 14;
                            int var11 = var7 >> 1 & 0x3;
                            int var12 = (var10 / 8 << 8) + var9 / 8;
                            for (int var13 = 0; var13 < class177.field3002.length; var13++) {
                                if (class177.field3002[var13] == var12 && var3[var13] != null) {
                                    class62.method482(var11, var8, var6 * 8, var3[var13], true, var5 * 8, arg0, class251.field4202, var4, (var10 & 0x7) * 8, (var9 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIII)V", line = 196)
    public static final void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3475++;
        int var7 = 0;
        int var8 = arg5;
        int var9 = arg5 - arg6;
        class15.method106(-114, arg5);
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg5;
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        if (class123.field2008 <= arg2 && arg2 <= class318.field5394) {
            int[] var14 = class81.field1297[arg2];
            int var15 = class21.method153(-126, arg0 - arg5, class151.field2564, class126.field2058);
            int var16 = class21.method153(-122, arg0 + arg5, class151.field2564, class126.field2058);
            int var17 = class21.method153(-126, arg0 - var9, class151.field2564, class126.field2058);
            int var18 = class21.method153(arg1 - 119, arg0 + var9, class151.field2564, class126.field2058);
            class40.method281(arg4, var15, var14, var17, 7);
            class40.method281(arg3, var17, var14, var18, 7);
            class40.method281(arg4, var18, var14, var16, 7);
        }
        int var19 = arg1;
        while (var7 < var8) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class87.field1386[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                int var20 = arg2 - var8;
                int var21 = arg2 + var8;
                if (class123.field2008 <= var21 && var20 <= class318.field5394) {
                    if (var9 <= var8) {
                        int var22 = class21.method153(arg1 ^ 0x7A, arg0 + var7, class151.field2564, class126.field2058);
                        int var23 = class21.method153(-117, arg0 - var7, class151.field2564, class126.field2058);
                        if (var21 <= class318.field5394) {
                            class40.method281(arg4, var23, class81.field1297[var21], var22, 7);
                        }
                        if (var20 >= class123.field2008) {
                            class40.method281(arg4, var23, class81.field1297[var20], var22, 7);
                        }
                    } else {
                        int var24 = class87.field1386[var8];
                        int var25 = class21.method153(-128, arg0 + var7, class151.field2564, class126.field2058);
                        int var26 = class21.method153(-118, arg0 - var7, class151.field2564, class126.field2058);
                        int var27 = class21.method153(-124, arg0 + var24, class151.field2564, class126.field2058);
                        int var28 = class21.method153(-117, arg0 - var24, class151.field2564, class126.field2058);
                        if (class318.field5394 >= var21) {
                            int[] var29 = class81.field1297[var21];
                            class40.method281(arg4, var26, var29, var28, 7);
                            class40.method281(arg3, var28, var29, var27, 7);
                            class40.method281(arg4, var27, var29, var25, 7);
                        }
                        if (var20 >= class123.field2008) {
                            int[] var30 = class81.field1297[var20];
                            class40.method281(arg4, var26, var30, var28, 7);
                            class40.method281(arg3, var28, var30, var27, 7);
                            class40.method281(arg4, var27, var30, var25, arg1 + 8);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (var32 >= class123.field2008 && var31 <= class318.field5394) {
                int var33 = arg0 + var8;
                int var34 = arg0 - var8;
                if (class151.field2564 <= var33 && var34 <= class126.field2058) {
                    int var35 = class21.method153(-128, var33, class151.field2564, class126.field2058);
                    int var36 = class21.method153(-123, var34, class151.field2564, class126.field2058);
                    if (var9 > var7) {
                        int var37 = var11 < var7 ? class87.field1386[var7] : var11;
                        int var38 = class21.method153(arg1 ^ 0x7C, arg0 + var37, class151.field2564, class126.field2058);
                        int var39 = class21.method153(-118, arg0 - var37, class151.field2564, class126.field2058);
                        if (class318.field5394 >= var32) {
                            int[] var40 = class81.field1297[var32];
                            class40.method281(arg4, var36, var40, var39, 7);
                            class40.method281(arg3, var39, var40, var38, 7);
                            class40.method281(arg4, var38, var40, var35, arg1 ^ 0xFFFFFFF8);
                        }
                        if (class123.field2008 <= var31) {
                            int[] var41 = class81.field1297[var31];
                            class40.method281(arg4, var36, var41, var39, 7);
                            class40.method281(arg3, var39, var41, var38, arg1 ^ 0xFFFFFFF8);
                            class40.method281(arg4, var38, var41, var35, 7);
                        }
                    } else {
                        if (class318.field5394 >= var32) {
                            class40.method281(arg4, var36, class81.field1297[var32], var35, arg1 ^ 0xFFFFFFF8);
                        }
                        if (var31 >= class123.field2008) {
                            class40.method281(arg4, var36, class81.field1297[var31], var35, 7);
                        }
                    }
                }
            }
        }
    }
}
