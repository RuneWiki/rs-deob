import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class20 extends class87 {

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    private int field216 = 32768;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field214 = 0;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "Llc;")
    public static class270 field211;

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class20() {
        super(3, false);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        ++field222;
        class272.method1897(83);
        if (arg0 != 0) {
            this.field216 = 17;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZIZIZ)Llc;")
    public static final class270 method137(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg1 != 1000000) {
            field214 = -116;
        }
        ++field217;
        class224 var5 = null;
        if (class26.field289 != null) {
            var5 = new class224(arg3, class26.field289, class120.field1949[arg3], 1000000);
        }
        class228.field3355[arg3] = class304.field4927.method151(arg3, class17.field184, class224.method1553(arg1, 1002918), var5);
        if (arg0) {
            class228.field3355[arg3].method2039((byte) -103);
        }
        return new class270(class228.field3355[arg3], arg2, arg4);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)I")
    public static final int method138(int arg0, int arg1) {
        if (arg0 != 4274) {
            field220 = -51;
        }
        ++field218;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static void method139(boolean arg0) {
        field211 = null;
        if (!arg0) {
            field214 = -46;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field1381 = ~arg0.method366(-16505) == -2;
            }
        } else {
            this.field216 = arg0.method331(-17) << 4;
        }
        if (arg2 != 25645) {
            field220 = -40;
        }
        ++field213;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method140(boolean arg0, long arg1) {
        ++field223;
        return !arg0 ? null : class38.method240(arg1, true);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field212;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int[] var4 = this.method642(1, arg0, true);
            int[] var5 = this.method642(2, arg0, true);
            for (int var6 = 0; ~class206.field3032 < ~var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field216 >> 12;
                int var9 = class39.field515[var7] * var8 >> 12;
                int var10 = class256.field3870[var7] * var8 >> 12;
                int var11 = class181.field2722 & (var10 >> 12) + var6;
                int var12 = class32.field406 & arg0 - -(var9 >> 12);
                int[] var13 = this.method642(0, var12, true);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
    public static final void method141(boolean arg0) {
        if (arg0) {
            class223.field3286 = class276.field4472;
            class103.field1792 = class277.field4486;
        } else {
            class223.field3286 = class53.field790;
            class103.field1792 = class297.field4763;
        }
        class188.field2799 = class223.field3286.length;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method142(int arg0, boolean arg1, byte[] arg2) {
        ++field219;
        int var3 = 123 % ((arg0 - -21) / 46);
        if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class212.field3123) {
                try {
                    class210 var4 = (class210) Class.forName("ga").newInstance();
                    var4.method1181(arg2, false);
                    return var4;
                } catch (Throwable var5) {
                    class212.field3123 = true;
                }
            }
            return !arg1 ? arg2 : class245.method1687(11301, arg2);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        if (arg1 != 6) {
            return null;
        } else {
            ++field221;
            int[][] var3 = super.field1390.method1902(-116, arg0);
            if (super.field1390.field4428) {
                int[] var4 = this.method642(1, arg0, true);
                int[] var5 = this.method642(2, arg0, true);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; ~var9 > ~class206.field3032; ++var9) {
                    int var10 = (1046045 & var4[var9] * 255) >> 12;
                    int var11 = var5[var9] * this.field216 >> 12;
                    int var12 = class39.field515[var10] * var11 >> 12;
                    int var13 = (var12 >> 12) + arg0 & class32.field406;
                    int var14 = class256.field3870[var10] * var11 >> 12;
                    int var15 = (var14 >> 12) + var9 & class181.field2722;
                    int[][] var16 = this.method648(var13, arg1 + 13, 0);
                    var6[var9] = var16[0][var15];
                    var7[var9] = var16[1][var15];
                    var8[var9] = var16[2][var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([[II)V")
    public static final void method144(int[][] arg0, int arg1) {
        class104.field1795 = arg0;
        ++field215;
        if (arg1 != 255) {
            field214 = -58;
        }
    }
}
