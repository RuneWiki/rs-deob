import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class133 extends class12 {

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public int field2891 = -1;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public int field2904 = 0;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Lpe;")
    public static class109 field2896 = null;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Lpe;")
    public static class109 field2901 = class141.method1120("", 0);

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field2899 = 0;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "[I")
    public static int[] field2902 = new int[128];

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Lpe;")
    public static class109 field2893 = class141.method1120(" <col=ffffff>", 0);

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Lpe;")
    public static class109 field2897 = class141.method1120("Ung-Ultiges Anmelde)2Paket)3", 0);

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field2898 = 0;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "Lpe;")
    public static class109 field2911 = class141.method1120("Null", 0);

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "Lpe;")
    public static class109 field2913 = class141.method1120(":duelreq:", 0);

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public int field2910;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z")
    public static final boolean method1064(int arg0, int arg1) {
        if (arg0 != 1584502260) {
            field2896 = null;
        }
        field2895++;
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILpe;Lbe;)I")
    public static final int method1065(int arg0, class109 arg1, class13 arg2) {
        field2894++;
        int var3 = arg2.field309;
        arg2.method151((byte) -117, arg1.field2295);
        arg2.field309 += class92.field1976.method206(arg1.field2295, (byte) -59, arg2.field279, arg2.field309, arg1.field2279, arg0);
        return arg2.field309 - var3;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method1066(int arg0) {
        field2897 = null;
        field2902 = null;
        if (arg0 != 0) {
            return;
        }
        field2896 = null;
        field2893 = null;
        field2911 = null;
        field2901 = null;
        field2913 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLub;)V")
    public static final void method1067(byte arg0, class141 arg1) {
        arg1.field3102 = false;
        if (arg1.field3060 != -1) {
            class6 var2 = class27.method238(8, arg1.field3060);
            if (var2 == null || var2.field144 == null) {
                arg1.field3060 = -1;
            } else {
                arg1.field3126++;
                if (var2.field144.length > arg1.field3067 && var2.field164[arg1.field3067] < arg1.field3126) {
                    arg1.field3126 = 1;
                    arg1.field3067++;
                    class2.method14(arg1.field3067, arg1.field3106, var2, (byte) -96, arg1.field3094);
                }
                if (arg1.field3067 >= var2.field144.length) {
                    arg1.field3067 = 0;
                    arg1.field3126 = 0;
                    class2.method14(arg1.field3067, arg1.field3106, var2, (byte) -32, arg1.field3094);
                }
            }
        }
        if (arg1.field3128 != -1 && class12.field264 >= arg1.field3054) {
            if (arg1.field3065 < 0) {
                arg1.field3065 = 0;
            }
            int var3 = class85.method716((byte) 27, arg1.field3128).field1821;
            if (var3 == -1) {
                arg1.field3128 = -1;
            } else {
                class6 var4 = class27.method238(8, var3);
                if (var4 == null || var4.field144 == null) {
                    arg1.field3128 = -1;
                } else {
                    arg1.field3082++;
                    if (var4.field144.length > arg1.field3065 && var4.field164[arg1.field3065] < arg1.field3082) {
                        arg1.field3065++;
                        arg1.field3082 = 1;
                        class2.method14(arg1.field3065, arg1.field3106, var4, (byte) -41, arg1.field3094);
                    }
                    if (var4.field144.length <= arg1.field3065 && (arg1.field3065 < 0 || arg1.field3065 >= var4.field144.length)) {
                        arg1.field3128 = -1;
                    }
                }
            }
        }
        field2912++;
        if (arg1.field3124 != -1 && arg1.field3081 <= 1) {
            class6 var5 = class27.method238(8, arg1.field3124);
            if (var5.field142 == 1 && arg1.field3110 > 0 && class12.field264 >= arg1.field3112 && class12.field264 > arg1.field3070) {
                arg1.field3081 = 1;
                return;
            }
        }
        if (arg0 <= 5) {
            method1064(86, -5);
        }
        if (arg1.field3124 != -1 && arg1.field3081 == 0) {
            class6 var6 = class27.method238(8, arg1.field3124);
            if (var6 == null || var6.field144 == null) {
                arg1.field3124 = -1;
            } else {
                arg1.field3083++;
                if (arg1.field3122 < var6.field144.length && var6.field164[arg1.field3122] < arg1.field3083) {
                    arg1.field3122++;
                    arg1.field3083 = 1;
                    class2.method14(arg1.field3122, arg1.field3106, var6, (byte) -52, arg1.field3094);
                }
                if (arg1.field3122 >= var6.field144.length) {
                    arg1.field3122 -= var6.field134;
                    arg1.field3063++;
                    if (var6.field150 <= arg1.field3063) {
                        arg1.field3124 = -1;
                    } else if (arg1.field3122 >= 0 && var6.field144.length > arg1.field3122) {
                        class2.method14(arg1.field3122, arg1.field3106, var6, (byte) -27, arg1.field3094);
                    } else {
                        arg1.field3124 = -1;
                    }
                }
                arg1.field3102 = var6.field135;
            }
        }
        if (arg1.field3081 > 0) {
            arg1.field3081--;
        }
    }
}
