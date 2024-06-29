import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class345 {

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public int field5108 = 128;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public int field5109 = 128;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public int field5111;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public int field5112;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public int field5096;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field5102;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "F")
    public static float field5107 = 0.0F;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field5098 = -60;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field5101 = 0;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field5113 = Boolean.FALSE;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public int field5097;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public int field5100;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public int field5104;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public int field5105;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 9)
    public static void method2151(boolean arg0) {
        if (arg0) {
            method2154(true, (byte) -112);
        }
        field5113 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lmi;I)V", line = 21)
    public final void method2152(class345 arg0, int arg1) {
        this.field5111 = arg0.field5111;
        if (arg1 != 0) {
            method2151(false);
        }
        this.field5108 = arg0.field5108;
        field5103++;
        this.field5096 = arg0.field5096;
        this.field5109 = arg0.field5109;
        this.field5112 = arg0.field5112;
        this.field5102 = arg0.field5102;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lmi;", line = 40)
    public final class345 method2153(int arg0) {
        if (arg0 >= -72) {
            field5107 = -0.14180458F;
        }
        field5110++;
        return new class345(this.field5111, this.field5108, this.field5109, this.field5112, this.field5096, this.field5102);
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V", line = 142)
    public class345(int arg0) {
        this.field5111 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIIII)V", line = 150)
    private class345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5112 = arg3;
        this.field5096 = arg4;
        this.field5109 = arg2;
        this.field5111 = arg0;
        this.field5108 = arg1;
        this.field5102 = arg5;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V", line = 74)
    public static final void method2154(boolean arg0, byte arg1) {
        if (arg1 != -65) {
            method2154(true, (byte) 22);
        }
        for (class101 var2 = (class101) class251.field3891.method1004((byte) -111); var2 != null; var2 = (class101) class251.field3891.method996(1)) {
            if (var2.field1443 != null) {
                class359.field5328.method385(var2.field1443);
                var2.field1443 = null;
            }
            if (var2.field1454 != null) {
                class359.field5328.method385(var2.field1454);
                var2.field1454 = null;
            }
            var2.method2677(arg1 ^ 0x579A);
        }
        field5106++;
        if (!arg0) {
            return;
        }
        for (class101 var3 = (class101) class360.field5347.method1004((byte) -86); var3 != null; var3 = (class101) class360.field5347.method996(1)) {
            if (var3.field1443 != null) {
                class359.field5328.method385(var3.field1443);
                var3.field1443 = null;
            }
            var3.method2677(-22491);
        }
        for (class101 var4 = (class101) class25.field314.method2592(122); var4 != null; var4 = (class101) class25.field314.method2589(-1)) {
            if (var4.field1443 != null) {
                class359.field5328.method385(var4.field1443);
                var4.field1443 = null;
            }
            var4.method2677(-22491);
        }
    }
}
