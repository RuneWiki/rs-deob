import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class175 {

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lsg;")
    public class163 field3107 = new class163();

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Lke;")
    private static class256 field3100 = class316.method2202("Loaded config", 27626);

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field3106 = 100;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3103 = 0;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Lke;")
    public static class256 field3113 = field3100;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field3108 = 0;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "[B")
    public static byte[] field3115 = new byte[520];

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "Lke;")
    public static class256 field3117 = class316.method2202("welle2:", 27626);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Lsg;")
    private class163 field3119;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "[[I")
    public static int[][] field3111;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)Lsg;", line = 7)
    public final class163 method1267(int arg0) {
        int var2 = -47 % ((arg0 - 31) / 35);
        class163 var3 = this.field3107.field2893;
        field3110++;
        if (this.field3107 == var3) {
            return null;
        } else {
            var3.method1199(21966);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 24)
    public static void method1268(boolean arg0) {
        if (arg0) {
            return;
        }
        field3100 = null;
        field3117 = null;
        field3113 = null;
        field3111 = (int[][]) null;
        field3115 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLsg;)V", line = 52)
    public final void method1269(boolean arg0, class163 arg1) {
        field3112++;
        if (arg1.field2894 != null) {
            arg1.method1199(21966);
        }
        arg1.field2894 = this.field3107.field2894;
        if (!arg0) {
            arg1.field2893 = this.field3107;
            arg1.field2894.field2893 = arg1;
            arg1.field2893.field2894 = arg1;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Lsg;", line = 80)
    public final class163 method1270(byte arg0) {
        field3097++;
        class163 var2 = this.field3107.field2893;
        if (arg0 != -121) {
            method1279(23, (class67) null, -2, -46, 31, 99, true);
        }
        if (this.field3107 == var2) {
            this.field3119 = null;
            return null;
        } else {
            this.field3119 = var2.field2893;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)V", line = 103)
    public static final void method1271(byte arg0, int arg1) {
        if (arg0 == 51) {
            class77 var2 = class156.method1158(2, false, arg1);
            field3118++;
            var2.method586((byte) 98);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)Lsg;", line = 126)
    public final class163 method1272(boolean arg0) {
        field3101++;
        if (!arg0) {
            field3108 = 28;
        }
        class163 var2 = this.field3107.field2894;
        if (this.field3107 == var2) {
            this.field3119 = null;
            return null;
        } else {
            this.field3119 = var2.field2894;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILsg;)V", line = 147)
    public final void method1273(int arg0, class163 arg1) {
        if (arg1.field2894 != null) {
            arg1.method1199(21966);
        }
        if (arg0 != 19402) {
            method1278(-15, -50, 20, -85, 68);
        }
        field3116++;
        arg1.field2893 = this.field3107.field2893;
        arg1.field2894 = this.field3107;
        arg1.field2894.field2893 = arg1;
        arg1.field2893.field2894 = arg1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([S[Lke;Z)V", line = 167)
    public static final void method1274(short[] arg0, class256[] arg1, boolean arg2) {
        field3114++;
        class250.method1683(arg1, arg0, arg1.length - 1, 0, (byte) 117);
        if (!arg2) {
            field3103 = 110;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V", line = 184)
    public final void method1275(byte arg0) {
        while (true) {
            class163 var2 = this.field3107.field2893;
            if (this.field3107 == var2) {
                this.field3119 = null;
                int var3 = 77 / ((-arg0 - 7) / 43);
                field3098++;
                return;
            }
            var2.method1199(21966);
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)Lsg;", line = 206)
    public final class163 method1276(byte arg0) {
        field3104++;
        if (arg0 != -124) {
            return (class163) null;
        }
        class163 var2 = this.field3119;
        if (this.field3107 == var2) {
            this.field3119 = null;
            return null;
        } else {
            this.field3119 = var2.field2894;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Lsg;", line = 241)
    public final class163 method1277(int arg0) {
        field3105++;
        class163 var2 = this.field3119;
        if (this.field3107 == var2) {
            this.field3119 = null;
            return null;
        } else {
            this.field3119 = var2.field2893;
            return arg0 == 1 ? var2 : (class163) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII)V", line = 272)
    public static final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -100) {
            method1268(true);
        }
        if (arg3 >= class105.field1887 && arg3 <= class274.field4748) {
            int var5 = class101.method731(field3106, arg0, class244.field4161, true);
            int var6 = class101.method731(field3106, arg2, class244.field4161, true);
            class231.method1566(var6, (byte) 78, var5, arg3, arg1);
        }
        field3099++;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 330)
    public class175() {
        this.field3107.field2893 = this.field3107;
        this.field3107.field2894 = this.field3107;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILgg;IIIIZ)V", line = 320)
    public static final void method1279(int arg0, class67 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3102++;
        class170.method1239(arg0, arg1.field1197, arg4, arg5, arg2, arg3, arg1.field1192, 13);
        if (!arg6) {
            field3111 = (int[][]) ((int[][]) null);
        }
    }
}
