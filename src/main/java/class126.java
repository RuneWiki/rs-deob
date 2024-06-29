import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class126 extends class42 {

    @OriginalMember(owner = "client!ud", name = "vb", descriptor = "Z")
    public boolean field3080 = false;

    @OriginalMember(owner = "client!ud", name = "Mb", descriptor = "I")
    private int field3097 = 0;

    @OriginalMember(owner = "client!ud", name = "Pb", descriptor = "I")
    private int field3100 = 0;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!ud", name = "Kb", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!ud", name = "zb", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    private int field3061;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "Lne;")
    private class85 field3069;

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "Lbd;")
    public static class12 field3066 = new class12(50);

    @OriginalMember(owner = "client!ud", name = "sb", descriptor = "Lae;")
    private static class6 field3077 = class64.method474(113, " more options");

    @OriginalMember(owner = "client!ud", name = "Cb", descriptor = "Lae;")
    public static class6 field3087 = class64.method474(118, "titlebutton");

    @OriginalMember(owner = "client!ud", name = "Eb", descriptor = "Lae;")
    public static class6 field3089 = class64.method474(107, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!ud", name = "ub", descriptor = "Lae;")
    private static class6 field3079 = class64.method474(110, "Enter name:");

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
    public static int field3073 = 2301979;

    @OriginalMember(owner = "client!ud", name = "Bb", descriptor = "I")
    public static int field3086 = -1;

    @OriginalMember(owner = "client!ud", name = "Hb", descriptor = "Lae;")
    public static class6 field3092 = class64.method474(120, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ud", name = "qb", descriptor = "Lae;")
    public static class6 field3075 = class64.method474(112, "Mem:");

    @OriginalMember(owner = "client!ud", name = "Db", descriptor = "Lae;")
    public static class6 field3088 = field3079;

    @OriginalMember(owner = "client!ud", name = "Jb", descriptor = "Lae;")
    public static class6 field3094 = field3077;

    @OriginalMember(owner = "client!ud", name = "yb", descriptor = "Lae;")
    public static class6 field3083 = class64.method474(126, "Absender:");

    @OriginalMember(owner = "client!ud", name = "Ob", descriptor = "Lae;")
    private static class6 field3099 = class64.method474(121, "Loading ignore list");

    @OriginalMember(owner = "client!ud", name = "tb", descriptor = "J")
    public static long field3078 = 0L;

    @OriginalMember(owner = "client!ud", name = "rb", descriptor = "Lae;")
    public static class6 field3076 = class64.method474(110, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!ud", name = "Nb", descriptor = "Lae;")
    private static class6 field3098 = class64.method474(116, "Close");

    @OriginalMember(owner = "client!ud", name = "Lb", descriptor = "Lae;")
    public static class6 field3096 = class64.method474(106, "Stufe)2");

    @OriginalMember(owner = "client!ud", name = "Qb", descriptor = "Lae;")
    public static class6 field3101 = field3099;

    @OriginalMember(owner = "client!ud", name = "Ib", descriptor = "Lae;")
    private static class6 field3093 = class64.method474(113, "Please reload this page)3");

    @OriginalMember(owner = "client!ud", name = "pb", descriptor = "Lae;")
    public static class6 field3074 = field3093;

    @OriginalMember(owner = "client!ud", name = "Gb", descriptor = "Lae;")
    public static class6 field3091 = field3098;

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ud", name = "wb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ud", name = "xb", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ud", name = "Ab", descriptor = "Lva;")
    public static class128 field3085;

    @OriginalMember(owner = "client!ud", name = "Fb", descriptor = "Z")
    public static boolean field3090;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V", line = 28)
    public static final void method1024(int arg0, int arg1) {
        field3081++;
        if (arg1 == -1 || (!class42.field958[arg1] || class35.field828[arg1] == null)) {
            return;
        }
        int var2 = -45 / ((31 - arg0) / 63);
        for (int var3 = 0; var3 < class35.field828[arg1].length; var3++) {
            class121 var4 = class35.field828[arg1][var3];
            if (var4 != null) {
                var4.field2914 = var4.field2852;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 62)
    public static void method1025(byte arg0) {
        field3077 = null;
        field3094 = null;
        field3089 = null;
        field3101 = null;
        field3075 = null;
        field3074 = null;
        field3076 = null;
        field3092 = null;
        field3099 = null;
        field3083 = null;
        field3091 = null;
        field3085 = null;
        if (arg0 <= 110) {
            return;
        }
        field3088 = null;
        field3096 = null;
        field3098 = null;
        field3066 = null;
        field3093 = null;
        field3087 = null;
        field3079 = null;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V", line = 91)
    public final void method1026(int arg0, int arg1) {
        field3072++;
        if (this.field3080) {
            return;
        }
        if (arg1 != 2) {
            method1027(76);
        }
        this.field3097 += arg0;
        while (this.field3097 > this.field3069.field2043[this.field3100]) {
            this.field3097 -= this.field3069.field2043[this.field3100];
            this.field3100++;
            if (this.field3100 >= this.field3069.field2049.length) {
                this.field3080 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 154)
    public static final void method1027(int arg0) {
        field3067++;
        class85.field2051.method932(-18967);
        int var1 = class85.field2051.method939(1, -13873);
        if (var1 == 0) {
            return;
        }
        if (arg0 != 0) {
            method1030(-52, null, 48);
        }
        int var2 = class85.field2051.method939(2, arg0 - 13873);
        if (var2 == 0) {
            class87.field2081[class92.field2205++] = 2047;
        } else if (var2 == 1) {
            int var3 = class85.field2051.method939(3, -13873);
            class12.field229.method616(arg0 - 1, var3, false);
            int var4 = class85.field2051.method939(1, -13873);
            if (var4 == 1) {
                class87.field2081[class92.field2205++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class85.field2051.method939(3, -13873);
            class12.field229.method616(-1, var5, true);
            int var6 = class85.field2051.method939(3, -13873);
            class12.field229.method616(-1, var6, true);
            int var7 = class85.field2051.method939(1, -13873);
            if (var7 == 1) {
                class87.field2081[class92.field2205++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class85.field2051.method939(7, -13873);
            int var9 = class85.field2051.method939(1, -13873);
            if (var9 == 1) {
                class87.field2081[class92.field2205++] = 2047;
            }
            class15.field305 = class85.field2051.method939(2, arg0 - 13873);
            int var10 = class85.field2051.method939(7, -13873);
            int var11 = class85.field2051.method939(1, -13873);
            class12.field229.method607(var10, var11 == 1, (byte) 10, var8);
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V", line = 241)
    public static final void method1028(int arg0) {
        if (arg0 != 32257) {
            field3077 = null;
        }
        field3070++;
        while (true) {
            class95 var1 = class21.field509;
            class87 var2;
            synchronized (class21.field509) {
                var2 = (class87) class30.field722.method794((byte) 52);
            }
            if (var2 == null) {
                return;
            }
            var2.field2090.method1043(var2.field2086, (int) var2.field1501, false, var2.field2093, (byte) -80);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V", line = 271)
    public static final void method1029(byte arg0, int arg1) {
        if (arg0 < 34) {
            field3089 = null;
        }
        field3071++;
        class129.field3142 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIII)V", line = 376)
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3063 = arg1;
        this.field3065 = arg2;
        this.field3062 = arg3;
        this.field3095 = arg4;
        this.field3084 = arg5 + arg6;
        this.field3061 = arg0;
        int var8 = class69.method500(0, this.field3061).field3275;
        if (var8 == -1) {
            this.field3080 = true;
        } else {
            this.field3080 = false;
            this.field3069 = class35.method314(var8, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(Z)Lv;", line = 317)
    public final class131 method3(boolean arg0) {
        class134 var2 = class69.method500(0, this.field3061);
        if (!arg0) {
            method1029((byte) -14, -80);
        }
        field3064++;
        class131 var3;
        if (this.field3080) {
            var3 = var2.method1098(180, -1);
        } else {
            var3 = var2.method1098(180, this.field3100);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILm;I)Lae;", line = 343)
    public static final class6 method1030(int arg0, class77 arg1, int arg2) {
        field3068++;
        try {
            class6 var3 = new class6();
            if (arg0 != 0) {
                method1028(17);
            }
            var3.field93 = arg1.method662((byte) 124);
            if (var3.field93 > arg2) {
                var3.field93 = arg2;
            }
            var3.field114 = new byte[var3.field93];
            arg1.field1821 += class40.field904.method504(0, var3.field114, var3.field93, arg1.field1821, arg1.field1858, arg0 + 38);
            return var3;
        } catch (Exception var4) {
            return class80.field1953;
        }
    }
}
