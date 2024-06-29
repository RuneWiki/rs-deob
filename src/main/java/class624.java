import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class624 {

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
    public int field8693;

    @OriginalMember(owner = "client!oea", name = "v", descriptor = "I")
    public int field8709;

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "B")
    public byte field8705;

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "I")
    public int field8697;

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "I")
    private int field8708;

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "I")
    public static int field8706 = 0;

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
    public static int field8707 = 1400;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field8691 = -1;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public int field8688;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    public int field8689;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
    public int field8695;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "I")
    public int field8699;

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
    public int field8701;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
    public int field8702;

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
    public int field8703;

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
    public int field8704;

    @OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
    public int field8710;

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "Loea;")
    public class624 field8696;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "Lkr;")
    public static class777 field8698;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "[I")
    public static int[] field8692;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BIII)Loea;")
    public final class624 method3513(byte arg0, int arg1, int arg2, int arg3) {
        field8700++;
        int var5 = -29 / ((-arg0 - 5) / 57);
        return new class624(this.field8708, arg2, arg3, arg1, this.field8705);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)Liea;")
    public final class506 method3514(boolean arg0) {
        if (arg0) {
            field8711++;
            return class252.method1659(0, this.field8708);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
    public static final void method3515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field8690++;
        class459 var8 = new class459();
        if (arg4 < 111) {
            field8691 = -128;
        }
        var8.field6235 = arg7;
        var8.field6239 = arg2;
        var8.field6234 = arg3;
        var8.field6242 = arg5;
        var8.field6233 = arg1;
        var8.field6238 = class440.field5977 + arg0;
        var8.field6231 = arg6;
        class236.field3389.method1600(var8, -3);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
    public static void method3516(int arg0) {
        field8698 = null;
        int var1 = 86 % ((28 - arg0) / 62);
        field8692 = null;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(IIIIB)V")
    public class624(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field8693 = arg1;
        this.field8709 = arg2;
        this.field8705 = arg4;
        this.field8697 = arg3;
        this.field8708 = arg0;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZII)V")
    public static final void method3517(boolean arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            class239.method1599(-3, class641.field8830.method3566((byte) 126, class464.field6309), arg0, arg2);
            field8694++;
        }
    }
}
