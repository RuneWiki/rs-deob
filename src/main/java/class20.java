import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class20 extends class149 implements class254 {

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Z")
    private boolean field246 = false;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    private int field255 = 50;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "Ldk;")
    private class251 field254;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "Ldk;")
    private class251 field258;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "Loa;")
    private class101 field249;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "Loa;")
    private class101 field259;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "F")
    public static float field240 = 128.0F;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)Lmh;")
    public final class64 method102(int arg0, int arg1) {
        field256++;
        class38 var3 = this.method110(arg1, arg0);
        return var3 == null ? null : var3.field540;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public final void method103(int arg0) {
        field239++;
        if (arg0 != 9974) {
            this.field246 = true;
        }
        this.field249.method692((byte) 123);
        if (this.field259 != null) {
            this.field259.method692((byte) 126);
        }
        class38.field531 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIF)[I")
    public final int[] method104(int arg0, int arg1, float arg2) {
        field252++;
        if (arg1 != 255) {
            return null;
        }
        class38 var4 = this.method110(arg0, arg1 ^ 0xBF);
        if (var4 == null) {
            return null;
        } else {
            var4.field538 = true;
            return var4.method236(this, this.field254, arg2, this.field246 || this.method1034(arg0, arg1 ^ 0xFFFFFF00).field1142);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZFII)Lqi;")
    public final class232 method105(int arg0, boolean arg1, float arg2, int arg3, int arg4) {
        field244++;
        if (arg4 != -16578) {
            return null;
        }
        class38 var6 = this.method110(arg3, 64);
        if (var6 != null && var6.method238(this, this.field254)) {
            return arg1 ? var6.field540.method448((byte) -82, false, this.field254, (double) arg2, arg0, arg0, this) : var6.field540.method451((byte) 25, arg0, this, this.field254, false, arg0, (double) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
    public final void method106(boolean arg0, int arg1) {
        field245++;
        if (arg1 > -58) {
            this.method104(2, -111, -0.8695271F);
        }
        this.field246 = arg0;
        this.method103(9974);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Z")
    public final boolean method107(int arg0, int arg1) {
        field248++;
        if (arg0 < 62) {
            return true;
        } else {
            return !this.method1034(arg1, -1).field1143;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)V")
    public static final void method108(byte arg0, boolean arg1) {
        field253++;
        byte[][] var2 = class117.field1893;
        if (arg0 != 16) {
            return;
        }
        int var3 = class57.field956.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class120.field1914[var4] >> 8) * 64 - class276.field4438;
                int var7 = (class120.field1914[var4] & 0xFF) * 64 - class108.field1732;
                class276.method1859((byte) 121);
                class160.method1099(var6, var5, arg1, 4090, class131.field2065, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ldk;Ldk;Ldk;IZ)V")
    public class20(class251 arg0, class251 arg1, class251 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field246 = arg4;
        this.field254 = arg2;
        this.field255 = arg3;
        this.field258 = arg0;
        this.field249 = new class101(this.field255);
        this.field259 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Z")
    public final boolean method109(byte arg0, int arg1) {
        field251++;
        if (arg0 <= 57) {
            this.field259 = null;
        }
        return this.field246 || this.method1034(arg1, -1).field1142;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(II)Lw;")
    private final class38 method110(int arg0, int arg1) {
        field241++;
        if (arg1 != 64) {
            field240 = -0.91760397F;
        }
        class38 var3 = (class38) this.field249.method694((long) arg0, false);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field258.method1680(0, arg0, -104);
        if (var4 == null) {
            return null;
        } else {
            class38 var5 = new class38(new class162(var4));
            this.field249.method693((long) arg0, 106, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(II)V")
    public final void method111(int arg0, int arg1) {
        field243++;
        for (class38 var3 = (class38) this.field249.method691(false); var3 != null; var3 = (class38) this.field249.method689(true)) {
            if (var3.field538) {
                var3.method239(arg1);
                var3.field538 = false;
            }
        }
        if (arg0 < 5) {
            field257 = 59;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Z")
    public final boolean method112(int arg0, byte arg1) {
        field242++;
        if (arg1 != 102) {
            this.field258 = null;
        }
        return this.method1034(arg0, -1).field1149;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IB)I")
    public final int method113(int arg0, byte arg1) {
        field247++;
        if (arg1 > -59) {
            this.method111(87, 67);
        }
        return this.method1034(arg0, -1).field1147 & 0xFFFF;
    }
}
