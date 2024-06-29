import java.awt.Canvas;
import java.awt.Rectangle;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class class134 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Lps;")
    public class59 field1695;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "Ljava/util/Random;")
    public static Random field1708 = new Random();

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Lnf;")
    public static class389 field1710 = new class389();

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field1711 = -1;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "Luj;")
    public static class248 field1713;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()V")
    public abstract void method732();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
    public abstract void method733(boolean arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method734(Canvas arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)Lqd;")
    public abstract class297 method735(int arg0);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "()Z")
    public abstract boolean method736();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lfl;IIII)Lva;")
    public abstract class327 method737(class499 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIII)V")
    public abstract void method738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "()V")
    public abstract void method739();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIII)V")
    public abstract void method740(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIII)V")
    public final void method741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method793(arg1, arg2, arg0, arg3, arg4);
        field1697++;
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "()Z")
    public abstract boolean method742();

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "()V")
    public abstract void method743();

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "()Z")
    public abstract boolean method744();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([Lva;Lbv;Lgs;[Lla;I)V")
    public abstract void method745(class327[] arg0, class191 arg1, class33 arg2, class299[] arg3, int arg4);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method746(Canvas arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIF)Ldq;")
    public abstract class472 method747(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
    public static void method748(int arg0) {
        field1710 = null;
        field1713 = null;
        field1708 = null;
        if (arg0 != -2) {
            method759(-74, 81, 73, -55, 21, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "()Z")
    public abstract boolean method749();

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "()I")
    public abstract int method750();

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "()Z")
    public abstract boolean method751();

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "()I")
    public abstract int method752();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[[I[[IIII)Log;")
    public abstract class441 method753(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(IIIII)V")
    public final void method754(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1698++;
        this.method740(arg0, arg4, arg2, arg3, 1);
        if (arg1 != -27659) {
            this.method752();
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "()V")
    public abstract void method756();

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "()I")
    public abstract int method757();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)[I")
    public abstract int[] method758(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIB)Z")
    public static final boolean method759(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1707++;
        for (int var6 = arg4; var6 <= arg0; var6++) {
            for (int var7 = arg1; var7 <= arg3; var7++) {
                if (class381.field5678[var6][var7] == arg2 && class90.field1237[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg5 < 38) {
            field1714 = 34;
        }
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method760(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "()Z")
    public abstract boolean method761();

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)V")
    public abstract void method762(boolean arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[I[I)Lfs;")
    public abstract class372 method763(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFF)V")
    public abstract void method764(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "()Z")
    public abstract boolean method765();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[Ldq;)V")
    public abstract void method766(int arg0, class472[] arg1);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZIII)V")
    public final void method767(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.method803(arg3, arg4, arg0, arg1, arg5, 1);
        field1705++;
        if (!arg2) {
            this.method817(null, null, 0.13152617F, null);
        }
    }

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "()V")
    public abstract void method768();

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIII)V")
    public abstract void method769(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIIII)V")
    public abstract void method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILfs;II)V")
    public abstract void method771(int arg0, class372 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method772(Canvas arg0);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(Z)V")
    public abstract void method773(boolean arg0);

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "()Z")
    public abstract boolean method774();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
    public abstract void method775(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "()V")
    public abstract void method776();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;ILqn;ILps;I)Leq;")
    public static final synchronized class134 method777(Canvas arg0, int arg1, class44 arg2, int arg3, class59 arg4, int arg5) {
        field1709++;
        if (arg3 <= 3) {
            return null;
        }
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class260.field3720[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class134 var9;
        if (arg5 == 0) {
            var9 = class46.method352(arg4, (byte) 112, var6, arg0);
        } else if (arg5 == 1) {
            var9 = class125.method705(arg4, arg2, arg0, 7159, arg1, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class260.field3720[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "()I")
    public abstract int method778();

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(IIII)V")
    public abstract void method779(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZ)Lqg;")
    public abstract class307 method780(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "()F")
    public abstract float method781();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Loi;)V")
    public abstract void method783(class49 arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([IIIII)Lqg;")
    public abstract class307 method784(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([I)V")
    public abstract void method785(int[] arg0);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)V")
    public abstract void method786(int arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lva;Lbv;Lgs;Lla;I)V")
    public abstract void method787(class327 arg0, class191 arg1, class33 arg2, class299 arg3, int arg4);

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "()I")
    public abstract int method788();

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(IIII)V")
    public abstract void method789(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "()F")
    public abstract float method790();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(F)V")
    public abstract void method791(float arg0);

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
    public abstract void method792(int arg0);

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(IIIII)V")
    public abstract void method793(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqd;)V")
    public abstract void method794(class297 arg0);

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "()Z")
    public abstract boolean method795();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III[I)V")
    public abstract void method796(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "()Z")
    public abstract boolean method797();

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
    public abstract void method798(int arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method799(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lbv;)V")
    public abstract void method800(class191 arg0);

    @OriginalMember(owner = "client!eq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method835(1);
        field1699++;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(IIIIII)V")
    public final void method801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -6625) {
            this.method835(65);
        }
        field1701++;
        this.method770(arg4, arg2, arg1, arg5, arg3, 1);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lmo;[Lpi;Z)Lhr;")
    public abstract class348 method802(class507 arg0, class328[] arg1, boolean arg2);

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(IIIIII)V")
    public abstract void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lpi;Z)Lqg;")
    public abstract class307 method804(class328 arg0, boolean arg1);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIB[B)I")
    public static final int method805(int arg0, int arg1, byte arg2, byte[] arg3) {
        int var4 = -100 / ((arg2 - 38) / 56);
        field1696++;
        int var5 = -1;
        for (int var6 = arg0; var6 < arg1; var6++) {
            var5 = var5 >>> 8 ^ class504.field7691[(arg3[var6] ^ var5) & 0xFF];
        }
        return ~var5;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIBI)V")
    public final void method806(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 >= 30) {
            this.method738(arg3, arg2, arg1, arg5, arg0, 1);
            field1702++;
        }
    }

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "()V")
    public abstract void method807();

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(IIII)V")
    public abstract void method808(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBII)V")
    public final void method809(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.method825(arg4, arg1, arg3, arg0, 1);
        field1704++;
        int var6 = -42 % ((arg2 - 5) / 43);
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(IIII)V")
    public abstract void method810(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V")
    public abstract void method811(int arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([Lva;Lgs;[Lla;I)V")
    public abstract void method812(class327[] arg0, class33 arg1, class299[] arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "(I)V")
    public abstract void method813(int arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V")
    public abstract void method814(int arg0, int arg1);

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "()Z")
    public abstract boolean method815();

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "()Z")
    public abstract boolean method816();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Loi;Loi;FLoi;)Loi;")
    public abstract class49 method817(class49 arg0, class49 arg1, float arg2, class49 arg3);

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method818(Canvas arg0);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)I")
    public abstract int method819(int arg0, int arg1);

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(IIIIII)Z")
    public abstract boolean method820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(FF)V")
    public abstract void method821(float arg0, float arg1);

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "()Z")
    public abstract boolean method822();

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "()Lgs;")
    public abstract class33 method823();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIBIII)V")
    public static final void method824(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class467.method2736(arg5, 0);
        field1700++;
        int var7 = 0;
        int var8 = arg5 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg3 != 59) {
            method805(123, 111, (byte) 25, null);
        }
        int var14 = -1;
        int[] var15 = class41.field629[arg1];
        int var16 = arg4 - var8;
        int var17 = arg4 + var8;
        class238.method1440(var15, arg0, var16, arg4 - arg5, -14726);
        class238.method1440(var15, arg2, var17, var16, arg3 ^ 0xFFFFC641);
        class238.method1440(var15, arg0, arg4 + arg5, var17, arg3 ^ 0xFFFFC641);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class77.field1092[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class41.field629[arg1 + var9];
                    int[] var19 = class41.field629[arg1 - var9];
                    int var20 = arg4 + var7;
                    int var21 = arg4 - var7;
                    class238.method1440(var18, arg0, var20, var21, -14726);
                    class238.method1440(var19, arg0, var20, var21, -14726);
                } else {
                    int[] var22 = class41.field629[arg1 + var9];
                    int[] var23 = class41.field629[arg1 - var9];
                    int var24 = class77.field1092[var9];
                    int var25 = arg4 + var7;
                    int var26 = arg4 - var7;
                    int var27 = arg4 + var24;
                    int var28 = arg4 - var24;
                    class238.method1440(var22, arg0, var28, var26, -14726);
                    class238.method1440(var22, arg2, var27, var28, -14726);
                    class238.method1440(var22, arg0, var25, var27, -14726);
                    class238.method1440(var23, arg0, var28, var26, arg3 - 14785);
                    class238.method1440(var23, arg2, var27, var28, arg3 - 14785);
                    class238.method1440(var23, arg0, var25, var27, -14726);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class41.field629[arg1 + var7];
            int[] var30 = class41.field629[arg1 - var7];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var7 < var8) {
                int var33 = var11 >= var7 ? var11 : class77.field1092[var7];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class238.method1440(var29, arg0, var35, var32, -14726);
                class238.method1440(var29, arg2, var34, var35, arg3 - 14785);
                class238.method1440(var29, arg0, var31, var34, -14726);
                class238.method1440(var30, arg0, var35, var32, -14726);
                class238.method1440(var30, arg2, var34, var35, -14726);
                class238.method1440(var30, arg0, var31, var34, arg3 - 14785);
            } else {
                class238.method1440(var29, arg0, var31, var32, -14726);
                class238.method1440(var30, arg0, var31, var32, arg3 - 14785);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(IIIII)V")
    public abstract void method825(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "(IIII)V")
    public abstract void method826(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(II)I")
    public abstract int method828(int arg0, int arg1);

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(IIIIII)Loi;")
    public abstract class49 method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "()Lgs;")
    public abstract class33 method830();

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "()Z")
    public abstract boolean method831();

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "()V")
    public abstract void method832();

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(ILps;)V")
    public class134(int arg0, class59 arg1) {
        this.field1695 = arg1;
        this.field1706 = arg0;
    }

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)V")
    public abstract void method833(int arg0);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIILfs;II)V")
    public abstract void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class372 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "(I)V")
    public final void method835(int arg0) {
        class260.field3720[this.field1706] = false;
        if (arg0 != 1) {
            this.method811(71);
        }
        field1694++;
        this.method807();
    }

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "()V")
    public abstract void method836();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lgs;)V")
    public abstract void method837(class33 arg0);

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "()I")
    public abstract int method838();

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "(I)V")
    public abstract void method839(int arg0);

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "()Z")
    public abstract boolean method840();
}
