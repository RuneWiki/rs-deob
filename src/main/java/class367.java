import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class367 extends class447 {

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    private int field5170 = 0;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    private int field5181 = 0;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    private int field5185 = -32768;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "Z")
    public boolean field5168 = false;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    private int field5174 = -1;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    private int field5169;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "Ljm;")
    private class411 field5177;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "Lec;")
    public static class129 field5182 = new class129(64);

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    public static int field5186 = 1;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "[I")
    public static int[] field5188 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!te", name = "db", descriptor = "Z")
    public static boolean field5187 = true;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "Le;")
    private class313 field5179;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)I")
    public final int method915(byte arg0) {
        int var2 = 23 % ((34 - arg0) / 56);
        ++field5175;
        return this.field5185;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
    public static final void method2362(int arg0, int arg1, int arg2, int arg3) {
        class125 var4 = class328.field4549[arg0][arg1][arg2];
        if (var4 != null) {
            class214 var5 = var4.field1740;
            class214 var6 = var4.field1750;
            if (var5 != null) {
                var5.field2989 = var5.field2989 * arg3 / 16;
                var5.field2980 = var5.field2980 * arg3 / 16;
            }
            if (var6 != null) {
                var6.field2989 = var6.field2989 * arg3 / 16;
                var6.field2980 = var6.field2980 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field5169 = arg0;
        this.field5180 = arg2 - -arg1;
        int var12 = class393.method2484(this.field5169, -103).field1125;
        if (var12 == -1) {
            this.field5168 = true;
        } else {
            this.field5168 = false;
            this.field5177 = class108.method761((byte) -82, var12);
        }
        if (this.field5180 == arg2) {
            class431.method2721(super.field6266, super.field6262, this.field5177, 125, false, this.field5170);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method2363(int arg0) {
        field5182 = null;
        field5188 = null;
        if (arg0 != 8995) {
            method2362(-111, 96, 76, 4);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public final void method2364(boolean arg0) {
        if (!arg0) {
            this.field5179 = null;
        }
        if (this.field5179 != null) {
            this.field5179.method2025();
        }
        ++field5178;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
    public final void method674(byte arg0) {
        if (arg0 == -1) {
            ++field5165;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field5164;
        if (this.field5179 != null) {
            this.field5179.method2025();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLuo;)Laj;")
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field5167;
        if (!arg0) {
            return null;
        } else {
            class394 var3 = this.method2365(1024, arg1, -1);
            if (var3 == null) {
                return null;
            } else {
                class417 var4 = arg1.method84();
                var4.method702(super.field6262, super.field6270, super.field6266);
                if (this.field5179 == null) {
                    var3.method1416(var4, (class84) null, 0);
                } else {
                    class77 var5 = this.field5179.method2017();
                    arg1.method72(var3, var5, var4, (class84) null, 0);
                }
                this.field5185 = var3.method1443();
                this.method2367(arg1, (byte) 46, var3);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILuo;I)Lmj;")
    private final class394 method2365(int arg0, class345 arg1, int arg2) {
        ++field5172;
        class80 var4 = class393.method2484(this.field5169, 109);
        if (arg2 != -1) {
            return null;
        } else {
            return !this.field5168 ? var4.method580(this.field5170, -1172, arg1, arg0, this.field5174, this.field5181) : var4.method580(-1, -1172, arg1, arg0, -1, 0);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILuo;I)Z")
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field5183;
        if (arg1 != -20759) {
            this.field5181 = -107;
        }
        return false;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Luo;I)V")
    public final void method678(class345 arg0, int arg1) {
        if (arg1 == -22948) {
            ++field5173;
            class394 var3 = this.method2365(0, arg0, -1);
            if (var3 != null) {
                this.method2367(arg0, (byte) 46, var3);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)Z")
    public final boolean method683(byte arg0) {
        ++field5166;
        int var2 = 33 % ((47 - arg0) / 47);
        return false;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V")
    public final void method2366(byte arg0, int arg1) {
        ++field5176;
        if (!this.field5168) {
            this.field5181 += arg1;
            while (this.field5177.field5819[this.field5170] < this.field5181) {
                this.field5181 -= this.field5177.field5819[this.field5170];
                ++this.field5170;
                if (~this.field5170 <= ~this.field5177.field5824.length) {
                    this.field5168 = true;
                    break;
                }
            }
            if (!this.field5168) {
                class431.method2721(super.field6266, super.field6262, this.field5177, -77, false, this.field5170);
            }
            if (arg0 < 77) {
                field5188 = null;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBIILrr;Luo;Z)V")
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        if (arg1 != -126) {
            this.method674((byte) -98);
        }
        ++field5184;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Luo;BLmj;)V")
    private final void method2367(class345 arg0, byte arg1, class394 arg2) {
        ++field5171;
        class48[] var4 = arg2.method1437();
        if (arg1 != 46) {
            this.method915((byte) 40);
        }
        class245[] var5 = arg2.method1456();
        if ((this.field5179 == null || this.field5179.field4284) && (var4 != null || var5 != null)) {
            this.field5179 = new class313(class276.field3837);
        }
        if (this.field5179 != null) {
            this.field5179.method2026(arg0, (long) class276.field3837, var4, var5, false);
            this.field5179.method2015(super.field6267, super.field6261, super.field6272, super.field6258, super.field6264);
        }
    }
}
