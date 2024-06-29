import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    private int field316 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[Lda;")
    public class42[] field299;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
    public static int[] field305 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field311 = 0;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Z")
    public static volatile boolean field302 = false;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "F")
    public static float field301;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "J")
    private long field304;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lda;")
    private class42 field307;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lda;")
    private class42 field317;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JLda;B)V", line = 4)
    public final void method173(long arg0, class42 arg1, byte arg2) {
        field315++;
        if (arg1.field630 != null) {
            arg1.method300(false);
        }
        if (arg2 < 67) {
            return;
        }
        class42 var5 = this.field299[(int) ((long) (this.field314 - 1) & arg0)];
        arg1.field619 = var5;
        arg1.field630 = var5.field630;
        arg1.field630.field619 = arg1;
        arg1.field619.field630 = arg1;
        arg1.field622 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I", line = 30)
    public final int method174(int arg0) {
        if (arg0 >= -41) {
            this.method181((byte) -117);
        }
        field312++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field314; var3++) {
            class42 var4 = this.field299[var3];
            for (class42 var5 = var4.field619; var5 != var4; var5 = var5.field619) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[Lda;)I", line = 63)
    public final int method175(int arg0, class42[] arg1) {
        field297++;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field314; var4++) {
            class42 var5 = this.field299[var4];
            for (class42 var6 = var5.field619; var6 != var5; var6 = var6.field619) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 91)
    public final void method176(int arg0) {
        for (int var2 = 0; var2 < this.field314; var2++) {
            class42 var3 = this.field299[var2];
            while (true) {
                class42 var4 = var3.field619;
                if (var3 == var4) {
                    break;
                }
                var4.method300(false);
            }
        }
        if (arg0 != -1) {
            this.method182(-92L, (byte) -25);
        }
        field303++;
        this.field307 = null;
        this.field317 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)Lda;", line = 124)
    public final class42 method177(boolean arg0) {
        if (arg0) {
            field302 = true;
        }
        field309++;
        if (this.field307 == null) {
            return null;
        }
        class42 var2 = this.field299[(int) (this.field304 & (long) (this.field314 - 1))];
        while (this.field307 != var2) {
            if (this.field307.field622 == this.field304) {
                class42 var3 = this.field307;
                this.field307 = this.field307.field619;
                return var3;
            }
            this.field307 = this.field307.field619;
        }
        this.field307 = null;
        return null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBIZ)I", line = 155)
    public static final int method178(int arg0, byte arg1, int arg2, boolean arg3) {
        field306++;
        class32 var4 = class222.method1397(arg3, arg0, false);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field524.length; var6++) {
                if (var4.field527[var6] == arg2) {
                    var5 += var4.field524[var6];
                }
            }
            if (arg1 == -84) {
                return var5;
            } else {
                return 85;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Lda;", line = 189)
    public final class42 method179(int arg0) {
        field300++;
        if (this.field316 > 0 && this.field299[this.field316 - 1] != this.field317) {
            class42 var2 = this.field317;
            this.field317 = var2.field619;
            return var2;
        }
        while (this.field316 < this.field314) {
            class42 var3 = this.field299[this.field316++].field619;
            if (this.field299[this.field316 - 1] != var3) {
                this.field317 = var3.field619;
                return var3;
            }
        }
        if (arg0 != 1) {
            this.method179(-61);
        }
        return null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 221)
    public static void method180(byte arg0) {
        if (arg0 < -124) {
            field305 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)Lda;", line = 231)
    public final class42 method181(byte arg0) {
        this.field316 = 0;
        field310++;
        if (arg0 != -70) {
            field311 = -80;
        }
        return this.method179(arg0 + 71);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JB)Lda;", line = 245)
    public final class42 method182(long arg0, byte arg1) {
        this.field304 = arg0;
        field308++;
        class42 var4 = this.field299[(int) ((long) (this.field314 - 1) & arg0)];
        for (this.field307 = var4.field619; this.field307 != var4; this.field307 = this.field307.field619) {
            if (this.field307.field622 == arg0) {
                class42 var5 = this.field307;
                this.field307 = this.field307.field619;
                return var5;
            }
        }
        this.field307 = null;
        return arg1 < 67 ? null : null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)I", line = 293)
    public final int method183(byte arg0) {
        if (arg0 != 96) {
            this.field307 = null;
        }
        field298++;
        return this.field314;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLjava/awt/Component;)Lwt;", line = 306)
    public static final class202 method184(int arg0, boolean arg1, Component arg2) {
        field313++;
        if (arg0 != 0) {
            method180((byte) 31);
        }
        return new class508(arg2, arg1);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V", line = 319)
    public class18(int arg0) {
        this.field299 = new class42[arg0];
        this.field314 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class42 var3 = this.field299[var2] = new class42();
            var3.field619 = var3;
            var3.field630 = var3;
        }
    }
}
