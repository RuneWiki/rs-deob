import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class298 extends class278 {

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "Lam;")
    public class277 field5072 = new class277();

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "Lnb;")
    public class125 field5076 = new class125();

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Lgk;")
    private class203 field5062;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field5061 = 0;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Lhi;")
    private static class82 field5065 = class95.method664((byte) -68, "Hidden");

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Lhi;")
    public static class82 field5071 = field5065;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "Lhi;")
    public static class82 field5068 = class95.method664((byte) -111, "l");

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Lhi;")
    public static class82 field5067 = class95.method664((byte) -58, ")1 ");

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "[Lhi;")
    public static class82[] field5064;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 14)
    public static void method2060(int arg0) {
        field5071 = null;
        field5065 = null;
        field5064 = null;
        field5068 = null;
        if (arg0 != 0) {
            field5067 = (class82) null;
        }
        field5067 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILgn;I[I)V", line = 39)
    private final void method2061(int arg0, int arg1, int arg2, class310 arg3, int arg4, int[] arg5) {
        field5069++;
        if ((this.field5062.field3543[arg3.field5282] & 0x4) != 0 && arg3.field5290 < 0) {
            int var7 = this.field5062.field3522[arg3.field5282] / class307.field5236;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field5284) / var7;
                if (arg0 < var8) {
                    arg3.field5284 += arg0 * var7;
                    break;
                }
                arg3.field5297.method881(arg5, arg1, var8);
                arg3.field5284 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                arg0 -= var8;
                int var10 = class307.field5236 / 100;
                class239 var11 = arg3.field5297;
                if (var9 < var10) {
                    var10 = var9;
                }
                if (this.field5062.field3551[arg3.field5282] == 0) {
                    arg3.field5297 = class239.method1703(arg3.field5285, var11.method1685(), var11.method1692(), var11.method1698());
                } else {
                    arg3.field5297 = class239.method1703(arg3.field5285, var11.method1685(), 0, var11.method1698());
                    this.field5062.method1441(arg3, arg2 - 1036124, arg3.field5301.field3753[arg3.field5294] < 0);
                    arg3.field5297.method1715(var10, var11.method1692());
                }
                if (arg3.field5301.field3753[arg3.field5294] < 0) {
                    arg3.field5297.method1711(-1);
                }
                var11.method1717(var10);
                arg1 += var8;
                var11.method881(arg5, arg1, arg4 - arg1);
                if (var11.method1699()) {
                    this.field5076.method876(var11);
                }
            }
        }
        arg3.field5297.method881(arg5, arg1, arg0);
        if (arg2 != 1048575) {
            this.method878();
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "()Ljk;", line = 102)
    public final class278 method886() {
        field5066++;
        class310 var1 = (class310) this.field5072.method1936(16173);
        if (var1 == null) {
            return null;
        } else if (var1.field5297 == null) {
            return this.method875();
        } else {
            return var1.field5297;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()Ljk;", line = 124)
    public final class278 method875() {
        field5075++;
        class310 var1;
        do {
            var1 = (class310) this.field5072.method1926((byte) 90);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5297 == null);
        return var1.field5297;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLgn;)V", line = 145)
    private final void method2062(int arg0, boolean arg1, class310 arg2) {
        if (!arg1) {
            return;
        }
        field5060++;
        if ((this.field5062.field3543[arg2.field5282] & 0x4) != 0 && arg2.field5290 < 0) {
            int var4 = this.field5062.field3522[arg2.field5282] / class307.field5236;
            int var5 = (var4 + 1048575 - arg2.field5284) / var4;
            arg2.field5284 = arg0 * var4 + arg2.field5284 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field5062.field3551[arg2.field5282] == 0) {
                    arg2.field5297 = class239.method1703(arg2.field5285, arg2.field5297.method1685(), arg2.field5297.method1692(), arg2.field5297.method1698());
                } else {
                    arg2.field5297 = class239.method1703(arg2.field5285, arg2.field5297.method1685(), 0, arg2.field5297.method1698());
                    this.field5062.method1441(arg2, 12451, arg2.field5301.field3753[arg2.field5294] < 0);
                }
                if (arg2.field5301.field3753[arg2.field5294] < 0) {
                    arg2.field5297.method1711(-1);
                }
                arg0 = arg2.field5284 / var4;
            }
        }
        arg2.field5297.method883(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([III)V", line = 189)
    public final void method881(int[] arg0, int arg1, int arg2) {
        this.field5076.method881(arg0, arg1, arg2);
        field5074++;
        for (class310 var4 = (class310) this.field5072.method1936(16173); var4 != null; var4 = (class310) this.field5072.method1926((byte) 90)) {
            if (!this.field5062.method1452((byte) -113, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field5287) {
                        this.method2061(var6, var5, 1048575, var4, var5 + var6, arg0);
                        var4.field5287 -= var6;
                        break;
                    }
                    this.method2061(var4.field5287, var5, 1048575, var4, var5 + var6, arg0);
                    var6 -= var4.field5287;
                    var5 += var4.field5287;
                } while (!this.field5062.method1450(-111, arg0, var4, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lgk;)V", line = 321)
    public class298(class203 arg0) {
        this.field5062 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()I", line = 240)
    public final int method878() {
        field5063++;
        return 0;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V", line = 250)
    public final void method883(int arg0) {
        field5073++;
        this.field5076.method883(arg0);
        for (class310 var2 = (class310) this.field5072.method1936(16173); var2 != null; var2 = (class310) this.field5072.method1926((byte) 90)) {
            if (!this.field5062.method1452((byte) -113, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field5287 >= var3) {
                        this.method2062(var3, true, var2);
                        var2.field5287 -= var3;
                        break;
                    }
                    this.method2062(var2.field5287, true, var2);
                    var3 -= var2.field5287;
                } while (!this.field5062.method1450(-104, (int[]) null, var2, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)I", line = 286)
    public static final int method2063(int arg0, int arg1) {
        field5070++;
        if (arg1 < 0) {
            return 0;
        }
        class164 var2 = (class164) class67.field1038.method507((long) arg1, arg0 ^ 0x23E826E9);
        if (var2 == null) {
            return class234.method1666(arg1, true).field2655;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field2870.length; var4++) {
            if (var2.field2870[var4] == -1) {
                var3++;
            }
        }
        if (arg0 != 24841) {
            method2060(-120);
        }
        return var3 + (class234.method1666(arg1, true).field2655 - var2.field2870.length);
    }
}
