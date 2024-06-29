import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class74 extends class5 {

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "Z")
    public boolean field1865 = false;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public int field1863 = -1;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "[I")
    private int[] field1862 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "[I")
    private int[] field1879 = new int[6];

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "[I")
    private int[] field1877 = new int[6];

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "Ldb;")
    public static class21 field1866 = new class21(4096);

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "[[B")
    public static byte[][] field1870 = new byte[50][];

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "Lfc;")
    public static class34 field1878 = new class34(64);

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "I")
    public static int field1882 = 2;

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "Lhb;")
    private static class44 field1884 = class102.method810("Enter message to send to ", -28606);

    @OriginalMember(owner = "client!mb", name = "ub", descriptor = "Lhb;")
    public static class44 field1887 = field1884;

    @OriginalMember(owner = "client!mb", name = "tb", descriptor = "I")
    public static int field1886 = -1;

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1883 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!mb", name = "vb", descriptor = "Lhb;")
    public static class44 field1888 = class102.method810("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", -28606);

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!mb", name = "sb", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!mb", name = "wb", descriptor = "Z")
    public static boolean field1889;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "[I")
    private int[] field1876;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)Lde;", line = 3)
    public final class24 method619(boolean arg0) {
        field1873++;
        class24[] var2 = new class24[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1862[var4] != -1) {
                var2[var3++] = class24.method183(class129.field3108, this.field1862[var4], 0);
            }
        }
        class24 var5 = new class24(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field1879[var6] != 0; var6++) {
            var5.method192(this.field1879[var6], this.field1877[var6]);
        }
        return arg0 ? var5 : null;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V", line = 46)
    public static final void method620(int arg0) {
        class29.field711 = true;
        field1864++;
        int var1 = -70 % ((arg0 + 9) / 54);
        class81.field2085 = true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII[B[Lpb;IIII)V", line = 58)
    public static final void method621(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class92[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != -9) {
            field1883 = null;
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg6 + var10 > 0 && arg6 + var10 < 103 && arg9 + var15 > 0 && arg9 + var15 < 103) {
                    arg5[arg0].field2338[arg6 + var10][arg9 + var15] = class118.method914(arg5[arg0].field2338[arg6 + var10][arg9 + var15], -16777217);
                }
            }
        }
        class131 var11 = new class131(arg4);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 == var12 && arg3 <= var13 && var13 < arg3 + 8 && arg8 <= var14 && var14 < arg8 + 8) {
                        class97.method772(arg0, arg9 + class71.method603(var14 & 0x7, arg2, var13 & 0x7, arg7 ^ 0xFFFFFF9E), 0, 0, (byte) 115, arg2, class52.method494(var14 & 0x7, arg2, arg7 + 16, var13 & 0x7) + arg6, var11);
                    } else {
                        class97.method772(0, -1, 0, 0, (byte) -45, 0, -1, var11);
                    }
                }
            }
        }
        field1860++;
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V", line = 121)
    public static final void method622(int arg0) {
        field1875++;
        if (arg0 != 24143) {
            method628((byte) -123, true, null, null);
        }
        while (class53.field1304.method706(class14.field275, 8) >= 11) {
            int var1 = class53.field1304.method700(11, arg0 ^ 0x5E3A);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class82.field2110[var1] == null) {
                class82.field2110[var1] = new class103();
                if (class105.field2690[var1] != null) {
                    class82.field2110[var1].method812((byte) 79, class105.field2690[var1]);
                }
                var2 = true;
            }
            class118.field2913[class125.field3020++] = var1;
            class103 var3 = class82.field2110[var1];
            var3.field1345 = class2.field73;
            int var4 = class53.field1304.method700(1, arg0 ^ 0xFFFFA1FA);
            if (var4 == 1) {
                class96.field2446[class81.field2080++] = var1;
            }
            int var5 = class53.field1304.method700(5, arg0 - 24043);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class53.field1304.method700(5, 106);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class34.field835[class53.field1304.method700(3, arg0 ^ 0xFFFFA1CD)];
            if (var2) {
                var3.field1419 = var7;
            }
            int var8 = class53.field1304.method700(1, arg0 ^ 0x5E25);
            var3.method509(8613, var8 == 1, class72.field1820.field1350[0] + var5, class72.field1820.field1355[0] - -var6);
        }
        class53.field1304.method704(-120);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLwd;)V", line = 187)
    public final void method623(byte arg0, class131 arg1) {
        if (arg0 < 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method971(true);
            if (var3 == 0) {
                field1880++;
                return;
            }
            this.method627(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 212)
    public static final void method624(int arg0, int arg1) {
        field1874++;
        if (!class94.method748(9902, arg1)) {
            return;
        }
        int var2 = -77 % ((-arg0 - 27) / 32);
        class72[] var3 = class113.field2777[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class72 var5 = var3[var4];
            if (var5 != null) {
                var5.field1796 = 0;
                var5.field1832 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I", line = 242)
    public static final int method625(int arg0, int arg1, int arg2) {
        field1867++;
        if (arg1 > -12) {
            method625(-66, -17, 118);
        }
        int var3 = class15.method104(4, true, arg2 + 91923, arg0 - -45365) + (class15.method104(2, true, arg2 + 37821, arg0 + 10294) - 128 >> 1) + (class15.method104(1, true, arg2, arg0) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)Z", line = 277)
    public final boolean method626(int arg0) {
        field1885++;
        if (this.field1876 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1876.length; var3++) {
            if (!class129.field3108.method875(171, this.field1876[var3], 0)) {
                var2 = false;
            }
        }
        if (arg0 != 4732) {
            method624(-66, 93);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILwd;Z)V", line = 326)
    private final void method627(int arg0, class131 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field1863 = arg1.method971(arg2);
        } else if (arg0 == 2) {
            int var4 = arg1.method971(true);
            this.field1876 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1876[var5] = arg1.method1001(65280);
            }
        } else if (arg0 == 3) {
            this.field1865 = true;
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field1879[arg0 - 40] = arg1.method1001(65280);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field1877[arg0 - 50] = arg1.method1001(65280);
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1862[arg0 - 60] = arg1.method1001(65280);
        }
        field1881++;
        if (!arg2) {
            field1887 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZLtd;Ltd;)V", line = 382)
    public static final void method628(byte arg0, boolean arg1, class116 arg2, class116 arg3) {
        if (arg0 != -98) {
            return;
        }
        class51.field1243 = arg3;
        class98.field2482 = arg1;
        class1.field13 = arg2;
        field1861++;
        class95.field2417 = class1.field13.method886(0, 10);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILtd;I)Z", line = 396)
    public static final boolean method629(int arg0, int arg1, class116 arg2, int arg3) {
        field1868++;
        if (arg0 != -12890) {
            method625(-41, -109, 65);
        }
        byte[] var4 = arg2.method892(arg1, arg3, false);
        if (var4 == null) {
            return false;
        } else {
            class49.method458(arg0 + 43576, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Z", line = 420)
    public final boolean method630(byte arg0) {
        field1869++;
        boolean var2 = true;
        int var3 = -49 % ((-arg0 - 14) / 56);
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1862[var4] != -1 && !class129.field3108.method875(171, this.field1862[var4], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)Lde;", line = 451)
    public final class24 method631(int arg0) {
        field1871++;
        if (this.field1876 == null) {
            return null;
        }
        class24[] var2 = new class24[this.field1876.length];
        int var3 = 37 % ((arg0 - 80) / 37);
        for (int var4 = 0; var4 < this.field1876.length; var4++) {
            var2[var4] = class24.method183(class129.field3108, this.field1876[var4], 0);
        }
        class24 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class24(var2, var2.length);
        }
        for (int var6 = 0; var6 < 6 && this.field1879[var6] != 0; var6++) {
            var5.method192(this.field1879[var6], this.field1877[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "(I)V", line = 492)
    public static void method632(int arg0) {
        field1866 = null;
        field1888 = null;
        if (arg0 != -45365) {
            field1866 = null;
        }
        field1870 = null;
        field1887 = null;
        field1884 = null;
        field1878 = null;
        field1883 = null;
    }
}
