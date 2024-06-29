import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class168 extends class34 {

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    private int field2474 = 1024;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    private int field2472 = 3072;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    private int field2477 = 2048;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2473 = "purple:";

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "Lnc;")
    public static class89 field2478 = new class89(128);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field2475;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "[[B")
    public static byte[][] field2480;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field2479;
        if (arg0 != 6) {
            this.method50(-125, 16, (class54) null);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field604 = arg2.method407(255) == 1;
                }
            } else {
                this.field2472 = arg2.method423(127);
            }
        } else {
            this.field2474 = arg2.method423(arg0 ^ -97);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class168() {
        super(1, false);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field2470;
        if (arg0 < 75) {
            field2478 = null;
        }
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int[] var4 = this.method230(arg1, -15337, 0);
            for (int var5 = 0; var5 < class226.field3527; ++var5) {
                var3[var5] = this.field2474 - -(var4[var5] * this.field2477 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public static void method1135(int arg0) {
        field2475 = null;
        field2473 = null;
        if (arg0 != -2) {
            field2478 = null;
        }
        field2478 = null;
        field2480 = null;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        this.field2477 = -this.field2474 + this.field2472;
        int var2 = 94 / ((-2 - arg0) / 43);
        ++field2476;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int var3 = -91 / ((arg0 - -54) / 44);
        ++field2469;
        int[][] var4 = super.field618.method91(89, arg1);
        if (super.field618.field211) {
            int[][] var5 = this.method231(arg1, (byte) 99, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; ~class226.field3527 < ~var12; ++var12) {
                var9[var12] = this.field2474 - -(var6[var12] * this.field2477 >> 12);
                var11[var12] = (var7[var12] * this.field2477 >> 12) + this.field2474;
                var10[var12] = (var8[var12] * this.field2477 >> 12) + this.field2474;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lca;B)V")
    public static final void method1136(class54 arg0, byte arg1) {
        ++field2471;
        if (arg1 <= 25) {
            method1136((class54) null, (byte) 70);
        }
        byte[] var2 = new byte[24];
        if (class185.field2703 != null) {
            try {
                int var3 = 0;
                class185.field2703.method955(0L, 23010);
                class185.field2703.method956((byte) 18, var2);
                while (~var3 > -25 && ~var2[var3] == -1) {
                    ++var3;
                }
                if (~var3 <= -25) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; ~var4 > -25; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method433(0, 24, -104, var2);
    }
}
