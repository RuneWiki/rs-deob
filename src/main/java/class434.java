import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class434 {

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    private int field6449 = 0;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "B")
    public byte field6442 = 0;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    private int field6458 = 128;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    private int field6459 = 0;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    private int field6460 = -1;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public int field6450 = -1;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    private int field6462 = 128;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    private int field6464 = 0;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Z")
    public boolean field6446 = false;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[Z")
    public static boolean[] field6439 = new boolean[100];

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lpn;")
    public static class49 field6445 = new class49(37, 4);

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "[Lhr;")
    public static class463[] field6453 = new class463[2048];

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "Leg;")
    public static class34 field6463 = new class34("", 16);

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "[I")
    public static int[] field6467 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "F")
    public static float field6466 = 0.0F;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    private int field6441;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public int field6461;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Lqj;")
    public class421 field6451;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[S")
    private short[] field6438;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[S")
    private short[] field6444;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "[S")
    private short[] field6452;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "[S")
    private short[] field6465;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILsb;IIIILza;)Le;", line = 3)
    public final class289 method2691(int arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, class299 arg6) {
        if (arg3 <= 50) {
            this.method2693(14, null, -57);
        }
        field6457++;
        return this.method2695(false, arg5, arg4, null, 0, arg2, arg0, arg1, arg6, -181, 0, null, 0, (byte) 2);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILsb;IIIILza;ZBLya;Lya;II)Le;", line = 15)
    public final class289 method2692(int arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, class299 arg6, boolean arg7, byte arg8, class11 arg9, class11 arg10, int arg11, int arg12) {
        if (arg8 != 83) {
            this.method2696(null, -69);
        }
        field6454++;
        return this.method2695(arg7, arg2, arg0, arg10, arg3, arg5, arg11, arg1, arg6, -181, arg4, arg9, arg12, (byte) 2);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILfh;I)V", line = 35)
    private final void method2693(int arg0, class194 arg1, int arg2) {
        field6447++;
        int var4 = 36 / ((arg2 + 55) / 52);
        if (arg0 == 1) {
            this.field6441 = arg1.method1396(44);
        } else if (arg0 == 2) {
            this.field6450 = arg1.method1396(-123);
        } else if (arg0 == 4) {
            this.field6462 = arg1.method1396(86);
        } else if (arg0 == 5) {
            this.field6458 = arg1.method1396(94);
        } else if (arg0 == 6) {
            this.field6459 = arg1.method1396(78);
        } else if (arg0 == 7) {
            this.field6449 = arg1.method1337((byte) 62);
        } else if (arg0 == 8) {
            this.field6464 = arg1.method1337((byte) -127);
        } else if (arg0 == 9) {
            this.field6442 = 3;
            this.field6460 = 8224;
        } else if (arg0 == 10) {
            this.field6446 = true;
        } else if (arg0 == 11) {
            this.field6442 = 1;
        } else if (arg0 == 12) {
            this.field6442 = 4;
        } else if (arg0 == 13) {
            this.field6442 = 5;
        } else if (arg0 == 14) {
            this.field6442 = 2;
            this.field6460 = arg1.method1337((byte) -120) * 256;
        } else if (arg0 == 15) {
            this.field6442 = 3;
            this.field6460 = arg1.method1396(-90);
        } else if (arg0 == 16) {
            this.field6442 = 3;
            this.field6460 = arg1.method1401(126);
        } else if (arg0 == 40) {
            int var7 = arg1.method1337((byte) -121);
            this.field6444 = new short[var7];
            this.field6465 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field6465[var8] = (short) arg1.method1396(0);
                this.field6444[var8] = (short) arg1.method1396(-87);
            }
        } else if (arg0 == 41) {
            int var5 = arg1.method1337((byte) -114);
            this.field6438 = new short[var5];
            this.field6452 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field6452[var6] = (short) arg1.method1396(17);
                this.field6438[var6] = (short) arg1.method1396(21);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIZI)V", line = 156)
    public static final void method2694(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 != 1) {
            field6445 = null;
        }
        field6455++;
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg2);
        class100 var8 = (class100) class51.field785.method358((byte) 71, var6);
        if (var8 == null) {
            var8 = new class100();
            class51.field785.method357(var8, 1, var6);
        }
        if (arg1 >= var8.field1532.length) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field1532.length; var11++) {
                var9[var11] = var8.field1532[var11];
                var10[var11] = var8.field1534[var11];
            }
            for (int var12 = var8.field1532.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field1532 = var9;
            var8.field1534 = var10;
        }
        var8.field1532[arg1] = arg5;
        var8.field1534[arg1] = arg3;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZIILya;IIILsb;Lza;IILya;IB)Le;", line = 209)
    private final class289 method2695(boolean arg0, int arg1, int arg2, class11 arg3, int arg4, int arg5, int arg6, class222 arg7, class299 arg8, int arg9, int arg10, class11 arg11, int arg12, byte arg13) {
        field6448++;
        if (arg9 != -181) {
            field6466 = 0.4788436F;
        }
        int var15 = arg6;
        class61 var16 = this.field6450 == -1 || arg1 == -1 ? null : arg7.method1538(-4031, this.field6450);
        boolean var17 = arg0 & this.field6442 != 0;
        if (var16 != null) {
            var15 = arg6 | var16.method408(arg5, arg1, false, arg9 + 72);
        }
        if (var17) {
            var15 |= this.field6442 == 3 ? 7 : 2;
        }
        if (this.field6458 != 128) {
            var15 |= 0x2;
        }
        if (this.field6462 != 128 || this.field6459 != 0) {
            var15 |= 0x5;
        }
        class242 var18 = this.field6451.field6192;
        class289 var19;
        synchronized (this.field6451.field6192) {
            var19 = (class289) this.field6451.field6192.method1634((long) (this.field6461 |= arg8.field4590 << 29), arg9 ^ 0xFFFFFF0B);
        }
        if (var19 == null || arg8.method589(var19.method679(), var15) != 0) {
            if (var19 != null) {
                var15 = arg8.method557(var15, var19.method679());
            }
            int var20 = var15;
            if (this.field6465 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field6452 != null) {
                var20 |= 0x8000;
            }
            class153 var21 = class404.method2541(this.field6441, 0, (byte) 66, this.field6451.field6186);
            if (var21 == null) {
                return null;
            }
            if (var21.field2348 < 13) {
                var21.method1118(0, -52);
            }
            var19 = arg8.method554(var21, var20, this.field6451.field6194, this.field6449 + 64, this.field6464 + 850);
            if (this.field6465 != null) {
                for (int var22 = 0; var22 < this.field6465.length; var22++) {
                    var19.method632(this.field6465[var22], this.field6444[var22]);
                }
            }
            if (this.field6452 != null) {
                for (int var23 = 0; var23 < this.field6452.length; var23++) {
                    var19.method647(this.field6452[var23], this.field6438[var23]);
                }
            }
            var19.method662(var15);
            class242 var24 = this.field6451.field6192;
            synchronized (this.field6451.field6192) {
                this.field6451.field6192.method1623((long) (this.field6461 |= arg8.field4590 << 29), 17621, var19);
            }
        }
        class289 var25 = var16 == null ? var19.method669(arg13, var15, true) : var16.method411(arg5, arg2, arg1, arg13, 0, 0, var19, var15);
        if (this.field6462 != 128 || this.field6458 != 128) {
            var25.method676(this.field6462, this.field6458, this.field6462);
        }
        if (this.field6459 != 0) {
            if (this.field6459 == 90) {
                var25.method667(4096);
            }
            if (this.field6459 == 180) {
                var25.method667(8192);
            }
            if (this.field6459 == 270) {
                var25.method667(12288);
            }
        }
        if (var17) {
            var25.method677(this.field6442, this.field6460, arg11, arg3, arg10, arg4, arg12);
        }
        var25.method662(arg6);
        return var25;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lfh;I)V", line = 329)
    public final void method2696(class194 arg0, int arg1) {
        if (arg1 != 2048) {
            return;
        }
        field6443++;
        while (true) {
            int var3 = arg0.method1337((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method2693(var3, arg0, 92);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 352)
    public static void method2697(int arg0) {
        field6439 = null;
        if (arg0 != 110) {
            field6463 = null;
        }
        field6445 = null;
        field6453 = null;
        field6463 = null;
        field6467 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)Z", line = 376)
    public static final boolean method2698(boolean arg0, int arg1) {
        field6440++;
        if (!arg0) {
            field6445 = null;
        }
        return arg1 == 9 || arg1 == 10 || arg1 == 11;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIILsb;BILza;)Le;", line = 429)
    public final class289 method2699(int arg0, int arg1, int arg2, class222 arg3, byte arg4, int arg5, class299 arg6) {
        if (arg4 > -10) {
            method2697(100);
        }
        field6456++;
        return this.method2695(false, arg1, arg5, null, 0, arg0, arg2, arg3, arg6, -181, 0, null, 0, (byte) 5);
    }
}
