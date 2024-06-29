import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class class13 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
    public static int[] field113 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Lqe;")
    public static class168 field117 = class66.method448("settings", 100);

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lqe;")
    private static class168 field114 = class66.method448("flash3:", 63);

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[I")
    public static int[] field121 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lqe;")
    public static class168 field116 = field114;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Lqe;")
    public static class168 field122 = class66.method448("Lade Schrifts-=tze )2 ", 111);

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lqe;")
    public static class168 field127 = field114;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Leg;")
    public static class5 field118;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lqf;IIIZ)V")
    public void method41(class13 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field126++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()Z")
    public boolean method42() {
        field111++;
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()I")
    public abstract int method43();

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Z")
    public static final boolean method44(int arg0, byte arg1) {
        field112++;
        if (arg1 > -56) {
            return false;
        } else {
            return (arg0 >> 21 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field120++;
        if (class222.field3811 <= arg1 && arg1 <= class196.field3402) {
            int var5 = class97.method639(arg3, (byte) 12, class174.field3055, class249.field4314);
            int var6 = class97.method639(arg2, (byte) 12, class174.field3055, class249.field4314);
            class204.method1326(0, arg1, var5, var6, arg0);
        }
        int var7 = -128 % ((-arg4 - 81) / 45);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;Z)Lqe;")
    public static final class168 method46(String arg0, boolean arg1) {
        field119++;
        if (arg1) {
            return null;
        }
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class168 var3 = new class168();
        var3.field2904 = var2;
        var3.field2870 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field2870++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIB)V")
    public void method47(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field125++;
        if (arg4 != -83) {
            this.method42();
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method48(int arg0) {
        field127 = null;
        field113 = null;
        field121 = null;
        field117 = null;
        if (arg0 != -27131) {
            method46(null, false);
        }
        field114 = null;
        field122 = null;
        field116 = null;
        field118 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != Integer.MAX_VALUE) {
            field113 = null;
        }
        field123++;
        if (arg6 < 0 || arg3 < 0 || arg6 >= 103 || arg3 >= 103) {
            return;
        }
        if (arg1 == 0) {
            class162 var8 = class99.method654(arg5, arg6, arg3);
            if (var8 != null) {
                int var9 = (int) (var8.field2769 >>> 32) & Integer.MAX_VALUE;
                if (arg7 == 2) {
                    var8.field2775 = new class178(var9, 2, arg2 + 4, arg5, arg6, arg3, arg0, false, var8.field2775);
                    var8.field2777 = new class178(var9, 2, arg2 + 1 & 0x3, arg5, arg6, arg3, arg0, false, var8.field2777);
                } else {
                    var8.field2775 = new class178(var9, arg7, arg2, arg5, arg6, arg3, arg0, false, var8.field2775);
                }
            }
        }
        if (arg1 == 1) {
            class199 var10 = class213.method1372(arg5, arg6, arg3);
            if (var10 != null) {
                int var11 = (int) (var10.field3443 >>> 32) & Integer.MAX_VALUE;
                if (arg7 == 4 || arg7 == 5) {
                    var10.field3446 = new class178(var11, 4, arg2, arg5, arg6, arg3, arg0, false, var10.field3446);
                } else if (arg7 == 6) {
                    var10.field3446 = new class178(var11, 4, arg2 + 4, arg5, arg6, arg3, arg0, false, var10.field3446);
                } else if (arg7 == 7) {
                    var10.field3446 = new class178(var11, 4, (arg2 + 2 & 0x3) + 4, arg5, arg6, arg3, arg0, false, var10.field3446);
                } else if (arg7 == 8) {
                    var10.field3446 = new class178(var11, 4, arg2 + 4, arg5, arg6, arg3, arg0, false, var10.field3446);
                    var10.field3441 = new class178(var11, 4, (arg2 + 2 & 0x3) + 4, arg5, arg6, arg3, arg0, false, var10.field3441);
                }
            }
        }
        if (arg1 == 2) {
            if (arg7 == 11) {
                arg7 = 10;
            }
            class169 var12 = class82.method546(arg5, arg6, arg3);
            if (var12 != null) {
                var12.field2934 = new class178((int) (var12.field2937 >>> 32) & Integer.MAX_VALUE, arg7, arg2, arg5, arg6, arg3, arg0, false, var12.field2934);
            }
        }
        if (arg1 != 3) {
            return;
        }
        class17 var13 = class123.method834(arg5, arg6, arg3);
        if (var13 != null) {
            var13.field153 = new class178((int) (var13.field148 >>> 32) & Integer.MAX_VALUE, 22, arg2, arg5, arg6, arg3, arg0, false, var13.field153);
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Lqf;")
    public class13 method51(int arg0, int arg1, int arg2) {
        field124++;
        return this;
    }
}
