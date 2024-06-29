import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class208 extends class270 {

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "Ljava/lang/String;")
    public String field2525;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "J")
    public long field2524;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
    public int field2534;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "Z")
    public boolean field2526;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "Ljava/lang/String;")
    public String field2529;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "Z")
    public boolean field2535;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public int field2523;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "Lkfa;")
    public static class549 field2522 = new class549(43, 8);

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "Z")
    public static boolean field2532 = false;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "F")
    public static float field2521;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "J")
    public static long field2530;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
    public static void method1257(byte arg0) {
        if (arg0 != -89) {
            field2530 = -93L;
        }
        field2522 = null;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class208(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field2525 = arg1;
        this.field2524 = arg5;
        this.field2533 = arg6;
        this.field2534 = arg4;
        this.field2526 = arg8;
        this.field2529 = arg0;
        this.field2535 = arg9;
        this.field2523 = arg7;
        this.field2531 = arg2;
        this.field2527 = arg3;
    }
}
