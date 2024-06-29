import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 extends class142 {

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    private int field177 = 1024;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    private int field172 = 1024;

    @OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
    private int field200 = 204;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    private int field180 = 8;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
    private int field193 = 409;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
    private int field196 = 4;

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
    private int field201 = 81;

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "I")
    private int field205 = 0;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "Lai;")
    public static class10 field182 = class44.method278("Sichtbare Karte vorbereitet)3", 114);

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "Lai;")
    public static class10 field183 = class44.method278("oder ung-Ultiges Passwort)3", 122);

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
    public static volatile int field194 = 0;

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "Lai;")
    public static class10 field198 = class44.method278("leuchten2:", -98);

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    public static int field197 = (int) (33.0D * Math.random()) + -16;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "Lwa;")
    public static class200 field174 = null;

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "Lai;")
    public static class10 field204 = class44.method278("Fps:", 108);

    @OriginalMember(owner = "client!b", name = "W", descriptor = "[Lai;")
    public static class10[] field178 = new class10[100];

    @OriginalMember(owner = "client!b", name = "yb", descriptor = "Lai;")
    private static class10 field206 = class44.method278("Could not complete login)3", 106);

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "Lai;")
    public static class10 field189 = field206;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "Ljava/lang/String;")
    public static String field179;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "[I")
    private int[] field181;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "[[I")
    private int[][] field199;

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "[[I")
    private int[][] field202;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
    public static void method73(int arg0) {
        field174 = null;
        int var1 = -4 / ((52 - arg0) / 42);
        field204 = null;
        field198 = null;
        field183 = null;
        field206 = null;
        field178 = null;
        field179 = null;
        field189 = null;
        field182 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field190;
        if (arg0) {
            field179 = null;
        }
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int var4 = 0;
            int var5;
            for (var5 = class13.field212[arg1] - -this.field205; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field180 < ~var4 && var5 >= this.field181[var4]) {
                ++var4;
            }
            float var6 = (float) this.field181[var4];
            float var7 = (float) this.field181[var4 + -1];
            if ((float) var5 > (float) this.field186 + var7 && (float) (-this.field186) + var6 > (float) var5) {
                for (int var8 = 0; class133.field2499 > var8; ++var8) {
                    int var9 = ~(var4 % 2) == -1 ? this.field172 : -this.field172;
                    int var10 = 0;
                    int var11;
                    for (var11 = class79.field1395[var8] - -(this.field185 * var9 >> 12); var11 < 0; var11 += 4096) {
                    }
                    while (~var11 < -4097) {
                        var11 -= 4096;
                    }
                    while (this.field196 > var10 && ~this.field199[var4 - 1][var10] >= ~var11) {
                        ++var10;
                    }
                    float var12 = (float) this.field199[var4 + -1][var10];
                    float var13 = (float) this.field199[var4 + -1][var10 + -1];
                    if ((float) var11 > (float) this.field186 + var13 && (float) (-this.field186) + var12 > (float) var11) {
                        var3[var8] = this.field202[var4 + -1][var10 + -1];
                    } else {
                        var3[var8] = 0;
                    }
                }
            } else {
                class12.method84(var3, 0, class133.field2499, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
    public static final void method74(int arg0) {
        ++field203;
        try {
            if (arg0 != 1) {
                field198 = null;
            }
            if (~class75.field1290 == -2) {
                int var1 = class101.field1887.method997(-60);
                if (var1 > 0 && class101.field1887.method971((byte) 106)) {
                    int var2 = var1 - class157.field3022;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class101.field1887.method976(var2, (byte) 55);
                } else {
                    class101.field1887.method1000(arg0 ^ 10522);
                    class101.field1887.method984(-128);
                    class41.field682 = null;
                    if (class25.field387 == null) {
                        class75.field1290 = 0;
                    } else {
                        class75.field1290 = 2;
                    }
                    class155.field3007 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class101.field1887.method1000(10523);
            class155.field3007 = null;
            class41.field682 = null;
            class75.field1290 = 0;
            class25.field387 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V")
    public static final void method75(int arg0) {
        ++field176;
        class125.field2391 = 0;
        int var1 = (class145.field2767.field1100 >> 7) + class2.field16;
        int var2 = (class145.field2767.field1097 >> 7) + class200.field3767;
        if (~var1 <= -3054 && ~var1 >= -3157 && ~var2 <= -3057 && ~var2 >= -3137) {
            class125.field2391 = 1;
        }
        if (arg0 > -104) {
            field197 = 83;
        }
        if (var1 >= 3072 && ~var1 >= -3119 && var2 >= 9492 && var2 <= 9535) {
            class125.field2391 = 1;
        }
        if (class125.field2391 == 1 && var1 >= 3139 && ~var1 >= -3200 && var2 >= 3008 && var2 <= 3062) {
            class125.field2391 = 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V")
    private final void method76(int arg0) {
        ++field191;
        Random var2 = new Random((long) this.field180);
        this.field199 = new int[this.field180][this.field196 - -1];
        this.field187 = 4096 / this.field180;
        this.field186 = this.field201 / 2;
        this.field202 = new int[this.field180][this.field196];
        this.field185 = 4096 / this.field196;
        int var3 = this.field187 / 2;
        int var4 = this.field185 / 2;
        if (arg0 <= -76) {
            this.field181 = new int[this.field180 + 1];
            this.field181[0] = 0;
            for (int var5 = 0; ~this.field180 < ~var5; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field187;
                    int var7 = (-2048 + class89.method548(4096, var2, (byte) -73)) * this.field200 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field181[var5] = this.field181[var5 + -1] - -var8;
                }
                this.field199[var5][0] = 0;
                for (int var9 = 0; ~var9 > ~this.field196; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field185;
                        int var11 = (-2048 + class89.method548(4096, var2, (byte) -73)) * this.field193 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field199[var5][var9] = this.field199[var5][var9 + -1] + var12;
                    }
                    this.field202[var5][var9] = ~this.field177 >= -1 ? 4096 : 4096 + -class89.method548(this.field177, var2, (byte) -73);
                }
                this.field199[var5][this.field196] = 4096;
            }
            this.field181[this.field180] = 4096;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method77(int arg0, boolean arg1, byte[] arg2) {
        ++field173;
        if (arg2 == null) {
            return null;
        } else {
            if (arg0 < arg2.length && !class14.field232) {
                try {
                    class70 var3 = (class70) Class.forName("gb").newInstance();
                    var3.method397(0, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class14.field232 = true;
                }
            }
            return !arg1 ? arg2 : class65.method427(false, arg2);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field177 = arg0.method762((byte) 87);
                                    }
                                } else {
                                    this.field201 = arg0.method762((byte) 80);
                                }
                            } else {
                                this.field205 = arg0.method762((byte) 100);
                            }
                        } else {
                            this.field172 = arg0.method762((byte) 80);
                        }
                    } else {
                        this.field200 = arg0.method762((byte) 90);
                    }
                } else {
                    this.field193 = arg0.method762((byte) 76);
                }
            } else {
                this.field180 = arg0.method767(true);
            }
        } else {
            this.field196 = arg0.method767(true);
        }
        ++field192;
        if (arg2 >= -34) {
            field184 = 98;
        }
    }

    @OriginalMember(owner = "client!b", name = "i", descriptor = "(I)V")
    public static final void method79(int arg0) {
        ++field195;
        if (arg0 <= 11) {
            method79(31);
        }
        for (int var1 = -1; class189.field3616 > var1; ++var1) {
            int var5;
            if (~var1 == 0) {
                var5 = 2047;
            } else {
                var5 = class174.field3355[var1];
            }
            class38 var6 = class2.field10[var5];
            if (var6 != null && ~var6.field1132 < -1) {
                --var6.field1132;
                if (~var6.field1132 == -1) {
                    var6.field1087 = null;
                }
            }
        }
        for (int var2 = 0; class93.field1690 > var2; ++var2) {
            int var3 = class166.field3187[var2];
            class125 var4 = class168.field3249[var3];
            if (var4 != null && ~var4.field1132 < -1) {
                --var4.field1132;
                if (var4.field1132 == 0) {
                    var4.field1087 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        this.method76(-107);
        ++field188;
        if (arg0 != -1) {
            field182 = null;
        }
    }
}
