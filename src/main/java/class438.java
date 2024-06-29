import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class438 {

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Lto;")
    private class158 field6492 = null;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Z")
    private boolean field6494;

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
    public int field6511;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "Ltm;")
    private class415 field6501;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "Lpg;")
    public static class492 field6527 = new class492(62, -2);

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "[I")
    public static int[] field6528 = new int[14];

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "Ler;")
    public static class157 field6530 = new class157(4);

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "[[B")
    public static byte[][] field6533;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!ns", name = "D", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!ns", name = "F", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!ns", name = "G", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!ns", name = "H", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!ns", name = "I", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "Lns;")
    public static class438 field6532;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "[Ljava/lang/Object;")
    private Object[] field6490;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6513;

    static {
        new class375("From", "Von:", "De", "De");
        field6533 = new byte[250][];
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)I", line = 4)
    public final int method2619(int arg0, boolean arg1) {
        field6509++;
        if (this.method2630(97)) {
            int var3 = this.field6492.field2292.method2222((byte) -111, arg0);
            return this.method2642(arg1, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[II)[B", line = 21)
    public final byte[] method2620(int arg0, int arg1, int[] arg2, int arg3) {
        field6499++;
        if (!this.method2639(arg0, arg3, 6198)) {
            return null;
        }
        if (this.field6513[arg0] == null || this.field6513[arg0][arg3] == null) {
            boolean var5 = this.method2632(arg1 + 6944, arg3, arg2, arg0);
            if (!var5) {
                this.method2653(-1, arg0);
                boolean var6 = this.method2632(0, arg3, arg2, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 != -6944) {
            return null;
        }
        byte[] var7 = class1.method6((byte) -85, this.field6513[arg0][arg3], false);
        if (this.field6511 == 1) {
            this.field6513[arg0][arg3] = null;
            if (this.field6492.field2306[arg0] == 1) {
                this.field6513[arg0] = null;
            }
        } else if (this.field6511 == 2) {
            this.field6513[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 69)
    public final void method2621(String arg0, int arg1) {
        field6503++;
        if (!this.method2630(-116)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -1) {
            field6533 = null;
        }
        int var4 = this.field6492.field2292.method2222((byte) -85, class78.method513(var3, 124));
        this.method2637(arg1 ^ 0x7A, var4);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I", line = 88)
    public final int method2622(int arg0) {
        field6500++;
        if (!this.method2630(-119)) {
            throw new IllegalStateException("");
        }
        if (arg0 != 1) {
            this.method2647(-72, -92, 49);
        }
        return this.field6492.field2295;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I", line = 102)
    private final int method2623(int arg0, int arg1) {
        field6489++;
        if (this.method2642(true, arg1)) {
            int var3 = 13 / ((50 - arg0) / 54);
            return this.field6490[arg1] == null ? this.field6501.method1424(arg1, -2) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)Z", line = 120)
    public final boolean method2624(int arg0, int arg1) {
        field6531++;
        if (!this.method2630(98)) {
            return false;
        } else if (this.field6492.field2306.length == 1) {
            return this.method2647(-96, 0, arg1);
        } else if (!this.method2642(true, arg1)) {
            return false;
        } else if (this.field6492.field2306[arg1] == 1) {
            return this.method2647(-79, arg1, 0);
        } else {
            if (arg0 > -87) {
                this.method2619(-18, true);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V", line = 148)
    public final void method2625(int arg0) {
        if (this.field6513 != null) {
            for (int var2 = 0; var2 < this.field6513.length; var2++) {
                this.field6513[var2] = null;
            }
        }
        if (arg0 != -1) {
            field6527 = null;
        }
        field6502++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 171)
    public final boolean method2626(String arg0, int arg1, String arg2) {
        field6512++;
        if (!this.method2630(24)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field6492.field2292.method2222((byte) -113, class78.method513(var4, 118));
        if (arg1 != 0) {
            return false;
        } else if (this.method2642(true, var6)) {
            int var7 = this.field6492.field2298[var6].method2222((byte) -88, class78.method513(var5, arg1 ^ 0x7F));
            return this.method2647(arg1 + 54, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 196)
    public final byte[] method2627(String arg0, String arg1, int arg2) {
        field6519++;
        if (arg2 != 0) {
            this.method2642(true, -66);
        }
        if (!this.method2630(93)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field6492.field2292.method2222((byte) -120, class78.method513(var4, 125));
        if (this.method2642(true, var6)) {
            int var7 = this.field6492.field2298[var6].method2222((byte) -125, class78.method513(var5, arg2 ^ 0x7A));
            return this.method2650(var7, arg2 - 81, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I", line = 229)
    public final int method2628(int arg0) {
        field6491++;
        if (!this.method2630(-127)) {
            return 0;
        }
        int var2 = 39 / ((-arg0 - 12) / 60);
        int var3 = 0;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field6490.length; var5++) {
            if (this.field6492.field2297[var5] > 0) {
                var3 += 100;
                var4 += this.method2623(-28, var5);
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var4 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZZB)V", line = 268)
    public final void method2629(boolean arg0, boolean arg1, byte arg2) {
        field6529++;
        if (!this.method2630(96)) {
            return;
        }
        if (arg0) {
            this.field6492.field2307 = null;
            this.field6492.field2292 = null;
        }
        if (arg2 == -74 && arg1) {
            this.field6492.field2309 = null;
            this.field6492.field2298 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z", line = 295)
    private final boolean method2630(int arg0) {
        field6518++;
        int var2 = 37 % ((arg0 + 51) / 62);
        if (this.field6492 == null) {
            this.field6492 = this.field6501.method1419(0);
            if (this.field6492 == null) {
                return false;
            }
            this.field6490 = new Object[this.field6492.field2304];
            this.field6513 = new Object[this.field6492.field2304][];
        }
        return true;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;ZIB)Z", line = 317)
    public static final boolean method2631(String arg0, boolean arg1, int arg2, byte arg3) {
        field6504++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        int var5 = 55 / ((arg3 + 46) / 61);
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg0.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg0.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg1) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var12) {
                return false;
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg2 * var7 + var12;
            if ((var11 / arg2) != var7) {
                return false;
            }
            var7 = var11;
            var6 = true;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II[II)Z", line = 390)
    private final boolean method2632(int arg0, int arg1, int[] arg2, int arg3) {
        field6498++;
        if (!this.method2642(true, arg3)) {
            return false;
        } else if (this.field6490[arg3] == null) {
            return false;
        } else {
            int var5 = this.field6492.field2297[arg3];
            int[] var6 = this.field6492.field2308[arg3];
            if (this.field6513[arg3] == null) {
                this.field6513[arg3] = new Object[this.field6492.field2306[arg3]];
            }
            Object[] var7 = this.field6513[arg3];
            boolean var8 = true;
            for (int var9 = arg0; var9 < var5; var9++) {
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
                var11 = class1.method6((byte) -85, this.field6490[arg3], true);
                class91 var12 = new class91(var11);
                var12.method623(5, arg2, (byte) 125, var12.field1277.length);
            } else {
                var11 = class1.method6((byte) -85, this.field6490[arg3], false);
            }
            byte[] var13;
            try {
                var13 = class422.method2538(false, var11);
            } catch (RuntimeException var49) {
                throw class229.method1569(var49, "T3 - " + (arg2 != null) + "," + arg3 + "," + var11.length + "," + class353.method2232(var11.length, arg0, var11) + "," + class353.method2232(var11.length - 2, 0, var11) + "," + this.field6492.field2290[arg3] + "," + this.field6492.field2295);
            }
            if (this.field6494) {
                this.field6490[arg3] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field6511 == 0) {
                    var7[var48] = class348.method2217(false, var13, 1);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field6511 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * var32 * 4;
                class91 var34 = new class91(var13);
                int var35 = 0;
                var34.field1292 = var33;
                int var36 = 0;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method626((byte) 100);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg1 == var40) {
                            var36 = var40;
                            var35 += var38;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                int var42 = 0;
                var34.field1292 = var33;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method626((byte) 100);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg1 == var47) {
                            class361.method2281(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class91 var18 = new class91(var13);
                var18.field1292 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method626((byte) 100);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field1292 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method626((byte) 100);
                        class361.method2281(var13, var25, var23[var28], var19[var28], var27);
                        var25 += var27;
                        var19[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field6511 == 0) {
                        var7[var30] = class348.method2217(false, var23[var29], arg0 + 1);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 672)
    public final boolean method2633(byte arg0, String arg1) {
        field6488++;
        if (!this.method2630(arg0 + 132)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != -114) {
            this.method2622(-22);
        }
        int var4 = this.field6492.field2292.method2222((byte) -106, class78.method513(var3, 121));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)Z", line = 695)
    public final boolean method2634(int arg0, int arg1) {
        field6524++;
        if (!this.method2642(true, arg1)) {
            return false;
        } else if (this.field6490[arg1] == null) {
            this.method2653(-1, arg1);
            if (arg0 == -44) {
                return this.field6490[arg1] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V", line = 726)
    public static void method2635(byte arg0) {
        field6530 = null;
        field6532 = null;
        if (arg0 < -94) {
            field6528 = null;
            field6533 = null;
            field6527 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 741)
    public final boolean method2636(int arg0, String arg1) {
        if (arg0 != 21946) {
            return false;
        }
        field6510++;
        if (this.method2630(74)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6492.field2292.method2222((byte) -99, class78.method513(var3, 121));
            return this.method2634(-44, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(II)V", line = 760)
    private final void method2637(int arg0, int arg1) {
        int var3 = 97 % ((arg0 + 86) / 34);
        this.field6501.method1418(arg1, -118);
        field6525++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)[B", line = 776)
    public final byte[] method2638(boolean arg0, int arg1) {
        if (!arg0) {
            this.method2637(24, 58);
        }
        field6493++;
        if (!this.method2630(86)) {
            return null;
        } else if (this.field6492.field2306.length == 1) {
            return this.method2650(arg1, -114, 0);
        } else if (!this.method2642(arg0, arg1)) {
            return null;
        } else if (this.field6492.field2306[arg1] == 1) {
            return this.method2650(0, -29, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)Z", line = 806)
    private final boolean method2639(int arg0, int arg1, int arg2) {
        field6506++;
        if (!this.method2630(arg2 ^ 0xFFFFE7B3)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && this.field6492.field2306.length > arg0 && arg1 < this.field6492.field2306[arg0]) {
            if (arg2 != 6198) {
                this.field6494 = false;
            }
            return true;
        } else if (class475.field6916) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V", line = 836)
    public final void method2640(int arg0) {
        field6508++;
        if (arg0 <= 69) {
            field6530 = null;
        }
        if (this.field6490 != null) {
            for (int var2 = 0; var2 < this.field6490.length; var2++) {
                this.field6490[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(II)[I", line = 860)
    public final int[] method2641(int arg0, int arg1) {
        if (arg1 != 0) {
            field6533 = null;
        }
        field6517++;
        if (!this.method2642(true, arg0)) {
            return null;
        }
        int[] var3 = this.field6492.field2308[arg0];
        if (var3 == null) {
            var3 = new int[this.field6492.field2297[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(ZI)Z", line = 892)
    private final boolean method2642(boolean arg0, int arg1) {
        field6497++;
        if (!this.method2630(27)) {
            return false;
        } else if (!arg0) {
            return true;
        } else if (arg1 >= 0 && arg1 < this.field6492.field2306.length && this.field6492.field2306[arg1] != 0) {
            return true;
        } else if (class475.field6916) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Z", line = 917)
    public final boolean method2643(int arg0) {
        field6505++;
        if (!this.method2630(66)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field6492.field2294.length; var3++) {
            int var4 = this.field6492.field2294[var3];
            if (this.field6490[var4] == null) {
                this.method2653(-1, var4);
                if (this.field6490[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 954)
    public static final void method2644(String arg0, int arg1, Throwable arg2) {
        field6523++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class103.method690(arg2, ~arg1);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class370.method2314(var3, arg1 ^ 0x63);
            String var4 = class356.method2246(var3, "%3a", arg1, ":");
            String var5 = class356.method2246(var4, "%40", -1, "@");
            String var6 = class356.method2246(var5, "%26", -1, "&");
            String var7 = class356.method2246(var6, "%23", -1, "#");
            if (class440.field6549.field6861 != null) {
                class125 var8 = class440.field6549.method2800(0, new URL(class440.field6549.field6861.getCodeBase(), "clienterror.ws?c=" + class339.field5363 + "&u=" + class45.field662 + "&v1=" + class469.field6855 + "&v2=" + class469.field6851 + "&e=" + var7));
                while (var8.field1791 == 0) {
                    class106.method710(1L, (byte) 6);
                }
                if (var8.field1791 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1793;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(II)I", line = 1008)
    public final int method2645(int arg0, int arg1) {
        field6515++;
        if (this.method2642(true, arg1)) {
            if (arg0 != 1) {
                this.method2633((byte) 52, null);
            }
            return this.field6492.field2306[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(ILjava/lang/String;)I", line = 1024)
    public final int method2646(int arg0, String arg1) {
        field6522++;
        if (!this.method2630(102)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 == 0) {
            int var4 = this.field6492.field2292.method2222((byte) -101, class78.method513(var3, 118));
            return this.method2623(104, var4);
        } else {
            return 81;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)Z", line = 1042)
    public final boolean method2647(int arg0, int arg1, int arg2) {
        field6526++;
        if (!this.method2639(arg1, arg2, 6198)) {
            return false;
        } else if (this.field6513[arg1] != null && this.field6513[arg1][arg2] != null) {
            return true;
        } else if (this.field6490[arg1] == null) {
            int var4 = 34 / (arg0 / 39);
            this.method2653(-1, arg1);
            return this.field6490[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(II)V", line = 1071)
    public final void method2648(int arg0, int arg1) {
        if (arg1 != -3987) {
            this.method2621(null, 41);
        }
        field6507++;
        if (this.method2642(true, arg0) && this.field6513 != null) {
            this.field6513[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)I", line = 1090)
    public final int method2649(int arg0) {
        int var2 = -68 / ((-arg0 - 14) / 52);
        field6520++;
        return this.method2630(59) ? this.field6492.field2306.length : -1;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Ltm;ZI)V", line = 1174)
    public class438(class415 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6494 = arg1;
        this.field6511 = arg2;
        this.field6501 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(III)[B", line = 1110)
    public final byte[] method2650(int arg0, int arg1, int arg2) {
        field6514++;
        return arg1 >= -18 ? null : this.method2620(arg2, -6944, null, arg0);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BI)V", line = 1121)
    public static final void method2651(byte arg0, int arg1) {
        if (arg0 < 63) {
            return;
        }
        class480.field7013 = 100;
        field6495++;
        class80.field1072 = -1;
        class13.field207 = arg1;
        class56.field756 = 3;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 1136)
    public final int method2652(String arg0, int arg1) {
        field6496++;
        int var3 = 42 % ((4 - arg1) / 60);
        if (this.method2630(-125)) {
            String var4 = arg0.toLowerCase();
            int var5 = this.field6492.field2292.method2222((byte) -104, class78.method513(var4, 119));
            return this.method2642(true, var5) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(II)V", line = 1157)
    private final void method2653(int arg0, int arg1) {
        field6516++;
        if (this.field6494) {
            this.field6490[arg1] = this.field6501.method1423(true, arg1);
        } else {
            this.field6490[arg1] = class348.method2217(false, this.field6501.method1423(true, arg1), 1);
        }
        if (arg0 != -1) {
            this.method2649(127);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIZ)Lap;", line = 1190)
    public static final class337 method2654(int arg0, int arg1, int arg2, boolean arg3) {
        field6521++;
        class420 var4 = class380.field5802[arg2][arg1][arg0];
        if (var4 == null) {
            return null;
        }
        class337 var5 = null;
        int var6 = -1;
        if (!arg3) {
            field6527 = null;
        }
        for (class115 var7 = var4.field6273; var7 != null; var7 = var7.field1600) {
            class153 var8 = var7.field1594;
            if (var8 instanceof class337) {
                class337 var9 = (class337) var8;
                int var10 = var9.method2091(-15245) * 64 - 4;
                int var11 = var9.field2217 - var10 >> 7;
                int var12 = var9.field2215 - var10 >> 7;
                int var13 = var9.field2217 + var10 >> 7;
                int var14 = var9.field2215 + var10 >> 7;
                if (var11 <= arg1 && var12 <= arg0 && arg1 <= var13 && arg0 <= var14) {
                    int var15 = (var14 + 1 - arg0) * (var13 + 1 - arg1);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }
}
