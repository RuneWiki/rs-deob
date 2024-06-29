import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class19 {

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    private int field251 = 0;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    private int field253 = -1;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lam;")
    private class277 field244 = new class277();

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
    public boolean field256 = false;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[Lac;")
    private class231[] field241;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "[[I")
    private int[][] field248;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "[Z")
    public static boolean[] field235 = new boolean[112];

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lhi;")
    public static class82 field239 = class95.method664((byte) -70, " ");

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lhi;")
    private static class82 field246 = class95.method664((byte) -102, "Use");

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lhi;")
    private static class82 field233 = class95.method664((byte) -118, "Please wait)3)3)3");

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lhi;")
    private static class82 field250 = class95.method664((byte) -29, "flash3:");

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lhi;")
    public static class82 field249 = field233;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lhi;")
    public static class82 field238 = field246;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lhi;")
    public static class82 field232 = field250;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field240 = -2;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lhi;")
    public static class82 field234 = field250;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Lhn;")
    public static class317 field255 = new class317(500);

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Lum;")
    public static class222 field254;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 9)
    public static final void method129(byte arg0) {
        field247++;
        if (arg0 > -105) {
            method133((byte) 91);
        }
        class26 var1 = class67.field1046;
        synchronized (class67.field1046) {
            class144.field2465 = class197.field3365;
            class135.field2332++;
            if (class67.field1044 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    field235[var2] = false;
                }
                class67.field1044 = class50.field814;
            } else {
                while (class67.field1044 != class50.field814) {
                    int var3 = class309.field5261[class50.field814];
                    class50.field814 = class50.field814 + 1 & 0x7F;
                    if (var3 < 0) {
                        field235[~var3] = false;
                    } else {
                        field235[var3] = true;
                    }
                }
            }
            class197.field3365 = class187.field3142;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 51)
    public final void method130(int arg0) {
        field243++;
        for (int var2 = 0; var2 < this.field245; var2++) {
            this.field248[var2] = null;
        }
        this.field248 = (int[][]) null;
        if (arg0 == 5641) {
            this.field241 = null;
            this.field244.method1938(arg0 ^ 0x164E);
            this.field244 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)[I", line = 76)
    public final int[] method131(byte arg0, int arg1) {
        field257++;
        if (arg0 >= -67) {
            this.field253 = -117;
        }
        if (this.field245 == this.field237) {
            this.field256 = this.field241[arg1] == null;
            this.field241[arg1] = class262.field4479;
            return this.field248[arg1];
        } else if (this.field245 == 1) {
            this.field256 = this.field253 != arg1;
            this.field253 = arg1;
            return this.field248[0];
        } else {
            class231 var3 = this.field241[arg1];
            if (var3 == null) {
                this.field256 = true;
                if (this.field251 >= this.field245) {
                    class231 var4 = (class231) this.field244.method1931((byte) -73);
                    var3 = new class231(arg1, var4.field3986);
                    this.field241[var4.field3977] = null;
                    var4.method961((byte) 123);
                } else {
                    var3 = new class231(arg1, this.field251);
                    this.field251++;
                }
                this.field241[arg1] = var3;
            } else {
                this.field256 = false;
            }
            this.field244.method1933(9988, var3);
            return this.field248[var3.field3986];
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Loe;Lhg;Z)Luk;", line = 144)
    public static final class108 method132(class79 arg0, class305 arg1, boolean arg2) {
        field242++;
        long var3 = ((long) arg1.field5182 << 32) + ((long) arg1.field5178 << 56) + (long) ((arg1.field5173 + 1 << 16) + arg1.field5176);
        class108 var5 = (class108) arg0.method507(var3, 602425312);
        if (!arg2) {
            method132((class79) null, (class305) null, false);
        }
        if (var5 == null) {
            var5 = new class108(arg1.field5173, (float) arg1.field5176, true, false, arg1.field5182);
            arg0.method503(var3, -73, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 179)
    public static void method133(byte arg0) {
        field255 = null;
        field254 = null;
        field249 = null;
        field232 = null;
        field239 = null;
        field234 = null;
        int var1 = -70 / ((46 - arg0) / 48);
        field246 = null;
        field250 = null;
        field238 = null;
        field233 = null;
        field235 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)[[I", line = 198)
    public final int[][] method134(int arg0) {
        field236++;
        if (this.field245 != this.field237) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 127) {
            field255 = (class317) null;
        }
        for (int var2 = 0; var2 < this.field245; var2++) {
            this.field241[var2] = class262.field4479;
        }
        return this.field248;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(III)V", line = 285)
    public class19(int arg0, int arg1, int arg2) {
        this.field237 = arg1;
        this.field241 = new class231[this.field237];
        this.field245 = arg0;
        this.field248 = new int[this.field245][arg2];
    }
}
