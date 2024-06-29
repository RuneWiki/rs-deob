import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class207 extends class145 {

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    private int field2774 = 4096;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    private int field2779 = 3216;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    private int field2783 = 3216;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "[I")
    private int[] field2770 = new int[3];

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "Lea;")
    public static class474 field2772 = new class474("Your friends list is full, max of 200 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (200 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 200 para usuários não pagantes, e 200 para membros.");

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "[[Z")
    public static boolean[][] field2780 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "[[[J")
    public static long[][][] field2784;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(Z)V")
    public static void method1320(boolean arg0) {
        if (!arg0) {
            field2780 = null;
        }
        field2784 = null;
        field2780 = null;
        field2772 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(FB)F")
    public static final float method1321(float arg0, byte arg1) {
        ++field2776;
        if (arg1 != -2) {
            method1321(1.2611994F, (byte) -81);
        }
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F + -15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "(I)V")
    private final void method1322(int arg0) {
        ++field2782;
        int var2 = -84 % ((-68 - arg0) / 32);
        double var3 = Math.cos((double) ((float) this.field2783 / 4096.0F));
        this.field2770[0] = (int) (Math.sin((double) ((float) this.field2779 / 4096.0F)) * var3 * 4096.0D);
        this.field2770[1] = (int) (4096.0D * Math.cos((double) ((float) this.field2779 / 4096.0F)) * var3);
        this.field2770[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2783 / 4096.0F)));
        int var5 = this.field2770[0] * this.field2770[0] >> 12;
        int var6 = this.field2770[1] * this.field2770[1] >> 12;
        int var7 = this.field2770[2] * this.field2770[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 - (-var6 + -var7) >> 12)) * 4096.0D);
        if (~var8 != -1) {
            this.field2770[1] = (this.field2770[1] << 12) / var8;
            this.field2770[2] = (this.field2770[2] << 12) / var8;
            this.field2770[0] = (this.field2770[0] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field2778;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2783 = arg2.method1220(117);
                }
            } else {
                this.field2779 = arg2.method1220(-82);
            }
        } else {
            this.field2774 = arg2.method1220(-43);
        }
        if (arg1 > -67) {
            this.field2774 = -119;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class207() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1323(int arg0, String arg1) {
        ++field2773;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg1.length();
            while (var3 > var2 && class652.method3719(arg1.charAt(var2), 121)) {
                ++var2;
            }
            while (var3 > var2 && class652.method3719(arg1.charAt(var3 - 1), 124)) {
                --var3;
            }
            int var4 = var3 - var2;
            if (var4 >= 1 && var4 <= 12) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; var6 < var3; ++var6) {
                    char var7 = arg1.charAt(var6);
                    if (class507.method3024((byte) 54, var7)) {
                        char var8 = class27.method159(arg0 ^ -32640, var7);
                        if (var8 != 0) {
                            var5.append(var8);
                        }
                    }
                }
                if (arg0 != 32682) {
                    method1323(55, (String) null);
                }
                if (var5.length() == 0) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field2775;
        if (arg0) {
            this.method1322(-28);
        }
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = class192.field2527 * this.field2774 >> 12;
            int[] var5 = this.method865(0, arg1 - 1 & class444.field6649, (byte) 72);
            int[] var6 = this.method865(0, arg1, (byte) -40);
            int[] var7 = this.method865(0, arg1 + 1 & class444.field6649, (byte) 97);
            for (int var8 = 0; var8 < class647.field9368; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class619.field8980 & var8 + -1] + -var6[var8 - -1 & class619.field8980]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class608.field8881[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field2770[0] * var16 >> 12;
                int var18 = this.field2770[1] * var15 >> 12;
                int var19 = this.field2770[2] * var14 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.method1322(47);
        ++field2777;
        int var2 = 12 / ((-46 - arg0) / 45);
    }
}
