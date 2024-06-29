import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class109 extends class634 {

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "I")
    private int field1147 = 81;

    @OriginalMember(owner = "client!rv", name = "J", descriptor = "I")
    private int field1146 = 4;

    @OriginalMember(owner = "client!rv", name = "O", descriptor = "I")
    private int field1151 = 8;

    @OriginalMember(owner = "client!rv", name = "R", descriptor = "I")
    private int field1154 = 204;

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "I")
    private int field1145 = 1024;

    @OriginalMember(owner = "client!rv", name = "S", descriptor = "I")
    private int field1155 = 1024;

    @OriginalMember(owner = "client!rv", name = "U", descriptor = "I")
    private int field1157 = 0;

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
    private int field1148 = 409;

    @OriginalMember(owner = "client!rv", name = "W", descriptor = "Lsn;")
    public static class629 field1159 = new class629("WTI", 5);

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!rv", name = "N", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!rv", name = "P", descriptor = "I")
    private int field1152;

    @OriginalMember(owner = "client!rv", name = "Q", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!rv", name = "T", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!rv", name = "V", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!rv", name = "Y", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!rv", name = "X", descriptor = "[I")
    private int[] field1160;

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "[[I")
    private int[][] field1143;

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "[[I")
    private int[][] field1149;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lmc;BLmc;)V")
    public static final void method745(class134 arg0, byte arg1, class134 arg2) {
        if (arg2.field1520 != null) {
            arg2.method864(12983);
        }
        ++field1150;
        arg2.field1520 = arg0.field1520;
        if (arg1 >= -34) {
            field1159 = null;
        }
        arg2.field1521 = arg0;
        arg2.field1520.field1521 = arg2;
        arg2.field1521.field1520 = arg2;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg2) {
            this.method13((byte) 94, 52);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field1155 = arg1.method1476(-73);
                                    }
                                } else {
                                    this.field1147 = arg1.method1476(-81);
                                }
                            } else {
                                this.field1157 = arg1.method1476(94);
                            }
                        } else {
                            this.field1145 = arg1.method1476(-86);
                        }
                    } else {
                        this.field1154 = arg1.method1476(-110);
                    }
                } else {
                    this.field1148 = arg1.method1476(-117);
                }
            } else {
                this.field1151 = arg1.method1423(-22);
            }
        } else {
            this.field1146 = arg1.method1423(-96);
        }
        ++field1142;
    }

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "(I)V")
    public static void method746(int arg0) {
        if (arg0 == -4097) {
            field1159 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 <= 65) {
            this.field1148 = -126;
        }
        ++field1153;
        this.method747(true);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field1144;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 >= -55) {
            method746(126);
        }
        if (super.field9114.field3897) {
            int var4 = 0;
            int var5;
            for (var5 = class164.field1840[arg1] + this.field1157; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field1151 > var4 && ~var5 <= ~this.field1160[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field1160[var4];
            int var9 = this.field1160[var4 - 1];
            if (this.field1158 + var9 < var5 && ~(-this.field1158 + var8) < ~var5) {
                for (int var10 = 0; class635.field9139 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field1145 : this.field1145;
                    int var13;
                    for (var13 = (this.field1152 * var12 >> 12) + class246.field2980[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field1146 > var11 && ~var13 <= ~this.field1149[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field1149[var6][var11];
                    int var16 = this.field1149[var6][var14];
                    if (var13 > this.field1158 + var16 && var13 < -this.field1158 + var15) {
                        var3[var10] = this.field1143[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class143.method896(var3, 0, class635.field9139, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
    private final void method747(boolean arg0) {
        ++field1156;
        Random var2 = new Random((long) this.field1151);
        this.field1161 = 4096 / this.field1151;
        this.field1152 = 4096 / this.field1146;
        this.field1158 = this.field1147 / 2;
        int var3 = this.field1152 / 2;
        this.field1160 = new int[this.field1151 + 1];
        int var4 = this.field1161 / 2;
        this.field1149 = new int[this.field1151][this.field1146 - -1];
        this.field1143 = new int[this.field1151][this.field1146];
        this.field1160[0] = 0;
        if (arg0) {
            for (int var5 = 0; this.field1151 > var5; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field1161;
                    int var7 = (-2048 + class661.method3763(4096, 30356, var2)) * this.field1154 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field1160[var5] = this.field1160[var5 + -1] + var8;
                }
                this.field1149[var5][0] = 0;
                for (int var9 = 0; this.field1146 > var9; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field1152;
                        int var11 = (-2048 + class661.method3763(4096, 30356, var2)) * this.field1148 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field1149[var5][var9] = this.field1149[var5][var9 + -1] - -var12;
                    }
                    this.field1143[var5][var9] = this.field1155 <= 0 ? 4096 : -class661.method3763(this.field1155, 30356, var2) + 4096;
                }
                this.field1149[var5][this.field1146] = 4096;
            }
            this.field1160[this.field1151] = 4096;
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
    public class109() {
        super(0, true);
    }
}
