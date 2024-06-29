import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class214 extends class43 {

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    private int field3322 = 0;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    private int field3325 = -32768;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    private int field3335 = -1;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "Z")
    public boolean field3338 = false;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    private int field3339 = 0;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    private int field3324;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "Lfb;")
    private class30 field3337;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3345 = " from your ignore list first.";

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Led;")
    public static class186 field3330;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "Led;")
    public static class186 field3334;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "Lri;")
    private class67 field3327;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3331;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "()I")
    public final int method102() {
        field3341++;
        return this.field3325;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1449(int arg0) {
        field3345 = null;
        field3331 = null;
        field3334 = null;
        if (arg0 != -32768) {
            method1449(-102);
        }
        field3330 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIIJILri;)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class67 arg10) {
        class9 var13 = this.method1451(0);
        field3342++;
        if (var13 != null) {
            var13.method100(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3327);
            this.field3325 = var13.method102();
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)V")
    public final void method1450(byte arg0, int arg1) {
        field3336++;
        if (this.field3338) {
            return;
        }
        this.field3322 += arg1;
        while (this.field3337.field423[this.field3339] < this.field3322) {
            this.field3322 -= this.field3337.field423[this.field3339];
            this.field3339++;
            if (this.field3339 >= this.field3337.field439.length) {
                this.field3338 = true;
                break;
            }
        }
        if (!this.field3338) {
            class52.method390(false, this.field3337, this.field3339, 111, this.field3343, this.field3340);
        }
        int var3 = 82 % ((-arg0 - 32) / 40);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V")
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3323++;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lig;")
    private final class9 method1451(int arg0) {
        if (arg0 != 0) {
            this.field3335 = 100;
        }
        field3326++;
        class238 var2 = class16.method158(this.field3324, true);
        class9 var3;
        if (this.field3338) {
            var3 = var2.method1638((byte) 74, -1, -1, 0);
        } else {
            var3 = var2.method1638((byte) 74, this.field3335, this.field3339, this.field3322);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIIII)V")
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3344 = arg4;
        this.field3324 = arg0;
        this.field3343 = arg3;
        this.field3340 = arg2;
        this.field3332 = arg5 + arg6;
        this.field3333 = arg1;
        int var8 = class16.method158(this.field3324, true).field3852;
        if (var8 == -1) {
            this.field3338 = true;
        } else {
            this.field3338 = false;
            this.field3337 = class148.method996(-117, var8);
        }
        if (this.field3332 == arg6) {
            class52.method390(false, this.field3337, this.field3339, 98, this.field3343, this.field3340);
        }
    }
}
