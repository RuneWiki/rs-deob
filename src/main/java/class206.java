import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class206 {

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Loh;")
    private class20 field3430 = null;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "Z")
    private boolean field3460;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "Z")
    private boolean field3443;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Ld;")
    private class161 field3431;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "[S")
    public static short[] field3444 = new short[256];

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "[I")
    public static int[] field3450 = new int[500];

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3456 = "";

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Lek;")
    public static class206 field3418;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "Lek;")
    public static class206 field3457;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "[Ljava/lang/Object;")
    private Object[] field3454;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3446;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z", line = 9)
    public final boolean method1399(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field3460 = false;
        }
        field3455++;
        if (!this.method1429(arg0, 15458)) {
            return false;
        } else if (this.field3454[arg0] == null) {
            this.method1403(arg0, 13183);
            return this.field3454[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B", line = 34)
    public final byte[] method1400(int arg0, String arg1, String arg2) {
        field3435++;
        if (!this.method1415(45)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3430.field529.method817(-71, class289.method2056((byte) -124, var4));
        if (!this.method1429(var6, 15458)) {
            return null;
        }
        if (arg0 > -90) {
            this.method1411(-63, (String) null);
        }
        int var7 = this.field3430.field536[var6].method817(-93, class289.method2056((byte) -109, var5));
        return this.method1404(var6, var7, (byte) -118);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Z", line = 59)
    public final boolean method1401(int arg0, int arg1) {
        if (arg1 != -2689) {
            this.field3443 = true;
        }
        field3423++;
        if (!this.method1415(115)) {
            return false;
        } else if (this.field3430.field527.length == 1) {
            return this.method1421(0, arg0, -30);
        } else if (!this.method1429(arg0, 15458)) {
            return false;
        } else if (this.field3430.field527[arg0] == 1) {
            return this.method1421(arg0, 0, -106);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;)I", line = 88)
    public final int method1402(int arg0, String arg1) {
        field3434++;
        if (!this.method1415(-106)) {
            return -1;
        } else if (arg0 > -72) {
            return 38;
        } else {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3430.field529.method817(-93, class289.method2056((byte) -109, var3));
            return this.method1429(var4, 15458) ? var4 : -1;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)V", line = 112)
    private final void method1403(int arg0, int arg1) {
        field3420++;
        if (arg1 != 13183) {
            this.method1406(16);
        }
        if (this.field3460) {
            this.field3454[arg0] = this.field3431.method1159(arg0, class115.method856(arg1, 13183));
        } else {
            this.field3454[arg0] = class132.method931((byte) 113, false, this.field3431.method1159(arg0, 0));
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIB)[B", line = 127)
    public final byte[] method1404(int arg0, int arg1, byte arg2) {
        if (arg2 > -53) {
            this.field3446 = (Object[][]) ((Object[][]) null);
        }
        field3453++;
        return this.method1430(arg1, arg0, (int[]) null, (byte) 17);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZII)Z", line = 138)
    private final boolean method1405(boolean arg0, int arg1, int arg2) {
        field3432++;
        if (!this.method1415(-103)) {
            return false;
        }
        if (arg0) {
            this.field3430 = (class20) null;
        }
        if (arg2 >= 0 && arg1 >= 0 && arg2 < this.field3430.field527.length && arg1 < this.field3430.field527[arg2]) {
            return true;
        } else if (class109.field2009) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I", line = 167)
    public final int method1406(int arg0) {
        field3440++;
        if (arg0 < 9) {
            this.method1410(12, (byte) 0);
        }
        if (!this.method1415(121)) {
            throw new IllegalStateException("");
        }
        return this.field3430.field528;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(II)[B", line = 183)
    public final byte[] method1407(int arg0, int arg1) {
        field3451++;
        if (!this.method1415(-104)) {
            return null;
        } else if (this.field3430.field527.length == 1) {
            return this.method1404(0, arg1, (byte) -104);
        } else {
            int var3 = -67 % ((arg0 - 42) / 33);
            if (!this.method1429(arg1, 15458)) {
                return null;
            } else if (this.field3430.field527[arg1] == 1) {
                return this.method1404(arg1, 0, (byte) -76);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I", line = 214)
    public final int method1408(int arg0) {
        field3419++;
        if (!this.method1415(arg0 ^ 0x54)) {
            return 0;
        }
        int var2 = arg0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3454.length; var4++) {
            if (this.field3430.field525[var4] > 0) {
                var2 += this.method1428((byte) 112, var4);
                var3 += 100;
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 249)
    public final boolean method1409(boolean arg0, String arg1) {
        field3447++;
        if (!this.method1415(42)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0) {
            return true;
        } else {
            int var4 = this.field3430.field529.method817(102, class289.method2056((byte) -126, var3));
            return var4 >= 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)I", line = 269)
    public final int method1410(int arg0, byte arg1) {
        field3439++;
        if (!this.method1415(-107)) {
            return -1;
        }
        int var3 = this.field3430.field529.method817(-128, arg0);
        if (this.method1429(var3, 15458)) {
            return arg1 < 0 ? -123 : var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(ILjava/lang/String;)V", line = 288)
    public final void method1411(int arg0, String arg1) {
        if (arg0 != -23237) {
            field3450 = (int[]) null;
        }
        field3458++;
        if (this.method1415(arg0 + 23304)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3430.field529.method817(-66, class289.method2056((byte) -119, var3));
            this.method1427(var4, (byte) 37);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 316)
    public final boolean method1412(int arg0, String arg1, String arg2) {
        if (arg0 != 0) {
            this.field3430 = (class20) null;
        }
        field3433++;
        if (!this.method1415(125)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3430.field529.method817(arg0 ^ 0xFFFFFFD9, class289.method2056((byte) -127, var4));
        if (this.method1429(var6, 15458)) {
            int var7 = this.field3430.field536[var6].method817(88, class289.method2056((byte) -115, var5));
            return this.method1421(var6, var7, arg0 ^ 0xFFFFFFA5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)[I", line = 346)
    public final int[] method1413(int arg0, byte arg1) {
        field3438++;
        int var3 = 92 / ((-arg1 - 29) / 52);
        if (!this.method1429(arg0, 15458)) {
            return null;
        }
        int[] var4 = this.field3430.field530[arg0];
        if (var4 == null) {
            var4 = new int[this.field3430.field525[arg0]];
            int var5 = 0;
            while (var4.length > var5) {
                var4[var5] = var5++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Z", line = 380)
    public final boolean method1414(int arg0) {
        field3442++;
        if (!this.method1415(arg0 ^ 0xFFFFFF9F)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field3430.field531.length; var3++) {
            int var4 = this.field3430.field531[var3];
            if (this.field3454[var4] == null) {
                this.method1403(var4, 13183);
                if (this.field3454[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)Z", line = 415)
    private final boolean method1415(int arg0) {
        field3428++;
        if (this.field3430 == null) {
            this.field3430 = this.field3431.method1154(255);
            if (this.field3430 == null) {
                return false;
            }
            this.field3446 = new Object[this.field3430.field534][];
            this.field3454 = new Object[this.field3430.field534];
        }
        int var2 = 81 % ((-arg0 - 29) / 53);
        return true;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 437)
    public final int method1416(String arg0, byte arg1) {
        field3425++;
        int var3 = 58 % ((-arg1 - 80) / 35);
        if (this.method1415(68)) {
            String var4 = arg0.toLowerCase();
            int var5 = this.field3430.field529.method817(-84, class289.method2056((byte) -111, var4));
            return this.method1428((byte) 112, var5);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)I", line = 454)
    public final int method1417(boolean arg0, int arg1) {
        field3427++;
        if (this.method1429(arg1, 15458)) {
            return arg0 ? this.field3430.field527[arg1] : 58;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(II)V", line = 473)
    public final void method1418(int arg0, int arg1) {
        field3441++;
        if (arg1 == 31163 && this.method1429(arg0, arg1 ^ 0x45D9) && this.field3446 != null) {
            this.field3446[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V", line = 493)
    public static void method1419(int arg0) {
        int var1 = 88 % ((-arg0 - 36) / 55);
        field3457 = null;
        field3418 = null;
        field3456 = null;
        field3444 = null;
        field3450 = null;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V", line = 505)
    public final void method1420(int arg0) {
        field3436++;
        if (arg0 >= -81) {
            field3449 = 105;
        }
        if (this.field3446 != null) {
            for (int var2 = 0; var2 < this.field3446.length; var2++) {
                this.field3446[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Z", line = 534)
    public final boolean method1421(int arg0, int arg1, int arg2) {
        field3437++;
        if (arg2 >= -15) {
            this.method1414(-29);
        }
        if (!this.method1405(false, arg1, arg0)) {
            return false;
        } else if (this.field3446[arg0] != null && this.field3446[arg0][arg1] != null) {
            return true;
        } else if (this.field3454[arg0] == null) {
            this.method1403(arg0, 13183);
            return this.field3454[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZZI)V", line = 567)
    public final void method1422(boolean arg0, boolean arg1, int arg2) {
        if (arg2 <= 68) {
            this.field3460 = true;
        }
        field3445++;
        if (!this.method1415(-88)) {
            return;
        }
        if (arg1) {
            this.field3430.field521 = null;
            this.field3430.field529 = null;
        }
        if (arg0) {
            this.field3430.field524 = (int[][]) null;
            this.field3430.field536 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)I", line = 595)
    public final int method1423(byte arg0) {
        field3429++;
        if (arg0 > -39) {
            field3450 = (int[]) null;
        }
        return this.method1415(-103) ? this.field3430.field527.length : -1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ[I)Z", line = 610)
    private final boolean method1424(int arg0, boolean arg1, int[] arg2) {
        field3452++;
        if (!this.method1429(arg0, 15458)) {
            return false;
        } else if (this.field3454[arg0] == null) {
            return false;
        } else {
            int var4 = this.field3430.field525[arg0];
            int[] var5 = this.field3430.field530[arg0];
            if (this.field3446[arg0] == null) {
                this.field3446[arg0] = new Object[this.field3430.field527[arg0]];
            }
            boolean var6 = arg1;
            Object[] var7 = this.field3446[arg0];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var10 = class212.method1467(this.field3454[arg0], false, (byte) 76);
            } else {
                var10 = class212.method1467(this.field3454[arg0], true, (byte) 76);
                class146 var11 = new class146(var10);
                var11.method1030(5, arg2, (byte) -127, var11.field2496.length);
            }
            byte[] var12;
            try {
                var12 = class128.method915(var10, 1);
            } catch (RuntimeException var31) {
                throw class96.method735(var31, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + class44.method373(-11196, var10, var10.length) + "," + class44.method373(-11196, var10, var10.length - 2) + "," + this.field3430.field526[arg0] + "," + this.field3430.field528);
            }
            if (this.field3460) {
                this.field3454[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                class146 var16 = new class146(var12);
                int[] var17 = new int[var4];
                int var18 = var32 - var4 * 4 * var15;
                var16.field2435 = var18;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var16.method1004(3);
                        if (var5 != null) {
                        }
                        var17[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                var16.field2435 = var18;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var16.method1004(3);
                        class89.method689(var12, var24, var22[var27], var17[var27], var26);
                        var17[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field3443) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class132.method931((byte) 113, false, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field3443) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class132.method931((byte) 113, false, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 801)
    public final boolean method1425(String arg0, int arg1) {
        field3424++;
        if (!this.method1415(-93)) {
            return false;
        } else if (arg1 == 4) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3430.field529.method817(102, class289.method2056((byte) -121, var3));
            return this.method1399(var4, 0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIB)[B", line = 819)
    public final byte[] method1426(int arg0, int arg1, byte arg2) {
        field3448++;
        if (arg2 > -76) {
            this.method1399(112, -89);
        }
        if (!this.method1405(false, arg0, arg1)) {
            return null;
        }
        if (this.field3446[arg1] == null || this.field3446[arg1][arg0] == null) {
            boolean var4 = this.method1424(arg1, true, (int[]) null);
            if (!var4) {
                this.method1403(arg1, 13183);
                boolean var5 = this.method1424(arg1, true, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        return class212.method1467(this.field3446[arg1][arg0], false, (byte) 76);
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Ld;ZZ)V", line = 961)
    public class206(class161 arg0, boolean arg1, boolean arg2) {
        this.field3460 = arg1;
        this.field3443 = arg2;
        this.field3431 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(IB)V", line = 858)
    private final void method1427(int arg0, byte arg1) {
        field3426++;
        this.field3431.method1153(arg0, 109);
        if (arg1 != 37) {
            this.field3431 = (class161) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)I", line = 871)
    private final int method1428(byte arg0, int arg1) {
        field3459++;
        if (this.method1429(arg1, 15458)) {
            if (arg0 != 112) {
                this.field3431 = (class161) null;
            }
            return this.field3454[arg1] == null ? this.field3431.method1156(arg1, -120) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(II)Z", line = 892)
    private final boolean method1429(int arg0, int arg1) {
        if (arg1 != 15458) {
            return true;
        }
        field3421++;
        if (!this.method1415(47)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field3430.field527.length && this.field3430.field527[arg0] != 0) {
            return true;
        } else if (class109.field2009) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[IB)[B", line = 921)
    public final byte[] method1430(int arg0, int arg1, int[] arg2, byte arg3) {
        field3422++;
        if (!this.method1405(false, arg0, arg1)) {
            return null;
        }
        if (this.field3446[arg1] == null || this.field3446[arg1][arg0] == null) {
            boolean var5 = this.method1424(arg1, true, arg2);
            if (!var5) {
                this.method1403(arg1, 13183);
                boolean var6 = this.method1424(arg1, true, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 != 17) {
            return (byte[]) null;
        }
        byte[] var7 = class212.method1467(this.field3446[arg1][arg0], false, (byte) 76);
        if (this.field3443) {
            this.field3446[arg1][arg0] = null;
            if (this.field3430.field527[arg1] == 1) {
                this.field3446[arg1] = null;
            }
        }
        return var7;
    }
}
