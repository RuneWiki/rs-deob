import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class641 extends class145 {

    @OriginalMember(owner = "client!kn", name = "E", descriptor = "I")
    private int field9237 = 0;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    private int field9243 = 2048;

    @OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
    private int field9248 = 10;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "Llk;")
    public static class510 field9242 = new class510();

    @OriginalMember(owner = "client!kn", name = "G", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!kn", name = "H", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "Lkea;")
    public static class203 field9246;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "[I")
    private int[] field9245;

    @OriginalMember(owner = "client!kn", name = "Q", descriptor = "[I")
    private int[] field9247;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        int var2 = 106 / ((-46 - arg0) / 45);
        ++field9244;
        this.method3654((byte) 127);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    private final void method3654(byte arg0) {
        ++field9240;
        this.field9245 = new int[this.field9248 + 1];
        this.field9247 = new int[this.field9248 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field9248;
        int var4 = this.field9243 * var3 >> 12;
        for (int var5 = 0; ~this.field9248 < ~var5; ++var5) {
            this.field9247[var5] = var2;
            this.field9245[var5] = var2 + var4;
            var2 += var3;
        }
        int var6 = 95 / ((arg0 - 87) / 39);
        this.field9247[this.field9248] = 4096;
        this.field9245[this.field9248] = this.field9245[0] + 4096;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLqf;II)V")
    public static final void method3655(byte arg0, class593 arg1, int arg2, int arg3) {
        int var4 = -28 / ((arg0 - 51) / 51);
        if (arg1.field8562 == 0) {
            arg1.field8586 = arg1.field8583;
        } else if (~arg1.field8562 != -2) {
            if (~arg1.field8562 != -3) {
                if (~arg1.field8562 == -4) {
                    arg1.field8586 = arg1.field8583 * arg3 >> 14;
                } else if (arg1.field8562 != 4) {
                    arg1.field8586 = -arg1.field8570 + arg3 + -(arg1.field8583 * arg3 >> 14);
                } else {
                    arg1.field8586 = (arg1.field8583 * arg3 >> 14) + (-arg1.field8570 + arg3) / 2;
                }
            } else {
                arg1.field8586 = -arg1.field8583 + -arg1.field8570 + arg3;
            }
        } else {
            arg1.field8586 = (arg3 - arg1.field8570) / 2 + arg1.field8583;
        }
        if (arg1.field8582 != 0) {
            if (arg1.field8582 == 1) {
                arg1.field8637 = (arg2 - arg1.field8518) / 2 + arg1.field8619;
            } else if (~arg1.field8582 != -3) {
                if (arg1.field8582 == 3) {
                    arg1.field8637 = arg1.field8619 * arg2 >> 14;
                } else if (~arg1.field8582 == -5) {
                    arg1.field8637 = (arg1.field8619 * arg2 >> 14) + (arg2 - arg1.field8518) / 2;
                } else {
                    arg1.field8637 = arg2 - ((arg1.field8619 * arg2 >> 14) + arg1.field8518);
                }
            } else {
                arg1.field8637 = -arg1.field8619 + arg2 + -arg1.field8518;
            }
        } else {
            arg1.field8637 = arg1.field8619;
        }
        ++field9238;
        if (class541.field7761) {
            if (~client.method1682(arg1).field3798 != -1 || ~arg1.field8507 == -1) {
                if (~arg1.field8586 <= -1) {
                    if (arg3 < arg1.field8586 + arg1.field8570) {
                        arg1.field8586 = -arg1.field8570 + arg3;
                    }
                } else {
                    arg1.field8586 = 0;
                }
                if (arg1.field8637 >= 0) {
                    if (arg1.field8637 + arg1.field8518 > arg2) {
                        arg1.field8637 = arg2 - arg1.field8518;
                        return;
                    }
                } else {
                    arg1.field8637 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V")
    public static void method3656(byte arg0) {
        field9246 = null;
        field9242 = null;
        int var1 = 59 % ((arg0 - -27) / 48);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field9237 = arg2.method1177(255);
                }
            } else {
                this.field9243 = arg2.method1220(122);
            }
        } else {
            this.field9248 = arg2.method1177(255);
        }
        if (arg1 >= -67) {
            this.method3654((byte) -53);
        }
        ++field9239;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
    public class641() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field9241;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = class573.field8270[arg1];
            if (~this.field9237 != -1) {
                for (int var5 = 0; var5 < class647.field9368; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class601.field8779[var5];
                    int var9 = this.field9237;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(-4096 - (-var4 - var8) >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field9248; ++var10) {
                        if (~var6 <= ~this.field9247[var10] && var6 < this.field9247[var10 + 1]) {
                            if (this.field9245[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field9248 > var12; ++var12) {
                    if (this.field9247[var12] <= var4 && ~var4 > ~this.field9247[var12 + 1]) {
                        if (this.field9245[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class210.method1331(var3, 0, class647.field9368, var11);
            }
        }
        if (arg0) {
            field9246 = null;
        }
        return var3;
    }

    static {
        new class474("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
    }
}
