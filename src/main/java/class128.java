import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class128 extends class7 {

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "Lob;")
    public static class141 field2437 = class175.method1195(40, "Clientscript error in: ");

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field2436 = -1;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "Lob;")
    public static class141 field2435 = class175.method1195(40, "Sprites geladen)3");

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "Lvc;")
    public static class212 field2440 = new class212(20);

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "Lob;")
    public static class141 field2442 = class175.method1195(40, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field2443 = -1;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    public static int field2444 = -1;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field2438;
        if (arg0 < 13) {
            this.method30((byte) -71, 107);
        }
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int[] var4 = this.method52(arg1, 0, 33);
            for (int var5 = 0; ~var5 > ~class117.field2272; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)V")
    public static void method811(int arg0) {
        field2442 = null;
        if (arg0 == 22817) {
            field2440 = null;
            field2437 = null;
            field2435 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (~arg0 == -1) {
            super.field99 = ~arg2.method991(255) == -2;
        }
        int var4 = 105 / ((arg1 - 66) / 57);
        ++field2441;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int var3 = 105 / ((arg1 - -42) / 41);
        ++field2439;
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[][] var5 = this.method42(arg0, 115, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            for (int var12 = 0; var12 < class117.field2272; ++var12) {
                var11[var12] = 4096 - var6[var12];
                var9[var12] = -var7[var12] + 4096;
                var10[var12] = -var8[var12] + 4096;
            }
        }
        return var4;
    }
}
