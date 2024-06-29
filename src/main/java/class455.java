import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class455 extends class250 {

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field6633;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field6627;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public int field6625;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public int field6639;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public int field6635;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field6629;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public int field6626;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field6628 = 0;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field6630 = 0;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "[I")
    public static int[] field6638 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
    public static void method2654(boolean arg0) {
        if (!arg0) {
            field6638 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZI)I")
    public static final int method2655(int arg0, int arg1, boolean arg2, int arg3) {
        field6632++;
        class220 var4 = class224.method1384(arg2, true, arg3);
        if (var4 == null) {
            return -1;
        } else if (arg1 == 18474) {
            return arg0 >= 0 && var4.field3097.length > arg0 ? var4.field3097[arg0] : -1;
        } else {
            return 112;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BII)Z")
    public static final boolean method2656(byte arg0, int arg1, int arg2) {
        if (arg0 == -85) {
            field6634++;
            return (arg1 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public final void method722(int arg0) {
        if (arg0 == 0) {
            field6636++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)I")
    public abstract int method370(byte arg0);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)Z")
    public final boolean method723(int arg0) {
        if (arg0 != 17774) {
            this.field6633 = -46;
        }
        field6624++;
        return false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILbp;IZLeq;)V")
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        if (arg2 != -1) {
            this.method722(20);
        }
        field6631++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIII)V")
    public class455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6633 = arg0;
        this.field6627 = arg4;
        this.field6625 = arg2;
        this.field6639 = arg1;
        this.field6635 = arg5;
        this.field6629 = arg3;
        this.field6626 = arg6;
    }
}
