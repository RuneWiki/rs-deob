import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 {

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Lmd;")
    private class242 field41;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lqa;")
    private class159 field39;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lpf;")
    private class311 field45;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field34 = 0;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field32 = 0;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "S")
    public static short field30 = 320;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "[I")
    public static int[] field36 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lma;")
    private class202 field35;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lfa;")
    public static class273 field29;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "[Lkd;")
    private class220[] field40;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIILjk;IJIIII)Z")
    public static final boolean method11(int arg0, int arg1, int arg2, int arg3, class276 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class227.method1576(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method12(int arg0) {
        field29 = null;
        if (arg0 != 5) {
            method12(-21);
        }
        field36 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method13(byte arg0) {
        field33++;
        if (this.field40 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field40.length; var2++) {
            if (this.field40[var2] != null) {
                this.field40[var2].method1547((byte) -100);
            }
        }
        for (int var3 = 0; var3 < this.field40.length; var3++) {
            if (this.field40[var3] != null) {
                this.field40[var3].method1550(-21);
            }
        }
        if (arg0 > -45) {
            field30 = -25;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Z")
    public final boolean method14(int arg0) {
        field37++;
        if (this.field35 != null) {
            return true;
        }
        if (this.field45 == null) {
            if (this.field41.method1693((byte) -72)) {
                return false;
            }
            this.field45 = this.field41.method1692(255, true, 255, (byte) 0, arg0 ^ 0x4593);
        }
        if (this.field45.field338) {
            return false;
        }
        this.field35 = new class202(this.field45.method164(25976));
        if (arg0 == 8) {
            this.field40 = new class220[(this.field35.field3234.length - 5) / 8];
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lnh;Lnh;IB)Lkd;")
    public final class220 method15(class55 arg0, class55 arg1, int arg2, byte arg3) {
        field31++;
        if (arg3 <= 31) {
            this.method16(76, (class55) null, (class55) null, -99, true);
        }
        return this.method16(255, arg0, arg1, arg2, true);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILnh;Lnh;IZ)Lkd;")
    private final class220 method16(int arg0, class55 arg1, class55 arg2, int arg3, boolean arg4) {
        if (arg0 != 255) {
            field32 = -98;
        }
        field38++;
        if (this.field35 == null) {
            throw new RuntimeException();
        }
        this.field35.field3272 = arg3 * 8 + 5;
        if (this.field35.field3234.length <= this.field35.field3272) {
            throw new RuntimeException();
        } else if (this.field40[arg3] == null) {
            int var6 = this.field35.method1440(20404);
            int var7 = this.field35.method1440(arg0 ^ 0x4F4B);
            class220 var8 = new class220(arg3, arg1, arg2, this.field41, this.field39, var6, var7, arg4);
            this.field40[arg3] = var8;
            return var8;
        } else {
            return this.field40[arg3];
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lmd;Lqa;)V")
    public class4(class242 arg0, class159 arg1) {
        this.field41 = arg0;
        this.field39 = arg1;
        if (!this.field41.method1693((byte) -72)) {
            this.field45 = this.field41.method1692(255, true, 255, (byte) 0, 17819);
        }
    }
}
