import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class667 implements class126 {

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public int field9483;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "Lrn;")
    public class380 field9478;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    public int field9490;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public int field9491;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public int field9475;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
    public int field9480;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "Lhv;")
    public class97 field9482;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "Z")
    public boolean field9485;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public int field9476;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public int field9484;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public int field9481;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "Ljj;")
    public static class398 field9489 = new class398(60, 5);

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "Lsaa;")
    public static class507 field9492 = new class507("LOCAL", 4);

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "I")
    public static int field9493 = 0;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "F")
    public static float field9486;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "[Lus;")
    public static class566[] field9494;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)Ljv;", line = 8)
    public final class606 method472(byte arg0) {
        if (arg0 == -110) {
            field9479++;
            return class210.field2753;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)I", line = 23)
    public static final int method3700(int arg0, int arg1) {
        field9488++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xC3) >> 6;
        if (arg1 != -20868) {
            method3701(62);
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V", line = 87)
    public static void method3701(int arg0) {
        if (arg0 <= 105) {
            method3700(-126, 0);
        }
        field9489 = null;
        field9492 = null;
        field9494 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIZI)V", line = 101)
    public static final void method3702(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if ((arg5 ? class72.field935.field6514 : class72.field935.field6512) != 0 && arg2 != 0 && class485.field6555 < 50 && arg4 != -1) {
            class658.field9278[class485.field6555++] = new class578((byte) (arg5 ? 3 : 2), arg4, arg2, arg6, arg0, arg1);
        }
        field9477++;
        if (arg3 != -20) {
            method3701(19);
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(ILrn;Lhv;IIIIIIIZ)V", line = 122)
    public class667(int arg0, class380 arg1, class97 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field9483 = arg5;
        this.field9478 = arg1;
        this.field9490 = arg4;
        this.field9491 = arg8;
        this.field9475 = arg0;
        this.field9480 = arg3;
        this.field9482 = arg2;
        this.field9485 = arg10;
        this.field9476 = arg6;
        this.field9484 = arg9;
        this.field9481 = arg7;
    }
}
