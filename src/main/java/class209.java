import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class209 {

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Lsv;")
    private class656 field3003 = null;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "Z")
    private boolean field3032;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Liu;")
    private class575 field3015;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "[I")
    public static int[] field3013 = new int[2048];

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[Ljava/lang/Object;")
    private Object[] field3014;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3023;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V", line = 9)
    private final void method1449(int arg0, int arg1) {
        field3012++;
        this.field3015.method1376(255, arg0);
        if (arg1 > -70) {
            this.method1467(-123, -112, null, 24);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZZ)V", line = 21)
    public final void method1450(boolean arg0, boolean arg1, boolean arg2) {
        field3004++;
        if (!arg0 || !this.method1457((byte) 14)) {
            return;
        }
        if (arg2) {
            this.field3003.field9234 = null;
            this.field3003.field9223 = null;
        }
        if (arg1) {
            this.field3003.field9226 = null;
            this.field3003.field9222 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 49)
    public final boolean method1451(String arg0, String arg1, int arg2) {
        field3010++;
        if (!this.method1457((byte) 14)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3003.field9222.method3852((byte) -17, class180.method1293(var4, 45));
        if (arg2 >= -31) {
            this.field3023 = null;
        }
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field3003.field9223[var6].method3852((byte) -17, class180.method1293(var5, 45));
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;)V", line = 75)
    public final void method1452(int arg0, String arg1) {
        field3006++;
        if (!this.method1457((byte) 14)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 >= -32) {
            field3013 = null;
        }
        int var4 = this.field3003.field9222.method3852((byte) -17, class180.method1293(var3, 45));
        this.method1449(var4, -112);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)[B", line = 93)
    public final byte[] method1453(int arg0, int arg1, int arg2) {
        field3039++;
        int var4 = 79 % ((-arg1 - 55) / 61);
        return this.method1473(arg2, true, null, arg0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I", line = 103)
    public final int method1454(int arg0) {
        field3007++;
        if (this.method1457((byte) 14)) {
            return arg0 == -1 ? this.field3003.field9227.length : -46;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I", line = 117)
    public final int method1455(boolean arg0) {
        field3033++;
        if (!arg0) {
            this.method1475(null, (byte) -11, null);
        }
        if (!this.method1457((byte) 14)) {
            throw new IllegalStateException("");
        }
        return this.field3003.field9232;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)V", line = 131)
    public final void method1456(boolean arg0) {
        if (this.field3014 != null) {
            for (int var2 = 0; var2 < this.field3014.length; var2++) {
                this.field3014[var2] = null;
            }
        }
        if (arg0) {
            this.method1480(-119, (byte) 59);
        }
        field3021++;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)Z", line = 152)
    private final boolean method1457(byte arg0) {
        if (arg0 != 14) {
            return false;
        }
        field3008++;
        if (this.field3003 == null) {
            this.field3003 = this.field3015.method1381(72);
            if (this.field3003 == null) {
                return false;
            }
            this.field3023 = new Object[this.field3003.field9216][];
            this.field3014 = new Object[this.field3003.field9216];
        }
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)Z", line = 181)
    public final boolean method1458(byte arg0, int arg1) {
        field3030++;
        if (!this.method1481(arg1, (byte) 84)) {
            return false;
        } else if (this.field3014[arg1] == null) {
            this.method1471((byte) 84, arg1);
            if (arg0 >= -29) {
                return false;
            } else {
                return this.field3014[arg1] != null;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)I", line = 203)
    private final int method1459(int arg0, int arg1) {
        field3035++;
        if (arg0 != -1) {
            this.field3023 = null;
        }
        if (this.method1481(arg1, (byte) 64)) {
            return this.field3014[arg1] == null ? this.field3015.method1382(arg1, 0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 220)
    public final int method1460(String arg0, byte arg1) {
        field3019++;
        if (!this.method1457((byte) 14)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3003.field9222.method3852((byte) -17, class180.method1293(var3, 45));
        if (arg1 < 123) {
            this.method1463(null, (byte) -28);
        }
        return this.method1459(-1, var4);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Z", line = 242)
    public final boolean method1461(int arg0) {
        field3025++;
        if (!this.method1457((byte) 14)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3003.field9225.length; var3++) {
            int var4 = this.field3003.field9225[var3];
            if (this.field3014[var4] == null) {
                this.method1471((byte) 86, var4);
                if (this.field3014[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 != -22627) {
            this.method1478((byte) -40, 40);
        }
        return var2;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)I", line = 282)
    public final int method1462(int arg0) {
        field3011++;
        if (!this.method1457((byte) 14)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3014.length; var4++) {
            if (this.field3003.field9236[var4] > 0) {
                var3 += this.method1459(-1, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return arg0 * var3 / var2;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Ljava/lang/String;B)Z", line = 319)
    public final boolean method1463(String arg0, byte arg1) {
        field3026++;
        if (!this.method1457((byte) 14)) {
            return false;
        }
        if (arg1 != 117) {
            field3013 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3003.field9222.method3852((byte) -17, class180.method1293(var3, 45));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V", line = 342)
    public final void method1464(byte arg0) {
        if (arg0 < 61) {
            this.method1460(null, (byte) 126);
        }
        if (this.field3023 != null) {
            for (int var2 = 0; var2 < this.field3023.length; var2++) {
                this.field3023[var2] = null;
            }
        }
        field3036++;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(ILjava/lang/String;)Z", line = 364)
    public final boolean method1465(int arg0, String arg1) {
        if (arg0 != 0) {
            field3013 = null;
        }
        field3005++;
        int var3 = this.method1482(-1, "");
        return var3 == -1 ? this.method1483(arg1, -6628, "") : this.method1483("", arg0 - 6628, arg1);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)Z", line = 380)
    private final boolean method1466(int arg0, int arg1, int arg2) {
        field3024++;
        if (arg2 < 27) {
            this.field3014 = null;
        }
        if (!this.method1457((byte) 14)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field3003.field9227.length && this.field3003.field9227[arg0] > arg1) {
            return true;
        } else if (class105.field1749) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[II)Z", line = 405)
    private final boolean method1467(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg3 < 45) {
            return false;
        }
        field3002++;
        if (!this.method1481(arg0, (byte) -76)) {
            return false;
        } else if (this.field3014[arg0] == null) {
            return false;
        } else {
            int var5 = this.field3003.field9236[arg0];
            int[] var6 = this.field3003.field9221[arg0];
            if (this.field3023[arg0] == null) {
                this.field3023[arg0] = new Object[this.field3003.field9227[arg0]];
            }
            Object[] var7 = this.field3023[arg0];
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
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var11 = class47.method425(this.field3014[arg0], (byte) 43, true);
                class35 var12 = new class35(var11);
                var12.method224(5, var12.field483.length, arg2, 6843);
            } else {
                var11 = class47.method425(this.field3014[arg0], (byte) 69, false);
            }
            byte[] var13;
            try {
                var13 = class565.method3296(var11, -84);
            } catch (RuntimeException var49) {
                throw class490.method2950(var49, "T3 - " + (arg2 != null) + "," + arg0 + "," + var11.length + "," + class31.method207(var11.length, 0, var11) + "," + class31.method207(var11.length - 2, 0, var11) + "," + this.field3003.field9230[arg0] + "," + this.field3003.field9232);
            }
            if (this.field3032) {
                this.field3014[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field3022 == 0) {
                    var7[var15] = class187.method1323(100, false, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field3022 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var17 * 4 * var5;
                class35 var19 = new class35(var13);
                int var20 = 0;
                int var21 = 0;
                var19.field469 = var18;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method234((byte) -108);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg1 == var25) {
                            var21 = var25;
                            var20 += var23;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                var19.field469 = var18;
                int var27 = 0;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method234((byte) -94);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg1 == var32) {
                            class622.method3597(var13, var28, var26, var27, var30);
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
                class35 var36 = new class35(var13);
                var36.field469 = var35;
                int[] var37 = new int[var5];
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method234((byte) -110);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field469 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method234((byte) -95);
                        class622.method3597(var13, var43, var41[var46], var37[var46], var45);
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
                    if (this.field3022 == 0) {
                        var7[var48] = class187.method1323(100, false, var41[var47]);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(II)I", line = 694)
    public static final int method1468(int arg0, int arg1) {
        field3017++;
        if (arg0 != -6411) {
            return 1;
        } else if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BII)Z", line = 731)
    public final boolean method1469(byte arg0, int arg1, int arg2) {
        field3038++;
        if (arg0 > -86) {
            this.field3032 = false;
        }
        if (!this.method1466(arg1, arg2, 69)) {
            return false;
        } else if (this.field3023[arg1] != null && this.field3023[arg1][arg2] != null) {
            return true;
        } else if (this.field3014[arg1] == null) {
            this.method1471((byte) 91, arg1);
            return this.field3014[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 763)
    public final boolean method1470(String arg0, int arg1) {
        if (arg1 != -7490) {
            field3013 = null;
        }
        field3020++;
        if (this.method1457((byte) 14)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3003.field9222.method3852((byte) -17, class180.method1293(var3, 45));
            return this.method1458((byte) -113, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(BI)V", line = 791)
    private final void method1471(byte arg0, int arg1) {
        int var3 = 94 % ((37 - arg0) / 43);
        field2999++;
        if (this.field3032) {
            this.field3014[arg1] = this.field3015.method1375(arg1, (byte) 88);
        } else {
            this.field3014[arg1] = class187.method1323(100, false, this.field3015.method1375(arg1, (byte) -120));
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(II)Z", line = 809)
    public final boolean method1472(int arg0, int arg1) {
        field3001++;
        if (!this.method1457((byte) 14)) {
            return false;
        } else if (this.field3003.field9227.length == 1) {
            return this.method1469((byte) -109, 0, arg1);
        } else if (arg0 != -25711) {
            return true;
        } else if (!this.method1481(arg1, (byte) -111)) {
            return false;
        } else if (this.field3003.field9227[arg1] == 1) {
            return this.method1469((byte) -106, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZ[II)[B", line = 836)
    public final byte[] method1473(int arg0, boolean arg1, int[] arg2, int arg3) {
        field3031++;
        if (!this.method1466(arg0, arg3, 89)) {
            return null;
        }
        if (!arg1) {
            this.method1464((byte) 28);
        }
        if (this.field3023[arg0] == null || this.field3023[arg0][arg3] == null) {
            boolean var5 = this.method1467(arg0, arg3, arg2, 61);
            if (!var5) {
                this.method1471((byte) 110, arg0);
                boolean var6 = this.method1467(arg0, arg3, arg2, 102);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class47.method425(this.field3023[arg0][arg3], (byte) -127, false);
        if (this.field3022 == 1) {
            this.field3023[arg0][arg3] = null;
            if (this.field3003.field9227[arg0] == 1) {
                this.field3023[arg0] = null;
            }
        } else if (this.field3022 == 2) {
            this.field3023[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V", line = 891)
    public static void method1474(int arg0) {
        if (arg0 > -110) {
            method1468(14, 42);
        }
        field3013 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B", line = 902)
    public final byte[] method1475(String arg0, byte arg1, String arg2) {
        field3029++;
        if (!this.method1457((byte) 14)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        if (arg1 != 116) {
            return null;
        }
        int var6 = this.field3003.field9222.method3852((byte) -17, class180.method1293(var4, 45));
        if (this.method1481(var6, (byte) -105)) {
            int var7 = this.field3003.field9223[var6].method3852((byte) -17, class180.method1293(var5, 45));
            return this.method1453(var7, -121, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)I", line = 927)
    public final int method1476(int arg0, byte arg1) {
        field3009++;
        if (this.method1457((byte) 14)) {
            int var3 = -40 / ((arg1 - 56) / 44);
            int var4 = this.field3003.field9222.method3852((byte) -17, arg0);
            return this.method1481(var4, (byte) 70) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(II)I", line = 948)
    public final int method1477(int arg0, int arg1) {
        field3037++;
        if (this.method1481(arg1, (byte) 115)) {
            if (arg0 != 0) {
                this.method1466(87, -26, -53);
            }
            return this.field3003.field9227[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(BI)[B", line = 964)
    public final byte[] method1478(byte arg0, int arg1) {
        field3034++;
        if (!this.method1457((byte) 14)) {
            return null;
        } else if (this.field3003.field9227.length == 1) {
            return this.method1453(arg1, 35, 0);
        } else if (!this.method1481(arg1, (byte) -82)) {
            return null;
        } else if (this.field3003.field9227[arg1] == 1) {
            return this.method1453(0, 98, arg1);
        } else if (arg0 == -72) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(II)[I", line = 1000)
    public final int[] method1479(int arg0, int arg1) {
        field3018++;
        if (!this.method1481(arg0, (byte) -55)) {
            return null;
        } else if (arg1 > -77) {
            return null;
        } else {
            int[] var3 = this.field3003.field9221[arg0];
            if (var3 == null) {
                var3 = new int[this.field3003.field9236[arg0]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IB)V", line = 1031)
    public final void method1480(int arg0, byte arg1) {
        field3016++;
        if (!this.method1481(arg0, (byte) 72)) {
            return;
        }
        if (this.field3023 != null) {
            this.field3023[arg0] = null;
        }
        if (arg1 != 31) {
            this.field3003 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(IB)Z", line = 1048)
    private final boolean method1481(int arg0, byte arg1) {
        field3000++;
        if (!this.method1457((byte) 14)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field3003.field9227.length && this.field3003.field9227[arg0] != 0) {
            int var3 = 78 / ((arg1 - 5) / 58);
            return true;
        } else if (class105.field1749) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Liu;ZI)V", line = 1077)
    public class209(class575 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3032 = arg1;
        this.field3015 = arg0;
        this.field3022 = arg2;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(ILjava/lang/String;)I", line = 1090)
    public final int method1482(int arg0, String arg1) {
        field3027++;
        if (!this.method1457((byte) 14)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != -1) {
            this.method1471((byte) 116, -111);
        }
        int var4 = this.field3003.field9222.method3852((byte) -17, class180.method1293(var3, 45));
        return this.method1481(var4, (byte) -114) ? var4 : -1;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 1111)
    private final boolean method1483(String arg0, int arg1, String arg2) {
        if (arg1 != -6628) {
            this.method1483(null, 88, null);
        }
        field3028++;
        if (!this.method1457((byte) 14)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3003.field9222.method3852((byte) -17, class180.method1293(var4, 45));
        if (this.method1481(var6, (byte) -126)) {
            int var7 = this.field3003.field9223[var6].method3852((byte) -17, class180.method1293(var5, 45));
            return this.method1469((byte) -98, var6, var7);
        } else {
            return false;
        }
    }
}
