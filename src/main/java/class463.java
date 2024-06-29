import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class463 extends class725 {

    @OriginalMember(owner = "client!fea", name = "v", descriptor = "Lmba;")
    private class646 field6434 = new class646();

    @OriginalMember(owner = "client!fea", name = "H", descriptor = "I")
    private int field6445 = 256;

    @OriginalMember(owner = "client!fea", name = "K", descriptor = "I")
    private int field6447 = 0;

    @OriginalMember(owner = "client!fea", name = "L", descriptor = "I")
    private int field6448 = 256;

    @OriginalMember(owner = "client!fea", name = "y", descriptor = "I")
    private int field6437;

    @OriginalMember(owner = "client!fea", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field6426 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!fea", name = "u", descriptor = "Lkr;")
    public static class602 field6433 = new class602(84, 4);

    @OriginalMember(owner = "client!fea", name = "O", descriptor = "F")
    public static float field6451;

    @OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!fea", name = "q", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!fea", name = "r", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!fea", name = "s", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!fea", name = "t", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!fea", name = "w", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!fea", name = "x", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!fea", name = "A", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!fea", name = "C", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!fea", name = "E", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!fea", name = "G", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!fea", name = "M", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!fea", name = "N", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!fea", name = "P", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!fea", name = "R", descriptor = "I")
    private int field6454;

    @OriginalMember(owner = "client!fea", name = "B", descriptor = "Luu;")
    public static class237 field6440;

    @OriginalMember(owner = "client!fea", name = "Q", descriptor = "Lls;")
    public static class569 field6453;

    @OriginalMember(owner = "client!fea", name = "F", descriptor = "Z")
    private boolean field6443;

    @OriginalMember(owner = "client!fea", name = "J", descriptor = "Z")
    private boolean field6446;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 3)
    public final synchronized void method366(int arg0) {
        field6435++;
        if (this.field6443) {
            return;
        }
        while (true) {
            class506 var2 = this.method2832(0);
            if (var2 == null) {
                if (this.field6446) {
                    this.method549(6410);
                    class669.field9239.method1941((byte) 104);
                }
                return;
            }
            if ((var2.field7036[0].length - this.field6454) > arg0) {
                this.field6454 += arg0;
                return;
            }
            arg0 -= var2.field7036[0].length - this.field6454;
            this.method2836(-96);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "([III)V", line = 43)
    public final synchronized void method360(int[] arg0, int arg1, int arg2) {
        field6450++;
        if (this.field6443) {
            return;
        }
        if (this.method2832(0) != null) {
            int var4 = arg1 + arg2;
            if (class644.field8627) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field6437 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class506 var7 = this.method2832(0);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field7036;
                while (var4 > arg1 && this.field6454 < var8[0].length) {
                    if (class644.field8627) {
                        arg0[arg1++] = var8[var5][this.field6454] * this.field6445;
                        arg0[arg1++] = var8[var6][this.field6454] * this.field6448;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field6454] * this.field6445 + (var8[var6][this.field6454] * this.field6448);
                    }
                    this.field6454++;
                }
                if (var8[0].length <= this.field6454) {
                    this.method2836(61);
                }
            }
        } else if (this.field6446) {
            this.method549(6410);
            class669.field9239.method1941((byte) 104);
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)Lhha;", line = 111)
    private final synchronized class506 method2832(int arg0) {
        field6429++;
        return arg0 == 0 ? (class506) this.field6434.method3618(91) : null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)D", line = 131)
    public final synchronized double method2833(boolean arg0) {
        field6444++;
        if (this.field6447 < 1) {
            return -1.0D;
        }
        class506 var2 = (class506) this.field6434.method3618(-62);
        if (var2 == null) {
            return -1.0D;
        } else if (arg0) {
            return 1.3764277548118D;
        } else {
            return (double) (-((float) var2.field7036[0].length / (float) class718.field9998)) + var2.field7037;
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "()Lco;", line = 152)
    public final class725 method358() {
        field6436++;
        return null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IDB)Lhha;", line = 161)
    public final class506 method2834(int arg0, double arg1, byte arg2) {
        field6439++;
        long var5 = (long) (this.field6437 << 0 | arg0);
        class506 var7 = (class506) class669.field9239.method1945((byte) -52, var5);
        if (var7 == null) {
            var7 = new class506(new short[this.field6437][arg0], arg1);
        } else {
            var7.field7037 = arg1;
            class669.field9239.method1944(var5, true);
        }
        if (arg2 != 64) {
            this.method2835((byte) 122);
        }
        return var7;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V", line = 185)
    public final synchronized void method2835(byte arg0) {
        int var2 = -49 / ((31 - arg0) / 58);
        field6431++;
        this.field6446 = true;
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)V", line = 195)
    private final synchronized void method2836(int arg0) {
        field6438++;
        int var2 = -115 % ((1 - arg0) / 36);
        class506 var3 = this.method2832(0);
        if (var3 != null) {
            var3.method549(6410);
            this.field6454 = 0;
            this.field6447--;
            class669.field9239.method1940(var3, (byte) -27, var3.method3042((byte) -46));
        }
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "()I", line = 217)
    public final int method355() {
        field6430++;
        return 1;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZZ)V", line = 225)
    public final synchronized void method2837(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field6443 = arg1;
            field6441++;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "()Lco;", line = 236)
    public final class725 method357() {
        field6432++;
        return null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lkaa;B)V", line = 246)
    public static final void method2838(class583 arg0, byte arg1) {
        class365.field5189.method3610(9289, arg0);
        field6442++;
        arg0.field7961 = arg0.field7963.field956;
        class721.field10031 += arg0.field7961;
        if (arg1 <= 116) {
            method2839(false);
        }
        arg0.field7963.field956 = 0;
    }

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "(Z)V", line = 263)
    public static void method2839(boolean arg0) {
        if (arg0) {
            field6453 = null;
        }
        field6426 = null;
        field6440 = null;
        field6433 = null;
        field6453 = null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lhha;B)V", line = 276)
    public final synchronized void method2840(class506 arg0, byte arg1) {
        while (this.field6447 >= 100) {
            this.field6434.method3623(0);
            this.field6447--;
        }
        field6427++;
        if (arg1 != 81) {
            method2838(null, (byte) 78);
        }
        this.field6434.method3610(9289, arg0);
        this.field6447++;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)V", line = 296)
    public final void method2841(int arg0, byte arg1) {
        this.field6448 = arg0;
        if (arg1 >= -121) {
            this.method2837(false, true);
        }
        this.field6445 = arg0;
        field6449++;
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(I)V", line = 346)
    public class463(int arg0) {
        this.field6437 = arg0;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)I", line = 312)
    public final synchronized int method2842(byte arg0) {
        field6428++;
        return arg0 == 61 ? this.field6447 : -91;
    }
}
