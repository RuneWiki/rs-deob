import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class113 extends class120 {

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    private int field1663 = 0;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    private int field1661 = 1;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    private int field1665 = 0;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "[S")
    public static short[] field1659 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "Lfl;")
    public static class86 field1658 = new class86(8);

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "Lok;")
    private static class41 field1669 = class137.method956("Loaded fonts", 45);

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "Lok;")
    public static class41 field1671 = class137.method956("; Max)2Age=", 45);

    @OriginalMember(owner = "client!ah", name = "hb", descriptor = "[I")
    public static int[] field1672 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ah", name = "kb", descriptor = "Lok;")
    public static class41 field1675 = field1669;

    @OriginalMember(owner = "client!ah", name = "ib", descriptor = "Lok;")
    public static class41 field1673 = class137.method956("Zugewiesener Speicher)3", 45);

    @OriginalMember(owner = "client!ah", name = "jb", descriptor = "Lok;")
    public static class41 field1674 = class137.method956("Schrifts-=tze geladen)3", 45);

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ah", name = "lb", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "Lmh;")
    public static class65 field1670;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "[[Z")
    public static boolean[][] field1668;

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 3)
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I", line = 14)
    public final int[] method14(int arg0, int arg1) {
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int var4 = class16.field216[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class307.field5160; var6++) {
                int var7 = class203.field3278[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field1663 == 0) {
                    var11 = (var7 - var4) * this.field1661;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1661 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field1665 == 0) {
                    var12 = class313.field5283[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field1665 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        field1660++;
        if (arg1 != -14959) {
            this.method31(85);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Llb;II)V", line = 91)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field1667++;
        if (arg2 == 0) {
            this.field1663 = arg0.method792(2);
        } else if (arg2 == 1) {
            this.field1665 = arg0.method792(2);
        } else if (arg2 == 3) {
            this.field1661 = arg0.method792(arg1 ^ 0xFFFFFFFD);
        }
        if (arg1 != -1) {
            field1674 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V", line = 136)
    public static final void method819(int arg0) {
        field1664++;
        if (arg0 <= 108) {
            method821(126);
        }
        class306.field5131.method135(18436);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IIIIIII)I", line = 147)
    public static final int method820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1662++;
        if ((arg4 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg6;
            arg6 = var7;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (~var8 == arg0) {
            return arg2;
        } else if (var8 == 2) {
            return -arg5 - (-(7 - arg1) - 1);
        } else {
            return -arg6 - (-(7 - arg2) - 1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 179)
    public final void method31(int arg0) {
        class148.method1029(arg0 ^ 0x3C29);
        if (arg0 == -31851) {
            field1666++;
        }
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)V", line = 199)
    public static void method821(int arg0) {
        if (arg0 >= -76) {
            return;
        }
        field1673 = null;
        field1671 = null;
        field1674 = null;
        field1672 = null;
        field1675 = null;
        field1670 = null;
        field1669 = null;
        field1668 = (boolean[][]) null;
        field1659 = null;
        field1658 = null;
    }
}
