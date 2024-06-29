import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class388 {

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "Lnga;")
    private class510 field5425 = new class510(128);

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "Leq;")
    private class209 field5430;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "[C")
    public static char[] field5428 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "Lkr;")
    public static class743 field5429;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)I")
    public static final int method2421(int arg0, int arg1) {
        return class478.field6819 == null ? 0 : class478.field6819[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public static void method2422(int arg0) {
        field5428 = null;
        int var1 = -123 % ((-arg0 - 36) / 46);
        field5429 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)Luia;")
    public final class362 method2423(int arg0, byte arg1) {
        if (arg1 >= -62) {
            return null;
        }
        field5426++;
        class510 var3 = this.field5425;
        class362 var4;
        synchronized (this.field5425) {
            var4 = (class362) this.field5425.method3054((byte) -92, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5430.method1453(class556.method3252(arg0, (byte) 31), -120, class455.method2784(31322, arg0));
        class362 var6 = new class362();
        if (var5 != null) {
            var6.method2257(125, new class35(var5));
        }
        class510 var7 = this.field5425;
        synchronized (this.field5425) {
            this.field5425.method3047(false, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
    public static final void method2424(int arg0) {
        for (class235 var1 = (class235) class152.field2292.method1522(true); var1 != null; var1 = (class235) class152.field2292.method1527((byte) 65)) {
            if (var1.field3316) {
                var1.method1602((byte) -91);
            }
        }
        field5427++;
        if (arg0 != 235) {
            method2421(-42, -128);
        }
        for (class235 var2 = (class235) class240.field3372.method1522(true); var2 != null; var2 = (class235) class240.field3372.method1527((byte) 83)) {
            if (var2.field3316) {
                var2.method1602((byte) -116);
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lcw;ILeq;)V")
    public class388(class179 arg0, int arg1, class209 arg2) {
        this.field5430 = arg2;
        if (this.field5430 != null) {
            int var4 = this.field5430.method1454(-1) - 1;
            this.field5430.method1477(0, var4);
        }
    }
}
