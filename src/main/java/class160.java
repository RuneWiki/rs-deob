import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class160 extends class34 {

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "Z")
    private boolean field2429 = true;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "Z")
    private boolean field2430 = true;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "[I")
    public static int[] field2427 = new int[13];

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "F")
    public static float field2425;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method66(byte arg0, int arg1) {
        ++field2428;
        if (arg0 != -11) {
            this.method69((class319) null, 22, -106);
        }
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (super.field536.field726) {
            int[][] var4 = this.method254(arg0 ^ -11, 0, !this.field2430 ? arg1 : -arg1 + class343.field4968);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field2429) {
                for (int var11 = 0; ~var11 > ~class383.field5502; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class383.field5502 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class120.field1872];
                    var9[var12] = var6[-var12 + class120.field1872];
                    var10[var12] = var7[class120.field1872 - var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field2424;
        int[] var3 = super.field537.method1780(arg0, (byte) 53);
        int var4 = 41 % (arg1 / 50);
        if (super.field537.field4191) {
            int[] var5 = this.method252(false, this.field2430 ? -arg0 + class343.field4968 : arg0, 0);
            if (this.field2429) {
                for (int var6 = 0; ~var6 > ~class383.field5502; ++var6) {
                    var3[var6] = var5[-var6 + class120.field1872];
                }
            } else {
                class57.method373(var5, 0, var3, 0, class383.field5502);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
    public static void method1133(int arg0) {
        field2427 = null;
        if (arg0 < 58) {
            method1133(-114);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field2426;
        if (arg1 < 16) {
            this.method66((byte) 91, 51);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field533 = arg0.method1869(-116) == 1;
                }
            } else {
                this.field2430 = arg0.method1869(-72) == 1;
            }
        } else {
            this.field2429 = ~arg0.method1869(-110) == -2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class160() {
        super(1, false);
    }
}
