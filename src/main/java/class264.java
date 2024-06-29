import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class264 extends class276 {

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public static int field4293 = 0;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field4288 = 0;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "Lrc;")
    public static class9 field4291 = new class9(50);

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        ++field4287;
        int[][] var3 = super.field4418.method835((byte) 120, arg0);
        if (super.field4418.field2164) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class53.field929; ++var7) {
                this.method1748(var7, (byte) -88, arg0);
                int[][] var8 = this.method1810((byte) 17, class156.field2609, 0);
                var4[var7] = var8[0][class210.field3550];
                var5[var7] = var8[1][class210.field3550];
                var6[var7] = var8[2][class210.field3550];
            }
        }
        if (arg1 != -1) {
            field4290 = -6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class264() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V")
    public static void method1746(byte arg0) {
        if (arg0 == -1) {
            field4291 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(B)V")
    public static final void method1747(byte arg0) {
        ++field4292;
        if (class4.field59) {
            class67.field1116 = null;
            class4.field59 = false;
            int var1 = -62 % ((52 - arg0) / 43);
            class178.field2933 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            for (int var4 = 0; ~var4 > ~class53.field929; ++var4) {
                this.method1748(var4, (byte) -75, arg1);
                int[] var5 = this.method1805(false, 0, class156.field2609);
                var3[var4] = var5[class210.field3550];
            }
        }
        ++field4289;
        return arg0 < 39 ? null : var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)V")
    private final void method1748(int arg0, byte arg1, int arg2) {
        ++field4296;
        int var4 = class175.field2883[arg0];
        int var5 = class206.field3389[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class210.field3550 = arg0;
            class156.field2609 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class210.field3550 = arg2;
            class156.field2609 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class210.field3550 = -arg2 + class53.field929;
            class156.field2609 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class210.field3550 = arg0;
            class156.field2609 = class209.field3540 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class156.field2609 = -arg2 + class209.field3540;
            class210.field3550 = -arg0 + class53.field929;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class156.field2609 = -arg0 + class209.field3540;
            class210.field3550 = -arg2 + class53.field929;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class156.field2609 = -arg0 + class209.field3540;
            class210.field3550 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class156.field2609 = arg2;
            class210.field3550 = -arg0 + class53.field929;
        }
        if (arg1 >= -35) {
            method1749(-57, -96L);
        }
        class210.field3550 &= class35.field504;
        class156.field2609 &= class125.field2189;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1749(int arg0, long arg1) {
        if (arg0 != 26977) {
            field4293 = 44;
        }
        ++field4295;
        return class21.method145(arg1, arg0 ^ 6016);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIB)V")
    public static final void method1750(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field4286;
        int var5 = -8 % ((38 - arg4) / 32);
        for (int var6 = 0; ~class140.field2406 < ~var6; ++var6) {
            if (arg2 < class23.field364[var6] + class223.field3754[var6] && ~class23.field364[var6] > ~(arg1 + arg2) && arg3 < class88.field1575[var6] + class176.field2884[var6] && ~(arg0 + arg3) < ~class88.field1575[var6]) {
                class23.field367[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 == -1) {
            super.field4408 = arg1.method669((byte) 36) == 1;
        }
        if (arg2 != -1) {
            field4293 = -101;
        }
        ++field4294;
    }
}
