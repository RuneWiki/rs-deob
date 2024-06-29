import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class60 extends class166 {

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    private int field1088 = 0;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    private int field1097 = 204;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    private int field1101 = 4;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    private int field1090 = 1024;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    private int field1091 = 1024;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    private int field1099 = 8;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    private int field1093 = 81;

    @OriginalMember(owner = "client!ki", name = "lb", descriptor = "I")
    private int field1109 = 409;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "[Lpe;")
    public static class232[] field1094 = new class232[4];

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "Lhj;")
    private static class69 field1092 = class181.method1318("Loaded textures", (byte) -119);

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "Lhj;")
    public static class69 field1095 = field1092;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "Lhj;")
    public static class69 field1098 = class181.method1318(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) -114);

    @OriginalMember(owner = "client!ki", name = "jb", descriptor = "[I")
    public static int[] field1107 = new int[128];

    @OriginalMember(owner = "client!ki", name = "ib", descriptor = "Lhj;")
    public static class69 field1106 = class181.method1318("(R", (byte) -108);

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client!ki", name = "gb", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ki", name = "hb", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ki", name = "kb", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ki", name = "mb", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "[I")
    private int[] field1089;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "[[I")
    private int[][] field1087;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "[[I")
    private int[][] field1100;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
    public static void method364(int arg0) {
        field1095 = null;
        field1092 = null;
        field1106 = null;
        field1107 = null;
        field1094 = null;
        field1098 = null;
        if (arg0 != 4096) {
            method366(91);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        ++field1104;
        this.method365(-4097);
        int var2 = -50 % ((58 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field1110;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field1090 = arg1.method912(-105);
                                    }
                                } else {
                                    this.field1093 = arg1.method912(127);
                                }
                            } else {
                                this.field1088 = arg1.method912(-95);
                            }
                        } else {
                            this.field1091 = arg1.method912(-82);
                        }
                    } else {
                        this.field1097 = arg1.method912(114);
                    }
                } else {
                    this.field1109 = arg1.method912(115);
                }
            } else {
                this.field1099 = arg1.method937(false);
            }
        } else {
            this.field1101 = arg1.method937(false);
        }
        if (arg0 != 96) {
            this.field1109 = 103;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int var4 = 0;
            int var5;
            for (var5 = class13.field187[arg0] + this.field1088; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field1099 < ~var4 && var5 >= this.field1089[var4]) {
                ++var4;
            }
            boolean var6 = (var4 & 1) == 0;
            int var7 = var4 - 1;
            int var8 = this.field1089[var4];
            int var9 = this.field1089[var4 - 1];
            if (var5 > var9 - -this.field1102 && var5 < -this.field1102 + var8) {
                for (int var10 = 0; ~class253.field4565 < ~var10; ++var10) {
                    int var11 = !var6 ? -this.field1091 : this.field1091;
                    int var12 = (this.field1096 * var11 >> 12) + class24.field347[var10];
                    int var13 = 0;
                    while (~var12 > -1) {
                        var12 += 4096;
                    }
                    while (~var12 < -4097) {
                        var12 -= 4096;
                    }
                    while (this.field1101 > var13 && ~this.field1100[var7][var13] >= ~var12) {
                        ++var13;
                    }
                    int var14 = this.field1100[var7][var13];
                    int var15 = var13 + -1;
                    int var16 = this.field1100[var7][var15];
                    if (~(this.field1102 + var16) > ~var12 && ~var12 > ~(-this.field1102 + var14)) {
                        var3[var10] = this.field1087[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class1.method2(var3, 0, class253.field4565, 0);
            }
        }
        ++field1086;
        if (arg1 != 8388607) {
            field1092 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
    private final void method365(int arg0) {
        ++field1105;
        Random var2 = new Random((long) this.field1099);
        this.field1100 = new int[this.field1099][this.field1101 - -1];
        this.field1103 = 4096 / this.field1099;
        this.field1089 = new int[this.field1099 - -1];
        this.field1087 = new int[this.field1099][this.field1101];
        this.field1089[0] = 0;
        this.field1102 = this.field1093 / 2;
        if (arg0 == -4097) {
            int var3 = this.field1103 / 2;
            this.field1096 = 4096 / this.field1101;
            int var4 = this.field1096 / 2;
            for (int var5 = 0; var5 < this.field1099; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field1103;
                    int var7 = (client.method1149(arg0 ^ -4171, 4096, var2) - 2048) * this.field1097 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field1089[var5] = this.field1089[var5 + -1] + var8;
                }
                this.field1100[var5][0] = 0;
                for (int var9 = 0; this.field1101 > var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field1096;
                        int var11 = (client.method1149(-110, 4096, var2) - 2048) * this.field1109 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field1100[var5][var9] = this.field1100[var5][var9 + -1] + var12;
                    }
                    this.field1087[var5][var9] = ~this.field1090 >= -1 ? 4096 : 4096 - client.method1149(-127, this.field1090, var2);
                }
                this.field1100[var5][this.field1101] = 4096;
            }
            this.field1089[this.field1099] = 4096;
        }
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)I")
    public static final int method366(int arg0) {
        ++field1108;
        return arg0 > -36 ? -13 : 6;
    }
}
