import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class478 {

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    private int field6704 = 0;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Lcp;")
    private class470 field6706;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Ldk;")
    public static class326 field6703 = new class326(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Lwf;")
    public static class79 field6709 = new class79(46, -1);

    @OriginalMember(owner = "client!au", name = "i", descriptor = "Lwf;")
    public static class79 field6710 = new class79(30, 8);

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Lah;")
    private class238 field6702;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "Los;")
    public static class282 field6711;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "[Lvf;")
    public static class94[] field6712;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public static final void method2794(int arg0) {
        field6707++;
        if (class231.field3492) {
            return;
        }
        if (arg0 != -1) {
            method2794(9);
        }
        class142.method892(class169.field2475, 7441);
        if (class311.field4394 != null) {
            class142.method892(class311.field4394, 7441);
        }
        class231.field3492 = true;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Lah;")
    public final class238 method2795(int arg0) {
        field6708++;
        if (arg0 > ~this.field6704 && this.field6706.field6624[this.field6704 - 1] != this.field6702) {
            class238 var2 = this.field6702;
            this.field6702 = var2.field3575;
            return var2;
        }
        while (this.field6706.field6615 > this.field6704) {
            class238 var3 = this.field6706.field6624[this.field6704++].field3575;
            if (this.field6706.field6624[this.field6704 - 1] != var3) {
                this.field6702 = var3.field3575;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V")
    public static void method2796(int arg0) {
        field6711 = null;
        field6712 = null;
        field6710 = null;
        field6709 = null;
        if (arg0 != 1) {
            method2794(39);
        }
        field6703 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Lah;")
    public final class238 method2797(byte arg0) {
        field6705++;
        this.field6704 = 0;
        int var2 = 16 / ((-arg0 - 50) / 39);
        return this.method2795(-1);
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lcp;)V")
    public class478(class470 arg0) {
        this.field6706 = arg0;
    }
}
