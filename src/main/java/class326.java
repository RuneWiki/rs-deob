import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class326 extends class404 {

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    private int field4887 = 81;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    private int field4890 = 0;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    private int field4893 = 409;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    private int field4898 = 4;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    private int field4896 = 1024;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    private int field4894 = 1024;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    private int field4903 = 204;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    private int field4891 = 8;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Lsk;")
    public static class423 field4883 = new class423("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Loe;")
    public static class127 field4904 = new class127(38, 9);

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    private int field4885;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    private int field4888;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    private int field4895;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
    private int[] field4889;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "[[I")
    private int[][] field4884;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "[[I")
    private int[][] field4901;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILha;I)V", line = 3)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field4886;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field4896 = arg1.method254((byte) -125);
                                    }
                                } else {
                                    this.field4887 = arg1.method254((byte) -103);
                                }
                            } else {
                                this.field4890 = arg1.method254((byte) -111);
                            }
                        } else {
                            this.field4894 = arg1.method254((byte) -95);
                        }
                    } else {
                        this.field4903 = arg1.method254((byte) -68);
                    }
                } else {
                    this.field4893 = arg1.method254((byte) -66);
                }
            } else {
                this.field4891 = arg1.method257((byte) 47);
            }
        } else {
            this.field4898 = arg1.method257((byte) 29);
        }
        if (arg0 != 0) {
            this.field4895 = 44;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 474)
    public class326() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V", line = 101)
    private final void method2033(int arg0) {
        ++field4902;
        Random var2 = new Random((long) this.field4891);
        this.field4888 = 4096 / this.field4898;
        this.field4895 = this.field4887 / 2;
        this.field4885 = 4096 / this.field4891;
        int var3 = this.field4888 / 2;
        this.field4884 = new int[this.field4891][this.field4898];
        int var4 = this.field4885 / 2;
        this.field4889 = new int[this.field4891 - -1];
        this.field4901 = new int[this.field4891][this.field4898 + 1];
        this.field4889[0] = 0;
        if (arg0 != -175922996) {
            this.field4887 = -88;
        }
        for (int var5 = 0; var5 < this.field4891; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field4885;
                int var7 = (class482.method2911((byte) 45, 4096, var2) - 2048) * this.field4903 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4889[var5] = this.field4889[var5 + -1] + var8;
            }
            this.field4901[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4898; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field4888;
                    int var11 = (class482.method2911((byte) 45, 4096, var2) - 2048) * this.field4893 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4901[var5][var9] = this.field4901[var5][var9 + -1] + var12;
                }
                this.field4884[var5][var9] = this.field4896 > 0 ? 4096 - class482.method2911((byte) 45, this.field4896, var2) : 4096;
            }
            this.field4901[var5][this.field4898] = 4096;
        }
        this.field4889[this.field4891] = 4096;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I", line = 169)
    public final int[] method90(int arg0, int arg1) {
        ++field4897;
        int[] var3 = super.field5870.method372(arg1, (byte) 97);
        if (super.field5870.field810) {
            int var4 = 0;
            int var5;
            for (var5 = class289.field4381[arg1] - -this.field4890; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field4891 && var5 >= this.field4889[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field4889[var4];
            int var9 = this.field4889[var4 + -1];
            if (this.field4895 + var9 < var5 && var5 < -this.field4895 + var8) {
                for (int var10 = 0; var10 < class431.field6348; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field4894 : -this.field4894;
                    int var13;
                    for (var13 = (this.field4888 * var12 >> 12) + class167.field2594[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field4898 > var11 && this.field4901[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field4901[var6][var14];
                    int var16 = this.field4901[var6][var11];
                    if (var15 - -this.field4895 < var13 && ~(-this.field4895 + var16) < ~var13) {
                        var3[var10] = this.field4884[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class356.method2179(var3, 0, class431.field6348, 0);
            }
        }
        if (arg0 >= -47) {
            this.field4893 = 45;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLgf;Lod;Lqq;)V", line = 277)
    public static final void method2034(byte arg0, class173 arg1, class334 arg2, class318 arg3) {
        ++field4892;
        class154 var4 = arg1.method1086(arg0 ^ 77, arg3);
        if (var4 != null) {
            int var5 = var4.method1001();
            if (~var4.method993() < ~var5) {
                var5 = var4.method993();
            }
            byte var6 = 10;
            int var7 = arg2.field4983;
            int var8 = arg2.field4993;
            int var9 = 0;
            if (arg0 != 50) {
                method2034((byte) -2, (class173) null, (class334) null, (class318) null);
            }
            int var10 = 0;
            int var11 = 0;
            if (arg1.field2702 != null) {
                var9 = class121.field2015.method2355(class481.field7349, (byte) 96, (int[]) null, arg1.field2702, (class154[]) null);
                for (int var12 = 0; ~var12 > ~var9; ++var12) {
                    String var13 = class481.field7349[var12];
                    if (var12 < var9 + -1) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class7.field87.method1415(var13);
                    if (~var10 > ~var14) {
                        var10 = var14;
                    }
                }
                var11 = class7.field87.method1417() * var9 + class7.field87.method1413() / 2;
            }
            int var15 = arg2.field4983 - -(var5 / 2);
            if (var7 < class492.field7483 + var5) {
                var7 = class492.field7483;
                var15 = var5 / 2 + var10 / 2 + class492.field7483 + var6 + 5;
            } else if (~var7 < ~(-var5 + class492.field7501)) {
                var15 = class492.field7501 - var5 / 2 + -(var10 / 2) - 5 + -var6;
                var7 = -var5 + class492.field7501;
            }
            int var16 = arg2.field4993;
            if (class492.field7495 + var5 <= var8) {
                if (~(-var5 + class492.field7496) > ~var8) {
                    var16 = class492.field7496 - var5 / 2 + (-var6 - var11);
                    var8 = -var5 + class492.field7496;
                }
            } else {
                var8 = class492.field7495;
                var16 = class492.field7495 - -(var5 / 2) + var6;
            }
            int var17 = 65535 & (int) (Math.atan2((double) (var7 - arg2.field4983), (double) (var8 - arg2.field4993)) / 3.141592653589793D * 32767.0D);
            var4.method999((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg1.field2702 != null) {
                var19 = var16;
                var18 = var15 + -5 + -(var10 / 2);
                var21 = var16 - -(class7.field87.method1417() * var9) - -3;
                var20 = var10 + 10 + var18;
                if (arg1.field2687 != 0) {
                    arg3.method1943(var18, arg1.field2687, var16, -var16 + var21, 1, -var18 + var20);
                }
                if (~arg1.field2695 != -1) {
                    arg3.method1920(-var18 + var20, arg1.field2695, var18, var21 - var16, 22437, var16);
                }
                for (int var22 = 0; var9 > var22; ++var22) {
                    String var23 = class481.field7349[var22];
                    if (~var22 > ~(var9 - 1)) {
                        var23 = var23.substring(0, -4 + var23.length());
                    }
                    class7.field87.method1412(arg3, var23, var15, var16, arg1.field2673, true);
                    var16 += class7.field87.method1417();
                }
            }
            if (~arg1.field2689 != 0 || arg1.field2702 != null) {
                int var24 = var5 >> 1;
                class25 var25 = new class25(arg2);
                var25.field329 = -var24 + var8;
                var25.field334 = var7 + var24;
                var25.field336 = var7 - var24;
                var25.field324 = var8 + var24;
                var25.field337 = var20;
                var25.field330 = var18;
                var25.field333 = var19;
                var25.field322 = var21;
                class177.field2772.method4(1, var25);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V", line = 445)
    public final void method211(int arg0) {
        ++field4899;
        this.method2033(arg0 + -175922993);
        if (arg0 != -3) {
            method2034((byte) -10, (class173) null, (class334) null, (class318) null);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 463)
    public static void method2035(byte arg0) {
        if (arg0 < -71) {
            field4904 = null;
            field4883 = null;
        }
    }
}
