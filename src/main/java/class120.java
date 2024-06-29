import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class120 {

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    private int field2145 = 0;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    private int field2127;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "[Lrb;")
    private class183[] field2138;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Ldj;")
    public static class44 field2128 = class89.method650(255, "Fps:");

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Ldj;")
    private static class44 field2147 = class89.method650(255, "Loaded update list");

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field2141 = -1;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Ldj;")
    public static class44 field2131 = field2147;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "J")
    private long field2135;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Ljj;")
    public static class108 field2139;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lnf;")
    public static class147 field2129;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lrb;")
    private class183 field2134;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lrb;")
    private class183 field2146;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lfj;")
    public static class66 field2137;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2143;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)J")
    public static final long method827(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        return var3 == null || var3.field1318 == null ? 0L : var3.field1318.field1811;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)Lrb;")
    public final class183 method828(long arg0, byte arg1) {
        this.field2135 = arg0;
        class183 var4 = this.field2138[(int) (arg0 & (long) (this.field2127 - 1))];
        this.field2134 = var4.field3195;
        field2136++;
        if (arg1 != -40) {
            field2143 = null;
        }
        while (this.field2134 != var4) {
            if (this.field2134.field3186 == arg0) {
                class183 var5 = this.field2134;
                this.field2134 = this.field2134.field3195;
                return var5;
            }
            this.field2134 = this.field2134.field3195;
        }
        this.field2134 = null;
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Lrb;")
    public final class183 method829(byte arg0) {
        field2133++;
        if (arg0 < 61) {
            this.method829((byte) -52);
        }
        if (this.field2145 > 0 && this.field2138[this.field2145 - 1] != this.field2146) {
            class183 var2 = this.field2146;
            this.field2146 = var2.field3195;
            return var2;
        }
        while (this.field2127 > this.field2145) {
            class183 var3 = this.field2138[this.field2145++].field3195;
            if (this.field2138[this.field2145 - 1] != var3) {
                this.field2146 = var3.field3195;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lrb;JI)V")
    public final void method830(class183 arg0, long arg1, int arg2) {
        field2142++;
        if (arg0.field3193 != null) {
            arg0.method1148(-13215);
        }
        class183 var5 = this.field2138[(int) ((long) (this.field2127 - arg2) & arg1)];
        arg0.field3195 = var5;
        arg0.field3193 = var5.field3193;
        arg0.field3193.field3195 = arg0;
        arg0.field3195.field3193 = arg0;
        arg0.field3186 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public static void method831(byte arg0) {
        field2139 = null;
        field2128 = null;
        if (arg0 != 101) {
            field2129 = null;
        }
        field2143 = null;
        field2147 = null;
        field2129 = null;
        field2131 = null;
        field2137 = null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        this.field2127 = arg0;
        this.field2138 = new class183[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class183 var3 = this.field2138[var2] = new class183();
            var3.field3195 = var3;
            var3.field3193 = var3;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Lrb;")
    public final class183 method832(int arg0) {
        field2140++;
        int var2 = 61 % ((13 - arg0) / 63);
        this.field2145 = 0;
        return this.method829((byte) 117);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Lrb;")
    public final class183 method833(int arg0) {
        field2144++;
        if (this.field2134 == null) {
            return null;
        }
        class183 var2 = this.field2138[(int) (this.field2135 & (long) (this.field2127 + arg0))];
        while (this.field2134 != var2) {
            if (this.field2134.field3186 == this.field2135) {
                class183 var3 = this.field2134;
                this.field2134 = this.field2134.field3195;
                return var3;
            }
            this.field2134 = this.field2134.field3195;
        }
        this.field2134 = null;
        return null;
    }
}
