import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class508 extends class92 {

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
    private int field7391;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    private int field7383;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "I")
    private int field7392;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    private int field7384;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
    private int field7381;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "Lpj;")
    private class38 field7389;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    private int field7387;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "Ltg;")
    public static class605 field7388 = new class605();

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "Lqn;")
    private class295 field7382;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "Ltg;")
    public static class605 field7390;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V")
    public static void method3060(int arg0) {
        if (arg0 == 18652) {
            field7390 = null;
            field7388 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static final void method3061(byte arg0) {
        int var1 = -50 / ((arg0 - 23) / 60);
        field7379++;
        class118 var2 = class86.method755(true, 15, 0);
        var2.method936(0);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII[BI)Z")
    public static final boolean method3062(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field7385++;
        boolean var6 = true;
        if (arg0 > -8) {
            return false;
        }
        class301 var7 = new class301(arg4);
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method1941(32767);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method1968((byte) 109);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFE2) >> 6;
                    int var16 = var7.method1987(-31) >> 2;
                    int var17 = arg2 + var15;
                    int var18 = arg5 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < arg3 - 1 && arg1 - 1 > var18) {
                        class595 var19 = class576.field8167.method3074(0, var8);
                        if (var16 != 22 || class654.field9289.field5433.method4141(3) != 0 || var19.field8426 != 0 || var19.field8368 == 1 || var19.field8375) {
                            var11 = true;
                            if (!var19.method3418((byte) 80)) {
                                var6 = false;
                                class348.field5128++;
                            }
                        }
                    }
                }
                int var12 = var7.method1968((byte) 53);
                if (var12 == 0) {
                    break;
                }
                var7.method1987(-45);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Lqn;")
    public final class295 method773(int arg0) {
        field7380++;
        if (arg0 != 2835) {
            this.field7387 = -43;
        }
        if (this.field7382 == null) {
            class228.field3651[0] = this.field7387;
            class267 var2 = this.field7389.field7764;
            class228.field3651[2] = this.field7381;
            class228.field3651[3] = this.field7392;
            class228.field3651[5] = this.field7391;
            class228.field3651[1] = this.field7384;
            class228.field3651[4] = this.field7383;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1772(-5919, class228.field3651[var5])) {
                    return null;
                }
                class569 var7 = var2.method1774(arg0 - 2759, class228.field3651[var5]);
                int var8 = var7.field8067 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field8061 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class544.field7773[var6] = var2.method1771(1.0F, var4, class228.field3651[var6], var4, (byte) 70, false);
            }
            this.field7382 = this.field7389.method363(class544.field7773, (byte) -108, var4, var3);
        }
        return this.field7382;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
    public static final void method3063(byte arg0) {
        if (class521.field7529 == 3) {
            class658.method3704(-5697, 4);
        } else if (class521.field7529 == 7) {
            class658.method3704(-5697, 8);
        } else if (class521.field7529 == 10) {
            class658.method3704(-5697, 11);
        }
        if (arg0 > -94) {
            field7388 = null;
        }
        field7386++;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lpj;IIIIII)V")
    public class508(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7391 = arg6;
        this.field7383 = arg5;
        this.field7392 = arg4;
        this.field7384 = arg2;
        this.field7381 = arg3;
        this.field7389 = arg0;
        this.field7387 = arg1;
    }
}
