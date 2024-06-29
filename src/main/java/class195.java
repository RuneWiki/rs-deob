import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class195 {

    @OriginalMember(owner = "client!og", name = "o", descriptor = "J")
    public long field3324 = 0L;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[I")
    public static int[] field3314 = new int[99];

    @OriginalMember(owner = "client!og", name = "p", descriptor = "[I")
    public static int[] field3325 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3310 = 0;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lcd;")
    public static class64 field3318 = class44.method335((byte) 71, "Weiter");

    @OriginalMember(owner = "client!og", name = "x", descriptor = "[I")
    public static int[] field3333;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "Lig;")
    public static class168 field3332;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "Lcd;")
    public static class64 field3334;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "La;")
    public class262 field3330;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 7)
    public static void method1368(int arg0) {
        field3314 = null;
        field3333 = null;
        field3332 = null;
        field3318 = null;
        field3334 = null;
        field3325 = null;
        if (arg0 != 1) {
            field3310 = -115;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Z", line = 23)
    public static final boolean method1369(int arg0, byte arg1) {
        field3312++;
        int var2 = -83 / ((arg1 - 3) / 43);
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)Lcd;", line = 36)
    public static final class64 method1370(byte arg0, int arg1) {
        field3327++;
        if (arg0 != -102) {
            method1372(31, (KeyEvent) null);
        }
        return arg1 < 999999999 ? class310.method2149(arg1, (byte) 1) : class94.field1738;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3314[var1] = var0 / 4;
        }
        field3333 = new int[50];
        field3332 = new class168(260);
        field3334 = class44.method335((byte) 71, " weitere Optionen");
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V", line = 64)
    public static final void method1371(int arg0, int arg1, int arg2) {
        field3319++;
        int var3 = arg1;
        if (arg2 > -1) {
            field3314 = (int[]) null;
        }
        if (arg1 > 25) {
            var3 = 25;
        }
        arg1--;
        int var4 = class228.field3873[arg1];
        int var5 = class88.field1602[arg1];
        if (arg0 == 0) {
            class97.field1782++;
            class17.field353.method1214(-3, 22);
            class17.field353.method130(-1, var3 + var3 + 3);
        }
        if (arg0 == 1) {
            class290.field5003++;
            class17.field353.method1214(-123, 221);
            class17.field353.method130(-1, var3 + var3 + 17);
        }
        if (arg0 == 2) {
            class165.field2895++;
            class17.field353.method1214(-105, 209);
            class17.field353.method130(-1, var3 + var3 + 3);
        }
        class17.field353.method160((byte) -56, class121.field2184 + var5);
        class17.field353.method130(-1, class120.field2174[82] ? 1 : 0);
        class17.field353.method145(127, class190.field3269 + var4);
        class12.field233 = class88.field1602[0];
        class40.field631 = class228.field3873[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class17.field353.method114(class228.field3873[arg1] - var4, (byte) -35);
            class17.field353.method127(-14265, class88.field1602[arg1] - var5);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 129)
    public static final int method1372(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        field3317++;
        if (var2 == 8364) {
            return 128;
        }
        int var3 = 55 % ((arg0 - 74) / 34);
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(III)V", line = 149)
    public static final void method1373(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class183.field3140; var3++) {
            for (int var4 = 0; var4 < class146.field2588; var4++) {
                for (int var5 = 0; var5 < class314.field5327; var5++) {
                    class295 var6 = class304.field5203[var3][var4][var5];
                    if (var6 != null) {
                        class162 var7 = var6.field5092;
                        if (var7 != null && var7.field2852.method1069()) {
                            class143.method1017(var7.field2852, var3, var4, var5, 1, 1);
                            if (var7.field2842 != null && var7.field2842.method1069()) {
                                class143.method1017(var7.field2842, var3, var4, var5, 1, 1);
                                var7.field2852.method1071(var7.field2842, 0, 0, 0, false);
                                var7.field2842 = var7.field2842.method1088(arg0, arg1, arg2);
                            }
                            var7.field2852 = var7.field2852.method1088(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field5075; var8++) {
                            class195 var9 = var6.field5090[var8];
                            if (var9 != null && var9.field3330.method1069()) {
                                class143.method1017(var9.field3330, var3, var4, var5, var9.field3328 + 1 - var9.field3313, var9.field3323 - var9.field3322 + 1);
                                var9.field3330 = var9.field3330.method1088(arg0, arg1, arg2);
                            }
                        }
                        class37 var10 = var6.field5095;
                        if (var10 != null && var10.field599.method1069()) {
                            class65.method549(var10.field599, var3, var4, var5);
                            var10.field599 = var10.field599.method1088(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
