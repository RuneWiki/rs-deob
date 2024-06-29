import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class187 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    private int field2455 = 0;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Ltca;")
    private class184 field2454;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field2450 = 503;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lmg;")
    private class159 field2453;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Luq;")
    public static class172 field2451;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[[[Lvda;")
    public static class194[][][] field2445;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lmg;")
    public final class159 method1255(int arg0) {
        field2448++;
        if (this.field2455 > 0 && this.field2454.field2416[this.field2455 - 1] != this.field2453) {
            class159 var2 = this.field2453;
            this.field2453 = var2.field2139;
            return var2;
        }
        while (this.field2454.field2425 > this.field2455) {
            class159 var3 = this.field2454.field2416[this.field2455++].field2139;
            if (this.field2454.field2416[this.field2455 - 1] != var3) {
                this.field2453 = var3.field2139;
                return var3;
            }
        }
        return arg0 == 65410 ? null : null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method1256(byte arg0) {
        field2451 = null;
        field2445 = null;
        if (arg0 <= 28) {
            method1258(12, 21);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)V")
    public static final void method1257(int arg0, int arg1, byte arg2) {
        field2447++;
        if (arg2 == 32) {
            class778 var3 = class389.method2406(-107, (long) arg1, 12);
            var3.method4274(107);
            var3.field10690 = arg0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1258(int arg0, int arg1) {
        if (arg0 >= -30) {
            method1256((byte) -115);
        }
        field2452++;
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFF82) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class187() {
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Lmg;")
    public final class159 method1259(int arg0) {
        if (arg0 >= -111) {
            field2449 = 19;
        }
        field2446++;
        this.field2455 = 0;
        return this.method1255(65410);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Ltca;)V")
    public class187(class184 arg0) {
        this.field2454 = arg0;
    }
}
