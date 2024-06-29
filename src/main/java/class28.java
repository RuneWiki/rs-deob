import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 extends class196 {

    @OriginalMember(owner = "client!be", name = "U", descriptor = "Ldf;")
    public static class51 field402 = class46.method233("Hidden)2use", 100);

    @OriginalMember(owner = "client!be", name = "S", descriptor = "Lqh;")
    public static class189 field400 = new class189(64);

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        ++field403;
        if (arg0 != 11) {
            this.field404 = -27;
        }
        int[][] var3 = super.field3285.method1548(arg1, (byte) -101);
        if (super.field3285.field3963) {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            for (int var7 = 0; ~var7 > ~class49.field767; ++var7) {
                var5[var7] = this.field407;
                var6[var7] = this.field404;
                var4[var7] = this.field399;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(II)V")
    private final void method143(int arg0, int arg1) {
        this.field407 = arg0 >> 12 & 4080;
        this.field399 = 4080 & arg0 << 4;
        ++field398;
        if (arg1 != 1) {
            field402 = null;
        }
        this.field404 = 4080 & arg0 >> 4;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
    private class28(int arg0) {
        super(0, false);
        this.method143(arg0, 1);
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
    public static void method144(int arg0) {
        field402 = null;
        field400 = null;
        if (arg0 != 0) {
            method144(35);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class28() {
        this(0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIIIII)I")
    public static final int method145(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 3;
        ++field401;
        int var8 = -93 % ((-35 - arg1) / 52);
        if ((1 & arg5) == 1) {
            int var9 = arg2;
            arg2 = arg0;
            arg0 = var9;
        }
        if (~var7 == -1) {
            return arg6;
        } else if (~var7 == -2) {
            return -arg2 + 7 + -arg3 + 1;
        } else {
            return var7 == 2 ? -arg0 + 7 + 1 - arg6 : arg3;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field406;
        if (arg2 != 82) {
            this.field404 = -56;
        }
        if (~arg0 == -1) {
            this.method143(arg1.method891((byte) -114), 1);
        }
    }
}
