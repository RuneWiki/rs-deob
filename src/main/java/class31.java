import java.io.UnsupportedEncodingException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 extends class260 {

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    private int field754 = 1024;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    private int field762 = 1024;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    private int field756 = 4;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    private int field763 = 8;

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "I")
    private int field780 = 81;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    private int field772 = 0;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    private int field775 = 204;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    private int field757 = 409;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Lli;")
    public static class277 field755 = new class277();

    @OriginalMember(owner = "client!na", name = "nb", descriptor = "[[S")
    public static short[][] field782 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "[Lbi;")
    public static class90[] field774 = new class90[32768];

    @OriginalMember(owner = "client!na", name = "pb", descriptor = "Loh;")
    private static class263 field784 = class253.method1681(-120, "white:");

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "Loh;")
    public static class263 field778 = field784;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "Loh;")
    public static class263 field771 = field784;

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
    public static int field777 = 0;

    @OriginalMember(owner = "client!na", name = "qb", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "[I")
    private int[] field761;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "[[I")
    private int[][] field773;

    @OriginalMember(owner = "client!na", name = "ob", descriptor = "[[I")
    private int[][] field783;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field767;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field754 = arg2.method1294((byte) 3);
                                    }
                                } else {
                                    this.field780 = arg2.method1294((byte) 3);
                                }
                            } else {
                                this.field772 = arg2.method1294((byte) 3);
                            }
                        } else {
                            this.field762 = arg2.method1294((byte) 3);
                        }
                    } else {
                        this.field775 = arg2.method1294((byte) 3);
                    }
                } else {
                    this.field757 = arg2.method1294((byte) 3);
                }
            } else {
                this.field763 = arg2.method1301(-8317);
            }
        } else {
            this.field756 = arg2.method1301(arg1 + -14018);
        }
        if (arg1 != 5701) {
            this.method86(16, 105, (class194) null);
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class31() {
        super(0, true);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        ++field779;
        this.method204(1);
        if (arg0 <= 81) {
            field781 = 39;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)I")
    public static final int method202(boolean arg0) {
        if (arg0) {
            return -127;
        } else {
            ++field768;
            return 16;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIILrd;II)V")
    public static final void method203(int arg0, int arg1, int arg2, class255 arg3, int arg4, int arg5) {
        ++field776;
        if (~arg3.field4453 != 0 || arg3.field4446 != null) {
            int var6 = 0;
            if (~arg2 < ~arg3.field4437) {
                var6 += -arg3.field4437 + arg2;
            } else if (~arg2 > ~arg3.field4452) {
                var6 += arg3.field4452 - arg2;
            }
            if (arg5 <= arg3.field4439) {
                if (~arg5 > ~arg3.field4447) {
                    var6 += arg3.field4447 - arg5;
                }
            } else {
                var6 += -arg3.field4439 + arg5;
            }
            if (arg0 >= -44) {
                method202(false);
            }
            if (~arg3.field4440 != -1 && ~(var6 + -64) >= ~arg3.field4440 && ~class214.field3798 != -1 && arg3.field4450 == arg4) {
                var6 -= 64;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var7 = (-var6 + arg3.field4440) * class214.field3798 / arg3.field4440;
                if (arg3.field4434 == null) {
                    if (~arg3.field4453 <= -1) {
                        class193 var8 = class193.method1261(class17.field389, arg3.field4453, 0);
                        if (var8 != null) {
                            class250 var9 = var8.method1263().method1672(class138.field2544);
                            class199 var10 = class199.method1368(var9, 100, var7);
                            var10.method1370(-1);
                            class43.field933.method1134(var10);
                            arg3.field4434 = var10;
                        }
                    }
                } else {
                    arg3.field4434.method1356(var7);
                }
                if (arg3.field4432 == null) {
                    if (arg3.field4446 != null && ~(arg3.field4441 -= arg1) >= -1) {
                        int var11 = (int) (Math.random() * (double) arg3.field4446.length);
                        class193 var12 = class193.method1261(class17.field389, arg3.field4446[var11], 0);
                        if (var12 != null) {
                            class250 var13 = var12.method1263().method1672(class138.field2544);
                            class199 var14 = class199.method1368(var13, 100, var7);
                            var14.method1370(0);
                            class43.field933.method1134(var14);
                            arg3.field4441 = (int) ((double) (-arg3.field4435 + arg3.field4456) * Math.random()) + arg3.field4435;
                            arg3.field4432 = var14;
                            return;
                        }
                    }
                } else {
                    arg3.field4432.method1356(var7);
                    if (arg3.field4432.method1616(-53)) {
                        return;
                    }
                    arg3.field4432 = null;
                }
            } else {
                if (arg3.field4434 != null) {
                    class43.field933.method1136(arg3.field4434);
                    arg3.field4434 = null;
                }
                if (arg3.field4432 != null) {
                    class43.field933.method1136(arg3.field4432);
                    arg3.field4432 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        int[] var3 = super.field4511.method304(arg0, false);
        if (arg1 != 255) {
            method206(-74, 79, (int[]) null, (int[]) null, 16);
        }
        ++field764;
        if (super.field4511.field1029) {
            int var4 = 0;
            int var5;
            for (var5 = class275.field4825[arg0] + this.field772; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field763 && ~var5 <= ~this.field761[var4]) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field761[var4];
            int var9 = this.field761[var4 - 1];
            if (~(this.field769 + var9) > ~var5 && ~var5 > ~(-this.field769 + var8)) {
                for (int var10 = 0; ~class49.field1052 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field762 : this.field762;
                    int var13;
                    for (var13 = (this.field758 * var12 >> 12) + class70.field1409[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field756 < ~var11 && this.field773[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field773[var6][var11];
                    int var16 = this.field773[var6][var14];
                    if (this.field769 + var16 < var13 && var13 < -this.field769 + var15) {
                        var3[var10] = this.field783[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class149.method978(var3, 0, class49.field1052, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
    private final void method204(int arg0) {
        ++field765;
        Random var2 = new Random((long) this.field763);
        this.field761 = new int[this.field763 - -1];
        this.field759 = 4096 / this.field763;
        this.field769 = this.field780 / 2;
        this.field773 = new int[this.field763][this.field756 + arg0];
        this.field783 = new int[this.field763][this.field756];
        this.field758 = 4096 / this.field756;
        int var3 = this.field758 / 2;
        this.field761[0] = 0;
        int var4 = this.field759 / 2;
        for (int var5 = 0; this.field763 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field759;
                int var7 = (class256.method1699(var2, arg0 ^ 124, 4096) - 2048) * this.field775 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field761[var5] = this.field761[var5 + -1] + var8;
            }
            this.field773[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field756; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field758;
                    int var11 = (-2048 + class256.method1699(var2, 124, 4096)) * this.field757 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field773[var5][var9] = this.field773[var5][var9 - 1] + var12;
                }
                this.field783[var5][var9] = this.field754 <= 0 ? 4096 : 4096 + -class256.method1699(var2, 116, this.field754);
            }
            this.field773[var5][this.field756] = 4096;
        }
        this.field761[this.field763] = 4096;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLoh;)Lma;")
    public static final class184 method205(byte arg0, class263 arg1) {
        ++field760;
        for (class184 var2 = (class184) class195.field3534.method1878(true); var2 != null; var2 = (class184) class195.field3534.method1881(-78)) {
            if (var2.field3321.method1788(-26006, arg1)) {
                return var2;
            }
        }
        if (arg0 != -3) {
            method206(66, -102, (int[]) null, (int[]) null, -69);
        }
        return null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[II)V")
    public static final void method206(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        ++field770;
        if (~arg1 > ~arg0) {
            int var5 = arg1;
            int var6 = (arg0 + arg1) / 2;
            int var7 = arg3[var6];
            arg3[var6] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg2[var6];
            arg2[var6] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg1; arg0 > var9; ++var9) {
                if ((var9 & 1) + var7 < arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5++] = var11;
                }
            }
            arg3[arg0] = arg3[var5];
            arg3[var5] = var7;
            arg2[arg0] = arg2[var5];
            arg2[var5] = var8;
            method206(var5 + -1, arg1, arg2, arg3, 1);
            method206(arg0, var5 + 1, arg2, arg3, 1);
        }
        if (arg4 != 1) {
            field778 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lpc;Loh;B)Loh;")
    public static final class263 method207(class21 arg0, class263 arg1, byte arg2) {
        if (~arg1.method1744(class177.field3187, (byte) -101) != 0) {
            label62: while (true) {
                int var3 = arg1.method1744(class187.field3374, (byte) -101);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method1744(class35.field817, (byte) -101);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method1744(class263.field4618, (byte) -101);
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg1.method1744(class49.field1055, (byte) -101);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method1744(class63.field1276, (byte) -101);
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg1.method1744(class12.field268, (byte) -101);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class263 var9 = class20.field459;
                                                        if (class142.field2607 != null) {
                                                            var9 = class26.method184(126, class142.field2607.field4118);
                                                            try {
                                                                if (class142.field2607.field4117 != null) {
                                                                    byte[] var10 = ((String) class142.field2607.field4117).getBytes("ISO-8859-1");
                                                                    var9 = class138.method903(-2378, var10.length, var10, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class124.method797(-105, new class263[] { arg1.method1763(-117, var8, 0), var9, arg1.method1787(var8 + 4, false) });
                                                    }
                                                }
                                                arg1 = class124.method797(-95, new class263[] { arg1.method1763(-121, var7, 0), class118.method767(true, class269.method1823(4, 23836, arg0)), arg1.method1787(var7 + 2, false) });
                                            }
                                        }
                                        arg1 = class124.method797(-107, new class263[] { arg1.method1763(-126, var6, 0), class118.method767(true, class269.method1823(3, 23836, arg0)), arg1.method1787(var6 + 2, false) });
                                    }
                                }
                                arg1 = class124.method797(-55, new class263[] { arg1.method1763(-118, var5, 0), class118.method767(true, class269.method1823(2, 23836, arg0)), arg1.method1787(var5 + 2, false) });
                            }
                        }
                        arg1 = class124.method797(-108, new class263[] { arg1.method1763(-116, var4, 0), class118.method767(true, class269.method1823(1, 23836, arg0)), arg1.method1787(var4 + 2, false) });
                    }
                }
                arg1 = class124.method797(-66, new class263[] { arg1.method1763(-125, var3, 0), class118.method767(true, class269.method1823(0, 23836, arg0)), arg1.method1787(var3 + 2, false) });
            }
        }
        if (arg2 > -107) {
            return null;
        } else {
            ++field766;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
    public static void method208(byte arg0) {
        field771 = null;
        if (arg0 == -99) {
            field755 = null;
            field782 = null;
            field778 = null;
            field784 = null;
            field774 = null;
        }
    }
}
