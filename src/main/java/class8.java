import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "a", descriptor = "[Z")
    public static boolean[] field115 = new boolean[100];

    @OriginalMember(owner = "client!to", name = "f", descriptor = "Z")
    public static boolean field120 = true;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lul;III)Lqr;", line = 3)
    public static final class48 method59(class406 arg0, int arg1, int arg2, int arg3) {
        field118++;
        class217 var4 = new class217(arg0.method2536(arg2, 0, arg1));
        class48 var5 = new class48(arg1, var4.method1550((byte) 28), var4.method1550((byte) 28), var4.method1556(106), var4.method1556(110), var4.method1515((byte) 127) == 1, var4.method1515((byte) 122), var4.method1515((byte) 125));
        int var6 = -72 / ((-arg3 - 5) / 61);
        int var7 = var4.method1515((byte) 125);
        for (int var8 = 0; var8 < var7; var8++) {
            var5.field613.method994(new class81(var4.method1515((byte) 127), var4.method1511(125), var4.method1511(89), var4.method1511(110), var4.method1511(-121), var4.method1511(122), var4.method1511(122), var4.method1511(123), var4.method1511(83)), -3610);
        }
        var5.method477(-17568);
        return var5;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V", line = 31)
    public static final void method60(int arg0, int arg1) {
        class108.field1510 = -1;
        class334.field4988 = -1;
        class136.field2074 = arg1;
        field116++;
        class233.method1632(-1);
        if (arg0 >= -119) {
            method61(-91, 120, -77, -76);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)I", line = 50)
    public static final int method61(int arg0, int arg1, int arg2, int arg3) {
        field119++;
        if (arg1 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg0;
        int var5 = (arg1 & 0x7F) * arg0 + (arg2 & 0x7F) * var4 >> 7;
        int var6 = (arg1 & 0x380) * arg0 + (arg2 & 0x380) * var4 >> 7;
        if (arg3 < 106) {
            method61(-31, 13, -125, -71);
        }
        int var7 = (arg1 & 0xFC00) * arg0 + (arg2 & 0xFC00) * var4 >> 7;
        return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lhp;Z)Lhg;", line = 74)
    public static final class490 method62(class217 arg0, boolean arg1) {
        field117++;
        if (!arg1) {
            field120 = true;
        }
        return new class490(arg0.method1529((byte) 109), arg0.method1529((byte) 112), arg0.method1529((byte) -91), arg0.method1529((byte) -69), arg0.method1548(31529), arg0.method1548(31529), arg0.method1515((byte) 125));
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V", line = 85)
    public static void method63(boolean arg0) {
        if (!arg0) {
            method60(39, -105);
        }
        field115 = null;
    }
}
