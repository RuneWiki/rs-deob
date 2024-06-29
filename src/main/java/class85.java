import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class85 {

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "[J")
    public static long[] field861 = new long[256];

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "[Lhga;")
    public static class241[] field860;

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
            field861[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method442(int arg0, int arg1, byte arg2) {
        if (arg2 != 15) {
            method445(53, (char) 65450);
        }
        field862++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)Z", line = 18)
    public static final boolean method443(int arg0) {
        if (arg0 != 0) {
            field861 = null;
        }
        field864++;
        return class360.field4833;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V", line = 29)
    public static void method444(boolean arg0) {
        if (arg0) {
            method443(-36);
        }
        field860 = null;
        field861 = null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IC)I", line = 44)
    public static final int method445(int arg0, char arg1) {
        field863++;
        if (arg1 >= '\u0000' && class440.field6184.length > arg1) {
            return class440.field6184[arg1];
        } else {
            if (arg0 <= 67) {
                field860 = null;
            }
            return -1;
        }
    }
}
