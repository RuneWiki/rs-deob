import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class266 {

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lii;")
    private class212 field4377 = null;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lv;")
    private class73 field4371;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Z")
    private boolean field4365;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
    private boolean field4369;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Z")
    public static boolean field4385 = false;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lve;")
    public static class266 field4374;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "[Ljava/lang/Object;")
    private Object[] field4401;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4389;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method1869(byte arg0) {
        field4395++;
        if (!this.method1878(3)) {
            return false;
        }
        if (arg0 <= 15) {
            this.method1869((byte) 39);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4377.field3289.length; var3++) {
            int var4 = this.field4377.field3289[var3];
            if (this.field4401[var4] == null) {
                this.method1890(false, var4);
                if (this.field4401[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I", line = 51)
    private final int method1870(int arg0, int arg1) {
        field4372++;
        if (this.method1886(false, arg0)) {
            if (arg1 != 0) {
                this.method1871(36, false, true);
            }
            return this.field4401[arg0] == null ? this.field4371.method524(arg0, 65535) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZZ)V", line = 68)
    public final void method1871(int arg0, boolean arg1, boolean arg2) {
        field4370++;
        int var4 = 9 / ((arg0 - 35) / 44);
        if (!this.method1878(3)) {
            return;
        }
        if (arg1) {
            this.field4377.field3291 = null;
            this.field4377.field3284 = null;
        }
        if (arg2) {
            this.field4377.field3300 = null;
            this.field4377.field3278 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILna;)I", line = 97)
    public final int method1872(int arg0, class26 arg1) {
        field4386++;
        if (!this.method1878(arg0 - 22810)) {
            return 0;
        }
        class26 var3 = arg1.method165(-98);
        if (arg0 == 22813) {
            int var4 = this.field4377.field3284.method2107(var3.method205(false), 1);
            return this.method1870(var4, 0);
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z", line = 117)
    public final boolean method1873(int arg0, int arg1) {
        field4376++;
        if (arg0 >= -88) {
            this.field4365 = true;
        }
        if (!this.method1886(false, arg1)) {
            return false;
        } else if (this.field4401[arg1] == null) {
            this.method1890(false, arg1);
            return this.field4401[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)I", line = 143)
    public final int method1874(byte arg0) {
        field4384++;
        if (arg0 >= -116) {
            this.method1871(-97, true, true);
        }
        if (!this.method1878(3)) {
            throw new IllegalStateException("");
        }
        return this.field4377.field3302;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 159)
    public static void method1875(int arg0) {
        if (arg0 != 100) {
            method1899((byte) -45, -91, 7, -83, 24);
        }
        field4374 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lna;B)I", line = 173)
    public final int method1876(class26 arg0, byte arg1) {
        field4387++;
        if (!this.method1878(3)) {
            return -1;
        }
        class26 var3 = arg0.method165(arg1 ^ 0x7C);
        int var4 = this.field4377.field3284.method2107(var3.method205(false), arg1 ^ 0xFFFFFFE3);
        if (this.method1886(false, var4)) {
            return arg1 == -30 ? var4 : 87;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I", line = 196)
    public final int method1877(int arg0) {
        field4375++;
        if (this.method1878(3)) {
            if (arg0 != 0) {
                this.method1895(45, 104, -3);
            }
            return this.field4377.field3290.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Z", line = 217)
    private final boolean method1878(int arg0) {
        if (arg0 != 3) {
            this.method1893((byte) -93);
        }
        field4388++;
        if (this.field4377 == null) {
            this.field4377 = this.field4371.method521(0);
            if (this.field4377 == null) {
                return false;
            }
            this.field4389 = new Object[this.field4377.field3297][];
            this.field4401 = new Object[this.field4377.field3297];
        }
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILna;Lna;)[B", line = 238)
    public final byte[] method1879(int arg0, class26 arg1, class26 arg2) {
        field4367++;
        if (!this.method1878(arg0 ^ 0x3)) {
            return null;
        }
        class26 var4 = arg2.method165(-98);
        class26 var5 = arg1.method165(-98);
        int var6 = this.field4377.field3284.method2107(var4.method205(false), 1);
        if (arg0 != 0) {
            this.field4377 = (class212) null;
        }
        if (this.method1886(false, var6)) {
            int var7 = this.field4377.field3300[var6].method2107(var5.method205(false), 1);
            return this.method1889(var6, (byte) -122, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILna;)V", line = 262)
    public final void method1880(int arg0, class26 arg1) {
        field4373++;
        if (this.method1878(3)) {
            class26 var3 = arg1.method165(-98);
            int var4 = this.field4377.field3284.method2107(var3.method205(false), 1);
            this.method1887(119, var4);
            int var5 = 123 % ((arg0 + 60) / 62);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lv;ZZ)V", line = 906)
    public class266(class73 arg0, boolean arg1, boolean arg2) {
        this.field4371 = arg0;
        this.field4365 = arg1;
        this.field4369 = arg2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lna;BLna;)Z", line = 297)
    public final boolean method1881(class26 arg0, byte arg1, class26 arg2) {
        field4390++;
        if (!this.method1878(arg1 - 113)) {
            return false;
        }
        class26 var4 = arg2.method165(arg1 - 214);
        class26 var5 = arg0.method165(-98);
        int var6 = this.field4377.field3284.method2107(var4.method205(false), 1);
        if (!this.method1886(false, var6)) {
            return false;
        }
        int var7 = this.field4377.field3300[var6].method2107(var5.method205(false), 1);
        if (arg1 != 116) {
            this.field4365 = true;
        }
        return this.method1885((byte) 70, var7, var6);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[III)[B", line = 323)
    public final byte[] method1882(int arg0, int[] arg1, int arg2, int arg3) {
        field4383++;
        if (!this.method1895(arg0, 0, arg3)) {
            return null;
        }
        if (this.field4389[arg0] == null || this.field4389[arg0][arg3] == null) {
            boolean var5 = this.method1888(arg0, false, arg1);
            if (!var5) {
                this.method1890(false, arg0);
                boolean var6 = this.method1888(arg0, false, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg2 < 35) {
            return (byte[]) null;
        }
        byte[] var7 = class324.method2249(-119, this.field4389[arg0][arg3], false);
        if (this.field4369) {
            this.field4389[arg0][arg3] = null;
            if (this.field4377.field3290[arg0] == 1) {
                this.field4389[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLna;)Z", line = 372)
    public final boolean method1883(byte arg0, class26 arg1) {
        field4402++;
        if (this.method1878(3)) {
            class26 var3 = arg1.method165(-98);
            int var4 = this.field4377.field3284.method2107(var3.method205(false), arg0 + 84);
            return arg0 == -83 ? this.method1873(-104, var4) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)V", line = 390)
    public final void method1884(int arg0, int arg1) {
        field4380++;
        if (arg0 == 7561 && this.method1886(false, arg1) && this.field4389 != null) {
            this.field4389[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)Z", line = 408)
    public final boolean method1885(byte arg0, int arg1, int arg2) {
        field4393++;
        int var4 = 78 / ((-arg0 - 10) / 59);
        if (!this.method1895(arg2, 0, arg1)) {
            return false;
        } else if (this.field4389[arg2] != null && this.field4389[arg2][arg1] != null) {
            return true;
        } else if (this.field4401[arg2] == null) {
            this.method1890(false, arg2);
            return this.field4401[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z", line = 434)
    private final boolean method1886(boolean arg0, int arg1) {
        if (arg0) {
            field4385 = false;
        }
        field4403++;
        if (!this.method1878(3)) {
            return false;
        } else if (arg1 >= 0 && this.field4377.field3290.length > arg1 && this.field4377.field3290[arg1] != 0) {
            return true;
        } else if (class287.field4806) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(II)V", line = 462)
    private final void method1887(int arg0, int arg1) {
        field4368++;
        this.field4371.method522(arg1, 127);
        if (arg0 < 101) {
            this.method1888(53, false, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ[I)Z", line = 473)
    private final boolean method1888(int arg0, boolean arg1, int[] arg2) {
        field4399++;
        if (!this.method1886(arg1, arg0)) {
            return false;
        } else if (this.field4401[arg0] == null) {
            return false;
        } else {
            int[] var4 = this.field4377.field3295[arg0];
            int var5 = this.field4377.field3292[arg0];
            if (this.field4389[arg0] == null) {
                this.field4389[arg0] = new Object[this.field4377.field3290[arg0]];
            }
            boolean var6 = true;
            Object[] var7 = this.field4389[arg0];
            for (int var8 = 0; var8 < var5; var8++) {
                int var9;
                if (var4 == null) {
                    var9 = var8;
                } else {
                    var9 = var4[var8];
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
                var10 = class324.method2249(-124, this.field4401[arg0], true);
                class82 var11 = new class82(var10);
                var11.method609(arg2, 120, 5, var11.field1280.length);
            } else {
                var10 = class324.method2249(-128, this.field4401[arg0], false);
            }
            byte[] var12;
            try {
                var12 = class133.method903((byte) -125, var10);
            } catch (RuntimeException var31) {
                throw class229.method1540(var31, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + class45.method344(var10, var10.length, false) + "," + class45.method344(var10, var10.length - 2, false) + "," + this.field4377.field3280[arg0] + "," + this.field4377.field3302);
            }
            if (this.field4365) {
                this.field4401[arg0] = null;
            }
            if (var5 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var5 * var15 * 4;
                class82 var17 = new class82(var12);
                var17.field1301 = var16;
                int[] var18 = new int[var5];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var5; var21++) {
                        var20 += var17.method587(-502942936);
                        if (var4 == null) {
                        }
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var5][];
                for (int var23 = 0; var23 < var5; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                var17.field1301 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var5; var27++) {
                        var26 += var17.method587(-502942936);
                        class75.method536(var12, var24, var22[var27], var18[var27], var26);
                        var24 += var26;
                        var18[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var5; var28++) {
                    int var29;
                    if (var4 == null) {
                        var29 = var28;
                    } else {
                        var29 = var4[var28];
                    }
                    if (this.field4369) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class316.method2191(false, -114, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var4 == null) {
                    var30 = 0;
                } else {
                    var30 = var4[0];
                }
                if (this.field4369) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class316.method2191(false, -80, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)[B", line = 666)
    public final byte[] method1889(int arg0, byte arg1, int arg2) {
        field4392++;
        if (arg1 != -122) {
            this.method1890(false, 93);
        }
        return this.method1882(arg0, (int[]) null, 52, arg2);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(ZI)V", line = 681)
    private final void method1890(boolean arg0, int arg1) {
        if (this.field4365) {
            this.field4401[arg1] = this.field4371.method525(arg1, 0);
        } else {
            this.field4401[arg1] = class316.method2191(false, -101, this.field4371.method525(arg1, 0));
        }
        if (arg0) {
            this.field4365 = false;
        }
        field4378++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lna;I)Z", line = 701)
    public final boolean method1891(class26 arg0, int arg1) {
        field4396++;
        if (arg1 >= -103) {
            return false;
        } else if (this.method1878(3)) {
            class26 var3 = arg0.method165(-98);
            int var4 = this.field4377.field3284.method2107(var3.method205(false), 1);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)I", line = 724)
    public final int method1892(byte arg0) {
        if (arg0 > -121) {
            field4382 = -3;
        }
        field4366++;
        if (!this.method1878(3)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4401.length; var4++) {
            if (this.field4377.field3292[var4] > 0) {
                var2 += 100;
                var3 += this.method1870(var4, 0);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V", line = 765)
    public final void method1893(byte arg0) {
        if (arg0 != 56) {
            this.field4389 = (Object[][]) ((Object[][]) null);
        }
        field4404++;
        if (this.field4389 != null) {
            for (int var2 = 0; var2 < this.field4389.length; var2++) {
                this.field4389[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(II)[B", line = 789)
    public final byte[] method1894(int arg0, int arg1) {
        field4400++;
        if (!this.method1878(arg1 ^ 0x3)) {
            return null;
        } else if (this.field4377.field3290.length == 1) {
            return this.method1889(0, (byte) -122, arg0);
        } else if (!this.method1886(false, arg0)) {
            return null;
        } else if (this.field4377.field3290[arg0] == 1) {
            return this.method1889(arg0, (byte) -122, 0);
        } else if (arg1 == 0) {
            throw new RuntimeException();
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z", line = 815)
    private final boolean method1895(int arg0, int arg1, int arg2) {
        field4398++;
        if (!this.method1878(3)) {
            return false;
        } else if (arg1 <= arg0 && arg2 >= 0 && this.field4377.field3290.length > arg0 && this.field4377.field3290[arg0] > arg2) {
            return true;
        } else if (class287.field4806) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)[B", line = 842)
    public final byte[] method1896(int arg0, int arg1, int arg2) {
        field4391++;
        if (!this.method1895(arg1, arg2 + arg2, arg0)) {
            return null;
        }
        if (this.field4389[arg1] == null || this.field4389[arg1][arg0] == null) {
            boolean var4 = this.method1888(arg1, false, (int[]) null);
            if (!var4) {
                this.method1890(false, arg1);
                boolean var5 = this.method1888(arg1, false, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        return class324.method2249(-126, this.field4389[arg1][arg0], false);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)[I", line = 877)
    public final int[] method1897(byte arg0, int arg1) {
        field4381++;
        if (arg0 != -128) {
            field4394 = -69;
        }
        if (!this.method1886(false, arg1)) {
            return null;
        }
        int[] var3 = this.field4377.field3295[arg1];
        if (var3 == null) {
            var3 = new int[this.field4377.field3292[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I", line = 917)
    public final int method1898(int arg0, byte arg1) {
        field4397++;
        if (this.method1886(false, arg0)) {
            if (arg1 <= 60) {
                this.method1878(32);
            }
            return this.field4377.field3290[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIII)V", line = 932)
    public static final void method1899(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4379++;
        class120 var5 = class293.method2059(4, 8, arg2);
        var5.method833((byte) 33);
        var5.field1875 = arg1;
        if (arg0 >= -120) {
            field4382 = -14;
        }
        var5.field1877 = arg4;
        var5.field1876 = arg3;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(II)Z", line = 949)
    public final boolean method1900(int arg0, int arg1) {
        field4364++;
        if (!this.method1878(3)) {
            return false;
        } else if (this.field4377.field3290.length == 1) {
            return this.method1885((byte) 86, arg1, 0);
        } else if (!this.method1886(false, arg1)) {
            return false;
        } else if (this.field4377.field3290[arg1] == 1) {
            return this.method1885((byte) 109, 0, arg1);
        } else if (arg0 == 0) {
            throw new RuntimeException();
        } else {
            return false;
        }
    }
}
