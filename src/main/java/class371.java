import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class371 {

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    private int field5597 = 0;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[Lfi;")
    public class35[] field5581;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field5595;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field5585 = 0;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Les;")
    public static class441 field5587 = new class441("WTWIP", 3);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "J")
    private long field5584;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lfi;")
    private class35 field5580;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lfi;")
    private class35 field5598;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Lfi;", line = 3)
    public final class35 method2296(byte arg0) {
        if (arg0 == 39) {
            this.field5597 = 0;
            field5586++;
            return this.method2297(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lfi;", line = 15)
    public final class35 method2297(boolean arg0) {
        field5583++;
        if (this.field5597 > 0 && this.field5581[this.field5597 - 1] != this.field5598) {
            class35 var2 = this.field5598;
            this.field5598 = var2.field434;
            return var2;
        }
        while (this.field5595 > this.field5597) {
            class35 var3 = this.field5581[this.field5597++].field434;
            if (this.field5581[this.field5597 - 1] != var3) {
                this.field5598 = var3.field434;
                return var3;
            }
        }
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V", line = 46)
    public static void method2298(boolean arg0) {
        if (arg0) {
            field5585 = -50;
        }
        field5587 = null;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 59)
    public final void method2299(byte arg0) {
        if (arg0 > -10) {
            this.method2299((byte) 41);
        }
        for (int var2 = 0; var2 < this.field5595; var2++) {
            class35 var3 = this.field5581[var2];
            while (true) {
                class35 var4 = var3.field434;
                if (var3 == var4) {
                    break;
                }
                var4.method283(2);
            }
        }
        field5589++;
        this.field5598 = null;
        this.field5580 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I", line = 96)
    public final int method2300(int arg0) {
        field5596++;
        if (arg0 > -92) {
            this.field5584 = 30L;
        }
        return this.field5595;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Lt;", line = 108)
    public static final class367 method2301(int arg0, int arg1, int arg2) {
        class337 var3 = class170.field2427[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class367 var4 = var3.field5055;
            var3.field5055 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)I", line = 120)
    public final int method2302(boolean arg0) {
        field5582++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5595; var3++) {
            class35 var4 = this.field5581[var3];
            for (class35 var5 = var4.field434; var5 != var4; var5 = var5.field434) {
                var2++;
            }
        }
        if (arg0) {
            return 28;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V", line = 163)
    public static final void method2303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5593++;
        int var6 = arg0;
        int var7 = arg3;
        int var8 = arg1 * arg1;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg0 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (arg0 + 1) * var16;
        if (class176.field2503 <= arg5 && arg5 <= class296.field4443) {
            int var20 = class352.method2172(arg1 + arg4, class119.field1643, class293.field4420, 0);
            int var21 = class352.method2172(arg4 - arg1, class119.field1643, class293.field4420, 0);
            class345.method2125(false, class49.field723[arg5], var21, var20, arg2);
        }
        int var22 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            var7--;
            var22 -= var15;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (class176.field2503 <= var24 && class296.field4443 >= var23) {
                int var25 = class352.method2172(arg4 + var6, class119.field1643, class293.field4420, 0);
                int var26 = class352.method2172(arg4 - var6, class119.field1643, class293.field4420, 0);
                if (var23 >= class176.field2503) {
                    class345.method2125(false, class49.field723[var23], var26, var25, arg2);
                }
                if (class296.field4443 >= var24) {
                    class345.method2125(false, class49.field723[var24], var26, var25, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Lfi;)I", line = 262)
    public final int method2304(int arg0, class35[] arg1) {
        field5592++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5595; var4++) {
            class35 var6 = this.field5581[var4];
            for (class35 var7 = var6.field434; var7 != var6; var7 = var7.field434) {
                arg1[var3++] = var7;
            }
        }
        int var5 = 47 / ((-arg0 - 62) / 35);
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(JB)Lfi;", line = 295)
    public final class35 method2305(long arg0, byte arg1) {
        if (arg1 <= 10) {
            this.method2296((byte) 88);
        }
        field5590++;
        this.field5584 = arg0;
        class35 var4 = this.field5581[(int) ((long) (this.field5595 - 1) & arg0)];
        for (this.field5580 = var4.field434; this.field5580 != var4; this.field5580 = this.field5580.field434) {
            if (this.field5580.field436 == arg0) {
                class35 var5 = this.field5580;
                this.field5580 = this.field5580.field434;
                return var5;
            }
        }
        this.field5580 = null;
        return null;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)Lfi;", line = 326)
    public final class35 method2306(byte arg0) {
        field5591++;
        if (this.field5580 == null) {
            return null;
        }
        if (arg0 != 21) {
            this.field5580 = null;
        }
        class35 var2 = this.field5581[(int) (this.field5584 & (long) (this.field5595 - 1))];
        while (this.field5580 != var2) {
            if (this.field5580.field436 == this.field5584) {
                class35 var3 = this.field5580;
                this.field5580 = this.field5580.field434;
                return var3;
            }
            this.field5580 = this.field5580.field434;
        }
        this.field5580 = null;
        return null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(JLfi;B)V", line = 358)
    public final void method2307(long arg0, class35 arg1, byte arg2) {
        field5588++;
        if (arg1.field435 != null) {
            arg1.method283(2);
        }
        class35 var5 = this.field5581[(int) (arg0 & (long) (this.field5595 - 1))];
        int var6 = 2 % ((arg2 - 55) / 61);
        arg1.field434 = var5;
        arg1.field435 = var5.field435;
        arg1.field435.field434 = arg1;
        arg1.field436 = arg0;
        arg1.field434.field435 = arg1;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V", line = 377)
    public class371(int arg0) {
        this.field5581 = new class35[arg0];
        this.field5595 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class35 var3 = this.field5581[var2] = new class35();
            var3.field435 = var3;
            var3.field434 = var3;
        }
    }
}
