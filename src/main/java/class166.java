import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class166 extends class435 {

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lsr;")
    public class167 field2147 = new class167();

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Loq;")
    public static class242 field2150 = new class242("", 15);

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[I")
    public static int[] field2151 = new int[256];

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field2152;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2151[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 4)
    public static final void method967(int arg0) {
        field2148++;
        if (arg0 != -2) {
            return;
        }
        for (int var1 = 0; var1 < class347.field4621; var1++) {
            class282 var2 = class40.field429[var1];
            if (var2.field3736 == 2) {
                if (var2.field3737 == null) {
                    var2.field3739 = Integer.MIN_VALUE;
                } else {
                    class465.field6928.method1114(var2.field3737);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V", line = 39)
    public static void method968(boolean arg0) {
        if (!arg0) {
            field2151 = null;
        }
        field2150 = null;
        field2151 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLwk;)V", line = 51)
    public static final void method969(byte arg0, class96 arg1) {
        if ((arg1 instanceof class22)) {
            class22 var3 = (class22) arg1;
            if (var3.field220 != null) {
                class313.method1861(var3, (byte) 110, class96.field1170.field3695 != var3.field3695);
            }
        } else if (arg1 instanceof class531) {
            class531 var2 = (class531) arg1;
            class316.method1869((byte) -121, var2, class96.field1170.field3695 != var2.field3695);
        }
        if (arg0 > -117) {
            method968(true);
        }
        field2149++;
    }
}
