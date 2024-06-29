import java.awt.Component;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class118 extends class42 {

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public int field2891 = 32;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
    public int field2892 = -1;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    private int field2887 = 0;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public int field2889 = -1;

    @OriginalMember(owner = "client!td", name = "rb", descriptor = "[Lad;")
    public class5[] field2902 = new class5[5];

    @OriginalMember(owner = "client!td", name = "Cb", descriptor = "Z")
    public boolean field2913 = true;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
    public int field2894 = -1;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "I")
    public int field2888 = -1;

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
    public int field2897 = -1;

    @OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
    public int field2906 = -1;

    @OriginalMember(owner = "client!td", name = "Sb", descriptor = "I")
    public int field2929 = -1;

    @OriginalMember(owner = "client!td", name = "Lb", descriptor = "I")
    private int field2922 = 0;

    @OriginalMember(owner = "client!td", name = "Tb", descriptor = "I")
    private int field2930 = 128;

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "I")
    private int field2898 = 128;

    @OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
    private int field2908 = -1;

    @OriginalMember(owner = "client!td", name = "Ob", descriptor = "I")
    public int field2925 = 1;

    @OriginalMember(owner = "client!td", name = "Mb", descriptor = "I")
    private int field2923 = -1;

    @OriginalMember(owner = "client!td", name = "cc", descriptor = "Z")
    public boolean field2939 = true;

    @OriginalMember(owner = "client!td", name = "ec", descriptor = "I")
    public int field2941 = -1;

    @OriginalMember(owner = "client!td", name = "ac", descriptor = "I")
    public int field2937 = -1;

    @OriginalMember(owner = "client!td", name = "dc", descriptor = "Lad;")
    public class5 field2940 = class5.field213;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "Z")
    public boolean field2899 = false;

    @OriginalMember(owner = "client!td", name = "yb", descriptor = "Lad;")
    private static class5 field2909 = class88.method674("Accept challenge", 25);

    @OriginalMember(owner = "client!td", name = "wb", descriptor = "I")
    public static int field2907 = 0;

    @OriginalMember(owner = "client!td", name = "Jb", descriptor = "I")
    public static int field2920 = 0;

    @OriginalMember(owner = "client!td", name = "Kb", descriptor = "[Lbd;")
    public static class11[] field2921 = new class11[50];

    @OriginalMember(owner = "client!td", name = "Eb", descriptor = "Lad;")
    private static class5 field2915 = class88.method674("The server is being updated)3", 42);

    @OriginalMember(owner = "client!td", name = "Ub", descriptor = "Lad;")
    public static class5 field2931 = field2915;

    @OriginalMember(owner = "client!td", name = "Rb", descriptor = "Lad;")
    private static class5 field2928 = class88.method674("This world is full)3", 92);

    @OriginalMember(owner = "client!td", name = "Zb", descriptor = "Lad;")
    public static class5 field2936 = field2909;

    @OriginalMember(owner = "client!td", name = "Hb", descriptor = "Lad;")
    public static class5 field2918 = field2928;

    @OriginalMember(owner = "client!td", name = "Vb", descriptor = "Lad;")
    public static class5 field2932 = class88.method674(" hat sich ausgeloggt)3", 121);

    @OriginalMember(owner = "client!td", name = "Db", descriptor = "Lbb;")
    public static class9 field2914 = new class9(500);

    @OriginalMember(owner = "client!td", name = "hc", descriptor = "Lad;")
    public static class5 field2944 = class88.method674("60 Sekunden noch einmal)3)3)3", -107);

    @OriginalMember(owner = "client!td", name = "gc", descriptor = "Lad;")
    public static class5 field2943 = class88.method674("@lre@", -117);

    @OriginalMember(owner = "client!td", name = "ic", descriptor = "Ljava/lang/Object;")
    public static Object field2945 = new Object();

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!td", name = "sb", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!td", name = "tb", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!td", name = "zb", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!td", name = "Ab", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!td", name = "Bb", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!td", name = "Gb", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!td", name = "Ib", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!td", name = "Nb", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!td", name = "Pb", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!td", name = "Qb", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!td", name = "Xb", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!td", name = "Yb", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!td", name = "bc", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "Luc;")
    public static class123 field2896;

    @OriginalMember(owner = "client!td", name = "fc", descriptor = "Luc;")
    public static class123 field2942;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "[I")
    private int[] field2890;

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "[I")
    public int[] field2895;

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "[I")
    private int[] field2900;

    @OriginalMember(owner = "client!td", name = "ub", descriptor = "[I")
    private int[] field2905;

    @OriginalMember(owner = "client!td", name = "Fb", descriptor = "[I")
    private int[] field2916;

    @OriginalMember(owner = "client!td", name = "Wb", descriptor = "[I")
    public static int[] field2933;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lrd;B)I", line = 6)
    public static final int method930(class106 arg0, byte arg1) {
        field2901++;
        int var2 = 0;
        if (arg0.method846(class47.field1237, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class63.field1529, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class80.field1896, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class96.field2300, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class96.field2285, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class56.field1386, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class108.field2721, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class59.field1450, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class120.field2991, class48.field1251, arg1 ^ 0xFFFFEC7E)) {
            var2++;
        }
        if (arg1 != -10) {
            field2928 = null;
        }
        if (arg0.method846(class81.field1903, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class106.field2674, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class19.field509, class48.field1251, arg1 + 5010)) {
            var2++;
        }
        if (arg0.method846(class92.field2202, class48.field1251, arg1 + 5010)) {
            var2++;
        }
        if (arg0.method846(class3.field66, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class100.field2424, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class4.field136, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class7.field265, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class56.field1403, class48.field1251, 5000)) {
            var2++;
        }
        if (arg0.method846(class10.field328, class48.field1251, 5000)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/awt/Component;Laa;)V", line = 107)
    public static final void method931(int arg0, Component arg1, class2 arg2) {
        field2938++;
        try {
            if (arg0 != 0) {
                field2932 = null;
            }
            class127 var3 = (class127) Class.forName("lb").getDeclaredConstructor().newInstance();
            var3.method984(arg2, 2048);
            class98.field2375 = var3;
        } catch (Throwable var6) {
            try {
                class98.field2375 = new class28(arg2, arg1);
            } catch (Throwable var5) {
                if (class2.field36.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class98.field2375 = new class51();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class98.field2375 = new class100(8000);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 161)
    public static final void method932(Throwable arg0, String arg1, int arg2) {
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class79.method612(109, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class62 var8 = class87.field2044.method14(new URL(class87.field2044.field34.getCodeBase(), "clienterror.ws?c=" + field2912 + "&u=" + class35.field896 + "&v1=" + class2.field36 + "&v2=" + class2.field20 + "&e=" + var7), 0);
            while (var8.field1513 == 0) {
                class121.method958(1L, (byte) 72);
            }
            if (var8.field1513 == arg2) {
                DataInputStream var9 = (DataInputStream) var8.field1516;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        field2917++;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)Ltd;", line = 214)
    public final class118 method933(int arg0) {
        int var2 = -1;
        field2934++;
        if (this.field2923 != -1) {
            var2 = class1.method3(-102, this.field2923);
        } else if (this.field2908 != -1) {
            var2 = class128.field3058[this.field2908];
        }
        if (var2 < 0 || this.field2895.length <= var2 || this.field2895[var2] == -1) {
            return null;
        } else {
            if (arg0 != 11840) {
                field2909 = null;
            }
            return class48.method421(this.field2895[var2], arg0 - 11839);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lgb;I)V", line = 246)
    public final void method934(class39 arg0, int arg1) {
        field2904++;
        while (true) {
            int var3 = arg0.method330(-30864);
            if (var3 == 0) {
                if (arg1 <= 61) {
                    this.method933(105);
                    return;
                } else {
                    return;
                }
            }
            this.method938(var3, -105, arg0);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLrd;)V", line = 268)
    public static final void method935(byte arg0, class106 arg1) {
        field2910++;
        if (arg0 > -89) {
            method932(null, null, 15);
        }
        class9.field303 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V", line = 279)
    public static void method936(int arg0) {
        field2914 = null;
        field2933 = null;
        field2931 = null;
        field2936 = null;
        field2932 = null;
        field2909 = null;
        field2896 = null;
        field2942 = null;
        field2944 = null;
        field2921 = null;
        field2928 = null;
        field2945 = null;
        field2915 = null;
        field2918 = null;
        field2943 = null;
        if (arg0 != 35) {
            method932(null, null, -39);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILm;Lm;II)Lhc;", line = 315)
    public final class45 method937(int arg0, class72 arg1, class72 arg2, int arg3, int arg4) {
        field2926++;
        if (this.field2895 != null) {
            class118 var6 = this.method933(11840);
            return var6 == null ? null : var6.method937(arg0, arg1, arg2, arg3, -1);
        }
        class45 var7 = (class45) class99.field2388.method98(-8, (long) this.field2935);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field2900.length; var9++) {
                if (!class30.field724.method865(this.field2900[var9], -2691, 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class45[] var10 = new class45[this.field2900.length];
            for (int var11 = 0; var11 < this.field2900.length; var11++) {
                var10[var11] = class45.method400(class30.field724, this.field2900[var11], 0);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class45(var10, var10.length);
            }
            if (this.field2905 != null) {
                for (int var12 = 0; var12 < this.field2905.length; var12++) {
                    var7.method381(this.field2905[var12], this.field2890[var12]);
                }
            }
            var7.method378();
            var7.method392(this.field2922 + 64, this.field2887 + 850, -30, -50, -30, true);
            class99.field2388.method102((long) this.field2935, var7, 100);
        }
        if (arg4 != -1) {
            return null;
        }
        class45 var13;
        if (arg1 != null && arg2 != null) {
            var13 = arg1.method578((byte) -40, arg3, arg2, var7, arg0);
        } else if (arg1 != null) {
            var13 = arg1.method573(false, var7, arg0);
        } else if (arg2 == null) {
            var13 = var7.method399(true);
        } else {
            var13 = arg2.method573(false, var7, arg3);
        }
        if (this.field2898 != 128 || this.field2930 != 128) {
            var13.method373(this.field2898, this.field2930, this.field2898);
        }
        return var13;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILgb;)V", line = 426)
    private final void method938(int arg0, int arg1, class39 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method330(-30864);
            this.field2900 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2900[var5] = arg2.method343((byte) -6);
            }
        } else if (arg0 == 2) {
            this.field2940 = arg2.method301(-1);
        } else if (arg0 == 12) {
            this.field2925 = arg2.method330(-30864);
        } else if (arg0 == 13) {
            this.field2937 = arg2.method343((byte) -6);
        } else if (arg0 == 14) {
            this.field2929 = arg2.method343((byte) -6);
        } else if (arg0 == 15) {
            this.field2906 = arg2.method343((byte) -6);
        } else if (arg0 == 16) {
            this.field2897 = arg2.method343((byte) -6);
        } else if (arg0 == 17) {
            this.field2929 = arg2.method343((byte) -6);
            this.field2888 = arg2.method343((byte) -6);
            this.field2894 = arg2.method343((byte) -6);
            this.field2892 = arg2.method343((byte) -6);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field2902[arg0 - 30] = arg2.method301(-1);
            if (this.field2902[arg0 - 30].method75(false, class70.field1703)) {
                this.field2902[arg0 - 30] = null;
            }
        } else if (arg0 == 40) {
            int var10 = arg2.method330(-30864);
            this.field2905 = new int[var10];
            this.field2890 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2905[var11] = arg2.method343((byte) -6);
                this.field2890[var11] = arg2.method343((byte) -6);
            }
        } else if (arg0 == 60) {
            int var8 = arg2.method330(-30864);
            this.field2916 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2916[var9] = arg2.method343((byte) -6);
            }
        } else if (arg0 == 93) {
            this.field2939 = false;
        } else if (arg0 == 95) {
            this.field2941 = arg2.method343((byte) -6);
        } else if (arg0 == 97) {
            this.field2898 = arg2.method343((byte) -6);
        } else if (arg0 == 98) {
            this.field2930 = arg2.method343((byte) -6);
        } else if (arg0 == 99) {
            this.field2899 = true;
        } else if (arg0 == 100) {
            this.field2922 = arg2.method318(-1);
        } else if (arg0 == 101) {
            this.field2887 = arg2.method318(-1) * 5;
        } else if (arg0 == 102) {
            this.field2889 = arg2.method343((byte) -6);
        } else if (arg0 == 103) {
            this.field2891 = arg2.method343((byte) -6);
        } else if (arg0 == 106) {
            this.field2923 = arg2.method343((byte) -6);
            if (this.field2923 == 65535) {
                this.field2923 = -1;
            }
            this.field2908 = arg2.method343((byte) -6);
            if (this.field2908 == 65535) {
                this.field2908 = -1;
            }
            int var6 = arg2.method330(-30864);
            this.field2895 = new int[var6 + 1];
            for (int var7 = 0; var7 <= var6; var7++) {
                this.field2895[var7] = arg2.method343((byte) -6);
                if (this.field2895[var7] == 65535) {
                    this.field2895[var7] = -1;
                }
            }
        } else if (arg0 == 107) {
            this.field2913 = false;
        }
        field2927++;
        if (arg1 >= -49) {
            this.method934(null, -87);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lrd;ILrd;)V", line = 598)
    public static final void method939(class106 arg0, int arg1, class106 arg2) {
        field2903++;
        if (arg1 != -23861) {
            field2918 = null;
        }
        class73.field1747 = arg0;
        class112.field2794 = arg2;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Lhc;", line = 615)
    public final class45 method940(byte arg0) {
        field2893++;
        if (this.field2895 != null) {
            class118 var2 = this.method933(11840);
            return var2 == null ? null : var2.method940((byte) 37);
        } else if (this.field2916 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field2916.length; var4++) {
                if (!class30.field724.method865(this.field2916[var4], -2691, 0)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class45[] var5 = new class45[this.field2916.length];
            int var6 = 0;
            if (arg0 != 37) {
                this.field2890 = null;
            }
            while (this.field2916.length > var6) {
                var5[var6] = class45.method400(class30.field724, this.field2916[var6], 0);
                var6++;
            }
            class45 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class45(var5, var5.length);
            }
            if (this.field2905 != null) {
                for (int var8 = 0; var8 < this.field2905.length; var8++) {
                    var7.method381(this.field2905[var8], this.field2890[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V", line = 714)
    public final void method941(byte arg0) {
        if (arg0 < 60) {
            method932(null, null, 105);
        }
        field2919++;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)Z", line = 735)
    public final boolean method942(int arg0) {
        field2924++;
        if (this.field2895 == null) {
            return true;
        }
        int var2 = arg0;
        if (this.field2923 != -1) {
            var2 = class1.method3(-66, this.field2923);
        } else if (this.field2908 != -1) {
            var2 = class128.field3058[this.field2908];
        }
        return var2 >= 0 && var2 < this.field2895.length && this.field2895[var2] != -1;
    }
}
