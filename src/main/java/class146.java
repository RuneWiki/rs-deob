import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class146 extends class212 {

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private final int field2661;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    private final int field2667;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    private final int field2674;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    private final int field2680;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    private final int field2676;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    private final int field2668;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    private final int field2682;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    private final int field2681;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Loh;")
    public static class263 field2663 = class253.method1681(-125, "::fpson");

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Z")
    public static boolean field2670 = true;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field2666 = 0;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "F")
    public static float field2673;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "Ldf;")
    public static class53 field2677;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lue;")
    public static class86 field2664;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Lue;")
    public static class86 field2671;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "[I")
    public static int[] field2679;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method960(byte arg0) {
        field2677 = null;
        field2663 = null;
        if (arg0 == -47) {
            field2671 = null;
            field2664 = null;
            field2679 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public final void method522(int arg0, int arg1, int arg2) {
        ++field2662;
        if (arg1 > -18) {
            this.method528((byte) -87, -90, 40);
        }
        int var4 = this.field2681 * arg2 >> 12;
        int var5 = this.field2668 * arg0 >> 12;
        int var6 = this.field2676 * arg2 >> 12;
        int var7 = this.field2674 * arg0 >> 12;
        int var8 = this.field2661 * arg2 >> 12;
        int var9 = this.field2667 * arg2 >> 12;
        int var10 = this.field2680 * arg0 >> 12;
        int var11 = this.field2682 * arg0 >> 12;
        class224.method1524((byte) 2, var6, super.field3788, var8, var10, var5, var11, var9, var7, var4);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)[Lw;")
    public static final class141[] method961(boolean arg0) {
        ++field2675;
        class141[] var1 = new class141[class31.field781];
        int var2 = 0;
        if (!arg0) {
            return null;
        } else {
            while (~var2 > ~class31.field781) {
                int var3 = class198.field3583[var2] * class181.field3289[var2];
                byte[] var4 = class191.field3425[var2];
                if (class137.field2496[var2]) {
                    byte[] var5 = class51.field1091[var2];
                    int[] var6 = new int[var3];
                    for (int var7 = 0; var3 > var7; ++var7) {
                        var6[var7] = class160.method1052(class263.method1777(var5[var7] << 24, -16777216), class103.field1965[class263.method1777(255, var4[var7])]);
                    }
                    var1[var2] = new class175(class240.field4200, class2.field46, class198.field3584[var2], class46.field1003[var2], class198.field3583[var2], class181.field3289[var2], var6);
                } else {
                    int[] var8 = new int[var3];
                    for (int var9 = 0; ~var3 < ~var9; ++var9) {
                        var8[var9] = class103.field1965[class263.method1777(255, var4[var9])];
                    }
                    var1[var2] = new class140(class240.field4200, class2.field46, class198.field3584[var2], class46.field1003[var2], class198.field3583[var2], class181.field3289[var2], var8);
                }
                ++var2;
            }
            class14.method111(0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BII)V")
    public final void method528(byte arg0, int arg1, int arg2) {
        int var4 = 89 % ((arg0 - -6) / 53);
        ++field2669;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2661 = arg4;
        this.field2667 = arg6;
        this.field2674 = arg3;
        this.field2680 = arg5;
        this.field2676 = arg2;
        this.field2668 = arg1;
        this.field2682 = arg7;
        this.field2681 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)V")
    public final void method531(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field2678;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII)V")
    public static final void method962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2665;
        class143.field2626[0].method620(arg0, arg5);
        class143.field2626[1].method620(arg0, arg3 - 16 + arg5);
        int var6 = (arg3 + -32) * arg3 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 + -32 + -var6) * arg2 / (-arg3 + arg1);
        class133.method865(arg0, arg5 + 16, 16, arg3 + -32, class87.field1734);
        class133.method865(arg0, arg5 - (-var7 + -16), 16, var6, class34.field809);
        class133.method872(arg0, arg5 + 16 + var7, var6, class121.field2243);
        class133.method872(arg0 - -1, arg5 + var7 + 16, var6, class121.field2243);
        if (arg4 == -27516) {
            class133.method871(arg0, arg5 + 16 - -var7, 16, class121.field2243);
            class133.method871(arg0, arg5 + 17 + var7, 16, class121.field2243);
            class133.method872(arg0 + 15, arg5 + 16 + var7, var6, class29.field738);
            class133.method872(arg0 + 14, arg5 - -17 + var7, var6 + -1, class29.field738);
            class133.method871(arg0, arg5 - -var7 + 15 + var6, 16, class29.field738);
            class133.method871(arg0 - -1, arg5 + 14 + var6 + var7, 15, class29.field738);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIILnj;IJZ)Z")
    public static final boolean method963(int arg0, int arg1, int arg2, int arg3, int arg4, class139 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class190.method1248(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }
}
