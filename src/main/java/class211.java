import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class211 {

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    private int field3281 = 0;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[Lnc;")
    public class86[] field3268;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "[I")
    public static int[] field3279 = new int[500];

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "D")
    public static double field3276 = -1.0D;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "J")
    private long field3265;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Luf;")
    public static class176 field3271;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lnc;")
    private class86 field3269;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "Lnc;")
    private class86 field3282;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method1408(int arg0) {
        if (arg0 != -1) {
            field3279 = null;
        }
        field3271 = null;
        field3279 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(JILnc;)V")
    public final void method1409(long arg0, int arg1, class86 arg2) {
        if (arg2.field1414 != null) {
            arg2.method693(95);
        }
        class86 var5 = this.field3268[(int) (arg0 & (long) (this.field3278 - arg1))];
        field3266++;
        arg2.field1408 = arg0;
        arg2.field1414 = var5.field1414;
        arg2.field1407 = var5;
        arg2.field1414.field1407 = arg2;
        arg2.field1407.field1414 = arg2;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Lnc;")
    public final class86 method1410(int arg0) {
        if (arg0 >= -84) {
            this.field3282 = null;
        }
        field3270++;
        this.field3281 = 0;
        return this.method1413(-1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static final void method1411(byte arg0) {
        field3274++;
        int var1 = 0;
        int var2 = 0;
        if (arg0 >= -62) {
            method1411((byte) -119);
        }
        while (var2 < 104) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class260.method1726(var1, class255.field3907, var3, true, (byte) 119, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public final void method1412(int arg0) {
        if (arg0 != 29692) {
            return;
        }
        for (int var2 = 0; var2 < this.field3278; var2++) {
            class86 var3 = this.field3268[var2];
            while (true) {
                class86 var4 = var3.field1407;
                if (var3 == var4) {
                    break;
                }
                var4.method693(119);
            }
        }
        this.field3282 = null;
        field3280++;
        this.field3269 = null;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)Lnc;")
    public final class86 method1413(int arg0) {
        field3273++;
        if (arg0 > ~this.field3281 && this.field3268[this.field3281 - 1] != this.field3282) {
            class86 var2 = this.field3282;
            this.field3282 = var2.field1407;
            return var2;
        }
        while (this.field3281 < this.field3278) {
            class86 var3 = this.field3268[this.field3281++].field1407;
            if (this.field3268[this.field3281 - 1] != var3) {
                this.field3282 = var3.field1407;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZJ)Lnc;")
    public final class86 method1414(boolean arg0, long arg1) {
        this.field3265 = arg1;
        field3267++;
        class86 var4 = this.field3268[(int) (arg1 & (long) (this.field3278 - 1))];
        if (!arg0) {
            this.method1410(2);
        }
        for (this.field3269 = var4.field1407; this.field3269 != var4; this.field3269 = this.field3269.field1407) {
            if (this.field3269.field1408 == arg1) {
                class86 var5 = this.field3269;
                this.field3269 = this.field3269.field1407;
                return var5;
            }
        }
        this.field3269 = null;
        return null;
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)Lnc;")
    public final class86 method1415(int arg0) {
        field3275++;
        if (arg0 != 0) {
            this.field3278 = 52;
        }
        if (this.field3269 == null) {
            return null;
        }
        class86 var2 = this.field3268[(int) (this.field3265 & (long) (this.field3278 - 1))];
        while (this.field3269 != var2) {
            if (this.field3269.field1408 == this.field3265) {
                class86 var3 = this.field3269;
                this.field3269 = this.field3269.field1407;
                return var3;
            }
            this.field3269 = this.field3269.field1407;
        }
        this.field3269 = null;
        return null;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(I)V")
    public class211(int arg0) {
        this.field3278 = arg0;
        this.field3268 = new class86[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class86 var3 = this.field3268[var2] = new class86();
            var3.field1407 = var3;
            var3.field1414 = var3;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)I")
    public final int method1416(byte arg0) {
        field3272++;
        if (arg0 != -24) {
            this.field3282 = null;
        }
        return this.field3278;
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(I)I")
    public final int method1417(int arg0) {
        if (arg0 != 21808) {
            this.field3278 = 65;
        }
        int var2 = 0;
        field3277++;
        for (int var3 = 0; var3 < this.field3278; var3++) {
            class86 var4 = this.field3268[var3];
            for (class86 var5 = var4.field1407; var5 != var4; var5 = var5.field1407) {
                var2++;
            }
        }
        return var2;
    }
}
