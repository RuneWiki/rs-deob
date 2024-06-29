import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class113 {

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    private int field42 = -1;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public int field46 = -1;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    private int field56 = 0;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "Z")
    public boolean field57 = true;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    public int field61 = -1;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
    public int field73 = -1;

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "I")
    public int field77 = -1;

    @OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
    public int field79 = -1;

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "Z")
    public boolean field70 = true;

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "Z")
    public boolean field66 = false;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    public int field60 = -1;

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "[Lcd;")
    public class23[] field71 = new class23[5];

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
    public int field64 = -1;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
    public int field65 = -1;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
    public int field72 = 32;

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "I")
    private int field67 = 128;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
    private int field75 = 128;

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "I")
    public int field69 = 1;

    @OriginalMember(owner = "client!ac", name = "qb", descriptor = "I")
    private int field80 = 0;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
    public int field62 = -1;

    @OriginalMember(owner = "client!ac", name = "sb", descriptor = "Z")
    public boolean field82 = true;

    @OriginalMember(owner = "client!ac", name = "rb", descriptor = "I")
    private int field81 = -1;

    @OriginalMember(owner = "client!ac", name = "ub", descriptor = "Lcd;")
    public class23 field84 = class165.field3286;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field55 = 2301979;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "J")
    public static volatile long field52 = 0L;

    @OriginalMember(owner = "client!ac", name = "ob", descriptor = "Lcd;")
    public static class23 field78 = class54.method414("Mitglieder)2Welt", -1);

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ac", name = "vb", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "Lia;")
    public static class73 field48;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "[I")
    private int[] field51;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "[I")
    public int[] field59;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "[I")
    private int[] field63;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "[S")
    private short[] field43;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "[S")
    private short[] field47;

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "[S")
    private short[] field76;

    @OriginalMember(owner = "client!ac", name = "tb", descriptor = "[S")
    private short[] field83;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lva;I)V")
    public final void method16(class189 arg0, int arg1) {
        field50++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method1202(arg1 ^ 0x6A);
            if (var3 == 0) {
                return;
            }
            this.method24(var3, (byte) 99, arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        field54++;
        if (!arg0) {
            this.method26((byte) -123);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILke;Lke;II)Lbh;")
    public final class18 method18(int arg0, class94 arg1, class94 arg2, int arg3, int arg4) {
        field74++;
        if (arg3 != -15497) {
            method25(35);
        }
        if (this.field59 != null) {
            class4 var6 = this.method26((byte) 5);
            return var6 == null ? null : var6.method18(arg0, arg1, arg2, -15497, arg4);
        }
        class18 var7 = (class18) class154.field3074.method995(arg3 + 15608, (long) this.field49);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field51.length; var9++) {
                if (!class97.field2072.method639(this.field51[var9], 0, 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class188[] var10 = new class188[this.field51.length];
            for (int var11 = 0; var11 < this.field51.length; var11++) {
                var10[var11] = class188.method1158(class97.field2072, this.field51[var11], 0);
            }
            class188 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class188(var10, var10.length);
            }
            if (this.field76 != null) {
                for (int var13 = 0; var13 < this.field76.length; var13++) {
                    var12.method1173(this.field76[var13], this.field83[var13]);
                }
            }
            if (this.field47 != null) {
                for (int var14 = 0; var14 < this.field47.length; var14++) {
                    var12.method1174(this.field47[var14], this.field43[var14]);
                }
            }
            var7 = var12.method1172(this.field80 + 64, this.field56 + 850, -30, -50, -30, true, true);
            class154.field3074.method990(var7, (long) this.field49, arg3 ^ 0xFFFFC338);
        }
        class18 var15;
        if (arg1 != null && arg2 != null) {
            var15 = arg1.method620(arg2, arg0, arg4, 18454, var7);
        } else if (arg1 != null) {
            var15 = arg1.method615(var7, 2, arg4);
        } else if (arg2 == null) {
            var15 = var7.method106(true);
        } else {
            var15 = arg2.method615(var7, arg3 ^ 0xFFFFC375, arg0);
        }
        if (this.field75 != 128 || this.field67 != 128) {
            var15.method118(this.field75, this.field67, this.field75);
        }
        return var15;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lbb;I)V")
    public static final void method19(class12 arg0, int arg1) {
        field58++;
        if (class15.field339 == arg0.field263 || arg0.field288 == -1 || arg0.field252 != 0 || arg0.field242 + 1 > class20.method128(arg0.field288, (byte) 103).field1992[arg0.field220]) {
            int var2 = arg0.field263 - arg0.field223;
            int var3 = class15.field339 - arg0.field223;
            int var4 = arg0.field267 * 128 + arg0.field231 * 64;
            int var5 = arg0.field231 * 64 + arg0.field214 * 128;
            int var6 = arg0.field239 * 128 + arg0.field231 * 64;
            int var7 = arg0.field265 * 128 + arg0.field231 * 64;
            arg0.field277 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field215 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg1 != -15021) {
            field52 = -60L;
        }
        if (arg0.field225 == 0) {
            arg0.field227 = 1024;
        }
        arg0.field284 = 0;
        if (arg0.field225 == 1) {
            arg0.field227 = 1536;
        }
        if (arg0.field225 == 2) {
            arg0.field227 = 0;
        }
        if (arg0.field225 == 3) {
            arg0.field227 = 512;
        }
        arg0.field264 = arg0.field227;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIB)V")
    public static final void method20(int arg0, int arg1, int arg2, byte arg3) {
        class47 var4 = class15.method79(arg2, arg0, -12910);
        field40++;
        if (var4 != null && var4.field1093 != null) {
            class144 var5 = new class144();
            var5.field2939 = var4;
            var5.field2942 = var4.field1093;
            class50.method391(-1142686098, var5);
        }
        class191.field3789 = arg2;
        class73.field1660 = true;
        class166.field3312 = arg1;
        class167.field3331 = arg0;
        if (arg3 == 82) {
            class3.method12(var4, false);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static void method21(byte arg0) {
        if (arg0 != -91) {
            field78 = null;
        }
        field48 = null;
        field78 = null;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)Lv;")
    public final class188 method22(byte arg0) {
        field85++;
        if (this.field59 != null) {
            class4 var2 = this.method26((byte) 5);
            return var2 == null ? null : var2.method22((byte) -81);
        } else if (this.field63 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field63.length; var4++) {
                if (!class97.field2072.method639(this.field63[var4], 0, 0)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class188[] var5 = new class188[this.field63.length];
            for (int var6 = 0; var6 < this.field63.length; var6++) {
                var5[var6] = class188.method1158(class97.field2072, this.field63[var6], 0);
            }
            class188 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class188(var5, var5.length);
            }
            if (this.field76 != null) {
                for (int var8 = 0; var8 < this.field76.length; var8++) {
                    var7.method1173(this.field76[var8], this.field83[var8]);
                }
            }
            if (this.field47 != null) {
                for (int var9 = 0; var9 < this.field47.length; var9++) {
                    var7.method1174(this.field47[var9], this.field43[var9]);
                }
            }
            return arg0 == -81 ? var7 : null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lbb;B)V")
    public static final void method23(class12 arg0, byte arg1) {
        arg0.field276 = false;
        if (arg0.field250 != -1) {
            class94 var2 = class20.method128(arg0.field250, (byte) 95);
            if (var2 == null || var2.field1973 == null) {
                arg0.field250 = -1;
            } else {
                arg0.field279++;
                if (arg0.field285 < var2.field1973.length && var2.field1992[arg0.field285] < arg0.field279) {
                    arg0.field279 = 1;
                    arg0.field285++;
                    class60.method457(var2, arg0.field215, class134.field2790 == arg0, arg0.field277, false, arg0.field285);
                }
                if (var2.field1973.length <= arg0.field285) {
                    arg0.field279 = 0;
                    arg0.field285 = 0;
                    class60.method457(var2, arg0.field215, class134.field2790 == arg0, arg0.field277, false, arg0.field285);
                }
            }
        }
        field41++;
        if (arg0.field287 != -1 && arg0.field260 <= class15.field339) {
            if (arg0.field278 < 0) {
                arg0.field278 = 0;
            }
            int var3 = class82.method553((byte) 6, arg0.field287).field636;
            if (var3 == -1) {
                arg0.field287 = -1;
            } else {
                class94 var4 = class20.method128(var3, (byte) 77);
                if (var4 == null || var4.field1973 == null) {
                    arg0.field287 = -1;
                } else {
                    arg0.field237++;
                    if (var4.field1973.length > arg0.field278 && arg0.field237 > var4.field1992[arg0.field278]) {
                        arg0.field237 = 1;
                        arg0.field278++;
                        class60.method457(var4, arg0.field215, class134.field2790 == arg0, arg0.field277, false, arg0.field278);
                    }
                    if (var4.field1973.length <= arg0.field278 && (arg0.field278 < 0 || arg0.field278 >= var4.field1973.length)) {
                        arg0.field287 = -1;
                    }
                }
            }
        }
        if (arg0.field288 != -1 && arg0.field252 <= 1) {
            class94 var5 = class20.method128(arg0.field288, (byte) 102);
            if (var5.field1984 == 1 && arg0.field236 > 0 && class15.field339 >= arg0.field223 && arg0.field263 < class15.field339) {
                arg0.field252 = 1;
                return;
            }
        }
        if (arg0.field288 != -1 && arg0.field252 == 0) {
            class94 var6 = class20.method128(arg0.field288, (byte) 22);
            if (var6 == null || var6.field1973 == null) {
                arg0.field288 = -1;
            } else {
                arg0.field242++;
                if (var6.field1973.length > arg0.field220 && var6.field1992[arg0.field220] < arg0.field242) {
                    arg0.field242 = 1;
                    arg0.field220++;
                    class60.method457(var6, arg0.field215, class134.field2790 == arg0, arg0.field277, false, arg0.field220);
                }
                if (var6.field1973.length <= arg0.field220) {
                    arg0.field273++;
                    arg0.field220 -= var6.field1978;
                    if (var6.field1983 <= arg0.field273) {
                        arg0.field288 = -1;
                    } else if (arg0.field220 >= 0 && var6.field1973.length > arg0.field220) {
                        class60.method457(var6, arg0.field215, class134.field2790 == arg0, arg0.field277, false, arg0.field220);
                    } else {
                        arg0.field288 = -1;
                    }
                }
                arg0.field276 = var6.field1976;
            }
        }
        int var7 = -123 / ((12 - arg1) / 47);
        if (arg0.field252 > 0) {
            arg0.field252--;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLva;)V")
    private final void method24(int arg0, byte arg1, class189 arg2) {
        field53++;
        int var4 = -91 / ((arg1 - 53) / 35);
        if (arg0 == 1) {
            int var13 = arg2.method1202(106);
            this.field51 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field51[var14] = arg2.method1197(-1);
            }
        } else if (arg0 == 2) {
            this.field84 = arg2.method1193((byte) -70);
        } else if (arg0 == 12) {
            this.field69 = arg2.method1202(-44);
        } else if (arg0 == 13) {
            this.field60 = arg2.method1197(-1);
        } else if (arg0 == 14) {
            this.field77 = arg2.method1197(-1);
        } else if (arg0 == 15) {
            this.field62 = arg2.method1197(-1);
        } else if (arg0 == 16) {
            this.field46 = arg2.method1197(-1);
        } else if (arg0 == 17) {
            this.field77 = arg2.method1197(-1);
            this.field65 = arg2.method1197(-1);
            this.field64 = arg2.method1197(-1);
            this.field61 = arg2.method1197(-1);
            return;
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field71[arg0 - 30] = arg2.method1193((byte) -70);
            if (this.field71[arg0 - 30].method146(124, class2.field26)) {
                this.field71[arg0 - 30] = null;
                return;
            }
        } else if (arg0 == 40) {
            int var11 = arg2.method1202(114);
            this.field83 = new short[var11];
            this.field76 = new short[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field76[var12] = (short) arg2.method1197(-1);
                this.field83[var12] = (short) arg2.method1197(-1);
            }
            return;
        } else if (arg0 == 41) {
            int var5 = arg2.method1202(-109);
            this.field43 = new short[var5];
            this.field47 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field47[var6] = (short) arg2.method1197(-1);
                this.field43[var6] = (short) arg2.method1197(-1);
            }
            return;
        } else if (arg0 == 60) {
            int var7 = arg2.method1202(-43);
            this.field63 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field63[var8] = arg2.method1197(-1);
            }
            return;
        } else if (arg0 == 93) {
            this.field57 = false;
            return;
        } else if (arg0 == 95) {
            this.field79 = arg2.method1197(-1);
            return;
        } else if (arg0 == 97) {
            this.field75 = arg2.method1197(-1);
            return;
        } else if (arg0 == 98) {
            this.field67 = arg2.method1197(-1);
            return;
        } else if (arg0 == 99) {
            this.field66 = true;
            return;
        } else if (arg0 == 100) {
            this.field80 = arg2.method1204(true);
            return;
        } else if (arg0 == 101) {
            this.field56 = arg2.method1204(true) * 5;
            return;
        } else if (arg0 == 102) {
            this.field73 = arg2.method1197(-1);
            return;
        } else {
            if (arg0 == 103) {
                this.field72 = arg2.method1197(-1);
            } else if (arg0 == 106) {
                this.field81 = arg2.method1197(-1);
                if (this.field81 == 65535) {
                    this.field81 = -1;
                }
                this.field42 = arg2.method1197(-1);
                if (this.field42 == 65535) {
                    this.field42 = -1;
                }
                int var9 = arg2.method1202(-103);
                this.field59 = new int[var9 + 1];
                for (int var10 = 0; var10 <= var9; var10++) {
                    this.field59[var10] = arg2.method1197(-1);
                    if (this.field59[var10] == 65535) {
                        this.field59[var10] = -1;
                    }
                }
                return;
            } else if (arg0 == 107) {
                this.field70 = false;
                return;
            } else if (arg0 == 109) {
                this.field82 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)Z")
    public static final boolean method25(int arg0) {
        field45++;
        long var1 = class30.method224((byte) 95);
        if (arg0 >= -97) {
            method23(null, (byte) -41);
        }
        int var3 = (int) (var1 - class57.field1324);
        if (var3 > 200) {
            var3 = 200;
        }
        class44.field922 += var3;
        class57.field1324 = var1;
        if (class10.field196 == 0 && class84.field1789 == 0 && class31.field677 == 0 && class145.field2973 == 0) {
            return true;
        } else if (class61.field1418 == null) {
            return false;
        } else {
            try {
                if (class44.field922 > 30000) {
                    throw new IOException();
                }
                while (class84.field1789 < 20 && class145.field2973 > 0) {
                    class111 var4 = (class111) class204.field4014.method264(35);
                    class189 var5 = new class189(4);
                    var5.method1180(1, (byte) 56);
                    var5.method1219((int) var4.field3317, false);
                    class61.field1418.method495(4, var5.field3753, (byte) 112, 0);
                    class23.field499.method262(var4.field3317, -80, var4);
                    class145.field2973--;
                    class84.field1789++;
                }
                while (class10.field196 < 20 && class31.field677 > 0) {
                    class111 var6 = (class111) class23.field514.method429(true);
                    class189 var7 = new class189(4);
                    var7.method1180(0, (byte) 76);
                    var7.method1219((int) var6.field3317, false);
                    class61.field1418.method495(4, var7.field3753, (byte) 32, 0);
                    var6.method724(true);
                    class60.field1393.method262(var6.field3317, -122, var6);
                    class31.field677--;
                    class10.field196++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class61.field1418.method500((byte) -109);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class44.field922 = 0;
                    byte var10 = 0;
                    if (class157.field3131 == null) {
                        var10 = 8;
                    } else if (class180.field3568 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class10.field202.field3753.length - class157.field3131.field2349;
                        int var12 = 512 - class180.field3568;
                        if (var11 - class10.field202.field3752 < var12) {
                            var12 = var11 - class10.field202.field3752;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class61.field1418.method499(class10.field202.field3752, var12, true, class10.field202.field3753);
                        if (class138.field2849 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class10.field202.field3753[class10.field202.field3752 + var13] = (byte) class199.method1287(class10.field202.field3753[class10.field202.field3752 + var13], class138.field2849);
                            }
                        }
                        class180.field3568 += var12;
                        class10.field202.field3752 += var12;
                        if (class10.field202.field3752 == var11) {
                            if (class157.field3131.field3317 == 16711935L) {
                                class44.field924 = class10.field202;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class58 var16 = class7.field140[var15];
                                    if (var16 != null) {
                                        class44.field924.field3752 = var15 * 8 + 5;
                                        int var17 = class44.field924.method1190(-4);
                                        int var18 = class44.field924.method1190(-4);
                                        var16.method444(-47, var17, var18);
                                    }
                                }
                            } else {
                                class113.field2385.reset();
                                class113.field2385.update(class10.field202.field3753, 0, var11);
                                int var14 = (int) class113.field2385.getValue();
                                if (class157.field3131.field2350 != var14) {
                                    try {
                                        class61.field1418.method501(false);
                                    } catch (Exception var30) {
                                    }
                                    class138.field2849 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class158.field3159++;
                                    class61.field1418 = null;
                                    return false;
                                }
                                class39.field846 = 0;
                                class158.field3159 = 0;
                                class157.field3131.field2342.method445((class157.field3131.field3317 & 0xFF0000L) == 16711680L, (int) (class157.field3131.field3317 & 0xFFFFL), class205.field4033, -2, class10.field202.field3753);
                            }
                            class157.field3131.method1018(15789);
                            class180.field3568 = 0;
                            if (class205.field4033) {
                                class84.field1789--;
                            } else {
                                class10.field196--;
                            }
                            class157.field3131 = null;
                            class10.field202 = null;
                        } else {
                            if (class180.field3568 != 512) {
                                break;
                            }
                            class180.field3568 = 0;
                        }
                    } else {
                        int var19 = var10 - class28.field595.field3752;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class61.field1418.method499(class28.field595.field3752, var19, true, class28.field595.field3753);
                        if (class138.field2849 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class28.field595.field3753[class28.field595.field3752 + var20] = (byte) class199.method1287(class28.field595.field3753[class28.field595.field3752 + var20], class138.field2849);
                            }
                        }
                        class28.field595.field3752 += var19;
                        if (class28.field595.field3752 < var10) {
                            break;
                        }
                        if (class157.field3131 == null) {
                            class28.field595.field3752 = 0;
                            int var21 = class28.field595.method1202(-63);
                            int var22 = class28.field595.method1197(-1);
                            int var23 = class28.field595.method1202(113);
                            int var24 = class28.field595.method1190(-4);
                            long var25 = (long) ((var21 << 16) + var22);
                            class111 var27 = (class111) class23.field499.method260(var25, (byte) 28);
                            class205.field4033 = true;
                            if (var27 == null) {
                                var27 = (class111) class60.field1393.method260(var25, (byte) 28);
                                class205.field4033 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class157.field3131 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class10.field202 = new class189(class157.field3131.field2349 + var24 + var28);
                            class10.field202.method1180(var23, (byte) 78);
                            class10.field202.method1186(var24, -12);
                            class28.field595.field3752 = 0;
                            class180.field3568 = 8;
                        } else if (class180.field3568 == 0) {
                            if (class28.field595.field3753[0] == -1) {
                                class28.field595.field3752 = 0;
                                class180.field3568 = 1;
                            } else {
                                class157.field3131 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class61.field1418.method501(false);
                } catch (Exception var29) {
                }
                class39.field846++;
                class61.field1418 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)Lac;")
    public final class4 method26(byte arg0) {
        field68++;
        if (arg0 != 5) {
            return null;
        }
        int var2 = -1;
        if (this.field81 != -1) {
            var2 = client.method209(0, this.field81);
        } else if (this.field42 != -1) {
            var2 = class54.field1288[this.field42];
        }
        return var2 < 0 || var2 >= this.field59.length || this.field59[var2] == -1 ? null : class117.method741((byte) 105, this.field59[var2]);
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)Z")
    public final boolean method27(byte arg0) {
        if (arg0 != -4) {
            return true;
        }
        field44++;
        if (this.field59 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field81 != -1) {
            var2 = client.method209(arg0 + 4, this.field81);
        } else if (this.field42 != -1) {
            var2 = class54.field1288[this.field42];
        }
        return var2 >= 0 && var2 < this.field59.length && this.field59[var2] != -1;
    }
}
