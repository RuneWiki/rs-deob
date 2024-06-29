import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class208 extends class263 {

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "[I")
    private int[] field2998 = new int[3];

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    private int field3003 = 4096;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    private int field3006 = 4096;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    private int field2999 = 409;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    private int field3008 = 4096;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Lkq;")
    public static class78 field3004 = new class78("WTI", 5);

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "Ldp;")
    public static class347 field3007 = new class347("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lrm;III)V", line = 7)
    public static final void method1351(class79 arg0, int arg1, int arg2, int arg3) {
        long var4 = class98.field1508[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field1095 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field1092[arg0.field1095++] = class486.field7238[var8 - 1].field6794;
            var6 += 16L;
        }
        for (int var9 = arg0.field1095; var9 < 4; ++var9) {
            arg0.field1092[var9] = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 34)
    public class208() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V", line = 38)
    public static void method1352(int arg0) {
        field3004 = null;
        field3007 = null;
        if (arg0 != 1) {
            field3009 = -85;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IB)[[I", line = 51)
    public final int[][] method34(int arg0, byte arg1) {
        if (arg1 > -45) {
            field3004 = null;
        }
        ++field3005;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int[][] var4 = this.method1646(0, 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class367.field5597; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2998[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field2999) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2998[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field2999 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field2998[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field2999 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3008 * var12 >> 12;
                            var9[var11] = this.field3003 * var14 >> 12;
                            var10[var11] = this.field3006 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILfe;IZIZLfe;)I", line = 142)
    public static final int method1353(int arg0, class152 arg1, int arg2, boolean arg3, int arg4, boolean arg5, class152 arg6) {
        ++field3001;
        int var7 = class446.method2613(arg6, arg1, arg3, arg4, false);
        if (arg2 != 2) {
            method1352(119);
        }
        if (~var7 != -1) {
            return !arg3 ? var7 : -var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class446.method2613(arg6, arg1, arg5, arg0, false);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZLgk;)V", line = 184)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field3000;
        if (!arg1) {
            field3007 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method2759(1919914864);
                            this.field2998[1] = class140.method1023(4080, var5 >> 4);
                            this.field2998[2] = class140.method1023(0, var5 >> 12);
                            this.field2998[0] = class140.method1023(var5 << 4, 267386880);
                        }
                    } else {
                        this.field3008 = arg2.method2727((byte) 43);
                    }
                } else {
                    this.field3003 = arg2.method2727((byte) 43);
                }
            } else {
                this.field3006 = arg2.method2727((byte) 43);
            }
        } else {
            this.field2999 = arg2.method2727((byte) 43);
        }
    }
}
