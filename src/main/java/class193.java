import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class193 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lib;")
    private class162 field3050 = new class162();

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Ljg;")
    private class177 field3063 = new class177();

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    private int field3061;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    private int field3065;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lfd;")
    private class130 field3062;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lti;")
    public static class5 field3056 = null;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
    public static int[] field3051 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Z")
    public static boolean field3055 = true;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3047 = 0;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3054 = 1;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lfa;")
    public static class273 field3048;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[[[I")
    public static int[][][] field3049;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lib;JI)V")
    public final void method1337(class162 arg0, long arg1, int arg2) {
        field3060++;
        if (~this.field3065 == arg2) {
            class162 var5 = this.field3063.method1185(-8241);
            var5.method900(arg2 ^ 0xFFFFFFAB);
            var5.method1075(arg2 ^ 0xFFFFE253);
            if (this.field3050 == var5) {
                class162 var6 = this.field3063.method1185(-8241);
                var6.method900(69);
                var6.method1075(7596);
            }
        } else {
            this.field3065--;
        }
        this.field3062.method857(false, arg0, arg1);
        this.field3063.method1190(8217, arg0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public final void method1338(boolean arg0) {
        field3058++;
        this.field3063.method1192((byte) 0);
        this.field3062.method874((byte) -128);
        this.field3050 = new class162();
        if (arg0) {
            field3055 = true;
        }
        this.field3065 = this.field3061;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Lq;")
    public final class134 method1339(byte arg0) {
        int var2 = 125 % ((arg0 + 16) / 53);
        field3057++;
        return this.field3062.method871(-36);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)Lq;")
    public final class134 method1340(boolean arg0) {
        if (arg0) {
            this.method1339((byte) -25);
        }
        field3064++;
        return this.field3062.method869(-14210);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1341(int arg0) {
        field3056 = null;
        field3051 = null;
        if (arg0 == -19880) {
            field3048 = null;
            field3049 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lma;B)Lhi;")
    public static final class239 method1342(class202 arg0, byte arg1) {
        field3052++;
        if (arg1 <= 46) {
            method1341(62);
        }
        return new class239(arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1401((byte) -123), arg0.method1420((byte) 0));
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IJ)Lib;")
    public final class162 method1343(int arg0, long arg1) {
        field3053++;
        int var4 = 45 / (-arg0 / 41);
        class162 var5 = (class162) this.field3062.method872((byte) -88, arg1);
        if (var5 != null) {
            this.field3063.method1190(8217, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
    public class193(int arg0) {
        this.field3061 = arg0;
        this.field3065 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3062 = new class130(var2);
    }
}
