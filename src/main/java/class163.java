import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public abstract class class163 implements class96 {

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "Lem;")
    private class599 field2414 = class549.field7730;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "Lkl;")
    public class468 field2417;

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
    public int field2418;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "Llh;")
    public class125 field2405;

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "Z")
    private boolean field2420;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "Lvt;")
    public class343 field2406;

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
    private int field2412;

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "Liu;")
    public static class517 field2422;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lem;I)V")
    public final void method840(class599 arg0, int arg1) {
        int var3 = -80 % ((arg1 + 72) / 48);
        field2407++;
        if (this.field2414 != arg0) {
            this.field2414 = arg0;
            this.method1139(-100);
        }
    }

    @OriginalMember(owner = "client!qda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2409++;
        this.method1136(-3);
        super.finalize();
    }

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "(I)V")
    private final void method1136(int arg0) {
        int var2 = -107 % ((arg0 - 73) / 46);
        if (this.field2412 > 0) {
            this.field2405.method994(this.field2412, this.method1142((byte) -68), (byte) 127);
            this.field2412 = 0;
        }
        field2415++;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
    private final void method1137(int arg0, int arg1) {
        this.field2405.field9056 -= arg0;
        field2419++;
        if (arg1 < 6) {
            this.method841(88);
        }
        this.field2405.field9056 += this.method1142((byte) -68);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII[B)V")
    public final void method1138(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field2408++;
        if (arg2 > 0 && !class32.method294(arg2, false)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class32.method294(arg1, false)) {
            int var6 = this.field2417.field6743;
            int var7 = 0;
            int var8 = arg1 <= arg2 ? arg1 : arg2;
            if (arg0 != 1) {
                this.method1138(72, -122, -104, -7, null);
            }
            int var9 = arg2 >> 1;
            int var10 = arg1 >> 1;
            byte[] var11 = arg4;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var7, this.method1140((byte) 123), arg2, arg1, 0, class387.method2348(this.field2417, (byte) -120), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = (byte) (var26 >> 2);
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                arg1 = var10;
                var11 = var15;
                arg2 = var9;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "(I)V")
    private final void method1139(int arg0) {
        this.field2405.method3577(this, true);
        field2423++;
        if (class549.field7730 == this.field2414) {
            OpenGL.glTexParameteri(this.field2418, 10241, this.field2420 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2418, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2418, 10241, this.field2420 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2418, 10240, 9728);
        }
        if (arg0 >= -38) {
            this.field2412 = 116;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)I")
    public final int method1140(byte arg0) {
        if (arg0 < 118) {
            this.field2420 = false;
        }
        field2411++;
        if (class343.field4922 == this.field2406) {
            if (class617.field8727 == this.field2417) {
                return 6407;
            }
            if (class85.field1472 == this.field2417) {
                return 6408;
            }
            if (class384.field5715 == this.field2417) {
                return 6406;
            }
            if (class299.field4330 == this.field2417) {
                return 6409;
            }
            if (class561.field8029 == this.field2417) {
                return 6410;
            }
            if (class485.field6862 == this.field2417) {
                return 6145;
            }
        } else if (class343.field4925 == this.field2406) {
            if (class617.field8727 == this.field2417) {
                return 34843;
            }
            if (class85.field1472 == this.field2417) {
                return 34842;
            }
            if (class384.field5715 == this.field2417) {
                return 34844;
            }
            if (class299.field4330 == this.field2417) {
                return 34846;
            }
            if (class561.field8029 == this.field2417) {
                return 34847;
            }
            if (class485.field6862 == this.field2417) {
                return 6145;
            }
        } else if (class343.field4926 == this.field2406) {
            if (class617.field8727 == this.field2417) {
                return 34837;
            }
            if (class85.field1472 == this.field2417) {
                return 34836;
            }
            if (class384.field5715 == this.field2417) {
                return 34838;
            }
            if (class299.field4330 == this.field2417) {
                return 34840;
            }
            if (class561.field8029 == this.field2417) {
                return 34841;
            }
            if (class485.field6862 == this.field2417) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII[I)V")
    public final void method1141(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 != 23292) {
            this.method1139(40);
        }
        field2413++;
        if (arg1 > 0 && !class32.method294(arg1, false)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class32.method294(arg0, false)) {
            throw new IllegalArgumentException("");
        } else if (class85.field1472 == this.field2417) {
            int var6 = 0;
            int var7 = arg1 >= arg0 ? arg0 : arg1;
            int var8 = arg1 >> 1;
            int var9 = arg0 >> 1;
            int[] var10 = arg4;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method1140((byte) 125), arg1, arg0, 0, 32993, this.field2405.field2064, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg1 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var10[var14++];
                        int var22 = (var18 & 0xFF457E) >> 16;
                        int var23 = (var18 & 0xFF10) >> 8;
                        int var24 = var18 >> 24 & 0xFF;
                        int var25 = var18 & 0xFF;
                        int var26 = (var20 >> 24 & 0xFF) + var24;
                        int var27 = (var20 & 0xFF) + var25;
                        int var28 = ((var20 & 0xFF5C) >> 8) + var23;
                        int var29 = (var20 >> 16 & 0xFF) + var22;
                        int var30 = (var19 >> 16 & 0xFF) + var29;
                        int var31 = (var19 & 0xFF) + var27;
                        int var32 = (var19 >> 24 & 0xFF) + var26;
                        int var33 = (var19 >> 8 & 0xFF) + var28;
                        int var34 = ((var21 & 0xFF00) >> 8) + var33;
                        int var35 = ((var21 & 0xFFB4BD) >> 16) + var30;
                        int var36 = (var21 >> 24 & 0xFF) + var32;
                        int var37 = (var21 & 0xFF) + var31;
                        var11[var12++] = class188.method1258(class188.method1258(class188.method1258(class424.method2540(-16777216, var36 << 22), class424.method2540(1020, var35) << 14), class424.method2540(var34, 1020) << 6), class424.method2540(var37, 1020) >> 2);
                    }
                    var14 += arg1;
                    var13 += arg1;
                }
                int[] var16 = var11;
                var11 = var10;
                var10 = var16;
                arg0 = var9;
                arg1 = var8;
                var9 >>= 0x1;
                var7 >>= 0x1;
                var6++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)I")
    private final int method1142(byte arg0) {
        if (arg0 != -68) {
            this.method1139(42);
        }
        field2421++;
        int var2 = this.field2417.field6743 * this.field2406.field4916 * this.field2416;
        return this.field2420 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field2422 = null;
        if (arg0 != 4316) {
            method1143(121);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII[F)V")
    public final void method1144(int arg0, int arg1, int arg2, int arg3, float[] arg4) {
        field2410++;
        if (arg1 > 0 && !class32.method294(arg1, false)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class32.method294(arg2, false)) {
            int var6 = this.field2417.field6743;
            int var7 = 0;
            int var8 = arg2 > arg1 ? arg1 : arg2;
            int var9 = arg1 >> 1;
            int var10 = arg2 >> 1;
            float[] var11 = arg4;
            float[] var12 = new float[var9 * var10 * var6];
            if (arg3 < 95) {
                this.method840(null, -13);
            }
            while (true) {
                OpenGL.glTexImage2Df(arg0, var7, this.method1140((byte) 122), arg1, arg2, 0, class387.method2348(this.field2417, (byte) -120), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg1 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var12[var16] = var26 * 0.25F;
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                arg1 = var9;
                arg2 = var10;
                var11 = var15;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "(I)V")
    public final void method841(int arg0) {
        field2424++;
        int var2 = this.field2405.method3643((byte) -113);
        if (arg0 < 68) {
            this.method1141(-70, 112, -96, -43, null);
        }
        int var3 = this.field2405.field2059[var2];
        if (this.field2418 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field2418);
            this.field2405.field2059[var2] = this.field2418;
        }
        OpenGL.glBindTexture(this.field2418, this.field2412);
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Llh;ILkl;Lvt;IZ)V")
    public class163(class125 arg0, int arg1, class468 arg2, class343 arg3, int arg4, boolean arg5) {
        this.field2417 = arg2;
        this.field2418 = arg1;
        this.field2416 = arg4;
        this.field2405 = arg0;
        this.field2420 = arg5;
        this.field2406 = arg3;
        OpenGL.glGenTextures(1, class237.field3478, 0);
        this.field2412 = class237.field3478[0];
        this.method1139(-108);
        this.method1137(0, 27);
    }

    static {
        new class567("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field2422 = new class517(64, -2);
    }
}
