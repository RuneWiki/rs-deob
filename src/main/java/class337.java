import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class337 extends class535 {

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    private int field4983 = 0;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    private int field4987 = 0;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    private int field4986 = 0;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "Lbd;")
    public static class44 field4995;

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "Lbd;")
    public static class44 field4999;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    private int field4981;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    private int field4988;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    private int field4991;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    private int field4992;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "I")
    private int field4997;

    @OriginalMember(owner = "client!nm", name = "Z", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!nm", name = "ab", descriptor = "[S")
    public static short[] field5001;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field4989;
        if (arg2 != -6232) {
            this.method2138(-94, -46, 103, true);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field4986 = (arg1.method3034((byte) -49) << 12) / 100;
                }
            } else {
                this.field4983 = (arg1.method3034((byte) 112) << 12) / 100;
            }
        } else {
            this.field4987 = arg1.method3044((byte) -99);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIZ)V")
    private final void method2138(int arg0, int arg1, int arg2, boolean arg3) {
        ++field4993;
        int var5 = ~arg0 <= ~arg1 ? arg0 : arg1;
        int var6 = arg2 > var5 ? arg2 : var5;
        int var7 = arg0 > arg1 ? arg1 : arg0;
        int var8 = ~arg2 <= ~var7 ? var7 : arg2;
        if (!arg3) {
            method2141(-19, 19, (byte[]) null, -73);
        }
        this.field4982 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (this.field4982 > 0 && ~this.field4982 > -4097) {
            this.field4988 = (var9 << 12) / (~this.field4982 < -2049 ? -(this.field4982 * 2) + 8192 : this.field4982 * 2);
        } else {
            this.field4988 = 0;
        }
        if (var9 > 0) {
            int var10 = (var6 - arg1 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (var6 - arg2 << 12) / var9;
            if (~arg1 != ~var6) {
                if (arg0 != var6) {
                    this.field4997 = arg1 == var8 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field4997 = arg2 != var8 ? -var12 + 12288 : var10 + 4096;
                }
            } else {
                this.field4997 = arg0 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field4997 /= 6;
        } else {
            this.field4997 = 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
    public static void method2139(int arg0) {
        if (arg0 != 4096) {
            field5001 = null;
        }
        field4999 = null;
        field4995 = null;
        field5001 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZI)V")
    private final void method2140(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field4987 = -81;
        }
        ++field4996;
        int var5 = arg0 <= 2048 ? (arg3 + 4096) * arg0 >> 12 : arg0 - -arg3 + -(arg0 * arg3 >> 12);
        if (~var5 >= -1) {
            this.field4991 = this.field4981 = this.field4992 = arg0;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg0 + arg0 - var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field4992 = var15;
                                    this.field4991 = var5;
                                    this.field4981 = var7;
                                }
                            } else {
                                this.field4981 = var7;
                                this.field4992 = var5;
                                this.field4991 = var14;
                            }
                        } else {
                            this.field4991 = var7;
                            this.field4992 = var5;
                            this.field4981 = var15;
                        }
                    } else {
                        this.field4981 = var5;
                        this.field4991 = var7;
                        this.field4992 = var14;
                    }
                } else {
                    this.field4992 = var7;
                    this.field4981 = var5;
                    this.field4991 = var15;
                }
            } else {
                this.field4981 = var14;
                this.field4991 = var5;
                this.field4992 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method2141(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field4985;
        char[] var4 = new char[arg0];
        int var5 = 0;
        if (arg1 != -1969) {
            field4995 = null;
        }
        for (int var6 = 0; var6 < arg0; ++var6) {
            int var7 = 255 & arg2[arg3 + var6];
            if (~var7 != -1) {
                if (~var7 <= -129 && var7 < 160) {
                    char var8 = class79.field1284[var7 - 128];
                    if (~var8 == -1) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class337() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        ++field4994;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[][] var4 = this.method3157((byte) 67, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class174.field2597 > var11; ++var11) {
                this.method2138(var6[var11], var5[var11], var7[var11], true);
                this.field4997 += this.field4987;
                this.field4988 += this.field4983;
                this.field4982 += this.field4986;
                while (this.field4997 < 0) {
                    this.field4997 += 4096;
                }
                while (this.field4997 > 4096) {
                    this.field4997 -= 4096;
                }
                if (this.field4988 < 0) {
                    this.field4988 = 0;
                }
                if (this.field4982 < 0) {
                    this.field4982 = 0;
                }
                if (this.field4988 > 4096) {
                    this.field4988 = 4096;
                }
                if (this.field4982 > 4096) {
                    this.field4982 = 4096;
                }
                this.method2140(this.field4982, this.field4997, true, this.field4988);
                var8[var11] = this.field4991;
                var9[var11] = this.field4981;
                var10[var11] = this.field4992;
            }
        }
        if (arg0 > -116) {
            this.field4987 = 81;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V")
    public static final void method2142(int arg0) {
        ++field4984;
        if (arg0 < -108) {
            if (class368.field5320 != class339.field5023) {
                try {
                    class325.method2066(class212.field3194, (byte) -82, "tbrefresh");
                } catch (Throwable var1) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(II)I")
    public static final int method2143(int arg0, int arg1) {
        int var2 = -8 % ((arg1 - -1) / 47);
        ++field4990;
        return arg0 & 255;
    }

    static {
        new class44("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field4995 = new class44(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");
        field4998 = -1;
        field4999 = new class44("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
    }
}
