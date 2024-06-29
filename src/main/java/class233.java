import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class233 {

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Lka;")
    private class473 field3243 = new class473(256);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lpg;")
    private class333 field3238;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Ll;")
    private class127 field3240;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field3241 = 100;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Lrb;")
    public static class283 field3244 = new class283(112, -1);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Lwc;")
    public static class372 field3248;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 3)
    public static void method1422(int arg0) {
        field3248 = null;
        if (arg0 != 9158) {
            field3248 = null;
        }
        field3244 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIFIZIII)[[I", line = 16)
    public static final int[][] method1423(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field3247++;
        int[][] var9 = new int[arg6][arg2];
        class315 var10 = new class315();
        var10.field4269 = arg5;
        var10.field4278 = arg8;
        var10.field4268 = (int) (arg3 * 4096.0F);
        var10.field4266 = arg1;
        var10.field4270 = arg4;
        var10.method146((byte) -100);
        class481.method2860(arg2, (byte) -41, arg6);
        for (int var11 = 0; var11 < arg6; var11++) {
            var10.method1815(-71, var9[var11], var11);
        }
        if (arg7 != 256) {
            method1423(-65, 48, -12, 1.4913459F, -97, true, -44, -72, 124);
        }
        return var9;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 47)
    public final void method1424(int arg0) {
        if (arg0 != 34842) {
            field3246 = 52;
        }
        this.field3243.method2764(arg0 - 35611);
        field3239++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Lbd;", line = 62)
    public final class142 method1425(int arg0, int arg1) {
        if (arg0 >= -88) {
            method1422(-106);
        }
        field3245++;
        Object var3 = this.field3243.method2767((long) arg1, 0);
        if (var3 != null) {
            return (class142) var3;
        } else if (this.field3240.method918(arg1, 100)) {
            class249 var4 = this.field3240.method914(false, arg1);
            int var5 = var4.field3386 ? 64 : this.field3238.field4717;
            class142 var7;
            if (var4.field3374 && this.field3238.method549()) {
                float[] var6 = this.field3240.method916(false, var5, false, var5, arg1, 0.7F);
                var7 = new class142(this.field3238, 3553, 34842, var5, var5, var4.field3388 != 0, var6, 6408);
            } else {
                int[] var8;
                short var9;
                if (var4.field3381 && class5.method34(var4.field3382, 102)) {
                    var8 = this.field3240.method915(var5, arg1, 0.7F, (byte) 43, false, var5);
                    var9 = 6407;
                } else {
                    var9 = 6408;
                    var8 = this.field3240.method917(var5, true, 0.7F, arg1, var5, false);
                }
                var7 = new class142(this.field3238, 3553, var9, var5, var5, var4.field3388 != 0, var8, false);
            }
            var7.method990(var4.field3375, 1024, var4.field3392);
            this.field3243.method2777(-1025, var7, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lpg;Ll;)V", line = 122)
    public class233(class333 arg0, class127 arg1) {
        this.field3238 = arg0;
        this.field3240 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 132)
    public final void method1426(int arg0) {
        this.field3243.method2779(14896, 5);
        if (arg0 >= -118) {
            method1422(-103);
        }
        field3242++;
    }
}
