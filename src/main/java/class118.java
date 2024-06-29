import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class118 extends class5 {

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public int field2881 = -1;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public int field2879 = -1;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public int field2886 = -1;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public int field2884 = 99;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "Z")
    public boolean field2888 = false;

    @OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
    public int field2894 = -1;

    @OriginalMember(owner = "client!ua", name = "rb", descriptor = "I")
    public int field2897 = -1;

    @OriginalMember(owner = "client!ua", name = "ub", descriptor = "I")
    public int field2900 = 5;

    @OriginalMember(owner = "client!ua", name = "tb", descriptor = "I")
    public int field2899 = 2;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "Lhb;")
    public static class44 field2876 = class102.method810("gleiten:", -28606);

    @OriginalMember(owner = "client!ua", name = "qb", descriptor = "Lhb;")
    private static class44 field2896 = class102.method810("Classic", -28606);

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "Lhb;")
    public static class44 field2892 = field2896;

    @OriginalMember(owner = "client!ua", name = "vb", descriptor = "Lhe;")
    public static class47 field2901 = new class47();

    @OriginalMember(owner = "client!ua", name = "Ab", descriptor = "Lhb;")
    private static class44 field2906 = class102.method810("white:", -28606);

    @OriginalMember(owner = "client!ua", name = "zb", descriptor = "Lhb;")
    public static class44 field2905 = field2906;

    @OriginalMember(owner = "client!ua", name = "xb", descriptor = "I")
    public static int field2903 = 0;

    @OriginalMember(owner = "client!ua", name = "wb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2902 = new CRC32();

    @OriginalMember(owner = "client!ua", name = "Fb", descriptor = "I")
    public static int field2911 = 0;

    @OriginalMember(owner = "client!ua", name = "Cb", descriptor = "Lhb;")
    public static class44 field2908 = class102.method810("backhmid1", -28606);

    @OriginalMember(owner = "client!ua", name = "Eb", descriptor = "Lhb;")
    private static class44 field2910 = class102.method810("Loaded gamescreen", -28606);

    @OriginalMember(owner = "client!ua", name = "Hb", descriptor = "[I")
    public static int[] field2913 = new int[2048];

    @OriginalMember(owner = "client!ua", name = "Gb", descriptor = "Lhb;")
    public static class44 field2912 = class102.method810("Bitte warten Sie eine Minute", -28606);

    @OriginalMember(owner = "client!ua", name = "Db", descriptor = "Lhb;")
    public static class44 field2909 = field2910;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ua", name = "pb", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ua", name = "sb", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ua", name = "Bb", descriptor = "J")
    public static long field2907;

    @OriginalMember(owner = "client!ua", name = "Ib", descriptor = "Z")
    public static boolean field2914;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "[I")
    public int[] field2883;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "[I")
    public int[] field2885;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "[I")
    private int[] field2887;

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "[I")
    private int[] field2893;

    @OriginalMember(owner = "client!ua", name = "yb", descriptor = "[I")
    public static int[] field2904;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwd;I)V", line = 4)
    public final void method906(class131 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method971(true);
            if (var3 == 0) {
                field2877++;
                return;
            }
            this.method910(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lde;II)Lde;", line = 34)
    public final class24 method907(class24 arg0, int arg1, int arg2) {
        field2875++;
        int var4 = this.field2883[arg1];
        class121 var5 = class88.method718(-123, var4 >> 16);
        int var6 = var4 & arg2;
        if (var5 == null) {
            return arg0.method191(true);
        } else {
            class24 var7 = arg0.method191(!var5.method931(8741, var6));
            var7.method187(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V", line = 54)
    public static void method908(int arg0) {
        field2876 = null;
        field2901 = null;
        field2908 = null;
        if (arg0 != 0) {
            method913(52, (byte) 94);
        }
        field2904 = null;
        field2902 = null;
        field2892 = null;
        field2910 = null;
        field2896 = null;
        field2912 = null;
        field2909 = null;
        field2906 = null;
        field2913 = null;
        field2905 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILde;B)Lde;", line = 76)
    public final class24 method909(int arg0, int arg1, class24 arg2, byte arg3) {
        field2891++;
        if (arg3 != -124) {
            method908(-2);
        }
        int var5 = this.field2883[arg0];
        class121 var6 = class88.method718(arg3 + 19, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method191(true);
        }
        class24 var8 = arg2.method191(!var6.method931(8741, var7));
        int var9 = arg1 & 0x3;
        if (var9 == 1) {
            var8.method206();
        } else if (var9 == 2) {
            var8.method182();
        } else if (var9 == 3) {
            var8.method194();
        }
        var8.method187(var6, var7);
        if (var9 == 1) {
            var8.method194();
        } else if (var9 == 2) {
            var8.method182();
        } else if (var9 == 3) {
            var8.method206();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLwd;I)V", line = 126)
    private final void method910(boolean arg0, class131 arg1, int arg2) {
        field2895++;
        if (arg2 == 1) {
            int var4 = arg1.method971(true);
            this.field2885 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2885[var5] = arg1.method1001(65280);
            }
            this.field2883 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2883[var6] = arg1.method1001(65280);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2883[var7] = (arg1.method1001(65280) << 16) + this.field2883[var7];
            }
        } else if (arg2 == 2) {
            this.field2881 = arg1.method1001(65280);
        } else if (arg2 == 3) {
            int var11 = arg1.method971(true);
            this.field2893 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2893[var12] = arg1.method971(true);
            }
            this.field2893[var11] = 9999999;
        } else if (arg2 == 4) {
            this.field2888 = true;
        } else if (arg2 == 5) {
            this.field2900 = arg1.method971(true);
        } else if (arg2 == 6) {
            this.field2897 = arg1.method1001(65280);
        } else if (arg2 == 7) {
            this.field2886 = arg1.method1001(65280);
        } else if (arg2 == 8) {
            this.field2884 = arg1.method971(!arg0);
        } else if (arg2 == 9) {
            this.field2894 = arg1.method971(!arg0);
        } else if (arg2 == 10) {
            this.field2879 = arg1.method971(!arg0);
        } else if (arg2 == 11) {
            this.field2899 = arg1.method971(true);
        } else if (arg2 == 12) {
            int var8 = arg1.method971(true);
            this.field2887 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2887[var9] = arg1.method1001(65280);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2887[var10] += arg1.method1001(65280) << 16;
            }
        }
        if (arg0) {
            this.field2886 = 5;
        }
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V", line = 242)
    public final void method911(int arg0) {
        if (this.field2879 == -1) {
            if (this.field2893 == null) {
                this.field2879 = 0;
            } else {
                this.field2879 = 2;
            }
        }
        field2898++;
        if (this.field2894 == -1) {
            if (this.field2893 == null) {
                this.field2894 = 0;
            } else {
                this.field2894 = 2;
            }
        }
        int var2 = -124 % ((6 - arg0) / 42);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILde;)Lde;", line = 276)
    public final class24 method912(byte arg0, int arg1, class24 arg2) {
        field2880++;
        int var4 = this.field2883[arg1];
        class121 var5 = class88.method718(109, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method208(true);
        }
        class24 var7 = arg2.method208(!var5.method931(8741, var6));
        var7.method187(var5, var6);
        if (arg0 < 82) {
            field2876 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Lha;", line = 298)
    public static final class43 method913(int arg0, byte arg1) {
        field2889++;
        class43 var2 = (class43) class74.field1878.method330((long) arg0, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class121.field2957.method892(9, arg0, false);
        class43 var4 = new class43();
        var4.field987 = arg0;
        if (var3 != null) {
            var4.method374(-36, new class131(var3));
        }
        var4.method364(-9150);
        class74.field1878.method332(var4, 0, (long) arg0);
        int var5 = -113 % ((-arg1 - 54) / 47);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I", line = 336)
    public static int method914(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILde;I)Lde;", line = 343)
    public final class24 method915(int arg0, class24 arg1, int arg2) {
        field2890++;
        int var4 = this.field2883[arg2];
        class121 var5 = class88.method718(-27, var4 >> arg0);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method191(true);
        }
        int var7 = 0;
        class121 var8 = null;
        if (this.field2887 != null && arg2 < this.field2887.length) {
            int var9 = this.field2887[arg2];
            var8 = class88.method718(-112, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class24 var11 = arg1.method191(!var5.method931(8741, var6));
            var11.method187(var5, var6);
            return var11;
        } else {
            class24 var10 = arg1.method191(!var5.method931(8741, var6) & !var8.method931(arg0 - 31939211, var7));
            var10.method187(var5, var6);
            var10.method187(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lde;Lua;III)Lde;", line = 392)
    public final class24 method916(class24 arg0, class118 arg1, int arg2, int arg3, int arg4) {
        field2874++;
        int var6 = this.field2883[arg2];
        class121 var7 = class88.method718(-106, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method907(arg0, arg4, 65535);
        }
        int var9 = arg1.field2883[arg4];
        if (arg3 >= -56) {
            this.field2885 = null;
        }
        class121 var10 = class88.method718(-128, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class24 var12 = arg0.method191(!var7.method931(8741, var8));
            var12.method187(var7, var8);
            return var12;
        } else {
            class24 var13 = arg0.method191(!var7.method931(8741, var8) & !var10.method931(8741, var11));
            var13.method207(var7, var8, var10, var11, this.field2893);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ltd;Ltd;Ltd;I)V", line = 441)
    public static final void method917(class116 arg0, class116 arg1, class116 arg2, int arg3) {
        class130.field3109 = arg1;
        class78.field1966 = arg2;
        field2878++;
        class89.field2267 = arg0;
        if (arg3 >= -46) {
            field2913 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 454)
    public static final void method918(byte arg0) {
        field2882++;
        class81.field2080 = 0;
        int var1 = 93 % ((11 - arg0) / 61);
        class21.field441 = 0;
        class16.method114(-79);
        class85.method689(15024);
        class78.method644(-4455);
        for (int var2 = 0; var2 < class21.field441; var2++) {
            int var4 = class64.field1614[var2];
            if (class2.field73 != class116.field2845[var4].field1345) {
                class116.field2845[var4].field1137 = null;
                class116.field2845[var4] = null;
            }
        }
        if (class14.field275 != class53.field1304.field3182) {
            throw new RuntimeException("gnp1 pos:" + class53.field1304.field3182 + " psize:" + class14.field275);
        }
        for (int var3 = 0; var3 < class125.field3036; var3++) {
            if (class116.field2845[class100.field2515[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class125.field3036);
            }
        }
    }
}
