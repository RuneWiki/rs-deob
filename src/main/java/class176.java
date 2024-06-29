import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class176 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    private int field2413 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lbaa;")
    private class130 field2410;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lvu;")
    public static class680 field2411 = new class680();

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field2418 = 0;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field2417 = -1;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lno;")
    private class71 field2414;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "[I")
    public static int[] field2415;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lno;")
    public final class71 method1111(int arg0) {
        field2412++;
        this.field2413 = 0;
        if (arg0 <= 31) {
            this.field2413 = -29;
        }
        return this.method1113((byte) -19);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public static void method1112(int arg0) {
        field2411 = null;
        if (arg0 != 0) {
            field2411 = null;
        }
        field2415 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class176() {
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Lno;")
    public final class71 method1113(byte arg0) {
        field2416++;
        if (this.field2413 > 0 && this.field2410.field1820[this.field2413 - 1] != this.field2414) {
            class71 var2 = this.field2414;
            this.field2414 = var2.field1077;
            return var2;
        }
        while (this.field2413 < this.field2410.field1815) {
            class71 var3 = this.field2410.field1820[this.field2413++].field1077;
            if (this.field2410.field1820[this.field2413 - 1] != var3) {
                this.field2414 = var3.field1077;
                return var3;
            }
        }
        if (arg0 != -19) {
            this.field2410 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lbaa;)V")
    public class176(class130 arg0) {
        this.field2410 = arg0;
    }
}
