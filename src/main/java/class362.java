import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class362 {

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Z")
    public boolean field4848 = true;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    private int field4858 = -1;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lgi;")
    private class583 field4853;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    private int field4855;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    private int field4854;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lwh;")
    private class127 field4850;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    private int field4846;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lob;")
    private class629 field4849;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lah;")
    private class322 field4847;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Luba;")
    private class363 field4860;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Ljava/util/Random;")
    public static Random field4859 = new Random();

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method2165(byte arg0) {
        field4859 = null;
        if (arg0 < 119) {
            method2166(null, 74);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lan;I)V")
    public static final void method2166(class21 arg0, int arg1) {
        field4861++;
        class478.field6750 = arg0;
        if (arg1 != 0) {
            method2165((byte) -61);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([BIII)V")
    public final void method2167(byte[] arg0, int arg1, int arg2, int arg3) {
        field4862++;
        if (arg2 != 28750) {
            this.field4858 = -99;
        }
        this.field4860.method1998((byte) 120, arg0, this.field4853.method3344(4, arg1) * arg3, arg1);
        this.method2169(-128, arg3, this.field4860);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
    public static final void method2168(boolean arg0, int arg1) {
        field4851++;
        if (~class585.field8364.length() == arg1) {
            return;
        }
        class77.method597(-1986155574, "--> " + class585.field8364);
        class557.method3165(~arg1, arg0, class585.field8364, false);
        class585.field8364 = "";
        class360.field4844 = 0;
        class148.field2273 = 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILah;)V")
    private final void method2169(int arg0, int arg1, class322 arg2) {
        field4852++;
        if (arg1 != 0 && arg0 == -128) {
            this.method2170(-40);
            this.field4853.method3358(arg0 + 33014, this.field4849);
            this.field4853.method3366(arg2, arg1, -22887, 4, 0);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    private final void method2170(int arg0) {
        field4856++;
        if (arg0 > -10) {
            this.field4850 = null;
        }
        if (!this.field4848) {
            return;
        }
        this.field4848 = false;
        byte[] var2 = this.field4850.field2050;
        byte[] var3 = this.field4853.field8346;
        int var4 = 0;
        int var5 = this.field4850.field2056;
        int var6 = this.field4850.field2056 * this.field4854 + this.field4855;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4849 != null && this.field4858 == var4) {
            this.field4848 = false;
            return;
        }
        this.field4858 = var4;
        int var8 = 0;
        int var9 = this.field4854 * var5 + this.field4855;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var9 + var5] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field4850.field2056 - 128;
        }
        if (this.field4849 == null) {
            this.field4849 = new class629(this.field4853, 3553, 6406, 128, 128, false, this.field4853.field8346, 6406, false);
            this.field4849.method3666(98, false, false);
            this.field4849.method2513(false, true);
        } else {
            this.field4849.method3665(0, 128, 6406, false, false, 0, this.field4853.field8346, 128, 0, 0);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    public final void method2171(byte arg0) {
        field4845++;
        if (arg0 != 19) {
            this.field4849 = null;
        }
        this.method2169(-128, this.field4846, this.field4847);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lgi;Lwh;Lql;IIIII)V")
    public class362(class583 arg0, class127 arg1, class627 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4853 = arg0;
        this.field4855 = arg6;
        this.field4854 = arg7;
        this.field4850 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field2505 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field9156[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field4846 = var10;
        if (var10 <= 0) {
            this.field4849 = null;
        } else {
            class11 var14 = new class11(var10 * 2);
            if (this.field4853.field8254) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field2505 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field9156[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method84(var23[var24] & 0xFFFF, (byte) -121);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field2505 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field9156[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method95(1412209512, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field4847 = this.field4853.method3391(7681, var14.field165, false, var14.field138, 5123);
            this.field4860 = new class363(this.field4853, 5123, null, 1);
        }
    }
}
