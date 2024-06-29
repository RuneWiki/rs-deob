import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class169 extends class28 {

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    private int field2732 = 0;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Lsl;")
    private class39 field2719 = new class39(16);

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    private int field2737 = 0;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "Lth;")
    private class55 field2740 = new class55();

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "J")
    private long field2743 = 0L;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    private int field2726;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Ltl;")
    private class62 field2705;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "Z")
    private boolean field2739;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "Lth;")
    private class55 field2738;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    private int field2707;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "Ltl;")
    private class62 field2734;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    private int field2723;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "Lpd;")
    private class276 field2736;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Lmf;")
    private class201 field2722;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "Z")
    private boolean field2742;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Lmi;")
    private class12 field2718;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "[I")
    public static int[] field2715 = new int[500];

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2729 = "rating: ";

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lvb;")
    private class176 field2713;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "Z")
    private boolean field2741;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "[B")
    private byte[] field2735;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "[[[B")
    public static byte[][][] field2704;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 8)
    public final void method1067(int arg0) {
        if (arg0 != -1) {
            field2724 = 105;
        }
        field2714++;
        if (this.field2738 != null) {
            if (this.method232(-9) == null) {
                return;
            }
            if (this.field2739) {
                boolean var2 = true;
                for (class35 var3 = this.field2738.method424(-109); var3 != null; var3 = this.field2738.method425(arg0 - 32546)) {
                    int var4 = (int) var3.field702;
                    if (this.field2735[var4] == 0) {
                        this.method1074((byte) 97, 1, var4);
                    }
                    if (this.field2735[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method278((byte) -105);
                    }
                }
                while (this.field2713.field2825.length > this.field2737) {
                    if (this.field2713.field2825[this.field2737] == 0) {
                        this.field2737++;
                    } else {
                        if (this.field2722.field3216 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2735[this.field2737] == 0) {
                            this.method1074((byte) 107, 1, this.field2737);
                        }
                        if (this.field2735[this.field2737] == 0) {
                            var2 = false;
                            class35 var5 = new class35();
                            var5.field702 = (long) this.field2737;
                            this.field2738.method427((byte) -118, var5);
                        }
                        this.field2737++;
                    }
                }
                if (var2) {
                    this.field2737 = 0;
                    this.field2739 = false;
                }
            } else if (this.field2741) {
                boolean var6 = true;
                for (class35 var7 = this.field2738.method424(-95); var7 != null; var7 = this.field2738.method425(-32547)) {
                    int var8 = (int) var7.field702;
                    if (this.field2735[var8] != 1) {
                        this.method1074((byte) -101, 2, var8);
                    }
                    if (this.field2735[var8] == 1) {
                        var7.method278((byte) -105);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2737 < this.field2713.field2825.length) {
                    if (this.field2713.field2825[this.field2737] == 0) {
                        this.field2737++;
                    } else {
                        if (this.field2736.method1847((byte) -58)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2735[this.field2737] != 1) {
                            this.method1074((byte) -90, 2, this.field2737);
                        }
                        if (this.field2735[this.field2737] != 1) {
                            var6 = false;
                            class35 var9 = new class35();
                            var9.field702 = (long) this.field2737;
                            this.field2738.method427((byte) -107, var9);
                        }
                        this.field2737++;
                    }
                }
                if (var6) {
                    this.field2741 = false;
                    this.field2737 = 0;
                }
            } else {
                this.field2738 = null;
            }
        }
        if (!this.field2742 || this.field2743 > class338.method2339((byte) -120)) {
            return;
        }
        for (class12 var10 = (class12) this.field2719.method306(~arg0); var10 != null; var10 = (class12) this.field2719.method300(arg0 + 2)) {
            if (!var10.field239) {
                if (var10.field236) {
                    if (!var10.field237) {
                        throw new RuntimeException();
                    }
                    var10.method278((byte) -105);
                } else {
                    var10.field236 = true;
                }
            }
        }
        this.field2743 = class338.method2339((byte) -120) + 1000L;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V", line = 194)
    public final void method226(int arg0, byte arg1) {
        field2709++;
        if (this.field2705 == null) {
            return;
        }
        for (class35 var3 = this.field2740.method424(-69); var3 != null; var3 = this.field2740.method425(-32547)) {
            if (((long) arg0) == var3.field702) {
                return;
            }
        }
        int var4 = -33 % ((-arg1 - 22) / 40);
        class35 var5 = new class35();
        var5.field702 = (long) arg0;
        this.field2740.method427((byte) -121, var5);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)I", line = 238)
    public final int method1068(boolean arg0) {
        field2711++;
        if (this.field2713 == null) {
            return 0;
        } else {
            if (arg0) {
                this.field2718 = (class12) null;
            }
            return this.field2713.field2841;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILbm;Lbm;)Lib;", line = 257)
    public static final class312 method1069(int arg0, int arg1, int arg2, class307 arg3, class307 arg4) {
        if (arg2 != 0) {
            field2704 = (byte[][][]) ((byte[][][]) null);
        }
        field2721++;
        return class135.method885(arg0, arg4, -10948, arg1) ? class333.method2297(arg3.method2036(arg0, arg1, (byte) 118), 1) : null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(ZI)I", line = 276)
    public static final int method1070(boolean arg0, int arg1) {
        if (arg0) {
            field2725++;
            return arg1 & 0xFF;
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I", line = 287)
    public final int method1071(int arg0) {
        field2731++;
        if (this.method232(-9) == null) {
            return this.field2718 == null ? 0 : this.field2718.method95(false);
        } else {
            if (arg0 != 0) {
                method1077(-75);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)[B", line = 309)
    public final byte[] method233(boolean arg0, int arg1) {
        field2728++;
        class12 var3 = this.method1074((byte) 121, 0, arg1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method97(6);
        if (arg0) {
            var3.method278((byte) -105);
            return var4;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V", line = 332)
    public final void method1072(int arg0) {
        field2710++;
        if (this.field2705 == null) {
            return;
        }
        this.field2741 = true;
        if (arg0 != 0) {
            this.field2734 = (class62) null;
        }
        if (this.field2738 == null) {
            this.field2738 = new class55();
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)I", line = 350)
    public final int method1073(int arg0) {
        if (arg0 != 16178) {
            this.field2734 = (class62) null;
        }
        field2717++;
        return this.field2732;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BII)Lmi;", line = 362)
    private final class12 method1074(byte arg0, int arg1, int arg2) {
        field2730++;
        class12 var4 = (class12) this.field2719.method303((long) arg2, (byte) 105);
        if (var4 != null && arg1 == 0 && !var4.field237 && var4.field239) {
            var4.method278((byte) -105);
            var4 = null;
        }
        int var5 = 43 % ((39 - arg0) / 58);
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field2705 == null || this.field2735[arg2] == -1) {
                    if (this.field2736.method1845(false)) {
                        return null;
                    }
                    var4 = this.field2736.method1860(true, 5416, (byte) 2, arg2, this.field2726);
                } else {
                    var4 = this.field2722.method1284((byte) 75, arg2, this.field2705);
                }
            } else if (arg1 == 1) {
                if (this.field2705 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2722.method1283(-5, this.field2705, arg2);
            } else if (arg1 == 2) {
                if (this.field2705 == null) {
                    throw new RuntimeException();
                }
                if (this.field2735[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2736.method1847((byte) -58)) {
                    return null;
                }
                var4 = this.field2736.method1860(false, 5416, (byte) 2, arg2, this.field2726);
            } else {
                throw new RuntimeException();
            }
            this.field2719.method310((long) arg2, var4, 25357);
        }
        if (var4.field239) {
            return null;
        }
        byte[] var6 = var4.method97(58);
        if (!var4 instanceof class128) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class153.field2489.reset();
                class153.field2489.update(var6, 0, var6.length - 2);
                int var7 = (int) class153.field2489.getValue();
                if (this.field2713.field2826[arg2] != var7) {
                    throw new RuntimeException();
                }
                this.field2736.field4245 = 0;
                this.field2736.field4247 = 0;
            } catch (RuntimeException var15) {
                this.field2736.method1853(86);
                var4.method278((byte) -105);
                if (var4.field237 && !this.field2736.method1845(false)) {
                    class333 var9 = this.field2736.method1860(true, 5416, (byte) 2, arg2, this.field2726);
                    this.field2719.method310((long) arg2, var9, 25357);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field2713.field2839[arg2] >>> 8);
            var6[var6.length - 1] = (byte) this.field2713.field2839[arg2];
            if (this.field2705 != null) {
                this.field2722.method1287(-98, var6, arg2, this.field2705);
                if (this.field2735[arg2] != 1) {
                    this.field2732++;
                    this.field2735[arg2] = 1;
                }
            }
            if (!var4.field237) {
                var4.method278((byte) -105);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class153.field2489.reset();
            class153.field2489.update(var6, 0, var6.length - 2);
            int var10 = (int) class153.field2489.getValue();
            if (this.field2713.field2826[arg2] != var10) {
                throw new RuntimeException();
            }
            int var11 = ((var6[var6.length - 2] & 0xFF) << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field2713.field2839[arg2] & 0xFFFF) != var11) {
                throw new RuntimeException();
            }
            if (this.field2735[arg2] != 1) {
                if (this.field2735[arg2] == 0) {
                }
                this.field2732++;
                this.field2735[arg2] = 1;
            }
            if (!var4.field237) {
                var4.method278((byte) -105);
            }
            return var4;
        } catch (Exception var14) {
            this.field2735[arg2] = -1;
            var4.method278((byte) -105);
            if (var4.field237 && !this.field2736.method1845(false)) {
                class333 var13 = this.field2736.method1860(true, 5416, (byte) 2, arg2, this.field2726);
                this.field2719.method310((long) arg2, var13, 25357);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)I", line = 582)
    public static final int method1075(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2720++;
        if (arg0 != 0) {
            field2704 = (byte[][][]) ((byte[][][]) null);
        }
        int var5 = arg1 & 0xF;
        int var6 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg3 : arg2);
        int var7 = var5 >= 8 ? arg4 : arg3;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Lvb;", line = 598)
    public final class176 method232(int arg0) {
        field2708++;
        if (arg0 != -9) {
            this.method1072(-27);
        }
        if (this.field2713 != null) {
            return this.field2713;
        }
        if (this.field2718 == null) {
            if (this.field2736.method1845(false)) {
                return null;
            }
            this.field2718 = this.field2736.method1860(true, 5416, (byte) 0, this.field2726, 255);
        }
        if (this.field2718.field239) {
            return null;
        }
        byte[] var2 = this.field2718.method97(arg0 + 82);
        if (this.field2718 instanceof class128) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2713 = new class176(var2, this.field2707);
                if (this.field2713.field2832 != this.field2723) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field2713 = null;
                if (this.field2736.method1845(false)) {
                    this.field2718 = null;
                } else {
                    this.field2718 = this.field2736.method1860(true, 5416, (byte) 0, this.field2726, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2713 = new class176(var2, this.field2707);
            } catch (RuntimeException var6) {
                this.field2736.method1853(-57);
                this.field2713 = null;
                if (this.field2736.method1845(false)) {
                    this.field2718 = null;
                } else {
                    this.field2718 = this.field2736.method1860(true, arg0 + 5425, (byte) 0, this.field2726, 255);
                }
                return null;
            }
            if (this.field2734 != null) {
                this.field2722.method1287(-92, var2, this.field2726, this.field2734);
            }
        }
        if (this.field2705 != null) {
            this.field2735 = new byte[this.field2713.field2842];
            this.field2732 = 0;
        }
        this.field2718 = null;
        return this.field2713;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 696)
    public final void method1076(byte arg0) {
        field2712++;
        if (this.field2738 == null || this.method232(-9) == null) {
            return;
        }
        for (class35 var2 = this.field2740.method424(-58); var2 != null; var2 = this.field2740.method425(-32547)) {
            int var3 = (int) var2.field702;
            if (var3 < 0 || this.field2713.field2842 <= var3 || this.field2713.field2825[var3] == 0) {
                var2.method278((byte) -105);
            } else {
                if (this.field2735[var3] == 0) {
                    this.method1074((byte) 119, 1, var3);
                }
                if (this.field2735[var3] == -1) {
                    this.method1074((byte) -78, 2, var3);
                }
                if (this.field2735[var3] == 1) {
                    var2.method278((byte) -105);
                }
            }
        }
        if (arg0 <= 100) {
            this.method1080(21);
        }
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V", line = 741)
    public static void method1077(int arg0) {
        if (arg0 != 4) {
            field2715 = (int[]) null;
        }
        field2704 = (byte[][][]) null;
        field2715 = null;
        field2729 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I", line = 754)
    public final int method231(int arg0, int arg1) {
        field2706++;
        class12 var3 = (class12) this.field2719.method303((long) arg0, (byte) 101);
        if (var3 == null) {
            if (arg1 >= -61) {
                this.field2713 = (class176) null;
            }
            return 0;
        } else {
            return var3.method95(false);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(ILtl;Ltl;Lpd;Lmf;IIZ)V", line = 861)
    public class169(int arg0, class62 arg1, class62 arg2, class276 arg3, class201 arg4, int arg5, int arg6, boolean arg7) {
        this.field2726 = arg0;
        this.field2705 = arg1;
        if (this.field2705 == null) {
            this.field2739 = false;
        } else {
            this.field2739 = true;
            this.field2738 = new class55();
        }
        this.field2707 = arg5;
        this.field2734 = arg2;
        this.field2723 = arg6;
        this.field2736 = arg3;
        this.field2722 = arg4;
        this.field2742 = arg7;
        if (this.field2734 != null) {
            this.field2718 = this.field2722.method1284((byte) 75, this.field2726, this.field2734);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 779)
    public static final void method1078(byte arg0) {
        class138.field2300 = new class68[class302.field4577.method2053((byte) -9)][];
        class303.field4607 = new boolean[class302.field4577.method2053((byte) -9)];
        field2733++;
        if (arg0 != 85) {
            method1079(-81, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(IB)Lqn;", line = 791)
    public static final class233 method1079(int arg0, byte arg1) {
        field2727++;
        class233 var2 = (class233) class165.field2671.method2367((long) arg0, -12270);
        if (var2 != null) {
            return var2;
        }
        int var3 = -107 / ((6 - arg1) / 33);
        byte[] var4;
        if (arg0 < 32768) {
            var4 = class190.field3089.method2036(1, arg0, (byte) 76);
        } else {
            var4 = class239.field3743.method2036(1, arg0 & 0x7FFF, (byte) 59);
        }
        class233 var5 = new class233();
        if (var4 != null) {
            var5.method1545(new class202(var4), 1006);
        }
        if (arg0 >= 32768) {
            var5.method1547((byte) -40);
        }
        class165.field2671.method2369((long) arg0, -28759, var5);
        return var5;
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)I", line = 829)
    public final int method1080(int arg0) {
        field2716++;
        if (this.field2713 == null) {
            return 0;
        }
        if (arg0 != 1) {
            this.field2743 = -118L;
        }
        if (this.field2739) {
            class35 var2 = this.field2738.method424(-75);
            return var2 == null ? 0 : (int) var2.field702;
        } else {
            return this.field2713.field2841;
        }
    }
}
