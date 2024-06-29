import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 {

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    private int field109 = 0;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[Lfj;")
    public class241[] field103;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Loh;")
    public static class263 field88 = class253.method1681(-128, " ");

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field105 = 0;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field107 = 0;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field100 = -1;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "J")
    private long field91;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Loe;")
    public static class140 field87;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Lfj;")
    private class241 field110;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lfj;")
    private class241 field89;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZB)V")
    public static final void method28(boolean arg0, byte arg1) {
        if (arg0 && class230.field4033 != null) {
            class127.field2361 = class230.field4033.field3321;
        } else {
            class127.field2361 = null;
        }
        class38.field872 = null;
        field106++;
        class130.field2386 = null;
        class253.field4390 = null;
        class136.field2490 = null;
        class122.field2274 = null;
        class82.field1638 = null;
        class50.field1084 = null;
        class77.field1575 = null;
        if (arg1 > -91) {
            field95 = -39;
        }
        class230.field4033 = null;
        class144.field2641 = null;
        class163.field2967 = 0;
        class92.field1823 = null;
        class31.field755.method1884(-33);
        class145.field2660 = null;
        class252.field4378 = null;
        class268.field4721 = null;
        class34.field814 = null;
        class66.field1360 = null;
        class109.field2052 = null;
        class200.field3623 = null;
        class156.field2803 = null;
        class275.field4819 = null;
        class271.field4784 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method29(int arg0) {
        if (arg0 < 30) {
            method32((byte) -112, (class194) null);
        }
        for (int var2 = 0; var2 < this.field104; var2++) {
            class241 var3 = this.field103[var2];
            while (true) {
                class241 var4 = var3.field4235;
                if (var3 == var4) {
                    break;
                }
                var4.method1614(-1204826926);
            }
        }
        this.field89 = null;
        this.field110 = null;
        field99++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method30(byte arg0) {
        field87 = null;
        field88 = null;
        if (arg0 < 50) {
            field87 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IJ)Lfj;")
    public final class241 method31(int arg0, long arg1) {
        this.field91 = arg1;
        field93++;
        class241 var4 = this.field103[(int) (arg1 & (long) (this.field104 - 1))];
        if (arg0 != -32665) {
            this.field109 = 27;
        }
        for (this.field89 = var4.field4235; this.field89 != var4; this.field89 = this.field89.field4235) {
            if (this.field89.field4226 == arg1) {
                class241 var5 = this.field89;
                this.field89 = this.field89.field4235;
                return var5;
            }
        }
        this.field89 = null;
        return null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLsi;)Lh;")
    public static final class260 method32(byte arg0, class194 arg1) {
        arg1.method1301(-8317);
        field92++;
        if (arg0 >= -115) {
            return null;
        }
        int var2 = arg1.method1301(-8317);
        class260 var3 = class68.method440(var2, 36);
        var3.field4507 = arg1.method1301(-8317);
        int var4 = arg1.method1301(-8317);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1301(-8317);
            var3.method86(var6, 5701, arg1);
        }
        var3.method88(124);
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lfj;JI)V")
    public final void method33(class241 arg0, long arg1, int arg2) {
        field97++;
        if (arg2 >= -107) {
            return;
        }
        if (arg0.field4229 != null) {
            arg0.method1614(-1204826926);
        }
        class241 var5 = this.field103[(int) (arg1 & (long) (this.field104 - 1))];
        arg0.field4229 = var5.field4229;
        arg0.field4226 = arg1;
        arg0.field4235 = var5;
        arg0.field4229.field4235 = arg0;
        arg0.field4235.field4229 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)I")
    public final int method34(int arg0) {
        field94++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field104; var3++) {
            class241 var4 = this.field103[var3];
            class241 var5 = var4.field4235;
            while (var4 != var5) {
                var5 = var5.field4235;
                var2++;
            }
        }
        if (arg0 <= 85) {
            this.method34(-119);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)I")
    public final int method35(int arg0) {
        field102++;
        if (arg0 != 0) {
            method32((byte) 119, (class194) null);
        }
        return this.field104;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Lfj;")
    public final class241 method36(int arg0) {
        field98++;
        int var2 = -5 / ((-arg0 - 58) / 48);
        if (this.field109 > 0 && this.field103[this.field109 - 1] != this.field110) {
            class241 var3 = this.field110;
            this.field110 = var3.field4235;
            return var3;
        }
        while (this.field109 < this.field104) {
            class241 var4 = this.field103[this.field109++].field4235;
            if (this.field103[this.field109 - 1] != var4) {
                this.field110 = var4.field4235;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)Lfj;")
    public final class241 method37(byte arg0) {
        field101++;
        if (this.field89 == null) {
            return null;
        }
        class241 var2 = this.field103[(int) ((long) (this.field104 - 1) & this.field91)];
        while (this.field89 != var2) {
            if (this.field89.field4226 == this.field91) {
                class241 var3 = this.field89;
                this.field89 = this.field89.field4235;
                return var3;
            }
            this.field89 = this.field89.field4235;
        }
        if (arg0 == 114) {
            this.field89 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        this.field103 = new class241[arg0];
        this.field104 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class241 var3 = this.field103[var2] = new class241();
            var3.field4235 = var3;
            var3.field4229 = var3;
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)Lfj;")
    public final class241 method38(int arg0) {
        this.field109 = 0;
        if (arg0 != 24172) {
            this.method36(107);
        }
        field96++;
        return this.method36(-127);
    }
}
