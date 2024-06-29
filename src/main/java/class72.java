import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class72 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lfa;")
    public class400 field1004 = new class400();

    @OriginalMember(owner = "client!a", name = "l", descriptor = "[I")
    public int[] field1012 = new int[4096];

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
    public int[] field1014 = new int[10];

    @OriginalMember(owner = "client!a", name = "m", descriptor = "[I")
    public int[] field1013 = new int[12287];

    @OriginalMember(owner = "client!a", name = "J", descriptor = "[I")
    public int[] field1036 = new int[64];

    @OriginalMember(owner = "client!a", name = "D", descriptor = "[I")
    public int[] field1030 = new int[64];

    @OriginalMember(owner = "client!a", name = "r", descriptor = "[I")
    public int[] field1018 = new int[8191];

    @OriginalMember(owner = "client!a", name = "C", descriptor = "[I")
    public int[] field1029 = new int[8];

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    public int[] field1019 = new int[12];

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
    public int[] field1023 = new int[4096];

    @OriginalMember(owner = "client!a", name = "G", descriptor = "[I")
    public int[] field1033 = new int[10];

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
    public int[] field1015 = new int[8191];

    @OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
    public int[] field1032 = new int[8191];

    @OriginalMember(owner = "client!a", name = "H", descriptor = "[I")
    public int[] field1034 = new int[64];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
    public int[] field1024 = new int[10];

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
    public int[] field1027 = new int[4096];

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "[Z")
    public boolean[] field1043 = new boolean[4096];

    @OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
    public int[] field1022 = new int[4096];

    @OriginalMember(owner = "client!a", name = "N", descriptor = "[Z")
    public boolean[] field1040 = new boolean[4096];

    @OriginalMember(owner = "client!a", name = "q", descriptor = "[I")
    public int[] field1017 = new int[4096];

    @OriginalMember(owner = "client!a", name = "L", descriptor = "[I")
    public int[] field1038 = new int[4096];

    @OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
    public int[] field1026 = new int[12287];

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "[I")
    public int[] field1051 = new int[8];

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "[[I")
    public int[][] field1052 = new int[32][512];

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "[I")
    public int[] field1053 = new int[8];

    @OriginalMember(owner = "client!a", name = "K", descriptor = "[I")
    public int[] field1037 = new int[2200];

    @OriginalMember(owner = "client!a", name = "X", descriptor = "[I")
    public int[] field1050 = new int[4096];

    @OriginalMember(owner = "client!a", name = "I", descriptor = "[I")
    public int[] field1035 = new int[10000];

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
    public int[] field1021 = new int[8191];

    @OriginalMember(owner = "client!a", name = "db", descriptor = "[[I")
    public int[][] field1056 = new int[2200][64];

    @OriginalMember(owner = "client!a", name = "M", descriptor = "[[I")
    public int[][] field1039 = new int[12][12287];

    @OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
    public int[] field1031 = new int[12];

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "[I")
    public int[] field1058 = new int[10000];

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "[I")
    public int[] field1054 = new int[32];

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "[I")
    public int[] field1057 = new int[4096];

    @OriginalMember(owner = "client!a", name = "hb", descriptor = "[Lhf;")
    public class219[] field1060 = new class219[8191];

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lsq;")
    private class27 field1005;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lgm;")
    public class338 field1001;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "Lpf;")
    public class449 field1048;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Lpf;")
    public class449 field1042;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lpf;")
    public class449 field1020;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "Lpf;")
    public class449 field1049;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "Lpf;")
    public class449 field1046;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "Lpf;")
    public class449 field1044;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lhc;")
    public static class368 field1009 = new class368("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!a", name = "U", descriptor = "Lka;")
    public static class408 field1047 = new class408(64);

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    public static int field1055 = 0;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lij;")
    public static class316 field1011;

    @OriginalMember(owner = "client!a", name = "gb", descriptor = "Lij;")
    public static class316 field1059;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Ljava/lang/Runnable;")
    public Runnable field1006;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "[Lae;")
    public static class277[] field1045;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method565(byte arg0) {
        field1011 = null;
        field1045 = null;
        field1059 = null;
        field1047 = null;
        if (arg0 < 22) {
            field1055 = 4;
        }
        field1009 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static final void method566(byte arg0) {
        field1007++;
        if (class261.field3604 != null) {
            return;
        }
        if (arg0 != -125) {
            field1059 = null;
        }
        int var1 = class193.field2798;
        int var2 = class13.field116;
        int var3 = field1041 - class373.field5174 - var1;
        int var4 = class350.field4718 - class396.field5493 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class323.field4392 == null) {
                var5 = class122.field1839.field1086;
            } else {
                var5 = class323.field4392;
            }
            int var6 = 0;
            int var7 = 0;
            if (class323.field4392 == var5) {
                Insets var8 = class323.field4392.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class350.field4718);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, field1041, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + field1041 - var3, var7, var3, class350.field4718);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class350.field4718 - var4, field1041, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
    public static final void method567(int arg0, int arg1, int arg2) {
        boolean var3 = class341.field4617[0][arg1][arg2] != null && class341.field4617[0][arg1][arg2].field873 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class341.field4617[var4][arg1][arg2] == null) {
                class63 var5 = class341.field4617[var4][arg1][arg2] = new class63(var4, arg1, arg2);
                if (var3) {
                    var5.field851++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLjava/lang/Runnable;)V")
    public final void method568(byte arg0, Runnable arg1) {
        field1016++;
        if (arg0 == -17) {
            this.field1006 = arg1;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public final void method569(boolean arg0) {
        this.field1001 = new class338(this.field1005);
        if (!arg0) {
            method567(105, -98, 70);
        }
        field1008++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLea;)V")
    public static final void method570(byte arg0, class58 arg1) {
        field1003++;
        int var2 = class75.field1073;
        int var3 = class49.field631;
        int var4 = class4.field32;
        int var5 = class124.field1873 - 3;
        byte var6 = 20;
        if (class136.field2024 == null || class19.field264 == null) {
            if (class112.field1726.method1930((byte) 86, client.field3526) && class112.field1726.method1930((byte) -111, class328.field4448)) {
                class136.field2024 = arg1.method199(class96.method739(class112.field1726, client.field3526, 0), true);
                class96 var7 = class96.method739(class112.field1726, class328.field4448, 0);
                class19.field264 = arg1.method199(var7, true);
                var7.method747();
                class268.field3670 = arg1.method199(var7, true);
            } else {
                arg1.method245(var2, var3, var4, var6, class301.field4107 | 255 - class107.field1520 << 24, 1);
            }
        }
        if (class136.field2024 != null && class19.field264 != null) {
            int var8 = (var4 - (class19.field264.method628() * 2)) / class136.field2024.method628();
            for (int var9 = 0; var9 < var8; var9++) {
                class136.field2024.method616(class19.field264.method628() + var2 + class136.field2024.method628() * var9, var3);
            }
            class19.field264.method616(var2, var3);
            class268.field3670.method616(var2 + var4 - class268.field3670.method628(), var3);
        }
        class269.field3685.method486(var2 + 3, class139.field2039 | 0xFF000000, (byte) 44, var3 + 14, -1, class436.field6154.method2313((byte) -81, class445.field6241));
        arg1.method245(var2, var3 + var6, var4, var5 - var6, class301.field4107 | -class107.field1520 + 255 << 24, 1);
        int var10 = class116.field1759.method34(true);
        int var11 = class116.field1759.method30((byte) 115);
        for (int var12 = 0; var12 < class149.field2171; var12++) {
            int var26 = var3 + var6 + (-var12 + class149.field2171 + -1) * 16 + 13;
            if (var10 > var2 && var10 < var2 + var4 && var11 > var26 - 13 && (var26 + 4) > var11) {
                arg1.method245(var2, var26 - 12, var4, 16, 255 - class341.field4612 << 24 | class277.field3779, 1);
            }
        }
        if ((class178.field2547 == null || class186.field2700 == null || class405.field5600 == null) && class112.field1726.method1930((byte) 64, class264.field3624) && class112.field1726.method1930((byte) -120, class229.field3228) && class112.field1726.method1930((byte) 50, class98.field1363)) {
            class96 var13 = class96.method739(class112.field1726, class229.field3228, 0);
            class186.field2700 = arg1.method199(var13, true);
            var13.method747();
            class346.field4684 = arg1.method199(var13, true);
            class178.field2547 = arg1.method199(class96.method739(class112.field1726, class264.field3624, 0), true);
            class96 var14 = class96.method739(class112.field1726, class98.field1363, 0);
            class405.field5600 = arg1.method199(var14, true);
            var14.method747();
            class399.field5527 = arg1.method199(var14, true);
        }
        if (class178.field2547 != null && class186.field2700 != null && class405.field5600 != null) {
            int var15 = (var4 - class405.field5600.method628() * 2) / class178.field2547.method628();
            for (int var16 = 0; var16 < var15; var16++) {
                class178.field2547.method616(class405.field5600.method628() + var2 + class178.field2547.method628() * var16, var3 - -var5 - class178.field2547.method631());
            }
            int var17 = ((var5 - var6) - class405.field5600.method631()) / class186.field2700.method631();
            for (int var18 = 0; var18 < var17; var18++) {
                class186.field2700.method616(var2, var3 + var6 + class186.field2700.method631() * var18);
                class346.field4684.method616(var2 + var4 - class346.field4684.method628(), class186.field2700.method631() * var18 + var3 - -var6);
            }
            class405.field5600.method616(var2, var3 + var5 - class405.field5600.method631());
            class399.field5527.method616((var2 + var4) - class405.field5600.method628(), -class405.field5600.method631() + var3 + var5);
        }
        int var19 = 0;
        if (arg0 != 70) {
            field1009 = null;
        }
        for (class429 var20 = (class429) class451.field6491.method1173(arg0 - 70); var20 != null; var20 = (class429) class451.field6491.method1165(true)) {
            int var21 = var6 + var3 + ((class149.field2171 - var19 + -1) * 16) + 13;
            int var22 = class139.field2039 | 0xFF000000;
            if (var10 > var2 && var2 + var4 > var10 && var11 > (var21 - 13) && (var21 + 4) > var11) {
                var22 = class187.field2705 | 0xFF000000;
            }
            int[] var23 = null;
            if (class101.method772(var20.field5977, 9)) {
                var23 = class367.method2308(false, (int) var20.field5969).field186;
            } else if (class323.method1966((byte) 63, var20.field5977)) {
                class419 var24 = class428.field5951[(int) var20.field5969];
                if (var24 != null) {
                    var23 = var24.field5807.field3291;
                }
            } else if (class13.method69(var20.field5977, 124)) {
                if (var20.field5977 == 1011) {
                    var23 = class133.method996((byte) -19, (int) var20.field5969).field6303;
                } else {
                    var23 = class133.method996((byte) -19, (int) (var20.field5969 >>> 32 & 0x7FFFFFFFL)).field6303;
                }
            }
            String var25 = class361.method2225(var20, -46);
            if (var23 != null) {
                var25 = var25 + class303.method1837(var23, -3560);
            }
            var19++;
            class269.field3685.method485(class160.field2277, var25, (byte) 68, 0, class406.field5627, var22, var21, var2 + 3);
        }
        class218.method1452(class4.field32, class124.field1873, class75.field1073, arg0 ^ 0x46, class49.field631);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLms;)V")
    public static final void method571(boolean arg0, class450 arg1) {
        arg1.field6458 = null;
        field1002++;
        int var2 = arg1.field6451.length;
        if (!arg0) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field6451[var3].field2197 = false;
        }
        class399[] var4 = class30.field417;
        synchronized (class30.field417) {
            if (var2 < class30.field417.length && class185.field2625[var2] < 200) {
                class30.field417[var2].method2483(arg1, 0);
                int var10002 = class185.field2625[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lsq;)V")
    public class72(class27 arg0) {
        this.field1005 = arg0;
        this.field1001 = new class338(this.field1005);
        this.field1048 = new class449(this.field1005);
        this.field1042 = new class449(this.field1005);
        this.field1020 = new class449(this.field1005);
        this.field1049 = new class449(this.field1005);
        this.field1046 = new class449(this.field1005);
        this.field1044 = new class449(this.field1005);
    }
}
