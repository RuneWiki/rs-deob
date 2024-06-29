import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class190 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2618 = 0;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lkn;")
    public static class442 field2615 = new class442("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[I")
    public static int[] field2621 = new int[14];

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lng;")
    public class190 field2614;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lng;")
    public class190 field2620;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lnq;")
    public static class268 field2617;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 4)
    public static void method1234(int arg0) {
        field2621 = null;
        field2617 = null;
        if (arg0 != 16731) {
            field2621 = null;
        }
        field2615 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 28)
    public final void method1235(byte arg0) {
        field2619++;
        if (this.field2620 == null) {
            return;
        }
        this.field2620.field2614 = this.field2614;
        this.field2614.field2620 = this.field2620;
        if (arg0 > -122) {
            this.field2614 = null;
        }
        this.field2614 = null;
        this.field2620 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lan;", line = 53)
    public static final class17 method1236(int arg0, int arg1) {
        field2616++;
        class17 var2 = (class17) class25.field457.method904(false, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -23001) {
            byte[] var3 = class61.field847.method1745(arg0, (byte) -126, 31);
            class17 var4 = new class17();
            if (var3 != null) {
                var4.method247(new class11(var3), arg0, arg1 + 23000);
            }
            class25.field457.method902((long) arg0, (byte) 112, var4);
            return var4;
        } else {
            return null;
        }
    }
}
