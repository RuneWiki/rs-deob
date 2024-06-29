import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class450 extends class34 {

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    private int field6588 = 1024;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    private int field6593 = 81;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    private int field6586 = 8;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    private int field6597 = 204;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    private int field6600 = 1024;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    private int field6601 = 4;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    private int field6599 = 0;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    private int field6606 = 409;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "[I")
    public static int[] field6592 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!df", name = "M", descriptor = "[B")
    public static byte[] field6594 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Lkc;")
    public static class157 field6605;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    private int field6595;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    private int field6598;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    private int field6604;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "[I")
    private int[] field6602;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[[I")
    private int[][] field6589;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "[[I")
    private int[][] field6596;

    static {
        new class157("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field6605 = new class157("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)[I", line = 5)
    public final int[] method64(int arg0, byte arg1) {
        ++field6603;
        int[] var3 = super.field537.method1780(arg0, (byte) 65);
        int var4 = -7 / (-arg1 / 50);
        if (super.field537.field4191) {
            int var5 = 0;
            int var6;
            for (var6 = class284.field3856[arg0] - -this.field6599; var6 < 0; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (var5 < this.field6586 && var6 >= this.field6602[var5]) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = ~(var5 & 1) == -1;
            int var9 = this.field6602[var5];
            int var10 = this.field6602[var5 - 1];
            if (~var6 < ~(var10 - -this.field6604) && var6 < -this.field6604 + var9) {
                for (int var11 = 0; class383.field5502 > var11; ++var11) {
                    int var12 = 0;
                    int var13 = var8 ? this.field6600 : -this.field6600;
                    int var14;
                    for (var14 = (this.field6595 * var13 >> 12) + class91.field1463[var11]; ~var14 > -1; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (this.field6601 > var12 && ~var14 <= ~this.field6589[var7][var12]) {
                        ++var12;
                    }
                    int var15 = var12 - 1;
                    int var16 = this.field6589[var7][var15];
                    int var17 = this.field6589[var7][var12];
                    if (this.field6604 + var16 < var14 && ~var14 > ~(-this.field6604 + var17)) {
                        var3[var11] = this.field6596[var7][var15];
                    } else {
                        var3[var11] = 0;
                    }
                }
            } else {
                class57.method370(var3, 0, class383.field5502, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBIIII)Z", line = 106)
    public static final boolean method2643(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6591;
        int var6 = -103 / ((arg1 - 13) / 33);
        for (int var7 = arg0; ~arg3 <= ~var7; ++var7) {
            for (int var8 = arg2; arg4 >= var8; ++var8) {
                if (class217.field3086[var7][var8] == arg5 && class473.field6844[var7][var8] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V", line = 136)
    private final void method2644(int arg0) {
        ++field6585;
        Random var2 = new Random((long) this.field6586);
        this.field6604 = this.field6593 / 2;
        if (arg0 > -93) {
            this.method2644(78);
        }
        this.field6598 = 4096 / this.field6586;
        this.field6595 = 4096 / this.field6601;
        int var3 = this.field6595 / 2;
        this.field6589 = new int[this.field6586][this.field6601 + 1];
        this.field6596 = new int[this.field6586][this.field6601];
        int var4 = this.field6598 / 2;
        this.field6602 = new int[this.field6586 + 1];
        this.field6602[0] = 0;
        for (int var5 = 0; this.field6586 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field6598;
                int var7 = (class322.method1908(4096, -128, var2) + -2048) * this.field6597 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field6602[var5] = this.field6602[var5 + -1] + var8;
            }
            this.field6589[var5][0] = 0;
            for (int var9 = 0; var9 < this.field6601; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field6595;
                    int var11 = (class322.method1908(4096, -127, var2) - 2048) * this.field6606 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field6589[var5][var9] = this.field6589[var5][var9 + -1] - -var12;
                }
                this.field6596[var5][var9] = ~this.field6588 < -1 ? -class322.method1908(this.field6588, -127, var2) + 4096 : 4096;
            }
            this.field6589[var5][this.field6601] = 4096;
        }
        this.field6602[this.field6586] = 4096;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 200)
    public class450() {
        super(0, true);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V", line = 207)
    public final void method146(byte arg0) {
        ++field6590;
        this.method2644(-106);
        if (arg0 > -84) {
            method2645((byte) 98);
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V", line = 228)
    public static void method2645(byte arg0) {
        field6605 = null;
        field6594 = null;
        int var1 = -24 / ((-14 - arg0) / 44);
        field6592 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lsv;II)V", line = 266)
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field6587;
        if (arg1 < 16) {
            this.method146((byte) 30);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 == 7) {
                                        this.field6588 = arg0.method1844(-106);
                                    }
                                } else {
                                    this.field6593 = arg0.method1844(-105);
                                }
                            } else {
                                this.field6599 = arg0.method1844(-118);
                            }
                        } else {
                            this.field6600 = arg0.method1844(-125);
                        }
                    } else {
                        this.field6597 = arg0.method1844(-113);
                    }
                } else {
                    this.field6606 = arg0.method1844(-120);
                }
            } else {
                this.field6586 = arg0.method1869(-95);
            }
        } else {
            this.field6601 = arg0.method1869(-70);
        }
    }
}
