import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class523 extends class354 {

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    private int field7684 = 0;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    private int field7696 = 81;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    private int field7694 = 204;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    private int field7701 = 4;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    private int field7692 = 1024;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    private int field7695 = 8;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    private int field7700 = 409;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    private int field7685 = 1024;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "Lof;")
    public static class446 field7689 = new class446("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    private int field7687;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    private int field7703;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    private int field7704;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "[I")
    private int[] field7697;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "[[I")
    private int[][] field7686;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "[[I")
    private int[][] field7699;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    private final void method3103(byte arg0) {
        ++field7702;
        Random var2 = new Random((long) this.field7695);
        this.field7703 = 4096 / this.field7701;
        this.field7704 = this.field7696 / 2;
        this.field7687 = 4096 / this.field7695;
        int var3 = this.field7703 / 2;
        int var4 = this.field7687 / 2;
        this.field7699 = new int[this.field7695][this.field7701 + 1];
        this.field7686 = new int[this.field7695][this.field7701];
        this.field7697 = new int[this.field7695 - -1];
        this.field7697[0] = 0;
        if (arg0 != 0) {
            method3107((class166) null, 56, 84, -89, -37, 3);
        }
        for (int var5 = 0; var5 < this.field7695; ++var5) {
            if (var5 > 0) {
                int var6 = this.field7687;
                int var7 = (class491.method2931(var2, Integer.MIN_VALUE, 4096) - 2048) * this.field7694 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field7697[var5] = this.field7697[var5 + -1] + var8;
            }
            this.field7699[var5][0] = 0;
            for (int var9 = 0; this.field7701 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field7703;
                    int var11 = (-2048 + class491.method2931(var2, Integer.MIN_VALUE, 4096)) * this.field7700 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field7699[var5][var9] = this.field7699[var5][var9 + -1] + var12;
                }
                this.field7686[var5][var9] = ~this.field7692 >= -1 ? 4096 : 4096 - class491.method2931(var2, Integer.MIN_VALUE, this.field7692);
            }
            this.field7699[var5][this.field7701] = 4096;
        }
        this.field7697[this.field7695] = 4096;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static final void method3104(byte arg0) {
        if (class85.field1240 != null) {
            class85.field1240.method407((byte) -116);
        }
        ++field7691;
        if (arg0 != -1) {
            field7689 = null;
        }
        if (class406.field6165 != null) {
            class406.field6165.method407((byte) -116);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field7692 = arg0.method1074(arg2 ^ -635988730);
                                    }
                                } else {
                                    this.field7696 = arg0.method1074(arg2 + -635990790);
                                }
                            } else {
                                this.field7684 = arg0.method1074(arg2 ^ -635988730);
                            }
                        } else {
                            this.field7685 = arg0.method1074(-635989152);
                        }
                    } else {
                        this.field7694 = arg0.method1074(-635989152);
                    }
                } else {
                    this.field7700 = arg0.method1074(-635989152);
                }
            } else {
                this.field7695 = arg0.method1087(false);
            }
        } else {
            this.field7701 = arg0.method1087(false);
        }
        if (arg2 == 1638) {
            ++field7690;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z")
    public static final boolean method3105(int arg0, int arg1) {
        int var2 = 13 / ((6 - arg0) / 55);
        ++field7688;
        return arg1 >= 4 && ~arg1 >= -9;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
    public static void method3106(byte arg0) {
        if (arg0 != 66) {
            method3107((class166) null, -22, -19, -58, 53, 100);
        }
        field7689 = null;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class523() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
    public final void method357(int arg0) {
        if (arg0 <= 28) {
            this.field7701 = 107;
        }
        this.method3103((byte) 0);
        ++field7698;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field7693;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int var4 = 0;
            int var5;
            for (var5 = class350.field5392[arg1] + this.field7684; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field7695 < ~var4 && ~var5 <= ~this.field7697[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field7697[var4];
            int var9 = this.field7697[var4 + -1];
            if (~(this.field7704 + var9) > ~var5 && ~var5 > ~(-this.field7704 + var8)) {
                for (int var10 = 0; var10 < class531.field7814; ++var10) {
                    int var11 = !var7 ? -this.field7685 : this.field7685;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field7703 * var11 >> 12) + class195.field2616[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field7701 && ~this.field7699[var6][var12] >= ~var13) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field7699[var6][var12];
                    int var16 = this.field7699[var6][var14];
                    if (this.field7704 + var16 < var13 && ~var13 > ~(-this.field7704 + var15)) {
                        var3[var10] = this.field7686[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class192.method1300(var3, 0, class531.field7814, 0);
            }
        }
        return arg0 > -74 ? null : var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lkw;IIIII)V")
    public static final void method3107(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2247 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field2245[var6] != null) {
                ++arg0.field2247;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field2247; ++var7) {
            long var8 = class411.field6251[arg1][arg2][arg3];
            while (var8 != 0L) {
                class189 var14 = class514.field7556[(int) ((var8 & 65535L) - 1L)];
                var8 >>>= 16;
                if (arg0.field2245[var7] == var14.field2518) {
                    continue label50;
                }
            }
            long var10 = class411.field6251[arg1][arg4][arg5];
            while (var10 != 0L) {
                class189 var13 = class514.field7556[(int) ((var10 & 65535L) - 1L)];
                var10 >>>= 16;
                if (arg0.field2245[var7] == var13.field2518) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field2247 - 1; ++var12) {
                arg0.field2245[var12] = arg0.field2245[var12 + 1];
            }
            --arg0.field2247;
        }
    }
}
