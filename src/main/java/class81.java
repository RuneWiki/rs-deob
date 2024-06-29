import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class81 {

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Ltu;")
    private class7 field1010;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "Lhb;")
    public static class250 field1012 = new class250(65, 3);

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Lhb;")
    public static class250 field1015 = new class250(69, 3);

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "Loi;")
    public static class169 field1016 = new class169("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "[I")
    public static int[] field1017 = new int[256];

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "Llf;")
    private class508 field1008;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILbt;)V")
    public static final void method462(int arg0, class88 arg1) {
        if (arg0 != -306674912) {
            method467(-25);
        }
        field1014++;
        if (arg1.field1223.length - arg1.field1176 < 1) {
            return;
        }
        int var2 = arg1.method617(arg0 ^ 0xEDB88322);
        if (var2 < 0 || var2 > 1 || (arg1.field1223.length - arg1.field1176) < 2) {
            return;
        }
        int var3 = arg1.method568((byte) 110);
        if (var3 * 6 != arg1.field1223.length - arg1.field1176) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field1176 >= arg1.field1223.length) {
                            return;
                        }
                        var4 = arg1.method568((byte) 110);
                        var5 = arg1.method578(97);
                    } while (class276.field3537.length <= var4);
                } while (!class346.field4415[var4]);
            } while (class487.field7072.method1361((byte) 93, var4).field2659 == '1' && (var5 < -1 || var5 > 1));
            class276.field3537[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ltu;Z)V")
    public final void method463(class7 arg0, boolean arg1) {
        field1013++;
        this.field1010 = arg0;
        if (!arg1) {
            this.field1008 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)V")
    public static final void method464(byte arg0, int arg1) {
        if (arg0 != -43) {
            method464((byte) -39, 83);
        }
        field1011++;
        for (class508 var2 = class4.field27.method2087(0); var2 != null; var2 = class4.field27.method2091(-123)) {
            if ((var2.field7456 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method3021(-112);
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)Llf;")
    public final class508 method465(boolean arg0) {
        field1009++;
        class508 var2 = this.field1010.field64.field7454;
        if (arg0) {
            this.field1008 = null;
        }
        if (this.field1010.field64 == var2) {
            this.field1008 = null;
            return null;
        } else {
            this.field1008 = var2.field7454;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)Llf;")
    public final class508 method466(int arg0) {
        field1007++;
        class508 var2 = this.field1008;
        if (this.field1010.field64 == var2) {
            this.field1008 = null;
            return null;
        }
        if (arg0 != -257) {
            field1012 = null;
        }
        this.field1008 = var2.field7454;
        return var2;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public static void method467(int arg0) {
        if (arg0 != 3) {
            field1016 = null;
        }
        field1012 = null;
        field1016 = null;
        field1015 = null;
        field1017 = null;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
    public class81() {
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Ltu;)V")
    public class81(class7 arg0) {
        this.field1010 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1017[var0] = var1;
        }
    }
}
