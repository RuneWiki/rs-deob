import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class406 {

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "Lhd;")
    private class524 field6032 = null;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lgk;")
    private class334 field6012;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Z")
    private boolean field6031;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public int field6013;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Lkh;")
    public static class13 field6011 = new class13(4);

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "Z")
    public static boolean field6044 = false;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Lbo;")
    public static class515 field6029;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "[Ljava/lang/Object;")
    private Object[] field6023;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "[[I")
    public static int[][] field6030;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6050;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public final void method2533(int arg0) {
        if (this.field6050 != null) {
            for (int var2 = 0; var2 < this.field6050.length; var2++) {
                this.field6050[var2] = null;
            }
        }
        field6038++;
        if (arg0 != -7767) {
            this.method2553(-46, null, 18, -23);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
    public static final String[] method2534(String[] arg0, boolean arg1) {
        field6010++;
        String[] var2 = new String[5];
        if (arg1) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Z")
    private final boolean method2535(int arg0, int arg1) {
        field6040++;
        if (arg0 != 16784) {
            this.method2565(null, null, (byte) -81);
        }
        if (!this.method2564(true)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field6032.field7670.length && this.field6032.field7670[arg1] != 0) {
            return true;
        } else if (class486.field7007) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)[B")
    public final byte[] method2536(int arg0, int arg1, int arg2) {
        field6048++;
        if (arg1 != 0) {
            this.method2547(62, null);
        }
        return this.method2554(arg0, (byte) -57, arg2, null);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2537(String arg0, int arg1) {
        field6041++;
        if (!this.method2564(true)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field6032.field7660.method1646(false, class300.method1938(11, var3));
        if (this.method2535(16784, var4)) {
            int var5 = 8 % ((arg1 - 25) / 43);
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)I")
    public final int method2538(int arg0, int arg1) {
        field6015++;
        if (!this.method2564(true)) {
            return -1;
        }
        int var3 = this.field6032.field7660.method1646(false, arg0);
        if (arg1 < 109) {
            this.field6012 = null;
        }
        return this.method2535(16784, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
    public final int method2539(byte arg0) {
        field6028++;
        if (!this.method2564(true)) {
            return 0;
        }
        int var2 = 0;
        if (arg0 >= -64) {
            this.method2543(null, (byte) 38);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6023.length; var4++) {
            if (this.field6032.field7671[var4] > 0) {
                var2 += 100;
                var3 += this.method2557(0, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(II)[I")
    public final int[] method2540(int arg0, int arg1) {
        field6045++;
        if (!this.method2535(16784, arg1)) {
            return null;
        }
        int[] var3 = this.field6032.field7657[arg1];
        int var4 = 81 / ((-arg0 - 50) / 52);
        if (var3 == null) {
            var3 = new int[this.field6032.field7671[arg1]];
            int var5 = 0;
            while (var5 < var3.length) {
                var3[var5] = var5++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public final void method2541(String arg0, int arg1) {
        int var3 = -37 % ((arg1 + 82) / 39);
        field6033++;
        if (this.method2564(true)) {
            String var4 = arg0.toLowerCase();
            int var5 = this.field6032.field7660.method1646(false, class300.method1938(11, var4));
            this.method2555(var5, 4);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)I")
    public final int method2542(int arg0) {
        field6037++;
        if (!this.method2564(true)) {
            throw new IllegalStateException("");
        }
        return arg0 == -1 ? this.field6032.field7663 : 75;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method2543(String arg0, byte arg1) {
        field6021++;
        if (!this.method2564(true)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field6032.field7660.method1646(false, class300.method1938(arg1 - 23, var3));
        if (arg1 != 34) {
            this.method2548(true, 57);
        }
        return this.method2557(0, var4);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)Z")
    public static final boolean method2544(byte arg0, int arg1) {
        field6051++;
        if (arg0 <= 109) {
            method2534(null, true);
        }
        return arg1 == 2 || arg1 == 6 || arg1 == 9;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
    public static void method2545(byte arg0) {
        field6029 = null;
        if (arg0 <= -75) {
            field6030 = null;
            field6011 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)Z")
    private final boolean method2546(byte arg0, int arg1, int arg2) {
        if (arg0 != 126) {
            field6044 = true;
        }
        field6039++;
        if (!this.method2564(true)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && arg1 < this.field6032.field7670.length && arg2 < this.field6032.field7670[arg1]) {
            return true;
        } else if (class486.field7007) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2547(int arg0, String arg1) {
        if (arg0 != 5) {
            this.method2559(null, 53);
        }
        field6049++;
        if (this.method2564(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6032.field7660.method1646(false, class300.method1938(11, var3));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)Z")
    public final boolean method2548(boolean arg0, int arg1) {
        field6043++;
        if (!this.method2535(16784, arg1)) {
            return false;
        } else if (this.field6023[arg1] == null) {
            if (!arg0) {
                this.field6023 = null;
            }
            this.method2566(arg1, (byte) 127);
            return this.field6023[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZI)Z")
    public final boolean method2549(int arg0, boolean arg1, int arg2) {
        field6020++;
        if (!arg1) {
            field6044 = false;
        }
        if (!this.method2546((byte) 126, arg2, arg0)) {
            return false;
        } else if (this.field6050[arg2] != null && this.field6050[arg2][arg0] != null) {
            return true;
        } else if (this.field6023[arg2] == null) {
            this.method2566(arg2, (byte) 102);
            return this.field6023[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)[B")
    public final byte[] method2550(String arg0, String arg1, boolean arg2) {
        field6026++;
        if (!this.method2564(arg2)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field6032.field7660.method1646(!arg2, class300.method1938(11, var4));
        if (!arg2) {
            return null;
        } else if (this.method2535(16784, var6)) {
            int var7 = this.field6032.field7672[var6].method1646(!arg2, class300.method1938(11, var5));
            return this.method2536(var6, 0, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(II)I")
    public final int method2551(int arg0, int arg1) {
        field6025++;
        if (this.method2535(arg1 ^ 0xFFFFDBBA, arg0)) {
            if (arg1 != -26070) {
                field6030 = null;
            }
            return this.field6032.field7670[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V")
    public final void method2552(byte arg0) {
        if (arg0 != -92) {
            this.method2542(34);
        }
        field6027++;
        if (this.field6023 != null) {
            for (int var2 = 0; var2 < this.field6023.length; var2++) {
                this.field6023[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[III)Z")
    private final boolean method2553(int arg0, int[] arg1, int arg2, int arg3) {
        field6042++;
        if (!this.method2535(16784, arg0)) {
            return false;
        } else if (this.field6023[arg0] == null) {
            return false;
        } else {
            int var5 = this.field6032.field7671[arg0];
            int[] var6 = this.field6032.field7657[arg0];
            if (this.field6050[arg0] == null) {
                this.field6050[arg0] = new Object[this.field6032.field7670[arg0]];
            }
            Object[] var7 = this.field6050[arg0];
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
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class191.method1338(this.field6023[arg0], true, 0);
                class217 var12 = new class217(var11);
                var12.method1509(var12.field3572.length, 5, true, arg1);
            } else {
                var11 = class191.method1338(this.field6023[arg0], false, 0);
            }
            byte[] var13;
            try {
                var13 = class173.method1168(-100, var11);
                if (arg2 <= 64) {
                    this.field6031 = false;
                }
            } catch (RuntimeException var49) {
                throw class434.method2692(var49, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class70.method606(0, var11, var11.length) + "," + class70.method606(0, var11, var11.length - 2) + "," + this.field6032.field7669[arg0] + "," + this.field6032.field7663);
            }
            if (this.field6031) {
                this.field6023[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field6013 == 0) {
                    var7[var15] = class491.method2916(var13, -15460, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field6013 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * 4 * var17;
                class217 var19 = new class217(var13);
                int var20 = 0;
                int var21 = 0;
                var19.field3556 = var18;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method1556(114);
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
                var19.field3556 = var18;
                int var27 = 0;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method1556(117);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg3 == var32) {
                            class414.method2598(var13, var28, var26, var27, var30);
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
                int var35 = var51 - var5 * var34 * 4;
                class217 var36 = new class217(var13);
                var36.field3556 = var35;
                int[] var37 = new int[var5];
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method1556(98);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field3556 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method1556(98);
                        class414.method2598(var13, var43, var41[var46], var37[var46], var45);
                        var43 += var45;
                        var37[var46] += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field6013 == 0) {
                        var7[var48] = class491.method2916(var41[var47], -15460, false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBI[I)[B")
    public final byte[] method2554(int arg0, byte arg1, int arg2, int[] arg3) {
        field6036++;
        if (!this.method2546((byte) 126, arg0, arg2)) {
            return null;
        }
        if (this.field6050[arg0] == null || this.field6050[arg0][arg2] == null) {
            boolean var5 = this.method2553(arg0, arg3, arg1 ^ 0xFFFFFFA8, arg2);
            if (!var5) {
                this.method2566(arg0, (byte) 106);
                boolean var6 = this.method2553(arg0, arg3, arg1 ^ 0xFFFFFF81, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class191.method1338(this.field6050[arg0][arg2], false, 0);
        if (this.field6013 == 1) {
            this.field6050[arg0][arg2] = null;
            if (this.field6032.field7670[arg0] == 1) {
                this.field6050[arg0] = null;
            }
        } else if (this.field6013 == 2) {
            this.field6050[arg0] = null;
        }
        if (arg1 != -57) {
            field6011 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(II)V")
    private final void method2555(int arg0, int arg1) {
        field6016++;
        if (arg1 != 4) {
            field6029 = null;
        }
        this.field6012.method2110((byte) -89, arg0);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(BI)Z")
    public final boolean method2556(byte arg0, int arg1) {
        field6018++;
        if (!this.method2564(true)) {
            return false;
        } else if (this.field6032.field7670.length == 1) {
            return this.method2549(arg1, true, 0);
        } else if (!this.method2535(16784, arg1)) {
            return false;
        } else if (this.field6032.field7670[arg1] == 1) {
            return this.method2549(0, true, arg1);
        } else {
            if (arg0 != 21) {
                field6030 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(II)I")
    private final int method2557(int arg0, int arg1) {
        field6009++;
        if (this.method2535(arg0 + 16784, arg1)) {
            if (arg0 != 0) {
                this.method2539((byte) 50);
            }
            return this.field6023[arg1] == null ? this.field6012.method2115(2, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(II)[B")
    public final byte[] method2558(int arg0, int arg1) {
        field6017++;
        if (!this.method2564(true)) {
            return null;
        } else if (this.field6032.field7670.length == 1) {
            return this.method2536(0, 0, arg0);
        } else if (!this.method2535(16784, arg0)) {
            return null;
        } else if (arg1 <= 50) {
            return null;
        } else if (this.field6032.field7670[arg0] == 1) {
            return this.method2536(arg0, 0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2559(String arg0, int arg1) {
        field6035++;
        if (this.method2564(true)) {
            String var3 = arg0.toLowerCase();
            int var4 = -124 / ((arg1 - 30) / 42);
            int var5 = this.field6032.field7660.method1646(false, class300.method1938(11, var3));
            return this.method2548(true, var5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZZI)V")
    public final void method2560(boolean arg0, boolean arg1, int arg2) {
        field6047++;
        if (!this.method2564(true)) {
            return;
        }
        if (arg1) {
            this.field6032.field7656 = null;
            this.field6032.field7660 = null;
        }
        if (arg2 >= -82) {
            method2545((byte) 4);
        }
        if (arg0) {
            this.field6032.field7658 = null;
            this.field6032.field7672 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)I")
    public final int method2561(int arg0) {
        if (arg0 >= -75) {
            return 84;
        } else {
            field6014++;
            return this.method2564(true) ? this.field6032.field7670.length : -1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
    public final void method2562(int arg0, byte arg1) {
        field6019++;
        if (arg1 >= -114) {
            field6029 = null;
        }
        if (this.method2535(16784, arg0) && this.field6050 != null) {
            this.field6050[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z")
    public final boolean method2563(int arg0) {
        field6022++;
        if (!this.method2564(true)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field6032.field7666.length; var3++) {
            int var4 = this.field6032.field7666[var3];
            if (this.field6023[var4] == null) {
                this.method2566(var4, (byte) 105);
                if (this.field6023[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 <= 94) {
            field6029 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)Z")
    private final boolean method2564(boolean arg0) {
        field6046++;
        if (this.field6032 == null) {
            this.field6032 = this.field6012.method2109((byte) -15);
            if (this.field6032 == null) {
                return false;
            }
            this.field6023 = new Object[this.field6032.field7659];
            this.field6050 = new Object[this.field6032.field7659][];
        }
        if (!arg0) {
            this.method2560(true, true, -71);
        }
        return true;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method2565(String arg0, String arg1, byte arg2) {
        field6034++;
        if (!this.method2564(true)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field6032.field7660.method1646(false, class300.method1938(arg2 ^ 0x2, var4));
        if (!this.method2535(16784, var6)) {
            return false;
        }
        if (arg2 != 9) {
            method2544((byte) -56, 118);
        }
        int var7 = this.field6032.field7672[var6].method1646(false, class300.method1938(11, var5));
        return this.method2549(var7, true, var6);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(IB)V")
    private final void method2566(int arg0, byte arg1) {
        field6024++;
        if (arg1 < 93) {
            this.field6031 = true;
        }
        if (this.field6031) {
            this.field6023[arg0] = this.field6012.method2113(arg0, 33);
        } else {
            this.field6023[arg0] = class491.method2916(this.field6012.method2113(arg0, 59), -15460, false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lgk;ZI)V")
    public class406(class334 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6012 = arg0;
        this.field6031 = arg1;
        this.field6013 = arg2;
    }
}
