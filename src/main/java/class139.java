import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class139 extends class77 {

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "Ldc;")
    public static class37 field2695 = class185.method1233((byte) 86, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "S")
    public static short field2698 = 205;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "J")
    public static long field2702 = 0L;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "Lmf;")
    public static class136 field2694;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "[I")
    public int[] field2693;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "[I")
    private int[] field2708;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "[Ldc;")
    private class37[] field2696;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "[[I")
    private int[][] field2701;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
    public static final int method966(int arg0, int arg1) {
        if (arg0 != 1782395528) {
            method978(-117, -101);
        }
        field2691++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I")
    public final int method967(int arg0, int arg1, int arg2) {
        if (arg1 > -119) {
            return 34;
        }
        field2709++;
        if (this.field2708 == null || arg0 < 0 || arg0 > this.field2708.length) {
            return -1;
        } else if (this.field2701[arg0] == null || arg2 < 0 || this.field2701[arg0].length < arg2) {
            return -1;
        } else {
            return this.field2701[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
    public static final Object method968(byte[] arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            return null;
        }
        field2707++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class7.field75) {
            try {
                class135 var3 = (class135) Class.forName("ra").getDeclaredConstructor().newInstance();
                var3.method933(arg0, arg1);
                return var3;
            } catch (Throwable var4) {
                class7.field75 = true;
            }
        }
        return arg2 ? class180.method1199(arg0, (byte) 118) : arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLce;I)V")
    private final void method969(byte arg0, class28 arg1, int arg2) {
        field2705++;
        if (arg0 >= -115) {
            this.method969((byte) 49, null, -8);
        }
        if (arg2 == 1) {
            this.field2696 = arg1.method180(2).method331(false, 60);
        } else if (arg2 == 2) {
            int var8 = arg1.method215(-1797813752);
            this.field2693 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2693[var9] = arg1.method230((byte) -120);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method215(-1797813752);
            this.field2701 = new int[var4][];
            this.field2708 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method230((byte) -98);
                this.field2708[var5] = var6;
                this.field2701[var5] = new int[class152.field2871[var6]];
                for (int var7 = 0; var7 < class152.field2871[var6]; var7++) {
                    this.field2701[var5][var7] = arg1.method230((byte) -118);
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[Lp;IBZ[B)V")
    public static final void method970(int arg0, class163[] arg1, int arg2, byte arg3, boolean arg4, byte[] arg5) {
        field2690++;
        class28 var6 = new class28(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method201((byte) -121);
            if (var8 == 0) {
                if (arg3 > -52) {
                    field2694 = null;
                    return;
                }
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method186((byte) 20);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 12;
                int var12 = var9 & 0x3F;
                int var13 = var6.method215(-1797813752);
                int var14 = arg0 + var12;
                int var15 = var13 >> 2;
                int var16 = var9 >> 6 & 0x3F;
                int var17 = var13 & 0x3;
                int var18 = var16 + arg2;
                if (var18 > 0 && var14 > 0 && var18 < 103 && var14 < 103) {
                    class163 var19 = null;
                    if (!arg4) {
                        int var20 = var11;
                        if ((class193.field3602[1][var18][var14] & 0x2) == 2) {
                            var20 = var11 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class82.method565(var14, var19, var17, class16.field259, var11, !arg4, var15, 105, var11, var18, arg4, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)Ldc;")
    public final class37 method971(byte arg0) {
        int var2 = 99 / ((-arg0 - 58) / 42);
        field2699++;
        class37 var3 = class185.method1232(80, 0);
        var3.method320(this.field2696[0], (byte) 122);
        for (int var4 = 1; var4 < this.field2696.length; var4++) {
            var3.method320(class125.field2288, (byte) 109);
            var3.method320(this.field2696[var4], (byte) 102);
        }
        return var3.method341((byte) -11);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lce;I[I)V")
    public final void method972(class28 arg0, int arg1, int[] arg2) {
        field2697++;
        if (this.field2708 == null) {
            return;
        }
        if (arg1 != 4056) {
            this.method974(null, -88);
        }
        for (int var4 = 0; var4 < this.field2708.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class128.field2420[this.method973(0, var4)];
            if (var5 > 0) {
                arg0.method202(44, var5, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
    public final int method973(int arg0, int arg1) {
        field2704++;
        if (this.field2708 == null || arg1 < 0 || this.field2708.length < arg1) {
            return -1;
        } else if (arg0 == 0) {
            return this.field2708[arg1];
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lce;I)Ldc;")
    public final class37 method974(class28 arg0, int arg1) {
        class37 var3 = class185.method1232(80, arg1);
        if (this.field2708 != null) {
            for (int var4 = 0; var4 < this.field2708.length; var4++) {
                var3.method320(this.field2696[var4], (byte) 101);
                var3.method320(class158.method1066(-6, this.field2708[var4], arg0.method203(class101.field1745[this.field2708[var4]], 0), this.field2701[var4]), (byte) 100);
            }
        }
        var3.method320(this.field2696[this.field2696.length - 1], (byte) 116);
        field2703++;
        return var3.method341((byte) -11);
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)I")
    public final int method975(int arg0) {
        if (arg0 != 0) {
            field2698 = 13;
        }
        field2692++;
        return this.field2708 == null ? 0 : this.field2708.length;
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
    public static void method976(int arg0) {
        field2695 = null;
        field2694 = null;
        if (arg0 != -4) {
            field2695 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lce;I)V")
    public final void method977(class28 arg0, int arg1) {
        if (arg1 != -28386) {
            this.field2696 = null;
        }
        while (true) {
            int var3 = arg0.method215(-1797813752);
            if (var3 == 0) {
                field2706++;
                return;
            }
            this.method969((byte) -125, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)I")
    public static final int method978(int arg0, int arg1) {
        field2700++;
        return arg1 == 1 ? arg0 & 0x3FF : -53;
    }
}
