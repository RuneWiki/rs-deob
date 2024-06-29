import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class18 {

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Ljm;")
    public class151 field293 = new class151();

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lbd;")
    public static class162 field290 = class17.method142(0, "Opened titlescreen)3");

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field299 = 0;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Ljm;")
    private class151 field304;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "[Lpm;")
    public static class99[] field303;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)Ljm;", line = 8)
    public final class151 method160(byte arg0) {
        field298++;
        class151 var2 = this.field293.field2691;
        if (this.field293 == var2) {
            this.field304 = null;
            return null;
        }
        if (arg0 != -48) {
            method161(120, -32, -4, 36, 125, -105, -39);
        }
        this.field304 = var2.field2691;
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIII)V", line = 28)
    public static final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class22 var7 = new class22();
        var7.field346 = arg1 / 128;
        var7.field347 = arg2 / 128;
        var7.field356 = arg3 / 128;
        var7.field352 = arg4 / 128;
        var7.field336 = arg0;
        var7.field345 = arg1;
        var7.field355 = arg2;
        var7.field350 = arg3;
        var7.field340 = arg4;
        var7.field338 = arg5;
        var7.field353 = arg6;
        class129.field2335[class127.field2314++] = var7;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 48)
    public static void method162(int arg0) {
        field303 = null;
        field290 = null;
        if (arg0 != 0) {
            field294 = 31;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjm;)V", line = 64)
    public final void method163(byte arg0, class151 arg1) {
        field300++;
        if (arg1.field2691 != null) {
            arg1.method1183(false);
        }
        arg1.field2707 = this.field293.field2707;
        arg1.field2691 = this.field293;
        if (arg0 != 77) {
            this.method160((byte) 50);
        }
        arg1.field2691.field2707 = arg1;
        arg1.field2707.field2691 = arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Ljm;", line = 83)
    public final class151 method164(boolean arg0) {
        if (arg0) {
            field299 = -10;
        }
        class151 var2 = this.field304;
        field289++;
        if (this.field293 == var2) {
            this.field304 = null;
            return null;
        } else {
            this.field304 = var2.field2691;
            return var2;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Ljm;", line = 107)
    public final class151 method165(byte arg0) {
        field302++;
        class151 var2 = this.field304;
        if (this.field293 == var2) {
            this.field304 = null;
            return null;
        }
        this.field304 = var2.field2707;
        if (arg0 != -101) {
            method161(105, -37, 87, -76, 35, 35, 89);
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V", line = 135)
    public static final void method166(int arg0, int arg1) {
        field305++;
        if (arg0 > -48) {
            method161(-40, -117, -115, 75, -28, 61, -126);
        }
        class63 var2 = class46.method332(11, arg1, -12770);
        var2.method427(-22507);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLjm;)V", line = 148)
    public final void method167(boolean arg0, class151 arg1) {
        if (arg1.field2691 != null) {
            arg1.method1183(false);
        }
        arg1.field2707 = this.field293;
        field292++;
        arg1.field2691 = this.field293.field2691;
        if (!arg0) {
            arg1.field2691.field2707 = arg1;
            arg1.field2707.field2691 = arg1;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([Z[[FI[[IIBZIZIZZLba;[[IIZI[[FII[I[[F)V", line = 171)
    public static final void method168(boolean[] arg0, float[][] arg1, int arg2, int[][] arg3, int arg4, byte arg5, boolean arg6, int arg7, boolean arg8, int arg9, boolean arg10, boolean arg11, class26 arg12, int[][] arg13, int arg14, boolean arg15, int arg16, float[][] arg17, int arg18, int arg19, int[] arg20, float[][] arg21) {
        field297++;
        int var22 = (arg10 ? 255 : 0) + (arg4 << 8);
        int var23 = (arg2 << 8) + (arg15 ? 255 : 0);
        int[] var24 = new int[arg20.length / 2];
        int var25 = (arg8 ? 255 : 0) + (arg16 << 8);
        if (!arg11) {
            return;
        }
        int var26 = (arg6 ? 255 : 0) + (arg19 << 8);
        for (int var27 = 0; var27 < var24.length; var27++) {
            int var28 = arg20[var27 + var27 + 1];
            int[][] var29 = arg3 == null || arg0 == null || !arg0[var27] ? arg13 : arg3;
            int var30 = arg20[var27 + var27];
            var24[var27] = class265.method1817(arg1, arg5, arg17, var22, !arg11, arg21, var28, var30, var23, arg7, false, arg12, var25, arg9, var26, arg3, (float) arg14, var29);
        }
        arg12.method209(arg18, arg7, arg9, var24, (int[]) null, false);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Ljm;", line = 214)
    public final class151 method169(int arg0) {
        field306++;
        int var2 = -125 % ((arg0 + 63) / 55);
        class151 var3 = this.field293.field2707;
        if (this.field293 == var3) {
            this.field304 = null;
            return null;
        } else {
            this.field304 = var3.field2707;
            return var3;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Ljm;", line = 239)
    public final class151 method170(int arg0) {
        class151 var2 = this.field293.field2707;
        if (arg0 < 81) {
            method166(100, -84);
        }
        field295++;
        if (this.field293 == var2) {
            return null;
        } else {
            var2.method1183(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 292)
    public class18() {
        this.field293.field2707 = this.field293;
        this.field293.field2691 = this.field293;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V", line = 273)
    public final void method171(int arg0) {
        field301++;
        while (true) {
            class151 var2 = this.field293.field2707;
            if (this.field293 == var2) {
                this.field304 = null;
                int var3 = 46 % ((-arg0 - 34) / 40);
                return;
            }
            var2.method1183(false);
        }
    }
}
