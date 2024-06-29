import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class27 {

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "[Li;")
    private class16[] field300;

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Lt;")
    public static class31 field303 = class11.method64(-69, "mapscene");

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "La;")
    public static class1 field301 = new class1();

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "Lt;")
    public static class31 field305 = class11.method64(93, "Quest Start");

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "Lt;")
    public static class31 field307 = class11.method64(-45, "Requesting ");

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "Lt;")
    public static class31 field308 = class11.method64(86, "Overview");

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "J")
    private long field299;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "Li;")
    private class16 field304;

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "Lda;")
    public static class8 field306;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(ILt;Lt;Lv;)Ld;", line = 17)
    public static final class7 method150(int arg0, class31 arg1, class31 arg2, class33 arg3) {
        if (arg0 != 8499) {
            field306 = null;
        }
        int var4 = arg3.method193(arg1, -81);
        int var5 = arg3.method197(arg2, var4, (byte) 15);
        return class31.method166(-32, var5, var4, arg3);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Li;IJ)V", line = 33)
    public final void method151(class16 arg0, int arg1, long arg2) {
        if (arg0.field233 != null) {
            arg0.method96(true);
        }
        class16 var5 = this.field300[(int) ((long) (this.field302 - 1) & arg2)];
        arg0.field233 = var5.field233;
        arg0.field232 = arg2;
        if (arg1 <= 37) {
            field308 = null;
        }
        arg0.field231 = var5;
        arg0.field233.field231 = arg0;
        arg0.field231.field233 = arg0;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Z)V", line = 67)
    public static void method152(boolean arg0) {
        field308 = null;
        if (arg0) {
            return;
        }
        field307 = null;
        field306 = null;
        field301 = null;
        field305 = null;
        field303 = null;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IJ)Li;", line = 89)
    public final class16 method153(int arg0, long arg1) {
        this.field299 = arg1;
        class16 var4 = this.field300[(int) (arg1 & (long) (this.field302 - 1))];
        for (this.field304 = var4.field231; this.field304 != var4; this.field304 = this.field304.field231) {
            if (this.field304.field232 == arg1) {
                class16 var5 = this.field304;
                this.field304 = this.field304.field231;
                return var5;
            }
        }
        this.field304 = null;
        int var6 = -114 % ((-arg0 - 91) / 34);
        return null;
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "(I)V", line = 122)
    public class27(int arg0) {
        this.field300 = new class16[arg0];
        this.field302 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class16 var3 = this.field300[var2] = new class16();
            var3.field231 = var3;
            var3.field233 = var3;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)Li;", line = 162)
    public final class16 method154(byte arg0) {
        if (this.field304 == null) {
            return null;
        }
        class16 var2 = this.field300[(int) ((long) (this.field302 - 1) & this.field299)];
        if (arg0 <= 14) {
            field306 = null;
        }
        while (this.field304 != var2) {
            if (this.field304.field232 == this.field299) {
                class16 var3 = this.field304;
                this.field304 = this.field304.field231;
                return var3;
            }
            this.field304 = this.field304.field231;
        }
        this.field304 = null;
        return null;
    }
}
