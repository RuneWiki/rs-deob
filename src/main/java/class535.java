import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class535 extends class214 {

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "D")
    public static double field7672;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V", line = 3)
    public class535() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([BB)Lsw;", line = 10)
    public static final class603 method3155(byte[] arg0, byte arg1) {
        ++field7673;
        class603 var2 = new class603();
        class301 var3 = new class301(arg0);
        var3.field4534 = var3.field4543.length - 2;
        int var4 = var3.method1989((byte) -43);
        int var5 = -var4 + -2 + var3.field4543.length - 12;
        var3.field4534 = var5;
        int var6 = var3.method1934(-2);
        var2.field8532 = var3.method1989((byte) -89);
        var2.field8534 = var3.method1989((byte) -37);
        var2.field8526 = var3.method1989((byte) -109);
        var2.field8531 = var3.method1989((byte) -91);
        int var7 = var3.method1987(-30);
        if (arg1 != -28) {
            return null;
        } else {
            if (~var7 < -1) {
                var2.field8523 = new class616[var7];
                for (int var8 = 0; ~var7 < ~var8; ++var8) {
                    int var9 = var3.method1989((byte) -56);
                    class616 var10 = new class616(class567.method3292(var9, -99));
                    var2.field8523[var8] = var10;
                    while (~(var9--) < -1) {
                        int var11 = var3.method1934(-2);
                        int var12 = var3.method1934(-2);
                        var10.method3516(255, (long) var11, new class332(var12));
                    }
                }
            }
            var3.field4534 = 0;
            var2.field8535 = var3.method1963((byte) -114);
            var2.field8528 = new int[var6];
            var2.field8527 = new String[var6];
            var2.field8525 = new int[var6];
            int var13 = 0;
            while (var5 > var3.field4534) {
                int var14 = var3.method1989((byte) -102);
                if (~var14 == -4) {
                    var2.field8527[var13] = var3.method1958(-3438).intern();
                } else if (var14 < 100 && var14 != 21 && ~var14 != -39 && var14 != 39) {
                    var2.field8525[var13] = var3.method1934(-2);
                } else {
                    var2.field8525[var13] = var3.method1987(arg1 + -24);
                }
                var2.field8528[var13++] = var14;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILofa;I)V", line = 91)
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field3540 = arg1.method1987(-97) == 1;
        }
        if (arg0 <= 92) {
            field7672 = 1.3707171088803425D;
        }
        ++field7670;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IB)[I", line = 105)
    public final int[] method64(int arg0, byte arg1) {
        ++field7669;
        int[] var3 = super.field3544.method3869(arg0, -124);
        if (arg1 != 5) {
            this.method59(40, (class301) null, 55);
        }
        if (super.field3544.field9836) {
            int[] var4 = this.method1545(arg0, 0, -1);
            for (int var5 = 0; ~var5 > ~class626.field8787; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(II)[[I", line = 137)
    public final int[][] method62(int arg0, int arg1) {
        ++field7671;
        int[][] var3 = super.field3545.method2996((byte) 120, arg0);
        if (arg1 != -256) {
            this.method59(-123, (class301) null, 101);
        }
        if (super.field3545.field7147) {
            int[][] var4 = this.method1539(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class626.field8787; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }
}
