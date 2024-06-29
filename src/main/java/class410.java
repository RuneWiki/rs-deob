import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class410 extends class266 {

    @OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!lda", name = "E", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!lda", name = "F", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!lda", name = "H", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!lda", name = "I", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!lda", name = "D", descriptor = "Lfc;")
    public static class216 field5340;

    @OriginalMember(owner = "client!lda", name = "G", descriptor = "[B")
    private byte[] field5343;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(JIILet;IIZILpa;)V")
    public static final void method2344(long arg0, int arg1, int arg2, class509 arg3, int arg4, int arg5, boolean arg6, int arg7, class309 arg8) {
        if (arg6) {
            field5340 = null;
        }
        field5339++;
        int var10 = arg4 * arg4 + (arg1 * arg1);
        if (arg0 < (long) var10) {
            return;
        }
        int var11 = Math.min(arg3.field7094 / 2, arg3.field7059 / 2);
        if (var10 <= var11 * var11) {
            class592.method3439(16383, arg8, arg3, arg2, arg5, arg1, arg4, class266.field3461[arg7]);
            return;
        }
        var11 -= 10;
        int var12;
        if (class617.field8931 == 4) {
            var12 = (int) class558.field8223 & 0x3FFF;
        } else {
            var12 = (int) class558.field8223 + class335.field4369 & 0x3FFF;
        }
        int var13 = class442.field6100[var12];
        int var14 = class442.field6101[var12];
        if (class617.field8931 != 4) {
            var13 = var13 * 256 / (class194.field2354 + 256);
            var14 = var14 * 256 / (class194.field2354 + 256);
        }
        int var15 = arg1 * var13 + (arg4 * var14) >> 15;
        int var16 = arg1 * var14 - (arg4 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class172.field2096[arg7].method295((float) arg3.field7094 / 2.0F + (float) arg2 + (float) var19, (float) arg3.field7059 / 2.0F + (float) arg5 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIILlk;IIIILr;BIIIILqa;)Lr;")
    public static final class157 method2345(int arg0, int arg1, int arg2, class502 arg3, int arg4, int arg5, int arg6, int arg7, class157 arg8, byte arg9, int arg10, int arg11, int arg12, int arg13, class206 arg14) {
        field5345++;
        if (arg8 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg3 != null) {
            int var16 = var15 | arg3.method2896(false, (byte) 8, -1, arg0);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg2 << 32) + ((long) arg7 << 48) + (long) ((arg4 << 24) + (arg12 << 16) + arg10);
        class641 var19 = class341.field4398;
        class157 var20;
        synchronized (class341.field4398) {
            var20 = (class157) class341.field4398.method3682(0, var17);
        }
        if (var20 == null || arg14.method1128(var20.method77(), var15) != 0) {
            if (var20 != null) {
                var15 = arg14.method1145(var15, var20.method77());
            }
            byte var21;
            if (arg10 == 1) {
                var21 = 9;
            } else if (arg10 == 2) {
                var21 = 12;
            } else if (arg10 == 3) {
                var21 = 15;
            } else if (arg10 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class152 var24 = new class152((var21 * var22) + 1, var22 * 2 * var21 + -var21, 0);
            int var25 = var24.method831(true, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class442.field6100[var31] * var28 >> 15;
                    int var33 = class442.field6101[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method831(true, 0, var33, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg4 * var35 + arg12 * var36 >> 8);
                short var38 = (short) (((arg2 & 0x380) * var36 + (arg7 & 0x380) * var35 & 0x38000) + ((arg2 & 0x7F) * var36 + (arg7 & 0x7F) * var35 & 0x7F00) + ((arg2 & 0xFC00) * var36 + (arg7 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method830(var25, var37, (byte) -1, (byte) -1, (short) -1, (byte) 1, var38, var26[0][(var39 + 1) % var21], var26[0][var39]);
                    } else {
                        var24.method830(var26[var34 - 1][var39], var37, (byte) -1, (byte) -1, (short) -1, (byte) 1, var38, var26[var34 - 1][(var39 + 1) % var21], var26[var34][(var39 + 1) % var21]);
                        var24.method830(var26[var34 - 1][var39], var37, (byte) -1, (byte) -1, (short) -1, (byte) 1, var38, var26[var34][(var39 + 1) % var21], var26[var34][var39]);
                    }
                }
            }
            var20 = arg14.method277(var24, var15, class126.field1550, 64, 768);
            class641 var40 = class341.field4398;
            synchronized (class341.field4398) {
                class341.field4398.method3684(var20, 0, var17);
            }
        }
        int var41 = (arg10 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg1 != 0) {
            if ((arg1 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg1 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg1 & 0x8) != 0) {
                var42 -= 128;
            }
            if ((arg1 & 0x2) != 0) {
                var43 -= 128;
            }
        }
        int var46 = arg8.method90();
        int var47 = arg8.method82();
        int var48 = arg8.method96();
        if (var43 > var48) {
            var48 = var43;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        int var49 = arg8.method71();
        if (var45 < var49) {
            var49 = var45;
        }
        if (arg9 >= -99) {
            method2345(10, -88, -78, null, -67, -58, -45, -128, null, (byte) 122, -40, 85, 51, 62, null);
        }
        class183 var50 = null;
        if (arg3 != null) {
            int var51 = arg3.field6944[arg0];
            var50 = class393.field5190.method766(var51 >> 16, 100);
            arg0 = var51 & 0xFFFF;
        }
        class157 var52;
        if (var50 == null) {
            var52 = var20.method64((byte) 3, var15, true);
            var52.method100(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method98(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method64((byte) 3, var15, true);
            var52.method100(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method98(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method867(arg0, -3, var50);
        }
        if (arg11 != 0) {
            var52.method85(arg11);
        }
        if (arg5 != 0) {
            var52.method79(arg5);
        }
        if (arg6 != 0) {
            var52.method98(0, arg6, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V")
    public class410() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BBI)V")
    public final void method1077(byte arg0, byte arg1, int arg2) {
        field5341++;
        if (arg1 <= 118) {
            return;
        }
        byte var4 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var5 = arg2 * 2;
        int var6 = var5 + 1;
        this.field5343[var5] = var4;
        this.field5343[var6] = var4;
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)V")
    public static void method2346(int arg0) {
        if (arg0 != 18228) {
            field5342 = -33;
        }
        field5340 = null;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(IIII)[B")
    public final byte[] method2347(int arg0, int arg1, int arg2, int arg3) {
        this.field5343 = new byte[arg1 * arg3 * arg2 * 2];
        field5344++;
        this.method1777(-105, arg2, arg1, arg3);
        if (arg0 != 0) {
            method2345(57, 89, 64, null, -21, 115, -71, -123, null, (byte) -77, 66, -77, 95, -37, null);
        }
        return this.field5343;
    }

    static {
        new class180("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
