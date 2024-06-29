import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class33 extends class243 {

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    private int field538 = 8;

    @OriginalMember(owner = "client!fi", name = "lb", descriptor = "I")
    private int field543 = 4;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    private int field531 = 204;

    @OriginalMember(owner = "client!fi", name = "nb", descriptor = "I")
    private int field545 = 409;

    @OriginalMember(owner = "client!fi", name = "ob", descriptor = "I")
    private int field546 = 0;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
    private int field536 = 1024;

    @OriginalMember(owner = "client!fi", name = "sb", descriptor = "I")
    private int field550 = 81;

    @OriginalMember(owner = "client!fi", name = "tb", descriptor = "I")
    private int field551 = 1024;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "[I")
    public static int[] field534 = new int[2];

    @OriginalMember(owner = "client!fi", name = "kb", descriptor = "Lub;")
    public static class227 field542 = class257.method1749("Starte 3D)2Softwarebibliothek)3", 17263);

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!fi", name = "mb", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!fi", name = "rb", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!fi", name = "ub", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!fi", name = "vb", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!fi", name = "wb", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!fi", name = "pb", descriptor = "Lnh;")
    public static class57 field547;

    @OriginalMember(owner = "client!fi", name = "qb", descriptor = "[I")
    private int[] field548;

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "[[I")
    private int[][] field540;

    @OriginalMember(owner = "client!fi", name = "jb", descriptor = "[[I")
    private int[][] field541;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        ++field554;
        this.method175((byte) 121);
        if (arg0) {
            field534 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)V")
    public static void method171(boolean arg0) {
        field547 = null;
        field542 = null;
        field534 = null;
        if (arg0) {
            field542 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ID)V")
    public static final void method172(int arg0, double arg1) {
        if (arg0 <= 96) {
            method173((class4) null, -111, 59, -86, -72, 78, 63);
        }
        if (class148.field2590 != arg1) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class52.field926[var3] = ~var4 >= -256 ? var4 : 255;
            }
            class148.field2590 = arg1;
        }
        ++field533;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lja;IIIIII)V")
    public static final void method173(class4 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class88.method527(arg0.field50, arg0.field99, arg1, arg5, arg2, arg3 + -1, arg6, arg4);
        ++field530;
        if (arg3 != 1) {
            method174(-32, (class195) null, 109, 52);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILld;II)V")
    public static final void method174(int arg0, class195 arg1, int arg2, int arg3) {
        ++field535;
        if (~arg1.field101 == ~arg0 && arg0 != -1) {
            class51 var4 = class25.method127(true, arg0);
            int var5 = var4.field896;
            if (~var5 == -2) {
                arg1.field95 = 0;
                arg1.field60 = arg3;
                arg1.field85 = 0;
                arg1.field52 = 0;
                class67.method421(128, var4, arg1.field99, arg1.field50, arg1.field52, false);
            }
            if (var5 == 2) {
                arg1.field85 = 0;
            }
        } else if (~arg0 == 0 || arg1.field101 == -1 || class25.method127(true, arg0).field897 >= class25.method127(true, arg1.field101).field897) {
            arg1.field76 = arg1.field111;
            arg1.field60 = arg3;
            arg1.field85 = 0;
            arg1.field95 = 0;
            arg1.field52 = 0;
            arg1.field101 = arg0;
            if (arg1.field101 != -1) {
                class67.method421(128, class25.method127(true, arg1.field101), arg1.field99, arg1.field50, arg1.field52, false);
            }
        }
        if (arg2 != 0) {
            method171(false);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int[] var3 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int var4 = 0;
            int var5;
            for (var5 = class148.field2582[arg1] + this.field546; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field538 < ~var4 && this.field548[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 - 1;
            int var7 = this.field548[var4 + -1];
            int var8 = this.field548[var4];
            boolean var9 = (1 & var4) == 0;
            if (var5 > var7 - -this.field549 && -this.field549 + var8 > var5) {
                for (int var10 = 0; ~class212.field3586 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var9 ? -this.field551 : this.field551;
                    int var13;
                    for (var13 = (this.field537 * var12 >> 12) + class212.field3585[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field543 > var11 && ~var13 <= ~this.field540[var6][var11]) {
                        ++var11;
                    }
                    int var14 = this.field540[var6][var11];
                    int var15 = var11 + -1;
                    int var16 = this.field540[var6][var15];
                    if (~(this.field549 + var16) > ~var13 && ~(-this.field549 + var14) < ~var13) {
                        var3[var10] = this.field541[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class68.method425(var3, 0, class212.field3586, 0);
            }
        }
        ++field552;
        int var17 = -43 / ((-15 - arg0) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class33() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    private final void method175(byte arg0) {
        ++field544;
        Random var2 = new Random((long) this.field538);
        this.field541 = new int[this.field538][this.field543];
        this.field549 = this.field550 / 2;
        this.field540 = new int[this.field538][this.field543 + 1];
        this.field553 = 4096 / this.field538;
        int var3 = -20 % ((72 - arg0) / 40);
        this.field537 = 4096 / this.field543;
        int var4 = this.field537 / 2;
        int var5 = this.field553 / 2;
        this.field548 = new int[this.field538 - -1];
        this.field548[0] = 0;
        for (int var6 = 0; this.field538 > var6; ++var6) {
            if (var6 > 0) {
                int var7 = this.field553;
                int var8 = (class210.method1342(-125, var2, 4096) - 2048) * this.field531 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field548[var6] = this.field548[var6 + -1] + var9;
            }
            this.field540[var6][0] = 0;
            for (int var10 = 0; ~this.field543 < ~var10; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field537;
                    int var12 = (-2048 + class210.method1342(8, var2, 4096)) * this.field545 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field540[var6][var10] = this.field540[var6][var10 - 1] + var13;
                }
                this.field541[var6][var10] = ~this.field536 < -1 ? 4096 - class210.method1342(-112, var2, this.field536) : 4096;
            }
            this.field540[var6][this.field543] = 4096;
        }
        this.field548[this.field538] = 4096;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)Z")
    public static final boolean method176(int arg0, int arg1) {
        ++field532;
        if (arg1 > -23) {
            return true;
        } else {
            return (1 & arg0 >> 29) != 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method172(-49, 0.7923508495168105D);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 == 7) {
                                        this.field536 = arg0.method1447(0);
                                    }
                                } else {
                                    this.field550 = arg0.method1447(0);
                                }
                            } else {
                                this.field546 = arg0.method1447(0);
                            }
                        } else {
                            this.field551 = arg0.method1447(0);
                        }
                    } else {
                        this.field531 = arg0.method1447(0);
                    }
                } else {
                    this.field545 = arg0.method1447(0);
                }
            } else {
                this.field538 = arg0.method1471(255);
            }
        } else {
            this.field543 = arg0.method1471(255);
        }
        ++field539;
    }
}
