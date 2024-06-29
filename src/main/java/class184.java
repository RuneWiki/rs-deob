import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class184 extends RuntimeException {

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Ljava/lang/String;")
    public String field3599;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3593;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3587 = 0;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lob;")
    public static class141 field3591 = class175.method1195(40, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lob;")
    private static class141 field3595 = class175.method1195(40, "Location");

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lob;")
    public static class141 field3586 = field3595;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lob;")
    public static class141 field3594 = class175.method1195(40, "<col=ff0000>");

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3590 = 0;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lob;")
    public static class141 field3596 = class175.method1195(40, ": ");

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Log;B)Laf;")
    public static final class7 method1232(class146 arg0, byte arg1) {
        arg0.method991(arg1 + 299);
        field3598++;
        int var2 = arg0.method991(255);
        class7 var3 = class212.method1376(var2, -30);
        var3.field121 = arg0.method991(255);
        int var4 = arg0.method991(255);
        int var5 = 0;
        if (arg1 != -44) {
            field3596 = null;
        }
        while (var5 < var4) {
            int var6 = arg0.method991(255);
            var3.method31(var6, 123, arg0);
            var5++;
        }
        var3.method47(arg1 + 45);
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static final void method1233(int arg0) {
        class209.field3952.method1385(9946);
        class92.field1843.method1385(9946);
        if (arg0 != -976) {
            method1234(123, (byte) 77);
        }
        class69.field1355.method1385(9946);
        field3588++;
        class40.field800.method1385(9946);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Z")
    public static final boolean method1234(int arg0, byte arg1) {
        field3600++;
        if (arg1 < 24) {
            field3596 = null;
        }
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static void method1235(int arg0) {
        if (arg0 != 35) {
            return;
        }
        field3591 = null;
        field3595 = null;
        field3594 = null;
        field3596 = null;
        field3586 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class184(Throwable arg0, String arg1) {
        this.field3599 = arg1;
        this.field3593 = arg0;
    }
}
