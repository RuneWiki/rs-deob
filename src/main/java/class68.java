import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class68 extends class175 {

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    private int field1168 = 0;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    private int field1174 = 0;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    private int field1165 = 0;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lmb;")
    public static class96 field1172 = class243.method1708(" weitere Optionen", (byte) 120);

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "Z")
    public static boolean field1181 = false;

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "Lmb;")
    public static class96 field1185 = class243.method1708("weiss:", (byte) 93);

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "Lmb;")
    private static class96 field1187 = class243.method1708("Loaded wordpack", (byte) 100);

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    public static int field1180 = 1;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "Lmb;")
    public static class96 field1173 = field1187;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "Lmb;")
    private static class96 field1182 = class243.method1708("Loaded input handler", (byte) 107);

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "Lmb;")
    public static class96 field1186 = field1182;

    @OriginalMember(owner = "client!oe", name = "rb", descriptor = "Lmb;")
    public static class96 field1191 = class243.method1708("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", (byte) 115);

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    private int field1169;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!oe", name = "ob", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client!oe", name = "qb", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!oe", name = "sb", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client!oe", name = "pb", descriptor = "Lff;")
    public static class3 field1189;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[Lw;)V")
    public static final void method471(int arg0, int arg1, class107[] arg2) {
        ++field1176;
        if (arg1 >= -90) {
            method472(51, 103);
        }
        for (int var3 = 0; arg2.length > var3; ++var3) {
            class107 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field1833 == 0) {
                    if (var4.field1842 != null) {
                        method471(arg0, -101, var4.field1842);
                    }
                    class168 var5 = (class168) class34.field606.method1081(0, (long) var4.field1896);
                    if (var5 != null) {
                        class221.method1517(arg0, var5.field2961, 1);
                    }
                }
                if (~arg0 == -1 && var4.field1894 != null) {
                    class116 var6 = new class116();
                    var6.field2158 = var4;
                    var6.field2155 = var4.field1894;
                    class141.method1044(var6, (byte) 76);
                }
                if (~arg0 == -2 && var4.field1895 != null) {
                    if (var4.field1974 >= 0) {
                        class107 var7 = class55.method408(var4.field1896, 251234864);
                        if (var7 == null || var7.field1842 == null || var7.field1842.length <= var4.field1974 || var7.field1842[var4.field1974] != var4) {
                            continue;
                        }
                    }
                    class116 var8 = new class116();
                    var8.field2158 = var4;
                    var8.field2155 = var4.field1895;
                    class141.method1044(var8, (byte) 76);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = -52 % ((arg0 - -22) / 58);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field1165 = (arg2.method1656(-127) << 12) / 100;
                }
            } else {
                this.field1168 = (arg2.method1656(108) << 12) / 100;
            }
        } else {
            this.field1174 = arg2.method1627(true);
        }
        ++field1177;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
    public static final void method472(int arg0, int arg1) {
        class95.field1556 = -1;
        class137.field2456 = arg1;
        class27.field455 = -1;
        if (arg0 == -8085) {
            class94.method662(-1);
            ++field1164;
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
    public static void method473(int arg0) {
        field1173 = null;
        field1186 = null;
        field1187 = null;
        field1189 = null;
        field1191 = null;
        field1185 = null;
        field1172 = null;
        field1182 = null;
        if (arg0 != -1114) {
            field1181 = false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZI)V")
    private final void method474(int arg0, int arg1, boolean arg2, int arg3) {
        ++field1163;
        int var5 = arg1 <= arg3 ? arg1 : arg3;
        int var6 = var5 <= arg0 ? var5 : arg0;
        int var7 = arg3 <= arg1 ? arg1 : arg3;
        int var8 = ~arg0 >= ~var7 ? var7 : arg0;
        if (arg2) {
            int var9 = -var6 + var8;
            this.field1192 = (var6 + var8) / 2;
            if (this.field1192 > 0 && ~this.field1192 > -4097) {
                this.field1170 = (var9 << 12) / (this.field1192 <= 2048 ? this.field1192 * 2 : 8192 - this.field1192 * 2);
            } else {
                this.field1170 = 0;
            }
            if (var9 > 0) {
                int var10 = (-arg1 + var8 << 12) / var9;
                int var11 = (-arg3 + var8 << 12) / var9;
                int var12 = (var8 - arg0 << 12) / var9;
                if (arg3 != var8) {
                    if (arg1 != var8) {
                        this.field1179 = arg3 == var6 ? var10 + 12288 : -var11 + 20480;
                    } else {
                        this.field1179 = arg0 == var6 ? var11 + 4096 : 12288 - var12;
                    }
                } else {
                    this.field1179 = ~arg1 != ~var6 ? -var10 + 4096 : var12 + 20480;
                }
                this.field1179 /= 6;
            } else {
                this.field1179 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(III)Ldd;")
    public static final class265 method475(int arg0, int arg1, int arg2) {
        ++field1166;
        if (arg2 != 6551) {
            return null;
        } else {
            for (class265 var3 = (class265) class239.field4116.method1811(arg2 ^ 6549); var3 != null; var3 = (class265) class239.field4116.method1810(false)) {
                if (var3.field4618 && var3.method1824(arg1, -125, arg0)) {
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILff;ZII)V")
    public static final void method476(int arg0, int arg1, class3 arg2, boolean arg3, int arg4, int arg5) {
        int var6 = -13 % ((arg5 - 25) / 46);
        class33.field551 = arg1;
        class269.field4690 = arg4;
        class103.field1736 = arg3;
        class85.field1436 = arg2;
        class249.field4308 = 1;
        class74.field1295 = arg0;
        class141.field2525 = 10000;
        ++field1171;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lhg;B)V")
    public static final void method477(class260 arg0, byte arg1) {
        if (~class236.field4053 == ~arg0.field4559 || arg0.field4526 == -1 || ~arg0.field4529 != -1 || ~(arg0.field4514 + 1) < ~class189.method1332(arg0.field4526, 2).field1143[arg0.field4576]) {
            int var2 = -arg0.field4506 + arg0.field4559;
            int var3 = -arg0.field4506 + class236.field4053;
            int var4 = arg0.field4574 * 128 - -(64 * arg0.method366((byte) 95));
            int var5 = arg0.field4572 * 128 + 64 * arg0.method366((byte) 95);
            int var6 = arg0.field4523 * 128 - -(arg0.method366((byte) 95) * 64);
            int var7 = arg0.field4575 * 128 + 64 * arg0.method366((byte) 95);
            arg0.field4511 = ((-var3 + var2) * var4 - -(var3 * var6)) / var2;
            arg0.field4533 = ((-var3 + var2) * var5 + var3 * var7) / var2;
        }
        arg0.field4549 = 0;
        ++field1167;
        int var8 = -17 % ((arg1 - -16) / 58);
        if (arg0.field4541 == 0) {
            arg0.field4531 = 1024;
        }
        if (~arg0.field4541 == -2) {
            arg0.field4531 = 1536;
        }
        if (~arg0.field4541 == -3) {
            arg0.field4531 = 0;
        }
        if (~arg0.field4541 == -4) {
            arg0.field4531 = 512;
        }
        arg0.field4534 = arg0.field4531;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg1 != 64) {
            this.method77(50, -75);
        }
        ++field1184;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[][] var4 = this.method1253(arg0, -2880, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class1.field11; ++var11) {
                this.method474(var6[var11], var8[var11], true, var5[var11]);
                this.field1170 += this.field1168;
                if (this.field1170 < 0) {
                    this.field1170 = 0;
                }
                this.field1192 += this.field1165;
                this.field1179 += this.field1174;
                if (~this.field1192 > -1) {
                    this.field1192 = 0;
                }
                if (~this.field1170 < -4097) {
                    this.field1170 = 4096;
                }
                if (this.field1192 > 4096) {
                    this.field1192 = 4096;
                }
                while (this.field1179 < 0) {
                    this.field1179 += 4096;
                }
                while (~this.field1179 < -4097) {
                    this.field1179 -= 4096;
                }
                this.method478(this.field1179, -120, this.field1170, this.field1192);
                var9[var11] = this.field1188;
                var7[var11] = this.field1178;
                var10[var11] = this.field1169;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V")
    private final void method478(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -89 / ((-64 - arg1) / 47);
        int var6 = ~arg3 >= -2049 ? (arg2 + 4096) * arg3 >> 12 : -(arg2 * arg3 >> 12) + arg3 - -arg2;
        ++field1190;
        if (var6 > 0) {
            int var7 = arg0 * 6;
            int var8 = arg3 + arg3 + -var6;
            int var9 = (var6 - var8 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = var7 - (var10 << 12);
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = -var14 + var6;
            int var16 = var8 + var14;
            if (var10 == 0) {
                this.field1178 = var16;
                this.field1169 = var8;
                this.field1188 = var6;
                return;
            }
            if (var10 == 1) {
                this.field1178 = var6;
                this.field1188 = var15;
                this.field1169 = var8;
                return;
            }
            if (var10 == 2) {
                this.field1178 = var6;
                this.field1169 = var16;
                this.field1188 = var8;
                return;
            }
            if (var10 == 3) {
                this.field1188 = var8;
                this.field1169 = var6;
                this.field1178 = var15;
                return;
            }
            if (~var10 == -5) {
                this.field1169 = var6;
                this.field1188 = var16;
                this.field1178 = var8;
                return;
            }
            if (~var10 == -6) {
                this.field1169 = var15;
                this.field1178 = var8;
                this.field1188 = var6;
                return;
            }
        } else {
            this.field1188 = this.field1178 = this.field1169 = arg3;
        }
    }
}
