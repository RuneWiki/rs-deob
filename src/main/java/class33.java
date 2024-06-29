import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class33 extends class142 {

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    private int field504 = -1;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field495 = -1;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "Lai;")
    public static class10 field501 = null;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "[[[Lvb;")
    public static class192[][][] field508 = new class192[4][104][104];

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "[I")
    public static int[] field499 = new int[100];

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "[I")
    public static int[] field506 = new int[2000];

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "Lai;")
    public static class10 field502 = class44.method278("Verbinde mit Server)3)3)3", 108);

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "Lai;")
    public static class10 field505 = class44.method278("Lade Benutzeroberfl-=che )2 ", -30);

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "Lwa;")
    public static class200 field511;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "[I")
    private int[] field507;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        int[][] var3 = super.field2666.method956(arg0, -95);
        if (arg1) {
            method220(52);
        }
        if (super.field2666.field2664 && this.method219(0)) {
            int var4 = (~class13.field219 != ~this.field510 ? this.field510 * arg0 / class13.field219 : arg0) * this.field503;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class133.field2499 != ~this.field503) {
                for (int var8 = 0; ~class133.field2499 < ~var8; ++var8) {
                    int var9 = this.field503 * var8 / class133.field2499;
                    int var10 = this.field507[var4 + var9];
                    var7[var8] = class123.method861(4080, var10 << 4);
                    var6[var8] = class123.method861(65280, var10) >> 4;
                    var5[var8] = class123.method861(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; class133.field2499 > var11; ++var11) {
                    int var12 = this.field507[var4++];
                    var7[var11] = class123.method861(var12 << 4, 4080);
                    var6[var11] = class123.method861(var12 >> 4, 4080);
                    var5[var11] = class123.method861(var12 >> 12, 4080);
                }
            }
        }
        ++field512;
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
    public final int method217(int arg0) {
        int var2 = 59 % ((arg0 - 79) / 32);
        ++field498;
        return this.field504;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILh;)V")
    public static final void method218(int arg0, class65 arg1) {
        arg1.field1133 = false;
        ++field500;
        if (~arg1.field1080 != 0) {
            class77 var2 = class142.method958((byte) -126, arg1.field1080);
            if (var2 != null && var2.field1339 != null) {
                ++arg1.field1088;
                if (~var2.field1339.length < ~arg1.field1089 && arg1.field1088 > var2.field1358[arg1.field1089]) {
                    ++arg1.field1089;
                    arg1.field1088 = 1;
                    class35.method235(arg1.field1089, var2, arg1.field1097, class145.field2767 == arg1, true, arg1.field1100);
                }
                if (var2.field1339.length <= arg1.field1089) {
                    arg1.field1088 = 0;
                    arg1.field1089 = 0;
                    class35.method235(arg1.field1089, var2, arg1.field1097, class145.field2767 == arg1, true, arg1.field1100);
                }
            } else {
                arg1.field1080 = -1;
            }
        }
        if (~arg1.field1141 != 0 && arg1.field1145 <= class120.field2304) {
            if (~arg1.field1086 > -1) {
                arg1.field1086 = 0;
            }
            int var3 = class135.method919(false, arg1.field1141).field2981;
            if (~var3 != 0) {
                class77 var4 = class142.method958((byte) -124, var3);
                if (var4 != null && var4.field1339 != null) {
                    ++arg1.field1084;
                    if (var4.field1339.length > arg1.field1086 && var4.field1358[arg1.field1086] < arg1.field1084) {
                        arg1.field1084 = 1;
                        ++arg1.field1086;
                        class35.method235(arg1.field1086, var4, arg1.field1097, class145.field2767 == arg1, true, arg1.field1100);
                    }
                    if (~arg1.field1086 <= ~var4.field1339.length && (arg1.field1086 < 0 || ~var4.field1339.length >= ~arg1.field1086)) {
                        arg1.field1141 = -1;
                    }
                } else {
                    arg1.field1141 = -1;
                }
            } else {
                arg1.field1141 = -1;
            }
        }
        if (arg0 != 9345) {
            field501 = null;
        }
        if (~arg1.field1081 != 0 && arg1.field1110 <= 1) {
            class77 var5 = class142.method958((byte) -118, arg1.field1081);
            if (var5.field1359 == 1 && ~arg1.field1125 < -1 && class120.field2304 >= arg1.field1121 && ~class120.field2304 < ~arg1.field1127) {
                arg1.field1110 = 1;
                return;
            }
        }
        if (~arg1.field1081 != 0 && ~arg1.field1110 == -1) {
            class77 var6 = class142.method958((byte) -96, arg1.field1081);
            if (var6 != null && var6.field1339 != null) {
                ++arg1.field1093;
                if (~arg1.field1117 > ~var6.field1339.length && ~var6.field1358[arg1.field1117] > ~arg1.field1093) {
                    arg1.field1093 = 1;
                    ++arg1.field1117;
                    class35.method235(arg1.field1117, var6, arg1.field1097, class145.field2767 == arg1, true, arg1.field1100);
                }
                if (var6.field1339.length <= arg1.field1117) {
                    ++arg1.field1083;
                    arg1.field1117 -= var6.field1355;
                    if (var6.field1352 <= arg1.field1083) {
                        arg1.field1081 = -1;
                    } else if (arg1.field1117 >= 0 && var6.field1339.length > arg1.field1117) {
                        class35.method235(arg1.field1117, var6, arg1.field1097, class145.field2767 == arg1, true, arg1.field1100);
                    } else {
                        arg1.field1081 = -1;
                    }
                }
                arg1.field1133 = var6.field1356;
            } else {
                arg1.field1081 = -1;
            }
        }
        if (~arg1.field1110 < -1) {
            --arg1.field1110;
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)Z")
    private final boolean method219(int arg0) {
        ++field509;
        if (this.field507 != null) {
            return true;
        } else if (arg0 <= this.field504) {
            int var2 = !class2.field17.method206(false, this.field504) ? 128 : 64;
            this.field507 = class2.field17.method203(this.field504, (byte) -106);
            this.field510 = var2;
            this.field503 = var2;
            return this.field507 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field504 = arg0.method762((byte) 114);
        }
        if (arg2 >= -34) {
            method218(-88, (class65) null);
        }
        ++field497;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class33() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
    public static void method220(int arg0) {
        field499 = null;
        field506 = null;
        field508 = null;
        if (arg0 != 1) {
            field501 = null;
        }
        field505 = null;
        field511 = null;
        field501 = null;
        field502 = null;
    }
}
