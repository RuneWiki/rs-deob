import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class224 extends class147 {

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public int field3548 = 0;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "Lna;")
    public static class26 field3549 = class69.method505("<img=0>", (byte) -127);

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field3534 = 128;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field3543 = 0;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lna;")
    public static class26 field3558 = class69.method505("", (byte) -125);

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "Lna;")
    public static class26 field3563 = class69.method505("(Y", (byte) -119);

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field3557 = 0;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "J")
    public static long field3538 = 0L;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "Le;")
    public class159 field3554;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "Lim;")
    public static class180 field3544;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "Lkm;")
    public class324 field3550;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "Lb;")
    public class60 field3537;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "Lb;")
    public class60 field3540;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "Lpb;")
    public class78 field3546;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "Z")
    public static boolean field3536;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "Z")
    public boolean field3556;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "[I")
    public int[] field3561;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "[[I")
    public static int[][] field3545;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Lcl;", line = 22)
    public static final class132 method1492(int arg0, int arg1) {
        field3560++;
        if (arg1 != 0) {
            method1494(-59, 112, 16, -6, 77, -69);
        }
        class132 var2 = (class132) class80.field1252.method1989((long) arg0, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        class132 var3 = class5.method25(class12.field168, false, class178.field2790, (byte) 118, arg0);
        if (var3 != null) {
            class80.field1252.method1978((byte) -75, var3, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 46)
    public final void method1493(int arg0) {
        field3533++;
        int var2 = this.field3559;
        if (this.field3546 != null) {
            class78 var3 = this.field3546.method552(0);
            if (var3 == null) {
                this.field3559 = -1;
                this.field3561 = null;
                this.field3552 = 0;
                this.field3555 = 0;
                this.field3535 = 0;
            } else {
                this.field3552 = var3.field1210;
                this.field3559 = var3.field1207;
                this.field3535 = var3.field1215;
                this.field3555 = var3.field1177 * 128;
                this.field3561 = var3.field1241;
            }
        } else if (this.field3550 != null) {
            int var4 = class83.method649(this.field3550, arg0 ^ 0xFFFFFFFE);
            if (var2 != var4) {
                class187 var5 = this.field3550.field5565;
                this.field3559 = var4;
                if (var5.field2953 != null) {
                    var5 = var5.method1273((byte) -87);
                }
                if (var5 == null) {
                    this.field3555 = 0;
                } else {
                    this.field3555 = var5.field2952 * 128;
                }
            }
        } else if (this.field3554 != null) {
            this.field3559 = class138.method922(arg0 - 1, this.field3554);
            this.field3555 = this.field3554.field2498 * 128;
        }
        if (arg0 == 1 && this.field3559 != var2 && this.field3537 != null) {
            class301.field5195.method1313(this.field3537);
            this.field3537 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIII)V", line = 127)
    public static final void method1494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class76.method543(class45.field710[arg0], arg1 - arg2, -76, arg1 + arg2, arg5);
        field3551++;
        int var6 = 0;
        int var7 = arg2 * arg2;
        int var8 = arg4 * arg4;
        int var9 = arg4;
        int var10 = var8 << 1;
        int var11 = var7 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var7 + var10;
        int var14 = var8 - (var12 - 1) * var11;
        int var15 = var7 << 2;
        if (arg3 > -110) {
            method1496(-83, (byte) -91);
        }
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        while (var9 > 0) {
            var9--;
            int var21 = arg0 + var9;
            int var22 = arg0 - var9;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var17 += var16;
                var14 += var19;
                var6++;
                var19 += var16;
            }
            int var23 = arg1 + var6;
            var14 += -var18;
            var18 -= var15;
            var13 += -var20;
            int var24 = arg1 - var6;
            var20 -= var15;
            class76.method543(class45.field710[var22], var24, -110, var23, arg5);
            class76.method543(class45.field710[var21], var24, 112, var23, arg5);
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V", line = 233)
    public static void method1495(int arg0) {
        field3549 = null;
        field3563 = null;
        if (arg0 != -3) {
            field3543 = 98;
        }
        field3558 = null;
        field3544 = null;
        field3545 = (int[][]) null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V", line = 253)
    public static final void method1496(int arg0, byte arg1) {
        if (arg1 >= -111) {
            field3563 = (class26) null;
        }
        class165.field2559.method1985(-127, arg0);
        field3542++;
        class80.field1252.method1985(-126, arg0);
    }
}
