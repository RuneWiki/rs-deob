import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class423 {

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Lm;")
    private class475 field6048 = null;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public int field6037;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Z")
    private boolean field6018;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Lht;")
    private class393 field6040;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[Ljava/lang/Object;")
    private Object[] field6027;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6053;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method2588(String arg0, byte arg1) {
        int var3 = 109 / ((arg1 - 9) / 49);
        field6026++;
        int var4 = this.method2602((byte) -118, "");
        return var4 == -1 ? this.method2590("", arg0, 127) : this.method2590(arg0, "", 124);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final void method2589(int arg0) {
        field6061++;
        if (this.field6053 != null) {
            for (int var2 = 0; var2 < this.field6053.length; var2++) {
                this.field6053[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.field6048 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    private final boolean method2590(String arg0, String arg1, int arg2) {
        field6057++;
        if (!this.method2612(false)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field6048.field6755.method431(class355.method2264(var4, (byte) 95), 96);
        if (!this.method2598(var6, (byte) 99)) {
            return false;
        }
        if (arg2 <= 109) {
            this.field6040 = null;
        }
        int var7 = this.field6048.field6762[var6].method431(class355.method2264(var5, (byte) 76), 103);
        return this.method2613(var7, var6, -50);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
    public final byte[] method2591(String arg0, byte arg1, String arg2) {
        field6024++;
        if (!this.method2612(false)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field6048.field6755.method431(class355.method2264(var4, (byte) 74), 100);
        if (!this.method2598(var6, (byte) 73)) {
            return null;
        }
        int var7 = this.field6048.field6762[var6].method431(class355.method2264(var5, (byte) 95), 102);
        if (arg1 != 71) {
            this.method2617(-125, -93);
        }
        return this.method2600(0, var6, var7);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)I")
    public static final int method2592(int arg0) {
        if (arg0 != -1) {
            field6029 = -79;
        }
        field6050++;
        return class76.field1105;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    private final void method2593(int arg0, int arg1) {
        if (this.field6018) {
            this.field6027[arg0] = this.field6040.method1600(arg0, -99);
        } else {
            this.field6027[arg0] = class452.method2769(this.field6040.method1600(arg0, -114), false, 124);
        }
        if (arg1 != 0) {
            this.field6018 = false;
        }
        field6044++;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
    private final void method2594(int arg0, int arg1) {
        if (arg1 < 85) {
            this.method2588(null, (byte) 80);
        }
        field6055++;
        this.field6040.method1598(arg0, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method2595(int arg0, String arg1, String arg2) {
        if (arg0 != 28818) {
            return false;
        }
        field6052++;
        if (!this.method2612(false)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field6048.field6755.method431(class355.method2264(var4, (byte) 107), 120);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field6048.field6762[var6].method431(class355.method2264(var5, (byte) 76), arg0 - 28705);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)Z")
    private final boolean method2596(int arg0, byte arg1, int arg2) {
        if (arg1 != 54) {
            this.field6053 = null;
        }
        field6046++;
        if (!this.method2612(false)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field6048.field6757.length > arg2 && arg0 < this.field6048.field6757[arg2]) {
            return true;
        } else if (class296.field4056) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IIII)Z")
    private final boolean method2597(int[] arg0, int arg1, int arg2, int arg3) {
        field6025++;
        if (!this.method2598(arg2, (byte) 68)) {
            return false;
        } else if (this.field6027[arg2] == null) {
            return false;
        } else {
            int var5 = this.field6048.field6751[arg2];
            int[] var6 = this.field6048.field6746[arg2];
            if (this.field6053[arg2] == null) {
                this.field6053[arg2] = new Object[this.field6048.field6757[arg2]];
            }
            Object[] var7 = this.field6053[arg2];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var11 = class535.method3238(26, true, this.field6027[arg2]);
                class479 var12 = new class479(var11);
                var12.method2913(var12.field6800.length, (byte) 57, 5, arg0);
            } else {
                var11 = class535.method3238(26, false, this.field6027[arg2]);
            }
            byte[] var13;
            try {
                var13 = class677.method3853(-107, var11);
            } catch (RuntimeException var49) {
                throw class206.method1472(var49, "T3 - " + (arg0 != null) + "," + arg2 + "," + var11.length + "," + class43.method440(var11, var11.length, 99) + "," + class43.method440(var11, var11.length - 2, -96) + "," + this.field6048.field6752[arg2] + "," + this.field6048.field6747);
            }
            if (arg1 >= -77) {
                this.method2588(null, (byte) 66);
            }
            if (this.field6018) {
                this.field6027[arg2] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field6037 == 0) {
                    var7[var15] = class452.method2769(var13, false, 125);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field6037 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class479 var19 = new class479(var13);
                int var20 = 0;
                int var21 = 0;
                var19.field6864 = var18;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method2868(-59);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg3 == var25) {
                            var21 = var25;
                            var20 += var23;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field6864 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method2868(-122);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg3 == var32) {
                            class85.method683(var13, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var13.length;
                int var51 = var33 - 1;
                int var34 = var13[var51] & 0xFF;
                int var35 = var51 - var5 * 4 * var34;
                class479 var36 = new class479(var13);
                var36.field6864 = var35;
                int[] var37 = new int[var5];
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method2868(-75);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field6864 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method2868(-38);
                        class85.method683(var13, var43, var41[var46], var37[var46], var45);
                        var37[var46] += var45;
                        var43 += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field6037 == 0) {
                        var7[var48] = class452.method2769(var41[var47], false, 123);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
    private final boolean method2598(int arg0, byte arg1) {
        field6031++;
        if (!this.method2612(false)) {
            return false;
        }
        if (arg1 < 59) {
            this.field6053 = null;
        }
        if (arg0 >= 0 && arg0 < this.field6048.field6757.length && this.field6048.field6757[arg0] != 0) {
            return true;
        } else if (class296.field4056) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V")
    public static final void method2599(int arg0, int arg1, int arg2, int arg3) {
        field6049++;
        if (class405.field5774 == arg3 && class662.field9461 == arg1 && class365.field5334 == arg2) {
            return;
        }
        class235.field3518 = true;
        class365.field5334 = arg2;
        class662.field9461 = arg1;
        class405.field5774 = arg3;
        double var4 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class350.field5199 = -var8 * var14;
        class660.field9442 = -var10 * var12;
        class288.field3994 = var10 * var14;
        if (arg0 != 10833) {
            return;
        }
        class38.field487 = var8;
        class240.field3559 = 0.0D;
        class393.field5651 = var14;
        class283.field3954 = var8 * var12;
        class385.field5572 = var10;
        class614.field8763 = var12;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)[B")
    public final byte[] method2600(int arg0, int arg1, int arg2) {
        field6041++;
        if (arg0 != 0) {
            this.method2604(null, 115);
        }
        return this.method2618(arg2, true, arg1, null);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
    public static final void method2601(int arg0) {
        for (class194 var1 = (class194) class225.field3348.method3025(false); var1 != null; var1 = (class194) class225.field3348.method3026(true)) {
            if (var1.field2845 > 1) {
                var1.field2845 = 0;
                class696.field9836.method2213((byte) -16, ((class304) var1.field2841.field7165.field5596).field4153, var1);
                var1.field2841.method3031(arg0 ^ 0xFFFFCECA);
            }
        }
        field6032++;
        class456.field6499 = 0;
        class654.field9376 = 0;
        class303.field4137.method3553(arg0 + 29372);
        class326.field4420.method4013(-3);
        class225.field3348.method3031(arg0 + 46666);
        if (arg0 == -29372) {
            class394.method2400(arg0 + 29252, class705.field9940);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method2602(byte arg0, String arg1) {
        field6034++;
        if (!this.method2612(false)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 >= -117) {
            this.field6053 = null;
        }
        int var4 = this.field6048.field6755.method431(class355.method2264(var3, (byte) 117), 116);
        return this.method2598(var4, (byte) 88) ? var4 : -1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method2603(String arg0, boolean arg1) {
        field6043++;
        if (this.method2612(arg1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6048.field6755.method431(class355.method2264(var3, (byte) 103), 95);
            return this.method2619(true, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2604(String arg0, int arg1) {
        field6059++;
        if (!this.method2612(false)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 > -38) {
            this.method2593(-59, 82);
        }
        int var4 = this.field6048.field6755.method431(class355.method2264(var3, (byte) 101), 96);
        return this.method2617(0, var4);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2605(int arg0, String arg1) {
        field6021++;
        if (arg0 != -2) {
            this.field6018 = false;
        }
        if (this.method2612(false)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6048.field6755.method431(class355.method2264(var3, (byte) 80), 82);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZI)V")
    public final void method2606(boolean arg0, boolean arg1, int arg2) {
        field6039++;
        if (!this.method2612(false)) {
            return;
        }
        if (arg1) {
            this.field6048.field6755 = null;
            this.field6048.field6749 = null;
        }
        if (arg0) {
            this.field6048.field6762 = null;
            this.field6048.field6753 = null;
        }
        if (arg2 < 35) {
            this.field6037 = -2;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(BLjava/lang/String;)V")
    public final void method2607(byte arg0, String arg1) {
        field6030++;
        if (!this.method2612(false)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field6048.field6755.method431(class355.method2264(var3, (byte) 72), 74);
        this.method2594(var4, 90);
        if (arg0 < 67) {
            this.method2596(101, (byte) -18, 101);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public final void method2608(int arg0) {
        if (arg0 != 27491) {
            return;
        }
        if (this.field6027 != null) {
            for (int var2 = 0; var2 < this.field6027.length; var2++) {
                this.field6027[var2] = null;
            }
        }
        field6022++;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lht;ZI)V")
    public class423(class393 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6037 = arg2;
        this.field6018 = arg1;
        this.field6040 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)Z")
    public final boolean method2609(int arg0, int arg1) {
        field6036++;
        if (!this.method2612(false)) {
            return false;
        } else if (this.field6048.field6757.length == 1) {
            return this.method2613(arg1, 0, -114);
        } else if (this.method2598(arg1, (byte) 70)) {
            if (arg0 != 0) {
                this.method2603(null, false);
            }
            if (this.field6048.field6757[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method2613(0, arg1, -91);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)I")
    public final int method2610(int arg0) {
        field6038++;
        if (!this.method2612(false)) {
            return 0;
        }
        int var2 = 0;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field6027.length; var4++) {
            if (this.field6048.field6751[var4] > 0) {
                var2 += 100;
                var3 += this.method2619(true, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[B")
    public final byte[] method2611(byte arg0, int arg1) {
        field6051++;
        if (!this.method2612(false)) {
            return null;
        }
        int var3 = -47 % ((arg0 + 55) / 32);
        if (this.field6048.field6757.length == 1) {
            return this.method2600(0, 0, arg1);
        } else if (!this.method2598(arg1, (byte) 119)) {
            return null;
        } else if (this.field6048.field6757[arg1] == 1) {
            return this.method2600(0, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Z")
    private final boolean method2612(boolean arg0) {
        field6035++;
        if (arg0) {
            method2592(-35);
        }
        if (this.field6048 == null) {
            this.field6048 = this.field6040.method1597(0);
            if (this.field6048 == null) {
                return false;
            }
            this.field6053 = new Object[this.field6048.field6758][];
            this.field6027 = new Object[this.field6048.field6758];
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(III)Z")
    public final boolean method2613(int arg0, int arg1, int arg2) {
        field6020++;
        if (!this.method2596(arg0, (byte) 54, arg1)) {
            return false;
        } else if (this.field6053[arg1] != null && this.field6053[arg1][arg0] != null) {
            return true;
        } else if (this.field6027[arg1] == null) {
            this.method2593(arg1, 0);
            if (this.field6027[arg1] == null) {
                if (arg2 > -18) {
                    this.field6027 = null;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(BI)V")
    public final void method2614(byte arg0, int arg1) {
        field6023++;
        if (arg0 < 49) {
            this.method2605(7, null);
        }
        if (this.method2598(arg1, (byte) 108) && this.field6053 != null) {
            this.field6053[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)I")
    public final int method2615(boolean arg0) {
        field6019++;
        if (!this.method2612(arg0)) {
            throw new IllegalStateException("");
        }
        return this.field6048.field6747;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(II)I")
    public final int method2616(int arg0, int arg1) {
        if (arg1 == 0) {
            field6028++;
            return this.method2598(arg0, (byte) 81) ? this.field6048.field6757[arg0] : 0;
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(II)Z")
    public final boolean method2617(int arg0, int arg1) {
        field6054++;
        if (!this.method2598(arg1, (byte) 103)) {
            return false;
        } else if (this.field6027[arg1] == null) {
            this.method2593(arg1, arg0);
            return this.field6027[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI[I)[B")
    public final byte[] method2618(int arg0, boolean arg1, int arg2, int[] arg3) {
        field6042++;
        if (!this.method2596(arg0, (byte) 54, arg2)) {
            return null;
        }
        if (this.field6053[arg2] == null || this.field6053[arg2][arg0] == null) {
            boolean var5 = this.method2597(arg3, -101, arg2, arg0);
            if (!var5) {
                this.method2593(arg2, 0);
                boolean var6 = this.method2597(arg3, -103, arg2, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (!arg1) {
            this.method2615(false);
        }
        byte[] var7 = class535.method3238(26, false, this.field6053[arg2][arg0]);
        if (this.field6037 == 1) {
            this.field6053[arg2][arg0] = null;
            if (this.field6048.field6757[arg2] == 1) {
                this.field6053[arg2] = null;
            }
        } else if (this.field6037 == 2) {
            this.field6053[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)I")
    private final int method2619(boolean arg0, int arg1) {
        field6056++;
        if (!arg0) {
            method2592(-87);
        }
        if (this.method2598(arg1, (byte) 74)) {
            return this.field6027[arg1] == null ? this.field6040.method1595(true, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(Z)Z")
    public final boolean method2620(boolean arg0) {
        field6060++;
        if (!this.method2612(!arg0)) {
            return false;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field6048.field6767.length; var3++) {
            int var4 = this.field6048.field6767[var3];
            if (this.field6027[var4] == null) {
                this.method2593(var4, 0);
                if (this.field6027[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(II)[I")
    public final int[] method2621(int arg0, int arg1) {
        if (arg1 != 100) {
            this.field6053 = null;
        }
        field6047++;
        if (!this.method2598(arg0, (byte) 109)) {
            return null;
        }
        int[] var3 = this.field6048.field6746[arg0];
        if (var3 == null) {
            var3 = new int[this.field6048.field6751[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)I")
    public final int method2622(int arg0, boolean arg1) {
        field6045++;
        if (this.method2612(arg1)) {
            int var3 = this.field6048.field6755.method431(arg0, 64);
            return this.method2598(var3, (byte) 118) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)I")
    public final int method2623(int arg0) {
        field6058++;
        if (arg0 == -1) {
            return this.method2612(false) ? this.field6048.field6757.length : -1;
        } else {
            return -38;
        }
    }
}
