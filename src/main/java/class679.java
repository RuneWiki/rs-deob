import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class679 extends class214 {

    @OriginalMember(owner = "client!wia", name = "D", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9565 = new Hashtable();

    @OriginalMember(owner = "client!wia", name = "I", descriptor = "Ltm;")
    public static class334 field9570 = new class334(92, 16);

    @OriginalMember(owner = "client!wia", name = "K", descriptor = "[I")
    public static int[] field9572 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!wia", name = "E", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!wia", name = "G", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!wia", name = "H", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!wia", name = "J", descriptor = "Lfea;")
    public static class460 field9571;

    @OriginalMember(owner = "client!wia", name = "F", descriptor = "[Lhga;")
    public static class300[] field9567;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field9569;
        if (~arg2 == -1) {
            super.field3540 = ~arg1.method1987(-90) == -2;
        }
        if (arg0 <= 92) {
            field9572 = null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != -256) {
            this.method62(-122, 123);
        }
        ++field9566;
        int[][] var3 = super.field3545.method2996((byte) 124, arg0);
        if (super.field3545.field7147) {
            int[] var4 = this.method1545(arg0, 2, arg1 ^ 255);
            int[][] var5 = this.method1539(true, 0, arg0);
            int[][] var6 = this.method1539(true, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class626.field8787 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "(B)V")
    public static void method3786(byte arg0) {
        field9567 = null;
        field9570 = null;
        field9571 = null;
        if (arg0 <= 44) {
            method3786((byte) -99);
        }
        field9572 = null;
        field9565 = null;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        if (arg1 != 5) {
            field9572 = null;
        }
        ++field9568;
        int[] var3 = super.field3544.method3869(arg0, -114);
        if (super.field3544.field9836) {
            int[] var4 = this.method1545(arg0, 0, -1);
            int[] var5 = this.method1545(arg0, 1, -1);
            int[] var6 = this.method1545(arg0, 2, arg1 + -6);
            for (int var7 = 0; ~var7 > ~class626.field8787; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V")
    public class679() {
        super(3, false);
    }
}
