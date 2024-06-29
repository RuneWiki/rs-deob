import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class478 extends class454 {

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "Lko;")
    public class326 field6576;

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "[Lmq;")
    public static class85[] field6575;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILgga;I)Lrt;")
    public static final class470 method2833(int arg0, class513 arg1, int arg2) {
        int var3 = -46 % ((-arg0 - 47) / 53);
        field6579++;
        byte[] var4 = arg1.method2988(arg2, 0);
        return var4 == null ? null : new class470(var4);
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lko;)V")
    public class478(class326 arg0) {
        this.field6576 = arg0;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BB)C")
    public static final char method2834(byte arg0, byte arg1) {
        field6580++;
        int var2 = arg1 & 0xFF;
        int var3 = -75 % ((-arg0 - 15) / 38);
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var4 = class183.field2787[var2 - 128];
            if (var4 == '\u0000') {
                var4 = '?';
            }
            var2 = var4;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)V")
    public static void method2835(boolean arg0) {
        field6575 = null;
        if (arg0) {
            field6577 = -52;
        }
    }
}
