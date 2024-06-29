import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class197 extends class575 {

    @OriginalMember(owner = "client!rfa", name = "A", descriptor = "I")
    private int field2827 = 0;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lmp;")
    private class758 field2808 = new class758(16);

    @OriginalMember(owner = "client!rfa", name = "L", descriptor = "I")
    private int field2838 = 0;

    @OriginalMember(owner = "client!rfa", name = "K", descriptor = "Lnt;")
    private class220 field2837 = new class220();

    @OriginalMember(owner = "client!rfa", name = "N", descriptor = "J")
    private long field2840 = 0L;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "Lpk;")
    private class195 field2815;

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!rfa", name = "J", descriptor = "Z")
    private boolean field2836;

    @OriginalMember(owner = "client!rfa", name = "M", descriptor = "Lnt;")
    private class220 field2839;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "Ltl;")
    private class617 field2820;

    @OriginalMember(owner = "client!rfa", name = "y", descriptor = "Lkha;")
    private class580 field2825;

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "Lpk;")
    private class195 field2826;

    @OriginalMember(owner = "client!rfa", name = "O", descriptor = "Z")
    private boolean field2841;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    private int field2813;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "[B")
    private byte[] field2814;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "Lkt;")
    private class156 field2818;

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "[I")
    public static int[] field2823 = new int[256];

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!rfa", name = "B", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!rfa", name = "C", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!rfa", name = "D", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!rfa", name = "E", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!rfa", name = "F", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!rfa", name = "H", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "Lsv;")
    private class656 field2811;

    @OriginalMember(owner = "client!rfa", name = "I", descriptor = "Z")
    private boolean field2835;

    @OriginalMember(owner = "client!rfa", name = "G", descriptor = "[B")
    private byte[] field2833;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IB)[B")
    public final byte[] method1375(int arg0, byte arg1) {
        field2822++;
        class156 var3 = this.method1387(arg0, (byte) 82, 0);
        int var4 = 123 % ((-arg1 - 78) / 42);
        if (var3 == null) {
            return null;
        } else {
            byte[] var5 = var3.method1187((byte) -17);
            var3.method3617(1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)V")
    public final void method1376(int arg0, int arg1) {
        field2810++;
        if (this.field2815 == null) {
            return;
        }
        class626 var3 = this.field2837.method1522(true);
        if (arg0 != 255) {
            this.method1378((byte) -105);
        }
        while (var3 != null) {
            if ((long) arg1 == var3.field8991) {
                return;
            }
            var3 = this.field2837.method1527((byte) 85);
        }
        class626 var4 = new class626();
        var4.field8991 = arg1;
        this.field2837.method1526(var4, -21);
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)V")
    public final void method1377(int arg0) {
        field2819++;
        if (this.field2815 == null) {
            return;
        }
        this.field2835 = true;
        if (arg0 != 3806) {
            this.field2808 = null;
        }
        if (this.field2839 == null) {
            this.field2839 = new class220();
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)I")
    public final int method1378(byte arg0) {
        field2809++;
        if (arg0 < 35) {
            this.method1387(-117, (byte) -46, 61);
        }
        if (this.field2811 == null) {
            return 0;
        } else if (this.field2836) {
            class626 var2 = this.field2839.method1522(true);
            return var2 == null ? 0 : (int) var2.field8991;
        } else {
            return this.field2811.field9219;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)I")
    public final int method1379(boolean arg0) {
        if (arg0) {
            field2829++;
            return this.field2811 == null ? 0 : this.field2811.field9219;
        } else {
            return -71;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)I")
    public final int method1380(byte arg0) {
        field2817++;
        if (arg0 != -105) {
            this.field2838 = 54;
        }
        return this.field2827;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)Lsv;")
    public final class656 method1381(int arg0) {
        field2831++;
        if (this.field2811 != null) {
            return this.field2811;
        }
        if (this.field2818 == null) {
            if (this.field2825.method3362(0)) {
                return null;
            }
            this.field2818 = this.field2825.method3356((byte) 0, 27840, this.field2821, 255, true);
        }
        if (this.field2818.field2336) {
            return null;
        }
        byte[] var2 = this.field2818.method1187((byte) -58);
        int var3 = 11 % ((-arg0 - 59) / 60);
        if (this.field2818 instanceof class396) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2811 = new class656(var2, this.field2816, this.field2814);
                if (this.field2811.field9217 != this.field2813) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field2811 = null;
                if (this.field2825.method3362(0)) {
                    this.field2818 = null;
                } else {
                    this.field2818 = this.field2825.method3356((byte) 0, 27840, this.field2821, 255, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2811 = new class656(var2, this.field2816, this.field2814);
            } catch (RuntimeException var5) {
                this.field2825.method3353((byte) -128);
                this.field2811 = null;
                if (this.field2825.method3362(0)) {
                    this.field2818 = null;
                } else {
                    this.field2818 = this.field2825.method3356((byte) 0, 27840, this.field2821, 255, true);
                }
                return null;
            }
            if (this.field2826 != null) {
                this.field2820.method3576(this.field2826, var2, -1, this.field2821);
            }
        }
        if (this.field2815 != null) {
            this.field2827 = 0;
            this.field2833 = new byte[this.field2811.field9216];
        }
        this.field2818 = null;
        return this.field2811;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)I")
    public final int method1382(int arg0, int arg1) {
        if (arg1 != 0) {
            field2823 = null;
        }
        field2832++;
        class156 var3 = (class156) this.field2808.method4203(true, (long) arg0);
        return var3 == null ? 0 : var3.method1185(false);
    }

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)V")
    public static void method1383(int arg0) {
        if (arg0 != 0) {
            method1383(101);
        }
        field2823 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(B)I")
    public final int method1384(byte arg0) {
        if (arg0 != -17) {
            this.field2837 = null;
        }
        field2812++;
        if (this.method1381(-123) == null) {
            return this.field2818 == null ? 0 : this.field2818.method1185(false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V")
    public final void method1385(int arg0) {
        field2824++;
        if (this.field2839 != null) {
            if (this.method1381(-128) == null) {
                return;
            }
            if (this.field2836) {
                boolean var6 = true;
                for (class626 var7 = this.field2839.method1522(true); var7 != null; var7 = this.field2839.method1527((byte) 125)) {
                    int var9 = (int) var7.field8991;
                    if (this.field2833[var9] == 0) {
                        this.method1387(var9, (byte) 82, 1);
                    }
                    if (this.field2833[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method3617(arg0 - 1);
                    }
                }
                while (this.field2811.field9236.length > this.field2838) {
                    if (this.field2811.field9236[this.field2838] == 0) {
                        this.field2838++;
                    } else {
                        if (this.field2820.field8921 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field2833[this.field2838] == 0) {
                            this.method1387(this.field2838, (byte) 82, 1);
                        }
                        if (this.field2833[this.field2838] == 0) {
                            class626 var8 = new class626();
                            var8.field8991 = this.field2838;
                            this.field2839.method1526(var8, 85);
                            var6 = false;
                        }
                        this.field2838++;
                    }
                }
                if (var6) {
                    this.field2838 = 0;
                    this.field2836 = false;
                }
            } else if (this.field2835) {
                boolean var2 = true;
                for (class626 var3 = this.field2839.method1522(true); var3 != null; var3 = this.field2839.method1527((byte) 66)) {
                    int var5 = (int) var3.field8991;
                    if (this.field2833[var5] != 1) {
                        this.method1387(var5, (byte) 82, 2);
                    }
                    if (this.field2833[var5] == 1) {
                        var3.method3617(1);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field2838 < this.field2811.field9236.length) {
                    if (this.field2811.field9236[this.field2838] == 0) {
                        this.field2838++;
                    } else {
                        if (this.field2825.method3363(0)) {
                            var2 = false;
                            break;
                        }
                        if (this.field2833[this.field2838] != 1) {
                            this.method1387(this.field2838, (byte) 82, 2);
                        }
                        if (this.field2833[this.field2838] != 1) {
                            class626 var4 = new class626();
                            var4.field8991 = this.field2838;
                            this.field2839.method1526(var4, -92);
                            var2 = false;
                        }
                        this.field2838++;
                    }
                }
                if (var2) {
                    this.field2838 = 0;
                    this.field2835 = false;
                }
            } else {
                this.field2839 = null;
            }
        }
        if (this.field2841 && this.field2840 <= class742.method4128(arg0 ^ 0x3)) {
            for (class156 var10 = (class156) this.field2808.method4209(false); var10 != null; var10 = (class156) this.field2808.method4207(arg0 + 9354)) {
                if (!var10.field2336) {
                    if (var10.field2340) {
                        if (!var10.field2339) {
                            throw new RuntimeException();
                        }
                        var10.method3617(1);
                    } else {
                        var10.field2340 = true;
                    }
                }
            }
            this.field2840 = class742.method4128(1) + 1000L;
        }
        if (arg0 != 2) {
            this.field2826 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "(I)V")
    public final void method1386(int arg0) {
        field2828++;
        if (this.field2839 == null || this.method1381(127) == null) {
            return;
        }
        for (class626 var2 = this.field2837.method1522(true); var2 != null; var2 = this.field2837.method1527((byte) 78)) {
            int var3 = (int) var2.field8991;
            if (var3 < 0 || this.field2811.field9216 <= var3 || this.field2811.field9236[var3] == 0) {
                var2.method3617(1);
            } else {
                if (this.field2833[var3] == 0) {
                    this.method1387(var3, (byte) 82, 1);
                }
                if (this.field2833[var3] == -1) {
                    this.method1387(var3, (byte) 82, 2);
                }
                if (this.field2833[var3] == 1) {
                    var2.method3617(1);
                }
            }
        }
        if (arg0 != -5939) {
            this.method1381(107);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IBI)Lkt;")
    private final class156 method1387(int arg0, byte arg1, int arg2) {
        field2830++;
        class156 var4 = (class156) this.field2808.method4203(true, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field2339 && var4.field2336) {
            var4.method3617(1);
            var4 = null;
        }
        if (arg1 != 82) {
            this.method1377(-68);
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2815 == null || this.field2833[arg0] == -1) {
                    if (this.field2825.method3362(0)) {
                        return null;
                    }
                    var4 = this.field2825.method3356((byte) 2, arg1 ^ 0x6C92, arg0, this.field2821, true);
                } else {
                    var4 = this.field2820.method3574((byte) -49, this.field2815, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field2815 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2820.method3573(arg0, this.field2815, false);
            } else if (arg2 == 2) {
                if (this.field2815 == null) {
                    throw new RuntimeException();
                }
                if (this.field2833[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2825.method3363(0)) {
                    return null;
                }
                var4 = this.field2825.method3356((byte) 2, 27840, arg0, this.field2821, false);
            } else {
                throw new RuntimeException();
            }
            this.field2808.method4211(var4, (byte) 64, (long) arg0);
        }
        if (var4.field2336) {
            return null;
        }
        byte[] var5 = var4.method1187((byte) -85);
        if (!(var4 instanceof class396)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class564.field7974.reset();
                class564.field7974.update(var5, 0, var5.length - 2);
                int var6 = (int) class564.field7974.getValue();
                if (this.field2811.field9230[arg0] != var6) {
                    throw new RuntimeException();
                }
                if (this.field2811.field9214 != null && this.field2811.field9214[arg0] != null) {
                    byte[] var7 = this.field2811.field9214[arg0];
                    byte[] var8 = class259.method1761(var5.length - 2, -5766, var5, 0);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field2825.field8209 = 0;
                this.field2825.field8207 = 0;
            } catch (RuntimeException var17) {
                this.field2825.method3353((byte) -121);
                var4.method3617(arg1 ^ 0x53);
                if (var4.field2339 && !this.field2825.method3362(0)) {
                    class511 var10 = this.field2825.method3356((byte) 2, arg1 ^ 0x6C92, arg0, this.field2821, true);
                    this.field2808.method4211(var10, (byte) 24, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2811.field9228[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field2811.field9228[arg0];
            if (this.field2815 != null) {
                this.field2820.method3576(this.field2815, var5, -1, arg0);
                if (this.field2833[arg0] != 1) {
                    this.field2827++;
                    this.field2833[arg0] = 1;
                }
            }
            if (!var4.field2339) {
                var4.method3617(1);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class564.field7974.reset();
            class564.field7974.update(var5, 0, var5.length - 2);
            int var11 = (int) class564.field7974.getValue();
            if (this.field2811.field9230[arg0] != var11) {
                throw new RuntimeException();
            }
            if (this.field2811.field9214 != null && this.field2811.field9214[arg0] != null) {
                byte[] var12 = this.field2811.field9214[arg0];
                byte[] var13 = class259.method1761(var5.length - 2, -5766, var5, 0);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2811.field9228[arg0] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field2833[arg0] != 1) {
                this.field2827++;
                this.field2833[arg0] = 1;
            }
            if (!var4.field2339) {
                var4.method3617(arg1 ^ 0x53);
            }
            return var4;
        } catch (Exception var18) {
            this.field2833[arg0] = -1;
            var4.method3617(arg1 ^ 0x53);
            if (var4.field2339 && !this.field2825.method3362(0)) {
                class511 var16 = this.field2825.method3356((byte) 2, 27840, arg0, this.field2821, true);
                this.field2808.method4211(var16, (byte) 41, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(ILpk;Lpk;Lkha;Ltl;I[BIZ)V")
    public class197(int arg0, class195 arg1, class195 arg2, class580 arg3, class617 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field2815 = arg1;
        this.field2821 = arg0;
        if (this.field2815 == null) {
            this.field2836 = false;
        } else {
            this.field2836 = true;
            this.field2839 = new class220();
        }
        this.field2820 = arg4;
        this.field2825 = arg3;
        this.field2826 = arg2;
        this.field2841 = arg8;
        this.field2813 = arg7;
        this.field2814 = arg6;
        this.field2816 = arg5;
        if (this.field2826 != null) {
            this.field2818 = this.field2820.method3574((byte) -65, this.field2826, this.field2821);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2823[var0] = var1;
        }
    }
}
