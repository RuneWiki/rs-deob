import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class347 {

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Log;")
    private class356 field4992 = null;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Z")
    private boolean field4990;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public int field5018;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Ljd;")
    private class130 field4997;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Z")
    public static boolean field5001 = false;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "Ljava/lang/String;")
    public static String field5030 = "Members object";

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "[Ljava/lang/Object;")
    private Object[] field5026;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field5005;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[I")
    public final int[] method2253(int arg0, int arg1) {
        field5019++;
        if (arg1 >= -125) {
            this.field4990 = true;
        }
        if (!this.method2271(arg0, (byte) -90)) {
            return null;
        }
        int[] var3 = this.field4992.field5143[arg0];
        if (var3 == null) {
            var3 = new int[this.field4992.field5142[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BII)Z")
    private final boolean method2254(byte arg0, int arg1, int arg2) {
        field5023++;
        if (!this.method2262(arg0 ^ 0xFFFFA091)) {
            return false;
        } else if (arg0 != 121) {
            return true;
        } else if (arg2 >= 0 && arg1 >= 0 && this.field4992.field5149.length > arg2 && this.field4992.field5149[arg2] > arg1) {
            return true;
        } else if (class215.field2868) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Z")
    public final boolean method2255(int arg0, byte arg1) {
        if (arg1 != -84) {
            return true;
        }
        field4995++;
        if (!this.method2271(arg0, (byte) -107)) {
            return false;
        } else if (this.field5026[arg0] == null) {
            this.method2256(-4, arg0);
            return this.field5026[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
    private final void method2256(int arg0, int arg1) {
        int var3 = -93 % ((-arg0 - 85) / 32);
        if (this.field4990) {
            this.field5026[arg1] = this.field4997.method825(arg1, 69);
        } else {
            this.field5026[arg1] = class430.method2721(false, 136, this.field4997.method825(arg1, -121));
        }
        field5028++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)Z")
    public final boolean method2257(boolean arg0, int arg1) {
        field5000++;
        if (!this.method2262(-24344)) {
            return false;
        } else if (this.field4992.field5149.length == 1) {
            return this.method2263(0, arg1, 127);
        } else if (!this.method2271(arg1, (byte) -105)) {
            return false;
        } else if (this.field4992.field5149[arg1] == 1) {
            return this.method2263(arg1, 0, 121);
        } else if (arg0) {
            throw new RuntimeException();
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
    public final int method2258(int arg0) {
        field5021++;
        if (!this.method2262(-24344)) {
            return 0;
        }
        int var2 = arg0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5026.length; var4++) {
            if (this.field4992.field5142[var4] > 0) {
                var2 += 100;
                var3 += this.method2288(var4, (byte) -120);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2259(int arg0, String arg1) {
        field5006++;
        if (!this.method2262(arg0 - 46644)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4992.field5158.method1408(class62.method435(0, var3), (byte) -56);
        if (var4 < 0) {
            return false;
        } else {
            if (arg0 != 22300) {
                this.field4997 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method2260(byte arg0) {
        field5030 = null;
        int var1 = -8 % ((arg0 + 12) / 34);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)[B")
    public final byte[] method2261(int arg0, int arg1, int arg2) {
        if (arg2 < 51) {
            this.field4997 = null;
        }
        field4994++;
        return this.method2278(-85, arg0, (int[]) null, arg1);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)Z")
    private final boolean method2262(int arg0) {
        field5015++;
        if (arg0 != -24344) {
            this.method2257(false, 39);
        }
        if (this.field4992 == null) {
            this.field4992 = this.field4997.method820((byte) -1);
            if (this.field4992 == null) {
                return false;
            }
            this.field5026 = new Object[this.field4992.field5154];
            this.field5005 = new Object[this.field4992.field5154][];
        }
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)Z")
    public final boolean method2263(int arg0, int arg1, int arg2) {
        field5012++;
        if (!this.method2254((byte) 121, arg1, arg0)) {
            return false;
        } else if (this.field5005[arg0] != null && this.field5005[arg0][arg1] != null) {
            return true;
        } else if (this.field5026[arg0] == null) {
            this.method2256(-41, arg0);
            if (this.field5026[arg0] == null) {
                if (arg2 <= 112) {
                    field5030 = null;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method2264(String arg0, String arg1, int arg2) {
        field5007++;
        if (!this.method2262(-24344)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4992.field5158.method1408(class62.method435(0, var4), (byte) -56);
        if (!this.method2271(var6, (byte) -109)) {
            return false;
        } else if (arg2 > -4) {
            return false;
        } else {
            int var7 = this.field4992.field5153[var6].method1408(class62.method435(0, var5), (byte) -56);
            return this.method2263(var6, var7, 119);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
    public final void method2265(byte arg0) {
        if (arg0 != 4) {
            this.method2259(-21, (String) null);
        }
        if (this.field5026 != null) {
            for (int var2 = 0; var2 < this.field5026.length; var2++) {
                this.field5026[var2] = null;
            }
        }
        field5010++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)[B")
    public final byte[] method2266(byte arg0, int arg1) {
        if (arg0 <= 28) {
            this.method2274((byte) -86);
        }
        field5031++;
        if (!this.method2262(-24344)) {
            return null;
        } else if (this.field4992.field5149.length == 1) {
            return this.method2261(arg1, 0, 89);
        } else if (!this.method2271(arg1, (byte) -95)) {
            return null;
        } else if (this.field4992.field5149[arg1] == 1) {
            return this.method2261(0, arg1, 71);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)I")
    public final int method2267(byte arg0, int arg1) {
        field5020++;
        int var3 = 13 / (-arg0 / 57);
        if (this.method2262(-24344)) {
            int var4 = this.field4992.field5158.method1408(arg1, (byte) -56);
            return this.method2271(var4, (byte) -93) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)I")
    public final int method2268(byte arg0) {
        field5016++;
        if (this.method2262(-24344)) {
            if (arg0 != 67) {
                this.method2256(-41, -108);
            }
            return this.field4992.field5149.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)Lhh;")
    public static final class182 method2269(int arg0, int arg1) {
        field4993++;
        class182 var2 = (class182) class15.field216.method1137((long) arg1, 2108653711);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class41.field571.method2261(arg1, 0, 94);
        class182 var4 = new class182();
        if (var3 != null) {
            var4.method1112(true, new class228(var3));
        }
        var4.method1110(-106);
        class15.field216.method1144((long) arg1, var4, -3480);
        return arg0 >= -41 ? null : var4;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method2270(String arg0, byte arg1) {
        field5004++;
        if (!this.method2262(-24344)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4992.field5158.method1408(class62.method435(0, var3), (byte) -56);
        if (arg1 != 115) {
            this.field5005 = null;
        }
        return this.method2271(var4, (byte) -89) ? var4 : -1;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IB)Z")
    private final boolean method2271(int arg0, byte arg1) {
        field5017++;
        if (!this.method2262(-24344)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field4992.field5149.length && this.field4992.field5149[arg0] != 0) {
            return arg1 >= -77 ? true : true;
        } else if (class215.field2868) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)I")
    public final int method2272(int arg0, int arg1) {
        if (arg0 < 16) {
            field5022 = -110;
        }
        field4999++;
        return this.method2271(arg1, (byte) -106) ? this.field4992.field5149[arg1] : 0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZZI)V")
    public final void method2273(boolean arg0, boolean arg1, int arg2) {
        field4998++;
        if (!this.method2262(arg2 - 24347)) {
            return;
        }
        if (arg0) {
            this.field4992.field5157 = null;
            this.field4992.field5158 = null;
        }
        if (arg1) {
            this.field4992.field5160 = null;
            this.field4992.field5153 = null;
        }
        if (arg2 != 3) {
            this.method2282((String) null, (byte) -5);
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V")
    public final void method2274(byte arg0) {
        field5024++;
        if (arg0 == -100 && this.field5005 != null) {
            for (int var2 = 0; var2 < this.field5005.length; var2++) {
                this.field5005[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2275(String arg0, int arg1) {
        field5011++;
        if (!this.method2262(-24344)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == -1) {
            int var4 = this.field4992.field5158.method1408(class62.method435(0, var3), (byte) -56);
            return this.method2288(var4, (byte) -92);
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(ILjava/lang/String;)V")
    public final void method2276(int arg0, String arg1) {
        field5008++;
        if (this.method2262(-24344)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4992.field5158.method1408(class62.method435(0, var3), (byte) -56);
            this.method2284(var4, arg0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB[II)Z")
    private final boolean method2277(int arg0, byte arg1, int[] arg2, int arg3) {
        field4989++;
        if (!this.method2271(arg3, (byte) -82)) {
            return false;
        } else if (this.field5026[arg3] == null) {
            return false;
        } else {
            int var5 = this.field4992.field5142[arg3];
            int[] var6 = this.field4992.field5143[arg3];
            if (this.field5005[arg3] == null) {
                this.field5005[arg3] = new Object[this.field4992.field5149[arg3]];
            }
            Object[] var7 = this.field5005[arg3];
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
            int var11 = -37 / ((arg1 + 21) / 63);
            if (var8) {
                return true;
            }
            byte[] var12;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var12 = class70.method496(this.field5026[arg3], false, (byte) 91);
            } else {
                var12 = class70.method496(this.field5026[arg3], true, (byte) 99);
                class228 var13 = new class228(var12);
                var13.method1325(125, 5, var13.field3040.length, arg2);
            }
            byte[] var14;
            try {
                var14 = class38.method275(var12, (byte) -8);
            } catch (RuntimeException var50) {
                throw class122.method778(var50, "T3 - " + (arg2 != null) + "," + arg3 + "," + var12.length + "," + class17.method109((byte) -118, var12, var12.length) + "," + class17.method109((byte) -102, var12, var12.length - 2) + "," + this.field4992.field5144[arg3] + "," + this.field4992.field5161);
            }
            if (this.field4990) {
                this.field5026[arg3] = null;
            }
            if (var5 <= 1) {
                int var16;
                if (var6 == null) {
                    var16 = 0;
                } else {
                    var16 = var6[0];
                }
                if (this.field5018 == 0) {
                    var7[var16] = class430.method2721(false, 136, var14);
                } else {
                    var7[var16] = var14;
                }
            } else if (this.field5018 == 2) {
                int var33 = var14.length;
                int var52 = var33 - 1;
                int var34 = var14[var52] & 0xFF;
                int var35 = var52 - var5 * var34 * 4;
                class228 var36 = new class228(var14);
                int var37 = 0;
                var36.field3029 = var35;
                int var38 = 0;
                for (int var39 = 0; var39 < var34; var39++) {
                    int var40 = 0;
                    for (int var41 = 0; var41 < var5; var41++) {
                        var40 += var36.method1344((byte) 80);
                        int var42;
                        if (var6 == null) {
                            var42 = var41;
                        } else {
                            var42 = var6[var41];
                        }
                        if (arg0 == var42) {
                            var38 = var42;
                            var37 += var40;
                        }
                    }
                }
                if (var37 == 0) {
                    return true;
                }
                byte[] var43 = new byte[var37];
                var36.field3029 = var35;
                int var44 = 0;
                int var45 = 0;
                for (int var46 = 0; var46 < var34; var46++) {
                    int var47 = 0;
                    for (int var48 = 0; var48 < var5; var48++) {
                        var47 += var36.method1344((byte) 85);
                        int var49;
                        if (var6 == null) {
                            var49 = var48;
                        } else {
                            var49 = var6[var48];
                        }
                        if (arg0 == var49) {
                            class60.method421(var14, var45, var43, var44, var47);
                            var44 += var47;
                        }
                        var45 += var47;
                    }
                }
                var7[var38] = var43;
            } else {
                int var17 = var14.length;
                int var51 = var17 - 1;
                int var18 = var14[var51] & 0xFF;
                int var19 = var51 - var5 * 4 * var18;
                class228 var20 = new class228(var14);
                int[] var21 = new int[var5];
                var20.field3029 = var19;
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var20.method1344((byte) 52);
                        var21[var24] += var23;
                    }
                }
                byte[][] var25 = new byte[var5][];
                for (int var26 = 0; var26 < var5; var26++) {
                    var25[var26] = new byte[var21[var26]];
                    var21[var26] = 0;
                }
                var20.field3029 = var19;
                int var27 = 0;
                for (int var28 = 0; var28 < var18; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var20.method1344((byte) 79);
                        class60.method421(var14, var27, var25[var30], var21[var30], var29);
                        var21[var30] += var29;
                        var27 += var29;
                    }
                }
                for (int var31 = 0; var31 < var5; var31++) {
                    int var32;
                    if (var6 == null) {
                        var32 = var31;
                    } else {
                        var32 = var6[var31];
                    }
                    if (this.field5018 == 0) {
                        var7[var32] = class430.method2721(false, 136, var25[var31]);
                    } else {
                        var7[var32] = var25[var31];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II[II)[B")
    public final byte[] method2278(int arg0, int arg1, int[] arg2, int arg3) {
        field4988++;
        if (!this.method2254((byte) 121, arg1, arg3)) {
            return null;
        }
        if (this.field5005[arg3] == null || this.field5005[arg3][arg1] == null) {
            boolean var5 = this.method2277(arg1, (byte) -123, arg2, arg3);
            if (!var5) {
                this.method2256(-124, arg3);
                boolean var6 = this.method2277(arg1, (byte) 124, arg2, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class70.method496(this.field5005[arg3][arg1], false, (byte) 75);
        int var8 = -87 / ((-arg0 - 5) / 61);
        if (this.field5018 == 1) {
            this.field5005[arg3][arg1] = null;
            if (this.field4992.field5149[arg3] == 1) {
                this.field5005[arg3] = null;
            }
        } else if (this.field5018 == 2) {
            this.field5005[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(ZI)V")
    public static final void method2279(boolean arg0, int arg1) {
        field4991++;
        if (arg1 != -23800) {
            method2285((class425) null, true);
        }
        if (class349.field5042 != arg0) {
            class349.field5042 = arg0;
            class34.method225(-29280);
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)I")
    public final int method2280(int arg0) {
        if (arg0 != 0) {
            this.method2257(false, 71);
        }
        field5025++;
        if (!this.method2262(arg0 - 24344)) {
            throw new IllegalStateException("");
        }
        return this.field4992.field5161;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
    public final byte[] method2281(String arg0, String arg1, byte arg2) {
        field5002++;
        if (!this.method2262(-24344)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4992.field5158.method1408(class62.method435(0, var4), (byte) -56);
        if (!this.method2271(var6, (byte) -117)) {
            return null;
        }
        if (arg2 >= -32) {
            this.field4997 = null;
        }
        int var7 = this.field4992.field5153[var6].method1408(class62.method435(0, var5), (byte) -56);
        return this.method2261(var7, var6, 57);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method2282(String arg0, byte arg1) {
        field5003++;
        if (!this.method2262(-24344)) {
            return false;
        }
        if (arg1 < 57) {
            this.field4997 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4992.field5158.method1408(class62.method435(0, var3), (byte) -56);
        return this.method2255(var4, (byte) -84);
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(B)Z")
    public final boolean method2283(byte arg0) {
        field5009++;
        if (!this.method2262(-24344)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4992.field5147.length; var3++) {
            int var5 = this.field4992.field5147[var3];
            if (this.field5026[var5] == null) {
                this.method2256(79, var5);
                if (this.field5026[var5] == null) {
                    var2 = false;
                }
            }
        }
        int var4 = 2 % ((arg0 - 49) / 34);
        return var2;
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(II)V")
    private final void method2284(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2271(96, (byte) 40);
        }
        this.field4997.method822(true, arg0);
        field5014++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljb;Z)Z")
    public static final boolean method2285(class425 arg0, boolean arg1) {
        field4996++;
        class104 var2 = class329.method2190((byte) 63, arg0.method121(-15123));
        if (var2.field1496 == -1) {
            return true;
        }
        class399 var3 = class59.method414(var2.field1496, (byte) 57);
        if (arg1) {
            return var3.field5940 == -1 ? true : var3.method2575((byte) 36);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljd;ZI)V")
    public class347(class130 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4990 = arg1;
        this.field5018 = arg2;
        this.field4997 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(IB)V")
    public final void method2286(int arg0, byte arg1) {
        field5013++;
        if (!this.method2271(arg0, (byte) -112)) {
            return;
        }
        if (this.field5005 != null) {
            this.field5005[arg0] = null;
        }
        if (arg1 > -5) {
            this.field4997 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
    public static final void method2287(int arg0) {
        class156.field2120.method11((byte) 93);
        if (arg0 != 21627) {
            method2269(-8, 0);
        }
        field5027++;
        int var1 = class156.field2120.method4(1, (byte) 25);
        if (var1 == 0) {
            return;
        }
        int var2 = class156.field2120.method4(2, (byte) 25);
        if (var2 == 0) {
            class151.field2055[class225.field2964++] = 2047;
        } else if (var2 == 1) {
            int var3 = class156.field2120.method4(3, (byte) 25);
            class227.field2988.method2034(var3, (byte) -54, 1);
            int var4 = class156.field2120.method4(1, (byte) 25);
            if (var4 == 1) {
                class151.field2055[class225.field2964++] = 2047;
            }
        } else if (var2 == 2) {
            if (class156.field2120.method4(1, (byte) 25) == 1) {
                int var5 = class156.field2120.method4(3, (byte) 25);
                class227.field2988.method2034(var5, (byte) -58, 2);
                int var6 = class156.field2120.method4(3, (byte) 25);
                class227.field2988.method2034(var6, (byte) -109, 2);
            } else {
                int var7 = class156.field2120.method4(3, (byte) 25);
                class227.field2988.method2034(var7, (byte) -34, 0);
            }
            int var8 = class156.field2120.method4(1, (byte) 25);
            if (var8 == 1) {
                class151.field2055[class225.field2964++] = 2047;
            }
        } else if (var2 == 3) {
            class227.field2981 = class156.field2120.method4(2, (byte) 25);
            int var9 = class156.field2120.method4(7, (byte) 25);
            int var10 = class156.field2120.method4(7, (byte) 25);
            int var11 = class156.field2120.method4(1, (byte) 25);
            int var12 = class156.field2120.method4(1, (byte) 25);
            if (var12 == 1) {
                class151.field2055[class225.field2964++] = 2047;
            }
            class227.field2988.method165(var10, class227.field2981, var11 == 1, var9, false);
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(IB)I")
    private final int method2288(int arg0, byte arg1) {
        field5029++;
        if (this.method2271(arg0, (byte) -104)) {
            if (arg1 >= -84) {
                this.method2278(-56, -53, (int[]) null, 122);
            }
            return this.field5026[arg0] == null ? this.field4997.method818((byte) -49, arg0) : 100;
        } else {
            return 0;
        }
    }
}
