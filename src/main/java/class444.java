import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class444 extends class337 {

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "Z")
    private boolean field6519 = true;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "Z")
    private boolean field6521 = true;

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "I")
    public static int field6526 = 0;

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "Los;")
    public static class309 field6524 = new class309(1);

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "Z")
    public static boolean field6527 = false;

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "F")
    public static float field6522;

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field6523;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int[] var4 = this.method2124(!this.field6519 ? arg0 : -arg0 + class123.field1843, 0, -75);
            if (this.field6521) {
                for (int var5 = 0; ~var5 > ~class402.field5977; ++var5) {
                    var3[var5] = var4[-var5 + class446.field6541];
                }
            } else {
                class414.method2604(var4, 0, var3, 0, class402.field5977);
            }
        }
        if (arg1 != -11) {
            this.method177((byte) 84, 36, (class217) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        ++field6520;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[][] var4 = this.method2123(!this.field6519 ? arg0 : -arg0 + class123.field1843, 0, -102);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field6521) {
                for (int var11 = 0; ~class402.field5977 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class402.field5977 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class446.field6541];
                    var9[var12] = var6[-var12 + class446.field6541];
                    var10[var12] = var7[-var12 + class446.field6541];
                }
            }
        }
        int var13 = 42 / ((-41 - arg1) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
    public class444() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "(I)V")
    public static void method2732(int arg0) {
        field6524 = null;
        if (arg0 <= 93) {
            field6527 = true;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = -14 / ((82 - arg0) / 40);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field5019 = ~arg2.method1515((byte) 121) == -2;
                }
            } else {
                this.field6519 = ~arg2.method1515((byte) 124) == -2;
            }
        } else {
            this.field6521 = arg2.method1515((byte) 126) == 1;
        }
        ++field6525;
    }
}
