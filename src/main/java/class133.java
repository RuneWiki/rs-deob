import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class133 extends class134 {

    @OriginalMember(owner = "client!te", name = "X", descriptor = "[Ltd;")
    public class132[] field3125;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "[I")
    public static int[] field3121 = new int[100];

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "Lwd;")
    public static class150 field3118 = class2.method9(true, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Lwd;")
    public static class150 field3120 = class2.method9(true, " )2> ");

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public static int field3122 = -1;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "Lwd;")
    private static class150 field3123 = class2.method9(true, "No reply from loginserver)3");

    @OriginalMember(owner = "client!te", name = "R", descriptor = "Lwd;")
    private static class150 field3119 = class2.method9(true, "Invalid username or password)3");

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "Lwd;")
    public static class150 field3132 = class2.method9(true, "Passwort: ");

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field3126 = -1;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "[I")
    public static int[] field3133 = new int[50];

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "Lwd;")
    private static class150 field3129 = class2.method9(true, "Prepared sound engine");

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "Lwd;")
    public static class150 field3134 = field3129;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "Lwd;")
    public static class150 field3135 = field3123;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "Lwd;")
    public static class150 field3139 = class2.method9(true, "@red@");

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "Lwd;")
    public static class150 field3140 = field3119;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3130;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "[Lqd;")
    public static class114[] field3117;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public static void method990(boolean arg0) {
        field3117 = null;
        field3132 = null;
        field3133 = null;
        field3134 = null;
        field3130 = null;
        field3135 = null;
        if (arg0) {
            method992((byte) -111);
        }
        field3140 = null;
        field3123 = null;
        field3139 = null;
        field3129 = null;
        field3120 = null;
        field3118 = null;
        field3121 = null;
        field3119 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
    public static final void method991(int arg0, boolean arg1) {
        field3124++;
        if (class46.field1244.field3000 >> 7 == class142.field3442 && class46.field1244.field2939 >> 7 == class2.field47) {
            class142.field3442 = 0;
        }
        int var2 = class109.field2533;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = arg0; var3 < var2; var3++) {
            class111 var4;
            int var5;
            if (arg1) {
                var4 = class46.field1244;
                var5 = 33538048;
            } else {
                var5 = class61.field1574[var3] << 14;
                var4 = class137.field3217[class61.field1574[var3]];
            }
            if (var4 != null && var4.method133((byte) -114)) {
                int var6 = var4.field3000 >> 7;
                int var7 = var4.field2939 >> 7;
                var4.field2544 = false;
                if ((class20.field517 && class109.field2533 > 50 || class109.field2533 > 200) && !arg1 && var4.field2978 == var4.field2976) {
                    var4.field2544 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field2553 == null || var4.field2545 > class11.field280 || class11.field280 >= var4.field2547) {
                        if ((var4.field3000 & 0x7F) == 64 && (var4.field2939 & 0x7F) == 64) {
                            if (class119.field2763[var6][var7] == class54.field1415) {
                                continue;
                            }
                            class119.field2763[var6][var7] = class54.field1415;
                        }
                        var4.field2563 = class25.method205(var4.field3000, class17.field466, -23287, var4.field2939);
                        class111.field2548.method915(class17.field466, var4.field3000, var4.field2939, var4.field2563, 60, var4, var4.field2971, var5, var4.field2955);
                    } else {
                        var4.field2544 = false;
                        var4.field2563 = class25.method205(var4.field3000, class17.field466, -23287, var4.field2939);
                        class111.field2548.method894(class17.field466, var4.field3000, var4.field2939, var4.field2563, 60, var4, var4.field2971, var5, var4.field2541, var4.field2569, var4.field2560, var4.field2543);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
    public static final void method992(byte arg0) {
        field3138++;
        class101 var1 = class5.field92;
        synchronized (class5.field92) {
            class124.field2873 = class30.field904;
            int var2 = -102 / ((-arg0 - 21) / 56);
            if (class24.field688 < 0) {
                for (int var3 = 0; var3 < 112; var3++) {
                    class11.field259[var3] = false;
                }
                class24.field688 = class134.field3164;
            } else {
                while (class24.field688 != class134.field3164) {
                    int var4 = class150.field3685[class134.field3164];
                    class134.field3164 = class134.field3164 + 1 & 0x7F;
                    if (var4 >= 0) {
                        class11.field259[var4] = true;
                    } else {
                        class11.field259[~var4] = false;
                    }
                }
            }
            class30.field904 = class47.field1259;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public static final void method993(int arg0) {
        class123.field2838 = true;
        if (arg0 != -113) {
            field3131 = -4;
        }
        class20.field517 = true;
        field3127++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lwd;Z)Z")
    public static final boolean method994(class150 arg0, boolean arg1) {
        field3136++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class50.field1347; var2++) {
            if (arg0.method1181(true, class146.field3537[var2])) {
                return true;
            }
        }
        if (arg0.method1181(true, class46.field1244.field2555)) {
            return true;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lff;Lff;IZ)V")
    public class133(class42 arg0, class42 arg1, int arg2, boolean arg3) {
        class103 var5 = new class103();
        int var6 = arg0.method319((byte) 65, arg2);
        this.field3125 = new class132[var6];
        int[] var7 = arg0.method313(arg2, (byte) -127);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method315(var7[var8], true, arg2);
            class77 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class77 var12 = (class77) var5.method702((byte) -118); var12 != null; var12 = (class77) var5.method698(-1610612736)) {
                if (var12.field1898 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method322(0, var11, -87);
                } else {
                    var13 = arg1.method322(var11, 0, -64);
                }
                var10 = new class77(var11, var13);
                var5.method711(var10, 0);
            }
            this.field3125[var7[var8]] = new class132(var9, var10);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)Z")
    public final boolean method995(int arg0, byte arg1) {
        if (arg1 != 6) {
            method993(-12);
        }
        field3141++;
        return this.field3125[arg0].field3115;
    }
}
