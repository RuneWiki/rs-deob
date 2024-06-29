import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class273 {

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lrh;")
    private class47 field4477 = null;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lbg;")
    private class256 field4503;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Z")
    private boolean field4493;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "Z")
    private boolean field4507;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field4500 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Lfa;")
    public static class273 field4496;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[Ljava/lang/Object;")
    private Object[] field4487;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4476;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
    public final boolean method1874(int arg0, int arg1) {
        field4473++;
        if (!this.method1876(25)) {
            return false;
        } else if (this.field4477.field653.length == 1) {
            return this.method1898(0, arg0, true);
        } else if (!this.method1891(arg0, arg1 ^ arg1)) {
            return false;
        } else if (this.field4477.field653[arg0] == 1) {
            return this.method1898(arg0, 0, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[I")
    public final int[] method1875(int arg0, int arg1) {
        field4483++;
        if (!this.method1891(arg0, arg1)) {
            return null;
        }
        int[] var3 = this.field4477.field646[arg0];
        if (var3 == null) {
            var3 = new int[this.field4477.field651[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)Z")
    private final boolean method1876(int arg0) {
        if (arg0 < 15) {
            this.field4487 = null;
        }
        field4499++;
        if (this.field4477 == null) {
            this.field4477 = this.field4503.method1549(-1);
            if (this.field4477 == null) {
                return false;
            }
            this.field4487 = new Object[this.field4477.field645];
            this.field4476 = new Object[this.field4477.field645][];
        }
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)[B")
    public final byte[] method1877(int arg0, int arg1, byte arg2) {
        if (arg2 <= 26) {
            this.method1874(54, 72);
        }
        field4485++;
        return this.method1907(arg0, arg1, (int[]) null, -25529);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public final void method1878(int arg0) {
        if (arg0 > -18) {
            field4496 = null;
        }
        field4481++;
        if (this.field4476 != null) {
            for (int var2 = 0; var2 < this.field4476.length; var2++) {
                this.field4476[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method1879(String arg0, byte arg1) {
        field4508++;
        if (arg1 <= 92) {
            this.field4507 = true;
        }
        if (this.method1876(106)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4477.field644.method521((byte) 81, class36.method222(-118, var3));
            return this.method1882(107, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method1880(int arg0, String arg1, String arg2) {
        field4491++;
        if (!this.method1876(34)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        if (arg0 != 3) {
            return false;
        }
        int var6 = this.field4477.field644.method521((byte) 81, class36.method222(-128, var4));
        if (this.method1891(var6, 0)) {
            int var7 = this.field4477.field641[var6].method521((byte) 81, class36.method222(-122, var5));
            return this.method1898(var6, var7, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
    private final void method1881(int arg0, byte arg1) {
        this.field4503.method1539(arg0, arg1 - 9554);
        if (arg1 == -51) {
            field4486++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)I")
    private final int method1882(int arg0, int arg1) {
        field4501++;
        if (!this.method1891(arg1, 0)) {
            return 0;
        } else if (this.field4487[arg1] == null) {
            return arg0 < 76 ? 5 : this.field4503.method1544(74, arg1);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)[B")
    public final byte[] method1883(byte arg0, int arg1, int arg2) {
        field4510++;
        if (!this.method1885(arg1, 10661, arg2)) {
            return null;
        }
        int var4 = -22 % ((81 - arg0) / 33);
        if (this.field4476[arg1] == null || this.field4476[arg1][arg2] == null) {
            boolean var5 = this.method1888((int[]) null, arg1, 0);
            if (!var5) {
                this.method1904(arg1, -1);
                boolean var6 = this.method1888((int[]) null, arg1, 0);
                if (!var6) {
                    return null;
                }
            }
        }
        return class152.method1008(false, -119, this.field4476[arg1][arg2]);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IB)[B")
    public final byte[] method1884(int arg0, byte arg1) {
        field4511++;
        if (!this.method1876(38)) {
            return null;
        } else if (this.field4477.field653.length == 1) {
            return this.method1877(arg0, 0, (byte) 51);
        } else {
            int var3 = 7 % ((arg1 - 11) / 41);
            if (!this.method1891(arg0, 0)) {
                return null;
            } else if (this.field4477.field653[arg0] == 1) {
                return this.method1877(0, arg0, (byte) 72);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Z")
    private final boolean method1885(int arg0, int arg1, int arg2) {
        field4488++;
        if (!this.method1876(23)) {
            return false;
        }
        if (arg1 != 10661) {
            field4482 = -65;
        }
        if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field4477.field653.length && arg2 < this.field4477.field653[arg0]) {
            return true;
        } else if (class150.field2334) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public static void method1886(int arg0) {
        if (arg0 != 1) {
            field4500 = -127;
        }
        field4496 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIII)V")
    public static final void method1887(boolean arg0, int arg1, int arg2, int arg3) {
        field4498++;
        class80 var4 = class107.method698(arg1, arg2, arg3, (byte) 123);
        if (var4 == null || !arg0) {
            return;
        }
        class246.field3925 = new int[var4.field1262];
        class111.field1695 = new String[var4.field1264];
        if (var4.field1261 == 15 || var4.field1261 == 17 || var4.field1261 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class175.field2741 != null) {
                var5 = class175.field2741.field4197;
                var6 = class175.field2741.field4200;
            }
            class246.field3925[1] = class60.field924 - var6;
            class246.field3925[0] = class1.field1 - var5;
        }
        class68.method428(var4, 200000, 0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([III)Z")
    private final boolean method1888(int[] arg0, int arg1, int arg2) {
        field4480++;
        if (!this.method1891(arg1, arg2 + arg2)) {
            return false;
        } else if (this.field4487[arg1] == null) {
            return false;
        } else {
            int[] var4 = this.field4477.field646[arg1];
            int var5 = this.field4477.field651[arg1];
            if (this.field4476[arg1] == null) {
                this.field4476[arg1] = new Object[this.field4477.field653[arg1]];
            }
            Object[] var6 = this.field4476[arg1];
            boolean var7 = true;
            for (int var8 = 0; var8 < var5; var8++) {
                int var9;
                if (var4 == null) {
                    var9 = var8;
                } else {
                    var9 = var4[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class152.method1008(true, -128, this.field4487[arg1]);
                class202 var11 = new class202(var10);
                var11.method1428(5, false, var11.field3234.length, arg0);
            } else {
                var10 = class152.method1008(false, arg2 ^ 0xFFFFFF95, this.field4487[arg1]);
            }
            byte[] var12;
            try {
                var12 = class195.method1353(false, var10);
            } catch (RuntimeException var31) {
                throw class130.method868(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class89.method578(var10, var10.length, 0) + "," + class89.method578(var10, var10.length - 2, 0) + "," + this.field4477.field635[arg1] + "," + this.field4477.field632);
            }
            if (this.field4493) {
                this.field4487[arg1] = null;
            }
            if (var5 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var5 * 4 * var15;
                int[] var17 = new int[var5];
                class202 var18 = new class202(var12);
                var18.field3272 = var16;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var5; var21++) {
                        var20 += var18.method1440(20404);
                        var17[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var5][];
                for (int var23 = 0; var23 < var5; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                var18.field3272 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var5; var27++) {
                        var26 += var18.method1440(20404);
                        class158.method1051(var12, var24, var22[var27], var17[var27], var26);
                        var17[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var5; var28++) {
                    int var29;
                    if (var4 == null) {
                        var29 = var28;
                    } else {
                        var29 = var4[var28];
                    }
                    if (this.field4507) {
                        var6[var29] = var22[var28];
                    } else {
                        var6[var29] = class264.method1825(var22[var28], class93.method605(arg2, 30517), false);
                    }
                }
            } else {
                int var30;
                if (var4 == null) {
                    var30 = 0;
                } else {
                    var30 = var4[0];
                }
                if (this.field4507) {
                    var6[var30] = var12;
                } else {
                    var6[var30] = class264.method1825(var12, arg2 + 30517, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method1889(int arg0, String arg1, String arg2) {
        field4494++;
        if (!this.method1876(40)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field4477.field644.method521((byte) 81, class36.method222(-121, var4));
        if (!this.method1891(var6, 0)) {
            return null;
        }
        if (arg0 <= 119) {
            this.field4476 = null;
        }
        int var7 = this.field4477.field641[var6].method521((byte) 81, class36.method222(-121, var5));
        return this.method1877(var7, var6, (byte) 29);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)I")
    public final int method1890(boolean arg0, int arg1) {
        if (!arg0) {
            this.field4503 = null;
        }
        field4484++;
        return this.method1891(arg1, 0) ? this.field4477.field653[arg1] : 0;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)Z")
    private final boolean method1891(int arg0, int arg1) {
        field4475++;
        if (!this.method1876(60)) {
            return false;
        } else if (arg0 >= arg1 && this.field4477.field653.length > arg0 && this.field4477.field653[arg0] != 0) {
            return true;
        } else if (class150.field2334) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I")
    public final int method1892(byte arg0) {
        field4490++;
        if (this.method1876(54)) {
            if (arg0 > -83) {
                this.field4493 = false;
            }
            return this.field4477.field653.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I")
    public final int method1893(boolean arg0) {
        field4514++;
        if (arg0) {
            this.field4503 = null;
        }
        if (!this.method1876(19)) {
            throw new IllegalStateException("");
        }
        return this.field4477.field632;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Z")
    public final boolean method1894(byte arg0) {
        if (arg0 != 23) {
            return false;
        }
        field4513++;
        if (!this.method1876(44)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4477.field633.length; var3++) {
            int var4 = this.field4477.field633[var3];
            if (this.field4487[var4] == null) {
                this.method1904(var4, -1);
                if (this.field4487[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method1895(String arg0, boolean arg1) {
        if (arg1) {
            this.field4503 = null;
        }
        field4509++;
        if (this.method1876(121)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4477.field644.method521((byte) 81, class36.method222(-115, var3));
            return this.method1891(var4, 0) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(II)V")
    public final void method1896(int arg0, int arg1) {
        field4504++;
        if (this.method1891(arg1, arg0 ^ arg0) && this.field4476 != null) {
            this.field4476[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)I")
    public final int method1897(boolean arg0) {
        field4505++;
        if (!this.method1876(64)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4487.length; var4++) {
            if (this.field4477.field651[var4] > 0) {
                var3 += this.method1882(98, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            if (!arg0) {
                method1887(false, -54, -118, -106);
            }
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1898(int arg0, int arg1, boolean arg2) {
        field4474++;
        if (!this.method1885(arg0, 10661, arg1)) {
            return false;
        } else if (this.field4476[arg0] != null && this.field4476[arg0][arg1] != null) {
            return true;
        } else if (this.field4487[arg0] == null) {
            if (!arg2) {
                this.method1901(-8, (String) null);
            }
            this.method1904(arg0, -1);
            return this.field4487[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method1899(String arg0, boolean arg1) {
        field4489++;
        if (!this.method1876(102)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4477.field644.method521((byte) 81, class36.method222(-128, var3));
        if (var4 < 0) {
            return false;
        } else if (arg1) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZZZ)V")
    public final void method1900(boolean arg0, boolean arg1, boolean arg2) {
        field4506++;
        if (!arg1 || !this.method1876(76)) {
            return;
        }
        if (arg0) {
            this.field4477.field647 = null;
            this.field4477.field641 = null;
        }
        if (arg2) {
            this.field4477.field644 = null;
            this.field4477.field642 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1901(int arg0, String arg1) {
        field4497++;
        if (!this.method1876(24)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != 1) {
            field4482 = 12;
        }
        int var4 = this.field4477.field644.method521((byte) 81, class36.method222(-126, var3));
        return this.method1906((byte) 124, var4);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLgj;)V")
    public static final void method1902(byte arg0, class255 arg1) {
        class238 var2 = null;
        field4495++;
        class73.field1067 = 3;
        class80.method537(true, -93);
        class143.field2228 = true;
        class123.field1878 = true;
        class175.field2740 = true;
        class152.field2373 = 0;
        class51.field687 = true;
        class230.field3687 = 0;
        class296.field4867 = 0;
        class180.field2800 = true;
        class182.field2830 = true;
        class176.field2746 = true;
        class19.field257 = 127;
        class223.field3550 = 255;
        class208.field3342 = true;
        class12.field160 = true;
        class135.field2113 = true;
        class272.field4462 = true;
        class11.field145 = 127;
        int var3 = 18 / ((arg0 + 54) / 56);
        class218.field3463 = 0;
        class163.field2567 = 2;
        if (class93.field1412 < 96) {
            class77.method504(0);
        } else {
            class77.method504(2);
        }
        class241.field3822 = false;
        class51.field689 = 0;
        class132.field2028 = 0;
        class144.field2261 = true;
        class192.field3039 = false;
        class74.field1123 = false;
        class258.field4245 = 0;
        try {
            class54 var4 = arg1.method1781("runescape", 0);
            while (var4.field725 == 0) {
                class96.method614(0, 1L);
            }
            if (var4.field725 == 1) {
                var2 = (class238) var4.field723;
                int var5 = 0;
                byte[] var6 = new byte[(int) var2.method1658(-38)];
                while (var6.length > var5) {
                    int var7 = var2.method1659(var6.length - var5, var5, -80, var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                    var5 += var7;
                }
                class141.method937(new class202(var6), false);
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method1660((byte) -20);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(IB)I")
    public final int method1903(int arg0, byte arg1) {
        field4512++;
        if (!this.method1876(30)) {
            return -1;
        }
        int var3 = this.field4477.field644.method521((byte) 81, arg0);
        if (arg1 >= -108) {
            return 7;
        } else if (this.method1891(var3, 0)) {
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(II)V")
    private final void method1904(int arg0, int arg1) {
        if (this.field4493) {
            this.field4487[arg0] = this.field4503.method1538(arg0, (byte) 93);
        } else {
            this.field4487[arg0] = class264.method1825(this.field4503.method1538(arg0, (byte) 93), 30517, false);
        }
        field4492++;
        if (arg1 != -1) {
            this.field4477 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1905(String arg0, int arg1) {
        field4479++;
        if (this.method1876(116)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4477.field644.method521((byte) 81, class36.method222(-118, var3));
            this.method1881(var4, (byte) -51);
            int var5 = -28 / ((arg1 - 18) / 57);
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lbg;ZZ)V")
    public class273(class256 arg0, boolean arg1, boolean arg2) {
        this.field4503 = arg0;
        this.field4493 = arg1;
        this.field4507 = arg2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Z")
    public final boolean method1906(byte arg0, int arg1) {
        field4502++;
        if (arg0 < 120) {
            field4496 = null;
        }
        if (!this.method1891(arg1, 0)) {
            return false;
        } else if (this.field4487[arg1] == null) {
            this.method1904(arg1, -1);
            return this.field4487[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[II)[B")
    public final byte[] method1907(int arg0, int arg1, int[] arg2, int arg3) {
        field4478++;
        if (!this.method1885(arg1, 10661, arg0)) {
            return null;
        }
        if (this.field4476[arg1] == null || this.field4476[arg1][arg0] == null) {
            boolean var5 = this.method1888(arg2, arg1, 0);
            if (!var5) {
                this.method1904(arg1, -1);
                boolean var6 = this.method1888(arg2, arg1, 0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class152.method1008(false, -120, this.field4476[arg1][arg0]);
        if (this.field4507) {
            this.field4476[arg1][arg0] = null;
            if (this.field4477.field653[arg1] == 1) {
                this.field4476[arg1] = null;
            }
        }
        if (arg3 != -25529) {
            this.method1879((String) null, (byte) -97);
        }
        return var7;
    }
}
