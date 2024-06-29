import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends class134 {

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field180 = -1;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "[I")
    public static int[] field184 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Ljava/lang/String;")
    public static String field195 = "Members object";

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lkb;")
    public static class54 field182;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "[I")
    public static int[] field191;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "[Lel;")
    public static class213[] field198;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)I")
    public static final int method114(boolean arg0, int arg1) {
        field208++;
        if (!arg0) {
            method115((byte) -128, -118);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)I")
    public static final int method115(byte arg0, int arg1) {
        if (arg0 != 27) {
            return 100;
        }
        field186++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILlj;)V")
    public static final void method116(int arg0, class26 arg1) {
        class184.method1318(false, 200000, arg1);
        if (arg0 != 8) {
            method117(-15, (class222) null);
        }
        field189++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILcc;)Z")
    public static final boolean method117(int arg0, class222 arg1) {
        if (arg0 != -1) {
            return false;
        }
        field179++;
        if (arg1.field3388 == 205) {
            class219.field3340 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZII)Z")
    public final boolean method118(int arg0, boolean arg1, int arg2, int arg3) {
        field190++;
        if (!arg1) {
            this.method124(-73, 22, -120);
        }
        return this.field188 == arg3 && arg0 >= this.field199 && arg0 <= this.field205 && arg2 >= this.field202 && arg2 <= this.field200;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
    public final boolean method119(int arg0, int arg1, int arg2) {
        field207++;
        if (arg0 != -19380) {
            method114(false, -127);
        }
        return this.field199 <= arg2 && arg2 <= this.field205 && this.field202 <= arg1 && this.field200 >= arg1;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static void method120(int arg0) {
        field198 = null;
        if (arg0 != 1) {
            field184 = null;
        }
        field184 = null;
        field191 = null;
        field195 = null;
        field182 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)[I")
    public final int[] method121(int arg0, byte arg1, int arg2) {
        if (arg1 == -76) {
            field194++;
            return new int[] { this.field183, arg0 + this.field185 - this.field199, -this.field202 - -this.field193 + arg2 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public static final void method122(int arg0) {
        class220.field3360 = new class2();
        if (arg0 != -1191199422) {
            method116(-110, (class26) null);
        }
        field187++;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(III)[I")
    public final int[] method123(int arg0, int arg1, int arg2) {
        field197++;
        return arg0 < 93 ? null : new int[] { this.field188, arg1 + this.field199 - this.field185, this.field202 - (this.field193 - arg2) };
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field185 = arg6;
        this.field193 = arg7;
        this.field183 = arg1;
        this.field206 = arg9;
        this.field200 = arg5;
        this.field201 = arg8;
        this.field202 = arg3;
        this.field205 = arg4;
        this.field188 = arg0;
        this.field199 = arg2;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(III)Z")
    public final boolean method124(int arg0, int arg1, int arg2) {
        int var4 = 107 / ((-arg2 - 36) / 52);
        field203++;
        return this.field185 <= arg1 && this.field201 >= arg1 && arg0 >= this.field193 && this.field206 >= arg0;
    }
}
