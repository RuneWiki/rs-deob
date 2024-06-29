import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 extends class326 {

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    private int field248 = -1;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "Lgd;")
    public static class206 field249 = new class206("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "Z")
    public static boolean field254 = false;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field256 = 0;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field258 = 0;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "F")
    public static float field257;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "[I")
    private int[] field250;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 8)
    public class18() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V", line = 12)
    public final void method115(int arg0, int arg1, byte arg2) {
        super.method115(arg0, arg1, (byte) -111);
        if (arg2 <= -97) {
            ++field260;
            if (this.field248 >= 0 && class220.field2939 != null) {
                int var4 = !class220.field2939.method1621(18318, this.field248).field309 ? 128 : 64;
                this.field250 = class220.field2939.method1622(this.field248, false, -125, var4, 1.0F, var4);
                this.field247 = var4;
                this.field245 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)I", line = 32)
    public final int method116(boolean arg0) {
        if (!arg0) {
            field259 = -30;
        }
        ++field244;
        return this.field248;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 43)
    public final void method117(int arg0) {
        super.method117(arg0);
        ++field255;
        this.field250 = null;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 53)
    public static void method118(int arg0) {
        field249 = null;
        if (arg0 != 128) {
            method119(false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V", line = 66)
    public static final void method119(boolean arg0) {
        ++field251;
        if (!arg0) {
            method118(-45);
        }
        if (field258 == 10) {
            class119.method746(28, (byte) -125);
        }
        if (~field258 == -31) {
            class119.method746(25, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[[I", line = 96)
    public final int[][] method48(int arg0, byte arg1) {
        ++field252;
        int[][] var3 = super.field4343.method2356(arg0, 109);
        if (super.field4343.field5336) {
            int var4 = this.field247 * (~class27.field359 != ~this.field245 ? this.field245 * arg0 / class27.field359 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class181.field2495 == ~this.field247) {
                for (int var8 = 0; ~class181.field2495 < ~var8; ++var8) {
                    int var9 = this.field250[var4++];
                    var7[var8] = class99.method612(255, var9) << 4;
                    var6[var8] = class99.method612(var9, 65280) >> 4;
                    var5[var8] = class99.method612(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; ~var10 > ~class181.field2495; ++var10) {
                    int var11 = this.field247 * var10 / class181.field2495;
                    int var12 = this.field250[var4 + var11];
                    var7[var10] = class99.method612(var12, 255) << 4;
                    var6[var10] = class99.method612(4080, var12 >> 4);
                    var5[var10] = class99.method612(var12, 16711680) >> 12;
                }
            }
        }
        if (arg1 >= -52) {
            this.field245 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILbt;I)V", line = 173)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 > -3) {
            this.field245 = 10;
        }
        ++field246;
        if (arg0 == 0) {
            this.field248 = arg1.method215((byte) 119);
        }
    }
}
