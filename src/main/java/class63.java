import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class63 {

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lwa;")
    public static class75 field1099 = class66.method560("3D)2Softwarebibliothek gestartet)3", false);

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lwa;")
    private static class75 field1103 = class66.method560("Loading wordpack )2 ", false);

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1100 = 0;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lwa;")
    public static class75 field1102 = field1103;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lwa;")
    public static class75 field1105 = class66.method560("m", false);

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1108 = -1;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Lwa;")
    public static class75 field1106 = class66.method560("overlay2", false);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lbh;")
    public static class258 field1098;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[I")
    public static int[] field1094;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "[Lbh;")
    public static class258[] field1101;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "[[I")
    public static int[][] field1096;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 19)
    public static final void method544(int arg0) {
        int var1 = 84 / ((-arg0 - 43) / 35);
        field1095++;
        int var2 = class120.method914((byte) -128);
        if (var2 == 0) {
            class198.field3324 = (byte[][][]) null;
            class197.method1471(0, 10429);
        } else if (var2 == 1) {
            class242.method1762(68, (byte) 0);
            class197.method1471(512, 10429);
            class247.method1783(0);
        } else {
            class242.method1762(124, (byte) (class190.field3167 - 4 & 0xFF));
            class197.method1471(2, 10429);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lwa;ILwa;IILwa;)V", line = 52)
    public static final void method545(class75 arg0, int arg1, class75 arg2, int arg3, int arg4, class75 arg5) {
        if (arg3 != 1) {
            field1103 = (class75) null;
        }
        for (int var6 = 99; var6 > 0; var6--) {
            client.field4022[var6] = client.field4022[var6 - 1];
            class88.field1455[var6] = class88.field1455[var6 - 1];
            class194.field3254[var6] = class194.field3254[var6 - 1];
            class153.field2637[var6] = class153.field2637[var6 - 1];
            class190.field3164[var6] = class190.field3164[var6 - 1];
        }
        class88.field1455[0] = arg5;
        class194.field3254[0] = arg2;
        class241.field4069 = class187.field3128;
        field1107++;
        client.field4022[0] = arg1;
        class153.field2637[0] = arg0;
        class147.field2558++;
        class190.field3164[0] = arg4;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 82)
    public static void method546(int arg0) {
        field1101 = null;
        field1099 = null;
        field1098 = null;
        field1106 = null;
        field1094 = null;
        field1102 = null;
        if (arg0 > -78) {
            field1108 = 62;
        }
        field1103 = null;
        field1096 = (int[][]) null;
        field1105 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lah;I)V", line = 118)
    public static final void method547(class194 arg0, int arg1) {
        arg0.field3220 = false;
        field1097++;
        if (arg0.field3215 != -1) {
            class28 var2 = class302.method2082(arg0.field3215, 125);
            if (var2 == null || var2.field368 == null) {
                arg0.field3215 = -1;
            } else {
                arg0.field3203++;
                if (arg0.field3248 < var2.field368.length && var2.field361[arg0.field3248] < arg0.field3203) {
                    arg0.field3203 = 1;
                    arg0.field3248++;
                    class292.method2034(arg0.field3248, class279.field4831 == arg0, arg0.field3259, var2, 21, arg0.field3218);
                }
                if (arg0.field3248 >= var2.field368.length) {
                    arg0.field3203 = 0;
                    arg0.field3248 = 0;
                    class292.method2034(arg0.field3248, class279.field4831 == arg0, arg0.field3259, var2, 26, arg0.field3218);
                }
            }
        }
        if (arg1 < 71) {
            method545((class75) null, -47, (class75) null, 62, 34, (class75) null);
        }
        if (arg0.field3261 != -1 && class143.field2463 >= arg0.field3224) {
            int var3 = class65.method556(arg0.field3261, 126).field4550;
            if (var3 == -1) {
                arg0.field3261 = -1;
            } else {
                class28 var4 = class302.method2082(var3, 70);
                if (var4 == null || var4.field368 == null) {
                    arg0.field3261 = -1;
                } else {
                    if (arg0.field3255 < 0) {
                        arg0.field3255 = 0;
                        class292.method2034(0, class279.field4831 == arg0, arg0.field3259, var4, 56, arg0.field3218);
                    }
                    arg0.field3210++;
                    if (var4.field368.length > arg0.field3255 && var4.field361[arg0.field3255] < arg0.field3210) {
                        arg0.field3255++;
                        arg0.field3210 = 1;
                        class292.method2034(arg0.field3255, class279.field4831 == arg0, arg0.field3259, var4, 34, arg0.field3218);
                    }
                    if (var4.field368.length <= arg0.field3255) {
                        arg0.field3261 = -1;
                    }
                }
            }
        }
        if (arg0.field3204 != -1 && arg0.field3268 <= 1) {
            class28 var5 = class302.method2082(arg0.field3204, 87);
            if (var5.field354 == 1 && arg0.field3222 > 0 && arg0.field3249 <= class143.field2463 && arg0.field3214 < class143.field2463) {
                arg0.field3268 = 1;
                return;
            }
        }
        if (arg0.field3204 != -1 && arg0.field3268 == 0) {
            class28 var6 = class302.method2082(arg0.field3204, 110);
            if (var6 == null || var6.field368 == null) {
                arg0.field3204 = -1;
            } else {
                arg0.field3260++;
                if (var6.field368.length > arg0.field3234 && arg0.field3260 > var6.field361[arg0.field3234]) {
                    arg0.field3260 = 1;
                    arg0.field3234++;
                    class292.method2034(arg0.field3234, class279.field4831 == arg0, arg0.field3259, var6, 48, arg0.field3218);
                }
                if (var6.field368.length <= arg0.field3234) {
                    arg0.field3270++;
                    arg0.field3234 -= var6.field384;
                    if (var6.field375 <= arg0.field3270) {
                        arg0.field3204 = -1;
                    } else if (arg0.field3234 >= 0 && var6.field368.length > arg0.field3234) {
                        class292.method2034(arg0.field3234, class279.field4831 == arg0, arg0.field3259, var6, 1, arg0.field3218);
                    } else {
                        arg0.field3204 = -1;
                    }
                }
                arg0.field3220 = var6.field377;
            }
        }
        if (arg0.field3268 > 0) {
            arg0.field3268--;
        }
    }
}
