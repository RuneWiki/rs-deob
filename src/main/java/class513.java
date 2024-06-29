import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class513 extends class354 {

    @OriginalMember(owner = "client!dw", name = "L", descriptor = "I")
    private int field7537 = 4096;

    @OriginalMember(owner = "client!dw", name = "T", descriptor = "Z")
    private boolean field7545 = true;

    @OriginalMember(owner = "client!dw", name = "O", descriptor = "I")
    public static int field7540 = 20;

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
    public static int field7536 = -1;

    @OriginalMember(owner = "client!dw", name = "U", descriptor = "[C")
    public static char[] field7546 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!dw", name = "Q", descriptor = "Lof;")
    public static class446 field7542 = new class446("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!dw", name = "N", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!dw", name = "P", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!dw", name = "R", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!dw", name = "S", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!dw", name = "V", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "(I)V")
    public static void method3063(int arg0) {
        field7546 = null;
        if (arg0 == 0) {
            field7542 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 != 1638) {
            field7540 = -22;
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field7545 = arg0.method1087(false) == 1;
            }
        } else {
            this.field7537 = arg0.method1074(-635989152);
        }
        ++field7541;
    }

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "(I)V")
    public static final void method3064(int arg0) {
        ++field7547;
        class367.field5621 = arg0;
        class131.field1769.method450((byte) 73);
        class139.field1850 = false;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
    public class513() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method3065(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7538;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = -arg5 + arg7;
        int var12 = arg6 - arg5;
        int var13 = arg7 * arg7;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        if (arg3 > -125) {
            field7546 = null;
        }
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (1 - var22) * var15 + var19;
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
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class466.field6955[arg4];
        class221.method1489(var39, -arg7 + arg2, -var11 + arg2, (byte) -30, arg1);
        class221.method1489(var39, arg2 - var11, arg2 - -var11, (byte) -30, arg0);
        class221.method1489(var39, arg2 - -var11, arg2 - -arg7, (byte) -30, arg1);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        ++var10;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    ++var10;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (~var23 > -1) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    ++var8;
                }
            }
            if (~var24 > -1) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                ++var8;
            }
            var23 += -var36;
            var24 += -var32;
            --var9;
            var36 -= var27;
            var32 -= var27;
            int var41 = -var9 + arg4;
            int var42 = arg4 + var9;
            int var43 = arg2 + var8;
            int var44 = -var8 + arg2;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = -var10 + arg2;
                class221.method1489(class466.field6955[var41], var44, var46, (byte) -30, arg1);
                class221.method1489(class466.field6955[var41], var46, var45, (byte) -30, arg0);
                class221.method1489(class466.field6955[var41], var45, var43, (byte) -30, arg1);
                class221.method1489(class466.field6955[var42], var44, var46, (byte) -30, arg1);
                class221.method1489(class466.field6955[var42], var46, var45, (byte) -30, arg0);
                class221.method1489(class466.field6955[var42], var45, var43, (byte) -30, arg1);
            } else {
                class221.method1489(class466.field6955[var41], var44, var43, (byte) -30, arg1);
                class221.method1489(class466.field6955[var42], var44, var43, (byte) -30, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ldq;IILjava/awt/Component;I)Lkl;")
    public static final class55 method3066(class500 arg0, int arg1, int arg2, Component arg3, int arg4) {
        ++field7544;
        if (arg1 > -10) {
            method3066((class500) null, -29, -107, (Component) null, 42);
        }
        if (~class56.field818 == -1) {
            throw new IllegalStateException();
        } else if (~arg4 <= -1 && ~arg4 > -3) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class55 var5 = (class55) Class.forName("he").newInstance();
                var5.field785 = new int[256 * (class103.field1483 ? 2 : 1)];
                var5.field792 = arg2;
                var5.method397(arg3);
                var5.field788 = (-1024 & arg2) + 1024;
                if (var5.field788 > 16384) {
                    var5.field788 = 16384;
                }
                var5.method405(var5.field788);
                if (class355.field5493 > 0 && class248.field3454 == null) {
                    class248.field3454 = new class155();
                    class248.field3454.field2019 = arg0;
                    arg0.method3001(class355.field5493, class248.field3454, 0);
                }
                if (class248.field3454 != null) {
                    if (class248.field3454.field2016[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class248.field3454.field2016[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class262 var6 = new class262(arg0, arg4);
                    var6.field785 = new int[(!class103.field1483 ? 1 : 2) * 256];
                    var6.field792 = arg2;
                    var6.method397(arg3);
                    var6.field788 = 16384;
                    var6.method405(var6.field788);
                    if (~class355.field5493 < -1 && class248.field3454 == null) {
                        class248.field3454 = new class155();
                        class248.field3454.field2019 = arg0;
                        arg0.method3001(class355.field5493, class248.field3454, 0);
                    }
                    if (class248.field3454 != null) {
                        if (class248.field3454.field2016[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class248.field3454.field2016[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class55();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field7539;
        int[][] var3 = super.field5474.method2414((byte) -113, arg0);
        if (super.field5474.field5870) {
            int[] var4 = this.method2275((byte) 93, 0, arg0 + -1 & class423.field6453);
            int[] var5 = this.method2275((byte) 111, 0, arg0);
            int[] var6 = this.method2275((byte) 89, 0, arg0 - -1 & class423.field6453);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class531.field7814; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field7537;
                int var12 = (var5[var10 + 1 & class179.field2409] - var5[class179.field2409 & var10 + -1]) * this.field7537;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field7545) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        int var21 = -60 / ((48 - arg1) / 60);
        return var3;
    }
}
