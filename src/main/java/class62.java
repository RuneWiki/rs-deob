import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class62 extends class123 {

    @OriginalMember(owner = "client!qc", name = "lb", descriptor = "I")
    private int field1195 = 1024;

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "I")
    private int field1192 = 4;

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
    private int field1193 = 0;

    @OriginalMember(owner = "client!qc", name = "nb", descriptor = "I")
    private int field1197 = 81;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    private int field1186 = 409;

    @OriginalMember(owner = "client!qc", name = "ob", descriptor = "I")
    private int field1198 = 1024;

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
    private int field1191 = 8;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "I")
    private int field1190 = 204;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!qc", name = "mb", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client!qc", name = "pb", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!qc", name = "qb", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!qc", name = "rb", descriptor = "[I")
    private int[] field1201;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "[[I")
    private int[][] field1188;

    @OriginalMember(owner = "client!qc", name = "kb", descriptor = "[[I")
    private int[][] field1194;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)Lkd;")
    public static final class197 method524(int arg0) {
        if (arg0 < 85) {
            return null;
        } else {
            ++field1181;
            class197 var1 = (class197) class13.field261.method1497(true);
            if (var1 != null) {
                var1.method518(98);
                var1.method1785(-116);
                return var1;
            } else {
                class197 var2;
                do {
                    var2 = (class197) class54.field939.method1497(true);
                    if (var2 == null) {
                        return null;
                    }
                    if (var2.method1403((byte) -122) > class201.method1419(5)) {
                        return null;
                    }
                    var2.method518(86);
                    var2.method1785(-122);
                } while ((Long.MIN_VALUE & var2.field4534) == 0L);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field1200;
        int[] var3 = super.field2160.method1323((byte) -84, arg0);
        int var4 = -108 / ((-24 - arg1) / 57);
        if (super.field2160.field3243) {
            int var5 = 0;
            int var6;
            for (var6 = class154.field2753[arg0] + this.field1193; var6 < 0; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (~var5 > ~this.field1191 && ~var6 <= ~this.field1201[var5]) {
                ++var5;
            }
            int var7 = var5 - 1;
            boolean var8 = (1 & var5) == 0;
            int var9 = this.field1201[var5];
            int var10 = this.field1201[var5 + -1];
            if (var6 > this.field1184 + var10 && var9 - this.field1184 > var6) {
                for (int var11 = 0; ~var11 > ~class140.field2505; ++var11) {
                    int var12 = !var8 ? -this.field1195 : this.field1195;
                    int var13 = 0;
                    int var14;
                    for (var14 = (this.field1187 * var12 >> 12) + class214.field3705[var11]; var14 < 0; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (var13 < this.field1192 && var14 >= this.field1188[var7][var13]) {
                        ++var13;
                    }
                    int var15 = var13 + -1;
                    int var16 = this.field1188[var7][var13];
                    int var17 = this.field1188[var7][var15];
                    if (this.field1184 + var17 < var14 && ~(-this.field1184 + var16) < ~var14) {
                        var3[var11] = this.field1194[var7][var15];
                    } else {
                        var3[var11] = 0;
                    }
                }
            } else {
                class43.method373(var3, 0, class140.field2505, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
    public static final void method525(byte arg0) {
        if (arg0 > 88) {
            ++field1189;
            class183.field3208.method1124(0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
    public static final int method526(byte arg0, int arg1) {
        if (arg0 != 82) {
            return 73;
        } else {
            ++field1199;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        if (arg0 != 0) {
            this.field1184 = 17;
        }
        ++field1182;
        this.method527(9733);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field1185;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field1198 = arg1.method161(4);
                                    }
                                } else {
                                    this.field1197 = arg1.method161(4);
                                }
                            } else {
                                this.field1193 = arg1.method161(arg2 + -1876195784);
                            }
                        } else {
                            this.field1195 = arg1.method161(arg2 ^ 1876195784);
                        }
                    } else {
                        this.field1190 = arg1.method161(4);
                    }
                } else {
                    this.field1186 = arg1.method161(4);
                }
            } else {
                this.field1191 = arg1.method200(255);
            }
        } else {
            this.field1192 = arg1.method200(arg2 + -1876195533);
        }
        if (arg2 != 1876195788) {
            this.field1192 = 124;
        }
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V")
    private final void method527(int arg0) {
        ++field1183;
        Random var2 = new Random((long) this.field1191);
        this.field1194 = new int[this.field1191][this.field1192];
        this.field1184 = this.field1197 / 2;
        this.field1188 = new int[this.field1191][this.field1192 + 1];
        this.field1196 = 4096 / this.field1191;
        this.field1187 = 4096 / this.field1192;
        this.field1201 = new int[this.field1191 + 1];
        this.field1201[0] = 0;
        if (arg0 != 9733) {
            this.method257(60);
        }
        int var3 = this.field1187 / 2;
        int var4 = this.field1196 / 2;
        for (int var5 = 0; ~var5 > ~this.field1191; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field1196;
                int var7 = (class51.method413(var2, 4096, Integer.MIN_VALUE) - 2048) * this.field1190 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1201[var5] = this.field1201[var5 - 1] + var8;
            }
            this.field1188[var5][0] = 0;
            for (int var9 = 0; ~this.field1192 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field1187;
                    int var11 = (-2048 + class51.method413(var2, 4096, Integer.MIN_VALUE)) * this.field1186 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1188[var5][var9] = this.field1188[var5][var9 + -1] + var12;
                }
                this.field1194[var5][var9] = this.field1198 > 0 ? -class51.method413(var2, this.field1198, Integer.MIN_VALUE) + 4096 : 4096;
            }
            this.field1188[var5][this.field1192] = 4096;
        }
        this.field1201[this.field1191] = 4096;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class62() {
        super(0, true);
    }
}
