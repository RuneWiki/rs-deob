import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class121 extends class1 {

    @OriginalMember(owner = "client!lc", name = "lb", descriptor = "[I")
    public static int[] field2174 = new int[4000];

    @OriginalMember(owner = "client!lc", name = "pb", descriptor = "I")
    public static int field2178 = 0;

    @OriginalMember(owner = "client!lc", name = "nb", descriptor = "[I")
    public static int[] field2176 = new int[100];

    @OriginalMember(owner = "client!lc", name = "jb", descriptor = "Luc;")
    public static class211 field2172 = new class211(64);

    @OriginalMember(owner = "client!lc", name = "rb", descriptor = "Loc;")
    private static class151 field2180 = class137.method873(2, "Loaded fonts");

    @OriginalMember(owner = "client!lc", name = "qb", descriptor = "[I")
    public static int[] field2179 = new int[32];

    @OriginalMember(owner = "client!lc", name = "sb", descriptor = "Loc;")
    public static class151 field2181 = field2180;

    @OriginalMember(owner = "client!lc", name = "tb", descriptor = "Loc;")
    public static class151 field2182 = class137.method873(2, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!lc", name = "hb", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!lc", name = "ib", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!lc", name = "kb", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!lc", name = "mb", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!lc", name = "ob", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!lc", name = "ub", descriptor = "Luf;")
    public static class214 field2183;

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class121() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg0 != 0) {
            field2179 = null;
        }
        ++field2177;
        if (~arg1 == -1) {
            super.field27 = ~arg2.method1475(arg0 ^ 255) == -2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field13.method578(arg0, arg1 ^ 80);
        if (arg1 != -81) {
            field2172 = null;
        }
        ++field2169;
        if (super.field13.field1658) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class202.field3603; ++var7) {
                this.method736(var7, (byte) -127, arg0);
                int[][] var8 = this.method8(0, (byte) -106, class157.field2837);
                var4[var7] = var8[0][class139.field2542];
                var5[var7] = var8[1][class139.field2542];
                var6[var7] = var8[2][class139.field2542];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(B)V")
    public static void method733(byte arg0) {
        field2176 = null;
        field2181 = null;
        field2183 = null;
        field2179 = null;
        field2172 = null;
        field2180 = null;
        if (arg0 < -114) {
            field2174 = null;
            field2182 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2173;
        int var7 = class116.method704(class154.field2793, arg1, 27104, class233.field4281);
        if (arg5 == 2) {
            int var8 = class116.method704(class154.field2793, arg6, 27104, class233.field4281);
            int var9 = class116.method704(class25.field524, arg0, 27104, class79.field1526);
            int var10 = class116.method704(class25.field524, arg3, arg5 ^ 27106, class79.field1526);
            int var11 = class116.method704(class154.field2793, arg1 - -arg2, 27104, class233.field4281);
            int var12 = class116.method704(class154.field2793, -arg2 + arg6, 27104, class233.field4281);
            for (int var13 = var7; var13 < var11; ++var13) {
                class55.method380(arg4, 123, class43.field887[var13], var10, var9);
            }
            for (int var14 = var8; ~var14 < ~var12; --var14) {
                class55.method380(arg4, 108, class43.field887[var14], var10, var9);
            }
            int var15 = class116.method704(class25.field524, arg0 + arg2, 27104, class79.field1526);
            int var16 = class116.method704(class25.field524, -arg2 + arg3, 27104, class79.field1526);
            for (int var17 = var11; var17 <= var12; ++var17) {
                int[] var18 = class43.field887[var17];
                class55.method380(arg4, 105, var18, var15, var9);
                class55.method380(arg4, arg5 + 104, var18, var10, var16);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Object;Lda;I)V")
    public static final void method735(Object arg0, class35 arg1, int arg2) {
        ++field2171;
        if (arg2 != 31047) {
            field2176 = null;
        }
        if (arg1.field711 != null) {
            for (int var3 = 0; var3 < 50 && arg1.field711.peekEvent() != null; ++var3) {
                class156.method1027(0, 1L);
            }
            if (arg0 != null) {
                arg1.field711.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field2175;
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            for (int var4 = 0; var4 < class202.field3603; ++var4) {
                this.method736(var4, (byte) -121, arg1);
                int[] var5 = this.method4(class157.field2837, arg0 + -229, 0);
                var3[var4] = var5[class139.field2542];
            }
        }
        if (arg0 != 107) {
            field2179 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IBI)V")
    private final void method736(int arg0, byte arg1, int arg2) {
        int var4 = class195.field3477[arg0];
        ++field2170;
        int var5 = class23.field509[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if (arg1 > -117) {
            this.method13(-47, -126, (class229) null);
        }
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class157.field2837 = arg2;
            class139.field2542 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class157.field2837 = arg0;
            class139.field2542 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class139.field2542 = -arg2 + class202.field3603;
            class157.field2837 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class139.field2542 = arg0;
            class157.field2837 = -arg2 + class129.field2354;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class157.field2837 = -arg2 + class129.field2354;
            class139.field2542 = -arg0 + class202.field3603;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class139.field2542 = -arg2 + class202.field3603;
            class157.field2837 = class129.field2354 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class157.field2837 = -arg0 + class129.field2354;
            class139.field2542 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class157.field2837 = arg2;
            class139.field2542 = -arg0 + class202.field3603;
        }
        class139.field2542 &= class78.field1510;
        class157.field2837 &= class155.field2804;
    }
}
