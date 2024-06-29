import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class73 extends class200 {

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    private int field1266 = 10;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    private int field1258 = 0;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
    private int field1275 = 2048;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field1259 = 0;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "[I")
    public static int[] field1257 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "Lid;")
    public static class149 field1261 = class60.method382("Gestionnaire de saisie charg-B", (byte) 20);

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "Lid;")
    public static class149 field1271 = class60.method382("hint_mapmarkers", (byte) 86);

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "Lid;")
    public static class149 field1273 = class60.method382("Objet d(Wabonn-Bs", (byte) 63);

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!vg", name = "jb", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!vg", name = "kb", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "[I")
    public static int[] field1263;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "[I")
    private int[] field1265;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "[I")
    public static int[] field1267;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "[I")
    private int[] field1270;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "[[B")
    public static byte[][] field1276;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field1262;
        if (!arg1) {
            field1263 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1258 = arg0.method489((byte) 82);
                }
            } else {
                this.field1275 = arg0.method485(-2386);
            }
        } else {
            this.field1266 = arg0.method489((byte) 99);
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public static final void method470(int arg0) {
        ++field1268;
        int var1 = class136.field2484.length;
        if (arg0 != 63) {
            method477(11);
        }
        for (int var2 = 0; var2 < var1; ++var2) {
            if (class136.field2484[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; class208.field3730 > var4; ++var4) {
                    if (~class267.field4761[var2] == ~class173.field3191[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class173.field3191[class208.field3730] = class267.field4761[var2];
                    var3 = class208.field3730++;
                }
                class74 var5 = new class74(class136.field2484[var2]);
                int var6 = 0;
                while (~class136.field2484[var2].length < ~var5.field1340 && ~var6 > -512) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method485(-2386);
                    int var9 = var8 >> 14;
                    int var10 = 63 & var8 >> 7;
                    int var11 = 63 & var8;
                    int var12 = (class267.field4761[var2] >> 8) * 64 + var10 + -class125.field2199;
                    int var13 = (class267.field4761[var2] & 255) * 64 + var11 - class115.field1969;
                    class59 var14 = class98.method712(var5.method485(-2386), 107);
                    if (class38.field572[var7] == null && (var14.field1047 & 1) > 0 && class223.field3932 == var9 && ~var12 <= -1 && var12 - -var14.field1049 < 104 && ~var13 <= -1 && ~(var14.field1049 + var13) > -105) {
                        class38.field572[var7] = new class20();
                        class20 var15 = class38.field572[var7];
                        class110.field1906[class182.field3281++] = var7;
                        var15.field2403 = class118.field2022;
                        var15.method115((byte) -51, var14);
                        var15.method925(0, var15.field296.field1049);
                        var15.field2335 = var15.field2354 = class163.field3023[var15.field296.field1057];
                        var15.field2305 = var15.field296.field1029;
                        var15.field2342 = var15.field296.field1027;
                        if (~var15.field2305 == -1) {
                            var15.field2354 = 0;
                        }
                        var15.method921(var15.method885((byte) -87), var13, (byte) 29, var12, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        if (arg1 != 55) {
            this.field1265 = null;
        }
        ++field1277;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int var4 = class93.field1644[arg0];
            if (~this.field1258 != -1) {
                for (int var5 = 0; ~class137.field2515 < ~var5; ++var5) {
                    int var6 = field1263[var5];
                    int var7 = 0;
                    short var8 = 0;
                    int var9 = this.field1258;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var7 = (var6 - var4 >> 1) + 2048;
                            }
                        } else {
                            var7 = (var4 + var6 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var7 = var6;
                    }
                    for (int var10 = 0; this.field1266 > var10; ++var10) {
                        if (var7 >= this.field1270[var10] && var7 < this.field1270[var10 + 1]) {
                            if (var7 < this.field1265[var10]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var8;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field1266; ++var12) {
                    if (~var4 <= ~this.field1270[var12] && ~var4 > ~this.field1270[var12 - -1]) {
                        if (~var4 > ~this.field1265[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class209.method1427(var3, 0, class137.field2515, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class73() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lid;ZB)V")
    public static final void method471(class149 arg0, boolean arg1, byte arg2) {
        ++field1279;
        if (arg2 < -27) {
            byte var3 = 4;
            int var4 = var3 + 6;
            int var5 = 6 - -var3;
            int var6 = class6.field73.method1152(arg0, 250);
            int var7 = class6.field73.method1150(arg0, 250) * 13;
            class72.method459(-var3 + var4, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 0);
            class72.method457(-var3 + var4, var5 - var3, var3 + var6 - -var3, var3 + var3 + var7, 16777215);
            class6.field73.method1153(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
            class279.method1925(var3 + var3 + var7, -var3 + var4, var3 + var6 + var3, 0, -var3 + var5);
            if (!arg1) {
                class44.method257(var5, var7, var6, -356, var4);
            } else {
                try {
                    Graphics var8 = class244.field4295.getGraphics();
                    class226.field3970.method1472(1000, 0, 0, var8);
                } catch (Exception var9) {
                    class244.field4295.repaint();
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
    public static final void method472(int arg0) {
        ++field1264;
        for (int var1 = -1; var1 < class253.field4432; ++var1) {
            int var2;
            if (~var1 != 0) {
                var2 = class251.field4407[var1];
            } else {
                var2 = 2047;
            }
            class127 var3 = class107.field1851[var2];
            if (var3 != null) {
                class157.method1130(-1, var3.method885((byte) -21), var3);
            }
        }
        if (arg0 != 10046) {
            method471((class149) null, true, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
    public static final void method473(int arg0) {
        if (arg0 > -48) {
            method477(-55);
        }
        ++field1272;
        class155.field2832.method1290((byte) -112);
        class124.field2182.method1290((byte) 65);
        class93.field1642.method1290((byte) 21);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lgd;I)Lgg;")
    public static final class192 method474(class74 arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field1260;
            return new class192(arg0.method526((byte) 72), arg0.method526((byte) 77), arg0.method526((byte) 96), arg0.method526((byte) 120), arg0.method525(65280), arg0.method525(65280), arg0.method489((byte) 105));
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V")
    private final void method475(boolean arg0) {
        this.field1270 = new int[this.field1266 + 1];
        ++field1278;
        int var2 = 0;
        this.field1265 = new int[this.field1266 + 1];
        int var3 = 4096 / this.field1266;
        int var4 = this.field1275 * var3 >> 12;
        for (int var5 = 0; this.field1266 > var5; ++var5) {
            this.field1270[var5] = var2;
            this.field1265[var5] = var2 + var4;
            var2 += var3;
        }
        if (!arg0) {
            method476((int[]) null, -11, -107, 124, 84, 40);
        }
        this.field1270[this.field1266] = 4096;
        this.field1265[this.field1266] = this.field1265[0] + 4096;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([IIIIII)V")
    public static final void method476(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class231 var6 = class261.field4664[arg3][arg4][arg5];
        if (var6 != null) {
            class188 var7 = var6.field4059;
            if (var7 == null) {
                class53 var10 = var6.field4051;
                if (var10 != null) {
                    int var11 = var10.field958;
                    int var12 = var10.field946;
                    int var13 = var10.field957;
                    int var14 = var10.field959;
                    int[] var15 = class249.field4373[var11];
                    int[] var16 = class226.field3968[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field3375;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
    public static void method477(int arg0) {
        field1276 = null;
        field1257 = null;
        field1273 = null;
        if (arg0 != -8698) {
            method476((int[]) null, -10, 18, -7, -108, -22);
        }
        field1261 = null;
        field1263 = null;
        field1271 = null;
        field1267 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field1269;
        int var2 = 82 % ((-60 - arg0) / 62);
        this.method475(true);
    }
}
