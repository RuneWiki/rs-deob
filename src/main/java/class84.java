import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class84 {

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "Llb;")
    private class378 field1396 = null;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lhq;")
    private class108 field1367;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Z")
    private boolean field1375;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "Lnn;")
    public static class285 field1404 = class513.method3042(-1);

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "F")
    public static float field1376;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Lig;")
    public static class160 field1407;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "[Ljava/lang/Object;")
    private Object[] field1392;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1403;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)I")
    public final int method656(byte arg0, int arg1) {
        if (arg0 != 122) {
            field1404 = null;
        }
        field1393++;
        return this.method667(arg1, -1) ? this.field1396.field5638[arg1] : 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method657(byte arg0, String arg1) {
        field1400++;
        if (arg0 <= 68) {
            field1404 = null;
        }
        if (this.method669(123)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1396.field5629.method128(13287, class403.method2506(var3, 50));
            return this.method678(var4, 106);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I")
    public final int method658(byte arg0) {
        field1374++;
        if (this.method669(123)) {
            int var2 = -63 % ((arg0 + 18) / 63);
            return this.field1396.field5638.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
    public final int method659(int arg0) {
        field1387++;
        if (!this.method669(126)) {
            throw new IllegalStateException("");
        }
        if (arg0 != -24256) {
            this.method683(23, -31, 52);
        }
        return this.field1396.field5637;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZI)V")
    public final void method660(boolean arg0, boolean arg1, int arg2) {
        field1383++;
        if (!this.method669(arg2 ^ 0x7C)) {
            return;
        }
        if (arg1) {
            this.field1396.field5630 = null;
            this.field1396.field5641 = null;
        }
        if (arg0) {
            this.field1396.field5629 = null;
            this.field1396.field5633 = null;
        }
        if (arg2 != 0) {
            this.method674(-48, null, null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method661(int arg0) {
        field1407 = null;
        field1404 = null;
        if (arg0 != 5) {
            field1376 = -0.7326169F;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
    private final void method662(int arg0, int arg1) {
        if (arg0 > -115) {
            this.method686((byte) -93, null);
        }
        this.field1367.method306((byte) 123, arg1);
        field1384++;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public final void method663(int arg0) {
        if (this.field1403 != null) {
            for (int var2 = 0; var2 < this.field1403.length; var2++) {
                this.field1403[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.method674(-41, null, null);
        }
        field1381++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z")
    private final boolean method664(int arg0, int arg1, int arg2) {
        field1380++;
        if (arg1 != 0) {
            return true;
        } else if (!this.method669(126)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field1396.field5638.length > arg2 && this.field1396.field5638[arg2] > arg0) {
            return true;
        } else if (class237.field3434) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public final boolean method665(String arg0, byte arg1, String arg2) {
        field1401++;
        if (!this.method669(124)) {
            return false;
        }
        int var4 = 92 / ((-arg1 - 3) / 49);
        String var5 = arg2.toLowerCase();
        String var6 = arg0.toLowerCase();
        int var7 = this.field1396.field5629.method128(13287, class403.method2506(var5, 50));
        if (this.method667(var7, -1)) {
            int var8 = this.field1396.field5641[var7].method128(13287, class403.method2506(var6, 50));
            return this.method688((byte) 78, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)I")
    public final int method666(byte arg0) {
        field1397++;
        if (!this.method669(121)) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != 19) {
            this.field1375 = true;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1392.length; var4++) {
            if (this.field1396.field5634[var4] > 0) {
                var3 += this.method678(var4, 111);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Z")
    private final boolean method667(int arg0, int arg1) {
        field1389++;
        if (!this.method669(119)) {
            return false;
        } else if (arg1 >= ~arg0 && arg0 < this.field1396.field5638.length && this.field1396.field5638[arg0] != 0) {
            return true;
        } else if (class237.field3434) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method668(String arg0, int arg1) {
        field1391++;
        if (!this.method669(arg1 - 16630)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1396.field5629.method128(13287, class403.method2506(var3, 50));
        if (arg1 != 16751) {
            this.method683(2, 109, -72);
        }
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)Z")
    private final boolean method669(int arg0) {
        if (arg0 < 117) {
            this.method672(36);
        }
        field1405++;
        if (this.field1396 == null) {
            this.field1396 = this.field1367.method313(1246180808);
            if (this.field1396 == null) {
                return false;
            }
            this.field1403 = new Object[this.field1396.field5639][];
            this.field1392 = new Object[this.field1396.field5639];
        }
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)V")
    public final void method670(int arg0, int arg1) {
        field1382++;
        if (!this.method667(arg0, -1)) {
            return;
        }
        if (arg1 != 0) {
            this.field1367 = null;
        }
        if (this.field1403 != null) {
            this.field1403[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(II)V")
    private final void method671(int arg0, int arg1) {
        int var3 = -102 / ((arg1 - 39) / 58);
        field1385++;
        if (this.field1375) {
            this.field1392[arg0] = this.field1367.method316(arg0, (byte) -93);
        } else {
            this.field1392[arg0] = class412.method2545(-125, this.field1367.method316(arg0, (byte) -90), false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
    public final void method672(int arg0) {
        field1399++;
        if (arg0 == 4162 && this.field1392 != null) {
            for (int var2 = 0; var2 < this.field1392.length; var2++) {
                this.field1392[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(II)Z")
    public final boolean method673(int arg0, int arg1) {
        field1379++;
        if (!this.method667(arg1, arg0)) {
            return false;
        } else if (this.field1392[arg1] == null) {
            this.method671(arg1, 108);
            return this.field1392[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method674(int arg0, String arg1, String arg2) {
        field1377++;
        if (!this.method669(arg0 ^ 0xFFFFFF86)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        if (arg0 != -2) {
            return null;
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field1396.field5629.method128(13287, class403.method2506(var4, 50));
        if (this.method667(var6, -1)) {
            int var7 = this.field1396.field5641[var6].method128(arg0 + 13289, class403.method2506(var5, 50));
            return this.method683(var6, var7, 5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(BI)[I")
    public final int[] method675(byte arg0, int arg1) {
        field1369++;
        if (!this.method667(arg1, arg0 ^ 0xFFFFFFBC)) {
            return null;
        }
        if (arg0 != 67) {
            this.field1392 = null;
        }
        int[] var3 = this.field1396.field5628[arg1];
        if (var3 == null) {
            var3 = new int[this.field1396.field5634[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method676(String arg0, boolean arg1) {
        field1406++;
        if (!this.method669(118)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1) {
            this.method670(35, 94);
        }
        int var4 = this.field1396.field5629.method128(13287, class403.method2506(var3, 50));
        return this.method673(-1, var4);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method677(int arg0, String arg1) {
        field1371++;
        if (this.method669(118)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1396.field5629.method128(13287, class403.method2506(var3, 50));
            return this.method667(var4, arg0) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(II)I")
    private final int method678(int arg0, int arg1) {
        field1372++;
        if (!this.method667(arg0, -1)) {
            return 0;
        } else if (this.field1392[arg0] == null) {
            int var3 = -97 / ((64 - arg1) / 37);
            return this.field1367.method310(-21601, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II[II)[B")
    public final byte[] method679(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 < 83) {
            this.field1375 = false;
        }
        field1378++;
        if (!this.method664(arg0, 0, arg3)) {
            return null;
        }
        if (this.field1403[arg3] == null || this.field1403[arg3][arg0] == null) {
            boolean var5 = this.method685(arg0, true, arg3, arg2);
            if (!var5) {
                this.method671(arg3, 125);
                boolean var6 = this.method685(arg0, true, arg3, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class473.method2834(22819, this.field1403[arg3][arg0], false);
        if (this.field1398 == 1) {
            this.field1403[arg3][arg0] = null;
            if (this.field1396.field5638[arg3] == 1) {
                this.field1403[arg3] = null;
            }
        } else if (this.field1398 == 2) {
            this.field1403[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)[B")
    public final byte[] method680(boolean arg0, int arg1) {
        field1394++;
        if (!this.method669(122)) {
            return null;
        } else if (this.field1396.field5638.length == 1) {
            return this.method683(0, arg1, 5);
        } else if (this.method667(arg1, -1)) {
            if (!arg0) {
                this.field1396 = null;
            }
            if (this.field1396.field5638[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method683(arg1, 0, 5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(II)I")
    public final int method681(int arg0, int arg1) {
        field1390++;
        int var3 = 71 % ((arg0 - 19) / 35);
        if (this.method669(122)) {
            int var4 = this.field1396.field5629.method128(13287, arg1);
            return this.method667(var4, -1) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(II)Z")
    public final boolean method682(int arg0, int arg1) {
        field1395++;
        if (!this.method669(arg0 ^ 0x78)) {
            return false;
        } else if (this.field1396.field5638.length == 1) {
            return this.method688((byte) 78, 0, arg1);
        } else if (!this.method667(arg1, -1)) {
            return false;
        } else if (this.field1396.field5638[arg1] == 1) {
            return this.method688((byte) 78, arg1, 0);
        } else if (arg0 == 0) {
            throw new RuntimeException();
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)[B")
    public final byte[] method683(int arg0, int arg1, int arg2) {
        field1373++;
        return arg2 == 5 ? this.method679(arg1, 125, null, arg0) : null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII[FFIF)V")
    public static final void method684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, float arg8, int arg9, float arg10) {
        int var11 = arg6 - arg4;
        int var12 = arg2 - arg0;
        int var13 = arg9 - arg3;
        field1370++;
        float var14 = arg7[2] * (float) var12 + arg7[0] * (float) var13 + arg7[1] * (float) var11;
        float var15 = arg7[5] * (float) var12 + arg7[4] * (float) var11 + arg7[3] * (float) var13;
        float var16 = arg7[8] * (float) var12 + arg7[6] * (float) var13 + arg7[7] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg10 != 1.0F) {
            var17 = arg10 * var17;
        }
        float var18 = var15 + arg8 + 0.5F;
        if (arg1 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg1 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg1 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class96.field1567 = var18;
        class66.field1154 = var17;
        if (arg5 != -13106) {
            method661(-48);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZI[I)Z")
    private final boolean method685(int arg0, boolean arg1, int arg2, int[] arg3) {
        field1388++;
        if (!this.method667(arg2, -1)) {
            return false;
        } else if (this.field1392[arg2] == null) {
            return false;
        } else {
            int var5 = this.field1396.field5634[arg2];
            int[] var6 = this.field1396.field5628[arg2];
            if (this.field1403[arg2] == null) {
                this.field1403[arg2] = new Object[this.field1396.field5638[arg2]];
            }
            Object[] var7 = this.field1403[arg2];
            boolean var8 = arg1;
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
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class473.method2834(22819, this.field1392[arg2], false);
            } else {
                var11 = class473.method2834(22819, this.field1392[arg2], true);
                class303 var12 = new class303(var11);
                var12.method1880(var12.field4326.length, 5, arg3, (byte) 59);
            }
            byte[] var13;
            try {
                var13 = class401.method2494(30, var11);
            } catch (RuntimeException var49) {
                throw class365.method2352(var49, "T3 - " + (arg3 != null) + "," + arg2 + "," + var11.length + "," + class430.method2616(var11, (byte) -66, var11.length) + "," + class430.method2616(var11, (byte) -66, var11.length - 2) + "," + this.field1396.field5645[arg2] + "," + this.field1396.field5637);
            }
            if (this.field1375) {
                this.field1392[arg2] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field1398 == 0) {
                    var7[var15] = class412.method2545(-128, var13, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field1398 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class303 var19 = new class303(var13);
                int var20 = 0;
                int var21 = 0;
                var19.field4333 = var18;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method1870(-1945262512);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg0 == var25) {
                            var20 += var23;
                            var21 = var25;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field4333 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method1870(-1945262512);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg0 == var32) {
                            class486.method2905(var13, var28, var26, var27, var30);
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
                class303 var36 = new class303(var13);
                var36.field4333 = var35;
                int[] var37 = new int[var5];
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method1870(-1945262512);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field4333 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method1870(-1945262512);
                        class486.method2905(var13, var43, var41[var46], var37[var46], var45);
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
                    if (this.field1398 == 0) {
                        var7[var48] = class412.method2545(-125, var41[var47], false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lhq;ZI)V")
    public class84(class108 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1367 = arg0;
        this.field1375 = arg1;
        this.field1398 = arg2;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(BLjava/lang/String;)V")
    public final void method686(byte arg0, String arg1) {
        field1386++;
        if (!this.method669(119)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1396.field5629.method128(13287, class403.method2506(var3, 50));
        this.method662(-119, var4);
        if (arg0 <= 38) {
            this.method683(55, -128, -89);
        }
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)Z")
    public final boolean method687(int arg0) {
        field1368++;
        if (!this.method669(119)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1396.field5640.length; var3++) {
            int var4 = this.field1396.field5640[var3];
            if (this.field1392[var4] == null) {
                this.method671(var4, -91);
                if (this.field1392[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BII)Z")
    public final boolean method688(byte arg0, int arg1, int arg2) {
        field1402++;
        if (arg0 != 78) {
            return true;
        } else if (!this.method664(arg2, 0, arg1)) {
            return false;
        } else if (this.field1403[arg1] != null && this.field1403[arg1][arg2] != null) {
            return true;
        } else if (this.field1392[arg1] == null) {
            this.method671(arg1, 105);
            return this.field1392[arg1] != null;
        } else {
            return true;
        }
    }
}
