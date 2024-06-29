import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class103 {

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    private int field1930 = 0;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[Lbb;")
    public class88[] field1922;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lhj;")
    public static class69 field1916 = class181.method1318("Fertigkeit)2", (byte) -116);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[Lhj;")
    public static class69[] field1915 = new class69[200];

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lc;")
    public static class103 field1920 = new class103(16);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Lhj;")
    public static class69 field1932 = class181.method1318("loginscreen", (byte) -123);

    @OriginalMember(owner = "client!c", name = "z", descriptor = "Z")
    public static boolean field1936 = false;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "Lhk;")
    public static class121 field1935 = null;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "J")
    private long field1917;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lbb;")
    private class88 field1924;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lbb;")
    private class88 field1925;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method755(int arg0) {
        class12.field124.method1713(-94);
        class229.field4197.method1713(125);
        field1928++;
        if (arg0 != 1902917697) {
            method767(19, 59, 88, -112, (byte) -123);
        }
        class80.field1536.method1713(-95);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method756(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1911++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg4;
        int var11 = arg1 - arg6;
        int var12 = arg4 - arg6;
        int var13 = arg1 * arg1;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var18;
        int var24 = var16 - (var22 - 1) * var20;
        if (arg3 != -109) {
            method766(62, (byte) -23);
        }
        int var25 = var13 << 2;
        int var26 = var14 << 2;
        int var27 = var16 << 2;
        int var28 = var15 << 2;
        int var29 = var18 * 3;
        int var30 = (var21 - 3) * var17;
        int var31 = var19 * 3;
        int var32 = (1 - var22) * var15 + var19;
        int var33 = var14 - ((var21 - 1) * var17);
        int var34 = (var22 - 3) * var20;
        int var35 = var26;
        int var36 = var27;
        if (class19.field252 <= arg0 && arg0 <= class166.field3075) {
            int[] var37 = class186.field3402[arg0];
            int var38 = class240.method1700(class35.field485, arg5 - arg1, -14, class201.field3629);
            int var39 = class240.method1700(class35.field485, arg1 + arg5, -117, class201.field3629);
            int var40 = class240.method1700(class35.field485, arg5 - var11, 127, class201.field3629);
            int var41 = class240.method1700(class35.field485, arg5 + var11, 125, class201.field3629);
            class99.method740(arg2, var37, -1162793114, var40, var38);
            class99.method740(arg7, var37, -1162793114, var41, var40);
            class99.method740(arg2, var37, arg3 - 1162793005, var39, var41);
        }
        int var42 = (var12 - 1) * var28;
        int var43 = (arg4 - 1) * var25;
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var29;
                    var29 += var26;
                    var33 += var35;
                    var35 += var26;
                    var8++;
                }
            }
            if (var33 < 0) {
                var33 += var35;
                var35 += var26;
                var23 += var29;
                var29 += var26;
                var8++;
            }
            var23 += -var43;
            var43 -= var25;
            boolean var44 = var10 <= var12;
            var10--;
            var33 += -var30;
            var30 -= var25;
            int var45 = arg0 - var10;
            if (var44) {
                if (var32 < 0) {
                    while (var32 < 0) {
                        var32 += var31;
                        var24 += var36;
                        var31 += var27;
                        var9++;
                        var36 += var27;
                    }
                }
                if (var24 < 0) {
                    var32 += var31;
                    var24 += var36;
                    var9++;
                    var31 += var27;
                    var36 += var27;
                }
                var32 += -var42;
                var24 += -var34;
                var34 -= var28;
                var42 -= var28;
            }
            int var46 = arg0 + var10;
            if (var46 >= class19.field252 && class166.field3075 >= var45) {
                int var47 = class240.method1700(class35.field485, arg5 + var8, 125, class201.field3629);
                int var48 = class240.method1700(class35.field485, arg5 - var8, 125, class201.field3629);
                if (var44) {
                    int var49 = class240.method1700(class35.field485, arg5 + var9, 124, class201.field3629);
                    int var50 = class240.method1700(class35.field485, arg5 - var9, 126, class201.field3629);
                    if (var45 >= class19.field252) {
                        int[] var51 = class186.field3402[var45];
                        class99.method740(arg2, var51, arg3 ^ 0x454ED0F5, var50, var48);
                        class99.method740(arg7, var51, -1162793114, var49, var50);
                        class99.method740(arg2, var51, -1162793114, var47, var49);
                    }
                    if (class166.field3075 >= var46) {
                        int[] var52 = class186.field3402[var46];
                        class99.method740(arg2, var52, -1162793114, var50, var48);
                        class99.method740(arg7, var52, arg3 ^ 0x454ED0F5, var49, var50);
                        class99.method740(arg2, var52, arg3 ^ 0x454ED0F5, var47, var49);
                    }
                } else {
                    if (var45 >= class19.field252) {
                        class99.method740(arg2, class186.field3402[var45], -1162793114, var47, var48);
                    }
                    if (var46 <= class166.field3075) {
                        class99.method740(arg2, class186.field3402[var46], arg3 - 1162793005, var47, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static final void method757(boolean arg0) {
        class258 var1 = class141.field2626;
        synchronized (class141.field2626) {
            class32.field443 = class237.field4310;
            class141.field2635++;
            if (arg0) {
                method756(80, -98, -127, (byte) -17, 18, 30, -15, 87);
            }
            if (class63.field1229 >= 0) {
                while (class63.field1229 != class165.field3039) {
                    int var2 = class213.field3878[class165.field3039];
                    class165.field3039 = class165.field3039 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class261.field4656[var2] = true;
                    } else {
                        class261.field4656[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class261.field4656[var3] = false;
                }
                class63.field1229 = class165.field3039;
            }
            class237.field4310 = class75.field1474;
        }
        field1918++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)Lhj;")
    public static final class69 method758(int arg0, boolean arg1) {
        field1914++;
        if (!arg1) {
            method757(true);
        }
        class69 var2 = new class69();
        var2.field1351 = new byte[arg0];
        var2.field1331 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method759(int arg0) {
        field1932 = null;
        field1935 = null;
        field1916 = null;
        if (arg0 != 1624470562) {
            method756(4, -4, -100, (byte) -8, -92, -75, 77, -125);
        }
        field1920 = null;
        field1915 = null;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Lbb;")
    public final class88 method760(int arg0) {
        field1933++;
        if (this.field1930 > 0 && this.field1922[this.field1930 - 1] != this.field1925) {
            class88 var2 = this.field1925;
            this.field1925 = var2.field1677;
            return var2;
        } else if (arg0 == -15725) {
            while (this.field1930 < this.field1919) {
                class88 var3 = this.field1922[this.field1930++].field1677;
                if (this.field1922[this.field1930 - 1] != var3) {
                    this.field1925 = var3.field1677;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(JILbb;)V")
    public final void method761(long arg0, int arg1, class88 arg2) {
        field1927++;
        if (arg2.field1676 != null) {
            arg2.method632(arg1 - 8296);
        }
        class88 var5 = this.field1922[(int) ((long) (this.field1919 - 1) & arg0)];
        arg2.field1685 = arg0;
        arg2.field1677 = var5;
        arg2.field1676 = var5.field1676;
        if (arg1 == 0) {
            arg2.field1676.field1677 = arg2;
            arg2.field1677.field1676 = arg2;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
    public class103(int arg0) {
        this.field1922 = new class88[arg0];
        this.field1919 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class88 var3 = this.field1922[var2] = new class88();
            var3.field1677 = var3;
            var3.field1676 = var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)I")
    public final int method762(boolean arg0) {
        int var2 = 0;
        if (arg0) {
            field1932 = null;
        }
        field1923++;
        for (int var3 = 0; var3 < this.field1919; var3++) {
            class88 var4 = this.field1922[var3];
            for (class88 var5 = var4.field1677; var5 != var4; var5 = var5.field1677) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public final void method763(int arg0) {
        field1929++;
        for (int var2 = 0; var2 < this.field1919; var2++) {
            class88 var4 = this.field1922[var2];
            while (true) {
                class88 var5 = var4.field1677;
                if (var4 == var5) {
                    break;
                }
                var5.method632(-8296);
            }
        }
        int var3 = 7 % ((arg0 - 56) / 63);
        this.field1925 = null;
        this.field1924 = null;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)Lbb;")
    public final class88 method764(boolean arg0) {
        field1913++;
        if (!arg0) {
            return null;
        } else if (this.field1924 == null) {
            return null;
        } else {
            class88 var2 = this.field1922[(int) ((long) (this.field1919 - 1) & this.field1917)];
            while (this.field1924 != var2) {
                if (this.field1924.field1685 == this.field1917) {
                    class88 var3 = this.field1924;
                    this.field1924 = this.field1924.field1677;
                    return var3;
                }
                this.field1924 = this.field1924.field1677;
            }
            this.field1924 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
    public final int method765(byte arg0) {
        if (arg0 != 74) {
            field1932 = null;
        }
        field1921++;
        return this.field1919;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Z")
    public static final boolean method766(int arg0, byte arg1) {
        field1934++;
        if (arg1 < 93) {
            method757(true);
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIB)I")
    public static final int method767(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -63) {
            field1916 = null;
        }
        field1931++;
        int var5 = 65536 - class178.field3232[arg2 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Lbb;")
    public final class88 method768(byte arg0) {
        if (arg0 <= 26) {
            this.method764(true);
        }
        field1912++;
        this.field1930 = 0;
        return this.method760(-15725);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZJ)Lbb;")
    public final class88 method769(boolean arg0, long arg1) {
        this.field1917 = arg1;
        field1926++;
        class88 var4 = this.field1922[(int) (arg1 & (long) (this.field1919 - 1))];
        for (this.field1924 = var4.field1677; this.field1924 != var4; this.field1924 = this.field1924.field1677) {
            if (this.field1924.field1685 == arg1) {
                class88 var5 = this.field1924;
                this.field1924 = this.field1924.field1677;
                return var5;
            }
        }
        if (!arg0) {
            field1915 = null;
        }
        this.field1924 = null;
        return null;
    }
}
