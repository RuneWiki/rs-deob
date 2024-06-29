import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class134 {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Lrb;")
    private class199 field2214 = null;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Lwf;")
    private class50 field2225;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "Z")
    private boolean field2244;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Z")
    private boolean field2211;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "Loe;")
    public static class114 field2245 = new class114();

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "[I")
    public static int[] field2250 = new int[32768];

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2253 = "flash1:";

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[Ljava/lang/Object;")
    private Object[] field2213;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2210;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "[[[B")
    public static byte[][][] field2251;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
    public final int method914(int arg0) {
        field2238++;
        if (!this.method918((byte) 21)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2213.length; var4++) {
            if (this.field2214.field3203[var4] > 0) {
                var3 += this.method942(var4, (byte) -33);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            int var5 = 118 % ((arg0 - 59) / 40);
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
    private final void method915(int arg0, byte arg1) {
        int var3 = 48 / ((arg1 + 81) / 44);
        field2224++;
        this.field2225.method396(arg0, -104);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Z")
    public final boolean method916(int arg0, int arg1) {
        if (arg1 != 3408) {
            this.method921((String) null, (byte) 82);
        }
        field2239++;
        if (!this.method941(arg0, arg1 + 29360)) {
            return false;
        } else if (this.field2213[arg0] == null) {
            this.method926(arg0, (byte) -93);
            return this.field2213[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)I")
    public final int method917(byte arg0) {
        field2235++;
        if (arg0 <= 114) {
            this.field2244 = false;
        }
        if (!this.method918((byte) 110)) {
            throw new IllegalStateException("");
        }
        return this.field2214.field3215;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)Z")
    private final boolean method918(byte arg0) {
        field2222++;
        if (this.field2214 == null) {
            this.field2214 = this.field2225.method394(68);
            if (this.field2214 == null) {
                return false;
            }
            this.field2213 = new Object[this.field2214.field3201];
            this.field2210 = new Object[this.field2214.field3201][];
        }
        int var2 = -111 % ((73 - arg0) / 37);
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)[I")
    public final int[] method919(int arg0, int arg1) {
        if (arg0 >= -113) {
            this.field2244 = false;
        }
        field2227++;
        if (!this.method941(arg1, 32768)) {
            return null;
        }
        int[] var3 = this.field2214.field3213[arg1];
        if (var3 == null) {
            var3 = new int[this.field2214.field3203[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static final void method920(int arg0) {
        field2232++;
        if (class25.field309) {
            return;
        }
        if (arg0 != -13992) {
            method943(-107, 91);
        }
        class196.field3163 = true;
        if (class107.field1867) {
            class121.field2039 = (float) ((int) class121.field2039 + 191 & 0xFFFFFF80);
        } else {
            class120.field2027 += (24.0F - class120.field2027) / 2.0F;
        }
        class25.field309 = true;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method921(String arg0, byte arg1) {
        field2243++;
        if (!this.method918((byte) 114)) {
            return false;
        }
        if (arg1 <= 99) {
            this.method917((byte) -43);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field2214.field3216.method998(30715, class171.method1193(var3, true));
        return this.method916(var4, 3408);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
    public static final void method922(boolean arg0) {
        if (!arg0) {
            field2253 = null;
        }
        class44 var1 = (class44) class144.field2328.method365(3);
        field2217++;
        while (var1 != null) {
            if (var1.field523 > 0) {
                var1.field523--;
            }
            if (var1.field523 != 0) {
                if (var1.field516 > 0) {
                    var1.field516--;
                }
                if (var1.field516 == 0 && var1.field512 >= 1 && var1.field511 >= 1 && var1.field512 <= 102 && var1.field511 <= 102 && (var1.field527 < 0 || class275.method1855(var1.field527, 4, var1.field519))) {
                    class244.method1603(var1.field527, var1.field511, var1.field520, var1.field512, var1.field519, -121, var1.field517, var1.field529);
                    var1.field516 = -1;
                    if (var1.field530 == var1.field527 && var1.field530 == -1) {
                        var1.method544(-122);
                    } else if (var1.field530 == var1.field527 && var1.field532 == var1.field529 && var1.field519 == var1.field513) {
                        var1.method544(92);
                    }
                }
            } else if (var1.field530 < 0 || class275.method1855(var1.field530, 4, var1.field513)) {
                class244.method1603(var1.field530, var1.field511, var1.field520, var1.field512, var1.field513, -115, var1.field517, var1.field532);
                var1.method544(118);
            }
            var1 = (class44) class144.field2328.method372((byte) 7);
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public static void method923(int arg0) {
        field2250 = null;
        field2245 = null;
        if (arg0 != -7186) {
            field2251 = null;
        }
        field2251 = null;
        field2253 = null;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)I")
    public final int method924(int arg0) {
        field2246++;
        if (this.method918((byte) 111)) {
            if (arg0 <= 121) {
                field2251 = null;
            }
            return this.field2214.field3196.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    public final void method925(int arg0) {
        field2229++;
        if (arg0 != -5528) {
            this.method948((byte) 101, 77);
        }
        if (this.field2210 != null) {
            for (int var2 = 0; var2 < this.field2210.length; var2++) {
                this.field2210[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)V")
    private final void method926(int arg0, byte arg1) {
        if (this.field2244) {
            this.field2213[arg0] = this.field2225.method392(class223.method1477(arg1, -93), arg0);
        } else {
            this.field2213[arg0] = class200.method1348(109, this.field2225.method392(0, arg0), false);
        }
        if (arg1 == -93) {
            field2215++;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method927(byte arg0, String arg1) {
        field2242++;
        if (!this.method918((byte) -127)) {
            return false;
        }
        if (arg0 <= 113) {
            field2245 = null;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2214.field3216.method998(30715, class171.method1193(var3, true));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z")
    private final boolean method928(int arg0, int arg1, int arg2) {
        field2249++;
        if (!this.method918((byte) 118)) {
            return false;
        } else if (~arg0 <= arg2 && arg1 >= 0 && arg0 < this.field2214.field3196.length && arg1 < this.field2214.field3196[arg0]) {
            return true;
        } else if (class120.field2018) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IBII)[B")
    public final byte[] method929(int[] arg0, byte arg1, int arg2, int arg3) {
        field2218++;
        if (!this.method928(arg3, arg2, -1)) {
            return null;
        }
        if (this.field2210[arg3] == null || this.field2210[arg3][arg2] == null) {
            boolean var5 = this.method931(arg3, (byte) -6, arg0);
            if (!var5) {
                this.method926(arg3, (byte) -93);
                boolean var6 = this.method931(arg3, (byte) -6, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 >= -119) {
            this.method927((byte) 115, (String) null);
        }
        byte[] var7 = class268.method1818(this.field2210[arg3][arg2], false, false);
        if (this.field2211) {
            this.field2210[arg3][arg2] = null;
            if (this.field2214.field3196[arg3] == 1) {
                this.field2210[arg3] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method930(String arg0, String arg1, int arg2) {
        field2233++;
        if (!this.method918((byte) 113)) {
            return false;
        }
        if (arg2 >= -89) {
            field2245 = null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field2214.field3216.method998(30715, class171.method1193(var4, true));
        if (this.method941(var6, 32768)) {
            int var7 = this.field2214.field3206[var6].method998(30715, class171.method1193(var5, true));
            return this.method934(var7, (byte) -103, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB[I)Z")
    private final boolean method931(int arg0, byte arg1, int[] arg2) {
        field2209++;
        if (!this.method941(arg0, arg1 + 32774)) {
            return false;
        } else if (this.field2213[arg0] == null) {
            return false;
        } else {
            int var4 = this.field2214.field3203[arg0];
            int[] var5 = this.field2214.field3213[arg0];
            boolean var6 = true;
            if (this.field2210[arg0] == null) {
                this.field2210[arg0] = new Object[this.field2214.field3196[arg0]];
            }
            Object[] var7 = this.field2210[arg0];
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
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var10 = class268.method1818(this.field2213[arg0], false, true);
                class264 var11 = new class264(var10);
                var11.method1755(var11.field4198.length, 5, 0, arg2);
            } else {
                var10 = class268.method1818(this.field2213[arg0], false, false);
            }
            byte[] var12;
            try {
                if (arg1 != -6) {
                    this.field2213 = null;
                }
                var12 = class98.method698(-34, var10);
            } catch (RuntimeException var31) {
                throw class264.method1759(var31, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + class41.method320(true, var10.length, var10) + "," + class41.method320(true, var10.length - 2, var10) + "," + this.field2214.field3208[arg0] + "," + this.field2214.field3215);
            }
            if (this.field2244) {
                this.field2213[arg0] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field2211) {
                    var7[var14] = var12;
                } else {
                    var7[var14] = class200.method1348(-15, var12, false);
                }
            } else {
                int[] var15 = new int[var4];
                int var16 = var12.length;
                int var32 = var16 - 1;
                int var17 = var12[var32] & 0xFF;
                int var18 = var32 - var4 * var17 * 4;
                class264 var19 = new class264(var12);
                var19.field4195 = var18;
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var19.method1765((byte) 113);
                        var15[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var15[var24]];
                    var15[var24] = 0;
                }
                var19.field4195 = var18;
                int var25 = 0;
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var19.method1765((byte) 100);
                        class56.method432(var12, var25, var23[var28], var15[var28], var27);
                        var25 += var27;
                        var15[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field2211) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class200.method1348(110, var23[var29], false);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)[B")
    public final byte[] method932(int arg0, int arg1, int arg2) {
        field2236++;
        if (!this.method928(arg2, arg0, arg1 ^ 0xFFFFFFFE)) {
            return null;
        }
        if (this.field2210[arg2] == null || this.field2210[arg2][arg0] == null) {
            boolean var4 = this.method931(arg2, (byte) -6, (int[]) null);
            if (!var4) {
                this.method926(arg2, (byte) -93);
                boolean var5 = this.method931(arg2, (byte) -6, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class268.method1818(this.field2210[arg2][arg0], false, false);
        if (arg1 != 1) {
            this.method916(124, -123);
        }
        return var6;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method933(String arg0, String arg1, int arg2) {
        field2241++;
        if (!this.method918((byte) 123)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field2214.field3216.method998(30715, class171.method1193(var4, true));
        if (!this.method941(var6, 32768)) {
            return null;
        } else if (arg2 >= -12) {
            return null;
        } else {
            int var7 = this.field2214.field3206[var6].method998(30715, class171.method1193(var5, true));
            return this.method940((byte) 87, var7, var6);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)Z")
    public final boolean method934(int arg0, byte arg1, int arg2) {
        field2237++;
        if (!this.method928(arg2, arg0, -1)) {
            return false;
        } else if (this.field2210[arg2] == null || this.field2210[arg2][arg0] == null) {
            int var4 = -75 / ((34 - arg1) / 33);
            if (this.field2213[arg2] == null) {
                this.method926(arg2, (byte) -93);
                return this.field2213[arg2] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Z")
    public final boolean method935(byte arg0, int arg1) {
        field2212++;
        if (!this.method918((byte) 117)) {
            return false;
        } else if (this.field2214.field3196.length == 1) {
            return this.method934(arg1, (byte) -8, 0);
        } else if (!this.method941(arg1, 32768)) {
            return false;
        } else if (this.field2214.field3196[arg1] == 1) {
            return this.method934(0, (byte) -37, arg1);
        } else if (arg0 == 31) {
            throw new RuntimeException();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method936(int arg0, String arg1) {
        if (arg0 != 0) {
            return;
        }
        field2230++;
        if (this.method918((byte) -96)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2214.field3216.method998(arg0 + 30715, class171.method1193(var3, true));
            this.method915(var4, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)Z")
    public final boolean method937(int arg0) {
        field2247++;
        if (!this.method918((byte) -47)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2214.field3197.length; var3++) {
            int var4 = this.field2214.field3197[var3];
            if (this.field2213[var4] == null) {
                this.method926(var4, (byte) -93);
                if (this.field2213[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)V")
    public final void method938(int arg0, int arg1) {
        field2221++;
        if (arg0 != -3015) {
            this.method939(false, -30);
        }
        if (this.method941(arg1, 32768) && this.field2210 != null) {
            this.field2210[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)[B")
    public final byte[] method939(boolean arg0, int arg1) {
        field2240++;
        if (!this.method918((byte) -41)) {
            return null;
        } else if (this.field2214.field3196.length == 1) {
            return this.method940((byte) 87, arg1, 0);
        } else if (!this.method941(arg1, 32768)) {
            return null;
        } else if (this.field2214.field3196[arg1] == 1) {
            return this.method940((byte) 82, 0, arg1);
        } else {
            if (!arg0) {
                this.method927((byte) -8, (String) null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BII)[B")
    public final byte[] method940(byte arg0, int arg1, int arg2) {
        field2234++;
        if (arg0 <= 28) {
            this.method947(-25, (String) null);
        }
        return this.method929((int[]) null, (byte) -124, arg1, arg2);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)Z")
    private final boolean method941(int arg0, int arg1) {
        field2216++;
        if (arg1 != 32768) {
            field2245 = null;
        }
        if (!this.method918((byte) -14)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field2214.field3196.length && this.field2214.field3196[arg0] != 0) {
            return true;
        } else if (class120.field2018) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(IB)I")
    private final int method942(int arg0, byte arg1) {
        field2231++;
        if (this.method941(arg0, 32768)) {
            int var3 = -92 / ((28 - arg1) / 37);
            return this.field2213[arg0] == null ? this.field2225.method391(20354, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)V")
    public static final void method943(int arg0, int arg1) {
        class12.field166.method1832(arg1, (byte) -127);
        field2219++;
        class147.field2366.method1832(arg1, (byte) -127);
        if (arg0 < 120) {
            method923(57);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZ)V")
    public static final void method944(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field2253 = null;
        }
        for (int var5 = 0; var5 < class154.field2482; var5++) {
            if (class186.field2989[var5] + class85.field1153[var5] > arg3 && class186.field2989[var5] < arg2 + arg3 && (class236.field3767[var5] + class233.field3710[var5]) > arg1 && class236.field3767[var5] < arg0 + arg1) {
                class272.field4396[var5] = true;
            }
        }
        field2223++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZI)V")
    public final void method945(boolean arg0, boolean arg1, int arg2) {
        field2248++;
        int var4 = 60 % ((arg2 + 30) / 35);
        if (!this.method918((byte) 117)) {
            return;
        }
        if (arg1) {
            this.field2214.field3216 = null;
            this.field2214.field3200 = null;
        }
        if (arg0) {
            this.field2214.field3211 = null;
            this.field2214.field3206 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method946(String arg0, int arg1) {
        if (arg1 != 0) {
            field2252 = 47;
        }
        field2228++;
        if (this.method918((byte) 5)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field2214.field3216.method998(30715, class171.method1193(var3, true));
            return this.method942(var4, (byte) 110);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method947(int arg0, String arg1) {
        if (arg0 != -24925) {
            return 46;
        }
        field2220++;
        if (this.method918((byte) 28)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2214.field3216.method998(30715, class171.method1193(var3, true));
            return this.method941(var4, 32768) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(BI)I")
    public final int method948(byte arg0, int arg1) {
        if (arg0 == -97) {
            field2226++;
            return this.method941(arg1, 32768) ? this.field2214.field3196[arg1] : 0;
        } else {
            return 61;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lwf;ZZ)V")
    public class134(class50 arg0, boolean arg1, boolean arg2) {
        this.field2225 = arg0;
        this.field2244 = arg1;
        this.field2211 = arg2;
    }
}
