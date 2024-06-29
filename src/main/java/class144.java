import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class144 extends class98 {

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "Z")
    public static boolean field1780 = false;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "Liq;")
    public static class362 field1769 = new class362("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "Liq;")
    public static class362 field1781 = new class362("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field1783 = null;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    private int field1775;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    private int field1777;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    private int field1779;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "Lvg;")
    public static class32 field1782;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (~arg0 == -1) {
            this.method880(arg1.method1616(false), (byte) 114);
        }
        if (arg2 != 0) {
            this.field1777 = -107;
        }
        ++field1778;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
    public static void method876(int arg0) {
        field1783 = null;
        field1781 = null;
        if (arg0 >= -91) {
            field1781 = null;
        }
        field1782 = null;
        field1769 = null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field1768;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        int var4 = 60 % ((arg1 - 60) / 43);
        if (super.field1184.field332) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class268.field3811 > var8; ++var8) {
                var5[var8] = this.field1779;
                var6[var8] = this.field1777;
                var7[var8] = this.field1775;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IB)Loa;")
    public static final class415 method877(int arg0, byte arg1) {
        ++field1773;
        class415 var2 = (class415) class230.field3256.method856((long) arg0, (byte) 123);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg0 > -32769) {
                var3 = class420.field6004.method2431((byte) 102, 0, arg0);
            } else {
                var3 = class203.field2919.method2431((byte) 86, 0, arg0 & 32767);
            }
            if (arg1 != -4) {
                return null;
            } else {
                class415 var4 = new class415();
                if (var3 != null) {
                    var4.method2647(arg1 + 32772, new class236(var3));
                }
                if (arg0 >= 32768) {
                    var4.method2642(-99);
                }
                class230.field3256.method849((byte) 63, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZII)Ljm;")
    public static final class411 method878(boolean arg0, int arg1, int arg2) {
        if (arg2 > -55) {
            method882(-74, 24, 99, 38, -89, -60, (byte) -55);
        }
        ++field1774;
        long var3 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
        return (class411) class324.field4614.method1888(var3, (byte) -30);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILae;IIBLhb;Lon;I)V")
    public static final void method879(int arg0, int arg1, class134 arg2, int arg3, int arg4, byte arg5, class433 arg6, class184 arg7, int arg8) {
        ++field1770;
        if (arg5 == 106) {
            class246 var9 = class153.method927(0, arg4);
            if (var9 != null && var9.field3497 && var9.method1676(-1)) {
                if (var9.field3503 != null) {
                    int[] var10 = new int[var9.field3503.length];
                    for (int var11 = 0; ~(var10.length / 2) < ~var11; ++var11) {
                        int var13;
                        if (class129.field1568 != 4) {
                            var13 = (int) class441.field6333 + class297.field4137 & 16383;
                        } else {
                            var13 = (int) class441.field6333 & 16383;
                        }
                        int var14 = class158.field2055[var13];
                        int var15 = class158.field2059[var13];
                        if (~class129.field1568 != -5) {
                            var14 = var14 * 256 / (class292.field4089 + 256);
                            var15 = var15 * 256 / (class292.field4089 + 256);
                        }
                        var10[var11 * 2] = ((arg8 - -(var9.field3503[var11 * 2] * 4)) * var15 + (arg1 - -(var9.field3503[var11 * 2 + 1] * 4)) * var14 >> 15) + arg7.field2618 / 2 + arg3;
                        var10[var11 * 2 - -1] = arg7.field2516 / 2 + (arg0 - ((var9.field3503[var11 * 2 + 1] * 4 + arg1) * var15 + -((var9.field3503[var11 * 2] * 4 + arg8) * var14) >> 15));
                    }
                    class407.method2604(arg2, var10, var9.field3514, arg7.field2608, arg7.field2538);
                    for (int var12 = 0; ~(var10.length / 2 + -1) < ~var12; ++var12) {
                        arg2.method666(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 3], var9.field3502, 1, arg6, arg3, arg0);
                    }
                    arg2.method666(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field3502, 1, arg6, arg3, arg0);
                }
                class381 var16 = null;
                if (~var9.field3490 != 0) {
                    var16 = var9.method1669(false, arg2, false);
                    if (var16 != null) {
                        class435.method2730(arg1, var16, arg7, arg3, (byte) 25, arg6, arg8, arg0);
                    }
                }
                if (var9.field3500 != null) {
                    int var17 = 0;
                    if (var16 != null) {
                        var17 = var16.method759();
                    }
                    class266 var18 = class263.field3750;
                    class355 var19 = class152.field1879;
                    if (var9.field3512 == 1) {
                        var18 = class73.field874;
                        var19 = class130.field1582;
                    }
                    if (~var9.field3512 == -3) {
                        var19 = class371.field5232;
                        var18 = class174.field2391;
                    }
                    class211.method1427(arg6, var9.field3500, arg3, arg8, 0, var17, var19, arg0, var9.field3513, var18, arg7, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
    private class144(int arg0) {
        super(0, false);
        this.method880(arg0, (byte) 114);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(IB)V")
    private final void method880(int arg0, byte arg1) {
        if (arg1 != 114) {
            this.method81(62, (class236) null, -11);
        }
        this.field1775 = (arg0 & 255) << 4;
        this.field1779 = (16711680 & arg0) >> 12;
        ++field1771;
        this.field1777 = 4080 & arg0 >> 4;
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
    public static final void method881(int arg0) {
        if (arg0 <= 56) {
            method882(24, -103, -50, 114, -54, -124, (byte) 24);
        }
        class69.field796.method1618(0);
        ++field1776;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field1772;
        class55.method318(arg5, 93);
        int var7 = 0;
        int var8 = -arg2 + arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class291.field4067[arg1];
        int var16 = -var8 + arg4;
        class296.method1954(arg3, var16, var15, arg4 - arg5, -1);
        int var17 = arg4 + var8;
        class296.method1954(arg0, var17, var15, var16, -1);
        class296.method1954(arg3, arg4 - -arg5, var15, var17, arg6 ^ 101);
        if (arg6 != -102) {
            method877(-99, (byte) 24);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (~var12 <= -1 && ~var11 <= -2) {
                class367.field5203[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                if (~var8 >= ~var9) {
                    int[] var18 = class291.field4067[arg1 + var9];
                    int[] var19 = class291.field4067[-var9 + arg1];
                    int var20 = arg4 + var7;
                    int var21 = -var7 + arg4;
                    class296.method1954(arg3, var20, var18, var21, -1);
                    class296.method1954(arg3, var20, var19, var21, arg6 ^ 101);
                } else {
                    int[] var22 = class291.field4067[arg1 + var9];
                    int[] var23 = class291.field4067[arg1 - var9];
                    int var24 = class367.field5203[var9];
                    int var25 = arg4 + var7;
                    int var26 = -var7 + arg4;
                    int var27 = arg4 - -var24;
                    int var28 = -var24 + arg4;
                    class296.method1954(arg3, var28, var22, var26, -1);
                    class296.method1954(arg0, var27, var22, var28, -1);
                    class296.method1954(arg3, var25, var22, var27, -1);
                    class296.method1954(arg3, var28, var23, var26, -1);
                    class296.method1954(arg0, var27, var23, var28, arg6 ^ 101);
                    class296.method1954(arg3, var25, var23, var27, -1);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class291.field4067[arg1 + var7];
            int[] var30 = class291.field4067[-var7 + arg1];
            int var31 = arg4 - -var9;
            int var32 = -var9 + arg4;
            if (var7 < var8) {
                int var33 = var7 <= var11 ? var11 : class367.field5203[var7];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class296.method1954(arg3, var35, var29, var32, -1);
                class296.method1954(arg0, var34, var29, var35, -1);
                class296.method1954(arg3, var31, var29, var34, -1);
                class296.method1954(arg3, var35, var30, var32, -1);
                class296.method1954(arg0, var34, var30, var35, -1);
                class296.method1954(arg3, var31, var30, var34, arg6 ^ 101);
            } else {
                class296.method1954(arg3, var31, var29, var32, arg6 + 101);
                class296.method1954(arg3, var31, var30, var32, -1);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class144() {
        this(0);
    }
}
