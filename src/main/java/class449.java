import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class449 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Lsv;")
    private class617 field6124 = null;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public int field6162;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Lso;")
    private class439 field6129;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Z")
    private boolean field6138;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Ldb;")
    public static class298 field6127 = new class298(101, 4);

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "Z")
    public static boolean field6161 = false;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "Ljava/lang/String;")
    public static String field6163 = "";

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Lbi;")
    public static class449 field6136;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "[Ljava/lang/Object;")
    private Object[] field6148;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6155;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 3)
    public final boolean method2522(String arg0, byte arg1) {
        if (arg1 != -33) {
            this.field6129 = null;
        }
        field6134++;
        if (this.method2543(arg1 ^ 0xFFFFFFDF)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6124.field8187.method309(class389.method2250(var3, false), true);
            return this.method2548(-11693, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;B)I", line = 25)
    public final int method2523(String arg0, byte arg1) {
        field6150++;
        if (arg1 <= 42) {
            this.field6148 = null;
        }
        if (this.method2543(0)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6124.field8187.method309(class389.method2250(var3, false), true);
            return this.method2541(var4, (byte) 7) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 46)
    public final void method2524(byte arg0) {
        if (this.field6148 != null) {
            for (int var2 = 0; var2 < this.field6148.length; var2++) {
                this.field6148[var2] = null;
            }
        }
        int var3 = -11 / ((arg0 + 35) / 39);
        field6141++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZZ)V", line = 71)
    public final void method2525(boolean arg0, boolean arg1, boolean arg2) {
        if (arg0) {
            method2540((byte) -12);
        }
        field6160++;
        if (!this.method2543(0)) {
            return;
        }
        if (arg1) {
            this.field6124.field8179 = null;
            this.field6124.field8171 = null;
        }
        if (arg2) {
            this.field6124.field8184 = null;
            this.field6124.field8187 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I", line = 100)
    public final int method2526(int arg0) {
        if (arg0 != -1) {
            return 29;
        }
        field6128++;
        if (!this.method2543(0)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6148.length; var4++) {
            if (this.field6124.field8177[var4] > 0) {
                var3 += this.method2544(arg0 + 6610, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I", line = 138)
    public final int method2527(int arg0, int arg1) {
        field6147++;
        if (this.method2541(arg1, (byte) 7)) {
            if (arg0 != 0) {
                this.method2532(null, null, -36);
            }
            return this.field6124.field8175[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 152)
    public final void method2528(String arg0, int arg1) {
        field6154++;
        if (this.method2543(arg1 ^ arg1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6124.field8187.method309(class389.method2250(var3, false), true);
            this.method2536((byte) -93, var4);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 167)
    public static void method2529(int arg0) {
        field6127 = null;
        if (arg0 == 255) {
            field6136 = null;
            field6163 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V", line = 179)
    public final void method2530(byte arg0) {
        field6159++;
        if (this.field6155 != null) {
            for (int var2 = 0; var2 < this.field6155.length; var2++) {
                this.field6155[var2] = null;
            }
        }
        if (arg0 != -93) {
            field6161 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[B", line = 202)
    public final byte[] method2531(int arg0, int arg1) {
        field6126++;
        if (!this.method2543(arg1 + arg1)) {
            return null;
        } else if (this.field6124.field8175.length == 1) {
            return this.method2537(false, 0, arg0);
        } else if (!this.method2541(arg0, (byte) 7)) {
            return null;
        } else if (this.field6124.field8175[arg0] == 1) {
            return this.method2537(false, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 233)
    public final byte[] method2532(String arg0, String arg1, int arg2) {
        field6149++;
        if (arg2 != -24518) {
            this.field6138 = false;
        }
        if (!this.method2543(0)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field6124.field8187.method309(class389.method2250(var4, false), true);
        if (this.method2541(var6, (byte) 7)) {
            int var7 = this.field6124.field8179[var6].method309(class389.method2250(var5, false), true);
            return this.method2537(false, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)Z", line = 261)
    public final boolean method2533(byte arg0) {
        field6142++;
        if (!this.method2543(0)) {
            return false;
        } else if (arg0 > -113) {
            return false;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field6124.field8176.length; var3++) {
                int var4 = this.field6124.field8176[var3];
                if (this.field6148[var4] == null) {
                    this.method2556(var4, -13556);
                    if (this.field6148[var4] == null) {
                        var2 = false;
                    }
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)[I", line = 295)
    public final int[] method2534(int arg0, int arg1) {
        field6125++;
        if (!this.method2541(arg0, (byte) 7)) {
            return null;
        }
        if (arg1 != 13758) {
            field6136 = null;
        }
        int[] var3 = this.field6124.field8190[arg0];
        if (var3 == null) {
            var3 = new int[this.field6124.field8177[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[II)Z", line = 329)
    private final boolean method2535(int arg0, int arg1, int[] arg2, int arg3) {
        field6123++;
        if (arg0 != 3) {
            return false;
        } else if (!this.method2541(arg1, (byte) 7)) {
            return false;
        } else if (this.field6148[arg1] == null) {
            return false;
        } else {
            int var5 = this.field6124.field8177[arg1];
            int[] var6 = this.field6124.field8190[arg1];
            if (this.field6155[arg1] == null) {
                this.field6155[arg1] = new Object[this.field6124.field8175[arg1]];
            }
            Object[] var7 = this.field6155[arg1];
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
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class50.method338(false, this.field6148[arg1], 15900);
            } else {
                var11 = class50.method338(true, this.field6148[arg1], 15900);
                class335 var12 = new class335(var11);
                var12.method2018(var12.field4600.length, arg2, (byte) 120, 5);
            }
            byte[] var13;
            try {
                var13 = class518.method2886(var11, true);
            } catch (RuntimeException var49) {
                throw class417.method2385(var49, "T3 - " + (arg2 != null) + "," + arg1 + "," + var11.length + "," + class292.method1801((byte) -126, var11.length, var11) + "," + class292.method1801((byte) -91, var11.length - 2, var11) + "," + this.field6124.field8172[arg1] + "," + this.field6124.field8178);
            }
            if (this.field6138) {
                this.field6148[arg1] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field6162 == 0) {
                    var7[var15] = class230.method1443(var13, (byte) -106, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field6162 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var17 * 4 * var5;
                class335 var19 = new class335(var13);
                int var20 = 0;
                int var21 = 0;
                var19.field4619 = var18;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method2045(-98);
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
                var19.field4619 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method2045(-98);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg3 == var32) {
                            class83.method686(var13, var28, var26, var27, var30);
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
                class335 var36 = new class335(var13);
                int[] var37 = new int[var5];
                var36.field4619 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method2045(-98);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field4619 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method2045(arg0 - 101);
                        class83.method686(var13, var43, var41[var46], var37[var46], var45);
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
                    if (this.field6162 == 0) {
                        var7[var48] = class230.method1443(var41[var47], (byte) -106, false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V", line = 614)
    private final void method2536(byte arg0, int arg1) {
        if (arg0 > -60) {
            this.field6138 = false;
        }
        this.field6129.method174(arg1, (byte) 111);
        field6137++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZII)[B", line = 627)
    public final byte[] method2537(boolean arg0, int arg1, int arg2) {
        field6156++;
        if (arg0) {
            this.method2537(true, -56, -8);
        }
        return this.method2551(arg2, arg1, 0, null);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZII)Z", line = 639)
    public final boolean method2538(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return true;
        }
        field6153++;
        if (!this.method2554(1, arg1, arg2)) {
            return false;
        } else if (this.field6155[arg2] != null && this.field6155[arg2][arg1] != null) {
            return true;
        } else if (this.field6148[arg2] == null) {
            this.method2556(arg2, -13556);
            return this.field6148[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 663)
    public final boolean method2539(byte arg0, String arg1) {
        field6164++;
        if (!this.method2543(0)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 == 18) {
            int var4 = this.field6124.field8187.method309(class389.method2250(var3, false), true);
            return var4 >= 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)V", line = 686)
    public static final void method2540(byte arg0) {
        if (arg0 > -12) {
            field6163 = null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class511.field6834[var1] = true;
        }
        field6166++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Z", line = 710)
    private final boolean method2541(int arg0, byte arg1) {
        field6139++;
        if (!this.method2543(0)) {
            return false;
        }
        if (arg1 != 7) {
            this.field6162 = 29;
        }
        if (arg0 >= 0 && this.field6124.field8175.length > arg0 && this.field6124.field8175[arg0] != 0) {
            return true;
        } else if (class558.field7413) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Z", line = 735)
    public static final boolean method2542(int arg0, int arg1, int arg2) {
        if (arg2 == 34) {
            field6133++;
            return (arg1 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Z", line = 748)
    private final boolean method2543(int arg0) {
        if (arg0 != 0) {
            this.method2546(-52, null);
        }
        field6135++;
        if (this.field6124 == null) {
            this.field6124 = this.field6129.method176(-15550);
            if (this.field6124 == null) {
                return false;
            }
            this.field6148 = new Object[this.field6124.field8186];
            this.field6155 = new Object[this.field6124.field8186][];
        }
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)I", line = 773)
    private final int method2544(int arg0, int arg1) {
        if (arg0 != 6609) {
            this.method2553(-66, null, null);
        }
        field6144++;
        if (this.method2541(arg1, (byte) 7)) {
            return this.field6148[arg1] == null ? this.field6129.method172(arg1, (byte) 64) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)I", line = 792)
    public final int method2545(int arg0) {
        field6122++;
        return this.method2543(arg0 + arg0) ? this.field6124.field8175.length : -1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)I", line = 805)
    public final int method2546(int arg0, String arg1) {
        field6146++;
        if (!this.method2543(0)) {
            return 0;
        }
        if (arg0 != -17877) {
            this.method2546(46, null);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field6124.field8187.method309(class389.method2250(var3, false), true);
        return this.method2544(6609, var4);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(II)V", line = 827)
    public final void method2547(int arg0, int arg1) {
        field6158++;
        if (this.method2541(arg1, (byte) 7)) {
            int var3 = 1 / ((arg0 + 58) / 36);
            if (this.field6155 != null) {
                this.field6155[arg1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(II)Z", line = 848)
    public final boolean method2548(int arg0, int arg1) {
        field6131++;
        if (!this.method2541(arg1, (byte) 7)) {
            return false;
        } else if (this.field6148[arg1] == null) {
            this.method2556(arg1, -13556);
            if (arg0 != -11693) {
                this.method2551(8, -11, 2, null);
            }
            return this.field6148[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lso;ZI)V", line = 1116)
    public class449(class439 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6162 = arg2;
        this.field6129 = arg0;
        this.field6138 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(II)Z", line = 880)
    public final boolean method2549(int arg0, int arg1) {
        field6143++;
        if (!this.method2543(0)) {
            return false;
        } else if (arg1 != 3015) {
            return true;
        } else if (this.field6124.field8175.length == 1) {
            return this.method2538(false, arg0, 0);
        } else if (!this.method2541(arg0, (byte) 7)) {
            return false;
        } else if (this.field6124.field8175[arg0] == 1) {
            return this.method2538(false, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(ILjava/lang/String;)Z", line = 907)
    public final boolean method2550(int arg0, String arg1) {
        field6130++;
        int var3 = this.method2523("", (byte) 50);
        return ~var3 == arg0 ? this.method2552(arg1, 122, "") : this.method2552("", 120, arg1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[I)[B", line = 921)
    public final byte[] method2551(int arg0, int arg1, int arg2, int[] arg3) {
        field6145++;
        if (!this.method2554(arg2 ^ 0x1, arg0, arg1)) {
            return null;
        }
        if (this.field6155[arg1] == null || this.field6155[arg1][arg0] == null) {
            boolean var5 = this.method2535(3, arg1, arg3, arg0);
            if (!var5) {
                this.method2556(arg1, -13556);
                boolean var6 = this.method2535(3, arg1, arg3, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class50.method338(false, this.field6155[arg1][arg0], 15900);
        if (this.field6162 == 1) {
            this.field6155[arg1][arg0] = null;
            if (this.field6124.field8175[arg1] == 1) {
                this.field6155[arg1] = null;
            }
        } else if (this.field6162 == 2) {
            this.field6155[arg1] = null;
        }
        if (arg2 != 0) {
            field6127 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 971)
    private final boolean method2552(String arg0, int arg1, String arg2) {
        field6132++;
        if (!this.method2543(0)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field6124.field8187.method309(class389.method2250(var4, false), true);
        if (!this.method2541(var6, (byte) 7)) {
            return false;
        }
        if (arg1 <= 111) {
            field6136 = null;
        }
        int var7 = this.field6124.field8179[var6].method309(class389.method2250(var5, false), true);
        return this.method2538(false, var7, var6);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 997)
    public final boolean method2553(int arg0, String arg1, String arg2) {
        field6157++;
        if (!this.method2543(arg0)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field6124.field8187.method309(class389.method2250(var4, false), true);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field6124.field8179[var6].method309(class389.method2250(var5, false), true);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z", line = 1026)
    private final boolean method2554(int arg0, int arg1, int arg2) {
        field6165++;
        if (arg0 != 1) {
            return false;
        } else if (!this.method2543(arg0 - 1)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && this.field6124.field8175.length > arg2 && this.field6124.field8175[arg2] > arg1) {
            return true;
        } else if (class558.field7413) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)I", line = 1059)
    public final int method2555(int arg0) {
        if (arg0 != 1) {
            this.method2553(16, null, null);
        }
        field6151++;
        if (!this.method2543(0)) {
            throw new IllegalStateException("");
        }
        return this.field6124.field8178;
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(II)V", line = 1074)
    private final void method2556(int arg0, int arg1) {
        if (arg1 != -13556) {
            this.method2537(true, -44, 122);
        }
        if (this.field6138) {
            this.field6148[arg0] = this.field6129.method180(arg1 + 13556, arg0);
        } else {
            this.field6148[arg0] = class230.method1443(this.field6129.method180(0, arg0), (byte) -106, false);
        }
        field6152++;
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(II)I", line = 1092)
    public final int method2557(int arg0, int arg1) {
        if (arg1 < 52) {
            this.method2523(null, (byte) -17);
        }
        field6140++;
        if (this.method2543(0)) {
            int var3 = this.field6124.field8187.method309(arg0, true);
            return this.method2541(var3, (byte) 7) ? var3 : -1;
        } else {
            return -1;
        }
    }
}
