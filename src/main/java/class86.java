import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class86 {

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lw;")
    private class146 field1261 = null;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "Llj;")
    private class26 field1286;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
    private boolean field1255;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "Z")
    private boolean field1282;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field1254 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "[Ljava/lang/Object;")
    private Object[] field1285;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1250;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "[[[B")
    public static byte[][][] field1277;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)I")
    public final int method617(byte arg0, int arg1) {
        field1252++;
        if (arg0 < 12) {
            return 54;
        } else if (this.method637(arg1, -102)) {
            return this.field1261.field2385[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZIZ)V")
    public final void method618(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != -1) {
            this.method620(false, (String) null);
        }
        field1265++;
        if (!this.method628(arg1 + 2)) {
            return;
        }
        if (arg2) {
            this.field1261.field2402 = null;
            this.field1261.field2394 = null;
        }
        if (arg0) {
            this.field1261.field2388 = null;
            this.field1261.field2400 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method619(int arg0, String arg1) {
        field1276++;
        if (!this.method628(1)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1261.field2394.method1780(class142.method1012((byte) 122, var3), (byte) 52);
        if (arg0 != -1) {
            this.method623((int[]) null, -14, 50);
        }
        return this.method637(var4, -91) ? var4 : -1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method620(boolean arg0, String arg1) {
        if (!arg0) {
            this.method649(false);
        }
        field1246++;
        if (this.method628(1)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1261.field2394.method1780(class142.method1012((byte) 122, var3), (byte) 79);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public static final void method621(int arg0, int arg1) {
        field1264++;
        class180.field2902.method1548(arg1, 0);
        class3.field31.method1548(arg1, 0);
        if (arg0 >= -93) {
            field1251 = 85;
        }
        class20.field216.method1548(arg1, 0);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(ILjava/lang/String;)I")
    public static final int method622(int arg0, String arg1) {
        if (arg0 != 1) {
            method638(-21);
        }
        field1266++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)Z")
    private final boolean method623(int[] arg0, int arg1, int arg2) {
        field1270++;
        if (!this.method637(arg2, -120)) {
            return false;
        } else if (this.field1285[arg2] == null) {
            return false;
        } else {
            int var4 = this.field1261.field2393[arg2];
            int[] var5 = this.field1261.field2397[arg2];
            if (this.field1250[arg2] == null) {
                this.field1250[arg2] = new Object[this.field1261.field2385[arg2]];
            }
            boolean var6 = true;
            Object[] var7 = this.field1250[arg2];
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
            if (arg1 != -1) {
                this.method642(-21);
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = class165.method1219(-22726, false, this.field1285[arg2]);
            } else {
                var10 = class165.method1219(-22726, true, this.field1285[arg2]);
                class152 var11 = new class152(var10);
                var11.method1082(5, arg0, 22225, var11.field2523.length);
            }
            byte[] var12;
            try {
                var12 = class286.method1945(-126, var10);
            } catch (RuntimeException var31) {
                throw class60.method429(var31, "T3 - " + (arg0 != null) + "," + arg2 + "," + var10.length + "," + class254.method1802(var10, 0, var10.length) + "," + class254.method1802(var10, 0, var10.length - 2) + "," + this.field1261.field2401[arg2] + "," + this.field1261.field2381);
            }
            if (this.field1255) {
                this.field1285[arg2] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field1282) {
                    var7[var14] = var12;
                } else {
                    var7[var14] = class62.method442(var12, 107, false);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                class152 var17 = new class152(var12);
                int[] var18 = new int[var4];
                int var19 = var32 - var4 * 4 * var16;
                var17.field2511 = var19;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var17.method1097(127);
                        var18[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var18[var24]];
                    var18[var24] = 0;
                }
                var17.field2511 = var19;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var17.method1097(127);
                        class158.method1177(var12, var25, var23[var28], var18[var28], var27);
                        var18[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field1282) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class62.method442(var23[var29], arg1 - 81, false);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Z")
    public final boolean method624(int arg0, byte arg1) {
        field1278++;
        if (!this.method637(arg0, -93)) {
            return false;
        } else if (this.field1285[arg0] == null) {
            this.method630(arg0, 120);
            int var3 = 57 / ((51 - arg1) / 32);
            return this.field1285[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method625(String arg0, byte arg1) {
        field1284++;
        if (!this.method628(1)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1261.field2394.method1780(class142.method1012((byte) 122, var3), (byte) 85);
        this.method626(false, var4);
        if (arg1 != 29) {
            this.method623((int[]) null, -127, -86);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V")
    private final void method626(boolean arg0, int arg1) {
        if (arg0) {
            field1251 = -74;
        }
        this.field1286.method188(arg1, !arg0);
        field1253++;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IB)V")
    public final void method627(int arg0, byte arg1) {
        field1272++;
        if (this.method637(arg0, -107)) {
            int var3 = -80 % ((arg1 - 30) / 53);
            if (this.field1250 != null) {
                this.field1250[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
    private final boolean method628(int arg0) {
        field1248++;
        if (arg0 != 1) {
            this.method649(true);
        }
        if (this.field1261 == null) {
            this.field1261 = this.field1286.method189((byte) -112);
            if (this.field1261 == null) {
                return false;
            }
            this.field1285 = new Object[this.field1261.field2396];
            this.field1250 = new Object[this.field1261.field2396][];
        }
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
    public final boolean method629(int arg0) {
        field1273++;
        if (!this.method628(1)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1261.field2399.length; var3++) {
            int var4 = this.field1261.field2399[var3];
            if (this.field1285[var4] == null) {
                this.method630(var4, 106);
                if (this.field1285[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 != -1) {
            this.field1286 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
    private final void method630(int arg0, int arg1) {
        if (this.field1255) {
            this.field1285[arg0] = this.field1286.method186(arg0, -99);
        } else {
            this.field1285[arg0] = class62.method442(this.field1286.method186(arg0, -74), 84, false);
        }
        field1258++;
        if (arg1 <= 96) {
            this.field1282 = true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)I")
    public final int method631(int arg0) {
        if (arg0 >= -101) {
            return -39;
        } else {
            field1247++;
            return this.method628(1) ? this.field1261.field2385.length : -1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBLlc;IZ)V")
    public static final void method632(int arg0, int arg1, byte arg2, class86 arg3, int arg4, boolean arg5) {
        class145.field2379 = 1;
        class27.field312 = arg4;
        class141.field2280 = arg0;
        field1269++;
        class225.field3618 = arg3;
        if (arg2 >= -108) {
            method638(122);
        }
        class242.field3869 = arg5;
        class266.field4302 = arg1;
        class191.field3086 = 10000;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([IBII)[B")
    public final byte[] method633(int[] arg0, byte arg1, int arg2, int arg3) {
        field1280++;
        if (!this.method639((byte) -78, arg2, arg3)) {
            return null;
        }
        if (this.field1250[arg3] == null || this.field1250[arg3][arg2] == null) {
            boolean var5 = this.method623(arg0, -1, arg3);
            if (!var5) {
                this.method630(arg3, 119);
                boolean var6 = this.method623(arg0, arg1 + 17, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class165.method1219(-22726, false, this.field1250[arg3][arg2]);
        if (arg1 != -18) {
            field1254 = -32;
        }
        if (this.field1282) {
            this.field1250[arg3][arg2] = null;
            if (this.field1261.field2385[arg3] == 1) {
                this.field1250[arg3] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)Z")
    public final boolean method634(int arg0, int arg1) {
        field1287++;
        if (!this.method628(1)) {
            return false;
        } else if (this.field1261.field2385.length == 1) {
            return this.method650(arg0, 0, -84);
        } else if (!this.method637(arg0, -114)) {
            return false;
        } else if (this.field1261.field2385[arg0] == 1) {
            return this.method650(0, arg0, -108);
        } else if (arg1 == 0) {
            throw new RuntimeException();
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)I")
    public final int method635(int arg0) {
        field1257++;
        if (!this.method628(arg0 ^ 0x1)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field1285.length; var4++) {
            if (this.field1261.field2393[var4] > 0) {
                var3 += this.method636(var4, 10300);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)I")
    private final int method636(int arg0, int arg1) {
        if (arg1 != 10300) {
            field1277 = null;
        }
        field1283++;
        if (this.method637(arg0, arg1 - 10410)) {
            return this.field1285[arg0] == null ? this.field1286.method185(arg1 - 10301, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(II)Z")
    private final boolean method637(int arg0, int arg1) {
        field1281++;
        if (!this.method628(1)) {
            return false;
        } else if (arg0 >= 0 && this.field1261.field2385.length > arg0 && this.field1261.field2385[arg0] != 0) {
            if (arg1 > -89) {
                this.field1286 = null;
            }
            return true;
        } else if (class184.field2965) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
    public static void method638(int arg0) {
        if (arg0 != 2) {
            field1251 = 62;
        }
        field1277 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BII)Z")
    private final boolean method639(byte arg0, int arg1, int arg2) {
        if (arg0 > -45) {
            field1277 = null;
        }
        field1275++;
        if (!this.method628(1)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && arg2 < this.field1261.field2385.length && this.field1261.field2385[arg2] > arg1) {
            return true;
        } else if (class184.field2965) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method640(boolean arg0, String arg1, String arg2) {
        field1256++;
        if (!this.method628(1)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1261.field2394.method1780(class142.method1012((byte) 122, var4), (byte) 77);
        if (arg0) {
            this.method646((String) null, (byte) -24);
        }
        if (this.method637(var6, -108)) {
            int var7 = this.field1261.field2388[var6].method1780(class142.method1012((byte) 122, var5), (byte) 102);
            return this.method650(var7, var6, -93);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(II)[I")
    public final int[] method641(int arg0, int arg1) {
        field1274++;
        if (!this.method637(arg1, -128)) {
            return null;
        }
        if (arg0 != 0) {
            this.field1255 = true;
        }
        int[] var3 = this.field1261.field2397[arg1];
        if (var3 == null) {
            var3 = new int[this.field1261.field2393[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)I")
    public final int method642(int arg0) {
        field1279++;
        int var2 = -43 % ((-arg0 - 45) / 36);
        if (!this.method628(1)) {
            throw new IllegalStateException("");
        }
        return this.field1261.field2381;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZ)[B")
    public final byte[] method643(int arg0, int arg1, boolean arg2) {
        field1262++;
        return arg2 ? null : this.method633((int[]) null, (byte) -18, arg0, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method644(String arg0, String arg1, int arg2) {
        field1267++;
        if (!this.method628(1)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field1261.field2394.method1780(class142.method1012((byte) 122, var4), (byte) 67);
        if (arg2 != -30279) {
            this.method635(45);
        }
        if (this.method637(var6, -115)) {
            int var7 = this.field1261.field2388[var6].method1780(class142.method1012((byte) 122, var5), (byte) 118);
            return this.method643(var7, var6, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(II)[B")
    public final byte[] method645(int arg0, int arg1) {
        field1268++;
        int var3 = 30 % ((arg0 - 31) / 51);
        if (!this.method628(1)) {
            return null;
        } else if (this.field1261.field2385.length == 1) {
            return this.method643(arg1, 0, false);
        } else if (!this.method637(arg1, -126)) {
            return null;
        } else if (this.field1261.field2385[arg1] == 1) {
            return this.method643(0, arg1, false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Ljava/lang/String;B)I")
    public final int method646(String arg0, byte arg1) {
        field1271++;
        if (!this.method628(1)) {
            return 0;
        } else if (arg1 >= -95) {
            return -85;
        } else {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1261.field2394.method1780(class142.method1012((byte) 122, var3), (byte) 45);
            return this.method636(var4, 10300);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method647(int arg0, String arg1) {
        field1249++;
        if (this.method628(1)) {
            int var3 = -52 / ((arg0 + 28) / 53);
            String var4 = arg1.toLowerCase();
            int var5 = this.field1261.field2394.method1780(class142.method1012((byte) 122, var4), (byte) 63);
            return this.method624(var5, (byte) 86);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(BII)[B")
    public final byte[] method648(byte arg0, int arg1, int arg2) {
        field1260++;
        if (!this.method639((byte) -104, arg1, arg2)) {
            return null;
        }
        int var4 = -33 % ((-arg0 - 43) / 41);
        if (this.field1250[arg2] == null || this.field1250[arg2][arg1] == null) {
            boolean var5 = this.method623((int[]) null, -1, arg2);
            if (!var5) {
                this.method630(arg2, 116);
                boolean var6 = this.method623((int[]) null, -1, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        return class165.method1219(-22726, false, this.field1250[arg2][arg1]);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public final void method649(boolean arg0) {
        if (arg0) {
            field1251 = 126;
        }
        if (this.field1250 != null) {
            for (int var2 = 0; var2 < this.field1250.length; var2++) {
                this.field1250[var2] = null;
            }
        }
        field1263++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
    public final boolean method650(int arg0, int arg1, int arg2) {
        field1259++;
        if (!this.method639((byte) -126, arg0, arg1)) {
            return false;
        } else if (this.field1250[arg1] == null || this.field1250[arg1][arg0] == null) {
            if (arg2 >= -66) {
                this.field1285 = null;
            }
            if (this.field1285[arg1] == null) {
                this.method630(arg1, 99);
                return this.field1285[arg1] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Llj;ZZ)V")
    public class86(class26 arg0, boolean arg1, boolean arg2) {
        this.field1286 = arg0;
        this.field1255 = arg1;
        this.field1282 = arg2;
    }
}
