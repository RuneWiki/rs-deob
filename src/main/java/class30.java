import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class30 {

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "Loia;")
    private class56 field295 = null;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "Lsw;")
    private class629 field299;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "Z")
    private boolean field296;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field274 = 100;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "[I")
    public static int[] field272;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "[Ljava/lang/Object;")
    private Object[] field285;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field304;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)[I")
    public final int[] method125(int arg0, byte arg1) {
        field271++;
        if (!this.method149(arg0, false)) {
            return null;
        }
        int[] var3 = this.field295.field733[arg0];
        if (var3 == null) {
            var3 = new int[this.field295.field735[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        int var5 = 16 / ((11 - arg1) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)Z")
    private final boolean method126(byte arg0) {
        field293++;
        if (arg0 < 103) {
            return false;
        }
        if (this.field295 == null) {
            this.field295 = this.field299.method3195((byte) 101);
            if (this.field295 == null) {
                return false;
            }
            this.field285 = new Object[this.field295.field719];
            this.field304 = new Object[this.field295.field719][];
        }
        return true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)Z")
    public final boolean method127(byte arg0, int arg1, int arg2) {
        field308++;
        if (arg0 < 68) {
            this.method147((byte) -12, true, true);
        }
        if (!this.method128(arg2, (byte) -6, arg1)) {
            return false;
        } else if (this.field304[arg1] != null && this.field304[arg1][arg2] != null) {
            return true;
        } else if (this.field285[arg1] == null) {
            this.method161(-39, arg1);
            return this.field285[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBI)Z")
    private final boolean method128(int arg0, byte arg1, int arg2) {
        field280++;
        if (arg1 != -6) {
            field274 = 69;
        }
        if (!this.method126((byte) 124)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field295.field737.length > arg2 && this.field295.field737[arg2] > arg0) {
            return true;
        } else if (class591.field7497) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BIIIII)V")
    public static final void method129(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg2; var6++) {
            class54.method333(arg4, class207.field2840[var6], 7, arg1, arg3);
        }
        if (arg0 == -70) {
            field289++;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Z")
    public final boolean method130(int arg0, int arg1) {
        field278++;
        if (!this.method126((byte) 114)) {
            return false;
        } else if (this.field295.field737.length == 1) {
            return this.method127((byte) 92, 0, arg1);
        } else if (!this.method149(arg1, false)) {
            return false;
        } else if (~this.field295.field737[arg1] == arg0) {
            return this.method127((byte) 99, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZI)V")
    public final void method131(boolean arg0, int arg1) {
        field277++;
        if (this.method149(arg1, false) && arg0 && this.field304 != null) {
            this.field304[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public final void method132(int arg0) {
        if (arg0 >= -11) {
            this.method127((byte) -73, -43, 107);
        }
        field306++;
        if (this.field285 != null) {
            for (int var2 = 0; var2 < this.field285.length; var2++) {
                this.field285[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V")
    private final void method133(int arg0, int arg1) {
        field307++;
        this.field299.method3199((byte) 91, arg1);
        if (arg0 != 26449) {
            this.method159(-79);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([IIBI)Z")
    private final boolean method134(int[] arg0, int arg1, byte arg2, int arg3) {
        field266++;
        if (!this.method149(arg1, false)) {
            return false;
        } else if (this.field285[arg1] == null) {
            return false;
        } else {
            int var5 = this.field295.field735[arg1];
            int[] var6 = this.field295.field733[arg1];
            if (this.field304[arg1] == null) {
                this.field304[arg1] = new Object[this.field295.field737[arg1]];
            }
            Object[] var7 = this.field304[arg1];
            boolean var8 = true;
            int var9 = 0;
            int var10 = 87 / ((arg2 + 42) / 34);
            while (var9 < var5) {
                int var11;
                if (var6 == null) {
                    var11 = var9;
                } else {
                    var11 = var6[var9];
                }
                if (var7[var11] == null) {
                    var8 = false;
                    break;
                }
                var9++;
            }
            if (var8) {
                return true;
            }
            byte[] var12;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var12 = class170.method1076(this.field285[arg1], 18406, true);
                class234 var13 = new class234(var12);
                var13.method1548(-38, var13.field3193.length, 5, arg0);
            } else {
                var12 = class170.method1076(this.field285[arg1], 18406, false);
            }
            byte[] var14;
            try {
                var14 = class60.method357(var12, -31464);
            } catch (RuntimeException var50) {
                throw class161.method1031(var50, "T3 - " + (arg0 != null) + "," + arg1 + "," + var12.length + "," + class169.method1075(true, var12.length, var12) + "," + class169.method1075(true, var12.length - 2, var12) + "," + this.field295.field717[arg1] + "," + this.field295.field723);
            }
            if (this.field296) {
                this.field285[arg1] = null;
            }
            if (var5 <= 1) {
                int var49;
                if (var6 == null) {
                    var49 = 0;
                } else {
                    var49 = var6[0];
                }
                if (this.field294 == 0) {
                    var7[var49] = class287.method1743(99999999, false, var14);
                } else {
                    var7[var49] = var14;
                }
            } else if (this.field294 == 2) {
                int var32 = var14.length;
                int var52 = var32 - 1;
                int var33 = var14[var52] & 0xFF;
                int var34 = var52 - var5 * var33 * 4;
                class234 var35 = new class234(var14);
                int var36 = 0;
                var35.field3133 = var34;
                int var37 = 0;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method1497((byte) 47);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg3 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field3133 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method1497((byte) 114);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg3 == var48) {
                            class642.method3480(var14, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var14.length;
                int var51 = var16 - 1;
                int var17 = var14[var51] & 0xFF;
                int var18 = var51 - var17 * 4 * var5;
                class234 var19 = new class234(var14);
                var19.field3133 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method1497((byte) 54);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field3133 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method1497((byte) 73);
                        class642.method3480(var14, var26, var24[var29], var20[var29], var28);
                        var20[var29] += var28;
                        var26 += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field294 == 0) {
                        var7[var31] = class287.method1743(99999999, false, var24[var30]);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method135(int arg0, String arg1) {
        field309++;
        if (!this.method126((byte) 126)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field295.field720.method1774(121, class608.method3263(true, var3));
        if (this.method149(var4, false)) {
            return arg0 == 0 ? var4 : -63;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IB)I")
    public final int method136(int arg0, byte arg1) {
        field279++;
        if (arg1 != -74) {
            return -87;
        } else if (this.method126((byte) 108)) {
            int var3 = this.field295.field720.method1774(19, arg0);
            return this.method149(var3, false) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)I")
    private final int method137(byte arg0, int arg1) {
        field290++;
        if (arg0 >= -99) {
            this.method128(124, (byte) 87, 117);
        }
        if (this.method149(arg1, false)) {
            return this.field285[arg1] == null ? this.field299.method3205(arg1, (byte) -105) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)I")
    public final int method138(int arg0, int arg1) {
        field292++;
        if (this.method149(arg1, false)) {
            return arg0 == 0 ? this.field295.field737[arg1] : -113;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IBI)[B")
    public final byte[] method139(int arg0, byte arg1, int arg2) {
        field300++;
        if (arg1 != -94) {
            method158((byte) 126);
        }
        return this.method152(16, null, arg0, arg2);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)I")
    public final int method140(int arg0) {
        field270++;
        if (arg0 != -15616) {
            this.field285 = null;
        }
        if (!this.method126((byte) 110)) {
            throw new IllegalStateException("");
        }
        return this.field295.field723;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method141(String arg0, int arg1) {
        field267++;
        if (this.method126((byte) 117)) {
            String var3 = arg0.toLowerCase();
            int var4 = -57 / ((arg1 - 9) / 43);
            int var5 = this.field295.field720.method1774(77, class608.method3263(true, var3));
            return this.method156(9657, var5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method142(int arg0, String arg1, String arg2) {
        field287++;
        if (arg0 != -1) {
            this.method136(-110, (byte) -83);
        }
        if (!this.method126((byte) 127)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field295.field720.method1774(97, class608.method3263(true, var4));
        if (this.method149(var6, false)) {
            int var7 = this.field295.field734[var6].method1774(101, class608.method3263(true, var5));
            return this.method139(var6, (byte) -94, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)I")
    public final int method143(byte arg0) {
        if (arg0 != 106) {
            field274 = 64;
        }
        field284++;
        return this.method126((byte) 115) ? this.field295.field737.length : -1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z")
    private final boolean method144(String arg0, String arg1, boolean arg2) {
        field305++;
        if (!this.method126((byte) 110)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field295.field720.method1774(55, class608.method3263(arg2, var4));
        if (this.method149(var6, !arg2)) {
            int var7 = this.field295.field734[var6].method1774(32, class608.method3263(arg2, var5));
            return this.method127((byte) 117, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)[I")
    public static final int[] method145(int arg0) {
        if (arg0 <= 108) {
            field272 = null;
        }
        field276++;
        return new int[] { class234.field3199, class353.field4310, class657.field8536 };
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method146(String arg0, byte arg1) {
        int var3 = 86 % ((90 - arg1) / 33);
        field286++;
        int var4 = this.method135(0, "");
        return var4 == -1 ? this.method144("", arg0, true) : this.method144(arg0, "", true);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BZZ)V")
    public final void method147(byte arg0, boolean arg1, boolean arg2) {
        field291++;
        if (arg0 != -128) {
            this.field299 = null;
        }
        if (!this.method126((byte) 115)) {
            return;
        }
        if (arg1) {
            this.field295.field722 = null;
            this.field295.field734 = null;
        }
        if (arg2) {
            this.field295.field738 = null;
            this.field295.field720 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(BI)[B")
    public final byte[] method148(byte arg0, int arg1) {
        field283++;
        if (!this.method126((byte) 116)) {
            return null;
        }
        int var3 = -83 / ((arg0 + 80) / 46);
        if (this.field295.field737.length == 1) {
            return this.method139(0, (byte) -94, arg1);
        } else if (!this.method149(arg1, false)) {
            return null;
        } else if (this.field295.field737[arg1] == 1) {
            return this.method139(arg1, (byte) -94, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)Z")
    private final boolean method149(int arg0, boolean arg1) {
        field298++;
        if (!this.method126((byte) 106)) {
            return false;
        } else if (arg1) {
            return true;
        } else if (arg0 >= 0 && this.field295.field737.length > arg0 && this.field295.field737[arg0] != 0) {
            return true;
        } else if (class591.field7497) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method150(int arg0, String arg1, String arg2) {
        field303++;
        if (!this.method126((byte) 111)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        if (arg0 != 16) {
            this.method127((byte) 39, -54, -84);
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field295.field720.method1774(40, class608.method3263(true, var4));
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field295.field734[var6].method1774(75, class608.method3263(true, var5));
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method151(String arg0, int arg1) {
        field275++;
        if (!this.method126((byte) 106)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 0) {
            this.field294 = 31;
        }
        int var4 = this.field295.field720.method1774(43, class608.method3263(true, var3));
        return this.method137((byte) -110, var4);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[III)[B")
    public final byte[] method152(int arg0, int[] arg1, int arg2, int arg3) {
        field301++;
        if (!this.method128(arg3, (byte) -6, arg2)) {
            return null;
        }
        if (arg0 != 16) {
            this.method149(91, false);
        }
        if (this.field304[arg2] == null || this.field304[arg2][arg3] == null) {
            boolean var5 = this.method134(arg1, arg2, (byte) 49, arg3);
            if (!var5) {
                this.method161(-92, arg2);
                boolean var6 = this.method134(arg1, arg2, (byte) 38, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class170.method1076(this.field304[arg2][arg3], 18406, false);
        if (this.field294 == 1) {
            this.field304[arg2][arg3] = null;
            if (this.field295.field737[arg2] == 1) {
                this.field304[arg2] = null;
            }
        } else if (this.field294 == 2) {
            this.field304[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ICLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method153(int arg0, char arg1, String arg2, String arg3) {
        field302++;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = var4;
        if (arg0 != 12724) {
            method153(-107, 'O', null, null);
        }
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg3.indexOf(arg1, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg3.indexOf(arg1, var10);
            if (var11 < 0) {
                var9.append(arg3.substring(var10));
                return var9.toString();
            }
            var9.append(arg3.substring(var10, var11));
            var9.append(arg2);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(Ljava/lang/String;I)V")
    public final void method154(String arg0, int arg1) {
        field269++;
        if (!this.method126((byte) 112)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field295.field720.method1774(95, class608.method3263(true, var3));
        if (arg1 != 3) {
            this.method135(55, null);
        }
        this.method133(26449, var4);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
    public final void method155(boolean arg0) {
        if (arg0) {
            return;
        }
        if (this.field304 != null) {
            for (int var2 = 0; var2 < this.field304.length; var2++) {
                this.field304[var2] = null;
            }
        }
        field273++;
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(II)Z")
    public final boolean method156(int arg0, int arg1) {
        field288++;
        if (arg0 != 9657) {
            this.field285 = null;
        }
        if (!this.method149(arg1, false)) {
            return false;
        } else if (this.field285[arg1] == null) {
            this.method161(-65, arg1);
            return this.field285[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)Z")
    public final boolean method157(int arg0) {
        field268++;
        if (!this.method126((byte) 118)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 > -43) {
            return false;
        }
        for (int var3 = 0; var3 < this.field295.field724.length; var3++) {
            int var4 = this.field295.field724[var3];
            if (this.field285[var4] == null) {
                this.method161(-119, var4);
                if (this.field285[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V")
    public static void method158(byte arg0) {
        field272 = null;
        if (arg0 != 35) {
            field274 = 12;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lsw;ZI)V")
    public class30(class629 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field299 = arg0;
        this.field296 = arg1;
        this.field294 = arg2;
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)I")
    public final int method159(int arg0) {
        field282++;
        if (!this.method126((byte) 113)) {
            return 0;
        }
        int var2 = 0;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field285.length; var4++) {
            if (this.field295.field735[var4] > 0) {
                var3 += this.method137((byte) -117, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method160(int arg0, String arg1) {
        field281++;
        if (!this.method126((byte) 127)) {
            return false;
        }
        if (arg0 != 0) {
            this.field296 = true;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field295.field720.method1774(101, class608.method3263(true, var3));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(II)V")
    private final void method161(int arg0, int arg1) {
        if (arg0 > -22) {
            return;
        }
        if (this.field296) {
            this.field285[arg1] = this.field299.method3197(arg1, (byte) -1);
        } else {
            this.field285[arg1] = class287.method1743(99999999, false, this.field299.method3197(arg1, (byte) -1));
        }
        field297++;
    }
}
