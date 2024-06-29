import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class325 {

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    private int field4427 = 0;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Lfaa;")
    private class139 field4424;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Lem;")
    public static class206 field4422 = new class206(29, 5);

    @OriginalMember(owner = "client!du", name = "g", descriptor = "[Z")
    public static boolean[] field4428 = new boolean[100];

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field4429 = 1338;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Lrp;")
    private class401 field4425;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Lsea;")
    public static class648 field4431;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)Lrp;")
    public final class401 method1947(byte arg0) {
        if (arg0 < 35) {
            return null;
        }
        field4426++;
        if (this.field4427 > 0 && this.field4424.field1964[this.field4427 - 1] != this.field4425) {
            class401 var2 = this.field4425;
            this.field4425 = var2.field5625;
            return var2;
        }
        while (this.field4427 < this.field4424.field1978) {
            class401 var3 = this.field4424.field1964[this.field4427++].field5625;
            if (this.field4424.field1964[this.field4427 - 1] != var3) {
                this.field4425 = var3.field5625;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lsea;I)V")
    public static final void method1948(class648 arg0, int arg1) {
        int var2 = 27 % ((-arg1 - 47) / 63);
        class243.field3306 = arg0.method3643("p11_full", 1);
        field4432++;
        class392.field5549 = arg0.method3643("p12_full", 1);
        class230.field3187 = arg0.method3643("b12_full", 1);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
    public static void method1949(boolean arg0) {
        field4431 = null;
        if (arg0) {
            field4428 = null;
        }
        field4422 = null;
        field4428 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Lrp;")
    public final class401 method1950(int arg0) {
        this.field4427 = arg0;
        field4423++;
        return this.method1947((byte) 43);
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
    public class325() {
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lfaa;)V")
    public class325(class139 arg0) {
        this.field4424 = arg0;
    }
}
