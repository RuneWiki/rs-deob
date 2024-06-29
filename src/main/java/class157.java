import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class157 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lqd;")
    public static class148 field3263 = new class148();

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[Lie;")
    public static class79[] field3267 = new class79[4];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    public static int[] field3266;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1085(int arg0) {
        field3266 = null;
        field3267 = null;
        int var1 = 30 / ((6 - arg0) / 55);
        field3263 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)[Lrc;")
    public static final class156[] method1086(byte arg0) {
        class156[] var1 = new class156[class97.field2312];
        for (int var2 = 0; var2 < class97.field2312; var2++) {
            class156 var3 = new class156();
            var3.field3261 = class28.field658;
            var3.field3256 = class153.field3202;
            var3.field3259 = class163.field3366[var2];
            var3.field3260 = class60.field1521[var2];
            var3.field3254 = class190.field3875[var2];
            var3.field3255 = class190.field3868[var2];
            var3.field3258 = class110.field2486;
            var3.field3257 = class85.field2014[var2];
            var1[var2] = var3;
        }
        field3262++;
        class12.method151((byte) -102);
        return arg0 <= 124 ? null : var1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        if ((arg4 & arg3) == 1) {
            int var8 = arg6;
            arg6 = arg2;
            arg2 = var8;
        }
        field3265++;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return 7 + 1 - arg1 - arg6;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIILd;JLd;Ld;)V")
    public static final void method1088(int arg0, int arg1, int arg2, int arg3, class30 arg4, long arg5, class30 arg6, class30 arg7) {
        class147 var9 = new class147();
        var9.field3103 = arg4;
        var9.field3104 = arg1 * 128 + 64;
        var9.field3101 = arg2 * 128 + 64;
        var9.field3099 = arg3;
        var9.field3097 = arg5;
        var9.field3105 = arg6;
        var9.field3110 = arg7;
        short var10 = 0;
        class96 var11 = class148.field3117[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2272; var12++) {
                if ((var11.field2284[var12].field2319 & 0x400000L) == 4194304L && var11.field2284[var12].field2316 instanceof class36) {
                    class36 var13 = (class36) var11.field2284[var12].field2316;
                    var13.method331();
                    if (var13.field728 < var10) {
                        var10 = var13.field728;
                    }
                }
            }
        }
        var9.field3106 = -var10;
        if (class148.field3117[arg0][arg1][arg2] == null) {
            class148.field3117[arg0][arg1][arg2] = new class96(arg0, arg1, arg2);
        }
        class148.field3117[arg0][arg1][arg2].field2276 = var9;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLff;)Lff;")
    public static final class54 method1089(boolean arg0, class54 arg1) {
        if (!arg0) {
            method1086((byte) -48);
        }
        field3264++;
        int var2 = class169.method1143(false, class10.method136((byte) -104, arg1));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class59.method555(arg1.field1353, 32173);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)J")
    public static final long method1090(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        return var3 == null || var3.field2271 == null ? 0L : var3.field2271.field2449;
    }
}
