import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class221 implements class669 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lmv;")
    private class295 field2931;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Ljava/lang/String;")
    private String field2936;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lvg;")
    public static class622 field2930 = new class622(91, 17);

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
    public static boolean field2937 = false;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[I")
    public static int[] field2933;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lrg;B)I", line = 3)
    public static final int method1386(class523 arg0, byte arg1) {
        if (arg1 > -41) {
            return 79;
        }
        field2939++;
        if (arg0.field7390 == 0) {
            return 0;
        }
        if (arg0.field7423 != -1) {
            class523 var2 = null;
            if (arg0.field7423 < 32768) {
                class177 var3 = (class177) class271.field3550.method2002((byte) -109, (long) arg0.field7423);
                if (var3 != null) {
                    var2 = var3.field2476;
                }
            } else if (arg0.field7423 >= 32768) {
                var2 = class35.field551[arg0.field7423 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field7895 - var2.field7895;
                int var5 = arg0.field7896 - var2.field7896;
                if (var4 != 0 || var5 != 0) {
                    arg0.method2954((byte) -93, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0 instanceof class71)) {
            class71 var9 = (class71) arg0;
            if (var9.field1116 != -1 && (var9.field7436 == 0 || var9.field7432 > 0)) {
                var9.method2954((byte) -108, var9.field1116);
                var9.field1116 = -1;
            }
        } else if (arg0 instanceof class53) {
            class53 var6 = (class53) arg0;
            if (var6.field813 != -1 && (var6.field7436 == 0 || var6.field7432 > 0)) {
                int var7 = var6.field7895 - ((var6.field813 - class397.field6005 - class397.field6005) * 256);
                int var8 = var6.field7896 - (var6.field807 - class403.field6049 - class403.field6049) * 256;
                if (var7 != 0 || var8 != 0) {
                    var6.method2954((byte) 126, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
                var6.field813 = -1;
            }
        }
        return arg0.method2961(-121);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 89)
    public static void method1387(int arg0) {
        field2930 = null;
        if (arg0 != 16383) {
            field2933 = null;
        }
        field2933 = null;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Z", line = 111)
    public static final boolean method1388(byte arg0) {
        field2929++;
        if (arg0 != -47) {
            return true;
        }
        class381 var1 = class152.field2150.field4475.field5735;
        if (var1 == null || class152.field2150.field4475 == var1) {
            return false;
        }
        class426 var2 = (class426) var1;
        if (var2.field6223 >= 2000) {
            var2.field6223 -= 2000;
        }
        return var2.field6223 == 1008;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Lbl;", line = 135)
    public final class348 method358(byte arg0) {
        if (arg0 < 75) {
            return null;
        } else {
            field2932++;
            return class348.field5154;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lmv;Ljava/lang/String;)V", line = 147)
    public class221(class295 arg0, String arg1) {
        this.field2931 = arg0;
        this.field2936 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V", line = 161)
    public static final void method1389(byte arg0) {
        if (arg0 != -33) {
            field2937 = true;
        }
        field2935++;
        if (class332.field4821 == null) {
            return;
        }
        class604.field8729.method2366(false);
        class152.method1081();
        class185.method1232(-92);
        class565.method3259(-28871);
        class417.method2536((byte) 86);
        class530.method3072(-122);
        if (class383.field5750 != null) {
            class383.field5750.method1974(arg0 + 33);
        }
        class530.method3073(-25103);
        class245.method1499(-70);
        class553.method3221(arg0 + 21358);
        class197.method1291(1760);
        class61.method379((byte) -101, false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class71 var5 = class35.field551[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field7431.length; var6++) {
                    var5.field7431[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class378.field5678; var2++) {
            class53 var3 = class13.field299[var2].field2476;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field7431.length; var4++) {
                    var3.field7431[var4] = null;
                }
            }
        }
        class242.field3215 = null;
        class510.field7197 = null;
        class332.field4821.method623((byte) 21);
        class332.field4821 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I", line = 237)
    public final int method360(byte arg0) {
        field2934++;
        if (arg0 == 84) {
            return this.field2931.method1841(this.field2936, true) ? 100 : 0;
        } else {
            return 11;
        }
    }
}
