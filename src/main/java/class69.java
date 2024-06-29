import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class69 {

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    private int field854 = 0;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Lkk;")
    private class188 field848;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[Z")
    public static boolean[] field853 = new boolean[100];

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Z")
    public static boolean field847 = true;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "J")
    public static long field855 = 0L;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lgg;")
    public static class172 field846;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Lm;")
    private class189 field858;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[Loia;")
    public static class88[] field849;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lm;")
    public final class189 method568(byte arg0) {
        field852++;
        if (this.field854 > 0 && this.field848.field2523[this.field854 - 1] != this.field858) {
            class189 var2 = this.field858;
            this.field858 = var2.field2543;
            return var2;
        }
        while (this.field854 < this.field848.field2526) {
            class189 var3 = this.field848.field2523[this.field854++].field2543;
            if (this.field848.field2523[this.field854 - 1] != var3) {
                this.field858 = var3.field2543;
                return var3;
            }
        }
        if (arg0 >= -82) {
            method569(-111, (byte) 84, -124);
        }
        return null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBI)Z")
    public static final boolean method569(int arg0, byte arg1, int arg2) {
        if (arg1 <= 58) {
            field856 = -116;
        }
        field857++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Lm;")
    public final class189 method570(int arg0) {
        this.field854 = arg0;
        field850++;
        return this.method568((byte) -113);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public static final void method571(boolean arg0) {
        field851++;
        class287.field4061.method4024(0);
        if (arg0) {
            method572(-18);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method572(int arg0) {
        field846 = null;
        field853 = null;
        if (arg0 == 30328) {
            field849 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class69() {
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lkk;)V")
    public class69(class188 arg0) {
        this.field848 = arg0;
    }
}
