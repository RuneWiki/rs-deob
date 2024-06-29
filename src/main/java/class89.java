import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class class89 implements class698 {

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "Lkha;")
    public class687 field1132;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "Lkha;")
    private class687 field1129;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "Lpd;")
    public class619 field1128;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "Lmq;")
    public static class78 field1126 = new class78(105, 10);

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    private int field1135;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "J")
    private long field1131;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "Lda;")
    private class423 field1124;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)Z", line = 4)
    public boolean method616(byte arg0) {
        if (arg0 != 30) {
            this.field1135 = -45;
        }
        field1134++;
        boolean var2 = true;
        if (!this.field1132.method3827(this.field1128.field8663, (byte) 75)) {
            var2 = false;
        }
        if (!this.field1129.method3827(this.field1128.field8663, (byte) 82)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(FFIFIILhm;IF[BIIF)V", line = 29)
    public static final void method617(float arg0, float arg1, int arg2, float arg3, int arg4, int arg5, class229 arg6, int arg7, float arg8, byte[] arg9, int arg10, int arg11, float arg12) {
        field1127++;
        for (int var13 = arg4; var13 < arg2; var13++) {
            class509.method2936(arg7, arg1, (byte) 110, arg3, arg2, arg12, arg9, arg10, arg6, arg8, arg11, arg0, var13, arg5);
            arg7 += arg10 * arg11;
        }
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I", line = 46)
    public final int method618(int arg0) {
        field1133++;
        int var2 = class733.field10249.method2370(true);
        if (arg0 != 10000) {
            this.method621(-18);
        }
        int var3 = var2 * 100;
        if (this.field1135 == var2 && var2 != 0) {
            int var4 = class733.field10249.method2366(-61);
            if (var2 < var4) {
                long var5 = this.field1131 - class733.field10249.method2376((byte) -125);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class97.method654((byte) 97) - this.field1131) * 10000L;
                    if (var7 > var9) {
                        var3 = (int) (var9 * 100L * (long) (var4 - var2) / var7 + ((long) (var2 * 100)));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field1135 = var2;
            this.field1131 = class97.method654((byte) 78);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)V", line = 104)
    public final void method620(boolean arg0, int arg1) {
        field1136++;
        int var3 = this.field1128.field8672.method4235(false, class303.field3896, this.field1128.field8673) + this.field1128.field8674;
        int var4 = this.field1128.field8662.method2413(this.field1128.field8665, class708.field9966, (byte) -8) + this.field1128.field8675;
        this.method622(var4, var3, 2, arg0);
        this.method619(var3, var4, 104, arg0);
        String var5 = class733.field10249.method2377(-1);
        if ((class97.method654((byte) 83) - this.field1131) > 10000L) {
            var5 = var5 + " (" + class733.field10249.method2365(1).method1319(true) + ")";
        }
        this.field1124.method2510(this.field1128.field8665 / 2 + var4 + this.field1128.field8667 + 4, -1, this.field1128.field8669, 16777215, var5, var3 + (this.field1128.field8673 / 2));
        if (arg1 < 108) {
            this.method619(-8, -68, 97, true);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 126)
    public void method621(int arg0) {
        field1130++;
        class56 var2 = class653.method3527(this.field1129, (byte) -120, this.field1128.field8663);
        this.field1124 = class458.field6407.method156(var2, class196.method1235(this.field1132, this.field1128.field8663), true);
        if (arg0 != 27799) {
            this.field1131 = -2L;
        }
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(B)V", line = 144)
    public static void method623(byte arg0) {
        field1126 = null;
        int var1 = 91 / ((arg0 - 13) / 34);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILha;I)Ltba;", line = 153)
    public static final class56 method624(int arg0, class454 arg1, int arg2) {
        if (arg2 == 10000) {
            field1125++;
            class365 var3 = class504.method2913(true, arg1, arg0, true);
            return var3 == null ? null : var3.field5173;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lkha;Lkha;Lpd;)V", line = 168)
    public class89(class687 arg0, class687 arg1, class619 arg2) {
        this.field1132 = arg0;
        this.field1129 = arg1;
        this.field1128 = arg2;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIZ)V")
    public abstract void method619(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(IIIZ)V")
    public abstract void method622(int arg0, int arg1, int arg2, boolean arg3);
}
