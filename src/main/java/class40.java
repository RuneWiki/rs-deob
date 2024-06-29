import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class40 extends class89 {

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    private int field669 = 4096;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    private int field671 = 4096;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    private int field665 = 4096;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    private int field672 = 409;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "[I")
    private int[] field676 = new int[3];

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "[I")
    public static int[] field668 = new int[256];

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "Lda;")
    public static class275 field674 = class255.method1672(121, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 == -20503) {
            ++field675;
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (~arg2 == -5) {
                                int var5 = arg1.method598(109);
                                this.field676[2] = class19.method98(255, var5) >> 12;
                                this.field676[0] = class19.method98(var5, 16711680) << 4;
                                this.field676[1] = class19.method98(var5 >> 4, 4080);
                            }
                        } else {
                            this.field671 = arg1.method608(122);
                        }
                    } else {
                        this.field665 = arg1.method608(101);
                    }
                } else {
                    this.field669 = arg1.method608(114);
                }
            } else {
                this.field672 = arg1.method608(34);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lfd;I)V")
    public static final void method231(class229 arg0, int arg1) {
        if (arg1 == 0) {
            ++field667;
            if (~class5.field71 == ~arg0.field3982) {
                class200.field3418[arg0.field3977] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "(I)V")
    public static void method232(int arg0) {
        field674 = null;
        if (arg0 != 8474) {
            method231((class229) null, 52);
        }
        field668 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            method231((class229) null, -123);
        }
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int[][] var4 = this.method648(true, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; class65.field1070 > var11; ++var11) {
                int var12 = var7[var11];
                int var13 = -this.field676[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field672 < var13) {
                    var10[var11] = var12;
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field676[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field672 < var15) {
                        var10[var11] = var12;
                        var8[var11] = var14;
                        var9[var11] = var6[var11];
                    } else {
                        int var16 = var6[var11];
                        int var17 = var16 - this.field676[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field672 > ~var17) {
                            var10[var11] = var12;
                            var8[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var10[var11] = this.field671 * var12 >> 12;
                            var8[var11] = this.field665 * var14 >> 12;
                            var9[var11] = this.field669 * var16 >> 12;
                        }
                    }
                }
            }
        }
        ++field666;
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class40() {
        super(1, false);
    }
}
