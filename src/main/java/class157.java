import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class157 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "B")
    private byte field2732;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lmb;")
    public static class96 field2733 = class243.method1708("T", (byte) 127);

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lmb;")
    public static class96 field2734 = class243.method1708(":tradereq:", (byte) 121);

    @OriginalMember(owner = "client!q", name = "n", descriptor = "[Z")
    public static boolean[] field2744 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Lgd;")
    public static class123 field2739;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lo;")
    public static class12 field2731;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[I")
    public static int[] field2741;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
    public final int method1138(int arg0) {
        field2746++;
        if (arg0 != 7) {
            this.method1142(-23);
        }
        return this.field2732 & 0x7;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method1139(KeyEvent arg0, byte arg1) {
        if (arg1 >= -45) {
            return -89;
        }
        int var2 = arg0.getKeyChar();
        field2735++;
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILff;)[Lmj;")
    public static final class246[] method1140(int arg0, int arg1, int arg2, class3 arg3) {
        if (arg1 != 50) {
            method1141((class250) null, -108, 88, 123, 110, 123, -60, -123, true);
        }
        field2738++;
        return class224.method1530(arg0, arg2, (byte) 97, arg3) ? class39.method312((byte) -109) : null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lua;IIIIIIIZ)V")
    public static final void method1141(class250 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class211.field3646;
        int var11;
        int var12 = var11 = (arg7 << 7) - class21.field350;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class173.field3022[arg1][arg6][arg7] - class262.field4598;
        int var18 = class173.field3022[arg1][arg6 + 1][arg7] - class262.field4598;
        int var19 = class173.field3022[arg1][arg6 + 1][arg7 + 1] - class262.field4598;
        int var20 = class173.field3022[arg1][arg6][arg7 + 1] - class262.field4598;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class240.field4163;
        int var46 = (var24 << 9) / var25 + class240.field4164;
        int var47 = (var27 << 9) / var31 + class240.field4163;
        int var48 = (var30 << 9) / var31 + class240.field4164;
        int var49 = (var33 << 9) / var37 + class240.field4163;
        int var50 = (var36 << 9) / var37 + class240.field4164;
        int var51 = (var39 << 9) / var43 + class240.field4163;
        int var52 = (var42 << 9) / var43 + class240.field4164;
        class240.field4171 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class269.field4679 && class177.method1265(class265.field4626 + class240.field4163, class62.field1054 + class240.field4164, var50, var52, var48, var49, var51, var47)) {
                class5.field102 = arg6;
                class150.field2638 = arg7;
            }
            if (!arg8) {
                class240.field4173 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class240.field4172 || var51 > class240.field4172 || var47 > class240.field4172) {
                    class240.field4173 = true;
                }
                if (arg0.field4327 == -1) {
                    if (arg0.field4324 != 12345678) {
                        class240.method1680(var50, var52, var48, var49, var51, var47, arg0.field4324, arg0.field4322, arg0.field4332);
                    }
                } else if (!class94.field1550) {
                    int var53 = class240.field4167.method896(arg0.field4327, 0);
                    class240.method1680(var50, var52, var48, var49, var51, var47, class122.method938(var53, arg0.field4324), class122.method938(var53, arg0.field4322), class122.method938(var53, arg0.field4332));
                } else if (arg0.field4319) {
                    class240.method1694(var50, var52, var48, var49, var51, var47, arg0.field4324, arg0.field4322, arg0.field4332, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4327);
                } else {
                    class240.method1694(var50, var52, var48, var49, var51, var47, arg0.field4324, arg0.field4322, arg0.field4332, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4327);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class269.field4679 && class177.method1265(class265.field4626 + class240.field4163, class62.field1054 + class240.field4164, var46, var48, var52, var45, var47, var51)) {
            class5.field102 = arg6;
            class150.field2638 = arg7;
        }
        if (arg8) {
            return;
        }
        class240.field4173 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class240.field4172 || var47 > class240.field4172 || var51 > class240.field4172) {
            class240.field4173 = true;
        }
        if (arg0.field4327 != -1) {
            if (class94.field1550) {
                class240.method1694(var46, var48, var52, var45, var47, var51, arg0.field4333, arg0.field4332, arg0.field4322, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4327);
                return;
            }
            int var54 = class240.field4167.method896(arg0.field4327, 0);
            class240.method1680(var46, var48, var52, var45, var47, var51, class122.method938(var54, arg0.field4333), class122.method938(var54, arg0.field4332), class122.method938(var54, arg0.field4322));
        } else if (arg0.field4333 != 12345678) {
            class240.method1680(var46, var48, var52, var45, var47, var51, arg0.field4333, arg0.field4332, arg0.field4322);
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)I")
    public final int method1142(int arg0) {
        field2736++;
        if (arg0 >= -121) {
            field2744 = null;
        }
        return (this.field2732 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILmb;)Lmb;")
    public static final class96 method1143(int arg0, class96 arg1) {
        field2749++;
        int var2 = class244.method1715(arg1, true);
        if (arg0 != 16) {
            field2744 = null;
        }
        return var2 == -1 ? class62.field1061 : class227.field3870.field2028[var2].method684(11, class147.field2607, class96.field1612);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public static void method1144(int arg0) {
        field2731 = null;
        if (arg0 != -24878) {
            return;
        }
        field2744 = null;
        field2734 = null;
        field2741 = null;
        field2739 = null;
        field2733 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class157() {
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lrg;)V")
    public class157(class239 arg0) {
        this.field2732 = arg0.method1656(-60);
        this.field2737 = arg0.method1663((byte) -123);
        this.field2748 = arg0.method1617((byte) -43);
        this.field2747 = arg0.method1617((byte) -43);
        this.field2743 = arg0.method1617((byte) -43);
        this.field2742 = arg0.method1617((byte) -43);
    }
}
