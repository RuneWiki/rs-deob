import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class280 {

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public int field4796;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[S")
    public short[] field4792;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[I")
    public int[] field4798;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[Lok;")
    public class146[] field4805;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[B")
    public byte[] field4794;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[S")
    public short[] field4793;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static volatile int field4791 = 0;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lok;")
    public static class146 field4800 = class235.method1724(-12908, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lhd;")
    public static class117 field4797 = new class117(50);

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lok;")
    public static class146 field4803 = class235.method1724(-12908, "floorshadows");

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lhd;")
    public static class117 field4809 = new class117(260);

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Lok;")
    private static class146 field4811 = class235.method1724(-12908, "Discard");

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lok;")
    public static class146 field4812 = field4811;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Loh;")
    public static class15 field4807;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Loh;")
    public static class15 field4810;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lr;")
    public static class264 field4804;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)Z", line = 14)
    public final boolean method2029(int arg0, boolean arg1) {
        field4806++;
        if (!arg1) {
            this.field4792 = (short[]) null;
        }
        return (this.field4794[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)I", line = 27)
    public final int method2030(int arg0, byte arg1) {
        field4795++;
        return arg1 == -104 ? this.field4794[arg0] & 0x3 : -53;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lhe;ZILoh;Loh;)V", line = 39)
    public static final void method2031(class90 arg0, boolean arg1, int arg2, class15 arg3, class15 arg4) {
        class101.field1626 = arg1;
        field4808++;
        class301.field5123 = arg3;
        class144.field2416 = arg4;
        int var5 = arg2 + class301.field5123.method109(arg2 - 11128);
        class79.field1267 = var5 * 256 + class301.field5123.method95(arg2 ^ 0xFFFFFFBF, var5);
        class31.field585 = new class146[] { null, null, null, null, class167.field2819 };
        class15.field314 = new class146[] { null, null, class249.field4173, null, null };
        class168.field2840 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII)V", line = 60)
    public static final void method2032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4801++;
        int var6 = arg2;
        int var7 = 106 / ((-arg1 - 2) / 60);
        while (var6 <= arg2 + arg3) {
            for (int var8 = arg4; var8 <= (arg4 + arg5); var8++) {
                if (var8 >= 0 && var8 < 104 && var6 >= 0 && var6 < 104) {
                    class164.field2777[arg0][var8][var6] = 127;
                }
            }
            var6++;
        }
        for (int var9 = arg2; var9 < arg2 + arg3; var9++) {
            for (int var10 = arg4; var10 < (arg4 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104 && var9 >= 0 && var9 < 104) {
                    class174.field2914[arg0][var10][var9] = arg0 <= 0 ? 0 : class174.field2914[arg0 - 1][var10][var9];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var11 = arg2 + 1; var11 < arg2 + arg3; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class174.field2914[arg0][arg4][var11] = class174.field2914[arg0][arg4 - 1][var11];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var12 = arg4 + 1; var12 < (arg4 + arg5); var12++) {
                if (var12 >= 0 && var12 < 104) {
                    class174.field2914[arg0][var12][arg2] = class174.field2914[arg0][var12][arg2 - 1];
                }
            }
        }
        if (arg4 < 0 || arg2 < 0 || arg4 >= 104 || arg2 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 > 0 && class174.field2914[arg0][arg4 - 1][arg2] != 0) {
                class174.field2914[arg0][arg4][arg2] = class174.field2914[arg0][arg4 - 1][arg2];
            } else if (arg2 > 0 && class174.field2914[arg0][arg4][arg2 - 1] != 0) {
                class174.field2914[arg0][arg4][arg2] = class174.field2914[arg0][arg4][arg2 - 1];
            } else if (arg4 > 0 && arg2 > 0 && class174.field2914[arg0][arg4 - 1][arg2 - 1] != 0) {
                class174.field2914[arg0][arg4][arg2] = class174.field2914[arg0][arg4 - 1][arg2 - 1];
            }
        } else if (arg4 > 0 && class174.field2914[arg0 - 1][arg4 - 1][arg2] != class174.field2914[arg0][arg4 - 1][arg2]) {
            class174.field2914[arg0][arg4][arg2] = class174.field2914[arg0][arg4 - 1][arg2];
        } else if (arg2 > 0 && class174.field2914[arg0][arg4][arg2 - 1] != class174.field2914[arg0 - 1][arg4][arg2 - 1]) {
            class174.field2914[arg0][arg4][arg2] = class174.field2914[arg0][arg4][arg2 - 1];
        } else if (arg4 > 0 && arg2 > 0 && class174.field2914[arg0][arg4 - 1][arg2 - 1] != class174.field2914[arg0 - 1][arg4 - 1][arg2 - 1]) {
            class174.field2914[arg0][arg4][arg2] = class174.field2914[arg0][arg4 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Lj;", line = 178)
    public static final class278 method2033(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        return var3 == null ? null : var3.field212;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z", line = 188)
    public final boolean method2034(int arg0, int arg1) {
        field4802++;
        if (arg0 < 36) {
            this.method2030(-1, (byte) -77);
        }
        return (this.field4794[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 202)
    public static void method2035(int arg0) {
        field4797 = null;
        field4809 = null;
        field4811 = null;
        field4803 = null;
        field4812 = null;
        field4810 = null;
        if (arg0 != 0) {
            method2031((class90) null, true, 25, (class15) null, (class15) null);
        }
        field4807 = null;
        field4800 = null;
        field4804 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I)V", line = 225)
    public class280(int arg0) {
        this.field4796 = arg0;
        this.field4792 = new short[this.field4796];
        this.field4798 = new int[this.field4796];
        this.field4805 = new class146[this.field4796];
        this.field4794 = new byte[this.field4796];
        this.field4793 = new short[this.field4796];
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)Z", line = 241)
    public final boolean method2036(int arg0, int arg1) {
        if (arg1 != 8) {
            this.method2030(24, (byte) 22);
        }
        field4799++;
        return (this.field4794[arg0] & 0x8) != 0;
    }
}
