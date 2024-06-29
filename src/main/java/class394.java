import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class394 extends class62 {

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
    private int field5413 = 2048;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
    private int field5414 = 0;

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "I")
    private int field5420 = 10;

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "[I")
    public static int[] field5418 = new int[50];

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "Z")
    public static boolean field5425;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "Llt;")
    public static class581 field5426;

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "Lkr;")
    public static class636 field5424;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "[I")
    private int[] field5415;

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "[I")
    private int[] field5423;

    static {
        new class572("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field5425 = false;
    }

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V", line = 3)
    public final void method395(int arg0) {
        ++field5421;
        this.method2341((byte) -122);
        if (arg0 > -37) {
            this.method13(-66, -118);
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)[I", line = 18)
    public final int[] method13(int arg0, int arg1) {
        ++field5417;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            int var4 = class309.field4265[arg0];
            if (this.field5414 != 0) {
                for (int var5 = 0; ~class438.field5847 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class200.field2965[var5];
                    int var9 = this.field5414;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var4 - (4096 - var8) >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field5420 > var10; ++var10) {
                        if (~this.field5423[var10] >= ~var6 && this.field5423[var10 + 1] > var6) {
                            if (~var6 > ~this.field5415[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field5420; ++var12) {
                    if (~var4 <= ~this.field5423[var12] && ~var4 > ~this.field5423[var12 + 1]) {
                        if (~var4 > ~this.field5415[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class648.method3739(var3, 0, class438.field5847, var11);
            }
        }
        return arg1 != 656024161 ? null : var3;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V", line = 187)
    public class394() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lgw;II)V", line = 138)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field5416;
        if (arg1 != -1) {
            method2339((byte) -39);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field5414 = arg0.method1032((byte) -33);
                }
            } else {
                this.field5413 = arg0.method1045(true);
            }
        } else {
            this.field5420 = arg0.method1032((byte) -33);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 194)
    public static final void method2339(byte arg0) {
        ++field5422;
        class633 var1 = null;
        try {
            class21 var2 = class442.field5896.method2019("2", true, true);
            while (var2.field202 == 0) {
                class236.method1513(true, 1L);
            }
            if (~var2.field202 == -2) {
                var1 = (class633) var2.field201;
                byte[] var3 = new byte[(int) var1.method3686(-127)];
                int var5;
                for (int var4 = 0; ~var3.length < ~var4; var4 += var5) {
                    var5 = var1.method3683(113, var3.length + -var4, var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class509.method3031(3, new class148(var3));
            }
        } catch (Exception var7) {
        }
        if (arg0 < 76) {
            field5424 = null;
        }
        try {
            if (var1 != null) {
                var1.method3685(-5948);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "(I)V", line = 243)
    public static void method2340(int arg0) {
        field5426 = null;
        field5424 = null;
        if (arg0 == 10) {
            field5418 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V", line = 257)
    private final void method2341(byte arg0) {
        ++field5419;
        if (arg0 > -104) {
            method2340(38);
        }
        this.field5415 = new int[this.field5420 + 1];
        this.field5423 = new int[this.field5420 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field5420;
        int var4 = this.field5413 * var3 >> 12;
        for (int var5 = 0; var5 < this.field5420; ++var5) {
            this.field5423[var5] = var2;
            this.field5415[var5] = var2 + var4;
            var2 += var3;
        }
        this.field5423[this.field5420] = 4096;
        this.field5415[this.field5420] = this.field5415[0] + 4096;
    }
}
