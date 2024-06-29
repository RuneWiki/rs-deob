import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class370 {

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Leo;")
    public static class443 field5095 = new class443(8, 4);

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lrc;")
    public static class108 field5096 = new class108(71, -1);

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "Lch;")
    public static class151 field5097 = new class151("M", "M", "M", "M");

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "Lap;")
    public static class310 field5098 = new class310(79, 3);

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "Lap;")
    public static class310 field5099 = new class310(74, 3);

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "Lch;")
    public static class151 field5100 = new class151("Hidden", "Versteckt", "Caché", "Oculto");

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method2262(int arg0) {
        if (arg0 != -8786) {
            method2263(-126);
        }
        field5096 = null;
        field5100 = null;
        field5099 = null;
        field5097 = null;
        field5098 = null;
        field5095 = null;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
    public static final void method2263(int arg0) {
        field5093++;
        if (class394.field5440 != null) {
            class394.field5440.method2095(false);
            class394.field5440 = null;
        }
        class262.method1769(arg0 - 19884);
        class371.method2268();
        for (int var1 = 0; var1 < 4; var1++) {
            class300.field4249[var1].method118(3174);
        }
        class89.method745(51, false);
        System.gc();
        method2264(2, -120);
        class468.field6598 = false;
        class290.field4117 = -1;
        class168.method1218(true, arg0);
        class189.field2810 = 0;
        class279.field4012 = 0;
        class273.field3969 = false;
        class309.field4391 = 0;
        class427.field5961 = 0;
        for (int var2 = 0; var2 < class143.field1994.length; var2++) {
            class143.field1994[var2] = null;
        }
        class19.method133(-10557);
        for (int var3 = 0; var3 < 2048; var3++) {
            class112.field1570[var3] = null;
        }
        class24.field257 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class163.field2377[var4] = null;
        }
        class427.field5956.method1101((byte) 92);
        class103.method831(126);
        class162.field2361 = 0;
        class416.field5691.method1728((byte) -15);
        class46.method469((byte) -96);
        class127.method956(true);
        class162.method1201((byte) -69, true);
        try {
            class32.method200("loggedout", (byte) -119, class436.field6206.field960);
        } catch (Throwable var5) {
        }
        class475.field6713 = null;
        class112.field1576 = 0L;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)V")
    public static final void method2264(int arg0, int arg1) {
        class56.field829 = -1;
        class449.field6386 = arg0;
        class363.field5004 = -1;
        class26.field278 = null;
        class353.field4855 = false;
        field5094++;
        class33.field342 = 0;
        class347.field4785 = 1;
        if (arg1 >= -5) {
            method2264(103, -88);
        }
    }
}
