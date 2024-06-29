import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class56 extends class210 {

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field682 = -1;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "Lvq;")
    public static class24 field689 = new class24(72, 20);

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "[Lae;")
    public static class285[] field685;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lna;", line = 5)
    public static final class53 method424(Component arg0, byte arg1, boolean arg2) {
        if (arg1 != -75) {
            field682 = -57;
        }
        ++field686;
        return new class377(arg0, arg2);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 16)
    public class56() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[I", line = 19)
    public final int[] method361(int arg0, byte arg1) {
        ++field681;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            class224.method1542(var3, 0, class202.field2852, class331.field4911[arg0]);
        }
        if (arg1 != -38) {
            this.method361(-52, (byte) 60);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIZ)V", line = 43)
    public static final void method425(int arg0, int arg1, boolean arg2) {
        ++field683;
        int var3 = class233.field3502.method2333(104, class42.field565.method2543(arg2, class153.field2073));
        for (class375 var4 = (class375) class138.field1885.method2478(1603); var4 != null; var4 = (class375) class138.field1885.method2486((byte) -82)) {
            int var8 = class421.method2599(var4, (byte) 59);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class237.field3532 * 16 + 21;
        int var6 = arg1 - var3 / 2;
        if (class214.field3016 < var3 + var6) {
            var6 = -var3 + class214.field3016;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg0;
        if (~class375.field5473 > ~(var5 + arg0)) {
            var7 = class375.field5473 - var5;
        }
        class427.field6215 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class286.field4210 = true;
        class130.field1732 = class237.field3532 * 16 + (class92.field1144 ? 26 : 22);
        class441.field6420 = var7;
        class466.field6860 = var3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)V", line = 92)
    public static final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field684;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = -arg7 + arg5;
        int var12 = -arg7 + arg1;
        int var13 = arg5 * arg5;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 - -var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 - -var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg1 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class323.field4774[arg0];
        class381.method2419((byte) 82, arg2, -arg5 + arg4, var39, arg4 - var11);
        class381.method2419((byte) 54, arg6, -var11 + arg4, var39, arg4 + var11);
        if (arg3 <= 34) {
            field682 = 8;
        }
        class381.method2419((byte) 94, arg2, arg4 + var11, var39, arg4 + arg5);
        while (~var9 < -1) {
            boolean var40 = ~var9 >= ~var12;
            if (var40) {
                if (~var25 > -1) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        ++var10;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (~var26 > -1) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var33 += var30;
                    ++var10;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (~var23 > -1) {
                while (~var23 > -1) {
                    var23 += var31;
                    var24 += var35;
                    ++var8;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                ++var8;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            --var9;
            int var41 = -var9 + arg0;
            int var42 = arg0 + var9;
            int var43 = arg4 + var8;
            int var44 = arg4 - var8;
            if (!var40) {
                class381.method2419((byte) 53, arg2, var44, class323.field4774[var41], var43);
                class381.method2419((byte) 35, arg2, var44, class323.field4774[var42], var43);
            } else {
                int var45 = arg4 - -var10;
                int var46 = -var10 + arg4;
                class381.method2419((byte) 23, arg2, var44, class323.field4774[var41], var46);
                class381.method2419((byte) 91, arg6, var46, class323.field4774[var41], var45);
                class381.method2419((byte) 32, arg2, var45, class323.field4774[var41], var43);
                class381.method2419((byte) 50, arg2, var44, class323.field4774[var42], var46);
                class381.method2419((byte) 119, arg6, var46, class323.field4774[var42], var45);
                class381.method2419((byte) 98, arg2, var45, class323.field4774[var42], var43);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V", line = 265)
    public static void method427(boolean arg0) {
        field689 = null;
        if (arg0) {
            field685 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(III)Llk;", line = 283)
    public static final class125 method428(int arg0, int arg1, int arg2) {
        ++field687;
        if (arg2 != -3636) {
            return null;
        } else {
            class125 var3 = (class125) class106.field1432.method609((long) arg1 << 32 | (long) arg0, 94);
            if (var3 == null) {
                var3 = new class125(arg1, arg0);
                class106.field1432.method606(1, var3, var3.field3907);
            }
            return var3;
        }
    }
}
