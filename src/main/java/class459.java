import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class459 extends class214 {

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    private int field6657 = 4;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    private int field6663 = 4;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field6658 = 0;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "Lcb;")
    public static class631 field6656 = new class631(78, -1);

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)[[I", line = 7)
    public final int[][] method62(int arg0, int arg1) {
        ++field6660;
        int[][] var3 = super.field3545.method2996((byte) 127, arg0);
        if (arg1 != -256) {
            this.method59(75, (class301) null, -1);
        }
        if (super.field3545.field7147) {
            int var4 = class626.field8787 / this.field6663;
            int var5 = class259.field4054 / this.field6657;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1539(true, 0, class259.field4054 * var6 / var5);
            } else {
                var7 = this.method1539(true, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class626.field8787; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class626.field8787 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 152)
    public class459() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V", line = 85)
    public static void method2809(int arg0) {
        if (arg0 == 0) {
            field6656 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[I", line = 95)
    public final int[] method64(int arg0, byte arg1) {
        ++field6661;
        int[] var3 = super.field3544.method3869(arg0, -124);
        if (arg1 != 5) {
            this.field6657 = 19;
        }
        if (super.field3544.field9836) {
            int var4 = class626.field8787 / this.field6663;
            int var5 = class259.field4054 / this.field6657;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method1545(0, 0, -1);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1545(class259.field4054 * var7 / var5, 0, -1);
            }
            for (int var8 = 0; class626.field8787 > var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class626.field8787 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 155)
    public static final void method2810(String arg0, int arg1) {
        ++field6662;
        System.exit(1);
        if (arg1 != 28456) {
            method2809(92);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILofa;I)V", line = 171)
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field6659;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field6657 = arg1.method1987(-80);
            }
        } else {
            this.field6663 = arg1.method1987(-60);
        }
        if (arg0 <= 92) {
            this.method62(-42, 5);
        }
    }
}
