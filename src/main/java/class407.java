import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class407 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lpa;")
    private class387 field5751 = new class387(256);

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Ld;")
    private class159 field5750;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lkv;")
    private class280 field5755;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lms;", line = 7)
    public static final class791 method2455(byte arg0) {
        int var1 = 2 % ((63 - arg0) / 50);
        field5747++;
        try {
            return (class791) Class.forName("ld").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 24)
    public final void method2456(int arg0) {
        field5753++;
        if (arg0 != 3553) {
            this.method2458(-64, -64);
        }
        this.field5751.method2364(1);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V", line = 35)
    public final void method2457(byte arg0) {
        field5752++;
        this.field5751.method2366(5, 110);
        if (arg0 != -92) {
            this.method2457((byte) 51);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Lho;", line = 51)
    public final class158 method2458(int arg0, int arg1) {
        field5749++;
        Object var3 = this.field5751.method2373((long) arg0, 103);
        if (var3 != null) {
            return (class158) var3;
        } else if (this.field5750.method1262(arg0, (byte) 96)) {
            if (arg1 != 5) {
                method2455((byte) 113);
            }
            class181 var4 = this.field5750.method1263(arg0, (byte) 116);
            int var5 = var4.field2742 ? 64 : this.field5755.field4155;
            class158 var7;
            if (var4.field2750 && this.field5755.method448()) {
                float[] var6 = this.field5750.method1260(arg0, 0.7F, var5, false, (byte) -77, var5);
                var7 = new class158(this.field5755, 3553, 34842, var5, var5, var4.field2758 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field2751 != 2 && class176.method1325((byte) 95, var4.field2745)) {
                    var8 = this.field5750.method1261(arg0, var5, -13756, true, 0.7F, var5);
                } else {
                    var8 = this.field5750.method1259(arg0, var5, 30767, 0.7F, false, var5);
                }
                var7 = new class158(this.field5755, 3553, 6408, var5, var5, var4.field2758 != 0, var8, 0, 0, false);
            }
            var7.method1252(var4.field2755, 3314, var4.field2752);
            this.field5751.method2362(var7, 0, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lkv;Ld;)V", line = 102)
    public class407(class280 arg0, class159 arg1) {
        this.field5750 = arg1;
        this.field5755 = arg0;
    }
}
