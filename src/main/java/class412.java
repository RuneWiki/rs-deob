import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class412 {

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "Lac;")
    public class380 field5890 = new class380();

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field5878 = -1;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "Lfo;")
    public static class361 field5884;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "Lac;")
    private class380 field5892;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Lac;", line = 5)
    public final class380 method2512(int arg0) {
        if (arg0 != -5114) {
            this.method2515(97);
        }
        field5882++;
        class380 var2 = this.field5890.field5500;
        if (this.field5890 == var2) {
            this.field5892 = null;
            return null;
        } else {
            this.field5892 = var2.field5500;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIBII)V", line = 26)
    public static final void method2513(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5880++;
        int var6 = 0;
        int var7 = arg2;
        if (arg3 > -88) {
            field5884 = null;
        }
        int var8 = arg1 * arg1;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        class476.method2907(arg0 + arg1, 55, arg4, class5.field54[arg5], arg0 - arg1);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var21 = arg5 - var7;
            int var22 = arg5 + var7;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class476.method2907(var23, 102, arg4, class5.field54[var21], var24);
            class476.method2907(var23, 124, arg4, class5.field54[var22], var24);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Lac;", line = 109)
    public final class380 method2514(byte arg0) {
        field5888++;
        class380 var2 = this.field5892;
        if (this.field5890 == var2) {
            this.field5892 = null;
            return null;
        } else {
            int var3 = 19 / ((48 - arg0) / 55);
            this.field5892 = var2.field5500;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V", line = 135)
    public final void method2515(int arg0) {
        while (true) {
            class380 var2 = this.field5890.field5500;
            if (this.field5890 == var2) {
                field5891++;
                if (arg0 < 126) {
                    this.method2512(-14);
                }
                this.field5892 = null;
                return;
            }
            var2.method2325(true);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I", line = 162)
    public final int method2516(boolean arg0) {
        field5889++;
        int var2 = 0;
        if (!arg0) {
            method2513(-27, -70, -83, (byte) -35, 1, 10);
        }
        class380 var3 = this.field5890.field5500;
        while (this.field5890 != var3) {
            var3 = var3.field5500;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)S", line = 187)
    public static final short method2517(int arg0, int arg1) {
        field5885++;
        int var2 = (arg1 & 0xFFFF) >> 10;
        if (arg0 > -107) {
            method2517(-113, 5);
        }
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILac;)V", line = 215)
    public final void method2518(int arg0, class380 arg1) {
        if (arg1.field5501 != null) {
            arg1.method2325(true);
        }
        field5883++;
        arg1.field5501 = this.field5890.field5501;
        if (arg0 != 1165053482) {
            this.field5890 = null;
        }
        arg1.field5500 = this.field5890;
        arg1.field5501.field5500 = arg1;
        arg1.field5500.field5501 = arg1;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V", line = 232)
    public static void method2519(byte arg0) {
        if (arg0 <= 5) {
            method2517(-98, 116);
        }
        field5884 = null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIII)I", line = 245)
    public static final int method2520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5881++;
        if (arg4 < 97) {
            method2519((byte) 121);
        }
        int var5 = 65536 - class456.field6811[arg3 * 8192 / arg1] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V", line = 267)
    public class412() {
        this.field5890.field5500 = this.field5890;
        this.field5890.field5501 = this.field5890;
    }
}
