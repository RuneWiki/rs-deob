import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class407 extends class118 {

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public int field6047 = 1638;

    @OriginalMember(owner = "client!et", name = "T", descriptor = "I")
    public int field6055 = 4;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "[B")
    private byte[] field6050 = new byte[512];

    @OriginalMember(owner = "client!et", name = "U", descriptor = "I")
    public int field6056 = 4;

    @OriginalMember(owner = "client!et", name = "V", descriptor = "I")
    public int field6057 = 0;

    @OriginalMember(owner = "client!et", name = "S", descriptor = "I")
    public int field6054 = 4;

    @OriginalMember(owner = "client!et", name = "W", descriptor = "Z")
    public boolean field6058 = true;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "Lnn;")
    public static class151 field6043 = new class151(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!et", name = "R", descriptor = "Lwl;")
    public static class452 field6053;

    @OriginalMember(owner = "client!et", name = "bb", descriptor = "Lwl;")
    public static class452 field6063;

    @OriginalMember(owner = "client!et", name = "cb", descriptor = "Lnn;")
    public static class151 field6064;

    @OriginalMember(owner = "client!et", name = "eb", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!et", name = "X", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!et", name = "Y", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!et", name = "Z", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!et", name = "ab", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!et", name = "fb", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!et", name = "db", descriptor = "[I")
    public static int[] field6065;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "[S")
    private short[] field6042;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "[S")
    private short[] field6046;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field6062;
        if (arg0 != 1) {
            this.field6042 = null;
        }
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            this.method2559(arg1, 111, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjk;)I")
    public static final int method2553(int arg0, class119 arg1) {
        ++field6049;
        if (arg0 != 1) {
            return -40;
        } else {
            int var2 = arg1.method717(2, false);
            int var3;
            if (~var2 != -1) {
                if (var2 != 1) {
                    if (~var2 == -3) {
                        var3 = arg1.method717(8, false);
                    } else {
                        var3 = arg1.method717(11, false);
                    }
                } else {
                    var3 = arg1.method717(5, false);
                }
            } else {
                var3 = 0;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(I)V")
    public static void method2554(int arg0) {
        if (arg0 != 4) {
            method2554(58);
        }
        field6065 = null;
        field6043 = null;
        field6063 = null;
        field6064 = null;
        field6053 = null;
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Ldh;")
    public static final class227 method2555(int arg0) {
        ++field6045;
        if (class223.field3386 != null && class164.field2290 != null) {
            if (arg0 > -46) {
                field6063 = null;
            }
            class164.field2290.method1060(class223.field3386, 3);
            class227 var1 = (class227) class164.field2290.method1064(1);
            if (var1 == null) {
                return null;
            } else {
                class228 var2 = class20.method125(var1.field3437, 36);
                return var2 != null && var2.field3450 && var2.method1387(79) ? var1 : class99.method635(-12037);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field6044;
        if (arg1 != 1) {
            method2556(32L, (byte) -90);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field6055 = arg2.method2343(255);
            } else {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field6056 = this.field6054 = arg2.method2343(255);
                        return;
                    }
                    if (arg0 == 4) {
                        this.field6057 = arg2.method2343(255);
                        return;
                    }
                    if (~arg0 == -6) {
                        this.field6056 = arg2.method2343(255);
                        return;
                    }
                    if (arg0 == 6) {
                        this.field6054 = arg2.method2343(255);
                        return;
                    }
                } else {
                    this.field6047 = arg2.method2327((byte) -116);
                    if (this.field6047 < 0) {
                        this.field6042 = new short[this.field6055];
                        for (int var5 = 0; ~this.field6055 < ~var5; ++var5) {
                            this.field6042[var5] = (short) arg2.method2327((byte) -116);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field6058 = arg2.method2343(arg1 ^ 254) == 1;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(JB)V")
    public static final void method2556(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 < 96) {
                field6063 = null;
            }
        } catch (InterruptedException var3) {
        }
        ++field6060;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIII)I")
    private final int method2557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6059;
        int var8 = arg4 >> 12;
        int var9 = var8 - -1;
        int var10 = arg4 & 4095;
        int var11 = var8 & 255;
        if (~arg3 >= ~var9) {
            var9 = 0;
        }
        if (arg6 <= 63) {
            method2554(84);
        }
        int var12 = var9 & 255;
        int var13 = var10 - 4096;
        int var14 = arg0 - 4096;
        int var15 = this.field6050[var11 - -arg2] & 3;
        int var16 = class459.field6797[var10];
        int var17;
        if (~var15 >= -2) {
            var17 = var15 != 0 ? -var10 + arg0 : arg0 + var10;
        } else {
            var17 = var15 != 2 ? -arg0 + -var10 : -arg0 + var10;
        }
        int var18 = 3 & this.field6050[arg2 + var12];
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? arg0 + var13 : -var13 + arg0;
        } else {
            var19 = var18 != 2 ? -var13 - arg0 : var13 - arg0;
        }
        int var20 = this.field6050[arg1 + var11] & 3;
        int var21 = ((-var17 + var19) * var16 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = ~var20 == -1 ? var10 + var14 : -var10 + var14;
        } else {
            var22 = ~var20 != -3 ? -var10 + -var14 : -var14 + var10;
        }
        int var23 = 3 & this.field6050[arg1 + var12];
        int var24;
        if (~var23 >= -2) {
            var24 = ~var23 != -1 ? -var13 + var14 : var13 - -var14;
        } else {
            var24 = var23 == 2 ? -var14 + var13 : -var13 + -var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg5 >> 12);
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(B)V")
    private final void method2558(byte arg0) {
        if (~this.field6047 >= -1) {
            if (this.field6042 != null && this.field6042.length == this.field6055) {
                this.field6046 = new short[this.field6055];
                for (int var2 = 0; var2 < this.field6055; ++var2) {
                    this.field6046[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field6046 = new short[this.field6055];
            this.field6042 = new short[this.field6055];
            for (int var3 = 0; this.field6055 > var3; ++var3) {
                this.field6042[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field6047 / 4096.0F), (double) var3)));
                this.field6046[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 == 125) {
            ++field6051;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II[I)V")
    public final void method2559(int arg0, int arg1, int[] arg2) {
        ++field6048;
        int var4 = class160.field2210[arg0] * this.field6054;
        if (arg1 < 103) {
            this.field6056 = 103;
        }
        if (this.field6055 == 1) {
            short var5 = this.field6042[0];
            int var6 = this.field6046[0] << 12;
            int var7 = this.field6054 * var6 >> 12;
            int var8 = this.field6056 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            if (var11 >= var7) {
                var11 = 0;
            }
            int var12 = var9 & 4095;
            int var13 = this.field6050[255 & var11] & 255;
            int var14 = class459.field6797[var12];
            int var15 = 255 & this.field6050[var10 & 255];
            if (this.field6058) {
                for (int var16 = 0; class440.field6474 > var16; ++var16) {
                    int var17 = class6.field73[var16] * this.field6056;
                    int var18 = this.method2557(var12, var13, var15, var8, var6 * var17 >> 12, var14, 100);
                    int var19 = var5 * var18 >> 12;
                    arg2[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class440.field6474; ++var20) {
                    int var21 = class6.field73[var20] * this.field6056;
                    int var22 = this.method2557(var12, var13, var15, var8, var6 * var21 >> 12, var14, 95);
                    arg2[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field6042[0];
            if (var23 > 8 || ~var23 > 7) {
                int var24 = this.field6046[0] << 12;
                int var25 = this.field6056 * var24 >> 12;
                int var26 = this.field6054 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 - -1;
                int var30 = var27 & 4095;
                if (~var29 <= ~var26) {
                    var29 = 0;
                }
                int var31 = class459.field6797[var30];
                int var32 = this.field6050[var29 & 255] & 255;
                int var33 = 255 & this.field6050[255 & var28];
                for (int var34 = 0; ~class440.field6474 < ~var34; ++var34) {
                    int var54 = class6.field73[var34] * this.field6056;
                    int var55 = this.method2557(var30, var32, var33, var25, var24 * var54 >> 12, var31, 66);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field6055; ++var35) {
                short var36 = this.field6042[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field6046[var35] << 12;
                    int var38 = this.field6056 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = this.field6054 * var37 >> 12;
                    int var41 = var39 >> 12;
                    int var42 = var41 + 1;
                    if (var42 >= var40) {
                        var42 = 0;
                    }
                    int var43 = var39 & 4095;
                    int var44 = class459.field6797[var43];
                    int var45 = this.field6050[var41 & 255] & 255;
                    int var46 = this.field6050[255 & var42] & 255;
                    if (this.field6058 && this.field6055 - 1 == var35) {
                        for (int var47 = 0; class440.field6474 > var47; ++var47) {
                            int var48 = class6.field73[var47] * this.field6056;
                            int var49 = this.method2557(var43, var46, var45, var38, var37 * var48 >> 12, var44, 90);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; class440.field6474 > var51; ++var51) {
                            int var52 = class6.field73[var51] * this.field6056;
                            int var53 = this.method2557(var43, var46, var45, var38, var37 * var52 >> 12, var44, 77);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
    public class407() {
        super(0, true);
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        this.field6050 = class26.method160(this.field6057, -26541);
        ++field6061;
        this.method2558((byte) 125);
        for (int var2 = this.field6055 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field6042[var2];
            if (var3 > 8 || ~var3 > 7) {
                break;
            }
            --this.field6055;
        }
        if (arg0 < 103) {
            method2553(-46, (class119) null);
        }
    }

    static {
        new class151("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field6053 = new class452(25, 5);
        field6063 = new class452(83, 20);
        field6064 = new class151("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
        field6066 = 0;
    }
}
