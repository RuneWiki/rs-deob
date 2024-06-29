import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class244 {

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    private int field3592 = 0;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    private int field3589 = 0;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "Lkj;")
    private class396 field3588 = null;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    private int field3597 = 0;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "Lfd;")
    private class365 field3595;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "Lm;")
    private class127 field3600;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "[Ldl;")
    private class45[] field3590;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "Lve;")
    public class346 field3596;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "[I")
    public static int[] field3594 = new int[500];

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "[Z")
    public static boolean[] field3598 = new boolean[100];

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "Lfs;")
    public static class387 field3587;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "[Llk;")
    public static class413[] field3585;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLkj;I)Z")
    public final boolean method1601(byte arg0, class396 arg1, int arg2) {
        if (arg0 >= -76) {
            return true;
        }
        field3601++;
        if (this.field3592 == 0) {
            return false;
        }
        if (this.field3588 != arg1) {
            this.field3590[this.field3592 & Integer.MAX_VALUE].method285(arg2, arg1, true);
            this.field3588 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)Z")
    public final boolean method1602(int arg0, byte arg1) {
        field3591++;
        int var3 = -33 % ((arg1 + 58) / 34);
        return this.field3590[arg0].method280(true);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZZI)V")
    public final void method1603(int arg0, boolean arg1, boolean arg2, int arg3) {
        field3593++;
        boolean var5 = arg1 & this.field3595.method323();
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg2) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (arg0 > -69) {
            this.field3590 = null;
        }
        if (this.field3592 != arg3) {
            if (this.field3592 != 0) {
                this.field3590[Integer.MAX_VALUE & this.field3592].method287(0);
            }
            if (arg3 != 0) {
                this.field3590[arg3 & Integer.MAX_VALUE].method281(0, arg2);
                this.field3590[Integer.MAX_VALUE & arg3].method279(arg2, (byte) 121);
            }
            this.field3592 = arg3;
            this.field3589 = Integer.MIN_VALUE;
            this.field3588 = null;
            this.field3597 = Integer.MIN_VALUE;
        } else if (this.field3592 != 0) {
            this.field3590[Integer.MAX_VALUE & this.field3592].method279(arg2, (byte) 117);
            return;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIZ)V")
    public final void method1604(int arg0, int arg1, boolean arg2) {
        if ((this.field3589 != arg0 | this.field3597 != arg1) & this.field3592 != 0) {
            this.field3590[Integer.MAX_VALUE & this.field3592].method286(arg1, 83, arg0);
            this.field3589 = arg0;
            this.field3597 = arg1;
        }
        field3599++;
        if (arg2) {
            field3585 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static void method1605(int arg0) {
        field3585 = null;
        field3594 = null;
        field3598 = null;
        field3587 = null;
        if (arg0 != 9) {
            method1605(-31);
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lfd;)V")
    public class244(class365 arg0) {
        this.field3595 = arg0;
        this.field3600 = new class127(arg0);
        this.field3590 = new class45[10];
        this.field3590[1] = new class51(arg0);
        this.field3590[2] = new class117(arg0, this.field3600);
        this.field3590[4] = new class37(arg0, this.field3600);
        this.field3590[5] = new class417(arg0, this.field3600);
        this.field3590[6] = new class230(arg0);
        this.field3590[7] = new class47(arg0);
        this.field3590[3] = this.field3596 = new class346(arg0);
        this.field3590[8] = new class205(arg0, this.field3600);
        this.field3590[9] = new class352(arg0, this.field3600);
        if (!this.field3590[8].method280(true)) {
            this.field3590[8] = this.field3590[4];
        }
        if (!this.field3590[9].method280(true)) {
            this.field3590[9] = this.field3590[8];
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)I")
    public static int method1606(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
