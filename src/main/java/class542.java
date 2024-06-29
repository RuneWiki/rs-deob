import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class542 extends class545 {

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Z")
    private boolean field7866 = false;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "Z")
    private boolean field7859;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "[Lau;")
    private class245[] field7867;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Lvs;")
    public static class518 field7861;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "Lffa;")
    public static class676 field7868;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "[Z")
    public static boolean[] field7863;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZZ)V", line = 4)
    public final void method454(boolean arg0, boolean arg1) {
        super.field7920.method386((byte) 24, class567.field8198, class281.field3934);
        if (arg1) {
            field7863 = null;
        }
        ++field7860;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V", line = 16)
    public final void method451(int arg0, int arg1, int arg2) {
        ++field7862;
        if (this.field7866) {
            super.field7920.method208(8, 1);
            super.field7920.method264(this.field7867[arg2 + -1], arg0 + -2);
            super.field7920.method208(8, 0);
        }
        if (arg0 != 0) {
            this.field7866 = false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Z", line = 39)
    public final boolean method459(int arg0) {
        ++field7869;
        if (arg0 < 63) {
            this.method452(61);
        }
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "(I)V", line = 55)
    public static void method3257(int arg0) {
        field7863 = null;
        field7861 = null;
        if (arg0 != -18024) {
            method3257(48);
        }
        field7868 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BZ)V", line = 68)
    public final void method457(byte arg0, boolean arg1) {
        if (this.field7867 != null && arg1) {
            super.field7920.method208(8, 1);
            super.field7920.method284((byte) 32, class396.field5674);
            class417 var3 = super.field7920.method381((byte) 42);
            var3.method842(1024);
            super.field7920.method238(117, class476.field6775);
            if (this.field7859) {
                super.field7920.method386((byte) -127, class567.field8198, class684.field9720);
                super.field7920.method282(false, true, (byte) -60, 0, class234.field3509);
                super.field7920.method242((byte) -127, class272.field3857, 0);
            } else {
                super.field7920.method386((byte) 15, class281.field3934, class567.field8198);
                super.field7920.method230(class401.field5746, 0, 47);
                super.field7920.method208(8, 2);
                super.field7920.method386((byte) 110, class567.field8198, class684.field9720);
                super.field7920.method230(class401.field5746, 0, 21);
                super.field7920.method282(false, true, (byte) -60, 1, class401.field5746);
                super.field7920.method242((byte) -120, class272.field3857, 0);
                super.field7920.method264(super.field7920.field547, -2);
            }
            super.field7920.method208(8, 0);
            this.field7866 = true;
        } else {
            super.field7920.method242((byte) -122, class272.field3857, 0);
        }
        if (arg0 > 101) {
            ++field7865;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILec;)V", line = 110)
    public final void method455(int arg0, int arg1, class101 arg2) {
        super.field7920.method264(arg2, -2);
        ++field7870;
        if (arg0 != 2) {
            this.field7859 = false;
        }
        super.field7920.method411(17024, arg1);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 123)
    public final void method452(int arg0) {
        if (this.field7866) {
            super.field7920.method208(8, 1);
            super.field7920.method264((class101) null, -2);
            super.field7920.method284((byte) 92, class76.field1104);
            super.field7920.method389((byte) -2);
            if (!this.field7859) {
                super.field7920.method386((byte) 44, class281.field3934, class281.field3934);
                super.field7920.method230(class234.field3509, 0, 19);
                super.field7920.method208(8, 2);
                super.field7920.method386((byte) 66, class281.field3934, class281.field3934);
                super.field7920.method230(class234.field3509, 0, 126);
                super.field7920.method230(class401.field5746, 1, arg0 + 25);
                super.field7920.method242((byte) -116, class234.field3509, 0);
                super.field7920.method264((class101) null, -2);
            } else {
                super.field7920.method386((byte) 127, class281.field3934, class281.field3934);
                super.field7920.method230(class234.field3509, 0, 65);
                super.field7920.method242((byte) -122, class234.field3509, 0);
            }
            super.field7920.method208(8, 0);
            this.field7866 = false;
        } else {
            super.field7920.method242((byte) -113, class234.field3509, 0);
        }
        if (arg0 != 2) {
            this.field7866 = true;
        }
        ++field7864;
        super.field7920.method386((byte) 105, class281.field3934, class281.field3934);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lch;)V", line = 166)
    public class542(class38 arg0) {
        super(arg0);
        if (arg0.field615) {
            this.field7859 = arg0.field619 < 3;
            int var2 = !this.field7859 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (~var14 == -2) {
                            var15 = var12;
                        } else if (~var14 == -3) {
                            var15 = var13;
                        } else if (var14 == 3) {
                            var15 = -var13;
                        } else if (var14 == 4) {
                            var15 = var11;
                        } else {
                            var15 = -var11;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field7867 = new class245[3];
            this.field7867[0] = super.field7920.method225((byte) 3, 64, var4, false);
            this.field7867[1] = super.field7920.method225((byte) 3, 64, var5, false);
            this.field7867[2] = super.field7920.method225((byte) 3, 64, var3, false);
        }
    }
}
