import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class160 implements class145 {

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    private int field3092 = 128;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    private int field3096 = 50;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lpe;")
    private class154 field3100;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lpe;")
    private class154 field3098;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lvc;")
    private class212 field3094;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field3097 = 0;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field3108 = 4;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[[Lih;")
    public static class87[][] field3093 = new class87[field3108][500];

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
    public static int[] field3089 = new int[field3108];

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lvc;")
    public static class212 field3095 = new class212(64);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Lob;")
    private static class141 field3112 = class175.method1195(40, " has logged out)3");

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lob;")
    private static class141 field3114 = class175.method1195(40, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Lob;")
    public static class141 field3116 = field3114;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field3115 = 0;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field3117 = 0;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "Lob;")
    public static class141 field3113 = field3112;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Lpe;")
    public static class154 field3111;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "Lca;")
    public static class22 field3118;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Lhg;")
    public static class77 field3101;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Z")
    public final boolean method956(int arg0, int arg1) {
        field3106++;
        if (this.field3092 == 64 || this.method1114((byte) -59, arg0).field1195 == 64) {
            return true;
        } else {
            if (arg1 != 18872) {
                this.method961(122, -69);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(II)V")
    public final void method1113(int arg0, int arg1) {
        field3110++;
        if (arg1 <= 10) {
            return;
        }
        for (class61 var3 = (class61) this.field3094.method1381((byte) 18); var3 != null; var3 = (class61) this.field3094.method1382((byte) 97)) {
            if (var3.field1206) {
                var3.method406(arg0, (byte) 97);
                var3.field1206 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BFI)[I")
    public final int[] method958(byte arg0, float arg1, int arg2) {
        field3104++;
        if (arg0 >= -12) {
            this.method962(false, -46);
        }
        class61 var4 = this.method1114((byte) -59, arg2);
        var4.field1206 = true;
        return var4.method409(this, arg1, 65344, this.field3092, this.field3098);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)Lg;")
    private final class61 method1114(byte arg0, int arg1) {
        field3103++;
        if (arg0 != -59) {
            return null;
        }
        class61 var3 = (class61) this.field3094.method1383((long) arg1, (byte) 127);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3100.method1065((byte) -111, arg1, 0);
        if (var4 == null) {
            return class19.method117(11096);
        } else {
            class146 var5 = new class146(var4);
            class61 var6 = new class61(var5);
            this.field3094.method1378(var6, (byte) -118, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(II)Z")
    public final boolean method961(int arg0, int arg1) {
        field3102++;
        if (arg0 != 12377) {
            this.field3100 = null;
        }
        return this.method1114((byte) -59, arg1).method410(this.field3098, (byte) -101, this);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[I")
    public final int[] method960(int arg0, byte arg1) {
        int var3 = -105 % ((11 - arg1) / 55);
        class61 var4 = this.method1114((byte) -59, arg0);
        field3107++;
        return var4.method411(this.field3092, this.field3098, -100, this);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Z")
    public final boolean method957(int arg0, int arg1) {
        field3090++;
        if (arg1 < 27) {
            this.field3094 = null;
        }
        return this.method1114((byte) -59, arg0).field1186;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)Z")
    public final boolean method962(boolean arg0, int arg1) {
        if (arg0) {
            field3114 = null;
        }
        field3088++;
        return this.method1114((byte) -59, arg1).field1185;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method1115(int arg0) {
        field3101 = null;
        field3111 = null;
        field3118 = null;
        field3113 = null;
        field3114 = null;
        field3093 = null;
        field3116 = null;
        if (arg0 != 26285) {
            method1121(false, -71);
        }
        field3112 = null;
        field3089 = null;
        field3095 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static final void method1116(int arg0) {
        field3101.method415((byte) 112);
        field3087++;
        for (int var1 = 0; var1 < 32; var1++) {
            class212.field4056[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class163.field3156[var2] = 0L;
        }
        if (arg0 <= 3) {
            field3118 = null;
        }
        class136.field2587 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public final void method1117(int arg0) {
        if (arg0 > -71) {
            this.method1114((byte) 74, 51);
        }
        this.field3094 = new class212(this.field3096);
        field3099++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILsh;)V")
    public static final void method1118(int arg0, class187 arg1) {
        field3086++;
        class126.field2424 = arg1;
        if (arg0 > -97) {
            method1116(-102);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1119(int arg0, int arg1, int arg2, int arg3) {
        if (class15.method97(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class214.method1399(var4 + 1, class110.field2119[arg0][arg1][arg2] + arg3, var5 + 1) && class214.method1399(var4 + 128 - 1, class110.field2119[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class214.method1399(var4 + 128 - 1, class110.field2119[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class214.method1399(var4 + 1, class110.field2119[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static final void method1120(int arg0) {
        if (arg0 != 0) {
            field3114 = null;
        }
        class142.field2750.method1385(9946);
        field3105++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(ZI)V")
    public static final void method1121(boolean arg0, int arg1) {
        if (arg1 != -8496) {
            field3108 = 23;
        }
        field3109++;
        if (class176.field3494 == null) {
            return;
        }
        try {
            class146 var2 = new class146(4);
            var2.method997(80, arg0 ? 2 : 3);
            var2.method1011(-63, 0);
            class176.field3494.method1093(39, var2.field2859, 4, 0);
        } catch (IOException var4) {
            try {
                class176.field3494.method1089(arg1 + 8494);
            } catch (Exception var3) {
            }
            class176.field3494 = null;
            class38.field752++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
    public final int method959(int arg0, int arg1) {
        field3091++;
        if (arg1 != -30480) {
            field3101 = null;
        }
        return this.method1114((byte) -59, arg0).field1205;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lpe;Lpe;II)V")
    public class160(class154 arg0, class154 arg1, int arg2, int arg3) {
        this.field3100 = arg0;
        this.field3096 = arg2;
        this.field3098 = arg1;
        this.field3092 = arg3;
        this.field3094 = new class212(this.field3096);
    }
}
