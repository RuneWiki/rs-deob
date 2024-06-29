import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class209 {

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
    private int field3047 = 0;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "Ltga;")
    private class64 field3045;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "Z")
    public static boolean field3043 = false;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "Ldn;")
    private class540 field3044;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)Ldn;")
    public final class540 method1483(byte arg0) {
        field3046++;
        if (arg0 != -61) {
            field3041 = 75;
        }
        if (this.field3047 > 0 && this.field3045.field849[this.field3047 - 1] != this.field3044) {
            class540 var2 = this.field3044;
            this.field3044 = var2.field7578;
            return var2;
        }
        while (this.field3045.field846 > this.field3047) {
            class540 var3 = this.field3045.field849[this.field3047++].field7578;
            if (this.field3045.field849[this.field3047 - 1] != var3) {
                this.field3044 = var3.field7578;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)Ldn;")
    public final class540 method1484(byte arg0) {
        if (arg0 > -73) {
            this.method1483((byte) -121);
        }
        field3042++;
        this.field3047 = 0;
        return this.method1483((byte) -61);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZBZ)V")
    public static final void method1485(boolean arg0, byte arg1, boolean arg2) {
        field3040++;
        if (arg0) {
            class281.field4329--;
            if (class281.field4329 == 0) {
                class595.field8378 = null;
            }
        }
        if (arg2) {
            class11.field235--;
            if (class11.field235 == 0) {
                class444.field6323 = null;
            }
        }
        if (arg1 != 30) {
            method1485(true, (byte) -29, false);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
    public class209() {
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ltga;)V")
    public class209(class64 arg0) {
        this.field3045 = arg0;
    }
}
