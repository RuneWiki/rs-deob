import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class151 {

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lob;")
    private class154 field2930 = new class154(256);

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Lob;")
    private class154 field2939 = new class154(256);

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Lnb;")
    private class144 field2938;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lnb;")
    private class144 field2931;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2934 = -1;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Li;")
    private static class88 field2927 = class208.method1425(105, "Error connecting to server)3");

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Li;")
    public static class88 field2928 = field2927;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lob;")
    public static class154 field2924 = new class154(32);

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "Li;")
    private static class88 field2943 = class208.method1425(105, "Loading sprites )2 ");

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "Li;")
    public static class88 field2941 = field2943;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field2940 = 0;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "[I")
    public static int[] field2942;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method1032(int arg0) {
        field2942 = null;
        field2943 = null;
        field2924 = null;
        field2928 = null;
        if (arg0 != 1750) {
            field2928 = null;
        }
        field2941 = null;
        field2927 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V")
    public static final void method1033(byte arg0, int arg1) {
        class17 var2 = class43.field732;
        synchronized (class43.field732) {
            class190.field3670 = arg1;
        }
        if (arg0 < -100) {
            field2936++;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II[I)Ltf;")
    public final class213 method1034(int arg0, int arg1, int[] arg2) {
        field2935++;
        if (this.field2931.method942((byte) -55) == 1) {
            return this.method1036(-1673520700, arg1, arg2, 0);
        }
        int var4 = 50 % ((23 - arg0) / 36);
        if (this.field2931.method944(128, arg1) != 1) {
            throw new RuntimeException();
        }
        return this.method1036(-1673520700, 0, arg2, arg1);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([IIII)Ltf;")
    private final class213 method1035(int[] arg0, int arg1, int arg2, int arg3) {
        field2932++;
        int var5 = arg3 ^ ((arg1 & 0xD0000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class213 var9 = (class213) this.field2939.method1051(-1, var7);
        if (arg2 != -41513424) {
            method1033((byte) -37, -70);
        }
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class195 var10 = (class195) this.field2930.method1051(arg2 ^ 0x27971CF, var7);
            if (var10 == null) {
                var10 = class195.method1356(this.field2938, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2930.method1054(var7, var10, -1);
            }
            class213 var11 = var10.method1357(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method460(true);
                this.field2939.method1054(var7, var11, -1);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II[II)Ltf;")
    private final class213 method1036(int arg0, int arg1, int[] arg2, int arg3) {
        field2929++;
        if (arg0 != -1673520700) {
            field2924 = null;
        }
        int var5 = (arg3 << 4 & 0xFFF4 | arg3 >>> 12) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class213 var9 = (class213) this.field2939.method1051(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class38 var10 = class38.method252(this.field2931, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class213 var11 = var10.method253();
            this.field2939.method1054(var7, var11, -1);
            if (arg2 != null) {
                arg2[0] -= var11.field4033.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([III)Ltf;")
    public final class213 method1037(int[] arg0, int arg1, int arg2) {
        field2937++;
        if (this.field2938.method942((byte) -110) == 1) {
            return this.method1035(arg0, 0, -41513424, arg2);
        }
        if (arg1 != 25304) {
            field2925 = 77;
        }
        if (this.field2938.method944(arg1 ^ 0x6258, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method1035(arg0, arg2, -41513424, 0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1038(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class13 var8 = new class13();
        var8.field204 = arg2 / 128;
        var8.field194 = arg3 / 128;
        var8.field187 = arg4 / 128;
        var8.field200 = arg5 / 128;
        var8.field190 = arg1;
        var8.field185 = arg2;
        var8.field193 = arg3;
        var8.field191 = arg4;
        var8.field205 = arg5;
        var8.field189 = arg6;
        var8.field196 = arg7;
        class62.field1149[arg0][class62.field1148[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lnb;Lnb;)V")
    public class151(class144 arg0, class144 arg1) {
        this.field2938 = arg1;
        this.field2931 = arg0;
    }
}
