import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class361 {

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "Lwv;")
    private class26 field4911 = null;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "Lhr;")
    private class367 field4924;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
    private boolean field4896;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "F")
    public static float field4905;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "[Ljava/lang/Object;")
    private Object[] field4918;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4927;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 5)
    public final boolean method2127(String arg0, int arg1, String arg2) {
        field4912++;
        if (!this.method2149(-1)) {
            return false;
        }
        int var4 = -36 / ((arg1 - 8) / 57);
        String var5 = arg2.toLowerCase();
        String var6 = arg0.toLowerCase();
        int var7 = this.field4911.field241.method2053(class276.method1677(var5, true), (byte) 21);
        if (this.method2155(var7, 100)) {
            int var8 = this.field4911.field248[var7].method2053(class276.method1677(var6, true), (byte) 21);
            return this.method2142(var7, var8, (byte) 55);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)[B", line = 34)
    public final byte[] method2128(int arg0, int arg1) {
        field4920++;
        if (!this.method2149(-1)) {
            return null;
        } else if (~this.field4911.field254.length == arg0) {
            return this.method2130(0, arg1, -79);
        } else if (!this.method2155(arg1, 100)) {
            return null;
        } else if (this.field4911.field254[arg1] == 1) {
            return this.method2130(arg1, 0, arg0 ^ 0x7E);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V", line = 65)
    private final void method2129(int arg0, byte arg1) {
        field4892++;
        this.field4924.method22(arg0, (byte) 122);
        if (arg1 <= 26) {
            this.method2151(null, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)[B", line = 81)
    public final byte[] method2130(int arg0, int arg1, int arg2) {
        field4900++;
        if (arg2 > -54) {
            this.method2133(110, -15);
        }
        return this.method2158(arg1, null, false, arg0);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)I", line = 93)
    public static final int method2131(int arg0, int arg1) {
        return class117.field1534 == null ? 0 : class117.field1534[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B", line = 97)
    public final byte[] method2132(String arg0, byte arg1, String arg2) {
        field4928++;
        if (!this.method2149(-1)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4911.field241.method2053(class276.method1677(var4, true), (byte) 21);
        if (!this.method2155(var6, 100)) {
            return null;
        }
        int var7 = this.field4911.field248[var6].method2053(class276.method1677(var5, true), (byte) 21);
        if (arg1 != 77) {
            this.method2143(-20, -10, null, -102);
        }
        return this.method2130(var6, var7, -77);
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)Z", line = 123)
    public final boolean method2133(int arg0, int arg1) {
        field4908++;
        if (arg0 != 0) {
            return true;
        } else if (!this.method2149(-1)) {
            return false;
        } else if (this.field4911.field254.length == 1) {
            return this.method2142(0, arg1, (byte) 103);
        } else if (!this.method2155(arg1, arg0 + 100)) {
            return false;
        } else if (this.field4911.field254[arg1] == 1) {
            return this.method2142(arg1, 0, (byte) 62);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)I", line = 149)
    public final int method2134(int arg0) {
        field4909++;
        if (!this.method2149(-1)) {
            return 0;
        }
        if (arg0 != -9681) {
            method2131(-125, -74);
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4918.length; var4++) {
            if (this.field4911.field245[var4] > 0) {
                var3 += this.method2153(var4, -1828);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(IB)V", line = 192)
    private final void method2135(int arg0, byte arg1) {
        if (this.field4896) {
            this.field4918[arg0] = this.field4924.method16(arg0, true);
        } else {
            this.field4918[arg0] = class312.method1859((byte) 125, this.field4924.method16(arg0, true), false);
        }
        int var3 = 26 % ((arg1 - 32) / 61);
        field4907++;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(II)I", line = 209)
    public final int method2136(int arg0, int arg1) {
        field4917++;
        if (arg0 >= -7) {
            return 103;
        } else if (this.method2155(arg1, 100)) {
            return this.field4911.field254[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)I", line = 224)
    public final int method2137(int arg0) {
        field4922++;
        if (!this.method2149(arg0 + 8784)) {
            throw new IllegalStateException("");
        }
        return arg0 == -8785 ? this.field4911.field250 : -81;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)I", line = 242)
    public final int method2138(int arg0) {
        field4902++;
        return this.method2149(arg0) ? this.field4911.field254.length : -1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZ)V", line = 256)
    public final void method2139(int arg0, boolean arg1) {
        field4926++;
        if (this.method2155(arg0, 100) && arg1 && this.field4927 != null) {
            this.field4927[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZII)Z", line = 273)
    private final boolean method2140(boolean arg0, int arg1, int arg2) {
        field4899++;
        if (arg0) {
            this.field4924 = null;
        }
        if (!this.method2149(-1)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && arg2 < this.field4911.field254.length && this.field4911.field254[arg2] > arg1) {
            return true;
        } else if (class487.field7156) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)Z", line = 298)
    public final boolean method2141(int arg0) {
        field4904++;
        if (!this.method2149(-1)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4911.field256.length; var3++) {
            int var4 = this.field4911.field256[var3];
            if (this.field4918[var4] == null) {
                this.method2135(var4, (byte) -103);
                if (this.field4918[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 < 10) {
            this.method2132(null, (byte) -13, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIB)Z", line = 338)
    public final boolean method2142(int arg0, int arg1, byte arg2) {
        field4916++;
        if (!this.method2140(false, arg1, arg0)) {
            return false;
        } else if (this.field4927[arg0] != null && this.field4927[arg0][arg1] != null) {
            return true;
        } else if (this.field4918[arg0] == null) {
            if (arg2 < 7) {
                this.field4924 = null;
            }
            this.method2135(arg0, (byte) -40);
            return this.field4918[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[II)Z", line = 369)
    private final boolean method2143(int arg0, int arg1, int[] arg2, int arg3) {
        field4901++;
        if (!this.method2155(arg0, 100)) {
            return false;
        } else if (this.field4918[arg0] == null) {
            return false;
        } else {
            int var5 = this.field4911.field245[arg0];
            int[] var6 = this.field4911.field247[arg0];
            if (this.field4927[arg0] == null) {
                this.field4927[arg0] = new Object[this.field4911.field254[arg0]];
            }
            Object[] var7 = this.field4927[arg0];
            boolean var8 = true;
            int var9 = 52 / ((59 - arg3) / 58);
            for (int var10 = 0; var10 < var5; var10++) {
                int var11;
                if (var6 == null) {
                    var11 = var10;
                } else {
                    var11 = var6[var10];
                }
                if (var7[var11] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var12;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var12 = class518.method3099(true, this.field4918[arg0], 24160);
                class396 var13 = new class396(var12);
                var13.method2400((byte) 122, arg2, 5, var13.field5761.length);
            } else {
                var12 = class518.method3099(false, this.field4918[arg0], 24160);
            }
            byte[] var14;
            try {
                var14 = class442.method2718(53, var12);
            } catch (RuntimeException var50) {
                throw class57.method338(var50, "T3 - " + (arg2 != null) + "," + arg0 + "," + var12.length + "," + class421.method2599((byte) -95, var12, var12.length) + "," + class421.method2599((byte) -9, var12, var12.length - 2) + "," + this.field4911.field246[arg0] + "," + this.field4911.field250);
            }
            if (this.field4896) {
                this.field4918[arg0] = null;
            }
            if (var5 <= 1) {
                int var16;
                if (var6 == null) {
                    var16 = 0;
                } else {
                    var16 = var6[0];
                }
                if (this.field4921 == 0) {
                    var7[var16] = class312.method1859((byte) 124, var14, false);
                } else {
                    var7[var16] = var14;
                }
            } else if (this.field4921 == 2) {
                int var17 = var14.length;
                int var51 = var17 - 1;
                int var18 = var14[var51] & 0xFF;
                int var19 = var51 - var5 * var18 * 4;
                class396 var20 = new class396(var14);
                int var21 = 0;
                int var22 = 0;
                var20.field5729 = var19;
                for (int var23 = 0; var23 < var18; var23++) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < var5; var25++) {
                        var24 += var20.method2406((byte) -120);
                        int var26;
                        if (var6 == null) {
                            var26 = var25;
                        } else {
                            var26 = var6[var25];
                        }
                        if (arg1 == var26) {
                            var22 = var26;
                            var21 += var24;
                        }
                    }
                }
                if (var21 == 0) {
                    return true;
                }
                byte[] var27 = new byte[var21];
                int var28 = 0;
                var20.field5729 = var19;
                int var29 = 0;
                for (int var30 = 0; var30 < var18; var30++) {
                    int var31 = 0;
                    for (int var32 = 0; var32 < var5; var32++) {
                        var31 += var20.method2406((byte) -77);
                        int var33;
                        if (var6 == null) {
                            var33 = var32;
                        } else {
                            var33 = var6[var32];
                        }
                        if (arg1 == var33) {
                            class438.method2687(var14, var29, var27, var28, var31);
                            var28 += var31;
                        }
                        var29 += var31;
                    }
                }
                var7[var22] = var27;
            } else {
                int var34 = var14.length;
                int var52 = var34 - 1;
                int var35 = var14[var52] & 0xFF;
                int var36 = var52 - var5 * var35 * 4;
                class396 var37 = new class396(var14);
                var37.field5729 = var36;
                int[] var38 = new int[var5];
                for (int var39 = 0; var39 < var35; var39++) {
                    int var40 = 0;
                    for (int var41 = 0; var41 < var5; var41++) {
                        var40 += var37.method2406((byte) -118);
                        var38[var41] += var40;
                    }
                }
                byte[][] var42 = new byte[var5][];
                for (int var43 = 0; var43 < var5; var43++) {
                    var42[var43] = new byte[var38[var43]];
                    var38[var43] = 0;
                }
                var37.field5729 = var36;
                int var44 = 0;
                for (int var45 = 0; var45 < var35; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var37.method2406((byte) -120);
                        class438.method2687(var14, var44, var42[var47], var38[var47], var46);
                        var44 += var46;
                        var38[var47] += var46;
                    }
                }
                for (int var48 = 0; var48 < var5; var48++) {
                    int var49;
                    if (var6 == null) {
                        var49 = var48;
                    } else {
                        var49 = var6[var48];
                    }
                    if (this.field4921 == 0) {
                        var7[var49] = class312.method1859((byte) 125, var42[var48], false);
                    } else {
                        var7[var49] = var42[var48];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZIZ)V", line = 655)
    public final void method2144(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            field4905 = -1.367839F;
        }
        field4895++;
        if (!this.method2149(~arg1)) {
            return;
        }
        if (arg2) {
            this.field4911.field252 = null;
            this.field4911.field248 = null;
        }
        if (arg0) {
            this.field4911.field249 = null;
            this.field4911.field241 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(II)Z", line = 682)
    public final boolean method2145(int arg0, int arg1) {
        field4903++;
        int var3 = 74 / ((-arg1 - 32) / 48);
        if (!this.method2155(arg0, 100)) {
            return false;
        } else if (this.field4918[arg0] == null) {
            this.method2135(arg0, (byte) -108);
            return this.field4918[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)V", line = 705)
    public final void method2146(int arg0) {
        if (this.field4918 != null) {
            for (int var2 = 0; var2 < this.field4918.length; var2++) {
                this.field4918[var2] = null;
            }
        }
        if (arg0 != -1) {
            this.method2150(-10);
        }
        field4894++;
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(II)I", line = 728)
    public final int method2147(int arg0, int arg1) {
        field4893++;
        if (!this.method2149(arg0)) {
            return -1;
        }
        int var3 = this.field4911.field241.method2053(arg1, (byte) 21);
        if (this.method2155(var3, 100)) {
            if (arg0 != -1) {
                this.field4911 = null;
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 751)
    public final int method2148(String arg0, int arg1) {
        field4891++;
        if (!this.method2149(-1)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4911.field241.method2053(class276.method1677(var3, true), (byte) 21);
        if (arg1 == 0) {
            return this.method2155(var4, 100) ? var4 : -1;
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)Z", line = 773)
    private final boolean method2149(int arg0) {
        field4910++;
        if (this.field4911 == null) {
            this.field4911 = this.field4924.method14((byte) 15);
            if (this.field4911 == null) {
                return false;
            }
            this.field4918 = new Object[this.field4911.field244];
            this.field4927 = new Object[this.field4911.field244][];
        }
        if (arg0 != -1) {
            this.method2128(89, 38);
        }
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lhr;ZI)V", line = 978)
    public class361(class367 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4921 = arg2;
        this.field4924 = arg0;
        this.field4896 = arg1;
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)V", line = 803)
    public final void method2150(int arg0) {
        if (this.field4927 != null) {
            for (int var2 = 0; var2 < this.field4927.length; var2++) {
                this.field4927[var2] = null;
            }
        }
        int var3 = 45 / ((arg0 - 13) / 55);
        field4923++;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 825)
    public final void method2151(String arg0, byte arg1) {
        if (arg1 != -119) {
            this.method2135(110, (byte) 115);
        }
        field4919++;
        if (this.method2149(-1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4911.field241.method2053(class276.method1677(var3, true), (byte) 21);
            this.method2129(var4, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(II)[I", line = 846)
    public final int[] method2152(int arg0, int arg1) {
        field4914++;
        if (arg1 != -1) {
            this.method2155(-64, -93);
        }
        if (!this.method2155(arg0, 100)) {
            return null;
        }
        int[] var3 = this.field4911.field247[arg0];
        if (var3 == null) {
            var3 = new int[this.field4911.field245[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "(II)I", line = 877)
    private final int method2153(int arg0, int arg1) {
        field4925++;
        if (!this.method2155(arg0, arg1 + 1928)) {
            return 0;
        } else if (this.field4918[arg0] == null) {
            if (arg1 != -1828) {
                this.method2144(false, 48, false);
            }
            return this.field4924.method26(arg0, (byte) -81);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/lang/String;)I", line = 895)
    public final int method2154(int arg0, String arg1) {
        field4898++;
        if (!this.method2149(-1)) {
            return 0;
        }
        if (arg0 != 0) {
            this.method2147(-104, -62);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4911.field241.method2053(class276.method1677(var3, true), (byte) 21);
        return this.method2153(var4, -1828);
    }

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "(II)Z", line = 914)
    private final boolean method2155(int arg0, int arg1) {
        field4897++;
        if (arg1 != 100) {
            this.method2141(43);
        }
        if (!this.method2149(-1)) {
            return false;
        } else if (arg0 >= 0 && this.field4911.field254.length > arg0 && this.field4911.field254[arg0] != 0) {
            return true;
        } else if (class487.field7156) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Ljava/lang/String;B)Z", line = 937)
    public final boolean method2156(String arg0, byte arg1) {
        field4906++;
        if (arg1 != 86) {
            this.method2139(34, true);
        }
        if (this.method2149(-1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4911.field241.method2053(class276.method1677(var3, true), (byte) 21);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 959)
    public final boolean method2157(String arg0, int arg1) {
        field4913++;
        if (this.method2149(-1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4911.field241.method2053(class276.method1677(var3, true), (byte) 21);
            return arg1 == 0 ? this.method2145(var4, -122) : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[IZI)[B", line = 991)
    public final byte[] method2158(int arg0, int[] arg1, boolean arg2, int arg3) {
        field4915++;
        if (!this.method2140(arg2, arg0, arg3)) {
            return null;
        }
        if (this.field4927[arg3] == null || this.field4927[arg3][arg0] == null) {
            boolean var5 = this.method2143(arg3, arg0, arg1, -86);
            if (!var5) {
                this.method2135(arg3, (byte) 117);
                boolean var6 = this.method2143(arg3, arg0, arg1, -53);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class518.method3099(false, this.field4927[arg3][arg0], 24160);
        if (this.field4921 == 1) {
            this.field4927[arg3][arg0] = null;
            if (this.field4911.field254[arg3] == 1) {
                this.field4927[arg3] = null;
            }
        } else if (this.field4921 == 2) {
            this.field4927[arg3] = null;
        }
        return var7;
    }
}
