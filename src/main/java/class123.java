import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class123 extends class45 {

    @OriginalMember(owner = "client!vp", name = "Q", descriptor = "I")
    private int field1998 = 1024;

    @OriginalMember(owner = "client!vp", name = "P", descriptor = "I")
    private int field1997 = 3072;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    private int field1992 = 2048;

    @OriginalMember(owner = "client!vp", name = "R", descriptor = "J")
    public static long field1999 = -1L;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!vp", name = "N", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!vp", name = "O", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!vp", name = "S", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!vp", name = "T", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!vp", name = "U", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!vp", name = "V", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "[Lnu;")
    public static class417[] field1993;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field2001;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (super.field833.field1888) {
            int[][] var4 = this.method437(0, arg1, 56);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class259.field3768; ++var11) {
                var8[var11] = (var5[var11] * this.field1992 >> 12) + this.field1998;
                var9[var11] = (var6[var11] * this.field1992 >> 12) + this.field1998;
                var10[var11] = this.field1998 - -(var7[var11] * this.field1992 >> 12);
            }
        }
        if (arg0 != 8) {
            this.method49(-90, 24);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "(B)V")
    public static final void method945(byte arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class153.field2429[var1] = false;
        }
        ++field1995;
        class255.field3660 = 0;
        class190.field2834 = -1;
        int var2 = 46 / ((arg0 - -31) / 45);
        class236.field3423 = 0;
        class412.field6156 = -1;
        class85.field1473 = 1;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZZLdk;B)V")
    public static final void method946(boolean arg0, boolean arg1, class352 arg2, byte arg3) {
        ++field1991;
        int var4 = -23 % ((17 - arg3) / 50);
        int var5 = arg2.field5391;
        int var6 = (int) arg2.field4904;
        arg2.method2090(-1);
        if (arg0) {
            class503.method3010((byte) -97, var5);
        }
        class147.method1136(65535, var5);
        class350 var7 = class319.method2075(true, var6);
        if (var7 != null) {
            class302.method1902((byte) -90, var7);
        }
        class105.method794((byte) 98);
        if (!arg1 && class364.field5513 != -1) {
            class116.method861(-1, 1, class364.field5513);
        }
        class275 var8 = new class275(class162.field2507);
        for (class352 var9 = (class352) var8.method1762(0); var9 != null; var9 = (class352) var8.method1761(-102)) {
            if (!var9.method2091((byte) -118)) {
                var9 = (class352) var8.method1762(0);
                if (var9 == null) {
                    return;
                }
            }
            if (var9.field5390 == 3) {
                int var10 = (int) var9.field4904;
                if (var10 >>> 16 == var5) {
                    method946(true, arg1, var9, (byte) -74);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg0 != 0) {
            method947(-121);
        }
        ++field2003;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int[] var4 = this.method434(0, arg1, -112);
            for (int var5 = 0; ~class259.field3768 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field1992 >> 12) + this.field1998;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
    public class123() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
    public final void method38(int arg0) {
        ++field2002;
        if (arg0 == 4095) {
            this.field1992 = this.field1997 - this.field1998;
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
    public static void method947(int arg0) {
        int var1 = -55 / ((arg0 - 28) / 39);
        field1993 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 == -26471) {
            ++field2000;
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        super.field844 = ~arg0.method1063((byte) 121) == -2;
                    }
                } else {
                    this.field1997 = arg0.method1069((byte) -41);
                }
            } else {
                this.field1998 = arg0.method1069((byte) -80);
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIII)V")
    public static final void method948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1996;
        if (class443.field6623.field630 != arg4 && arg1 != 0 && ~class148.field2361 > -51 && arg3 != -1) {
            class245.field3527[class148.field2361++] = new class150((byte) 1, arg3, arg1, arg0, arg5, arg2);
        }
    }
}
