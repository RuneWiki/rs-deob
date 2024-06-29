import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class593 {

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "Lte;")
    public static class571 field8527 = new class571("", 13);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public int field8524;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public int field8526;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public int field8528;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
    public static void method3378(int arg0) {
        field8527 = null;
        int var1 = -58 % ((43 - arg0) / 42);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BII)Z")
    public static final boolean method3379(byte arg0, int arg1, int arg2) {
        field8521++;
        int var3 = 26 / ((arg0 - 15) / 60);
        return class454.method2736((byte) -126, arg2, arg1) | (arg2 & 0x70000) != 0 || class637.method3635(arg1, arg2, (byte) 108);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
    public static final void method3380(boolean arg0) {
        class459.field6558 = -1;
        if (!arg0) {
            class694.field9774 = 0;
            class51.field1189 = -1;
            field8523++;
            class461.field6571 = -1;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([BIII)I")
    public static final int method3381(byte[] arg0, int arg1, int arg2, int arg3) {
        field8522++;
        int var4 = -1;
        if (arg3 == 5499) {
            for (int var5 = arg2; var5 < arg1; var5++) {
                var4 = var4 >>> 8 ^ class118.field2116[(arg0[var5] ^ var4) & 0xFF];
            }
            return ~var4;
        } else {
            return 61;
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
    public static final void method3382(int arg0) {
        field8525++;
        class192.field3032 = true;
        if (arg0 != -1) {
            method3382(-93);
        }
    }
}
