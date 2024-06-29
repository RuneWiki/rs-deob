import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class36 {

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Llm;")
    private class337 field492;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "[J")
    public static long[] field488 = new long[256];

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Lct;")
    public static class414 field494;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Z")
    public static boolean field498;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lpl;")
    public static class612 field496;

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
            field488[var0] = var1;
        }
        field494 = new class414();
        field495 = -1;
        field497 = 0;
        field498 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Z", line = 5)
    public static final boolean method225(byte arg0, int arg1) {
        field490++;
        if (arg0 != 22) {
            method225((byte) 21, 61);
        }
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIZIZ)V", line = 17)
    public static final void method226(byte arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        class142.method837(arg2, class68.field930.length - 1, arg4, 2, arg3, 0, arg1);
        if (arg0 != -25) {
            method226((byte) 81, -100, true, 73, false);
        }
        field493++;
        class267.field3383 = 0;
        class120.field1531 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 30)
    public static void method227(byte arg0) {
        field488 = null;
        if (arg0 == -92) {
            field496 = null;
            field494 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V", line = 46)
    protected final void finalize() throws Throwable {
        this.field492.method1894(this.field489, 27077);
        field491++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Llm;II)V", line = 84)
    public class36(class337 arg0, int arg1, int arg2) {
        this.field492 = arg0;
        this.field489 = arg2;
    }
}
