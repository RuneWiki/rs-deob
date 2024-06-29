import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class213 {

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "Lqu;")
    public static class364 field3123 = new class364(48, 3);

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field3131 = 0;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "[S")
    public static short[] field3132 = new short[256];

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "[[I")
    public static int[][] field3133 = new int[6][];

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "Lpn;")
    public static class68 field3130 = new class68();

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "F")
    public static float field3134;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    private int field3124;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI[S)[S", line = 5)
    public static final short[] method1375(byte arg0, int arg1, short[] arg2) {
        field3125++;
        int var3 = -32 % ((arg0 + 41) / 35);
        short[] var4 = new short[arg1];
        class473.method2879(arg2, 0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBII)Z", line = 18)
    public final boolean method1376(int arg0, byte arg1, int arg2, int arg3) {
        field3127++;
        int var5 = this.field3124;
        if (this.field3126 == arg2 && this.field3124 == 0) {
            return false;
        }
        boolean var6;
        if (this.field3124 == 0) {
            if (this.field3126 < arg2 && this.field3126 + arg3 >= arg2 || this.field3126 > arg2 && (this.field3126 - arg3) <= arg2) {
                this.field3126 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field3124 > 0 && this.field3126 < arg2) {
            int var7 = this.field3124 * this.field3124 / (arg3 * 2);
            int var8 = this.field3126 + var7;
            if (arg2 > var8 && this.field3126 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field3124 < 0 && arg2 < this.field3126) {
            int var9 = this.field3124 * this.field3124 / (arg3 * 2);
            int var10 = this.field3126 - var9;
            if (arg2 < var10 && var10 <= this.field3126) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (arg1 != -100) {
            return true;
        }
        if (var6) {
            if (this.field3126 < arg2) {
                this.field3124 += arg3;
                if (arg0 != 0 && this.field3124 > arg0) {
                    this.field3124 = arg0;
                }
            } else {
                this.field3124 -= arg3;
                if (arg0 != 0 && (-arg0) > this.field3124) {
                    this.field3124 = -arg0;
                }
            }
            if (this.field3124 != var5) {
                int var11 = this.field3124 * this.field3124 / (arg3 * 2);
                if (arg2 <= this.field3126) {
                    if (arg2 < this.field3126 && this.field3126 - var11 < arg2) {
                        this.field3124 = var5;
                    }
                } else if (arg2 < this.field3126 + var11) {
                    this.field3124 = var5;
                }
            }
        } else if (this.field3124 <= 0) {
            this.field3124 += arg3;
            if (this.field3124 > 0) {
                this.field3124 = 0;
            }
        } else {
            this.field3124 -= arg3;
            if (this.field3124 < 0) {
                this.field3124 = 0;
            }
        }
        this.field3126 += this.field3124 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)V", line = 156)
    public final void method1377(int arg0, int arg1) {
        this.field3126 = arg1;
        field3128++;
        this.field3124 = arg0;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I", line = 168)
    public final int method1378(int arg0) {
        field3129++;
        return arg0 >= -87 ? -82 : this.field3126 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V", line = 180)
    public final void method1379(boolean arg0) {
        this.field3126 &= 0x3FFF;
        field3122++;
        if (!arg0) {
            this.method1378(-113);
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)V", line = 194)
    public static void method1380(boolean arg0) {
        field3132 = null;
        field3130 = null;
        if (!arg0) {
            method1380(false);
        }
        field3123 = null;
        field3133 = null;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)I", line = 214)
    public static final int method1381(int arg0, int arg1) {
        if (arg0 == 255) {
            field3121++;
            return arg1 & 0xFF;
        } else {
            return 14;
        }
    }
}
