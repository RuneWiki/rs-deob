import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class38 extends RuntimeException {

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Ljava/lang/String;")
    public String field475;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field470;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "[Lnc;")
    public static class135[] field469 = new class135[14];

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field477 = 0;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Lcf;")
    public static class92 field472 = new class92();

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "Lch;")
    public static class151 field478 = new class151(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Lnl;")
    public static class435 field473;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "Lnl;")
    public static class435 field479;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILgf;)V")
    public static final void method235(int arg0, class39 arg1) {
        if (arg0 != 5521) {
            return;
        }
        field474++;
        class31 var2 = (class31) class218.field3152.method1104(arg0 ^ 0xFFFFEA12, (long) arg1.field5751);
        if (var2 == null) {
            return;
        }
        if (var2.field335 != null) {
            class332.field4613.method2406(var2.field335);
            var2.field335 = null;
        }
        var2.method2714(arg0 - 5581);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method236(int arg0, long arg1) {
        class168.field2434.setTime(new Date(arg1));
        field471++;
        int var3 = class168.field2434.get(7);
        int var4 = class168.field2434.get(5);
        int var5 = class168.field2434.get(2);
        int var6 = class168.field2434.get(1);
        int var7 = class168.field2434.get(arg0);
        int var8 = class168.field2434.get(12);
        int var9 = class168.field2434.get(13);
        return class136.field1889[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class349.field4802[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method237(byte arg0) {
        field479 = null;
        field478 = null;
        field469 = null;
        int var1 = -69 / ((-arg0 - 55) / 62);
        field472 = null;
        field473 = null;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class38(Throwable arg0, String arg1) {
        this.field475 = arg1;
        this.field470 = arg0;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static final void method238(int arg0) {
        class18.field194 = class317.method2012(2048, 8, 4, 7, 0.4F, 8, true, 35);
        if (arg0 >= -82) {
            method235(62, (class39) null);
        }
        field476++;
    }
}
