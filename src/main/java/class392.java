import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class392 extends class40 {

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "Lub;")
    public static class15 field5506 = new class15(100);

    @OriginalMember(owner = "client!rs", name = "R", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5512 = new Rectangle[100];

    @OriginalMember(owner = "client!rs", name = "W", descriptor = "D")
    public static double field5517 = -1.0D;

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
    public static int field5511 = -1;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!rs", name = "S", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!rs", name = "T", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!rs", name = "V", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!rs", name = "X", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!rs", name = "U", descriptor = "Ls;")
    public static class154 field5515;

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
    public class392() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field5509;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int[] var4 = this.method266((byte) -116, arg1, 0);
            for (int var5 = 0; ~class410.field5886 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg0 >= -20) {
            field5511 = 48;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)[[I")
    public final int[][] method112(int arg0, int arg1) {
        ++field5516;
        if (arg0 != 1) {
            this.method112(103, 74);
        }
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int[][] var4 = this.method261(0, 28552, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class410.field5886; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)Z")
    public static final boolean method2469(int arg0) {
        ++field5513;
        if (class264.field3879) {
            try {
                class348.method2282((byte) -31, "showVideoAd", class401.field5628.field3154);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 667) {
            field5515 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(CI)C")
    public static final char method2470(char arg0, int arg1) {
        ++field5507;
        if (~arg0 == -199) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else if (~arg0 == -224) {
            return 's';
        } else if (arg0 == 338) {
            return 'E';
        } else if (arg0 == 339) {
            return 'e';
        } else {
            if (arg1 != 0) {
                method2469(-100);
            }
            return '\u0000';
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg0 == 0) {
            super.field550 = ~arg2.method837(true) == -2;
        }
        if (arg1 <= 79) {
            method2472((int[]) null, (byte) -15, (long[]) null);
        }
        ++field5508;
    }

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "(B)V")
    public static void method2471(byte arg0) {
        field5506 = null;
        int var1 = -58 / ((arg0 - -4) / 63);
        field5515 = null;
        field5512 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([IB[J)V")
    public static final void method2472(int[] arg0, byte arg1, long[] arg2) {
        if (arg1 != 50) {
            field5514 = 84;
        }
        class269.method1836(-121, arg2, arg0, arg2.length + -1, 0);
        ++field5510;
    }
}
