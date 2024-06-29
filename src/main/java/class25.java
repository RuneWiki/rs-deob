import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class25 {

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "[Lda;")
    private class8[] field246;

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "Ll;")
    public static class22 field245 = class33.method229("sprites", -73);

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "Ll;")
    public static class22 field250 = class33.method229("Staff Shop", -77);

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "J")
    private long field249;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "Lda;")
    private class8 field242;

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field244;

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "[B")
    public static byte[] field247;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(JB)Lda;", line = 39)
    public final class8 method165(long arg0, byte arg1) {
        this.field249 = arg0;
        int var4 = 59 % ((arg1 + 6) / 39);
        class8 var5 = this.field246[(int) (arg0 & (long) (this.field251 - 1))];
        for (this.field242 = var5.field62; this.field242 != var5; this.field242 = this.field242.field62) {
            if (this.field242.field63 == arg0) {
                class8 var6 = this.field242;
                this.field242 = this.field242.field62;
                return var6;
            }
        }
        this.field242 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)V", line = 69)
    public static void method166(byte arg0) {
        field247 = null;
        if (arg0 != -24) {
            method166((byte) 118);
        }
        field245 = null;
        field250 = null;
        field244 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IB)I", line = 83)
    public static final int method167(int arg0, byte arg1) {
        if (arg1 >= -50) {
            return -89;
        } else {
            if (arg0 >= 65 && arg0 <= 90) {
                arg0 += 32;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)Lda;", line = 96)
    public final class8 method168(int arg0) {
        if (this.field242 == null) {
            return null;
        }
        class8 var2 = this.field246[(int) (this.field249 & (long) (this.field251 - 1))];
        if (arg0 >= -60) {
            method167(-26, (byte) 69);
        }
        while (this.field242 != var2) {
            if (this.field242.field63 == this.field249) {
                class8 var3 = this.field242;
                this.field242 = this.field242.field62;
                return var3;
            }
            this.field242 = this.field242.field62;
        }
        this.field242 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(BLda;J)V", line = 125)
    public final void method169(byte arg0, class8 arg1, long arg2) {
        if (arg1.field66 != null) {
            arg1.method40(false);
        }
        class8 var5 = this.field246[(int) ((long) (this.field251 - 1) & arg2)];
        arg1.field62 = var5;
        arg1.field66 = var5.field66;
        arg1.field66.field62 = arg1;
        arg1.field62.field66 = arg1;
        arg1.field63 = arg2;
        int var6 = 57 % ((26 - arg0) / 62);
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(B)V", line = 150)
    public static final void method170(byte arg0) {
        if (class26.field351.toLowerCase().indexOf("microsoft") == -1) {
            class1.field8[91] = 42;
            class1.field8[59] = 57;
            class1.field8[44] = 71;
            class1.field8[47] = 73;
            class1.field8[45] = 26;
            class1.field8[61] = 27;
            class1.field8[93] = 43;
            class1.field8[46] = 72;
            if (class26.field358 == null) {
                class1.field8[192] = 58;
                class1.field8[222] = 59;
            } else {
                class1.field8[520] = 59;
                class1.field8[222] = 58;
                class1.field8[192] = 28;
            }
            class1.field8[92] = 74;
        } else {
            class1.field8[223] = 28;
            class1.field8[220] = 74;
            class1.field8[188] = 71;
            class1.field8[222] = 59;
            class1.field8[191] = 73;
            class1.field8[189] = 26;
            class1.field8[219] = 42;
            class1.field8[190] = 72;
            class1.field8[221] = 43;
            class1.field8[186] = 57;
            class1.field8[187] = 27;
            class1.field8[192] = 58;
        }
        if (arg0 < 57) {
            method167(-33, (byte) 31);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "(I)V", line = 198)
    public class25(int arg0) {
        this.field251 = arg0;
        this.field246 = new class8[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class8 var3 = this.field246[var2] = new class8();
            var3.field62 = var3;
            var3.field66 = var3;
        }
    }
}
