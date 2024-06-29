import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class505 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "[I")
    public static int[] field6460 = new int[6];

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    private int field6467;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "[Lbha;")
    public static class318[] field6464;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method2796(int arg0) {
        field6460 = null;
        field6464 = null;
        if (arg0 != 16383) {
            field6460 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)I")
    public final int method2797(int arg0) {
        if (arg0 != 23908) {
            method2796(107);
        }
        field6468++;
        return this.field6462 & 0x3FFF;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
    public final void method2798(int arg0, int arg1) {
        this.field6462 = arg1;
        this.field6467 = arg0;
        field6463++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public final void method2799(byte arg0) {
        if (arg0 >= -56) {
            field6464 = null;
        }
        this.field6462 &= 0x3FFF;
        field6461++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)I")
    public static final int method2800(int arg0, boolean arg1) {
        if (arg1) {
            field6466++;
            return arg0 >>> 10;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIZI)Z")
    public final boolean method2801(int arg0, int arg1, boolean arg2, int arg3) {
        field6465++;
        int var5 = this.field6467;
        if (this.field6462 == arg1 && this.field6467 == 0) {
            return false;
        } else if (arg2) {
            return false;
        } else {
            boolean var8;
            if (this.field6467 == 0) {
                if (this.field6462 < arg1 && arg1 <= (this.field6462 + arg0) || this.field6462 > arg1 && arg1 >= (this.field6462 - arg0)) {
                    this.field6462 = arg1;
                    return false;
                }
                var8 = true;
            } else if (this.field6467 > 0 && arg1 > this.field6462) {
                int var6 = this.field6467 * this.field6467 / (arg0 * 2);
                int var7 = this.field6462 + var6;
                if (arg1 > var7 && var7 >= this.field6462) {
                    var8 = true;
                } else {
                    var8 = false;
                }
            } else if (this.field6467 < 0 && this.field6462 > arg1) {
                int var9 = this.field6467 * this.field6467 / (arg0 * 2);
                int var10 = this.field6462 - var9;
                if (var10 > arg1 && this.field6462 >= var10) {
                    var8 = true;
                } else {
                    var8 = false;
                }
            } else {
                var8 = false;
            }
            if (var8) {
                if (arg1 > this.field6462) {
                    this.field6467 += arg0;
                    if (arg3 != 0 && this.field6467 > arg3) {
                        this.field6467 = arg3;
                    }
                } else {
                    this.field6467 -= arg0;
                    if (arg3 != 0 && this.field6467 < (-arg3)) {
                        this.field6467 = -arg3;
                    }
                }
                if (this.field6467 != var5) {
                    int var11 = this.field6467 * this.field6467 / (arg0 * 2);
                    if (arg1 > this.field6462) {
                        if (arg1 < this.field6462 + var11) {
                            this.field6467 = var5;
                        }
                    } else if (arg1 < this.field6462 && (this.field6462 - var11) < arg1) {
                        this.field6467 = var5;
                    }
                }
            } else if (this.field6467 > 0) {
                this.field6467 -= arg0;
                if (this.field6467 < 0) {
                    this.field6467 = 0;
                }
            } else {
                this.field6467 += arg0;
                if (this.field6467 > 0) {
                    this.field6467 = 0;
                }
            }
            this.field6462 += this.field6467 + var5 >> 1;
            return var8;
        }
    }
}
