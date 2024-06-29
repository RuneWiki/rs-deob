import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class138 extends class63 {

    @OriginalMember(owner = "client!on", name = "r", descriptor = "Lfk;")
    public static class304 field1897 = new class304();

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field1899 = 0;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field1898;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 4)
    public static void method995(int arg0) {
        field1897 = null;
        field1898 = null;
        if (arg0 >= -9) {
            field1897 = (class304) null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILkm;I)Lkn;", line = 18)
    public static final class178 method996(int arg0, class133 arg1, int arg2) {
        if (arg2 < 42) {
            method997(35, (class344) null, 69, 45, 68, 58, -22, -116);
        }
        field1892++;
        return class189.method1326(true, arg1, arg0) ? class25.method145(17511) : null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILin;IIIIII)V", line = 38)
    public static final void method997(int arg0, class344 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1901++;
        int var8 = arg6 * arg6 + arg7 * arg7;
        if (arg3 < var8) {
            return;
        }
        int var9 = 70 % ((arg0 - 21) / 53);
        int var10 = Math.min(arg1.field5334 / 2, arg1.field5293 / 2);
        if (var10 * var10 >= var8) {
            class76.method562(class6.field53[arg2], arg4, arg5, arg1, arg6, true, arg7);
            return;
        }
        int var11 = (int) class89.field1257 + class264.field3859 & 0x7FF;
        var10 -= 10;
        int var12 = class184.field2532[var11];
        int var13 = class184.field2538[var11];
        int var14 = var12 * 256 / (class252.field3618 + 256);
        int var15 = var13 * 256 / (class252.field3618 + 256);
        int var16 = arg6 * var14 - arg7 * var15 >> 16;
        int var17 = arg6 * var15 + arg7 * var14 >> 16;
        double var18 = Math.atan2((double) var17, (double) var16);
        int var20 = (int) ((double) var10 * Math.sin(var18));
        int var21 = (int) ((double) var10 * Math.cos(var18));
        if (class67.field908) {
            ((class328) class153.field2127[arg2]).method2294(240, 240, (arg1.field5334 / 2 + arg4 + var20) * 16, (arg5 - (var21 - (arg1.field5293 / 2))) * 16, (int) (var18 * 10430.378D), 4096);
        } else {
            ((class178) class153.field2127[arg2]).method835(arg1.field5334 / 2 + arg4 + var20 - 10, arg1.field5293 / 2 + -var21 + arg5 + -10, 20, 20, 15, 15, var18, 256);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;", line = 88)
    public static final String method998(int arg0, int arg1, int arg2, long arg3, boolean arg4) {
        int var6 = -23 / ((arg2 + 15) / 34);
        field1894++;
        char var7 = ',';
        char var8 = '.';
        if (arg1 == 0) {
            var8 = ',';
            var7 = '.';
        }
        if (arg1 == 2) {
            var8 = ' ';
        }
        boolean var9 = false;
        StringBuffer var10 = new StringBuffer(26);
        if (arg3 < 0L) {
            arg3 = -arg3;
            var9 = true;
        }
        if (arg0 > 0) {
            for (int var11 = 0; var11 < arg0; var11++) {
                int var12 = (int) arg3;
                arg3 /= 10L;
                var10.append((char) (48 - ((int) arg3 * 10 - var12)));
            }
            var10.append(var7);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg3;
            arg3 /= 10L;
            var10.append((char) (var14 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var9) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg4) {
                var13++;
                if (var13 % 3 == 0) {
                    var10.append(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)V", line = 166)
    public static final void method999(int arg0, byte arg1) {
        if (class278.field4179 == 0) {
            class141.field1927.method598(arg0, -21801);
        } else {
            class106.field1437 = arg0;
        }
        if (arg1 >= 55) {
            field1893++;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(IB)V", line = 183)
    public static final void method1000(int arg0, byte arg1) {
        field1896++;
        if (class136.field1887 == null) {
            class136.field1887 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class136.field1887[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 != 2) {
            method1001(-92);
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 221)
    public static final void method1001(int arg0) {
        if (class316.field4811 == arg0) {
            if (class89.field1253 == class55.field751 && class82.field1189 == class247.field3560) {
                class316.field4811 = 0;
                if (class167.field2276 && class149.field2067[81] && class204.field2938 > 2) {
                    class203.method1440(class204.field2938 - 2, (byte) 39);
                } else {
                    class203.method1440(class204.field2938 - 1, (byte) 39);
                }
            }
        } else if (class55.field751 == class217.field3104 && class82.field1189 == class155.field2142) {
            class316.field4811 = 0;
            if (class167.field2276 && class149.field2067[81] && class204.field2938 > 2) {
                class203.method1440(class204.field2938 - 2, (byte) 39);
            } else {
                class203.method1440(class204.field2938 - 1, (byte) 39);
            }
        } else {
            class89.field1253 = class217.field3104;
            class316.field4811 = 2;
            class247.field3560 = class155.field2142;
        }
        field1895++;
    }
}
