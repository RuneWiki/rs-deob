import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class126 {

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "[J")
    public static long[] field2227 = new long[256];

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "C")
    public char field2221;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "J")
    public static long field2230;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2227[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lfca;I)V", line = 3)
    public final void method1081(class93 arg0, int arg1) {
        if (arg1 != 30592) {
            this.field2223 = 14;
        }
        while (true) {
            int var3 = arg0.method793((byte) 16);
            if (var3 == 0) {
                field2228++;
                return;
            }
            this.method1082(var3, arg0, 24);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILfca;I)V", line = 23)
    private final void method1082(int arg0, class93 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2221 = class283.method1823(-27037, arg1.method766((byte) 122));
        } else if (arg0 == 2) {
            this.field2225 = arg1.method763(-3);
            this.field2222 = arg1.method793((byte) 24);
            this.field2223 = arg1.method793((byte) 14);
        }
        if (arg2 < 20) {
            method1083(105);
        }
        field2226++;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V", line = 47)
    public static void method1083(int arg0) {
        field2227 = null;
        if (arg0 > -115) {
            method1084(true, null);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZLfca;)Lla;", line = 58)
    public static final class478 method1084(boolean arg0, class93 arg1) {
        field2229++;
        if (arg0) {
            return null;
        } else {
            class338 var2 = class767.method4225(arg1, -84);
            int var3 = arg1.method769((byte) 19);
            return new class478(var2.field4575, var2.field4570, var2.field4572, var2.field4573, var2.field4571, var3);
        }
    }
}
