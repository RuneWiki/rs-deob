import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class45 extends class30 {

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public int field908 = -1;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    private int field907 = 128;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "Z")
    public boolean field916 = false;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Z")
    public boolean field918 = true;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public int field906 = -1;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "I")
    public int field925 = -1;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "[Lrd;")
    public class173[] field930 = new class173[5];

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "S")
    public short field932 = 0;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    private int field912 = 0;

    @OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
    public int field933 = -1;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
    public int field923 = 32;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "Z")
    public boolean field931 = true;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "I")
    private int field924 = 128;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
    public int field929 = 1;

    @OriginalMember(owner = "client!ed", name = "pb", descriptor = "I")
    public int field937 = -1;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "Z")
    public boolean field926 = true;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    private int field914 = 0;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public int field915 = -1;

    @OriginalMember(owner = "client!ed", name = "xb", descriptor = "I")
    public int field945 = -1;

    @OriginalMember(owner = "client!ed", name = "tb", descriptor = "I")
    public int field941 = -1;

    @OriginalMember(owner = "client!ed", name = "yb", descriptor = "I")
    public int field946 = -1;

    @OriginalMember(owner = "client!ed", name = "Cb", descriptor = "S")
    public short field950 = 0;

    @OriginalMember(owner = "client!ed", name = "wb", descriptor = "I")
    private int field944 = -1;

    @OriginalMember(owner = "client!ed", name = "vb", descriptor = "Lrd;")
    public class173 field943 = class80.field1579;

    @OriginalMember(owner = "client!ed", name = "rb", descriptor = "I")
    private int field939 = -1;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "[I")
    public static int[] field913 = new int[2000];

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "Lrd;")
    public static class173 field917 = class133.method843("Spiel)2Engine wird gestartet)3)3)3", 47);

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field919 = 0;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
    public static int field920 = 0;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ed", name = "ub", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ed", name = "zb", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ed", name = "Bb", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ed", name = "Db", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "[I")
    private int[] field921;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "[I")
    public int[] field922;

    @OriginalMember(owner = "client!ed", name = "mb", descriptor = "[I")
    private int[] field934;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "[S")
    private short[] field909;

    @OriginalMember(owner = "client!ed", name = "nb", descriptor = "[S")
    private short[] field935;

    @OriginalMember(owner = "client!ed", name = "sb", descriptor = "[S")
    private short[] field940;

    @OriginalMember(owner = "client!ed", name = "Ab", descriptor = "[S")
    private short[] field948;

    @OriginalMember(owner = "client!ed", name = "qb", descriptor = "[[[B")
    public static byte[][][] field938;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)V")
    public static void method313(byte arg0) {
        field913 = null;
        int var1 = 119 / ((-arg0 - 81) / 39);
        field917 = null;
        field938 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBLri;)Lvf;")
    public final class213 method314(int arg0, byte arg1, class178 arg2) {
        if (arg1 != 74) {
            field919 = -105;
        }
        field949++;
        if (this.field922 != null) {
            class45 var4 = this.method318((byte) 92);
            return var4 == null ? null : var4.method314(arg0, (byte) 74, arg2);
        } else if (this.field934 == null) {
            return null;
        } else {
            class213 var5 = (class213) class209.field4062.method46((long) this.field927, arg1 ^ 0x679E);
            if (var5 == null) {
                boolean var6 = false;
                for (int var7 = 0; var7 < this.field934.length; var7++) {
                    if (!class110.field2043.method134(true, this.field934[var7], 0)) {
                        var6 = true;
                    }
                }
                if (var6) {
                    return null;
                }
                class141[] var8 = new class141[this.field934.length];
                for (int var9 = 0; var9 < this.field934.length; var9++) {
                    var8[var9] = class141.method900(class110.field2043, this.field934[var9], 0);
                }
                class141 var10;
                if (var8.length == 1) {
                    var10 = var8[0];
                } else {
                    var10 = new class141(var8, var8.length);
                }
                if (this.field948 != null) {
                    for (int var11 = 0; var11 < this.field948.length; var11++) {
                        var10.method890(this.field948[var11], this.field935[var11]);
                    }
                }
                if (this.field909 != null) {
                    for (int var12 = 0; var12 < this.field909.length; var12++) {
                        var10.method888(this.field909[var12], this.field940[var12]);
                    }
                }
                var5 = var10.method897(64, 768, -50, -10, -50, true, true);
                class209.field4062.method52(arg1 ^ 0xFFFFF24B, var5, (long) this.field927);
            }
            if (arg2 != null) {
                var5 = arg2.method1203(var5, 65535, arg0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lri;ILri;II)Lvf;")
    public final class213 method315(class178 arg0, int arg1, class178 arg2, int arg3, int arg4) {
        field942++;
        if (this.field922 != null) {
            class45 var6 = this.method318((byte) 92);
            return var6 == null ? null : var6.method315(arg0, arg1, arg2, arg3, -1);
        }
        class213 var7 = (class213) class73.field1429.method46((long) this.field927, 26580);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field921.length; var9++) {
                if (!class110.field2043.method134(true, this.field921[var9], 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class141[] var10 = new class141[this.field921.length];
            for (int var11 = 0; var11 < this.field921.length; var11++) {
                var10[var11] = class141.method900(class110.field2043, this.field921[var11], 0);
            }
            class141 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class141(var10, var10.length);
            }
            if (this.field948 != null) {
                for (int var13 = 0; var13 < this.field948.length; var13++) {
                    var12.method890(this.field948[var13], this.field935[var13]);
                }
            }
            if (this.field909 != null) {
                for (int var14 = 0; var14 < this.field909.length; var14++) {
                    var12.method888(this.field909[var14], this.field940[var14]);
                }
            }
            var7 = var12.method897(this.field914 + 64, this.field912 + 850, -30, -50, -30, true, true);
            class73.field1429.method52(arg4 - 3582, var7, (long) this.field927);
        }
        if (arg4 != -1) {
            method313((byte) -56);
        }
        class213 var15;
        if (arg2 != null && arg0 != null) {
            var15 = arg2.method1201(arg3, arg0, arg1, (byte) -44, var7);
        } else if (arg2 != null) {
            var15 = arg2.method1193(arg3, var7, (byte) 74);
        } else if (arg0 == null) {
            var15 = var7.method629(true);
        } else {
            var15 = arg0.method1193(arg1, var7, (byte) 123);
        }
        if (this.field907 != 128 || this.field924 != 128) {
            var15.method1395(this.field907, this.field924, this.field907);
        }
        return var15;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lmb;I)V")
    public final void method316(class121 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method751((byte) 127);
            if (var3 == 0) {
                field910++;
                if (arg1 != 103) {
                    this.field933 = 43;
                    return;
                }
                return;
            }
            this.method321(var3, arg0, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)Z")
    public final boolean method317(int arg0) {
        field928++;
        if (this.field922 == null) {
            return true;
        }
        if (arg0 < 92) {
            this.method316(null, -110);
        }
        int var2 = -1;
        if (this.field939 != -1) {
            var2 = class105.method647(this.field939, (byte) 71);
        } else if (this.field944 != -1) {
            var2 = field913[this.field944];
        }
        return var2 >= 0 && this.field922.length > var2 && this.field922[var2] != -1;
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(B)Led;")
    public final class45 method318(byte arg0) {
        field947++;
        int var2 = -1;
        if (arg0 != 92) {
            return null;
        }
        if (this.field939 != -1) {
            var2 = class105.method647(this.field939, (byte) 71);
        } else if (this.field944 != -1) {
            var2 = field913[this.field944];
        }
        return var2 < 0 || this.field922.length <= var2 || this.field922[var2] == -1 ? null : class94.method593(this.field922[var2], (byte) -38);
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
    public final void method319(int arg0) {
        int var2 = 98 / ((arg0 + 44) / 57);
        field936++;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lrd;")
    public static final class173 method320(int arg0, int arg1) {
        field951++;
        class173 var2 = class93.method588(arg0, true);
        if (arg1 > -59) {
            return null;
        }
        for (int var3 = var2.method1153((byte) -128) - 3; var3 > 0; var3 -= 3) {
            var2 = class173.method1158(-3, new class173[] { var2.method1155(0, var3, (byte) 98), class80.field1575, var2.method1140(var3, (byte) 121) });
        }
        if (var2.method1153((byte) -128) > 9) {
            return class173.method1158(-3, new class173[] { class36.field781, var2.method1155(0, var2.method1153((byte) -128) - 8, (byte) 125), class183.field3597, class78.field1524, var2, class120.field2217 });
        } else if (var2.method1153((byte) -127) > 6) {
            return class173.method1158(-3, new class173[] { class217.field4206, var2.method1155(0, var2.method1153((byte) -128) - 4, (byte) 87), class169.field3259, class78.field1524, var2, class120.field2217 });
        } else {
            return class173.method1158(-3, new class173[] { class12.field198, var2, class148.field2833 });
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILmb;B)V")
    private final void method321(int arg0, class121 arg1, byte arg2) {
        int var4 = 79 % ((arg2 - 10) / 41);
        field911++;
        if (arg0 == 1) {
            int var13 = arg1.method751((byte) 86);
            this.field921 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field921[var14] = arg1.method755((byte) -70);
            }
        } else if (arg0 == 2) {
            this.field943 = arg1.method746(-19941);
        } else if (arg0 == 12) {
            this.field929 = arg1.method751((byte) 101);
        } else if (arg0 == 13) {
            this.field937 = arg1.method755((byte) -81);
        } else if (arg0 == 14) {
            this.field908 = arg1.method755((byte) -71);
        } else if (arg0 == 15) {
            this.field941 = arg1.method755((byte) -79);
        } else if (arg0 == 16) {
            this.field925 = arg1.method755((byte) -31);
        } else if (arg0 == 17) {
            this.field908 = arg1.method755((byte) -31);
            this.field915 = arg1.method755((byte) -29);
            this.field945 = arg1.method755((byte) -105);
            this.field946 = arg1.method755((byte) -68);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field930[arg0 - 30] = arg1.method746(-19941);
            if (this.field930[arg0 - 30].method1123(19, class64.field1268)) {
                this.field930[arg0 - 30] = null;
                return;
            }
        } else if (arg0 == 40) {
            int var5 = arg1.method751((byte) 99);
            this.field948 = new short[var5];
            this.field935 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field948[var6] = (short) arg1.method755((byte) -75);
                this.field935[var6] = (short) arg1.method755((byte) -38);
            }
            return;
        } else if (arg0 == 41) {
            int var11 = arg1.method751((byte) -111);
            this.field940 = new short[var11];
            this.field909 = new short[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field909[var12] = (short) arg1.method755((byte) -85);
                this.field940[var12] = (short) arg1.method755((byte) -89);
            }
        } else if (arg0 == 60) {
            int var9 = arg1.method751((byte) -67);
            this.field934 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field934[var10] = arg1.method755((byte) -87);
            }
            return;
        } else if (arg0 == 93) {
            this.field931 = false;
            return;
        } else if (arg0 == 95) {
            this.field933 = arg1.method755((byte) -112);
            return;
        } else if (arg0 == 97) {
            this.field907 = arg1.method755((byte) -26);
            return;
        } else if (arg0 == 98) {
            this.field924 = arg1.method755((byte) -124);
            return;
        } else if (arg0 == 99) {
            this.field916 = true;
            return;
        } else if (arg0 == 100) {
            this.field914 = arg1.method767(-88);
            return;
        } else if (arg0 == 101) {
            this.field912 = arg1.method767(-97) * 5;
            return;
        } else if (arg0 == 102) {
            this.field906 = arg1.method755((byte) -22);
            return;
        } else if (arg0 == 103) {
            this.field923 = arg1.method755((byte) -56);
            return;
        } else if (arg0 == 106) {
            this.field939 = arg1.method755((byte) -60);
            if (this.field939 == 65535) {
                this.field939 = -1;
            }
            this.field944 = arg1.method755((byte) -43);
            if (this.field944 == 65535) {
                this.field944 = -1;
            }
            int var7 = arg1.method751((byte) 111);
            this.field922 = new int[var7 + 1];
            for (int var8 = 0; var8 <= var7; var8++) {
                this.field922[var8] = arg1.method755((byte) -127);
                if (this.field922[var8] == 65535) {
                    this.field922[var8] = -1;
                }
            }
            return;
        } else {
            if (arg0 == 107) {
                this.field918 = false;
            } else if (arg0 == 109) {
                this.field926 = false;
                return;
            } else if (arg0 != 111) {
                if (arg0 == 113) {
                    arg1.method755((byte) -49);
                    arg1.method755((byte) -37);
                } else if (arg0 == 114) {
                    arg1.method767(-87);
                    arg1.method767(-81);
                    return;
                } else if (arg0 == 115) {
                    this.field932 = (short) (arg1.method751((byte) -73) * 4);
                    this.field950 = (short) (arg1.method751((byte) -65) * 4);
                    return;
                }
                return;
            }
            return;
        }
    }
}
