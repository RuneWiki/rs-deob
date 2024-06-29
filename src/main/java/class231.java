import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class231 {

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
    public static boolean field3098 = true;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field3110 = 50;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "[I")
    public static int[] field3113 = new int[field3110];

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "[I")
    public static int[] field3107 = new int[field3110];

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "[I")
    public static int[] field3108 = new int[field3110];

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "[I")
    public static int[] field3106 = new int[field3110];

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field3112 = new String[field3110];

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "[I")
    public static int[] field3099 = new int[field3110];

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "[I")
    public static int[] field3102 = new int[field3110];

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Lqj;")
    public static class296 field3105;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILrg;)Lrg;")
    public static final class383 method1445(int arg0, class383 arg1) {
        field3095++;
        if (arg1.field5538 != -1) {
            return class290.method1869((byte) 78, arg1.field5538);
        }
        if (arg0 != -26360) {
            method1448((byte) 27);
        }
        int var2 = arg1.field5507 >>> 16;
        class191 var3 = new class191(class271.field3700);
        for (class432 var4 = (class432) var3.method1264((byte) -56); var4 != null; var4 = (class432) var3.method1265(arg0 ^ 0x66F7)) {
            if (var4.field6217 == var2) {
                return class290.method1869((byte) 114, (int) var4.field5363);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3112 = null;
        int var1 = 63 / ((arg0 - 43) / 49);
        field3105 = null;
        field3102 = null;
        field3106 = null;
        field3108 = null;
        field3099 = null;
        field3107 = null;
        field3113 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljj;B)V")
    public static final void method1447(class61 arg0, byte arg1) {
        if (arg1 != -92) {
            method1445(65, (class383) null);
        }
        field3097++;
        if (arg0 instanceof class437) {
            class437 var2 = (class437) arg0;
            if (var2.field6290 != null) {
                class61.method406((byte) -113, var2);
            }
        } else if (arg0 instanceof class354) {
            class266.method1649(-18536, (class354) arg0);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static final void method1448(byte arg0) {
        class190 var1 = class412.field5982;
        synchronized (class412.field5982) {
            class412.field5982.method1243(1000);
            if (arg0 != -5) {
                field3110 = 96;
            }
        }
        field3103++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)V")
    public static final void method1449(int arg0, byte arg1) {
        int var2 = 94 % ((arg1 - 28) / 39);
        field3111++;
        class399 var3 = class269.method1655(3, arg0, -13);
        var3.method2582(0);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1450(int arg0, int arg1, String arg2) {
        field3109++;
        class442.field6400.method158((byte) 7, 41);
        class206.field2788++;
        class442.field6400.method2396(class322.method2036(arg2, 98) + 1, arg0 + 12450);
        class442.field6400.method2404(arg1, (byte) -40);
        if (arg0 == 0) {
            class442.field6400.method2412(arg0 - 89, arg2);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1451(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3101++;
        class21.method139(arg3, arg4, arg5, arg7, arg2, 0, (byte) -69, arg0, arg6);
        if (arg1 >= -19) {
            field3108 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)I")
    public static final int method1452(int arg0, int arg1, int arg2, int arg3) {
        field3096++;
        if (arg0 <= 83) {
            field3105 = null;
        }
        if (arg3 > arg2) {
            return arg3;
        } else if (arg2 <= arg1) {
            return arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBI)V")
    public static final void method1453(int arg0, byte arg1, int arg2) {
        if (arg1 != 22) {
            method1447((class61) null, (byte) 93);
        }
        field3104++;
        class399 var3 = class269.method1655(14, arg2, arg1 - 95);
        var3.method2583((byte) 71);
        var3.field5842 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(IIII)I")
    public static final int method1454(int arg0, int arg1, int arg2, int arg3) {
        field3100++;
        int var4 = arg0 & arg1;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }
}
