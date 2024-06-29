import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class319 {

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Lgga;")
    private class513 field4545;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Lgga;")
    private class513 field4542;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "[I")
    public static int[] field4540 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "[I")
    public static int[] field4541 = new int[2048];

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "Lmt;")
    private class469 field4538;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 5)
    public static void method1934(int arg0) {
        field4541 = null;
        if (arg0 != 1) {
            field4541 = null;
        }
        field4540 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lwm;B)Ljq;", line = 18)
    public final class385 method1935(class444 arg0, byte arg1) {
        if (arg1 != -125) {
            this.method1937(82);
        }
        field4544++;
        if (arg0 == null) {
            return null;
        }
        class353 var3 = arg0.method327((byte) 67);
        if (class774.field10651 == var3) {
            return new class283((class43) arg0);
        } else if (class614.field8711 == var3) {
            return new class783(this.method1937(82), (class368) arg0);
        } else if (class119.field2042 == var3) {
            return new class621(this.field4545, (class272) arg0);
        } else if (class458.field6261 == var3) {
            return new class206(this.field4545, (class57) arg0);
        } else if (class116.field1982 == var3) {
            return new class313(this.field4545, this.field4542, (class579) arg0);
        } else if (class104.field1515 == var3) {
            return new class92(this.field4545, this.field4542, (class110) arg0);
        } else if (class645.field9175 == var3) {
            return new class166(this.field4545, this.field4542, (class510) arg0);
        } else if (class568.field7901 == var3) {
            return new class2(this.field4545, this.field4542, (class490) arg0);
        } else if (class443.field6134 == var3) {
            return new class535(this.field4545, (class417) arg0);
        } else if (class243.field3479 == var3) {
            return new class60(this.field4545, this.field4542, (class370) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 79)
    public static final void method1936(byte arg0) {
        field4543++;
        int var1 = 0;
        if (class420.field5820.field9481.method3155(17539) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class420.field5820.field9487.method3081(17539) == 0) {
            var1 |= 0x40;
        }
        class586.method3439(-1, var1);
        class312.field4418.method373(0, var1);
        class422.field5873.method2939(36, var1);
        if (arg0 <= 107) {
            method1936((byte) 49);
        }
        class677.field9511.method3702(var1, (byte) 116);
        class620.field8760.method1830((byte) -109, var1);
        class14.method170(var1, (byte) -110);
        class281.method1796(var1, (byte) -127);
        class660.method3695(var1, false);
        class479.method2840(var1, 1);
        class473.method2764((byte) 97);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Lmt;", line = 119)
    private final class469 method1937(int arg0) {
        int var2 = -74 % ((arg0 + 47) / 40);
        if (this.field4538 == null) {
            this.field4538 = new class469();
        }
        field4539++;
        return this.field4538;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lgga;Lgga;)V", line = 133)
    public class319(class513 arg0, class513 arg1) {
        this.field4545 = arg0;
        this.field4542 = arg1;
    }
}
