import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class290 extends class354 {

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    private int field4243 = 0;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    private int field4236 = 0;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    private int field4250 = 0;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field4238 = 0;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "Lla;")
    public static class319 field4251;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "F")
    public static float field4245;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field4234;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    private int field4246;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    private int field4249;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        int var3 = 88 % ((48 - arg1) / 60);
        ++field4235;
        int[][] var4 = super.field5474.method2414((byte) -105, arg0);
        if (super.field5474.field5870) {
            int[][] var5 = this.method2274((byte) 84, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class531.field7814; ++var12) {
                this.method1859(var8[var12], 2106604620, var7[var12], var6[var12]);
                this.field4249 += this.field4250;
                this.field4239 += this.field4243;
                this.field4242 += this.field4236;
                while (~this.field4249 > -1) {
                    this.field4249 += 4096;
                }
                while (this.field4249 > 4096) {
                    this.field4249 -= 4096;
                }
                if (~this.field4239 > -1) {
                    this.field4239 = 0;
                }
                if (this.field4239 > 4096) {
                    this.field4239 = 4096;
                }
                if (this.field4242 < 0) {
                    this.field4242 = 0;
                }
                if (this.field4242 > 4096) {
                    this.field4242 = 4096;
                }
                this.method1857((byte) -71, this.field4249, this.field4242, this.field4239);
                var9[var12] = this.field4234;
                var10[var12] = this.field4246;
                var11[var12] = this.field4247;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BIII)V")
    private final void method1857(byte arg0, int arg1, int arg2, int arg3) {
        ++field4248;
        if (arg0 != -71) {
            field4238 = 1;
        }
        int var5 = arg2 > 2048 ? arg2 - (-arg3 - -(arg2 * arg3 >> 12)) : (4096 - -arg3) * arg2 >> 12;
        if (var5 <= 0) {
            this.field4234 = this.field4246 = this.field4247 = arg2;
        } else {
            int var6 = arg1 * 6;
            int var7 = -var5 + arg2 + arg2;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field4234 = var5;
                                    this.field4246 = var7;
                                    this.field4247 = var15;
                                }
                            } else {
                                this.field4246 = var7;
                                this.field4234 = var14;
                                this.field4247 = var5;
                            }
                        } else {
                            this.field4247 = var5;
                            this.field4246 = var15;
                            this.field4234 = var7;
                        }
                    } else {
                        this.field4246 = var5;
                        this.field4247 = var14;
                        this.field4234 = var7;
                    }
                } else {
                    this.field4234 = var15;
                    this.field4246 = var5;
                    this.field4247 = var7;
                }
            } else {
                this.field4234 = var5;
                this.field4246 = var14;
                this.field4247 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "(I)V")
    public static void method1858(int arg0) {
        field4251 = null;
        int var1 = -35 % ((48 - arg0) / 53);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
    private final void method1859(int arg0, int arg1, int arg2, int arg3) {
        ++field4240;
        if (arg1 == 2106604620) {
            int var5 = arg3 > arg2 ? arg3 : arg2;
            int var6 = ~var5 <= ~arg0 ? var5 : arg0;
            int var7 = arg2 > arg3 ? arg3 : arg2;
            int var8 = var7 > arg0 ? arg0 : var7;
            this.field4242 = (var6 + var8) / 2;
            int var9 = -var8 + var6;
            if (var9 <= 0) {
                this.field4249 = 0;
            } else {
                int var10 = (-arg3 + var6 << 12) / var9;
                int var11 = (-arg2 + var6 << 12) / var9;
                int var12 = (-arg0 + var6 << 12) / var9;
                if (~arg3 == ~var6) {
                    this.field4249 = arg2 == var8 ? var12 + 20480 : -var11 + 4096;
                } else if (~arg2 == ~var6) {
                    this.field4249 = ~arg0 != ~var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field4249 = ~arg3 != ~var8 ? 20480 - var10 : var11 + 12288;
                }
                this.field4249 /= 6;
            }
            if (this.field4242 > 0 && this.field4242 < 4096) {
                this.field4239 = (var9 << 12) / (this.field4242 <= 2048 ? this.field4242 * 2 : -(this.field4242 * 2) + 8192);
            } else {
                this.field4239 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class290() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4236 = (arg0.method1088((byte) -114) << 12) / 100;
                }
            } else {
                this.field4243 = (arg0.method1088((byte) 117) << 12) / 100;
            }
        } else {
            this.field4250 = arg0.method1056(1024);
        }
        ++field4244;
        if (arg2 != 1638) {
            this.method1859(56, 80, -93, 16);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BZ[B)V")
    public static final void method1860(byte arg0, boolean arg1, byte[] arg2) {
        if (class184.field2501 == null) {
            class184.field2501 = new class164(20000);
        }
        ++field4241;
        class184.field2501.method1089(0, arg2, -4516, arg2.length);
        if (arg0 < 30) {
            method1858(9);
        }
        if (arg1) {
            class275.method1762((byte) -90, class184.field2501.field2219);
            class4.field22 = new class412[class497.field7328];
            int var3 = 0;
            for (int var4 = class44.field638; var4 <= class433.field6583; ++var4) {
                class412 var5 = class516.method3081(var4, -1);
                if (var5 != null) {
                    class4.field22[var3++] = var5;
                }
            }
            class70.field981 = false;
            class351.field5432 = class58.method427((byte) -19);
            class184.field2501 = null;
        }
    }

    static {
        new class446("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field4252 = 0;
        field4251 = new class319(70, 0);
        field4253 = -1;
    }
}
