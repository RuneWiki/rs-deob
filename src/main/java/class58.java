import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class58 {

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "Lpi;")
    public static class340 field776 = new class340(54, 8);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIBI[FIIIFI)V", line = 7)
    public static final void method331(int arg0, int arg1, byte arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, float arg8, int arg9) {
        int var10 = arg0 - arg9;
        field771++;
        int var11 = arg7 - arg6;
        int var12 = arg1 - arg5;
        float var13 = arg4[2] * (float) var10 + arg4[1] * (float) var11 + arg4[0] * (float) var12;
        float var14 = arg4[5] * (float) var10 + arg4[3] * (float) var12 + arg4[4] * (float) var11;
        int var15 = -49 % ((arg2 + 48) / 44);
        float var16 = arg4[8] * (float) var10 + arg4[6] * (float) var12 + arg4[7] * (float) var11;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var13 * var13 + var14 * var14));
        float var18 = (float) Math.atan2((double) var13, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var14 / var17)) / 3.1415927F + arg8 + 0.5F;
        if (arg3 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg3 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg3 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        class344.field4381 = var18;
        class415.field5531 = var19;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 58)
    public static void method332(int arg0) {
        field776 = null;
        if (arg0 != -2) {
            method331(32, 15, (byte) -125, 38, null, 54, -63, -58, -0.46781465F, 53);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)V", line = 70)
    public final void method333(byte arg0, int arg1) {
        this.field775 = arg1;
        field772++;
        this.field778 = 0;
        int var3 = 45 % ((arg0 + 45) / 58);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V", line = 83)
    public final void method334(int arg0) {
        this.field775 &= 0x3FFF;
        if (arg0 < -108) {
            field777++;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIB)Z", line = 94)
    public final boolean method335(int arg0, int arg1, int arg2, byte arg3) {
        field773++;
        int var5 = this.field778;
        if (this.field775 == arg2 && this.field778 == 0) {
            return false;
        }
        boolean var8;
        if (this.field778 == 0) {
            if (this.field775 < arg2 && arg2 <= this.field775 + arg1 || arg2 < this.field775 && this.field775 - arg1 <= arg2) {
                this.field775 = arg2;
                return false;
            }
            var8 = true;
        } else if (this.field778 > 0 && arg2 > this.field775) {
            int var6 = this.field778 * this.field778 / (arg1 * 2);
            int var7 = this.field775 + var6;
            if (arg2 > var7 && var7 >= this.field775) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field778 < 0 && this.field775 > arg2) {
            int var9 = this.field778 * this.field778 / (arg1 * 2);
            int var10 = this.field775 - var9;
            if (arg2 < var10 && this.field775 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg2 <= this.field775) {
                this.field778 -= arg1;
                if (arg0 != 0 && this.field778 < -arg0) {
                    this.field778 = -arg0;
                }
            } else {
                this.field778 += arg1;
                if (arg0 != 0 && this.field778 > arg0) {
                    this.field778 = arg0;
                }
            }
            if (this.field778 != var5) {
                int var11 = this.field778 * this.field778 / (arg1 * 2);
                if (this.field775 < arg2) {
                    if ((this.field775 + var11) > arg2) {
                        this.field778 = var5;
                    }
                } else if (arg2 < this.field775 && (this.field775 - var11) < arg2) {
                    this.field778 = var5;
                }
            }
        } else if (this.field778 <= 0) {
            this.field778 += arg1;
            if (this.field778 > 0) {
                this.field778 = 0;
            }
        } else {
            this.field778 -= arg1;
            if (this.field778 < 0) {
                this.field778 = 0;
            }
        }
        if (arg3 != -73) {
            method332(-41);
        }
        this.field775 += this.field778 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)I", line = 237)
    public final int method336(boolean arg0) {
        if (arg0) {
            return -119;
        } else {
            field774++;
            return this.field775 & 0x3FFF;
        }
    }
}
