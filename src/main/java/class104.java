import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class104 {

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Ldg;")
    public static class20 field1753 = new class20();

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    private int field1749;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "[[[B")
    public static byte[][][] field1755;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 7)
    public final void method869(byte arg0) {
        if (arg0 != 10) {
            field1753 = null;
        }
        field1756++;
        this.field1751 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I", line = 18)
    public final int method870(int arg0) {
        field1754++;
        return arg0 == 16383 ? this.field1751 & 0x3FFF : 70;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(JJ)J", line = 29)
    public static long method871(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V", line = 36)
    public final void method872(int arg0, byte arg1) {
        this.field1751 = arg0;
        int var3 = 91 / ((31 - arg1) / 48);
        field1752++;
        this.field1749 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII)Z", line = 47)
    public final boolean method873(int arg0, int arg1, int arg2, int arg3) {
        field1750++;
        if (arg1 != 2) {
            this.method869((byte) 32);
        }
        int var5 = this.field1749;
        if (this.field1751 == arg2 && this.field1749 == 0) {
            return false;
        }
        boolean var6;
        if (this.field1749 == 0) {
            if (this.field1751 < arg2 && (this.field1751 + arg3) >= arg2 || this.field1751 > arg2 && arg2 >= (this.field1751 - arg3)) {
                this.field1751 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field1749 > 0 && this.field1751 < arg2) {
            int var7 = this.field1749 * this.field1749 / (arg3 * 2);
            int var8 = this.field1751 + var7;
            if (var8 < arg2 && var8 >= this.field1751) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field1749 < 0 && arg2 < this.field1751) {
            int var9 = this.field1749 * this.field1749 / (arg3 * 2);
            int var10 = this.field1751 - var9;
            if (var10 > arg2 && var10 <= this.field1751) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field1751 >= arg2) {
                this.field1749 -= arg3;
                if (arg0 != 0 && this.field1749 < -arg0) {
                    this.field1749 = -arg0;
                }
            } else {
                this.field1749 += arg3;
                if (arg0 != 0 && this.field1749 > arg0) {
                    this.field1749 = arg0;
                }
            }
            if (this.field1749 != var5) {
                int var11 = this.field1749 * this.field1749 / (arg3 * 2);
                if (arg2 <= this.field1751) {
                    if (arg2 < this.field1751 && (this.field1751 - var11) < arg2) {
                        this.field1749 = var5;
                    }
                } else if (arg2 < (this.field1751 + var11)) {
                    this.field1749 = var5;
                }
            }
        } else if (this.field1749 > 0) {
            this.field1749 -= arg3;
            if (this.field1749 < 0) {
                this.field1749 = 0;
            }
        } else {
            this.field1749 += arg3;
            if (this.field1749 > 0) {
                this.field1749 = 0;
            }
        }
        this.field1751 += this.field1749 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 184)
    public static void method874(int arg0) {
        field1753 = null;
        if (arg0 != -20842) {
            field1753 = null;
        }
        field1755 = null;
    }
}
