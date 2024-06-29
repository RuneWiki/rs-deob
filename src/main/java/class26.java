import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class26 extends class110 {

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    private final int field421;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    private final int field427;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    private final int field422;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    private final int field431;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Z")
    public static boolean field426 = false;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Lda;")
    public static class275 field428 = class255.method1672(127, "lila:");

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Lma;")
    public static class105 field429;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V")
    public final void method162(byte arg0, int arg1, int arg2) {
        ++field425;
        int var4 = this.field422 * arg1 >> 12;
        int var5 = 88 % ((48 - arg0) / 42);
        int var6 = this.field427 * arg1 >> 12;
        int var7 = this.field431 * arg2 >> 12;
        int var8 = this.field421 * arg2 >> 12;
        class163.method1132(108, super.field1942, var7, var6, var4, super.field1950, var8);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public static void method163(int arg0) {
        field428 = null;
        field429 = null;
        if (arg0 != -508449684) {
            method163(-26);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
    public final void method164(int arg0, int arg1, int arg2) {
        ++field430;
        int var4 = this.field422 * arg0 >> 12;
        int var5 = this.field427 * arg0 >> 12;
        if (arg2 != 32768) {
            method163(-50);
        }
        int var6 = this.field421 * arg1 >> 12;
        int var7 = this.field431 * arg1 >> 12;
        class86.method615(var7, super.field1950, super.field1951, (byte) 126, var4, super.field1942, var6, var5);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB)V")
    public final void method165(int arg0, int arg1, byte arg2) {
        if (arg2 != -53) {
            field429 = null;
        }
        ++field423;
        int var4 = this.field422 * arg0 >> 12;
        int var5 = this.field427 * arg0 >> 12;
        int var6 = this.field431 * arg1 >> 12;
        int var7 = this.field421 * arg1 >> 12;
        class137.method992(var6, var5, super.field1951, var7, arg2 + 165, var4);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIII)V")
    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field421 = arg3;
        this.field427 = arg2;
        this.field422 = arg0;
        this.field431 = arg1;
    }
}
