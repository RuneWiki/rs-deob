import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class43 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Loc;")
    public static class151 field876 = class137.method873(2, "Sprites geladen)3");

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field878 = 0;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Loc;")
    private static class151 field891 = class137.method873(2, "Too many connections from your address)3");

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Loc;")
    public static class151 field894 = field891;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Loc;")
    public static class151 field890 = class137.method873(2, ":duelfriend:");

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field882 = 0;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Loc;")
    public static class151 field895 = class137.method873(2, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "J")
    private long field877;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "J")
    private long field902;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Z")
    public static boolean field879;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Z")
    public boolean field896;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "[I")
    private int[] field892;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "[I")
    private int[] field901;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "[[I")
    public static int[][] field887;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "[[[I")
    public static int[][][] field883;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method303(int arg0) {
        field887 = null;
        field883 = null;
        if (arg0 != 0) {
            return;
        }
        field890 = null;
        field895 = null;
        field891 = null;
        field876 = null;
        field894 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([SI[Loc;II)V")
    public static final void method304(short[] arg0, int arg1, class151[] arg2, int arg3, int arg4) {
        field893++;
        if (arg4 != -8102) {
            method311(96, 119);
        }
        if (arg3 >= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg3;
        class151 var7 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var7;
        short var8 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var8;
        for (int var9 = arg3; var9 < arg1; var9++) {
            if (var7 == null || arg2[var9] != null && arg2[var9].method970(1289, var7) < (var9 & 0x1)) {
                class151 var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                short var11 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6++] = var11;
            }
        }
        arg2[arg1] = arg2[var6];
        arg2[var6] = var7;
        arg0[arg1] = arg0[var6];
        arg0[var6] = var8;
        method304(arg0, var6 - 1, arg2, arg3, arg4);
        method304(arg0, arg1, arg2, var6 + 1, -8102);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BIII)Z")
    public static final boolean method305(byte[] arg0, int arg1, int arg2, int arg3) {
        field897++;
        int var4 = 22 / ((61 - arg2) / 40);
        class229 var5 = new class229(arg0);
        boolean var6 = true;
        int var7 = -1;
        label68: while (true) {
            int var8 = var5.method1471(-3);
            if (var8 == 0) {
                return var6;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                int var14;
                class93 var17;
                do {
                    int var15;
                    int var16;
                    do {
                        do {
                            do {
                                do {
                                    while (var10) {
                                        int var18 = var5.method1440(19108);
                                        if (var18 == 0) {
                                            continue label68;
                                        }
                                        var5.method1475(255);
                                    }
                                    int var11 = var5.method1440(19108);
                                    if (var11 == 0) {
                                        continue label68;
                                    }
                                    var9 += var11 - 1;
                                    int var12 = var9 >> 6 & 0x3F;
                                    int var13 = var9 & 0x3F;
                                    var14 = var5.method1475(255) >> 2;
                                    var15 = var12 + arg1;
                                    var16 = arg3 + var13;
                                } while (var15 <= 0);
                            } while (var16 <= 0);
                        } while (var15 >= 103);
                    } while (var16 >= 103);
                    var17 = class5.method32((byte) 101, var7);
                } while (var14 == 22 && class13.field300 && var17.field1689 == 0 && var17.field1719 != 1 && !var17.field1722);
                var10 = true;
                if (!var17.method587(23615)) {
                    class91.field1671++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I")
    public final int method306(int arg0) {
        field884++;
        if (arg0 != 173319001) {
            field895 = null;
        }
        return this.field888 == -1 ? (this.field901[0] << 15) + (this.field892[0] << 25) + (this.field901[11] << 5) + this.field901[1] + (this.field901[8] << 10) + (this.field892[4] << 20) : class131.method814(true, this.field888).field1324 + 305419896;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    public static final void method307(int arg0) {
        if (class139.field2545 != null) {
            class123 var1 = class139.field2545;
            synchronized (class139.field2545) {
                class139.field2545 = null;
            }
        }
        if (arg0 != 1073741823) {
            method303(102);
        }
        field889++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZB[I[I)V")
    public final void method308(int arg0, boolean arg1, byte arg2, int[] arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class236.field4407; var7++) {
                    class2 var8 = class227.method1422(-35, var7);
                    if (var8 != null && !var8.field57 && var8.field50 == (arg1 ? 7 : 0) + var6) {
                        arg4[class150.field2684[var6]] = class73.method479(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        if (arg2 < 87) {
            method304(null, 2, null, 43, -91);
        }
        this.field896 = arg1;
        this.field888 = arg0;
        this.field901 = arg4;
        this.field892 = arg3;
        field885++;
        this.method314(1668565320);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILkg;Lkg;I)Lbf;")
    public final class18 method309(int arg0, int arg1, class115 arg2, class115 arg3, int arg4) {
        field899++;
        if (arg4 >= -108) {
            this.method306(118);
        }
        if (this.field888 != -1) {
            return class131.method814(true, this.field888).method447(-118, arg2, arg1, arg3, arg0);
        }
        int[] var6 = this.field901;
        long var7 = this.field877;
        if (arg3 != null && (arg3.field2068 >= 0 || arg3.field2070 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field901[var9];
            }
            if (arg3.field2068 >= 0) {
                if (arg3.field2068 == 65535) {
                    var7 ^= 0xFFFFFFFF00000000L;
                    var6[5] = 0;
                } else {
                    var6[5] = class73.method479(arg3.field2068, 1073741824);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg3.field2070 >= 0) {
                if (arg3.field2070 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var6[3] = 0;
                } else {
                    var6[3] = class73.method479(1073741824, arg3.field2070);
                    var7 ^= var6[3];
                }
            }
        }
        class18 var10 = (class18) class124.field2227.method1028(var7, false);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((var21 & Integer.MIN_VALUE) != 0 && !class227.method1422(113, var21 & 0x3FFFFFFF).method24((byte) -108)) {
                        var11 = true;
                    }
                } else if (!method311(var21 & 0x3FFFFFFF, 0).method88((byte) 65, this.field896)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field902 != -1L) {
                    var10 = (class18) class124.field2227.method1028(this.field902, false);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class10[] var13 = new class10[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class10 var20 = method311(var18 & 0x3FFFFFFF, 0).method99(0, this.field896);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    } else if ((Integer.MIN_VALUE & var18) != 0) {
                        class10 var19 = class227.method1422(12, var18 & 0x3FFFFFFF).method19(-126);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                class10 var16 = new class10(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field892[var17] < class192.field3393[var17].length) {
                        var16.method76(class26.field562[var17], class192.field3393[var17][this.field892[var17]]);
                    }
                    if (class28.field595[var17].length > this.field892[var17]) {
                        var16.method76(class146.field2612[var17], class28.field595[var17][this.field892[var17]]);
                    }
                }
                var10 = var16.method58(64, 850, -30, -50, -30);
                class124.field2227.method1025(var10, false, var7);
                this.field902 = var7;
            }
        }
        if (arg3 == null && arg2 == null) {
            return var10;
        }
        class18 var22;
        if (arg3 != null && arg2 != null) {
            var22 = arg3.method692(var10, (byte) -61, arg0, arg2, arg1);
        } else if (arg3 == null) {
            var22 = arg2.method694(var10, 1, arg1);
        } else {
            var22 = arg3.method694(var10, 1, arg0);
        }
        return var22;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLkg;I)Lbf;")
    public final class18 method310(boolean arg0, class115 arg1, int arg2) {
        field903++;
        if (this.field888 != -1) {
            return class131.method814(!arg0, this.field888).method450(arg2, (byte) -84, arg1);
        }
        class18 var4 = (class18) class91.field1667.method1028(this.field877, arg0);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field901[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class227.method1422(127, var15 & 0x3FFFFFFF).method16((byte) 110)) {
                        var5 = true;
                    }
                } else if (!method311(var15 & 0x3FFFFFFF, 0).method97(this.field896, 0)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class10[] var7 = new class10[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field901[var9];
                if ((var12 & 0x40000000) != 0) {
                    class10 var13 = method311(var12 & 0x3FFFFFFF, 0).method98(this.field896, (byte) -51);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class10 var14 = class227.method1422(97, var12 & 0x3FFFFFFF).method17((byte) -30);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class10 var10 = new class10(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class192.field3393[var11].length > this.field892[var11]) {
                    var10.method76(class26.field562[var11], class192.field3393[var11][this.field892[var11]]);
                }
                if (this.field892[var11] < class28.field595[var11].length) {
                    var10.method76(class146.field2612[var11], class28.field595[var11][this.field892[var11]]);
                }
            }
            var4 = var10.method58(64, 768, -50, -10, -50);
            class91.field1667.method1025(var4, false, this.field877);
        }
        if (arg1 != null) {
            var4 = arg1.method689((byte) -24, arg2, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lb;")
    public static final class12 method311(int arg0, int arg1) {
        if (arg1 != 0) {
            field879 = true;
        }
        field900++;
        class12 var2 = (class12) class114.field2027.method1318((byte) -57, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class231.field4127.method1208(class156.method1022(arg0, (byte) 51), (byte) 105, class48.method340((byte) -16, arg0));
        class12 var4 = new class12();
        var4.field216 = arg0;
        if (var3 != null) {
            var4.method91((byte) -126, new class229(var3));
        }
        var4.method93(false);
        if (var4.field237 != -1) {
            var4.method90(method311(var4.field226, 0), 15, method311(var4.field237, 0));
        }
        if (var4.field245 != -1) {
            var4.method94(method311(var4.field215, arg1), method311(var4.field245, 0), 5934);
        }
        if (!class195.field3474 && var4.field253) {
            var4.field250 = false;
            var4.field241 = class108.field1911;
            var4.field224 = 0;
            var4.field243 = null;
            var4.field269 = null;
        }
        class114.field2027.method1324(var4, 18373, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public final void method312(int arg0, int arg1, int arg2) {
        if (arg0 == -1117581470) {
            field886++;
            this.field892[arg1] = arg2;
            this.method314(1668565320);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)V")
    public final void method313(byte arg0, int arg1, int arg2) {
        if (arg0 < 30) {
            return;
        }
        int var4 = class150.field2684[arg1];
        field880++;
        if (this.field901[var4] != 0 && class227.method1422(6, arg2) != null) {
            this.field901[var4] = class73.method479(Integer.MIN_VALUE, arg2);
            this.method314(1668565320);
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    private final void method314(int arg0) {
        field898++;
        long[] var2 = class54.field1098;
        long var3 = this.field877;
        this.field877 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field877 = this.field877 >>> 8 ^ var2[(int) (((long) (this.field901[var5] >> 24) ^ this.field877) & 0xFFL)];
            this.field877 = this.field877 >>> 8 ^ var2[(int) ((this.field877 ^ (long) (this.field901[var5] >> 16)) & 0xFFL)];
            this.field877 = var2[(int) ((this.field877 ^ (long) (this.field901[var5] >> 8)) & 0xFFL)] ^ this.field877 >>> 8;
            this.field877 = this.field877 >>> 8 ^ var2[(int) ((this.field877 ^ (long) this.field901[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field877 = this.field877 >>> 8 ^ var2[(int) ((this.field877 ^ (long) this.field892[var6]) & 0xFFL)];
        }
        this.field877 = this.field877 >>> 8 ^ var2[(int) (((long) (this.field896 ? 1 : 0) ^ this.field877) & 0xFFL)];
        if (arg0 == 1668565320 && (var3 != 0L && this.field877 != var3)) {
            class124.field2227.method1024(arg0 - 1668565225, var3);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V")
    public final void method315(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field887 = null;
        }
        this.field896 = arg1;
        this.method314(1668565320);
        field881++;
    }
}
