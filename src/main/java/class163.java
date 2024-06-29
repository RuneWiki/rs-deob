import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class163 extends class189 {

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
    private int field3350 = 4;

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
    private int field3352 = 0;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "Z")
    private boolean field3348 = true;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    private int field3344 = 1638;

    @OriginalMember(owner = "client!sa", name = "wb", descriptor = "I")
    private int field3360 = 4;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
    private int field3349 = 4;

    @OriginalMember(owner = "client!sa", name = "zb", descriptor = "[I")
    private int[] field3363 = new int[512];

    @OriginalMember(owner = "client!sa", name = "ub", descriptor = "Lqd;")
    public static class148 field3358 = new class148();

    @OriginalMember(owner = "client!sa", name = "Ab", descriptor = "[I")
    public static int[] field3364 = new int[1000];

    @OriginalMember(owner = "client!sa", name = "xb", descriptor = "Z")
    public static boolean field3361 = true;

    @OriginalMember(owner = "client!sa", name = "yb", descriptor = "Lqd;")
    public static class148 field3362 = new class148();

    @OriginalMember(owner = "client!sa", name = "Bb", descriptor = "[[[Lqd;")
    public static class148[][][] field3365 = new class148[4][104][104];

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!sa", name = "sb", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!sa", name = "tb", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!sa", name = "vb", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "[I")
    private int[] field3353;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "[I")
    private int[] field3354;

    @OriginalMember(owner = "client!sa", name = "Cb", descriptor = "[I")
    public static int[] field3366;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLgg;Lgg;Ljc;)Lrc;")
    public static final class156 method1108(byte arg0, class63 arg1, class63 arg2, class85 arg3) {
        ++field3346;
        int var4 = 67 % ((-47 - arg0) / 34);
        int var5 = arg3.method751(-29355, arg2);
        int var6 = arg3.method748(0, arg1, var5);
        return class181.method1202((byte) -78, var5, arg3, var6);
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        if (!arg0) {
            this.method1109(-63);
        }
        ++field3357;
        this.method1112(false);
        this.method1109(-32540);
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    private final void method1109(int arg0) {
        if (~this.field3344 < -1) {
            this.field3354 = new int[this.field3360];
            this.field3353 = new int[this.field3360];
            for (int var2 = 0; ~this.field3360 < ~var2; ++var2) {
                this.field3353[var2] = (int) (Math.pow((double) (this.field3344 / 4096), (double) var2) * 4096.0D);
                this.field3354[var2] = (int) (4096.0D * Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3353 != null && ~this.field3353.length == ~this.field3360) {
            this.field3354 = new int[this.field3360];
            for (int var3 = 0; var3 < this.field3360; ++var3) {
                this.field3354[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != -32540) {
            field3362 = null;
        }
        ++field3345;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    public static void method1110(int arg0) {
        if (arg0 >= 126) {
            field3365 = null;
            field3364 = null;
            field3362 = null;
            field3366 = null;
            field3358 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lfd;IZ)V")
    public static final void method1111(class52 arg0, int arg1, boolean arg2) {
        ++field3351;
        if (class158.field3275 != null) {
            try {
                class158.field3275.method509(true);
            } catch (Exception var8) {
            }
            class158.field3275 = null;
        }
        class158.field3275 = arg0;
        class129.method959(arg2, (byte) -112);
        class17.field416 = null;
        class97.field2311 = null;
        class90.field2100.field54 = 0;
        class11.field266 = arg1;
        while (true) {
            class112 var3 = (class112) class130.field2833.method699(-10679);
            if (var3 == null) {
                while (true) {
                    class112 var4 = (class112) class59.field1510.method699(-10679);
                    if (var4 == null) {
                        if (~class6.field156 != -1) {
                            try {
                                class3 var5 = new class3(4);
                                var5.method66(2, 4);
                                var5.method66(2, class6.field156);
                                var5.method62(0, (byte) -112);
                                class158.field3275.method512(0, 4, var5.field48, (byte) 84);
                            } catch (IOException var7) {
                                try {
                                    class158.field3275.method509(true);
                                } catch (Exception var6) {
                                }
                                class158.field3275 = null;
                                ++class174.field3581;
                            }
                        }
                        class54.field1379 = 0;
                        class123.field2707 = class198.method1295((byte) 91);
                        return;
                    }
                    class134.field2908.method135(var4, arg1 ^ 104);
                    class162.field3336.method702((byte) 91, var4, var4.field3612);
                    ++class45.field1074;
                    --class191.field3878;
                }
            }
            class168.field3475.method702((byte) 108, var3, var3.field3612);
            ++class199.field3973;
            --class113.field2547;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(Z)V")
    private final void method1112(boolean arg0) {
        Random var2 = new Random((long) this.field3352);
        ++field3347;
        for (int var3 = 0; var3 < 255; ++var3) {
            this.field3363[var3] = -1;
        }
        if (arg0) {
            field3366 = null;
        }
        for (int var4 = 0; var4 < 255; ++var4) {
            int var5;
            do {
                var5 = class97.method834(0, var2, 255);
            } while (this.field3363[var5] != -1);
            this.field3363[var5 + 255] = this.field3363[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)I")
    private final int method1113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3359;
        int var6 = arg3 & -4096;
        int var7 = arg4 & -4096;
        int var8 = -4096 & arg2;
        int var9 = arg4 - var7;
        int var10 = var7 >> 12;
        int var11 = arg3 - var6;
        int var12 = var6 >> 12;
        int var13 = var12 + 1;
        int var14 = var12 & 255;
        int var15 = var10 + 1;
        int var16 = arg1 & -4096;
        if (~var15 <= ~(var8 >> 12)) {
            var15 = 0;
        }
        int var17 = var15 & 255;
        int var18 = var10 & 255;
        int var19 = this.field3363[this.field3363[var17] + var14] % 4;
        int var20 = this.field3363[this.field3363[var18] + var14] % 4;
        if (var16 >> 12 <= var13) {
            var13 = 0;
        }
        int var21 = var13 & 255;
        int var22 = this.field3363[this.field3363[var18] + var21] % 4;
        int var23 = this.field3363[this.field3363[var17] + var21] % arg0;
        int var24 = class124.method944(true, var11, var9, class83.field1979[var20]);
        int var25 = class124.method944(true, var11 - 4096, var9, class83.field1979[var22]);
        int var26 = class124.method944(true, var11, var9 + -4096, class83.field1979[var19]);
        int var27 = class124.method944(true, var11 + -4096, var9 + -4096, class83.field1979[var23]);
        int var28 = class19.method195(var11, -84);
        int var29 = class19.method195(var9, -71);
        int var30 = class83.method734((byte) 104, var28, var25, var24);
        int var31 = class83.method734((byte) 69, var28, var27, var26);
        return class83.method734((byte) 101, var29, var31, var30);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 <= 32) {
            this.field3352 = 77;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field3349 = arg2.method64(31790);
                                }
                            } else {
                                this.field3350 = arg2.method64(31790);
                            }
                        } else {
                            this.field3352 = arg2.method64(31790);
                        }
                    } else {
                        this.field3350 = this.field3349 = arg2.method64(31790);
                    }
                } else {
                    this.field3344 = arg2.method25(0);
                    if (this.field3344 < 0) {
                        this.field3353 = new int[this.field3360];
                        for (int var5 = 0; this.field3360 > var5; ++var5) {
                            this.field3353[var5] = arg2.method25(0);
                        }
                    }
                }
            } else {
                this.field3360 = arg2.method64(31790);
            }
        } else {
            this.field3348 = arg2.method64(31790) == 1;
        }
        ++field3355;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3356;
        if (arg0 != 0) {
            this.method84(false);
        }
        int[] var3 = super.field3825.method681(arg1, (byte) -42);
        if (super.field3825.field1840) {
            int var4 = this.field3350 << 12;
            int var5 = this.field3349 << 12;
            int var6 = class21.field496[arg1] * this.field3349;
            for (int var7 = 0; ~class54.field1430 < ~var7; ++var7) {
                int var8 = 0;
                int var9 = class35.field825[var7] * this.field3350;
                for (int var10 = 0; this.field3360 > var10; ++var10) {
                    int var11 = this.field3354[var10];
                    int var12 = this.field3353[var10];
                    int var13 = this.method1113(4, var4 * var11 >> 12, var5 * var11 >> 12, var9 * var11 >> 12, var6 * var11 >> 12);
                    var8 += var12 * var13 >> 12;
                }
                if (this.field3348) {
                    var8 = 2048 - -(var8 >> 1);
                }
                var3[var7] = var8;
            }
        }
        return var3;
    }
}
