import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class182 extends class259 {

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    private int field3350;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Lsg;")
    public static class30 field3344 = class167.method1221((byte) 33, ")4j");

    @OriginalMember(owner = "client!li", name = "T", descriptor = "Lsg;")
    public static class30 field3345 = class167.method1221((byte) 33, "Fallen lassen");

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "[I")
    public static int[] field3352;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field3351;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (arg1) {
            field3344 = null;
        }
        if (super.field4581.field4729) {
            class26.method234(var3, 0, class223.field3999, this.field3350);
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 == -1586849108) {
            if (arg0 == 0) {
                this.field3350 = (arg2.method63((byte) 106) << 12) / 255;
            }
            ++field3348;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1313(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = -arg1 + arg0;
        ++field3346;
        int var7 = arg5 - arg3;
        if (var7 != 0) {
            if (~var6 == -1) {
                class108.method859(arg3, false, arg1, arg5, arg2);
            } else {
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var6 < 0) {
                    var6 = -var6;
                }
                boolean var8 = ~var6 < ~var7;
                if (var8) {
                    int var9 = arg3;
                    arg3 = arg1;
                    int var10 = arg5;
                    arg1 = var9;
                    arg5 = arg0;
                    arg0 = var10;
                }
                if (~arg3 < ~arg5) {
                    int var11 = arg3;
                    arg3 = arg5;
                    arg5 = var11;
                    int var12 = arg1;
                    arg1 = arg0;
                    arg0 = var12;
                }
                int var13 = arg1;
                int var14 = -arg3 + arg5;
                if (!arg4) {
                    method1313(83, -45, 24, -78, false, -42);
                }
                int var15 = -(var14 >> 1);
                int var16 = arg1 < arg0 ? 1 : -1;
                int var17 = arg0 - arg1;
                if (var17 < 0) {
                    var17 = -var17;
                }
                if (var8) {
                    for (int var18 = arg3; arg5 >= var18; ++var18) {
                        class121.field2390[var18][var13] = arg2;
                        var15 += var17;
                        if (~var15 < -1) {
                            var13 += var16;
                            var15 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg3; ~arg5 <= ~var19; ++var19) {
                        var15 += var17;
                        class121.field2390[var13][var19] = arg2;
                        if (~var15 < -1) {
                            var15 -= var14;
                            var13 += var16;
                        }
                    }
                }
            }
        } else {
            if (~var6 != -1) {
                class70.method654(arg1, arg2, arg0, -12586, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I")
    public static int method1314(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class182() {
        this(4096);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(JI)V")
    public static final void method1315(long arg0, int arg1) {
        class196.field3553.field146 = 0;
        class196.field3553.method76(5305, 92);
        class196.field3553.method72(-1033389592, arg0);
        class190.field3456 = 0;
        class119.field2322 = 1;
        class254.field4493 = 0;
        ++field3349;
        if (arg1 != 22833) {
            field3344 = null;
        }
        class227.field4065 = -3;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
    private class182(int arg0) {
        super(0, true);
        this.field3350 = 4096;
        this.field3350 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "i", descriptor = "(I)V")
    public static void method1316(int arg0) {
        field3344 = null;
        field3345 = null;
        field3352 = null;
        if (arg0 != -1182882740) {
            method1316(-124);
        }
    }
}
