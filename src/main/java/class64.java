import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class64 extends class354 {

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
    public int field913 = 4;

    @OriginalMember(owner = "client!qu", name = "S", descriptor = "I")
    public int field919 = 4;

    @OriginalMember(owner = "client!qu", name = "W", descriptor = "I")
    public int field923 = 1638;

    @OriginalMember(owner = "client!qu", name = "X", descriptor = "Z")
    public boolean field924 = true;

    @OriginalMember(owner = "client!qu", name = "V", descriptor = "[B")
    private byte[] field922 = new byte[512];

    @OriginalMember(owner = "client!qu", name = "ab", descriptor = "I")
    public int field927 = 0;

    @OriginalMember(owner = "client!qu", name = "U", descriptor = "I")
    public int field921 = 4;

    @OriginalMember(owner = "client!qu", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field918 = new String[200];

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!qu", name = "N", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!qu", name = "O", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!qu", name = "T", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!qu", name = "Z", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!qu", name = "bb", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!qu", name = "P", descriptor = "[S")
    private short[] field916;

    @OriginalMember(owner = "client!qu", name = "Y", descriptor = "[S")
    private short[] field925;

    static {
        new class446("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V", line = 26)
    public class64() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "(I)V", line = 15)
    public static void method460(int arg0) {
        field918 = null;
        if (arg0 != -31996) {
            method460(30);
        }
    }

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "(I)V", line = 32)
    private final void method461(int arg0) {
        if (arg0 >= this.field923) {
            if (this.field916 != null && this.field916.length == this.field919) {
                this.field925 = new short[this.field919];
                for (int var2 = 0; ~this.field919 < ~var2; ++var2) {
                    this.field925[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field925 = new short[this.field919];
            this.field916 = new short[this.field919];
            for (int var3 = 0; ~var3 > ~this.field919; ++var3) {
                this.field916[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field923 / 4096.0F), (double) var3)));
                this.field925[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field915;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ[I)V", line = 69)
    public final void method462(int arg0, boolean arg1, int[] arg2) {
        ++field928;
        int var4 = class350.field5392[arg0] * this.field921;
        if (arg1) {
            this.method270((byte) 113, -10);
        }
        if (~this.field919 != -2) {
            short var5 = this.field916[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field925[0] << 12;
                int var7 = this.field913 * var6 >> 12;
                int var8 = this.field921 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                int var12 = var9 & 4095;
                if (~var11 <= ~var8) {
                    var11 = 0;
                }
                int var13 = this.field922[var11 & 255] & 255;
                int var14 = this.field922[255 & var10] & 255;
                int var15 = class533.field7845[var12];
                for (int var16 = 0; class531.field7814 > var16; ++var16) {
                    int var36 = class195.field2616[var16] * this.field913;
                    int var37 = this.method463(var7, var14, var13, var15, var6 * var36 >> 12, var12, (byte) 106);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~var17 > ~this.field919; ++var17) {
                short var18 = this.field916[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field925[var17] << 12;
                    int var20 = this.field921 * var19 >> 12;
                    int var21 = this.field913 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = var23 - -1;
                    if (~var24 <= ~var20) {
                        var24 = 0;
                    }
                    int var25 = var22 & 4095;
                    int var26 = this.field922[255 & var24] & 255;
                    int var27 = this.field922[255 & var23] & 255;
                    int var28 = class533.field7845[var25];
                    if (this.field924 && this.field919 + -1 == var17) {
                        for (int var29 = 0; ~var29 > ~class531.field7814; ++var29) {
                            int var30 = class195.field2616[var29] * this.field913;
                            int var31 = this.method463(var21, var27, var26, var28, var19 * var30 >> 12, var25, (byte) 108);
                            int var32 = arg2[var29] - -(var18 * var31 >> 12);
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class531.field7814; ++var33) {
                            int var34 = class195.field2616[var33] * this.field913;
                            int var35 = this.method463(var21, var27, var26, var28, var19 * var34 >> 12, var25, (byte) 104);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field925[0] << 12;
            short var39 = this.field916[0];
            int var40 = this.field913 * var38 >> 12;
            int var41 = var4 * var38 >> 12;
            int var42 = this.field921 * var38 >> 12;
            int var43 = var41 >> 12;
            int var44 = var43 - -1;
            if (~var42 >= ~var44) {
                var44 = 0;
            }
            int var45 = var41 & 4095;
            int var46 = 255 & this.field922[var43 & 255];
            int var47 = class533.field7845[var45];
            int var48 = 255 & this.field922[var44 & 255];
            if (this.field924) {
                for (int var49 = 0; ~class531.field7814 < ~var49; ++var49) {
                    int var50 = class195.field2616[var49] * this.field913;
                    int var51 = this.method463(var40, var46, var48, var47, var38 * var50 >> 12, var45, (byte) 99);
                    int var52 = var39 * var51 >> 12;
                    arg2[var49] = 2048 - -(var52 >> 1);
                }
            } else {
                for (int var53 = 0; ~class531.field7814 < ~var53; ++var53) {
                    int var54 = class195.field2616[var53] * this.field913;
                    int var55 = this.method463(var40, var46, var48, var47, var38 * var54 >> 12, var45, (byte) 116);
                    arg2[var53] = var39 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lnj;II)V", line = 229)
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field912;
        if (arg2 == 1638) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field919 = arg0.method1087(false);
                } else {
                    if (~arg1 != -3) {
                        if (~arg1 == -4) {
                            this.field913 = this.field921 = arg0.method1087(false);
                            return;
                        }
                        if (arg1 == 4) {
                            this.field927 = arg0.method1087(false);
                            return;
                        }
                        if (arg1 == 5) {
                            this.field913 = arg0.method1087(false);
                            return;
                        }
                        if (arg1 == 6) {
                            this.field921 = arg0.method1087(false);
                            return;
                        }
                    } else {
                        this.field923 = arg0.method1056(1024);
                        if (this.field923 < 0) {
                            this.field916 = new short[this.field919];
                            for (int var5 = 0; ~this.field919 < ~var5; ++var5) {
                                this.field916[var5] = (short) arg0.method1056(1024);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field924 = arg0.method1087(false) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIIB)I", line = 332)
    private final int method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field920;
        int var8 = arg4 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg4 & 4095;
        if (var9 >= arg0) {
            var9 = 0;
        }
        int var12 = arg5 + -4096;
        int var13 = var11 + -4096;
        int var14 = var9 & 255;
        if (arg6 < 95) {
            this.field919 = -22;
        }
        int var15 = 3 & this.field922[var10 - -arg1];
        int var16 = class533.field7845[var11];
        int var17;
        if (var15 > 1) {
            var17 = ~var15 == -3 ? var11 - arg5 : -var11 - arg5;
        } else {
            var17 = var15 != 0 ? -var11 + arg5 : arg5 + var11;
        }
        int var18 = this.field922[arg1 + var14] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? var13 - arg5 : -arg5 + -var13;
        } else {
            var19 = var18 == 0 ? arg5 + var13 : arg5 - var13;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = 3 & this.field922[arg2 + var10];
        int var22;
        if (var21 <= 1) {
            var22 = ~var21 != -1 ? -var11 + var12 : var11 + var12;
        } else {
            var22 = var21 != 2 ? -var11 + -var12 : -var12 + var11;
        }
        int var23 = 3 & this.field922[arg2 + var14];
        int var24;
        if (~var23 < -2) {
            var24 = var23 == 2 ? -var12 + var13 : -var12 + -var13;
        } else {
            var24 = ~var23 != -1 ? var12 - var13 : var12 + var13;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((-var20 + var25) * arg3 >> 12) + var20;
    }

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V", line = 418)
    public final void method357(int arg0) {
        this.field922 = class376.method2365((byte) -19, this.field927);
        if (arg0 <= 28) {
            this.field924 = true;
        }
        ++field926;
        this.method461(0);
        for (int var2 = this.field919 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field916[var2];
            if (var3 > 8) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field919;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(BI)[I", line = 456)
    public final int[] method270(byte arg0, int arg1) {
        ++field917;
        if (arg0 >= -74) {
            return null;
        } else {
            int[] var3 = super.field5478.method2522(arg1, 16863);
            if (super.field5478.field6213) {
                this.method462(arg1, false, var3);
            }
            return var3;
        }
    }
}
