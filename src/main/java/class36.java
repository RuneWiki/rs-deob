import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class36 extends class535 {

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
    private int field771 = 8192;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    private int field774 = 2048;

    @OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
    private int field778 = 2048;

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
    private int field775 = 0;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
    private int field770 = 0;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
    private int field773 = 12288;

    @OriginalMember(owner = "client!gp", name = "V", descriptor = "I")
    private int field785 = 4096;

    @OriginalMember(owner = "client!gp", name = "R", descriptor = "Lbd;")
    public static class44 field781 = new class44("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!gp", name = "P", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!gp", name = "Q", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!gp", name = "S", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!gp", name = "T", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!gp", name = "U", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field771 = arg1.method3018(566990904);
                                }
                            } else {
                                this.field785 = arg1.method3018(566990904);
                            }
                        } else {
                            this.field773 = arg1.method3018(566990904);
                        }
                    } else {
                        this.field778 = arg1.method3018(566990904);
                    }
                } else {
                    this.field775 = arg1.method3018(566990904);
                }
            } else {
                this.field770 = arg1.method3018(566990904);
            }
        } else {
            this.field774 = arg1.method3018(arg2 + 566997136);
        }
        if (arg2 != -6232) {
            this.field775 = 30;
        }
        ++field776;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILci;)V")
    public static final void method383(int arg0, class320 arg1) {
        class540.field7951 = 0;
        ++field779;
        class452.field6604 = 0;
        class235.field3503 = new class122();
        class4.field21 = new class308[1024];
        class193.field2810 = new class115[class457.field6638[class248.field3711] + 1];
        class465.field6753 = 0;
        class519.field7522 = 0;
        class87.method655(arg1, 114);
        int var2 = 92 / ((arg0 - -45) / 63);
        class464.method2751(arg1, (byte) -126);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIILcd;II)V")
    public static final void method384(int arg0, int arg1, int arg2, class211 arg3, int arg4, int arg5) {
        ++field783;
        if (~arg3.field3178 != 0 || arg3.field3176 != null) {
            int var6 = 0;
            int var7 = class220.field3371.field2550 * arg3.field3170 >> 8;
            if (arg2 != -4096) {
                field781 = null;
            }
            if (arg4 > arg3.field3177) {
                var6 += -arg3.field3177 + arg4;
            } else if (arg3.field3167 > arg4) {
                var6 += -arg4 + arg3.field3167;
            }
            if (arg0 > arg3.field3180) {
                var6 += -arg3.field3180 + arg0;
            } else if (arg0 < arg3.field3169) {
                var6 += -arg0 + arg3.field3169;
            }
            if (~arg3.field3188 != -1 && ~arg3.field3188 <= ~(var6 + -64) && ~class220.field3371.field2550 != -1 && ~arg3.field3171 == ~arg1) {
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var8 = (arg3.field3188 - var6) * var7 / arg3.field3188;
                if (arg3.field3183 == null) {
                    if (~arg3.field3178 <= -1) {
                        class61 var9 = class61.method514(class386.field5505, arg3.field3178, 0);
                        if (var9 != null) {
                            class407 var10 = var9.method512().method2425(class434.field6212);
                            class93 var11 = class93.method696(var10, 100, var8);
                            var11.method691(-1);
                            class504.field7295.method1586(var11);
                            arg3.field3183 = var11;
                        }
                    }
                } else {
                    arg3.field3183.method715(var8);
                }
                if (arg3.field3181 != null) {
                    arg3.field3181.method715(var8);
                    if (!arg3.field3181.method416((byte) -95)) {
                        arg3.field3181 = null;
                    }
                } else {
                    if (arg3.field3176 != null && (arg3.field3175 -= arg5) <= 0) {
                        int var12 = (int) ((double) arg3.field3176.length * Math.random());
                        class61 var13 = class61.method514(class386.field5505, arg3.field3176[var12], 0);
                        if (var13 != null) {
                            class407 var14 = var13.method512().method2425(class434.field6212);
                            class93 var15 = class93.method696(var14, 100, var8);
                            var15.method691(0);
                            class504.field7295.method1586(var15);
                            arg3.field3181 = var15;
                            arg3.field3175 = (int) (Math.random() * (double) (-arg3.field3187 + arg3.field3182)) + arg3.field3187;
                            return;
                        }
                    }
                }
            } else {
                if (arg3.field3183 != null) {
                    class504.field7295.method1587(arg3.field3183);
                    arg3.field3183 = null;
                }
                if (arg3.field3181 != null) {
                    class504.field7295.method1587(arg3.field3181);
                    arg3.field3181 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)I")
    public static final int method385(int arg0) {
        if (arg0 != -3617) {
            return 6;
        } else {
            ++field772;
            return 16;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBI)Z")
    private final boolean method386(int arg0, byte arg1, int arg2) {
        ++field782;
        int var4 = (arg0 - arg2) * this.field773 >> 12;
        int var5 = class434.field6213[(var4 * 255 & 1046443) >> 12];
        if (arg1 != -66) {
            return false;
        } else {
            int var6 = (var5 << 12) / this.field773;
            int var7 = (var6 << 12) / this.field771;
            int var8 = this.field785 * var7 >> 12;
            return var8 > arg0 + arg2 && arg2 - -arg0 > -var8;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(III)Z")
    private final boolean method387(int arg0, int arg1, int arg2) {
        ++field777;
        int var4 = (arg1 + arg2) * this.field773 >> 12;
        int var5 = class434.field6213[arg0 * var4 >> 12 & 255];
        int var6 = (var5 << 12) / this.field773;
        int var7 = (var6 << 12) / this.field771;
        int var8 = this.field785 * var7 >> 12;
        return arg2 - arg1 < var8 && -arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
    public class36() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        ++field784;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int var4 = class448.field6442[arg0] + -2048;
            for (int var5 = 0; var5 < class174.field2597; ++var5) {
                int var6 = class539.field7939[var5] + -2048;
                int var7 = var6 - -this.field774;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field770 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field775 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 - -4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = var4 - -this.field778;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method386(var12, (byte) -66, var9) && !this.method387(255, var15, var18) ? 0 : 4096;
            }
        }
        if (arg1 != 1) {
            this.field774 = -86;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)V")
    public final void method66(byte arg0) {
        ++field780;
        class100.method744(-121);
        if (arg0 < 111) {
            this.field774 = 59;
        }
    }

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "(B)V")
    public static void method388(byte arg0) {
        if (arg0 != 24) {
            method383(-30, (class320) null);
        }
        field781 = null;
    }
}
