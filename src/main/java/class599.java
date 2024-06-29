import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class class599 extends class673 {

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field8512;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public int field8508;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public int field8511;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public int field8515;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public int field8518;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public int field8519;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public int field8506;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Llu;")
    public static class651 field8513 = new class651();

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "Lli;")
    public static class390 field8517 = new class390(128);

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field8520 = 0;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "[I")
    public static int[] field8521;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        if (!arg2) {
            field8507++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    public static final void method3349(int arg0) {
        field8516++;
        class16.method68((byte) 4);
        int var1 = -77 % ((arg0 - 9) / 61);
        class73.method470((byte) 84);
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
    public static void method3350(int arg0) {
        field8517 = null;
        field8521 = null;
        field8513 = null;
        if (arg0 != 0) {
            field8513 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        if (arg0 != -126) {
            method3351((byte) -123, 56, -35);
        }
        field8510++;
        return false;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        int var2 = 88 % ((arg0 - 12) / 56);
        field8509++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BII)I")
    public static final int method3351(byte arg0, int arg1, int arg2) {
        field8505++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg1--;
        }
        if (arg0 != 7) {
            field8521 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V")
    public static final void method3352(int arg0) {
        if (arg0 >= -40) {
            method3349(104);
        }
        class646.field9145 = new class562();
        field8514++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)I")
    public abstract int method1923(boolean arg0);

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIIII)V")
    public class599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8512 = arg6;
        this.field8508 = arg1;
        this.field8511 = arg3;
        this.field8515 = arg0;
        this.field8518 = arg5;
        this.field8519 = arg4;
        this.field8506 = arg2;
    }
}
