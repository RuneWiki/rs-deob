import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class87 {

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Lvu;")
    private class680 field1237;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "Lst;")
    public static class335 field1233 = new class335(36, 3);

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "Lef;")
    public static class263 field1239 = new class263();

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "Lob;")
    private class4 field1235;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "[I")
    public static int[] field1241;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZII)I")
    public static final int method605(int arg0, boolean arg1, int arg2, int arg3) {
        field1236++;
        class169 var4 = class170.method1090(arg1, (byte) -94, arg0);
        if (var4 == null) {
            return 0;
        } else {
            if (arg2 != -1) {
                method607(-25);
            }
            return arg3 >= 0 && var4.field2355.length > arg3 ? var4.field2355[arg3] : 0;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Lob;")
    public final class4 method606(int arg0) {
        field1232++;
        int var2 = -119 % ((arg0 + 11) / 49);
        class4 var3 = this.field1237.field9462.field33;
        if (this.field1237.field9462 == var3) {
            this.field1235 = null;
            return null;
        } else {
            this.field1235 = var3.field33;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public static final void method607(int arg0) {
        field1234++;
        for (class160 var1 = (class160) class131.field1826.method821((byte) 111); var1 != null; var1 = (class160) class131.field1826.method818(96)) {
            if (var1.field2234.method3576(-1)) {
                class480.method2923(var1.field2230, 0);
            } else {
                var1.field2234.method719(0);
                try {
                    var1.field2234.method3571(-2);
                } catch (Exception var6) {
                    class31.method172(var6, "TV: " + var1.field2230, 0);
                    class480.method2923(var1.field2230, 0);
                }
                if (!var1.field2231 && !var1.field2229) {
                    class750 var3 = var1.field2234.method3581(-452);
                    if (var3 != null) {
                        class463 var4 = var3.method4168((byte) 43);
                        if (var4 != null) {
                            var4.method2841(var1.field2236, (byte) -122);
                            class483.field6739.method359(var4);
                            var1.field2231 = true;
                        }
                    }
                }
            }
        }
        int var5 = -8 / ((arg0 + 39) / 55);
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
    public static void method608(int arg0) {
        field1239 = null;
        if (arg0 != 10) {
            field1233 = null;
        }
        field1233 = null;
        field1241 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lrp;I)[Lub;")
    public static final class83[] method609(class135 arg0, int arg1) {
        field1238++;
        if (!arg0.method854((byte) -123)) {
            return new class83[0];
        }
        class246 var2 = arg0.method863((byte) -124);
        while (var2.field3633 == 0) {
            class688.method3874(10L, -7375);
        }
        if (var2.field3633 == arg1) {
            return new class83[0];
        }
        int[] var3 = (int[]) var2.field3638;
        class83[] var4 = new class83[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class83 var6 = new class83();
            var4[var5] = var6;
            var6.field1187 = var3[var5 << 2];
            var6.field1186 = var3[(var5 << 2) + 1];
            var6.field1185 = var3[(var5 << 2) + 2];
            var6.field1184 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Lob;")
    public final class4 method610(int arg0) {
        field1240++;
        class4 var2 = this.field1235;
        if (this.field1237.field9462 == var2) {
            this.field1235 = null;
            return null;
        } else {
            this.field1235 = var2.field33;
            return arg0 == 16068 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
    public class87() {
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lvu;)V")
    public class87(class680 arg0) {
        this.field1237 = arg0;
    }
}
