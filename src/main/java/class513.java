import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class513 {

    @OriginalMember(owner = "client!gga", name = "B", descriptor = "Lwu;")
    private class170 field7067 = null;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
    public int field7051;

    @OriginalMember(owner = "client!gga", name = "D", descriptor = "Z")
    private boolean field7069;

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "Lcg;")
    private class13 field7049;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "Lss;")
    public static class307 field7046 = new class307("", 19);

    @OriginalMember(owner = "client!gga", name = "Q", descriptor = "Lsv;")
    public static class570 field7082 = new class570(27, 3);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!gga", name = "u", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!gga", name = "v", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!gga", name = "w", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!gga", name = "x", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!gga", name = "y", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!gga", name = "A", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!gga", name = "C", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!gga", name = "E", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!gga", name = "F", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!gga", name = "G", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!gga", name = "H", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!gga", name = "I", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!gga", name = "J", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!gga", name = "K", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!gga", name = "L", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!gga", name = "M", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!gga", name = "N", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!gga", name = "P", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "[Ljava/lang/Object;")
    private Object[] field7065;

    @OriginalMember(owner = "client!gga", name = "O", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field7080;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)Z")
    public final boolean method2986(int arg0, int arg1) {
        field7056++;
        if (!this.method3014(arg1, 106)) {
            return false;
        } else if (this.field7065[arg1] == null) {
            this.method2991(-1, arg1);
            if (arg0 != -23687) {
                this.field7065 = null;
            }
            return this.field7065[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)Z")
    public final boolean method2987(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method3015(-8, null);
        }
        field7044++;
        if (!this.method2995(arg0, true, arg2)) {
            return false;
        } else if (this.field7080[arg0] != null && this.field7080[arg0][arg2] != null) {
            return true;
        } else if (this.field7065[arg0] == null) {
            this.method2991(-1, arg0);
            return this.field7065[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(II)[B")
    public final byte[] method2988(int arg0, int arg1) {
        field7054++;
        if (!this.method3008(true)) {
            return null;
        } else if (this.field7067.field2581.length == 1) {
            return this.method3019(0, arg0, 64);
        } else if (!this.method3014(arg0, arg1 ^ 0x71)) {
            return null;
        } else if (this.field7067.field2581[arg0] == 1) {
            return this.method3019(arg0, 0, arg1 ^ 0x76);
        } else if (arg1 == 0) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZZZ)V")
    public final void method2989(boolean arg0, boolean arg1, boolean arg2) {
        field7048++;
        if (!this.method3008(arg0)) {
            return;
        }
        if (arg1) {
            this.field7067.field2582 = null;
            this.field7067.field2568 = null;
        }
        if (arg2) {
            this.field7067.field2578 = null;
            this.field7067.field2576 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2990(byte arg0, String arg1) {
        int var3 = -114 / ((87 - arg0) / 38);
        field7079++;
        if (this.method3008(true)) {
            String var4 = arg1.toLowerCase();
            int var5 = this.field7067.field2578.method4295(class340.method2084(1, var4), 104);
            return this.method2986(-23687, var5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(II)V")
    private final void method2991(int arg0, int arg1) {
        field7055++;
        if (arg0 != -1) {
            this.field7051 = 47;
        }
        if (this.field7069) {
            this.field7065[arg1] = this.field7049.method163(arg1, arg0 - 32170);
        } else {
            this.field7065[arg1] = class381.method2301(this.field7049.method163(arg1, -32171), false, false);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
    public final void method2992(byte arg0) {
        if (this.field7080 != null) {
            for (int var2 = 0; var2 < this.field7080.length; var2++) {
                this.field7080[var2] = null;
            }
        }
        field7050++;
        int var3 = -114 % ((arg0 - 54) / 36);
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)I")
    public final int method2993(boolean arg0) {
        if (!arg0) {
            this.method3014(110, 124);
        }
        field7052++;
        if (!this.method3008(arg0)) {
            throw new IllegalStateException("");
        }
        return this.field7067.field2585;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB[II)[B")
    public final byte[] method2994(int arg0, byte arg1, int[] arg2, int arg3) {
        if (arg1 != -97) {
            return null;
        }
        field7068++;
        if (!this.method2995(arg0, true, arg3)) {
            return null;
        }
        if (this.field7080[arg0] == null || this.field7080[arg0][arg3] == null) {
            boolean var5 = this.method3001((byte) 110, arg3, arg2, arg0);
            if (!var5) {
                this.method2991(arg1 + 96, arg0);
                boolean var6 = this.method3001((byte) 110, arg3, arg2, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class197.method1407((byte) 55, this.field7080[arg0][arg3], false);
        if (this.field7051 == 1) {
            this.field7080[arg0][arg3] = null;
            if (this.field7067.field2581[arg0] == 1) {
                this.field7080[arg0] = null;
            }
        } else if (this.field7051 == 2) {
            this.field7080[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZI)Z")
    private final boolean method2995(int arg0, boolean arg1, int arg2) {
        field7043++;
        if (!this.method3008(arg1)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field7067.field2581.length && this.field7067.field2581[arg0] > arg2) {
            return arg1 ? true : true;
        } else if (class368.field5190) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BII)Z")
    public static final boolean method2996(byte arg0, int arg1, int arg2) {
        field7063++;
        return arg0 == -33 ? class598.method3487(0, arg1, arg2) & class335.method2057(0, arg2, arg1) : true;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BI)I")
    public final int method2997(byte arg0, int arg1) {
        field7070++;
        if (!this.method3008(true)) {
            return -1;
        }
        int var3 = this.field7067.field2578.method4295(arg1, -120);
        if (this.method3014(var3, 97)) {
            if (arg0 != -2) {
                this.method3005(-29, (byte) -23);
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
    public final int method2998(int arg0) {
        field7053++;
        if (!this.method3008(true)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field7065.length; var4++) {
            if (this.field7067.field2569[var4] > 0) {
                var2 += 100;
                var3 += this.method3018(var4, true);
            }
        }
        if (arg0 == var2) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(Z)V")
    public final void method2999(boolean arg0) {
        if (this.field7065 != null) {
            for (int var2 = 0; var2 < this.field7065.length; var2++) {
                this.field7065[var2] = null;
            }
        }
        field7075++;
        if (arg0) {
            this.method3012(-121, -69);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZ)V")
    private final void method3000(int arg0, boolean arg1) {
        if (!arg1) {
            this.method3001((byte) 22, 95, null, 62);
        }
        field7045++;
        this.field7049.method165(0, arg0);
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BI[II)Z")
    private final boolean method3001(byte arg0, int arg1, int[] arg2, int arg3) {
        field7072++;
        if (!this.method3014(arg3, arg0 ^ 0x12)) {
            return false;
        } else if (this.field7065[arg3] == null) {
            return false;
        } else {
            if (arg0 != 110) {
                this.field7080 = null;
            }
            int var5 = this.field7067.field2569[arg3];
            int[] var6 = this.field7067.field2579[arg3];
            if (this.field7080[arg3] == null) {
                this.field7080[arg3] = new Object[this.field7067.field2581[arg3]];
            }
            Object[] var7 = this.field7080[arg3];
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
                var11 = class197.method1407((byte) 43, this.field7065[arg3], true);
                class431 var12 = new class431(var11);
                var12.method2549(arg2, (byte) 124, 5, var12.field6002.length);
            } else {
                var11 = class197.method1407((byte) 44, this.field7065[arg3], false);
            }
            byte[] var13;
            try {
                var13 = class347.method2116(true, var11);
            } catch (RuntimeException var49) {
                throw class397.method2366(var49, "T3 - " + (arg2 != null) + "," + arg3 + "," + var11.length + "," + class549.method3177(var11.length, -26861, var11) + "," + class549.method3177(var11.length - 2, -26861, var11) + "," + this.field7067.field2575[arg3] + "," + this.field7067.field2585);
            }
            if (this.field7069) {
                this.field7065[arg3] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field7051 == 0) {
                    var7[var15] = class381.method2301(var13, false, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field7051 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class431 var19 = new class431(var13);
                int var20 = 0;
                var19.field5983 = var18;
                int var21 = 0;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method2526(17);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg1 == var25) {
                            var20 += var23;
                            var21 = var25;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                var19.field5983 = var18;
                int var27 = 0;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method2526(17);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg1 == var32) {
                            class171.method1263(var13, var28, var26, var27, var30);
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
                int var35 = var51 - var34 * 4 * var5;
                class431 var36 = new class431(var13);
                int[] var37 = new int[var5];
                var36.field5983 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method2526(17);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field5983 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method2526(17);
                        class171.method1263(var13, var43, var41[var46], var37[var46], var45);
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
                    if (this.field7051 == 0) {
                        var7[var48] = class381.method2301(var41[var47], false, false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method3002(String arg0, String arg1, byte arg2) {
        int var4 = 57 / ((5 - arg2) / 34);
        field7071++;
        if (!this.method3008(true)) {
            return false;
        }
        String var5 = arg0.toLowerCase();
        String var6 = arg1.toLowerCase();
        int var7 = this.field7067.field2578.method4295(class340.method2084(1, var5), 67);
        if (var7 < 0) {
            return false;
        } else {
            int var8 = this.field7067.field2568[var7].method4295(class340.method2084(1, var6), 112);
            return var8 >= 0;
        }
    }

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "(II)V")
    public final void method3003(int arg0, int arg1) {
        field7042++;
        if (!this.method3014(arg1, arg0 ^ 0xFFFF8C00)) {
            return;
        }
        if (this.field7080 != null) {
            this.field7080[arg1] = null;
        }
        if (arg0 != -29588) {
            this.method2992((byte) 82);
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)Z")
    public final boolean method3004(byte arg0) {
        field7040++;
        if (!this.method3008(true)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 > -125) {
            return true;
        }
        for (int var3 = 0; var3 < this.field7067.field2584.length; var3++) {
            int var4 = this.field7067.field2584[var3];
            if (this.field7065[var4] == null) {
                this.method2991(-1, var4);
                if (this.field7065[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)Z")
    public final boolean method3005(int arg0, byte arg1) {
        field7041++;
        if (!this.method3008(true)) {
            return false;
        } else if (this.field7067.field2581.length == 1) {
            return this.method2987(0, 0, arg0);
        } else if (!this.method3014(arg0, 107)) {
            return false;
        } else if (this.field7067.field2581[arg0] == 1) {
            return this.method2987(arg0, 0, 0);
        } else {
            if (arg1 != -69) {
                this.field7051 = -95;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method3006(String arg0, byte arg1) {
        field7078++;
        if (!this.method3008(true)) {
            return;
        }
        if (arg1 != -57) {
            this.method3001((byte) -50, 89, null, 81);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field7067.field2578.method4295(class340.method2084(1, var3), -125);
        this.method3000(var4, true);
    }

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "(II)I")
    public final int method3007(int arg0, int arg1) {
        if (arg0 == -1) {
            field7064++;
            return this.method3014(arg1, 95) ? this.field7067.field2581[arg1] : 0;
        } else {
            return 115;
        }
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(Z)Z")
    private final boolean method3008(boolean arg0) {
        if (!arg0) {
            return true;
        }
        field7076++;
        if (this.field7067 == null) {
            this.field7067 = this.field7049.method164((byte) 2);
            if (this.field7067 == null) {
                return false;
            }
            this.field7065 = new Object[this.field7067.field2572];
            this.field7080 = new Object[this.field7067.field2572][];
        }
        return true;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
    private final boolean method3009(boolean arg0, String arg1, String arg2) {
        field7062++;
        if (!this.method3008(!arg0)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field7067.field2578.method4295(class340.method2084(1, var4), -99);
        if (arg0) {
            return true;
        } else if (this.method3014(var6, 116)) {
            int var7 = this.field7067.field2568[var6].method4295(class340.method2084(1, var5), -71);
            return this.method2987(var6, 0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method3010(byte arg0, String arg1) {
        field7077++;
        if (arg0 <= 120) {
            this.field7051 = 12;
        }
        int var3 = this.method3016(67, "");
        return var3 == -1 ? this.method3009(false, arg1, "") : this.method3009(false, "", arg1);
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(B)I")
    public final int method3011(byte arg0) {
        field7059++;
        int var2 = -114 / ((-arg0 - 54) / 47);
        return this.method3008(true) ? this.field7067.field2581.length : -1;
    }

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "(II)[I")
    public final int[] method3012(int arg0, int arg1) {
        field7081++;
        if (arg0 >= -58) {
            this.method3020(null, -70);
        }
        if (!this.method3014(arg1, 111)) {
            return null;
        }
        int[] var3 = this.field7067.field2579[arg1];
        if (var3 == null) {
            var3 = new int[this.field7067.field2569[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "(B)V")
    public static void method3013(byte arg0) {
        field7082 = null;
        field7046 = null;
        if (arg0 >= -91) {
            field7046 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "(II)Z")
    private final boolean method3014(int arg0, int arg1) {
        field7073++;
        if (arg1 <= 92) {
            return false;
        } else if (!this.method3008(true)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field7067.field2581.length && this.field7067.field2581[arg0] != 0) {
            return true;
        } else if (class368.field5190) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method3015(int arg0, String arg1) {
        if (arg0 != 3870) {
            this.method3001((byte) 61, 64, null, -2);
        }
        field7066++;
        if (this.method3008(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field7067.field2578.method4295(class340.method2084(arg0 ^ 0xF1F, var3), -101);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method3016(int arg0, String arg1) {
        field7061++;
        if (arg0 < 65) {
            this.method3008(true);
        }
        if (this.method3008(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field7067.field2578.method4295(class340.method2084(1, var3), 97);
            return this.method3014(var4, 125) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method3017(int arg0, String arg1, String arg2) {
        field7047++;
        if (!this.method3008(true)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        if (arg0 != 0) {
            return null;
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field7067.field2578.method4295(class340.method2084(1, var4), arg0 + 100);
        if (this.method3014(var6, 122)) {
            int var7 = this.field7067.field2568[var6].method4295(class340.method2084(1, var5), -119);
            return this.method3019(var6, var7, 58);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(IZ)I")
    private final int method3018(int arg0, boolean arg1) {
        if (!arg1) {
            this.field7051 = -120;
        }
        field7074++;
        if (this.method3014(arg0, 96)) {
            return this.field7065[arg0] == null ? this.field7049.method167((byte) 125, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lcg;ZI)V")
    public class513(class13 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field7051 = arg2;
        this.field7069 = arg1;
        this.field7049 = arg0;
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)[B")
    public final byte[] method3019(int arg0, int arg1, int arg2) {
        if (arg2 <= 55) {
            this.method2997((byte) -50, 22);
        }
        field7060++;
        return this.method2994(arg0, (byte) -97, null, arg1);
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method3020(String arg0, int arg1) {
        field7057++;
        if (!this.method3008(true)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field7067.field2578.method4295(class340.method2084(1, var3), arg1 - 107);
        if (arg1 != 0) {
            field7046 = null;
        }
        return this.method3018(var4, true);
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method3021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field7058++;
        int var8 = class645.method3656(class698.field9801, class515.field7102, arg7, 26289);
        int var9 = class645.method3656(class698.field9801, class515.field7102, arg5, 26289);
        int var10 = class645.method3656(class435.field6058, class742.field10301, arg2, 26289);
        int var11 = class645.method3656(class435.field6058, class742.field10301, arg0, 26289);
        int var12 = class645.method3656(class698.field9801, class515.field7102, arg1 + arg7, 26289);
        int var13 = class645.method3656(class698.field9801, class515.field7102, arg5 - arg1, 26289);
        for (int var14 = var8; var14 < var12; var14++) {
            class379.method2284(var10, var11, class74.field1144[var14], arg3, 2);
        }
        if (!arg6) {
            method2996((byte) -39, 123, -50);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class379.method2284(var10, var11, class74.field1144[var15], arg3, 2);
        }
        int var16 = class645.method3656(class435.field6058, class742.field10301, arg1 + arg2, 26289);
        int var17 = class645.method3656(class435.field6058, class742.field10301, arg0 - arg1, 26289);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class74.field1144[var18];
            class379.method2284(var10, var16, var19, arg3, 2);
            class379.method2284(var16, var17, var19, arg4, 2);
            class379.method2284(var17, var11, var19, arg3, 2);
        }
    }
}
