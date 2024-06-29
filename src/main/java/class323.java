import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class323 extends class603 implements class396 {

    @OriginalMember(owner = "client!es", name = "J", descriptor = "Lvt;")
    private class256 field4674;

    @OriginalMember(owner = "client!es", name = "G", descriptor = "S")
    public static short field4671 = 32767;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "I")
    public static int field4666 = 1407;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!es", name = "C", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!es", name = "E", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!es", name = "F", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!es", name = "H", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!es", name = "I", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method651(int arg0) {
        if (arg0 != -15045) {
            this.method654(11, -87);
        }
        field4668++;
        return super.method651(arg0);
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)I", line = 29)
    public final int method653(int arg0) {
        if (arg0 == 14173) {
            field4669++;
            return super.method653(14173);
        } else {
            return -13;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 52)
    public final Buffer method652(boolean arg0, int arg1) {
        if (arg1 == 31983) {
            field4665++;
            return super.method652(arg0, 31983);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lgf;Lvt;Z)V", line = 67)
    public class323(class234 arg0, class256 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field4674 = arg1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V", line = 75)
    public final void method654(int arg0, int arg1) {
        field4672++;
        super.method654(this.field4674.field3652 * arg0, arg1);
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)Lvt;", line = 88)
    public final class256 method655(int arg0) {
        field4673++;
        int var2 = 99 / ((arg0 + 28) / 48);
        return this.field4674;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V", line = 102)
    public final void method650(boolean arg0) {
        super.method650(arg0);
        field4670++;
    }
}
