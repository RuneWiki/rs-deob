import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class180 extends class234 {

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    private int field3116 = -32768;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    private int field3112;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    private int field3109;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    private int field3110;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    private int field3115;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    private int field3130;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "Ltd;")
    private class204 field3129;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    private int field3119;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field3108 = 0;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "Ldj;")
    public static class44 field3124 = class89.method650(255, " ");

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Ldj;")
    public static class44 field3122 = class89.method650(255, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "Ldj;")
    public static class44 field3131 = class89.method650(255, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field3114 = -1;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Lbc;")
    public static class15 field3126;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "[[[B")
    public static byte[][][] field3121;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lca;III)V")
    public static final void method1135(class24 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 72) {
            field3114 = 46;
        }
        if (arg0.field2243 == arg3 && arg3 != -1) {
            class204 var4 = class94.method672(arg3, -116);
            int var5 = var4.field3646;
            if (var5 == 1) {
                arg0.field2215 = 0;
                arg0.field2252 = 0;
                arg0.field2255 = 0;
                arg0.field2222 = arg1;
                class139.method937(var4, arg0.field2260, -104, arg0.field2195, arg0.field2252, class96.field1774 == arg0);
            }
            if (var5 == 2) {
                arg0.field2215 = 0;
            }
        } else if (arg3 == -1 || arg0.field2243 == -1 || class94.method672(arg3, 79).field3643 >= class94.method672(arg0.field2243, 127).field3643) {
            arg0.field2215 = 0;
            arg0.field2255 = 0;
            arg0.field2252 = 0;
            arg0.field2222 = arg1;
            arg0.field2203 = arg0.field2194;
            arg0.field2243 = arg3;
            if (arg0.field2243 != -1) {
                class139.method937(class94.method672(arg0.field2243, 110), arg0.field2260, -120, arg0.field2195, arg0.field2252, class96.field1774 == arg0);
            }
        }
        field3120++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method1136(byte arg0) {
        field3121 = null;
        field3124 = null;
        field3126 = null;
        field3131 = null;
        field3122 = null;
        if (arg0 < 54) {
            method1135(null, -123, -53, -114);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method1137(Object arg0, boolean arg1, int arg2) {
        if (arg2 != -950803578) {
            field3122 = null;
        }
        field3117++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class8.method82(true, var3) : var3;
        } else if (arg0 instanceof class178) {
            class178 var4 = (class178) arg0;
            return var4.method968(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()I")
    public final int method67() {
        field3123++;
        return this.field3116;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class234 var11 = this.method1138((byte) -89);
        field3128++;
        if (var11 != null) {
            var11.method42(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3116 = var11.method67();
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Lwd;")
    private final class234 method1138(byte arg0) {
        class39 var2 = class40.method281(true, this.field3110);
        field3125++;
        if (var2.field737 != null) {
            var2 = var2.method274(103);
        }
        if (var2 == null) {
            return null;
        }
        if (this.field3129 != null) {
            int var3 = class46.field868 - this.field3119;
            if (var3 > 100 && this.field3129.field3659 > 0) {
                int var4 = this.field3129.field3658.length - this.field3129.field3659;
                while (this.field3132 < var4 && var3 > this.field3129.field3648[this.field3132]) {
                    var3 -= this.field3129.field3648[this.field3132];
                    this.field3132++;
                }
                if (this.field3132 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field3129.field3658.length; var6++) {
                        var5 += this.field3129.field3648[var6];
                    }
                    var3 %= var5;
                }
            }
            label86: {
                do {
                    do {
                        if (var3 <= this.field3129.field3648[this.field3132]) {
                            break label86;
                        }
                        var3 -= this.field3129.field3648[this.field3132];
                        this.field3132++;
                    } while (this.field3129.field3658.length > this.field3132);
                    this.field3132 -= this.field3129.field3659;
                } while (this.field3132 >= 0 && this.field3132 < this.field3129.field3658.length);
                this.field3129 = null;
            }
            this.field3119 = class46.field868 - var3;
        }
        int var7;
        int var8;
        if (this.field3109 == 1 || this.field3109 == 3) {
            var7 = var2.field698;
            var8 = var2.field725;
        } else {
            var7 = var2.field725;
            var8 = var2.field698;
        }
        int var9 = (var7 + 1 >> 1) + this.field3115;
        int var10 = this.field3115 + (var7 >> 1);
        int var11 = (var8 >> 1) + this.field3130;
        int var12 = (var8 + 1 >> 1) + this.field3130;
        int[][] var13 = class211.field3771[this.field3112];
        int var14 = var13[var9][var11] + var13[var10][var11] + var13[var10][var12] + var13[var9][var12] >> 2;
        int var15 = (this.field3115 << 7) + (var7 << 6);
        int var16 = (this.field3130 << 7) + (var8 << 6);
        if (arg0 >= -78) {
            method1135(null, -13, 40, -62);
        }
        class88 var17;
        if (this.field3129 == null) {
            var17 = var2.method270(var13, var16, false, -127, var14, this.field3109, var15, this.field3113);
        } else {
            var17 = var2.method275(var15, var13, -177794294, this.field3132, this.field3109, this.field3113, this.field3129, var14, var16);
        }
        return var17 == null ? null : var17.field1674;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIIIZLwd;)V")
    public class180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class234 arg8) {
        this.field3112 = arg3;
        this.field3113 = arg1;
        this.field3109 = arg2;
        this.field3110 = arg0;
        this.field3115 = arg4;
        this.field3130 = arg5;
        if (arg6 != -1) {
            this.field3129 = class94.method672(arg6, 97);
            this.field3119 = class46.field868 - 1;
            this.field3132 = 0;
            if (this.field3129.field3646 == 0 && arg8 != null && arg8 instanceof class180) {
                class180 var10 = (class180) arg8;
                if (this.field3129 == var10.field3129) {
                    this.field3119 = var10.field3119;
                    this.field3132 = var10.field3132;
                    return;
                }
            }
            if (arg7 && this.field3129.field3659 != -1) {
                this.field3132 = (int) (Math.random() * (double) this.field3129.field3658.length);
                this.field3119 -= (int) (Math.random() * (double) this.field3129.field3648[this.field3132]);
                return;
            }
        }
    }
}
